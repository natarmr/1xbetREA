package org.xplatform.ui_core.utils;

import android.text.TextPaint;
import android.text.style.URLSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ui_core/utils/ExtensionsKt$removeLinksUnderline$1", "Landroid/text/style/URLSpan;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ExtensionsKt$removeLinksUnderline$1 extends URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
