package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hpr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13455a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hpr(Object obj, Object obj2, Object obj3, byte b) {
        this.f13455a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0, types: [a.vzj0] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lov lovVar;
        Object obj3;
        Object obj4;
        rv60 rv60Var;
        byte b = this.f13455a;
        final byte b2 = 2;
        Object obj5 = null;
        boolean z = false;
        final byte b3 = 1;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                l9s l9sVar = (l9s) obj8;
                k9s k9sVar = (k9s) obj7;
                spr sprVar = (spr) obj6;
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                qnr qnrVarA = qnr.a(qnrVar, l9sVar.a(), l9sVar.i(), Long.valueOf(l9sVar.C()), l9sVar.e(), l9sVar.c(), 0L, null, null, l9sVar.N(), l9sVar.o(), l9sVar.w(), false, false, k9sVar != null ? k9sVar.W : false, false, l9sVar.s(), false, false, l9sVar.H(), k9sVar != null ? k9sVar.Z : null, false, false, false, false, false, false, false, false, false, null, l9sVar.r(), false, false, null, null, null, null, null, null, null, null, null, false, null, false, -6633504, 524285);
                vzg0 vzg0Var = sprVar.o;
                vzg0Var.e("KEY_GAME_ID", Long.valueOf(qnrVarA.f29044a));
                vzg0Var.e("KEY_CHAMP_ID", qnrVarA.h);
                vzg0Var.e("KEY_LIVE", Boolean.valueOf(qnrVarA.d));
                return qnrVarA;
            case 1:
                mm40 mm40Var = (mm40) obj8;
                l7m0 l7m0Var = (l7m0) obj7;
                Function2 function2 = (Function2) obj6;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarB = hp4.B(o7k0.d(mm40Var, 1.0f));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    zrr zrrVar = (zrr) l7m0Var.getValue();
                    if (Intrinsics.d(zrrVar, qrr.f29223a)) {
                        fetVar.e0(-929301099);
                        uzb.B(0, 1, fetVar, null);
                        fetVar.r(false);
                    } else if (zrrVar instanceof orr) {
                        fetVar.e0(-929299036);
                        wwb.o(0, fetVar, null, ((orr) zrrVar).f25748a);
                        fetVar.r(false);
                    } else {
                        boolean z2 = zrrVar instanceof trr;
                        jm40 jm40Var = jm40.b;
                        if (z2) {
                            fetVar.e0(-929296203);
                            final trr trrVar = (trr) zrrVar;
                            final byte b4 = z ? (byte) 1 : (byte) 0;
                            v3c.u(jm40Var, u1c.M(1976000498, new ydr() { // from class: a.brr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b5 = b4;
                                    trr trrVar2 = trrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b5) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, trrVar2.f34431a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                                int iHashCode2 = Long.hashCode(fetVar2.T);
                                                bh90 bh90VarM2 = fetVar2.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                                                mkd.c0.getClass();
                                                fetVar2.i0();
                                                if (fetVar2.S) {
                                                    fetVar2.l(e7z.u1);
                                                } else {
                                                    fetVar2.r0();
                                                }
                                                jpm0.o(fetVar2, x5dVarA, gqw0.x);
                                                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar2);
                                                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                                                wvb.y(null, trrVar2.e, fetVar2, 0, 1);
                                                mqr mqrVar = trrVar2.f;
                                                if (mqrVar == null) {
                                                    fetVar2.e0(-994453587);
                                                    fetVar2.r(false);
                                                } else {
                                                    fetVar2.e0(-994453586);
                                                    kr00.a(u1c.M(-220608936, new jar(mqrVar, (byte) 6), fetVar2), fetVar2, 6);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(true);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(1418016435, new ec30(trrVar, function2, (byte) 28), fetVar), u1c.M(860032372, new ydr() { // from class: a.brr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b5 = b3;
                                    trr trrVar2 = trrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b5) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, trrVar2.f34431a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                                int iHashCode2 = Long.hashCode(fetVar2.T);
                                                bh90 bh90VarM2 = fetVar2.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                                                mkd.c0.getClass();
                                                fetVar2.i0();
                                                if (fetVar2.S) {
                                                    fetVar2.l(e7z.u1);
                                                } else {
                                                    fetVar2.r0();
                                                }
                                                jpm0.o(fetVar2, x5dVarA, gqw0.x);
                                                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar2);
                                                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                                                wvb.y(null, trrVar2.e, fetVar2, 0, 1);
                                                mqr mqrVar = trrVar2.f;
                                                if (mqrVar == null) {
                                                    fetVar2.e0(-994453587);
                                                    fetVar2.r(false);
                                                } else {
                                                    fetVar2.e0(-994453586);
                                                    kr00.a(u1c.M(-220608936, new jar(mqrVar, (byte) 6), fetVar2), fetVar2, 6);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(true);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, 28032, 2);
                            fetVar.r(false);
                        } else if (zrrVar instanceof rrr) {
                            fetVar.e0(-929290040);
                            final rrr rrrVar = (rrr) zrrVar;
                            final byte b5 = z ? (byte) 1 : (byte) 0;
                            v3c.u(jm40Var, u1c.M(-1182303322, new ydr() { // from class: a.xqr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b6 = b5;
                                    final rrr rrrVar2 = rrrVar;
                                    boolean z3 = true;
                                    final byte b7 = 0;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b6) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, rrrVar2.f30997a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                mm40 mm40VarK0 = q8a.k0(mm40Var2, enx.b);
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarL = s5x0.L(mm40VarK0, 0.0f, 8.0f, 1);
                                                ugd ugdVarM = u1c.M(-94022307, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b8 = b7;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b8) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2);
                                                final byte b8 = z3 ? (byte) 1 : (byte) 0;
                                                final byte b9 = 2;
                                                vzb.n(mm40VarL, q3d.j(ugdVarM, u1c.M(-566019716, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b8;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2), u1c.M(-1038017125, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b9;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2)), fetVar2);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, rrrVar2.e, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(-1856370107, new ydr() { // from class: a.xqr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b6 = b3;
                                    final rrr rrrVar2 = rrrVar;
                                    boolean z3 = true;
                                    final byte b7 = 0;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b6) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, rrrVar2.f30997a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                mm40 mm40VarK0 = q8a.k0(mm40Var2, enx.b);
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarL = s5x0.L(mm40VarK0, 0.0f, 8.0f, 1);
                                                ugd ugdVarM = u1c.M(-94022307, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b7;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2);
                                                final byte b8 = z3 ? (byte) 1 : (byte) 0;
                                                final byte b9 = 2;
                                                vzb.n(mm40VarL, q3d.j(ugdVarM, u1c.M(-566019716, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b8;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2), u1c.M(-1038017125, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b9;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2)), fetVar2);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, rrrVar2.e, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(1764530404, new ydr() { // from class: a.xqr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b6 = b2;
                                    final rrr rrrVar2 = rrrVar;
                                    boolean z3 = true;
                                    final byte b7 = 0;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b6) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, rrrVar2.f30997a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                mm40 mm40VarK0 = q8a.k0(mm40Var2, enx.b);
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarL = s5x0.L(mm40VarK0, 0.0f, 8.0f, 1);
                                                ugd ugdVarM = u1c.M(-94022307, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b7;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2);
                                                final byte b8 = z3 ? (byte) 1 : (byte) 0;
                                                final byte b9 = 2;
                                                vzb.n(mm40VarL, q3d.j(ugdVarM, u1c.M(-566019716, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b8;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2), u1c.M(-1038017125, new xdr() { // from class: a.zqr
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b9;
                                                        rrr rrrVar3 = rrrVar2;
                                                        switch (b10) {
                                                            case 0:
                                                                mm40 mm40Var3 = (mm40) obj13;
                                                                fet fetVar3 = (fet) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    iIntValue2 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                    String str = rrrVar3.b;
                                                                    pz40 pz40Var = s6t0.f31722a;
                                                                    v8q0.a(str, mm40Var3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, (iIntValue2 << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar3.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                fet fetVar4 = (fet) obj14;
                                                                int iIntValue3 = ((Integer) obj15).intValue();
                                                                ((mm40) obj13).getClass();
                                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    zcl zclVar2 = qmk.f28987a;
                                                                    n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), rrrVar3.d, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), fetVar4, 0);
                                                                } else {
                                                                    fetVar4.X();
                                                                }
                                                                break;
                                                            default:
                                                                mm40 mm40Var4 = (mm40) obj13;
                                                                fet fetVar5 = (fet) obj14;
                                                                int iIntValue4 = ((Integer) obj15).intValue();
                                                                mm40Var4.getClass();
                                                                if ((iIntValue4 & 6) == 0) {
                                                                    iIntValue4 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                                                }
                                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                    int i = iIntValue4;
                                                                    String str2 = rrrVar3.c;
                                                                    pz40 pz40Var2 = s6t0.f31722a;
                                                                    v8q0.a(str2, mm40Var4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, (i << 3) & 112, 24960, 109560);
                                                                } else {
                                                                    fetVar5.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar2)), fetVar2);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, rrrVar2.e, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, 28032, 2);
                            fetVar.r(false);
                        } else if (zrrVar instanceof mrr) {
                            fetVar.e0(-929287061);
                            final mrr mrrVar = (mrr) zrrVar;
                            final byte b6 = z ? (byte) 1 : (byte) 0;
                            v3c.u(jm40Var, u1c.M(-1470378891, new ydr() { // from class: a.pqr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b7 = b6;
                                    mrr mrrVar2 = mrrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b7) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, mrrVar2.f22286a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, mrrVar2.d, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(-288146156, new ec30(mrrVar, function2, (byte) 26), fetVar), u1c.M(894086579, new ydr() { // from class: a.pqr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b7 = b3;
                                    mrr mrrVar2 = mrrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b7) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, mrrVar2.f22286a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, mrrVar2.d, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, 28032, 2);
                            fetVar.r(false);
                        } else if (zrrVar instanceof vrr) {
                            fetVar.e0(-929281175);
                            final vrr vrrVar = (vrr) zrrVar;
                            final byte b7 = z ? (byte) 1 : (byte) 0;
                            v3c.u(jm40Var, u1c.M(1216624293, new ydr() { // from class: a.grr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b8 = b7;
                                    vrr vrrVar2 = vrrVar;
                                    switch (b8) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj10;
                                            fet fetVar2 = (fet) obj11;
                                            int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, vrrVar2.f37915a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            mm40 mm40Var3 = (mm40) obj10;
                                            fet fetVar3 = (fet) obj11;
                                            int iD2 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar3.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var3, 0.0f, 8.0f, 1), 40.0f);
                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(e7z.u1);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                                                jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                                                String str = vrrVar2.b;
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 109562);
                                                fetVar3.r(true);
                                            } else {
                                                fetVar3.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj10;
                                            fet fetVar4 = (fet) obj11;
                                            int iD3 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var4);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar4.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar4.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                wvb.y(mm40Var4, vrrVar2.c, fetVar4, (iD3 >> 3) & 14, 0);
                                            } else {
                                                fetVar4.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(-788866586, new ydr() { // from class: a.grr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b8 = b3;
                                    vrr vrrVar2 = vrrVar;
                                    switch (b8) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj10;
                                            fet fetVar2 = (fet) obj11;
                                            int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, vrrVar2.f37915a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            mm40 mm40Var3 = (mm40) obj10;
                                            fet fetVar3 = (fet) obj11;
                                            int iD2 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar3.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var3, 0.0f, 8.0f, 1), 40.0f);
                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(e7z.u1);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                                                jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                                                String str = vrrVar2.b;
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 109562);
                                                fetVar3.r(true);
                                            } else {
                                                fetVar3.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj10;
                                            fet fetVar4 = (fet) obj11;
                                            int iD3 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var4);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar4.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar4.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                wvb.y(mm40Var4, vrrVar2.c, fetVar4, (iD3 >> 3) & 14, 0);
                                            } else {
                                                fetVar4.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(1500609831, new ydr() { // from class: a.grr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b8 = b2;
                                    vrr vrrVar2 = vrrVar;
                                    switch (b8) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj10;
                                            fet fetVar2 = (fet) obj11;
                                            int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, vrrVar2.f37915a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        case 1:
                                            mm40 mm40Var3 = (mm40) obj10;
                                            fet fetVar3 = (fet) obj11;
                                            int iD2 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar3.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var3, 0.0f, 8.0f, 1), 40.0f);
                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(e7z.u1);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                                                jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                                                String str = vrrVar2.b;
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 109562);
                                                fetVar3.r(true);
                                            } else {
                                                fetVar3.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj10;
                                            fet fetVar4 = (fet) obj11;
                                            int iD3 = dw9.d((Integer) obj12, (y5d) obj9, mm40Var4);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar4.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar4.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                wvb.y(mm40Var4, vrrVar2.c, fetVar4, (iD3 >> 3) & 14, 0);
                                            } else {
                                                fetVar4.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, 28032, 2);
                            fetVar.r(false);
                        } else {
                            if (!(zrrVar instanceof xrr)) {
                                throw b1j.f(-929302912, fetVar, false);
                            }
                            fetVar.e0(-929278033);
                            final xrr xrrVar = (xrr) zrrVar;
                            pz40 pz40VarF = androidx.compose.runtime.e.f(xrrVar.e.f15402a, fetVar);
                            final byte b8 = z ? (byte) 1 : (byte) 0;
                            v3c.u(jm40Var, u1c.M(-2085421477, new ydr() { // from class: a.irr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b9 = b8;
                                    xrr xrrVar2 = xrrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b9) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, xrrVar2.f41382a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, xrrVar2.d, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), u1c.M(450185948, new n82(xrrVar, pz40VarF, function2, (byte) 13), fetVar), u1c.M(-1309173923, new ydr() { // from class: a.irr
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    byte b9 = b3;
                                    xrr xrrVar2 = xrrVar;
                                    mm40 mm40Var2 = (mm40) obj10;
                                    fet fetVar2 = (fet) obj11;
                                    int iD = dw9.d((Integer) obj12, (y5d) obj9, mm40Var2);
                                    switch (b9) {
                                        case 0:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                dyb.x(mm40Var2, xrrVar2.f41382a, fetVar2, (iD >> 3) & 14);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                                wvb.y(mm40Var2, xrrVar2.d, fetVar2, (iD >> 3) & 14, 0);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, 28032, 2);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                fsr fsrVar = (fsr) obj8;
                irs irsVar = (irs) obj7;
                dja djaVar = (dja) obj6;
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                q7x.F(oyg0Var, irsVar, "KEY_CURRENT_TAB");
                q7x.F(oyg0Var, djaVar, "KEY_CURRENT_BROADCASTING_TYPE");
                return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, fsrVar, null, null, null, irsVar, djaVar, null, null, null, null, null, false, null, -1, 65339);
            case 3:
                ((Integer) obj2).getClass();
                bfb.v((mm40) obj8, (bms) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                j0g0 j0g0Var = (j0g0) obj6;
                wrs wrsVar = (wrs) obj2;
                e0g0 e0g0Var = j0g0.b;
                if (obj8 instanceof g0g0) {
                    obj8 = null;
                }
                List list = (List) obj8;
                if (list == null) {
                    list = wrsVar.h;
                }
                List list2 = list;
                if (obj7 instanceof g0g0) {
                    obj7 = null;
                }
                rsp rspVar = (rsp) obj7;
                if (rspVar == null) {
                    rspVar = wrsVar.j;
                }
                rsp rspVar2 = rspVar;
                if (j0g0Var != null) {
                    Object obj9 = j0g0Var.f15681a;
                    lovVar = (lov) (obj9 instanceof g0g0 ? null : obj9);
                    if (lovVar == null) {
                        lovVar = wrsVar.k;
                    }
                } else {
                    lovVar = wrsVar.k;
                }
                return wrs.a(wrsVar, null, null, null, null, null, null, list2, rspVar2, lovVar, null, null, false, false, false, null, false, 0L, 0L, 67106943);
            case 5:
                ((Integer) obj2).getClass();
                ((xak) obj8).o((mm40) obj7, (GameBroadcastingParams) obj6, (fet) obj, x8x.L(71));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                xbc.y((mm40) obj8, (dgt) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                qcc.t((mm40) obj8, (egt) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                vcc.o((mm40) obj8, (fgt) obj7, (Function1) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                d5c.q((mm40) obj8, (s8v) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((pz40) obj8).setValue((Integer) obj);
                ((pz40) obj7).setValue((Integer) obj2);
                ((pz40) obj6).setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                jcb.u((mm40) obj8, (ejv) obj7, (zx7) obj6, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 12:
                Function2 function3 = (Function2) obj7;
                w2d w2dVar = (w2d) obj6;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k("stickyContentId", (Function2) obj8);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                int iE = 0;
                while (true) {
                    int i = 1;
                    if (iE >= size) {
                        List listK2 = c5n0Var.k("collapsingContentId", function3);
                        ArrayList arrayList2 = new ArrayList(listK2.size());
                        int size2 = listK2.size();
                        int iE2 = 0;
                        while (iE2 < size2) {
                            int i2 = i;
                            iE2 = w6x.e((pj30) listK2.get(iE2), p4eVar.f26347a, arrayList2, iE2, i2);
                            i = i2;
                        }
                        int i3 = i;
                        if (arrayList.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            int i4 = ((pu90) obj3).b;
                            int size3 = arrayList.size() - i3;
                            if (i3 <= size3) {
                                int i5 = i3;
                                while (true) {
                                    Object obj10 = arrayList.get(i5);
                                    int i6 = ((pu90) obj10).b;
                                    if (i4 < i6) {
                                        obj3 = obj10;
                                        i4 = i6;
                                    }
                                    if (i5 != size3) {
                                        i5++;
                                    }
                                }
                            }
                        }
                        pu90 pu90Var = (pu90) obj3;
                        float fA = pu90Var != null ? pu90Var.b : 0.0f;
                        kie0 kie0Var = new kie0();
                        if (arrayList2.isEmpty() || arrayList.isEmpty()) {
                            w2dVar.f38442a.c(-1.0f);
                        } else {
                            if (arrayList2.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList2.get(0);
                                int i7 = ((pu90) obj4).b;
                                int size4 = arrayList2.size() - i3;
                                if (i3 <= size4) {
                                    int i8 = i3;
                                    while (true) {
                                        Object obj11 = arrayList2.get(i8);
                                        int i9 = ((pu90) obj11).b;
                                        if (i7 < i9) {
                                            i7 = i9;
                                            obj4 = obj11;
                                        }
                                        if (i8 != size4) {
                                            i8++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var2 = (pu90) obj4;
                            float f = pu90Var2 != null ? pu90Var2.b : 0.0f;
                            if (!arrayList.isEmpty()) {
                                obj5 = arrayList.get(0);
                                int i10 = ((pu90) obj5).b;
                                int size5 = arrayList.size() - i3;
                                if (i3 <= size5) {
                                    while (true) {
                                        Object obj12 = arrayList.get(i3);
                                        int i11 = ((pu90) obj12).b;
                                        if (i10 < i11) {
                                            obj5 = obj12;
                                            i10 = i11;
                                        }
                                        if (i3 != size5) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var3 = (pu90) obj5;
                            float f2 = pu90Var3 != null ? pu90Var3.b : 0.0f;
                            x2d x2dVar = w2dVar.f38442a;
                            x2dVar.c(-f);
                            float f3 = f2 + f;
                            fA = rw2.a(fA, f3, x2dVar.a(), f3);
                            kie0Var.f18333a = si30.b((((f2 - f) - f2) * x2dVar.a()) + f2);
                        }
                        int i12 = p4e.i(p4eVar.f26347a);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        int iB = si30.b(fA);
                        return vj30.x(c5n0Var, i12, iB >= 0 ? iB : 0, new gi0(arrayList2, arrayList, kie0Var, (byte) 2));
                    }
                    iE = w6x.e((pj30) listK.get(iE), p4eVar.f26347a, arrayList, iE, 1);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                mbc.y((mm40) obj8, (onw) obj7, (Function1) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                obc.z((mm40) obj8, (String) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                cp cpVar = (cp) obj8;
                x6f x6fVar = (x6f) obj7;
                x6f x6fVar2 = (x6f) obj6;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q7x.b((gyx) cpVar.u(), x6fVar, x6fVar2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                q7x.b((gyx) obj8, (x6f) obj7, (x6f) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                m8x.k((mm40) obj8, (in8) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                r8x.k((mm40) obj8, (t1y) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                e9x.b((mm40) obj8, (y5y) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                wdx.h((String) obj8, (buy) obj7, (ugd) obj6, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                tfx.a((mm40) obj8, (mvy) obj7, (xdr) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 22:
                cp cpVar2 = (cp) obj8;
                g9b0 g9b0Var = (g9b0) obj7;
                String str = (String) obj6;
                rvy rvyVar = (rvy) obj;
                String str2 = (String) obj2;
                rvyVar.getClass();
                for (Object obj13 : ((sv60) cpVar2.u()).b) {
                    if (((rv60) obj13).f31157a.f31193a == rvyVar.f31193a) {
                        obj5 = obj13;
                        rv60Var = (rv60) obj5;
                        if (rv60Var != null) {
                            mo60 mo60Var = rv60Var.b;
                            g9b0Var.D(str, mo60Var, "160291", str2);
                        }
                        return Unit.f46060a;
                    }
                }
                rv60Var = (rv60) obj5;
                if (rv60Var != null) {
                    mo60 mo60Var2 = rv60Var.b;
                    g9b0Var.D(str, mo60Var2, "160291", str2);
                }
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                ntr.D((mdm) obj8, (a4x) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                l7x.s((mm40) obj8, (ugd) obj7, (tj30) obj6, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lh80 lh80Var = (lh80) obj8;
                y3m0 y3m0Var = (y3m0) obj7;
                ow3 ow3Var = (ow3) obj6;
                w6k w6kVar = (w6k) obj;
                p4e p4eVar2 = (p4e) obj2;
                if (p4e.i(p4eVar2.f26347a) == Integer.MAX_VALUE) {
                    adx.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                k6z k6zVar = k6z.f17794a;
                int i13 = p4e.i(p4eVar2.f26347a) - w6kVar.T(s5x0.A(lh80Var, k6zVar) + s5x0.B(lh80Var, k6zVar));
                int[] iArrA = y3m0Var.a(i13, w6kVar.T(ow3Var.a()));
                int[] iArr = new int[iArrA.length];
                ow3Var.b(w6kVar, i13, iArrA, k6zVar, iArr);
                return new kez(iArr, iArrA);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lh80 lh80Var2 = (lh80) obj8;
                y3m0 y3m0Var2 = (y3m0) obj7;
                sw3 sw3Var = (sw3) obj6;
                w6k w6kVar2 = (w6k) obj;
                p4e p4eVar3 = (p4e) obj2;
                if (p4e.h(p4eVar3.f26347a) == Integer.MAX_VALUE) {
                    adx.a("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                }
                int iH = p4e.h(p4eVar3.f26347a) - w6kVar2.T(lh80Var2.e + lh80Var2.c);
                int[] iArrA2 = y3m0Var2.a(iH, w6kVar2.T(sw3Var.a()));
                int[] iArr2 = new int[iArrA2.length];
                sw3Var.c(w6kVar2, iH, iArrA2, iArr2);
                return new kez(iArr2, iArrA2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ufx.a((mm40) obj8, (m2h) obj7, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                s0x.b((kkz) obj8, (clz) obj7, (Function0) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                m2x.a((mm40) obj8, (anz) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hpr(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f13455a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
