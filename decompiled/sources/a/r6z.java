package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.referral.impl.presentation.takepart.view.LevelInfoView;

/* JADX INFO: loaded from: classes5.dex */
public final class r6z implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f29955a;
    public final LevelInfoView b;

    public r6z(FrameLayout frameLayout, LevelInfoView levelInfoView) {
        this.f29955a = frameLayout;
        this.b = levelInfoView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29955a;
    }
}
