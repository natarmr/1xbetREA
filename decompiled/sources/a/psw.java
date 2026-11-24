package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class psw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final psw f27534a;
    public static final psw b;
    public static final psw c;
    public static final psw d;
    public static final /* synthetic */ psw[] e;

    static {
        psw pswVar = new psw("H11", 0);
        f27534a = pswVar;
        psw pswVar2 = new psw("H12", 1);
        b = pswVar2;
        psw pswVar3 = new psw("H23", 2);
        c = pswVar3;
        psw pswVar4 = new psw("H24", 3);
        d = pswVar4;
        e = new psw[]{pswVar, pswVar2, pswVar3, pswVar4};
    }

    public static psw valueOf(String str) {
        return (psw) Enum.valueOf(psw.class, str);
    }

    public static psw[] values() {
        return (psw[]) e.clone();
    }

    public final boolean a() {
        return this == f27534a || this == b;
    }

    public final boolean b() {
        return this == c || this == d;
    }
}
