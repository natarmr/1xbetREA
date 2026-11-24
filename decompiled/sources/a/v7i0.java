package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v7i0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36926a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ v7i0(l7m0 l7m0Var, byte b) {
        this.f36926a = b;
        this.b = l7m0Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            nnw0.k(hh80Var, this.b, fetVar, iIntValue & 14);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xak xakVar = gxk.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vdb.t(((oxk) this.b.getValue()).f26016a, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        vj30 vj30Var = (vj30) obj;
        pj30 pj30Var = (pj30) obj2;
        vj30Var.getClass();
        pj30Var.getClass();
        pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new dpl((Object) pu90VarS, (Object) this.b, (byte) 22));
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        y5d y5dVar = (y5d) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nek nekVar = vbn.n2;
        y5dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40.b, 1.0f), gqw0.n);
            zcl zclVar = qmk.f28987a;
            wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((zbn) this.b.getValue()).f44123a, 0L, 0, 0L, fetVar, 0, 28);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ddk ddkVar = dnr.c2;
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            ulb.o(iIntValue & 14, fetVar, (a4x) this.b.getValue(), mm40Var);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xak xakVar = j2s.b2;
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            kpb.m(iIntValue & 14, fetVar, (a4x) this.b.getValue(), mm40Var);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        j83 j83Var;
        y9q0 y9q0VarT;
        byte b = this.f36926a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 16;
        l7m0 l7m0Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var), xfn.a(fetVar).d, 0.0f, 2);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean zG = fetVar.g(l7m0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ufp(l7m0Var, (byte) 23);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarL, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(s5x0.I(o7k0.c, hh80Var2), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                    pm80 pm80VarF = a8k0.F(R.drawable.end_session_light, 0, fetVar2);
                    pge pgeVar = gqw0.B;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    j0x.b(pm80VarF, null, s5x0.N(mm40VarD, 0.0f, 80.0f, 0.0f, 0.0f, 13), null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
                    v8q0.a(xsm0.s(R.string.end_session_title, fetVar2), s5x0.N(jm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, null, qmk.v, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.t(g1t0.j(), fetVar2), fetVar2, 0, 0, 130028);
                    v8q0.a(((iiq0) l7m0Var.getValue()).f14840a, s5x0.J(jm40Var2, 16.0f), 0L, null, qmk.s, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar2, 0, 0, 130028);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                y5d y5dVar = (y5d) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gfk0 gfk0Var = uu0.o2;
                y5dVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y5dVar) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar3 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 24.0f, 5), ((xu0) l7m0Var.getValue()).f41488a, 0L, 0, 0L, fetVar3, 0, 28);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                hfk0 hfk0Var = kv0.n2;
                y5dVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar4 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((nv0) l7m0Var.getValue()).f24169a, 0L, 0, 0L, fetVar4, 0, 28);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                gfk0 gfk0Var2 = ae1.n2;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar5, 0, 5);
                    wwb.i(null, ((yec0) l7m0Var.getValue()).b, 0L, 0, 0L, fetVar5, 0, 29);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                gfk0 gfk0Var3 = ae1.n2;
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar6, 0, 3);
                    zcl zclVar6 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar6, 0, 5);
                    mm40 mm40VarL2 = s5x0.L(cjx.V(o7k0.d(jm40Var, 1.0f), a8k0.G(xczVarA, fetVar6), null), 16.0f, 0.0f, 2);
                    xx7 xx7Var = gqw0.n;
                    qw3 qw3Var = new qw3(20.0f, true, new jf4((byte) 14));
                    boolean zG2 = fetVar6.g(l7m0Var);
                    Object objP2 = fetVar6.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new yd1(l7m0Var, z ? (byte) 1 : (byte) 0);
                        fetVar6.o0(objP2);
                    }
                    b8k0.e(mm40VarL2, xczVarA, null, qw3Var, xx7Var, null, false, null, (Function1) objP2, fetVar6, 196608, 460);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                gfk0 gfk0Var4 = cl1.o2;
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    kkb.m(o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f), ((el1) l7m0Var.getValue()).b, null, 5, ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary(), 0L, fetVar7, 0, 36);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                gfk0 gfk0Var5 = cl1.o2;
                ((y5d) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    o0x o0xVar = ((el1) l7m0Var.getValue()).c;
                    y3d y3dVar = new y3d(((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundLight60());
                    zcl zclVar8 = qmk.f28987a;
                    lc00VarB.add(new pr5(o0xVar, y3dVar, new ds5(220.0f), Integer.valueOf(R.drawable.onboarding_placeholder)));
                    zjb.h(null, dyb.o0(kotlin.collections.a.a(lc00VarB)), false, 0L, 0L, null, fetVar8, 0, 61);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                mm40 mm40Var = (mm40) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                qek0 qek0Var = ze4.g2;
                mm40Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(mm40Var) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    lv00.l(iIntValue9 & 14, fetVar9, mm40Var, l7m0Var);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(hh80Var3) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    if (((ek60) l7m0Var.getValue()).f7939a) {
                        fetVar10.e0(-133180725);
                        fetVar10.r(false);
                    } else {
                        fetVar10.e0(-134935511);
                        cjx.J(hh80Var3, u1c.M(-2021727017, new v7i0(l7m0Var, (byte) 10), fetVar10), fetVar10, (iIntValue10 & 14) | 48);
                        fetVar10.r(false);
                    }
                    ((ek60) l7m0Var.getValue()).getClass();
                    rsr0.I(0, fetVar10, s5x0.I(jm40Var, hh80Var3), false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    for (sj60 sj60Var : ((ek60) l7m0Var.getValue()).c) {
                        if (sj60Var != null) {
                            boolean z2 = sj60Var instanceof qj60;
                            jm40 jm40Var3 = jm40.b;
                            if (z2) {
                                fetVar11.e0(-1827788718);
                                k1x k1xVar = new k1x((Context) fetVar11.k(dy2.b));
                                StringBuilder sb = new StringBuilder(ujn.h);
                                qj60 qj60Var = (qj60) sj60Var;
                                String str = qj60Var.f28821a;
                                if (str.length() == 0) {
                                    sb.setLength(0);
                                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                                    sb.setLength(0);
                                    sb.append(str);
                                } else {
                                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, '/'));
                                }
                                k1xVar.c = sb.toString();
                                t1x.a(k1xVar, false);
                                k7x.a(k1xVar.a(), null, y5dVar3.a(s5x0.N(jm40Var3, 0.0f, 16.0f, 0.0f, qj60Var.b, 5), gqw0.n), null, null, fetVar11, 48, 2040);
                                fetVar11.r(false);
                            } else if (sj60Var instanceof rj60) {
                                fetVar11.e0(-826216658);
                                rj60 rj60Var = (rj60) sj60Var;
                                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, rj60Var.b, 0.0f, rj60Var.c, 5);
                                boolean z3 = rj60Var.e;
                                String str2 = rj60Var.f30577a;
                                if (z3) {
                                    eo80 eo80Var = new eo80(0, new g8q0(idm0.t(12), 1), Response.SERVICE_UNAVAILABLE);
                                    h83 h83Var = new h83();
                                    int iF = h83Var.f(eo80Var);
                                    try {
                                        int iG = h83Var.g(new smk0(0L, 0L, psq.g, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                                        try {
                                            h83Var.c("•");
                                            h83Var.d(iG);
                                            h83Var.c("  ");
                                            h83Var.c(str2);
                                            h83Var.d(iF);
                                            j83Var = h83Var.h();
                                        } catch (Throwable th) {
                                            h83Var.d(iG);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        h83Var.d(iF);
                                        throw th2;
                                    }
                                } else {
                                    j83Var = new j83(str2);
                                }
                                j83 j83Var2 = j83Var;
                                int iOrdinal = rj60Var.d.ordinal();
                                if (iOrdinal == 0) {
                                    fetVar11.e0(-1827750300);
                                    ((g1t0) fetVar11.k(j1t0.e)).getClass();
                                    y9q0VarT = ibm0.t(g1t0.t(), fetVar11);
                                    fetVar11.r(false);
                                } else if (iOrdinal == 1) {
                                    fetVar11.e0(-1827746844);
                                    ((g1t0) fetVar11.k(j1t0.e)).getClass();
                                    y9q0VarT = ibm0.t(g1t0.v(), fetVar11);
                                    fetVar11.r(false);
                                } else {
                                    if (iOrdinal != 2) {
                                        throw b1j.f(-1827753761, fetVar11, false);
                                    }
                                    fetVar11.e0(-1827742910);
                                    ((g1t0) fetVar11.k(j1t0.e)).getClass();
                                    y9q0VarT = ibm0.n(g1t0.k(), fetVar11);
                                    fetVar11.r(false);
                                }
                                v8q0.b(j83Var2, mm40VarN, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y9q0VarT, fetVar11, 0, 0, 262140);
                                fetVar11.r(false);
                            }
                        }
                        throw b1j.f(-1827789921, fetVar11, false);
                    }
                }
                fetVar11.X();
                return Unit.f46060a;
            case 11:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                yk5 yk5Var = au7.U1;
                mm40Var2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    j0x.b(a8k0.F(((Number) l7m0Var.getValue()).intValue(), 0, fetVar12), null, mm40Var2, null, gqw0.A, 0.0f, null, fetVar12, 24632 | ((iIntValue12 << 6) & 896), 104);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kj5 kj5Var = wb8.n2;
                ((y5d) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ac8.c(0, fetVar13, null, ((dc8) l7m0Var.getValue()).f5839a, ((dc8) l7m0Var.getValue()).b);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i = wi8.m2;
                ((y5d) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ahy.g((cj8) l7m0Var.getValue(), fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    v8q0.a(((dz8) l7m0Var.getValue()).b, null, ((ThemeColors) fetVar15.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.y, null, j1t0.b, 0L, null, 0, 0, qmk.K, 16646109), fetVar15, 0, 24960, 110586);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    v8q0.a(((dz8) l7m0Var.getValue()).c, null, ((ThemeColors) fetVar16.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar16, 0, 0, 131066);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar17.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    qsm0.c(yhg0Var, (String) l7m0Var.getValue(), fetVar17, iIntValue17 & 14);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= fetVar18.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    qsm0.d(yhg0Var2, (String) l7m0Var.getValue(), fetVar18, iIntValue18 & 14);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= fetVar19.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    qsm0.l(y5dVar4, (String) l7m0Var.getValue(), fetVar19, iIntValue19 & 14);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= fetVar20.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    qsm0.b(yhg0Var3, (String) l7m0Var.getValue(), fetVar20, iIntValue20 & 14);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 20:
                y5d y5dVar5 = (y5d) obj;
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kj5 kj5Var2 = dic.n2;
                y5dVar5.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= fetVar21.g(y5dVar5) ? 4 : 2;
                }
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    mm40 mm40VarA3 = y5dVar5.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar9 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA3, 0.0f, 28.0f, 0.0f, 8.0f, 5), ((kic) l7m0Var.getValue()).f18329a, 0L, 0, 0L, fetVar21, 0, 28);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 21:
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    boolean zG3 = fetVar22.g(l7m0Var);
                    Object objP3 = fetVar22.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new v7i0(l7m0Var, (byte) 22);
                        fetVar22.o0(objP3);
                    }
                    qxw.o(fetVar22, knx.Q(mm40VarD2, (xdr) objP3));
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case 22:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                zcl zclVar10 = qmk.f28987a;
                int iB = si30.b((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * vj30Var.T(8.0f));
                pu90 pu90VarS = pj30Var.S(p4e.b(((p4e) obj3).f26347a, 0, 0, iB, iB, 3));
                return vj30.x(vj30Var, pu90VarS.f27604a, iB, new y1(pu90VarS, (byte) 14));
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return b(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return c(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return g(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj, obj2, obj3);
            default:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                nek nekVar = i7s.a2;
                mm40Var3.getClass();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= fetVar23.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    Object objP4 = fetVar23.P();
                    if (objP4 == cl5Var) {
                        objP4 = new dcr(b2);
                        fetVar23.o0(objP4);
                    }
                    jwb.s(0, fetVar23, (a4x) l7m0Var.getValue(), rq8.M(mm40Var3, (Function1) objP4));
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
        }
    }
}
