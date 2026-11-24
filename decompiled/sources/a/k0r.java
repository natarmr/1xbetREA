package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class k0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17482a;
    public final AppCompatButton b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatButton e;

    public k0r(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton2) {
        this.f17482a = constraintLayout;
        this.b = appCompatButton;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = appCompatButton2;
    }

    public static k0r a(View view) {
        int i = R.id.change_bet_button;
        AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.change_bet_button);
        if (appCompatButton != null) {
            i = R.id.description_layout;
            if (((LinearLayout) yum0.f(view, R.id.description_layout)) != null) {
                i = R.id.game_ended_description_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(view, R.id.game_ended_description_text);
                if (appCompatTextView != null) {
                    i = R.id.game_ended_title_text;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(view, R.id.game_ended_title_text);
                    if (appCompatTextView2 != null) {
                        i = R.id.playAgainButton;
                        AppCompatButton appCompatButton2 = (AppCompatButton) yum0.f(view, R.id.playAgainButton);
                        if (appCompatButton2 != null) {
                            return new k0r((ConstraintLayout) view, appCompatButton, appCompatTextView, appCompatTextView2, appCompatButton2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17482a;
    }
}
