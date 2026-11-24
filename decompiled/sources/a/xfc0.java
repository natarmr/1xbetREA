package a;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class xfc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yfc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfc0(yfc0 yfc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yfc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yfc0 yfc0Var = this.k;
        switch (b) {
            case 0:
                xfc0 xfc0Var = new xfc0(yfc0Var, yjeVar, (byte) 0);
                xfc0Var.j = obj;
                return xfc0Var;
            default:
                xfc0 xfc0Var2 = new xfc0(yfc0Var, yjeVar, (byte) 1);
                xfc0Var2.j = obj;
                return xfc0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xfc0) create((chc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xfc0) create((xgc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yfc0 yfc0Var = this.k;
        switch (b) {
            case 0:
                a8z a8zVar = yfc0Var.j2;
                chc0 chc0Var = (chc0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(chc0Var, ygc0.f42577a)) {
                    yfc0Var.Q0().c.setVisibility(0);
                    yfc0Var.Q0().d.setVisibility(8);
                    String strH = yfc0Var.H(R.string.select_promo_code_title);
                    strH.getClass();
                    yfc0Var.I0(new kp8(strH, R.style.TextStyle_Title_Bold_M));
                    yfc0Var.Q0().b.setVisibility(8);
                } else if (Intrinsics.d(chc0Var, ahc0.f868a)) {
                    yfc0Var.Q0().c.setVisibility(8);
                    yfc0Var.Q0().d.setVisibility(8);
                    yfc0Var.Q0().b.setVisibility(0);
                } else if (chc0Var instanceof bhc0) {
                    yfc0Var.Q0().d.setVisibility(0);
                    yfc0Var.Q0().c.setVisibility(8);
                    yfc0Var.Q0().b.setVisibility(8);
                    String strH2 = yfc0Var.H(R.string.select_promo_code_title);
                    strH2.getClass();
                    yfc0Var.I0(new kp8(strH2, R.style.TextStyle_Title_Bold_M));
                    ((tfc0) a8zVar.getValue()).f = ((bhc0) chc0Var).f2599a;
                    ((tfc0) a8zVar.getValue()).g();
                    BottomSheetBehavior bottomSheetBehavior = yfc0Var.c2;
                    if (bottomSheetBehavior != null && bottomSheetBehavior.P == 4) {
                        bottomSheetBehavior.N(3);
                    }
                }
                return Unit.f46060a;
            default:
                xgc0 xgc0Var = (xgc0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (xgc0Var == null) {
                    t9f.b();
                    return null;
                }
                phf0 phf0Var = yfc0Var.k2;
                PromoCodeInfoUiModel promoCodeInfoUiModel = xgc0Var.f40831a;
                xi70 xi70Var = yfc0.l2;
                iiy[] iiyVarArr = yfc0.m2;
                vcc.f0(i120.V(new Pair(phf0Var.n(yfc0Var, iiyVarArr[1]), promoCodeInfoUiModel)), yfc0Var, phf0Var.n(yfc0Var, iiyVarArr[1]));
                yfc0Var.x0();
                return Unit.f46060a;
        }
    }
}
