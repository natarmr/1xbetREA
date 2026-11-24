package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22639a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mz7(Object obj, Object obj2, byte b) {
        this.f22639a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        v5q r5qVar;
        byte b = this.f22639a;
        jm40 jm40Var = jm40.b;
        final byte b2 = 4;
        jr8 jr8Var = jr8.f16991a;
        byte b3 = 5;
        pcy pcyVar = e7z.u1;
        x2q x2qVarA = null;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                p18 p18Var = (p18) obj4;
                final yy7 yy7Var = (yy7) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.u(jm40Var, 0.0f, 416.0f, 1).e(o7k0.c);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
                    zx7 zx7Var = gqw0.b;
                    fre0.g(jr8Var.b(jm40Var, zx7Var), p18Var, (hz7) ((hgk0) yy7Var.c).getValue(), yy7Var.c().d, fetVar, 0);
                    mm40 mm40VarN = s5x0.N(jr8Var.b(jm40Var, zx7Var), 0.0f, 68.0f, 0.0f, 0.0f, 13);
                    d08 d08VarC = yy7Var.c();
                    rz7 rz7VarB = yy7Var.b();
                    boolean zG = fetVar.g(yy7Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        final byte b5 = 0;
                        objP = new Function0() { // from class: a.nz7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float fFloatValue;
                                byte b6 = b5;
                                yy7 yy7Var2 = yy7Var;
                                switch (b6) {
                                    case 0:
                                        fFloatValue = ((Number) yy7Var2.f43454a.b.d()).floatValue();
                                        break;
                                    case 1:
                                        fFloatValue = ((Number) yy7Var2.f.d()).floatValue();
                                        break;
                                    case 2:
                                        fFloatValue = ((Number) yy7Var2.f43454a.c.d()).floatValue();
                                        break;
                                    case 3:
                                        fFloatValue = ((Number) yy7Var2.f43454a.d.d()).floatValue();
                                        break;
                                    default:
                                        w08 w08Var = yy7Var2.f43454a;
                                        fFloatValue = 1.0f - (((Number) w08Var.b.d()).floatValue() / w08Var.f38338a);
                                        break;
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        };
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(yy7Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        final byte b6 = 1;
                        objP2 = new Function0() { // from class: a.nz7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float fFloatValue;
                                byte b7 = b6;
                                yy7 yy7Var2 = yy7Var;
                                switch (b7) {
                                    case 0:
                                        fFloatValue = ((Number) yy7Var2.f43454a.b.d()).floatValue();
                                        break;
                                    case 1:
                                        fFloatValue = ((Number) yy7Var2.f.d()).floatValue();
                                        break;
                                    case 2:
                                        fFloatValue = ((Number) yy7Var2.f43454a.c.d()).floatValue();
                                        break;
                                    case 3:
                                        fFloatValue = ((Number) yy7Var2.f43454a.d.d()).floatValue();
                                        break;
                                    default:
                                        w08 w08Var = yy7Var2.f43454a;
                                        fFloatValue = 1.0f - (((Number) w08Var.b.d()).floatValue() / w08Var.f38338a);
                                        break;
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    Function0 function1 = (Function0) objP2;
                    boolean zG3 = fetVar.g(yy7Var);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        final byte b7 = 2;
                        objP3 = new Function0() { // from class: a.nz7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float fFloatValue;
                                byte b8 = b7;
                                yy7 yy7Var2 = yy7Var;
                                switch (b8) {
                                    case 0:
                                        fFloatValue = ((Number) yy7Var2.f43454a.b.d()).floatValue();
                                        break;
                                    case 1:
                                        fFloatValue = ((Number) yy7Var2.f.d()).floatValue();
                                        break;
                                    case 2:
                                        fFloatValue = ((Number) yy7Var2.f43454a.c.d()).floatValue();
                                        break;
                                    case 3:
                                        fFloatValue = ((Number) yy7Var2.f43454a.d.d()).floatValue();
                                        break;
                                    default:
                                        w08 w08Var = yy7Var2.f43454a;
                                        fFloatValue = 1.0f - (((Number) w08Var.b.d()).floatValue() / w08Var.f38338a);
                                        break;
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    Function0 function2 = (Function0) objP3;
                    boolean zG4 = fetVar.g(yy7Var);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        final byte b8 = 3;
                        objP4 = new Function0() { // from class: a.nz7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float fFloatValue;
                                byte b9 = b8;
                                yy7 yy7Var2 = yy7Var;
                                switch (b9) {
                                    case 0:
                                        fFloatValue = ((Number) yy7Var2.f43454a.b.d()).floatValue();
                                        break;
                                    case 1:
                                        fFloatValue = ((Number) yy7Var2.f.d()).floatValue();
                                        break;
                                    case 2:
                                        fFloatValue = ((Number) yy7Var2.f43454a.c.d()).floatValue();
                                        break;
                                    case 3:
                                        fFloatValue = ((Number) yy7Var2.f43454a.d.d()).floatValue();
                                        break;
                                    default:
                                        w08 w08Var = yy7Var2.f43454a;
                                        fFloatValue = 1.0f - (((Number) w08Var.b.d()).floatValue() / w08Var.f38338a);
                                        break;
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        };
                        fetVar.o0(objP4);
                    }
                    tz7.a(mm40VarN, d08VarC, rz7VarB, function0, function1, function2, (Function0) objP4, fetVar, 0);
                    rz7 rz7VarB2 = yy7Var.b();
                    iz7 iz7VarA = yy7Var.a();
                    boolean zG5 = fetVar.g(yy7Var);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new Function0() { // from class: a.nz7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float fFloatValue;
                                byte b9 = b2;
                                yy7 yy7Var2 = yy7Var;
                                switch (b9) {
                                    case 0:
                                        fFloatValue = ((Number) yy7Var2.f43454a.b.d()).floatValue();
                                        break;
                                    case 1:
                                        fFloatValue = ((Number) yy7Var2.f.d()).floatValue();
                                        break;
                                    case 2:
                                        fFloatValue = ((Number) yy7Var2.f43454a.c.d()).floatValue();
                                        break;
                                    case 3:
                                        fFloatValue = ((Number) yy7Var2.f43454a.d.d()).floatValue();
                                        break;
                                    default:
                                        w08 w08Var = yy7Var2.f43454a;
                                        fFloatValue = 1.0f - (((Number) w08Var.b.d()).floatValue() / w08Var.f38338a);
                                        break;
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        };
                        fetVar.o0(objP5);
                    }
                    i18.a(rz7VarB2, iz7VarA, (Function0) objP5, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                kwj kwjVar = (kwj) obj4;
                a4x a4xVar = (a4x) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    q5x.e(kwjVar, o7k0.c, null, null, 0, 20.0f, null, null, true, null, null, null, null, u1c.M(-770762199, new ftl(a4xVar, (byte) 3), fetVar2), fetVar2, 100663344, 24576, 16092);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ra00 ra00Var = (ra00) obj4;
                gfm0 gfm0Var = (gfm0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p8a.e(o7k0.c, ra00Var.a(), gfm0Var, gfm0Var, gqw0.A, fetVar3, 196614, 4);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                Function1 function3 = (Function1) obj4;
                kxh kxhVar = (kxh) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    boolean zG6 = fetVar4.g(function3);
                    Object objP6 = fetVar4.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new olh(function3, b3);
                        fetVar4.o0(objP6);
                    }
                    Function1 function4 = (Function1) objP6;
                    boolean zI = fetVar4.i(kxhVar);
                    Object objP7 = fetVar4.P();
                    if (zI || objP7 == cl5Var) {
                        objP7 = new hfg(kxhVar, (byte) 23);
                        fetVar4.o0(objP7);
                    }
                    dwi0.b(function4, n0qVar, (Function1) objP7, fetVar4, 48, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                mm40 mm40Var = (mm40) obj4;
                fw1 fw1Var = (fw1) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                pge pgeVar = gqw0.A;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40Var, 164.0f);
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundContent();
                    zcl zclVar4 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(mm40VarE2, backgroundContent, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
                    Object objP8 = fetVar5.P();
                    if (objP8 == cl5Var) {
                        objP8 = dw9.j(fetVar5);
                    }
                    gy40 gy40Var = (gy40) objP8;
                    boolean zG7 = fetVar5.g(null) | fetVar5.g(fw1Var);
                    Object objP9 = fetVar5.P();
                    if (zG7 || objP9 == cl5Var) {
                        objP9 = new knl(fw1Var, (byte) 8);
                        fetVar5.o0(objP9);
                    }
                    mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP9, 28);
                    zx7 zx7Var2 = gqw0.f11754a;
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarW);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar5, tj30VarC2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar5, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar5, numValueOf, shdVar3);
                    jpm0.n(fetVar5);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar5, mm40VarC1, shdVar4);
                    dw1 dw1Var = (dw1) fw1Var;
                    n0x n0xVar = dw1Var.l;
                    fetVar5.e0(115720791);
                    jm40 jm40Var2 = jm40.b;
                    k7x.a(dw1Var.k.a(), null, jr8Var.b(o7k0.p(jm40Var2, 92.0f, 66.0f), zx7Var2), pgeVar, new m78(((ThemeColors) fetVar5.k(zfnVar)).getSecondary(), 5), fetVar5, 1572912, 1720);
                    fetVar5.r(false);
                    fetVar5.e0(116335800);
                    k7x.a(n0xVar.a(), null, jr8Var.b(o7k0.p(jm40Var2, 92.0f, 66.0f), gqw0.c), pgeVar, new m78(((ThemeColors) fetVar5.k(zfnVar)).getSecondary(), 5), fetVar5, 1572912, 1720);
                    fetVar5.r(false);
                    mm40 mm40VarL = s5x0.L(o7k0.c, 8.0f, 0.0f, 2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar5, 48);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarL);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, shdVar);
                    jpm0.o(fetVar5, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, shdVar4);
                    v8q0.a(dw1Var.b, s5x0.N(o7k0.d(jm40Var2, 1.0f), 80.0f, 24.0f, 80.0f, 0.0f, 8), ((ThemeColors) fetVar5.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, true, 2, 0, null, g1t0.g(), fetVar5, 0, 28032, 101368);
                    mm40 mm40VarG = o7k0.g(o7k0.d(s5x0.N(jm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), 24.0f, 0.0f, 2);
                    zx7 zx7Var3 = gqw0.h;
                    tj30 tj30VarC3 = zq8.c(zx7Var3, false);
                    int iHashCode4 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM4 = fetVar5.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarG);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC3, shdVar);
                    jpm0.o(fetVar5, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC3, shdVar4);
                    String str = dw1Var.c;
                    long textPrimary = ((ThemeColors) fetVar5.k(zfnVar)).getTextPrimary();
                    y9q0 y9q0VarA = y9q0.a(g1t0.o(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679);
                    long j = qmk.q;
                    long j2 = qmk.y;
                    long j3 = qmk.n;
                    v8q0.a(str, null, textPrimary, new n05(j, j2, j3), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, true, 1, 0, null, y9q0VarA, fetVar5, 0, 28032, 101362);
                    fetVar5.r(true);
                    fetVar5.r(true);
                    if (dw1Var.f6773a == bw1.f3302a) {
                        fetVar5.e0(119084291);
                        fbc.r(s5x0.N(jr8Var.b(jm40Var2, zx7Var3), 0.0f, 0.0f, 0.0f, 24.0f, 7), dw1Var, fetVar5, 0);
                        fetVar5.r(false);
                        z = true;
                    } else {
                        fetVar5.e0(119430778);
                        mm40 mm40VarB = jr8Var.b(o7k0.e(s5x0.N(jm40Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), 36.0f), zx7Var3);
                        tj30 tj30VarC4 = zq8.c(zx7Var2, false);
                        int iHashCode5 = Long.hashCode(fetVar5.T);
                        bh90 bh90VarM5 = fetVar5.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarB);
                        fetVar5.i0();
                        if (fetVar5.S) {
                            fetVar5.l(pcyVar);
                        } else {
                            fetVar5.r0();
                        }
                        jpm0.o(fetVar5, tj30VarC4, shdVar);
                        jpm0.o(fetVar5, bh90VarM5, shdVar2);
                        vqd.u(iHashCode5, fetVar5, shdVar3, fetVar5);
                        jpm0.o(fetVar5, mm40VarC4, shdVar4);
                        v8q0.a(dw1Var.i, null, ((ThemeColors) fetVar5.k(zfnVar)).getSecondary(), new n05(j, qmk.s, j3), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, true, 2, 0, null, y9q0.a(g1t0.j(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.r, null, null, 16646143), fetVar5, 0, 28032, 101362);
                        z = true;
                        fetVar5.r(true);
                        fetVar5.r(false);
                    }
                    fetVar5.r(z);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                mm40 mm40Var2 = (mm40) obj4;
                o6m o6mVar = (o6m) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(o7k0.e(mm40Var2, 88.0f), n6m.c);
                    tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                    int iHashCode6 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM6 = fetVar6.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar6, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar6, tj30VarC5, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar6, bh90VarM6, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar6, numValueOf2, shdVar7);
                    jpm0.n(fetVar6);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar6, mm40VarC5, shdVar8);
                    n6m.a(o6mVar.b, fetVar6, 6);
                    mm40 mm40VarE0 = o2e.e0(s5x0.J(o7k0.c, 8.0f), "DS_CYBER_GAME_MAP_COLUMN");
                    x5d x5dVarA2 = w5d.a(uc9.g, gqw0.n, fetVar6, 54);
                    int iHashCode7 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM7 = fetVar6.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar6, mm40VarE0);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, shdVar5);
                    jpm0.o(fetVar6, bh90VarM7, shdVar6);
                    vqd.u(iHashCode7, fetVar6, shdVar7, fetVar6);
                    jpm0.o(fetVar6, mm40VarC6, shdVar8);
                    n6m.j(o6mVar.f24743a, fetVar6, 0);
                    n6m.d(o6mVar, fetVar6, 0);
                    n6m.i(0, fetVar6);
                    fetVar6.r(true);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                l7m0 l7m0Var = (l7m0) obj4;
                w9v w9vVar = (w9v) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str2 = ((Boolean) l7m0Var.getValue()).booleanValue() ? w9vVar.b : w9vVar.f38799a;
                    mm40 mm40VarE1 = o2e.e0(jm40Var, "GOLD_RUSH_WIN_CELL");
                    tj30 tj30VarC6 = zq8.c(gqw0.f11754a, false);
                    int iHashCode8 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM8 = fetVar7.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar7, mm40VarE1);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC6, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM8, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode8), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC7, gqw0.v);
                    k7x.a(str2, null, s5x0.J(o7k0.c, 0.5f), gqw0.A, null, fetVar7, 1573296, 1976);
                    if (!w9vVar.e || ((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar7.e0(-1868967779);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-1869262403);
                        v8q0.a(w9vVar.d, jr8Var.b(jm40Var, gqw0.e), y3d.c, null, qmk.s, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.z, psq.g, j1t0.d, 0L, null, 0, 0, qmk.K, 16646105), fetVar7, 384, 0, 131048);
                        fetVar7.r(false);
                    }
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                lu50 lu50Var = (lu50) obj4;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                uuz uuzVar = lu50.V1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    gfx.h(0, fetVar8, lu50Var.R1.n(lu50Var, lu50.W1[5]).booleanValue());
                    n0q n0qVar2 = o7k0.c;
                    k3t0 k3t0Var = (k3t0) lu50Var.U1.getValue();
                    boolean zI2 = fetVar8.i(k3t0Var);
                    Object objP10 = fetVar8.P();
                    if (zI2 || objP10 == cl5Var) {
                        r750 r750Var = new r750(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar8.o0(r750Var);
                        objP10 = r750Var;
                    }
                    ju70.z(n0qVar2, l7m0Var2, lu50Var, false, (Function1) ((jhy) objP10), fetVar8, 6);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                gbl0 gbl0Var = (gbl0) obj4;
                RelatedParams relatedParams = (RelatedParams) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                lme0 lme0Var = gbl0.c2;
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    fetVar9.X();
                } else {
                    if (gbl0Var.M1 == null) {
                        Intrinsics.h("relatedGamesListFactory");
                        throw null;
                    }
                    cge0.b(cjx.V(o7k0.c, x0x.a0(fetVar9), null), gbl0Var, relatedParams, fetVar9);
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ay3.a((l0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                wb.a((nwi0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                wb.c((mwi0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                wb.y((wgj0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                wb.E((vdj0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                lv00.c((mm40) obj4, (fd) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                dwi0.a((mm40) obj4, (uy) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                xf0.a((mm40) obj4, (vy) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                aad.a((mm40) obj4, (ty) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                kc5.I((mm40) obj4, (y00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                kc5.o0((mm40) obj4, (Pair) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                uc9.u((g10) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                p8a.b((mm40) obj4, (col) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                un0 un0Var = (un0) obj3;
                ln0 ln0Var = (ln0) obj2;
                ((oyg0) obj).getClass();
                ln0Var.getClass();
                int iOrdinal = ((yk0) obj4).ordinal();
                if (iOrdinal == 0) {
                    return ln0.a(ln0Var, null, false, null, null, null, null, un0Var, null, 0L, false, 61439);
                }
                if (iOrdinal == 1) {
                    return ln0.a(ln0Var, null, false, null, null, null, null, null, un0Var, 0L, false, 57343);
                }
                t9f.b();
                return null;
            case 23:
                String str3 = (String) obj3;
                ur0 ur0Var = (ur0) obj2;
                ((oyg0) obj).getClass();
                ur0Var.getClass();
                x2q x2qVar = ((u5d0) obj4).f35088a;
                if (x2qVar != null) {
                    List list = x2qVar.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (!Intrinsics.d(((l3q) obj5).getId(), str3)) {
                            arrayList.add(obj5);
                        }
                    }
                    x2qVarA = x2q.a(x2qVar, arrayList);
                }
                return ur0.a(ur0Var, null, null, new u5d0(x2qVarA), null, 247);
            case 24:
                i4 i4Var = (i4) obj3;
                ur0 ur0Var2 = (ur0) obj2;
                List list2 = ((mi1) obj4).b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((x2q) it.next()).d.isEmpty()) {
                            r5qVar = new r5q(i4Var);
                        }
                    }
                    r5qVar = s5q.f31665a;
                } else {
                    r5qVar = s5q.f31665a;
                }
                return ur0.a(ur0Var2, r5qVar, null, null, null, 253);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                saj.M((mm40) obj4, (ly0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ql5 ql5Var = (ql5) obj3;
                q11 q11Var = (q11) obj2;
                ((oyg0) obj).getClass();
                q11Var.getClass();
                return q11.a(q11Var, ql5Var != null ? ql5Var.f28916a : 0L, (ql5Var == null || !ql5Var.i.d()) ? d7v.b : q11Var.c, null, null, null, null, null, null, null, false, false, false, null, false, ((pb0) obj4).f26680a, null, null, 534773756);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k8d0 k8d0Var = (k8d0) obj4;
                Function1 function5 = (Function1) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zfn zfnVar2 = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar10.k(zfnVar2)).getSecondary()), new plm(k8d0Var.f17867a, ((ThemeColors) fetVar10.k(zfnVar2)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar10.k(zfnVar2)).getBackgroundContent(), false, null);
                    boolean zG8 = fetVar10.g(function5);
                    Object objP11 = fetVar10.P();
                    if (zG8 || objP11 == cl5Var) {
                        objP11 = new si1(function5, (byte) 4);
                        fetVar10.o0(objP11);
                    }
                    Function0 function6 = (Function0) objP11;
                    Object objP12 = fetVar10.P();
                    if (objP12 == cl5Var) {
                        objP12 = new dj1(b4);
                        fetVar10.o0(objP12);
                    }
                    hlm.c(null, immVar, null, function6, null, (Function1) objP12, null, null, null, null, null, null, fetVar10, 196608, 0, 4053);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                i120.J((mm40) obj4, (gn1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                j120.d((String) obj4, (unm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ mz7(Object obj, Object obj2, int i, byte b) {
        this.f22639a = b;
        this.b = obj;
        this.c = obj2;
    }
}
