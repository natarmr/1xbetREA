package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes.dex */
public final class sre implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32671a;
    public final DsSettingsCell b;
    public final DsSettingsCell c;
    public final DsSettingsCell d;
    public final DsSettingsCell e;
    public final DsSettingsCell f;
    public final DsSeparator g;
    public final DsSeparator h;
    public final DsSeparator i;
    public final DsSeparator j;

    public sre(LinearLayout linearLayout, DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsSettingsCell dsSettingsCell3, DsSettingsCell dsSettingsCell4, DsSettingsCell dsSettingsCell5, DsSeparator dsSeparator, DsSeparator dsSeparator2, DsSeparator dsSeparator3, DsSeparator dsSeparator4) {
        this.f32671a = linearLayout;
        this.b = dsSettingsCell;
        this.c = dsSettingsCell2;
        this.d = dsSettingsCell3;
        this.e = dsSettingsCell4;
        this.f = dsSettingsCell5;
        this.g = dsSeparator;
        this.h = dsSeparator2;
        this.i = dsSeparator3;
        this.j = dsSeparator4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32671a;
    }
}
