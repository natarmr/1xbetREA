package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.ui_core.snackbar.NewSnackbarView;

/* JADX INFO: loaded from: classes6.dex */
public final class y6z implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewSnackbarView f42124a;
    public final ImageView b;
    public final TextView c;

    public y6z(NewSnackbarView newSnackbarView, ImageView imageView, TextView textView) {
        this.f42124a = newSnackbarView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42124a;
    }
}
