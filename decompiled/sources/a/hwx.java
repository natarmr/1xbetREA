package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class hwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f13786a;

    public hwx(TextView textView) {
        this.f13786a = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13786a;
    }
}
