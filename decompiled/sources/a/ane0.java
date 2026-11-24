package a;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class ane0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f1147a;
    public final vwb0 b;
    public final vby c;
    public final n0o0 d = maz.b(new tie0(this, 5));
    public kds0 e;
    public boolean f;

    public ane0(us00 us00Var, vwb0 vwb0Var, vby vbyVar) {
        this.f1147a = us00Var;
        this.b = vwb0Var;
        this.c = vbyVar;
    }

    public final aoe0 a() {
        kds0 kds0VarC = this.e;
        if (kds0VarC == null && (kds0VarC = c()) == null) {
            kds0VarC = new kds0(b());
        }
        this.e = kds0VarC;
        aoe0 aoe0Var = kds0VarC.c;
        return aoe0Var == null ? new aoe0() : aoe0Var;
    }

    public final aoe0 b() {
        Object g0g0Var;
        vwb0 vwb0Var = this.b;
        try {
            e0g0 e0g0Var = j0g0.b;
            String strC = vwb0Var.c("REFERRAL_KEY", "");
            if (strC.length() == 0) {
                strC = d("referal");
            }
            if (strC.length() > 0) {
                vwb0Var.h("REFERRAL_KEY", strC);
                g0g0Var = (aoe0) this.c.b(aoe0.Companion.serializer(), strC);
            } else {
                g0g0Var = new aoe0();
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object aoe0Var = new aoe0();
        if (g0g0Var instanceof g0g0) {
            g0g0Var = aoe0Var;
        }
        aoe0 aoe0Var2 = (aoe0) g0g0Var;
        this.f = false;
        return aoe0Var2;
    }

    public final kds0 c() {
        Object g0g0Var;
        vwb0 vwb0Var = this.b;
        try {
            e0g0 e0g0Var = j0g0.b;
            String strC = vwb0Var.c("REFERRAL_KEY_V2", "");
            if (strC.length() == 0) {
                strC = d("init.json");
            }
            if (strC.length() > 0) {
                vwb0Var.h("REFERRAL_KEY_V2", strC);
                g0g0Var = (kds0) this.c.b(kds0.Companion.serializer(), strC);
            } else {
                g0g0Var = null;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        kds0 kds0Var = (kds0) g0g0Var;
        if (kds0Var == null) {
            return null;
        }
        this.f = true;
        return kds0Var;
    }

    public final String d(String str) {
        Object g0g0Var;
        if (!((Set) this.d.getValue()).contains(str)) {
            return "";
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            InputStream inputStreamOpen = this.f1147a.getAssets().open(str);
            inputStreamOpen.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                g0g0Var = n8n0.k(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th3);
        }
        return (String) (g0g0Var instanceof g0g0 ? "" : g0g0Var);
    }

    public final void e(String str) {
        String str2;
        str.getClass();
        kds0 kds0Var = (kds0) this.c.b(kds0.Companion.serializer(), str);
        aoe0 aoe0Var = kds0Var.c;
        if (aoe0Var == null || (str2 = aoe0Var.c) == null || str2.length() == 0) {
            return;
        }
        this.b.h("REFERRAL_KEY_V2", str);
        this.e = kds0Var;
    }
}
