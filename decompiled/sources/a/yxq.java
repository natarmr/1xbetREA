package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class yxq extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f43436a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public yxq(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f43436a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            tl60.a(this.f43436a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.c;
        ViewGroup viewGroup = this.f43436a;
        if (z || !this.e) {
            viewGroup.endViewTransition(this.b);
            this.d = true;
        } else {
            this.e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            tl60.a(this.f43436a, this);
        }
        return true;
    }
}
