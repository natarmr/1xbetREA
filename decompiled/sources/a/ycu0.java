package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class ycu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42401a;
    public final ConstraintLayout b;
    public final RoundCornerImageView c;
    public final TextView d;
    public final TextView e;

    public /* synthetic */ ycu0(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, TextView textView, TextView textView2, byte b) {
        this.f42401a = b;
        this.b = constraintLayout;
        this.c = roundCornerImageView;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f42401a) {
            case 0:
                break;
        }
        return this.b;
    }
}
