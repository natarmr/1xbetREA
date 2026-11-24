package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class shq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32227a;

    public /* synthetic */ shq0(byte b) {
        this.f32227a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32227a;
        j1r0 j1r0VarJ = i1r0.f14014a;
        byte b2 = 13;
        byte b3 = 0;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                chq0 chq0Var = (chq0) obj2;
                chq0Var.getClass();
                return Integer.valueOf(chq0Var.getId());
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                cjx.u(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_card_timer, viewGroup, false);
                int i = R.id.tvMatchScore;
                TextView textView = (TextView) yum0.f(viewF, R.id.tvMatchScore);
                if (textView != null) {
                    i = R.id.tvTeams;
                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tvTeams);
                    if (textView2 != null) {
                        i = R.id.tvTimeLeft;
                        TextView textView3 = (TextView) yum0.f(viewF, R.id.tvTimeLeft);
                        if (textView3 != null) {
                            return new ysx((LinearLayout) viewF, textView, textView2, textView3);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 6:
                ((Integer) obj2).getClass();
                ahy.T(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_title_test, viewGroup2, false);
                int i2 = R.id.cmTitle;
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF2, R.id.cmTitle);
                if (dsCellMiddleTitle != null) {
                    i2 = R.id.separator;
                    if (((DsSeparator) yum0.f(viewF2, R.id.separator)) != null) {
                        return new oyx((DsSettingsCell) viewF2, dsCellMiddleTitle);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 8:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_title_header_menu_item, viewGroup3, false);
                if (viewF3 != null) {
                    DsHeader dsHeader = (DsHeader) viewF3;
                    return new nyx(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case 9:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_title, viewGroup4, false);
                if (viewF4 != null) {
                    return new cck((TextView) viewF4, (byte) 1);
                }
                hny.u("rootView");
                return null;
            case 10:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup5.getClass();
                return jsx.a(layoutInflater, viewGroup5);
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                oyq0 oyq0Var = (oyq0) obj2;
                return q3d.j(Float.valueOf(oyq0Var.f26070a), Float.valueOf(oyq0Var.c.l()), Float.valueOf(oyq0Var.b.l()));
            case 13:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-1666749508);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 14:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new t6q0((byte) 25));
                function2.invoke(new joq0((byte) 12));
                return Unit.f46060a;
            case 15:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(d7r0.f5608a);
                function4.invoke(new joq0((byte) 15));
                return Unit.f46060a;
            case 16:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(24.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / 2.0f)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                long background = s6t0.b().f33626a.getBackground();
                long jD = fhlVar.d();
                float fW1 = fhlVar.w0(8.0f);
                fhl.o0(fhlVar, background, 0L, jD, (((long) Float.floatToRawIntBits(fW1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fW1)) << 32), null, 242);
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).A(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                    nu90Var.f24139a.e(fhlVar, jFloatToRawIntBits, nu90Var.b, new m78(s6t0.b().f33626a.getSecondary40(), 5));
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            case 17:
                ((Integer) obj).getClass();
                ear0 ear0Var = (ear0) obj2;
                String str = y9r0.m2;
                ear0Var.getClass();
                return ear0Var.b;
            case 18:
                ((Integer) obj2).getClass();
                dqm0.b(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ju70.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                ((Integer) obj).getClass();
                a2n a2nVar = (a2n) obj2;
                a2nVar.getClass();
                if (a2nVar instanceof q56) {
                    return Long.valueOf(((q56) a2nVar).a());
                }
                if (a2nVar instanceof w56) {
                    return Long.valueOf(((w56) a2nVar).a());
                }
                if (a2nVar instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar).a());
                }
                return a2nVar instanceof b2o0 ? Long.valueOf(((b2o0) a2nVar).a()) : Integer.valueOf(a2nVar.hashCode());
            case 23:
                ((Integer) obj2).getClass();
                gq80.Y(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                qsm0.m(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new t9r0((byte) 16));
                function6.invoke(new dfr0((byte) 2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ser0 ser0Var = (ser0) obj2;
                ((oyg0) obj).getClass();
                ser0Var.getClass();
                ler0 ler0Var = ser0Var.b;
                List list = ser0Var.f32087a;
                ler0 ler0VarB = ler0.b(ler0Var, list.contains(ler0Var.f19918a) ? xcm0.j(ler0Var) : j1r0VarJ, null, 5);
                zyq0 zyq0Var = ser0Var.c;
                zyq0 zyq0VarB = zyq0.b(zyq0Var, list.contains(zyq0Var.f45218a) ? xcm0.j(zyq0Var) : j1r0VarJ, null, 5);
                u8r0 u8r0Var = ser0Var.d;
                u8r0 u8r0VarB = u8r0.b(u8r0Var, list.contains(u8r0Var.f35245a) ? xcm0.j(u8r0Var) : j1r0VarJ, null, 5);
                c4r0 c4r0Var = ser0Var.e;
                c4r0 c4r0VarB = c4r0.b(c4r0Var, list.contains(c4r0Var.f3740a) ? xcm0.j(c4r0Var) : j1r0VarJ, null, 5);
                qer0 qer0Var = ser0Var.f;
                qer0 qer0VarB = qer0.b(qer0Var, list.contains(qer0Var.f28597a) ? xcm0.j(qer0Var) : j1r0VarJ, null, 5);
                per0 per0Var = ser0Var.g;
                per0 per0VarB = per0.b(per0Var, list.contains(per0Var.f26867a) ? xcm0.j(per0Var) : j1r0VarJ, null, 5);
                her0 her0Var = ser0Var.h;
                her0 her0VarB = her0.b(her0Var, list.contains(her0Var.f12936a) ? xcm0.j(her0Var) : j1r0VarJ, null, null, 13);
                hyq0 hyq0Var = ser0Var.i;
                hyq0 hyq0VarB = hyq0.b(hyq0Var, list.contains(hyq0Var.f13871a) ? xcm0.j(hyq0Var) : j1r0VarJ, null, null, 13);
                zxq0 zxq0Var = ser0Var.j;
                zxq0 zxq0VarB = zxq0.b(zxq0Var, list.contains(zxq0Var.f45174a) ? xcm0.j(zxq0Var) : j1r0VarJ, null, 5);
                s8r0 s8r0Var = ser0Var.k;
                s8r0 s8r0VarB = s8r0.b(s8r0Var, list.contains(s8r0Var.f31816a) ? xcm0.j(s8r0Var) : j1r0VarJ, null, 5);
                t8r0 t8r0Var = ser0Var.l;
                t8r0 t8r0VarB = t8r0.b(t8r0Var, list.contains(t8r0Var.f33525a) ? xcm0.j(t8r0Var) : j1r0VarJ, null, 5);
                xxq0 xxq0Var = ser0Var.m;
                xxq0 xxq0VarB = xxq0.b(xxq0Var, list.contains(xxq0Var.f41671a) ? xcm0.j(xxq0Var) : j1r0VarJ, null, 5);
                iyq0 iyq0Var = ser0Var.n;
                iyq0 iyq0VarB = iyq0.b(iyq0Var, list.contains(iyq0Var.f15601a) ? xcm0.j(iyq0Var) : j1r0VarJ, null, 5);
                eyq0 eyq0Var = ser0Var.o;
                eyq0 eyq0VarB = eyq0.b(eyq0Var, list.contains(eyq0Var.f8640a) ? xcm0.j(eyq0Var) : j1r0VarJ, null, 5);
                pfr0 pfr0Var = ser0Var.p;
                pfr0 pfr0VarB = pfr0.b(pfr0Var, list.contains(pfr0Var.f26919a) ? xcm0.j(pfr0Var) : j1r0VarJ, null, null, 13);
                n2r0 n2r0Var = ser0Var.q;
                n2r0 n2r0VarB = n2r0.b(n2r0Var, list.contains(n2r0Var.f22817a) ? xcm0.j(n2r0Var) : j1r0VarJ, null, 5);
                b3r0 b3r0Var = ser0Var.r;
                b3r0 b3r0VarB = b3r0.b(b3r0Var, list.contains(b3r0Var.f1923a) ? xcm0.j(b3r0Var) : j1r0VarJ, null, 5);
                a3r0 a3r0Var = ser0Var.s;
                a3r0 a3r0VarB = a3r0.b(a3r0Var, list.contains(a3r0Var.f187a) ? xcm0.j(a3r0Var) : j1r0VarJ, null, 5);
                j2r0 j2r0Var = ser0Var.t;
                j2r0 j2r0VarB = j2r0.b(j2r0Var, list.contains(j2r0Var.f15796a) ? xcm0.j(j2r0Var) : j1r0VarJ, null, 5);
                h2r0 h2r0Var = ser0Var.u;
                if (list.contains(h2r0Var.f12349a)) {
                    j1r0VarJ = xcm0.j(h2r0Var);
                }
                return ser0.a(ser0Var, null, ler0VarB, zyq0VarB, u8r0VarB, c4r0VarB, qer0VarB, per0VarB, her0VarB, hyq0VarB, zxq0VarB, s8r0VarB, t8r0VarB, xxq0VarB, iyq0VarB, eyq0VarB, pfr0VarB, n2r0VarB, b3r0VarB, a3r0VarB, j2r0VarB, h2r0.b(h2r0Var, j1r0VarJ, null, 5), null, null, false, 14680065);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ser0 ser0Var2 = (ser0) obj2;
                ((oyg0) obj).getClass();
                ser0Var2.getClass();
                iun iunVar = iun.f15405a;
                return ser0.a(ser0Var2, null, new ler0(c2r0.f3639a, j1r0VarJ, iunVar), new zyq0(p1r0.f26218a, j1r0VarJ, iunVar), new u8r0(y1r0.f41872a, j1r0VarJ, iunVar), new c4r0(d2r0.f5371a, j1r0VarJ, iunVar), new qer0(b2r0.f1868a, j1r0VarJ, iunVar), new per0(a2r0.f138a, j1r0VarJ, iunVar), new her0(z1r0.f43635a, j1r0VarJ, iunVar, xun.f41520a), new hyq0(n1r0.f22766a, j1r0VarJ, iunVar, iunVar), new zxq0(l1r0.f19271a, j1r0VarJ, null), new s8r0(w1r0.f38415a, j1r0VarJ, iunVar), null, new xxq0(k1r0.f17542a, j1r0VarJ, iunVar), new iyq0(o1r0.f24496a, j1r0VarJ, iunVar), new eyq0(m1r0.f21023a, j1r0VarJ, null), new pfr0(e2r0.f7100a, j1r0VarJ, iunVar, iunVar), new n2r0(t1r0.f33181a, j1r0VarJ, iunVar), new b3r0(v1r0.f36646a, j1r0VarJ, iunVar), new a3r0(u1r0.f34913a, j1r0VarJ, iunVar), new j2r0(r1r0.f29696a, j1r0VarJ, iunVar), new h2r0(q1r0.f27968a, j1r0VarJ, iunVar), null, null, false, 14682113);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new t9r0(b2));
                function8.invoke(new joq0((byte) 28));
                return Unit.f46060a;
            default:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(lfr0.f19972a);
                function10.invoke(new dfr0(b3));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ shq0(int i, byte b) {
        this.f32227a = b;
    }
}
