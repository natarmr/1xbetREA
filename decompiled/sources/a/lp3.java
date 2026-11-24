package a;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;

/* JADX INFO: loaded from: classes3.dex */
public final class lp3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppleFortuneCellGameView f20421a;
    public final AppleFortuneGameView b;
    public final TextView c;
    public final Button d;
    public final View e;

    public lp3(AppleFortuneCellGameView appleFortuneCellGameView, AppleFortuneGameView appleFortuneGameView, TextView textView, Button button, View view) {
        this.f20421a = appleFortuneCellGameView;
        this.b = appleFortuneGameView;
        this.c = textView;
        this.d = button;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20421a;
    }
}
