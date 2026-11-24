package a;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class jjj0 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijj0 f16621a;
    public final float b;
    public final pz40 c = androidx.compose.runtime.e.e(new h7k0(9205357640488583168L));
    public final zbk d = jgk0.b(new goi0(this, (byte) 2));

    public jjj0(ijj0 ijj0Var, float f) {
        this.f16621a = ijj0Var;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        cjx.W(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
