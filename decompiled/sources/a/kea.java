package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kea implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18145a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kea(h9d h9dVar, mm40 mm40Var, int i) {
        this.f18145a = (byte) 25;
        this.c = h9dVar;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strJ0;
        Object value;
        byte b = this.f18145a;
        final byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x4d0.q((mm40) obj4, (lea) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                jd8.D((mm40) obj4, (jea) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                dj8.o((mm40) obj4, (lfa) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                mm40 mm40Var = (mm40) obj4;
                final bla blaVar = (bla) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 8.0f, 6), 22.0f);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    String str = blaVar.e;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0 y9q0VarG = g1t0.g();
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 109562);
                    fetVar.r(true);
                    zfn zfnVar = egp0.d;
                    obc.d(zfnVar.a(Integer.valueOf(blaVar.b instanceof ldp0 ? 1 : 2)), u1c.M(-1120698423, new Function2() { // from class: a.ala
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            byte b5 = b3;
                            cl5 cl5Var = ukd.f35823a;
                            bla blaVar2 = blaVar;
                            switch (b5) {
                                case 0:
                                    fet fetVar2 = (fet) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        zcl zclVar2 = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 9.0f, 7), 32.0f), 1.0f), 8.0f, 0.0f, 2);
                                        udp0 udp0Var = blaVar2.b;
                                        Object objP = fetVar2.P();
                                        if (objP == cl5Var) {
                                            objP = new im8((byte) 24);
                                            fetVar2.o0(objP);
                                        }
                                        kcp0.a(mm40VarL, udp0Var, (Function2) objP, fetVar2, 384, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    fet fetVar3 = (fet) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        mm40 mm40VarL2 = s5x0.L(o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 32.0f), 8.0f, 0.0f, 2);
                                        udp0 udp0Var2 = blaVar2.c;
                                        Object objP2 = fetVar3.P();
                                        if (objP2 == cl5Var) {
                                            objP2 = new im8((byte) 25);
                                            fetVar3.o0(objP2);
                                        }
                                        kcp0.a(mm40VarL2, udp0Var2, (Function2) objP2, fetVar3, 384, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 56);
                    obc.d(zfnVar.a(Integer.valueOf(blaVar.c instanceof ldp0 ? (byte) 1 : (byte) 2)), u1c.M(8351410, new Function2() { // from class: a.ala
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            byte b5 = b4;
                            cl5 cl5Var = ukd.f35823a;
                            bla blaVar2 = blaVar;
                            switch (b5) {
                                case 0:
                                    fet fetVar2 = (fet) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        zcl zclVar2 = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 9.0f, 7), 32.0f), 1.0f), 8.0f, 0.0f, 2);
                                        udp0 udp0Var = blaVar2.b;
                                        Object objP = fetVar2.P();
                                        if (objP == cl5Var) {
                                            objP = new im8((byte) 24);
                                            fetVar2.o0(objP);
                                        }
                                        kcp0.a(mm40VarL, udp0Var, (Function2) objP, fetVar2, 384, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    fet fetVar3 = (fet) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        mm40 mm40VarL2 = s5x0.L(o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 32.0f), 8.0f, 0.0f, 2);
                                        udp0 udp0Var2 = blaVar2.c;
                                        Object objP2 = fetVar3.P();
                                        if (objP2 == cl5Var) {
                                            objP2 = new im8((byte) 25);
                                            fetVar3.o0(objP2);
                                        }
                                        kcp0.a(mm40VarL2, udp0Var2, (Function2) objP2, fetVar3, 384, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 56);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                Integer num = (Integer) obj;
                num.getClass();
                qic qicVar = (qic) obj2;
                int i = CarriageContainer.f;
                qicVar.getClass();
                ((CarriageContainer) obj4).e = new Pair(0, qicVar);
                ((Function2) obj3).invoke(num, qicVar);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                oja0.l((mm40) obj4, (twa) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                oja0.m((mm40) obj4, (rwa) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                Throwable th = (Throwable) obj4;
                uya uyaVar = (uya) obj3;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                uyaVar.G(new iya(sj3.j0(str2, sj3.j0(((th instanceof qct) || (th instanceof zhi0)) ? th.getMessage() : null, uyaVar.y.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))))));
                return Unit.f46060a;
            case 8:
                yya yyaVar = (yya) obj4;
                ctf0 ctf0Var = yyaVar.m;
                Throwable th2 = (Throwable) obj3;
                Throwable th3 = (Throwable) obj;
                String str3 = (String) obj2;
                th3.getClass();
                str3.getClass();
                if (str3.length() == 0) {
                    if (th3 instanceof qct) {
                        strJ0 = sj3.j0(th2.getMessage(), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        strJ0 = th3 instanceof zhi0 ? sj3.j0(th2.getMessage(), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))) : ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0));
                    }
                    str3 = strJ0;
                }
                yyaVar.y.f(str3);
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                unh0.n((x7z) obj4, (o0b) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                h2b h2bVar = (h2b) obj4;
                Throwable th4 = (Throwable) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                h2bVar.A(new t1b(th4));
                h2bVar.m.a(th4);
                p7m0 p7m0Var = h2bVar.V;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new q1b()));
                h2bVar.D(true);
                return Unit.f46060a;
            case 11:
                r6b r6bVar = (r6b) obj2;
                ((oyg0) obj).getClass();
                r6bVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(r6bVar.d);
                linkedHashMap.put(Long.valueOf(((js20) obj4).a()), (List) obj3);
                return r6b.a(r6bVar, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, false, false, 524279);
            case 12:
                r6b r6bVar2 = (r6b) obj2;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(r6bVar2.b);
                linkedHashMap2.put(Long.valueOf(((xvm0) obj4).getId()), (cx7) obj3);
                return r6b.a(r6bVar2, null, linkedHashMap2, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 524285);
            case 13:
                ((Integer) obj2).getClass();
                acb.d((mm40) obj4, (plp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                saj.I((mm40) obj4, (wlp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                bj5 bj5Var = bib.X1;
                ((bib) obj4).G0((Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                kj5 kj5Var = xnb.w2;
                ((xnb) obj4).Q0((cob) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 17:
                ssd ssdVar = (ssd) obj4;
                ipb ipbVar = (ipb) obj3;
                btb btbVar = (btb) obj2;
                ((oyg0) obj).getClass();
                btbVar.getClass();
                return new btb(btbVar.f3175a, ssdVar != null ? ssdVar.f32720a : null, ssdVar != null ? ssdVar.b : null, ipbVar, "", ssdVar != null ? ssdVar.b : null, ssdVar != null ? ssdVar.c : null);
            case 18:
                v7c v7cVar = (v7c) obj4;
                zhi0 zhi0Var = (zhi0) obj3;
                Throwable th5 = (Throwable) obj;
                String str4 = (String) obj2;
                th5.getClass();
                str4.getClass();
                v7cVar.e.getClass();
                zhi0Var.printStackTrace();
                String strJ1 = sj3.j0(zhi0Var.getMessage(), str4);
                th5.printStackTrace();
                v7cVar.O(strJ1);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                aac.d((mm40) obj4, (bac) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ebc.c((i5d) obj4, (y9q0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                hic.e((mm40) obj4, (o0h) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                hic.o((mm40) obj4, (a9d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                vic.b((mm40) obj4, (p0h) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                plc.e((mm40) obj4, (l9d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                acb.h((h9d) obj3, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                vdb.k((mm40) obj4, (g3w) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                b34.m((mm40) obj4, (und) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                hp4.g((mm40) obj4, (vnd) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                mm40 mm40Var2 = (mm40) obj4;
                final god godVar = (god) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    b34.k(o7k0.e(mm40VarD, 72.0f), q3d.j(u1c.M(-1324789006, new xdr() { // from class: a.cod
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b5 = b3;
                            god godVar2 = godVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj5;
                                    fet fetVar3 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        xf0.h(mm40Var3, godVar2.f11625a, uc9.e, null, fetVar3, (iIntValue3 & 14) | 384, 24);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    ((mm40) obj5).getClass();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        vfc.g(godVar2.d, fetVar4);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj5;
                                    fet fetVar5 = (fet) obj6;
                                    int iIntValue5 = ((Integer) obj7).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        xf0.h(mm40Var4, godVar2.b, uc9.e, null, fetVar5, (iIntValue5 & 14) | 384, 24);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), u1c.M(-917761519, new xdr() { // from class: a.cod
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b5 = b4;
                            god godVar2 = godVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj5;
                                    fet fetVar3 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        xf0.h(mm40Var3, godVar2.f11625a, uc9.e, null, fetVar3, (iIntValue3 & 14) | 384, 24);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    ((mm40) obj5).getClass();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        vfc.g(godVar2.d, fetVar4);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj5;
                                    fet fetVar5 = (fet) obj6;
                                    int iIntValue5 = ((Integer) obj7).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        xf0.h(mm40Var4, godVar2.b, uc9.e, null, fetVar5, (iIntValue5 & 14) | 384, 24);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), u1c.M(-510734032, new xdr() { // from class: a.cod
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b5 = b2;
                            god godVar2 = godVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj5;
                                    fet fetVar3 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        xf0.h(mm40Var3, godVar2.f11625a, uc9.e, null, fetVar3, (iIntValue3 & 14) | 384, 24);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    ((mm40) obj5).getClass();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        vfc.g(godVar2.d, fetVar4);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj5;
                                    fet fetVar5 = (fet) obj6;
                                    int iIntValue5 = ((Integer) obj7).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        xf0.h(mm40Var4, godVar2.b, uc9.e, null, fetVar5, (iIntValue5 & 14) | 384, 24);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2)), null, fetVar2, 4);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kea(Object obj, Object obj2, byte b) {
        this.f18145a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ kea(Object obj, Object obj2, int i, byte b) {
        this.f18145a = b;
        this.b = obj;
        this.c = obj2;
    }
}
