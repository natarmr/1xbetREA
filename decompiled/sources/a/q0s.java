package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0s f27918a;
    public static final q0s b;
    public static final /* synthetic */ q0s[] c;

    static {
        q0s q0sVar = new q0s("VERTICAL", 0);
        f27918a = q0sVar;
        q0s q0sVar2 = new q0s("HORIZONTAL", 1);
        b = q0sVar2;
        c = new q0s[]{q0sVar, q0sVar2};
    }

    public static q0s valueOf(String str) {
        return (q0s) Enum.valueOf(q0s.class, str);
    }

    public static q0s[] values() {
        return (q0s[]) c.clone();
    }
}
