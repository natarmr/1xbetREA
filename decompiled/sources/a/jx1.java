package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jx1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17279a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jx1(mm40 mm40Var, Function0 function0, ee eeVar, long j, sd sdVar, rd rdVar) {
        this.f17279a = (byte) 1;
        this.d = mm40Var;
        this.b = function0;
        this.e = eeVar;
        this.c = j;
        this.f = sdVar;
        this.g = rdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long textPrimary;
        long textPrimary2;
        byte b = this.f17279a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kx1.b((String) obj7, (String) obj6, (String) obj5, (String) obj4, this.c, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj7;
                Function0 function0 = (Function0) obj3;
                ee eeVar = (ee) obj6;
                sd sdVar = (sd) obj5;
                rd rdVar = (rd) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(phu0.F(o7k0.A(o7k0.e(mm40Var, 44.0f), null, 3), null, null, false, null, function0, fetVar, 24960, 5), "DS_ACCOUNT_CONTROL");
                    tj30 tj30VarC = zq8.c(gqw0.d, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (eeVar != null) {
                        boolean z2 = eeVar instanceof yd;
                        long j = this.c;
                        if (z2) {
                            fetVar.e0(960429426);
                            jcb.A(j, sdVar, rdVar, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z = false;
                            if (eeVar instanceof be) {
                                fetVar.e0(960436020);
                                jcb.D(j, sdVar, rdVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (eeVar instanceof de) {
                                fetVar.e0(960442589);
                                jcb.F(sdVar, rdVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (eeVar instanceof zd) {
                                fetVar.e0(960447573);
                                jcb.B(j, sdVar, rdVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (eeVar instanceof ae) {
                                fetVar.e0(960454194);
                                jcb.C(j, sdVar, rdVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (eeVar instanceof ce) {
                                fetVar.e0(960460634);
                                jcb.E(sdVar, rdVar, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                    } else {
                        z = false;
                    }
                    throw b1j.f(960428346, fetVar, z);
                }
                fetVar.X();
                return Unit.f46060a;
            case 2:
                mm40 mm40Var2 = (mm40) obj7;
                sd sdVar2 = (sd) obj6;
                y9q0 y9q0Var = (y9q0) obj5;
                y3d y3dVar = (y3d) obj4;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE1 = o2e.e0(dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 2.0f, 0.0f, 10), false).e(new ecu0(yx7Var)), "ACCOUNT_AMOUNT");
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new wil(pz40Var, (byte) 0);
                        fetVar2.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP);
                    String str = sdVar2.f32009a;
                    if (y3dVar == null) {
                        fetVar2.e0(-1001236074);
                        textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1001237035);
                        fetVar2.r(false);
                        textPrimary = y3dVar.f41946a;
                    }
                    long j2 = this.c;
                    y9q0 y9q0VarA = y9q0.a(y9q0Var, textPrimary, j2, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777212);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new wil(pz40Var, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    aad.e(str, mm40VarA, y9q0VarA, (Function1) objP2, 2, false, 1, 0, null, null, fetVar2, 1600512, 928);
                    mm40 mm40VarE2 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), "ACCOUNT_CURRENCY");
                    String str2 = sdVar2.b;
                    if (y3dVar == null) {
                        fetVar2.e0(-1001215370);
                        textPrimary2 = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1001216331);
                        fetVar2.r(false);
                        textPrimary2 = y3dVar.f41946a;
                    }
                    aad.e(str2, mm40VarE2, y9q0.a(y9q0Var, textPrimary2, j2, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777212), null, 0, false, 1, 0, null, null, fetVar2, 1572864, 952);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                t33 t33Var = (t33) obj7;
                t33 t33Var2 = (t33) obj6;
                j43 j43Var = (j43) obj5;
                y9q0 y9q0Var2 = (y9q0) obj4;
                t33 t33Var3 = (t33) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objP3 = fetVar3.P();
                    if (objP3 == cl5Var) {
                        objP3 = new n53(t33Var3, (byte) 2);
                        fetVar3.o0(objP3);
                    }
                    n4d n4dVar = (n4d) objP3;
                    boolean zI = fetVar3.i(t33Var) | fetVar3.i(t33Var2);
                    Object objP4 = fetVar3.P();
                    if (zI || objP4 == cl5Var) {
                        objP4 = new o5m0(t33Var, t33Var2, (byte) 1);
                        fetVar3.o0(objP4);
                    }
                    aad.e(j43Var.f15865a, o2e.e0(i4w0.T(jm40.b, (Function1) objP4), "EVENT_COEFFICIENT"), y9q0.a(y9q0Var2, 0L, this.c, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711677), null, 0, false, 0, 0, n4dVar, null, fetVar3, 0, 760);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ jx1(byte b, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f17279a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = j;
        this.b = obj5;
    }

    public /* synthetic */ jx1(String str, String str2, String str3, String str4, long j, Function0 function0, int i) {
        this.f17279a = (byte) 0;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.c = j;
        this.b = function0;
    }
}
