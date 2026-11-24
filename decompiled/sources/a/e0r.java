package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final class e0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7002a;
    public final qk b;
    public final TextView c;
    public final DsButton d;
    public final qk e;
    public final View f;
    public final Flow g;
    public final GameVideoView h;
    public final Group i;
    public final ImageView j;
    public final DsButton k;
    public final TextView l;
    public final View m;
    public final View n;

    public e0r(ConstraintLayout constraintLayout, qk qkVar, TextView textView, DsButton dsButton, qk qkVar2, View view, Flow flow, GameVideoView gameVideoView, Group group, ImageView imageView, DsButton dsButton2, TextView textView2, View view2, View view3) {
        this.f7002a = constraintLayout;
        this.b = qkVar;
        this.c = textView;
        this.d = dsButton;
        this.e = qkVar2;
        this.f = view;
        this.g = flow;
        this.h = gameVideoView;
        this.i = group;
        this.j = imageView;
        this.k = dsButton2;
        this.l = textView2;
        this.m = view2;
        this.n = view3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7002a;
    }
}
