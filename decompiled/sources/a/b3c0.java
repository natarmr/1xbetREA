package a;

import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class b3c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lpb f1896a;
    public final x2c0 b;
    public final knf0 c;
    public final vwb0 d;
    public final us3 e;
    public final mne f;
    public final btt0 g;

    public b3c0(lpb lpbVar, x2c0 x2c0Var, knf0 knf0Var, vwb0 vwb0Var, us3 us3Var, mne mneVar, btt0 btt0Var) {
        x2c0Var.getClass();
        knf0Var.getClass();
        vwb0Var.getClass();
        us3Var.getClass();
        btt0Var.getClass();
        this.f1896a = lpbVar;
        this.b = x2c0Var;
        this.c = knf0Var;
        this.d = vwb0Var;
        this.e = us3Var;
        this.f = mneVar;
        this.g = btt0Var;
    }

    public final Object a(boolean z, yje yjeVar) {
        if (z) {
            return b(yjeVar);
        }
        m2c0 m2c0VarA = this.b.a();
        return m2c0VarA == null ? b(yjeVar) : m2c0VarA;
    }

    public final Object b(yje yjeVar) {
        return qjj.d0(this.f.b, new c670(this, null, (byte) 23), yjeVar);
    }

    public final boolean c() {
        return this.d.b().getBoolean("available_multicurrency_key", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(boolean z, boolean z2, String str, rl40 rl40Var, String str2, zje zjeVar) {
        a3c0 a3c0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof a3c0) {
            a3c0Var = (a3c0) zjeVar;
            int i = a3c0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3c0Var.k = i - Integer.MIN_VALUE;
            } else {
                a3c0Var = new a3c0(this, zjeVar);
            }
        } else {
            a3c0Var = new a3c0(this, zjeVar);
        }
        Object obj = a3c0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = a3c0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                lpb lpbVar = this.f1896a;
                this.e.getClass();
                String strA = this.g.a();
                a3c0Var.k = 1;
                Object objB = ((z2c0) lpbVar.f20432a.b(sre0.f32672a.b(z2c0.class))).b(strA, new jnt0(rl40Var.f30679a, str, str2, z, z2), a3c0Var);
                if (objB != wneVar) {
                    objB = Unit.f46060a;
                }
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Boolean.TRUE;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? Boolean.FALSE : g0g0Var;
    }
}
