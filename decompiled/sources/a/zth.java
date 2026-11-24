package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class zth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44959a;
    public final auh b;
    public final RoundCornerImageView c;
    public final TextView d;
    public final TextView e;

    public zth(ConstraintLayout constraintLayout, auh auhVar, RoundCornerImageView roundCornerImageView, TextView textView, TextView textView2) {
        this.f44959a = constraintLayout;
        this.b = auhVar;
        this.c = roundCornerImageView;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44959a;
    }
}
