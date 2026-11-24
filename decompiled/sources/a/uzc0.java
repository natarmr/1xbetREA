package a;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import org.xbet.client1.R;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final class uzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f36531a;
    public final pru b;

    public uzc0(ctf0 ctf0Var, pru pruVar) {
        ctf0Var.getClass();
        this.f36531a = ctf0Var;
        this.b = pruVar;
    }

    public static PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1 c(uzc0 uzc0Var, int i) {
        uzc0Var.getClass();
        return new PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1(uzc0Var, i, false);
    }

    public final Intent a(kr5 kr5Var, int i, boolean z) {
        kr5Var.getClass();
        oo5 oo5Var = kr5Var.n;
        int i2 = kr5Var.b;
        boolean z2 = i2 == 1237;
        boolean z3 = kr5Var.l;
        oo5 oo5Var2 = oo5.ACTION_OPEN_SECTION;
        oo5 oo5Var3 = oo5.ACTION_ONE_X_GAME;
        boolean z4 = (((q3d.j(oo5Var2, oo5Var3).contains(oo5Var) || kr5Var.a()) && z3) || i == -1000) ? false : true;
        boolean z5 = (q3d.j(oo5Var2, oo5Var3).contains(oo5Var) || kr5Var.a()) && z3 && i == -1000;
        boolean z6 = !z;
        if (z3 && kr5Var.d()) {
            return b(kr5Var, z);
        }
        if (z2) {
            return d(kr5Var, z6, false);
        }
        if (z4) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(this.f36531a.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("NEWS_MAIN").appendQueryParameter("PARAMETER_KEY_SHOW_NAV_BAR", String.valueOf(true)).appendQueryParameter("PARAMETER_KEY_FROM_AGGREGATOR", String.valueOf(z)).appendQueryParameter("PARAMETER_KEY_POSITION", String.valueOf(i)).appendQueryParameter("PARAMETER_KEY_BANNER_ID", String.valueOf(i2)).appendQueryParameter("PARAMETER_KEY_BANNER_TYPE", String.valueOf(kr5Var.x)).build());
        }
        return z5 ? d(kr5Var, z6, false) : b(kr5Var, z);
    }

    public final Intent b(kr5 kr5Var, boolean z) {
        cs5 cs5Var;
        kr5Var.getClass();
        boolean z2 = !z;
        oo5 oo5Var = kr5Var.n;
        String str = kr5Var.f;
        String str2 = kr5Var.d;
        int i = kr5Var.m;
        int iOrdinal = oo5Var.ordinal();
        if (iOrdinal == 0) {
            return d(kr5Var, z2, false);
        }
        ctf0 ctf0Var = this.f36531a;
        if (iOrdinal == 1) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("ONE_X_GAMES_GAME").appendQueryParameter("PARAMETER_KEY_GAME_ID", String.valueOf(i)).build());
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? new Intent() : new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("BET_WITHOUT_RISK").appendQueryParameter("PARAMETER_KEY_BANNER_TITLE", kr5Var.o).appendQueryParameter("PARAMETER_KEY_BANNER_TRANSLATE_ID", str2).appendQueryParameter("PARAMETER_KEY_BANNER_LOTTERY_ID", String.valueOf(i)).appendQueryParameter("PARAMETER_KEY_BANNER_IMAGE_URL", str).build());
        }
        cs5.b.getClass();
        cs5[] cs5VarArr = cs5.c;
        int length = cs5VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cs5Var = null;
                break;
            }
            cs5Var = cs5VarArr[i2];
            if (cs5Var.f4872a == i) {
                break;
            }
            i2++;
        }
        if (cs5Var == null) {
            cs5Var = cs5.SECTION_UNKNOWN;
        }
        int iOrdinal2 = cs5Var.ordinal();
        if (iOrdinal2 == 1) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("ONE_X_GAMES_BONUSES").build());
        }
        if (iOrdinal2 == 3) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("ONE_X_GAMES_JACKPOT").build());
        }
        if (iOrdinal2 == 4) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("AGGREGATOR_TV_BET_JACKPOT").appendQueryParameter("PARAMETER_KEY_FROM_AGGREGATOR", String.valueOf(z)).appendQueryParameter("PARAMETER_KEY_SHOW_NAV_BAR", String.valueOf(z2)).appendQueryParameter("PARAMETER_KEY_BANNER_IMAGE_URL", str).appendQueryParameter("PARAMETER_KEY_BANNER_TRANSLATE_ID", str2).build());
        }
        gl5 gl5Var = cs5.b;
        return d(kr5Var, z2, i == 7);
    }

    public final Intent d(kr5 kr5Var, boolean z, boolean z2) {
        return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme(this.f36531a.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0))).authority("open").path("NEWS_PAGER").appendQueryParameter("PARAMETER_KEY_SHOW_NAV_BAR", String.valueOf(z)).appendQueryParameter("PARAMETER_KEY_NEED_AUTH", String.valueOf(z2)).appendQueryParameter("PARAMETER_KEY_BANNER_TRANSLATE_ID", kr5Var.d).appendQueryParameter("PARAMETER_KEY_BANNER_TITLE", kr5Var.o).appendQueryParameter("PARAMETER_KEY_BANNER_ACTION_TYPE", String.valueOf((int) kr5Var.n.f25576a)).appendQueryParameter("PARAMETER_KEY_BANNER_PRIZE_FLAG", String.valueOf(kr5Var.u)).build());
    }
}
