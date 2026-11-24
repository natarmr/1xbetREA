package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zam f44076a;
    public static final /* synthetic */ zam[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zam EF0;

    static {
        zam zamVar = new zam("PERCENT", 0);
        zam zamVar2 = new zam("NUMBER", 1);
        f44076a = zamVar2;
        b = new zam[]{zamVar, zamVar2};
    }

    public static zam valueOf(String str) {
        return (zam) Enum.valueOf(zam.class, str);
    }

    public static zam[] values() {
        return (zam[]) b.clone();
    }
}
