package a;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes5.dex */
public final class jjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f16622a;
    public final View b;
    public final LinearLayoutCompat c;
    public final LinearLayoutCompat d;

    public jjk(LinearLayoutCompat linearLayoutCompat, View view, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3) {
        this.f16622a = linearLayoutCompat;
        this.b = view;
        this.c = linearLayoutCompat2;
        this.d = linearLayoutCompat3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16622a;
    }
}
