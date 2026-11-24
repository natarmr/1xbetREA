package org.xplatform.ui_core.viewcomponents.smart_background;

import a.a3e;
import a.epv0;
import a.ryw;
import a.syw;
import a.t9f;
import a.tyw;
import a.u0d;
import a.uyw;
import a.y0x;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AppCompatImageView {
    public int d;
    public int e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.f = "";
    }

    private final void setImage(y0x y0xVar) {
        uyw uywVar = y0xVar.f41828a;
        int i = y0xVar.b;
        if (uywVar instanceof syw) {
            try {
                setImageResource(((syw) uywVar).f33043a);
                return;
            } catch (OutOfMemoryError unused) {
                setImageDrawable(new ColorDrawable(i));
                return;
            }
        }
        if (uywVar instanceof ryw) {
            setImageDrawable(new ColorDrawable(((ryw) uywVar).f31332a));
            return;
        }
        if (!(uywVar instanceof tyw)) {
            t9f.b();
            return;
        }
        int i2 = ((tyw) uywVar).b;
        Drawable drawableU = i2 != 0 ? epv0.U(i2, getContext()) : new ColorDrawable(i);
        tyw tywVar = (tyw) uywVar;
        String str = tywVar.f34776a;
        if (tywVar.c) {
            List list = u0d.f34849a;
            u0d.e(this, str, drawableU, drawableU);
        } else {
            setBackground(new ColorDrawable(i));
            List list2 = u0d.f34849a;
            u0d.e(this, str, drawableU, null);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SmartBackgroundImageView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SmartBackgroundImageView$SavedState smartBackgroundImageView$SavedState = (SmartBackgroundImageView$SavedState) parcelable;
        this.d = smartBackgroundImageView$SavedState.b;
        this.e = smartBackgroundImageView$SavedState.c;
        this.f = smartBackgroundImageView$SavedState.d;
        super.onRestoreInstanceState(smartBackgroundImageView$SavedState.f47198a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SmartBackgroundImageView$SavedState(super.onSaveInstanceState(), this.d, this.e, this.f);
    }

    public final void setImageParams(y0x y0xVar) {
        y0xVar.getClass();
        uyw uywVar = y0xVar.f41828a;
        if (uywVar instanceof syw) {
            int i = this.d;
            int i2 = ((syw) uywVar).f33043a;
            if (i != i2) {
                this.d = i2;
            }
        } else if (uywVar instanceof ryw) {
            int i3 = this.e;
            int i4 = ((ryw) uywVar).f31332a;
            if (i3 != i4) {
                this.e = i4;
            }
        } else if (!(uywVar instanceof tyw)) {
            t9f.b();
            return;
        } else if (!Intrinsics.d(this.f, ((tyw) uywVar).f34776a)) {
            this.f = ((tyw) uywVar).f34776a;
        }
        a3e a3eVar = new a3e(-1, -1);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setLayoutParams(a3eVar);
        setImage(y0xVar);
    }
}
