package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wyx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wyx f39995a;
    public static final wyx b;
    public static final wyx c;
    public static final /* synthetic */ wyx[] d;

    static {
        wyx wyxVar = new wyx("SIGNIFICANT", 0);
        f39995a = wyxVar;
        wyx wyxVar2 = new wyx("NEUTRAL", 1);
        b = wyxVar2;
        wyx wyxVar3 = new wyx("SUPPORT", 2);
        c = wyxVar3;
        d = new wyx[]{wyxVar, wyxVar2, wyxVar3};
    }

    public static wyx valueOf(String str) {
        return (wyx) Enum.valueOf(wyx.class, str);
    }

    public static wyx[] values() {
        return (wyx[]) d.clone();
    }
}
