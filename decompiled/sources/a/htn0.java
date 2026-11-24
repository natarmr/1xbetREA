package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class htn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13643a;
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
    public final String l;
    public final String m;
    public final ftn0 n;
    public final fzc o;

    public htn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ftn0 ftn0Var, fzc fzcVar) {
        brm0.B(str6, str7, str8);
        this.f13643a = i;
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
        this.l = str11;
        this.m = str12;
        this.n = ftn0Var;
        this.o = fzcVar;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof htn0) || !(p6t0Var2 instanceof htn0)) {
            return false;
        }
        htn0 htn0Var = (htn0) p6t0Var;
        htn0 htn0Var2 = (htn0) p6t0Var2;
        return htn0Var.f13643a == htn0Var2.f13643a && Intrinsics.d(htn0Var.h, htn0Var2.h) && Intrinsics.d(htn0Var.i, htn0Var2.i) && htn0Var.j.equals(htn0Var2.j);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof htn0) || !(p6t0Var2 instanceof htn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        htn0 htn0Var = (htn0) p6t0Var;
        htn0 htn0Var2 = (htn0) p6t0Var2;
        k9x.G(linkedHashSet, new ctn0(htn0Var.k), new ctn0(htn0Var2.k));
        k9x.G(linkedHashSet, new etn0(htn0Var.l), new etn0(htn0Var2.l));
        k9x.G(linkedHashSet, htn0Var.n, htn0Var2.n);
        k9x.G(linkedHashSet, new dtn0(htn0Var.o), new dtn0(htn0Var2.o));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }
}
