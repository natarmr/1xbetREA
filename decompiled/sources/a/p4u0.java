package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p4u0 extends r4u0 implements Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26375a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public p4u0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f26375a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p4u0)) {
            return false;
        }
        p4u0 p4u0Var = (p4u0) obj;
        return Intrinsics.d(this.f26375a, p4u0Var.f26375a) && this.b == p4u0Var.b && this.c == p4u0Var.c && this.d == p4u0Var.d && this.e == p4u0Var.e && this.f == p4u0Var.f && this.g == p4u0Var.g && this.h == p4u0Var.h && Intrinsics.d(this.i, p4u0Var.i) && this.j.equals(p4u0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(this.f26375a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e3(this);
    }
}
