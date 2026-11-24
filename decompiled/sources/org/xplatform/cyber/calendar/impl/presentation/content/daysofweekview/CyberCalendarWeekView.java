package org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview;

import a.hny;
import a.iun;
import a.j6g;
import a.jbg;
import a.q3d;
import a.r3d;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberCalendarWeekView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f46488a;
    public List b;
    public List c;
    public j6g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyberCalendarWeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cyber_calendar_week_view, this);
        int i = R.id.daysOfWeekView;
        CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = (CyberCalendarDaysOfWeekView) yum0.f(this, R.id.daysOfWeekView);
        if (cyberCalendarDaysOfWeekView != null) {
            i = R.id.numberOfWeekView;
            CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView2 = (CyberCalendarDaysOfWeekView) yum0.f(this, R.id.numberOfWeekView);
            if (cyberCalendarDaysOfWeekView2 != null) {
                this.f46488a = new vd7(this, cyberCalendarDaysOfWeekView, cyberCalendarDaysOfWeekView2, (byte) 7);
                iun iunVar = iun.f15405a;
                this.b = iunVar;
                this.c = iunVar;
                setClickable(true);
                setFocusable(true);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b.isEmpty()) {
            return;
        }
        int measuredWidth = getMeasuredWidth() / this.b.size();
        List list = this.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            int i5 = i3 * measuredWidth;
            arrayList.add(new jbg(((CyberCalendarPeriodUiModel) obj).f46479a, new IntRange(i5, i5 + measuredWidth, 1)));
            i3 = i4;
        }
        this.c = arrayList;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object next;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                IntRange intRange = ((jbg) next).b;
                int i = intRange.f46068a;
                if (x <= intRange.b && i <= x) {
                    break;
                }
            }
            jbg jbgVar = (jbg) next;
            if (jbgVar == null) {
                return super.onTouchEvent(motionEvent);
            }
            j6g j6gVar = this.d;
            if (j6gVar != null) {
                j6gVar.invoke(Long.valueOf(jbgVar.f16239a));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarWeekView(Context context) {
        this(context, null);
        context.getClass();
    }
}
