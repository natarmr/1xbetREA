package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzr0 f45269a;
    public static final zzr0 b;
    public static final /* synthetic */ zzr0[] c;

    static {
        zzr0 zzr0Var = new zzr0("WRAP", 0);
        f45269a = zzr0Var;
        zzr0 zzr0Var2 = new zzr0("MATCH", 1);
        b = zzr0Var2;
        c = new zzr0[]{zzr0Var, zzr0Var2};
    }

    public static zzr0 valueOf(String str) {
        return (zzr0) Enum.valueOf(zzr0.class, str);
    }

    public static zzr0[] values() {
        return (zzr0[]) c.clone();
    }
}
