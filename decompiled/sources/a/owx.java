package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class owx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25987a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final View e;

    public owx(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f25987a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = view;
    }

    public static owx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_period, viewGroup, false);
        int i = R.id.gLHeader;
        if (((Guideline) yum0.f(viewInflate, R.id.gLHeader)) != null) {
            i = R.id.tvPeriodTitle;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvPeriodTitle);
            if (textView != null) {
                i = R.id.tvTeamOneScore;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTeamOneScore);
                if (textView2 != null) {
                    i = R.id.tvTeamTwoScore;
                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvTeamTwoScore);
                    if (textView3 != null) {
                        i = R.id.vTeamsDivider;
                        View viewF = yum0.f(viewInflate, R.id.vTeamsDivider);
                        if (viewF != null) {
                            return new owx((ConstraintLayout) viewInflate, textView, textView2, textView3, viewF);
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
        return this.f25987a;
    }
}
