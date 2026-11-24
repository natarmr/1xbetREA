package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class twe implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34647a;
    public final /* synthetic */ axe b;

    public /* synthetic */ twe(axe axeVar, byte b) {
        this.f34647a = b;
        this.b = axeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34647a;
        byte b2 = 7;
        byte b3 = 2;
        byte b4 = 0;
        byte b5 = 1;
        yje yjeVar = null;
        axe axeVar = this.b;
        switch (b) {
            case 0:
                kud kudVar = axe.e2;
                axeVar.C().t0(i120.V(new Pair("PAYMENT_CLICK_REQUEST_KEY", Boolean.TRUE)), "PAYMENT_CLICK_REQUEST_KEY");
                r7f r7fVarM0 = axeVar.M0();
                v88.b(r7fVarM0.D0, r7fVarM0.V0, 0L, 4);
                return Unit.f46060a;
            case 1:
                kud kudVar2 = axe.e2;
                axeVar.M1.x(axeVar, axe.f2[1], "");
                return Unit.f46060a;
            case 2:
                kud kudVar3 = axe.e2;
                axeVar.M0().S(axeVar.M1.n(axeVar, axe.f2[1]));
                return Unit.f46060a;
            case 3:
                kud kudVar4 = axe.e2;
                r7f r7fVarM1 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM1), new z6e(1, r7fVarM1, r7f.class, "showLoginOrIgnore", "showLoginOrIgnore(Ljava/lang/Throwable;)V", 0, (byte) 26), null, r7fVarM1.Y0.b, new g5f(r7fVarM1, yjeVar, b4), 10);
                return Unit.f46060a;
            case 4:
                kud kudVar5 = axe.e2;
                r7f r7fVarM2 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM2), new vzd((byte) 22), null, r7fVarM2.Y0.b, new u6f(r7fVarM2, yjeVar, b5), 10);
                return Unit.f46060a;
            case 5:
                kud kudVar6 = axe.e2;
                r7f r7fVarM3 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM3), i6f.f14237a, null, r7fVarM3.Y0.b, new d5f(r7fVarM3, yjeVar, (byte) 3), 10);
                return Unit.f46060a;
            case 6:
                kud kudVar7 = axe.e2;
                axeVar.M0().q0(q4f.d.a(), true);
                return Unit.f46060a;
            case 7:
                fiu0 fiu0Var = axeVar.P1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                kud kudVar8 = axe.e2;
                return Integer.valueOf(axeVar.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height));
            case 9:
                kud kudVar9 = axe.e2;
                axe axeVar2 = this.b;
                Class<r7f> cls = r7f.class;
                int i = 0;
                return new tre(new xwe(5, axeVar2, axe.class, "clickCoupon", "clickCoupon(JJJJZ)V", 0), new z6e(1, axeVar2.M0(), r7f.class, "onCloseCouponEventClicked", "onCloseCouponEventClicked(J)V", 0, (byte) 19), new mhc(2, axeVar2, axe.class, "showBlockListWithSingleChoiceDialog", "showBlockListWithSingleChoiceDialog(IJ)V", 0, (byte) 10), new mhc(2, axeVar2.M0(), cls, "onCloseBlockCouponEventClicked", "onCloseBlockCouponEventClicked(IJ)V", i, (byte) 11), new z6e(1, axeVar2.M0(), r7f.class, "onCheckAuthForMakeBlockBet", "onCheckAuthForMakeBlockBet(I)V", 0, (byte) 20), new pw4(0, axeVar2.M0(), r7f.class, "onClickExpressBoostInfo", "onClickExpressBoostInfo()V", 0, (byte) 24), new mhc(2, axeVar2.M0(), cls, "onClickBetOnFavoriteEvent", "onClickBetOnFavoriteEvent(IJ)V", i, (byte) 12), new pw4(0, axeVar2.M0(), r7f.class, "onClickBetOnFavoriteExpand", "onClickBetOnFavoriteExpand()V", 0, (byte) 25), new pw4(0, axeVar2.M0(), r7f.class, "onClickCloseExpressBoost", "onClickCloseExpressBoost()V", 0, (byte) 26), new pw4(0, axeVar2, axe.class, "showAutoSubInfoSnackBar", "showAutoSubInfoSnackBar()V", 0, (byte) 20), new z6e(1, axeVar2.M0(), r7f.class, "onClickOptionBet", "onClickOptionBet(J)V", 0, (byte) 18), new pw4(0, axeVar2.M0(), r7f.class, "onClickEachWay", "onClickEachWay()V", 0, (byte) 21), new pw4(0, axeVar2.M0(), r7f.class, "onRemoveCouponClicked", "onRemoveCouponClicked()V", 0, (byte) 22), new uwe(axeVar2, (byte) 6), new uwe(axeVar2, (byte) 7), new pw4(0, axeVar2.M0(), r7f.class, "onItemMoving", "onItemMoving()V", 0, (byte) 23), new cnc(axeVar2, (byte) 18));
            case 10:
                kud kudVar10 = axe.e2;
                return new gw5(axeVar, b3);
            case 11:
                kud kudVar11 = axe.e2;
                axeVar.G0();
                r7f r7fVarM4 = axeVar.M0();
                r7fVarM4.J0.f809a.c("bet_place_settings");
                r7fVarM4.L0.f40143a.a(xun.f41520a, 3174L);
                r7fVarM4.V0.d(new t4f(r7fVarM4, b2));
                return Unit.f46060a;
            case 12:
                kud kudVar12 = axe.e2;
                axeVar.G0();
                axeVar.M0().R(m3f.f21112a);
                return Unit.f46060a;
            case 13:
                kud kudVar13 = axe.e2;
                axeVar.G0();
                r7f r7fVarM5 = axeVar.M0();
                r7fVarM5.I0.f29324a.c("coupon_point_call");
                r7fVarM5.K0.f40143a.a(xun.f41520a, 3213L);
                r7fVarM5.R(new k3f(r7fVarM5.N().b, r7fVarM5.N().d, r7fVarM5.U1, r7fVarM5.N().h));
                return Unit.f46060a;
            case 14:
                kud kudVar14 = axe.e2;
                r7f r7fVarM6 = axeVar.M0();
                r7fVarM6.h0(false, false, new yld((byte) 27));
                r7fVarM6.X();
                return Unit.f46060a;
            case 15:
                kud kudVar15 = axe.e2;
                axeVar.C().t0(i120.V(new Pair("CHANGE_BALANCE_CLICK_REQUEST_KEY", Boolean.TRUE)), "CHANGE_BALANCE_CLICK_REQUEST_KEY");
                r7f r7fVarM7 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM7), new vzd((byte) 24), null, r7fVarM7.Y0.b, new u6f(r7fVarM7, yjeVar, b4), 10);
                return Unit.f46060a;
            default:
                kud kudVar16 = axe.e2;
                axeVar.G0();
                r7f r7fVarM8 = axeVar.M0();
                sac.V(jiu0.a(r7fVarM8), f6f.f9006a, null, r7fVarM8.Y0.b, new a6f(r7fVarM8, yjeVar, b3), 10);
                return Unit.f46060a;
        }
    }
}
