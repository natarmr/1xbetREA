package a;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oh30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f25247a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public pb5 f;

    public oh30(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = n6x.T(context, R.attr.motionDurationMedium2, 300);
        this.d = n6x.T(context, R.attr.motionDurationShort3, 150);
        this.e = n6x.T(context, R.attr.motionDurationShort2, 100);
    }
}
