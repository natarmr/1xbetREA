package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetButton;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetSpacing;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class mhn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f21803a;
    public final DsPresetSpacing b;
    public final DsPresetTextFieldBasic c;
    public final DsPresetButton d;
    public final DsPresetSpacing e;

    public mhn0(LinearLayout linearLayout, DsPresetSpacing dsPresetSpacing, DsPresetTextFieldBasic dsPresetTextFieldBasic, DsPresetButton dsPresetButton, DsPresetSpacing dsPresetSpacing2) {
        this.f21803a = linearLayout;
        this.b = dsPresetSpacing;
        this.c = dsPresetTextFieldBasic;
        this.d = dsPresetButton;
        this.e = dsPresetSpacing2;
    }

    public static mhn0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.sum_editor_bottom_sheet, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.bottomSpace;
        DsPresetSpacing dsPresetSpacing = (DsPresetSpacing) yum0.f(viewInflate, R.id.bottomSpace);
        if (dsPresetSpacing != null) {
            i = R.id.editSum;
            DsPresetTextFieldBasic dsPresetTextFieldBasic = (DsPresetTextFieldBasic) yum0.f(viewInflate, R.id.editSum);
            if (dsPresetTextFieldBasic != null) {
                i = R.id.saveButton;
                DsPresetButton dsPresetButton = (DsPresetButton) yum0.f(viewInflate, R.id.saveButton);
                if (dsPresetButton != null) {
                    i = R.id.topSpace;
                    DsPresetSpacing dsPresetSpacing2 = (DsPresetSpacing) yum0.f(viewInflate, R.id.topSpace);
                    if (dsPresetSpacing2 != null) {
                        return new mhn0(linearLayout, dsPresetSpacing, dsPresetTextFieldBasic, dsPresetButton, dsPresetSpacing2);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21803a;
    }
}
