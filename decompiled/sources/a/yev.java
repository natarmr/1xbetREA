package a;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class yev extends vfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f42509a;
    public final TextPaint b;

    public yev(CharSequence charSequence, TextPaint textPaint) {
        this.f42509a = charSequence;
        this.b = textPaint;
    }

    @Override // a.vfc
    public final int K(int i) {
        CharSequence charSequence = this.f42509a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // a.vfc
    public final int L(int i) {
        CharSequence charSequence = this.f42509a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
