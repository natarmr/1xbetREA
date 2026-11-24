package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gay f10991a;
    public static final gay b;
    public static final gay c;
    public static final /* synthetic */ gay[] d;

    static {
        gay gayVar = new gay("INFLEXIBLE", 0);
        f10991a = gayVar;
        gay gayVar2 = new gay("FLEXIBLE_UPPER_BOUND", 1);
        b = gayVar2;
        gay gayVar3 = new gay("FLEXIBLE_LOWER_BOUND", 2);
        c = gayVar3;
        d = new gay[]{gayVar, gayVar2, gayVar3};
    }

    public static gay valueOf(String str) {
        return (gay) Enum.valueOf(gay.class, str);
    }

    public static gay[] values() {
        return (gay[]) d.clone();
    }
}
