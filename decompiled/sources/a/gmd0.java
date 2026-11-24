package a;

import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class gmd0 extends x2t0 {
    public final duj A;
    public final ctf0 B;
    public final z220 h;
    public final oif0 i;
    public final fht0 j;
    public final n660 k;
    public final cl5 l;
    public final reu m;
    public final ali n;
    public final xru o;
    public final ahu p;
    public final nou q;
    public final m0u r;
    public final vyt s;
    public final k7u t;
    public final pru u;
    public final a1d v;
    public final mii0 w;
    public final ih5 x;
    public final x20 y;
    public final zr1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd0(z220 z220Var, oif0 oif0Var, fht0 fht0Var, n660 n660Var, cl5 cl5Var, reu reuVar, ali aliVar, xru xruVar, ahu ahuVar, nou nouVar, m0u m0uVar, vyt vytVar, k7u k7uVar, pru pruVar, a1d a1dVar, mii0 mii0Var, ih5 ih5Var, x20 x20Var, zr1 zr1Var, duj dujVar, ctf0 ctf0Var) {
        super(new cbc0((byte) 25));
        ctf0Var.getClass();
        this.h = z220Var;
        this.i = oif0Var;
        this.j = fht0Var;
        this.k = n660Var;
        this.l = cl5Var;
        this.m = reuVar;
        this.n = aliVar;
        this.o = xruVar;
        this.p = ahuVar;
        this.q = nouVar;
        this.r = m0uVar;
        this.s = vytVar;
        this.t = k7uVar;
        this.u = pruVar;
        this.v = a1dVar;
        this.w = mii0Var;
        this.x = ih5Var;
        this.y = x20Var;
        this.z = zr1Var;
        this.A = dujVar;
        this.B = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object i(m97 m97Var, boolean z, ms2 ms2Var, zje zjeVar) throws zhi0, UnknownHostException {
        bmd0 bmd0Var;
        m97 m97Var2;
        ms2 ms2Var2;
        z220 z220Var;
        long j;
        boolean z2;
        boolean z3 = z;
        if (zjeVar instanceof bmd0) {
            bmd0Var = (bmd0) zjeVar;
            int i = bmd0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                bmd0Var.q = i - Integer.MIN_VALUE;
            } else {
                bmd0Var = new bmd0(this, zjeVar);
            }
        } else {
            bmd0Var = new bmd0(this, zjeVar);
        }
        bmd0 bmd0Var2 = bmd0Var;
        Object obj = bmd0Var2.o;
        wne wneVar = wne.f39444a;
        int i2 = bmd0Var2.q;
        if (i2 == 0) {
            z1x.P(obj);
            long jA = xru.a(this.o);
            bmd0Var2.i = ms2Var;
            z220 z220Var2 = this.h;
            bmd0Var2.j = z220Var2;
            m97Var2 = m97Var;
            bmd0Var2.k = m97Var2;
            bmd0Var2.l = z3;
            bmd0Var2.n = jA;
            bmd0Var2.m = z3;
            bmd0Var2.q = 1;
            Object objZ = this.i.z(bmd0Var2);
            if (objZ != wneVar) {
                ms2Var2 = ms2Var;
                obj = objZ;
                z220Var = z220Var2;
                j = jA;
                z2 = z3;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z4 = bmd0Var2.m;
        long j2 = bmd0Var2.n;
        boolean z5 = bmd0Var2.l;
        m97 m97Var3 = bmd0Var2.k;
        z220 z220Var3 = bmd0Var2.j;
        ms2Var2 = bmd0Var2.i;
        z1x.P(obj);
        z2 = z4;
        z3 = z5;
        m97Var2 = m97Var3;
        z220Var = z220Var3;
        j = j2;
        double dDoubleValue = ((Number) obj).doubleValue();
        byte b = this.s.a().f8665a;
        yfa0 yfa0Var = yfa0.INSTANCE;
        gwe gweVarI0 = vcc.i0(ms2Var2);
        int id = this.t.f17841a.b().getId();
        bmd0Var2.i = null;
        bmd0Var2.j = null;
        bmd0Var2.k = null;
        bmd0Var2.l = z3;
        bmd0Var2.q = 2;
        Serializable serializableY = z220Var.y(j, m97Var2, z2, dDoubleValue, b, yfa0Var, gweVarI0, id, bmd0Var2);
        return serializableY == wneVar ? wneVar : serializableY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(double d, double d2, m97 m97Var, zje zjeVar) {
        cmd0 cmd0Var;
        double d3;
        double d4;
        if (zjeVar instanceof cmd0) {
            cmd0Var = (cmd0) zjeVar;
            int i = cmd0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmd0Var.m = i - Integer.MIN_VALUE;
            } else {
                cmd0Var = new cmd0(this, zjeVar);
            }
        } else {
            cmd0Var = new cmd0(this, zjeVar);
        }
        Object objQ = cmd0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = cmd0Var.m;
        if (i2 == 0) {
            z1x.P(objQ);
            long jA = xru.a(this.o);
            String.valueOf(d);
            cmd0Var.i = d;
            cmd0Var.j = d2;
            cmd0Var.m = 1;
            objQ = this.n.q(m97Var, jA, cmd0Var);
            if (objQ == wneVar) {
                return wneVar;
            }
            d3 = d;
            d4 = d2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = cmd0Var.j;
            d3 = cmd0Var.i;
            z1x.P(objQ);
            d4 = d5;
        }
        vf7 vf7Var = (vf7) objQ;
        boolean z = vf7Var.j && this.t.f17841a.b() == jvn.f;
        double d6 = vf7Var.i;
        q4f q4fVar = q4f.c;
        this.l.getClass();
        return new Double(cl5.t(d3, d4, d6, z, 0, q4fVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(m97 m97Var, ms2 ms2Var, zje zjeVar) {
        dmd0 dmd0Var;
        m97 m97Var2;
        ms2 ms2Var2;
        Object objA;
        fht0 fht0Var;
        if (zjeVar instanceof dmd0) {
            dmd0Var = (dmd0) zjeVar;
            int i = dmd0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmd0Var.n = i - Integer.MIN_VALUE;
            } else {
                dmd0Var = new dmd0(this, zjeVar);
            }
        } else {
            dmd0Var = new dmd0(this, zjeVar);
        }
        Object objJ = dmd0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = dmd0Var.n;
        if (i2 != 0) {
            if (i2 == 1) {
                fht0 fht0Var2 = dmd0Var.k;
                ms2 ms2Var3 = dmd0Var.j;
                m97 m97Var3 = dmd0Var.i;
                z1x.P(objJ);
                objA = objJ;
                m97Var2 = m97Var3;
                fht0Var = fht0Var2;
                ms2Var2 = ms2Var3;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objJ);
            }
            return CollectionsKt.U((List) objJ);
        }
        z1x.P(objJ);
        m97Var2 = m97Var;
        dmd0Var.i = m97Var2;
        ms2Var2 = ms2Var;
        dmd0Var.j = ms2Var2;
        fht0 fht0Var3 = this.j;
        dmd0Var.k = fht0Var3;
        dmd0Var.n = 1;
        objA = this.q.a(tl5.c, dmd0Var);
        if (objA == wneVar) {
            return wneVar;
        }
        fht0Var = fht0Var3;
        long j = ((ql5) objA).f28916a;
        long jA = xru.a(this.o);
        List listC = kotlin.collections.a.c(xia0.d0(m97Var2, vcc.i0(ms2Var2).f12022a));
        iun iunVar = iun.f15405a;
        q4f q4fVar = q4f.c;
        int iA = q4fVar.a();
        byte b = this.u.a().I1.f26017a;
        dmd0Var.i = null;
        dmd0Var.j = null;
        dmd0Var.k = null;
        dmd0Var.n = 2;
        objJ = fht0Var.j(j, jA, listC, iunVar, 0L, q4fVar, iA, false, false, false, null, null, b, false, dmd0Var);
        if (objJ == wneVar) {
            return wneVar;
        }
        return CollectionsKt.U((List) objJ);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0304  */
    /* JADX WARN: Code duplicated, block: B:117:0x030c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x0319  */
    /* JADX WARN: Code duplicated, block: B:124:0x0321  */
    /* JADX WARN: Code duplicated, block: B:126:0x0327  */
    /* JADX WARN: Code duplicated, block: B:130:0x0330  */
    /* JADX WARN: Code duplicated, block: B:132:0x0333  */
    /* JADX WARN: Code duplicated, block: B:134:0x034e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0354  */
    /* JADX WARN: Code duplicated, block: B:137:0x0358  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[PHI: r0 r3 r5 r6 r7 r8 r13 r14
  0x00b0: PHI (r0v26 java.lang.Object) = (r0v25 java.lang.Object), (r0v1 java.lang.Object) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r3v12 boolean) = (r3v10 boolean), (r3v13 boolean) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r5v6 a.m97) = (r5v4 a.m97), (r5v8 a.m97) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r6v7 a.xuf) = (r6v5 a.xuf), (r6v10 a.xuf) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r7v7 a.gmd0) = (r7v4 a.gmd0), (r7v9 a.gmd0) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r8v9 a.ms2) = (r8v6 a.ms2), (r8v12 a.ms2) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r13v7 a.m9s) = (r13v5 a.m9s), (r13v11 a.m9s) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r14v5 a.dao) = (r14v3 a.dao), (r14v10 a.dao) binds: [B:46:0x014e, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    /* JADX WARN: Code duplicated, block: B:44:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0256  */
    /* JADX WARN: Code duplicated, block: B:81:0x0257  */
    /* JADX WARN: Code duplicated, block: B:84:0x026b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x029d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c2  */
    public final Object l(dao daoVar, m9s m9sVar, ms2 ms2Var, boolean z, zje zjeVar) {
        emd0 emd0Var;
        String str;
        Object g0g0Var;
        Throwable thA;
        boolean z2;
        mmd0 mmd0Var;
        zhi0 zhi0Var;
        kuw kuwVar;
        String message;
        String strA;
        m0u m0uVar;
        m9s m9sVar2;
        ms2 ms2Var2;
        dao daoVar2;
        boolean z3;
        gmd0 gmd0Var;
        ms2 ms2Var3;
        gmd0 gmd0Var2;
        dao daoVar3;
        m9s m9sVar3;
        xuf xufVar;
        m97 m97VarL0;
        m9s m9sVar4;
        m97 m97Var;
        dao daoVar4;
        String str2;
        Object objI;
        dao daoVar5;
        gmd0 gmd0Var3;
        xuf xufVar2;
        m97 m97Var2;
        m9s m9sVar5;
        zh7 zh7Var;
        n660 n660Var;
        zh7 zh7Var2;
        long j;
        hg7 hg7Var;
        m97 m97Var3;
        m97 m97Var4;
        xuf xufVar3;
        gmd0 gmd0Var4;
        zh7 zh7Var3;
        String str3;
        int i;
        int i2;
        gmd0 gmd0Var5;
        Object objJ;
        zh7 zh7Var4;
        zh7 zh7Var5;
        String str4;
        gmd0 gmd0Var6;
        gmd0 gmd0Var7;
        int i3;
        String str5;
        String str6;
        if (zjeVar instanceof emd0) {
            emd0Var = (emd0) zjeVar;
            int i4 = emd0Var.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                emd0Var.w = i4 - Integer.MIN_VALUE;
            } else {
                emd0Var = new emd0(this, zjeVar);
            }
        } else {
            emd0Var = new emd0(this, zjeVar);
        }
        emd0 emd0Var2 = emd0Var;
        Object objB = emd0Var2.u;
        wne wneVar = wne.f39444a;
        int i5 = emd0Var2.w;
        hmd0 hmd0Var = hmd0.f13300a;
        try {
            switch (i5) {
                case 0:
                    z1x.P(objB);
                    g(pmd0.f27227a);
                    e0g0 e0g0Var = j0g0.b;
                    m0uVar = this.r;
                    ahu ahuVar = this.p;
                    emd0Var2.i = daoVar;
                    m9sVar2 = m9sVar;
                    emd0Var2.j = m9sVar2;
                    ms2Var2 = ms2Var;
                    emd0Var2.k = ms2Var2;
                    emd0Var2.l = this;
                    emd0Var2.m = m0uVar;
                    emd0Var2.s = z;
                    emd0Var2.w = 1;
                    objB = ahuVar.b(bm5.f2822a, emd0Var2);
                    if (objB != wneVar) {
                        daoVar2 = daoVar;
                        z3 = z;
                        gmd0Var = this;
                        long j2 = ((ql5) objB).e;
                        emd0Var2.i = daoVar2;
                        emd0Var2.j = m9sVar2;
                        emd0Var2.k = ms2Var2;
                        emd0Var2.l = gmd0Var;
                        emd0Var2.m = null;
                        emd0Var2.s = z3;
                        emd0Var2.w = 2;
                        objB = m0uVar.f20973a.c(j2, emd0Var2);
                        if (objB == wneVar) {
                            gmd0 gmd0Var8 = gmd0Var;
                            ms2Var3 = ms2Var2;
                            gmd0Var2 = gmd0Var8;
                            daoVar3 = daoVar2;
                            m9sVar3 = m9sVar2;
                            xufVar = (xuf) objB;
                            m97VarL0 = jd8.l0(daoVar3);
                            emd0Var2.i = daoVar3;
                            emd0Var2.j = m9sVar3;
                            emd0Var2.k = ms2Var3;
                            emd0Var2.l = gmd0Var2;
                            emd0Var2.m = xufVar;
                            emd0Var2.n = m97VarL0;
                            emd0Var2.s = z3;
                            emd0Var2.w = 3;
                            objB = gmd0Var2.k(m97VarL0, ms2Var3, emd0Var2);
                            if (objB != wneVar) {
                                m9sVar4 = m9sVar3;
                                m97Var = m97VarL0;
                                m97 m97Var5 = (m97) CollectionsKt.U(((cit0) objB).e);
                                try {
                                    daoVar4 = daoVar3;
                                    m97 m97VarA = m97.a(m97Var, null, false, 0L, 0.0d, null, null, null, null, m97Var5.y, m97Var5.z, 16777215);
                                    emd0Var2.i = daoVar4;
                                    emd0Var2.j = m9sVar4;
                                    str2 = null;
                                    try {
                                        emd0Var2.k = null;
                                        emd0Var2.l = gmd0Var2;
                                        emd0Var2.m = xufVar;
                                        emd0Var2.n = m97Var;
                                        emd0Var2.s = z3;
                                        emd0Var2.w = 4;
                                        objI = gmd0Var2.i(m97VarA, z3, ms2Var3, emd0Var2);
                                        if (objI == wneVar) {
                                            daoVar5 = daoVar4;
                                            objB = objI;
                                            gmd0Var3 = gmd0Var2;
                                            xufVar2 = xufVar;
                                            m97Var2 = m97Var;
                                            m9sVar5 = m9sVar4;
                                            zh7Var = (zh7) objB;
                                            try {
                                                e0g0 e0g0Var2 = j0g0.b;
                                                n660Var = gmd0Var3.k;
                                                try {
                                                    j = Long.parseLong(zh7Var.b);
                                                    hg7Var = hg7.f13004a;
                                                    emd0Var2.i = daoVar5;
                                                    emd0Var2.j = m9sVar5;
                                                    emd0Var2.k = null;
                                                    emd0Var2.l = gmd0Var3;
                                                    emd0Var2.m = xufVar2;
                                                    emd0Var2.n = m97Var2;
                                                    zh7Var2 = zh7Var;
                                                    try {
                                                        emd0Var2.o = zh7Var2;
                                                        m97Var3 = m97Var2;
                                                        try {
                                                            emd0Var2.p = null;
                                                            emd0Var2.s = z3;
                                                            emd0Var2.w = 5;
                                                            if (n660Var.x(j, hg7Var, emd0Var2) != wneVar) {
                                                                zh7Var = zh7Var2;
                                                                m97Var2 = m97Var3;
                                                                e0g0 e0g0Var3 = j0g0.b;
                                                                gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                                                                ih5 ih5Var = gmd0Var3.x;
                                                                String str7 = zh7Var.b;
                                                                ih5Var.getClass();
                                                                str7.getClass();
                                                                ih5Var.f14765a.a("bet_oneclick_done", new jo20().b());
                                                                a1d a1dVar = gmd0Var3.v;
                                                                long j3 = m9sVar5.f21426a;
                                                                str2 = null;
                                                                emd0Var2.i = null;
                                                                emd0Var2.j = null;
                                                                emd0Var2.k = null;
                                                                emd0Var2.l = gmd0Var3;
                                                                emd0Var2.m = xufVar2;
                                                                emd0Var2.n = m97Var2;
                                                                emd0Var2.o = zh7Var;
                                                                emd0Var2.p = null;
                                                                emd0Var2.s = z3;
                                                                emd0Var2.w = 6;
                                                                ((vqc) a1dVar.b).k(pzb.C(new nme((byte) 2, j3)));
                                                                if (Unit.f46060a != wneVar) {
                                                                    gmd0 gmd0Var9 = gmd0Var3;
                                                                    m97Var4 = m97Var2;
                                                                    xufVar3 = xufVar2;
                                                                    gmd0Var4 = gmd0Var9;
                                                                    zh7Var3 = zh7Var;
                                                                    gmd0Var4.g(hmd0Var);
                                                                    str3 = xufVar3.f;
                                                                    if (gmd0Var4.m.c().f24244a) {
                                                                        i = R.string.summary_possible_win;
                                                                    } else {
                                                                        i = R.string.history_possible_win;
                                                                    }
                                                                    i2 = i;
                                                                    double d = zh7Var3.e;
                                                                    double d2 = zh7Var3.c;
                                                                    str = null;
                                                                    try {
                                                                        emd0Var2.i = null;
                                                                        emd0Var2.j = null;
                                                                        emd0Var2.k = null;
                                                                        emd0Var2.l = gmd0Var4;
                                                                        emd0Var2.m = gmd0Var4;
                                                                        emd0Var2.n = null;
                                                                        emd0Var2.o = null;
                                                                        emd0Var2.p = zh7Var3;
                                                                        emd0Var2.q = str3;
                                                                        emd0Var2.r = zh7Var3;
                                                                        emd0Var2.s = z3;
                                                                        emd0Var2.t = i2;
                                                                        emd0Var2.w = 7;
                                                                        gmd0Var5 = gmd0Var4;
                                                                        objJ = gmd0Var5.j(d, d2, m97Var4, emd0Var2);
                                                                        if (objJ != wneVar) {
                                                                            zh7Var4 = zh7Var3;
                                                                            zh7Var5 = zh7Var4;
                                                                            str4 = str3;
                                                                            gmd0Var6 = gmd0Var5;
                                                                            gmd0Var7 = gmd0Var6;
                                                                            objB = objJ;
                                                                            i3 = i2;
                                                                            double dDoubleValue = ((Number) objB).doubleValue();
                                                                            long jA = xru.a(gmd0Var7.o);
                                                                            boolean z4 = gmd0Var7.m.c().f24244a;
                                                                            str5 = zh7Var4.g;
                                                                            if (str5 == null) {
                                                                                str6 = "";
                                                                            } else {
                                                                                str6 = str5;
                                                                            }
                                                                            gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue, jA, z4, str6));
                                                                            g0g0Var = Unit.f46060a;
                                                                            e0g0 e0g0Var4 = j0g0.b;
                                                                            thA = j0g0.a(g0g0Var);
                                                                            if (thA != null) {
                                                                                g(hmd0Var);
                                                                                if (thA instanceof zhi0) {
                                                                                    zhi0Var = (zhi0) thA;
                                                                                    kuwVar = zhi0Var.c;
                                                                                    if (kuwVar == i2o.BetExistsError) {
                                                                                        String message2 = zhi0Var.getMessage();
                                                                                        g(new jmd0(message2 != null ? message2 : ""));
                                                                                    } else if (kuwVar == i2o.q) {
                                                                                        String message3 = zhi0Var.getMessage();
                                                                                        g(new lmd0(message3 != null ? message3 : ""));
                                                                                    } else {
                                                                                        message = zhi0Var.getMessage();
                                                                                        if (message != null || message.length() == 0) {
                                                                                            strA = str;
                                                                                        } else {
                                                                                            strA = message;
                                                                                        }
                                                                                        if (strA == null) {
                                                                                            strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                                        }
                                                                                        g(new omd0(strA));
                                                                                    }
                                                                                } else {
                                                                                    z2 = thA instanceof UnknownHostException;
                                                                                    mmd0Var = mmd0.f22032a;
                                                                                    if (z2) {
                                                                                        g(mmd0Var);
                                                                                    } else {
                                                                                        this.A.b(thA, new ksc0((byte) 13));
                                                                                        g(mmd0Var);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return Unit.f46060a;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        e0g0 e0g0Var5 = j0g0.b;
                                                                        g0g0Var = new g0g0(th);
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable unused) {
                                                            zh7Var = zh7Var2;
                                                            m97Var2 = m97Var3;
                                                            e0g0 e0g0Var6 = j0g0.b;
                                                        }
                                                    } catch (Throwable unused2) {
                                                        zh7Var = zh7Var2;
                                                        e0g0 e0g0Var7 = j0g0.b;
                                                        gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                                                        ih5 ih5Var2 = gmd0Var3.x;
                                                        String str8 = zh7Var.b;
                                                        ih5Var2.getClass();
                                                        str8.getClass();
                                                        ih5Var2.f14765a.a("bet_oneclick_done", new jo20().b());
                                                        a1d a1dVar2 = gmd0Var3.v;
                                                        long j4 = m9sVar5.f21426a;
                                                        str2 = null;
                                                        emd0Var2.i = null;
                                                        emd0Var2.j = null;
                                                        emd0Var2.k = null;
                                                        emd0Var2.l = gmd0Var3;
                                                        emd0Var2.m = xufVar2;
                                                        emd0Var2.n = m97Var2;
                                                        emd0Var2.o = zh7Var;
                                                        emd0Var2.p = null;
                                                        emd0Var2.s = z3;
                                                        emd0Var2.w = 6;
                                                        ((vqc) a1dVar2.b).k(pzb.C(new nme((byte) 2, j4)));
                                                        if (Unit.f46060a != wneVar) {
                                                            gmd0 gmd0Var10 = gmd0Var3;
                                                            m97Var4 = m97Var2;
                                                            xufVar3 = xufVar2;
                                                            gmd0Var4 = gmd0Var10;
                                                            zh7Var3 = zh7Var;
                                                            gmd0Var4.g(hmd0Var);
                                                            str3 = xufVar3.f;
                                                            if (gmd0Var4.m.c().f24244a) {
                                                                i = R.string.summary_possible_win;
                                                            } else {
                                                                i = R.string.history_possible_win;
                                                            }
                                                            i2 = i;
                                                            double d3 = zh7Var3.e;
                                                            double d4 = zh7Var3.c;
                                                            str = null;
                                                            emd0Var2.i = null;
                                                            emd0Var2.j = null;
                                                            emd0Var2.k = null;
                                                            emd0Var2.l = gmd0Var4;
                                                            emd0Var2.m = gmd0Var4;
                                                            emd0Var2.n = null;
                                                            emd0Var2.o = null;
                                                            emd0Var2.p = zh7Var3;
                                                            emd0Var2.q = str3;
                                                            emd0Var2.r = zh7Var3;
                                                            emd0Var2.s = z3;
                                                            emd0Var2.t = i2;
                                                            emd0Var2.w = 7;
                                                            gmd0Var5 = gmd0Var4;
                                                            objJ = gmd0Var5.j(d3, d4, m97Var4, emd0Var2);
                                                            if (objJ != wneVar) {
                                                                zh7Var4 = zh7Var3;
                                                                zh7Var5 = zh7Var4;
                                                                str4 = str3;
                                                                gmd0Var6 = gmd0Var5;
                                                                gmd0Var7 = gmd0Var6;
                                                                objB = objJ;
                                                                i3 = i2;
                                                                double dDoubleValue2 = ((Number) objB).doubleValue();
                                                                long jA2 = xru.a(gmd0Var7.o);
                                                                boolean z5 = gmd0Var7.m.c().f24244a;
                                                                str5 = zh7Var4.g;
                                                                if (str5 == null) {
                                                                    str6 = "";
                                                                } else {
                                                                    str6 = str5;
                                                                }
                                                                gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue2, jA2, z5, str6));
                                                                g0g0Var = Unit.f46060a;
                                                                e0g0 e0g0Var8 = j0g0.b;
                                                                thA = j0g0.a(g0g0Var);
                                                                if (thA != null) {
                                                                    g(hmd0Var);
                                                                    if (thA instanceof zhi0) {
                                                                        zhi0Var = (zhi0) thA;
                                                                        kuwVar = zhi0Var.c;
                                                                        if (kuwVar == i2o.BetExistsError) {
                                                                            String message4 = zhi0Var.getMessage();
                                                                            g(new jmd0(message4 != null ? message4 : ""));
                                                                        } else if (kuwVar == i2o.q) {
                                                                            String message5 = zhi0Var.getMessage();
                                                                            g(new lmd0(message5 != null ? message5 : ""));
                                                                        } else {
                                                                            message = zhi0Var.getMessage();
                                                                            if (message != null) {
                                                                                strA = str;
                                                                            } else {
                                                                                strA = str;
                                                                            }
                                                                            if (strA == null) {
                                                                                strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                            }
                                                                            g(new omd0(strA));
                                                                        }
                                                                    } else {
                                                                        z2 = thA instanceof UnknownHostException;
                                                                        mmd0Var = mmd0.f22032a;
                                                                        if (z2) {
                                                                            g(mmd0Var);
                                                                        } else {
                                                                            this.A.b(thA, new ksc0((byte) 13));
                                                                            g(mmd0Var);
                                                                        }
                                                                    }
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }
                                                        return wneVar;
                                                    }
                                                } catch (Throwable unused3) {
                                                    zh7Var2 = zh7Var;
                                                }
                                            } catch (Throwable unused4) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str2;
                                        e0g0 e0g0Var9 = j0g0.b;
                                        g0g0Var = new g0g0(th);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = null;
                                    e0g0 e0g0Var10 = j0g0.b;
                                    g0g0Var = new g0g0(th);
                                }
                            }
                        }
                    }
                    return wneVar;
                case 1:
                    z3 = emd0Var2.s;
                    m0uVar = (m0u) emd0Var2.m;
                    gmd0 gmd0Var11 = emd0Var2.l;
                    ms2Var2 = emd0Var2.k;
                    m9s m9sVar6 = emd0Var2.j;
                    daoVar2 = emd0Var2.i;
                    z1x.P(objB);
                    gmd0Var = gmd0Var11;
                    m9sVar2 = m9sVar6;
                    long j5 = ((ql5) objB).e;
                    emd0Var2.i = daoVar2;
                    emd0Var2.j = m9sVar2;
                    emd0Var2.k = ms2Var2;
                    emd0Var2.l = gmd0Var;
                    emd0Var2.m = null;
                    emd0Var2.s = z3;
                    emd0Var2.w = 2;
                    objB = m0uVar.f20973a.c(j5, emd0Var2);
                    if (objB == wneVar) {
                        gmd0 gmd0Var12 = gmd0Var;
                        ms2Var3 = ms2Var2;
                        gmd0Var2 = gmd0Var12;
                        daoVar3 = daoVar2;
                        m9sVar3 = m9sVar2;
                        xufVar = (xuf) objB;
                        m97VarL0 = jd8.l0(daoVar3);
                        emd0Var2.i = daoVar3;
                        emd0Var2.j = m9sVar3;
                        emd0Var2.k = ms2Var3;
                        emd0Var2.l = gmd0Var2;
                        emd0Var2.m = xufVar;
                        emd0Var2.n = m97VarL0;
                        emd0Var2.s = z3;
                        emd0Var2.w = 3;
                        objB = gmd0Var2.k(m97VarL0, ms2Var3, emd0Var2);
                        if (objB != wneVar) {
                            m9sVar4 = m9sVar3;
                            m97Var = m97VarL0;
                            m97 m97Var6 = (m97) CollectionsKt.U(((cit0) objB).e);
                            daoVar4 = daoVar3;
                            m97 m97VarA2 = m97.a(m97Var, null, false, 0L, 0.0d, null, null, null, null, m97Var6.y, m97Var6.z, 16777215);
                            emd0Var2.i = daoVar4;
                            emd0Var2.j = m9sVar4;
                            str2 = null;
                            emd0Var2.k = null;
                            emd0Var2.l = gmd0Var2;
                            emd0Var2.m = xufVar;
                            emd0Var2.n = m97Var;
                            emd0Var2.s = z3;
                            emd0Var2.w = 4;
                            objI = gmd0Var2.i(m97VarA2, z3, ms2Var3, emd0Var2);
                            if (objI == wneVar) {
                                daoVar5 = daoVar4;
                                objB = objI;
                                gmd0Var3 = gmd0Var2;
                                xufVar2 = xufVar;
                                m97Var2 = m97Var;
                                m9sVar5 = m9sVar4;
                                zh7Var = (zh7) objB;
                                e0g0 e0g0Var11 = j0g0.b;
                                n660Var = gmd0Var3.k;
                                j = Long.parseLong(zh7Var.b);
                                hg7Var = hg7.f13004a;
                                emd0Var2.i = daoVar5;
                                emd0Var2.j = m9sVar5;
                                emd0Var2.k = null;
                                emd0Var2.l = gmd0Var3;
                                emd0Var2.m = xufVar2;
                                emd0Var2.n = m97Var2;
                                zh7Var2 = zh7Var;
                                emd0Var2.o = zh7Var2;
                                m97Var3 = m97Var2;
                                emd0Var2.p = null;
                                emd0Var2.s = z3;
                                emd0Var2.w = 5;
                                if (n660Var.x(j, hg7Var, emd0Var2) != wneVar) {
                                    zh7Var = zh7Var2;
                                    m97Var2 = m97Var3;
                                    e0g0 e0g0Var12 = j0g0.b;
                                    gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                                    ih5 ih5Var3 = gmd0Var3.x;
                                    String str9 = zh7Var.b;
                                    ih5Var3.getClass();
                                    str9.getClass();
                                    ih5Var3.f14765a.a("bet_oneclick_done", new jo20().b());
                                    a1d a1dVar3 = gmd0Var3.v;
                                    long j6 = m9sVar5.f21426a;
                                    str2 = null;
                                    emd0Var2.i = null;
                                    emd0Var2.j = null;
                                    emd0Var2.k = null;
                                    emd0Var2.l = gmd0Var3;
                                    emd0Var2.m = xufVar2;
                                    emd0Var2.n = m97Var2;
                                    emd0Var2.o = zh7Var;
                                    emd0Var2.p = null;
                                    emd0Var2.s = z3;
                                    emd0Var2.w = 6;
                                    ((vqc) a1dVar3.b).k(pzb.C(new nme((byte) 2, j6)));
                                    if (Unit.f46060a != wneVar) {
                                        gmd0 gmd0Var13 = gmd0Var3;
                                        m97Var4 = m97Var2;
                                        xufVar3 = xufVar2;
                                        gmd0Var4 = gmd0Var13;
                                        zh7Var3 = zh7Var;
                                        gmd0Var4.g(hmd0Var);
                                        str3 = xufVar3.f;
                                        if (gmd0Var4.m.c().f24244a) {
                                            i = R.string.summary_possible_win;
                                        } else {
                                            i = R.string.history_possible_win;
                                        }
                                        i2 = i;
                                        double d5 = zh7Var3.e;
                                        double d6 = zh7Var3.c;
                                        str = null;
                                        emd0Var2.i = null;
                                        emd0Var2.j = null;
                                        emd0Var2.k = null;
                                        emd0Var2.l = gmd0Var4;
                                        emd0Var2.m = gmd0Var4;
                                        emd0Var2.n = null;
                                        emd0Var2.o = null;
                                        emd0Var2.p = zh7Var3;
                                        emd0Var2.q = str3;
                                        emd0Var2.r = zh7Var3;
                                        emd0Var2.s = z3;
                                        emd0Var2.t = i2;
                                        emd0Var2.w = 7;
                                        gmd0Var5 = gmd0Var4;
                                        objJ = gmd0Var5.j(d5, d6, m97Var4, emd0Var2);
                                        if (objJ != wneVar) {
                                            zh7Var4 = zh7Var3;
                                            zh7Var5 = zh7Var4;
                                            str4 = str3;
                                            gmd0Var6 = gmd0Var5;
                                            gmd0Var7 = gmd0Var6;
                                            objB = objJ;
                                            i3 = i2;
                                            double dDoubleValue3 = ((Number) objB).doubleValue();
                                            long jA3 = xru.a(gmd0Var7.o);
                                            boolean z6 = gmd0Var7.m.c().f24244a;
                                            str5 = zh7Var4.g;
                                            if (str5 == null) {
                                                str6 = "";
                                            } else {
                                                str6 = str5;
                                            }
                                            gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue3, jA3, z6, str6));
                                            g0g0Var = Unit.f46060a;
                                            e0g0 e0g0Var13 = j0g0.b;
                                            thA = j0g0.a(g0g0Var);
                                            if (thA != null) {
                                                g(hmd0Var);
                                                if (thA instanceof zhi0) {
                                                    zhi0Var = (zhi0) thA;
                                                    kuwVar = zhi0Var.c;
                                                    if (kuwVar == i2o.BetExistsError) {
                                                        String message6 = zhi0Var.getMessage();
                                                        g(new jmd0(message6 != null ? message6 : ""));
                                                    } else if (kuwVar == i2o.q) {
                                                        String message7 = zhi0Var.getMessage();
                                                        g(new lmd0(message7 != null ? message7 : ""));
                                                    } else {
                                                        message = zhi0Var.getMessage();
                                                        if (message != null) {
                                                            strA = str;
                                                        } else {
                                                            strA = str;
                                                        }
                                                        if (strA == null) {
                                                            strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                        }
                                                        g(new omd0(strA));
                                                    }
                                                } else {
                                                    z2 = thA instanceof UnknownHostException;
                                                    mmd0Var = mmd0.f22032a;
                                                    if (z2) {
                                                        g(mmd0Var);
                                                    } else {
                                                        this.A.b(thA, new ksc0((byte) 13));
                                                        g(mmd0Var);
                                                    }
                                                }
                                            }
                                            return Unit.f46060a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 2:
                    z3 = emd0Var2.s;
                    gmd0 gmd0Var14 = emd0Var2.l;
                    ms2 ms2Var4 = emd0Var2.k;
                    m9s m9sVar7 = emd0Var2.j;
                    dao daoVar6 = emd0Var2.i;
                    z1x.P(objB);
                    m9sVar3 = m9sVar7;
                    daoVar3 = daoVar6;
                    gmd0Var2 = gmd0Var14;
                    ms2Var3 = ms2Var4;
                    xufVar = (xuf) objB;
                    m97VarL0 = jd8.l0(daoVar3);
                    emd0Var2.i = daoVar3;
                    emd0Var2.j = m9sVar3;
                    emd0Var2.k = ms2Var3;
                    emd0Var2.l = gmd0Var2;
                    emd0Var2.m = xufVar;
                    emd0Var2.n = m97VarL0;
                    emd0Var2.s = z3;
                    emd0Var2.w = 3;
                    objB = gmd0Var2.k(m97VarL0, ms2Var3, emd0Var2);
                    if (objB != wneVar) {
                        m9sVar4 = m9sVar3;
                        m97Var = m97VarL0;
                        m97 m97Var7 = (m97) CollectionsKt.U(((cit0) objB).e);
                        daoVar4 = daoVar3;
                        m97 m97VarA3 = m97.a(m97Var, null, false, 0L, 0.0d, null, null, null, null, m97Var7.y, m97Var7.z, 16777215);
                        emd0Var2.i = daoVar4;
                        emd0Var2.j = m9sVar4;
                        str2 = null;
                        emd0Var2.k = null;
                        emd0Var2.l = gmd0Var2;
                        emd0Var2.m = xufVar;
                        emd0Var2.n = m97Var;
                        emd0Var2.s = z3;
                        emd0Var2.w = 4;
                        objI = gmd0Var2.i(m97VarA3, z3, ms2Var3, emd0Var2);
                        if (objI == wneVar) {
                            daoVar5 = daoVar4;
                            objB = objI;
                            gmd0Var3 = gmd0Var2;
                            xufVar2 = xufVar;
                            m97Var2 = m97Var;
                            m9sVar5 = m9sVar4;
                            zh7Var = (zh7) objB;
                            e0g0 e0g0Var14 = j0g0.b;
                            n660Var = gmd0Var3.k;
                            j = Long.parseLong(zh7Var.b);
                            hg7Var = hg7.f13004a;
                            emd0Var2.i = daoVar5;
                            emd0Var2.j = m9sVar5;
                            emd0Var2.k = null;
                            emd0Var2.l = gmd0Var3;
                            emd0Var2.m = xufVar2;
                            emd0Var2.n = m97Var2;
                            zh7Var2 = zh7Var;
                            emd0Var2.o = zh7Var2;
                            m97Var3 = m97Var2;
                            emd0Var2.p = null;
                            emd0Var2.s = z3;
                            emd0Var2.w = 5;
                            if (n660Var.x(j, hg7Var, emd0Var2) != wneVar) {
                                zh7Var = zh7Var2;
                                m97Var2 = m97Var3;
                                e0g0 e0g0Var15 = j0g0.b;
                                gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                                ih5 ih5Var4 = gmd0Var3.x;
                                String str10 = zh7Var.b;
                                ih5Var4.getClass();
                                str10.getClass();
                                ih5Var4.f14765a.a("bet_oneclick_done", new jo20().b());
                                a1d a1dVar4 = gmd0Var3.v;
                                long j7 = m9sVar5.f21426a;
                                str2 = null;
                                emd0Var2.i = null;
                                emd0Var2.j = null;
                                emd0Var2.k = null;
                                emd0Var2.l = gmd0Var3;
                                emd0Var2.m = xufVar2;
                                emd0Var2.n = m97Var2;
                                emd0Var2.o = zh7Var;
                                emd0Var2.p = null;
                                emd0Var2.s = z3;
                                emd0Var2.w = 6;
                                ((vqc) a1dVar4.b).k(pzb.C(new nme((byte) 2, j7)));
                                if (Unit.f46060a != wneVar) {
                                    gmd0 gmd0Var15 = gmd0Var3;
                                    m97Var4 = m97Var2;
                                    xufVar3 = xufVar2;
                                    gmd0Var4 = gmd0Var15;
                                    zh7Var3 = zh7Var;
                                    gmd0Var4.g(hmd0Var);
                                    str3 = xufVar3.f;
                                    if (gmd0Var4.m.c().f24244a) {
                                        i = R.string.summary_possible_win;
                                    } else {
                                        i = R.string.history_possible_win;
                                    }
                                    i2 = i;
                                    double d7 = zh7Var3.e;
                                    double d8 = zh7Var3.c;
                                    str = null;
                                    emd0Var2.i = null;
                                    emd0Var2.j = null;
                                    emd0Var2.k = null;
                                    emd0Var2.l = gmd0Var4;
                                    emd0Var2.m = gmd0Var4;
                                    emd0Var2.n = null;
                                    emd0Var2.o = null;
                                    emd0Var2.p = zh7Var3;
                                    emd0Var2.q = str3;
                                    emd0Var2.r = zh7Var3;
                                    emd0Var2.s = z3;
                                    emd0Var2.t = i2;
                                    emd0Var2.w = 7;
                                    gmd0Var5 = gmd0Var4;
                                    objJ = gmd0Var5.j(d7, d8, m97Var4, emd0Var2);
                                    if (objJ != wneVar) {
                                        zh7Var4 = zh7Var3;
                                        zh7Var5 = zh7Var4;
                                        str4 = str3;
                                        gmd0Var6 = gmd0Var5;
                                        gmd0Var7 = gmd0Var6;
                                        objB = objJ;
                                        i3 = i2;
                                        double dDoubleValue4 = ((Number) objB).doubleValue();
                                        long jA4 = xru.a(gmd0Var7.o);
                                        boolean z7 = gmd0Var7.m.c().f24244a;
                                        str5 = zh7Var4.g;
                                        if (str5 == null) {
                                            str6 = "";
                                        } else {
                                            str6 = str5;
                                        }
                                        gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue4, jA4, z7, str6));
                                        g0g0Var = Unit.f46060a;
                                        e0g0 e0g0Var16 = j0g0.b;
                                        thA = j0g0.a(g0g0Var);
                                        if (thA != null) {
                                            g(hmd0Var);
                                            if (thA instanceof zhi0) {
                                                zhi0Var = (zhi0) thA;
                                                kuwVar = zhi0Var.c;
                                                if (kuwVar == i2o.BetExistsError) {
                                                    String message8 = zhi0Var.getMessage();
                                                    g(new jmd0(message8 != null ? message8 : ""));
                                                } else if (kuwVar == i2o.q) {
                                                    String message9 = zhi0Var.getMessage();
                                                    g(new lmd0(message9 != null ? message9 : ""));
                                                } else {
                                                    message = zhi0Var.getMessage();
                                                    if (message != null) {
                                                        strA = str;
                                                    } else {
                                                        strA = str;
                                                    }
                                                    if (strA == null) {
                                                        strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                    }
                                                    g(new omd0(strA));
                                                }
                                            } else {
                                                z2 = thA instanceof UnknownHostException;
                                                mmd0Var = mmd0.f22032a;
                                                if (z2) {
                                                    g(mmd0Var);
                                                } else {
                                                    this.A.b(thA, new ksc0((byte) 13));
                                                    g(mmd0Var);
                                                }
                                            }
                                        }
                                        return Unit.f46060a;
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 3:
                    z3 = emd0Var2.s;
                    m97VarL0 = emd0Var2.n;
                    xufVar = (xuf) emd0Var2.m;
                    gmd0Var2 = emd0Var2.l;
                    ms2Var3 = emd0Var2.k;
                    m9sVar3 = emd0Var2.j;
                    daoVar3 = emd0Var2.i;
                    z1x.P(objB);
                    m9sVar4 = m9sVar3;
                    m97Var = m97VarL0;
                    m97 m97Var8 = (m97) CollectionsKt.U(((cit0) objB).e);
                    daoVar4 = daoVar3;
                    m97 m97VarA4 = m97.a(m97Var, null, false, 0L, 0.0d, null, null, null, null, m97Var8.y, m97Var8.z, 16777215);
                    emd0Var2.i = daoVar4;
                    emd0Var2.j = m9sVar4;
                    str2 = null;
                    emd0Var2.k = null;
                    emd0Var2.l = gmd0Var2;
                    emd0Var2.m = xufVar;
                    emd0Var2.n = m97Var;
                    emd0Var2.s = z3;
                    emd0Var2.w = 4;
                    objI = gmd0Var2.i(m97VarA4, z3, ms2Var3, emd0Var2);
                    if (objI == wneVar) {
                        daoVar5 = daoVar4;
                        objB = objI;
                        gmd0Var3 = gmd0Var2;
                        xufVar2 = xufVar;
                        m97Var2 = m97Var;
                        m9sVar5 = m9sVar4;
                        zh7Var = (zh7) objB;
                        e0g0 e0g0Var17 = j0g0.b;
                        n660Var = gmd0Var3.k;
                        j = Long.parseLong(zh7Var.b);
                        hg7Var = hg7.f13004a;
                        emd0Var2.i = daoVar5;
                        emd0Var2.j = m9sVar5;
                        emd0Var2.k = null;
                        emd0Var2.l = gmd0Var3;
                        emd0Var2.m = xufVar2;
                        emd0Var2.n = m97Var2;
                        zh7Var2 = zh7Var;
                        emd0Var2.o = zh7Var2;
                        m97Var3 = m97Var2;
                        emd0Var2.p = null;
                        emd0Var2.s = z3;
                        emd0Var2.w = 5;
                        if (n660Var.x(j, hg7Var, emd0Var2) != wneVar) {
                            zh7Var = zh7Var2;
                            m97Var2 = m97Var3;
                            e0g0 e0g0Var18 = j0g0.b;
                            gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                            ih5 ih5Var5 = gmd0Var3.x;
                            String str11 = zh7Var.b;
                            ih5Var5.getClass();
                            str11.getClass();
                            ih5Var5.f14765a.a("bet_oneclick_done", new jo20().b());
                            a1d a1dVar5 = gmd0Var3.v;
                            long j8 = m9sVar5.f21426a;
                            str2 = null;
                            emd0Var2.i = null;
                            emd0Var2.j = null;
                            emd0Var2.k = null;
                            emd0Var2.l = gmd0Var3;
                            emd0Var2.m = xufVar2;
                            emd0Var2.n = m97Var2;
                            emd0Var2.o = zh7Var;
                            emd0Var2.p = null;
                            emd0Var2.s = z3;
                            emd0Var2.w = 6;
                            ((vqc) a1dVar5.b).k(pzb.C(new nme((byte) 2, j8)));
                            if (Unit.f46060a != wneVar) {
                                gmd0 gmd0Var16 = gmd0Var3;
                                m97Var4 = m97Var2;
                                xufVar3 = xufVar2;
                                gmd0Var4 = gmd0Var16;
                                zh7Var3 = zh7Var;
                                gmd0Var4.g(hmd0Var);
                                str3 = xufVar3.f;
                                if (gmd0Var4.m.c().f24244a) {
                                    i = R.string.summary_possible_win;
                                } else {
                                    i = R.string.history_possible_win;
                                }
                                i2 = i;
                                double d9 = zh7Var3.e;
                                double d10 = zh7Var3.c;
                                str = null;
                                emd0Var2.i = null;
                                emd0Var2.j = null;
                                emd0Var2.k = null;
                                emd0Var2.l = gmd0Var4;
                                emd0Var2.m = gmd0Var4;
                                emd0Var2.n = null;
                                emd0Var2.o = null;
                                emd0Var2.p = zh7Var3;
                                emd0Var2.q = str3;
                                emd0Var2.r = zh7Var3;
                                emd0Var2.s = z3;
                                emd0Var2.t = i2;
                                emd0Var2.w = 7;
                                gmd0Var5 = gmd0Var4;
                                objJ = gmd0Var5.j(d9, d10, m97Var4, emd0Var2);
                                if (objJ != wneVar) {
                                    zh7Var4 = zh7Var3;
                                    zh7Var5 = zh7Var4;
                                    str4 = str3;
                                    gmd0Var6 = gmd0Var5;
                                    gmd0Var7 = gmd0Var6;
                                    objB = objJ;
                                    i3 = i2;
                                    double dDoubleValue5 = ((Number) objB).doubleValue();
                                    long jA5 = xru.a(gmd0Var7.o);
                                    boolean z8 = gmd0Var7.m.c().f24244a;
                                    str5 = zh7Var4.g;
                                    if (str5 == null) {
                                        str6 = "";
                                    } else {
                                        str6 = str5;
                                    }
                                    gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue5, jA5, z8, str6));
                                    g0g0Var = Unit.f46060a;
                                    e0g0 e0g0Var19 = j0g0.b;
                                    thA = j0g0.a(g0g0Var);
                                    if (thA != null) {
                                        g(hmd0Var);
                                        if (thA instanceof zhi0) {
                                            zhi0Var = (zhi0) thA;
                                            kuwVar = zhi0Var.c;
                                            if (kuwVar == i2o.BetExistsError) {
                                                String message10 = zhi0Var.getMessage();
                                                g(new jmd0(message10 != null ? message10 : ""));
                                            } else if (kuwVar == i2o.q) {
                                                String message11 = zhi0Var.getMessage();
                                                g(new lmd0(message11 != null ? message11 : ""));
                                            } else {
                                                message = zhi0Var.getMessage();
                                                if (message != null) {
                                                    strA = str;
                                                } else {
                                                    strA = str;
                                                }
                                                if (strA == null) {
                                                    strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                }
                                                g(new omd0(strA));
                                            }
                                        } else {
                                            z2 = thA instanceof UnknownHostException;
                                            mmd0Var = mmd0.f22032a;
                                            if (z2) {
                                                g(mmd0Var);
                                            } else {
                                                this.A.b(thA, new ksc0((byte) 13));
                                                g(mmd0Var);
                                            }
                                        }
                                    }
                                    return Unit.f46060a;
                                }
                            }
                        }
                    }
                    return wneVar;
                case 4:
                    z3 = emd0Var2.s;
                    m97 m97Var9 = emd0Var2.n;
                    xuf xufVar4 = (xuf) emd0Var2.m;
                    gmd0 gmd0Var17 = emd0Var2.l;
                    m9s m9sVar8 = emd0Var2.j;
                    dao daoVar7 = emd0Var2.i;
                    z1x.P(objB);
                    daoVar5 = daoVar7;
                    m9sVar5 = m9sVar8;
                    gmd0Var3 = gmd0Var17;
                    xufVar2 = xufVar4;
                    m97Var2 = m97Var9;
                    zh7Var = (zh7) objB;
                    e0g0 e0g0Var110 = j0g0.b;
                    n660Var = gmd0Var3.k;
                    j = Long.parseLong(zh7Var.b);
                    hg7Var = hg7.f13004a;
                    emd0Var2.i = daoVar5;
                    emd0Var2.j = m9sVar5;
                    emd0Var2.k = null;
                    emd0Var2.l = gmd0Var3;
                    emd0Var2.m = xufVar2;
                    emd0Var2.n = m97Var2;
                    zh7Var2 = zh7Var;
                    emd0Var2.o = zh7Var2;
                    m97Var3 = m97Var2;
                    emd0Var2.p = null;
                    emd0Var2.s = z3;
                    emd0Var2.w = 5;
                    if (n660Var.x(j, hg7Var, emd0Var2) != wneVar) {
                        zh7Var = zh7Var2;
                        m97Var2 = m97Var3;
                        e0g0 e0g0Var111 = j0g0.b;
                        gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                        ih5 ih5Var6 = gmd0Var3.x;
                        String str12 = zh7Var.b;
                        ih5Var6.getClass();
                        str12.getClass();
                        ih5Var6.f14765a.a("bet_oneclick_done", new jo20().b());
                        a1d a1dVar6 = gmd0Var3.v;
                        long j9 = m9sVar5.f21426a;
                        str2 = null;
                        emd0Var2.i = null;
                        emd0Var2.j = null;
                        emd0Var2.k = null;
                        emd0Var2.l = gmd0Var3;
                        emd0Var2.m = xufVar2;
                        emd0Var2.n = m97Var2;
                        emd0Var2.o = zh7Var;
                        emd0Var2.p = null;
                        emd0Var2.s = z3;
                        emd0Var2.w = 6;
                        ((vqc) a1dVar6.b).k(pzb.C(new nme((byte) 2, j9)));
                        if (Unit.f46060a != wneVar) {
                            gmd0 gmd0Var18 = gmd0Var3;
                            m97Var4 = m97Var2;
                            xufVar3 = xufVar2;
                            gmd0Var4 = gmd0Var18;
                            zh7Var3 = zh7Var;
                            gmd0Var4.g(hmd0Var);
                            str3 = xufVar3.f;
                            if (gmd0Var4.m.c().f24244a) {
                                i = R.string.summary_possible_win;
                            } else {
                                i = R.string.history_possible_win;
                            }
                            i2 = i;
                            double d11 = zh7Var3.e;
                            double d12 = zh7Var3.c;
                            str = null;
                            emd0Var2.i = null;
                            emd0Var2.j = null;
                            emd0Var2.k = null;
                            emd0Var2.l = gmd0Var4;
                            emd0Var2.m = gmd0Var4;
                            emd0Var2.n = null;
                            emd0Var2.o = null;
                            emd0Var2.p = zh7Var3;
                            emd0Var2.q = str3;
                            emd0Var2.r = zh7Var3;
                            emd0Var2.s = z3;
                            emd0Var2.t = i2;
                            emd0Var2.w = 7;
                            gmd0Var5 = gmd0Var4;
                            objJ = gmd0Var5.j(d11, d12, m97Var4, emd0Var2);
                            if (objJ != wneVar) {
                                zh7Var4 = zh7Var3;
                                zh7Var5 = zh7Var4;
                                str4 = str3;
                                gmd0Var6 = gmd0Var5;
                                gmd0Var7 = gmd0Var6;
                                objB = objJ;
                                i3 = i2;
                                double dDoubleValue6 = ((Number) objB).doubleValue();
                                long jA6 = xru.a(gmd0Var7.o);
                                boolean z9 = gmd0Var7.m.c().f24244a;
                                str5 = zh7Var4.g;
                                if (str5 == null) {
                                    str6 = "";
                                } else {
                                    str6 = str5;
                                }
                                gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue6, jA6, z9, str6));
                                g0g0Var = Unit.f46060a;
                                e0g0 e0g0Var112 = j0g0.b;
                                thA = j0g0.a(g0g0Var);
                                if (thA != null) {
                                    g(hmd0Var);
                                    if (thA instanceof zhi0) {
                                        zhi0Var = (zhi0) thA;
                                        kuwVar = zhi0Var.c;
                                        if (kuwVar == i2o.BetExistsError) {
                                            String message12 = zhi0Var.getMessage();
                                            g(new jmd0(message12 != null ? message12 : ""));
                                        } else if (kuwVar == i2o.q) {
                                            String message13 = zhi0Var.getMessage();
                                            g(new lmd0(message13 != null ? message13 : ""));
                                        } else {
                                            message = zhi0Var.getMessage();
                                            if (message != null) {
                                                strA = str;
                                            } else {
                                                strA = str;
                                            }
                                            if (strA == null) {
                                                strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                            }
                                            g(new omd0(strA));
                                        }
                                    } else {
                                        z2 = thA instanceof UnknownHostException;
                                        mmd0Var = mmd0.f22032a;
                                        if (z2) {
                                            g(mmd0Var);
                                        } else {
                                            this.A.b(thA, new ksc0((byte) 13));
                                            g(mmd0Var);
                                        }
                                    }
                                }
                                return Unit.f46060a;
                            }
                        }
                    }
                    return wneVar;
                case 5:
                    z3 = emd0Var2.s;
                    zh7Var = emd0Var2.o;
                    m97Var2 = emd0Var2.n;
                    xufVar2 = (xuf) emd0Var2.m;
                    gmd0Var3 = emd0Var2.l;
                    m9sVar5 = emd0Var2.j;
                    daoVar5 = emd0Var2.i;
                    try {
                        z1x.P(objB);
                        e0g0 e0g0Var113 = j0g0.b;
                        break;
                    } catch (Throwable unused5) {
                        e0g0 e0g0Var20 = j0g0.b;
                    }
                    gmd0Var3.z.i(m9sVar5.o, m9sVar5.p, daoVar5.e, zh7Var.b);
                    ih5 ih5Var7 = gmd0Var3.x;
                    String str13 = zh7Var.b;
                    ih5Var7.getClass();
                    str13.getClass();
                    ih5Var7.f14765a.a("bet_oneclick_done", new jo20().b());
                    a1d a1dVar7 = gmd0Var3.v;
                    long j10 = m9sVar5.f21426a;
                    str2 = null;
                    emd0Var2.i = null;
                    emd0Var2.j = null;
                    emd0Var2.k = null;
                    emd0Var2.l = gmd0Var3;
                    emd0Var2.m = xufVar2;
                    emd0Var2.n = m97Var2;
                    emd0Var2.o = zh7Var;
                    emd0Var2.p = null;
                    emd0Var2.s = z3;
                    emd0Var2.w = 6;
                    ((vqc) a1dVar7.b).k(pzb.C(new nme((byte) 2, j10)));
                    if (Unit.f46060a != wneVar) {
                        gmd0 gmd0Var19 = gmd0Var3;
                        m97Var4 = m97Var2;
                        xufVar3 = xufVar2;
                        gmd0Var4 = gmd0Var19;
                        zh7Var3 = zh7Var;
                        gmd0Var4.g(hmd0Var);
                        str3 = xufVar3.f;
                        if (gmd0Var4.m.c().f24244a) {
                            i = R.string.summary_possible_win;
                        } else {
                            i = R.string.history_possible_win;
                        }
                        i2 = i;
                        double d13 = zh7Var3.e;
                        double d14 = zh7Var3.c;
                        str = null;
                        emd0Var2.i = null;
                        emd0Var2.j = null;
                        emd0Var2.k = null;
                        emd0Var2.l = gmd0Var4;
                        emd0Var2.m = gmd0Var4;
                        emd0Var2.n = null;
                        emd0Var2.o = null;
                        emd0Var2.p = zh7Var3;
                        emd0Var2.q = str3;
                        emd0Var2.r = zh7Var3;
                        emd0Var2.s = z3;
                        emd0Var2.t = i2;
                        emd0Var2.w = 7;
                        gmd0Var5 = gmd0Var4;
                        objJ = gmd0Var5.j(d13, d14, m97Var4, emd0Var2);
                        if (objJ != wneVar) {
                            zh7Var4 = zh7Var3;
                            zh7Var5 = zh7Var4;
                            str4 = str3;
                            gmd0Var6 = gmd0Var5;
                            gmd0Var7 = gmd0Var6;
                            objB = objJ;
                            i3 = i2;
                            double dDoubleValue7 = ((Number) objB).doubleValue();
                            long jA7 = xru.a(gmd0Var7.o);
                            boolean z10 = gmd0Var7.m.c().f24244a;
                            str5 = zh7Var4.g;
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue7, jA7, z10, str6));
                            g0g0Var = Unit.f46060a;
                            e0g0 e0g0Var114 = j0g0.b;
                            thA = j0g0.a(g0g0Var);
                            if (thA != null) {
                                g(hmd0Var);
                                if (thA instanceof zhi0) {
                                    zhi0Var = (zhi0) thA;
                                    kuwVar = zhi0Var.c;
                                    if (kuwVar == i2o.BetExistsError) {
                                        String message14 = zhi0Var.getMessage();
                                        g(new jmd0(message14 != null ? message14 : ""));
                                    } else if (kuwVar == i2o.q) {
                                        String message15 = zhi0Var.getMessage();
                                        g(new lmd0(message15 != null ? message15 : ""));
                                    } else {
                                        message = zhi0Var.getMessage();
                                        if (message != null) {
                                            strA = str;
                                        } else {
                                            strA = str;
                                        }
                                        if (strA == null) {
                                            strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                        }
                                        g(new omd0(strA));
                                    }
                                } else {
                                    z2 = thA instanceof UnknownHostException;
                                    mmd0Var = mmd0.f22032a;
                                    if (z2) {
                                        g(mmd0Var);
                                    } else {
                                        this.A.b(thA, new ksc0((byte) 13));
                                        g(mmd0Var);
                                    }
                                }
                            }
                            return Unit.f46060a;
                        }
                    }
                    return wneVar;
                case 6:
                    z3 = emd0Var2.s;
                    zh7 zh7Var6 = emd0Var2.o;
                    m97 m97Var10 = emd0Var2.n;
                    xufVar3 = (xuf) emd0Var2.m;
                    gmd0Var4 = emd0Var2.l;
                    z1x.P(objB);
                    zh7Var3 = zh7Var6;
                    m97Var4 = m97Var10;
                    gmd0Var4.g(hmd0Var);
                    str3 = xufVar3.f;
                    if (gmd0Var4.m.c().f24244a) {
                        i = R.string.summary_possible_win;
                    } else {
                        i = R.string.history_possible_win;
                    }
                    i2 = i;
                    double d15 = zh7Var3.e;
                    double d16 = zh7Var3.c;
                    str = null;
                    emd0Var2.i = null;
                    emd0Var2.j = null;
                    emd0Var2.k = null;
                    emd0Var2.l = gmd0Var4;
                    emd0Var2.m = gmd0Var4;
                    emd0Var2.n = null;
                    emd0Var2.o = null;
                    emd0Var2.p = zh7Var3;
                    emd0Var2.q = str3;
                    emd0Var2.r = zh7Var3;
                    emd0Var2.s = z3;
                    emd0Var2.t = i2;
                    emd0Var2.w = 7;
                    gmd0Var5 = gmd0Var4;
                    objJ = gmd0Var5.j(d15, d16, m97Var4, emd0Var2);
                    if (objJ != wneVar) {
                        zh7Var4 = zh7Var3;
                        zh7Var5 = zh7Var4;
                        str4 = str3;
                        gmd0Var6 = gmd0Var5;
                        gmd0Var7 = gmd0Var6;
                        objB = objJ;
                        i3 = i2;
                        double dDoubleValue8 = ((Number) objB).doubleValue();
                        long jA8 = xru.a(gmd0Var7.o);
                        boolean z11 = gmd0Var7.m.c().f24244a;
                        str5 = zh7Var4.g;
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue8, jA8, z11, str6));
                        g0g0Var = Unit.f46060a;
                        e0g0 e0g0Var115 = j0g0.b;
                        thA = j0g0.a(g0g0Var);
                        if (thA != null) {
                            g(hmd0Var);
                            if (thA instanceof zhi0) {
                                zhi0Var = (zhi0) thA;
                                kuwVar = zhi0Var.c;
                                if (kuwVar == i2o.BetExistsError) {
                                    String message16 = zhi0Var.getMessage();
                                    g(new jmd0(message16 != null ? message16 : ""));
                                } else if (kuwVar == i2o.q) {
                                    String message17 = zhi0Var.getMessage();
                                    g(new lmd0(message17 != null ? message17 : ""));
                                } else {
                                    message = zhi0Var.getMessage();
                                    if (message != null) {
                                        strA = str;
                                    } else {
                                        strA = str;
                                    }
                                    if (strA == null) {
                                        strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                    }
                                    g(new omd0(strA));
                                }
                            } else {
                                z2 = thA instanceof UnknownHostException;
                                mmd0Var = mmd0.f22032a;
                                if (z2) {
                                    g(mmd0Var);
                                } else {
                                    this.A.b(thA, new ksc0((byte) 13));
                                    g(mmd0Var);
                                }
                            }
                        }
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 7:
                    int i6 = emd0Var2.t;
                    zh7 zh7Var7 = emd0Var2.r;
                    String str14 = emd0Var2.q;
                    zh7Var4 = emd0Var2.p;
                    gmd0Var6 = (gmd0) emd0Var2.m;
                    gmd0Var7 = emd0Var2.l;
                    z1x.P(objB);
                    i3 = i6;
                    zh7Var5 = zh7Var7;
                    str4 = str14;
                    str = null;
                    double dDoubleValue9 = ((Number) objB).doubleValue();
                    long jA9 = xru.a(gmd0Var7.o);
                    boolean z12 = gmd0Var7.m.c().f24244a;
                    str5 = zh7Var4.g;
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    gmd0Var6.g(new nmd0(zh7Var5, str4, i3, dDoubleValue9, jA9, z12, str6));
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var116 = j0g0.b;
                    thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        g(hmd0Var);
                        if (thA instanceof zhi0) {
                            zhi0Var = (zhi0) thA;
                            kuwVar = zhi0Var.c;
                            if (kuwVar == i2o.BetExistsError) {
                                String message18 = zhi0Var.getMessage();
                                g(new jmd0(message18 != null ? message18 : ""));
                            } else if (kuwVar == i2o.q) {
                                String message19 = zhi0Var.getMessage();
                                g(new lmd0(message19 != null ? message19 : ""));
                            } else {
                                message = zhi0Var.getMessage();
                                if (message != null) {
                                    strA = str;
                                } else {
                                    strA = str;
                                }
                                if (strA == null) {
                                    strA = this.B.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                }
                                g(new omd0(strA));
                            }
                        } else {
                            z2 = thA instanceof UnknownHostException;
                            mmd0Var = mmd0.f22032a;
                            if (z2) {
                                g(mmd0Var);
                            } else {
                                this.A.b(thA, new ksc0((byte) 13));
                                g(mmd0Var);
                            }
                        }
                    }
                    return Unit.f46060a;
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
            str = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (l(r2, r2, r3, r1, r5) == r6) goto L25;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.amd0 r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gmd0.a(a.amd0, a.zje):java.lang.Object");
    }
}
