package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xpr extends x2t0 {
    public final /* synthetic */ byte h = 1;
    public final Object i;
    public final Object j;
    public final Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpr(ypr yprVar, vqc vqcVar, je jeVar, bn6 bn6Var) {
        super(new yip(yprVar, (byte) 24));
        yprVar.getClass();
        this.i = vqcVar;
        this.j = jeVar;
        this.k = bn6Var;
    }

    @Override // a.j3t0
    public final Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                wpr wprVar = (wpr) obj;
                if (wprVar != null) {
                    if (wprVar instanceof upr) {
                        ((vqc) this.i).k(pzb.C(new g7p((Object) ((zpr) d()).f44773a, (byte) 17)));
                    } else {
                        boolean z = wprVar instanceof tpr;
                        Object obj2 = this.j;
                        Object obj3 = this.k;
                        if (z) {
                            ypr yprVar = ((zpr) d()).f44773a;
                            long j = yprVar.b;
                            Long lValueOf = j == 40 ? Long.valueOf(yprVar.c) : null;
                            ((bn6) obj3).b(lValueOf, j);
                            ((je) obj2).a(lValueOf, j);
                        } else if (wprVar instanceof vpr) {
                            boolean z2 = ((vpr) wprVar).f37819a;
                            ypr yprVar2 = ((zpr) d()).f44773a;
                            Long lValueOf2 = yprVar2.b == 40 ? Long.valueOf(yprVar2.c) : null;
                            ((bn6) obj3).m(yprVar2.f43044a, yprVar2.b, lValueOf2, z2);
                            ((je) obj2).p(yprVar2.f43044a, yprVar2.b, lValueOf2, z2);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                return i((lv20) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if (r0.a(r9, r4) == r5) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(a.lv20 r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xpr.i(a.lv20, a.zje):java.lang.Object");
    }

    public xpr(uyn uynVar, a1d a1dVar, eu90 eu90Var) {
        super(new sv10((byte) 29));
        this.i = uynVar;
        this.j = a1dVar;
        this.k = eu90Var;
    }
}
