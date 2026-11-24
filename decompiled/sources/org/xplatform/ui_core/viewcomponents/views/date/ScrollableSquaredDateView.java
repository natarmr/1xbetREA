package org.xplatform.ui_core.viewcomponents.views.date;

import a.a8z;
import a.ach0;
import a.aif0;
import a.aqd0;
import a.dtb;
import a.e1a0;
import a.j5d;
import a.jf4;
import a.jtv;
import a.maz;
import a.msj;
import a.n900;
import a.o6x;
import a.oh60;
import a.pku0;
import a.r3d;
import a.r6x;
import a.rv00;
import a.sue0;
import a.the0;
import a.w0h0;
import a.wez;
import a.yge0;
import a.yz3;
import a.zbh0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ScrollableSquaredDateView extends FrameLayout {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47215a;
    public final boolean b;
    public final boolean c;
    public final e1a0 d;
    public final AnonymousClass4 e;
    public ach0 f;
    public Function1 g;
    public boolean h;
    public boolean i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47216a;
        public final Date b;
        public final Parcelable c;

        public SavedState(Parcelable parcelable, Date date, Parcelable parcelable2) {
            date.getClass();
            this.f47216a = parcelable;
            this.b = date;
            this.c = parcelable2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47216a, i);
            parcel.writeSerializable(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v18, types: [org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView$4] */
    public ScrollableSquaredDateView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        r6x o6xVar = rv00.q;
        context.getClass();
        super(context, attributeSet2, 0);
        this.f47215a = maz.a(wez.b, new sue0(this, this, (byte) 12));
        this.f = jtv.v;
        this.g = new w0h0((byte) 20);
        setClickable(true);
        if (attributeSet2 == null) {
            this.b = false;
            this.c = true;
            this.d = new e1a0(o6xVar, new aif0(1, this, ScrollableSquaredDateView.class, "onSelectedDateChanged", "onSelectedDateChanged(Ljava/util/Date;)V", 0, (byte) 26), new Date(0L));
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, aqd0.t);
            this.b = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(2, true);
            long j2 = (long) typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
            long j3 = (long) typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
                TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet2, new int[]{R.attr.background});
                typedArrayObtainStyledAttributes2.getClass();
                TypedValue typedValue = j5d.f15927a;
                Context context2 = getContext();
                context2.getClass();
                int color = typedArrayObtainStyledAttributes2.getColor(0, j5d.a(context2, org.xbet.client1.R.attr.uikitBackground, false));
                typedArrayObtainStyledAttributes2.recycle();
                o6xVar = new o6x(color);
            }
            e1a0 e1a0Var = new e1a0(o6xVar, new aif0(1, this, ScrollableSquaredDateView.class, "onSelectedDateChanged", "onSelectedDateChanged(Ljava/util/Date;)V", 0, (byte) 27), new Date(0L));
            this.d = e1a0Var;
            if (1 <= j2 && j2 < j3) {
                Date date = new Date(j2);
                Date date2 = new Date(j3);
                if (date.after(date2)) {
                    jf4.n("startDate param must not be after endDate");
                    throw null;
                }
                this.i = true;
                ArrayList arrayList = new ArrayList();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date2);
                while (true) {
                    if (!calendar.before(calendar2) && (calendar.get(5) != calendar2.get(5) || calendar.get(2) != calendar2.get(2) || calendar.get(1) != calendar2.get(1))) {
                        break;
                    }
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(calendar.getTime());
                    arrayList.add(calendar3);
                    calendar.add(5, 1);
                }
                int iD = e1a0Var.d();
                ((yz3) e1a0Var.g).b(arrayList, null);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Calendar) it.next()).getTime());
                }
                if (b(arrayList2)) {
                    e(arrayList2, !this.h && iD == 0);
                } else if (c(iD)) {
                    H0(e1a0Var.d() - 1);
                }
                f();
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.e = new LinearLayoutManager(context, this.b) { // from class: org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView.4
            public final /* synthetic */ Context g1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, 0, z);
                this.g1 = context;
            }

            @Override // androidx.recyclerview.widget.b
            public final void R0(RecyclerView recyclerView, the0 the0Var, int i2) {
                if (i2 != -1) {
                    n900 n900Var = new n900(this.g1);
                    n900Var.f32207a = i2;
                    S0(n900Var);
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
            public final boolean T0() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
            public final void s0(msj msjVar, the0 the0Var) {
                msjVar.getClass();
                try {
                    super.s0(msjVar, the0Var);
                } catch (Exception unused) {
                }
            }
        };
    }

    public static Date a(List list, Date date, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Date date2 = (Date) obj2;
            if (!z && !date2.after(date)) {
                Date date3 = new Date(System.currentTimeMillis());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date3);
                Pair pair = new Pair(calendar, calendar2);
                if (!dtb.C(pair, 1) || !dtb.C(pair, 2) || !dtb.C(pair, 5)) {
                }
            }
            arrayList.add(obj2);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jAbs = Math.abs(((Date) next).getTime() - date.getTime());
                do {
                    Object next2 = it.next();
                    long jAbs2 = Math.abs(((Date) next2).getTime() - date.getTime());
                    if (jAbs > jAbs2) {
                        next = next2;
                        jAbs = jAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Date) obj;
    }

    private final Parcelable getActualLayoutManagerState() {
        Parcelable parcelableV0;
        b layoutManager = getBinding().f27152a.getLayoutManager();
        if (layoutManager != null && (parcelableV0 = layoutManager.v0()) != null) {
            return parcelableV0;
        }
        ach0 ach0Var = this.f;
        zbh0 zbh0Var = ach0Var instanceof zbh0 ? (zbh0) ach0Var : null;
        if (zbh0Var != null) {
            return zbh0Var.f44116a;
        }
        return null;
    }

    private final pku0 getBinding() {
        return (pku0) this.f47215a.getValue();
    }

    public final boolean b(List list) {
        if (!this.c) {
            return false;
        }
        e1a0 e1a0Var = this.d;
        Date time = ((Calendar) e1a0Var.h).getTime();
        time.getClass();
        if (time.getTime() == 0) {
            return true;
        }
        Date time2 = ((Calendar) e1a0Var.h).getTime();
        time2.getClass();
        return !list.contains(time2);
    }

    public final boolean c(int i) {
        return !this.c && i == 0 && this.b && !this.h && this.d.d() > 0;
    }

    public final void d(Date date) {
        RecyclerView recyclerView = getBinding().f27152a;
        recyclerView.post(new oh60(recyclerView, this, (byte) 18));
        this.g.invoke(date);
    }

    public final void e(List list, boolean z) {
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        int i = 0;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        time.getClass();
        Date dateA = a(list, time, false);
        if (dateA == null) {
            dateA = a(list, time, true);
        }
        if (dateA != null) {
            e1a0 e1a0Var = this.d;
            e1a0Var.getClass();
            ((Calendar) e1a0Var.h).setTime(dateA);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((Date) it.next()).getTime() == dateA.getTime()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1 || i >= e1a0Var.d()) {
                return;
            }
            AnonymousClass4 anonymousClass4 = this.e;
            if (anonymousClass4.f1() < i && i < anonymousClass4.h1()) {
                e1a0Var.h(i);
            }
            if (z) {
                anonymousClass4.H0(i);
            }
            this.g.invoke(dateA);
        }
    }

    public final void f() {
        RecyclerView recyclerView = getBinding().f27152a;
        ach0 ach0Var = this.f;
        yge0 adapter = recyclerView.getAdapter();
        e1a0 e1a0Var = this.d;
        if (!Intrinsics.d(adapter, e1a0Var) || e1a0Var.d() <= 0) {
            return;
        }
        b layoutManager = recyclerView.getLayoutManager();
        AnonymousClass4 anonymousClass4 = this.e;
        if (Intrinsics.d(layoutManager, anonymousClass4) && (ach0Var instanceof zbh0)) {
            anonymousClass4.u0(((zbh0) ach0Var).f44116a);
            this.f = jtv.v;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().f27152a.setAdapter(this.d);
        getBinding().f27152a.setLayoutManager(this.e);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f = new zbh0(v0());
        getBinding().f27152a.setAdapter(null);
        getBinding().f27152a.setLayoutManager(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        addView(getBinding().f27152a);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        Date date = savedState.b;
        e1a0 e1a0Var = this.d;
        e1a0Var.getClass();
        date.getClass();
        ((Calendar) e1a0Var.h).setTime(date);
        if (date.getTime() != 0) {
            this.g.invoke(date);
        }
        Parcelable parcelable2 = savedState.c;
        this.f = parcelable2 != null ? new zbh0(parcelable2) : jtv.v;
        this.h = true;
        super.onRestoreInstanceState(savedState.f47216a);
        f();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        this.h = false;
        if (!this.i) {
            return super.onSaveInstanceState();
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Date time = ((Calendar) this.d.h).getTime();
        time.getClass();
        Parcelable actualLayoutManagerState = getActualLayoutManagerState();
        if (!this.i) {
            actualLayoutManagerState = null;
        }
        return new SavedState(parcelableOnSaveInstanceState, time, actualLayoutManagerState);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        getBinding().f27152a.setClickable(z);
        super.setClickable(z);
    }

    public final void setDateRange(List<? extends Date> list) {
        list.getClass();
        this.i = true;
        e1a0 e1a0Var = this.d;
        int iD = e1a0Var.d();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Date date : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            arrayList.add(calendar);
        }
        ((yz3) e1a0Var.g).b(arrayList, null);
        if (b(list)) {
            e(list, !this.h && iD == 0);
        } else if (c(iD)) {
            H0(e1a0Var.d() - 1);
        }
        f();
    }

    public final void setDateSelectedListener(Function1<? super Date, Unit> function1) {
        function1.getClass();
        this.g = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollableSquaredDateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollableSquaredDateView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
