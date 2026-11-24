package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class koa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yk5 f18622a;
    public static final koa b;
    public static final /* synthetic */ koa[] c;

    static {
        koa koaVar = new koa("SPADES", 0);
        b = koaVar;
        c = new koa[]{koaVar, new koa("CLUBS", 1), new koa("DIAMONDS", 2), new koa("HEARTS", 3), new koa("PRIZES", 4)};
        f18622a = new yk5();
    }

    public static koa valueOf(String str) {
        return (koa) Enum.valueOf(koa.class, str);
    }

    public static koa[] values() {
        return (koa[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "spades";
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? "hearts" : "diamonds";
        }
        return "clubs";
    }
}
