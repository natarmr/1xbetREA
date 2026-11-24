package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class txs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sxs0 f34717a;
    public static final txs0 b;
    public static final txs0 c;
    public static final txs0 d;
    public static final txs0 e;
    public static final txs0 f;
    public static final txs0 g;
    public static final txs0 h;
    public static final /* synthetic */ txs0[] i;

    static {
        txs0 txs0Var = new txs0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = txs0Var;
        txs0 txs0Var2 = new txs0("PROMO", 1);
        c = txs0Var2;
        txs0 txs0Var3 = new txs0("PRIMARY", 2);
        d = txs0Var3;
        txs0 txs0Var4 = new txs0("SPORT_BONUS", 3);
        e = txs0Var4;
        txs0 txs0Var5 = new txs0("AGGREGATOR_BONUS", 4);
        f = txs0Var5;
        txs0 txs0Var6 = new txs0("MULTI_CURRENCY", 5);
        g = txs0Var6;
        txs0 txs0Var7 = new txs0("GAME_BONUS", 6);
        h = txs0Var7;
        i = new txs0[]{txs0Var, txs0Var2, txs0Var3, txs0Var4, txs0Var5, txs0Var6, txs0Var7};
        f34717a = new sxs0((byte) 0);
    }

    public static txs0 valueOf(String str) {
        return (txs0) Enum.valueOf(txs0.class, str);
    }

    public static txs0[] values() {
        return (txs0[]) i.clone();
    }

    public final boolean a() {
        return this == e || this == h || this == f;
    }

    public final boolean b() {
        return this == h || this == f;
    }

    public final boolean d() {
        return this == d;
    }

    public final boolean e() {
        return d() || this == g;
    }

    public final boolean f() {
        return this == e;
    }
}
