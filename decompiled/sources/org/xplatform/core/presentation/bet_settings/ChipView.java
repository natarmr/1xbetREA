package org.xplatform.core.presentation.bet_settings;

import a.a8z;
import a.aqd0;
import a.dgu0;
import a.epv0;
import a.h5;
import a.j5d;
import a.maz;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ChipView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46462a;
    public final a8z b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 15));
        LayoutInflater.from(context).inflate(R.layout.view_chip_xgames, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.e, 0, 0);
        getBinding().d.setText(typedArrayObtainStyledAttributes.getText(1));
        try {
            getBinding().b.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
            typedArrayObtainStyledAttributes.recycle();
            a(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(boolean z) {
        int iA;
        this.f46462a = z;
        getBinding().d.setTextAppearance(getContext(), z ? R.style.TextAppearance_AppTheme_New_Subtitle2_Medium_White : R.style.TextAppearance_AppTheme_New_Body2_Medium_Primary);
        ImageView imageView = getBinding().b;
        if (z) {
            iA = getContext().getColor(R.color.static_white);
        } else {
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            iA = j5d.a(context, R.attr.uikitTextPrimary, false);
        }
        imageView.setColorFilter(iA);
        getBinding().c.setBackground(epv0.U(z ? R.drawable.shape_chip_checked_new : R.drawable.onex_games_shape_chip_unchecked_stroke_mode, getContext()));
    }

    public final dgu0 getBinding() {
        Object value = this.b.getValue();
        value.getClass();
        return (dgu0) value;
    }

    public final boolean getChecked() {
        return this.f46462a;
    }

    public final void setChecked(boolean z) {
        this.f46462a = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
