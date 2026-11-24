package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final class qk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28863a;
    public final ConstraintLayout b;
    public final DsButton c;
    public final ImageView d;
    public final TextView e;

    public /* synthetic */ qk(ConstraintLayout constraintLayout, DsButton dsButton, ImageView imageView, TextView textView, byte b) {
        this.f28863a = b;
        this.b = constraintLayout;
        this.c = dsButton;
        this.d = imageView;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f28863a;
        return this.b;
    }
}
