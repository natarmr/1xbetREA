package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.core.presentation.views.tax_message.TaxMessageView;

/* JADX INFO: loaded from: classes3.dex */
public final class zk70 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44516a;
    public final AppCompatImageView b;
    public final ConstraintLayout c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final TaxMessageView j;

    public zk70(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, TaxMessageView taxMessageView) {
        this.f44516a = constraintLayout;
        this.b = appCompatImageView;
        this.c = constraintLayout2;
        this.d = frameLayout;
        this.e = textView;
        this.f = frameLayout2;
        this.g = frameLayout3;
        this.h = frameLayout4;
        this.i = frameLayout5;
        this.j = taxMessageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44516a;
    }
}
