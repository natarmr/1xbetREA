package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.IndividualColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f29797a;
    public static final long b;
    public static final long c;

    static {
        zcl zclVar = qmk.f28987a;
        f29797a = 200.0f;
        b = (((long) Float.floatToRawIntBits(52.0f)) << 32) | (((long) Float.floatToRawIntBits(44.0f)) & 4294967295L);
        c = (((long) Float.floatToRawIntBits(118.0f)) << 32) | (((long) Float.floatToRawIntBits(128.0f)) & 4294967295L);
    }

    public static final void a(int i, dp20 dp20Var, fet fetVar, int i2) {
        fetVar.g0(1003772171);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.g(dp20Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f = dp20Var.d;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new p3m0(dp20Var, (byte) 1);
                fetVar.o0(objP);
            }
            g(i, f, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q3m0(i, dp20Var, i2, b2);
        }
    }

    public static final void b(az00 az00Var, dp20 dp20Var, fet fetVar, int i) {
        fetVar.g0(648560562);
        byte b2 = 16;
        int i2 = (fetVar.g(az00Var) ? 4 : 2) | i | (fetVar.g(dp20Var) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(az00Var.f1694a, 0, fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0(dp20Var, az00Var, b2);
                fetVar.o0(objP);
            }
            j0x.b(pm80VarF, null, o7k0.n(ffb0.P(jm40.b, new elk0((Function1) objP, (byte) 26)), dp20Var.f), null, null, 0.0f, null, fetVar, 56, 120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(az00Var, dp20Var, i, b3);
        }
    }

    public static final void c(a4x a4xVar, dp20 dp20Var, fet fetVar, int i) {
        fetVar.g0(392239897);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.g(dp20Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                b((az00) it.next(), dp20Var, fetVar, i2 & 112);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(a4xVar, dp20Var, i, b2);
        }
    }

    public static final void d(int i, dp20 dp20Var, fet fetVar, int i2) {
        fetVar.g0(-694949944);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.g(dp20Var) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f = dp20Var.d;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new p3m0(dp20Var, (byte) 0);
                fetVar.o0(objP);
            }
            g(i, f, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q3m0(i, dp20Var, i2, b2);
        }
    }

    public static final void e(final p010 p010Var, final long j, final dp20 dp20Var, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(-269042153);
        int i2 = i | (fetVar.g(p010Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.g(dp20Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (p010Var.d == 0 || p010Var.e == 0 || p010Var.f != 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2(p010Var, j, dp20Var, i, b2) { // from class: a.n3m0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f22858a;
                    public final /* synthetic */ p010 b;
                    public final /* synthetic */ long c;
                    public final /* synthetic */ dp20 d;

                    {
                        this.f22858a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f22858a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(1);
                                r3m0.e(this.b, this.c, this.d, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(1);
                                r3m0.e(this.b, this.c, this.d, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                zcl zclVar = qmk.d;
                ugg0 ugg0Var = vgg0.f37379a;
                ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
                pm80 pm80VarF = a8k0.F(R.drawable.cyber_lol_hero_placeholder, 0, fetVar);
                String str = p010Var.c;
                boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new u5l0((Object) dp20Var, (Object) p010Var, (byte) 15);
                    fetVar.o0(objP);
                }
                k7x.b(str, null, lgb.J(s5x0.J(i120.S(i120.Q(o7k0.n(ffb0.P(jm40.b, new elk0((Function1) objP, (byte) 26)), dp20Var.e), ((IndividualColors) fetVar.k(j7x.f16059a)).getWebGamesBackground(), ugg0Var2), 1.0f, j, ugg0Var2), 1.0f), ugg0Var2), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            function2 = new Function2(p010Var, j, dp20Var, i, b3) { // from class: a.n3m0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f22858a;
                public final /* synthetic */ p010 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ dp20 d;

                {
                    this.f22858a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f22858a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            r3m0.e(this.b, this.c, this.d, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            r3m0.e(this.b, this.c, this.d, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void f(mm40 mm40Var, o0x o0xVar, fet fetVar, int i) {
        fetVar.g0(502049001);
        int i2 = i | (fetVar.g(o0xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            Object objA = o0xVar.a();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(objA, null, h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwa(mm40Var, o0xVar, i, (byte) 3);
        }
    }

    public static final void g(final int i, final float f, final Function1 function1, fet fetVar, final int i2) {
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(-1678173524);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.d(f) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i == 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2(i, f, function1, i2, b2) { // from class: a.m3m0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f21123a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ float c;
                    public final /* synthetic */ Function1 d;

                    {
                        this.f21123a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = this.f21123a;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b3) {
                            case 0:
                                r3m0.g(this.b, this.c, this.d, fetVar2, x8x.L(1));
                                break;
                            default:
                                r3m0.g(this.b, this.c, this.d, fetVar2, x8x.L(1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                j0x.b(a8k0.F(i, i3 & 14, fetVar), null, o7k0.n(ffb0.P(jm40.b, new elk0(function1, (byte) 26)), f), null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            function2 = new Function2(i, f, function1, i2, b3) { // from class: a.m3m0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f21123a;
                public final /* synthetic */ int b;
                public final /* synthetic */ float c;
                public final /* synthetic */ Function1 d;

                {
                    this.f21123a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = this.f21123a;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b4) {
                        case 0:
                            r3m0.g(this.b, this.c, this.d, fetVar2, x8x.L(1));
                            break;
                        default:
                            r3m0.g(this.b, this.c, this.d, fetVar2, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void h(mm40 mm40Var, b110 b110Var, fet fetVar, int i) {
        fetVar.g0(-749434588);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(b110Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(582868452, new l3m0(mm40Var, b110Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l3m0(mm40Var, b110Var, i);
        }
    }

    public static final void i(a4x a4xVar, long j, dp20 dp20Var, fet fetVar, int i) {
        fet fetVar2;
        dp20 dp20Var2;
        long j2;
        fetVar.g0(-379143136);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16) | (fetVar.g(dp20Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                p010 p010Var = (p010) it.next();
                fetVar.b0(-569222415, Long.valueOf(p010Var.f26125a));
                long j3 = j;
                dp20 dp20Var3 = dp20Var;
                fet fetVar3 = fetVar;
                e(p010Var, j3, dp20Var3, fetVar3, i2 & 1008);
                fetVar3.r(false);
                j = j3;
                dp20Var = dp20Var3;
                fetVar = fetVar3;
            }
            fetVar2 = fetVar;
            dp20Var2 = dp20Var;
            j2 = j;
        } else {
            fetVar2 = fetVar;
            dp20Var2 = dp20Var;
            j2 = j;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2(a4xVar, j2, dp20Var2, i);
        }
    }
}
