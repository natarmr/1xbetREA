package a;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class s3j0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31562a;
    public final dc3 b;
    public final dc3 c;

    public s3j0(LinearLayout linearLayout, dc3 dc3Var, dc3 dc3Var2) {
        this.f31562a = linearLayout;
        this.b = dc3Var;
        this.c = dc3Var2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31562a;
    }
}
