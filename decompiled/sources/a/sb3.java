package a;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.List;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31912a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb3(Object obj, Object obj2, byte b) {
        this.f31912a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f31912a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i = AppBarLayout.B;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ki30) obj).r(fFloatValue);
                Drawable drawable = appBarLayout.x;
                if (drawable instanceof ki30) {
                    ((ki30) drawable).r(fFloatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
                Iterator it2 = appBarLayout.s.iterator();
                if (it2.hasNext()) {
                    throw rw2.h(it2);
                }
                return;
            case 1:
                ((qb8) obj2).m = ((Float) w6x.m(valueAnimator)).floatValue();
                ((DominoHandView) obj).invalidate();
                return;
            case 2:
                hgk hgkVar = (hgk) obj2;
                u06 u06Var = (u06) obj;
                if (u06Var.b(true) && u06Var.m != 0 && hgkVar.isVisible()) {
                    hgkVar.invalidateSelf();
                    return;
                }
                return;
            case 3:
                wqm wqmVar = (wqm) obj2;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                valueAnimator.getClass();
                if (wqmVar.getCallback() != null) {
                    wqmVar.invalidateSelf();
                    return;
                } else {
                    valueAnimator2.cancel();
                    return;
                }
            case 4:
                KillerJokerView.d((ImageView) obj2, (KillerJokerView) obj, valueAnimator);
                return;
            case 5:
                List list = (List) obj;
                int i2 = LuckyWheelView.x;
                Float f = (Float) w6x.m(valueAnimator);
                float fFloatValue2 = f.floatValue();
                am10 am10Var = ((LuckyWheelView) obj2).u;
                if (am10Var != null) {
                    am10Var.invoke(f);
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((View) it3.next()).setRotation(fFloatValue2);
                }
                return;
            default:
                ((View) ((qhv0) ((owp0) obj2).b).d.getParent()).invalidate();
                return;
        }
    }
}
