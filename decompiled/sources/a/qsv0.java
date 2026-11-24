package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qsv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29272a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ fuj0 c;
    public final /* synthetic */ w6k d;
    public final /* synthetic */ ugd e;

    public /* synthetic */ qsv0(l7m0 l7m0Var, fuj0 fuj0Var, w6k w6kVar, ugd ugdVar, byte b) {
        this.f29272a = b;
        this.b = l7m0Var;
        this.c = fuj0Var;
        this.d = w6kVar;
        this.e = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29272a;
        ugd ugdVar = this.e;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qsm0.q(null, tsv0.d, this.b, this.c, this.d, u1c.M(137772958, new kqj0(ugdVar, (byte) 6), fetVar), fetVar, 196656, 1);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qsm0.q(null, tsv0.b, this.b, this.c, this.d, u1c.M(1053760059, new kqj0(ugdVar, (byte) 7), fetVar2), fetVar2, 196656, 1);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    qsm0.q(null, tsv0.b, this.b, this.c, this.d, u1c.M(1743724903, new kqj0(ugdVar, (byte) 5), fetVar3), fetVar3, 196656, 1);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
