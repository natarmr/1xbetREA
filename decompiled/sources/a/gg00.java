package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gg00 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11230a;
    public final /* synthetic */ r020 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ gg00(r020 r020Var, mm40 mm40Var, boolean z, Function1 function1, byte b) {
        this.f11230a = b;
        this.b = r020Var;
        this.c = mm40Var;
        this.d = z;
        this.e = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f11230a;
        cl5 cl5Var = ukd.f35823a;
        mm40 mm40Var = this.c;
        r020 r020Var = this.b;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zx7 zx7Var = gqw0.e;
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fC = lr8Var.c();
                    boolean z = r020Var instanceof n020;
                    Function1 function1 = this.e;
                    if (z) {
                        fetVar.e0(758175689);
                        m020 m020Var = ((n020) r020Var).f22681a;
                        kkb.f(m020Var.d, m020Var.f, m020Var.g, m020Var.h, m020Var.i, m020Var.j, m020Var.k, m020Var.l, m020Var.e, this.d, function1, o7k0.d(mm40Var, 1.0f), fetVar, 0);
                        fetVar.r(false);
                    } else if (r020Var instanceof p020) {
                        fetVar.e0(855772090);
                        mm40 mm40VarB = lr8Var.b(jm40Var, zx7Var);
                        eb10 eb10Var = ((p020) r020Var).f26127a;
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new dg00(function1, (byte) 1);
                            fetVar.o0(objP);
                        }
                        r7x.b(mm40VarB, eb10Var, (Function0) objP, fetVar, 0);
                        fetVar.r(false);
                    } else if (r020Var instanceof o020) {
                        fetVar.e0(855783518);
                        q7x.d(lr8Var.b(jm40Var, zx7Var), ((o020) r020Var).f24401a, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (!(r020Var instanceof q020)) {
                            throw b1j.f(855738649, fetVar, false);
                        }
                        fetVar.e0(759709476);
                        s0x.t(iym0.r(fC), 48, fetVar, o7k0.d(jm40Var, 1.0f));
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                lr8 lr8Var2 = (lr8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zx7 zx7Var2 = gqw0.e;
                lr8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(lr8Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float fC2 = lr8Var2.c();
                    boolean z2 = r020Var instanceof n020;
                    Function1 function2 = this.e;
                    if (z2) {
                        fetVar2.e0(-537203905);
                        m020 m020Var2 = ((n020) r020Var).f22681a;
                        hkb.c(m020Var2.d, m020Var2.f, m020Var2.g, m020Var2.h, m020Var2.i, m020Var2.j, m020Var2.k, m020Var2.l, m020Var2.e, m020Var2.b, m020Var2.f20934a, this.d, function2, o7k0.d(mm40Var, 1.0f), fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        boolean z3 = r020Var instanceof p020;
                        if (!z3 && !(r020Var instanceof q020) && !(r020Var instanceof o020)) {
                            throw b1j.f(1368142495, fetVar2, false);
                        }
                        fetVar2.e0(-535955690);
                        long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarJ = lgb.J(i120.Q(mm40Var, background, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12));
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                        jr8 jr8Var = jr8.f16991a;
                        if (z3) {
                            fetVar2.e0(1259341313);
                            mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var2);
                            eb10 eb10Var2 = ((p020) r020Var).f26127a;
                            boolean zG2 = fetVar2.g(function2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new gno0(function2, (byte) 17);
                                fetVar2.o0(objP2);
                            }
                            r7x.b(mm40VarB2, eb10Var2, (Function0) objP2, fetVar2, 0);
                            fetVar2.r(false);
                        } else if (r020Var instanceof q020) {
                            fetVar2.e0(1259821844);
                            j0x.l(iym0.r(fC2), 48, fetVar2, o7k0.d(jm40Var, 1.0f));
                            fetVar2.r(false);
                        } else {
                            if (!(r020Var instanceof o020)) {
                                throw b1j.f(-236472666, fetVar2, false);
                            }
                            fetVar2.e0(1260218241);
                            q7x.d(jr8Var.b(jm40Var, zx7Var2), ((o020) r020Var).f24401a, fetVar2, 0);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}
