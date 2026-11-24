package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class b47 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f1945a;
    public final TextView b;

    public b47(LinearLayoutCompat linearLayoutCompat, TextView textView) {
        this.f1945a = linearLayoutCompat;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1945a;
    }
}
