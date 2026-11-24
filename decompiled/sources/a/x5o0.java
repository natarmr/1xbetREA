package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class x5o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40328a;
    public final DsTimer b;
    public final TextView c;

    public x5o0(LinearLayout linearLayout, DsTimer dsTimer, TextView textView) {
        this.f40328a = linearLayout;
        this.b = dsTimer;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40328a;
    }
}
