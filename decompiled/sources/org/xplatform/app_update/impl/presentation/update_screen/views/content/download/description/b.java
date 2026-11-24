package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description;

import a.a3e;
import a.ewm0;
import a.pn3;
import a.q7x;
import android.os.Parcelable;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MaterialTextView {
    public String i;

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DownloadDescription$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DownloadDescription$SavedState downloadDescription$SavedState = (DownloadDescription$SavedState) parcelable;
        setContent(downloadDescription$SavedState.b);
        super.onRestoreInstanceState(downloadDescription$SavedState.f46339a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DownloadDescription$SavedState(super.onSaveInstanceState(), this.i);
    }

    public final void setContent(String str) {
        str.getClass();
        if (str.length() == 0 || Intrinsics.d(str, this.i)) {
            return;
        }
        this.i = str;
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
