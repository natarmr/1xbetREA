package org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod;

import a.cag;
import a.clz;
import a.cy7;
import a.dyb;
import a.fre0;
import a.hny;
import a.i9g;
import a.itt0;
import a.iun;
import a.j5d;
import a.kie0;
import a.m7g;
import a.maz;
import a.n0o0;
import a.p9g;
import a.q9g;
import a.qjj;
import a.r9g;
import a.rwj;
import a.s7n0;
import a.s9g;
import a.t9g;
import a.tkz;
import a.tvk;
import a.u0d;
import a.v4f;
import a.wbl0;
import a.x0x;
import a.yag;
import a.yje;
import a.ymx;
import a.ys10;
import a.yum0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.container.CalendarEventTextView;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberCalendarPeriodView extends FrameLayout {
    public static final /* synthetic */ int p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yag f46485a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final float k;
    public final int l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public final ArrayList o;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarPeriodView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        this.f46485a = yag.d;
        TypedValue typedValue = j5d.f15927a;
        this.b = j5d.a(context, R.attr.uikitBackgroundContent, false);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        boolean z = context.getResources().getBoolean(R.bool.isTablet);
        this.f = maz.b(new Function0() { // from class: a.j9g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int dimensionPixelSize;
                byte b3 = b2;
                CyberCalendarPeriodView cyberCalendarPeriodView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_16 : R.dimen.size_24);
                        break;
                    case 1:
                        int i3 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_28 : R.dimen.size_40);
                        break;
                    default:
                        int i4 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.space_4 : R.dimen.space_8);
                        break;
                }
                return Integer.valueOf(dimensionPixelSize);
            }
        });
        final byte b3 = 1;
        this.g = maz.b(new Function0() { // from class: a.j9g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int dimensionPixelSize;
                byte b4 = b3;
                CyberCalendarPeriodView cyberCalendarPeriodView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_16 : R.dimen.size_24);
                        break;
                    case 1:
                        int i3 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_28 : R.dimen.size_40);
                        break;
                    default:
                        int i4 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.space_4 : R.dimen.space_8);
                        break;
                }
                return Integer.valueOf(dimensionPixelSize);
            }
        });
        this.h = maz.b(new Function0() { // from class: a.j9g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int dimensionPixelSize;
                byte b4 = b;
                CyberCalendarPeriodView cyberCalendarPeriodView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_16 : R.dimen.size_24);
                        break;
                    case 1:
                        int i3 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.size_28 : R.dimen.size_40);
                        break;
                    default:
                        int i4 = CyberCalendarPeriodView.p;
                        dimensionPixelSize = context2.getResources().getDimensionPixelSize(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.space_4 : R.dimen.space_8);
                        break;
                }
                return Integer.valueOf(dimensionPixelSize);
            }
        });
        this.i = maz.b(new Function0(this) { // from class: a.k9g
            public final /* synthetic */ CyberCalendarPeriodView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                CyberCalendarPeriodView cyberCalendarPeriodView = this.b;
                switch (b4) {
                    case 0:
                        return Integer.valueOf(CyberCalendarPeriodView.e(cyberCalendarPeriodView));
                    default:
                        int i2 = CyberCalendarPeriodView.p;
                        return Float.valueOf(cyberCalendarPeriodView.getResources().getDimension(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.text_12 : R.dimen.text_14));
                }
            }
        });
        this.j = maz.b(new Function0(this) { // from class: a.k9g
            public final /* synthetic */ CyberCalendarPeriodView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                CyberCalendarPeriodView cyberCalendarPeriodView = this.b;
                switch (b4) {
                    case 0:
                        return Integer.valueOf(CyberCalendarPeriodView.e(cyberCalendarPeriodView));
                    default:
                        int i2 = CyberCalendarPeriodView.p;
                        return Float.valueOf(cyberCalendarPeriodView.getResources().getDimension(cyberCalendarPeriodView.f46485a == yag.d ? R.dimen.text_12 : R.dimen.text_14));
                }
            }
        });
        int dimensionPixelSize = getResources().getDimensionPixelSize(z ? R.dimen.space_52 : R.dimen.space_0);
        this.k = getResources().getDimension(R.dimen.corner_radius_8);
        this.l = context.getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize * 2);
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = new ArrayList();
        setMinimumHeight(context.getResources().getDimensionPixelSize(z ? R.dimen.size_122 : R.dimen.size_120));
    }

    public static final int e(CyberCalendarPeriodView cyberCalendarPeriodView) {
        return cyberCalendarPeriodView.getEventViewHeight() + cyberCalendarPeriodView.getEventSpace();
    }

    private final Drawable getDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.k);
        gradientDrawable.setColor(this.b);
        return gradientDrawable;
    }

    private final int getEventSpace() {
        return ((Number) this.h.getValue()).intValue();
    }

    private final int getEventViewHeight() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final int getImageSize() {
        return ((Number) this.f.getValue()).intValue();
    }

    private final int getMaxEventHeight() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final float getTextSize() {
        return ((Number) this.j.getValue()).floatValue();
    }

    public final void a(ViewGroup viewGroup, q9g q9gVar, int i, boolean z) {
        int i2 = this.c;
        int eventSpace = z ? (this.d + i2) - getEventSpace() : i2;
        float f = cy7.c() ? ((this.l - q9gVar.f28345a) - q9gVar.b) + i2 : q9gVar.f28345a + i2;
        float eventViewHeight = ((getEventViewHeight() + getEventSpace()) * i) + eventSpace;
        viewGroup.setX(f);
        viewGroup.setY(eventViewHeight);
    }

    public final void b(q9g q9gVar, i9g i9gVar, int i, int i2, Function1 function1) {
        i9g i9gVar2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        p9g p9gVar = (p9g) linkedHashMap.get(numValueOf);
        if (Intrinsics.d((p9gVar == null || (i9gVar2 = p9gVar.b) == null) ? null : i9gVar2.b, i9gVar.b) && p9gVar.b.d.equals(i9gVar.d) && Intrinsics.d(p9gVar.f26604a, q9gVar)) {
            return;
        }
        if (p9gVar == null) {
            m7g m7gVarD = d(q9gVar);
            CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView = m7gVarD.f21319a;
            addView(cyberCalendarPeriodEventItemView);
            h(m7gVarD, q9gVar, i9gVar, i2, function1);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cyberCalendarPeriodEventItemView, (Property<CyberCalendarPeriodEventItemView, Float>) FrameLayout.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.addListener(new r9g(m7gVarD, (byte) 0));
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
            linkedHashMap.put(Integer.valueOf(i), new p9g(q9gVar, i9gVar, m7gVarD));
            return;
        }
        m7g m7gVar = p9gVar.c;
        Integer numValueOf2 = Integer.valueOf(i);
        LinkedHashMap linkedHashMap2 = this.n;
        m7g m7gVarD2 = (m7g) linkedHashMap2.get(numValueOf2);
        if (m7gVarD2 != null) {
            CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView2 = m7gVarD2.f21319a;
            cyberCalendarPeriodEventItemView2.getClass();
            int eventViewHeight = getEventViewHeight();
            int i3 = ((int) q9gVar.b) - (this.c * 2);
            ViewGroup.LayoutParams layoutParams = cyberCalendarPeriodEventItemView2.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.width = i3;
                layoutParams.height = eventViewHeight;
                cyberCalendarPeriodEventItemView2.setLayoutParams(layoutParams);
            }
        } else {
            m7gVarD2 = d(q9gVar);
            addView(m7gVarD2.f21319a);
        }
        CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView3 = m7gVarD2.f21319a;
        m7g m7gVar2 = m7gVarD2;
        h(m7gVar2, q9gVar, i9gVar, i2, function1);
        cyberCalendarPeriodEventItemView3.bringToFront();
        cyberCalendarPeriodEventItemView3.setVisibility(0);
        CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView4 = m7gVar.f21319a;
        cyberCalendarPeriodEventItemView4.getClass();
        cyberCalendarPeriodEventItemView4.setVisibility(8);
        linkedHashMap.put(Integer.valueOf(i), new p9g(q9gVar, i9gVar, m7gVar2));
        linkedHashMap2.put(Integer.valueOf(i), null);
        linkedHashMap2.put(Integer.valueOf(i), m7gVar);
    }

    public final q9g c(long j, long j2, List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return null;
        }
        long j3 = ((CyberCalendarPeriodUiModel) it.next()).f46479a;
        while (it.hasNext()) {
            long j4 = ((CyberCalendarPeriodUiModel) it.next()).f46479a;
            if (j3 > j4) {
                j3 = j4;
            }
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            itt0.a();
            return null;
        }
        long j5 = ((CyberCalendarPeriodUiModel) it2.next()).b;
        while (it2.hasNext()) {
            long j6 = ((CyberCalendarPeriodUiModel) it2.next()).b;
            if (j5 < j6) {
                j5 = j6;
            }
        }
        long j7 = j3 - j;
        long j8 = j5 - j;
        long j9 = j2 - j;
        int size = list.size();
        double d = ((double) this.l) / j9;
        long j10 = (long) (j7 * d);
        if (j8 > j9) {
            j8 = j9;
        }
        return new q9g(j10, size, ((long) (d * j8)) - j10);
    }

    public final m7g d(q9g q9gVar) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.cyber_calendar_event_item_view, (ViewGroup) this, false);
        int i = R.id.ivEventImage;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivEventImage);
        if (imageView != null) {
            i = R.id.tvEventName;
            CalendarEventTextView calendarEventTextView = (CalendarEventTextView) yum0.f(viewInflate, R.id.tvEventName);
            if (calendarEventTextView != null) {
                CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView = (CyberCalendarPeriodEventItemView) viewInflate;
                m7g m7gVar = new m7g(cyberCalendarPeriodEventItemView, imageView, calendarEventTextView);
                cyberCalendarPeriodEventItemView.getClass();
                cyberCalendarPeriodEventItemView.setLayoutParams(new ViewGroup.LayoutParams(((int) q9gVar.b) - (this.c * 2), getEventViewHeight()));
                return m7gVar;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void f(yag yagVar, t9g t9gVar, Function1 function1, final Function1 function2) {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        List list;
        int size;
        long j4;
        ArrayList arrayList;
        int i3;
        List<CyberCalendarPeriodUiModel> list2 = t9gVar.f33561a;
        yagVar.getClass();
        this.f46485a = yagVar;
        ArrayList arrayList2 = this.o;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            LinearLayout linearLayout = ((cag) it.next()).f4008a;
            linearLayout.getClass();
            linearLayout.setVisibility(8);
        }
        List<i9g> list3 = t9gVar.b;
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            itt0.a();
            return;
        }
        long j5 = ((CyberCalendarPeriodUiModel) it2.next()).f46479a;
        loop1: while (true) {
            j = j5;
            do {
                if (!it2.hasNext()) {
                    break loop1;
                } else {
                    j5 = ((CyberCalendarPeriodUiModel) it2.next()).f46479a;
                }
            } while (j <= j5);
        }
        Iterator it3 = list2.iterator();
        if (!it3.hasNext()) {
            itt0.a();
            return;
        }
        long j6 = ((CyberCalendarPeriodUiModel) it3.next()).b;
        while (it3.hasNext()) {
            long j7 = ((CyberCalendarPeriodUiModel) it3.next()).b;
            if (j6 < j7) {
                j6 = j7;
            }
        }
        if (yagVar == yag.d) {
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            for (CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel : list2) {
                int i5 = 0;
                for (i9g i9gVar : list3) {
                    ArrayList arrayList4 = arrayList3;
                    long j8 = cyberCalendarPeriodUiModel.f46479a;
                    long j9 = j6;
                    int i6 = i4;
                    long j10 = cyberCalendarPeriodUiModel.b;
                    CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2 = i9gVar.e;
                    if (fre0.Z(j8, j10, cyberCalendarPeriodUiModel2.f46479a, cyberCalendarPeriodUiModel2.b)) {
                        i5++;
                    }
                    i4 = i6;
                    arrayList3 = arrayList4;
                    j6 = j9;
                }
                long j11 = j6;
                ArrayList arrayList5 = arrayList3;
                int i7 = i4;
                if (i5 > 3) {
                    j4 = j;
                    q9g q9gVarC = c(j4, j11, a.c(cyberCalendarPeriodUiModel));
                    final long j12 = cyberCalendarPeriodUiModel.f46479a;
                    cag cagVar = (cag) CollectionsKt.W(i7, arrayList2);
                    int i8 = ((int) q9gVarC.b) - (this.c * 2);
                    if (cagVar == null) {
                        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.cyber_calendar_show_more_view, (ViewGroup) this, false);
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvChampCount);
                        if (textView == null) {
                            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvChampCount)));
                            return;
                        }
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        cagVar = new cag(linearLayout2, textView);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(i8, -2));
                        addView(linearLayout2);
                        arrayList2.add(cagVar);
                    } else {
                        LinearLayout linearLayout3 = cagVar.f4008a;
                        linearLayout3.getClass();
                        ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                        if (layoutParams == null) {
                            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            return;
                        } else {
                            layoutParams.width = i8;
                            layoutParams.height = -2;
                            linearLayout3.setLayoutParams(layoutParams);
                        }
                    }
                    ViewGroup viewGroup = cagVar.f4008a;
                    viewGroup.setOnClickListener(new View.OnClickListener() { // from class: a.l9g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i9 = CyberCalendarPeriodView.p;
                            function2.invoke(Long.valueOf(j12));
                        }
                    });
                    String string = getResources().getString(R.string.additionalTournaments, String.valueOf(i5 - 3));
                    string.getClass();
                    cagVar.b.setText(string);
                    viewGroup.setVisibility(0);
                    a(viewGroup, q9gVarC, 3, true);
                    arrayList = arrayList5;
                    arrayList.add(cyberCalendarPeriodUiModel);
                    i3 = i7 + 1;
                } else {
                    j4 = j;
                    arrayList = arrayList5;
                    i3 = i7;
                }
                arrayList3 = arrayList;
                i4 = i3;
                j = j4;
                j6 = j11;
            }
            j2 = j6;
            j3 = j;
            i = 1;
            i2 = 2;
            list = arrayList3;
        } else {
            j2 = j6;
            j3 = j;
            i = 1;
            i2 = 2;
            list = iun.f15405a;
        }
        kie0 kie0Var = new kie0();
        ArrayList arrayList6 = new ArrayList();
        int size2 = list3.size() / 5;
        Integer numValueOf = Integer.valueOf(size2);
        yje yjeVar = null;
        if (size2 <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i;
        s9g s9gVar = new s9g(CollectionsKt.Q0(list3, iIntValue, iIntValue), this, arrayList6, list, kie0Var, function1, list2, j3, j2, null);
        clz clzVarL = s7n0.l(this);
        if (clzVarL != null) {
            tkz tkzVarQ = x0x.Q(clzVarL.x());
            rwj rwjVar = tvk.f34603a;
            qjj.W(tkzVarQ, ys10.f43147a, null, new wbl0(s9gVar, yjeVar, (byte) 17), i2);
        }
        int size3 = list3.size();
        LinkedHashMap linkedHashMap = this.m;
        if (linkedHashMap.size() <= size3 || size3 > (size = linkedHashMap.size())) {
            return;
        }
        while (true) {
            Object obj = linkedHashMap.get(Integer.valueOf(size3));
            if (obj == null) {
                obj = null;
            }
            p9g p9gVar = (p9g) obj;
            if (p9gVar == null) {
                return;
            }
            m7g m7gVar = p9gVar.c;
            linkedHashMap.put(Integer.valueOf(size3), null);
            this.n.put(Integer.valueOf(size3), m7gVar);
            CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView = m7gVar.f21319a;
            cyberCalendarPeriodEventItemView.getClass();
            cyberCalendarPeriodEventItemView.setVisibility(8);
            if (size3 == size) {
                return;
            } else {
                size3++;
            }
        }
    }

    public final void g(int i) {
        if (this.f46485a != yag.d) {
            setMinimumHeight((i * getMaxEventHeight()) + this.e);
        }
    }

    public final void h(m7g m7gVar, q9g q9gVar, i9g i9gVar, int i, Function1 function1) {
        CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView = m7gVar.f21319a;
        cyberCalendarPeriodEventItemView.getClass();
        dyb.b0(cyberCalendarPeriodEventItemView, ymx.INTERVAL_1000, new v4f(function1, i9gVar, (byte) 15));
        cyberCalendarPeriodEventItemView.getClass();
        int i2 = 0;
        a(cyberCalendarPeriodEventItemView, q9gVar, i, false);
        int i3 = q9gVar.c;
        ImageView imageView = m7gVar.b;
        CalendarEventTextView calendarEventTextView = m7gVar.c;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = getImageSize();
        layoutParams.height = getImageSize();
        imageView.setLayoutParams(layoutParams);
        List list = u0d.f34849a;
        u0d.j(imageView, i9gVar.b, i9gVar.c, 0, null, null, null, 508);
        cyberCalendarPeriodEventItemView.setBackground(getDrawable());
        if (this.f46485a != yag.b && i3 <= 1) {
            i2 = 8;
        }
        calendarEventTextView.setVisibility(i2);
        String str = i9gVar.d;
        float textSize = getTextSize();
        calendarEventTextView.f46480a = str;
        calendarEventTextView.c.setTextSize(textSize);
        calendarEventTextView.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarPeriodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarPeriodView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
