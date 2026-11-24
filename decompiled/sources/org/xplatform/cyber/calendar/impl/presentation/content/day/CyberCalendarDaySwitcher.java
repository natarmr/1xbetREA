package org.xplatform.cyber.calendar.impl.presentation.content.day;

import a.a6g;
import a.a8z;
import a.b6g;
import a.cy7;
import a.dyb;
import a.i5g;
import a.lhf;
import a.maz;
import a.rdj;
import a.sdj;
import a.wez;
import a.ynq0;
import a.z5g;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberCalendarDaySwitcher extends ConstraintLayout {
    public static final /* synthetic */ int s = 0;
    public final a8z q;
    public final boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarDaySwitcher(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 4));
        this.r = cy7.c();
        new a6g(this, CyberCalendarDaySwitcher.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDaySwitcherBinding;", 0, (byte) 0).get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b6g getBinding() {
        return (b6g) this.q.getValue();
    }

    public final void setDate(long j) {
        TextView textView = getBinding().d;
        rdj rdjVar = rdj.f30294a;
        textView.setText(rdj.f(new ynq0(j), sdj.UNIQUE_8, null, 60));
    }

    public final void v(i5g i5gVar, i5g i5gVar2) {
        dyb.O(getBinding().c, new z5g(this, i5gVar2, i5gVar));
        dyb.O(getBinding().b, new z5g(this, i5gVar, i5gVar2, (byte) 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDaySwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDaySwitcher(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
