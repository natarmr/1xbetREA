package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.a8z;
import a.ahu0;
import a.jmo;
import a.lhf;
import a.maz;
import a.wez;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpandBtnView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46995a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpandBtnView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46995a = maz.a(wez.b, new lhf(this, this, (byte) 22));
    }

    private final ahu0 getBinding() {
        Object value = this.f46995a.getValue();
        value.getClass();
        return (ahu0) value;
    }

    public final void a(jmo jmoVar) {
        jmoVar.getClass();
        ahu0 binding = getBinding();
        binding.b.setText(jmoVar.b);
        Context context = getContext();
        context.getClass();
        binding.b.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(jmoVar.f16775a), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandBtnView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandBtnView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
