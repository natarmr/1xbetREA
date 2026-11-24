package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
public final class w4g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38541a;
    public final DsButton b;
    public final ConstraintLayout c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final ConstraintLayout f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final DsPresetTitle k;

    public w4g(LinearLayout linearLayout, DsButton dsButton, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, DsPresetTitle dsPresetTitle) {
        this.f38541a = linearLayout;
        this.b = dsButton;
        this.c = constraintLayout;
        this.d = imageView;
        this.e = constraintLayout2;
        this.f = constraintLayout3;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = dsPresetTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38541a;
    }
}
