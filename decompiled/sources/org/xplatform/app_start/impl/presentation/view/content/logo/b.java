package org.xplatform.app_start.impl.presentation.view.content.logo;

import a.a3e;
import a.ax00;
import a.bx00;
import a.cx00;
import a.dx00;
import a.hny;
import a.jj3;
import a.mym0;
import a.nq8;
import a.r7x;
import a.sj3;
import a.t9f;
import a.u0d;
import a.yum0;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq8 f46319a;
    public int b;
    public String c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.app_start_logo_view, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(this, R.id.logoImage);
        if (appCompatImageView == null) {
            hny.u("Missing required view with ID: ".concat(getResources().getResourceName(R.id.logoImage)));
            throw null;
        }
        this.f46319a = new nq8(this, appCompatImageView, (byte) 2);
        this.c = "";
    }

    private final int getContainerHeight() {
        Context context = getContext();
        context.getClass();
        context.getClass();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        int iD0 = sj3.d0(displayMetrics.widthPixels);
        if (iD0 > 431) {
            return getResources().getDimensionPixelSize(R.dimen.size_180);
        }
        return iD0 <= 360 ? getResources().getDimensionPixelSize(R.dimen.size_108) : getResources().getDimensionPixelSize(R.dimen.size_140);
    }

    private final int getContainerWidth() {
        Context context = getContext();
        context.getClass();
        context.getClass();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        int iD0 = sj3.d0(displayMetrics.widthPixels);
        if (iD0 > 431) {
            return getResources().getDimensionPixelSize(R.dimen.size_360);
        }
        return iD0 <= 360 ? getResources().getDimensionPixelSize(R.dimen.size_216) : getResources().getDimensionPixelSize(R.dimen.size_280);
    }

    private final void setImageRes(int i) {
        if (i == 0 || this.b == i) {
            return;
        }
        this.b = i;
        ((AppCompatImageView) this.f46319a.c).setImageDrawable(getContext().getDrawable(i));
    }

    public final void a(int i, String str) {
        if (Intrinsics.d(str, this.c) && this.b == i && !this.d) {
            return;
        }
        this.c = str;
        this.b = i;
        this.d = false;
        List list = u0d.f34849a;
        u0d.e((AppCompatImageView) this.f46319a.c, str, null, null);
    }

    public final void b(int i) {
        if (this.d && this.b == i) {
            return;
        }
        this.c = "";
        this.b = i;
        this.d = true;
        List list = u0d.f34849a;
        nq8 nq8Var = this.f46319a;
        u0d.a((AppCompatImageView) nq8Var.c);
        ((AppCompatImageView) nq8Var.c).setImageDrawable(null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AppStartLogoView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AppStartLogoView$SavedState appStartLogoView$SavedState = (AppStartLogoView$SavedState) parcelable;
        String str = appStartLogoView$SavedState.c;
        int i = appStartLogoView$SavedState.b;
        super.onRestoreInstanceState(appStartLogoView$SavedState.f46318a);
        if (appStartLogoView$SavedState.d) {
            b(i);
        } else if (str.length() > 0) {
            a(i, str);
        } else {
            setImageRes(i);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AppStartLogoView$SavedState(super.onSaveInstanceState(), this.b, this.c, this.d);
    }

    public final void setContainerLayoutParams(jj3 jj3Var) {
        jj3Var.getClass();
        setId(jj3Var.f16602a);
        a3e a3eVar = new a3e(getContainerWidth(), getContainerHeight());
        r7x.E(a3eVar, jj3Var);
        mym0.q(this, jj3Var);
        a3eVar.setMargins(getResources().getDimensionPixelSize(jj3Var.k), getResources().getDimensionPixelSize(jj3Var.l), getResources().getDimensionPixelSize(jj3Var.m), getResources().getDimensionPixelSize(jj3Var.n));
        setLayoutParams(a3eVar);
    }

    public final void setContent(dx00 dx00Var) {
        dx00Var.getClass();
        if (dx00Var instanceof bx00) {
            setImageRes(((bx00) dx00Var).f3353a);
            return;
        }
        if (dx00Var instanceof cx00) {
            cx00 cx00Var = (cx00) dx00Var;
            a(cx00Var.b, cx00Var.f5102a);
        } else if (dx00Var instanceof ax00) {
            b(((ax00) dx00Var).f1600a);
        } else {
            t9f.b();
        }
    }

    public final void setViewGravity(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f46319a.c;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i;
        appCompatImageView.setLayoutParams(layoutParams2);
    }
}
