package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class dtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6673a;
    public final TextView b;
    public final TextView c;

    public /* synthetic */ dtx(TextView textView, TextView textView2, byte b) {
        this.f6673a = b;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f6673a;
        return this.b;
    }
}
