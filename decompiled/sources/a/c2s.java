package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c2s implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3640a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ c2s(l7m0 l7m0Var, l7m0 l7m0Var2, byte b) {
        this.f3640a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f3640a;
        pcy pcyVar = e7z.u1;
        l7m0 l7m0Var = this.c;
        l7m0 l7m0Var2 = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xak xakVar = j2s.b2;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    obc.d(kr00.f18743a.a(l7m0Var2.getValue()), u1c.M(-1770062347, new e2s(mm40Var, l7m0Var, objArr == true ? 1 : 0), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(jm40Var, 52.0f);
                    CharSequence charSequence = (CharSequence) l7m0Var2.getValue();
                    if (charSequence.length() == 0) {
                        charSequence = "-";
                    }
                    String str = (String) charSequence;
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str, mm40VarS, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.x(), fetVar2, 0, 24960, 109560);
                    jcb.H(o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 24.0f), 1.0f, s6t0.b().f33626a.getSeparator(), fetVar2, 0, 0);
                    mm40 mm40VarS2 = o7k0.s(jm40Var, 52.0f);
                    CharSequence charSequence2 = (CharSequence) l7m0Var.getValue();
                    v8q0.a((String) (charSequence2.length() != 0 ? charSequence2 : "-"), mm40VarS2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.x(), fetVar2, 0, 24960, 109560);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    Object[] objArr2 = new Object[0];
                    boolean zG = fetVar3.g(l7m0Var2);
                    Object objP = fetVar3.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new ybt0(l7m0Var2, (byte) 4);
                        fetVar3.o0(objP);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr2, (Function0) objP, fetVar3);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var2, true);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarA, 12.0f, 0.0f, 4.0f, 0.0f, 10);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 2.0f, 7);
                    String str2 = (String) l7m0Var.getValue();
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str2, mm40VarN2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, ((Number) l7m0VarY.getValue()).intValue(), 0, null, g1t0.k(), fetVar3, 0, 384, 110584);
                    if (((CharSequence) l7m0Var2.getValue()).length() > 0) {
                        fetVar3.e0(-964415469);
                        v8q0.a((String) l7m0Var2.getValue(), null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar3, 0, 24960, 110586);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-964121806);
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
