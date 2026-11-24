package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f23600a = new zfn(new dfp(8), (byte) 0);

    public static final void a(float f, long j, e2d e2dVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        e2dVar.getClass();
        fetVar.g0(1831498791);
        if ((i & 6) == 0) {
            i2 = (fetVar.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fW0 = ((w6k) fetVar.k(bmd.h)).w0(f);
            if (fW0 < 0.0f) {
                fW0 = 0.0f;
            }
            Float fValueOf = Float.valueOf(fW0);
            boolean zD = fetVar.d(fW0) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new lip(e2dVar, fW0, null, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, fValueOf, (Function2) objP);
            gmn0.a(null, null, j, 0L, 0.0f, 0.0f, null, u1c.M(-243854996, new zv(f, (Object) e2dVar, ugdVar, (byte) 7), fetVar), fetVar, ((i2 << 3) & 896) | 12582912, 123);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new czl(f, j, e2dVar, ugdVar, i, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, kip kipVar, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-733660680);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kipVar) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            byte b = 3;
            if (z || objP == ukd.f35823a) {
                objP = new qf6(kipVar, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarK0 = mrv.k0(jm40.b, RemoteMessageConst.Notification.CONTENT);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            obc.e(new l5d0[0], ugdVar, fetVar, (i2 >> 3) & 112);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, kipVar, ugdVar, i, (byte) 20);
        }
    }

    public static final mm40 c(mm40 mm40Var, e2d e2dVar, fet fetVar, int i) {
        mm40Var.getClass();
        e2dVar.getClass();
        sjj sjjVarA = wzk0.a(fetVar);
        nul0 nul0VarG0 = ro4.g0(1.0f, 1600.0f, null, 4);
        boolean zBooleanValue = ((Boolean) ((Function0) e2dVar.h.getValue()).invoke()).booleanValue();
        ma80 ma80Var = ma80.f21447a;
        int i2 = (i & 112) ^ 48;
        boolean z = true;
        boolean z2 = (i2 > 32 && fetVar.g(e2dVar)) || (i & 48) == 32;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (z2 || objP == obj) {
            objP = new o6n(e2dVar, (byte) 3);
            fetVar.o0(objP);
        }
        wel welVarB = uel.b((Function1) objP, fetVar);
        boolean z3 = ((i2 > 32 && fetVar.g(e2dVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && fetVar.i(sjjVarA)) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !fetVar.i(nul0VarG0)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objP2 = fetVar.P();
        if (z4 || objP2 == obj) {
            objP2 = new gv2(e2dVar, sjjVarA, nul0VarG0, null);
            fetVar.o0(objP2);
        }
        return uel.a(mm40Var, welVarB, ma80Var, zBooleanValue, false, null, (xdr) objP2, 184);
    }

    public static final e2d d(oyq0 oyq0Var, sjj sjjVar, fet fetVar, int i) {
        if ((i & 1) != 0) {
            oyq0Var = ob3.d(6, 6, fetVar);
        }
        if ((i & 2) != 0) {
            sjjVar = wzk0.a(fetVar);
        }
        nul0 nul0VarG0 = ro4.g0(1.0f, 1600.0f, null, 4);
        boolean zG = fetVar.g(oyq0Var) | fetVar.g(sjjVar) | fetVar.g(nul0VarG0);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new e2d(oyq0Var, sjjVar, nul0VarG0);
            fetVar.o0(objP);
        }
        return (e2d) objP;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(oyq0 oyq0Var, float f, sjj sjjVar, nul0 nul0Var, zje zjeVar) {
        mip mipVar;
        jie0 jie0Var;
        jie0 jie0Var2;
        if (zjeVar instanceof mip) {
            mipVar = (mip) zjeVar;
            int i = mipVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                mipVar.n = i - Integer.MIN_VALUE;
            } else {
                mipVar = new mip(zjeVar);
            }
        } else {
            mipVar = new mip(zjeVar);
        }
        mip mipVar2 = mipVar;
        Object obj = mipVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = mipVar2.n;
        byte b = 3;
        if (i2 != 0) {
            if (i2 == 1) {
                f = mipVar2.l;
                jie0 jie0Var3 = mipVar2.k;
                nul0Var = mipVar2.j;
                oyq0 oyq0Var2 = mipVar2.i;
                z1x.P(obj);
                jie0Var = jie0Var3;
                oyq0Var = oyq0Var2;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var2 = mipVar2.k;
                z1x.P(obj);
            }
            jie0Var = jie0Var2;
            return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        }
        z1x.P(obj);
        if (oyq0Var.a() < 0.01f || oyq0Var.a() == 1.0f) {
            return new g6u0(0L);
        }
        jie0Var = new jie0();
        jie0Var.f16571a = f;
        if (sjjVar != null && Math.abs(f) > 1.0f) {
            jie0 jie0Var4 = new jie0();
            l73 l73VarD = x4d0.d(0.0f, f, 28);
            ib3 ib3Var = new ib3(jie0Var4, oyq0Var, jie0Var, b);
            mipVar2.i = oyq0Var;
            mipVar2.j = nul0Var;
            mipVar2.k = jie0Var;
            mipVar2.l = f;
            mipVar2.n = 1;
            if (hhm0.o(l73VarD, sjjVar, false, ib3Var, mipVar2) != wneVar) {
            }
            return wneVar;
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        if (nul0Var != null) {
            agk0 agk0Var = oyq0Var.c;
            if (agk0Var.l() < 0.0f && agk0Var.l() > oyq0Var.f26070a) {
                l73 l73VarD2 = x4d0.d(agk0Var.l(), 0.0f, 30);
                Float f2 = new Float(oyq0Var.a() < 0.5f ? 0.0f : oyq0Var.f26070a);
                jb3 jb3Var = new jb3(oyq0Var, (byte) 3);
                mipVar2.i = null;
                mipVar2.j = null;
                mipVar2.k = jie0Var;
                mipVar2.l = f;
                mipVar2.n = 2;
                if (hhm0.q(l73VarD2, f2, nul0Var, false, jb3Var, mipVar2, 4) != wneVar) {
                    jie0Var2 = jie0Var;
                    jie0Var = jie0Var2;
                }
                return wneVar;
            }
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
    }
}
