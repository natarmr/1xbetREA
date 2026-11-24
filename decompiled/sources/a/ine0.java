package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ine0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ine0 f15070a = new ine0(1, w3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/referral/impl/databinding/FragmentReferralNetworkBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.content;
        View viewF = yum0.f(view, R.id.content);
        if (viewF != null) {
            int i2 = R.id.buttonShare;
            MaterialButton materialButton = (MaterialButton) yum0.f(viewF, R.id.buttonShare);
            if (materialButton != null) {
                i2 = R.id.emptyView;
                LinearLayout linearLayout = (LinearLayout) yum0.f(viewF, R.id.emptyView);
                if (linearLayout != null) {
                    i2 = R.id.llReferralContainer;
                    LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF, R.id.llReferralContainer);
                    if (linearLayout2 != null) {
                        i2 = R.id.referralRecycler;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(viewF, R.id.referralRecycler);
                        if (recyclerView != null) {
                            i2 = R.id.referralUrl;
                            TextView textView = (TextView) yum0.f(viewF, R.id.referralUrl);
                            if (textView != null) {
                                i2 = R.id.referralUrlContainer;
                                LinearLayout linearLayout3 = (LinearLayout) yum0.f(viewF, R.id.referralUrlContainer);
                                if (linearLayout3 != null) {
                                    i2 = R.id.tvMore;
                                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tvMore);
                                    if (textView2 != null) {
                                        zkk zkkVar = new zkk((LinearLayout) viewF, materialButton, linearLayout, linearLayout2, recyclerView, textView, linearLayout3, textView2);
                                        i = R.id.header;
                                        View viewF2 = yum0.f(view, R.id.header);
                                        if (viewF2 != null) {
                                            int i3 = R.id.buttonInfo;
                                            ImageView imageView = (ImageView) yum0.f(viewF2, R.id.buttonInfo);
                                            if (imageView != null) {
                                                i3 = R.id.divider;
                                                View viewF3 = yum0.f(viewF2, R.id.divider);
                                                if (viewF3 != null) {
                                                    i3 = R.id.fullBalance;
                                                    TextView textView3 = (TextView) yum0.f(viewF2, R.id.fullBalance);
                                                    if (textView3 != null) {
                                                        i3 = R.id.holdBalance;
                                                        TextView textView4 = (TextView) yum0.f(viewF2, R.id.holdBalance);
                                                        if (textView4 != null) {
                                                            i3 = R.id.moveMoneyButton;
                                                            MaterialButton materialButton2 = (MaterialButton) yum0.f(viewF2, R.id.moveMoneyButton);
                                                            if (materialButton2 != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewF2;
                                                                i3 = R.id.toolbar;
                                                                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(viewF2, R.id.toolbar);
                                                                if (materialToolbar != null) {
                                                                    i3 = R.id.withdrawBalance;
                                                                    TextView textView5 = (TextView) yum0.f(viewF2, R.id.withdrawBalance);
                                                                    if (textView5 != null) {
                                                                        i3 = R.id.withdrawContainer;
                                                                        if (((LinearLayoutCompat) yum0.f(viewF2, R.id.withdrawContainer)) != null) {
                                                                            zkk zkkVar2 = new zkk(constraintLayout, imageView, viewF3, textView3, textView4, materialButton2, materialToolbar, textView5);
                                                                            i = R.id.loader;
                                                                            LoaderView loaderView = (LoaderView) yum0.f(view, R.id.loader);
                                                                            if (loaderView != null) {
                                                                                return new w3r((ConstraintLayout) view, zkkVar, zkkVar2, loaderView);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i3)));
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
            return null;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
