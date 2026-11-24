package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9810a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fn0(mm40 mm40Var, h1n h1nVar, h1n h1nVar2, mpm mpmVar, String str, String str2, String str3, int i) {
        this.f9810a = (byte) 4;
        x0m x0mVar = x0m.f40076a;
        this.b = mm40Var;
        this.c = h1nVar;
        this.e = h1nVar2;
        this.h = mpmVar;
        this.d = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i4 i4Var;
        l7m0 l7m0Var;
        ljc ljcVar;
        byte b = this.f9810a;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.h;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zgc.c((mm40) obj8, (l7m0) obj9, (d9z) obj6, (d9z) obj5, (xcz) obj7, (xcz) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                fre0.b((mm40) obj8, (l7m0) obj9, (xcz) obj7, (d9z) obj6, (xcz) obj3, (xcz) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                tz7.a((mm40) obj8, (d08) obj9, (rz7) obj6, (Function0) obj5, (Function0) obj7, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                kbc.d((knf) obj8, (sek) obj9, (bek) obj6, (z5s) obj5, (xex) obj7, (CyberBottomSheetParams) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                x0m x0mVar = x0m.f40076a;
                ((Integer) obj2).getClass();
                n4c.n((mm40) obj8, (h1n) obj9, (h1n) obj6, (mpm) obj5, (String) obj7, (String) obj3, (String) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                x0m x0mVar2 = x0m.f40076a;
                ((Integer) obj2).getClass();
                sac.r((mm40) obj8, (k1n) obj9, (k1n) obj6, (a2m) obj5, (String) obj7, (String) obj3, (String) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                aac.r((t6o) obj8, (sek) obj9, (z5s) obj6, (bek) obj5, (xex) obj7, (CyberBottomSheetParams) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                kbc.r((mm40) obj8, (String) obj9, (wm7) obj6, (a4x) obj5, (yto) obj7, (yto) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ntb.v((mm40) obj8, (o2s) obj6, (l7m0) obj9, (ugd) obj5, (ugd) obj7, (ugd) obj3, (ugd) obj4, (fet) obj, x8x.L(115043329));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                slb.x((gws) obj8, (sek) obj9, (bek) obj6, (z5s) obj5, (xex) obj7, (CyberBottomSheetParams) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                pz40 pz40Var = (pz40) obj8;
                pz40 pz40Var2 = (pz40) obj9;
                pz40 pz40Var3 = (pz40) obj6;
                pz40 pz40Var4 = (pz40) obj5;
                xcz xczVar = (xcz) obj7;
                cp cpVar = (cp) obj3;
                cbl0 cbl0Var = (cbl0) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i4 i4Var2 = (i4) ((hgk0) pz40Var).getValue();
                    Boolean bool = (Boolean) ((hgk0) pz40Var2).getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    boolean zBooleanValue2 = ((Boolean) ((hgk0) pz40Var3).getValue()).booleanValue();
                    boolean zG = fetVar.g(pz40Var4) | fetVar.g(i4Var2) | fetVar.g(xczVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        mw20 mw20Var = new mw20((Object) pz40Var4, (Object) i4Var2, (Object) xczVar, (yje) null, (byte) 12);
                        fetVar.o0(mw20Var);
                        objP = mw20Var;
                    }
                    m0x0.t(fetVar, i4Var2, (Function2) objP);
                    Integer numValueOf = Integer.valueOf(i4Var2.size());
                    boolean zG2 = fetVar.g(xczVar) | fetVar.i(cpVar) | fetVar.h(zBooleanValue) | fetVar.g(i4Var2);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        i4Var = i4Var2;
                        tu3 tu3Var = new tu3((Object) xczVar, (Object) cpVar, zBooleanValue, (Object) i4Var, (yje) null, (byte) 9);
                        fetVar.o0(tu3Var);
                        objP2 = tu3Var;
                    } else {
                        i4Var = i4Var2;
                    }
                    m0x0.v(bool, numValueOf, (Function2) objP2, fetVar);
                    tdc.m(null, i4Var, s3n.f31566a, zBooleanValue2, xczVar, cbl0Var, fetVar, 384, 1);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 11:
                ru60 ru60Var = (ru60) obj2;
                ((oyg0) obj).getClass();
                ru60Var.getClass();
                return ru60.a(ru60Var, null, false, false, false, x1x.D(((jza) obj8).f17401a), (Map) obj9, (qwa) obj6, (mza) obj5, q3d.j((dza) obj7, (dza) obj3), (dza) obj4, null, 0L, 31);
            case 12:
                ((Integer) obj2).getClass();
                d9x.r((Fragment) obj8, (l7m0) obj9, (roq0) obj6, (lme0) obj5, (Function1) obj4, (Function0) obj7, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                hew0.h((mm40) obj8, (frc0) obj9, (w2d) obj6, (nuc0) obj5, (Function1) obj4, (Function1) obj7, (Function1) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                return Unit.f46060a;
            case 14:
                dxk0 dxk0Var = (dxk0) obj8;
                twk0 twk0Var = (twk0) obj9;
                uhh0 uhh0Var = (uhh0) obj2;
                ((oyg0) obj).getClass();
                uhh0Var.getClass();
                uhh0 uhh0VarA = uhh0.a(uhh0Var, null, dxk0Var.f6850a, (cxk0) obj6, (cxk0) obj5, twk0Var.f34654a, twk0Var.b, twk0Var.c, null, dxk0Var.b, null, null, (lfh0) obj7, false, (sah0) obj3, 67049991);
                ((sih0) obj4).o.e("KEY_SELECTED_SEARCH_FILTER", Long.valueOf(uhh0VarA.k));
                return uhh0VarA;
            case 15:
                l7m0 l7m0Var2 = (l7m0) obj9;
                Function1 function1 = (Function1) obj4;
                List list = (List) obj8;
                vne vneVar = (vne) obj6;
                xk80 xk80Var = (xk80) obj5;
                adz adzVar = (adz) obj7;
                Function1 function2 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    zsv zsvVar = ((ucj0) l7m0Var2.getValue()).b;
                    boolean zG3 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new w7i0(function1, (byte) 20);
                        fetVar2.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG4 = fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new w7i0(function1, (byte) 21);
                        fetVar2.o0(objP4);
                    }
                    Function0 function3 = (Function0) objP4;
                    boolean zG5 = fetVar2.g(function1);
                    Object objP5 = fetVar2.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new w7i0(function1, (byte) 22);
                        fetVar2.o0(objP5);
                    }
                    zvw.j(zsvVar, function0, function3, (Function0) objP5, fetVar2, 0);
                    if (((ucj0) l7m0Var2.getValue()).c.c) {
                        fetVar2.e0(-1770069248);
                        ro4.c(((ucj0) l7m0Var2.getValue()).c.d, ((ucj0) l7m0Var2.getValue()).c.e, function1, null, ((ucj0) l7m0Var2.getValue()).c.f37359a, ((ucj0) l7m0Var2.getValue()).c.b, ((ucj0) l7m0Var2.getValue()).c.f, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1769629637);
                        fetVar2.r(false);
                    }
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = c7j0.f3866a;
                        fetVar2.o0(objP6);
                    }
                    xdr xdrVar = (xdr) ((jhy) objP6);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                    ljc ljcVar2 = jd8.n;
                    mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, ljcVar2);
                    boolean zG6 = fetVar2.g(l7m0Var2) | fetVar2.i(list) | fetVar2.i(vneVar) | fetVar2.g(xk80Var);
                    Object objP7 = fetVar2.P();
                    if (zG6 || objP7 == cl5Var) {
                        l7m0Var = l7m0Var2;
                        ljcVar = ljcVar2;
                        l0i0 l0i0Var = new l0i0((Object) l7m0Var, (Object) list, (Object) xk80Var, (Object) vneVar, (byte) 1);
                        fetVar2.o0(l0i0Var);
                        objP7 = l0i0Var;
                    } else {
                        l7m0Var = l7m0Var2;
                        ljcVar = ljcVar2;
                    }
                    y860.f(xdrVar, mm40VarQ, (Function1) objP7, fetVar2, 6, 0);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    zq8.a(0, fetVar2, i120.Q(o7k0.e(mm40VarD2, 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), ljcVar));
                    mm40 mm40VarC = o7k0.c(o7k0.d(jm40Var, 1.0f), 1.0f);
                    int size = ((ucj0) l7m0Var.getValue()).d.size();
                    boolean zG7 = fetVar2.g(l7m0Var);
                    Object objP8 = fetVar2.P();
                    byte b2 = 24;
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new ufp(l7m0Var, b2);
                        fetVar2.o0(objP8);
                    }
                    q5x.e(xk80Var, mm40VarC, null, null, size, 0.0f, null, null, false, (Function1) objP8, null, null, null, u1c.M(-1088175610, new n82(l7m0Var, adzVar, function2, b2), fetVar2), fetVar2, 48, 24576, 15340);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                zdx.s((mm40) obj8, (npo) obj9, (String) obj6, (a4x) obj5, (chl0) obj7, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                bbo0.a((mm40) obj8, (yx5) obj9, (SpecialEventTabScreenParams) obj6, (ebo0) obj5, (Function1) obj4, (Function0) obj7, (xdr) obj3, (fet) obj, x8x.L(71));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                p8a.K((l7m0) obj9, (l7m0) obj8, (xcz) obj7, (qdz) obj6, (d930) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(439));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fn0(mm40 mm40Var, k1n k1nVar, k1n k1nVar2, a2m a2mVar, String str, String str2, String str3, int i) {
        this.f9810a = (byte) 5;
        x0m x0mVar = x0m.f40076a;
        this.b = mm40Var;
        this.c = k1nVar;
        this.e = k1nVar2;
        this.h = a2mVar;
        this.d = str;
        this.f = str2;
        this.g = str3;
    }

    public /* synthetic */ fn0(mm40 mm40Var, o2s o2sVar, l7m0 l7m0Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, int i) {
        this.f9810a = (byte) 8;
        this.b = mm40Var;
        this.e = o2sVar;
        this.c = l7m0Var;
        this.h = ugdVar;
        this.d = ugdVar2;
        this.f = ugdVar3;
        this.g = ugdVar4;
    }

    public /* synthetic */ fn0(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, int i) {
        this.f9810a = (byte) 1;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = d9zVar;
        this.f = xczVar2;
        this.h = xczVar3;
        this.g = function1;
    }

    public /* synthetic */ fn0(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, d930 d930Var, Function1 function1, Function1 function2, int i) {
        this.f9810a = (byte) 18;
        this.c = l7m0Var;
        this.b = l7m0Var2;
        this.d = xczVar;
        this.e = qdzVar;
        this.h = d930Var;
        this.g = function1;
        this.f = function2;
    }

    public /* synthetic */ fn0(l7m0 l7m0Var, Function1 function1, List list, vne vneVar, kwj kwjVar, adz adzVar, Function1 function2) {
        this.f9810a = (byte) 15;
        this.c = l7m0Var;
        this.g = function1;
        this.b = list;
        this.e = vneVar;
        this.h = kwjVar;
        this.d = adzVar;
        this.f = function2;
    }

    public /* synthetic */ fn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, wdr wdrVar, int i, byte b) {
        this.f9810a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.h = obj4;
        this.d = obj5;
        this.f = obj6;
        this.g = wdrVar;
    }

    public /* synthetic */ fn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.f9810a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.h = obj4;
        this.d = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public /* synthetic */ fn0(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, wdr wdrVar, wdr wdrVar2, int i, byte b) {
        this.f9810a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.h = obj4;
        this.g = function1;
        this.d = wdrVar;
        this.f = wdrVar2;
    }
}
