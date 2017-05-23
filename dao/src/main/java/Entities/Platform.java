package Entities;

/**
 * Created by User on 23.05.2017.
 */
public class Platform {

    private String name;
    private long id;
    private SystemSetting systemSetting;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Platform platform = (Platform) o;

        if (id != platform.id) return false;
        if (name != null ? !name.equals(platform.name) : platform.name != null) return false;
        return systemSetting != null ? systemSetting.equals(platform.systemSetting) : platform.systemSetting == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (systemSetting != null ? systemSetting.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SystemSetting getSystemSetting() {
        return systemSetting;
    }

    public void setSystemSetting(SystemSetting systemSetting) {
        this.systemSetting = systemSetting;
    }
}
