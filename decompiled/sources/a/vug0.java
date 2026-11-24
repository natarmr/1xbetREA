package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.TicketDividerWithShadowLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vug0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vug0 f38047a = new vug0(1, bvg0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/SaleFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.autoSaleGroup;
        Group group = (Group) yum0.f(view, R.id.autoSaleGroup);
        if (group != null) {
            i = R.id.bottom;
            if (((ConstraintLayout) yum0.f(view, R.id.bottom)) != null) {
                i = R.id.btnSale;
                MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.btnSale);
                if (materialButton != null) {
                    i = R.id.center;
                    if (((Guideline) yum0.f(view, R.id.center)) != null) {
                        i = R.id.container;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.container);
                        if (frameLayout != null) {
                            i = R.id.content;
                            NestedScrollView nestedScrollView = (NestedScrollView) yum0.f(view, R.id.content);
                            if (nestedScrollView != null) {
                                i = R.id.error_view;
                                LottieView lottieView = (LottieView) yum0.f(view, R.id.error_view);
                                if (lottieView != null) {
                                    i = R.id.fl_loading;
                                    FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.fl_loading);
                                    if (frameLayout2 != null) {
                                        i = R.id.flSale;
                                        FrameLayout frameLayout3 = (FrameLayout) yum0.f(view, R.id.flSale);
                                        if (frameLayout3 != null) {
                                            i = R.id.header;
                                            if (((ConstraintLayout) yum0.f(view, R.id.header)) != null) {
                                                i = R.id.infoGroup;
                                                LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.infoGroup);
                                                if (linearLayout != null) {
                                                    i = R.id.infoImage;
                                                    if (((AppCompatImageView) yum0.f(view, R.id.infoImage)) != null) {
                                                        i = R.id.infoText;
                                                        if (((TextView) yum0.f(view, R.id.infoText)) != null) {
                                                            i = R.id.newBetGroup;
                                                            Group group2 = (Group) yum0.f(view, R.id.newBetGroup);
                                                            if (group2 != null) {
                                                                i = R.id.paymentGroup;
                                                                Group group3 = (Group) yum0.f(view, R.id.paymentGroup);
                                                                if (group3 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                    i = R.id.saleContainer;
                                                                    if (((ConstraintLayout) yum0.f(view, R.id.saleContainer)) != null) {
                                                                        i = R.id.seekBarAutoSale;
                                                                        SeekBar seekBar = (SeekBar) yum0.f(view, R.id.seekBarAutoSale);
                                                                        if (seekBar != null) {
                                                                            i = R.id.seekBarNewBetValue;
                                                                            SeekBar seekBar2 = (SeekBar) yum0.f(view, R.id.seekBarNewBetValue);
                                                                            if (seekBar2 != null) {
                                                                                i = R.id.seekBarPayment;
                                                                                SeekBar seekBar3 = (SeekBar) yum0.f(view, R.id.seekBarPayment);
                                                                                if (seekBar3 != null) {
                                                                                    i = R.id.ticketDivider;
                                                                                    if (((TicketDividerWithShadowLayout) yum0.f(view, R.id.ticketDivider)) != null) {
                                                                                        i = R.id.toolbar;
                                                                                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                                                                                        if (dsNavigationBar != null) {
                                                                                            i = R.id.tvAutoSaleEndValue;
                                                                                            TextView textView = (TextView) yum0.f(view, R.id.tvAutoSaleEndValue);
                                                                                            if (textView != null) {
                                                                                                i = R.id.tvAutoSaleStartValue;
                                                                                                TextView textView2 = (TextView) yum0.f(view, R.id.tvAutoSaleStartValue);
                                                                                                if (textView2 != null) {
                                                                                                    i = R.id.tvAutoSaleTitle;
                                                                                                    if (((TextView) yum0.f(view, R.id.tvAutoSaleTitle)) != null) {
                                                                                                        i = R.id.tvAutoSaleValue;
                                                                                                        TextView textView3 = (TextView) yum0.f(view, R.id.tvAutoSaleValue);
                                                                                                        if (textView3 != null) {
                                                                                                            i = R.id.tvBetCoef;
                                                                                                            TextView textView4 = (TextView) yum0.f(view, R.id.tvBetCoef);
                                                                                                            if (textView4 != null) {
                                                                                                                i = R.id.tvBetCoefTitle;
                                                                                                                if (((TextView) yum0.f(view, R.id.tvBetCoefTitle)) != null) {
                                                                                                                    i = R.id.tvBetCurrentValue;
                                                                                                                    TextView textView5 = (TextView) yum0.f(view, R.id.tvBetCurrentValue);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i = R.id.tvBetCurrentValueTitle;
                                                                                                                        if (((TextView) yum0.f(view, R.id.tvBetCurrentValueTitle)) != null) {
                                                                                                                            i = R.id.tvBetValue;
                                                                                                                            TextView textView6 = (TextView) yum0.f(view, R.id.tvBetValue);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i = R.id.tvBetValueTitle;
                                                                                                                                if (((TextView) yum0.f(view, R.id.tvBetValueTitle)) != null) {
                                                                                                                                    i = R.id.tvDescription;
                                                                                                                                    TextView textView7 = (TextView) yum0.f(view, R.id.tvDescription);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        i = R.id.tvLive;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) yum0.f(view, R.id.tvLive);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i = R.id.tvNewBetEndValue;
                                                                                                                                            TextView textView8 = (TextView) yum0.f(view, R.id.tvNewBetEndValue);
                                                                                                                                            if (textView8 != null) {
                                                                                                                                                i = R.id.tvNewBetStartValue;
                                                                                                                                                TextView textView9 = (TextView) yum0.f(view, R.id.tvNewBetStartValue);
                                                                                                                                                if (textView9 != null) {
                                                                                                                                                    i = R.id.tvNewBetValue;
                                                                                                                                                    TextView textView10 = (TextView) yum0.f(view, R.id.tvNewBetValue);
                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                        i = R.id.tvNewBetValueTitle;
                                                                                                                                                        if (((TextView) yum0.f(view, R.id.tvNewBetValueTitle)) != null) {
                                                                                                                                                            i = R.id.tvNumber;
                                                                                                                                                            TextView textView11 = (TextView) yum0.f(view, R.id.tvNumber);
                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                i = R.id.tvPaymentEndValue;
                                                                                                                                                                TextView textView12 = (TextView) yum0.f(view, R.id.tvPaymentEndValue);
                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                    i = R.id.tvPaymentStartValue;
                                                                                                                                                                    TextView textView13 = (TextView) yum0.f(view, R.id.tvPaymentStartValue);
                                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                                        i = R.id.tvPaymentTitle;
                                                                                                                                                                        if (((TextView) yum0.f(view, R.id.tvPaymentTitle)) != null) {
                                                                                                                                                                            i = R.id.tvPaymentValue;
                                                                                                                                                                            TextView textView14 = (TextView) yum0.f(view, R.id.tvPaymentValue);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i = R.id.tvType;
                                                                                                                                                                                TextView textView15 = (TextView) yum0.f(view, R.id.tvType);
                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                    return new bvg0(constraintLayout, group, materialButton, frameLayout, nestedScrollView, lottieView, frameLayout2, frameLayout3, linearLayout, group2, group3, seekBar, seekBar2, seekBar3, dsNavigationBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout2, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
