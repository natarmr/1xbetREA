package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b7n implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2118a;
    public final /* synthetic */ DsTextField b;

    public /* synthetic */ b7n(DsTextField dsTextField, byte b) {
        this.f2118a = b;
        this.b = dsTextField;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        f5i f5iVar;
        byte b = this.f2118a;
        DsTextField dsTextField = this.b;
        switch (b) {
            case 0:
                org.xplatform.uikit.components.text_field.middle.b bVar = dsTextField.B;
                boolean z2 = dsTextField.f47271a;
                if (bVar != null && !bVar.f() && (f5iVar = dsTextField.k1) != null) {
                    int left = z2 ? bVar.getLeft() : bVar.getRight();
                    int left2 = z2 ? f5iVar.getLeft() : f5iVar.getRight();
                    AnimatorSet animatorSet = new AnimatorSet();
                    dsTextField.b = animatorSet;
                    animatorSet.setInterpolator(dsTextField.c);
                    AnimatorSet animatorSet2 = dsTextField.b;
                    if (animatorSet2 != null) {
                        animatorSet2.setDuration(100L);
                    }
                    AnimatorSet animatorSet3 = dsTextField.b;
                    if (animatorSet3 != null) {
                        animatorSet3.addListener(new d7n(f5iVar, z, f5iVar));
                    }
                    AnimatorSet animatorSet4 = dsTextField.b;
                    if (animatorSet4 != null) {
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(f5iVar, (Property<f5i, Float>) FrameLayout.TRANSLATION_X, z ? left - left2 : 0.0f, z ? 0.0f : left - left2), ObjectAnimator.ofFloat(f5iVar, (Property<f5i, Float>) FrameLayout.TRANSLATION_Y, z ? bVar.getTop() - f5iVar.getTop() : 0.0f, z ? 0.0f : bVar.getTop() - f5iVar.getTop()), ObjectAnimator.ofFloat(f5iVar, (Property<f5i, Float>) FrameLayout.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f));
                    }
                    AnimatorSet animatorSet5 = dsTextField.b;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                }
                t4i t4iVar = dsTextField.l1;
                t4iVar.b = z;
                t4iVar.invalidate();
                f5i f5iVar2 = dsTextField.k1;
                if (f5iVar2 != null) {
                    f5iVar2.j = z;
                    f5iVar2.setTextColor(f5iVar2.i ? f5iVar2.k : z ? f5iVar2.m : f5iVar2.l);
                }
                d5i d5iVar = dsTextField.h1;
                if (d5iVar != null) {
                    d5iVar.setTextColor(d5iVar.i ? d5iVar.j : d5iVar.k);
                }
                break;
            default:
                CharSequence text = dsTextField.getText();
                dsTextField.setText(text != null ? StringsKt.u0(text) : null);
                break;
        }
    }
}
