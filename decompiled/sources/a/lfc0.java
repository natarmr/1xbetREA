package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lfc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19948a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lfc0(d4n d4nVar, boolean z, Function1 function1, Function1 function2) {
        this.f19948a = (byte) 12;
        this.c = d4nVar;
        this.d = z;
        this.b = function1;
        this.e = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        fet fetVar;
        qil0 bil0Var;
        qil0 kil0Var;
        boolean z;
        Unit unit;
        byte b = this.f19948a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 2;
        boolean z2 = this.d;
        boolean z3 = false;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj6;
                final qfc0 qfc0Var = (qfc0) obj5;
                final Function1 function1 = (Function1) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6q0 c6q0Var = qfc0Var.f28625a;
                    j3x j3xVar = qfc0Var.c;
                    int i = j3xVar != null ? j3xVar.f15856a : -1;
                    boolean zG = fetVar2.g(function1) | fetVar2.g(qfc0Var);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        final byte b3 = 0;
                        objP = new Function1() { // from class: a.nfc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b4 = b3;
                                qfc0 qfc0Var2 = qfc0Var;
                                Function1 function2 = function1;
                                ((jly) obj7).getClass();
                                switch (b4) {
                                    case 0:
                                        qfc0Var2.getClass();
                                        function2.invoke(new ove0(u0f0.u));
                                        break;
                                    default:
                                        qfc0Var2.getClass();
                                        function2.invoke(new qve0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar2.g(function1) | fetVar2.g(qfc0Var);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        final byte b4 = 1;
                        objP2 = new Function1() { // from class: a.nfc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b5 = b4;
                                qfc0 qfc0Var2 = qfc0Var;
                                Function1 function3 = function1;
                                ((jly) obj7).getClass();
                                switch (b5) {
                                    case 0:
                                        qfc0Var2.getClass();
                                        function3.invoke(new ove0(u0f0.u));
                                        break;
                                    default:
                                        qfc0Var2.getClass();
                                        function3.invoke(new qve0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP2);
                    }
                    kly klyVar = new kly(function2, (Function1) objP2, null, 58);
                    boolean zG3 = fetVar2.g(function1) | fetVar2.g(qfc0Var);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new r91((Object) function1, z2, (Object) qfc0Var, (byte) 28);
                        fetVar2.o0(objP3);
                    }
                    wvb.t(mm40Var, c6q0Var, i, klyVar, (Function1) objP3, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                final rfc0 rfc0Var = (rfc0) obj5;
                final Function1 function3 = (Function1) obj4;
                mm40 mm40Var2 = (mm40) obj6;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s6q0 s6q0Var = rfc0Var.f30381a;
                    j3x j3xVar2 = rfc0Var.c;
                    int i2 = j3xVar2 != null ? j3xVar2.f15856a : -1;
                    boolean zG4 = fetVar3.g(function3) | fetVar3.g(rfc0Var);
                    Object objP4 = fetVar3.P();
                    if (zG4 || objP4 == cl5Var) {
                        final byte b5 = 0;
                        objP4 = new Function1() { // from class: a.ofc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b6 = b5;
                                rfc0 rfc0Var2 = rfc0Var;
                                Function1 function4 = function3;
                                ((jly) obj7).getClass();
                                switch (b6) {
                                    case 0:
                                        rfc0Var2.getClass();
                                        function4.invoke(new y2f0(u0f0.u));
                                        break;
                                    default:
                                        rfc0Var2.getClass();
                                        function4.invoke(new a3f0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP4);
                    }
                    Function1 function4 = (Function1) objP4;
                    boolean zG5 = fetVar3.g(function3) | fetVar3.g(rfc0Var);
                    Object objP5 = fetVar3.P();
                    if (zG5 || objP5 == cl5Var) {
                        final byte b6 = 1;
                        objP5 = new Function1() { // from class: a.ofc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b7 = b6;
                                rfc0 rfc0Var2 = rfc0Var;
                                Function1 function5 = function3;
                                ((jly) obj7).getClass();
                                switch (b7) {
                                    case 0:
                                        rfc0Var2.getClass();
                                        function5.invoke(new y2f0(u0f0.u));
                                        break;
                                    default:
                                        rfc0Var2.getClass();
                                        function5.invoke(new a3f0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP5);
                    }
                    kly klyVar2 = new kly(function4, (Function1) objP5, null, 58);
                    boolean zG6 = fetVar3.g(function3) | fetVar3.g(rfc0Var);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new r91((Object) function3, z2, (Object) rfc0Var, (byte) 29);
                        fetVar3.o0(objP6);
                    }
                    jwb.o(mm40Var2, s6q0Var, i2, klyVar2, (Function1) objP6, fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                shc0 shc0Var = (shc0) obj6;
                Function1 function5 = (Function1) obj4;
                l7m0 l7m0Var = (l7m0) obj5;
                fet fetVar4 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zH = fetVar4.h(z2);
                    Object objP7 = fetVar4.P();
                    if (zH || objP7 == cl5Var) {
                        objP7 = new fg4(b2, l7m0Var, z2);
                        fetVar4.o0(objP7);
                    }
                    mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP7);
                    String title = shc0Var.getTitle();
                    boolean zG7 = fetVar4.g(function5);
                    Object objP8 = fetVar4.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new bac0(function5, (byte) 20);
                        fetVar4.o0(objP8);
                    }
                    q0x.d(mm40VarT, title, (Function0) objP8, fetVar4, 0);
                    boolean zH2 = fetVar4.h(z2);
                    Object objP9 = fetVar4.P();
                    if (zH2 || objP9 == cl5Var) {
                        objP9 = new fg4((byte) 3, l7m0Var, z2);
                        fetVar4.o0(objP9);
                    }
                    mm40 mm40VarT2 = i4w0.T(jm40Var, (Function1) objP9);
                    boolean zG8 = fetVar4.g(function5);
                    Object objP10 = fetVar4.P();
                    if (zG8 || objP10 == cl5Var) {
                        objP10 = new bac0(function5, (byte) 19);
                        fetVar4.o0(objP10);
                    }
                    q0x.f(0, fetVar4, mm40VarT2, (Function0) objP10);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                String str = (String) obj6;
                y9q0 y9q0Var = (y9q0) obj5;
                String str2 = (String) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    v8q0.a(str, z2 ? hne.i(1.0f, false, "QUICK_BET_AMOUNT") : o2e.e0(jm40Var, "QUICK_BET_AMOUNT"), 0L, null, 0L, null, null, null, 0L, null, 0L, z2 ? 2 : 1, false, 1, 0, null, y9q0Var, fetVar5, 0, 27648, 102396);
                    if (str2.length() > 0) {
                        fetVar5.e0(974331065);
                        qxw.o(fetVar5, o7k0.s(jm40Var, 4.0f));
                        v8q0.a(str2, o2e.e0(jm40Var, "QUICK_BET_CURRENCY"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0Var, fetVar5, 48, 27648, 106492);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(974689518);
                        fetVar5.r(false);
                    }
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                j120.z((x7z) obj6, (a4x) obj5, (xcz) obj4, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                l7x.v((mm40) obj6, (nvi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                l7x.h((mm40) obj6, (hvi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                l7x.e((mm40) obj6, (evi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                l7x.b((mm40) obj6, (cvi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                l7x.n((mm40) obj6, (lvi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                l7x.d((mm40) obj6, (dvi0) obj5, this.d, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                hmw0.Q((List) obj6, (Function1) obj4, this.d, (xcz) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                d4n d4nVar = (d4n) obj6;
                Function1 function6 = (Function1) obj4;
                Function1 function7 = (Function1) obj5;
                fet fetVar6 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Iterator it = d4nVar.a().iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            ehl0 ehl0Var = (ehl0) next;
                            if (ehl0Var == null) {
                                fetVar6.e0(-1697595990);
                                fetVar6.r(z3);
                                z = z3;
                                unit = null;
                            } else {
                                fetVar6.e0(-1697595989);
                                fetVar6.b0(-2089131518, Integer.valueOf(i3));
                                pz40 pz40VarF = androidx.compose.runtime.e.f(ehl0Var, fetVar6);
                                ?? I = z2 ? z3 : q3d.i(d4nVar.a());
                                ?? I2 = z2 ? q3d.i(d4nVar.a()) : z3;
                                if (d4nVar instanceof z3n) {
                                    z3n z3nVar = (z3n) d4nVar;
                                    ahl0 ahl0Var = z3nVar.e;
                                    y9q0 y9q0Var2 = z3nVar.d;
                                    y9q0 y9q0Var3 = z3nVar.c;
                                    int i5 = z3nVar.b;
                                    eil0 eil0Var = z3nVar.f;
                                    obj3 = null;
                                    if (eil0Var != null) {
                                        if (eil0Var instanceof dil0) {
                                            bil0Var = new dil0(i5, y9q0Var3, y9q0Var2, ahl0Var);
                                        } else if (eil0Var instanceof cil0) {
                                            bil0Var = new cil0(i5, y9q0Var3, y9q0Var2, ahl0Var);
                                        }
                                        fetVar = fetVar6;
                                    }
                                } else {
                                    obj3 = null;
                                    if (d4nVar instanceof a4n) {
                                        a4n a4nVar = (a4n) d4nVar;
                                        bil0Var = new gil0(a4nVar.b, a4nVar.c, a4nVar.d, a4nVar.e);
                                        fetVar = fetVar6;
                                    } else if (d4nVar instanceof b4n) {
                                        b4n b4nVar = (b4n) d4nVar;
                                        int i6 = b4nVar.b;
                                        y9q0 y9q0Var4 = b4nVar.c;
                                        y9q0 y9q0Var5 = b4nVar.d;
                                        zcl zclVar = qmk.f28987a;
                                        fetVar = fetVar6;
                                        kil0Var = new kil0(i6, y9q0Var4, y9q0Var5, new iil0(i3 == I ? 12.0f : 0.0f, i3 == I2 ? 12.0f : 0.0f, i3 == I2 ? 12.0f : 0.0f, i3 == I ? 12.0f : 0.0f), b4nVar.e);
                                    } else {
                                        fetVar = fetVar6;
                                        if (d4nVar instanceof c4n) {
                                            c4n c4nVar = (c4n) d4nVar;
                                            bil0Var = new oil0(c4nVar.b, c4nVar.c, c4nVar.d, c4nVar.e);
                                        } else {
                                            if (!(d4nVar instanceof y3n)) {
                                                t9f.b();
                                                return obj3;
                                            }
                                            y3n y3nVar = (y3n) d4nVar;
                                            bil0Var = new bil0(y3nVar.b, y3nVar.c, y3nVar.d);
                                        }
                                    }
                                    fet fetVar7 = fetVar;
                                    vfc.q(null, pz40VarF, kil0Var, function6, function7, fetVar7, 0, 1);
                                    fetVar6 = fetVar7;
                                    z = false;
                                    fetVar6.r(false);
                                    fetVar6.r(false);
                                    unit = Unit.f46060a;
                                }
                                kil0Var = bil0Var;
                                fet fetVar8 = fetVar;
                                vfc.q(null, pz40VarF, kil0Var, function6, function7, fetVar8, 0, 1);
                                fetVar6 = fetVar8;
                                z = false;
                                fetVar6.r(false);
                                fetVar6.r(false);
                                unit = Unit.f46060a;
                            }
                            if (unit == null) {
                                fetVar6.e0(-1699590932);
                                fetVar6.b0(-54608176, Integer.valueOf(i3));
                                tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                bh90 bh90VarM2 = fetVar6.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var);
                                mkd.c0.getClass();
                                fetVar6.i0();
                                if (fetVar6.S) {
                                    fetVar6.l(pcyVar);
                                } else {
                                    fetVar6.r0();
                                }
                                jpm0.o(fetVar6, tj30VarC, gqw0.x);
                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar6);
                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                fetVar6.r(true);
                                fetVar6.r(false);
                                fetVar6.r(false);
                            } else {
                                fetVar6.e0(-54761347);
                                fetVar6.r(z);
                            }
                            i3 = i4;
                            z3 = false;
                        }
                    }
                    t9f.b();
                    return obj3;
                }
                fetVar6.X();
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                g7x.q(x8x.L(1), (fet) obj, (a4x) obj5, (mm40) obj6, (Function1) obj4, this.d);
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ro4.S((mm40) obj6, (z77) obj5, this.d, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                aem0.b((mm40) obj6, (dhn0) obj5, (Function0) obj4, (fet) obj, x8x.L(1), this.d ? 1 : 0);
                return Unit.f46060a;
            case 16:
                jpr0 jpr0Var = (jpr0) obj6;
                String str3 = (String) obj5;
                ra10 ra10Var = (ra10) obj4;
                tqr0 tqr0Var = (tqr0) obj2;
                ((oyg0) obj).getClass();
                tqr0Var.getClass();
                String str4 = jpr0Var.e;
                String str5 = z2 ? jpr0Var.b : "";
                str3.getClass();
                str5.getClass();
                str4.getClass();
                return tqr0.a(tqr0Var, new w7y(new jpr0(str3, str5, "", str4, -1L)), new b3y(ra10Var), false, null, null, 120);
            case 17:
                ((Integer) obj2).getClass();
                afn0.i((mm40) obj6, (d280) obj5, (String) obj4, (fet) obj, x8x.L(1), this.d ? 1 : 0);
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                iom0.e((mm40) obj6, (vxu0) obj5, this.d, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                yqm0.h(x8x.L(1), this.d ? 1 : 0, (fet) obj, (mm40) obj6, (Integer) obj5, (String) obj4);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                iym0.k((mm40) obj6, (rdv0) obj5, (Function0) obj4, (fet) obj, x8x.L(1), this.d ? 1 : 0);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ lfc0(x7z x7zVar, a4x a4xVar, xcz xczVar, boolean z, int i) {
        this.f19948a = (byte) 4;
        this.c = x7zVar;
        this.e = a4xVar;
        this.b = xczVar;
        this.d = z;
    }

    public /* synthetic */ lfc0(mm40 mm40Var, qfc0 qfc0Var, Function1 function1, boolean z) {
        this.f19948a = (byte) 0;
        this.c = mm40Var;
        this.e = qfc0Var;
        this.b = function1;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lfc0(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f19948a = b;
        this.c = mm40Var;
        this.e = obj;
        this.b = obj2;
        this.d = i2;
    }

    public /* synthetic */ lfc0(mm40 mm40Var, Object obj, boolean z, wdr wdrVar, int i, byte b) {
        this.f19948a = b;
        this.c = mm40Var;
        this.e = obj;
        this.d = z;
        this.b = wdrVar;
    }

    public /* synthetic */ lfc0(rfc0 rfc0Var, Function1 function1, mm40 mm40Var, boolean z) {
        this.f19948a = (byte) 1;
        this.e = rfc0Var;
        this.b = function1;
        this.c = mm40Var;
        this.d = z;
    }

    public /* synthetic */ lfc0(jpr0 jpr0Var, boolean z, String str, ra10 ra10Var) {
        this.f19948a = (byte) 16;
        this.c = jpr0Var;
        this.d = z;
        this.e = str;
        this.b = ra10Var;
    }

    public /* synthetic */ lfc0(List list, Function1 function1, boolean z, xcz xczVar, int i) {
        this.f19948a = (byte) 11;
        this.c = list;
        this.b = function1;
        this.d = z;
        this.e = xczVar;
    }

    public /* synthetic */ lfc0(boolean z, shc0 shc0Var, Function1 function1, l7m0 l7m0Var) {
        this.f19948a = (byte) 2;
        this.d = z;
        this.c = shc0Var;
        this.b = function1;
        this.e = l7m0Var;
    }

    public /* synthetic */ lfc0(boolean z, String str, y9q0 y9q0Var, String str2) {
        this.f19948a = (byte) 3;
        this.d = z;
        this.c = str;
        this.e = y9q0Var;
        this.b = str2;
    }
}
