package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class m1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f21021a;
    public final p7m0 b;
    public final LinkedHashMap c;
    public final p7m0 d;
    public final p7m0 e;
    public final p7m0 f;
    public ezk g;
    public final p7m0 h;
    public final p7m0 i;

    public m1q0(q7d0 q7d0Var) {
        q7d0Var.getClass();
        this.f21021a = q7d0Var;
        this.b = q7m0.a(ghp.u);
        jo20 jo20Var = new jo20();
        c0o c0oVar = ygp.N1;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            ygp ygpVar = (ygp) y2VarH.next();
            q7d0 q7d0Var2 = this.f21021a;
            String strN = ohs0.n(ygpVar.name(), "FEATURE_TOGGLE_POSTFIX");
            boolean z = ygpVar.f42596a;
            q7d0Var2.getClass();
            jo20Var.put(ygpVar, Boolean.valueOf(q7d0Var2.a().getBoolean(strN, z)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jo20Var.b());
        this.c = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new xgp((ygp) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
        }
        this.d = q7m0.a(arrayList);
        this.e = q7m0.a(cre.d);
        this.f = q7m0.a(z0q0.g);
        q7d0 q7d0Var3 = this.f21021a;
        q7d0Var3.getClass();
        this.h = q7m0.a(Boolean.valueOf(q7d0Var3.a().getBoolean("FAKE_APP_GUID_ENABLED", false)));
        String strC = q7d0.c(this.f21021a, "FAKE_APP_GUID");
        this.i = q7m0.a(strC == null ? "" : strC);
    }

    public final boolean a() {
        return axq.z(this.f21021a, "TEST_AGGREGATOR", false);
    }

    public final boolean b() {
        return axq.z(this.f21021a, "WEB_VIEW_DEBUGGABLE", false);
    }

    public final boolean c() {
        return axq.z(this.f21021a, "CHECK_GEO", true);
    }

    public final boolean d(ygp ygpVar) {
        ygpVar.getClass();
        Boolean bool = (Boolean) this.c.get(ygpVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        return axq.z(this.f21021a, ohs0.n(ygpVar.name(), "FEATURE_TOGGLE_POSTFIX"), ygpVar.f42596a);
    }

    public final boolean e() {
        return axq.z(this.f21021a, "HIGHLIGHT_DESIGN_SYSTEM", false);
    }

    public final boolean f() {
        return this.f21021a.a().getBoolean("LOG_FAILED_EVENT", false);
    }

    public final boolean g() {
        return axq.z(this.f21021a, "LUXURY_TEST_SERVER", false);
    }

    public final boolean h(boolean z) {
        return axq.z(this.f21021a, "NEW_ALT_APP_START_PARTNER", z);
    }

    public final boolean i() {
        return axq.z(this.f21021a, "SHOW_TEST_BANNER", false);
    }

    public final boolean j() {
        return axq.z(this.f21021a, "MARKET_NUMBER_VISIBILITY", false);
    }

    public final boolean k() {
        return axq.z(this.f21021a, "SHOW_PUSH_INFO", false);
    }

    public final boolean l() {
        return axq.z(this.f21021a, "SIP_CRM_TEST", false);
    }

    public final boolean m() {
        return axq.z(this.f21021a, "SIP_CRM_V2_TEST", false);
    }

    public final z0q0 n() {
        Object g0g0Var;
        String strC = q7d0.c(this.f21021a, "TEST_CONSULTANT");
        if (strC != null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                JSONObject jSONObject = new JSONObject(strC);
                String string = jSONObject.getString("TEST_CONSULTANT_PROJECT_ID");
                if (string == null) {
                    string = "";
                }
                String string2 = jSONObject.getString("TEST_CONSULTANT_URL");
                if (string2 == null) {
                    string2 = "";
                }
                g0g0Var = new z0q0(string, string2, jSONObject.getBoolean("TEST_CONSULTANT_USE_CUSTOM"), jSONObject.getBoolean("TEST_CONSULTANT_USE_TEST"), jSONObject.getBoolean("TEST_CONSULTANT_USE_TEST_STAGE"), jSONObject.getBoolean("TEST_CONSULTANT_USE_STAGE"));
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            z0q0 z0q0Var = (z0q0) g0g0Var;
            if (z0q0Var != null) {
                return z0q0Var;
            }
        }
        return z0q0.g;
    }

    public final boolean o() {
        return axq.z(this.f21021a, "TEST_SERVER", false);
    }

    public final boolean p() {
        return axq.z(this.f21021a, "SECOND_TEST_SERVER", false);
    }

    public final boolean q() {
        return axq.z(this.f21021a, "TEST_REMOTE_CONFIG_ENABLED", false);
    }
}
