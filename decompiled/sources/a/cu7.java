package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cu7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cu7 f4974a;
    public static final cu7 b;
    public static final /* synthetic */ cu7[] c;

    static {
        cu7 cu7Var = new cu7("PITCH", 0);
        f4974a = cu7Var;
        cu7 cu7Var2 = new cu7("LIST", 1);
        b = cu7Var2;
        c = new cu7[]{cu7Var, cu7Var2};
    }

    public static cu7 valueOf(String str) {
        return (cu7) Enum.valueOf(cu7.class, str);
    }

    public static cu7[] values() {
        return (cu7[]) c.clone();
    }
}
