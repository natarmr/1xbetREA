package a;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class re3 extends ok50 {
    public final /* synthetic */ AppCompatTextView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re3(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
    }

    @Override // a.ok50, a.qe3
    public final void a(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // a.ok50, a.qe3
    public final void c(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
