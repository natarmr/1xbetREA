package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w22 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38430a;
    public final /* synthetic */ org.xplatform.special_event.impl.alleventsgames.presentation.a b;

    public /* synthetic */ w22(org.xplatform.special_event.impl.alleventsgames.presentation.a aVar, byte b) {
        this.f38430a = b;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38430a;
        org.xplatform.special_event.impl.alleventsgames.presentation.a aVar = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                ComponentCallbacks2 application = aVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(y22.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof y22)) {
                        ze3Var = null;
                    }
                    y22 y22Var = (y22) ze3Var;
                    if (y22Var != null) {
                        i1w0 i1w0VarF = a4n0.f(aVar);
                        AllEventGamesScreenParams allEventGamesScreenParamsG0 = aVar.G0();
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        String strB = xnk0.b(aVar.G0().getF46963a(), efx.v(aVar).f4046a);
                        Application application2 = aVar.n0().getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        i1w0VarF.getClass();
                        itr itrVar = y22Var.f41887a;
                        zx10 zx10Var = y22Var.e;
                        cad cadVar = y22Var.c;
                        ctf0 ctf0Var = y22Var.i;
                        j1q0 j1q0Var = y22Var.j;
                        edo edoVar = y22Var.f;
                        aqp0 aqp0Var = y22Var.b;
                        zfo zfoVar = y22Var.h;
                        gst0 gst0Var = y22Var.g;
                        iip iipVar = y22Var.d;
                        duj dujVar = y22Var.l;
                        m1e m1eVar = y22Var.k;
                        knf0 knf0Var = y22Var.m;
                        gii0 gii0Var = y22Var.n;
                        y78 y78Var = y22Var.o;
                        r9u r9uVar = y22Var.z;
                        iw20 iw20Var = y22Var.p;
                        roi0 roi0Var = y22Var.q;
                        ilp0 ilp0Var = y22Var.r;
                        yo4 yo4Var = y22Var.s;
                        d1p d1pVar = y22Var.t;
                        sjl0 sjl0Var = y22Var.u;
                        btt0 btt0Var = y22Var.v;
                        b3c0 b3c0Var = y22Var.w;
                        ugf0 ugf0Var = y22Var.x;
                        wdk0 wdk0Var = y22Var.y;
                        fsd fsdVar = y22Var.A;
                        ewk ewkVar = y22Var.B;
                        iipVar.getClass();
                        itrVar.getClass();
                        d1pVar.getClass();
                        aqp0Var.getClass();
                        m1eVar.getClass();
                        edoVar.getClass();
                        zfoVar.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        gst0Var.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        sjl0Var.getClass();
                        btt0Var.getClass();
                        b3c0Var.getClass();
                        r9uVar.getClass();
                        wdk0Var.getClass();
                        fsdVar.getClass();
                        ewkVar.getClass();
                        return new y7i(itrVar, zx10Var, cadVar, iipVar, iw20Var, roi0Var, ilp0Var, d1pVar, cuiVarC, ugf0Var, allEventGamesScreenParamsG0, m1eVar, ctf0Var, dujVar, i1w0VarF, y78Var, yo4Var, r9uVar, wdk0Var, fsdVar, ewkVar);
                    }
                }
                jf4.n(b1j.i(y22.class, "Cannot create dependency "));
                return null;
            case 1:
                x7i x7iVar = aVar.L1;
                if (x7iVar != null) {
                    return new q0h0(x7iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                hfk0 hfk0Var2 = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                aVar.H0().x(l22.f19286a);
                return Unit.f46060a;
            case 3:
                hfk0 hfk0Var3 = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                aVar.H0().x(i22.f14028a);
                return Unit.f46060a;
            case 4:
                hfk0 hfk0Var4 = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                aVar.H0().x(p22.f26232a);
                return Unit.f46060a;
            default:
                hfk0 hfk0Var5 = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                aVar.H0().x(r22.f29710a);
                return Unit.f46060a;
        }
    }
}
