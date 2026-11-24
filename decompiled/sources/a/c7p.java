package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c7p {
    public static final b7p Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f3876a;
    public static final c7p b;
    public static final c7p c;
    public static final c7p d;
    public static final /* synthetic */ c7p[] e;

    static {
        c7p c7pVar = new c7p("ALL", 0);
        b = c7pVar;
        c7p c7pVar2 = new c7p("AGGREGATOR", 1);
        c = c7pVar2;
        c7p c7pVar3 = new c7p("ONE_XGAMES", 2);
        d = c7pVar3;
        e = new c7p[]{c7pVar, c7pVar2, c7pVar3};
        Companion = new b7p();
        f3876a = maz.a(wez.f39042a, new r4p((byte) 2));
    }

    public static c7p valueOf(String str) {
        return (c7p) Enum.valueOf(c7p.class, str);
    }

    public static c7p[] values() {
        return (c7p[]) e.clone();
    }
}
