package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class g7c0 extends w46 {
    public final ol60 A;
    public final p7m0 B;
    public final p7m0 C;
    public final p7m0 D;
    public final m0k0 b;
    public final phf0 c;
    public final g320 d;
    public final nhf0 e;
    public final zlt0 f;
    public final nw20 g;
    public final mne h;
    public final ctf0 i;
    public final u4a j;
    public final duj k;
    public final mpt l;
    public final clc m;
    public final ouu n;
    public final mii0 o;
    public final f3c p;
    public final nou q;
    public final ms2 r;
    public final m1e s;
    public final x20 t;
    public final yo4 u;
    public final vqc v;
    public final pru w;
    public final x1u x;
    public final edo y;
    public final ol60 z;

    public g7c0(m0k0 m0k0Var, phf0 phf0Var, g320 g320Var, nhf0 nhf0Var, zlt0 zlt0Var, nw20 nw20Var, mne mneVar, ctf0 ctf0Var, u4a u4aVar, duj dujVar, mpt mptVar, clc clcVar, ouu ouuVar, mii0 mii0Var, f3c f3cVar, nou nouVar, ms2 ms2Var, m1e m1eVar, x20 x20Var, yo4 yo4Var, vqc vqcVar, pru pruVar, x1u x1uVar, edo edoVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        edoVar.getClass();
        this.b = m0k0Var;
        this.c = phf0Var;
        this.d = g320Var;
        this.e = nhf0Var;
        this.f = zlt0Var;
        this.g = nw20Var;
        this.h = mneVar;
        this.i = ctf0Var;
        this.j = u4aVar;
        this.k = dujVar;
        this.l = mptVar;
        this.m = clcVar;
        this.n = ouuVar;
        this.o = mii0Var;
        this.p = f3cVar;
        this.q = nouVar;
        this.r = ms2Var;
        this.s = m1eVar;
        this.t = x20Var;
        this.u = yo4Var;
        this.v = vqcVar;
        this.w = pruVar;
        this.x = x1uVar;
        this.y = edoVar;
        this.z = new ol60(3);
        this.A = new ol60(3);
        this.B = q7m0.a(efe.f7718a);
        this.C = q7m0.a(new dg5(false));
        this.D = q7m0.a("");
        yje yjeVar = null;
        sac.V(jiu0.a(this), new ppb0(this, (byte) 7), null, mneVar.b, new o690((w46) this, yjeVar, (byte) 16), 10);
        sac.T(new fnq(m1eVar.b(), new c670(this, yjeVar, (byte) 25), (byte) 4), jiu0.a(this), f7c0.h);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0124, code lost:
    
        if (r4.m(0, (a.ql5) r2, r3, r6) == r10) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.m97 r19, a.oa20 r20, java.lang.String r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g7c0.w(a.m97, a.oa20, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x(int i, long j, long j2, zje zjeVar) {
        e7c0 e7c0Var;
        long j3;
        long j4;
        int i2;
        if (zjeVar instanceof e7c0) {
            e7c0Var = (e7c0) zjeVar;
            int i3 = e7c0Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e7c0Var.n = i3 - Integer.MIN_VALUE;
            } else {
                e7c0Var = new e7c0(this, zjeVar);
            }
        } else {
            e7c0Var = new e7c0(this, zjeVar);
        }
        Object obj = e7c0Var.l;
        wne wneVar = wne.f39444a;
        int i4 = e7c0Var.n;
        Object obj2 = null;
        if (i4 == 0) {
            z1x.P(obj);
            j3 = j;
            e7c0Var.i = j3;
            e7c0Var.k = i;
            j4 = j2;
            e7c0Var.j = j4;
            e7c0Var.n = 1;
            Object objB = this.y.b(e7c0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            i2 = i;
            obj = objB;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = e7c0Var.j;
            int i5 = e7c0Var.k;
            j3 = e7c0Var.i;
            z1x.P(obj);
            j4 = j5;
            i2 = i5;
        }
        long j6 = j3;
        for (Object obj3 : (Iterable) obj) {
            if (((xco) obj3).f40655a == j6) {
                obj2 = obj3;
                break;
            }
        }
        xco xcoVar = (xco) obj2;
        String strValueOf = (!(xcoVar != null ? xcoVar.e : false) || j4 == 0) ? "" : String.valueOf(j4);
        ms2 ms2Var = this.r;
        int i6 = ms2Var instanceof ds2 ? ((ds2) ms2Var).f6590a : -1;
        m0k0 m0k0Var = this.b;
        this.u.q(m0k0Var.f20959a, m0k0Var.B, ms2Var, j6, "promo", i2, this.x.a(), i6, strValueOf);
        ms2 ms2Var2 = this.r;
        this.t.w(m0k0Var.f20959a, m0k0Var.B, i6, ms2Var2 instanceof ds2 ? g1x.v((ds2) ms2Var2) : kpb.v0(ms2Var2), j6, "promo", i2, strValueOf);
        return Unit.f46060a;
    }

    public final void y(String str, String str2, boolean z) {
        sac.V(jiu0.a(this), new e9b0(1, this, g7c0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.h.b, new kqs(this, z, str, str2, null), 10);
    }
}
