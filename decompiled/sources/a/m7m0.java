package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m7m0 f21327a;
    public static final m7m0 b;
    public static final m7m0 c;
    public static final m7m0 d;
    public static final m7m0 e;
    public static final m7m0 f;
    public static final m7m0 g;
    public static final m7m0 h;
    public static final m7m0 i;
    public static final /* synthetic */ m7m0[] j;

    /* JADX INFO: Fake field, exist only in values array */
    m7m0 EF0;

    static {
        m7m0 m7m0Var = new m7m0("DELETE", 0);
        m7m0 m7m0Var2 = new m7m0("OPEN_GAMES_BY_BONUS", 1);
        f21327a = m7m0Var2;
        m7m0 m7m0Var3 = new m7m0("OPEN_GAMES_BY_PRODUCT", 2);
        m7m0 m7m0Var4 = new m7m0("OPEN_PRODUCTS_BY_BONUS", 3);
        b = m7m0Var4;
        m7m0 m7m0Var5 = new m7m0("BONUS_ACTIVATE", 4);
        c = m7m0Var5;
        m7m0 m7m0Var6 = new m7m0("ALL_GAMES_SLOTS", 5);
        d = m7m0Var6;
        m7m0 m7m0Var7 = new m7m0("BONUS_RESUME", 6);
        e = m7m0Var7;
        m7m0 m7m0Var8 = new m7m0("BONUS_PAUSE", 7);
        f = m7m0Var8;
        m7m0 m7m0Var9 = new m7m0("PLAY_GAME", 8);
        g = m7m0Var9;
        m7m0 m7m0Var10 = new m7m0("REFILL_ACCOUNT", 9);
        h = m7m0Var10;
        m7m0 m7m0Var11 = new m7m0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 10);
        i = m7m0Var11;
        j = new m7m0[]{m7m0Var, m7m0Var2, m7m0Var3, m7m0Var4, m7m0Var5, m7m0Var6, m7m0Var7, m7m0Var8, m7m0Var9, m7m0Var10, m7m0Var11};
    }

    public static m7m0 valueOf(String str) {
        return (m7m0) Enum.valueOf(m7m0.class, str);
    }

    public static m7m0[] values() {
        return (m7m0[]) j.clone();
    }
}
