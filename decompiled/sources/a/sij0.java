package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.costrule.SettoeMezzoRuleView;

/* JADX INFO: loaded from: classes4.dex */
public final class sij0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SettoeMezzoRuleView f32266a;
    public final ImageView b;
    public final TextView c;

    public sij0(SettoeMezzoRuleView settoeMezzoRuleView, ImageView imageView, TextView textView) {
        this.f32266a = settoeMezzoRuleView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32266a;
    }
}
