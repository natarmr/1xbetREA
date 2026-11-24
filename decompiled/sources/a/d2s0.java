package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d2s0 {

    /* JADX INFO: Fake field, exist only in values array */
    d2s0 EF5;
    public static final /* synthetic */ d2s0[] b = {new d2s0("TOP", 0), new d2s0("MID", 1), new d2s0("SUP", 2), new d2s0("JUN", 3), new d2s0("ADC", 4)};
    public static final c2s0 Companion = new c2s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f5373a = maz.a(wez.f39042a, new yqr0(10));

    public static d2s0 valueOf(String str) {
        return (d2s0) Enum.valueOf(d2s0.class, str);
    }

    public static d2s0[] values() {
        return (d2s0[]) b.clone();
    }
}
