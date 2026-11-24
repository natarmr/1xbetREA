package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ahu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f891a;
    public final gst0 b;

    public ahu(rrd rrdVar, gst0 gst0Var) {
        gst0Var.getClass();
        this.f891a = rrdVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(long j, zje zjeVar) {
        xgu xguVar;
        if (zjeVar instanceof xgu) {
            xguVar = (xgu) zjeVar;
            int i = xguVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xguVar.l = i - Integer.MIN_VALUE;
            } else {
                xguVar = new xgu(this, zjeVar);
            }
        } else {
            xguVar = new xgu(this, zjeVar);
        }
        Object objI = xguVar.j;
        wne wneVar = wne.f39444a;
        int i2 = xguVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objI);
            tl5 tl5Var = tl5.c;
            xguVar.i = j;
            xguVar.l = 1;
            objI = this.f891a.i(tl5Var, xguVar);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = xguVar.i;
            z1x.P(objI);
        }
        for (Object obj2 : (Iterable) objI) {
            if (((ql5) obj2).f28916a == j) {
                obj = obj2;
                break;
            }
        }
        ql5 ql5Var = (ql5) obj;
        if (ql5Var != null) {
            return ql5Var;
        }
        throw new ss3();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[Catch: Exception -> 0x003f, PHI: r13
  0x00bc: PHI (r13v3 a.bm5) = (r13v0 a.bm5), (r13v2 a.bm5), (r13v2 a.bm5), (r13v4 a.bm5) binds: [B:33:0x0069, B:38:0x007c, B:45:0x008c, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003f, blocks: (B:18:0x003a, B:63:0x00c7, B:23:0x0044, B:57:0x00b7, B:60:0x00bc, B:26:0x004b, B:37:0x007a, B:39:0x007e, B:41:0x0086, B:46:0x008e, B:48:0x0096, B:50:0x009a, B:52:0x009e, B:54:0x00a2, B:29:0x0052, B:34:0x006b), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r14 == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(a.bm5 r13, a.yje r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ahu.b(a.bm5, a.yje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(bm5 bm5Var, zje zjeVar) {
        zgu zguVar;
        if (zjeVar instanceof zgu) {
            zguVar = (zgu) zjeVar;
            int i = zguVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zguVar.l = i - Integer.MIN_VALUE;
            } else {
                zguVar = new zgu(this, zjeVar);
            }
        } else {
            zguVar = new zgu(this, zjeVar);
        }
        Object objA = zguVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zguVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            zguVar.i = bm5Var;
            zguVar.l = 1;
            objA = a(this.b.f11847a.a().f18785a, zguVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bm5Var = zguVar.i;
            z1x.P(objA);
        }
        ql5 ql5Var = (ql5) objA;
        this.f891a.z(bm5Var, ql5Var.f28916a);
        return ql5Var;
    }
}
