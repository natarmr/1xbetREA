package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jud implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17148a;
    public final /* synthetic */ nud b;

    public /* synthetic */ jud(nud nudVar, byte b) {
        this.f17148a = b;
        this.b = nudVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17148a;
        boolean z = false;
        byte b2 = 8;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        yje yjeVar = null;
        nud nudVar = this.b;
        switch (b) {
            case 0:
                kud kudVar = nud.b2;
                Application application = nudVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(iud.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof iud)) {
                        ze3Var = null;
                    }
                    iud iudVar = (iud) ze3Var;
                    if (iudVar != null) {
                        i1w0 i1w0VarF = a4n0.f(nudVar);
                        phf0 phf0Var = nudVar.Q1;
                        iiy[] iiyVarArr = nud.c2;
                        oud oudVar = new oud(nudVar.P1.n(nudVar, iiyVarArr[2]).intValue(), (we50) nudVar.S1.n(nudVar, iiyVarArr[5]), phf0Var.n(nudVar, iiyVarArr[3]), nudVar.N1.n(nudVar, iiyVarArr[0]), nudVar.O1.n(nudVar, iiyVarArr[1]), nudVar.R1.n(nudVar, iiyVarArr[4]), nudVar.U1.n(nudVar, iiyVarArr[6]), nudVar.V1.n(nudVar, iiyVarArr[7]));
                        i1w0VarF.getClass();
                        ctf0 ctf0Var = iudVar.f15391a;
                        duj dujVar = iudVar.b;
                        mne mneVar = iudVar.c;
                        m1e m1eVar = iudVar.d;
                        eru eruVar = iudVar.e;
                        jh70 jh70Var = iudVar.f;
                        ii iiVar = iudVar.g;
                        iqt iqtVar = iudVar.h;
                        rou rouVar = iudVar.j;
                        lef0 lef0Var = iudVar.k;
                        lp4 lp4Var = iudVar.l;
                        wdk0 wdk0Var = iudVar.m;
                        pru pruVar = iudVar.i;
                        mi70 mi70Var = iudVar.p;
                        g2v g2vVar = iudVar.o;
                        hse0 hse0Var = iudVar.n;
                        zn00 zn00Var = iudVar.q;
                        lp4Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        hse0Var.getClass();
                        return new vci(lef0Var, lp4Var, iiVar, i1w0VarF, oudVar, ctf0Var, dujVar, mneVar, m1eVar, eruVar, jh70Var, iqtVar, pruVar, rouVar, wdk0Var, hse0Var, g2vVar, mi70Var, zn00Var);
                    }
                }
                jf4.n(b1j.i(iud.class, "Cannot create dependency "));
                return null;
            case 1:
                kud kudVar2 = nud.b2;
                nudVar.J0();
                return Unit.f46060a;
            case 2:
                kud kudVar3 = nud.b2;
                nudVar.J0();
                return Unit.f46060a;
            case 3:
                kud kudVar4 = nud.b2;
                svd svdVarI0 = nudVar.I0();
                sac.V(jiu0.a(svdVarI0), qvd.f29380a, null, null, new pvd(svdVarI0, yjeVar, c == true ? 1 : 0), 14);
                return Unit.f46060a;
            case 4:
                kud kudVar5 = nud.b2;
                svd svdVarI1 = nudVar.I0();
                bby bbyVar = svdVarI1.C;
                if (bbyVar != null) {
                    bbyVar.cancel(plc.b("Operation canceled by user", new art0()));
                }
                svdVarI1.c.d(new x9((Object) svdVarI1, (boolean) (c2 == true ? 1 : 0), b2));
                return Unit.f46060a;
            case 5:
                kud kudVar6 = nud.b2;
                svd svdVarI2 = nudVar.I0();
                sac.V(jiu0.a(svdVarI2), new enc(1, svdVarI2, svd.class, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, svdVarI2.h.b, new jtb(svdVarI2, String.valueOf(nudVar.H0().h.getText()), yjeVar, (byte) 12), 10);
                return Unit.f46060a;
            case 6:
                ywq ywqVar = nudVar.Y1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 7:
                kud kudVar7 = nud.b2;
                nudVar.I0().D();
                return Unit.f46060a;
            case 8:
                kud kudVar8 = nud.b2;
                return (tci) ((vci) nudVar.X1.getValue()).t.get();
            case 9:
                kud kudVar9 = nud.b2;
                nudVar.I0().w();
                return Unit.f46060a;
            case 10:
                kud kudVar10 = nud.b2;
                svd svdVarI3 = nudVar.I0();
                bby bbyVar2 = svdVarI3.C;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(plc.b("Operation canceled by user", new art0()));
                }
                svdVarI3.w();
                return Unit.f46060a;
            case 11:
                kud kudVar11 = nud.b2;
                nud nudVar2 = this.b;
                wdk0 wdk0Var2 = nudVar2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = nudVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), nudVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 12:
                kud kudVar12 = nud.b2;
                nudVar.I0().w();
                return Unit.f46060a;
            case 13:
                kud kudVar13 = nud.b2;
                svd svdVarI4 = nudVar.I0();
                bby bbyVar3 = svdVarI4.C;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(plc.b("Operation canceled by user", new art0()));
                }
                svdVarI4.c.d(new x9(svdVarI4, z2, b2));
                return Unit.f46060a;
            case 14:
                kud kudVar14 = nud.b2;
                nudVar.I0().w();
                return Unit.f46060a;
            default:
                kud kudVar15 = nud.b2;
                svd svdVarI5 = nudVar.I0();
                bby bbyVar4 = svdVarI5.C;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(plc.b("Operation canceled by user", new art0()));
                }
                svdVarI5.c.d(new x9(svdVarI5, z, b2));
                return Unit.f46060a;
        }
    }
}
