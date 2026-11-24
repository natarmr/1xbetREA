package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n2i implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c4i f22802a;
    public final /* synthetic */ u3i b;
    public final /* synthetic */ u3i c;
    public final /* synthetic */ u3i d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public n2i(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, int i, int i2, int i3) {
        this.f22802a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec A[LOOP:0: B:33:0x00e6->B:35:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int i;
        pu90 pu90VarS;
        int i2;
        pu90 pu90VarS2;
        int i3;
        pu90 pu90VarS3;
        pu90 pu90VarS4;
        Iterator it;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        pj30 pj30Var;
        int i11;
        pj30 pj30Var2;
        list.getClass();
        int i12 = p4e.i(j);
        c4i c4iVar = this.f22802a;
        o0x o0xVar = c4iVar.c;
        if (o0xVar == null || !c4iVar.b) {
            i = 0;
            pu90VarS = null;
        } else {
            pu90VarS = ((pj30) list.get(0)).S(p4e.b(j, 0, 0, 0, 0, 10));
            i = 1;
        }
        if (o0xVar != null) {
            i2 = i + 1;
            pu90VarS2 = ((pj30) list.get(i)).S(p4e.b(j, 0, 0, 0, 0, 10));
        } else {
            i2 = i;
            pu90VarS2 = null;
        }
        int i13 = i2 + 1;
        pj30 pj30Var3 = (pj30) list.get(i2);
        if (this.b instanceof v3i) {
            i3 = i2 + 2;
            pj30 pj30Var4 = (pj30) CollectionsKt.W(i13, list);
            pu90 pu90VarS5 = pj30Var4 != null ? pj30Var4.S(p4e.b(j, 0, 0, 0, 0, 10)) : null;
            if (this.c instanceof z3i) {
                i11 = i3 + 1;
                pj30Var2 = (pj30) CollectionsKt.W(i3, list);
                if (pj30Var2 != null) {
                    i12 = i12;
                    pu90VarS3 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
                    i3 = i11;
                } else {
                    i3 = i11;
                }
                if ((this.d instanceof x3i) || (pj30Var = (pj30) CollectionsKt.W(i3, list)) == null) {
                    pu90VarS4 = null;
                } else {
                    pu90VarS4 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                it = ((ArrayList) tx3.z(new pu90[]{pu90VarS5, pu90VarS3, pu90VarS4})).iterator();
                i4 = 0;
                while (it.hasNext()) {
                    i4 += ((pu90) it.next()).f27604a;
                }
                i5 = this.e;
                int i14 = i5 * 2;
                if (pu90VarS != null) {
                    i6 = pu90VarS.f27604a;
                } else {
                    i6 = 0;
                }
                if (pu90VarS2 != null) {
                    i7 = pu90VarS2.f27604a;
                } else {
                    i7 = 0;
                }
                int i15 = i6 + i7;
                if (o0xVar != null) {
                    i8 = i5;
                } else {
                    i8 = 0;
                }
                i9 = (((i12 - i8) - i15) - i14) - i4;
                if (i9 < 0) {
                    i10 = 0;
                } else {
                    i10 = i9;
                }
                if (i9 < 0) {
                    i9 = 0;
                }
                int i16 = i12;
                return vj30.x(vj30Var, i16, this.f, new m2i(i8, pu90VarS, pu90VarS2, c4iVar, this.e, pj30Var3.S(r4e.b(i10, i9, 0, 0, 12)), this.g, pu90VarS5, pu90VarS3, pu90VarS4, i16));
            }
            pu90VarS3 = null;
            if (this.d instanceof x3i) {
                pu90VarS4 = null;
            } else {
                pu90VarS4 = null;
            }
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS5, pu90VarS3, pu90VarS4})).iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((pu90) it.next()).f27604a;
            }
            i5 = this.e;
            int i17 = i5 * 2;
            if (pu90VarS != null) {
                i6 = pu90VarS.f27604a;
            } else {
                i6 = 0;
            }
            if (pu90VarS2 != null) {
                i7 = pu90VarS2.f27604a;
            } else {
                i7 = 0;
            }
            int i18 = i6 + i7;
            if (o0xVar != null) {
                i8 = i5;
            } else {
                i8 = 0;
            }
            i9 = (((i12 - i8) - i18) - i17) - i4;
            if (i9 < 0) {
                i10 = 0;
            } else {
                i10 = i9;
            }
            if (i9 < 0) {
                i9 = 0;
            }
            int i19 = i12;
            return vj30.x(vj30Var, i19, this.f, new m2i(i8, pu90VarS, pu90VarS2, c4iVar, this.e, pj30Var3.S(r4e.b(i10, i9, 0, 0, 12)), this.g, pu90VarS5, pu90VarS3, pu90VarS4, i19));
        }
        i3 = i13;
        if (this.c instanceof z3i) {
            i11 = i3 + 1;
            pj30Var2 = (pj30) CollectionsKt.W(i3, list);
            if (pj30Var2 != null) {
                i12 = i12;
                pu90VarS3 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
                i3 = i11;
            } else {
                i3 = i11;
            }
            if (this.d instanceof x3i) {
                pu90VarS4 = null;
            } else {
                pu90VarS4 = null;
            }
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS5, pu90VarS3, pu90VarS4})).iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((pu90) it.next()).f27604a;
            }
            i5 = this.e;
            int i110 = i5 * 2;
            if (pu90VarS != null) {
                i6 = pu90VarS.f27604a;
            } else {
                i6 = 0;
            }
            if (pu90VarS2 != null) {
                i7 = pu90VarS2.f27604a;
            } else {
                i7 = 0;
            }
            int i111 = i6 + i7;
            if (o0xVar != null) {
                i8 = i5;
            } else {
                i8 = 0;
            }
            i9 = (((i12 - i8) - i111) - i110) - i4;
            if (i9 < 0) {
                i10 = 0;
            } else {
                i10 = i9;
            }
            if (i9 < 0) {
                i9 = 0;
            }
            int i112 = i12;
            return vj30.x(vj30Var, i112, this.f, new m2i(i8, pu90VarS, pu90VarS2, c4iVar, this.e, pj30Var3.S(r4e.b(i10, i9, 0, 0, 12)), this.g, pu90VarS5, pu90VarS3, pu90VarS4, i112));
        }
        pu90VarS3 = null;
        if (this.d instanceof x3i) {
            pu90VarS4 = null;
        } else {
            pu90VarS4 = null;
        }
        it = ((ArrayList) tx3.z(new pu90[]{pu90VarS5, pu90VarS3, pu90VarS4})).iterator();
        i4 = 0;
        while (it.hasNext()) {
            i4 += ((pu90) it.next()).f27604a;
        }
        i5 = this.e;
        int i113 = i5 * 2;
        if (pu90VarS != null) {
            i6 = pu90VarS.f27604a;
        } else {
            i6 = 0;
        }
        if (pu90VarS2 != null) {
            i7 = pu90VarS2.f27604a;
        } else {
            i7 = 0;
        }
        int i114 = i6 + i7;
        if (o0xVar != null) {
            i8 = i5;
        } else {
            i8 = 0;
        }
        i9 = (((i12 - i8) - i114) - i113) - i4;
        if (i9 < 0) {
            i10 = 0;
        } else {
            i10 = i9;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int i115 = i12;
        return vj30.x(vj30Var, i115, this.f, new m2i(i8, pu90VarS, pu90VarS2, c4iVar, this.e, pj30Var3.S(r4e.b(i10, i9, 0, 0, 12)), this.g, pu90VarS5, pu90VarS3, pu90VarS4, i115));
    }
}
