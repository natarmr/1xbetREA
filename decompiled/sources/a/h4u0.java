package a;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h4u0 extends i4u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f12452a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public h4u0(h4u0 h4u0Var, gx3 gx3Var) {
        j4u0 f4u0Var;
        this.f12452a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = h4u0Var.c;
        this.d = h4u0Var.d;
        this.e = h4u0Var.e;
        this.f = h4u0Var.f;
        this.g = h4u0Var.g;
        this.h = h4u0Var.h;
        this.i = h4u0Var.i;
        String str = h4u0Var.k;
        this.k = str;
        if (str != null) {
            gx3Var.put(str, this);
        }
        matrix.set(h4u0Var.j);
        ArrayList arrayList = h4u0Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof h4u0) {
                this.b.add(new h4u0((h4u0) obj, gx3Var));
            } else {
                if (obj instanceof g4u0) {
                    g4u0 g4u0Var = (g4u0) obj;
                    g4u0 g4u0Var2 = new g4u0(g4u0Var);
                    g4u0Var2.e = 0.0f;
                    g4u0Var2.g = 1.0f;
                    g4u0Var2.h = 1.0f;
                    g4u0Var2.i = 0.0f;
                    g4u0Var2.j = 1.0f;
                    g4u0Var2.k = 0.0f;
                    g4u0Var2.l = Paint.Cap.BUTT;
                    g4u0Var2.m = Paint.Join.MITER;
                    g4u0Var2.n = 4.0f;
                    g4u0Var2.d = g4u0Var.d;
                    g4u0Var2.e = g4u0Var.e;
                    g4u0Var2.g = g4u0Var.g;
                    g4u0Var2.f = g4u0Var.f;
                    g4u0Var2.c = g4u0Var.c;
                    g4u0Var2.h = g4u0Var.h;
                    g4u0Var2.i = g4u0Var.i;
                    g4u0Var2.j = g4u0Var.j;
                    g4u0Var2.k = g4u0Var.k;
                    g4u0Var2.l = g4u0Var.l;
                    g4u0Var2.m = g4u0Var.m;
                    g4u0Var2.n = g4u0Var.n;
                    f4u0Var = g4u0Var2;
                } else {
                    if (!(obj instanceof f4u0)) {
                        jf4.n("Unknown object in the tree!");
                        throw null;
                    }
                    f4u0Var = new f4u0((f4u0) obj);
                }
                this.b.add(f4u0Var);
                Object obj2 = f4u0Var.b;
                if (obj2 != null) {
                    gx3Var.put(obj2, f4u0Var);
                }
            }
        }
    }

    @Override // a.i4u0
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((i4u0) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // a.i4u0
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((i4u0) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public h4u0() {
        this.f12452a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
