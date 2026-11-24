package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mxn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22564a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mxn(t33 t33Var, y9q0 y9q0Var, long j, long j2, String str) {
        this.d = t33Var;
        this.e = y9q0Var;
        this.b = j;
        this.c = j2;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22564a;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                t33 t33Var = (t33) obj5;
                y9q0 y9q0Var = (y9q0) obj4;
                String str = (String) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = fetVar.i(t33Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new m53(t33Var, (byte) 13);
                        fetVar.o0(objP);
                    }
                    aad.e(str, i4w0.T(jm40Var, (Function1) objP), y9q0.a(y9q0Var, this.b, this.c, null, null, null, 0L, null, k5q0.d, 0, 1, 0L, null, null, 16707580), null, 0, false, 0, 0, null, null, fetVar, 0, 1016);
                } else {
                    fetVar.X();
                }
                break;
            default:
                w2d w2dVar = (w2d) obj5;
                pl7 pl7Var = (pl7) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    agc.y(null, w2dVar, u1c.M(-782074275, new my2(pl7Var, this.b, function1, (byte) 13), fetVar2), u1c.M(789160508, new mvg0(w2dVar, pl7Var, function1, this.c, (byte) 2), fetVar2), fetVar2, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mxn(w2d w2dVar, long j, pl7 pl7Var, Function1 function1, long j2) {
        this.d = w2dVar;
        this.b = j;
        this.e = pl7Var;
        this.f = function1;
        this.c = j2;
    }
}
