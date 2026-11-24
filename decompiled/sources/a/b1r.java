package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class b1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1822a;
    public final Button b;
    public final cxx c;
    public final cxx d;
    public final cxx e;
    public final nq8 f;
    public final cxx g;
    public final cxx h;
    public final MaterialToolbar i;
    public final cxx j;

    public b1r(ConstraintLayout constraintLayout, Button button, cxx cxxVar, cxx cxxVar2, cxx cxxVar3, nq8 nq8Var, cxx cxxVar4, cxx cxxVar5, MaterialToolbar materialToolbar, cxx cxxVar6) {
        this.f1822a = constraintLayout;
        this.b = button;
        this.c = cxxVar;
        this.d = cxxVar2;
        this.e = cxxVar3;
        this.f = nq8Var;
        this.g = cxxVar4;
        this.h = cxxVar5;
        this.i = materialToolbar;
        this.j = cxxVar6;
    }

    public static b1r a(View view) {
        int i = R.id.buttonSave;
        Button button = (Button) yum0.f(view, R.id.buttonSave);
        if (button != null) {
            i = R.id.container;
            if (((NestedScrollView) yum0.f(view, R.id.container)) != null) {
                i = R.id.content;
                if (((LinearLayout) yum0.f(view, R.id.content)) != null) {
                    i = R.id.day;
                    View viewF = yum0.f(view, R.id.day);
                    if (viewF != null) {
                        cxx cxxVarA = cxx.a(viewF);
                        i = R.id.flSave;
                        if (((FrameLayout) yum0.f(view, R.id.flSave)) != null) {
                            i = R.id.month;
                            View viewF2 = yum0.f(view, R.id.month);
                            if (viewF2 != null) {
                                cxx cxxVarA2 = cxx.a(viewF2);
                                i = R.id.oneYear;
                                View viewF3 = yum0.f(view, R.id.oneYear);
                                if (viewF3 != null) {
                                    cxx cxxVarA3 = cxx.a(viewF3);
                                    i = R.id.progress;
                                    View viewF4 = yum0.f(view, R.id.progress);
                                    if (viewF4 != null) {
                                        FrameLayout frameLayout = (FrameLayout) viewF4;
                                        nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                                        i = R.id.sixMonth;
                                        View viewF5 = yum0.f(view, R.id.sixMonth);
                                        if (viewF5 != null) {
                                            cxx cxxVarA4 = cxx.a(viewF5);
                                            i = R.id.threeMonth;
                                            View viewF6 = yum0.f(view, R.id.threeMonth);
                                            if (viewF6 != null) {
                                                cxx cxxVarA5 = cxx.a(viewF6);
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    i = R.id.week;
                                                    View viewF7 = yum0.f(view, R.id.week);
                                                    if (viewF7 != null) {
                                                        return new b1r((ConstraintLayout) view, button, cxxVarA, cxxVarA2, cxxVarA3, nq8Var, cxxVarA4, cxxVarA5, materialToolbar, cxx.a(viewF7));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
        return this.f1822a;
    }
}
