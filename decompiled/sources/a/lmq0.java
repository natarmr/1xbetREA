package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lmq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lmq0 f20310a = new lmq0(1, y5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentTimeoutBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
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
                                i = R.id.progress;
                                View viewF3 = yum0.f(view, R.id.progress);
                                if (viewF3 != null) {
                                    FrameLayout frameLayout = (FrameLayout) viewF3;
                                    nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i = R.id.week;
                                        View viewF4 = yum0.f(view, R.id.week);
                                        if (viewF4 != null) {
                                            return new y5r((ConstraintLayout) view, button, cxxVarA, cxxVarA2, nq8Var, materialToolbar, cxx.a(viewF4));
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
}
