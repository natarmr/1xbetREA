package org.xplatform.resident.presentation.views;

import a.a8z;
import a.maz;
import a.mku0;
import a.sue0;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ResidentTagView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46887a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResidentTagView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0, 0);
        this.f46887a = maz.a(wez.b, new sue0(this, this, (byte) 6));
        setRotation(-29.0f);
    }

    private final mku0 getBinding() {
        Object value = this.f46887a.getValue();
        value.getClass();
        return (mku0) value;
    }

    public final void a(String str, String str2) {
        str2.getClass();
        getBinding().b.setText(getContext().getString(R.string.resident_extinguisher_description, str, str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentTagView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
