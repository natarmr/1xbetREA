package org.xplatform.app_start.impl.presentation.view.content.partner;

import a.a3e;
import a.fx80;
import a.gx80;
import a.hny;
import a.hx80;
import a.ix80;
import a.jj3;
import a.mym0;
import a.nq8;
import a.r7x;
import a.rgu0;
import a.t9f;
import a.u0d;
import a.w23;
import a.yum0;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq8 f46321a;
    public int b;
    public String c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.app_start_partner_view, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(this, R.id.partnerImage);
        if (appCompatImageView == null) {
            hny.u("Missing required view with ID: ".concat(getResources().getResourceName(R.id.partnerImage)));
            throw null;
        }
        this.f46321a = new nq8(this, appCompatImageView, (byte) 3);
        this.c = "";
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 1));
        } else {
            a();
        }
    }

    private final void setImageRes(int i) {
        if (i == 0 || this.b == i) {
            return;
        }
        this.b = i;
        ((AppCompatImageView) this.f46321a.c).setImageDrawable(getContext().getDrawable(i));
        if (isLaidOut()) {
            a();
        }
    }

    public final void a() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_448);
        int width = (int) (((double) getWidth()) * 0.8d);
        if (width > dimensionPixelSize) {
            width = dimensionPixelSize;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_88);
        int iMin = Math.min((width * dimensionPixelSize2) / dimensionPixelSize, dimensionPixelSize2);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f46321a.c;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = width;
        layoutParams.height = iMin;
        appCompatImageView.setLayoutParams(layoutParams);
    }

    public final void b(int i, String str) {
        if (Intrinsics.d(str, this.c) && this.b == i && !this.d) {
            return;
        }
        this.c = str;
        this.b = i;
        this.d = false;
        List list = u0d.f34849a;
        u0d.e((AppCompatImageView) this.f46321a.c, str, null, null);
        if (isLaidOut()) {
            a();
        }
    }

    public final void c(int i) {
        if (this.d && this.b == i) {
            return;
        }
        this.c = "";
        this.b = i;
        this.d = true;
        List list = u0d.f34849a;
        nq8 nq8Var = this.f46321a;
        u0d.a((AppCompatImageView) nq8Var.c);
        ((AppCompatImageView) nq8Var.c).setImageDrawable(null);
        if (isLaidOut()) {
            a();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AppStartPartnerView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AppStartPartnerView$SavedState appStartPartnerView$SavedState = (AppStartPartnerView$SavedState) parcelable;
        String str = appStartPartnerView$SavedState.c;
        int i = appStartPartnerView$SavedState.b;
        super.onRestoreInstanceState(appStartPartnerView$SavedState.f46320a);
        if (appStartPartnerView$SavedState.d) {
            c(i);
        } else if (str.length() > 0) {
            b(i, str);
        } else {
            setImageRes(i);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AppStartPartnerView$SavedState(super.onSaveInstanceState(), this.b, this.c, this.d);
    }

    public final void setContainerLayoutParams(jj3 jj3Var) {
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
    }

    public final void setContent(ix80 ix80Var) {
        ix80Var.getClass();
        if (ix80Var instanceof gx80) {
            setImageRes(((gx80) ix80Var).f12066a);
            return;
        }
        if (ix80Var instanceof hx80) {
            hx80 hx80Var = (hx80) ix80Var;
            b(hx80Var.b, hx80Var.f13804a);
        } else if (ix80Var instanceof fx80) {
            c(((fx80) ix80Var).f10298a);
        } else {
            t9f.b();
        }
    }
}
