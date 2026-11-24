package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label;

import a.a3e;
import a.ewm0;
import a.maz;
import a.n0o0;
import a.pn3;
import a.q7x;
import a.ucj;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Parcelable;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MaterialTextView {
    public int i;
    public int j;
    public String k;
    public boolean l;
    public final n0o0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.i = -1;
        this.j = -1;
        this.k = "";
        this.m = maz.b(new ucj(this, (byte) 24));
        setId(R.id.downloadLabel);
    }

    private final ObjectAnimator getFlickAnimator() {
        return (ObjectAnimator) this.m.getValue();
    }

    public final void j() {
        if (this.l || this.i == -1 || this.j == -1) {
            return;
        }
        this.l = true;
        getFlickAnimator().start();
    }

    public final void k() {
        if (!this.l || this.i == -1 || this.j == -1 || !getFlickAnimator().isRunning()) {
            return;
        }
        this.l = false;
        getFlickAnimator().cancel();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DownloadLabel$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DownloadLabel$SavedState downloadLabel$SavedState = (DownloadLabel$SavedState) parcelable;
        this.i = downloadLabel$SavedState.c;
        this.j = downloadLabel$SavedState.d;
        setContent(downloadLabel$SavedState.b);
        this.l = downloadLabel$SavedState.e;
        super.onRestoreInstanceState(downloadLabel$SavedState.f46340a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DownloadLabel$SavedState(super.onSaveInstanceState(), this.k, this.i, this.j, this.l);
    }

    public final void setContent(String str) {
        str.getClass();
        if (str.length() == 0 || Intrinsics.d(str, this.k)) {
            return;
        }
        this.k = str;
        setText(str);
    }

    public final void setViewLayoutParams(pn3 pn3Var) {
        pn3Var.getClass();
        a3e a3eVar = new a3e(pn3Var.f27265a, pn3Var.b);
        q7x.G(a3eVar, pn3Var);
        ewm0.u(this, pn3Var);
        a3eVar.setMargins(getResources().getDimensionPixelSize(pn3Var.k), getResources().getDimensionPixelSize(pn3Var.l), getResources().getDimensionPixelSize(pn3Var.m), getResources().getDimensionPixelSize(pn3Var.n));
        setLayoutParams(a3eVar);
    }
}
