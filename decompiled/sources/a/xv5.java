package a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xv5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41541a;
    public final /* synthetic */ View b;

    public /* synthetic */ xv5(View view, byte b) {
        this.f41541a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f41541a;
        View view = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = iw5.j2;
                view.requestLayout();
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 2:
                view.setVisibility(0);
                break;
            default:
                view.setVisibility(8);
                break;
        }
    }
}
