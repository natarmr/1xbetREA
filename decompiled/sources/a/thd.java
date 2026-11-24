package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class thd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33955a;

    public /* synthetic */ thd(cp cpVar) {
        this.f33955a = (byte) 22;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        a240 a240Var;
        switch (this.f33955a) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((rb50) obj).getClass();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((k8z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), new hjm(xsm0.s(R.string.recommend_to_play, fetVar2), null, null, new m0x(R.drawable.ic_glyph_recommend, null, 6), null, null, false, null, null, false, null, null, 8182), kjm.f18392a, null, null, null, fetVar2, 384, 56);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((k8z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), new ijm(), kjm.f18392a, null, null, null, fetVar3, 384, 56);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                int iH = (int) (p4e.h(p4eVar.f26347a) * 0.5f);
                long j = p4eVar.f26347a;
                pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, Math.max(p4e.j(j), iH), 0, 11));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 15));
            case 4:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                vj30Var2.getClass();
                pj30Var2.getClass();
                long j2 = ((p4e) obj3).f26347a;
                pu90 pu90VarS2 = pj30Var2.S(p4e.b(j2, 0, p4e.i(j2) / 2, 0, 0, 13));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b, new y1(pu90VarS2, (byte) 16));
            case 5:
                vj30 vj30Var3 = (vj30) obj;
                pj30 pj30Var3 = (pj30) obj2;
                vj30Var3.getClass();
                pj30Var3.getClass();
                long j3 = ((p4e) obj3).f26347a;
                pu90 pu90VarS3 = pj30Var3.S(p4e.b(j3, 0, p4e.i(j3) / 2, 0, 0, 13));
                return vj30.x(vj30Var3, pu90VarS3.f27604a, pu90VarS3.b, new y1(pu90VarS3, (byte) 17));
            case 6:
                vj30 vj30Var4 = (vj30) obj;
                pj30 pj30Var4 = (pj30) obj2;
                vj30Var4.getClass();
                pj30Var4.getClass();
                long j4 = ((p4e) obj3).f26347a;
                pu90 pu90VarS4 = pj30Var4.S(p4e.b(j4, 0, p4e.i(j4) / 2, 0, 0, 13));
                return vj30.x(vj30Var4, pu90VarS4.f27604a, pu90VarS4.b, new y1(pu90VarS4, (byte) 18));
            case 7:
                vj30 vj30Var5 = (vj30) obj;
                pj30 pj30Var5 = (pj30) obj2;
                vj30Var5.getClass();
                pj30Var5.getClass();
                long j5 = ((p4e) obj3).f26347a;
                pu90 pu90VarS5 = pj30Var5.S(p4e.b(j5, 0, p4e.i(j5) / 2, 0, 0, 13));
                return vj30.x(vj30Var5, pu90VarS5.f27604a, pu90VarS5.b, new y1(pu90VarS5, (byte) 19));
            case 8:
                vj30 vj30Var6 = (vj30) obj;
                pj30 pj30Var6 = (pj30) obj2;
                vj30Var6.getClass();
                pj30Var6.getClass();
                long j6 = ((p4e) obj3).f26347a;
                pu90 pu90VarS6 = pj30Var6.S(p4e.b(j6, 0, p4e.i(j6) / 2, 0, 0, 13));
                return vj30.x(vj30Var6, pu90VarS6.f27604a, pu90VarS6.b, new y1(pu90VarS6, (byte) 20));
            case 9:
                vj30 vj30Var7 = (vj30) obj;
                pj30 pj30Var7 = (pj30) obj2;
                vj30Var7.getClass();
                pj30Var7.getClass();
                pu90 pu90VarS7 = pj30Var7.S(((p4e) obj3).f26347a);
                return vj30.x(vj30Var7, pu90VarS7.f27604a, pu90VarS7.b, new n7(pu90VarS7, vj30Var7.T(2.0f), (byte) 10));
            case 10:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                qud qudVar = bej.i2;
                return Unit.f46060a;
            case 11:
                vj30 vj30Var8 = (vj30) obj;
                pj30 pj30Var8 = (pj30) obj2;
                p4e p4eVar2 = (p4e) obj3;
                vj30Var8.getClass();
                pj30Var8.getClass();
                float fR0 = vj30Var8.r0(p4e.i(p4eVar2.f26347a));
                zcl zclVar3 = qmk.f28987a;
                float f = ((fR0 - 16.0f) / 2.0f) + 12.0f + 48.0f;
                pu90 pu90VarS8 = pj30Var8.S(p4e.b(p4eVar2.f26347a, 0, 0, vj30Var8.T(f), vj30Var8.T(f), 3));
                return vj30.x(vj30Var8, pu90VarS8.f27604a, pu90VarS8.b, new y1(pu90VarS8, (byte) 22));
            case 12:
                vj30 vj30Var9 = (vj30) obj;
                pj30 pj30Var9 = (pj30) obj2;
                p4e p4eVar3 = (p4e) obj3;
                vj30Var9.getClass();
                pj30Var9.getClass();
                float fR1 = vj30Var9.r0(p4e.i(p4eVar3.f26347a));
                zcl zclVar4 = qmk.f28987a;
                float fZ = rw2.z(fR1, 16.0f, 2.0f, 16.0f);
                pu90 pu90VarS9 = pj30Var9.S(p4e.b(p4eVar3.f26347a, 0, 0, vj30Var9.T(fZ), vj30Var9.T(fZ), 3));
                return vj30.x(vj30Var9, pu90VarS9.f27604a, pu90VarS9.b, new y1(pu90VarS9, (byte) 23));
            case 13:
                vj30 vj30Var10 = (vj30) obj;
                pj30 pj30Var10 = (pj30) obj2;
                p4e p4eVar4 = (p4e) obj3;
                vj30Var10.getClass();
                pj30Var10.getClass();
                float fR2 = vj30Var10.r0(p4e.i(p4eVar4.f26347a));
                zcl zclVar5 = qmk.f28987a;
                float f2 = ((fR2 - 8.0f) / 2.0f) + 4.0f + 48.0f;
                pu90 pu90VarS10 = pj30Var10.S(p4e.b(p4eVar4.f26347a, 0, 0, vj30Var10.T(f2), vj30Var10.T(f2), 3));
                return vj30.x(vj30Var10, pu90VarS10.f27604a, pu90VarS10.b, new y1(pu90VarS10, (byte) 24));
            case 14:
                vj30 vj30Var11 = (vj30) obj;
                pj30 pj30Var11 = (pj30) obj2;
                p4e p4eVar5 = (p4e) obj3;
                vj30Var11.getClass();
                pj30Var11.getClass();
                float fR3 = vj30Var11.r0(p4e.i(p4eVar5.f26347a));
                zcl zclVar6 = qmk.f28987a;
                float f3 = ((fR3 - 8.0f) / 2.0f) + 12.0f + 40.0f;
                pu90 pu90VarS11 = pj30Var11.S(p4e.b(p4eVar5.f26347a, 0, 0, vj30Var11.T(f3), vj30Var11.T(f3), 3));
                return vj30.x(vj30Var11, pu90VarS11.f27604a, pu90VarS11.b, new y1(pu90VarS11, (byte) 25));
            case 15:
                vj30 vj30Var12 = (vj30) obj;
                pj30 pj30Var12 = (pj30) obj2;
                p4e p4eVar6 = (p4e) obj3;
                vj30Var12.getClass();
                pj30Var12.getClass();
                float fR4 = vj30Var12.r0(p4e.i(p4eVar6.f26347a));
                zcl zclVar7 = qmk.f28987a;
                float f4 = (((fR4 - 48.0f) - 4.0f) / 2.0f) + 4.0f;
                pu90 pu90VarS12 = pj30Var12.S(p4e.b(p4eVar6.f26347a, 0, 0, vj30Var12.T(f4), vj30Var12.T(f4), 3));
                return vj30.x(vj30Var12, pu90VarS12.f27604a, pu90VarS12.b, new y1(pu90VarS12, (byte) 26));
            case 16:
                vj30 vj30Var13 = (vj30) obj;
                pj30 pj30Var13 = (pj30) obj2;
                p4e p4eVar7 = (p4e) obj3;
                vj30Var13.getClass();
                pj30Var13.getClass();
                float fR5 = vj30Var13.r0(p4e.i(p4eVar7.f26347a));
                zcl zclVar8 = qmk.f28987a;
                float f5 = (((fR5 - 68.0f) - 4.0f) / 2.0f) + 4.0f;
                pu90 pu90VarS13 = pj30Var13.S(p4e.b(p4eVar7.f26347a, 0, 0, vj30Var13.T(f5), vj30Var13.T(f5), 3));
                return vj30.x(vj30Var13, pu90VarS13.f27604a, pu90VarS13.b, new y1(pu90VarS13, (byte) 27));
            case 17:
                vj30 vj30Var14 = (vj30) obj;
                pj30 pj30Var14 = (pj30) obj2;
                p4e p4eVar8 = (p4e) obj3;
                vj30Var14.getClass();
                pj30Var14.getClass();
                float fR6 = vj30Var14.r0(p4e.i(p4eVar8.f26347a));
                zcl zclVar9 = qmk.f28987a;
                float fZ2 = rw2.z(fR6, 4.0f, 2.0f, 4.0f);
                pu90 pu90VarS14 = pj30Var14.S(p4e.b(p4eVar8.f26347a, 0, 0, vj30Var14.T(fZ2), vj30Var14.T(fZ2), 3));
                return vj30.x(vj30Var14, pu90VarS14.f27604a, pu90VarS14.b, new y1(pu90VarS14, (byte) 28));
            case 18:
                vj30 vj30Var15 = (vj30) obj;
                pj30 pj30Var15 = (pj30) obj2;
                vj30Var15.getClass();
                pj30Var15.getClass();
                pu90 pu90VarS15 = pj30Var15.S(((p4e) obj3).f26347a);
                return vj30.x(vj30Var15, pu90VarS15.f27604a, pu90VarS15.b, new n7(pu90VarS15, vj30Var15.T(3.0f), (byte) 12));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                layoutInflater.getClass();
                viewGroup.getClass();
                View viewInflate = layoutInflater.inflate(R.layout.synthetic_card_football_item, viewGroup, false);
                if (zBooleanValue) {
                    viewGroup.addView(viewInflate);
                }
                if (viewInflate == null) {
                    hny.u("rootView");
                    return null;
                }
                CardFootballView cardFootballView = (CardFootballView) viewInflate;
                y0o0 y0o0Var = new y0o0(cardFootballView, cardFootballView);
                cardFootballView.setLayoutDirection(0);
                return y0o0Var;
            case 20:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                layoutInflater2.getClass();
                viewGroup2.getClass();
                View viewInflate2 = layoutInflater2.inflate(R.layout.synthetic_darts_live_item, viewGroup2, false);
                if (zBooleanValue2) {
                    viewGroup2.addView(viewInflate2);
                }
                if (viewInflate2 == null) {
                    hny.u("rootView");
                    return null;
                }
                DartsLiveView dartsLiveView = (DartsLiveView) viewInflate2;
                h1o0 h1o0Var = new h1o0(dartsLiveView, dartsLiveView);
                dartsLiveView.setLayoutDirection(0);
                return h1o0Var;
            case 21:
                vj30 vj30Var16 = (vj30) obj;
                pj30 pj30Var16 = (pj30) obj2;
                vj30Var16.getClass();
                pj30Var16.getClass();
                pu90 pu90VarS16 = pj30Var16.S(((p4e) obj3).f26347a);
                int iT = pu90VarS16.b - vj30Var16.T(32.0f);
                return vj30.x(vj30Var16, pu90VarS16.f27604a, iT >= 0 ? iT : 0, new cam(pu90VarS16, (byte) 5));
            case 22:
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                ((View) obj).getClass();
                return Unit.f46060a;
            case 23:
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                ((tcz) obj).getClass();
                return Integer.valueOf(l1e0.d(iIntValue5, iIntValue4 - 1, iIntValue4 + 1));
            case 24:
                int iIntValue6 = ((Integer) obj2).intValue();
                int iIntValue7 = ((Integer) obj3).intValue();
                ((tcz) obj).getClass();
                return Integer.valueOf(l1e0.d(iIntValue7, iIntValue6 - 1, iIntValue6 + 1));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                p6t0 p6t0Var = (p6t0) obj;
                ((Integer) obj3).getClass();
                p6t0Var.getClass();
                ((List) obj2).getClass();
                return Boolean.valueOf((p6t0Var instanceof cax) && ((cax) p6t0Var).d == l9x.COMPACT_CARDS);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                p6t0 p6t0Var2 = (p6t0) obj;
                ((Integer) obj3).getClass();
                p6t0Var2.getClass();
                ((List) obj2).getClass();
                return Boolean.valueOf((p6t0Var2 instanceof cax) && ((cax) p6t0Var2).d == l9x.PLAIN_LIST_ITEMS);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p6t0 p6t0Var3 = (p6t0) obj;
                ((Integer) obj3).intValue();
                p6t0Var3.getClass();
                ((List) obj2).getClass();
                a240Var = p6t0Var3 instanceof a240 ? (a240) p6t0Var3 : null;
                return Boolean.valueOf((a240Var != null ? a240Var.g : 0) > 0);
            default:
                p6t0 p6t0Var4 = (p6t0) obj;
                ((Integer) obj3).intValue();
                p6t0Var4.getClass();
                ((List) obj2).getClass();
                a240Var = p6t0Var4 instanceof a240 ? (a240) p6t0Var4 : null;
                return Boolean.valueOf(a240Var != null && a240Var.g == 0);
        }
    }

    public /* synthetic */ thd(byte b) {
        this.f33955a = b;
    }
}
