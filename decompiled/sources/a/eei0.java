package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Window;
import android.widget.Button;
import android.widget.CalendarView;
import java.util.Calendar;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eei0;", "La/ix5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eei0 extends ix5 {
    public long f2;
    public static final /* synthetic */ iiy[] j2 = {new ez40(eei0.class, "startDate", "getStartDate()J", 0), new ez40(eei0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(eei0.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/SendMailDatePickerViewBinding;", 0)};
    public static final lme0 i2 = new lme0((byte) 18);
    public final r34 d2 = new r34("BUNDLE_START_DATE");
    public final phf0 e2 = new phf0("BUNDLE_REQUEST_KEY");
    public boolean g2 = true;
    public final nae0 h2 = ltt0.p(this, dei0.f5953a);

    @Override // a.ix5
    public final int L0() {
        return R.style.ThemeOverlay_AppTheme_MaterialAlertDialog_New_DatePicker;
    }

    @Override // a.ix5
    public final void M0() {
        J0().d.setText(G().getString(R.string.max_period_in_days_v2, 90));
        this.g2 = U0() == 0;
        J0().e.setText(this.g2 ? H(R.string.start_date_period) : H(R.string.end_date_period));
        Button button = this.a2;
        if (button != null) {
            button.setText(this.g2 ? H(R.string.next) : H(R.string.apply));
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(U0() * 1000);
        calendar2.add(6, 89);
        Calendar calendar3 = Calendar.getInstance();
        long timeInMillis = calendar3.getTimeInMillis();
        boolean z = calendar2.getTimeInMillis() > timeInMillis || DateUtils.isToday(calendar2.getTimeInMillis());
        if (this.g2) {
            Calendar calendar4 = Calendar.getInstance();
            calendar4.add(6, -89);
            J0().b.setMinDate(calendar4.getTimeInMillis());
            J0().b.setMaxDate(calendar.getTimeInMillis());
            V0(calendar4);
            J0().b.setDate(calendar4.getTimeInMillis(), false, true);
        } else {
            J0().b.setMinDate(U0() * 1000);
            if (z) {
                J0().b.setMaxDate(timeInMillis);
                this.f2 = timeInMillis / 1000;
                W0(calendar3);
            } else {
                J0().b.setMaxDate(calendar2.getTimeInMillis());
                this.f2 = calendar2.getTimeInMillis() / 1000;
                W0(calendar2);
            }
            CalendarView calendarView = J0().b;
            calendar.getClass();
            calendarView.setDate(calendar.getTimeInMillis(), false, true);
        }
        J0().b.setOnDateChangeListener(new be90(calendar, this, (byte) 1));
    }

    @Override // a.ix5
    public final int N0() {
        return R.string.cancel;
    }

    @Override // a.ix5
    public final void O0() {
        z0(false, false, false);
    }

    @Override // a.ix5
    public final int P0() {
        return R.string.next;
    }

    @Override // a.ix5
    public final void Q0() {
        Bundle bundle = new Bundle();
        bundle.putLong("BUNDLE_RESULT_START_TIME_SEC", U0());
        bundle.putLong("BUNDLE_RESULT_END_TIME_SEC", this.f2);
        vcc.f0(bundle, this, this.e2.n(this, j2[1]));
        z0(false, false, false);
    }

    @Override // a.ix5
    public final void R0(lh30 lh30Var) {
        lh30Var.setView(J0().f9409a);
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
    public final fei0 J0() {
        Object objN = this.h2.n(j2[2], this);
        objN.getClass();
        return (fei0) objN;
    }

    public final long U0() {
        return this.d2.n(this, j2[0]).longValue();
    }

    public final void V0(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        this.d2.j(this, j2[0], timeInMillis);
    }

    public final void W0(Calendar calendar) {
        if (!DateUtils.isToday(calendar.getTimeInMillis())) {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
        }
        this.f2 = calendar.getTimeInMillis() / 1000;
    }
}
