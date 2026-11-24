package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class oue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsf0 f25873a;
    public final zj8 b;
    public final knf0 c;
    public final mne d;
    public final btt0 e;
    public final no f;

    public oue0(wsf0 wsf0Var, zj8 zj8Var, knf0 knf0Var, mne mneVar, btt0 btt0Var, no noVar) {
        zj8Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        noVar.getClass();
        this.f25873a = wsf0Var;
        this.b = zj8Var;
        this.c = knf0Var;
        this.d = mneVar;
        this.e = btt0Var;
        this.f = noVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) throws zhi0 {
        mue0 mue0Var;
        if (zjeVar instanceof mue0) {
            mue0Var = (mue0) zjeVar;
            int i2 = mue0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mue0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mue0Var = new mue0(this, zjeVar);
            }
        } else {
            mue0Var = new mue0(this, zjeVar);
        }
        Object objB = mue0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = mue0Var.k;
        if (i3 == 0) {
            z1x.P(objB);
            String strA = this.e.a();
            s8v0 s8v0Var = new s8v0(i);
            mue0Var.k = 1;
            objB = ((di8) ((zm) this.f25873a.b).invoke()).b(strA, s8v0Var, mue0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        ((q16) objB).a();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, long j, zje zjeVar) {
        nue0 nue0Var;
        Object g0g0Var;
        if (zjeVar instanceof nue0) {
            nue0Var = (nue0) zjeVar;
            int i2 = nue0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nue0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                nue0Var = new nue0(this, zjeVar);
            }
        } else {
            nue0Var = new nue0(this, zjeVar);
        }
        Object objD0 = nue0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = nue0Var.k;
        try {
            if (i3 == 0) {
                z1x.P(objD0);
                be8 be8Var = this.b.f44472a;
                if (be8Var == null || be8Var.b != i || be8Var.c != j) {
                    be8Var = null;
                }
                g0g0Var = be8Var != null ? be8Var.f2436a : null;
                e0g0 e0g0Var = j0g0.b;
                if (g0g0Var == null) {
                    dvj dvjVar = this.d.b;
                    n6f n6fVar = new n6f(this, i, j, null, (byte) 2);
                    nue0Var.k = 1;
                    objD0 = qjj.d0(dvjVar, n6fVar, nue0Var);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                if (j0g0.a(g0g0Var) == null) {
                    return g0g0Var;
                }
                return iun.f15405a;
            }
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
            g0g0Var = (List) objD0;
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) == null) {
            return g0g0Var;
        }
        return iun.f15405a;
    }
}
