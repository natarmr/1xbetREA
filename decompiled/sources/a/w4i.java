package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w4i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38543a;
    public final /* synthetic */ org.xplatform.uikit.components.text_field.end.b b;

    public /* synthetic */ w4i(org.xplatform.uikit.components.text_field.end.b bVar, byte b) {
        this.f38543a = b;
        this.b = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f38543a;
        org.xplatform.uikit.components.text_field.end.b bVar = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                bVar.h = ((Float) objM).floatValue();
                bVar.invalidate();
                break;
            default:
                bVar.h = ((Float) objM).floatValue();
                bVar.invalidate();
                break;
        }
    }
}
