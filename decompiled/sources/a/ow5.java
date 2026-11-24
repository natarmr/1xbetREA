package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ow5 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25953a;
    public final FrameLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;

    public ow5(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, TextView textView, TextView textView2) {
        this.f25953a = constraintLayout;
        this.b = frameLayout;
        this.c = view;
        this.d = textView;
        this.e = textView2;
    }

    public static ow5 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.base_bottom_sheet_dialog_layout, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.container);
        if (frameLayout != null) {
            i = R.id.header;
            if (((Group) yum0.f(viewInflate, R.id.header)) != null) {
                i = R.id.progressView;
                if (((FrameLayout) yum0.f(viewInflate, R.id.progressView)) != null) {
                    i = R.id.top_view;
                    View viewF = yum0.f(viewInflate, R.id.top_view);
                    if (viewF != null) {
                        i = R.id.tv_sub_title;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tv_sub_title);
                        if (textView != null) {
                            i = R.id.tv_title;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tv_title);
                            if (textView2 != null) {
                                return new ow5(constraintLayout, frameLayout, viewF, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25953a;
    }
}
