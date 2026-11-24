package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qp8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29103a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public qp8(ugd ugdVar, float f) {
        this.f29103a = (byte) 0;
        this.c = ugdVar;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29103a;
        Object obj3 = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((ugd) obj3).F(s5x0.u(0.0f, 0.0f, 0.0f, f, 7), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarA = o7k0.a(jm40.b, f, 56.0f);
                    ugd ugdVar = (ugd) obj3;
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iX = e3c.x(fetVar2);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar2, iX, shdVar);
                    }
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    twn.v(0, ugdVar, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    feb.x(null, f, (djv) obj3, fetVar3, 48);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qp8(float f, Object obj, byte b) {
        this.f29103a = b;
        this.b = f;
        this.c = obj;
    }
}
