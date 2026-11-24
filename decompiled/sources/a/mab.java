package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yk5 f21451a;
    public static final mab b;
    public static final mab c;
    public static final mab d;
    public static final mab e;
    public static final /* synthetic */ mab[] f;

    static {
        mab mabVar = new mab("ACTIVE", 0);
        b = mabVar;
        mab mabVar2 = new mab("WON", 1);
        c = mabVar2;
        mab mabVar3 = new mab("LOSE", 2);
        d = mabVar3;
        mab mabVar4 = new mab("UNDEFINED", 3);
        e = mabVar4;
        f = new mab[]{mabVar, mabVar2, mabVar3, mabVar4};
        f21451a = new yk5();
    }

    public static mab valueOf(String str) {
        return (mab) Enum.valueOf(mab.class, str);
    }

    public static mab[] values() {
        return (mab[]) f.clone();
    }
}
