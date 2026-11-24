package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class lau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19723a = 1;
    public final f4u b;
    public final pru c;
    public final lbu d;
    public final epc e;
    public final iqi f;
    public final r9u g;

    public lau(f4u f4uVar, pru pruVar, lbu lbuVar, epc epcVar, iqi iqiVar, r9u r9uVar) {
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.b = f4uVar;
        this.c = pruVar;
        this.d = lbuVar;
        this.e = epcVar;
        this.f = iqiVar;
        this.g = r9uVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final Object a(zje zjeVar) {
        kau kauVar;
        boolean z;
        c5q c5qVar;
        sff0 sff0Var;
        boolean z2;
        qau qauVar;
        boolean z3;
        c5q c5qVar2;
        sff0 sff0Var2;
        boolean z4;
        byte b = this.f19723a;
        byte b2 = 5;
        iqi iqiVar = this.f;
        epc epcVar = this.e;
        f4u f4uVar = this.b;
        pru pruVar = this.c;
        lbu lbuVar = this.d;
        r9u r9uVar = this.g;
        byte b3 = 1;
        switch (b) {
            case 0:
                if (zjeVar instanceof kau) {
                    kauVar = (kau) zjeVar;
                    int i = kauVar.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kauVar.n = i - Integer.MIN_VALUE;
                    } else {
                        kauVar = new kau(this, zjeVar);
                    }
                } else {
                    kauVar = new kau(this, zjeVar);
                }
                Object obj = kauVar.l;
                wne wneVar = wne.f39444a;
                int i2 = kauVar.n;
                if (i2 == 0) {
                    z1x.P(obj);
                    boolean zJ = lbuVar.j();
                    sff0 sff0VarA = pruVar.a();
                    if (sff0VarA.B0) {
                        ygp ygpVar = ygp.u;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    c5q c5qVarH = pgi0.h(CollectionsKt.I(f4uVar.b().d), new jno(b3, zJ));
                    ygp ygpVar2 = ygp.E1;
                    r9uVar.getClass();
                    j1q0 j1q0Var2 = r9uVar.f30104a;
                    j1q0Var2.getClass();
                    c5q c5qVarN = qbc.N(c5qVarH, sff0VarA, epcVar.a().f13512a, j1q0Var2.f15748a.d(ygpVar2), zJ, false, z, 16);
                    kauVar.j = sff0VarA;
                    kauVar.k = c5qVarN;
                    kauVar.i = zJ;
                    kauVar.n = 1;
                    Object objG = iqiVar.g(kauVar);
                    if (objG == wneVar) {
                        return wneVar;
                    }
                    c5qVar = c5qVarN;
                    obj = objG;
                    sff0Var = sff0VarA;
                    z2 = zJ;
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = kauVar.i;
                    c5qVar = kauVar.k;
                    sff0Var = kauVar.j;
                    z1x.P(obj);
                }
                vh0 vh0Var = (vh0) obj;
                c5qVar.getClass();
                vh0Var.getClass();
                sff0Var.getClass();
                return pgi0.t(pgi0.p(c5qVar, new lrc0(vh0Var, sff0Var, z2, b2)));
            default:
                if (zjeVar instanceof qau) {
                    qauVar = (qau) zjeVar;
                    int i3 = qauVar.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qauVar.n = i3 - Integer.MIN_VALUE;
                    } else {
                        qauVar = new qau(this, zjeVar);
                    }
                } else {
                    qauVar = new qau(this, zjeVar);
                }
                Object obj2 = qauVar.l;
                wne wneVar2 = wne.f39444a;
                int i4 = qauVar.n;
                if (i4 == 0) {
                    z1x.P(obj2);
                    boolean zJ2 = lbuVar.j();
                    sff0 sff0VarA2 = pruVar.a();
                    if (sff0VarA2.B0) {
                        ygp ygpVar3 = ygp.u;
                        r9uVar.getClass();
                        j1q0 j1q0Var3 = r9uVar.f30104a;
                        j1q0Var3.getClass();
                        if (j1q0Var3.f15748a.d(ygpVar3)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    c5q c5qVarH2 = pgi0.h(CollectionsKt.I(f4uVar.b().c), new jno(b3, zJ2));
                    ygp ygpVar4 = ygp.E1;
                    r9uVar.getClass();
                    j1q0 j1q0Var4 = r9uVar.f30104a;
                    j1q0Var4.getClass();
                    c5q c5qVarN2 = qbc.N(c5qVarH2, sff0VarA2, epcVar.a().f13512a, j1q0Var4.f15748a.d(ygpVar4), zJ2, false, z3, 16);
                    qauVar.j = sff0VarA2;
                    qauVar.k = c5qVarN2;
                    qauVar.i = zJ2;
                    qauVar.n = 1;
                    Object objG2 = iqiVar.g(qauVar);
                    if (objG2 == wneVar2) {
                        return wneVar2;
                    }
                    c5qVar2 = c5qVarN2;
                    obj2 = objG2;
                    sff0Var2 = sff0VarA2;
                    z4 = zJ2;
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = qauVar.i;
                    c5qVar2 = qauVar.k;
                    sff0Var2 = qauVar.j;
                    z1x.P(obj2);
                }
                vh0 vh0Var2 = (vh0) obj2;
                c5qVar2.getClass();
                vh0Var2.getClass();
                sff0Var2.getClass();
                return pgi0.t(pgi0.p(c5qVar2, new lrc0(vh0Var2, sff0Var2, z4, b2)));
        }
    }

    public lau(f4u f4uVar, pru pruVar, lbu lbuVar, iqi iqiVar, epc epcVar, r9u r9uVar) {
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.b = f4uVar;
        this.c = pruVar;
        this.d = lbuVar;
        this.f = iqiVar;
        this.e = epcVar;
        this.g = r9uVar;
    }
}
