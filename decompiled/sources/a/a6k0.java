package a;

import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class a6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zri f321a;
    public final bzt b;
    public final mmy c;

    public a6k0(zri zriVar, bzt bztVar, mmy mmyVar) {
        this.f321a = zriVar;
        this.b = bztVar;
        this.c = mmyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        z5k0 z5k0Var;
        if (zjeVar instanceof z5k0) {
            z5k0Var = (z5k0) zjeVar;
            int i = z5k0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5k0Var.k = i - Integer.MIN_VALUE;
            } else {
                z5k0Var = new z5k0(this, zjeVar);
            }
        } else {
            z5k0Var = new z5k0(this, zjeVar);
        }
        Object objS = z5k0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z5k0Var.k;
        if (i2 == 0) {
            z1x.P(objS);
            c7k0 c7k0Var = this.b.f3488a.a().q;
            z5k0Var.k = 1;
            int iOrdinal = c7k0Var.ordinal();
            mmy mmyVar = this.c;
            if (iOrdinal == 0) {
                objS = ((KeysImpl) mmyVar).S(z5k0Var);
            } else if (iOrdinal == 1) {
                objS = ((KeysImpl) mmyVar).U(z5k0Var);
            } else if (iOrdinal == 2) {
                objS = ((KeysImpl) mmyVar).R(z5k0Var);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                objS = ((KeysImpl) mmyVar).T(z5k0Var);
            }
            if (objS != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objS);
                return objS;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objS);
        z5k0Var.k = 2;
        Object objC = this.f321a.c((String) objS, z5k0Var);
        return objC == wneVar ? wneVar : objC;
    }
}
