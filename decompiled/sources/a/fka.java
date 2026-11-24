package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f9681a = new zfn(new mn9((byte) 24), (byte) 1);

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        yfe0 yfe0VarU;
        dka dkaVar;
        fetVar.g0(2060263170);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            l7m0 l7m0Var = (l7m0) fetVar.k(f9681a);
            Object[] objArr = {l7m0Var};
            boolean zG = fetVar.g(l7m0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new kk7(l7m0Var, (byte) 28);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = {l7m0Var};
            boolean zG2 = fetVar.g(l7m0Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new kk7(l7m0Var, (byte) 29);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = {l7m0Var};
            boolean zG3 = fetVar.g(l7m0Var);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = new eka(l7m0Var, (byte) 0);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
            Object[] objArr4 = {l7m0Var};
            boolean zG4 = fetVar.g(l7m0Var);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj) {
                objP4 = new eka(l7m0Var, (byte) 1);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP4, fetVar);
            Object[] objArr5 = {l7m0Var};
            boolean zG5 = fetVar.g(l7m0Var);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj) {
                objP5 = new eka(l7m0Var, (byte) 2);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP5, fetVar);
            if (((Boolean) l7m0VarY.getValue()).booleanValue()) {
                b(mm40Var, u1c.M(-460784348, new v7i0(l7m0VarY2, (byte) 18), fetVar), u1c.M(-2099776597, new v7i0(l7m0VarY3, (byte) 19), fetVar), u1c.M(-1049907382, new v7i0(l7m0VarY4, (byte) 16), fetVar), u1c.M(-38167, new v7i0(l7m0VarY5, (byte) 17), fetVar), fetVar, 28086);
            } else {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    dkaVar = new dka(mm40Var, i, (byte) 1);
                }
            }
            yfe0VarU.d = dkaVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            dkaVar = new dka(mm40Var, i, (byte) 0);
            yfe0VarU.d = dkaVar;
        }
    }

    public static final void b(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        int i2;
        fetVar.g0(-722086702);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar4) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1516484590, new bka(mm40Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cka(mm40Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, i, (byte) 0);
        }
    }
}
