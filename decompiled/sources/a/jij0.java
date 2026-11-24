package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.combination.SettoeMezzoCombinationView;

/* JADX INFO: loaded from: classes4.dex */
public final class jij0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SettoeMezzoCombinationView f16578a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public jij0(SettoeMezzoCombinationView settoeMezzoCombinationView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.f16578a = settoeMezzoCombinationView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16578a;
    }
}
