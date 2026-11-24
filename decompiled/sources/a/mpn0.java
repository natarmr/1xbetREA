package a;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class mpn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ npn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mpn0(npn0 npn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = npn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        npn0 npn0Var = this.k;
        switch (b) {
            case 0:
                mpn0 mpn0Var = new mpn0(npn0Var, yjeVar, (byte) 0);
                mpn0Var.j = obj;
                return mpn0Var;
            default:
                mpn0 mpn0Var2 = new mpn0(npn0Var, yjeVar, (byte) 1);
                mpn0Var2.j = obj;
                return mpn0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mpn0) create((rpn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mpn0) create((qpn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        npn0 npn0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                rpn0 rpn0Var = (rpn0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                lj60 lj60VarT0 = npn0Var.T0();
                ViewPager2 viewPager2 = lj60VarT0.e;
                BottomSheetBehavior bottomSheetBehaviorM0 = npn0Var.M0();
                if (bottomSheetBehaviorM0 != null) {
                    bottomSheetBehaviorM0.l = (int) (npn0Var.G().getDisplayMetrics().widthPixels * rpn0Var.g);
                }
                npn0Var.g2.A(rpn0Var.b);
                viewPager2.setOffscreenPageLimit(Math.max(1, rpn0Var.b.size()));
                viewPager2.e(rpn0Var.d, false);
                DsButton dsButton = lj60VarT0.b;
                String strH = npn0Var.H(rpn0Var.f30895a);
                strH.getClass();
                dsButton.l(strH);
                lj60VarT0.c.setVisibility(rpn0Var.c ? 0 : 8);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d((qpn0) obj2, qpn0.f29129a)) {
                    npn0Var.y0();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
