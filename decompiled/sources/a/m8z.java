package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m8z extends p4 {
    public final j8z c;
    public final jbz d;
    public final int e;
    public final /* synthetic */ jbz f;
    public final /* synthetic */ d9z g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8z(j8z j8zVar, jbz jbzVar, int i, d9z d9zVar, boolean z, int i2, int i3, long j) {
        super((byte) 6);
        this.f = jbzVar;
        this.g = d9zVar;
        this.h = z;
        this.i = i2;
        this.j = i3;
        this.k = j;
        this.c = j8zVar;
        this.d = jbzVar;
        this.e = i;
    }

    public final r8z n1(int i, long j, int i2, int i3, int i4) {
        int iJ;
        j8z j8zVar = this.c;
        Object objD = j8zVar.d(i);
        Object objA = j8zVar.b.a(i);
        List listZ0 = z0(this.d, i, j);
        if (p4e.g(j)) {
            iJ = p4e.k(j);
        } else {
            if (!p4e.f(j)) {
                adx.a("does not have fixed height");
            }
            iJ = p4e.j(j);
        }
        int i5 = iJ;
        k6z layoutDirection = this.f.b.getLayoutDirection();
        dbz dbzVar = this.g.m;
        return new r8z(i, objD, this.h, i5, i4, layoutDirection, this.i, this.j, listZ0, this.k, objA, dbzVar, j, i2, i3);
    }

    @Override // a.p4
    public final kbz w0(int i, int i2, int i3, long j) {
        return n1(i, j, i2, i3, this.e);
    }
}
