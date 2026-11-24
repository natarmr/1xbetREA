package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.crystal.presentation.views.CrystalStatusView;

/* JADX INFO: loaded from: classes2.dex */
public final class zef implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44247a;
    public final CrystalFieldView b;
    public final CrystalStatusView c;
    public final FrameLayout d;

    public zef(ConstraintLayout constraintLayout, CrystalFieldView crystalFieldView, CrystalStatusView crystalStatusView, FrameLayout frameLayout) {
        this.f44247a = constraintLayout;
        this.b = crystalFieldView;
        this.c = crystalStatusView;
        this.d = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44247a;
    }
}
