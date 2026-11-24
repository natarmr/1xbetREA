package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hqq extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable.ConstantState f13496a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public zjj0 t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;

    public hqq(hqq hqqVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.q;
        if (hqqVar != null) {
            this.f13496a = hqqVar.f13496a;
            this.b = hqqVar.b;
            this.c = hqqVar.c;
            this.d = hqqVar.d;
            this.e = hqqVar.e;
            this.f = hqqVar.f;
            this.g = hqqVar.g;
            this.h = hqqVar.h;
            this.i = hqqVar.i;
            this.j = hqqVar.j;
            this.k = hqqVar.k;
            this.l = hqqVar.l;
            this.m = hqqVar.m;
            this.n = hqqVar.n;
            this.o = hqqVar.o;
            this.p = hqqVar.p;
            this.q = hqqVar.q;
            this.r = hqqVar.r;
            this.s = hqqVar.s;
            this.u = hqqVar.u;
            this.v = hqqVar.v;
            zjj0 zjj0Var = hqqVar.t;
            if (zjj0Var instanceof akj0) {
                this.t = ((akj0) zjj0Var).l().c();
            } else if (zjj0Var instanceof u7m0) {
                this.t = ((u7m0) zjj0Var).j().b();
            } else {
                this.t = zjj0Var;
            }
            if (hqqVar.w != null) {
                this.w = new Rect(hqqVar.w);
            }
            int[] iArr = hqqVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f13496a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
