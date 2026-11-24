package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cl5 f23182a;
    public static final nab b;
    public static final nab c;
    public static final nab d;
    public static final nab e;
    public static final /* synthetic */ nab[] f;

    static {
        nab nabVar = new nab("ACTIVE", 0);
        b = nabVar;
        nab nabVar2 = new nab("WON", 1);
        c = nabVar2;
        nab nabVar3 = new nab("LOSE", 2);
        d = nabVar3;
        nab nabVar4 = new nab("UNDEFINED", 3);
        e = nabVar4;
        f = new nab[]{nabVar, nabVar2, nabVar3, nabVar4};
        f23182a = new cl5((byte) 20);
    }

    public static nab valueOf(String str) {
        return (nab) Enum.valueOf(nab.class, str);
    }

    public static nab[] values() {
        return (nab[]) f.clone();
    }
}
