package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;

/* JADX INFO: loaded from: classes4.dex */
public final class l1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f19265a;
    public final CyberDurakGameView b;

    public l1o0(FrameLayout frameLayout, CyberDurakGameView cyberDurakGameView) {
        this.f19265a = frameLayout;
        this.b = cyberDurakGameView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19265a;
    }
}
