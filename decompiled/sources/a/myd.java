package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class myd extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final myd f22598a = new myd(1, pyd.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/ConfirmSaleDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.confirm_sale_dialog, (ViewGroup) null, false);
        int i = R.id.btnSale;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.btnSale);
        if (materialButton != null) {
            i = R.id.flSale;
            if (((FrameLayout) yum0.f(viewInflate, R.id.flSale)) != null) {
                i = R.id.llSaleDescription;
                if (((LinearLayout) yum0.f(viewInflate, R.id.llSaleDescription)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.tvBetCoef;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvBetCoef);
                    if (textView != null) {
                        i = R.id.tvBetCoefTitle;
                        if (((TextView) yum0.f(viewInflate, R.id.tvBetCoefTitle)) != null) {
                            i = R.id.tvBetCurrentValue;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvBetCurrentValue);
                            if (textView2 != null) {
                                i = R.id.tvBetCurrentValueTitle;
                                if (((TextView) yum0.f(viewInflate, R.id.tvBetCurrentValueTitle)) != null) {
                                    i = R.id.tvBetValue;
                                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvBetValue);
                                    if (textView3 != null) {
                                        i = R.id.tvBetValueTitle;
                                        if (((TextView) yum0.f(viewInflate, R.id.tvBetValueTitle)) != null) {
                                            i = R.id.tvDate;
                                            TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvDate);
                                            if (textView4 != null) {
                                                i = R.id.tvNumber;
                                                TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvNumber);
                                                if (textView5 != null) {
                                                    i = R.id.tvSaleDescription;
                                                    TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvSaleDescription);
                                                    if (textView6 != null) {
                                                        i = R.id.tvSaleValue;
                                                        TextView textView7 = (TextView) yum0.f(viewInflate, R.id.tvSaleValue);
                                                        if (textView7 != null) {
                                                            i = R.id.tvType;
                                                            TextView textView8 = (TextView) yum0.f(viewInflate, R.id.tvType);
                                                            if (textView8 != null) {
                                                                return new pyd(constraintLayout, materialButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
