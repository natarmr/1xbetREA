package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import java.io.File;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes.dex */
public abstract class iom0 {
    public static final void a(p4u0 p4u0Var, Map map, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-446179233);
        int i2 = (i & 6) == 0 ? i | (fetVar2.g(p4u0Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(map) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            p4u0Var.getClass();
            for (r4u0 r4u0Var : p4u0Var.j) {
                boolean z = r4u0Var instanceof u4u0;
                x4u0 x4u0Var = x4u0.f40285a;
                if (z) {
                    fetVar2.e0(798455915);
                    u4u0 u4u0Var = (u4u0) r4u0Var;
                    String str = u4u0Var.f35069a;
                    c4u0 t4u0Var = (c4u0) map.get(str);
                    if (t4u0Var == null) {
                        t4u0Var = new t4u0();
                    }
                    xnm0.c((List) t4u0Var.a(x4u0Var, u4u0Var.b), u4u0Var.c, str, (t89) t4u0Var.a(v4u0.f36799a, u4u0Var.d), ((Number) t4u0Var.a(w4u0.f38560a, Float.valueOf(u4u0Var.e))).floatValue(), (t89) t4u0Var.a(d5u0.f5525a, u4u0Var.f), ((Number) t4u0Var.a(e5u0.f7251a, Float.valueOf(u4u0Var.g))).floatValue(), ((Number) t4u0Var.a(f5u0.f8981a, Float.valueOf(u4u0Var.h))).floatValue(), u4u0Var.i, u4u0Var.j, u4u0Var.k, ((Number) t4u0Var.a(k5u0.f17737a, Float.valueOf(u4u0Var.l))).floatValue(), ((Number) t4u0Var.a(i5u0.f14211a, Float.valueOf(u4u0Var.m))).floatValue(), ((Number) t4u0Var.a(j5u0.f15952a, Float.valueOf(u4u0Var.n))).floatValue(), fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (r4u0Var instanceof p4u0) {
                    fetVar2.e0(799870476);
                    p4u0 p4u0Var2 = (p4u0) r4u0Var;
                    c4u0 t4u0Var2 = (c4u0) map.get(p4u0Var2.f26375a);
                    if (t4u0Var2 == null) {
                        t4u0Var2 = new t4u0();
                    }
                    xnm0.b(p4u0Var2.f26375a, ((Number) t4u0Var2.a(a5u0.f290a, Float.valueOf(p4u0Var2.b))).floatValue(), ((Number) t4u0Var2.a(y4u0.f42023a, Float.valueOf(p4u0Var2.c))).floatValue(), ((Number) t4u0Var2.a(z4u0.f43790a, Float.valueOf(p4u0Var2.d))).floatValue(), ((Number) t4u0Var2.a(b5u0.f2023a, Float.valueOf(p4u0Var2.e))).floatValue(), ((Number) t4u0Var2.a(c5u0.f3791a, Float.valueOf(p4u0Var2.f))).floatValue(), ((Number) t4u0Var2.a(g5u0.f10734a, Float.valueOf(p4u0Var2.g))).floatValue(), ((Number) t4u0Var2.a(h5u0.f12499a, Float.valueOf(p4u0Var2.h))).floatValue(), (List) t4u0Var2.a(x4u0Var, p4u0Var2.i), u1c.M(1450046638, new htr0(p4u0Var2, map, (byte) 26), fetVar2), fetVar2, 805306368);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(800876643);
                    fetVar2.r(false);
                }
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) p4u0Var, (Object) map, i, (byte) 15);
        }
    }

    public static final void b(mm40 mm40Var, boolean z, nar0 nar0Var, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        mm40Var.getClass();
        nar0Var.getClass();
        fetVar.g0(-695937483);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.h(z) ? 32 : 16) | (fetVar.g(nar0Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                fetVar.e0(1218982588);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1218983512);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-456193291, new a6p0(mm40Var, nar0Var, (byte) 20), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 9, i, mm40Var, (Object) nar0Var, z);
        }
    }

    public static final void c(final nsm0 nsm0Var, final pwr0 pwr0Var, final k6z k6zVar, final long j, final o6s0 o6s0Var, final int i, final Function2 function2, final Function1 function1, final Function1 function3, final Function1 function4, fet fetVar, final int i2) {
        fet fetVar2 = fetVar;
        nsm0Var.getClass();
        k6zVar.getClass();
        function2.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        fetVar2.g0(258094264);
        int i3 = i2 | (fetVar2.g(nsm0Var) ? 32 : 16) | (fetVar2.g(pwr0Var) ? 256 : 128) | (fetVar2.e(k6zVar.ordinal()) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192) | (fetVar2.g(o6s0Var) ? 131072 : 65536) | (fetVar2.e(i) ? 1048576 : 524288) | (fetVar2.i(function2) ? 8388608 : 4194304) | (fetVar2.i(function1) ? 67108864 : 33554432) | (fetVar2.i(function3) ? 536870912 : 268435456);
        if (fetVar2.U(i3 & 1, (306783379 & i3) != 306783378)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new qkx(0L));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zx7 zx7Var = gqw0.f11754a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = o7k0.x(jm40Var, zx7Var, true);
            boolean z = ((i3 & 3670016) == 1048576) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new Function1() { // from class: a.gxr0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((w6k) obj).getClass();
                        float f = i;
                        long j2 = j;
                        return new ikx((((long) si30.b(f - Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) si30.b(-Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L));
                    }
                };
                fetVar2.o0(objP2);
            }
            mm40 mm40VarP = ffb0.P(mm40VarX, (Function1) objP2);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z3 = (i3 & 458752) == 131072;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nej0((Object) pz40Var, (Object) function4, (Object) o6s0Var, (byte) 29);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarD0 = ro4.d0(jm40Var, (Function1) objP3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fetVar2.e0(-1430866777);
            for (rwr0 rwr0Var : nsm0Var.r()) {
                z7x z7xVarV = b8k0.V("", fetVar2, 0);
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = new t9r0((byte) 25);
                    fetVar2.o0(objP4);
                }
                imy imyVar = new imy();
                ((Function1) objP4).invoke(imyVar);
                fetVar2 = fetVar;
                xnm0.a(rwr0Var, ((Number) b8k0.r(z7xVarV, 0.0f, 0.6f, ro4.b0(new jmy(imyVar), kkf0.f18436a, 0L, 4), null, fetVar, 4536, 8).getValue()).floatValue(), function2, function1, fetVar2, (i3 >> 15) & 8064);
                jm40Var = jm40Var;
                cl5Var = cl5Var;
            }
            jm40 jm40Var2 = jm40Var;
            fetVar2.r(false);
            fetVar2.r(true);
            boolean z4 = nsm0Var instanceof mxr0;
            jr8 jr8Var = jr8.f16991a;
            if (z4) {
                fetVar2.e0(-1046367404);
                cy2.c(0, fetVar2, ((mxr0) nsm0Var).b, jr8Var.a(jm40Var2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1046219100);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            hhm0.b(jr8Var.b(jm40Var2, gqw0.h), pwr0Var, k6zVar, function3, fetVar2, ((i3 >> 3) & 1008) | ((i3 >> 18) & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(pwr0Var, k6zVar, j, o6s0Var, i, function2, function1, function3, function4, i2) { // from class: a.hxr0
                public final /* synthetic */ pwr0 b;
                public final /* synthetic */ k6z c;
                public final /* synthetic */ long d;
                public final /* synthetic */ o6s0 e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Function2 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(7);
                    iom0.c(this.f13825a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, zhs0 zhs0Var, fet fetVar, int i) {
        pcy pcyVar;
        pcy pcyVar2;
        boolean z;
        final zhs0 zhs0Var2 = zhs0Var;
        fet fetVar2 = fetVar;
        zhs0Var2.getClass();
        fetVar2.g0(1323821168);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zhs0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                final byte b = 0;
                objP = new Function0() { // from class: a.mhs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        zhs0 zhs0Var3 = zhs0Var2;
                        switch (b2) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.c, new c280(zhs0Var3.f44408a, R.drawable.ic_glyph_placeholder_player));
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.g, R.drawable.ic_glyph_placeholder_player));
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.i, R.drawable.ic_glyph_placeholder_player));
                        }
                    }
                };
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            k7x.b(zhs0Var2.b, null, s5x0.J(i120.Q(lgb.J(o7k0.n(s5x0.N(jm40Var, 40.0f, 40.0f, 0.0f, 0.0f, 12), 20.0f), vgg0.f37379a), s6t0.b().f33626a.getBackgroundContent(), jd8.n), 1.0f), a8k0.F(R.drawable.ic_glyph_color_flag_placeholder, 0, fetVar2), a8k0.F(R.drawable.ic_glyph_color_flag_placeholder, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(o7k0.g(jm40Var, 60.0f, 0.0f, 2), 10.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA2 = w5d.a(uc9.f, xx7Var, fetVar2, 6);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar3;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            pcy pcyVar4 = pcyVar;
            zhs0Var2 = zhs0Var;
            v8q0.a(zhs0Var.d, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
            v8q0.a(zhs0Var2.e, null, s6t0.b().f33626a.getPrimary(), new n05(idm0.t(12), g1t0.m().f42262a.b, idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 109554);
            v8q0.a(zhs0Var2.c, null, s6t0.b().f33626a.getTextPrimary(), new n05(idm0.t(12), g1t0.l().f42262a.b, idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.l(), fetVar, 0, 24960, 109554);
            fetVar.r(true);
            fetVar.r(true);
            mbc.o(agi0.f827a, s5x0.L(jm40Var, 0.0f, 10.0f, 1), false, fetVar, 6, 4);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 8.0f, 10.0f);
            thg0 thg0VarA2 = shg0.a(uc9.e, yx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar4;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar4;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            pcy pcyVar5 = pcyVar2;
            v8q0.a(zhs0Var2.f, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            boolean z4 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                objP2 = new Function0() { // from class: a.mhs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = c;
                        zhs0 zhs0Var3 = zhs0Var2;
                        switch (b2) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.c, new c280(zhs0Var3.f44408a, R.drawable.ic_glyph_placeholder_player));
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.g, R.drawable.ic_glyph_placeholder_player));
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.i, R.drawable.ic_glyph_placeholder_player));
                        }
                    }
                };
                fetVar.o0(objP2);
            } else {
                z = true;
            }
            kkb.p(0, fetVar, jm40Var, (Function0) objP2);
            fetVar.r(z);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), null, o7k0.e(o7k0.s(jm40Var, 64.0f), 24.0f), s6t0.b().f33626a.getSecondary(), fetVar, 56, 0);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA4 = shg0.a(lw3Var, yx7Var, fetVar, 54);
            int iHashCode7 = Long.hashCode(fetVar.T);
            bh90 bh90VarM7 = fetVar.m();
            mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar5);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA4, shdVar);
            jpm0.o(fetVar, bh90VarM7, shdVar2);
            vqd.u(iHashCode7, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC6, shdVar4);
            boolean z5 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                final byte b2 = 2;
                objP3 = new Function0() { // from class: a.mhs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        zhs0 zhs0Var3 = zhs0Var2;
                        switch (b3) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.c, new c280(zhs0Var3.f44408a, R.drawable.ic_glyph_placeholder_player));
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.g, R.drawable.ic_glyph_placeholder_player));
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, new c280(zhs0Var3.i, R.drawable.ic_glyph_placeholder_player));
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            kkb.p(0, fetVar, jm40Var, (Function0) objP3);
            v8q0.a(zhs0Var2.h, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, zhs0Var2, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    public static final void e(mm40 mm40Var, vxu0 vxu0Var, boolean z, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        Boolean bool;
        t7q0 s7q0Var;
        t7q0 s7q0Var2;
        boolean z2;
        vxu0Var.getClass();
        function1.getClass();
        fetVar.g0(-334777915);
        int i2 = i | 6 | (fetVar.g(vxu0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar = (cqq) objP;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
            Boolean boolValueOf = Boolean.valueOf(z);
            yez yezVar = (yez) rhv0Var;
            Boolean boolValueOf2 = Boolean.valueOf(yezVar.c());
            boolean zG = ((i2 & 896) == 256) | fetVar.g(yezVar) | fetVar.g(pkk0Var) | fetVar.i(wpqVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                bool = boolValueOf2;
                Object e0r0Var = new e0r0(z, yezVar, cqqVar, pkk0Var, wpqVar, null);
                fetVar.o0(e0r0Var);
                objP2 = e0r0Var;
            } else {
                bool = boolValueOf2;
            }
            m0x0.v(boolValueOf, bool, (Function2) objP2, fetVar);
            Object obj2 = vxu0Var.d;
            String str = vxu0Var.e;
            String str2 = vxu0Var.f;
            boolean zG2 = fetVar.g(obj2) | fetVar.g(str) | fetVar.g(str2);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                String str3 = vxu0Var.d;
                if (str2 != null) {
                    s7q0Var = new s7q0(str2);
                } else {
                    if (str != null) {
                        s7q0Var2 = new s7q0(str);
                    } else {
                        s7q0Var = r7q0.f29989a;
                    }
                    if (str2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP3 = new h7n(new s6q0(str3, e6q0.f7299a, o6q0.f24750a, s7q0Var2, true, z2, new y5q0(9, null, null, 6), "", "", 30976));
                    fetVar.o0(objP3);
                }
                s7q0Var2 = s7q0Var;
                if (str2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP3 = new h7n(new s6q0(str3, e6q0.f7299a, o6q0.f24750a, s7q0Var2, true, z2, new y5q0(9, null, null, 6), "", "", 30976));
                fetVar.o0(objP3);
            }
            s6q0 s6q0Var = ((h7n) objP3).f12584a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            f(vxu0Var, cqqVar, s6q0Var, function1, fetVar, ((i2 >> 3) & 14) | 48 | (i2 & 7168));
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var2, (Object) vxu0Var, z, (wdr) function1, i, (byte) 18);
        }
    }

    public static final void f(vxu0 vxu0Var, cqq cqqVar, s6q0 s6q0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-297851011);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(vxu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cqqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(s6q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            dyb.p(0, fetVar, null, vxu0Var.b, vxu0Var.c);
            mm40 mm40VarB0 = y860.b0(jm40.b, cqqVar);
            h7n h7nVar = new h7n(s6q0Var);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new sbt0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            jwb.j(mm40VarB0, h7nVar, (Function1) objP, fetVar, (i2 >> 3) & 112, 4);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fxb.l(0, fetVar, null, vxu0Var.g, vxu0Var.h);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            vul vulVar = vul.f38053a;
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(vxu0Var.i), vxu0Var.j, vxu0Var.l, false);
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ntu0(function1, (byte) 2);
                fetVar.o0(objP2);
            }
            ckb.i(null, vulVar, wulVar, 0L, (Function0) objP2, fetVar, 48, 9);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 18, i, (Object) vxu0Var, (Object) cqqVar, (Object) s6q0Var, (Object) function1);
        }
    }

    public static final void g(cp cpVar, kwn0 kwn0Var) {
        DsTimer dsTimer = ((nwn0) cpVar.u).n;
        dsTimer.setTimerType(kwn0Var.b);
        dsTimer.setVisibility(kwn0Var.d ? 0 : 8);
        dsTimer.setTime(kwn0Var.f19010a);
        dsTimer.setTimeDirection(kwn0Var.c);
        if (kwn0Var.e) {
            dsTimer.d();
        }
    }

    public static final List h(ctf0 ctf0Var, List list) {
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            nhs0 nhs0Var = (nhs0) obj;
            if (nhs0Var.c.length() > 0 && nhs0Var.b > 0) {
                tmp0 tmp0Var = nhs0Var.e;
                String str = tmp0Var.f34205a;
                fks0 fks0Var = tmp0Var.d;
                if (str.length() > 0 || fks0Var.a() || fks0Var == fks0.Retirement) {
                    tmp0 tmp0Var2 = nhs0Var.f;
                    String str2 = tmp0Var2.f34205a;
                    fks0 fks0Var2 = tmp0Var2.d;
                    if (str2.length() > 0 || fks0Var2.a() || fks0Var2 == fks0.Retirement) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        List listA0 = CollectionsKt.A0(arrayList, new mto(new tgo0((byte) 12), (byte) 11));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        Iterator it = listA0.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            nhs0 nhs0Var2 = (nhs0) next;
            String strI = f140.i(i, "TRANSFER");
            String str3 = nhs0Var2.d;
            tmp0 tmp0Var3 = nhs0Var2.e;
            n0x n0xVar = new n0x(str3);
            String str4 = nhs0Var2.c;
            Date date = nhs0Var2.f23550a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Iterator it2 = it;
            kcm kcmVar = new kcm(n0xVar, str4, new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5)));
            boolean z = true;
            ucm ucmVarT = t(tmp0Var3, ctf0Var, s(tmp0Var3, true));
            tmp0 tmp0Var4 = nhs0Var2.f;
            if (tmp0Var3.f34205a.length() <= 0) {
                z = false;
            }
            arrayList2.add(new rbp0(strI, new bdm(new mcm(kcmVar, new xcm(ucmVarT, t(tmp0Var4, ctf0Var, s(tmp0Var4, z)))))));
            it = it2;
            i = i2;
        }
        if (arrayList2.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var.b;
        lc00VarB.add(new m9p0("TRANSFER_HEADER", new hjm(lsm0Var.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166)));
        lc00VarB.addAll(arrayList2);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final a4x i(a4x a4xVar, ghq0 ghq0Var, ctf0 ctf0Var) {
        Object ahq0Var;
        String strA;
        ygq0 ygq0Var = ghq0Var.f11314a;
        a4xVar.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
        Iterator<E> it = a4xVar.iterator();
        while (it.hasNext()) {
            ygq0 ygq0Var2 = (ygq0) it.next();
            boolean z = false;
            if (ygq0Var2 == ygq0.CUSTOM_DATE) {
                wgq0 wgq0Var = ghq0Var.b;
                long j = wgq0Var.f39129a;
                long j2 = wgq0Var.b;
                boolean z2 = j != -1;
                byte b = ygq0Var2.f42598a;
                if (z2) {
                    rdj rdjVar = rdj.f30294a;
                    ynq0 ynq0Var = new ynq0(j);
                    sdj sdjVar = sdj.UNIVERSAL;
                    strA = w6x.q(rdj.f(ynq0Var, sdjVar, null, 60), " - ", j2 != -1 ? rdj.f(new ynq0(j2), sdjVar, null, 60) : ctf0Var.b.a(R.string.end_date_period, Arrays.copyOf(new Object[0], 0)));
                } else {
                    strA = ctf0Var.b.a(m(ygq0Var2), Arrays.copyOf(new Object[0], 0));
                }
                if (ygq0Var2 == ygq0Var && z2) {
                    z = true;
                }
                ahq0Var = new bhq0(strA, b, z);
            } else {
                ahq0Var = new ahq0(ctf0Var.b.a(m(ygq0Var2), Arrays.copyOf(new Object[0], 0)), ygq0Var2.f42598a, ygq0Var2 == ygq0Var);
            }
            arrayList.add(ahq0Var);
        }
        return dyb.o0(arrayList);
    }

    public static final void j(s4u0 s4u0Var, long j, long j2, String str, a4d a4dVar, boolean z) {
        ((hgk0) s4u0Var.f).setValue(new h7k0(j));
        ((hgk0) s4u0Var.g).setValue(Boolean.valueOf(z));
        y3u0 y3u0Var = s4u0Var.h;
        ((hgk0) y3u0Var.g).setValue(a4dVar);
        ((hgk0) y3u0Var.i).setValue(new h7k0(j2));
        y3u0Var.c = str;
    }

    public static final void k(wgv wgvVar, p4u0 p4u0Var) {
        ArrayList arrayList = p4u0Var.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r4u0 r4u0Var = (r4u0) arrayList.get(i);
            if (r4u0Var instanceof u4u0) {
                a290 a290Var = new a290();
                u4u0 u4u0Var = (u4u0) r4u0Var;
                a290Var.d = u4u0Var.b;
                a290Var.n = true;
                a290Var.c();
                a290Var.s.j(u4u0Var.c);
                a290Var.c();
                a290Var.c();
                a290Var.b = u4u0Var.d;
                a290Var.c();
                a290Var.c = u4u0Var.e;
                a290Var.c();
                a290Var.g = u4u0Var.f;
                a290Var.c();
                a290Var.e = u4u0Var.g;
                a290Var.c();
                a290Var.f = u4u0Var.h;
                a290Var.o = true;
                a290Var.c();
                a290Var.h = u4u0Var.i;
                a290Var.o = true;
                a290Var.c();
                a290Var.i = u4u0Var.j;
                a290Var.o = true;
                a290Var.c();
                a290Var.j = u4u0Var.k;
                a290Var.o = true;
                a290Var.c();
                a290Var.k = u4u0Var.l;
                a290Var.p = true;
                a290Var.c();
                a290Var.l = u4u0Var.m;
                a290Var.p = true;
                a290Var.c();
                a290Var.m = u4u0Var.n;
                a290Var.p = true;
                a290Var.c();
                wgvVar.e(i, a290Var);
            } else if (r4u0Var instanceof p4u0) {
                wgv wgvVar2 = new wgv();
                p4u0 p4u0Var2 = (p4u0) r4u0Var;
                wgvVar2.k = p4u0Var2.f26375a;
                wgvVar2.c();
                wgvVar2.l = p4u0Var2.b;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.o = p4u0Var2.e;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.p = p4u0Var2.f;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.q = p4u0Var2.g;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.r = p4u0Var2.h;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.m = p4u0Var2.c;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.n = p4u0Var2.d;
                wgvVar2.s = true;
                wgvVar2.c();
                wgvVar2.f = p4u0Var2.i;
                wgvVar2.g = true;
                wgvVar2.c();
                k(wgvVar2, p4u0Var2);
                wgvVar.e(i, wgvVar2);
            }
        }
    }

    public static final boolean l(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((f8h) it.next()).d.c.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final int m(ygq0 ygq0Var) {
        switch (ygq0Var.ordinal()) {
            case 0:
                return R.string.all;
            case 1:
                return R.string.filter_30min;
            case 2:
                return R.string.filter_1h;
            case 3:
                return R.string.filter_2h;
            case 4:
                return R.string.filter_6h;
            case 5:
                return R.string.filter_12h;
            case 6:
                return R.string.filter_24h;
            case 7:
                return R.string.filter_48h;
            case 8:
                return R.string.filter_1d;
            case 9:
                return R.string.filter_5d;
            case 10:
                return R.string.filter_7d;
            case 11:
                return R.string.filter_10d;
            case 12:
                return R.string.filter_30d;
            case 13:
                return R.string.history_filter_set_period;
            case 14:
                return R.string.one_x_drive_filter;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final hom0 n(i0w i0wVar) {
        switch (i0wVar.ordinal()) {
            case 0:
            case 1:
                return hom0.f13401a;
            case 2:
                return hom0.f;
            case 3:
            case 4:
                return hom0.b;
            case 5:
            case 6:
                return hom0.e;
            case 7:
                return hom0.h;
            case 8:
                return hom0.c;
            default:
                t9f.b();
                return null;
        }
    }

    public static final String o(sba0 sba0Var, huo0 huo0Var, suo0 suo0Var) {
        String str;
        sba0 sba0Var2 = sba0.GAMING;
        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
            str = "Amount.webp";
        } else if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
            str = "Bet.webp";
        } else if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
            str = "Win1.webp";
        } else {
            str = (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) ? "Win2.webp" : "Unavailable.webp";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strConcat = "/static/img/android/casino/daily_challenge/tasks/".concat(str);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        return sb.toString();
    }

    public static final void p(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            wv00.f().a(rov0.f30859a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr = rov0.b;
            int iA = wp20.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr) {
                linkedHashMap.put(new File(ohs0.n(databasePath2.getPath(), str)), new File(ohs0.n(file.getPath(), str)));
            }
            for (Map.Entry entry : xp20.k(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        wv00.f().j(rov0.f30859a, "Over-writing contents of " + file3);
                    }
                    wv00.f().a(rov0.f30859a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static final long q(float f, float f2, long j) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final s4u0 r(r2x r2xVar, fet fetVar) {
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zF = fetVar.f((((long) Float.floatToRawIntBits(w6kVar.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(r2xVar.j)) << 32));
        Object objP = fetVar.P();
        if (zF || objP == ukd.f35823a) {
            wgv wgvVar = new wgv();
            k(wgvVar, r2xVar.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(w6kVar.w0(r2xVar.b))) << 32) | (((long) Float.floatToRawIntBits(w6kVar.w0(r2xVar.c))) & 4294967295L);
            long jQ = q(r2xVar.d, r2xVar.e, jFloatToRawIntBits);
            s4u0 s4u0Var = new s4u0(wgvVar);
            String str = r2xVar.f29760a;
            long j = r2xVar.g;
            j(s4u0Var, jFloatToRawIntBits, jQ, str, j != 16 ? new m78(j, r2xVar.h) : null, r2xVar.i);
            fetVar.o0(s4u0Var);
            objP = s4u0Var;
        }
        return (s4u0) objP;
    }

    public static final qcm s(tmp0 tmp0Var, boolean z) {
        if (tmp0Var.d == fks0.Retirement) {
            return new pcm(ncm.RETIREMENT);
        }
        return (z && tmp0Var.f34205a.length() == 0) ? new pcm(ncm.FREE) : new ocm(new n0x(tmp0Var.b));
    }

    public static final ucm t(tmp0 tmp0Var, ctf0 ctf0Var, qcm qcmVar) {
        String strA;
        tcm rcmVar;
        long j = tmp0Var.e;
        fks0 fks0Var = tmp0Var.d;
        String str = tmp0Var.f34205a;
        if (fks0Var.a() && str.length() == 0) {
            strA = ctf0Var.b.a(R.string.cyber_games_free_agent_transfer, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = fks0Var == fks0.Retirement ? ctf0Var.b.a(R.string.retirement, Arrays.copyOf(new Object[0], 0)) : str;
        }
        String str2 = tmp0Var.c;
        if (str.length() <= 0 || !fks0Var.b()) {
            rcmVar = (str.length() <= 0 || str2.length() <= 0) ? scm.f31992a : new rcm(str2);
        } else {
            rcmVar = new rcm(ctf0Var.b.a(fks0Var.f9708a, Arrays.copyOf(new Object[0], 0)));
        }
        return new ucm(j, qcmVar, strA, rcmVar, tmp0Var.g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (w(r8, r9, r10, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function0 r9, java.lang.Class r10, a.zje r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof a.wjt0
            if (r0 == 0) goto L13
            r0 = r11
            a.wjt0 r0 = (a.wjt0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.wjt0 r0 = new a.wjt0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 == r3) goto L30
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L30:
            java.lang.Throwable r7 = r0.l
            a.z1x.P(r11)
            goto L8f
        L36:
            a.z1x.P(r11)
            goto L70
        L3a:
            java.lang.Class r10 = r0.k
            kotlin.jvm.functions.Function0 r9 = r0.j
            kotlin.jvm.functions.Function1 r8 = r0.i
            a.z1x.P(r11)     // Catch: java.lang.Throwable -> L44
            goto L58
        L44:
            r7 = move-exception
            goto L5b
        L46:
            a.z1x.P(r11)
            r0.i = r8     // Catch: java.lang.Throwable -> L44
            r0.j = r9     // Catch: java.lang.Throwable -> L44
            r0.k = r10     // Catch: java.lang.Throwable -> L44
            r0.n = r5     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L44
            if (r7 != r1) goto L58
            goto L8e
        L58:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L44
            return r7
        L5b:
            boolean r11 = r7 instanceof a.ozn0
            if (r11 == 0) goto L73
            r0.i = r6
            r0.j = r6
            r0.k = r6
            r0.l = r6
            r0.n = r4
            java.lang.Object r7 = w(r8, r9, r10, r0)
            if (r7 != r1) goto L70
            goto L8e
        L70:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L73:
            boolean r9 = r7 instanceof a.n7p
            if (r9 == 0) goto L90
            a.tht0 r9 = new a.tht0
            r11 = 10
            r9.<init>(r11)
            r0.i = r6
            r0.j = r6
            r0.k = r6
            r0.l = r7
            r0.n = r3
            java.lang.Object r8 = w(r8, r9, r10, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            throw r7
        L90:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iom0.u(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.Class, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:39:0x00c5, B:41:0x00cd, B:35:0x00ae), top: B:57:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea A[PHI: r12 r15
  0x00ea: PHI (r12v3 long) = (r12v2 long), (r12v4 long) binds: [B:40:0x00cb, B:45:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r15v8 kotlin.jvm.functions.Function2) = (r15v6 kotlin.jvm.functions.Function2), (r15v10 kotlin.jvm.functions.Function2) binds: [B:40:0x00cb, B:45:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        if (r15.invoke(r0, r1) == r2) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlin.jvm.functions.Function1 r15, kotlin.jvm.functions.Function1 r16, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function2 r19, java.lang.Class r20, a.yje r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iom0.v(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, java.lang.Class, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w(Function1 function1, Function0 function0, Class cls, zje zjeVar) {
        yjt0 yjt0Var;
        if (zjeVar instanceof yjt0) {
            yjt0Var = (yjt0) zjeVar;
            int i = yjt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjt0Var.k = i - Integer.MIN_VALUE;
            } else {
                yjt0Var = new yjt0(zjeVar);
            }
        } else {
            yjt0Var = new yjt0(zjeVar);
        }
        Object obj = yjt0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yjt0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                yjt0Var.i = function0;
                yjt0Var.k = 1;
                if (x(function1, cls, yjt0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = yjt0Var.i;
                z1x.P(obj);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            function0.invoke();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object x(Function1 function1, Class cls, yje yjeVar) {
        zjt0 zjt0Var;
        Object objE;
        if (yjeVar instanceof zjt0) {
            zjt0Var = (zjt0) yjeVar;
            int i = zjt0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjt0Var.j = i - Integer.MIN_VALUE;
            } else {
                zjt0Var = new zjt0(yjeVar);
            }
        } else {
            zjt0Var = new zjt0(yjeVar);
        }
        zjt0 zjt0Var2 = zjt0Var;
        Object obj = zjt0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = zjt0Var2.j;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            String name = cls.getName();
            uen uenVar = wen.b;
            long jV0 = ibc.v0(3, bfn.SECONDS);
            List listJ = q3d.j(oqt0.class, fpd0.class, SocketException.class, SocketTimeoutException.class, ConnectException.class, UnknownHostException.class);
            a2f a2fVar = new a2f(function1, yjeVar2, (byte) 10);
            zjt0Var2.j = 1;
            objE = j0x.E(4, jV0, zjt0Var2, name, listJ, a2fVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objE = ((j0g0) obj).f15681a;
        }
        z1x.P(objE);
        return Unit.f46060a;
    }

    public static mkw0 y(Object obj, long j) {
        mkw0 mkw0Var = (mkw0) mlw0.m(obj, j);
        if (((blw0) mkw0Var).f2814a) {
            return mkw0Var;
        }
        blw0 blw0Var = (blw0) mkw0Var;
        int i = blw0Var.c;
        blw0 blw0VarC = blw0Var.c(i == 0 ? 10 : i << 1);
        mlw0.c(obj, j, blw0VarC);
        return blw0VarC;
    }
}
