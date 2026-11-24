package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class cck implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4115a;
    public final TextView b;

    public cck(TextView textView, TextView textView2) {
        this.f4115a = (byte) 2;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f4115a;
        return this.b;
    }

    public /* synthetic */ cck(TextView textView, byte b) {
        this.f4115a = b;
        this.b = textView;
    }
}
