package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.a8z;
import a.chu0;
import a.lhf;
import a.maz;
import a.usq;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class FootballEventsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46996a;

    /* JADX WARN: Illegal instructions before constructor call */
    public FootballEventsView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46996a = maz.a(wez.b, new lhf(this, this, (byte) 28));
        setGravity(16);
    }

    private final chu0 getBinding() {
        Object value = this.f46996a.getValue();
        value.getClass();
        return (chu0) value;
    }

    public final void a(usq usqVar) {
        chu0 binding = getBinding();
        binding.b.setText(String.valueOf(usqVar.f36224a));
        binding.d.setText(String.valueOf(usqVar.b));
        binding.c.setText(String.valueOf(usqVar.c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FootballEventsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FootballEventsView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
