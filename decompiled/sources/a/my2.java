package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class my2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22585a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ my2(a4x a4xVar, long j, dp20 dp20Var, int i) {
        this.f22585a = (byte) 10;
        this.c = a4xVar;
        this.b = j;
        this.d = dp20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22585a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        long j = this.b;
        pcy pcyVar = e7z.u1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                oy2.a((ye60) obj3, (mm40) obj4, this.b, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o2e.J((String) obj3, (String) obj4, this.b, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ieb.k(this.b, (shh) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ffb0.p(this.b, (y8m) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kbc.l((mm40) obj4, (wam) obj3, this.b, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                gkb.N((mm40) obj4, this.b, (n0x) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                mm40 mm40Var = (mm40) obj4;
                z9j z9jVar = (z9j) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = fetVar.f(j);
                    Object objP = fetVar.P();
                    if (zF || objP == cl5Var) {
                        objP = new dls((byte) 8, j);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK2 = s5x0.K(mm40VarK, 12.0f, 8.0f);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK2);
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
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String str = z9jVar.f44022a;
                    y9q0 y9q0VarA = g1t0.a();
                    pz40 pz40Var = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    v8q0.a(str, x7zVar, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarA, fetVar, 0, 24960, 109560);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    v8q0.a(z9jVar.b, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, 0, 24960, 109560);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 7:
                pz40 pz40Var2 = (pz40) obj3;
                pz40 pz40Var3 = (pz40) obj4;
                dpa0 dpa0Var = (dpa0) obj;
                ne60 ne60Var = (ne60) obj2;
                dpa0Var.getClass();
                dpa0Var.a();
                ne60 ne60Var2 = (ne60) pz40Var2.getValue();
                long jF = ne60.f(ne60Var2 != null ? ne60Var2.f23370a : p8a.X(j, ((qkx) pz40Var3.getValue()).f28908a), ne60Var.f23370a);
                long j2 = ((qkx) pz40Var3.getValue()).f28908a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
                int i = ((int) (j >> 32)) - ((int) (j2 >> 32));
                if (i < 0) {
                    i = 0;
                }
                int i2 = ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
                pz40Var2.setValue(new ne60((((long) Float.floatToRawIntBits(l1e0.c(fIntBitsToFloat, 0.0f, i))) << 32) | (((long) Float.floatToRawIntBits(l1e0.c(Float.intBitsToFloat((int) (jF & 4294967295L)), 0.0f, i2 >= 0 ? i2 : 0))) & 4294967295L)));
                break;
            case 8:
                ((Integer) obj2).getClass();
                tfx.c((mm40) obj4, (h2h) obj3, this.b, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vbw0.f((mm40) obj4, (nui0) obj3, this.b, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                r3m0.i((a4x) obj3, this.b, (dp20) obj4, (fet) obj, x8x.L(1));
                break;
            case 11:
                String str2 = (String) obj3;
                ux3 ux3Var = (ux3) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j5n0.d(o7k0.d(jm40Var, 1.0f), str2, ux3Var, this.b, fetVar2, 6, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 12:
                String str3 = (String) obj3;
                vx3 vx3Var = (vx3) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    k5n0.a(o7k0.d(jm40Var, 1.0f), str3, vx3Var, this.b, fetVar3, 6, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 13:
                pl7 pl7Var = (pl7) obj3;
                Function1 function1 = (Function1) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF2 = fetVar4.f(j);
                    Object objP2 = fetVar4.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new r2a0((byte) 15, j);
                        fetVar4.o0(objP2);
                    }
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarK3 = rq8.K(jm40Var2, (Function1) objP2);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarK3);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var2, qmk.a(fetVar4).d, 0.0f, qmk.a(fetVar4).d, 12.0f, 2), 1.0f);
                    on5 on5VarB = pl7Var.b();
                    boolean zG = fetVar4.g(function1);
                    Object objP3 = fetVar4.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new gno0(function1, (byte) 13);
                        fetVar4.o0(objP3);
                    }
                    ffb0.c(mm40VarD, on5VarB, (Function0) objP3, fetVar4, 0);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                mm40 mm40Var2 = (mm40) obj4;
                gmk gmkVar = (gmk) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, mm40Var2);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, gqw0.v);
                    x7z x7zVar2 = new x7z(1.0f, false);
                    String value = gmkVar.getValue();
                    y9q0 y9q0VarD = g1t0.d();
                    long j3 = this.b;
                    v8q0.a(value, x7zVar2, j3, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar5, 0, 24960, 110584);
                    zcl zclVar3 = qmk.f28987a;
                    v8q0.a(gmkVar.a(), s5x0.N(jm40.b, 2.0f, 0.0f, 0.0f, 0.0f, 14), j3, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar5, 0, 24576, 114680);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ my2(long j, Object obj, Function1 function1, int i, byte b) {
        this.f22585a = b;
        this.b = j;
        this.c = obj;
        this.d = function1;
    }

    public /* synthetic */ my2(byte b, int i, long j, mm40 mm40Var, Object obj) {
        this.f22585a = b;
        this.d = mm40Var;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ my2(mm40 mm40Var, long j, z9j z9jVar) {
        this.f22585a = (byte) 6;
        this.d = mm40Var;
        this.b = j;
        this.c = z9jVar;
    }

    public /* synthetic */ my2(mm40 mm40Var, long j, n0x n0xVar, int i) {
        this.f22585a = (byte) 5;
        this.d = mm40Var;
        this.b = j;
        this.c = n0xVar;
    }

    public /* synthetic */ my2(mm40 mm40Var, gmk gmkVar, long j) {
        this.f22585a = (byte) 14;
        this.d = mm40Var;
        this.c = gmkVar;
        this.b = j;
    }

    public /* synthetic */ my2(Object obj, long j, Object obj2, byte b) {
        this.f22585a = b;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ my2(Object obj, Object obj2, long j, int i, byte b) {
        this.f22585a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    public /* synthetic */ my2(String str, Enum r2, long j, byte b) {
        this.f22585a = b;
        this.c = str;
        this.d = r2;
        this.b = j;
    }
}
