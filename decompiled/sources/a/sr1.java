package a;

import android.content.res.Resources;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32654a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr1(gu1 gu1Var, String str) {
        this.f32654a = (byte) 1;
        this.c = gu1Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        clz clzVar;
        ugd ugdVarM;
        fet fetVar;
        wpq wpqVar;
        pkk0 pkk0Var;
        ugd ugdVar;
        byte b = this.f32654a;
        jm40 jm40Var = jm40.b;
        byte b2 = 25;
        byte b3 = 17;
        pcy pcyVar = e7z.u1;
        byte b4 = 15;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dj8.d((String) obj4, (czr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                gu1 gu1Var = (gu1) obj3;
                String str = (String) obj4;
                yu1 yu1Var = (yu1) obj2;
                ((oyg0) obj).getClass();
                yu1Var.getClass();
                List list = gu1Var.r;
                int iA = wp20.a(r3d.q(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
                for (Object obj5 : list) {
                    linkedHashMap.put(Long.valueOf(((mlr) obj5).f22006a), obj5);
                }
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                boolean z = gu1Var.e.f16071a.f44716a > 0 ? false : yu1Var.r;
                at1 at1Var = at1.f1413a;
                ct1 ct1Var = ct1.f4914a;
                return yu1.a(yu1Var, null, false, null, at1Var, ct1Var, at1Var, ct1Var, gu1Var, linkedHashMap, z, false, false, str, iunVar, lunVar, null, null, 25983103);
            case 2:
                ((Integer) obj2).getClass();
                ohq0.g((mm40) obj4, (ax0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                x4d0.c((w02) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                ohq0.h((mm40) obj4, (a32) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                n32 n32Var = (n32) obj2;
                ((oyg0) obj).getClass();
                n32Var.getClass();
                n32 n32VarA = n32.a(n32Var, null, null, null, b32.a(n32Var.d, null, null, (LinkedHashSet) obj4, 7), null, null, 247);
                ((org.xplatform.special_event.impl.alleventsgames.presentation.f) obj3).o.e("EXPANDED_IDS_KEY", n32VarA.d.d);
                return n32VarA;
            case 6:
                ((Integer) obj2).getClass();
                hp4.c((mm40) obj4, (f3w) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                float fFloatValue = ((Float) obj).floatValue();
                ((nv2) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((jie0) obj3).f16571a = fFloatValue;
                return Unit.f46060a;
            case 8:
                ugd ugdVar2 = (ugd) obj4;
                yv2 yv2Var = (yv2) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    ugdVar2.F(yv2Var, fetVar2, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 9:
                ugd ugdVar3 = (ugd) obj4;
                zv2 zv2Var = (zv2) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    ugdVar3.F(zv2Var, fetVar3, 6);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 10:
                iy2 iy2Var = (iy2) obj3;
                int iIntValue3 = ((Integer) obj).intValue();
                tai0 tai0Var = (tai0) obj2;
                if (!((uai0) obj4).b.c(tai0Var.f)) {
                    iy2Var.h(iIntValue3, tai0Var);
                    iy2Var.g.f(Unit.f46060a);
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                y9a.r((mm40) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                kc5.m0((imm) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                l7m0 l7m0Var = (l7m0) obj4;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG = fetVar4.g(l7m0Var);
                    Object objP = fetVar4.P();
                    if (zG || objP == cl5Var) {
                        objP = new yd1(l7m0Var, (byte) 16);
                        fetVar4.o0(objP);
                    }
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(i4w0.T(jm40Var2, (Function1) objP), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 64.0f, 0.0f, 10);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarN);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                    String str2 = ((t9f0) l7m0Var2.getValue()).f33560a;
                    y9q0 y9q0VarU = g1t0.u();
                    zfn zfnVar = zaq0.b;
                    v8q0.a(str2, null, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarU, fetVar4, 0, 24960, 109562);
                    String str3 = ((t9f0) l7m0Var2.getValue()).b;
                    if (str3.length() > 0) {
                        fetVar4.e0(-1156023698);
                        v8q0.a(str3, s5x0.N(jm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar4.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar4, 0, 24960, 109560);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1155608949);
                        fetVar4.r(false);
                    }
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 14:
                ApplicationActivity applicationActivity = (ApplicationActivity) obj4;
                ComposeView composeView = (ComposeView) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i = ApplicationActivity.F1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z2 = ((xkb0) gkb.Q(applicationActivity.F().g0, null, fetVar5, 0, 7).getValue()) != null;
                    composeView.setVisibility(z2 ? 0 : 8);
                    if (z2) {
                        fetVar5.e0(1970402375);
                        z7z z7zVar = applicationActivity.s1;
                        if (z7zVar == null) {
                            Intrinsics.h("navDestinations");
                            throw null;
                        }
                        Object obj6 = z7zVar.get();
                        obj6.getClass();
                        ib50 ib50Var = (ib50) obj6;
                        ArrayList arrayListW = v3c.W(c9x.H(tfx.I(ib50Var, fetVar5), new rb50[]{vj60.INSTANCE}, fetVar5), q3d.j(u7x.G(fetVar5), a4n0.k(fetVar5)), mrv.n0(ib50Var.f14471a, null, fetVar5, 0, 2), fetVar5, 0);
                        Object objP2 = fetVar5.P();
                        if (objP2 == cl5Var) {
                            objP2 = new f33(b2);
                            fetVar5.o0(objP2);
                        }
                        ufx.g(arrayListW, null, null, null, null, null, null, null, (Function0) objP2, fetVar5, 0, 6, 1022);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(1971164448);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 15:
                cj4 cj4Var = (cj4) obj4;
                mm40 mm40Var = (mm40) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gfk0 gfk0Var = cj4.U1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    float f = ((Resources) fetVar6.k(dy2.c)).getDisplayMetrics().density;
                    long jB = ((yez) ((rhv0) fetVar6.k(bmd.u))).b();
                    Object objP3 = fetVar6.P();
                    if (objP3 == cl5Var) {
                        ujv0 ujv0Var = new ujv0(((int) (jB >> 32)) / f, ((int) (jB & 4294967295L)) / f);
                        fetVar6.o0(ujv0Var);
                        objP3 = ujv0Var;
                    }
                    ujv0 ujv0Var2 = (ujv0) objP3;
                    wpq wpqVar2 = (wpq) fetVar6.k(bmd.i);
                    pkk0 pkk0Var2 = (pkk0) fetVar6.k(bmd.q);
                    final pz40 pz40VarY = ((i3t0) cj4Var.G0()).y(fetVar6);
                    k3t0 k3t0VarG0 = cj4Var.G0();
                    boolean zI = fetVar6.i(cj4Var);
                    Object objP4 = fetVar6.P();
                    if (zI || objP4 == cl5Var) {
                        objP4 = new j94(1, cj4Var, cj4.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/login/visual/impl/presentation/AuthLoginVisualSideEffect;)V", 0, (byte) 6);
                        fetVar6.o0(objP4);
                    }
                    clz clzVar2 = (clz) fetVar6.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar6);
                    boolean zI2 = fetVar6.i(k3t0VarG0) | fetVar6.i(clzVar2) | fetVar6.e(3) | fetVar6.g(pz40VarF);
                    Object objP5 = fetVar6.P();
                    if (zI2 || objP5 == cl5Var) {
                        objP5 = new pc(k3t0VarG0, clzVar2, pz40VarF, null, (byte) 1);
                        clzVar = clzVar2;
                        fetVar6.o0(objP5);
                    } else {
                        clzVar = clzVar2;
                    }
                    m0x0.t(fetVar6, clzVar, (Function2) objP5);
                    Object[] objArr = new Object[0];
                    boolean zG2 = fetVar6.g(pz40VarY);
                    Object objP6 = fetVar6.P();
                    if (zG2 || objP6 == cl5Var) {
                        objP6 = new we4(pz40VarY, (byte) 9);
                        fetVar6.o0(objP6);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar6);
                    Object[] objArr2 = new Object[0];
                    boolean zG3 = fetVar6.g(pz40VarY);
                    Object objP7 = fetVar6.P();
                    if (zG3 || objP7 == cl5Var) {
                        objP7 = new we4(pz40VarY, (byte) 13);
                        fetVar6.o0(objP7);
                    }
                    l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar6);
                    Object[] objArr3 = new Object[0];
                    boolean zG4 = fetVar6.g(l7m0VarY2);
                    Object objP8 = fetVar6.P();
                    if (zG4 || objP8 == cl5Var) {
                        objP8 = new we4(l7m0VarY2, (byte) 14);
                        fetVar6.o0(objP8);
                    }
                    l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar6);
                    Object[] objArr4 = new Object[0];
                    boolean zG5 = fetVar6.g(pz40VarY);
                    Object objP9 = fetVar6.P();
                    if (zG5 || objP9 == cl5Var) {
                        objP9 = new we4(pz40VarY, b4);
                        fetVar6.o0(objP9);
                    }
                    l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar6);
                    Object[] objArr5 = new Object[0];
                    boolean zG6 = fetVar6.g(pz40VarY);
                    Object objP10 = fetVar6.P();
                    if (zG6 || objP10 == cl5Var) {
                        objP10 = new we4(pz40VarY, (byte) 16);
                        fetVar6.o0(objP10);
                    }
                    final l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar6);
                    Object[] objArr6 = new Object[0];
                    boolean zG7 = fetVar6.g(pz40VarY);
                    Object objP11 = fetVar6.P();
                    if (zG7 || objP11 == cl5Var) {
                        objP11 = new we4(pz40VarY, (byte) 17);
                        fetVar6.o0(objP11);
                    }
                    final l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar6);
                    Object[] objArr7 = new Object[0];
                    boolean zG8 = fetVar6.g(pz40VarY);
                    Object objP12 = fetVar6.P();
                    if (zG8 || objP12 == cl5Var) {
                        objP12 = new we4(pz40VarY, (byte) 18);
                        fetVar6.o0(objP12);
                    }
                    l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar6);
                    Object[] objArr8 = new Object[0];
                    boolean zG9 = fetVar6.g(pz40VarY);
                    Object objP13 = fetVar6.P();
                    if (zG9 || objP13 == cl5Var) {
                        objP13 = new we4(pz40VarY, (byte) 19);
                        fetVar6.o0(objP13);
                    }
                    final l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar6);
                    Object[] objArr9 = new Object[0];
                    boolean zG10 = fetVar6.g(pz40VarY);
                    Object objP14 = fetVar6.P();
                    if (zG10 || objP14 == cl5Var) {
                        objP14 = new we4(pz40VarY, (byte) 20);
                        fetVar6.o0(objP14);
                    }
                    final l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar6);
                    Object[] objArr10 = new Object[0];
                    boolean zG11 = fetVar6.g(pz40VarY);
                    Object objP15 = fetVar6.P();
                    if (zG11 || objP15 == cl5Var) {
                        objP15 = new we4(pz40VarY, (byte) 21);
                        fetVar6.o0(objP15);
                    }
                    l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar6);
                    Object[] objArr11 = new Object[0];
                    boolean zG12 = fetVar6.g(pz40VarY);
                    Object objP16 = fetVar6.P();
                    if (zG12 || objP16 == cl5Var) {
                        objP16 = new we4(pz40VarY, (byte) 10);
                        fetVar6.o0(objP16);
                    }
                    final l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar6);
                    Object[] objArr12 = new Object[0];
                    boolean zG13 = fetVar6.g(pz40VarY);
                    Object objP17 = fetVar6.P();
                    if (zG13 || objP17 == cl5Var) {
                        objP17 = new we4(pz40VarY, (byte) 11);
                        fetVar6.o0(objP17);
                    }
                    final l7m0 l7m0VarY12 = v3c.Y(objArr12, (Function0) objP17, fetVar6);
                    Object[] objArr13 = new Object[0];
                    boolean zG14 = fetVar6.g(pz40VarY);
                    Object objP18 = fetVar6.P();
                    if (zG14 || objP18 == cl5Var) {
                        objP18 = new we4(pz40VarY, (byte) 12);
                        fetVar6.o0(objP18);
                    }
                    final l7m0 l7m0VarY13 = v3c.Y(objArr13, (Function0) objP18, fetVar6);
                    boolean zI3 = fetVar6.i(cj4Var);
                    Object objP19 = fetVar6.P();
                    if (zI3 || objP19 == cl5Var) {
                        objP19 = new ui4(cj4Var, (byte) 1);
                        fetVar6.o0(objP19);
                    }
                    Function0 function0 = (Function0) objP19;
                    boolean zI4 = fetVar6.i(cj4Var);
                    Object objP20 = fetVar6.P();
                    if (zI4 || objP20 == cl5Var) {
                        objP20 = new ui4(cj4Var, (byte) 2);
                        fetVar6.o0(objP20);
                    }
                    v3c.A(function0, (Function0) objP20, null, fetVar6, 0, 4);
                    boolean zI5 = fetVar6.i(cj4Var);
                    Object objP21 = fetVar6.P();
                    if (zI5 || objP21 == cl5Var) {
                        objP21 = new ui4(cj4Var, (byte) 3);
                        fetVar6.o0(objP21);
                    }
                    knx.i(false, (Function0) objP21, fetVar6, 0, 1);
                    if (((Boolean) l7m0VarY4.getValue()).booleanValue()) {
                        fetVar6.e0(1909282060);
                        ugdVarM = u1c.M(-1448183857, new ec30(wpqVar2, pkk0Var2, (byte) 6), fetVar6);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1909541839);
                        fetVar6.r(false);
                        ugdVarM = null;
                    }
                    if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                        fetVar6.e0(1914609162);
                        fetVar = fetVar6;
                        en0 en0Var = new en0(ujv0Var2, l7m0VarY, l7m0VarY2, wpqVar2, pkk0Var2, cj4Var);
                        wpqVar = wpqVar2;
                        pkk0Var = pkk0Var2;
                        cj4Var = cj4Var;
                        ugd ugdVarM2 = u1c.M(975525145, en0Var, fetVar);
                        fetVar.r(false);
                        ugdVar = ugdVarM2;
                    } else {
                        fetVar = fetVar6;
                        wpqVar = wpqVar2;
                        pkk0Var = pkk0Var2;
                        fetVar.e0(1915270639);
                        fetVar.r(false);
                        ugdVar = null;
                    }
                    ugd ugdVarM3 = u1c.M(-2135938922, new vi4(cj4Var, l7m0VarY10), fetVar);
                    final cj4 cj4Var2 = cj4Var;
                    ugd ugdVarM4 = u1c.M(52036334, new g54((Object) l7m0VarY7, (Object) wpqVar, (Object) pkk0Var, (Object) cj4Var2, (byte) 3), fetVar);
                    final pkk0 pkk0Var3 = pkk0Var;
                    fet fetVar7 = fetVar;
                    final wpq wpqVar3 = wpqVar;
                    eeq.h(mm40Var, ugdVarM3, ugdVarM4, u1c.M(1481781800, new ydr() { // from class: a.wi4
                        @Override // a.ydr
                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                            ugd ugdVarM5;
                            final pkk0 pkk0Var4;
                            final cj4 cj4Var3;
                            ugd ugdVar4;
                            mm40 mm40Var2 = (mm40) obj8;
                            fet fetVar8 = (fet) obj9;
                            int iIntValue7 = ((Integer) obj10).intValue();
                            gfk0 gfk0Var2 = cj4.U1;
                            ((y5d) obj7).getClass();
                            mm40Var2.getClass();
                            if ((iIntValue7 & 48) == 0) {
                                iIntValue7 |= fetVar8.g(mm40Var2) ? 32 : 16;
                            }
                            byte b5 = 1;
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                wul wulVar = ((vj4) pz40VarY.getValue()).m;
                                l7m0 l7m0Var3 = l7m0VarY6;
                                wul wulVar2 = (wul) l7m0Var3.getValue();
                                cj4 cj4Var4 = cj4Var2;
                                ugd ugdVarM6 = null;
                                if (wulVar2 != null) {
                                    fetVar8.e0(89392867);
                                    ugdVarM5 = u1c.M(-1116090450, new vi4(l7m0Var3, cj4Var4, b5), fetVar8);
                                    fetVar8.r(false);
                                } else {
                                    fetVar8.e0(90374357);
                                    fetVar8.r(false);
                                    ugdVarM5 = null;
                                }
                                final wul wulVar3 = (wul) l7m0VarY11.getValue();
                                final wpq wpqVar4 = wpqVar3;
                                pkk0 pkk0Var5 = pkk0Var3;
                                if (wulVar3 == null) {
                                    fetVar8.e0(91208195);
                                    fetVar8.r(false);
                                    pkk0Var4 = pkk0Var5;
                                    cj4Var3 = cj4Var4;
                                    ugdVar4 = null;
                                } else {
                                    fetVar8.e0(91208196);
                                    final byte b6 = 0;
                                    pkk0Var4 = pkk0Var5;
                                    cj4Var3 = cj4Var4;
                                    ugd ugdVarM7 = u1c.M(-1924064045, new ydr() { // from class: a.yi4
                                        @Override // a.ydr
                                        public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                            byte b7 = b6;
                                            cl5 cl5Var2 = ukd.f35823a;
                                            cj4 cj4Var5 = cj4Var3;
                                            pkk0 pkk0Var6 = pkk0Var4;
                                            wpq wpqVar5 = wpqVar4;
                                            switch (b7) {
                                                case 0:
                                                    mm40 mm40Var3 = (mm40) obj12;
                                                    fet fetVar9 = (fet) obj13;
                                                    int iIntValue8 = ((Integer) obj14).intValue();
                                                    gfk0 gfk0Var3 = cj4.U1;
                                                    ((y5d) obj11).getClass();
                                                    mm40Var3.getClass();
                                                    if ((iIntValue8 & 48) == 0) {
                                                        iIntValue8 |= fetVar9.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                                                        zcl zclVar2 = qmk.f28987a;
                                                        mm40 mm40VarE = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7).e(mm40Var3);
                                                        boolean zI6 = fetVar9.i(wpqVar5) | fetVar9.g(pkk0Var6) | fetVar9.i(cj4Var5);
                                                        Object objP22 = fetVar9.P();
                                                        if (zI6 || objP22 == cl5Var2) {
                                                            objP22 = new zi4(wpqVar5, pkk0Var6, cj4Var5, (byte) 2);
                                                            fetVar9.o0(objP22);
                                                        }
                                                        qzb.n(mm40VarE, wulVar3, (Function0) objP22, fetVar9, 0, 0);
                                                    } else {
                                                        fetVar9.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var4 = (mm40) obj12;
                                                    fet fetVar10 = (fet) obj13;
                                                    int iIntValue9 = ((Integer) obj14).intValue();
                                                    gfk0 gfk0Var4 = cj4.U1;
                                                    ((y5d) obj11).getClass();
                                                    mm40Var4.getClass();
                                                    if ((iIntValue9 & 48) == 0) {
                                                        iIntValue9 |= fetVar10.g(mm40Var4) ? 32 : 16;
                                                    }
                                                    if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                                                        boolean zI7 = fetVar10.i(wpqVar5) | fetVar10.g(pkk0Var6) | fetVar10.i(cj4Var5);
                                                        Object objP23 = fetVar10.P();
                                                        if (zI7 || objP23 == cl5Var2) {
                                                            objP23 = new zi4(wpqVar5, pkk0Var6, cj4Var5, (byte) 3);
                                                            fetVar10.o0(objP23);
                                                        }
                                                        qzb.n(mm40Var4, wulVar3, (Function0) objP23, fetVar10, (iIntValue9 >> 3) & 14, 0);
                                                    } else {
                                                        fetVar10.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar8);
                                    fetVar8.r(false);
                                    ugdVar4 = ugdVarM7;
                                }
                                final wul wulVar4 = (wul) l7m0VarY12.getValue();
                                if (wulVar4 == null) {
                                    fetVar8.e0(92029447);
                                    fetVar8.r(false);
                                } else {
                                    fetVar8.e0(92029448);
                                    final byte b7 = 1;
                                    ugdVarM6 = u1c.M(-1179891837, new ydr() { // from class: a.yi4
                                        @Override // a.ydr
                                        public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                            byte b8 = b7;
                                            cl5 cl5Var2 = ukd.f35823a;
                                            cj4 cj4Var5 = cj4Var3;
                                            pkk0 pkk0Var6 = pkk0Var4;
                                            wpq wpqVar5 = wpqVar4;
                                            switch (b8) {
                                                case 0:
                                                    mm40 mm40Var3 = (mm40) obj12;
                                                    fet fetVar9 = (fet) obj13;
                                                    int iIntValue8 = ((Integer) obj14).intValue();
                                                    gfk0 gfk0Var3 = cj4.U1;
                                                    ((y5d) obj11).getClass();
                                                    mm40Var3.getClass();
                                                    if ((iIntValue8 & 48) == 0) {
                                                        iIntValue8 |= fetVar9.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                                                        zcl zclVar2 = qmk.f28987a;
                                                        mm40 mm40VarE = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7).e(mm40Var3);
                                                        boolean zI6 = fetVar9.i(wpqVar5) | fetVar9.g(pkk0Var6) | fetVar9.i(cj4Var5);
                                                        Object objP22 = fetVar9.P();
                                                        if (zI6 || objP22 == cl5Var2) {
                                                            objP22 = new zi4(wpqVar5, pkk0Var6, cj4Var5, (byte) 2);
                                                            fetVar9.o0(objP22);
                                                        }
                                                        qzb.n(mm40VarE, wulVar4, (Function0) objP22, fetVar9, 0, 0);
                                                    } else {
                                                        fetVar9.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var4 = (mm40) obj12;
                                                    fet fetVar10 = (fet) obj13;
                                                    int iIntValue9 = ((Integer) obj14).intValue();
                                                    gfk0 gfk0Var4 = cj4.U1;
                                                    ((y5d) obj11).getClass();
                                                    mm40Var4.getClass();
                                                    if ((iIntValue9 & 48) == 0) {
                                                        iIntValue9 |= fetVar10.g(mm40Var4) ? 32 : 16;
                                                    }
                                                    if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                                                        boolean zI7 = fetVar10.i(wpqVar5) | fetVar10.g(pkk0Var6) | fetVar10.i(cj4Var5);
                                                        Object objP23 = fetVar10.P();
                                                        if (zI7 || objP23 == cl5Var2) {
                                                            objP23 = new zi4(wpqVar5, pkk0Var6, cj4Var5, (byte) 3);
                                                            fetVar10.o0(objP23);
                                                        }
                                                        qzb.n(mm40Var4, wulVar4, (Function0) objP23, fetVar10, (iIntValue9 >> 3) & 14, 0);
                                                    } else {
                                                        fetVar10.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar8);
                                    fetVar8.r(false);
                                }
                                ugd ugdVar5 = ugdVarM6;
                                boolean zI6 = fetVar8.i(wpqVar4) | fetVar8.g(pkk0Var4) | fetVar8.i(cj4Var3);
                                Object objP22 = fetVar8.P();
                                if (zI6 || objP22 == ukd.f35823a) {
                                    objP22 = new zi4(wpqVar4, pkk0Var4, cj4Var3, (byte) 0);
                                    fetVar8.o0(objP22);
                                }
                                wha0.e(mm40Var2, l7m0VarY5, wulVar, (Function0) objP22, u1c.M(2069280604, new vi4(l7m0VarY8, cj4Var3, (byte) 2), fetVar8), u1c.M(-1591387683, new vi4(l7m0VarY13, cj4Var3, (byte) 3), fetVar8), u1c.M(1664279622, new vi4(l7m0VarY9, cj4Var3, (byte) 4), fetVar8), ugdVarM5, ugdVar4, ugdVar5, fetVar8, ((iIntValue7 >> 3) & 14) | 1794048);
                            } else {
                                fetVar8.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar7), ugdVarM, ugdVar, fetVar7, 3504);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                bsr0.d((iq4) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                hl60 hl60Var = (hl60) obj4;
                l7m0 l7m0Var3 = (l7m0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar8.X();
                } else if (((ek60) l7m0Var3.getValue()).f7939a) {
                    fetVar8.e0(-1082989119);
                    fetVar8.r(false);
                } else {
                    fetVar8.e0(-1083255316);
                    boolean z3 = ((ek60) l7m0Var3.getValue()).b;
                    String upperCase = xsm0.s(R.string.next, fetVar8).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    boolean zI6 = fetVar8.i(hl60Var);
                    Object objP22 = fetVar8.P();
                    if (zI6 || objP22 == cl5Var) {
                        f8 f8Var = new f8(0, hl60Var, hl60.class, "onNextClick", "onNextClick()V", 0, (byte) 20);
                        fetVar8.o0(f8Var);
                        objP22 = f8Var;
                    }
                    x1x.r(0, fetVar8, upperCase, (Function0) ((jhy) objP22), z3);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                epv0.c((fr4) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                s5x0.c((px4) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 20:
                t75 t75Var = (t75) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    zfn zfnVar2 = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar9.k(zfnVar2)).getSecondary()), new plm(t75Var.f33450a, ((ThemeColors) fetVar9.k(zfnVar2)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar9.k(zfnVar2)).getBackgroundContent(), false, null);
                    boolean zG15 = fetVar9.g(function1);
                    Object objP23 = fetVar9.P();
                    if (zG15 || objP23 == cl5Var) {
                        objP23 = new fj4(function1, (byte) 24);
                        fetVar9.o0(objP23);
                    }
                    Function0 function2 = (Function0) objP23;
                    Object objP24 = fetVar9.P();
                    if (objP24 == cl5Var) {
                        objP24 = new ij4(b4);
                        fetVar9.o0(objP24);
                    }
                    hlm.c(null, immVar, null, function2, null, (Function1) objP24, null, null, null, null, null, null, fetVar9, 196608, 0, 4053);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                x8f.f((l85) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                eeq.i((qa5) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                jar0.g((mm40) obj4, (zn5) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj4;
                x6f x6fVar = (x6f) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gc6 gc6Var = (gc6) cpVar.u();
                    boolean zG16 = fetVar10.g(x6fVar) | fetVar10.i(cpVar);
                    Object objP25 = fetVar10.P();
                    if (zG16 || objP25 == cl5Var) {
                        objP25 = new gj4(x6fVar, cpVar, b4);
                        fetVar10.o0(objP25);
                    }
                    jd8.j(gc6Var, null, (Function0) objP25, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar2 = (cp) obj4;
                uwe uweVar = (uwe) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tke.n(null, (pc9) androidx.compose.runtime.e.f(((mm6) cpVar2.u()).f22022a, fetVar11).getValue(), uweVar, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                po6 po6Var = (po6) obj4;
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                sac.V(jiu0.a(po6Var), new qo5(po6Var, (Throwable) obj3, b3), null, null, new cm3(po6Var, str4, yjeVar, b2), 14);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                eeu eeuVar = (eeu) obj4;
                er6 er6Var = (er6) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    aeu aeuVar = (aeu) eeuVar;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(aeuVar.b, fetVar12);
                    boolean z4 = aeuVar.c;
                    ch80 ch80VarF = knm0.f(s5x0.t(0.0f, 0.0f, 3), fetVar12);
                    kl5 kl5Var = er6.S1;
                    as6 as6VarH0 = er6Var.H0();
                    boolean zI7 = fetVar12.i(as6VarH0);
                    Object objP26 = fetVar12.P();
                    if (zI7 || objP26 == cl5Var) {
                        objP26 = new yj5(1, as6VarH0, as6.class, "onPlayerClicked", "onPlayerClicked(Lorg/xplatform/bet_constructor/impl/core/domain/models/PlayerModel;)V", 0, (byte) 29);
                        fetVar12.o0(objP26);
                    }
                    knx.j(null, pz40VarF2, z4, ch80VarF, (Function1) ((jhy) objP26), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                return i77.a(i77Var, false, false, false, null, null, null, null, false, null, (List) obj4, false, false, false, null, null, null, null, false, null, false, false, false, (List) obj3, null, null, null, null, 2147479551, 2047);
            default:
                i77 i77Var2 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var2.getClass();
                return i77.a(i77Var2, true, false, false, null, null, null, null, false, (wdj) obj4, null, false, false, false, null, null, null, null, false, null, false, false, false, (List) obj3, null, null, null, null, 2147481598, 2047);
        }
    }

    public /* synthetic */ sr1(Object obj, Object obj2, byte b) {
        this.f32654a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ sr1(Object obj, Object obj2, int i, byte b) {
        this.f32654a = b;
        this.b = obj;
        this.c = obj2;
    }
}
