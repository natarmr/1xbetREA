package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i4a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14138a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i4a0(roh rohVar, toh tohVar, boolean z, roh rohVar2) {
        this.f14138a = (byte) 13;
        this.d = rohVar;
        this.c = tohVar;
        this.b = z;
        this.e = rohVar2;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iL = x8x.L(3073);
        tlb.y((mm40) this.d, (tym) this.c, (p6x) this.e, this.b, (fet) obj, iL);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        byte b = this.f14138a;
        pcy pcyVar = e7z.u1;
        boolean z = this.b;
        cl5 cl5Var = ukd.f35823a;
        mm40 mm40VarD0 = jm40.b;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ia00 ia00Var = (ia00) obj8;
                Function1 function1 = (Function1) obj7;
                k6z k6zVar = (k6z) obj6;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE = o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 56.0f);
                    zfn zfnVar = zaq0.b;
                    long backgroundGroup = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundGroup();
                    zcl zclVar2 = qmk.f28987a;
                    boolean z2 = ia00Var.e;
                    mm40 mm40VarQ = i120.Q(mm40VarE, backgroundGroup, new ugg0(zclVar2, zclVar2, z2 ? qmk.f : zclVar2, z2 ? qmk.f : zclVar2));
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    mm40 mm40VarE2 = o7k0.e(s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2), 56.0f);
                    long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                    zcl zclVar3 = qmk.e;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarE2, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar.g(function1) | fetVar.g(ia00Var);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new qw80((Object) function1, (Object) ia00Var, (byte) 14);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarW = y860.W(mm40VarQ2, gy40Var, null, false, null, (Function0) objP2, 28);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    n0q n0qVar = o7k0.c;
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar), new m78(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 5), null, 10);
                    k7x.b(ia00Var.d, null, lgb.J(o7k0.n(s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), 32.0f), vgg0.f37379a), oilVarT, oilVarT, oilVarT, null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
                    obc.d(bmd.n.a(k6zVar), u1c.M(268357125, new q2n(z, (Object) k6zVar, (Object) ia00Var, (byte) 17), fetVar), fetVar, 56);
                    ohs0.x(fetVar, true, true, true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                j47.b0((mm40) obj8, (my30) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                pz40 pz40Var = (pz40) obj8;
                String strL = (String) obj7;
                String str = (String) obj6;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD0, 8.0f, 0.0f, 2);
                    zhg0 zhg0Var = zhg0.f44392a;
                    mm40 mm40VarC = o7k0.c(zhg0Var.a(1.0f, mm40VarL, true), 1.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarC);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, gqw0.v);
                    mm40 mm40VarA = zhg0Var.a(1.0f, mm40VarD0, true);
                    yx7 yx7Var = gqw0.k;
                    mm40 mm40VarB = zhg0Var.b(yx7Var, mm40VarA);
                    int i = z ? 6 : 5;
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        strL = kng0.l(strL, Separators.SP, str);
                    }
                    String str2 = strL;
                    zfn zfnVar2 = zaq0.b;
                    long textPrimary = ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary();
                    zfn zfnVar3 = j1t0.e;
                    ((g1t0) fetVar2.k(zfnVar3)).getClass();
                    y9q0 y9q0VarM = g1t0.m();
                    f2q0 f2q0Var = new f2q0(i);
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new we(pz40Var, (byte) 2);
                        fetVar2.o0(objP3);
                    }
                    v8q0.a(str2, mm40VarB, textPrimary, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, (Function1) objP3, y9q0VarM, fetVar2, 0, 1597824, 44024);
                    if (((Boolean) pz40Var.getValue()).booleanValue()) {
                        fetVar2.e0(113060172);
                        mm40 mm40VarB2 = zhg0Var.b(yx7Var, mm40VarD0);
                        int i2 = z ? 6 : 5;
                        long textPrimary2 = ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary();
                        ((g1t0) fetVar2.k(zfnVar3)).getClass();
                        v8q0.a(str, mm40VarB2, textPrimary2, null, 0L, null, null, null, 0L, new f2q0(i2), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar2, 0, 24960, 109560);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(113637330);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                ugd ugdVar = (ugd) obj7;
                nyq0 nyq0Var = (nyq0) obj6;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k("staticContentId", (ugd) obj8);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), p4eVar.f26347a, arrayList, iE, 1)) {
                }
                List listK2 = c5n0Var.k("dynamicContentId", ugdVar);
                ArrayList arrayList2 = new ArrayList(listK2.size());
                int size2 = listK2.size();
                for (int iE2 = 0; iE2 < size2; iE2 = w6x.e((pj30) listK2.get(iE2), p4eVar.f26347a, arrayList2, iE2, 1)) {
                }
                int i3 = 1;
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i4 = ((pu90) obj3).b;
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        int i5 = 1;
                        while (true) {
                            Object obj9 = arrayList.get(i5);
                            int i6 = ((pu90) obj9).b;
                            if (i4 < i6) {
                                obj3 = obj9;
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
                    nyq0Var.getState().f26070a = 0.0f;
                } else {
                    if (arrayList2.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList2.get(0);
                        int i7 = ((pu90) obj4).b;
                        int size4 = arrayList2.size() - 1;
                        if (1 <= size4) {
                            int i8 = 1;
                            while (true) {
                                Object obj10 = arrayList2.get(i8);
                                int i9 = ((pu90) obj10).b;
                                if (i7 < i9) {
                                    i7 = i9;
                                    obj4 = obj10;
                                }
                                if (i8 != size4) {
                                    i8++;
                                }
                            }
                        }
                    }
                    pu90 pu90Var2 = (pu90) obj4;
                    float f = pu90Var2 != null ? pu90Var2.b : 0.0f;
                    if (arrayList.isEmpty()) {
                        obj5 = null;
                    } else {
                        Object obj11 = arrayList.get(0);
                        int i10 = ((pu90) obj11).b;
                        int size5 = arrayList.size() - 1;
                        if (1 <= size5) {
                            while (true) {
                                Object obj12 = arrayList.get(i3);
                                int i11 = ((pu90) obj12).b;
                                if (i10 < i11) {
                                    obj11 = obj12;
                                    i10 = i11;
                                }
                                if (i3 != size5) {
                                    i3++;
                                }
                            }
                        }
                        obj5 = obj11;
                    }
                    pu90 pu90Var3 = (pu90) obj5;
                    float f2 = pu90Var3 != null ? pu90Var3.b : 0.0f;
                    float fL = nyq0Var.getState().c.l();
                    float f3 = -f;
                    float fC = l1e0.c(fL, f3, 0.0f);
                    if (fL != fC) {
                        nyq0Var.getState().c(fC);
                    }
                    oyq0 state = nyq0Var.getState();
                    if (z) {
                        f3 = 0.0f;
                    }
                    state.f26070a = f3;
                    float f4 = f2 + f;
                    fA = rw2.a(fA, f4, nyq0Var.getState().a(), f4);
                    kie0Var.f18333a = si30.b((((f2 - f) - f2) * nyq0Var.getState().a()) + f2);
                }
                return vj30.x(c5n0Var, p4e.i(p4eVar.f26347a), si30.b(fA), new gi0(arrayList2, arrayList, kie0Var, (byte) 0));
            case 4:
                ((Integer) obj2).getClass();
                m0x0.e((mm40) obj8, (q84) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                eeq.j((mm40) obj8, (cws) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                oja0.p((mm40) obj8, this.b, (aq7) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                x4d0.h((mm40) obj8, (dn7) obj7, (Function0) obj6, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                fre0.g((mm40) obj8, (p18) obj7, (hz7) obj6, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                dj8.k((String) obj8, (String) obj7, (cb8) obj6, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                oja0.i((mm40) obj8, (zbr) obj6, (Function1) obj7, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 11:
                Function0 function0 = (Function0) obj8;
                on5 on5Var = (on5) obj7;
                pz40 pz40Var2 = (pz40) obj6;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarW2 = y860.W(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, false, null, function0, 28);
                    thg0 thg0VarA3 = shg0.a(z ? uc9.b : uc9.f35418a, gqw0.k, fetVar3, 48);
                    int iHashCode5 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM5 = fetVar3.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar3);
                    x7z x7zVarI = ohs0.i(fetVar3, mm40VarC4, gqw0.v, 1.0f, false);
                    dn5 dn5Var = (dn5) on5Var;
                    String str3 = dn5Var.f6351a;
                    y9q0 y9q0VarT = ibm0.t(g1t0.w(), fetVar3);
                    n05 n05Var = new n05(idm0.t(12), idm0.t(14), qmk.n);
                    Object objP4 = fetVar3.P();
                    if (objP4 == cl5Var) {
                        objP4 = new ca6(pz40Var2, (byte) 12);
                        fetVar3.o0(objP4);
                    }
                    aad.e(str3, x7zVarI, y9q0VarT, (Function1) objP4, 2, false, 1, 0, null, n05Var, fetVar3, 1600512, Response.UNSUPPORTED_URI_SCHEME);
                    v8q0.a(dn5Var.b, s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, ((daq0) pz40Var2.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.j(), fetVar3), fetVar3, 0, 24576, 114668);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                uzb.f((mm40) obj8, (b7h) obj6, (Function1) obj7, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 13:
                roh rohVar = (roh) obj8;
                toh tohVar = (toh) obj7;
                roh rohVar2 = (roh) obj6;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40VarD0, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarL2 = s5x0.L(o7k0.e(mm40VarD, 54.0f), 8.0f, 0.0f, 2);
                    thg0 thg0VarA4 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar4, 48);
                    int iHashCode6 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM6 = fetVar4.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar4, mm40VarL2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC5, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    u1c.q(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), rohVar, tohVar == toh.f34283a, true, fetVar4, 3072);
                    u1c.m(0, fetVar4, z);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    u1c.q(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), rohVar2, tohVar == toh.b, false, fetVar4, 3072);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                i120.b((mm40) obj8, (sql) obj7, (sql) obj6, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                n4c.v((String) obj8, (o0x) obj7, this.b, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                uba ubaVar = (uba) obj8;
                Function0 function2 = (Function0) obj7;
                Function0 function3 = (Function0) obj6;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.X();
                } else if (ubaVar instanceof pba) {
                    fetVar5.e0(-1522661855);
                    vzb.f(new eca(((pba) ubaVar).b), z, function2, function3, fetVar5);
                    fetVar5.r(false);
                } else if (ubaVar instanceof qba) {
                    fetVar5.e0(-1522275967);
                    vzb.f(new fca(((qba) ubaVar).f28439a), z, function2, function3, fetVar5);
                    fetVar5.r(false);
                } else if (ubaVar instanceof rba) {
                    fetVar5.e0(-1521894047);
                    vzb.f(new gca(((rba) ubaVar).f30174a), z, function2, function3, fetVar5);
                    fetVar5.r(false);
                } else if (ubaVar instanceof sba) {
                    fetVar5.e0(-1521507167);
                    vzb.f(new hca(((sba) ubaVar).f31922a), z, function2, function3, fetVar5);
                    fetVar5.r(false);
                } else {
                    if (!(ubaVar instanceof tba)) {
                        throw b1j.f(1474901489, fetVar5, false);
                    }
                    fetVar5.e0(-1521124255);
                    vzb.f(new ica(((tba) ubaVar).f33653a), z, function2, function3, fetVar5);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                plc.k((mm40) obj8, (d6l0) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                lmc.o((mm40) obj8, (k6l0) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                q56 q56Var = (q56) obj8;
                Function1 function4 = (Function1) obj7;
                Function1 function5 = (Function1) obj6;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar6.e0(-1699591728);
                    if (function5 != null) {
                        fetVar6.e0(-1565263946);
                        boolean zG2 = fetVar6.g(function5);
                        Object objP5 = fetVar6.P();
                        if (zG2 || objP5 == cl5Var) {
                            objP5 = new btm(function5, (byte) 0);
                            fetVar6.o0(objP5);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP5);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-1565099863);
                        fetVar6.r(false);
                    }
                    mm40 mm40Var = mm40VarD0;
                    fetVar6.r(false);
                    rcb.z(mm40Var, q56Var.c(), this.b, function4, fetVar6, 0, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 20:
                w56 w56Var = (w56) obj8;
                Function1 function6 = (Function1) obj7;
                Function1 function7 = (Function1) obj6;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar7.e0(-623677728);
                    if (function7 != null) {
                        fetVar7.e0(1723298982);
                        boolean zG3 = fetVar7.g(function7);
                        Object objP6 = fetVar7.P();
                        if (zG3 || objP6 == cl5Var) {
                            objP6 = new btm(function7, (byte) 1);
                            fetVar7.o0(objP6);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP6);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1723463065);
                        fetVar7.r(false);
                    }
                    mm40 mm40Var2 = mm40VarD0;
                    fetVar7.r(false);
                    rcb.z(mm40Var2, w56Var.c(), this.b, function6, fetVar7, 0, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                xkb.d((mm40) obj8, (String) obj7, (kpm) obj6, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                vum vumVar = (vum) obj8;
                vum vumVar2 = (vum) obj7;
                a2m a2mVar = (a2m) obj6;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(mm40VarD0, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD2, 80.0f), "MIDDLE_ROW_V4");
                    thg0 thg0VarA5 = shg0.a(uc9.f35418a, gqw0.j, fetVar8, 0);
                    int iHashCode7 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM7 = fetVar8.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar8, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, thg0VarA5, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC6, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    dyb.C(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "FIRST_OPPONENT_CONTAINER_V4"), vumVar, fetVar8, 0);
                    dyb.c(o2e.e0(mm40VarD0, "CENTER_CONTAINER_V4"), vumVar, vumVar2, a2mVar, this.b, fetVar8, 6);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    dyb.C(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "SECOND_OPPONENT_CONTAINER_V4"), vumVar2, fetVar8, 0);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                e3c.h((mm40) obj8, (tfa) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                v3c.p((mm40) obj8, (zfa) obj6, this.b, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                n4c.y((mm40) obj8, (String) obj7, (mpm) obj6, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b2o0 b2o0Var = (b2o0) obj8;
                Function1 function8 = (Function1) obj7;
                Function1 function9 = (Function1) obj6;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    fetVar9.e0(-751758702);
                    if (function9 != null) {
                        fetVar9.e0(294107158);
                        boolean zG4 = fetVar9.g(function9);
                        Object objP7 = fetVar9.P();
                        if (zG4 || objP7 == cl5Var) {
                            objP7 = new btm(function9, (byte) 2);
                            fetVar9.o0(objP7);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP7);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(294271241);
                        fetVar9.r(false);
                    }
                    mm40 mm40Var3 = mm40VarD0;
                    fetVar9.r(false);
                    rcb.z(mm40Var3, b2o0Var.c(), this.b, function8, fetVar9, 0, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                v1o0 v1o0Var = (v1o0) obj8;
                Function1 function10 = (Function1) obj7;
                Function1 function11 = (Function1) obj6;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    fetVar10.e0(-488295948);
                    if (function11 != null) {
                        fetVar10.e0(-1462739596);
                        boolean zG5 = fetVar10.g(function11);
                        Object objP8 = fetVar10.P();
                        if (zG5 || objP8 == cl5Var) {
                            objP8 = new btm(function11, (byte) 3);
                            fetVar10.o0(objP8);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP8);
                        fetVar10.r(false);
                    } else {
                        fetVar10.e0(-1462575513);
                        fetVar10.r(false);
                    }
                    mm40 mm40Var4 = mm40VarD0;
                    fetVar10.r(false);
                    rcb.z(mm40Var4, v1o0Var.c(), this.b, function10, fetVar10, 0, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return a(obj, obj2);
            default:
                c1n c1nVar = (c1n) obj8;
                c1n c1nVar2 = (c1n) obj7;
                a2m a2mVar2 = (a2m) obj6;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    bsr0.G(null, c1nVar, c1nVar2, a2mVar2, this.b, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ i4a0(byte b, int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f14138a = b;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i4a0(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f14138a = b;
        this.d = mm40Var;
        this.c = obj;
        this.e = obj2;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i4a0(mm40 mm40Var, Object obj, Function1 function1, int i, int i2, byte b) {
        this.f14138a = b;
        this.d = mm40Var;
        this.e = obj;
        this.c = function1;
        this.b = i2;
    }

    public /* synthetic */ i4a0(mm40 mm40Var, Object obj, boolean z, Function1 function1, int i, byte b) {
        this.f14138a = b;
        this.d = mm40Var;
        this.e = obj;
        this.b = z;
        this.c = function1;
    }

    public /* synthetic */ i4a0(mm40 mm40Var, boolean z, aq7 aq7Var, Function1 function1, int i) {
        this.f14138a = (byte) 6;
        this.d = mm40Var;
        this.b = z;
        this.e = aq7Var;
        this.c = function1;
    }

    public /* synthetic */ i4a0(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.f14138a = b;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ i4a0(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.f14138a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ i4a0(String str, o0x o0xVar, boolean z, Function0 function0, int i) {
        this.f14138a = (byte) 15;
        this.d = str;
        this.c = o0xVar;
        this.b = z;
        this.e = function0;
    }

    public /* synthetic */ i4a0(boolean z, pz40 pz40Var, String str, String str2) {
        this.f14138a = (byte) 2;
        this.b = z;
        this.d = pz40Var;
        this.c = str;
        this.e = str2;
    }
}
