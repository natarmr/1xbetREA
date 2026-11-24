package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class p3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26312a;
    public final DsSettingsCell b;
    public final DsSettingsCell c;
    public final DsSettingsCell d;
    public final DsSettingsCell e;
    public final DsNavigationBarBasic f;
    public final MaterialTextView g;

    public p3r(ConstraintLayout constraintLayout, DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsSettingsCell dsSettingsCell3, DsSettingsCell dsSettingsCell4, DsNavigationBarBasic dsNavigationBarBasic, MaterialTextView materialTextView) {
        this.f26312a = constraintLayout;
        this.b = dsSettingsCell;
        this.c = dsSettingsCell2;
        this.d = dsSettingsCell3;
        this.e = dsSettingsCell4;
        this.f = dsNavigationBarBasic;
        this.g = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26312a;
    }
}
