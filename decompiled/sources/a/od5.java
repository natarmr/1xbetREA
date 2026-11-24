package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class od5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25061a;
    public ColorStateList b;

    public od5(View view) {
        view.getClass();
        this.f25061a = view;
    }

    public final void a(AttributeSet attributeSet, int i) {
        View view = this.f25061a;
        Context context = view.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.A, i, 0);
        Context context2 = view.getContext();
        context2.getClass();
        ColorStateList colorStateListM = ktt0.m(1, context2, typedArrayObtainStyledAttributes);
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if (layerDrawable != null) {
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            if (drawableFindDrawableByLayerId != null) {
                drawableFindDrawableByLayerId.setTintList(colorStateListM);
                layerDrawable.setDrawableByLayerId(R.id.background, drawableFindDrawableByLayerId);
            }
        } else {
            jmu0.j(view, colorStateListM);
        }
        this.b = colorStateListM;
        typedArrayObtainStyledAttributes.recycle();
    }
}
