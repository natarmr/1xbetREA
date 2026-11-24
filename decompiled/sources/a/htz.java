package a;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.NoSuchElementException;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class htz implements am30, vuw, rh60 {
    public static int d(RecyclerView recyclerView) {
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).p;
        }
        jf4.n("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        return 0;
    }

    public static boolean e(RecyclerView recyclerView) {
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).t;
        }
        jf4.n("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        return false;
    }

    public static q000 f(LimitNeGroupEnum limitNeGroupEnum) {
        q000 q000Var = new q000();
        q000Var.K1.J(q000Var, q000.Q1[0], limitNeGroupEnum);
        return q000Var;
    }

    public static ca70 g(long j, csr csrVar, boolean z, boolean z2, String str) {
        csrVar.getClass();
        str.getClass();
        ca70 ca70Var = new ca70();
        Bundle bundle = new Bundle();
        lv00.S("OneXGamesWebGame.BUNDLE_GAME_ID", bundle, Long.valueOf(j));
        lv00.S("OneXGamesWebGame.BUNDLE_GAME_BONUS", bundle, csrVar);
        lv00.S("OneXGamesWebGame.BUNDLE_PROMO_GAME", bundle, Boolean.valueOf(z));
        Context contextD = ca70Var.D();
        lv00.S("OneXGamesWebGame.BUNDLE_ANIMATIONS_ENABLED", bundle, Boolean.valueOf(contextD != null ? sj3.J(contextD) : true));
        lv00.S("OneXGamesWebGame.BUNDLE_FULL_SCREEN", bundle, Boolean.valueOf(z2));
        lv00.S("OneXGamesWebGame.BUNDLE_SESSION_ID", bundle, str);
        ca70Var.s0(bundle);
        return ca70Var;
    }

    public static iz30 h(String str) {
        Object g0g0Var;
        str.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = iz30.valueOf(str);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        return (iz30) g0g0Var;
    }

    @Override // a.am30
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // a.am30
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // a.am30
    public boolean next() {
        return false;
    }

    @Override // a.vuw
    public zv00 p(String str) {
        return u850.b;
    }
}
