package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rwc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31213a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rwc0(ndf0 ndf0Var, mm40 mm40Var, Fragment fragment, RelatedParams relatedParams) {
        this.f31213a = (byte) 18;
        this.d = mm40Var;
        this.b = fragment;
        this.c = relatedParams;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31213a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                m0x0.B((bxc0) obj5, (FixedWebView) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                break;
            case 1:
                ((Integer) obj2).getClass();
                y0x0.u((uxc0) obj5, (FixedWebView) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                q5x.v((mm40) obj5, (yrc0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                n6x.e((mm40) obj5, (aec0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                zyc0 zyc0Var = (zyc0) obj5;
                vyc0 vyc0Var = (vyc0) obj4;
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = zyc0Var.f;
                    boolean z2 = zyc0Var.e;
                    d7x.j(null, z && !z2, z2 ? R.drawable.ic_glyph_promocode_active : R.drawable.ic_glyph_promo_aggregator, vyc0Var, function0, null, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 5:
                azc0 azc0Var = (azc0) obj5;
                wyc0 wyc0Var = (wyc0) obj4;
                Function0 function1 = (Function0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z3 = azc0Var.f;
                    boolean z4 = azc0Var.e;
                    g7x.i(null, z3 && !z4, z4 ? R.drawable.ic_glyph_promocode_active : R.drawable.ic_glyph_promo_aggregator, wyc0Var, function1, null, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                m7x.i((mm40) obj5, (lzc0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                e9x.w((mm40) obj5, (r5d0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zvw.m((epd0) obj5, (tnd0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                fww.i((mm40) obj5, (rqm) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                wb.o((String) obj5, (String) obj4, (oud0) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                n7x.i((mm40) obj5, (o1e0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                n7x.j((mm40) obj5, (e2e0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                Function1 function2 = (Function1) obj3;
                p8e0 p8e0Var = (p8e0) obj5;
                pz40 pz40Var = (pz40) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG = fetVar3.g(function2);
                    Object objP = fetVar3.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new jg2(pz40Var, function2, (byte) 23);
                        fetVar3.o0(objP);
                    }
                    Function1 function3 = (Function1) objP;
                    boolean zI = fetVar3.i(p8e0Var);
                    Object objP2 = fetVar3.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new oac0(p8e0Var, pz40Var, (byte) 20);
                        fetVar3.o0(objP2);
                    }
                    dwi0.b(function3, null, (Function1) objP2, fetVar3, 0, 2);
                } else {
                    fetVar3.X();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                q0x.w((mm40) obj5, (ng8) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                x0x.n((mm40) obj5, (hh8) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                q7x.l((mm40) obj5, (d8f0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                r7x.i((mm40) obj5, (l7m0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                mm40 mm40Var = (mm40) obj5;
                Fragment fragment = (Fragment) obj4;
                RelatedParams relatedParams = (RelatedParams) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    cge0.b(mm40Var, fragment, relatedParams, fetVar4);
                } else {
                    fetVar4.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                o2e.M((mm40) obj5, (def0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                l8x.H((mm40) obj5, (nuc0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                qjj.G((mm40) obj5, (hif0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                c9x.j((mm40) obj5, (a4x) obj4, (xcz) obj3, (fet) obj, x8x.L(65));
                break;
            case 23:
                ((Integer) obj2).getClass();
                t9x.t((mm40) obj5, (xcz) obj4, (i4) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                break;
            case 24:
                ((Integer) obj2).getClass();
                xdx.n((mm40) obj5, (Function2) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                fww.k((glg0) obj5, (Function2) obj4, (mm40) obj3, (fet) obj, x8x.L(385));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jie0 jie0Var = (jie0) obj5;
                sch0 sch0Var = (sch0) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = sch0Var.i(sch0Var.e(fFloatValue - jie0Var.f16571a));
                sch0 sch0Var2 = ((rch0) obj3).f30239a;
                jie0Var.f16571a += sch0Var.e(sch0Var.h(sch0Var2.d(sch0Var2.k, jI, 1)));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x4d0.T((mm40) obj5, (nmh0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                fww.m((mm40) obj5, (t0i0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                jiq0.Y((mm40) obj5, (u0i0) obj4, (Function0) obj3, (fet) obj, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rwc0(Object obj, Object obj2, Object obj3, byte b) {
        this.f31213a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rwc0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f31213a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rwc0(Function1 function1, p8e0 p8e0Var, pz40 pz40Var) {
        this.f31213a = (byte) 13;
        this.c = function1;
        this.d = p8e0Var;
        this.b = pz40Var;
    }
}
