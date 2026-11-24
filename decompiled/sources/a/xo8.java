package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes.dex */
public final class xo8 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41203a;
    public final DsPresetTextFieldBasic b;

    public xo8(ConstraintLayout constraintLayout, DsPresetTextFieldBasic dsPresetTextFieldBasic) {
        this.f41203a = constraintLayout;
        this.b = dsPresetTextFieldBasic;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41203a;
    }
}
