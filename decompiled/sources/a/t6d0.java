package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t6d0 {
    public static final s6d0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f33413a;
    public static final t6d0 b;
    public static final t6d0 c;
    public static final /* synthetic */ t6d0[] d;

    static {
        t6d0 t6d0Var = new t6d0("HTTP", 0);
        b = t6d0Var;
        t6d0 t6d0Var2 = new t6d0("SOCKS", 1);
        c = t6d0Var2;
        d = new t6d0[]{t6d0Var, t6d0Var2};
        Companion = new s6d0();
        f33413a = maz.a(wez.f39042a, new cbc0((byte) 19));
    }

    public static t6d0 valueOf(String str) {
        return (t6d0) Enum.valueOf(t6d0.class, str);
    }

    public static t6d0[] values() {
        return (t6d0[]) d.clone();
    }
}
