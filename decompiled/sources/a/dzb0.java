package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dzb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6936a;
    public final o55 b;
    public final Rect c;
    public final int d;
    public final int e;
    public final Matrix f;
    public final snf0 g;
    public final String h;
    public final ig00 j;
    public int k = -1;
    public final ArrayList i = new ArrayList();

    public dzb0(s7a s7aVar, o55 o55Var, snf0 snf0Var, ig00 ig00Var, int i) {
        this.f6936a = i;
        this.b = o55Var;
        this.e = o55Var.h;
        this.d = o55Var.g;
        this.c = o55Var.e;
        this.f = o55Var.f;
        this.g = snf0Var;
        this.h = String.valueOf(s7aVar.hashCode());
        List<t9a> list = s7aVar.f31740a;
        Objects.requireNonNull(list);
        for (t9a t9aVar : list) {
            ArrayList arrayList = this.i;
            t9aVar.getClass();
            arrayList.add(0);
        }
        this.j = ig00Var;
        l8x.U("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.f6936a + ", mTagBundleKey = " + this.h);
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            ofm0.m();
            snf0 snf0Var = this.g;
            if (snf0Var.g) {
                return;
            }
            o55 o55Var = snf0Var.f32492a;
            o55Var.c.execute(new d12(o55Var, i));
        }
    }
}
