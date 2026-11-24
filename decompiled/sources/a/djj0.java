package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class djj0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f6189a;
    public final MaterialRadioButton b;
    public final TextView c;

    public djj0(FrameLayout frameLayout, MaterialRadioButton materialRadioButton, TextView textView) {
        this.f6189a = frameLayout;
        this.b = materialRadioButton;
        this.c = textView;
    }

    public static djj0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.setup_limit_item, viewGroup, false);
        int i = R.id.radioButton;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) yum0.f(viewInflate, R.id.radioButton);
        if (materialRadioButton != null) {
            i = R.id.tvTitle;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTitle);
            if (textView != null) {
                return new djj0((FrameLayout) viewInflate, materialRadioButton, textView);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6189a;
    }
}
