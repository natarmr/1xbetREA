package a;

import androidx.collection.MutableIntList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mez f5975a;
    public final MutableIntList b;
    public final ydz c;
    public final kez d;
    public final long e;
    public final boolean f;
    public final jbz g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final vne m;
    public final boolean n;
    public final List o;
    public final afv p;
    public final cez q;
    public final zz2 r;
    public final int s;

    public dez(mez mezVar, MutableIntList mutableIntList, ydz ydzVar, kez kezVar, long j, boolean z, jbz jbzVar, int i, long j2, int i2, int i3, int i4, vne vneVar, boolean z2, List list, afv afvVar) {
        this.f5975a = mezVar;
        this.b = mutableIntList;
        this.c = ydzVar;
        this.d = kezVar;
        this.e = j;
        this.f = z;
        this.g = jbzVar;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = vneVar;
        this.n = z2;
        this.o = list;
        this.p = afvVar;
        this.q = new cez(this, z, ydzVar, jbzVar, kezVar);
        this.r = mezVar.e;
        this.s = kezVar.b.length;
    }

    public final long a(ydz ydzVar, int i, int i2) {
        boolean zQ = ydzVar.b.b.q(i);
        int i3 = zQ ? this.s : 1;
        if (zQ) {
            i2 = 0;
        }
        return (((long) i2) << 32) | (((long) (i3 + i2)) & 4294967295L);
    }
}
