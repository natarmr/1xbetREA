package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xqg0 implements Cloneable {
    public Float A;
    public grg0 B;
    public Float Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41318a = 0;
    public grg0 b;
    public Float c;
    public grg0 d;
    public Float e;
    public jqg0 f;
    public int f1;
    public Float g;
    public int g1;
    public jqg0[] h;
    public int h1;
    public jqg0 i;
    public int i1;
    public Float j;
    public int j1;
    public aqg0 k;
    public int k1;
    public ArrayList l;
    public int l1;
    public jqg0 m;
    public int m1;
    public Integer n;
    public int n1;
    public Boolean o;
    public n660 p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public grg0 v;
    public Float w;
    public String x;
    public String y;
    public grg0 z;

    public static xqg0 a() {
        xqg0 xqg0Var = new xqg0();
        xqg0Var.f41318a = -1L;
        aqg0 aqg0Var = aqg0.b;
        xqg0Var.b = aqg0Var;
        xqg0Var.Z = 1;
        Float fValueOf = Float.valueOf(1.0f);
        xqg0Var.c = fValueOf;
        xqg0Var.d = null;
        xqg0Var.e = fValueOf;
        xqg0Var.f = new jqg0(1.0f);
        xqg0Var.f1 = 1;
        xqg0Var.g1 = 1;
        xqg0Var.g = Float.valueOf(4.0f);
        xqg0Var.h = null;
        xqg0Var.i = new jqg0(0.0f);
        xqg0Var.j = fValueOf;
        xqg0Var.k = aqg0Var;
        xqg0Var.l = null;
        xqg0Var.m = new jqg0(12.0f, 7);
        xqg0Var.n = Integer.valueOf(Response.BAD_REQUEST);
        xqg0Var.h1 = 1;
        xqg0Var.i1 = 1;
        xqg0Var.j1 = 1;
        xqg0Var.k1 = 1;
        Boolean bool = Boolean.TRUE;
        xqg0Var.o = bool;
        xqg0Var.p = null;
        xqg0Var.q = null;
        xqg0Var.r = null;
        xqg0Var.s = null;
        xqg0Var.t = bool;
        xqg0Var.u = bool;
        xqg0Var.v = aqg0Var;
        xqg0Var.w = fValueOf;
        xqg0Var.x = null;
        xqg0Var.l1 = 1;
        xqg0Var.y = null;
        xqg0Var.z = null;
        xqg0Var.A = fValueOf;
        xqg0Var.B = null;
        xqg0Var.Y = fValueOf;
        xqg0Var.m1 = 1;
        xqg0Var.n1 = 1;
        return xqg0Var;
    }

    public final Object clone() {
        xqg0 xqg0Var = (xqg0) super.clone();
        jqg0[] jqg0VarArr = this.h;
        if (jqg0VarArr != null) {
            xqg0Var.h = (jqg0[]) jqg0VarArr.clone();
        }
        return xqg0Var;
    }
}
