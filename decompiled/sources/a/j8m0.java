package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j8m0 implements c4u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7m0 f16091a;
    public l7m0 b;
    public l7m0 c;
    public l7m0 d;
    public l7m0 e;
    public l7m0 f;
    public l7m0 g;
    public l7m0 h;
    public l7m0 i;
    public l7m0 j;
    public l7m0 k;
    public l7m0 l;
    public l7m0 m;
    public l7m0 n;
    public l7m0 o;
    public l7m0 p;

    @Override // a.c4u0
    public final Object a(ipm0 ipm0Var, Object obj) {
        List list;
        if (ipm0Var instanceof a5u0) {
            l7m0 l7m0Var = this.f16091a;
            if (l7m0Var != null) {
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof y4u0) {
            l7m0 l7m0Var2 = this.b;
            if (l7m0Var2 != null) {
                return Float.valueOf(((Number) l7m0Var2.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof z4u0) {
            l7m0 l7m0Var3 = this.c;
            if (l7m0Var3 != null) {
                return Float.valueOf(((Number) l7m0Var3.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof b5u0) {
            l7m0 l7m0Var4 = this.d;
            if (l7m0Var4 != null) {
                return Float.valueOf(((Number) l7m0Var4.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof c5u0) {
            l7m0 l7m0Var5 = this.e;
            if (l7m0Var5 != null) {
                return Float.valueOf(((Number) l7m0Var5.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof g5u0) {
            l7m0 l7m0Var6 = this.f;
            if (l7m0Var6 != null) {
                return Float.valueOf(((Number) l7m0Var6.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof h5u0) {
            l7m0 l7m0Var7 = this.g;
            if (l7m0Var7 != null) {
                return Float.valueOf(((Number) l7m0Var7.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof x4u0) {
            l7m0 l7m0Var8 = this.h;
            if (l7m0Var8 != null && (list = (List) l7m0Var8.getValue()) != null) {
                return list;
            }
        } else if (ipm0Var instanceof v4u0) {
            l7m0 l7m0Var9 = this.i;
            if (l7m0Var9 != null) {
                return new skk0(((y3d) l7m0Var9.getValue()).f41946a);
            }
        } else if (ipm0Var instanceof w4u0) {
            l7m0 l7m0Var10 = this.m;
            if (l7m0Var10 != null) {
                return Float.valueOf(((Number) l7m0Var10.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof d5u0) {
            l7m0 l7m0Var11 = this.j;
            if (l7m0Var11 != null) {
                return new skk0(((y3d) l7m0Var11.getValue()).f41946a);
            }
        } else if (ipm0Var instanceof f5u0) {
            l7m0 l7m0Var12 = this.k;
            if (l7m0Var12 != null) {
                return Float.valueOf(((Number) l7m0Var12.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof e5u0) {
            l7m0 l7m0Var13 = this.l;
            if (l7m0Var13 != null) {
                return Float.valueOf(((Number) l7m0Var13.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof k5u0) {
            l7m0 l7m0Var14 = this.n;
            if (l7m0Var14 != null) {
                return Float.valueOf(((Number) l7m0Var14.getValue()).floatValue());
            }
        } else if (ipm0Var instanceof i5u0) {
            l7m0 l7m0Var15 = this.o;
            if (l7m0Var15 != null) {
                return Float.valueOf(((Number) l7m0Var15.getValue()).floatValue());
            }
        } else {
            if (!(ipm0Var instanceof j5u0)) {
                t9f.b();
                return null;
            }
            l7m0 l7m0Var16 = this.p;
            if (l7m0Var16 != null) {
                return Float.valueOf(((Number) l7m0Var16.getValue()).floatValue());
            }
        }
        return obj;
    }
}
