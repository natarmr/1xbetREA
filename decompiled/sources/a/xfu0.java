package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class xfu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0d f40811a;
    public final AppCompatTextView b;

    public xfu0(b0d b0dVar, AppCompatTextView appCompatTextView) {
        this.f40811a = b0dVar;
        this.b = appCompatTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40811a;
    }
}
