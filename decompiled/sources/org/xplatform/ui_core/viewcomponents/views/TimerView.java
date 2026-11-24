package org.xplatform.ui_core.viewcomponents.views;

import a.a3e;
import a.a8z;
import a.aqd0;
import a.c4m0;
import a.d5c;
import a.fnq;
import a.maz;
import a.ozp0;
import a.q3d;
import a.rd7;
import a.sac;
import a.sje;
import a.slb;
import a.slu0;
import a.wez;
import a.yje;
import a.ywm0;
import a.zg0;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class TimerView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final a8z q;
    public long r;
    public final sje s;
    public c4m0 t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public TimerView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        this.q = maz.a(wez.b, new ywm0(this, this, (byte) 14));
        this.s = d5c.s();
        this.u = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, aqd0.A);
        typedArrayObtainStyledAttributes.getClass();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        String string = typedArrayObtainStyledAttributes.getString(8);
        string = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        string2 = string2 == null ? string : string2;
        int color = typedArrayObtainStyledAttributes.getColor(4, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(3, color);
        int color3 = typedArrayObtainStyledAttributes.getColor(2, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(5, 10.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(1, dimension);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        this.u = typedArrayObtainStyledAttributes.getBoolean(12, true);
        this.v = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(9, false);
        Typeface typefaceCreate = string.length() == 0 ? null : Typeface.create(string, 0);
        Typeface typefaceCreate2 = string2.length() == 0 ? null : Typeface.create(string2, 0);
        for (TextView textView : q3d.j(getBinding().c, getBinding().f, getBinding().i, getBinding().m, getBinding().d, getBinding().g, getBinding().j, getBinding().l)) {
            textView.setTypeface(typefaceCreate, z ? 1 : 0);
            textView.setTextSize(0, dimension);
            textView.setTextColor(color);
        }
        for (TextView textView2 : q3d.j(getBinding().e, getBinding().h, getBinding().k, getBinding().n)) {
            textView2.setVisibility(z2 ? 0 : 8);
            textView2.setTypeface(typefaceCreate2, z ? 1 : 0);
            textView2.setTextSize(0, dimension2);
            textView2.setTextColor(color2);
        }
        if (z2) {
            getBinding().e.setText(context.getString(getDayLabel()));
            getBinding().h.setText(context.getString(getHourLabel()));
            getBinding().k.setText(context.getString(getMinLabel()));
            getBinding().n.setText(context.getString(getSecLabel()));
        }
        for (TextView textView3 : q3d.j(getBinding().d, getBinding().g, getBinding().j)) {
            textView3.setText(Separators.COLON);
            if (color3 != 0) {
                textView3.setTextColor(color3);
            }
        }
        getBinding().j.setVisibility(this.u ? 0 : 8);
        getBinding().m.setVisibility(this.u ? 0 : 8);
        getBinding().n.setVisibility((this.u && z2) ? 0 : 8);
        setCompactMode(z3);
        getBinding().l.setText("-");
        typedArrayObtainStyledAttributes.recycle();
    }

    private final slu0 getBinding() {
        return (slu0) this.q.getValue();
    }

    private final int getDayLabel() {
        return this.w ? R.string.day_short : R.string.timer_days;
    }

    private final int getHourLabel() {
        return this.w ? R.string.hour_short : R.string.timer_hours;
    }

    private final int getMinLabel() {
        return this.w ? R.string.minute_short : R.string.timer_mins;
    }

    private final int getSecLabel() {
        return this.w ? R.string.second_short : R.string.timer_secs;
    }

    private final void setCompactMode(boolean z) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(z ? R.dimen.space_0 : R.dimen.space_4);
        ViewGroup.LayoutParams layoutParams = getBinding().c.getLayoutParams();
        layoutParams.getClass();
        a3e a3eVar = (a3e) layoutParams;
        a3eVar.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getBinding().c.setLayoutParams(a3eVar);
        ViewGroup.LayoutParams layoutParams2 = getBinding().f.getLayoutParams();
        layoutParams2.getClass();
        a3e a3eVar2 = (a3e) layoutParams2;
        a3eVar2.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        getBinding().f.setLayoutParams(a3eVar2);
        ViewGroup.LayoutParams layoutParams3 = getBinding().i.getLayoutParams();
        layoutParams3.getClass();
        a3e a3eVar3 = (a3e) layoutParams3;
        a3eVar3.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getBinding().i.setLayoutParams(a3eVar3);
        ViewGroup.LayoutParams layoutParams4 = getBinding().m.getLayoutParams();
        layoutParams4.getClass();
        a3e a3eVar4 = (a3e) layoutParams4;
        a3eVar4.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getBinding().m.setLayoutParams(a3eVar4);
    }

    public static void u(TimerView timerView, rd7 rd7Var, int i) {
        Object ozp0Var = rd7Var;
        if ((i & 1) != 0) {
            ozp0Var = new ozp0((byte) 29);
        }
        c4m0 c4m0Var = timerView.t;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            timerView.t = slb.U(new fnq(sac.L(6, timerView.r, 0L), new zg0(ozp0Var, (Object) timerView, (yje) null, (byte) 13), (byte) 4), timerView.s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c4m0 c4m0Var = this.t;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        super.onDetachedFromWindow();
    }

    public final void setBackground(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        getBinding().c.setBackgroundResource(i);
        getBinding().c.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        getBinding().f.setBackgroundResource(i);
        getBinding().f.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        getBinding().i.setBackgroundResource(i);
        getBinding().i.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        getBinding().m.setBackgroundResource(i);
        getBinding().m.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
    }

    public final void v(Date date, boolean z) {
        this.r = date.getTime();
        w(z);
    }

    public final void w(boolean z) {
        long time = this.r - new Date().getTime();
        if (time <= 0) {
            if (z) {
                ConstraintLayout constraintLayout = getBinding().b;
                constraintLayout.getClass();
                constraintLayout.setVisibility(8);
                return;
            } else {
                getBinding().c.setText("00");
                getBinding().f.setText("00");
                getBinding().i.setText("00");
                getBinding().m.setText("00");
                return;
            }
        }
        getBinding().b.setVisibility(0);
        long j = (time / 1000) % 60;
        long j2 = (time / 60000) % 60;
        long j3 = (time / 3600000) % 24;
        long j4 = time / 86400000;
        String strB0 = StringsKt.b0(2, String.valueOf(j4));
        String strB1 = StringsKt.b0(2, String.valueOf(j3));
        String strB2 = StringsKt.b0(2, String.valueOf(j2));
        String strB3 = StringsKt.b0(2, String.valueOf(j));
        if (this.u) {
            getBinding().c.setText(strB0);
            getBinding().f.setText(strB1);
            getBinding().i.setText(strB2);
            getBinding().m.setText(strB3);
            return;
        }
        if (j4 > 0 || this.v) {
            getBinding().c.setText(strB0);
            getBinding().f.setText(strB1);
            getBinding().i.setText(strB2);
            getBinding().e.setText(getContext().getString(getDayLabel()));
            getBinding().h.setText(getContext().getString(getHourLabel()));
            getBinding().k.setText(getContext().getString(getMinLabel()));
            return;
        }
        getBinding().c.setText(strB1);
        getBinding().f.setText(strB2);
        getBinding().i.setText(strB3);
        getBinding().e.setText(getContext().getString(getHourLabel()));
        getBinding().h.setText(getContext().getString(getMinLabel()));
        getBinding().k.setText(getContext().getString(getSecLabel()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
