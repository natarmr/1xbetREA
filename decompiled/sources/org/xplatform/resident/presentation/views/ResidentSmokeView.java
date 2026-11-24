package org.xplatform.resident.presentation.views;

import a.b4f0;
import a.d5c;
import a.epv0;
import a.rwj;
import a.sje;
import a.tvk;
import a.ys10;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ResidentSmokeView extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sje f46886a;
    public final ImageView b;
    public Function0 c;
    public Function0 d;
    public Function0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResidentSmokeView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0, 0);
        rwj rwjVar = tvk.f34603a;
        this.f46886a = d5c.a(ys10.f43147a);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        this.c = new b4f0((byte) 21);
        this.d = new b4f0((byte) 22);
        this.e = new b4f0((byte) 23);
        addView(imageView);
        imageView.setImageDrawable(epv0.U(R.drawable.ic_resident_smoke_drawable, context));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d5c.G(this.f46886a, null);
    }

    public final void setMaxSmokeShowListener(Function0<Unit> function0) {
        function0.getClass();
        this.c = function0;
    }

    public final void setSmokeFinishedListener(Function0<Unit> function0) {
        function0.getClass();
        this.d = function0;
    }

    public final void setSmokeStartedListener(Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentSmokeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentSmokeView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
