package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a3w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3w f195a = new a3w(1, c3w.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/HistoryInfoDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.history_info_dialog, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.tvBetCount;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvBetCount);
        if (textView != null) {
            i = R.id.tvBetCountTitle;
            if (((TextView) yum0.f(viewInflate, R.id.tvBetCountTitle)) != null) {
                i = R.id.tvPaidOut;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvPaidOut);
                if (textView2 != null) {
                    i = R.id.tvPaidOutTitle;
                    if (((TextView) yum0.f(viewInflate, R.id.tvPaidOutTitle)) != null) {
                        i = R.id.tvPeriod;
                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvPeriod);
                        if (textView3 != null) {
                            i = R.id.tvPeriodTitle;
                            if (((TextView) yum0.f(viewInflate, R.id.tvPeriodTitle)) != null) {
                                i = R.id.tvUnsettled;
                                TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvUnsettled);
                                if (textView4 != null) {
                                    i = R.id.tvUnsettledTitle;
                                    if (((TextView) yum0.f(viewInflate, R.id.tvUnsettledTitle)) != null) {
                                        return new c3w(constraintLayout, textView, textView2, textView3, textView4);
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
