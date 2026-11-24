package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class stl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32778a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ stl0(zhr0 zhr0Var, Function2 function2, Function2 function3, mm40 mm40Var, int i) {
        this.f32778a = (byte) 20;
        this.d = zhr0Var;
        this.c = function2;
        this.e = function3;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final int i;
        int i2;
        kie0 kie0Var;
        long j;
        int i3;
        byte b = this.f32778a;
        byte b2 = 8;
        byte b3 = 13;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 7;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                wdp0 wdp0Var = (wdp0) obj6;
                pz40 pz40Var = (pz40) obj4;
                Function2 function2 = (Function2) obj3;
                wdp0 wdp0Var2 = (wdp0) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar.g(pz40Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new zhl0(pz40Var, (byte) 8);
                        fetVar.o0(objP);
                    }
                    gfx.w(wdp0Var, null, v3c.Y(objArr, (Function0) objP, fetVar), function2, fetVar, 0);
                    Object[] objArr2 = new Object[0];
                    boolean zG2 = fetVar.g(pz40Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new zhl0(pz40Var, (byte) 10);
                        fetVar.o0(objP2);
                    }
                    gfx.w(wdp0Var2, null, v3c.Y(objArr2, (Function0) objP2, fetVar), function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                vdp0 vdp0Var = (vdp0) obj6;
                pz40 pz40Var2 = (pz40) obj4;
                Function2 function3 = (Function2) obj3;
                vdp0 vdp0Var2 = (vdp0) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object[] objArr3 = new Object[0];
                    boolean zG3 = fetVar2.g(pz40Var2);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new zhl0(pz40Var2, (byte) 9);
                        fetVar2.o0(objP3);
                    }
                    tfx.q(vdp0Var, null, v3c.Y(objArr3, (Function0) objP3, fetVar2), function3, fetVar2, 0);
                    Object[] objArr4 = new Object[0];
                    boolean zG4 = fetVar2.g(pz40Var2);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new zhl0(pz40Var2, (byte) 11);
                        fetVar2.o0(objP4);
                    }
                    tfx.q(vdp0Var2, null, v3c.Y(objArr4, (Function0) objP4, fetVar2), function3, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                gfx.w((wdp0) obj6, (mm40) obj5, (l7m0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                tfx.q((vdp0) obj6, (mm40) obj5, (l7m0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                gq80.F((mm40) obj6, (String) obj5, (Function0) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                unh0.O((mm40) obj6, (m0n0) obj5, (rqm) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                final String str = (String) obj6;
                final String str2 = (String) obj5;
                final g9q0 g9q0Var = (g9q0) obj4;
                ux3 ux3Var = (ux3) obj3;
                c5n0 c5n0Var = (c5n0) obj;
                final p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                long j2 = qmk.p;
                int iW0 = (int) c5n0Var.w0(4.0f);
                int iW1 = (int) c5n0Var.w0(2.0f);
                int iW2 = (int) c5n0Var.w0(14.0f);
                long j3 = p4eVar.f26347a;
                int i4 = p4e.i(j3);
                long j4 = g1t0.g().f42262a.b;
                boolean z = hne.D((int) (g9q0.a(g9q0Var, str, y9q0.a(g1t0.g(), 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32), iW0, iW1, iW2) + ((int) (g9q0.a(g9q0Var, str2, y9q0.a(g1t0.g(), 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32)) > i4;
                final boolean z2 = !z;
                final mie0 mie0Var = new mie0();
                final mie0 mie0Var2 = new mie0();
                final kie0 kie0Var2 = new kie0();
                final kie0 kie0Var3 = new kie0();
                if (z) {
                    final byte b5 = 0;
                    i = iW0;
                    long jL = v3c.L(g1t0.l().f42262a.b, j2, new Function1() { // from class: a.g5n0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            byte b6 = b5;
                            p4e p4eVar2 = p4eVar;
                            switch (b6) {
                                case 0:
                                    int i5 = p4e.i(p4eVar2.f26347a);
                                    long j5 = ((daq0) obj7).f5764a;
                                    y9q0 y9q0VarA = y9q0.a(g1t0.g(), 0L, j5, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                                    long jB = r4e.b(0, i5, 0, 0, 13);
                                    g9q0 g9q0Var2 = g9q0Var;
                                    a9q0 a9q0VarA = g9q0.a(g9q0Var2, str, y9q0VarA, 0, 5, jB, null, 972);
                                    boolean z3 = a9q0VarA.e() || a9q0VarA.d() || a9q0VarA.f();
                                    a9q0 a9q0VarA2 = g9q0.a(g9q0Var2, str2, y9q0.a(g1t0.g(), 0L, j5, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 5, r4e.b(0, i5, 0, 0, 13), null, 972);
                                    return Boolean.valueOf(z3 || (a9q0VarA2.e() || a9q0VarA2.d() || a9q0VarA2.f()));
                                default:
                                    int i6 = p4e.i(p4eVar2.f26347a);
                                    long j6 = ((daq0) obj7).f5764a;
                                    y9q0 y9q0VarA2 = y9q0.a(g1t0.m(), 0L, j6, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                                    long jB2 = r4e.b(0, i6, 0, 0, 13);
                                    g9q0 g9q0Var3 = g9q0Var;
                                    a9q0 a9q0VarA3 = g9q0.a(g9q0Var3, str, y9q0VarA2, 0, 2, jB2, null, 972);
                                    boolean z4 = a9q0VarA3.e() || a9q0VarA3.d() || a9q0VarA3.f();
                                    a9q0 a9q0VarA4 = g9q0.a(g9q0Var3, str2, y9q0.a(g1t0.m(), 0L, j6, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 2, r4e.b(0, i6, 0, 0, 13), null, 972);
                                    return Boolean.valueOf(z4 || (a9q0VarA4.e() || a9q0VarA4.d() || a9q0VarA4.f()));
                            }
                        }
                    });
                    pj30 pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("SUBGAME_SLOT_ID", new ugd(-985887754, true, new bs0(str, jL, (byte) 6))));
                    pu90 pu90VarS = pj30Var != null ? pj30Var.S(r4e.b(0, p4e.i(j3), 0, 0, 13)) : null;
                    mie0Var.f21842a = pu90VarS;
                    kie0Var3.f18333a = pu90VarS != null ? pu90VarS.b : 0;
                    pj30 pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("FIN_BET_LEVEL_SLOT_ID", new ugd(-1279306126, true, new my2(str2, (Enum) ux3Var, jL, (byte) 11))));
                    pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(r4e.b(0, p4e.i(j3), 0, 0, 13)) : null;
                    mie0Var2.f21842a = pu90VarS2;
                    i2 = pu90VarS2 != null ? pu90VarS2.b : 0;
                } else {
                    pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("SUBGAME_SLOT_ID", new ugd(1564525621, true, new f5n0(str, (byte) 0))));
                    pu90 pu90VarS3 = pj30Var3 != null ? pj30Var3.S(r4e.b(0, 0, 0, 0, 15)) : null;
                    mie0Var.f21842a = pu90VarS3;
                    kie0Var2.f18333a = pu90VarS3 != null ? pu90VarS3.f27604a : 0;
                    kie0Var3.f18333a = pu90VarS3 != null ? pu90VarS3.b : 0;
                    pj30 pj30Var4 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("FIN_BET_LEVEL_SLOT_ID", new ugd(1269881636, true, new o3m0(str2, ux3Var, (byte) 9))));
                    pu90 pu90VarS4 = pj30Var4 != null ? pj30Var4.S(r4e.b(0, p4e.i(j3) - kie0Var2.f18333a, 0, 0, 13)) : null;
                    mie0Var2.f21842a = pu90VarS4;
                    i2 = pu90VarS4 != null ? pu90VarS4.b : 0;
                    i = iW0;
                }
                int i5 = kie0Var3.f18333a;
                final int iMax = !z ? Math.max(i5, i2) : i5 + i2 + i;
                final byte b6 = 0;
                return vj30.x(c5n0Var, p4e.i(j3), iMax, new Function1() { // from class: a.h5n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        byte b7 = b6;
                        int i6 = i;
                        kie0 kie0Var4 = kie0Var2;
                        mie0 mie0Var3 = mie0Var2;
                        kie0 kie0Var5 = kie0Var3;
                        int i7 = iMax;
                        boolean z3 = z2;
                        mie0 mie0Var4 = mie0Var;
                        ou90 ou90Var = (ou90) obj7;
                        switch (b7) {
                            case 0:
                                ou90Var.getClass();
                                pu90 pu90Var = (pu90) mie0Var4.f21842a;
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, 0, z3 ? (i7 / 2) - (kie0Var5.f18333a / 2) : 0, 0.0f);
                                }
                                pu90 pu90Var2 = (pu90) mie0Var3.f21842a;
                                if (pu90Var2 != null) {
                                    ou90Var.m(pu90Var2, z3 ? kie0Var4.f18333a + i6 : 0, z3 ? 0 : kie0Var5.f18333a + i6, 0.0f);
                                }
                                break;
                            default:
                                ou90Var.getClass();
                                pu90 pu90Var3 = (pu90) mie0Var4.f21842a;
                                if (pu90Var3 != null) {
                                    ou90Var.m(pu90Var3, 0, z3 ? (i7 / 2) - (kie0Var5.f18333a / 2) : 0, 0.0f);
                                }
                                pu90 pu90Var4 = (pu90) mie0Var3.f21842a;
                                if (pu90Var4 != null) {
                                    ou90Var.m(pu90Var4, z3 ? kie0Var4.f18333a + i6 : 0, z3 ? 0 : kie0Var5.f18333a + i6, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 7:
                final String str3 = (String) obj6;
                final String str4 = (String) obj5;
                final g9q0 g9q0Var2 = (g9q0) obj4;
                vx3 vx3Var = (vx3) obj3;
                c5n0 c5n0Var2 = (c5n0) obj;
                final p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                long j5 = qmk.p;
                final int iW3 = (int) c5n0Var2.w0(4.0f);
                int iW4 = (int) c5n0Var2.w0(2.0f);
                int iW5 = (int) c5n0Var2.w0(14.0f);
                long j6 = p4eVar2.f26347a;
                int i6 = p4e.i(j6);
                long j7 = g1t0.g().f42262a.b;
                boolean z3 = hne.D((int) (g9q0.a(g9q0Var2, str3, y9q0.a(g1t0.m(), 0L, j7, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32), iW3, iW4, iW5) + ((int) (g9q0.a(g9q0Var2, str4, y9q0.a(g1t0.m(), 0L, j7, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32)) > i6;
                final boolean z4 = !z3;
                final mie0 mie0Var3 = new mie0();
                final mie0 mie0Var4 = new mie0();
                final kie0 kie0Var4 = new kie0();
                kie0 kie0Var5 = new kie0();
                if (z3) {
                    final byte b7 = 1;
                    kie0Var = kie0Var5;
                    j = j6;
                    long jL2 = v3c.L(g1t0.l().f42262a.b, j5, new Function1() { // from class: a.g5n0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            byte b8 = b7;
                            p4e p4eVar3 = p4eVar2;
                            switch (b8) {
                                case 0:
                                    int i7 = p4e.i(p4eVar3.f26347a);
                                    long j8 = ((daq0) obj7).f5764a;
                                    y9q0 y9q0VarA = y9q0.a(g1t0.g(), 0L, j8, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                                    long jB = r4e.b(0, i7, 0, 0, 13);
                                    g9q0 g9q0Var3 = g9q0Var2;
                                    a9q0 a9q0VarA = g9q0.a(g9q0Var3, str3, y9q0VarA, 0, 5, jB, null, 972);
                                    boolean z5 = a9q0VarA.e() || a9q0VarA.d() || a9q0VarA.f();
                                    a9q0 a9q0VarA2 = g9q0.a(g9q0Var3, str4, y9q0.a(g1t0.g(), 0L, j8, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 5, r4e.b(0, i7, 0, 0, 13), null, 972);
                                    return Boolean.valueOf(z5 || (a9q0VarA2.e() || a9q0VarA2.d() || a9q0VarA2.f()));
                                default:
                                    int i8 = p4e.i(p4eVar3.f26347a);
                                    long j9 = ((daq0) obj7).f5764a;
                                    y9q0 y9q0VarA2 = y9q0.a(g1t0.m(), 0L, j9, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                                    long jB2 = r4e.b(0, i8, 0, 0, 13);
                                    g9q0 g9q0Var4 = g9q0Var2;
                                    a9q0 a9q0VarA3 = g9q0.a(g9q0Var4, str3, y9q0VarA2, 0, 2, jB2, null, 972);
                                    boolean z6 = a9q0VarA3.e() || a9q0VarA3.d() || a9q0VarA3.f();
                                    a9q0 a9q0VarA4 = g9q0.a(g9q0Var4, str4, y9q0.a(g1t0.m(), 0L, j9, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 2, r4e.b(0, i8, 0, 0, 13), null, 972);
                                    return Boolean.valueOf(z6 || (a9q0VarA4.e() || a9q0VarA4.d() || a9q0VarA4.f()));
                            }
                        }
                    });
                    pj30 pj30Var5 = (pj30) CollectionsKt.firstOrNull(c5n0Var2.k("SUBGAME_SLOT_ID", new ugd(-420242969, true, new bs0(str3, jL2, b4))));
                    pu90 pu90VarS5 = pj30Var5 != null ? pj30Var5.S(r4e.b(0, p4e.i(j), 0, 0, 13)) : null;
                    mie0Var3.f21842a = pu90VarS5;
                    kie0Var.f18333a = pu90VarS5 != null ? pu90VarS5.b : 0;
                    pj30 pj30Var6 = (pj30) CollectionsKt.firstOrNull(c5n0Var2.k("FIN_BET_LEVEL_SLOT_ID", new ugd(-1450089749, true, new my2(str4, (Enum) vx3Var, jL2, (byte) 12))));
                    pu90 pu90VarS6 = pj30Var6 != null ? pj30Var6.S(r4e.b(0, p4e.i(j), 0, 0, 13)) : null;
                    mie0Var4.f21842a = pu90VarS6;
                    i3 = pu90VarS6 != null ? pu90VarS6.b : 0;
                } else {
                    pj30 pj30Var7 = (pj30) CollectionsKt.firstOrNull(c5n0Var2.k("SUBGAME_SLOT_ID", new ugd(-1720935800, true, new f5n0(str3, (byte) 1))));
                    pu90 pu90VarS7 = pj30Var7 != null ? pj30Var7.S(r4e.b(0, 0, 0, 0, 15)) : null;
                    mie0Var3.f21842a = pu90VarS7;
                    kie0Var4.f18333a = pu90VarS7 != null ? pu90VarS7.f27604a : 0;
                    kie0Var5.f18333a = pu90VarS7 != null ? pu90VarS7.b : 0;
                    pj30 pj30Var8 = (pj30) CollectionsKt.firstOrNull(c5n0Var2.k("FIN_BET_LEVEL_SLOT_ID", new ugd(-1765154183, true, new o3m0(str4, vx3Var, (byte) 10))));
                    pu90 pu90VarS8 = pj30Var8 != null ? pj30Var8.S(r4e.b(0, p4e.i(j6) - kie0Var4.f18333a, 0, 0, 13)) : null;
                    mie0Var4.f21842a = pu90VarS8;
                    i3 = pu90VarS8 != null ? pu90VarS8.b : 0;
                    j = j6;
                    kie0Var = kie0Var5;
                }
                int i7 = kie0Var.f18333a;
                final int iMax2 = !z3 ? Math.max(i7, i3) : i7 + i3 + iW3;
                final byte b8 = 1;
                final kie0 kie0Var6 = kie0Var;
                return vj30.x(c5n0Var2, p4e.i(j), iMax2, new Function1() { // from class: a.h5n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        byte b9 = b8;
                        int i8 = iW3;
                        kie0 kie0Var7 = kie0Var4;
                        mie0 mie0Var5 = mie0Var4;
                        kie0 kie0Var8 = kie0Var6;
                        int i9 = iMax2;
                        boolean z5 = z4;
                        mie0 mie0Var6 = mie0Var3;
                        ou90 ou90Var = (ou90) obj7;
                        switch (b9) {
                            case 0:
                                ou90Var.getClass();
                                pu90 pu90Var = (pu90) mie0Var6.f21842a;
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, 0, z5 ? (i9 / 2) - (kie0Var8.f18333a / 2) : 0, 0.0f);
                                }
                                pu90 pu90Var2 = (pu90) mie0Var5.f21842a;
                                if (pu90Var2 != null) {
                                    ou90Var.m(pu90Var2, z5 ? kie0Var7.f18333a + i8 : 0, z5 ? 0 : kie0Var8.f18333a + i8, 0.0f);
                                }
                                break;
                            default:
                                ou90Var.getClass();
                                pu90 pu90Var3 = (pu90) mie0Var6.f21842a;
                                if (pu90Var3 != null) {
                                    ou90Var.m(pu90Var3, 0, z5 ? (i9 / 2) - (kie0Var8.f18333a / 2) : 0, 0.0f);
                                }
                                pu90 pu90Var4 = (pu90) mie0Var5.f21842a;
                                if (pu90Var4 != null) {
                                    ou90Var.m(pu90Var4, z5 ? kie0Var7.f18333a + i8 : 0, z5 ? 0 : kie0Var8.f18333a + i8, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 8:
                ((Integer) obj2).getClass();
                m6m0 m6m0Var = don0.n2;
                ((don0) obj6).P0((String) obj5, (yvl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                knm0.c((mm40) obj6, (n3l0) obj5, (b3q) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                lvk0 lvk0Var = (lvk0) obj6;
                mm40 mm40Var = (mm40) obj5;
                ebo0 ebo0Var = (ebo0) obj4;
                i3t0 i3t0Var = (i3t0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ivk0 ivk0Var = (ivk0) lvk0Var;
                    int iOrdinal = ivk0Var.e.ordinal();
                    if (iOrdinal == 0) {
                        fetVar3.e0(-1903592906);
                        boolean zI = fetVar3.i(i3t0Var);
                        Object objP5 = fetVar3.P();
                        if (zI || objP5 == cl5Var) {
                            objP5 = new vi6(i3t0Var, b3);
                            fetVar3.o0(objP5);
                        }
                        cvm0.c(mm40Var, ivk0Var, ebo0Var, (Function1) objP5, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-1903594981, fetVar3, false);
                        }
                        fetVar3.e0(-1903579472);
                        boolean zI2 = fetVar3.i(i3t0Var);
                        Object objP6 = fetVar3.P();
                        if (zI2 || objP6 == cl5Var) {
                            objP6 = new vi6(i3t0Var, (byte) 14);
                            fetVar3.o0(objP6);
                        }
                        lvm0.c(mm40Var, ivk0Var, ebo0Var, (Function1) objP6, fetVar3, 0);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                aad.v((mm40) obj6, (String) obj5, (String) obj4, (a4x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                n8n0.d((mm40) obj6, (sqp0) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                bcm0.c((String) obj6, (String) obj5, (mm40) obj4, (xdr) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                xnm0.d((mm40) obj6, (wxl) obj5, (chq0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                wpm0.d((mm40) obj6, (wxl) obj5, (a4x) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ltt0.h((mm40) obj6, (String) obj5, (String) obj4, (zpq0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 17:
                l7m0 l7m0Var = (l7m0) obj6;
                l7m0 l7m0Var2 = (l7m0) obj5;
                e2d e2dVar = (e2d) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40.b);
                    qim qimVar = ((x6r0) l7m0Var.getValue()).f40378a;
                    boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
                    boolean zG5 = fetVar4.g(function1);
                    Object objP7 = fetVar4.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new coo0(function1, (byte) 28);
                        fetVar4.o0(objP7);
                    }
                    ckb.k(mm40VarW, qimVar, zBooleanValue, e2dVar, null, (Function1) objP7, fetVar4, 0, 16);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                gq80.T((mm40) obj6, (olw) obj5, (skb0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                wdr0.a((mm40) obj6, (a4x) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                nia0.W((zhr0) obj6, (Function2) obj3, (Function2) obj5, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                j5n0.e(x8x.L(1), (fet) obj, (mm40) obj3, (l7m0) obj4, (String) obj6, (String) obj5);
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                ycm0.h((mm40) obj6, (me80) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                ro4.O((mm40) obj6, (mtl) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                wgm0.k((mm40) obj6, (c280) obj5, (d280) obj4, (String) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                b34.R((g2v) obj6, (qdz) obj5, (tzt0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mim0 mim0Var = (mim0) obj6;
                vju0 vju0Var = (vju0) obj5;
                mk50 mk50Var = (mk50) obj4;
                ss8 ss8Var = (ss8) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z5 = vju0Var.D;
                    boolean zI3 = fetVar5.i(mk50Var) | fetVar5.i(vju0Var) | fetVar5.i(ss8Var);
                    Object objP8 = fetVar5.P();
                    if (zI3 || objP8 == cl5Var) {
                        objP8 = new m8s0(mk50Var, vju0Var, ss8Var, b2);
                        fetVar5.o0(objP8);
                    }
                    lgb.n(null, mim0Var, z5, (Function1) objP8, fetVar5, 1);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                q8a.y((wpu0) obj6, (l7m0) obj5, (l7m0) obj4, (Function0) obj3, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                xia0.Z((mm40) obj6, (hzv0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ stl0(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f32778a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ stl0(Object obj, pz40 pz40Var, Function2 function2, Object obj2, byte b) {
        this.f32778a = b;
        this.d = obj;
        this.b = pz40Var;
        this.c = function2;
        this.e = obj2;
    }

    public /* synthetic */ stl0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f32778a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }
}
