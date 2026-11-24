package a;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.dayexpress.impl.presentation.DayExpressScreen;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uwe implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36388a;
    public final /* synthetic */ axe b;

    public /* synthetic */ uwe(axe axeVar, byte b) {
        this.f36388a = b;
        this.b = axeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36388a;
        byte b2 = 4;
        byte b3 = 1;
        yje yjeVar = null;
        byte b4 = 0;
        axe axeVar = this.b;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                kud kudVar = axe.e2;
                bundle.getClass();
                axeVar.M0().q0(bundle.getInt("RESULT_POSITION", 0), false);
                return Unit.f46060a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kud kudVar2 = axe.e2;
                r7f r7fVarM0 = axeVar.M0();
                if (zBooleanValue) {
                    r7fVarM0.I0.f29324a.c("coupon_download_done");
                    r7fVarM0.K0.f40143a.a(xun.f41520a, 3215L);
                    r7fVarM0.c0();
                    r7fVarM0.h0(false, true, new yld((byte) 26));
                }
                return Unit.f46060a;
            case 2:
                Bundle bundle2 = (Bundle) obj;
                kud kudVar3 = axe.e2;
                bundle2.getClass();
                int i = bundle2.getInt("RESULT_BLOCK_ID", 0);
                r7f r7fVarM1 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM1), l5f.f19452a, null, r7fVarM1.Y0.b, new m5f(r7fVarM1, i, yjeVar, b4), 10);
                return Unit.f46060a;
            case 3:
                Bundle bundle3 = (Bundle) obj;
                kud kudVar4 = axe.e2;
                bundle3.getClass();
                Serializable serializable = bundle3.getSerializable("RESULT_ACTION");
                ore oreVar = serializable instanceof ore ? (ore) serializable : null;
                if (oreVar != null) {
                    r7f r7fVarM2 = axeVar.M0();
                    int iOrdinal = oreVar.ordinal();
                    if (iOrdinal == 0) {
                        r7fVarM2.V(false);
                    } else if (iOrdinal == 1) {
                        r7fVarM2.u0();
                    } else if (iOrdinal == 2) {
                        sac.V(jiu0.a(r7fVarM2), n5f.f22942a, null, r7fVarM2.Y0.b, new d5f(r7fVarM2, yjeVar, b3), 10);
                    } else if (iOrdinal == 3) {
                        r7fVarM2.R(m3f.f21112a);
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        r7fVarM2.V(true);
                    }
                }
                return Unit.f46060a;
            case 4:
                Bundle bundle4 = (Bundle) obj;
                kud kudVar5 = axe.e2;
                bundle4.getClass();
                int i2 = bundle4.getInt("RESULT_POSITION");
                r7f r7fVarM3 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM3), g6f.f10761a, null, r7fVarM3.Y0.b, new bh0(r7fVarM3, i2, yjeVar, (byte) 9), 10);
                return Unit.f46060a;
            case 5:
                kud kudVar6 = axe.e2;
                ((Bundle) obj).getClass();
                axeVar.q0().getViewTreeObserver().addOnGlobalLayoutListener(new de3(axeVar, (byte) 3));
                return Unit.f46060a;
            case 6:
                oc9 oc9Var = (oc9) obj;
                kud kudVar7 = axe.e2;
                oc9Var.getClass();
                if (oc9Var instanceof lc9) {
                    axeVar.O0();
                } else {
                    yje yjeVar2 = null;
                    if (oc9Var instanceof mc9) {
                        r7f r7fVarM4 = axeVar.M0();
                        sac.V(jiu0.a(r7fVarM4), o6f.f24732a, null, r7fVarM4.Y0.b, new qe5((Object) r7fVarM4, ((mc9) oc9Var).f21540a, yjeVar2, (byte) 2), 10);
                    } else {
                        if (!(oc9Var instanceof nc9)) {
                            t9f.b();
                            return null;
                        }
                        r7f r7fVarM5 = axeVar.M0();
                        sac.V(jiu0.a(r7fVarM5), null, null, r7fVarM5.Y0.f22085a, new i5f(r7fVarM5, ((nc9) oc9Var).f23281a, yjeVar2, (byte) 3), 11);
                    }
                }
                return Unit.f46060a;
            case 7:
                xhe0 xhe0Var = (xhe0) obj;
                kud kudVar8 = axe.e2;
                xhe0Var.getClass();
                vyx vyxVar = axeVar.X1;
                if (vyxVar != null) {
                    vyxVar.s(xhe0Var);
                }
                return Unit.f46060a;
            case 8:
                kud kudVar9 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM6 = axeVar.M0();
                i8i.D("screen", "coupon_start", r7fVarM6.I0.f29324a, "login_page_call");
                s64 s64Var = r7fVarM6.O0;
                y1p y1pVar = y1p.MAIN;
                s64Var.c("coupon_start");
                i1w0 i1w0Var = r7fVarM6.V0;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 9:
                kud kudVar10 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM7 = axeVar.M0();
                i8i.D("screen", "coupon_start", r7fVarM7.I0.f29324a, "reg_page_call");
                r7fVarM7.O0.d(y1p.COUPON_START, r7fVarM7.P0.g());
                sac.V(jiu0.a(r7fVarM7), new t4f(r7fVarM7, b4), null, r7fVarM7.Y0.b, new d5f(r7fVarM7, yjeVar, b2), 10);
                return Unit.f46060a;
            case 10:
                kud kudVar11 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM8 = axeVar.M0();
                r7fVarM8.N0.f(k7k.EmptyCoupon);
                l7k l7kVar = r7fVarM8.Q0;
                y1p y1pVar2 = y1p.MAIN;
                l7kVar.b("empty_coupon", r7fVarM8.P0.g());
                i1w0 i1w0Var2 = r7fVarM8.V0;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new a1w0(new s4f(r7fVarM8, b2))), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 11:
                kud kudVar12 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM9 = axeVar.M0();
                i1w0 i1w0Var3 = r7fVarM9.V0;
                k0w0 k0w0VarI = cs0.i(i1w0Var3, i1w0Var3);
                eke0 eke0Var = r7fVarM9.F0;
                bhh0 bhh0Var = bhh0.b;
                eke0Var.getClass();
                k0w0VarI.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                ListIterator listIteratorO = b1j.o(i1w0Var3, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO;
                    if (!pawVar3.hasNext()) {
                        r7fVarM9.M0.g(wgh0.COUPON_SEARCH);
                        r7fVarM9.R0.C("coupon_search");
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar3.next());
                }
                break;
            case 12:
                kud kudVar13 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM10 = axeVar.M0();
                r7fVarM10.K0.o(ptn.f27573a);
                r7fVarM10.I0.c(koc.f18625a);
                i1w0 i1w0Var4 = r7fVarM10.V0;
                k0w0 k0w0VarI2 = cs0.i(i1w0Var4, i1w0Var4);
                r7fVarM10.G0.getClass();
                k0w0VarI2.h(new DayExpressScreen(true));
                ListIterator listIteratorO2 = b1j.o(i1w0Var4, k0w0VarI2.f17489a, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO2;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var4.a((oe50) pawVar4.next());
                }
                break;
            case 13:
                kud kudVar14 = axe.e2;
                ((View) obj).getClass();
                r7f r7fVarM11 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM11), n5f.f22942a, null, r7fVarM11.Y0.b, new d5f(r7fVarM11, yjeVar, b3), 10);
                return Unit.f46060a;
            default:
                kud kudVar15 = axe.e2;
                ((View) obj).getClass();
                axeVar.M0().u0();
                return Unit.f46060a;
        }
    }
}
