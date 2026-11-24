package io.noties.markwon.core.spans;

import a.b930;
import a.ub00;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class LinkSpan extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b930 f46058a;
    public final String b;
    public final ub00 c;

    public LinkSpan(b930 b930Var, String str, ub00 ub00Var) {
        super(str);
        this.f46058a = b930Var;
        this.b = str;
        this.c = ub00Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.d(view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f46058a.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
