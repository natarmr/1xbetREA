package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes3.dex */
public final class oxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26034a;
    public final DsCellRightSwitch b;

    public oxx(ConstraintLayout constraintLayout, DsCellRightSwitch dsCellRightSwitch) {
        this.f26034a = constraintLayout;
        this.b = dsCellRightSwitch;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26034a;
    }
}
