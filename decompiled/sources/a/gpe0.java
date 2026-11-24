package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gpe0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gpe0 f11679a = new gpe0(1, jjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/referral/impl/databinding/DialogReferralsDateFilterBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_referrals_date_filter, (ViewGroup) null, false);
        int i = R.id.divider;
        View viewF = yum0.f(viewInflate, R.id.divider);
        if (viewF != null) {
            i = R.id.perMonthContainer;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) yum0.f(viewInflate, R.id.perMonthContainer);
            if (linearLayoutCompat != null) {
                i = R.id.perMonthTitle;
                if (((TextView) yum0.f(viewInflate, R.id.perMonthTitle)) != null) {
                    i = R.id.periodContainer;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) yum0.f(viewInflate, R.id.periodContainer);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.periodTitle;
                        if (((TextView) yum0.f(viewInflate, R.id.periodTitle)) != null) {
                            return new jjk((LinearLayoutCompat) viewInflate, viewF, linearLayoutCompat, linearLayoutCompat2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
