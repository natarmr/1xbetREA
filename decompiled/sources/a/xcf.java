package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class xcf {
    public static Object c(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, Function0 function0, fea feaVar) {
        Object objJ = d5c.J(feaVar, new s6d(function0, t33Var, t33Var2, t33Var3, t33Var4, t33Var5, (yje) null));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(t33 t33Var, float f, zje zjeVar) {
        pcf pcfVar;
        if (zjeVar instanceof pcf) {
            pcfVar = (pcf) zjeVar;
            int i = pcfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcfVar.k = i - Integer.MIN_VALUE;
            } else {
                pcfVar = new pcf(this, zjeVar);
            }
        } else {
            pcfVar = new pcf(this, zjeVar);
        }
        pcf pcfVar2 = pcfVar;
        Object obj = pcfVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = pcfVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(f);
            uts0 uts0VarM0 = ro4.m0(800, 0, ihn.d, 2);
            pcfVar2.k = 1;
            if (t33.a(t33Var, f2, uts0VarM0, null, null, pcfVar2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(t33 t33Var, float f, zje zjeVar) {
        scf scfVar;
        if (zjeVar instanceof scf) {
            scfVar = (scf) zjeVar;
            int i = scfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                scfVar.k = i - Integer.MIN_VALUE;
            } else {
                scfVar = new scf(this, zjeVar);
            }
        } else {
            scfVar = new scf(this, zjeVar);
        }
        scf scfVar2 = scfVar;
        Object obj = scfVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = scfVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(f);
            uts0 uts0VarM0 = ro4.m0(Response.OK, 0, ihn.d, 2);
            scfVar2.k = 1;
            if (t33.a(t33Var, f2, uts0VarM0, null, null, scfVar2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(t33 t33Var, zje zjeVar) {
        ucf ucfVar;
        if (zjeVar instanceof ucf) {
            ucfVar = (ucf) zjeVar;
            int i = ucfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ucfVar.k = i - Integer.MIN_VALUE;
            } else {
                ucfVar = new ucf(this, zjeVar);
            }
        } else {
            ucfVar = new ucf(this, zjeVar);
        }
        ucf ucfVar2 = ucfVar;
        Object obj = ucfVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = ucfVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f = new Float(0.0f);
            uts0 uts0VarM0 = ro4.m0(800, 0, ihn.d, 2);
            ucfVar2.k = 1;
            if (t33.a(t33Var, f, uts0VarM0, null, null, ucfVar2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(t33 t33Var, zje zjeVar) {
        vcf vcfVar;
        if (zjeVar instanceof vcf) {
            vcfVar = (vcf) zjeVar;
            int i = vcfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vcfVar.k = i - Integer.MIN_VALUE;
            } else {
                vcfVar = new vcf(this, zjeVar);
            }
        } else {
            vcfVar = new vcf(this, zjeVar);
        }
        vcf vcfVar2 = vcfVar;
        Object obj = vcfVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = vcfVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f = new Float(15.0f);
            w7x w7xVarB0 = ro4.b0(ro4.m0(800, 0, ihn.d, 2), kkf0.b, 0L, 4);
            vcfVar2.k = 1;
            if (t33.a(t33Var, f, w7xVarB0, null, null, vcfVar2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(t33 t33Var, zje zjeVar) {
        wcf wcfVar;
        if (zjeVar instanceof wcf) {
            wcfVar = (wcf) zjeVar;
            int i = wcfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcfVar.k = i - Integer.MIN_VALUE;
            } else {
                wcfVar = new wcf(this, zjeVar);
            }
        } else {
            wcfVar = new wcf(this, zjeVar);
        }
        wcf wcfVar2 = wcfVar;
        Object obj = wcfVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = wcfVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f = new Float(-5.0f);
            w7x w7xVarB0 = ro4.b0(ro4.m0(800, 0, ihn.d, 2), kkf0.b, 0L, 4);
            wcfVar2.k = 1;
            if (t33.a(t33Var, f, w7xVarB0, null, null, wcfVar2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
