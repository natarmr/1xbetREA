package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class voe0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final voe0 f37762a = new voe0(1, y3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/referral/impl/databinding/FragmentReferralTakePartBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i = R.id.content;
            View viewF = yum0.f(view, R.id.content);
            if (viewF != null) {
                RecyclerView recyclerView = (RecyclerView) yum0.f(viewF, R.id.levelsRecycler);
                if (recyclerView == null) {
                    hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.levelsRecycler)));
                    return null;
                }
                nq8 nq8Var = new nq8((FrameLayout) viewF, recyclerView, (byte) 9);
                i = R.id.header;
                View viewF2 = yum0.f(view, R.id.header);
                if (viewF2 != null) {
                    int i2 = R.id.arrow;
                    if (((ImageView) yum0.f(viewF2, R.id.arrow)) != null) {
                        i2 = R.id.bringFriendImage;
                        if (((ImageView) yum0.f(viewF2, R.id.bringFriendImage)) != null) {
                            i2 = R.id.bringFriendTv;
                            if (((TextView) yum0.f(viewF2, R.id.bringFriendTv)) != null) {
                                i2 = R.id.buttonBack;
                                ImageButton imageButton = (ImageButton) yum0.f(viewF2, R.id.buttonBack);
                                if (imageButton != null) {
                                    i2 = R.id.buttonRules;
                                    ImageButton imageButton2 = (ImageButton) yum0.f(viewF2, R.id.buttonRules);
                                    if (imageButton2 != null) {
                                        i2 = R.id.guideline_center;
                                        if (((Guideline) yum0.f(viewF2, R.id.guideline_center)) != null) {
                                            i2 = R.id.infoContainer;
                                            if (((ConstraintLayout) yum0.f(viewF2, R.id.infoContainer)) != null) {
                                                i2 = R.id.moveMoneyImage;
                                                if (((ImageView) yum0.f(viewF2, R.id.moveMoneyImage)) != null) {
                                                    i2 = R.id.moveMoneyTv;
                                                    if (((TextView) yum0.f(viewF2, R.id.moveMoneyTv)) != null) {
                                                        i2 = R.id.title;
                                                        if (((TextView) yum0.f(viewF2, R.id.title)) != null) {
                                                            i2 = R.id.titleEnd;
                                                            if (((TextView) yum0.f(viewF2, R.id.titleEnd)) != null) {
                                                                vd7 vd7Var = new vd7((AppBarMotionLayout) viewF2, imageButton, imageButton2, (byte) 18);
                                                                i = R.id.loader;
                                                                LoaderView loaderView = (LoaderView) yum0.f(view, R.id.loader);
                                                                if (loaderView != null) {
                                                                    i = R.id.takePartButton;
                                                                    MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.takePartButton);
                                                                    if (materialButton != null) {
                                                                        i = R.id.takePartButtonContainer;
                                                                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.takePartButtonContainer);
                                                                        if (frameLayout != null) {
                                                                            return new y3r((CoordinatorLayout) view, appBarLayout, nq8Var, vd7Var, loaderView, materialButton, frameLayout);
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
                        }
                    }
                    hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                    return null;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
