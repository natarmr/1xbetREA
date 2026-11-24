package a;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class se3 extends re3 {
    public final /* synthetic */ AppCompatTextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se3(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.e = appCompatTextView;
    }

    @Override // a.ok50, a.qe3
    public final void b(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
