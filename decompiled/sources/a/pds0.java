package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pds0 extends d660 {
    public final q99 f;
    public c4m0 g;

    public pds0(sch0 sch0Var, jbh0 jbh0Var, w6k w6kVar) {
        super(sch0Var, jbh0Var, w6kVar);
        this.f = vtb.d(Integer.MAX_VALUE, null, null, 6);
    }

    public static mds0 e(q99 q99Var) {
        mds0 mds0Var = null;
        egi0 egi0VarA = igi0.a(new e660(null, new du40(q99Var, (byte) 1)));
        while (egi0VarA.hasNext()) {
            mds0 mds0VarA = (mds0) egi0VarA.next();
            if (mds0Var != null) {
                mds0VarA = mds0Var.a(mds0VarA);
            }
            mds0Var = mds0VarA;
        }
        return mds0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r18.b.invoke(r5, r3) == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.sch0 r19, a.mds0 r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pds0.c(a.sch0, a.mds0, a.zje):java.lang.Object");
    }

    public final boolean d(woa0 woa0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        q99 q99Var;
        sch0 sch0Var;
        dpa0 dpa0Var = (dpa0) CollectionsKt.firstOrNull(woa0Var.f39485a);
        if (dpa0Var != null) {
            List listB = dpa0Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                q99Var = this.f;
                sch0Var = this.f5538a;
                if (i >= size) {
                    break;
                }
                ayv ayvVar = (ayv) listB.get(i);
                long j = ayvVar.d ^ (-9223372034707292160L);
                if (!(sch0Var.j(sch0Var.f(j)) == 0.0f)) {
                    z3 = !(q99Var.f(new mds0(j, false, ayvVar.f1688a)) instanceof ytb) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = dpa0Var.l ^ (-9223372034707292160L);
            boolean z4 = woa0Var.f == 12;
            if (!(sch0Var.j(sch0Var.f(j2)) == 0.0f) || z4) {
                if (!(q99Var.f(new mds0(j2, z4, dpa0Var.b)) instanceof ytb) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
