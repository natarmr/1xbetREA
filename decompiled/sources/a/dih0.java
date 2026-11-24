package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dih0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.d f6139a;

    public dih0(androidx.appcompat.widget.d dVar) {
        this.f6139a = dVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        androidx.appcompat.widget.d dVar = this.f6139a;
        View.OnFocusChangeListener onFocusChangeListener = dVar.o1;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(dVar, z);
        }
    }
}
