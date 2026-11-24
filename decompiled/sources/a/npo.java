package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class npo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final npo f23923a;
    public static final npo b;
    public static final npo c;
    public static final npo d;
    public static final /* synthetic */ npo[] e;

    static {
        npo npoVar = new npo("CLASSIC_CARD_SPORT_ICON", 0);
        f23923a = npoVar;
        npo npoVar2 = new npo("COMPACT_CARD_SPORT_ICON", 1);
        b = npoVar2;
        npo npoVar3 = new npo("COMPACT_CARD_ROUND_BACKGROUND", 2);
        c = npoVar3;
        npo npoVar4 = new npo("CLASSIC_CARD_RECT_BACKGROUND", 3);
        d = npoVar4;
        e = new npo[]{npoVar, npoVar2, npoVar3, npoVar4};
    }

    public static npo valueOf(String str) {
        return (npo) Enum.valueOf(npo.class, str);
    }

    public static npo[] values() {
        return (npo[]) e.clone();
    }
}
