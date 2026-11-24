package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes3.dex */
public final class vxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38221a;
    public final DsCellRightSwitch b;

    public vxx(LinearLayout linearLayout, DsCellRightSwitch dsCellRightSwitch) {
        this.f38221a = linearLayout;
        this.b = dsCellRightSwitch;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38221a;
    }
}
