package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m790 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21309a;
    public final /* synthetic */ r790 b;

    public /* synthetic */ m790(r790 r790Var, byte b) {
        this.f21309a = b;
        this.b = r790Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21309a;
        j490 j490Var = j490.f15873a;
        r790 r790Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = r790.Z1;
                r790Var.I0().x(n490.f22889a);
                return Unit.f46060a;
            case 1:
                xi70 xi70Var2 = r790.Z1;
                r790Var.I0().x(j490Var);
                return Unit.f46060a;
            case 2:
                xi70 xi70Var3 = r790.Z1;
                r790Var.I0().x(k490.f17657a);
                return Unit.f46060a;
            case 3:
                xi70 xi70Var4 = r790.Z1;
                r790Var.I0().x(j490Var);
                return Unit.f46060a;
            case 4:
                xi70 xi70Var5 = r790.Z1;
                r790Var.I0().x(j490Var);
                return Unit.f46060a;
            case 5:
                xi70 xi70Var6 = r790.Z1;
                kxq kxqVarN0 = r790Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 555);
                return Unit.f46060a;
            case 6:
                xi70 xi70Var7 = r790.Z1;
                ComponentCallbacks2 application = r790Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(s790.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof s790)) {
                        ze3Var = null;
                    }
                    s790 s790Var = (s790) ze3Var;
                    if (s790Var != null) {
                        i1w0 i1w0VarF = a4n0.f(r790Var);
                        cgx0 cgx0Var = r790Var.X1;
                        iiy[] iiyVarArr = r790.a2;
                        k790 k790Var = new k790(r790Var.W1.n(r790Var, iiyVarArr[2]), r790Var.V1.n(r790Var, iiyVarArr[1]).longValue(), cgx0Var.n(r790Var, iiyVarArr[3]).booleanValue());
                        i1w0VarF.getClass();
                        zas0 zas0Var = s790Var.h;
                        d1p d1pVar = s790Var.i;
                        zx10 zx10Var = s790Var.n;
                        hse0 hse0Var = s790Var.f31739a;
                        pv00 pv00Var = s790Var.e;
                        rou rouVar = s790Var.b;
                        buo0 buo0Var = s790Var.c;
                        lp4 lp4Var = s790Var.d;
                        wsf0 wsf0Var = s790Var.o;
                        vd1 vd1Var = s790Var.f;
                        duj dujVar = s790Var.g;
                        mne mneVar = s790Var.j;
                        ii iiVar = s790Var.p;
                        ctf0 ctf0Var = s790Var.k;
                        pru pruVar = s790Var.l;
                        zri zriVar = s790Var.m;
                        ntu ntuVar = s790Var.q;
                        grj grjVar = s790Var.r;
                        wdk0 wdk0Var = s790Var.s;
                        i7u0 i7u0Var = s790Var.t;
                        gst0 gst0Var = s790Var.u;
                        ocl oclVar = s790Var.v;
                        vby vbyVar = s790Var.w;
                        ony onyVar = s790Var.x;
                        d1pVar.getClass();
                        lp4Var.getClass();
                        iiVar.getClass();
                        hse0Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        gst0Var.getClass();
                        vbyVar.getClass();
                        onyVar.getClass();
                        return new mni(zas0Var, zx10Var, pv00Var, d1pVar, wsf0Var, lp4Var, iiVar, i1w0VarF, k790Var, hse0Var, rouVar, buo0Var, vd1Var, dujVar, mneVar, ctf0Var, pruVar, zriVar, ntuVar, grjVar, wdk0Var, i7u0Var, gst0Var, oclVar, vbyVar, onyVar);
                    }
                }
                jf4.n(b1j.i(s790.class, "Cannot create dependency "));
                return null;
            case 7:
                xi70 xi70Var8 = r790.Z1;
                return new q0h0((kni) r790Var.G0().D.get());
            case 8:
                xi70 xi70Var9 = r790.Z1;
                return new qm90(r790Var.n0().i, ((mni) ((lni) r790Var.G0().E.get()).f20347a.c).r);
            case 9:
                xi70 xi70Var10 = r790.Z1;
                khf0 khf0VarQ = m7x.Q(r790Var, "android.permission.CAMERA", j120.V());
                if (khf0VarQ != null) {
                    return khf0VarQ.d();
                }
                return null;
            case 10:
                xi70 xi70Var11 = r790.Z1;
                khf0 khf0VarQ2 = m7x.Q(r790Var, j120.V(), new String[0]);
                if (khf0VarQ2 != null) {
                    return khf0VarQ2.d();
                }
                return null;
            default:
                xi70 xi70Var12 = r790.Z1;
                khf0 khf0VarQ3 = m7x.Q(r790Var, "android.permission.CAMERA", new String[0]);
                if (khf0VarQ3 != null) {
                    return khf0VarQ3.d();
                }
                return null;
        }
    }
}
