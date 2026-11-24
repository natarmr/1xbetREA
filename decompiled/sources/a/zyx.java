package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.ui_core.viewcomponents.views.TimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class zyx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f45227a;
    public final TextView b;
    public final Group c;
    public final Group d;
    public final ImageView e;
    public final View f;
    public final TimerView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    public zyx(ConstraintLayout constraintLayout, TextView textView, Group group, Group group2, ImageView imageView, View view, TimerView timerView, TextView textView2, TextView textView3, TextView textView4) {
        this.f45227a = constraintLayout;
        this.b = textView;
        this.c = group;
        this.d = group2;
        this.e = imageView;
        this.f = view;
        this.g = timerView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45227a;
    }
}
