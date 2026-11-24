package org.xplatform.app_start.impl.presentation.view.content.version;

import a.a3e;
import a.j5d;
import a.jj3;
import a.knm0;
import a.mym0;
import a.r7x;
import android.content.Context;
import android.os.Parcelable;
import android.util.TypedValue;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MaterialTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
        setVisibility(0);
        TypedValue typedValue = j5d.f15927a;
        setTextColor(context.getColor(R.color.static_white_80));
        setTextAppearance(context, R.style.TextAppearance_Caption_Regular_M);
        setGravity(z ? 8388611 : 8388613);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof AppStartVersionView$SavedState) {
            super.onRestoreInstanceState(((AppStartVersionView$SavedState) parcelable).f46322a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AppStartVersionView$SavedState(super.onSaveInstanceState());
    }

    public final void setContent(String str) {
        str.getClass();
        if (str.length() <= 0 || Intrinsics.d(str, getText())) {
            return;
        }
        setText(str);
    }

    public final void setViewLayoutParams(jj3 jj3Var) {
        jj3Var.getClass();
        setId(jj3Var.f16602a);
        int width = jj3Var.b;
        if (width == -321) {
            width = getWidth();
        }
        int height = jj3Var.c;
        if (height == -321) {
            height = getHeight();
        }
        a3e a3eVar = new a3e(width, height);
        r7x.E(a3eVar, jj3Var);
        mym0.q(this, jj3Var);
        a3eVar.setMargins(getResources().getDimensionPixelSize(jj3Var.k), getResources().getDimensionPixelSize(jj3Var.l), getResources().getDimensionPixelSize(jj3Var.m), getResources().getDimensionPixelSize(jj3Var.n));
        setLayoutParams(a3eVar);
        knm0.h(this, false);
    }
}
