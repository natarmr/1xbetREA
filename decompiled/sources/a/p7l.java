package a;

import android.content.Context;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class p7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26511a;
    public final int b;
    public final int c;
    public final int d;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final int s;
    public final float t;
    public final float v;
    public final int w;
    public float e = 1.0f;
    public final a8z u = maz.a(wez.b, new ucj(this, 20));

    public p7l(Context context) {
        this.f26511a = context;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.size_576);
        this.f = context.getResources().getDimension(R.dimen.corner_radius_8);
        this.g = context.getResources().getDimension(R.dimen.corner_radius_16);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_28);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_70);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.size_16);
        this.k = context.getResources().getDimension(R.dimen.text_10);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.size_192);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.size_42);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.size_12);
        this.q = context.getResources().getDimension(R.dimen.text_10);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.space_10);
        this.t = context.getResources().getDimension(R.dimen.text_14);
        this.v = context.getResources().getDimension(R.dimen.text_12);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.size_8);
    }

    public final float a() {
        return this.f * this.e;
    }

    public final int b() {
        return (this.c * 2) + si30.b(this.l * this.e);
    }

    public final int c() {
        return si30.b(this.n * this.e);
    }

    public final int d() {
        return si30.b(this.h * this.e);
    }

    public final int e() {
        return si30.b(this.j * this.e);
    }

    public final float f() {
        return this.k * this.e;
    }

    public final int g() {
        return si30.b(this.i * this.e);
    }
}
