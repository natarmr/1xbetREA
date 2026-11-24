package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rir {

    /* JADX INFO: Fake field, exist only in values array */
    rir EF5;
    public static final /* synthetic */ rir[] b = {new rir("DisabledDemoModel", 0), new rir("AuthWithoutDemoBalance", 1), new rir("NotAuthWithoutDemoBalance", 2), new rir("ToggleDemoGameAvailable", 3)};
    public static final qir Companion = new qir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f30557a = maz.a(wez.f39042a, new s9r(14));

    public static rir valueOf(String str) {
        return (rir) Enum.valueOf(rir.class, str);
    }

    public static rir[] values() {
        return (rir[]) b.clone();
    }
}
