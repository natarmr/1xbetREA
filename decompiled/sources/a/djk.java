package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class djk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f6190a;
    public final DsButton b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final RecyclerView e;
    public final DsSearchField f;
    public final DsTextField g;
    public final TextView h;
    public final TextView i;
    public final DsPresetTitle j;

    public djk(LinearLayout linearLayout, DsButton dsButton, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, DsSearchField dsSearchField, DsTextField dsTextField, TextView textView, TextView textView2, DsPresetTitle dsPresetTitle) {
        this.f6190a = linearLayout;
        this.b = dsButton;
        this.c = linearLayout2;
        this.d = linearLayout3;
        this.e = recyclerView;
        this.f = dsSearchField;
        this.g = dsTextField;
        this.h = textView;
        this.i = textView2;
        this.j = dsPresetTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6190a;
    }
}
