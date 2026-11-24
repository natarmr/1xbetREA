package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class h5q0 extends t4q0 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public h5q0(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.f33334a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + Separators.RPAREN;
    }
}
