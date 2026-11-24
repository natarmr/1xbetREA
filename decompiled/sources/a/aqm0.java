package a;

import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class aqm0 implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vjq f1304a;
    public final tpt0 b;
    public final k050 c;
    public pot0 d;
    public final LinkedList e;

    public aqm0(vjq vjqVar, tpt0 tpt0Var) {
        vjqVar.getClass();
        tpt0Var.getClass();
        this.f1304a = vjqVar;
        this.b = tpt0Var;
        this.c = new k050();
        this.e = new LinkedList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xpm0 xpm0Var, pot0 pot0Var, zje zjeVar) {
        zpm0 zpm0Var;
        if (zjeVar instanceof zpm0) {
            zpm0Var = (zpm0) zjeVar;
            int i = zpm0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpm0Var.m = i - Integer.MIN_VALUE;
            } else {
                zpm0Var = new zpm0(this, zjeVar);
            }
        } else {
            zpm0Var = new zpm0(this, zjeVar);
        }
        Object objC = zpm0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = zpm0Var.m;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "StillCaptureRequestControl: submitting " + xpm0Var + " at " + pot0Var);
            }
            zpm0Var.i = xpm0Var;
            zpm0Var.j = pot0Var;
            zpm0Var.m = 1;
            objC = this.f1304a.c(zpm0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pot0Var = zpm0Var.j;
            xpm0Var = zpm0Var.i;
            z1x.P(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
        }
        return qjj.M(this.b.f, null, new lcl0(pot0Var.a(xpm0Var.b, xpm0Var.c, iIntValue, xpm0Var.f41277a), xpm0Var, yjeVar, (byte) 7), 3);
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.d = pot0Var;
        qjj.W(this.b.f, null, null, new lpp(this, null), 3);
    }

    @Override // a.jot0
    public final void reset() {
        qjj.W(this.b.f, null, null, new zol0(this, null), 3);
    }
}
