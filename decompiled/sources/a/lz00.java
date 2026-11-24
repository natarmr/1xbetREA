package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lz00 {

    /* JADX INFO: Fake field, exist only in values array */
    lz00 EF5;
    public static final /* synthetic */ lz00[] b = {new lz00("TOP", 0), new lz00("MID", 1), new lz00("SUP", 2), new lz00("JUN", 3), new lz00("ADC", 4)};
    public static final kz00 Companion = new kz00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f20886a = maz.a(wez.f39042a, new x800((byte) 28));

    public static lz00 valueOf(String str) {
        return (lz00) Enum.valueOf(lz00.class, str);
    }

    public static lz00[] values() {
        return (lz00[]) b.clone();
    }
}
