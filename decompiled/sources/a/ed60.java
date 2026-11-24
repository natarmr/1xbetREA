package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ed60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public int j;
    public byte k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed60(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ed60((rrd) this.m, this.l, yjeVar, (byte) 0);
            default:
                return new ed60((rrd) this.m, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.i) {
            case 0:
                return ((ed60) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ed60) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objI;
        int i;
        Object objQ;
        Object objP;
        Object objI2;
        int i2;
        Object objQ2;
        Object objW;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                rrd rrdVar = (rrd) obj2;
                wne wneVar = wne.f39444a;
                byte b2 = this.k;
                if (b2 == 0) {
                    z1x.P(obj);
                    ieu ieuVar = (ieu) rrdVar.g;
                    this.k = (byte) 1;
                    objI = ieuVar.i(this);
                    if (objI != wneVar) {
                    }
                    return wneVar;
                }
                if (b2 == 1) {
                    z1x.P(obj);
                    objI = obj;
                } else {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            z1x.P(obj);
                            return obj;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.j;
                    z1x.P(obj);
                    objQ = obj;
                }
                c3c0 c3c0Var = (c3c0) objQ;
                boolean z = c3c0Var.b;
                long j = c3c0Var.c;
                jvn jvnVarB = ((xyt) rrdVar.f).f41721a.b();
                edu eduVar = (edu) rrdVar.b;
                this.j = i;
                this.k = (byte) 3;
                objP = eduVar.p(z, j, this.l, jvnVarB, this);
                if (objP != wneVar) {
                    return objP;
                }
                return wneVar;
                i = ((elt) objI).e;
                this.j = i;
                this.k = (byte) 2;
                objQ = rrdVar.q(i, this);
                if (objQ != wneVar) {
                    c3c0 c3c0Var2 = (c3c0) objQ;
                    boolean z2 = c3c0Var2.b;
                    long j2 = c3c0Var2.c;
                    jvn jvnVarB2 = ((xyt) rrdVar.f).f41721a.b();
                    edu eduVar2 = (edu) rrdVar.b;
                    this.j = i;
                    this.k = (byte) 3;
                    objP = eduVar2.p(z2, j2, this.l, jvnVarB2, this);
                    if (objP != wneVar) {
                        return objP;
                    }
                }
                return wneVar;
            default:
                rrd rrdVar2 = (rrd) obj2;
                wne wneVar2 = wne.f39444a;
                byte b3 = this.k;
                if (b3 == 0) {
                    z1x.P(obj);
                    ieu ieuVar2 = (ieu) rrdVar2.g;
                    this.k = (byte) 1;
                    objI2 = ieuVar2.i(this);
                    if (objI2 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    z1x.P(obj);
                    objI2 = obj;
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            z1x.P(obj);
                            return obj;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.j;
                    z1x.P(obj);
                    objQ2 = obj;
                }
                c3c0 c3c0Var3 = (c3c0) objQ2;
                boolean z3 = c3c0Var3.b;
                long j3 = c3c0Var3.c;
                jvn jvnVarB3 = ((xyt) rrdVar2.f).f41721a.b();
                u8u u8uVar = (u8u) rrdVar2.b;
                this.j = i2;
                this.k = (byte) 3;
                objW = u8uVar.w(z3, j3, this.l, jvnVarB3, this);
                if (objW != wneVar2) {
                    return objW;
                }
                return wneVar2;
                i2 = ((elt) objI2).e;
                this.j = i2;
                this.k = (byte) 2;
                objQ2 = rrdVar2.q(i2, this);
                if (objQ2 != wneVar2) {
                    c3c0 c3c0Var4 = (c3c0) objQ2;
                    boolean z4 = c3c0Var4.b;
                    long j4 = c3c0Var4.c;
                    jvn jvnVarB4 = ((xyt) rrdVar2.f).f41721a.b();
                    u8u u8uVar2 = (u8u) rrdVar2.b;
                    this.j = i2;
                    this.k = (byte) 3;
                    objW = u8uVar2.w(z4, j4, this.l, jvnVarB4, this);
                    if (objW != wneVar2) {
                        return objW;
                    }
                }
                return wneVar2;
        }
    }
}
