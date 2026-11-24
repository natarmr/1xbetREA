package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.radio_button.DsRadioButton;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class v5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36838a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView g;
    public final DsNavigationBarBasic h;
    public final DsRadioButton i;
    public final DsRadioButton j;
    public final DsRadioButton k;
    public final DsCellRightSwitch l;
    public final DsCellRightLabel m;
    public final DsSettingsCell n;
    public final DsCellRightLabel o;
    public final DsSettingsCell p;
    public final DsSettingsCell q;

    public v5r(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, DsNavigationBarBasic dsNavigationBarBasic, DsRadioButton dsRadioButton, DsRadioButton dsRadioButton2, DsRadioButton dsRadioButton3, DsCellRightSwitch dsCellRightSwitch, DsCellRightLabel dsCellRightLabel, DsSettingsCell dsSettingsCell, DsCellRightLabel dsCellRightLabel2, DsSettingsCell dsSettingsCell2, DsSettingsCell dsSettingsCell3) {
        this.f36838a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatImageView3;
        this.e = appCompatImageView4;
        this.f = appCompatImageView5;
        this.g = appCompatImageView6;
        this.h = dsNavigationBarBasic;
        this.i = dsRadioButton;
        this.j = dsRadioButton2;
        this.k = dsRadioButton3;
        this.l = dsCellRightSwitch;
        this.m = dsCellRightLabel;
        this.n = dsSettingsCell;
        this.o = dsCellRightLabel2;
        this.p = dsSettingsCell2;
        this.q = dsSettingsCell3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36838a;
    }
}
