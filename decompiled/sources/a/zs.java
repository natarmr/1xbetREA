package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zs implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44883a;
    public final /* synthetic */ ft b;

    public /* synthetic */ zs(ft ftVar, byte b) {
        this.f44883a = b;
        this.b = ftVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44883a;
        ft ftVar = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = ft.N1;
                ftVar.G0().x(us.f36184a);
                return Unit.f46060a;
            case 1:
                qek0 qek0Var2 = ft.N1;
                ftVar.G0().x(qs.f29233a);
                return Unit.f46060a;
            case 2:
                qek0 qek0Var3 = ft.N1;
                ftVar.G0().x(new ts(true));
                return Unit.f46060a;
            case 3:
                qek0 qek0Var4 = ft.N1;
                ftVar.G0().x(new ts(false));
                return Unit.f46060a;
            case 4:
                qek0 qek0Var5 = ft.N1;
                ComponentCallbacks2 application = ftVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ms.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ms)) {
                        ze3Var = null;
                    }
                    ms msVar = (ms) ze3Var;
                    if (msVar != null) {
                        a4n0.f(ftVar).getClass();
                        lp4 lp4Var = msVar.f22295a;
                        y58 y58Var = msVar.b;
                        cad cadVar = msVar.c;
                        vd1 vd1Var = msVar.d;
                        zg zgVar = msVar.e;
                        yo4 yo4Var = msVar.f;
                        oeg0 oeg0Var = msVar.g;
                        z4w0 z4w0Var = msVar.i;
                        ii iiVar = msVar.h;
                        ctf0 ctf0Var = msVar.j;
                        d1p d1pVar = msVar.k;
                        u58 u58Var = msVar.l;
                        mi70 mi70Var = msVar.m;
                        lp4Var.getClass();
                        y58Var.getClass();
                        d1pVar.getClass();
                        iiVar.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        return new z5i(cadVar, y58Var, d1pVar, iiVar, vd1Var, zgVar, yo4Var, oeg0Var, z4w0Var, ctf0Var, u58Var, mi70Var);
                    }
                }
                jf4.n(b1j.i(ms.class, "Cannot create dependency "));
                return null;
            case 5:
                qek0 qek0Var6 = ft.N1;
                return new q0h0((y5i) ((z5i) ftVar.L1.getValue()).m.get());
            case 6:
                qek0 qek0Var7 = ft.N1;
                ftVar.G0().x(ws.f39669a);
                return Unit.f46060a;
            default:
                qek0 qek0Var8 = ft.N1;
                ftVar.G0().x(ss.f32703a);
                return Unit.f46060a;
        }
    }
}
