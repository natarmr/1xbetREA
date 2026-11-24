package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;

/* JADX INFO: loaded from: classes4.dex */
public final class k1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17537a;
    public final ConstraintLayout b;
    public final CyberPlayerCardsView c;
    public final TextView d;
    public final TextView e;

    public /* synthetic */ k1o0(ConstraintLayout constraintLayout, CyberPlayerCardsView cyberPlayerCardsView, TextView textView, TextView textView2, byte b) {
        this.f17537a = b;
        this.b = constraintLayout;
        this.c = cyberPlayerCardsView;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f17537a;
        return this.b;
    }
}
