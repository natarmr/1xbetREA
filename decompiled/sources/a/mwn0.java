package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mwn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22514a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final kwn0 l;
    public final fzc m;

    public mwn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, kwn0 kwn0Var, String str11, fzc fzcVar) {
        brm0.B(str4, str5, str7);
        this.f22514a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = kwn0Var;
        this.m = fzcVar;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof mwn0) || !(p6t0Var2 instanceof mwn0)) {
            return false;
        }
        mwn0 mwn0Var = (mwn0) p6t0Var;
        mwn0 mwn0Var2 = (mwn0) p6t0Var2;
        return mwn0Var.f22514a == mwn0Var2.f22514a && Intrinsics.d(mwn0Var.f, mwn0Var2.f) && Intrinsics.d(mwn0Var.h, mwn0Var2.h) && mwn0Var.g.equals(mwn0Var2.g);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof mwn0) || !(p6t0Var2 instanceof mwn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        mwn0 mwn0Var = (mwn0) p6t0Var;
        mwn0 mwn0Var2 = (mwn0) p6t0Var2;
        k9x.G(linkedHashSet, new hwn0(mwn0Var.i), new hwn0(mwn0Var2.i));
        k9x.G(linkedHashSet, new jwn0(mwn0Var.j), new jwn0(mwn0Var2.j));
        k9x.G(linkedHashSet, mwn0Var.l, mwn0Var2.l);
        k9x.G(linkedHashSet, new iwn0(mwn0Var.m), new iwn0(mwn0Var2.m));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }
}
