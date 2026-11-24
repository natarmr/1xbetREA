package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19216a;
    public final ConstraintLayout b;
    public final AppCompatButton c;
    public final AppCompatButton d;
    public final AppCompatButton e;

    public l0r(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3) {
        this.f19216a = constraintLayout;
        this.b = constraintLayout2;
        this.c = appCompatButton;
        this.d = appCompatButton2;
        this.e = appCompatButton3;
    }

    public static l0r a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.max_bet_button;
        AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.max_bet_button);
        if (appCompatButton != null) {
            i = R.id.mid_bet_button;
            AppCompatButton appCompatButton2 = (AppCompatButton) yum0.f(view, R.id.mid_bet_button);
            if (appCompatButton2 != null) {
                i = R.id.small_bet_button;
                AppCompatButton appCompatButton3 = (AppCompatButton) yum0.f(view, R.id.small_bet_button);
                if (appCompatButton3 != null) {
                    return new l0r(constraintLayout, constraintLayout, appCompatButton, appCompatButton2, appCompatButton3);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19216a;
    }
}
