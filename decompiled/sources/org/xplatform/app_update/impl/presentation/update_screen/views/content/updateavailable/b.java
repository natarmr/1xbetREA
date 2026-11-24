package org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable;

import a.a3e;
import a.pn3;
import a.q7x;
import android.os.Parcelable;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MaterialTextView {
    public String i;
    public String j;

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof AppUpdateAvailableView$SavedState) {
            super.onRestoreInstanceState(((AppUpdateAvailableView$SavedState) parcelable).f46346a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AppUpdateAvailableView$SavedState(super.onSaveInstanceState());
    }

    public final void setViewLayoutParams(pn3 pn3Var) {
        pn3Var.getClass();
        a3e a3eVar = new a3e(pn3Var.f27265a, pn3Var.b);
        q7x.G(a3eVar, pn3Var);
        a3eVar.setMargins(getResources().getDimensionPixelSize(pn3Var.k), getResources().getDimensionPixelSize(pn3Var.l), getResources().getDimensionPixelSize(pn3Var.m), getResources().getDimensionPixelSize(pn3Var.n));
        setLayoutParams(a3eVar);
    }
}
