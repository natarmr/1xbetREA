package a;

import android.app.Dialog;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Window;
import android.widget.Button;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/de90;", "La/ix5;", "<init>", "()V", "a/xi70", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class de90 extends ix5 {
    public final phf0 d2 = new phf0("BUNDLE_REQUEST_KEY");
    public final zz2 e2 = new zz2("BUNDLE_MAX_PERIOD");
    public final r34 f2 = new r34("BUNDLE_START_DATE");
    public final r34 g2 = new r34("BUNDLE_DEFAULT_FROM_DATE");
    public final r34 h2 = new r34("BUNDLE_END_DATE", 0);
    public final cgx0 i2 = new cgx0("BUNDLE_FROM_START_DATE");
    public final nae0 j2 = ltt0.p(this, ce90.f4201a);
    public static final /* synthetic */ iiy[] l2 = {new ez40(de90.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(de90.class, "maxPeriod", "getMaxPeriod()I", 0), new ez40(de90.class, "startTimeSec", "getStartTimeSec()J", 0), new ez40(de90.class, "defaultFromTimeSec", "getDefaultFromTimeSec()J", 0), new ez40(de90.class, "endTimeSec", "getEndTimeSec()J", 0), new ez40(de90.class, "fromStartDate", "getFromStartDate()Z", 0), new j0d0(de90.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/DatePickerViewBinding;", 0)};
    public static final xi70 k2 = new xi70();

    @Override // a.ix5
    public final void I0() {
        Z0();
    }

    @Override // a.ix5
    public final int L0() {
        return R.style.ThemeOverlay_AppTheme_MaterialAlertDialog_New_DatePicker;
    }

    @Override // a.ix5
    public final void M0() {
        byte b = 0;
        if (W0() > 0) {
            String strH = H(R.string.max_period_description);
            strH.getClass();
            String string = G().getString(R.string.days_count_v2, Integer.valueOf(W0() > 0 ? W0() : 30));
            string.getClass();
            J0().d.setVisibility(0);
            J0().d.setText(strH + Separators.SP + string);
        }
        J0().e.setText(V0() ? H(R.string.start_date_period) : H(R.string.end_date_period));
        Button button = this.a2;
        if (button != null) {
            button.setText(V0() ? H(R.string.next) : H(R.string.apply));
        }
        Calendar calendar = Calendar.getInstance();
        J0().b.setMaxDate(calendar.getTimeInMillis());
        boolean zV0 = V0();
        iiy[] iiyVarArr = l2;
        if (zV0) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(2000, 0, 1);
            J0().b.setMinDate(calendar2.getTimeInMillis());
            if (W0() != 0) {
                calendar.add(5, -(W0() - 1));
                J0().b.setMinDate(calendar.getTimeInMillis());
                iiy iiyVar = iiyVarArr[3];
                r34 r34Var = this.g2;
                if (r34Var.n(this, iiyVar).longValue() != 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(TimeUnit.SECONDS.toMillis(r34Var.n(this, iiyVarArr[3]).longValue()));
                    Y0(calendar3);
                } else if (X0() == 0) {
                    Y0(calendar);
                }
            }
            if (X0() != 0) {
                calendar.setTimeInMillis(X0() * 1000);
            }
        } else {
            if (U0() == 0) {
                this.h2.j(this, iiyVarArr[4], calendar.getTimeInMillis() / 1000);
            } else {
                calendar.setTimeInMillis(U0() * 1000);
            }
            J0().b.setMinDate(X0() * 1000);
            a1(calendar);
        }
        J0().b.setDate(calendar.getTimeInMillis(), false, true);
        J0().b.setOnDateChangeListener(new be90(calendar, this, b));
        if (X0() == 0 && V0()) {
            this.f2.j(this, iiyVarArr[2], calendar.getTimeInMillis() / 1000);
        }
    }

    @Override // a.ix5
    public final int N0() {
        return R.string.cancel;
    }

    @Override // a.ix5
    public final void O0() {
        Z0();
        y0();
    }

    @Override // a.ix5
    public final int P0() {
        return R.string.next;
    }

    @Override // a.ix5
    public final void Q0() {
        if (X0() == 0 && U0() == 0) {
            Z0();
            y0();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("BUNDLE_RESULT_START_TIME_SEC", X0());
        bundle.putLong("BUNDLE_RESULT_END_TIME_SEC", U0());
        vcc.f0(bundle, this, this.d2.n(this, l2[0]));
        y0();
    }

    @Override // a.ix5
    public final void S0() {
        Window window;
        Context contextO0 = o0();
        int iMin = Math.min(Math.min(contextO0.getResources().getDisplayMetrics().heightPixels, contextO0.getResources().getDisplayMetrics().widthPixels), contextO0.getResources().getDimensionPixelSize(R.dimen.popup_width)) - (contextO0.getResources().getDimensionPixelSize(R.dimen.space_32) * 2);
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(iMin, -2);
        window.setBackgroundDrawable(o0().getDrawable(R.drawable.background_round_content_background_new));
    }

    @Override // a.ix5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final cej J0() {
        Object objN = this.j2.n(l2[6], this);
        objN.getClass();
        return (cej) objN;
    }

    public final long U0() {
        return this.h2.n(this, l2[4]).longValue();
    }

    public final boolean V0() {
        return this.i2.n(this, l2[5]).booleanValue();
    }

    public final int W0() {
        return this.e2.n(this, l2[1]).intValue();
    }

    public final long X0() {
        return this.f2.n(this, l2[2]).longValue();
    }

    public final void Y0(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        this.f2.j(this, l2[2], timeInMillis);
    }

    public final void Z0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_RESULT_CANCELED", true);
        vcc.f0(bundle, this, this.d2.n(this, l2[0]));
    }

    public final void a1(Calendar calendar) {
        if (!DateUtils.isToday(calendar.getTimeInMillis())) {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
        }
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        this.h2.j(this, l2[4], timeInMillis);
    }
}
