package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pk7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27121a = 1;
    public final /* synthetic */ w2d b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ l7m0 h;

    public /* synthetic */ pk7(w2d w2dVar, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, Function1 function1, l7m0 l7m0Var5) {
        this.b = w2dVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
        this.f = l7m0Var4;
        this.g = function1;
        this.h = l7m0Var5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27121a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.h;
        Function1 function1 = this.g;
        l7m0 l7m0Var2 = this.f;
        l7m0 l7m0Var3 = this.e;
        l7m0 l7m0Var4 = this.d;
        l7m0 l7m0Var5 = this.c;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    agc.y(null, this.b, u1c.M(1650839294, new ay(l7m0Var5, l7m0Var4, l7m0Var3, b3), fetVar), u1c.M(-764601379, new lk7(function1, l7m0Var2, l7m0Var), fetVar), fetVar, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    agc.y(null, this.b, u1c.M(-1629505847, new ay(l7m0Var5, l7m0Var4, l7m0Var3, b2), fetVar2), u1c.M(-1144869016, new lk7(l7m0Var2, function1, l7m0Var), fetVar2), fetVar2, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pk7(w2d w2dVar, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, Function1 function1, l7m0 l7m0Var4, l7m0 l7m0Var5) {
        this.b = w2dVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
        this.g = function1;
        this.f = l7m0Var4;
        this.h = l7m0Var5;
    }
}
