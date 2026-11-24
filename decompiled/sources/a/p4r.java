package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class p4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26368a;
    public final DsSettingsCell b;
    public final DsSettingsCell c;
    public final DsSettingsCell d;
    public final DsSettingsCell e;
    public final DsSettingsCell f;
    public final DsNavigationBar g;
    public final FrameLayout h;
    public final MaterialTextView i;
    public final MaterialTextView j;
    public final MaterialTextView k;

    public p4r(ConstraintLayout constraintLayout, DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsSettingsCell dsSettingsCell3, DsSettingsCell dsSettingsCell4, DsSettingsCell dsSettingsCell5, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f26368a = constraintLayout;
        this.b = dsSettingsCell;
        this.c = dsSettingsCell2;
        this.d = dsSettingsCell3;
        this.e = dsSettingsCell4;
        this.f = dsSettingsCell5;
        this.g = dsNavigationBar;
        this.h = frameLayout;
        this.i = materialTextView;
        this.j = materialTextView2;
        this.k = materialTextView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26368a;
    }
}
