package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cmd f4598a;
    public static final cmd b;
    public static final /* synthetic */ cmd[] c;

    static {
        cmd cmdVar = new cmd("Unknown", 0);
        f4598a = cmdVar;
        cmd cmdVar2 = new cmd("Content", 1);
        b = cmdVar2;
        c = new cmd[]{cmdVar, cmdVar2};
    }

    public static cmd valueOf(String str) {
        return (cmd) Enum.valueOf(cmd.class, str);
    }

    public static cmd[] values() {
        return (cmd[]) c.clone();
    }
}
