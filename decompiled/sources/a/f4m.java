package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f4m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8921a;

    public /* synthetic */ f4m(b4m b4mVar, int i) {
        this.f8921a = (byte) 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8921a) {
            case 0:
                ((Integer) obj2).getClass();
                jeb.x(null, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return vjd.a(layoutInflater, viewGroup);
            case 2:
                ((Integer) obj2).getClass();
                gkb.M(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                n6m.i(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                fxb.y(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                dyb.I(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                e8m e8mVar = (e8m) obj2;
                e8mVar.getClass();
                long j = e8mVar.f7380a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(iIntValue);
                return sb.toString();
            case 7:
                ((Integer) obj2).getClass();
                aac.m(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                ((Integer) obj).intValue();
                y8m y8mVar = (y8m) obj2;
                y8mVar.getClass();
                return Integer.valueOf(y8mVar.f42203a);
            case 9:
                ((Integer) obj2).getClass();
                sac.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                y8m y8mVar2 = (y8m) obj2;
                y8mVar2.getClass();
                int i = y8mVar2.f42203a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(iIntValue2);
                return sb2.toString();
            case 11:
                ((Integer) obj2).getClass();
                o9m.e(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                lgb.F(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                Integer num = (Integer) obj;
                num.intValue();
                ghm ghmVar = (ghm) obj2;
                ghmVar.getClass();
                if (ghmVar instanceof dhm) {
                    return Long.valueOf(((dhm) ghmVar).f6097a);
                }
                if (ghmVar instanceof ehm) {
                    return ((ehm) ghmVar).f7814a;
                }
                if (ghmVar instanceof fhm) {
                    return num;
                }
                t9f.b();
                return null;
            case 14:
                ((Integer) obj2).getClass();
                qcc.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ((x8z) obj).getClass();
                ((m9n) obj2).getClass();
                return new pgv(q8x.e(1));
            case 16:
                ((Integer) obj2).getClass();
                vzb.k(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                wzb.u(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                u1c.k(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                e3c.j(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                ((Integer) obj).intValue();
                wbn wbnVar = (wbn) obj2;
                nek nekVar = vbn.n2;
                wbnVar.getClass();
                return Long.valueOf(wbnVar.f38887a);
            case 21:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new aim((byte) 28));
                function2.invoke(new dcn((byte) 3));
                return Unit.f46060a;
            case 22:
                ((Integer) obj).intValue();
                qln qlnVar = (qln) obj2;
                qlnVar.getClass();
                return Long.valueOf(qlnVar.f28943a);
            case 23:
                ((Integer) obj2).getClass();
                hmw0.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                inn innVar = (inn) obj2;
                ((oyg0) obj).getClass();
                innVar.getClass();
                return inn.a(innVar, null, false, null, xln.f41082a, null, null, false, false, null, 0L, false, 32703);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                return zvx.a(layoutInflater2, viewGroup2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup3.getClass();
                return dux.a(layoutInflater3, viewGroup3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new mmn((byte) 7));
                function4.invoke(new urn((byte) 4));
                return Unit.f46060a;
            default:
                u7o0 u7o0Var = (u7o0) obj;
                ieh0 ieh0Var = (ieh0) obj2;
                u7o0Var.getClass();
                SeaBattleView seaBattleView = u7o0Var.j;
                SeaBattleView seaBattleView2 = u7o0Var.i;
                ieh0Var.getClass();
                if (ieh0Var instanceof tdh0) {
                    u7o0Var.d.setText(((tdh0) ieh0Var).f33769a);
                } else if (ieh0Var instanceof ydh0) {
                    u7o0Var.f.setText(((ydh0) ieh0Var).f42438a);
                } else if (ieh0Var instanceof feh0) {
                    u7o0Var.h.setText(((feh0) ieh0Var).f9407a);
                } else if (ieh0Var instanceof xdh0) {
                    agc.O(u7o0Var, ((xdh0) ieh0Var).f40692a);
                } else if (ieh0Var instanceof eeh0) {
                    agc.P(u7o0Var, ((eeh0) ieh0Var).f7675a);
                } else if (ieh0Var instanceof udh0) {
                    agc.Q(seaBattleView2, ((udh0) ieh0Var).f35478a);
                } else if (ieh0Var instanceof beh0) {
                    agc.Q(seaBattleView, ((beh0) ieh0Var).f2451a);
                } else if (ieh0Var instanceof aeh0) {
                    seaBattleView2.setShotUiModelList(((aeh0) ieh0Var).f729a);
                } else if (ieh0Var instanceof heh0) {
                    seaBattleView.setShotUiModelList(((heh0) ieh0Var).f12924a);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ f4m(int i, byte b) {
        this.f8921a = b;
    }

    public /* synthetic */ f4m(byte b) {
        this.f8921a = b;
    }
}
