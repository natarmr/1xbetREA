package a;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class ii30 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zjj0 f14810a;
    public csn b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public ii30(ii30 ii30Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.f14810a = ii30Var.f14810a;
        this.b = ii30Var.b;
        this.j = ii30Var.j;
        this.c = ii30Var.c;
        this.d = ii30Var.d;
        this.f = ii30Var.f;
        this.e = ii30Var.e;
        this.k = ii30Var.k;
        this.h = ii30Var.h;
        this.o = ii30Var.o;
        this.i = ii30Var.i;
        this.l = ii30Var.l;
        this.m = ii30Var.m;
        this.n = ii30Var.n;
        this.p = ii30Var.p;
        if (ii30Var.g != null) {
            this.g = new Rect(ii30Var.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ki30 ki30Var = new ki30(this);
        ki30Var.f = true;
        ki30Var.g = true;
        return ki30Var;
    }

    public ii30(zjj0 zjj0Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.f14810a = zjj0Var;
        this.b = null;
    }
}
