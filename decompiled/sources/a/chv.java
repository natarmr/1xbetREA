package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes6.dex */
public final class chv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4379a;
    public final DsPresetTwoButtons b;
    public final RecyclerView c;

    public chv(LinearLayout linearLayout, DsPresetTwoButtons dsPresetTwoButtons, RecyclerView recyclerView) {
        this.f4379a = linearLayout;
        this.b = dsPresetTwoButtons;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4379a;
    }
}
