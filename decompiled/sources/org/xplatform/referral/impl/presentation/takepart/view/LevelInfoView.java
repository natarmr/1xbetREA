package org.xplatform.referral.impl.presentation.takepart.view;

import a.a8z;
import a.maz;
import a.nsr;
import a.s6z;
import a.wez;
import a.ypd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class LevelInfoView extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.q = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 24));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ypd0.f43026a, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(1, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 1);
            setProgress(i);
            setLevel(i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final s6z getViewBinding() {
        Object value = this.q.getValue();
        value.getClass();
        return (s6z) value;
    }

    public final void setLevel(int i) {
        getViewBinding().d.setText(getContext().getString(R.string.referral_network_level_v2, Integer.valueOf(i)));
    }

    public final void setProgress(int i) {
        getViewBinding().b.setProgress(i);
        getViewBinding().c.setText(getContext().getString(R.string.referral_network_level_percent_v2, Integer.valueOf(i)));
    }
}
