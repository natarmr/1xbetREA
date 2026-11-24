package a;

import android.content.res.Resources;
import android.os.Parcel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes4.dex */
public final class bwl implements n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3330a;

    public bwl(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 6:
                this.f3330a = new wgn(gii0Var, (byte) 8);
                break;
            case 12:
                this.f3330a = new wgn(gii0Var, (byte) 18);
                break;
            case 14:
                this.f3330a = new wgn(gii0Var, (byte) 27);
                break;
            default:
                this.f3330a = new wgn(gii0Var, (byte) 4);
                break;
        }
    }

    public void a(byte b) {
        ((Parcel) this.f3330a).writeByte(b);
    }

    public void b(float f) {
        ((Parcel) this.f3330a).writeFloat(f);
    }

    public void c(long j) {
        long jB = daq0.b(j);
        byte b = 0;
        if (!eaq0.a(jB, 0L)) {
            if (eaq0.a(jB, 4294967296L)) {
                b = 1;
            } else if (eaq0.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (eaq0.a(daq0.b(j), 0L)) {
            return;
        }
        b(daq0.c(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(LinkedHashMap linkedHashMap, zje zjeVar) {
        q8o q8oVar;
        if (zjeVar instanceof q8o) {
            q8oVar = (q8o) zjeVar;
            int i = q8oVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q8oVar.k = i - Integer.MIN_VALUE;
            } else {
                q8oVar = new q8o(this, zjeVar);
            }
        } else {
            q8oVar = new q8o(this, zjeVar);
        }
        Object objB = q8oVar.i;
        wne wneVar = wne.f39444a;
        int i2 = q8oVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            t7o t7oVar = (t7o) ((wgn) this.f3330a).invoke();
            q8oVar.k = 1;
            objB = t7oVar.b(linkedHashMap, q8oVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(LinkedHashMap linkedHashMap, zje zjeVar) {
        r8o r8oVar;
        if (zjeVar instanceof r8o) {
            r8oVar = (r8o) zjeVar;
            int i = r8oVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r8oVar.k = i - Integer.MIN_VALUE;
            } else {
                r8oVar = new r8o(this, zjeVar);
            }
        } else {
            r8oVar = new r8o(this, zjeVar);
        }
        Object objA = r8oVar.i;
        wne wneVar = wne.f39444a;
        int i2 = r8oVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            t7o t7oVar = (t7o) ((wgn) this.f3330a).invoke();
            r8oVar.k = 1;
            objA = t7oVar.a(linkedHashMap, r8oVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable f(String str, zje zjeVar) {
        lmt lmtVar;
        Serializable g0g0Var;
        Object next;
        if (zjeVar instanceof lmt) {
            lmtVar = (lmt) zjeVar;
            int i = lmtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmtVar.k = i - Integer.MIN_VALUE;
            } else {
                lmtVar = new lmt(this, zjeVar);
            }
        } else {
            lmtVar = new lmt(this, zjeVar);
        }
        Object objB = lmtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lmtVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                e0g0 e0g0Var = j0g0.b;
                k41 k41Var = (k41) this.f3330a;
                lmtVar.k = 1;
                objB = k41Var.b(str, lmtVar);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            Iterator it = ((List) objB).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((d41) next).b != 2);
            d41 d41Var = (d41) next;
            g0g0Var = d41Var != null ? new Long(d41Var.f5431a) : null;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            return null;
        }
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {all -> 0x007a, blocks: (B:24:0x008c, B:27:0x00a5, B:18:0x0076), top: B:62:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (a.qcc.P(r10, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (a.qcc.P(r10, r2) == r3) goto L55;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b0 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00df -> B:42:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x010e -> B:42:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(a.zje r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bwl.g(a.zje):java.lang.Object");
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        DsChip dsChip = (DsChip) this.f3330a;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = dsChip.getContext().getResources();
        resources.getClass();
        c3x.q(dywVar, resources).setTintList(dsChip.g);
    }

    public Object i(boolean z, zje zjeVar) {
        lxv lxvVar = (lxv) ((f7u) this.f3330a).c;
        return z ? ntb.K(lxvVar.f20834a.c(), zjeVar) : ntb.K(lxvVar.b.c(), zjeVar);
    }

    public /* synthetic */ bwl(Object obj) {
        this.f3330a = obj;
    }

    public bwl(aln alnVar) {
        alnVar.getClass();
        this.f3330a = alnVar;
    }

    public bwl(byte b) {
        switch (b) {
            case 13:
                this.f3330a = q7m0.a(iun.f15405a);
                break;
            default:
                this.f3330a = null;
                break;
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }
}
