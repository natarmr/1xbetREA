package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class su implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32797a;
    public final /* synthetic */ xu b;

    public /* synthetic */ su(xu xuVar, byte b) {
        this.f32797a = b;
        this.b = xuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CharSequence charSequenceU0;
        String string;
        Object value;
        byte b = this.f32797a;
        xu xuVar = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = xu.Q1;
                ComponentCallbacks2 application = xuVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(yu.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof yu)) {
                        ze3Var = null;
                    }
                    yu yuVar = (yu) ze3Var;
                    if (yuVar != null) {
                        i1w0 i1w0VarF = a4n0.f(xuVar);
                        i1w0VarF.getClass();
                        lef0 lef0Var = yuVar.f43244a;
                        d1p d1pVar = yuVar.b;
                        ru ruVar = yuVar.d;
                        mi70 mi70Var = yuVar.c;
                        d1pVar.getClass();
                        return new b6i(ruVar, lef0Var, d1pVar, i1w0VarF, mi70Var);
                    }
                }
                jf4.n(b1j.i(yu.class, "Cannot create dependency "));
                return null;
            case 1:
                gfk0 gfk0Var2 = xu.Q1;
                return (a6i) xuVar.I0().f.get();
            case 2:
                gfk0 gfk0Var3 = xu.Q1;
                xu xuVar2 = this.b;
                wdk0 wdk0Var = (wdk0) xuVar2.I0().f2055a.j;
                x1x.y(wdk0Var);
                rek0 rek0Var = rek0.b;
                String strH = xuVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), xuVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 3:
                gfk0 gfk0Var4 = xu.Q1;
                xuVar.J0().x();
                return Unit.f46060a;
            case 4:
                gfk0 gfk0Var5 = xu.Q1;
                pv pvVarJ0 = xuVar.J0();
                String strN = xuVar.P1.n(xuVar, xu.R1[1]);
                strN.getClass();
                p7m0 p7m0Var = pvVarJ0.o;
                if (((jv) p7m0Var.getValue()).e) {
                    String str = ((jv) p7m0Var.getValue()).c;
                    bby bbyVar = pvVarJ0.q;
                    if ((bbyVar == null || !bbyVar.isActive()) && (charSequenceU0 = StringsKt.u0(str)) != null && (string = charSequenceU0.toString()) != null) {
                        pvVarJ0.q = pvVarJ0.w(jiu0.a(pvVarJ0), new t0(1, pvVarJ0, pv.class, "onConfirmCodeError", "onConfirmCodeError(Ljava/lang/Throwable;)V", 0, (byte) 19), new kv(pvVarJ0, string, strN, null));
                    }
                } else {
                    pvVarJ0.p.f(bv.f3258a);
                }
                return Unit.f46060a;
            default:
                gfk0 gfk0Var6 = xu.Q1;
                p7m0 p7m0Var2 = xuVar.J0().o;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, jv.a((jv) value, false, null, null, false, false, null, 62)));
                return Unit.f46060a;
        }
    }
}
