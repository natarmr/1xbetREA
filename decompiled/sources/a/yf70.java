package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yf70 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42527a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ yf70(yx5 yx5Var, TextView textView, byte b) {
        this.f42527a = b;
        this.b = textView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.f42527a;
        TextView textView = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = dg70.Q1;
                textView.setVisibility(z ? 8 : 0);
                break;
            default:
                jh70 jh70Var = mh70.Q1;
                textView.setVisibility(z ? 8 : 0);
                break;
        }
    }
}
