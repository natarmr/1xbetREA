package a;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class ltn extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20636a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f20636a) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.getClass();
                textPaint.setLetterSpacing(0.036f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f20636a) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.getClass();
                textPaint.setLetterSpacing(0.036f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }
}
