package org.xplatform.ui_core.viewcomponents.views;

import a.a8z;
import a.dyb;
import a.j620;
import a.maz;
import a.nsr;
import a.r3w;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeBetBalanceView extends FrameLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47208a;

    /* JADX WARN: Illegal instructions before constructor call */
    public MakeBetBalanceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47208a = maz.a(wez.b, new nsr(this, this, (byte) 29));
    }

    private final j620 getBinding() {
        Object value = this.f47208a.getValue();
        value.getClass();
        return (j620) value;
    }

    public final void setAddDepositClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.O(getBinding().b, new r3w(function0, (byte) 4));
    }

    public final void setChangeBalanceBtnText(String str) {
        str.getClass();
        getBinding().c.setText(str);
    }

    public final void setChangeBalanceClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.O(getBinding().c, new r3w(function0, (byte) 5));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MakeBetBalanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MakeBetBalanceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
