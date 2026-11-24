package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.radiobutton.MaterialRadioButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f5146a;
    public final MaterialRadioButton b;
    public final TextView c;

    public cxx(FrameLayout frameLayout, MaterialRadioButton materialRadioButton, TextView textView) {
        this.f5146a = frameLayout;
        this.b = materialRadioButton;
        this.c = textView;
    }

    public static cxx a(View view) {
        int i = R.id.divider;
        if (((MaterialDivider) yum0.f(view, R.id.divider)) != null) {
            i = R.id.radioButton;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) yum0.f(view, R.id.radioButton);
            if (materialRadioButton != null) {
                i = R.id.tvTitle;
                TextView textView = (TextView) yum0.f(view, R.id.tvTitle);
                if (textView != null) {
                    return new cxx((FrameLayout) view, materialRadioButton, textView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5146a;
    }
}
