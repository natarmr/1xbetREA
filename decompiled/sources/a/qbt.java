package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qbt {
    public static final void a(Map map, jvn jvnVar) {
        jvnVar.getClass();
        if (jvnVar != jvn.d) {
            map.put("cfView", Integer.valueOf(jvnVar.getId()));
        } else {
            map.put("cfView", 3);
        }
    }

    public static final void b(jo20 jo20Var, Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        jo20Var.put("champIds", CollectionsKt.b0(CollectionsKt.z0(set), Separators.COMMA, null, null, null, 62));
    }

    public static final void c(int i, Map map) {
        if (i > 0) {
            map.put("country", Integer.valueOf(i));
        }
    }

    public static final void d(Map map, int i, boolean z) {
        if (!z || i <= 0) {
            return;
        }
        map.put("country", Integer.valueOf(i));
    }

    public static final void e(jo20 jo20Var, ygq0 ygq0Var) {
        if (ygq0Var == null || ygq0Var == ygq0.NOT || ygq0Var == ygq0.CUSTOM_DATE) {
            return;
        }
        jo20Var.put("minOffset", jpm0.p(ygq0Var));
    }

    public static final void f(jo20 jo20Var, ihq0 ihq0Var) {
        long j = ihq0Var.f14793a;
        if (j != -1) {
            jo20Var.put("dateFrom", Long.valueOf(j / 1000));
        }
        jo20Var.put("dateTo", Long.valueOf(ihq0Var.b / 1000));
    }

    public static final void g(int i, Map map) {
        if (i > 0) {
            map.put("fcountry", Integer.valueOf(i));
        }
    }

    public static final void h(Map map) {
        map.put("gr", 1357);
    }

    public static final void i(jo20 jo20Var, boolean z) {
        if (z) {
            jo20Var.put("hasVideo", 1);
        }
    }

    public static final void j(String str, Map map) {
        str.getClass();
        if (StringsKt.O(str, "ru", false)) {
            map.put("lng", "ru_RU");
        } else {
            map.put("lng", str);
        }
    }

    public static final void k(jo20 jo20Var, long j) {
        if (j > 0) {
            jo20Var.put("oppId", Long.valueOf(j));
        }
    }

    public static final void l(Map map) {
        map.put("ref", 1);
    }

    public static final void m(jo20 jo20Var, CyberGamesPage cyberGamesPage, long j) {
        cyberGamesPage.getClass();
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            jo20Var.put("subSport", Long.valueOf(j));
        } else if (cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE) || cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
            jo20Var.put("sport", Long.valueOf(j));
        } else {
            t9f.b();
        }
    }

    public static final void n(long j, Map map) {
        if (j > 0) {
            map.put("subSport", Long.valueOf(j));
        }
    }

    public static final void o(Map map, boolean z, long j) {
        if (!z || j <= 0) {
            return;
        }
        map.put("userId", Long.valueOf(j));
    }

    public static final void p(Map map) {
        map.put("whence", 22);
    }
}
