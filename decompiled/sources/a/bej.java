package a;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La/bej;", "La/sik;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "<init>", "()V", "a/aej", "a/qud", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bej extends sik implements DatePickerDialog.OnDateSetListener {
    public final n0o0 Y1 = maz.b(new bmh(22));
    public xdr Z1 = new thd((byte) 10);
    public Function0 a2 = new bmh(23);
    public final zz2 b2 = new zz2("THEME");
    public final phf0 c2 = new phf0("TITLE");
    public final r34 d2 = new r34("MIN_DATE");
    public final r34 e2 = new r34("MAX_DATE");
    public final zz2 f2 = new zz2("DAY");
    public final zz2 g2 = new zz2("MONTH", -1);
    public final zz2 h2 = new zz2("YEAR");
    public static final /* synthetic */ iiy[] j2 = {new ez40(bej.class, "themeResId", "getThemeResId()I", 0), new ez40(bej.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(bej.class, "minDate", "getMinDate()J", 0), new ez40(bej.class, "maxDate", "getMaxDate()J", 0), new ez40(bej.class, "day", "getDay()I", 0), new ez40(bej.class, "month", "getMonth()I", 0), new ez40(bej.class, "year", "getYear()I", 0)};
    public static final qud i2 = new qud();

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        iiy[] iiyVarArr = j2;
        iiy iiyVar = iiyVarArr[6];
        zz2 zz2Var = this.h2;
        int iIntValue = zz2Var.n(this, iiyVar).intValue();
        n0o0 n0o0Var = this.Y1;
        int iIntValue2 = iIntValue != 0 ? zz2Var.n(this, iiyVarArr[6]).intValue() : ((Calendar) n0o0Var.getValue()).get(1);
        iiy iiyVar2 = iiyVarArr[5];
        zz2 zz2Var2 = this.g2;
        int iIntValue3 = zz2Var2.n(this, iiyVar2).intValue() != -1 ? zz2Var2.n(this, iiyVarArr[5]).intValue() : ((Calendar) n0o0Var.getValue()).get(2);
        iiy iiyVar3 = iiyVarArr[4];
        zz2 zz2Var3 = this.f2;
        int iIntValue4 = zz2Var3.n(this, iiyVar3).intValue() != 0 ? zz2Var3.n(this, iiyVarArr[4]).intValue() : ((Calendar) n0o0Var.getValue()).get(5);
        final DatePickerDialog datePickerDialog = new DatePickerDialog(o0(), this.b2.n(this, iiyVarArr[0]).intValue(), this, iIntValue2, iIntValue3, iIntValue4);
        iiy iiyVar4 = iiyVarArr[2];
        r34 r34Var = this.d2;
        long jLongValue = r34Var.n(this, iiyVar4).longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        final aej aejVar = new aej(calendar.get(1), calendar.get(2), calendar.get(5));
        long jI0 = I0();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jI0);
        final aej aejVar2 = new aej(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        datePickerDialog.getDatePicker().init(iIntValue2, iIntValue3, iIntValue4, new DatePicker.OnDateChangedListener() { // from class: a.zdj
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i, int i3, int i4) {
                qud qudVar = bej.i2;
                aej aejVar3 = aejVar;
                int i5 = aejVar3.c;
                DatePickerDialog datePickerDialog2 = datePickerDialog;
                if (i4 < i5 && i3 == aejVar3.b && i == aejVar3.f732a) {
                    datePickerDialog2.updateDate(i, i3, i5);
                }
                aej aejVar4 = aejVar2;
                int i6 = aejVar4.c;
                if (i4 > i6 && i3 == aejVar4.b && i == aejVar4.f732a) {
                    datePickerDialog2.updateDate(i, i3, i6);
                }
            }
        });
        if (I0() != 0) {
            datePickerDialog.getDatePicker().setMaxDate(I0());
        }
        if (r34Var.n(this, iiyVarArr[2]).longValue() != 0) {
            datePickerDialog.getDatePicker().setMinDate(r34Var.n(this, iiyVarArr[2]).longValue());
        }
        datePickerDialog.setTitle(this.c2.n(this, iiyVarArr[1]));
        return datePickerDialog;
    }

    public final long I0() {
        return this.e2.n(this, j2[3]).longValue();
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i3, int i4) {
        n0o0 n0o0Var = this.Y1;
        Calendar calendar = (Calendar) n0o0Var.getValue();
        calendar.set(i, i3, i4);
        calendar.set(11, 0);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (I0() == 0 || ((Calendar) n0o0Var.getValue()).getTimeInMillis() < I0()) {
            this.Z1.F(Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            this.a2.invoke();
        }
    }
}
