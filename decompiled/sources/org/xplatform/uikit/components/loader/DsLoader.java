package org.xplatform.uikit.components.loader;

import a.bkm;
import a.bqd0;
import a.ckm;
import a.ekm;
import a.ijf0;
import a.t9f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsLoader extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bkm f47248a;
    public final ckm b;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsLoader(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        ekm ekmVar = ekm.f7958a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.L, 0, 0);
        ekmVar = typedArrayObtainStyledAttributes.getInt(0, 0) == 1 ? ekm.b : ekmVar;
        typedArrayObtainStyledAttributes.recycle();
        removeAllViews();
        int iOrdinal = ekmVar.ordinal();
        if (iOrdinal == 0) {
            Context context2 = getContext();
            context2.getClass();
            ckm ckmVar = new ckm(context2, attributeSet, R.attr.progressBarStyle);
            addView(ckmVar);
            this.b = ckmVar;
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            throw null;
        }
        Context context3 = getContext();
        context3.getClass();
        bkm bkmVar = new bkm(context3, attributeSet, 0);
        bkmVar.setRepeatCount(-1);
        int i2 = Build.VERSION.SDK_INT;
        bkmVar.setRenderMode((i2 == 26 || i2 == 27) ? ijf0.c : ijf0.f14871a);
        addView(bkmVar);
        this.f47248a = bkmVar;
    }

    public final void setIndeterminateTintList(ColorStateList colorStateList) {
        colorStateList.getClass();
        ckm ckmVar = this.b;
        if (ckmVar != null) {
            ckmVar.setIndeterminateTintList(colorStateList);
        }
    }

    public final void setRawRes(int i) {
        bkm bkmVar = this.f47248a;
        if (bkmVar != null) {
            bkmVar.setAnimation(bkmVar.getResources().getString(i));
            bkmVar.h();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsLoader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsLoader(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
