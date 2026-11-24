package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.chips.DsChipGroup;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i3l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14102a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3l(Object obj, byte b) {
        this.f14102a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14102a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 14;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                l3l l3lVar = (l3l) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                nek nekVar = l3l.b2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    val valVar = (val) ((i3t0) l3lVar.H0()).y(fetVar).getValue();
                    sek sekVar = l3lVar.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = l3lVar.N1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(l3lVar.G0().f46514a, l3lVar.G0().c, l3lVar.G0().e, l3lVar.G0().d, l3lVar.G0().b);
                    amw amwVar = l3lVar.a2;
                    xex xexVar = l3lVar.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(l3lVar.G0().f46514a, l3lVar.G0().c, l3lVar.G0().b, l3lVar.G0().e, 1L, l3lVar.G0().h, new lq2(), grs.b, l3l.class.getSimpleName());
                    k3t0 k3t0VarH0 = l3lVar.H0();
                    boolean zI = fetVar.i(k3t0VarH0);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new k0l(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                        fetVar.o0(objP);
                    }
                    hkb.i(valVar, sekVar, bekVar, z5sVar, amwVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP), fetVar, 0);
                    k3t0 k3t0VarH1 = l3lVar.H0();
                    boolean zI2 = fetVar.i(l3lVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new j3l(l3lVar, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    clz clzVar = (clz) fetVar.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
                    boolean zI3 = fetVar.i(k3t0VarH1) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        pc pcVar = new pc(k3t0VarH1, clzVar, pz40VarF, null, (byte) 14);
                        fetVar.o0(pcVar);
                        objP3 = pcVar;
                    }
                    m0x0.t(fetVar, clzVar, (Function2) objP3);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                float fFloatValue = ((Float) obj2).floatValue();
                ((dpa0) obj).a();
                ((jie0) obj3).f16571a = fFloatValue;
                return Unit.f46060a;
            case 2:
                y8n y8nVar = (y8n) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarU = o7k0.u(jm40Var2, 0.0f, 220.0f, 1);
                    thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
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
                    String str = y8nVar.b;
                    long j = y8nVar.f;
                    zfn zfnVar = j1t0.e;
                    ((g1t0) fetVar2.k(zfnVar)).getClass();
                    v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.l(), fetVar2, 0, 24960, 110586);
                    String str2 = y8nVar.c;
                    if (str2 == null || str2.length() == 0) {
                        fetVar2.e0(-526486272);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-526954248);
                        mm40 mm40VarN = s5x0.N(jm40Var2, 2.0f, 0.0f, 0.0f, 0.0f, 14);
                        String str3 = y8nVar.c;
                        long j2 = y8nVar.g;
                        ((g1t0) fetVar2.k(zfnVar)).getClass();
                        v8q0.a(str3, mm40VarN, j2, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.n(), fetVar2, 0, 24960, 110584);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                DsChipGroup dsChipGroup = (DsChipGroup) obj3;
                DsChip dsChip = (DsChip) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i = DsChipGroup.r;
                dsChip.getClass();
                if (dsChipGroup.h.f21402a) {
                    b5q b5qVar = new b5q(pgi0.h(new ihu0(dsChipGroup), ske.u));
                    while (b5qVar.hasNext()) {
                        DsChip dsChip2 = (DsChip) b5qVar.next();
                        dsChip2.setSelectedInternal(zBooleanValue && Intrinsics.d(dsChip2, dsChip));
                    }
                }
                Function1 function1 = dsChipGroup.o;
                if (function1 != null) {
                    function1.invoke(dsChipGroup.getSelectedChips());
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                jeb.J((d4m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                jeb.D((c4m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((h5m) obj3).b.m(fFloatValue2);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                tlb.a((e8n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                n6m.d((o6m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                pzb.m((uzb) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                n4c.k((d4d) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                mbc.n((xam) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                mbc.b((ddd) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                vbc.c((tbm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                vcc.h((ecm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                dub.a((uj60) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                lla llaVar = (lla) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j2e.g(null, ((ila) llaVar).e, 0, null, 0.0f, 0.0f, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 17:
                d6l0 d6l0Var = (d6l0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fetVar4.X();
                } else if (d6l0Var instanceof b6l0) {
                    fetVar4.e0(-147061414);
                    b6l0 b6l0Var = (b6l0) d6l0Var;
                    ibm0.d(null, new mws0(b6l0Var.c, b6l0Var.d, b6l0Var.e, b6l0Var.f, b6l0Var.g), fetVar4, 0);
                    fetVar4.r(false);
                } else if (d6l0Var instanceof c6l0) {
                    fetVar4.e0(-147046382);
                    c6l0 c6l0Var = (c6l0) d6l0Var;
                    wgm0.p(null, new dxs0(c6l0Var.c, c6l0Var.d, c6l0Var.e), fetVar4, 0);
                    fetVar4.r(false);
                } else if (d6l0Var instanceof z5l0) {
                    fetVar4.e0(-147035482);
                    z5l0 z5l0Var = (z5l0) d6l0Var;
                    q8x.l(null, new dx40(z5l0Var.c, z5l0Var.d, z5l0Var.e), fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    if (!(d6l0Var instanceof a6l0)) {
                        throw b1j.f(-147062285, fetVar4, false);
                    }
                    fetVar4.e0(-147023937);
                    a6l0 a6l0Var = (a6l0) d6l0Var;
                    ufx.i(null, new ql60(a6l0Var.c, a6l0Var.d), fetVar4, 0);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
            case 18:
                k6l0 k6l0Var = (k6l0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.X();
                } else if (k6l0Var instanceof h6l0) {
                    fetVar5.e0(-1067126832);
                    h6l0 h6l0Var = (h6l0) k6l0Var;
                    afn0.h(null, new kws0(new lws0(h6l0Var.c, h6l0Var.d), new lws0(h6l0Var.f, h6l0Var.e), h6l0Var.h, h6l0Var.i, h6l0Var.j, h6l0Var.k, h6l0Var.g), fetVar5, 0);
                    fetVar5.r(false);
                } else if (k6l0Var instanceof i6l0) {
                    fetVar5.e0(-1067095314);
                    i6l0 i6l0Var = (i6l0) k6l0Var;
                    bcm0.f(null, new nws0(i6l0Var.c, i6l0Var.h, i6l0Var.i, i6l0Var.d, i6l0Var.e, i6l0Var.f, i6l0Var.g), fetVar5, 0);
                    fetVar5.r(false);
                } else if (k6l0Var instanceof j6l0) {
                    fetVar5.e0(-1067074956);
                    j6l0 j6l0Var = (j6l0) k6l0Var;
                    ghm0.k(null, new exs0(j6l0Var.c, j6l0Var.d, j6l0Var.e, j6l0Var.f, j6l0Var.g, j6l0Var.h, j6l0Var.i), fetVar5, 0);
                    fetVar5.r(false);
                } else if (k6l0Var instanceof f6l0) {
                    fetVar5.e0(-1067056437);
                    f6l0 f6l0Var = (f6l0) k6l0Var;
                    r8x.q(null, new ex40(f6l0Var.c, f6l0Var.d, f6l0Var.e, f6l0Var.f, f6l0Var.g), fetVar5, 0);
                    fetVar5.r(false);
                } else if (k6l0Var instanceof g6l0) {
                    fetVar5.e0(-1067041265);
                    g6l0 g6l0Var = (g6l0) k6l0Var;
                    uvw.f(null, new rl60(g6l0Var.c, g6l0Var.d), fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    if (!(k6l0Var instanceof e6l0)) {
                        throw b1j.f(-1067125527, fetVar5, false);
                    }
                    fetVar5.e0(-1067016638);
                    e6l0 e6l0Var = (e6l0) k6l0Var;
                    feb.g(null, new rjg(new aah(e6l0Var.d, e6l0Var.c, e6l0Var.h, e6l0Var.i, e6l0Var.j), new aah(e6l0Var.e, e6l0Var.f, e6l0Var.k, e6l0Var.l, e6l0Var.m), e6l0Var.g), fetVar5, 0);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                q56 q56Var = (q56) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j2e.g(null, ((n56) q56Var).e, 0, null, 0.0f, 0.0f, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 20:
                w56 w56Var = (w56) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j2e.g(null, ((t56) w56Var).e, 0, null, 0.0f, 0.0f, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                f7k.r((mum) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                gvm gvmVar = (gvm) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarN2 = s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4(b2)), gqw0.j, fetVar8, 0);
                    int iHashCode2 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM2 = fetVar8.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC1, gqw0.v);
                    j0x.b(a8k0.F(gvmVar.b, 0, fetVar8), null, o7k0.p(jm40Var3, 30.0f, 40.0f), null, null, 0.0f, null, fetVar8, 56, 120);
                    j0x.b(a8k0.F(gvmVar.c, 0, fetVar8), null, o7k0.p(jm40Var3, 30.0f, 40.0f), null, null, 0.0f, null, fetVar8, 56, 120);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 23:
                hvm hvmVar = (hvm) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    thg0 thg0VarA3 = shg0.a(new qw3(2.0f, true, new jf4(b2)), gqw0.k, fetVar9, 48);
                    int iHashCode3 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM3 = fetVar9.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar9, jm40Var);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC2, gqw0.v);
                    j0x.b(a8k0.F(hvmVar.b, 0, fetVar9), null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar9, 56, 120);
                    j0x.b(a8k0.F(hvmVar.c, 0, fetVar9), null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar9, 56, 120);
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 24:
                ivm ivmVar = (ivm) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarN3 = s5x0.N(jm40Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA4 = shg0.a(new qw3(2.0f, true, new jf4(b2)), gqw0.j, fetVar10, 0);
                    int iHashCode4 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM4 = fetVar10.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar10, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC3, gqw0.v);
                    j0x.b(a8k0.F(ivmVar.b, 0, fetVar10), null, o7k0.p(jm40Var4, 24.0f, 32.0f), null, null, 0.0f, null, fetVar10, 56, 120);
                    j0x.b(a8k0.F(ivmVar.c, 0, fetVar10), null, o7k0.p(jm40Var4, 24.0f, 32.0f), null, null, 0.0f, null, fetVar10, 56, 120);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jvm jvmVar = (jvm) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    zcl zclVar5 = qmk.f28987a;
                    thg0 thg0VarA5 = shg0.a(new qw3(2.0f, true, new jf4(b2)), gqw0.j, fetVar11, 0);
                    int iHashCode5 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM5 = fetVar11.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar11, jm40Var);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, thg0VarA5, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC4, gqw0.v);
                    j0x.b(a8k0.F(jvmVar.b, 0, fetVar11), null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar11, 56, 120);
                    j0x.b(a8k0.F(jvmVar.c, 0, fetVar11), null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar11, 56, 120);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cwm cwmVar = (cwm) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uzb.H(null, cwmVar.f5088a, cwmVar.b, cwmVar.c, cwmVar.d, cwmVar.e, cwmVar.f, cwmVar.i, cwmVar.k, fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ewm ewmVar = (ewm) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    wzb.F(null, ewmVar.f8534a, ewmVar.b, ewmVar.c, ewmVar.d, ewmVar.e, ewmVar.f, ewmVar.j, ewmVar.k, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                owm owmVar = (owm) obj3;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    thg0 thg0VarA6 = shg0.a(uc9.f35418a, gqw0.j, fetVar14, 0);
                    int iHashCode6 = Long.hashCode(fetVar14.T);
                    bh90 bh90VarM6 = fetVar14.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar14, jm40Var);
                    mkd.c0.getClass();
                    fetVar14.i0();
                    if (fetVar14.S) {
                        fetVar14.l(pcyVar);
                    } else {
                        fetVar14.r0();
                    }
                    jpm0.o(fetVar14, thg0VarA6, gqw0.x);
                    jpm0.o(fetVar14, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar14, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar14);
                    jpm0.o(fetVar14, mm40VarC5, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                    String str4 = owmVar.f25971a;
                    dlk dlkVar = owmVar.f;
                    aac.x(mm40VarA, str4, owmVar.d, fetVar14, 0);
                    boolean zG = fetVar14.g(dlkVar);
                    Object objP4 = fetVar14.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(dlkVar.f6286a, dlkVar.b, dlkVar.c, dlkVar.d, new hpm(0L, 3)));
                        fetVar14.o0(objP4);
                    }
                    zcl zclVar6 = qmk.f28987a;
                    aac.z(zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), (mpm) objP4, owmVar.h, fetVar14, 0);
                    aac.D(zhg0Var.a(1.0f, jm40Var, true), owmVar.b, owmVar.e, fetVar14, 0);
                    fetVar14.r(true);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            default:
                qwm qwmVar = (qwm) obj3;
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    thg0 thg0VarA7 = shg0.a(uc9.f35418a, gqw0.j, fetVar15, 0);
                    int iHashCode7 = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM7 = fetVar15.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar15, jm40Var);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(pcyVar);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, thg0VarA7, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar15);
                    jpm0.o(fetVar15, mm40VarC6, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String str5 = qwmVar.b;
                    dlk dlkVar2 = qwmVar.g;
                    ebc.J(x7zVar, str5, qwmVar.e, fetVar15, 0);
                    boolean zG2 = fetVar15.g(dlkVar2);
                    Object objP5 = fetVar15.P();
                    if (zG2 || objP5 == cl5Var) {
                        y1m y1mVar = new y1m(c2m.f3631a, new x1m(), dlkVar2.f6286a, dlkVar2.b, dlkVar2.c, dlkVar2.d);
                        fetVar15.o0(y1mVar);
                        objP5 = y1mVar;
                    }
                    zcl zclVar7 = qmk.f28987a;
                    ebc.L(s5x0.L(jm40Var, 8.0f, 0.0f, 2), (a2m) objP5, qwmVar.h, fetVar15, 0);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    ebc.Q(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qwmVar.c, qwmVar.f, fetVar15, 0);
                    fetVar15.r(true);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ i3l(Object obj, int i, byte b) {
        this.f14102a = b;
        this.b = obj;
    }
}
