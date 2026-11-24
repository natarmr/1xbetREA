package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u57 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35081a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u57(omm ommVar, float f) {
        this.f35081a = (byte) 2;
        this.c = ommVar;
        this.b = f;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f35081a;
        float f = this.b;
        jm40 jm40Var = jm40.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                fqj0 fqj0Var = (fqj0) obj5;
                ((Integer) obj2).getClass();
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    float f2 = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarG = o7k0.g(o7k0.d(s5x0.K(jm40Var, f2, 4.0f), 1.0f), f, 0.0f, 2);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarG), fqj0Var));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fqj0 fqj0Var2 = (fqj0) obj5;
                ((Integer) obj2).getClass();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    zcl zclVar3 = qmk.f28987a;
                    p7x.h(o7k0.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), f), fqj0Var2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                omm ommVar = (omm) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA = w5d.a(new qw3(-30.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 6);
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
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    dub.a((uj60) ommVar.f25510a.get(iIntValue3), fetVar3, 0);
                    zcl zclVar4 = qmk.f28987a;
                    dub.M(s5x0.N(o7k0.d(o7k0.e(jm40Var, 320.0f), 1.0f), 0.0f, 32.0f, 0.0f, this.b, 5), (uj60) ommVar.f25510a.get(iIntValue3), fetVar3, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u57(float f, fqj0 fqj0Var, byte b) {
        this.f35081a = b;
        this.b = f;
        this.c = fqj0Var;
    }
}
