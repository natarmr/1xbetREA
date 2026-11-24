package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.seka.SyntheticSekaView;

/* JADX INFO: loaded from: classes4.dex */
public final class v7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticSekaView f36938a;
    public final SyntheticSekaView b;

    public v7o0(SyntheticSekaView syntheticSekaView, SyntheticSekaView syntheticSekaView2) {
        this.f36938a = syntheticSekaView;
        this.b = syntheticSekaView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36938a;
    }
}
