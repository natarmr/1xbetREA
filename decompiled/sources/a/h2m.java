package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2m f12341a;
    public static final h2m b;
    public static final h2m c;
    public static final /* synthetic */ h2m[] d;

    static {
        h2m h2mVar = new h2m("OUTLINE_PRIMARY", 0);
        f12341a = h2mVar;
        h2m h2mVar2 = new h2m("OUTLINE", 1);
        b = h2mVar2;
        h2m h2mVar3 = new h2m("UNITED", 2);
        c = h2mVar3;
        d = new h2m[]{h2mVar, h2mVar2, h2mVar3};
    }

    public static h2m valueOf(String str) {
        return (h2m) Enum.valueOf(h2m.class, str);
    }

    public static h2m[] values() {
        return (h2m[]) d.clone();
    }
}
