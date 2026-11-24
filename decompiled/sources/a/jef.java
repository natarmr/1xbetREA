package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class jef extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16371a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jef(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.f16371a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object objJ;
        long j;
        jm40 jm40Var;
        int i;
        u2e u2eVar;
        jm40 jm40Var2;
        boolean z2;
        int i2;
        int i3;
        byte b = this.f16371a;
        jm40 jm40Var3 = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oms0 oms0Var = (oms0) obj3;
                    ief iefVar = new ief((cfq) obj5);
                    lxs0 lxs0Var = hp4.j;
                    boolean zH = oms0Var.h();
                    p4 p4Var = oms0Var.f25519a;
                    if (zH) {
                        z = false;
                        objJ = vqd.j(fetVar, 1666827533, false, p4Var);
                    } else {
                        fetVar.e0(1666573488);
                        boolean zG = fetVar.g(oms0Var);
                        objJ = fetVar.P();
                        if (zG || objJ == cl5Var) {
                            rfk0 rfk0VarJ = vdx.J();
                            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                            try {
                                Object objY0 = p4Var.y0();
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                fetVar.o0(objY0);
                                objJ = objY0;
                            } catch (Throwable th) {
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                throw th;
                            }
                        }
                        z = false;
                        fetVar.r(false);
                    }
                    fetVar.e0(1378811975);
                    Object obj6 = this.d;
                    float f = Intrinsics.d(objJ, obj6) ? 1.0f : 0.0f;
                    fetVar.r(z);
                    Float fValueOf = Float.valueOf(f);
                    boolean zG2 = fetVar.g(oms0Var);
                    Object objP = fetVar.P();
                    if (zG2 || objP == cl5Var) {
                        objP = jgk0.b(new elb(oms0Var, (byte) 6));
                        fetVar.o0(objP);
                    }
                    Object value = ((l7m0) objP).getValue();
                    fetVar.e0(1378811975);
                    float f2 = Intrinsics.d(value, obj6) ? 1.0f : 0.0f;
                    fetVar.r(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zG3 = fetVar.g(oms0Var);
                    Object objP2 = fetVar.P();
                    if (zG3 || objP2 == cl5Var) {
                        objP2 = jgk0.b(new elb(oms0Var, (byte) 7));
                        fetVar.o0(objP2);
                    }
                    cms0 cms0VarE = phu0.E(oms0Var, fValueOf, fValueOf2, (cfq) iefVar.F(((l7m0) objP2).getValue(), fetVar, 0), lxs0Var, fetVar, 0);
                    boolean zG4 = fetVar.g(cms0VarE);
                    Object objP3 = fetVar.P();
                    if (zG4 || objP3 == cl5Var) {
                        objP3 = new s43(cms0VarE, (byte) 5);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarT = i4w0.T(jm40Var3, (Function1) objP3);
                    ugd ugdVar = (ugd) obj4;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.l(fetVar, Integer.valueOf(iHashCode));
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ugdVar.F(obj6, fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                g3e g3eVar = (g3e) obj5;
                eoa0 eoa0Var = (eoa0) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && fetVar2.D()) {
                    fetVar2.X();
                } else {
                    ((pz40) obj3).setValue(Unit.f46060a);
                    g3eVar.getClass();
                    g3eVar.g();
                    fetVar2.e0(-18377150);
                    g3e g3eVar2 = (g3e) g3eVar.f().b;
                    u2e u2eVarE = g3eVar2.e();
                    u2e u2eVarE2 = g3eVar2.e();
                    u2e u2eVarE3 = g3eVar2.e();
                    u2e u2eVarE4 = g3eVar2.e();
                    u2e u2eVarE5 = g3eVar2.e();
                    boolean z3 = eoa0Var.i;
                    long j2 = eoa0Var.n;
                    String str = eoa0Var.m;
                    int i4 = eoa0Var.k;
                    jm40 jm40Var4 = jm40.b;
                    if (z3) {
                        fetVar2.e0(-18305541);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var4, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                        boolean zG5 = fetVar2.g(u2eVarE2);
                        Object objP4 = fetVar2.P();
                        if (zG5 || objP4 == cl5Var) {
                            i2 = 0;
                            objP4 = new iwx(u2eVarE2, (byte) 0);
                            fetVar2.o0(objP4);
                        } else {
                            i2 = 0;
                        }
                        mm40 mm40VarD = g3e.d(mm40VarN, u2eVarE4, (Function1) objP4);
                        String strW = rsm0.w(i4, i2, fetVar2);
                        pz40 pz40Var = s6t0.f31722a;
                        j = j2;
                        v8q0.a(strW, mm40VarD, StaticColors.INSTANCE.m113getRed0d7_KjU(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, null, fetVar2, 0, 24960, 240488);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else {
                        j = j2;
                        fetVar2.e0(-17443090);
                        fetVar2.r(false);
                    }
                    if (eoa0Var.g) {
                        fetVar2.e0(-17349966);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40Var4, 0.0f, 0.0f, 8.0f, 0.0f, 11), 16.0f);
                        boolean zG6 = fetVar2.g(u2eVarE);
                        Object objP5 = fetVar2.P();
                        if (zG6 || objP5 == cl5Var) {
                            objP5 = new iwx(u2eVarE, (byte) 1);
                            fetVar2.o0(objP5);
                        }
                        mm40 mm40VarD2 = g3e.d(mm40VarN2, u2eVarE2, (Function1) objP5);
                        k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
                        k1xVar.c = str;
                        jm40Var = jm40Var4;
                        k7x.a(k1xVar.a(), null, mm40VarD2, null, new m78(j, 5), fetVar2, 48, 1784);
                        i = 0;
                        fetVar2.r(false);
                    } else {
                        jm40Var = jm40Var4;
                        i = 0;
                        fetVar2.e0(-16694130);
                        fetVar2.r(false);
                    }
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = j9x.e;
                        fetVar2.o0(objP6);
                    }
                    l7x.z(g3e.d(jm40Var, u2eVarE, (Function1) objP6), eoa0Var, fetVar2, i);
                    if (eoa0Var.h) {
                        fetVar2.e0(-16359888);
                        zcl zclVar3 = qmk.f28987a;
                        jm40 jm40Var5 = jm40Var;
                        jm40Var2 = jm40Var5;
                        mm40 mm40VarN3 = o7k0.n(s5x0.N(jm40Var5, 8.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                        boolean zG7 = fetVar2.g(u2eVarE);
                        Object objP7 = fetVar2.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new iwx(u2eVarE, (byte) 2);
                            fetVar2.o0(objP7);
                        }
                        u2eVar = u2eVarE3;
                        mm40 mm40VarD3 = g3e.d(mm40VarN3, u2eVar, (Function1) objP7);
                        k1x k1xVar2 = new k1x((Context) fetVar2.k(dy2.b));
                        k1xVar2.c = str;
                        k7x.a(k1xVar2.a(), null, mm40VarD3, null, new m78(j, 5), fetVar2, 48, 1784);
                        fetVar2.r(false);
                    } else {
                        u2eVar = u2eVarE3;
                        jm40Var2 = jm40Var;
                        fetVar2.e0(-15702130);
                        fetVar2.r(false);
                    }
                    if (eoa0Var.j) {
                        fetVar2.e0(-15598373);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN4 = s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                        boolean zG8 = fetVar2.g(u2eVar);
                        Object objP8 = fetVar2.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new iwx(u2eVar, (byte) 3);
                            fetVar2.o0(objP8);
                        }
                        mm40 mm40VarD4 = g3e.d(mm40VarN4, u2eVarE5, (Function1) objP8);
                        String strW2 = rsm0.w(i4, 0, fetVar2);
                        pz40 pz40Var2 = s6t0.f31722a;
                        fet fetVar3 = fetVar2;
                        v8q0.a(strW2, mm40VarD4, StaticColors.INSTANCE.m113getRed0d7_KjU(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar3, 0, 24960, 240488);
                        fetVar2 = fetVar3;
                        z2 = false;
                        fetVar2.r(false);
                    } else {
                        z2 = false;
                        fetVar2.e0(-14735922);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z2);
                }
                return Unit.f46060a;
            default:
                fet fetVar4 = (fet) obj;
                g3e g3eVar3 = (g3e) obj5;
                szy szyVar = (szy) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && fetVar4.D()) {
                    fetVar4.X();
                } else {
                    ((pz40) obj3).setValue(Unit.f46060a);
                    g3eVar3.getClass();
                    g3eVar3.g();
                    fetVar4.e0(1893540208);
                    g3e g3eVar4 = (g3e) g3eVar3.f().b;
                    u2e u2eVarE6 = g3eVar4.e();
                    u2e u2eVarE7 = g3eVar4.e();
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN5 = o7k0.n(jm40Var3, 16.0f);
                    Object objP9 = fetVar4.P();
                    if (objP9 == cl5Var) {
                        objP9 = b180.e;
                        fetVar4.o0(objP9);
                    }
                    mm40 mm40VarD5 = g3e.d(mm40VarN5, u2eVarE6, (Function1) objP9);
                    String str2 = szyVar.n;
                    pm80 pm80VarF = a8k0.F(R.drawable.sport_new, 0, fetVar4);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.sport_new, 0, fetVar4);
                    pz40 pz40Var3 = s6t0.f31722a;
                    k7x.b(str2, null, mm40VarD5, pm80VarF2, pm80VarF, null, null, null, null, null, null, new m78(s6t0.b().f33626a.getSecondary(), 5), fetVar4, 36912, 0, 28640);
                    boolean zG9 = fetVar4.g(u2eVarE6);
                    Object objP10 = fetVar4.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new iwx(u2eVarE6, (byte) 10);
                        fetVar4.o0(objP10);
                    }
                    mm40 mm40VarD6 = g3e.d(jm40Var3, u2eVarE7, (Function1) objP10);
                    v8q0.a(szyVar.f33090a, mm40VarD6, s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar4, 0, 24960, 109544);
                    g3e g3eVar5 = (g3e) g3eVar3.f().b;
                    u2e u2eVarE8 = g3eVar5.e();
                    u2e u2eVarE9 = g3eVar5.e();
                    u2e u2eVarE10 = g3eVar5.e();
                    u2e u2eVarE11 = g3eVar5.e();
                    g3e g3eVar6 = (g3e) g3eVar3.f().b;
                    u2e u2eVarE12 = g3eVar6.e();
                    u2e u2eVarE13 = g3eVar6.e();
                    u2e u2eVarE14 = g3eVar6.e();
                    boolean zG10 = fetVar4.g(u2eVarE11) | fetVar4.g(u2eVarE9);
                    Object objP11 = fetVar4.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new e5n(u2eVarE11, u2eVarE9, (byte) 4);
                        fetVar4.o0(objP11);
                    }
                    v8q0.a(szyVar.h, g3e.d(jm40Var3, u2eVarE8, (Function1) objP11), s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, g1t0.d().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, null, fetVar4, 0, 24960, 240488);
                    mm40 mm40VarN6 = o7k0.n(jm40Var3, 32.0f);
                    boolean zG11 = fetVar4.g(u2eVarE10);
                    Object objP12 = fetVar4.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new iwx(u2eVarE10, (byte) 11);
                        fetVar4.o0(objP12);
                    }
                    mm40 mm40VarD7 = g3e.d(mm40VarN6, u2eVarE9, (Function1) objP12);
                    boolean zG12 = fetVar4.g(szyVar);
                    Object objP13 = fetVar4.P();
                    if (zG12 || objP13 == cl5Var) {
                        objP13 = new p4a0(szyVar, (byte) 1);
                        fetVar4.o0(objP13);
                    }
                    kkb.p(0, fetVar4, mm40VarD7, (Function0) objP13);
                    boolean zG13 = fetVar4.g(u2eVarE11);
                    Object objP14 = fetVar4.P();
                    if (zG13 || objP14 == cl5Var) {
                        objP14 = new iwx(u2eVarE11, (byte) 12);
                        fetVar4.o0(objP14);
                    }
                    v8q0.a(szyVar.d, g3e.d(jm40Var3, u2eVarE10, (Function1) objP14), s6t0.b().f33626a.getTextPrimary(), null, g1t0.i().f42262a.b, null, null, g1t0.i().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar4, 0, 0, 260968);
                    boolean zG14 = fetVar4.g(u2eVarE7);
                    Object objP15 = fetVar4.P();
                    if (zG14 || objP15 == cl5Var) {
                        objP15 = new iwx(u2eVarE7, (byte) 13);
                        fetVar4.o0(objP15);
                    }
                    v8q0.a(Separators.COLON, s5x0.L(g3e.d(jm40Var3, u2eVarE11, (Function1) objP15), 4.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, g1t0.i().f42262a.b, null, null, g1t0.i().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar4, 6, 0, 260968);
                    boolean zG15 = fetVar4.g(u2eVarE11);
                    Object objP16 = fetVar4.P();
                    if (zG15 || objP16 == cl5Var) {
                        objP16 = new iwx(u2eVarE11, (byte) 14);
                        fetVar4.o0(objP16);
                    }
                    v8q0.a(szyVar.e, g3e.d(jm40Var3, u2eVarE12, (Function1) objP16), s6t0.b().f33626a.getTextPrimary(), null, g1t0.i().f42262a.b, null, null, g1t0.i().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar4, 0, 0, 260968);
                    mm40 mm40VarN7 = o7k0.n(jm40Var3, 32.0f);
                    boolean zG16 = fetVar4.g(u2eVarE12);
                    Object objP17 = fetVar4.P();
                    if (zG16 || objP17 == cl5Var) {
                        objP17 = new iwx(u2eVarE12, (byte) 15);
                        fetVar4.o0(objP17);
                    }
                    mm40 mm40VarD8 = g3e.d(mm40VarN7, u2eVarE13, (Function1) objP17);
                    boolean zG17 = fetVar4.g(szyVar);
                    Object objP18 = fetVar4.P();
                    if (zG17 || objP18 == cl5Var) {
                        i3 = 0;
                        objP18 = new p4a0(szyVar, (byte) 0);
                        fetVar4.o0(objP18);
                    } else {
                        i3 = 0;
                    }
                    kkb.p(i3, fetVar4, mm40VarD8, (Function0) objP18);
                    boolean zG18 = fetVar4.g(u2eVarE11) | fetVar4.g(u2eVarE13);
                    Object objP19 = fetVar4.P();
                    if (zG18 || objP19 == cl5Var) {
                        objP19 = new e5n(u2eVarE11, u2eVarE13, (byte) 3);
                        fetVar4.o0(objP19);
                    }
                    v8q0.a(szyVar.i, g3e.d(jm40Var3, u2eVarE14, (Function1) objP19), s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, g1t0.d().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar4, 0, 24960, 240488);
                    u2e u2eVarE15 = ((g3e) g3eVar3.f().b).e();
                    boolean zG19 = fetVar4.g(u2eVarE9);
                    Object objP20 = fetVar4.P();
                    if (zG19 || objP20 == cl5Var) {
                        objP20 = new iwx(u2eVarE9, (byte) 9);
                        fetVar4.o0(objP20);
                    }
                    x1x.i(g3e.d(jm40Var3, u2eVarE15, (Function1) objP20), szyVar, fetVar4, 0);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
        }
    }
}
