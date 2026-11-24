package a;

import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.BorderDateTimeModel;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/fhq0;", "La/nw5;", "La/ssh;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fhq0 extends nw5<ssh> {
    public final yg40 e2 = yg40.FIVE;
    public final zz2 f2 = new zz2("KEY_TIME_FILTER");
    public final r34 g2 = new r34("KEY_START_TIME_FILTER");
    public final r34 h2 = new r34("KEY_END_TIME_FILTER");
    public final cgx0 i2 = new cgx0("KEY_IS_DAY_FILTER");
    public final cgx0 j2 = new cgx0("KEY_IS_ASCENDING_DATE");
    public final cgx0 k2 = new cgx0("KEY_CYBER");
    public final cgx0 l2 = new cgx0("KEY_FROM_CHAMPS");
    public long m2;
    public ygq0 n2;
    public Pair o2;
    public final nae0 p2;
    public static final /* synthetic */ iiy[] r2 = {new ez40(fhq0.class, "selectedTimeFilter", "getSelectedTimeFilter()I", 0), new ez40(fhq0.class, "startTime", "getStartTime()J", 0), new ez40(fhq0.class, "endTime", "getEndTime()J", 0), new ez40(fhq0.class, "isDayFilter", "isDayFilter()Z", 0), new ez40(fhq0.class, "isAscendingDate", "isAscendingDate()Z", 0), new ez40(fhq0.class, "cyber", "getCyber()Z", 0), new ez40(fhq0.class, "fromChamps", "getFromChamps()Z", 0), new j0d0(fhq0.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergameBottomSheetTimeFilterDialogBinding;", 0)};
    public static final m6m0 q2 = new m6m0((byte) 20);
    public static final String s2 = fhq0.class.getName();

    public fhq0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(12, si30.a(((double) calendar.get(12)) / 5.0d) * 5);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.m2 = calendar.getTimeInMillis();
        this.n2 = ygq0.NOT;
        this.o2 = new Pair(new ynq0(-1L), new ynq0(-1L));
        this.p2 = ltt0.p(this, ehq0.f7820a);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.p2.n(r2[7], this);
        objN.getClass();
        return (ssh) objN;
    }

    @Override // a.nw5
    public final void O0() {
        V0();
        C().u0("RESULT_KEY_DATE_TIME_CALENDAR_REQUEST", this, new b0l0(this, (byte) 18));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.time_filter);
        strH.getClass();
        return strH;
    }

    public final void T0(ygq0 ygq0Var) {
        byte b = ygq0Var.f42598a;
        iiy[] iiyVarArr = r2;
        this.f2.I(this, iiyVarArr[0], b);
        this.n2 = ygq0Var;
        vcc.f0(i120.V(new Pair("REQUEST_TIME_FILTER", new hhq0(ygq0Var, this.g2.n(this, iiyVarArr[1]).longValue(), this.h2.n(this, iiyVarArr[2]).longValue()))), this, "REQUEST_TIME_FILTER");
        y0();
    }

    public final void U0() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.m2);
        BorderDateTimeModel borderDateTimeModel = new BorderDateTimeModel(bsr0.g0(calendar.getTimeInMillis(), calendar), new TimeOfDay23(calendar.get(11), calendar.get(12)));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 1);
        BorderDateTimeModel borderDateTimeModel2 = new BorderDateTimeModel(bsr0.g0(calendar2.getTimeInMillis(), calendar2), null);
        nwd nwdVar = xej.l2;
        String strH = H(R.string.calendar_date_module_set_period);
        strH.getClass();
        iiy[] iiyVarArr = r2;
        Long lN = this.g2.n(this, iiyVarArr[1]);
        if (lN.longValue() <= 0) {
            lN = null;
        }
        long jLongValue = lN != null ? lN.longValue() : this.m2;
        Long lN2 = this.h2.n(this, iiyVarArr[2]);
        DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = new DateRangeWithTimeCalendarBottomSheetParams(strH, borderDateTimeModel, borderDateTimeModel2, ulq0.f35886a, this.e2, Long.valueOf(jLongValue), lN2.longValue() > 0 ? lN2 : null);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        nwdVar.getClass();
        nwd.f(dateRangeWithTimeCalendarBottomSheetParams, eVarC);
    }

    public final void V0() {
        List listC;
        iiy[] iiyVarArr = r2;
        ynq0 ynq0Var = new ynq0(this.g2.n(this, iiyVarArr[1]).longValue());
        long jLongValue = this.h2.n(this, iiyVarArr[2]).longValue();
        Pair pair = new Pair(ynq0Var, new ynq0(jLongValue));
        Object objN = this.p2.n(iiyVarArr[7], this);
        objN.getClass();
        RecyclerView recyclerView = ((ssh) objN).b;
        ygq0 ygq0Var = this.n2;
        ygq0 ygq0Var2 = ygq0.CUSTOM_DATE;
        zz2 zz2Var = this.f2;
        if (ygq0Var == ygq0Var2 && jLongValue == -1) {
            ygq0 ygq0Var3 = ygq0.NOT;
            this.n2 = ygq0Var3;
            zz2Var.I(this, iiyVarArr[0], ipm0.i(ygq0Var3));
        } else {
            j6m0 j6m0Var = ygq0.b;
            int iIntValue = zz2Var.n(this, iiyVarArr[0]).intValue();
            j6m0Var.getClass();
            this.n2 = j6m0.a(iIntValue);
        }
        this.o2 = pair;
        ygq0 ygq0Var4 = this.n2;
        if (this.l2.n(this, iiyVarArr[6]).booleanValue()) {
            ygq0.b.getClass();
            listC = j6m0.d();
        } else {
            if (this.k2.n(this, iiyVarArr[5]).booleanValue()) {
                ygq0.b.getClass();
                listC = q3d.j(ygq0.NOT, ygq0.M_30, ygq0.H_1, ygq0.H_2, ygq0.H_6, ygq0.H_12, ygq0.H_24, ygq0.H_48, ygq0Var2);
            } else {
                j6m0 j6m0Var2 = ygq0.b;
                boolean zBooleanValue = this.i2.n(this, iiyVarArr[3]).booleanValue();
                j6m0Var2.getClass();
                listC = j6m0.c(zBooleanValue);
            }
        }
        recyclerView.setAdapter(new zgq0(ygq0Var4, listC, new w6q0(1, this, fhq0.class, "onFilterSelected", "onFilterSelected(Lorg/xplatform/feed/domain/models/TimeFilter;)V", 0, (byte) 11), new cym0(0, this, fhq0.class, "onSelectTimePeriod", "onSelectTimePeriod()V", 0, (byte) 13), new cym0(0, this, fhq0.class, "onSelectTimePeriod", "onSelectTimePeriod()V", 0, (byte) 14), pair, new cym0(0, this, fhq0.class, "onSelectTimeTitleClick", "onSelectTimeTitleClick()V", 0, (byte) 15)));
        recyclerView.m(new wn8(epv0.U(R.drawable.divider_with_spaces, o0()), (byte) 1));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        J0();
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        T0(this.n2);
    }
}
