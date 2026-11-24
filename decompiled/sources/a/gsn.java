package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gsn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ y9q0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ g9q0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsn(w6k w6kVar, y9q0 y9q0Var, long j, g9q0 g9q0Var, String str, String str2, y9q0 y9q0Var2, lr8 lr8Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = w6kVar;
        this.j = y9q0Var;
        this.k = j;
        this.l = g9q0Var;
        this.m = str;
        this.n = str2;
        this.q = y9q0Var2;
        this.r = lr8Var;
        this.o = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                return new gsn(this.j, this.l, this.m, this.n, this.k, (agk0) obj4, this.o, (cgk0) obj2, (pz40) obj3, yjeVar);
            default:
                pz40 pz40Var = this.o;
                return new gsn((w6k) obj4, this.j, this.k, this.l, this.m, this.n, (y9q0) obj3, (lr8) obj2, pz40Var, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gsn) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        int iD0;
        float f;
        smk0 smk0Var;
        long j;
        byte b = this.i;
        float f2 = 1.0f;
        Object obj2 = this.q;
        Object obj3 = this.r;
        Object obj4 = this.p;
        long j2 = this.k;
        pz40 pz40Var = this.o;
        switch (b) {
            case 0:
                cgk0 cgk0Var = (cgk0) obj3;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                y9q0 y9q0VarA = this.j;
                while (true) {
                    float fL = ((agk0) obj4).l() - sj3.d0((int) (g9q0.a(this.l, this.m, y9q0VarA, 0, 0, 0L, null, 1020).c >> 32));
                    zcl zclVar = qmk.f28987a;
                    i = (int) (fL - 4.0f);
                    iD0 = sj3.d0((int) (g9q0.a(this.l, this.n, y9q0VarA, 2, 0, 0L, null, 1008).c >> 32));
                    if (iD0 > i) {
                        f = f2;
                        y9q0VarA = y9q0.a(y9q0VarA, 0L, idm0.v(daq0.c(y9q0VarA.f42262a.b) - f, 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                    } else {
                        f = f2;
                    }
                    smk0Var = y9q0VarA.f42262a;
                    if (iD0 > i) {
                        long j3 = smk0Var.b;
                        idm0.n(j3, j2);
                        if (Float.compare(daq0.c(j3), daq0.c(j2)) > 0) {
                            f2 = f;
                            obj2 = obj2;
                        }
                    }
                }
                if (iD0 > i) {
                    pz40Var.setValue(new j9q0(2));
                    cgk0Var.m(i);
                } else {
                    pz40Var.setValue(new j9q0(1));
                    cgk0Var.m(iD0);
                }
                ((pz40) obj2).setValue(new daq0(smk0Var.b));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                float fW0 = ((w6k) obj4).w0(((lr8) obj3).d());
                y9q0 y9q0Var = this.j;
                long jV = y9q0Var.f42262a.b;
                while (true) {
                    idm0.n(jV, j2);
                    if (Float.compare(daq0.c(jV), daq0.c(j2)) >= 0) {
                        long j4 = jV;
                        y9q0 y9q0Var2 = y9q0Var;
                        int i2 = (int) (g9q0.b(this.l, new j83(this.m), y9q0.a(y9q0Var, 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, false, 1, 0L, null, null, null, 2028).c >> 32);
                        j = j4;
                        if (i2 + ((int) (g9q0.b(this.l, new j83(this.n), y9q0.a((y9q0) obj2, 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, false, 1, 0L, null, null, null, 2028).c >> 32)) <= fW0) {
                            pz40Var.setValue(new daq0(j));
                        } else {
                            jV = idm0.v(daq0.c(j) - 1.0f, 4294967296L);
                            y9q0Var = y9q0Var2;
                        }
                    } else {
                        j = jV;
                    }
                }
                idm0.n(j, j2);
                if (Float.compare(daq0.c(j), daq0.c(j2)) < 0) {
                    pz40Var.setValue(new daq0(j2));
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsn(y9q0 y9q0Var, g9q0 g9q0Var, String str, String str2, long j, agk0 agk0Var, pz40 pz40Var, cgk0 cgk0Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = y9q0Var;
        this.l = g9q0Var;
        this.m = str;
        this.n = str2;
        this.k = j;
        this.p = agk0Var;
        this.o = pz40Var;
        this.r = cgk0Var;
        this.q = pz40Var2;
    }
}
