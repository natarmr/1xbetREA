package a;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class vjj0 extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37531a;
    public final float b;
    public final float c;
    public final float d;

    public vjj0(float f, float f2, float f3, int i) {
        this.f37531a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.f37531a);
    }
}
