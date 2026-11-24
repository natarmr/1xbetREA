package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class bjr implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2719a = 1;
    public final ConstraintLayout b;
    public final ImageView c;

    public bjr(ConstraintLayout constraintLayout, ImageView imageView) {
        this.b = constraintLayout;
        this.c = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f2719a) {
            case 0:
                break;
        }
        return this.b;
    }

    public bjr(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.b = constraintLayout;
        this.c = imageView2;
    }
}
