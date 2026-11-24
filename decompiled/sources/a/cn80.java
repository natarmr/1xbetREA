package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class cn80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f4642a = new zfn(new i280((byte) 13), (byte) 0);
    public static final zfn b = new zfn(new i280((byte) 14), (byte) 0);

    public static final void a(g5a0 g5a0Var, g5a0 g5a0Var2, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        Function2 function3;
        ugd ugdVar;
        if ((i2 & 16) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new zc70((byte) 19);
                fetVar.o0(objP);
            }
            function3 = (Function2) objP;
        } else {
            function3 = function2;
        }
        byte b2 = 0;
        ugd ugdVarM = u1c.M(450754770, new an80(g5a0Var, w6nVar, b2), fetVar);
        zfp zfpVar = g5a0Var.b;
        ugd ugdVarM2 = null;
        if (zfpVar == null) {
            fetVar.e0(-1659248709);
            fetVar.r(false);
            ugdVar = null;
        } else {
            fetVar.e0(-1659248708);
            ugd ugdVarM3 = u1c.M(1315359622, new bn80(w6nVar, zfpVar, function3, b2), fetVar);
            fetVar.r(false);
            ugdVar = ugdVarM3;
        }
        int i3 = (i & 14) | 48;
        jm40 jm40Var = jm40.b;
        z1x.h(jm40Var, ugdVarM, ugdVar, null, fetVar, i3, 8);
        byte b3 = 1;
        ugd ugdVarM4 = u1c.M(-710928133, new an80(g5a0Var2, w6nVar, b3), fetVar);
        zfp zfpVar2 = g5a0Var2.b;
        if (zfpVar2 == null) {
            fetVar.e0(-1658364837);
            fetVar.r(false);
        } else {
            fetVar.e0(-1658364836);
            ugdVarM2 = u1c.M(1245646511, new bn80(w6nVar, zfpVar2, function3, b3), fetVar);
            fetVar.r(false);
        }
        z1x.h(jm40Var, ugdVarM4, ugdVarM2, null, fetVar, i3, 8);
    }
}
