package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rqt f33292a;
    public static final t3z b;
    public static final t3z c;
    public static final t3z d;
    public static final t3z e;
    public static final /* synthetic */ t3z[] f;

    static {
        t3z t3zVar = new t3z("LINE", 0);
        b = t3zVar;
        t3z t3zVar2 = new t3z("LIVE", 1);
        c = t3zVar2;
        t3z t3zVar3 = new t3z("TRANSFER", 2);
        d = t3zVar3;
        t3z t3zVar4 = new t3z("FINISHED", 3);
        e = t3zVar4;
        f = new t3z[]{t3zVar, t3zVar2, t3zVar3, t3zVar4};
        f33292a = new rqt();
    }

    public static t3z valueOf(String str) {
        return (t3z) Enum.valueOf(t3z.class, str);
    }

    public static t3z[] values() {
        return (t3z[]) f.clone();
    }
}
