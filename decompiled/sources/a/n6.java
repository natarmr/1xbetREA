package a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22970a;
    public final k7 b;
    public final int c;

    public n6(int i, k7 k7Var, int i2) {
        this.f22970a = i;
        this.b = k7Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f22970a);
        this.b.f17795a.performAction(this.c, bundle);
    }
}
