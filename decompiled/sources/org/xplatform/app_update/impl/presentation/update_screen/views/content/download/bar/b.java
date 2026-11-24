package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar;

import a.a3e;
import a.a8z;
import a.ecl;
import a.ewm0;
import a.il3;
import a.j5d;
import a.jiq0;
import a.jl3;
import a.kl3;
import a.ll3;
import a.maz;
import a.ml3;
import a.njc;
import a.pn3;
import a.q7x;
import a.t9f;
import a.tx3;
import a.ucj;
import a.wez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.TypedValue;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46330a;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b b;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b c;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline.b d;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f46330a = maz.a(wez.b, new ucj(this, (byte) 23));
        setId(R.id.downloadBarContainer);
    }

    private final ecl getDownloadBarInflater() {
        return (ecl) this.f46330a.getValue();
    }

    private final void setSecondaryLineColor(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b bVar = this.b;
        if (bVar != null) {
            bVar.setSecondaryLineColor(getContext().getColor(this.f));
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b bVar2 = this.c;
        if (bVar2 != null) {
            ColorStateList colorStateListN0 = jiq0.n0(this.f, getContext());
            if (colorStateListN0 != null) {
                bVar2.setSecondaryLineColor(colorStateListN0);
            }
        }
        ColorStateList colorStateListN1 = jiq0.n0(this.f, getContext());
        if (colorStateListN1 != null) {
            setBackgroundTintList(colorStateListN1);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b bVar3 = this.e;
        if (bVar3 != null) {
            ColorStateList colorStateListN2 = jiq0.n0(this.f, getContext());
            if (colorStateListN2 != null) {
                bVar3.setSecondaryLineColor(colorStateListN2);
            }
        }
    }

    public final void a(ml3 ml3Var, int i) {
        ecl downloadBarInflater = getDownloadBarInflater();
        FrameLayout frameLayout = downloadBarInflater.f7572a;
        if (ml3Var instanceof ll3) {
            if (frameLayout.findViewById(R.id.thinLineDownloadBar) == null) {
                Context context = frameLayout.getContext();
                context.getClass();
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b bVar = new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b(context);
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_40)));
                bVar.setDynamicThumbRadius(true);
                bVar.b(bVar.getContext().getResources().getDimensionPixelSize(R.dimen.size_2), bVar.getContext().getResources().getDimensionPixelSize(R.dimen.size_2));
                ColorStateList colorStateListN0 = jiq0.n0(i, bVar.getContext());
                if (colorStateListN0 != null) {
                    bVar.setSecondaryLineColor(colorStateListN0);
                }
                bVar.setSecondaryLineHeight(bVar.getContext().getResources().getDimensionPixelSize(R.dimen.size_2));
                int color = bVar.getContext().getColor(R.color.download_bar_thin_line_thumb_color);
                bVar.a(new int[]{color, color});
                TypedValue typedValue = j5d.f15927a;
                Context context2 = bVar.getContext();
                context2.getClass();
                int iA = j5d.a(context2, R.attr.uikitUpdateGradientEnd, false);
                Context context3 = bVar.getContext();
                context3.getClass();
                int[] iArr = {iA, j5d.a(context3, R.attr.uikitUpdateGradientStart, false)};
                if (!Arrays.equals(bVar.j, iArr)) {
                    bVar.j = iArr;
                }
                Arrays.equals((float[]) null, (float[]) null);
                bVar.invalidate();
                bVar.setThumbWithinSecondaryLineBounds(true);
                frameLayout.addView(bVar);
            }
        } else if (ml3Var instanceof il3) {
            if (frameLayout.findViewById(R.id.circleDownloadBar) == null) {
                Context context4 = frameLayout.getContext();
                context4.getClass();
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b bVar2 = new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b(context4);
                int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_80);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 17;
                bVar2.setLayoutParams(layoutParams);
                bVar2.setViewWidth(dimensionPixelSize);
                bVar2.setViewHeight(dimensionPixelSize);
                bVar2.setStartPosition(downloadBarInflater.b ? njc.e : njc.d);
                bVar2.setSecondaryLineColor(bVar2.getContext().getColor(i));
                bVar2.setLinesThickness(bVar2.getContext().getResources().getDimension(R.dimen.size_4));
                TypedValue typedValue2 = j5d.f15927a;
                Context context5 = bVar2.getContext();
                context5.getClass();
                Context context6 = bVar2.getContext();
                context6.getClass();
                int[] iArrU = {j5d.a(context5, R.attr.uikitUpdateGradientEnd, false), j5d.a(context6, R.attr.uikitUpdateGradientStart, false)};
                float f = bVar2.f / 2.0f;
                float f2 = bVar2.e / 2.0f;
                boolean z = bVar2.f46332a;
                if (z) {
                    iArrU = tx3.U(iArrU);
                }
                SweepGradient sweepGradient = new SweepGradient(f, f2, iArrU, (float[]) null);
                Matrix matrix = new Matrix();
                matrix.postRotate(z ? 2.0f : -182.0f, bVar2.f / 2.0f, bVar2.e / 2.0f);
                sweepGradient.setLocalMatrix(matrix);
                bVar2.n.setShader(sweepGradient);
                bVar2.invalidate();
                frameLayout.addView(bVar2);
            }
        } else if (ml3Var instanceof jl3) {
            frameLayout.setBackground(frameLayout.getContext().getDrawable(R.drawable.bg_thick_line_download_bar));
            ColorStateList colorStateListN1 = jiq0.n0(i, frameLayout.getContext());
            if (colorStateListN1 != null) {
                frameLayout.setBackgroundTintList(colorStateListN1);
            }
            if (frameLayout.findViewById(R.id.thickLineDownloadBar) == null) {
                Context context7 = frameLayout.getContext();
                context7.getClass();
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline.b bVar3 = new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline.b(context7);
                bVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, bVar3.getContext().getResources().getDimensionPixelSize(R.dimen.size_28)));
                bVar3.setPrimaryLineCornersRadius(bVar3.getContext().getResources().getDimension(R.dimen.radius_24));
                TypedValue typedValue3 = j5d.f15927a;
                Context context8 = bVar3.getContext();
                context8.getClass();
                int iA2 = j5d.a(context8, R.attr.uikitUpdateGradientEnd, false);
                Context context9 = bVar3.getContext();
                context9.getClass();
                int[] iArr2 = {iA2, j5d.a(context9, R.attr.uikitUpdateGradientStart, false)};
                if (!Arrays.equals(bVar3.b, iArr2)) {
                    bVar3.b = iArr2;
                }
                Arrays.equals((float[]) null, (float[]) null);
                bVar3.invalidate();
                frameLayout.addView(bVar3);
            }
        } else {
            if (!(ml3Var instanceof kl3)) {
                t9f.b();
                return;
            }
            if (frameLayout.findViewById(R.id.thickLineWithIconDownloadBar) == null) {
                Context context10 = frameLayout.getContext();
                context10.getClass();
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b bVar4 = new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b(context10);
                bVar4.setLayoutParams(new FrameLayout.LayoutParams(-1, bVar4.getContext().getResources().getDimensionPixelSize(R.dimen.size_32)));
                ColorStateList colorStateListN2 = jiq0.n0(i, bVar4.getContext());
                if (colorStateListN2 != null) {
                    bVar4.setSecondaryLineColor(colorStateListN2);
                }
                bVar4.setSecondaryLineHeight(bVar4.getContext().getResources().getDimensionPixelSize(R.dimen.size_24));
                bVar4.setSecondaryLineCornersRadius(bVar4.getContext().getResources().getDimension(R.dimen.radius_24));
                Drawable drawable = bVar4.getContext().getDrawable(((kl3) ml3Var).f18466a);
                if (drawable != null) {
                    bVar4.setThumbDrawable(drawable);
                }
                bVar4.setThumbRadius(bVar4.getContext().getResources().getDimensionPixelSize(R.dimen.radius_16));
                bVar4.setThumbWithinSecondaryLineBounds(true);
                TypedValue typedValue4 = j5d.f15927a;
                Context context11 = bVar4.getContext();
                context11.getClass();
                int iA3 = j5d.a(context11, R.attr.uikitUpdateGradientEnd, false);
                Context context12 = bVar4.getContext();
                context12.getClass();
                int[] iArr3 = {iA3, j5d.a(context12, R.attr.uikitUpdateGradientStart, false)};
                if (!Arrays.equals(bVar4.h, iArr3)) {
                    bVar4.h = iArr3;
                }
                Arrays.equals((float[]) null, (float[]) null);
                bVar4.invalidate();
                frameLayout.addView(bVar4);
            }
        }
        if (this.f == i) {
            return;
        }
        this.f = i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b == null) {
            this.b = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b) findViewById(R.id.circleDownloadBar);
        }
        if (this.c == null) {
            this.c = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b) findViewById(R.id.thinLineDownloadBar);
        }
        if (this.d == null) {
            this.d = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline.b) findViewById(R.id.thickLineDownloadBar);
        }
        if (this.e == null) {
            this.e = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b) findViewById(R.id.thickLineWithIconDownloadBar);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DownloadBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DownloadBar$SavedState downloadBar$SavedState = (DownloadBar$SavedState) parcelable;
        setSecondaryLineColor(downloadBar$SavedState.b);
        super.onRestoreInstanceState(downloadBar$SavedState.f46329a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DownloadBar$SavedState(super.onSaveInstanceState(), this.f);
    }

    public final void setContainerLayoutParams(pn3 pn3Var) {
        pn3Var.getClass();
        a3e a3eVar = new a3e(pn3Var.f27265a, pn3Var.b);
        a3eVar.P = getResources().getDimensionPixelSize(R.dimen.size_512);
        q7x.G(a3eVar, pn3Var);
        ewm0.u(this, pn3Var);
        a3eVar.setMargins(getResources().getDimensionPixelSize(pn3Var.k), getResources().getDimensionPixelSize(pn3Var.l), getResources().getDimensionPixelSize(pn3Var.m), getResources().getDimensionPixelSize(pn3Var.n));
        setLayoutParams(a3eVar);
    }

    public final void setProgress(int i) {
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle.b bVar = this.b;
        if (bVar != null) {
            bVar.setValue(i);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.setValue(i);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline.b bVar3 = this.d;
        if (bVar3 != null) {
            bVar3.setValue(i);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon.b bVar4 = this.e;
        if (bVar4 != null) {
            bVar4.setValue(i);
        }
    }
}
