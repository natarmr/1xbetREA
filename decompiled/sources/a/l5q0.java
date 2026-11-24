package a;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class l5q0 extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19472a;
    public final boolean b;

    public l5q0(boolean z, boolean z2) {
        this.f19472a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f19472a);
        textPaint.setStrikeThruText(this.b);
    }
}
