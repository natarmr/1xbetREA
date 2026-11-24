package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sse f32722a;
    public static final sse b;
    public static final sse c;
    public static final sse d;
    public static final sse e;
    public static final /* synthetic */ sse[] f;

    static {
        sse sseVar = new sse("COUPON_CARD_WITH_BG_ACCENT_TEAM", 0);
        f32722a = sseVar;
        sse sseVar2 = new sse("COUPON_CARD_COMPACT_ACCENT_MARKET", 1);
        b = sseVar2;
        sse sseVar3 = new sse("COUPON_CARD_CHAMP_NAME_ACCENT_COEF", 2);
        c = sseVar3;
        sse sseVar4 = new sse("COUPON_CARD_SMALL_TEAM_LOGO_ACCENT_COEF", 3);
        d = sseVar4;
        sse sseVar5 = new sse("COUPON_CARD_BIG_TEAM_LOGO_ACCENT_TEAM", 4);
        e = sseVar5;
        f = new sse[]{sseVar, sseVar2, sseVar3, sseVar4, sseVar5};
    }

    public static sse valueOf(String str) {
        return (sse) Enum.valueOf(sse.class, str);
    }

    public static sse[] values() {
        return (sse[]) f.clone();
    }
}
