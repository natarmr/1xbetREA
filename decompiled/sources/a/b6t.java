package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class b6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyn f2072a;
    public final v5t b;
    public final t5t c;
    public final knf0 d;
    public final mne e;

    public b6t(uyn uynVar, v5t v5tVar, t5t t5tVar, knf0 knf0Var, mne mneVar) {
        v5tVar.getClass();
        t5tVar.getClass();
        knf0Var.getClass();
        this.f2072a = uynVar;
        this.b = v5tVar;
        this.c = t5tVar;
        this.d = knf0Var;
        this.e = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i, int i2, zje zjeVar) {
        y5t y5tVar;
        if (zjeVar instanceof y5t) {
            y5tVar = (y5t) zjeVar;
            int i3 = y5tVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y5tVar.k = i3 - Integer.MIN_VALUE;
            } else {
                y5tVar = new y5t(this, zjeVar);
            }
        } else {
            y5tVar = new y5t(this, zjeVar);
        }
        Object objD0 = y5tVar.i;
        wne wneVar = wne.f39444a;
        int i4 = y5tVar.k;
        Object[] objArr = 0;
        yje yjeVar = null;
        if (i4 == 0) {
            z1x.P(objD0);
            jo20 jo20VarB = b(i, i2);
            dvj dvjVar = this.e.b;
            z5t z5tVar = new z5t(this, jo20VarB, yjeVar, objArr == true ? 1 : 0);
            y5tVar.k = 1;
            objD0 = qjj.d0(dvjVar, z5tVar, y5tVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        l6t l6tVar = (l6t) objD0;
        ArrayList arrayListZ = xvw.Z(l6tVar);
        Boolean bool = l6tVar.c;
        return new rzv(arrayListZ, bool != null ? bool.booleanValue() : false);
    }

    public final jo20 b(int i, int i2) {
        knf0 knf0Var = this.d;
        knf0Var.getClass();
        int iB = knf0Var.b();
        String strC = knf0Var.c();
        jo20 jo20Var = new jo20();
        jo20Var.put(ParameterNames.ID, Integer.valueOf(i));
        jo20Var.put("lng", strC);
        jo20Var.put("ref", 1);
        jo20Var.put("gr", 1357);
        if (i2 > 0 || iB > 0) {
            if (i2 <= 0) {
                i2 = iB;
            }
            jo20Var.put("country", Integer.valueOf(i2));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, int i2, zje zjeVar) {
        a6t a6tVar;
        if (zjeVar instanceof a6t) {
            a6tVar = (a6t) zjeVar;
            int i3 = a6tVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a6tVar.k = i3 - Integer.MIN_VALUE;
            } else {
                a6tVar = new a6t(this, zjeVar);
            }
        } else {
            a6tVar = new a6t(this, zjeVar);
        }
        Object objD0 = a6tVar.i;
        wne wneVar = wne.f39444a;
        int i4 = a6tVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i4 == 0) {
            z1x.P(objD0);
            jo20 jo20VarB = b(i, i2);
            dvj dvjVar = this.e.b;
            z5t z5tVar = new z5t(this, jo20VarB, yjeVar, b);
            a6tVar.k = 1;
            objD0 = qjj.d0(dvjVar, z5tVar, a6tVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        l6t l6tVar = (l6t) objD0;
        ArrayList arrayListZ = xvw.Z(l6tVar);
        Boolean bool = l6tVar.c;
        return new rzv(arrayListZ, bool != null ? bool.booleanValue() : false);
    }

    public final void d(dqk0 dqk0Var) {
        t5t t5tVar = this.c;
        t5tVar.getClass();
        t5tVar.f33385a.o(null, dqk0Var);
    }
}
