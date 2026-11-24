package a;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class vr9 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37888a;
    public final LinearLayout b;

    public /* synthetic */ vr9(LinearLayout linearLayout, byte b) {
        this.f37888a = b;
        this.b = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f37888a;
        return this.b;
    }
}
