package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class z2i implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u3i f43669a;
    public final /* synthetic */ u3i b;
    public final /* synthetic */ u3i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public z2i(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, int i, int i2, int i3, int i4) {
        this.f43669a = u3iVar;
        this.b = u3iVar2;
        this.c = u3iVar3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009d A[LOOP:0: B:21:0x0097->B:23:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x003b A[PHI: r7
  0x003b: PHI (r7v1 int) = (r7v0 int), (r7v8 int) binds: [B:3:0x001f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        int i;
        pu90 pu90VarS2;
        Iterator it;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        pj30 pj30Var;
        list.getClass();
        int i7 = p4e.i(j);
        pj30 pj30Var2 = (pj30) list.get(0);
        pj30 pj30Var3 = (pj30) list.get(1);
        pu90 pu90VarS3 = null;
        int i8 = 2;
        if (this.f43669a instanceof z3i) {
            pj30 pj30Var4 = (pj30) CollectionsKt.W(2, list);
            i8 = 3;
            if (pj30Var4 != null) {
                pu90VarS = pj30Var4.S(p4e.b(j, 0, 0, 0, 0, 10));
            } else {
                pu90VarS = null;
            }
        } else {
            pu90VarS = null;
        }
        if (this.b instanceof x3i) {
            i = i8 + 1;
            pj30 pj30Var5 = (pj30) CollectionsKt.W(i8, list);
            if (pj30Var5 != null) {
                pu90VarS2 = pj30Var5.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            if ((this.c instanceof s3i) && (pj30Var = (pj30) CollectionsKt.W(i, list)) != null) {
                pu90VarS3 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            pu90 pu90Var = pu90VarS3;
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS, pu90VarS2, pu90Var})).iterator();
            i2 = 0;
            while (it.hasNext()) {
                i2 += ((pu90) it.next()).f27604a;
            }
            int i9 = this.e;
            int i10 = this.d;
            i3 = ((i7 - i10) - i9) - i2;
            if (i3 < 0) {
                i4 = 0;
            } else {
                i4 = i3;
            }
            if (i3 < 0) {
                i5 = 0;
            } else {
                i5 = i3;
            }
            pu90 pu90VarS4 = pj30Var2.S(r4e.b(i4, i5, 0, 0, 12));
            if (i3 < 0) {
                i6 = 0;
            } else {
                i6 = i3;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            return vj30.x(vj30Var, i7, this.g, new y2i(i10, pu90VarS4, this.d, pj30Var3.S(r4e.b(i6, i3, 0, 0, 12)), pu90VarS, pu90VarS2, pu90Var, i7, this.f, this.f));
        }
        i = i8;
        pu90VarS2 = null;
        if (this.c instanceof s3i) {
            pu90VarS3 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
        }
        pu90 pu90Var2 = pu90VarS3;
        it = ((ArrayList) tx3.z(new pu90[]{pu90VarS, pu90VarS2, pu90Var2})).iterator();
        i2 = 0;
        while (it.hasNext()) {
            i2 += ((pu90) it.next()).f27604a;
        }
        int i11 = this.e;
        int i12 = this.d;
        i3 = ((i7 - i12) - i11) - i2;
        if (i3 < 0) {
            i4 = 0;
        } else {
            i4 = i3;
        }
        if (i3 < 0) {
            i5 = 0;
        } else {
            i5 = i3;
        }
        pu90 pu90VarS5 = pj30Var2.S(r4e.b(i4, i5, 0, 0, 12));
        if (i3 < 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return vj30.x(vj30Var, i7, this.g, new y2i(i12, pu90VarS5, this.d, pj30Var3.S(r4e.b(i6, i3, 0, 0, 12)), pu90VarS, pu90VarS2, pu90Var2, i7, this.f, this.f));
    }
}
