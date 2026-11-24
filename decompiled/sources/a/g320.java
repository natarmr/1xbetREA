package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g320 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5z f10591a;
    public final ony b;

    public g320(w5z w5zVar, ony onyVar, byte b) {
        onyVar.getClass();
        switch (b) {
            case 1:
                this.f10591a = w5zVar;
                this.b = onyVar;
                break;
            default:
                this.f10591a = w5zVar;
                this.b = onyVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ouj0 ouj0Var, zje zjeVar) {
        f320 f320Var;
        if (zjeVar instanceof f320) {
            f320Var = (f320) zjeVar;
            int i = f320Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f320Var.l = i - Integer.MIN_VALUE;
            } else {
                f320Var = new f320(this, zjeVar);
            }
        } else {
            f320Var = new f320(this, zjeVar);
        }
        Object objZ = f320Var.j;
        wne wneVar = wne.f39444a;
        int i2 = f320Var.l;
        ony onyVar = this.b;
        if (i2 == 0) {
            z1x.P(objZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("betUniqueToken", ncy.c(""));
            linkedHashMap.put("betQuickBet", ncy.a(Boolean.FALSE));
            linkedHashMap.put("betClickTime", ncy.b(new Long(System.currentTimeMillis())));
            String str = ouj0Var.p;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("betGUID", ncy.c(str));
            nwd nwdVar = q4f.f28094a;
            int i3 = ouj0Var.f;
            nwdVar.getClass();
            linkedHashMap.put("betVid", ncy.c(nwd.b(i3).name()));
            ((rny) onyVar).a("BetEvRequest", new tny("logBetRequest", xp20.n(linkedHashMap)));
            boolean zContains = q3d.j(q4f.e, q4f.g, q4f.h).contains(ouj0Var.s);
            f320Var.i = ouj0Var;
            f320Var.l = 1;
            objZ = this.f10591a.Z(ouj0Var, zContains, f320Var);
            if (objZ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ouj0Var = f320Var.i;
            z1x.P(objZ);
        }
        pa20 pa20Var = (pa20) objZ;
        if (pa20Var instanceof oa20) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("betUniqueToken", ncy.c(""));
            linkedHashMap2.put("betQuickBet", ncy.a(Boolean.FALSE));
            linkedHashMap2.put("betClickTime", ncy.b(new Long(System.currentTimeMillis())));
            linkedHashMap2.put("betGUID", ncy.c(""));
            linkedHashMap2.put("betCouponId", ncy.c(((oa20) pa20Var).f24910a));
            nwd nwdVar2 = q4f.f28094a;
            int i4 = ouj0Var.f;
            nwdVar2.getClass();
            linkedHashMap2.put("betVid", ncy.c(nwd.b(i4).name()));
            ((rny) onyVar).a("BetEvResponse", new tny("logBetResponse", xp20.n(linkedHashMap2)));
        }
        return objZ;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x012c  */
    /* JADX WARN: Code duplicated, block: B:39:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c A[Catch: m07 -> 0x0153, TryCatch #5 {m07 -> 0x0153, blocks: (B:36:0x0108, B:40:0x012f, B:53:0x014e, B:59:0x0161, B:56:0x0157, B:57:0x015c, B:58:0x015d, B:43:0x013c, B:46:0x0142), top: B:84:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:46:0x0142 A[Catch: m07 -> 0x0153, TryCatch #5 {m07 -> 0x0153, blocks: (B:36:0x0108, B:40:0x012f, B:53:0x014e, B:59:0x0161, B:56:0x0157, B:57:0x015c, B:58:0x015d, B:43:0x013c, B:46:0x0142), top: B:84:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e A[Catch: m07 -> 0x0153, TryCatch #5 {m07 -> 0x0153, blocks: (B:36:0x0108, B:40:0x012f, B:53:0x014e, B:59:0x0161, B:56:0x0157, B:57:0x015c, B:58:0x015d, B:43:0x013c, B:46:0x0142), top: B:84:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[Catch: m07 -> 0x0153, TryCatch #5 {m07 -> 0x0153, blocks: (B:36:0x0108, B:40:0x012f, B:53:0x014e, B:59:0x0161, B:56:0x0157, B:57:0x015c, B:58:0x015d, B:43:0x013c, B:46:0x0142), top: B:84:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d A[Catch: m07 -> 0x0153, TryCatch #5 {m07 -> 0x0153, blocks: (B:36:0x0108, B:40:0x012f, B:53:0x014e, B:59:0x0161, B:56:0x0157, B:57:0x015c, B:58:0x015d, B:43:0x013c, B:46:0x0142), top: B:84:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
    
        if (r0 == r9) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.ouj0 r21, long r22, int r24, a.yje r25) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g320.b(a.ouj0, long, int, a.yje):java.lang.Object");
    }
}
