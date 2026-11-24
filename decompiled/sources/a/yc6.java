package a;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yc6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42371a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yc6(cp cpVar, int i, int i2, ao6 ao6Var, bo6 bo6Var) {
        this.d = cpVar;
        this.b = i;
        this.c = i2;
        this.e = ao6Var;
        this.f = bo6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42371a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj4;
                ao6 ao6Var = (ao6) obj3;
                bo6 bo6Var = (bo6) obj2;
                ((List) obj).getClass();
                View view = cpVar.f40887a;
                yfu0 yfu0Var = cpVar.u;
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.space_4);
                int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.space_2);
                int dimensionPixelSize3 = view.getContext().getResources().getDimensionPixelSize(R.dimen.space_42);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3);
                layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                for (BetZip betZip : ((ah) cpVar.u()).f850a.b) {
                    Context context = view.getContext();
                    context.getClass();
                    ad6 ad6Var = new ad6(context);
                    long j = betZip.f46426a;
                    Context context2 = view.getContext();
                    context2.getClass();
                    if (j == 4558 || j == 4566 || j == 7199 || j == 7201) {
                        String string = context2.getString(R.string.yes);
                        string.getClass();
                        ad6Var.setExtra(string);
                    } else if (j == 4559 || j == 4567 || j == 7200 || j == 7202) {
                        String string2 = context2.getString(R.string.no);
                        string2.getClass();
                        ad6Var.setExtra(string2);
                    }
                    ad6Var.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view.getContext(), R.animator.selectable_state_list_animator));
                    pn40 pn40Var = pn40.f27267a;
                    String strC = pn40.c(betZip.d, p3u0.c);
                    long j2 = betZip.f46426a;
                    ad6Var.setTitle(strC.concat((j2 == 4564 || j2 == 4556 || (7199 <= j2 && j2 < 7203)) ? "+" : ""));
                    dyb.b0(ad6Var, ymx.INTERVAL_500, new zc6((byte) 0, this.b, this.c, cpVar, betZip, ao6Var, bo6Var));
                    Drawable drawableU = epv0.U(R.drawable.selectable_white_circle, view.getContext());
                    if (drawableU != null) {
                        Context context3 = ((nlr) yfu0Var).d.getContext();
                        context3.getClass();
                        sj3.B0(drawableU, context3, R.attr.uikitBackgroundContent);
                    }
                    ad6Var.setBackground(drawableU);
                    nlr nlrVar = (nlr) yfu0Var;
                    nlrVar.c.addView(ad6Var, layoutParams);
                    nlrVar.c.getChildAt(((ah) cpVar.u()).e).callOnClick();
                }
                break;
            case 1:
                pu90[] pu90VarArr = (pu90[]) obj4;
                thg0 thg0Var = (thg0) obj3;
                int[] iArr = (int[]) obj2;
                ou90 ou90Var = (ou90) obj;
                int length = pu90VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    pu90 pu90Var = pu90VarArr[i];
                    int i3 = i2 + 1;
                    pu90Var.getClass();
                    Object objN = pu90Var.n();
                    mhg0 mhg0Var = objN instanceof mhg0 ? (mhg0) objN : null;
                    wvb wvbVar = mhg0Var != null ? mhg0Var.c : null;
                    int i4 = this.b;
                    ou90Var.g(pu90Var, iArr[i2], wvbVar != null ? wvbVar.K(i4, pu90Var.b, k6z.f17794a, pu90Var, this.c) : thg0Var.b.a(pu90Var.b, i4), 0.0f);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                pu90 pu90Var2 = (pu90) obj3;
                ou90.j((ou90) obj, pu90Var2, ((ikx) ((wqv0) obj4).q.invoke(new qkx((((long) (this.b - pu90Var2.f27604a)) << 32) | (((long) (this.c - pu90Var2.b)) & 4294967295L)), ((vj30) obj2).getLayoutDirection())).f14950a);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yc6(wqv0 wqv0Var, int i, pu90 pu90Var, int i2, vj30 vj30Var) {
        this.d = wqv0Var;
        this.b = i;
        this.e = pu90Var;
        this.c = i2;
        this.f = vj30Var;
    }

    public /* synthetic */ yc6(pu90[] pu90VarArr, thg0 thg0Var, int i, int i2, int[] iArr) {
        this.d = pu90VarArr;
        this.e = thg0Var;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }
}
