package a;

import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectDateTimeScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/f2i0;", "La/stl;", "La/g2i0;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f2i0 extends stl<g2i0> {
    public final nae0 g2 = ltt0.p(this, e2i0.f7088a);
    public final khf0 h2 = new khf0("SELECT_DATE_TIME_SCREEN_PARAMS");
    public final n0o0 i2 = maz.b(new a7g0(this, (byte) 26));
    public final ArrayList j2 = new ArrayList();
    public final ArrayList k2 = new ArrayList();
    public final ArrayList l2 = new ArrayList();
    public final ArrayList m2 = new ArrayList();
    public final ArrayList n2 = new ArrayList();
    public final Calendar o2 = Calendar.getInstance();
    public final Calendar p2 = Calendar.getInstance();
    public static final /* synthetic */ iiy[] r2 = {new j0d0(f2i0.class, "binding", "getBinding()Lorg/xplatform/feed/impl/databinding/SelectDateTimeDialogBinding;", 0), new ez40(f2i0.class, "params", "getParams()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;", 0)};
    public static final eke0 q2 = new eke0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.c2i0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.c2i0] */
    @Override // a.stl
    public final void S0() {
        String strH;
        String strH2;
        String strH3;
        int i;
        int iOrdinal = Z0().d.ordinal();
        final byte b = 1;
        if (iOrdinal == 0) {
            strH = H(R.string.start_date_period);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            strH = H(R.string.end_date_period);
        }
        strH.getClass();
        I0(new kp8(strH, R.style.TextStyle_Title_Bold_M));
        int iOrdinal2 = Z0().d.ordinal();
        if (iOrdinal2 == 0) {
            strH2 = H(R.string.cancel);
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                return;
            }
            strH2 = H(R.string.back_text);
        }
        strH2.getClass();
        int iOrdinal3 = Z0().d.ordinal();
        if (iOrdinal3 == 0) {
            strH3 = H(R.string.next);
        } else {
            if (iOrdinal3 != 1) {
                t9f.b();
                return;
            }
            strH3 = H(R.string.apply_action);
        }
        strH3.getClass();
        int i2 = 0;
        Object[] objArr = 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        J0(M0(new jp8(strH2, strH3, new View.OnClickListener(this) { // from class: a.c2i0
            public final /* synthetic */ f2i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr2;
                f2i0 f2i0Var = this.b;
                switch (b2) {
                    case 0:
                        eke0 eke0Var = f2i0.q2;
                        if (f2i0Var.Z0().d == j2i0.b) {
                            vcc.f0(i120.U(), f2i0Var, f2i0Var.Z0().e);
                        }
                        f2i0Var.x0();
                        break;
                    default:
                        eke0 eke0Var2 = f2i0.q2;
                        String str = f2i0Var.Z0().c;
                        String str2 = f2i0Var.Z0().c;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeZone(TimeZone.getDefault());
                        calendar.setTime((Date) f2i0Var.k2.get(f2i0Var.Q0().b.getValue()));
                        if (f2i0Var.a1()) {
                            calendar.set(11, f2i0Var.Q0().c.getValue());
                        } else {
                            calendar.set(9, dqm0.r(f2i0Var.Q0().f.getValue(), f2i0Var.m2).b ? 1 : 0);
                            calendar.set(10, f2i0Var.Q0().c.getValue());
                        }
                        calendar.set(12, Integer.parseInt((String) f2i0Var.n2.get(f2i0Var.Q0().d.getValue())));
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        vcc.f0(i120.V(new Pair(str2, calendar.getTime())), f2i0Var, str);
                        f2i0Var.q0().postDelayed(new wss(f2i0Var, (byte) 29), 85L);
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: a.c2i0
            public final /* synthetic */ f2i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                f2i0 f2i0Var = this.b;
                switch (b2) {
                    case 0:
                        eke0 eke0Var = f2i0.q2;
                        if (f2i0Var.Z0().d == j2i0.b) {
                            vcc.f0(i120.U(), f2i0Var, f2i0Var.Z0().e);
                        }
                        f2i0Var.x0();
                        break;
                    default:
                        eke0 eke0Var2 = f2i0.q2;
                        String str = f2i0Var.Z0().c;
                        String str2 = f2i0Var.Z0().c;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeZone(TimeZone.getDefault());
                        calendar.setTime((Date) f2i0Var.k2.get(f2i0Var.Q0().b.getValue()));
                        if (f2i0Var.a1()) {
                            calendar.set(11, f2i0Var.Q0().c.getValue());
                        } else {
                            calendar.set(9, dqm0.r(f2i0Var.Q0().f.getValue(), f2i0Var.m2).b ? 1 : 0);
                            calendar.set(10, f2i0Var.Q0().c.getValue());
                        }
                        calendar.set(12, Integer.parseInt((String) f2i0Var.n2.get(f2i0Var.Q0().d.getValue())));
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        vcc.f0(i120.V(new Pair(str2, calendar.getTime())), f2i0Var, str);
                        f2i0Var.q0().postDelayed(new wss(f2i0Var, (byte) 29), 85L);
                        break;
                }
            }
        })));
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_8);
        FrameLayout frameLayout = P0().c;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        frameLayout.setLayoutParams(marginLayoutParams);
        Q0().e.setText(String.valueOf(Calendar.getInstance().get(1)));
        j2i0 j2i0Var = Z0().d;
        j2i0 j2i0Var2 = j2i0.b;
        Calendar calendar = this.o2;
        if (j2i0Var == j2i0Var2) {
            calendar.setTime(Z0().b);
            calendar.add(12, 5);
        } else {
            calendar.setTime(Z0().b);
        }
        if (Z0().i) {
            Q0().d.setVisibility(8);
            Q0().c.setVisibility(8);
            Q0().f.setVisibility(8);
        }
        Date date = Z0().b;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(TimeZone.getDefault());
        calendar2.setTime(date);
        final int i3 = calendar2.get(6);
        NumberPicker numberPicker = Q0().b;
        final Object[] objArr3 = objArr == true ? 1 : 0;
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: a.d2i0
            public final /* synthetic */ f2i0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i4, int i5) {
                byte b2 = objArr3;
                int i6 = i3;
                f2i0 f2i0Var = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = f2i0Var.m2;
                        Date date2 = (Date) f2i0Var.k2.get(numberPicker2.getValue());
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTimeZone(TimeZone.getDefault());
                        calendar3.setTime(date2);
                        int i7 = calendar3.get(6);
                        Calendar calendar4 = f2i0Var.o2;
                        calendar4.setTime(date2);
                        if (i7 != i6 || f2i0Var.Y0() > f2i0Var.Z0().b.getHours()) {
                            calendar4.set(11, 0);
                            calendar4.set(12, 0);
                        } else if (f2i0Var.Z0().d == j2i0.b) {
                            calendar4.setTime(f2i0Var.Z0().b);
                            calendar4.add(12, 5);
                        } else {
                            calendar4.setTime(f2i0Var.Z0().b);
                        }
                        if (f2i0Var.a1()) {
                            f2i0Var.c1(false);
                        } else {
                            if (dqm0.r(f2i0Var.Q0().f.getValue(), arrayList) == vhq0.d) {
                                arrayList.getClass();
                                if (arrayList.size() == 2) {
                                    f2i0Var.b1(0);
                                } else {
                                    f2i0Var.b1(calendar4.get(10));
                                }
                            } else {
                                f2i0Var.b1(calendar4.get(10));
                            }
                            f2i0Var.e1(calendar4);
                        }
                        f2i0Var.d1(false);
                        break;
                    default:
                        ArrayList arrayList2 = f2i0Var.k2;
                        Calendar calendar5 = f2i0Var.o2;
                        Date date3 = (Date) arrayList2.get(f2i0Var.Q0().b.getValue());
                        Calendar calendar6 = Calendar.getInstance();
                        calendar6.setTimeZone(TimeZone.getDefault());
                        calendar6.setTime(date3);
                        int i8 = calendar6.get(6);
                        if (f2i0Var.Y0() != f2i0Var.Z0().b.getHours() || i8 != i6) {
                            calendar5.set(12, 0);
                        } else if (f2i0Var.Z0().d == j2i0.b) {
                            calendar5.setTime(f2i0Var.Z0().b);
                            calendar5.add(12, 5);
                        } else {
                            calendar5.setTime(f2i0Var.Z0().b);
                        }
                        f2i0Var.d1(false);
                        break;
                }
            }
        });
        Q0().c.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: a.d2i0
            public final /* synthetic */ f2i0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i4, int i5) {
                byte b2 = b;
                int i6 = i3;
                f2i0 f2i0Var = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = f2i0Var.m2;
                        Date date2 = (Date) f2i0Var.k2.get(numberPicker2.getValue());
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTimeZone(TimeZone.getDefault());
                        calendar3.setTime(date2);
                        int i7 = calendar3.get(6);
                        Calendar calendar4 = f2i0Var.o2;
                        calendar4.setTime(date2);
                        if (i7 != i6 || f2i0Var.Y0() > f2i0Var.Z0().b.getHours()) {
                            calendar4.set(11, 0);
                            calendar4.set(12, 0);
                        } else if (f2i0Var.Z0().d == j2i0.b) {
                            calendar4.setTime(f2i0Var.Z0().b);
                            calendar4.add(12, 5);
                        } else {
                            calendar4.setTime(f2i0Var.Z0().b);
                        }
                        if (f2i0Var.a1()) {
                            f2i0Var.c1(false);
                        } else {
                            if (dqm0.r(f2i0Var.Q0().f.getValue(), arrayList) == vhq0.d) {
                                arrayList.getClass();
                                if (arrayList.size() == 2) {
                                    f2i0Var.b1(0);
                                } else {
                                    f2i0Var.b1(calendar4.get(10));
                                }
                            } else {
                                f2i0Var.b1(calendar4.get(10));
                            }
                            f2i0Var.e1(calendar4);
                        }
                        f2i0Var.d1(false);
                        break;
                    default:
                        ArrayList arrayList2 = f2i0Var.k2;
                        Calendar calendar5 = f2i0Var.o2;
                        Date date3 = (Date) arrayList2.get(f2i0Var.Q0().b.getValue());
                        Calendar calendar6 = Calendar.getInstance();
                        calendar6.setTimeZone(TimeZone.getDefault());
                        calendar6.setTime(date3);
                        int i8 = calendar6.get(6);
                        if (f2i0Var.Y0() != f2i0Var.Z0().b.getHours() || i8 != i6) {
                            calendar5.set(12, 0);
                        } else if (f2i0Var.Z0().d == j2i0.b) {
                            calendar5.setTime(f2i0Var.Z0().b);
                            calendar5.add(12, 5);
                        } else {
                            calendar5.setTime(f2i0Var.Z0().b);
                        }
                        f2i0Var.d1(false);
                        break;
                }
            }
        });
        Q0().f.setOnValueChangedListener(new dlq0(this, (byte) 3));
        boolean z = Z0().f;
        ArrayList arrayList = this.k2;
        Calendar calendar3 = this.p2;
        ArrayList arrayList2 = this.j2;
        if (z) {
            if (Z0().h) {
                calendar3.setTime(new Date());
            } else {
                calendar3.set(1, calendar3.get(1) + 1);
            }
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(Z0().b);
            Calendar calendar5 = Calendar.getInstance();
            calendar5.setTime(new Date(rv00.n(rv00.k, calendar3.getTime().getTime(), 12)));
            while (!calendar4.after(calendar5)) {
                Date time = calendar4.getTime();
                time.getClass();
                arrayList.add(time);
                arrayList2.add(V0(calendar4));
                calendar4.add(5, 1);
            }
        } else {
            if (Z0().h) {
                calendar3.setTime(Z0().g);
            } else {
                calendar3.set(1, calendar3.get(1) - 1);
            }
            Calendar calendar6 = Calendar.getInstance();
            calendar6.setTime(Z0().b);
            Calendar calendar7 = Calendar.getInstance();
            calendar7.setTime(calendar3.getTime());
            while (!calendar6.before(calendar7)) {
                Date time2 = calendar6.getTime();
                time2.getClass();
                arrayList.add(time2);
                arrayList2.add(V0(calendar6));
                calendar6.add(5, -1);
            }
        }
        d1(false);
        if (a1()) {
            c1(false);
            Q0().f.setVisibility(8);
        } else {
            if (Z0().f46661a > 0) {
                Calendar calendar8 = Calendar.getInstance();
                calendar8.setTimeInMillis(Z0().f46661a);
                boolean z2 = calendar.get(9) == 0;
                boolean z3 = calendar8.get(9) == 0;
                if (z2 == z3 || z3) {
                    b1(calendar.get(10));
                } else {
                    b1(calendar8.get(10));
                }
            } else {
                b1(calendar.get(10));
            }
            calendar.getClass();
            e1(calendar);
            Q0().f.setVisibility(0);
        }
        int size = arrayList2.size() == 0 ? 0 : arrayList2.size() - 1;
        NumberPicker numberPicker2 = Q0().b;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(size);
        numberPicker2.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
        numberPicker2.setWrapSelectorWheel(false);
        if (Z0().f46661a == -1) {
            return;
        }
        Calendar calendar9 = Calendar.getInstance();
        calendar9.setTimeInMillis(Z0().f46661a);
        if (calendar.get(6) < calendar9.get(6)) {
            d1(true);
            if (a1()) {
                c1(true);
            } else {
                b1(0);
                e1(calendar9);
            }
        } else if (calendar.get(11) < calendar9.get(11)) {
            d1(true);
        }
        if (a1()) {
            i = Integer.parseInt(X0(11, Integer.valueOf(calendar9.get(11))));
        } else {
            int i4 = calendar9.get(10);
            Integer numValueOf = Integer.valueOf(i4);
            if (i4 == 0) {
                numValueOf = null;
            }
            i = Integer.parseInt(X0(10, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 12)));
        }
        int iIndexOf = this.n2.indexOf(X0(12, Integer.valueOf(calendar9.get(12))));
        int iIndexOf2 = arrayList2.indexOf(V0(calendar9));
        NumberPicker numberPicker3 = Q0().c;
        int length = Q0().c.getDisplayedValues().length;
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        numberPicker3.setValue(i);
        NumberPicker numberPicker4 = Q0().d;
        int length2 = Q0().d.getDisplayedValues().length;
        if (iIndexOf < 0) {
            iIndexOf = 0;
        } else if (iIndexOf > length2) {
            iIndexOf = length2;
        }
        numberPicker4.setValue(iIndexOf);
        NumberPicker numberPicker5 = Q0().b;
        int length3 = Q0().b.getDisplayedValues().length;
        if (iIndexOf2 < 0) {
            iIndexOf2 = 0;
        } else if (iIndexOf2 > length3) {
            iIndexOf2 = length3;
        }
        numberPicker5.setValue(iIndexOf2);
        if (a1()) {
            return;
        }
        int i5 = calendar9.get(9);
        NumberPicker numberPicker6 = Q0().f;
        int length4 = Q0().f.getDisplayedValues().length;
        if (i5 >= 0) {
            i2 = i5 > length4 ? length4 : i5;
        }
        numberPicker6.setValue(i2);
    }

    public final String V0(Calendar calendar) {
        if (!DateUtils.isToday(calendar.getTime().getTime())) {
            return this.o2.get(1) != calendar.get(1) ? rdj.c(rdj.f30294a, sdj.UNIQUE_7, calendar.getTime(), null, 60) : rdj.c(rdj.f30294a, sdj.UNIQUE_6, calendar.getTime(), null, 60);
        }
        String strH = H(R.string.today);
        strH.getClass();
        return strH;
    }

    @Override // a.stl
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final g2i0 Q0() {
        Object objN = this.g2.n(r2[0], this);
        objN.getClass();
        return (g2i0) objN;
    }

    public final String X0(int i, Integer num) {
        Locale locale = o0().getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        return String.format(locale, "%1$02d", Arrays.copyOf(new Object[]{num}, 1));
    }

    public final int Y0() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.setTime((Date) this.k2.get(Q0().b.getValue()));
        if (a1()) {
            calendar.set(11, Q0().c.getValue());
        } else {
            calendar.set(9, dqm0.r(Q0().f.getValue(), this.m2).b ? 1 : 0);
            calendar.set(10, Q0().c.getValue());
        }
        return calendar.getTime().getHours();
    }

    public final SelectDateTimeScreenParams Z0() {
        return (SelectDateTimeScreenParams) this.h2.n(this, r2[1]);
    }

    public final boolean a1() {
        return ((Boolean) this.i2.getValue()).booleanValue();
    }

    public final void b1(int i) {
        NumberPicker numberPicker = Q0().c;
        numberPicker.setDisplayedValues(null);
        numberPicker.setMinValue(i);
        numberPicker.setMaxValue(11);
        ArrayList arrayList = this.l2;
        arrayList.clear();
        while (i <= 11) {
            if (i == 0) {
                arrayList.add(X0(10, 12));
            } else {
                arrayList.add(X0(10, Integer.valueOf(i)));
            }
            i++;
        }
        Q0().c.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    public final void c1(boolean z) {
        NumberPicker numberPicker = Q0().c;
        numberPicker.setDisplayedValues(null);
        Calendar calendar = this.o2;
        numberPicker.setMinValue(z ? 0 : calendar.get(11));
        numberPicker.setMaxValue(23);
        ArrayList arrayList = this.l2;
        arrayList.clear();
        for (int i = z ? 0 : calendar.get(11); i <= 23; i++) {
            arrayList.add(X0(11, Integer.valueOf(i)));
        }
        Q0().c.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    public final void d1(boolean z) {
        NumberPicker numberPicker = Q0().d;
        numberPicker.setDisplayedValues(null);
        numberPicker.setMinValue(0);
        ArrayList arrayList = this.n2;
        arrayList.clear();
        for (int iA = z ? 0 : si30.a(this.o2.get(12) / 5) * 5; iA <= 59; iA += 5) {
            arrayList.add(X0(12, Integer.valueOf(iA)));
        }
        Q0().d.setMaxValue(arrayList.size() - 1);
        Q0().d.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public final void e1(Calendar calendar) {
        boolean z;
        NumberPicker numberPicker = Q0().f;
        numberPicker.setDisplayedValues(null);
        numberPicker.setMinValue(0);
        ArrayList arrayList = this.m2;
        arrayList.clear();
        int i = calendar.get(9);
        vhq0 vhq0Var = vhq0.c;
        boolean z2 = i == 0;
        boolean z3 = Z0().d == j2i0.f15781a && !DateUtils.isToday(calendar.getTime().getTime());
        if (Z0().d == j2i0.b) {
            Date date = Z0().b;
            Date time = calendar.getTime();
            time.getClass();
            if (ntb.V(date, time)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z2 || z3 || z) {
            arrayList.add(vhq0.c);
        }
        arrayList.add(vhq0.d);
        NumberPicker numberPicker2 = Q0().f;
        numberPicker2.setMaxValue(arrayList.size() - 1);
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vhq0) it.next()).f37444a);
        }
        numberPicker2.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
    }
}
