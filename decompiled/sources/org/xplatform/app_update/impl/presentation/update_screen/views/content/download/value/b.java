package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value;

import a.a3e;
import a.ewm0;
import a.fcl;
import a.maz;
import a.n0o0;
import a.pn3;
import a.q7x;
import a.yg3;
import android.content.Context;
import android.os.Parcelable;
import com.google.android.material.textview.MaterialTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MaterialTextView {
    public int i;
    public fcl j;
    public boolean k;
    public final n0o0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.l = maz.b(new yg3(context, (byte) 24));
        setId(R.id.downloadValue);
        setText(getResources().getString(R.string.download_progress_value, 0));
    }

    private final int getStaticWhite() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DownloadValue$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DownloadValue$SavedState downloadValue$SavedState = (DownloadValue$SavedState) parcelable;
        fcl fclVar = downloadValue$SavedState.b;
        if (fclVar != null) {
            this.j = fclVar;
        }
        this.k = downloadValue$SavedState.d;
        setContent(downloadValue$SavedState.c);
        super.onRestoreInstanceState(downloadValue$SavedState.f46341a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DownloadValue$SavedState(super.onSaveInstanceState(), this.j, this.i, this.k);
    }

    public final void setContent(int i) {
        fcl fclVar;
        if (i <= this.i) {
            return;
        }
        if (i >= 48 && getCurrentTextColor() != getStaticWhite() && this.k && (fclVar = this.j) != null && fclVar == fcl.b) {
            setTextColor(getStaticWhite());
        }
        this.i = i;
        setText(getResources().getString(R.string.download_progress_value, Integer.valueOf(i)));
    }

    public final void setDownloadBarType(fcl fclVar) {
        fclVar.getClass();
        if (fclVar == this.j) {
            return;
        }
        this.j = fclVar;
    }

    public final void setDynamicTextColor(boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
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
