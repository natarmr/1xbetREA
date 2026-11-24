package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w13 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38379a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w13(long j, boolean z, mm40 mm40Var, ye60 ye60Var) {
        this.b = j;
        this.c = z;
        this.d = mm40Var;
        this.e = ye60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        byte b = this.f38379a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        final byte b2 = 0;
        Object obj3 = this.e;
        Object obj4 = this.d;
        final byte b3 = 1;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj4;
                final ye60 ye60Var = (ye60) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = this.b;
                    boolean z = this.c;
                    if (j != 9205357640488583168L) {
                        fetVar.e0(3458246);
                        lw3 lw3Var = z ? rq8.b : rq8.f30919a;
                        mm40 mm40VarK = o7k0.k(mm40Var, bdl.b(j), bdl.a(j), 0.0f, 0.0f, 12);
                        thg0 thg0VarA = shg0.a(lw3Var, gqw0.j, fetVar, 0);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        boolean zI = fetVar.i(ye60Var);
                        Object objP = fetVar.P();
                        if (zI || objP == cl5Var) {
                            objP = new Function0() { // from class: a.x13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b4 = b2;
                                    ye60 ye60Var2 = ye60Var;
                                    switch (b4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & ye60Var2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & ye60Var2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            fetVar.o0(objP);
                        }
                        eeq.F(6, fetVar, jm40Var, (Function0) objP, z);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(4389176);
                        boolean zI2 = fetVar.i(ye60Var);
                        Object objP2 = fetVar.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new Function0() { // from class: a.x13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b4 = b3;
                                    ye60 ye60Var2 = ye60Var;
                                    switch (b4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & ye60Var2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & ye60Var2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            fetVar.o0(objP2);
                        }
                        eeq.F(0, fetVar, mm40Var, (Function0) objP2, z);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                Function1 function1 = (Function1) obj4;
                uzl uzlVar = (uzl) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 20.0f), 24.0f);
                    ykw ykwVar = rlx.f30719a;
                    mm40 mm40VarJ = lgb.J(mm40VarE.e(tg40.b), vgg0.a(8.0f));
                    zfn zfnVar = zaq0.b;
                    mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
                    boolean zG = fetVar2.g(function1);
                    long j2 = this.b;
                    boolean zF = zG | fetVar2.f(j2);
                    boolean z2 = this.c;
                    boolean zH = zF | fetVar2.h(z2) | fetVar2.e(uzlVar.ordinal());
                    Object objP3 = fetVar2.P();
                    if (zH || objP3 == cl5Var) {
                        objP3 = new gr((byte) 1, j2, function1, uzlVar, z2);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP3, 28);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    int iOrdinal = uzlVar.ordinal();
                    if (iOrdinal == 0) {
                        i = R.drawable.ic_glyph_favourite_active;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        i = R.drawable.ic_glyph_favourite_inactive;
                    }
                    dww.c(a8k0.F(i, 0, fetVar2), null, o7k0.n(jm40Var, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                x4d0.B((ibm) obj4, this.c, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                qcc.D(this.c, (g8k0) obj4, (g8k0) obj3, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ w13(ibm ibmVar, boolean z, long j, Function1 function1, int i) {
        this.d = ibmVar;
        this.c = z;
        this.b = j;
        this.e = function1;
    }

    public /* synthetic */ w13(Function1 function1, long j, boolean z, uzl uzlVar) {
        this.d = function1;
        this.b = j;
        this.c = z;
        this.e = uzlVar;
    }

    public /* synthetic */ w13(boolean z, g8k0 g8k0Var, g8k0 g8k0Var2, long j, int i) {
        this.c = z;
        this.d = g8k0Var;
        this.e = g8k0Var2;
        this.b = j;
    }
}
