package a;

import android.animation.ValueAnimator;
import org.xplatform.crystal.presentation.views.CrystalFieldView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uef implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35525a;
    public final /* synthetic */ sef b;

    public /* synthetic */ uef(sef sefVar, byte b) {
        this.f35525a = b;
        this.b = sefVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f35525a;
        sef sefVar = this.b;
        switch (b) {
            case 0:
                int i = CrystalFieldView.j;
                sefVar.setTranslationY(((Float) w6x.m(valueAnimator)).floatValue());
                break;
            default:
                int i2 = CrystalFieldView.j;
                sefVar.setTranslationY(((Float) w6x.m(valueAnimator)).floatValue());
                break;
        }
    }
}
