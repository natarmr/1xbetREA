package a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraAccessException;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public abstract class aad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f518a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final wx7 b = new wx7(-1.0f, -1.0f);
    public static final wx7 c = new wx7(1.0f, -1.0f);
    public static final wx7 d = new wx7(1.0f, 0.0f);
    public static final l33 e = new l33();
    public static final ugd f = new ugd(-1386603633, false, new wgd(22));
    public static final ugd g = new ugd(-337431364, false, new ehd(0));
    public static final ugd h = new ugd(60239742, false, new ehd(24));
    public static final ugd i = new ugd(304102680, false, new mhd(16));
    public static final ugd j = new ugd(-130610582, false, new shd(6));
    public static final q96 k = new q96();

    public static final void A(mm40 mm40Var, final hdz hdzVar, final Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        hdzVar.getClass();
        function1.getClass();
        fetVar.g0(1933663698);
        int i3 = i2 | (fetVar.i(hdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 145) != 144)) {
            ArrayList arrayList = hdzVar.d().d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof ogs0) {
                    arrayList2.add(obj);
                }
            }
            final boolean zIsEmpty = arrayList2.isEmpty();
            final int size = arrayList2.size();
            final kie0 kie0Var = new kie0();
            Iterator it = arrayList.iterator();
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext() && (!(((vk5) it.next()) instanceof ogs0) || (i4 = i4 + 1) != 5)) {
                i5++;
            }
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(n0qVar, f2, 12.0f, f3, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0VarA);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int i6 = i5;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (hdzVar.c() != 0) {
                fetVar.e0(142128117);
                ulb.p(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(142180972);
                fetVar.r(false);
            }
            int i7 = i6 + 1;
            int iC = hdzVar.c();
            final int i8 = i7 > iC ? iC : i7;
            b8k0.e(o7k0.g(jm40Var, 0.0f, 1024.0f, 1), null, null, null, null, null, false, null, new Function1() { // from class: a.lrj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    hcz hczVar = (hcz) obj2;
                    hczVar.getClass();
                    final hdz hdzVar2 = hdzVar;
                    final kie0 kie0Var2 = kie0Var;
                    final int i9 = size;
                    final Function1 function2 = function1;
                    final boolean z2 = zIsEmpty;
                    hcz.g(hczVar, i8, null, null, new ugd(842573816, true, new ydr() { // from class: a.mrj0
                        @Override // a.ydr
                        public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                            fet fetVar2;
                            int iIntValue = ((Integer) obj4).intValue();
                            fet fetVar3 = (fet) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((g9z) obj3).getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= fetVar3.e(iIntValue) ? 32 : 16;
                            }
                            boolean z3 = true;
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                vk5 vk5Var = (vk5) hdzVar2.b(iIntValue);
                                boolean z4 = vk5Var instanceof ogs0;
                                Function1 function3 = function2;
                                cl5 cl5Var = ukd.f35823a;
                                if (z4) {
                                    fetVar3.e0(1327820396);
                                    kie0 kie0Var3 = kie0Var2;
                                    if (kie0Var3.f18333a < 5) {
                                        fetVar3.e0(1327880133);
                                        int i10 = kie0Var3.f18333a + 1;
                                        kie0Var3.f18333a = i10;
                                        if (i9 - i10 != 0 && i10 != 5) {
                                            z3 = false;
                                        }
                                        fetVar2 = fetVar3;
                                        boolean z5 = z3;
                                        dtb.a(null, (ogs0) vk5Var, false, z5, fetVar2, 0, 5);
                                        if (z5) {
                                            fetVar2.e0(1328216514);
                                            boolean zG = fetVar2.g(function3);
                                            Object objP = fetVar2.P();
                                            if (zG || objP == cl5Var) {
                                                objP = new nrj0(function3, (byte) 0);
                                                fetVar2.o0(objP);
                                            }
                                            ucx.H(0, fetVar2, null, (Function0) objP);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(1328439466);
                                            fetVar2.r(false);
                                        }
                                        fetVar2.r(false);
                                    } else {
                                        fetVar2 = fetVar3;
                                        fetVar2.e0(1328469226);
                                        fetVar2.r(false);
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fet fetVar4 = fetVar3;
                                    if (Intrinsics.d(vk5Var, ues0.f35545a)) {
                                        fetVar4.e0(-2035353337);
                                        zcl zclVar2 = qmk.f28987a;
                                        egm0.c(16.0f, fetVar4, 0, 0);
                                        fetVar4.r(false);
                                    } else if (Intrinsics.d(vk5Var, gxn.f12084a)) {
                                        fetVar4.e0(1328702346);
                                        if (z2) {
                                            fetVar4.e0(1328791905);
                                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                                            zcl zclVar3 = qmk.f28987a;
                                            mm40 mm40VarE = o7k0.e(s5x0.J(mm40VarD, 12.0f), 40.0f);
                                            Object objP2 = fetVar4.P();
                                            if (objP2 == cl5Var) {
                                                objP2 = new thj0((byte) 8);
                                                fetVar4.o0(objP2);
                                            }
                                            Function1 function4 = (Function1) objP2;
                                            boolean zG2 = fetVar4.g(function3);
                                            Object objP3 = fetVar4.P();
                                            if (zG2 || objP3 == cl5Var) {
                                                objP3 = new abh0(function3, (byte) 13);
                                                fetVar4.o0(objP3);
                                            }
                                            dwi0.b(function4, mm40VarE, (Function1) objP3, fetVar4, 6, 0);
                                            fetVar4 = fetVar4;
                                            fetVar4.r(false);
                                        } else {
                                            fetVar4.e0(1329998890);
                                            fetVar4.r(false);
                                        }
                                        fetVar4.r(false);
                                    } else if (vk5Var == null) {
                                        fetVar4.e0(-2035304868);
                                        fetVar4.r(false);
                                    } else {
                                        fetVar4.e0(-2035303684);
                                        fetVar4.r(false);
                                    }
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                        }
                    }), 6);
                    return Unit.f46060a;
                }
            }, fetVar, 0, 510);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var2, (Object) hdzVar, function1, i2, (byte) 14);
        }
    }

    public static final void B(int i2, fet fetVar) {
        int i3;
        fetVar.g0(-2058744853);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 132.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, (byte) 28);
        }
    }

    public static final void C(int i2, int i3, fet fetVar, mm40 mm40Var, Function1 function1) {
        long jM96getGray200d7_KjU;
        Function1 function2 = function1;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(342407099);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i2) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        boolean z = false;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            omv omvVar = (omv) fetVar.k(bmd.l);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 28.0f, 0.0f, 2);
            int i5 = 6;
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int i6 = i4;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(-278817992);
            int i7 = 1;
            while (i7 < i5) {
                boolean z3 = i7 <= i2 ? true : z;
                zcl zclVar2 = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarJ = s5x0.J(o7k0.n(jm40Var, 40.0f), 8.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar);
                if (z3) {
                    fetVar.e0(-322513003);
                    jM96getGray200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m132getYellow0d7_KjU();
                } else {
                    fetVar.e0(-322511851);
                    jM96getGray200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m96getGray200d7_KjU();
                }
                fetVar.r(false);
                mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                int i8 = i6;
                boolean zI = fetVar.i(omvVar) | ((i8 & 896) == 256) | fetVar.e(i7);
                Object objP2 = fetVar.P();
                if (zI || objP2 == cl5Var) {
                    objP2 = new bh1((Object) omvVar, (Object) function2, i7, (byte) 8);
                    fetVar.o0(objP2);
                }
                dww.c(pm80VarF, null, y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28), jM96getGray200d7_KjU, fetVar, 56, 0);
                fetVar.r(true);
                i7++;
                function2 = function1;
                pcyVar = pcyVar;
                omvVar = omvVar;
                i5 = 6;
                z = false;
                i6 = i8;
            }
            fetVar.r(z);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var, i2, function1, i3, (byte) 6);
        }
    }

    public static final void D(mm40 mm40Var, j1p0 j1p0Var, fet fetVar, int i2) {
        fetVar.g0(1057291867);
        int i3 = i2 | 6 | (fetVar.g(j1p0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (j1p0Var instanceof i1p0) {
                fetVar.e0(-1849759688);
                B(6, fetVar);
                fetVar.r(false);
            } else {
                if (!(j1p0Var instanceof h1p0)) {
                    throw b1j.f(-1849761510, fetVar, false);
                }
                fetVar.e0(-1849757331);
                k((h1p0) j1p0Var, fetVar, i3 & 126);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, j1p0Var, i2, (byte) 24);
        }
    }

    public static final void E(mm40 mm40Var, edt0 edt0Var, l7m0 l7m0Var, float f2, float f3, float f4, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        edt0Var.getClass();
        function0.getClass();
        fetVar.g0(2023617110);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(edt0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object[] objArr = new Object[0];
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new ybt0(l7m0Var, (byte) 3);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                Object fbnVar = new fbn(new ih10(f2, f4, (byte) 15));
                fetVar.o0(fbnVar);
                objP2 = fbnVar;
            }
            s3e s3eVar = (s3e) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                Object fbnVar2 = new fbn(new ih10(f3, f4, (byte) 14));
                fetVar.o0(fbnVar2);
                objP3 = fbnVar2;
            }
            s3e s3eVar2 = (s3e) objP3;
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object objP5 = fetVar.P();
            Object obj2 = objP5;
            if (objP5 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarD, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new pbp0(pz40Var, lwfVar, nie0Var2, edt0Var, f2, f4, l7m0Var, l7m0VarY, function0), fetVar), fetVar, 24630);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new db3(mm40Var2, edt0Var, l7m0Var, f2, f3, f4, function0, i2, (byte) 4);
        }
    }

    public static final void F(j jVar, x9x x9xVar) {
        jVar.getClass();
        x9xVar.e0(jVar);
    }

    public static final mm40 G(mm40 mm40Var, final float f2, final float f3) {
        mm40Var.getClass();
        return mm40Var.e(knx.Q(jm40.b, new xdr() { // from class: a.k78
            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                int iT = vj30Var.T(f2);
                int iT2 = vj30Var.T(f3) + iT;
                long j2 = p4eVar.f26347a;
                pu90 pu90VarS = pj30Var.S(p4e.b(j2, p4e.k(j2) + iT2, p4e.i(p4eVar.f26347a) + iT2, 0, 0, 12));
                return vj30.x(vj30Var, pu90VarS.f27604a - iT2, pu90VarS.b, new n7(pu90VarS, iT, (byte) 3));
            }
        }));
    }

    public static synchronized long H(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static boolean I(k4e k4eVar) {
        j4e[] j4eVarArr = k4eVar.U;
        j4e j4eVar = j4eVarArr[0];
        j4e j4eVar2 = j4eVarArr[1];
        k4e k4eVar2 = k4eVar.V;
        l4e l4eVar = k4eVar2 != null ? (l4e) k4eVar2 : null;
        j4e j4eVar3 = j4e.f15879a;
        if (l4eVar != null) {
            j4e j4eVar4 = l4eVar.U[0];
        }
        if (l4eVar != null) {
            j4e j4eVar5 = l4eVar.U[1];
        }
        j4e j4eVar6 = j4e.c;
        j4e j4eVar7 = j4e.b;
        boolean z = j4eVar == j4eVar3 || k4eVar.C() || j4eVar == j4eVar7 || (j4eVar == j4eVar6 && k4eVar.s == 0 && k4eVar.Y == 0.0f && k4eVar.v(0)) || (j4eVar == j4eVar6 && k4eVar.s == 1 && k4eVar.w(0, k4eVar.s()));
        boolean z2 = j4eVar2 == j4eVar3 || k4eVar.D() || j4eVar2 == j4eVar7 || (j4eVar2 == j4eVar6 && k4eVar.t == 0 && k4eVar.Y == 0.0f && k4eVar.v(1)) || (j4eVar2 == j4eVar6 && k4eVar.t == 1 && k4eVar.w(1, k4eVar.m()));
        return (k4eVar.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static void J(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static int K(Exception exc) {
        boolean zD = false;
        if (!(exc instanceof CameraAccessException)) {
            if (exc instanceof IllegalArgumentException) {
                return 7;
            }
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    stackTrace.getClass();
                    zD = Intrinsics.d(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
                }
                if (zD) {
                    return 10;
                }
            }
            Log.w("CXCP", "Unexpected throwable: " + exc);
            return 11;
        }
        CameraAccessException cameraAccessException = (CameraAccessException) exc;
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return 3;
        }
        if (reason == 2) {
            return 6;
        }
        if (reason == 3) {
            return 0;
        }
        if (reason == 4) {
            return 1;
        }
        if (reason == 5) {
            return 2;
        }
        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
        return 11;
    }

    public static boolean L(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iN = N(context, str, "bool");
            if (iN > 0) {
                return resources.getBoolean(iN);
            }
            int iN2 = N(context, str, "string");
            if (iN2 > 0) {
                return Boolean.parseBoolean(context.getString(iN2));
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int M() {
        boolean zR = R();
        ?? r0 = zR;
        if (S()) {
            r0 = (zR ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int N(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String O(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = f518a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static void P(int i2, r96 r96Var, k4e k4eVar, boolean z) {
        w2e w2eVar;
        w2e w2eVar2;
        boolean z2;
        w2e w2eVar3;
        w2e w2eVar4;
        if (k4eVar.n) {
            return;
        }
        if (!(k4eVar instanceof l4e) && k4eVar.B() && I(k4eVar)) {
            l4e.c0(k4eVar, r96Var, new q96());
        }
        w2e w2eVarK = k4eVar.k(2);
        w2e w2eVarK2 = k4eVar.k(4);
        int iD = w2eVarK.d();
        int iD2 = w2eVarK2.d();
        HashSet<w2e> hashSet = w2eVarK.f38443a;
        j4e j4eVar = j4e.c;
        if (hashSet != null && w2eVarK.c) {
            for (w2e w2eVar5 : hashSet) {
                k4e k4eVar2 = w2eVar5.d;
                int i3 = i2 + 1;
                boolean zI = I(k4eVar2);
                w2e w2eVar6 = k4eVar2.J;
                w2e w2eVar7 = k4eVar2.L;
                if (k4eVar2.B() && zI) {
                    z2 = true;
                    l4e.c0(k4eVar2, r96Var, new q96());
                } else {
                    z2 = true;
                }
                boolean z3 = ((w2eVar5 == w2eVar6 && (w2eVar4 = w2eVar7.f) != null && w2eVar4.c) || (w2eVar5 == w2eVar7 && (w2eVar3 = w2eVar6.f) != null && w2eVar3.c)) ? z2 : false;
                j4e j4eVar2 = k4eVar2.U[0];
                if (j4eVar2 != j4eVar || zI) {
                    if (!k4eVar2.B()) {
                        if (w2eVar5 == w2eVar6 && w2eVar7.f == null) {
                            int iE = w2eVar6.e() + iD;
                            k4eVar2.M(iE, k4eVar2.s() + iE);
                            P(i3, r96Var, k4eVar2, z);
                        } else if (w2eVar5 == w2eVar7 && w2eVar6.f == null) {
                            int iE2 = iD - w2eVar7.e();
                            k4eVar2.M(iE2 - k4eVar2.s(), iE2);
                            P(i3, r96Var, k4eVar2, z);
                        } else if (z3 && !k4eVar2.z()) {
                            X(i3, r96Var, k4eVar2, z);
                        }
                    }
                } else if (j4eVar2 == j4eVar && k4eVar2.w >= 0 && k4eVar2.v >= 0 && (k4eVar2.i0 == 8 || (k4eVar2.s == 0 && k4eVar2.Y == 0.0f))) {
                    if (!k4eVar2.z() && !k4eVar2.G && z3 && !k4eVar2.z()) {
                        Y(i3, k4eVar, r96Var, k4eVar2, z);
                    }
                }
            }
        }
        if (k4eVar instanceof qiv) {
            return;
        }
        HashSet<w2e> hashSet2 = w2eVarK2.f38443a;
        if (hashSet2 != null && w2eVarK2.c) {
            for (w2e w2eVar8 : hashSet2) {
                k4e k4eVar3 = w2eVar8.d;
                int i4 = i2 + 1;
                boolean zI2 = I(k4eVar3);
                w2e w2eVar9 = k4eVar3.J;
                w2e w2eVar10 = k4eVar3.L;
                if (k4eVar3.B() && zI2) {
                    l4e.c0(k4eVar3, r96Var, new q96());
                }
                boolean z4 = (w2eVar8 == w2eVar9 && (w2eVar2 = w2eVar10.f) != null && w2eVar2.c) || (w2eVar8 == w2eVar10 && (w2eVar = w2eVar9.f) != null && w2eVar.c);
                j4e j4eVar3 = k4eVar3.U[0];
                if (j4eVar3 != j4eVar || zI2) {
                    if (!k4eVar3.B()) {
                        if (w2eVar8 == w2eVar9 && w2eVar10.f == null) {
                            int iE3 = w2eVar9.e() + iD2;
                            k4eVar3.M(iE3, k4eVar3.s() + iE3);
                            P(i4, r96Var, k4eVar3, z);
                        } else if (w2eVar8 == w2eVar10 && w2eVar9.f == null) {
                            int iE4 = iD2 - w2eVar10.e();
                            k4eVar3.M(iE4 - k4eVar3.s(), iE4);
                            P(i4, r96Var, k4eVar3, z);
                        } else if (z4 && !k4eVar3.z()) {
                            X(i4, r96Var, k4eVar3, z);
                        }
                    }
                } else if (j4eVar3 == j4eVar && k4eVar3.w >= 0 && k4eVar3.v >= 0) {
                    if (k4eVar3.i0 == 8 || (k4eVar3.s == 0 && k4eVar3.Y == 0.0f)) {
                        if (!k4eVar3.z() && !k4eVar3.G && z4 && !k4eVar3.z()) {
                            Y(i4, k4eVar, r96Var, k4eVar3, z);
                        }
                    }
                }
            }
        }
        k4eVar.n = true;
    }

    public static final boolean Q(eat eatVar) {
        eatVar.getClass();
        return eatVar.f7485a.isEmpty() && eatVar.b.isEmpty() && eatVar.c.isEmpty();
    }

    public static boolean R() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean S() {
        boolean zR = R();
        String str = Build.TAGS;
        if ((zR || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zR && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static final long T(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(i2, i3);
        if (iMax == 0) {
            return 0L;
        }
        float f2 = iMax;
        float f3 = iMin;
        float fMin = Math.min(i2 / f2, i3 / f3);
        return (((long) si30.b(f3 * fMin)) & 4294967295L) | (((long) si30.b(f2 * fMin)) << 32);
    }

    public static final void U(bhu0 bhu0Var, e7z e7zVar) {
        long jY = ((rdx) e7zVar.h1.d).Y(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jY >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jY & 4294967295L)));
        bhu0Var.layout(iRound, iRound2, bhu0Var.getMeasuredWidth() + iRound, bhu0Var.getMeasuredHeight() + iRound2);
    }

    public static final ArrayList V(List list, Function0 function0) {
        cf60 cf60Var;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            pj30 pj30Var = (pj30) list.get(i3);
            Object objN = pj30Var.n();
            objN.getClass();
            lmn0 lmn0Var = ((p9q0) objN).b;
            e9q0 e9q0Var = (e9q0) lmn0Var.b;
            i83 i83Var = (i83) lmn0Var.c;
            a9q0 a9q0Var = (a9q0) ((hgk0) e9q0Var.f7435a).getValue();
            byte b2 = 6;
            if (a9q0Var == null) {
                cf60Var = new cf60(b2, i2, i2, new ozp0((byte) 13));
            } else {
                i83 i83VarC = e9q0.c(i83Var, a9q0Var);
                if (i83VarC == null) {
                    cf60Var = new cf60(b2, i2, i2, new ozp0((byte) 14));
                } else {
                    mkx mkxVarC = m2x.C(a9q0Var.k(i83VarC.b, i83VarC.c).d());
                    cf60Var = new cf60(b2, mkxVarC.c - mkxVarC.f21964a, mkxVarC.a(), new h3q0((Object) mkxVarC, (byte) 5));
                }
            }
            int i4 = cf60Var.b;
            int i5 = cf60Var.c;
            arrayList.add(new Pair(pj30Var.S(lgb.O(i4, i4, i5, i5)), (Function0) cf60Var.d));
        }
        return arrayList;
    }

    public static String W(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return O(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static void X(int i2, r96 r96Var, k4e k4eVar, boolean z) {
        float f2 = k4eVar.f0;
        w2e w2eVar = k4eVar.J;
        int iD = w2eVar.f.d();
        w2e w2eVar2 = k4eVar.L;
        int iD2 = w2eVar2.f.d();
        int iE = w2eVar.e() + iD;
        int iE2 = iD2 - w2eVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = k4eVar.s();
        int i3 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i3 = (iD - iD2) - iS;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iS;
        if (iD > iD2) {
            i5 = i4 - iS;
        }
        k4eVar.M(i4, i5);
        P(i2 + 1, r96Var, k4eVar, z);
    }

    public static void Y(int i2, k4e k4eVar, r96 r96Var, k4e k4eVar2, boolean z) {
        float f2 = k4eVar2.f0;
        w2e w2eVar = k4eVar2.J;
        int iE = w2eVar.e() + w2eVar.f.d();
        w2e w2eVar2 = k4eVar2.L;
        int iD = w2eVar2.f.d() - w2eVar2.e();
        if (iD >= iE) {
            int iS = k4eVar2.s();
            if (k4eVar2.i0 != 8) {
                int i3 = k4eVar2.s;
                if (i3 == 2) {
                    iS = (int) (k4eVar2.f0 * 0.5f * (k4eVar instanceof l4e ? k4eVar.s() : k4eVar.V.s()));
                } else if (i3 == 0) {
                    iS = iD - iE;
                }
                iS = Math.max(k4eVar2.v, iS);
                int i4 = k4eVar2.w;
                if (i4 > 0) {
                    iS = Math.min(i4, iS);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iS)) + 0.5f));
            k4eVar2.M(i5, iS + i5);
            P(i2 + 1, r96Var, k4eVar2, z);
        }
    }

    public static void Z(int i2, r96 r96Var, k4e k4eVar) {
        float f2 = k4eVar.g0;
        w2e w2eVar = k4eVar.K;
        int iD = w2eVar.f.d();
        w2e w2eVar2 = k4eVar.M;
        int iD2 = w2eVar2.f.d();
        int iE = w2eVar.e() + iD;
        int iE2 = iD2 - w2eVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = k4eVar.m();
        int i3 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i3 = (iD - iD2) - iM;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iM;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iM;
        }
        k4eVar.N(i5, i6);
        g0(i2 + 1, r96Var, k4eVar);
    }

    public static final void a(mm40 mm40Var, ty tyVar, fet fetVar, int i2) {
        fetVar.g0(431942001);
        int i3 = i2 | 6 | (fetVar.g(tyVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(tyVar, fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new xx(pz40VarF, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new xx(pz40VarF, (byte) 5);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = new xx(pz40VarF, (byte) 8);
                fetVar.o0(objP3);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1773560655, new ay(l7m0VarY, l7m0VarY2, v3c.Y(objArr3, (Function0) objP3, fetVar)), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var, tyVar, i2, (byte) 17);
        }
    }

    public static void a0(int i2, k4e k4eVar, r96 r96Var, k4e k4eVar2) {
        float f2 = k4eVar2.g0;
        w2e w2eVar = k4eVar2.K;
        int iE = w2eVar.e() + w2eVar.f.d();
        w2e w2eVar2 = k4eVar2.M;
        int iD = w2eVar2.f.d() - w2eVar2.e();
        if (iD >= iE) {
            int iM = k4eVar2.m();
            if (k4eVar2.i0 != 8) {
                int i3 = k4eVar2.t;
                if (i3 == 2) {
                    iM = (int) (f2 * 0.5f * (k4eVar instanceof l4e ? k4eVar.m() : k4eVar.V.m()));
                } else if (i3 == 0) {
                    iM = iD - iE;
                }
                iM = Math.max(k4eVar2.y, iM);
                int i4 = k4eVar2.z;
                if (i4 > 0) {
                    iM = Math.min(i4, iM);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iM)) + 0.5f));
            k4eVar2.N(i5, iM + i5);
            g0(i2 + 1, r96Var, k4eVar2);
        }
    }

    public static final void b(int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        String str2;
        str.getClass();
        fetVar.g0(-502845914);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 12.0f, 4.0f);
            y9q0 y9q0Var = new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            str2 = str;
            v8q0.a(str2, mm40VarK, StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(2), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i3 >> 3) & 14, 0, 130040);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i2, (byte) 2);
        }
    }

    public static String b0(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void c(edt0 edt0Var, float f2, float f3, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1547822594);
        int i3 = i2 | (fetVar2.g(edt0Var) ? 4 : 2) | (fetVar2.d(f2) ? 32 : 16) | (fetVar2.d(f3) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mz3 mz3VarX = l7x.X(Integer.valueOf(edt0Var.d), null, null, fetVar2, 0, 30);
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(o7k0.d(jm40.b, 1.0f), f2 + f3), ft40.b);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z2 = z;
            String str = edt0Var.c;
            n0q n0qVar = o7k0.c;
            k7x.b(str, null, n0qVar, mz3VarX, mz3VarX, null, null, null, null, z2 ? gqw0.d : gqw0.f, gqw0.A, null, fetVar2, 432, 6, 31200);
            fetVar2 = fetVar2;
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar2, i120.P(n0qVar, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m73getBlack400d7_KjU()), new y3d(staticColors.m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cak0(edt0Var, f2, f3, i2, (byte) 2);
        }
    }

    public static final mm40 c0(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, Function1 function1, int i2, boolean z, int i3, int i4, mrq mrqVar, List list, Function1 function2, n4d n4dVar, Function1 function3, n05 n05Var) {
        return mm40Var.e(jm40.b).e(new i2q0(j83Var, y9q0Var, mrqVar, function1, i2, z, i3, i4, list, function2, n4dVar, n05Var, function3));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:122:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x019f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a4 A[EDGE_INSN: B:136:0x01a4->B:137:0x01a6 BREAK  A[LOOP:0: B:125:0x0178->B:135:0x01a0], PHI: r9
  0x01a4: PHI (r9v5 boolean) = (r9v2 boolean), (r9v18 boolean) binds: [B:123:0x0171, B:167:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:147:0x023b  */
    /* JADX WARN: Code duplicated, block: B:148:0x023d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0248  */
    /* JADX WARN: Code duplicated, block: B:155:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0263  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:166:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void d(final j83 j83Var, final mm40 mm40Var, final y9q0 y9q0Var, Function1 function1, int i2, boolean z, final int i3, int i4, Map map, final n05 n05Var, fet fetVar, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        boolean z3;
        final Function1 function2;
        final boolean z4;
        final int i21;
        final Map map2;
        final int i22;
        yfe0 yfe0VarU;
        Function1 function3;
        boolean z5;
        int i23;
        Map map3;
        int length;
        List list;
        boolean z6;
        boolean z7;
        mrq mrqVar;
        Function1 function4;
        boolean z8;
        Object objP;
        pz40 pz40Var;
        boolean zG;
        Object objP2;
        int i24;
        boolean z9;
        Map map4;
        int i25;
        int size;
        int i26;
        i83 i83Var;
        int i27;
        int i28;
        boolean zI;
        int i29;
        int i30;
        fetVar.g0(-1343466571);
        if ((i5 & 6) == 0) {
            i8 = (fetVar.g(j83Var) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        int i31 = i7 & 8;
        if (i31 == 0) {
            if ((i5 & 3072) == 0) {
                i8 |= fetVar.i(function1) ? 2048 : 1024;
            }
            i9 = i7 & 16;
            if (i9 != 0) {
                if ((i5 & 24576) == 0) {
                    i10 = i2;
                    if (fetVar.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i8 |= i11;
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                    i8 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (fetVar.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i8 |= i13;
                }
                if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i8 |= i30;
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                    if ((i5 & 12582912) == 0) {
                        int i32 = i8;
                        if (fetVar.e(i4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i16 = i32 | i15;
                    }
                    i17 = i7 & 256;
                    if (i17 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(map)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                            i16 |= i18;
                        }
                        i19 = i16 | 805306368;
                        if ((i6 & 6) == 0) {
                            if ((i6 & 8) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i20 = i6 | i29;
                        } else {
                            i20 = i6;
                        }
                        z2 = false;
                        if ((i19 & 306783379) == 306783378 || (i20 & 3) != 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fetVar.U(i19 & 1, z3)) {
                            if (i31 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if (i9 != 0) {
                                i10 = 1;
                            }
                            if (i12 != 0) {
                                z5 = true;
                            } else {
                                z5 = z;
                            }
                            if (i14 != 0) {
                                i23 = 1;
                            } else {
                                i23 = i4;
                            }
                            if (i17 != 0) {
                                lun lunVar = lun.f20680a;
                                lunVar.getClass();
                                map3 = lunVar;
                            } else {
                                map3 = map;
                            }
                            aac.j0(i23, i3);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(1588900273);
                            fetVar.r(false);
                            Pair pair = l83.f19590a;
                            length = j83Var.b.length();
                            list = j83Var.f16067a;
                            if (list != null) {
                                z6 = z2;
                                z7 = z6;
                                break;
                            }
                            size = list.size();
                            i26 = 0;
                            while (true) {
                                if (i26 < size) {
                                    z6 = z2;
                                    z7 = z6;
                                    break;
                                }
                                i83Var = (i83) list.get(i26);
                                if (i83Var.f14321a instanceof fsm0) {
                                    z6 = z2;
                                } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                                    i27 = i83Var.b;
                                    i28 = i83Var.c;
                                    z6 = false;
                                    if (k83.b(0, length, i27, i28)) {
                                        z7 = true;
                                        break;
                                    }
                                } else {
                                    z6 = false;
                                }
                                i26++;
                                z2 = z6;
                            }
                            boolean zM = tnq0.m(j83Var);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            if (!z7 || zM) {
                                function4 = function3;
                                boolean z10 = z5;
                                int i33 = i10;
                                fetVar.e0(1590195670);
                                if ((i19 & 14) == 4) {
                                    z8 = true;
                                } else {
                                    z8 = z6;
                                }
                                objP = fetVar.P();
                                Object obj = ukd.f35823a;
                                if (z8 || objP == obj) {
                                    objP = androidx.compose.runtime.e.e(j83Var);
                                    fetVar.o0(objP);
                                }
                                pz40Var = (pz40) objP;
                                j83 j83Var2 = (j83) pz40Var.getValue();
                                zG = fetVar.g(pz40Var);
                                objP2 = fetVar.P();
                                if (zG || objP2 == obj) {
                                    objP2 = new we(pz40Var, (byte) 29);
                                    fetVar.o0(objP2);
                                }
                                int i34 = i19 << 6;
                                i24 = i23;
                                z9 = z10;
                                Map map5 = map3;
                                o(mm40Var, j83Var2, function4, z7, map5, y9q0Var, i33, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                                map4 = map5;
                                i25 = i33;
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1589148149);
                                ia6.a(j83Var, y9q0Var, mrqVar, null, z5, fetVar);
                                boolean z11 = z5;
                                i25 = i10;
                                Function1 function5 = function3;
                                mm40 mm40VarC0 = c0(mm40Var, j83Var, y9q0Var, function5, i25, z11, i3, i23, mrqVar, null, null, null, null, n05Var);
                                function4 = function5;
                                r71 r71Var = r71.r;
                                int iHashCode = Long.hashCode(fetVar.T);
                                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var, gqw0.x);
                                jpm0.o(fetVar, bh90VarM, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                fetVar.r(true);
                                fetVar.r(false);
                                i24 = i23;
                                map4 = map3;
                                z9 = z11;
                            }
                            i22 = i25;
                            z4 = z9;
                            i21 = i24;
                            map2 = map4;
                            function2 = function4;
                        } else {
                            fetVar.X();
                            function2 = function1;
                            z4 = z;
                            i21 = i4;
                            map2 = map;
                            i22 = i10;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.ba6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int iL = x8x.L(i5 | 1);
                                    int iL2 = x8x.L(i6);
                                    j83 j83Var3 = j83Var;
                                    mm40 mm40Var2 = mm40Var;
                                    y9q0 y9q0Var2 = y9q0Var;
                                    Function1 function6 = function2;
                                    byte b2 = i22;
                                    boolean z12 = z4;
                                    int i35 = i3;
                                    boolean z13 = i21;
                                    Map map6 = map2;
                                    n05 n05Var2 = n05Var;
                                    short s = i7;
                                    aad.d(j83Var3, mm40Var2, y9q0Var2, function6, b2, z12, i35, z13 ? 1 : 0, map6, n05Var2, (fet) obj2, iL, iL2, s);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    i19 = i16 | 805306368;
                    if ((i6 & 6) == 0) {
                        if ((i6 & 8) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i20 = i6 | i29;
                    } else {
                        i20 = i6;
                    }
                    z2 = false;
                    if ((i19 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i19 & 1, z3)) {
                        if (i31 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            i10 = 1;
                        }
                        if (i12 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        if (i14 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i4;
                        }
                        if (i17 != 0) {
                            lun lunVar2 = lun.f20680a;
                            lunVar2.getClass();
                            map3 = lunVar2;
                        } else {
                            map3 = map;
                        }
                        aac.j0(i23, i3);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(1588900273);
                        fetVar.r(false);
                        Pair pair2 = l83.f19590a;
                        length = j83Var.b.length();
                        list = j83Var.f16067a;
                        if (list != null) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        size = list.size();
                        i26 = 0;
                        while (true) {
                            if (i26 < size) {
                                z6 = z2;
                                z7 = z6;
                                break;
                            }
                            i83Var = (i83) list.get(i26);
                            if (i83Var.f14321a instanceof fsm0) {
                                z6 = z2;
                            } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                                i27 = i83Var.b;
                                i28 = i83Var.c;
                                z6 = false;
                                if (k83.b(0, length, i27, i28)) {
                                    z7 = true;
                                    break;
                                }
                            } else {
                                z6 = false;
                            }
                            i26++;
                            z2 = z6;
                        }
                        boolean zM2 = tnq0.m(j83Var);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        if (z7) {
                            function4 = function3;
                            boolean z12 = z5;
                            int i35 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj2 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var3 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i36 = i19 << 6;
                            i24 = i23;
                            z9 = z12;
                            Map map6 = map3;
                            o(mm40Var, j83Var3, function4, z7, map6, y9q0Var, i35, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map6;
                            i25 = i35;
                            fetVar.r(false);
                        } else {
                            function4 = function3;
                            boolean z13 = z5;
                            int i37 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var4 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i38 = i19 << 6;
                            i24 = i23;
                            z9 = z13;
                            Map map7 = map3;
                            o(mm40Var, j83Var4, function4, z7, map7, y9q0Var, i37, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i38) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map7;
                            i25 = i37;
                            fetVar.r(false);
                        }
                        i22 = i25;
                        z4 = z9;
                        i21 = i24;
                        map2 = map4;
                        function2 = function4;
                    } else {
                        fetVar.X();
                        function2 = function1;
                        z4 = z;
                        i21 = i4;
                        map2 = map;
                        i22 = i10;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.ba6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                int iL = x8x.L(i5 | 1);
                                int iL2 = x8x.L(i6);
                                j83 j83Var5 = j83Var;
                                mm40 mm40Var2 = mm40Var;
                                y9q0 y9q0Var2 = y9q0Var;
                                Function1 function6 = function2;
                                byte b2 = i22;
                                boolean z14 = z4;
                                int i39 = i3;
                                boolean z15 = i21;
                                Map map8 = map2;
                                n05 n05Var2 = n05Var;
                                short s = i7;
                                aad.d(j83Var5, mm40Var2, y9q0Var2, function6, b2, z14, i39, z15 ? 1 : 0, map8, n05Var2, (fet) obj4, iL, iL2, s);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i8 |= 12582912;
                i16 = i8;
                i17 = i7 & 256;
                if (i17 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(map)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i16 |= i18;
                    }
                    i19 = i16 | 805306368;
                    if ((i6 & 6) == 0) {
                        if ((i6 & 8) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i20 = i6 | i29;
                    } else {
                        i20 = i6;
                    }
                    z2 = false;
                    if ((i19 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i19 & 1, z3)) {
                        if (i31 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            i10 = 1;
                        }
                        if (i12 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        if (i14 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i4;
                        }
                        if (i17 != 0) {
                            lun lunVar3 = lun.f20680a;
                            lunVar3.getClass();
                            map3 = lunVar3;
                        } else {
                            map3 = map;
                        }
                        aac.j0(i23, i3);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(1588900273);
                        fetVar.r(false);
                        Pair pair3 = l83.f19590a;
                        length = j83Var.b.length();
                        list = j83Var.f16067a;
                        if (list != null) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        size = list.size();
                        i26 = 0;
                        while (true) {
                            if (i26 < size) {
                                z6 = z2;
                                z7 = z6;
                                break;
                            }
                            i83Var = (i83) list.get(i26);
                            if (i83Var.f14321a instanceof fsm0) {
                                z6 = z2;
                            } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                                i27 = i83Var.b;
                                i28 = i83Var.c;
                                z6 = false;
                                if (k83.b(0, length, i27, i28)) {
                                    z7 = true;
                                    break;
                                }
                            } else {
                                z6 = false;
                            }
                            i26++;
                            z2 = z6;
                        }
                        boolean zM3 = tnq0.m(j83Var);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        if (z7) {
                            function4 = function3;
                            boolean z14 = z5;
                            int i39 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj4 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var5 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i310 = i19 << 6;
                            i24 = i23;
                            z9 = z14;
                            Map map8 = map3;
                            o(mm40Var, j83Var5, function4, z7, map8, y9q0Var, i39, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i310) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map8;
                            i25 = i39;
                            fetVar.r(false);
                        } else {
                            function4 = function3;
                            boolean z15 = z5;
                            int i311 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj5 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var6 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i312 = i19 << 6;
                            i24 = i23;
                            z9 = z15;
                            Map map9 = map3;
                            o(mm40Var, j83Var6, function4, z7, map9, y9q0Var, i311, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i312) | (29360128 & i312) | (234881024 & i312) | (i312 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map9;
                            i25 = i311;
                            fetVar.r(false);
                        }
                        i22 = i25;
                        z4 = z9;
                        i21 = i24;
                        map2 = map4;
                        function2 = function4;
                    } else {
                        fetVar.X();
                        function2 = function1;
                        z4 = z;
                        i21 = i4;
                        map2 = map;
                        i22 = i10;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.ba6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int iL = x8x.L(i5 | 1);
                                int iL2 = x8x.L(i6);
                                j83 j83Var7 = j83Var;
                                mm40 mm40Var2 = mm40Var;
                                y9q0 y9q0Var2 = y9q0Var;
                                Function1 function6 = function2;
                                byte b2 = i22;
                                boolean z16 = z4;
                                int i313 = i3;
                                boolean z17 = i21;
                                Map map10 = map2;
                                n05 n05Var2 = n05Var;
                                short s = i7;
                                aad.d(j83Var7, mm40Var2, y9q0Var2, function6, b2, z16, i313, z17 ? 1 : 0, map10, n05Var2, (fet) obj6, iL, iL2, s);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar4 = lun.f20680a;
                        lunVar4.getClass();
                        map3 = lunVar4;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair4 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM4 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z16 = z5;
                        int i313 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj6 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var7 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i314 = i19 << 6;
                        i24 = i23;
                        z9 = z16;
                        Map map10 = map3;
                        o(mm40Var, j83Var7, function4, z7, map10, y9q0Var, i313, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i314) | (29360128 & i314) | (234881024 & i314) | (i314 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map10;
                        i25 = i313;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z17 = z5;
                        int i315 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj7 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var8 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i316 = i19 << 6;
                        i24 = i23;
                        z9 = z17;
                        Map map11 = map3;
                        o(mm40Var, j83Var8, function4, z7, map11, y9q0Var, i315, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i316) | (29360128 & i316) | (234881024 & i316) | (i316 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map11;
                        i25 = i315;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var9 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z18 = z4;
                            int i317 = i3;
                            boolean z19 = i21;
                            Map map12 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var9, mm40Var2, y9q0Var2, function6, b2, z18, i317, z19 ? 1 : 0, map12, n05Var2, (fet) obj8, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i8 |= 24576;
            i10 = i2;
            i12 = i7 & 32;
            if (i12 != 0) {
                i8 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (fetVar.h(z)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i8 |= i13;
            }
            if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i8 |= i30;
            }
            i14 = i7 & 128;
            if (i14 != 0) {
                if ((i5 & 12582912) == 0) {
                    int i317 = i8;
                    if (fetVar.e(i4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i16 = i317 | i15;
                }
                i17 = i7 & 256;
                if (i17 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(map)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i16 |= i18;
                    }
                    i19 = i16 | 805306368;
                    if ((i6 & 6) == 0) {
                        if ((i6 & 8) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i20 = i6 | i29;
                    } else {
                        i20 = i6;
                    }
                    z2 = false;
                    if ((i19 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i19 & 1, z3)) {
                        if (i31 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            i10 = 1;
                        }
                        if (i12 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        if (i14 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i4;
                        }
                        if (i17 != 0) {
                            lun lunVar5 = lun.f20680a;
                            lunVar5.getClass();
                            map3 = lunVar5;
                        } else {
                            map3 = map;
                        }
                        aac.j0(i23, i3);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(1588900273);
                        fetVar.r(false);
                        Pair pair5 = l83.f19590a;
                        length = j83Var.b.length();
                        list = j83Var.f16067a;
                        if (list != null) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        size = list.size();
                        i26 = 0;
                        while (true) {
                            if (i26 < size) {
                                z6 = z2;
                                z7 = z6;
                                break;
                            }
                            i83Var = (i83) list.get(i26);
                            if (i83Var.f14321a instanceof fsm0) {
                                z6 = z2;
                            } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                                i27 = i83Var.b;
                                i28 = i83Var.c;
                                z6 = false;
                                if (k83.b(0, length, i27, i28)) {
                                    z7 = true;
                                    break;
                                }
                            } else {
                                z6 = false;
                            }
                            i26++;
                            z2 = z6;
                        }
                        boolean zM5 = tnq0.m(j83Var);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        if (z7) {
                            function4 = function3;
                            boolean z18 = z5;
                            int i318 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj8 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var9 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i319 = i19 << 6;
                            i24 = i23;
                            z9 = z18;
                            Map map12 = map3;
                            o(mm40Var, j83Var9, function4, z7, map12, y9q0Var, i318, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i319) | (29360128 & i319) | (234881024 & i319) | (i319 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map12;
                            i25 = i318;
                            fetVar.r(false);
                        } else {
                            function4 = function3;
                            boolean z19 = z5;
                            int i3110 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj9 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var10 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i3111 = i19 << 6;
                            i24 = i23;
                            z9 = z19;
                            Map map13 = map3;
                            o(mm40Var, j83Var10, function4, z7, map13, y9q0Var, i3110, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111) | (29360128 & i3111) | (234881024 & i3111) | (i3111 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map13;
                            i25 = i3110;
                            fetVar.r(false);
                        }
                        i22 = i25;
                        z4 = z9;
                        i21 = i24;
                        map2 = map4;
                        function2 = function4;
                    } else {
                        fetVar.X();
                        function2 = function1;
                        z4 = z;
                        i21 = i4;
                        map2 = map;
                        i22 = i10;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.ba6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj10, Object obj11) {
                                ((Integer) obj11).getClass();
                                int iL = x8x.L(i5 | 1);
                                int iL2 = x8x.L(i6);
                                j83 j83Var11 = j83Var;
                                mm40 mm40Var2 = mm40Var;
                                y9q0 y9q0Var2 = y9q0Var;
                                Function1 function6 = function2;
                                byte b2 = i22;
                                boolean z110 = z4;
                                int i3112 = i3;
                                boolean z111 = i21;
                                Map map14 = map2;
                                n05 n05Var2 = n05Var;
                                short s = i7;
                                aad.d(j83Var11, mm40Var2, y9q0Var2, function6, b2, z110, i3112, z111 ? 1 : 0, map14, n05Var2, (fet) obj10, iL, iL2, s);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar6 = lun.f20680a;
                        lunVar6.getClass();
                        map3 = lunVar6;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair6 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM6 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z110 = z5;
                        int i3112 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj10 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var11 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3113 = i19 << 6;
                        i24 = i23;
                        z9 = z110;
                        Map map14 = map3;
                        o(mm40Var, j83Var11, function4, z7, map14, y9q0Var, i3112, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3113) | (29360128 & i3113) | (234881024 & i3113) | (i3113 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map14;
                        i25 = i3112;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z111 = z5;
                        int i3114 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj11 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var12 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3115 = i19 << 6;
                        i24 = i23;
                        z9 = z111;
                        Map map15 = map3;
                        o(mm40Var, j83Var12, function4, z7, map15, y9q0Var, i3114, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3115) | (29360128 & i3115) | (234881024 & i3115) | (i3115 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map15;
                        i25 = i3114;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var13 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z112 = z4;
                            int i3116 = i3;
                            boolean z113 = i21;
                            Map map16 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var13, mm40Var2, y9q0Var2, function6, b2, z112, i3116, z113 ? 1 : 0, map16, n05Var2, (fet) obj12, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i8 |= 12582912;
            i16 = i8;
            i17 = i7 & 256;
            if (i17 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(map)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar7 = lun.f20680a;
                        lunVar7.getClass();
                        map3 = lunVar7;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair7 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM7 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z112 = z5;
                        int i3116 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj12 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var13 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3117 = i19 << 6;
                        i24 = i23;
                        z9 = z112;
                        Map map16 = map3;
                        o(mm40Var, j83Var13, function4, z7, map16, y9q0Var, i3116, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3117) | (29360128 & i3117) | (234881024 & i3117) | (i3117 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map16;
                        i25 = i3116;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z113 = z5;
                        int i3118 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj13 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var14 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3119 = i19 << 6;
                        i24 = i23;
                        z9 = z113;
                        Map map17 = map3;
                        o(mm40Var, j83Var14, function4, z7, map17, y9q0Var, i3118, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3119) | (29360128 & i3119) | (234881024 & i3119) | (i3119 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map17;
                        i25 = i3118;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj14, Object obj15) {
                            ((Integer) obj15).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var15 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z114 = z4;
                            int i31110 = i3;
                            boolean z115 = i21;
                            Map map18 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var15, mm40Var2, y9q0Var2, function6, b2, z114, i31110, z115 ? 1 : 0, map18, n05Var2, (fet) obj14, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i16 |= 100663296;
            i19 = i16 | 805306368;
            if ((i6 & 6) == 0) {
                if ((i6 & 8) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i20 = i6 | i29;
            } else {
                i20 = i6;
            }
            z2 = false;
            if ((i19 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i19 & 1, z3)) {
                if (i31 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    i10 = 1;
                }
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                if (i14 != 0) {
                    i23 = 1;
                } else {
                    i23 = i4;
                }
                if (i17 != 0) {
                    lun lunVar8 = lun.f20680a;
                    lunVar8.getClass();
                    map3 = lunVar8;
                } else {
                    map3 = map;
                }
                aac.j0(i23, i3);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(1588900273);
                fetVar.r(false);
                Pair pair8 = l83.f19590a;
                length = j83Var.b.length();
                list = j83Var.f16067a;
                if (list != null) {
                    z6 = z2;
                    z7 = z6;
                    break;
                }
                size = list.size();
                i26 = 0;
                while (true) {
                    if (i26 < size) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    i83Var = (i83) list.get(i26);
                    if (i83Var.f14321a instanceof fsm0) {
                        z6 = z2;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                        i27 = i83Var.b;
                        i28 = i83Var.c;
                        z6 = false;
                        if (k83.b(0, length, i27, i28)) {
                            z7 = true;
                            break;
                        }
                    } else {
                        z6 = false;
                    }
                    i26++;
                    z2 = z6;
                }
                boolean zM8 = tnq0.m(j83Var);
                mrqVar = (mrq) fetVar.k(bmd.k);
                if (z7) {
                    function4 = function3;
                    boolean z114 = z5;
                    int i31110 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj14 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var15 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i31111 = i19 << 6;
                    i24 = i23;
                    z9 = z114;
                    Map map18 = map3;
                    o(mm40Var, j83Var15, function4, z7, map18, y9q0Var, i31110, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31111) | (29360128 & i31111) | (234881024 & i31111) | (i31111 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map18;
                    i25 = i31110;
                    fetVar.r(false);
                } else {
                    function4 = function3;
                    boolean z115 = z5;
                    int i31112 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj15 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var16 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i31113 = i19 << 6;
                    i24 = i23;
                    z9 = z115;
                    Map map19 = map3;
                    o(mm40Var, j83Var16, function4, z7, map19, y9q0Var, i31112, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31113) | (29360128 & i31113) | (234881024 & i31113) | (i31113 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map19;
                    i25 = i31112;
                    fetVar.r(false);
                }
                i22 = i25;
                z4 = z9;
                i21 = i24;
                map2 = map4;
                function2 = function4;
            } else {
                fetVar.X();
                function2 = function1;
                z4 = z;
                i21 = i4;
                map2 = map;
                i22 = i10;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ba6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        int iL = x8x.L(i5 | 1);
                        int iL2 = x8x.L(i6);
                        j83 j83Var17 = j83Var;
                        mm40 mm40Var2 = mm40Var;
                        y9q0 y9q0Var2 = y9q0Var;
                        Function1 function6 = function2;
                        byte b2 = i22;
                        boolean z116 = z4;
                        int i31114 = i3;
                        boolean z117 = i21;
                        Map map110 = map2;
                        n05 n05Var2 = n05Var;
                        short s = i7;
                        aad.d(j83Var17, mm40Var2, y9q0Var2, function6, b2, z116, i31114, z117 ? 1 : 0, map110, n05Var2, (fet) obj16, iL, iL2, s);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i8 |= 3072;
        i9 = i7 & 16;
        if (i9 != 0) {
            if ((i5 & 24576) == 0) {
                i10 = i2;
                if (fetVar.e(i10)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i8 |= i11;
            }
            i12 = i7 & 32;
            if (i12 != 0) {
                i8 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (fetVar.h(z)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i8 |= i13;
            }
            if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i8 |= i30;
            }
            i14 = i7 & 128;
            if (i14 != 0) {
                if ((i5 & 12582912) == 0) {
                    int i3120 = i8;
                    if (fetVar.e(i4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i16 = i3120 | i15;
                }
                i17 = i7 & 256;
                if (i17 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(map)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i16 |= i18;
                    }
                    i19 = i16 | 805306368;
                    if ((i6 & 6) == 0) {
                        if ((i6 & 8) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i20 = i6 | i29;
                    } else {
                        i20 = i6;
                    }
                    z2 = false;
                    if ((i19 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i19 & 1, z3)) {
                        if (i31 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            i10 = 1;
                        }
                        if (i12 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        if (i14 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i4;
                        }
                        if (i17 != 0) {
                            lun lunVar9 = lun.f20680a;
                            lunVar9.getClass();
                            map3 = lunVar9;
                        } else {
                            map3 = map;
                        }
                        aac.j0(i23, i3);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(1588900273);
                        fetVar.r(false);
                        Pair pair9 = l83.f19590a;
                        length = j83Var.b.length();
                        list = j83Var.f16067a;
                        if (list != null) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        size = list.size();
                        i26 = 0;
                        while (true) {
                            if (i26 < size) {
                                z6 = z2;
                                z7 = z6;
                                break;
                            }
                            i83Var = (i83) list.get(i26);
                            if (i83Var.f14321a instanceof fsm0) {
                                z6 = z2;
                            } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                                i27 = i83Var.b;
                                i28 = i83Var.c;
                                z6 = false;
                                if (k83.b(0, length, i27, i28)) {
                                    z7 = true;
                                    break;
                                }
                            } else {
                                z6 = false;
                            }
                            i26++;
                            z2 = z6;
                        }
                        boolean zM9 = tnq0.m(j83Var);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        if (z7) {
                            function4 = function3;
                            boolean z116 = z5;
                            int i31114 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj16 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var17 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i31115 = i19 << 6;
                            i24 = i23;
                            z9 = z116;
                            Map map110 = map3;
                            o(mm40Var, j83Var17, function4, z7, map110, y9q0Var, i31114, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31115) | (29360128 & i31115) | (234881024 & i31115) | (i31115 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map110;
                            i25 = i31114;
                            fetVar.r(false);
                        } else {
                            function4 = function3;
                            boolean z117 = z5;
                            int i31116 = i10;
                            fetVar.e0(1590195670);
                            if ((i19 & 14) == 4) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            objP = fetVar.P();
                            Object obj17 = ukd.f35823a;
                            if (z8) {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            } else {
                                objP = androidx.compose.runtime.e.e(j83Var);
                                fetVar.o0(objP);
                            }
                            pz40Var = (pz40) objP;
                            j83 j83Var18 = (j83) pz40Var.getValue();
                            zG = fetVar.g(pz40Var);
                            objP2 = fetVar.P();
                            if (zG) {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new we(pz40Var, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            int i31117 = i19 << 6;
                            i24 = i23;
                            z9 = z117;
                            Map map111 = map3;
                            o(mm40Var, j83Var18, function4, z7, map111, y9q0Var, i31116, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31117) | (29360128 & i31117) | (234881024 & i31117) | (i31117 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                            map4 = map111;
                            i25 = i31116;
                            fetVar.r(false);
                        }
                        i22 = i25;
                        z4 = z9;
                        i21 = i24;
                        map2 = map4;
                        function2 = function4;
                    } else {
                        fetVar.X();
                        function2 = function1;
                        z4 = z;
                        i21 = i4;
                        map2 = map;
                        i22 = i10;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.ba6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj18, Object obj19) {
                                ((Integer) obj19).getClass();
                                int iL = x8x.L(i5 | 1);
                                int iL2 = x8x.L(i6);
                                j83 j83Var19 = j83Var;
                                mm40 mm40Var2 = mm40Var;
                                y9q0 y9q0Var2 = y9q0Var;
                                Function1 function6 = function2;
                                byte b2 = i22;
                                boolean z118 = z4;
                                int i31118 = i3;
                                boolean z119 = i21;
                                Map map112 = map2;
                                n05 n05Var2 = n05Var;
                                short s = i7;
                                aad.d(j83Var19, mm40Var2, y9q0Var2, function6, b2, z118, i31118, z119 ? 1 : 0, map112, n05Var2, (fet) obj18, iL, iL2, s);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar10 = lun.f20680a;
                        lunVar10.getClass();
                        map3 = lunVar10;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair10 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM10 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z118 = z5;
                        int i31118 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj18 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var19 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i31119 = i19 << 6;
                        i24 = i23;
                        z9 = z118;
                        Map map112 = map3;
                        o(mm40Var, j83Var19, function4, z7, map112, y9q0Var, i31118, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31119) | (29360128 & i31119) | (234881024 & i31119) | (i31119 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map112;
                        i25 = i31118;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z119 = z5;
                        int i311110 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj19 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var110 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i311111 = i19 << 6;
                        i24 = i23;
                        z9 = z119;
                        Map map113 = map3;
                        o(mm40Var, j83Var110, function4, z7, map113, y9q0Var, i311110, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i311111) | (29360128 & i311111) | (234881024 & i311111) | (i311111 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map113;
                        i25 = i311110;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj110, Object obj111) {
                            ((Integer) obj111).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var111 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z1110 = z4;
                            int i311112 = i3;
                            boolean z1111 = i21;
                            Map map114 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var111, mm40Var2, y9q0Var2, function6, b2, z1110, i311112, z1111 ? 1 : 0, map114, n05Var2, (fet) obj110, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i8 |= 12582912;
            i16 = i8;
            i17 = i7 & 256;
            if (i17 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(map)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar11 = lun.f20680a;
                        lunVar11.getClass();
                        map3 = lunVar11;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair11 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM11 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z1110 = z5;
                        int i311112 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj110 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var111 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i311113 = i19 << 6;
                        i24 = i23;
                        z9 = z1110;
                        Map map114 = map3;
                        o(mm40Var, j83Var111, function4, z7, map114, y9q0Var, i311112, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i311113) | (29360128 & i311113) | (234881024 & i311113) | (i311113 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map114;
                        i25 = i311112;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z1111 = z5;
                        int i311114 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj111 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var112 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i311115 = i19 << 6;
                        i24 = i23;
                        z9 = z1111;
                        Map map115 = map3;
                        o(mm40Var, j83Var112, function4, z7, map115, y9q0Var, i311114, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i311115) | (29360128 & i311115) | (234881024 & i311115) | (i311115 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map115;
                        i25 = i311114;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj112, Object obj113) {
                            ((Integer) obj113).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var113 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z1112 = z4;
                            int i311116 = i3;
                            boolean z1113 = i21;
                            Map map116 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var113, mm40Var2, y9q0Var2, function6, b2, z1112, i311116, z1113 ? 1 : 0, map116, n05Var2, (fet) obj112, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i16 |= 100663296;
            i19 = i16 | 805306368;
            if ((i6 & 6) == 0) {
                if ((i6 & 8) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i20 = i6 | i29;
            } else {
                i20 = i6;
            }
            z2 = false;
            if ((i19 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i19 & 1, z3)) {
                if (i31 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    i10 = 1;
                }
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                if (i14 != 0) {
                    i23 = 1;
                } else {
                    i23 = i4;
                }
                if (i17 != 0) {
                    lun lunVar12 = lun.f20680a;
                    lunVar12.getClass();
                    map3 = lunVar12;
                } else {
                    map3 = map;
                }
                aac.j0(i23, i3);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(1588900273);
                fetVar.r(false);
                Pair pair12 = l83.f19590a;
                length = j83Var.b.length();
                list = j83Var.f16067a;
                if (list != null) {
                    z6 = z2;
                    z7 = z6;
                    break;
                }
                size = list.size();
                i26 = 0;
                while (true) {
                    if (i26 < size) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    i83Var = (i83) list.get(i26);
                    if (i83Var.f14321a instanceof fsm0) {
                        z6 = z2;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                        i27 = i83Var.b;
                        i28 = i83Var.c;
                        z6 = false;
                        if (k83.b(0, length, i27, i28)) {
                            z7 = true;
                            break;
                        }
                    } else {
                        z6 = false;
                    }
                    i26++;
                    z2 = z6;
                }
                boolean zM12 = tnq0.m(j83Var);
                mrqVar = (mrq) fetVar.k(bmd.k);
                if (z7) {
                    function4 = function3;
                    boolean z1112 = z5;
                    int i311116 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj112 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var113 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i311117 = i19 << 6;
                    i24 = i23;
                    z9 = z1112;
                    Map map116 = map3;
                    o(mm40Var, j83Var113, function4, z7, map116, y9q0Var, i311116, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i311117) | (29360128 & i311117) | (234881024 & i311117) | (i311117 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map116;
                    i25 = i311116;
                    fetVar.r(false);
                } else {
                    function4 = function3;
                    boolean z1113 = z5;
                    int i311118 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj113 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var114 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i311119 = i19 << 6;
                    i24 = i23;
                    z9 = z1113;
                    Map map117 = map3;
                    o(mm40Var, j83Var114, function4, z7, map117, y9q0Var, i311118, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i311119) | (29360128 & i311119) | (234881024 & i311119) | (i311119 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map117;
                    i25 = i311118;
                    fetVar.r(false);
                }
                i22 = i25;
                z4 = z9;
                i21 = i24;
                map2 = map4;
                function2 = function4;
            } else {
                fetVar.X();
                function2 = function1;
                z4 = z;
                i21 = i4;
                map2 = map;
                i22 = i10;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ba6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj114, Object obj115) {
                        ((Integer) obj115).getClass();
                        int iL = x8x.L(i5 | 1);
                        int iL2 = x8x.L(i6);
                        j83 j83Var115 = j83Var;
                        mm40 mm40Var2 = mm40Var;
                        y9q0 y9q0Var2 = y9q0Var;
                        Function1 function6 = function2;
                        byte b2 = i22;
                        boolean z1114 = z4;
                        int i3111110 = i3;
                        boolean z1115 = i21;
                        Map map118 = map2;
                        n05 n05Var2 = n05Var;
                        short s = i7;
                        aad.d(j83Var115, mm40Var2, y9q0Var2, function6, b2, z1114, i3111110, z1115 ? 1 : 0, map118, n05Var2, (fet) obj114, iL, iL2, s);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i8 |= 24576;
        i10 = i2;
        i12 = i7 & 32;
        if (i12 != 0) {
            i8 |= 196608;
        } else if ((i5 & 196608) == 0) {
            if (fetVar.h(z)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i8 |= i13;
        }
        if ((i5 & 1572864) == 0) {
            if (fetVar.e(i3)) {
                i30 = 1048576;
            } else {
                i30 = 524288;
            }
            i8 |= i30;
        }
        i14 = i7 & 128;
        if (i14 != 0) {
            if ((i5 & 12582912) == 0) {
                int i3121 = i8;
                if (fetVar.e(i4)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i16 = i3121 | i15;
            }
            i17 = i7 & 256;
            if (i17 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(map)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 805306368;
                if ((i6 & 6) == 0) {
                    if ((i6 & 8) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i20 = i6 | i29;
                } else {
                    i20 = i6;
                }
                z2 = false;
                if ((i19 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i19 & 1, z3)) {
                    if (i31 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    if (i14 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i4;
                    }
                    if (i17 != 0) {
                        lun lunVar13 = lun.f20680a;
                        lunVar13.getClass();
                        map3 = lunVar13;
                    } else {
                        map3 = map;
                    }
                    aac.j0(i23, i3);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(1588900273);
                    fetVar.r(false);
                    Pair pair13 = l83.f19590a;
                    length = j83Var.b.length();
                    list = j83Var.f16067a;
                    if (list != null) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    size = list.size();
                    i26 = 0;
                    while (true) {
                        if (i26 < size) {
                            z6 = z2;
                            z7 = z6;
                            break;
                        }
                        i83Var = (i83) list.get(i26);
                        if (i83Var.f14321a instanceof fsm0) {
                            z6 = z2;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                            i27 = i83Var.b;
                            i28 = i83Var.c;
                            z6 = false;
                            if (k83.b(0, length, i27, i28)) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i26++;
                        z2 = z6;
                    }
                    boolean zM13 = tnq0.m(j83Var);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    if (z7) {
                        function4 = function3;
                        boolean z1114 = z5;
                        int i3111110 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj114 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var115 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3111111 = i19 << 6;
                        i24 = i23;
                        z9 = z1114;
                        Map map118 = map3;
                        o(mm40Var, j83Var115, function4, z7, map118, y9q0Var, i3111110, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111111) | (29360128 & i3111111) | (234881024 & i3111111) | (i3111111 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map118;
                        i25 = i3111110;
                        fetVar.r(false);
                    } else {
                        function4 = function3;
                        boolean z1115 = z5;
                        int i3111112 = i10;
                        fetVar.e0(1590195670);
                        if ((i19 & 14) == 4) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        objP = fetVar.P();
                        Object obj115 = ukd.f35823a;
                        if (z8) {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        } else {
                            objP = androidx.compose.runtime.e.e(j83Var);
                            fetVar.o0(objP);
                        }
                        pz40Var = (pz40) objP;
                        j83 j83Var116 = (j83) pz40Var.getValue();
                        zG = fetVar.g(pz40Var);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new we(pz40Var, (byte) 29);
                            fetVar.o0(objP2);
                        }
                        int i3111113 = i19 << 6;
                        i24 = i23;
                        z9 = z1115;
                        Map map119 = map3;
                        o(mm40Var, j83Var116, function4, z7, map119, y9q0Var, i3111112, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111113) | (29360128 & i3111113) | (234881024 & i3111113) | (i3111113 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                        map4 = map119;
                        i25 = i3111112;
                        fetVar.r(false);
                    }
                    i22 = i25;
                    z4 = z9;
                    i21 = i24;
                    map2 = map4;
                    function2 = function4;
                } else {
                    fetVar.X();
                    function2 = function1;
                    z4 = z;
                    i21 = i4;
                    map2 = map;
                    i22 = i10;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ba6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj116, Object obj117) {
                            ((Integer) obj117).getClass();
                            int iL = x8x.L(i5 | 1);
                            int iL2 = x8x.L(i6);
                            j83 j83Var117 = j83Var;
                            mm40 mm40Var2 = mm40Var;
                            y9q0 y9q0Var2 = y9q0Var;
                            Function1 function6 = function2;
                            byte b2 = i22;
                            boolean z1116 = z4;
                            int i3111114 = i3;
                            boolean z1117 = i21;
                            Map map1110 = map2;
                            n05 n05Var2 = n05Var;
                            short s = i7;
                            aad.d(j83Var117, mm40Var2, y9q0Var2, function6, b2, z1116, i3111114, z1117 ? 1 : 0, map1110, n05Var2, (fet) obj116, iL, iL2, s);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i16 |= 100663296;
            i19 = i16 | 805306368;
            if ((i6 & 6) == 0) {
                if ((i6 & 8) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i20 = i6 | i29;
            } else {
                i20 = i6;
            }
            z2 = false;
            if ((i19 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i19 & 1, z3)) {
                if (i31 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    i10 = 1;
                }
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                if (i14 != 0) {
                    i23 = 1;
                } else {
                    i23 = i4;
                }
                if (i17 != 0) {
                    lun lunVar14 = lun.f20680a;
                    lunVar14.getClass();
                    map3 = lunVar14;
                } else {
                    map3 = map;
                }
                aac.j0(i23, i3);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(1588900273);
                fetVar.r(false);
                Pair pair14 = l83.f19590a;
                length = j83Var.b.length();
                list = j83Var.f16067a;
                if (list != null) {
                    z6 = z2;
                    z7 = z6;
                    break;
                }
                size = list.size();
                i26 = 0;
                while (true) {
                    if (i26 < size) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    i83Var = (i83) list.get(i26);
                    if (i83Var.f14321a instanceof fsm0) {
                        z6 = z2;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                        i27 = i83Var.b;
                        i28 = i83Var.c;
                        z6 = false;
                        if (k83.b(0, length, i27, i28)) {
                            z7 = true;
                            break;
                        }
                    } else {
                        z6 = false;
                    }
                    i26++;
                    z2 = z6;
                }
                boolean zM14 = tnq0.m(j83Var);
                mrqVar = (mrq) fetVar.k(bmd.k);
                if (z7) {
                    function4 = function3;
                    boolean z1116 = z5;
                    int i3111114 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj116 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var117 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i3111115 = i19 << 6;
                    i24 = i23;
                    z9 = z1116;
                    Map map1110 = map3;
                    o(mm40Var, j83Var117, function4, z7, map1110, y9q0Var, i3111114, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111115) | (29360128 & i3111115) | (234881024 & i3111115) | (i3111115 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map1110;
                    i25 = i3111114;
                    fetVar.r(false);
                } else {
                    function4 = function3;
                    boolean z1117 = z5;
                    int i3111116 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj117 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var118 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i3111117 = i19 << 6;
                    i24 = i23;
                    z9 = z1117;
                    Map map1111 = map3;
                    o(mm40Var, j83Var118, function4, z7, map1111, y9q0Var, i3111116, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111117) | (29360128 & i3111117) | (234881024 & i3111117) | (i3111117 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map1111;
                    i25 = i3111116;
                    fetVar.r(false);
                }
                i22 = i25;
                z4 = z9;
                i21 = i24;
                map2 = map4;
                function2 = function4;
            } else {
                fetVar.X();
                function2 = function1;
                z4 = z;
                i21 = i4;
                map2 = map;
                i22 = i10;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ba6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj118, Object obj119) {
                        ((Integer) obj119).getClass();
                        int iL = x8x.L(i5 | 1);
                        int iL2 = x8x.L(i6);
                        j83 j83Var119 = j83Var;
                        mm40 mm40Var2 = mm40Var;
                        y9q0 y9q0Var2 = y9q0Var;
                        Function1 function6 = function2;
                        byte b2 = i22;
                        boolean z1118 = z4;
                        int i3111118 = i3;
                        boolean z1119 = i21;
                        Map map1112 = map2;
                        n05 n05Var2 = n05Var;
                        short s = i7;
                        aad.d(j83Var119, mm40Var2, y9q0Var2, function6, b2, z1118, i3111118, z1119 ? 1 : 0, map1112, n05Var2, (fet) obj118, iL, iL2, s);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i8 |= 12582912;
        i16 = i8;
        i17 = i7 & 256;
        if (i17 != 0) {
            if ((i5 & 100663296) == 0) {
                if (fetVar.i(map)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i16 |= i18;
            }
            i19 = i16 | 805306368;
            if ((i6 & 6) == 0) {
                if ((i6 & 8) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i20 = i6 | i29;
            } else {
                i20 = i6;
            }
            z2 = false;
            if ((i19 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i19 & 1, z3)) {
                if (i31 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    i10 = 1;
                }
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                if (i14 != 0) {
                    i23 = 1;
                } else {
                    i23 = i4;
                }
                if (i17 != 0) {
                    lun lunVar15 = lun.f20680a;
                    lunVar15.getClass();
                    map3 = lunVar15;
                } else {
                    map3 = map;
                }
                aac.j0(i23, i3);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(1588900273);
                fetVar.r(false);
                Pair pair15 = l83.f19590a;
                length = j83Var.b.length();
                list = j83Var.f16067a;
                if (list != null) {
                    z6 = z2;
                    z7 = z6;
                    break;
                }
                size = list.size();
                i26 = 0;
                while (true) {
                    if (i26 < size) {
                        z6 = z2;
                        z7 = z6;
                        break;
                    }
                    i83Var = (i83) list.get(i26);
                    if (i83Var.f14321a instanceof fsm0) {
                        z6 = z2;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                        i27 = i83Var.b;
                        i28 = i83Var.c;
                        z6 = false;
                        if (k83.b(0, length, i27, i28)) {
                            z7 = true;
                            break;
                        }
                    } else {
                        z6 = false;
                    }
                    i26++;
                    z2 = z6;
                }
                boolean zM15 = tnq0.m(j83Var);
                mrqVar = (mrq) fetVar.k(bmd.k);
                if (z7) {
                    function4 = function3;
                    boolean z1118 = z5;
                    int i3111118 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj118 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var119 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i3111119 = i19 << 6;
                    i24 = i23;
                    z9 = z1118;
                    Map map1112 = map3;
                    o(mm40Var, j83Var119, function4, z7, map1112, y9q0Var, i3111118, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i3111119) | (29360128 & i3111119) | (234881024 & i3111119) | (i3111119 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map1112;
                    i25 = i3111118;
                    fetVar.r(false);
                } else {
                    function4 = function3;
                    boolean z1119 = z5;
                    int i31111110 = i10;
                    fetVar.e0(1590195670);
                    if ((i19 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    objP = fetVar.P();
                    Object obj119 = ukd.f35823a;
                    if (z8) {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    } else {
                        objP = androidx.compose.runtime.e.e(j83Var);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    j83 j83Var1110 = (j83) pz40Var.getValue();
                    zG = fetVar.g(pz40Var);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new we(pz40Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    int i31111111 = i19 << 6;
                    i24 = i23;
                    z9 = z1119;
                    Map map1113 = map3;
                    o(mm40Var, j83Var1110, function4, z7, map1113, y9q0Var, i31111110, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31111111) | (29360128 & i31111111) | (234881024 & i31111111) | (i31111111 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                    map4 = map1113;
                    i25 = i31111110;
                    fetVar.r(false);
                }
                i22 = i25;
                z4 = z9;
                i21 = i24;
                map2 = map4;
                function2 = function4;
            } else {
                fetVar.X();
                function2 = function1;
                z4 = z;
                i21 = i4;
                map2 = map;
                i22 = i10;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ba6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj1110, Object obj1111) {
                        ((Integer) obj1111).getClass();
                        int iL = x8x.L(i5 | 1);
                        int iL2 = x8x.L(i6);
                        j83 j83Var1111 = j83Var;
                        mm40 mm40Var2 = mm40Var;
                        y9q0 y9q0Var2 = y9q0Var;
                        Function1 function6 = function2;
                        byte b2 = i22;
                        boolean z11110 = z4;
                        int i31111112 = i3;
                        boolean z11111 = i21;
                        Map map1114 = map2;
                        n05 n05Var2 = n05Var;
                        short s = i7;
                        aad.d(j83Var1111, mm40Var2, y9q0Var2, function6, b2, z11110, i31111112, z11111 ? 1 : 0, map1114, n05Var2, (fet) obj1110, iL, iL2, s);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i16 |= 100663296;
        i19 = i16 | 805306368;
        if ((i6 & 6) == 0) {
            if ((i6 & 8) == 0) {
                zI = fetVar.g(n05Var);
            } else {
                zI = fetVar.i(n05Var);
            }
            if (zI) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i20 = i6 | i29;
        } else {
            i20 = i6;
        }
        z2 = false;
        if ((i19 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar.U(i19 & 1, z3)) {
            if (i31 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i9 != 0) {
                i10 = 1;
            }
            if (i12 != 0) {
                z5 = true;
            } else {
                z5 = z;
            }
            if (i14 != 0) {
                i23 = 1;
            } else {
                i23 = i4;
            }
            if (i17 != 0) {
                lun lunVar16 = lun.f20680a;
                lunVar16.getClass();
                map3 = lunVar16;
            } else {
                map3 = map;
            }
            aac.j0(i23, i3);
            if (fetVar.k(j5i0.f15934a) == null) {
                hny.b();
                return;
            }
            fetVar.e0(1588900273);
            fetVar.r(false);
            Pair pair16 = l83.f19590a;
            length = j83Var.b.length();
            list = j83Var.f16067a;
            if (list != null) {
                z6 = z2;
                z7 = z6;
                break;
            }
            size = list.size();
            i26 = 0;
            while (true) {
                if (i26 < size) {
                    z6 = z2;
                    z7 = z6;
                    break;
                }
                i83Var = (i83) list.get(i26);
                if (i83Var.f14321a instanceof fsm0) {
                    z6 = z2;
                } else if ("androidx.compose.foundation.text.inlineContent".equals(i83Var.d)) {
                    i27 = i83Var.b;
                    i28 = i83Var.c;
                    z6 = false;
                    if (k83.b(0, length, i27, i28)) {
                        z7 = true;
                        break;
                    }
                } else {
                    z6 = false;
                }
                i26++;
                z2 = z6;
            }
            boolean zM16 = tnq0.m(j83Var);
            mrqVar = (mrq) fetVar.k(bmd.k);
            if (z7) {
                function4 = function3;
                boolean z11110 = z5;
                int i31111112 = i10;
                fetVar.e0(1590195670);
                if ((i19 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                objP = fetVar.P();
                Object obj1110 = ukd.f35823a;
                if (z8) {
                    objP = androidx.compose.runtime.e.e(j83Var);
                    fetVar.o0(objP);
                } else {
                    objP = androidx.compose.runtime.e.e(j83Var);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                j83 j83Var1111 = (j83) pz40Var.getValue();
                zG = fetVar.g(pz40Var);
                objP2 = fetVar.P();
                if (zG) {
                    objP2 = new we(pz40Var, (byte) 29);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new we(pz40Var, (byte) 29);
                    fetVar.o0(objP2);
                }
                int i31111113 = i19 << 6;
                i24 = i23;
                z9 = z11110;
                Map map1114 = map3;
                o(mm40Var, j83Var1111, function4, z7, map1114, y9q0Var, i31111112, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31111113) | (29360128 & i31111113) | (234881024 & i31111113) | (i31111113 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                map4 = map1114;
                i25 = i31111112;
                fetVar.r(false);
            } else {
                function4 = function3;
                boolean z11111 = z5;
                int i31111114 = i10;
                fetVar.e0(1590195670);
                if ((i19 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                objP = fetVar.P();
                Object obj1111 = ukd.f35823a;
                if (z8) {
                    objP = androidx.compose.runtime.e.e(j83Var);
                    fetVar.o0(objP);
                } else {
                    objP = androidx.compose.runtime.e.e(j83Var);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                j83 j83Var1112 = (j83) pz40Var.getValue();
                zG = fetVar.g(pz40Var);
                objP2 = fetVar.P();
                if (zG) {
                    objP2 = new we(pz40Var, (byte) 29);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new we(pz40Var, (byte) 29);
                    fetVar.o0(objP2);
                }
                int i31111115 = i19 << 6;
                i24 = i23;
                z9 = z11111;
                Map map1115 = map3;
                o(mm40Var, j83Var1112, function4, z7, map1115, y9q0Var, i31111114, z9, i3, i24, mrqVar, (Function1) objP2, n05Var, fetVar, ((i19 >> 3) & 910) | ((i19 >> 12) & 57344) | ((i19 << 9) & 458752) | (3670016 & i31111115) | (29360128 & i31111115) | (234881024 & i31111115) | (i31111115 & 1879048192), ((i19 >> 21) & 896) | (57344 & (i20 << 12)));
                map4 = map1115;
                i25 = i31111114;
                fetVar.r(false);
            }
            i22 = i25;
            z4 = z9;
            i21 = i24;
            map2 = map4;
            function2 = function4;
        } else {
            fetVar.X();
            function2 = function1;
            z4 = z;
            i21 = i4;
            map2 = map;
            i22 = i10;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ba6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj1112, Object obj1113) {
                    ((Integer) obj1113).getClass();
                    int iL = x8x.L(i5 | 1);
                    int iL2 = x8x.L(i6);
                    j83 j83Var1113 = j83Var;
                    mm40 mm40Var2 = mm40Var;
                    y9q0 y9q0Var2 = y9q0Var;
                    Function1 function6 = function2;
                    byte b2 = i22;
                    boolean z11112 = z4;
                    int i31111116 = i3;
                    boolean z11113 = i21;
                    Map map1116 = map2;
                    n05 n05Var2 = n05Var;
                    short s = i7;
                    aad.d(j83Var1113, mm40Var2, y9q0Var2, function6, b2, z11112, i31111116, z11113 ? 1 : 0, map1116, n05Var2, (fet) obj1112, iL, iL2, s);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final rh1 d0(th1 th1Var) {
        int iOrdinal = th1Var.ordinal();
        if (iOrdinal == 0) {
            return rh1.b;
        }
        if (iOrdinal == 1) {
            return rh1.c;
        }
        if (iOrdinal == 2) {
            return rh1.d;
        }
        if (iOrdinal == 3) {
            return rh1.e;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0152  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x0158  */
    /* JADX WARN: Code duplicated, block: B:125:0x015c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0161  */
    /* JADX WARN: Code duplicated, block: B:128:0x0165  */
    /* JADX WARN: Code duplicated, block: B:129:0x0167  */
    /* JADX WARN: Code duplicated, block: B:131:0x016b  */
    /* JADX WARN: Code duplicated, block: B:132:0x016e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0172  */
    /* JADX WARN: Code duplicated, block: B:135:0x0175  */
    /* JADX WARN: Code duplicated, block: B:138:0x0182  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0261  */
    /* JADX WARN: Code duplicated, block: B:161:0x0267  */
    /* JADX WARN: Code duplicated, block: B:163:0x0295  */
    /* JADX WARN: Code duplicated, block: B:165:0x0299  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106 A[PHI: r18
  0x0106: PHI (r18v16 int) = (r18v4 int), (r18v10 int), (r18v11 int) binds: [B:94:0x0104, B:104:0x0121, B:103:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    public static final void e(String str, mm40 mm40Var, final y9q0 y9q0Var, Function1 function1, int i2, boolean z, int i3, int i4, n4d n4dVar, n05 n05Var, fet fetVar, final int i5, final int i6) {
        int i7;
        mm40 mm40Var2;
        int i8;
        Function1 function2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean zI;
        boolean z2;
        final String str2;
        final int i22;
        final int i23;
        final int i24;
        final n4d n4dVar2;
        final n05 n05Var2;
        final mm40 mm40Var3;
        final Function1 function3;
        final boolean z3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        Function1 function4;
        int i25;
        boolean z4;
        int i26;
        int i27;
        n4d n4dVar3;
        n05 n05Var3;
        mrq mrqVar;
        Executor executor;
        mrq mrqVar2;
        boolean z5;
        int i28;
        int i29;
        int i30;
        n4d n4dVar4;
        mm40 mm40VarC0;
        int i31;
        fetVar.g0(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (fetVar.g(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i32 = i6 & 2;
        if (i32 == 0) {
            if ((i5 & 48) == 0) {
                mm40Var2 = mm40Var;
                i7 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                if (fetVar.g(y9q0Var)) {
                    i31 = 256;
                } else {
                    i31 = 128;
                }
                i7 |= i31;
            }
            i8 = i6 & 8;
            if (i8 != 0) {
                if ((i5 & 3072) == 0) {
                    function2 = function1;
                    if (fetVar.i(function2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 16;
                if (i10 != 0) {
                    if ((i5 & 24576) == 0) {
                        if (fetVar.e(i2)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i7 |= i11;
                    }
                    i12 = i6 & 32;
                    if (i12 != 0) {
                        if ((196608 & i5) == 0) {
                            if (fetVar.h(z)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i7 |= i13;
                        }
                        i14 = i6 & 64;
                        if (i14 != 0) {
                            i7 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (fetVar.e(i3)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i7 |= i15;
                        }
                        i16 = i6 & 128;
                        if (i16 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (fetVar.e(i4)) {
                                    i17 = 8388608;
                                } else {
                                    i17 = 4194304;
                                }
                                i7 |= i17;
                            }
                            i18 = i6 & 256;
                            if (i18 != 0) {
                                if ((i5 & 100663296) == 0) {
                                    if (fetVar.i(n4dVar)) {
                                        i19 = 67108864;
                                    } else {
                                        i19 = 33554432;
                                    }
                                    i7 |= i19;
                                }
                                i20 = i6 & 512;
                                i21 = 805306368;
                                if (i20 == 0) {
                                    i7 |= i21;
                                } else if ((i5 & 805306368) == 0) {
                                    if ((i5 & 1073741824) == 0) {
                                        zI = fetVar.g(n05Var);
                                    } else {
                                        zI = fetVar.i(n05Var);
                                    }
                                    if (zI) {
                                        i21 = 536870912;
                                    } else {
                                        i21 = 268435456;
                                    }
                                    i7 |= i21;
                                }
                                if ((i7 & 306783379) != 306783378) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (fetVar.U(i7 & 1, z2)) {
                                    if (i32 != 0) {
                                        mm40Var4 = jm40.b;
                                    } else {
                                        mm40Var4 = mm40Var2;
                                    }
                                    if (i8 != 0) {
                                        function4 = null;
                                    } else {
                                        function4 = function2;
                                    }
                                    if (i10 != 0) {
                                        i25 = 1;
                                    } else {
                                        i25 = i2;
                                    }
                                    if (i12 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z;
                                    }
                                    if (i14 != 0) {
                                        i26 = Integer.MAX_VALUE;
                                    } else {
                                        i26 = i3;
                                    }
                                    if (i16 != 0) {
                                        i27 = 1;
                                    } else {
                                        i27 = i4;
                                    }
                                    if (i18 != 0) {
                                        n4dVar3 = null;
                                    } else {
                                        n4dVar3 = n4dVar;
                                    }
                                    if (i20 != 0) {
                                        n05Var3 = null;
                                    } else {
                                        n05Var3 = n05Var;
                                    }
                                    aac.j0(i27, i26);
                                    if (fetVar.k(j5i0.f15934a) == null) {
                                        hny.b();
                                        return;
                                    }
                                    fetVar.e0(357055103);
                                    fetVar.r(false);
                                    mrqVar = (mrq) fetVar.k(bmd.k);
                                    executor = (Executor) fetVar.k(ia6.f14421a);
                                    if (executor == null && ia6.b(str.length())) {
                                        fetVar.e0(-1250263182);
                                        try {
                                            mrqVar2 = mrqVar;
                                            boolean z6 = z4;
                                            try {
                                                z4 = z6;
                                                try {
                                                    executor.execute(new ha6((byte) 0, y9q0Var, (k6z) fetVar.k(bmd.n), str, (w6k) fetVar.k(bmd.h), mrqVar2, z6));
                                                } catch (RejectedExecutionException unused) {
                                                }
                                            } catch (RejectedExecutionException unused2) {
                                                z4 = z6;
                                            }
                                        } catch (RejectedExecutionException unused3) {
                                            mrqVar2 = mrqVar;
                                        }
                                        z5 = false;
                                        fetVar.r(false);
                                    } else {
                                        mrqVar2 = mrqVar;
                                        z5 = false;
                                        fetVar.e0(-1248455541);
                                        fetVar.r(false);
                                    }
                                    if (function4 == null || n05Var3 != null) {
                                        str2 = str;
                                        i28 = i27;
                                        i29 = i25;
                                        i30 = i26;
                                        n4dVar4 = n4dVar3;
                                        fetVar.e0(357432497);
                                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                        fetVar.r(false);
                                    } else {
                                        fetVar.e0(358076243);
                                        fetVar.r(z5);
                                        str2 = str;
                                        mrq mrqVar3 = mrqVar2;
                                        int i33 = i26;
                                        int i34 = i27;
                                        i29 = i25;
                                        n4dVar4 = n4dVar3;
                                        i30 = i33;
                                        i28 = i34;
                                        mm40VarC0 = mm40Var4.e(new u9q0(str2, y9q0Var, mrqVar3, i29, z4, i33, i34, n4dVar4));
                                    }
                                    r71 r71Var = r71.r;
                                    int iHashCode = Long.hashCode(fetVar.T);
                                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
                                    bh90 bh90VarM = fetVar.m();
                                    mkd.c0.getClass();
                                    fetVar.i0();
                                    if (fetVar.S) {
                                        fetVar.l(e7z.u1);
                                    } else {
                                        fetVar.r0();
                                    }
                                    jpm0.o(fetVar, r71Var, gqw0.x);
                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                    jpm0.n(fetVar);
                                    jpm0.o(fetVar, mm40VarC1, gqw0.v);
                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                    fetVar.r(true);
                                    z3 = z4;
                                    n4dVar2 = n4dVar4;
                                    mm40Var3 = mm40Var4;
                                    i23 = i30;
                                    i24 = i28;
                                    n05Var2 = n05Var3;
                                    i22 = i29;
                                    function3 = function4;
                                } else {
                                    str2 = str;
                                    fetVar.X();
                                    i22 = i2;
                                    i23 = i3;
                                    i24 = i4;
                                    n4dVar2 = n4dVar;
                                    n05Var2 = n05Var;
                                    mm40Var3 = mm40Var2;
                                    function3 = function2;
                                    z3 = z;
                                }
                                yfe0VarU = fetVar.u();
                                if (yfe0VarU != null) {
                                    yfe0VarU.d = new Function2() { // from class: a.aa6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                            return Unit.f46060a;
                                        }
                                    };
                                }
                            }
                            i7 |= 100663296;
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var2 = r71.r;
                                int iHashCode2 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM2 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var2, gqw0.x);
                                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 12582912;
                        i18 = i6 & 256;
                        if (i18 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (fetVar.i(n4dVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i7 |= i19;
                            }
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var3 = r71.r;
                                int iHashCode3 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM3 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var3, gqw0.x);
                                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC3, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var4 = r71.r;
                            int iHashCode4 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM4 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var4, gqw0.x);
                            jpm0.o(fetVar, bh90VarM4, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC4, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 196608;
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (fetVar.e(i3)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i7 |= i15;
                    }
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (fetVar.e(i4)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i7 |= i17;
                        }
                        i18 = i6 & 256;
                        if (i18 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (fetVar.i(n4dVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i7 |= i19;
                            }
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var5 = r71.r;
                                int iHashCode5 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM5 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var5, gqw0.x);
                                jpm0.o(fetVar, bh90VarM5, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC5, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode5), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var6 = r71.r;
                            int iHashCode6 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM6 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var6, gqw0.x);
                            jpm0.o(fetVar, bh90VarM6, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC6, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode6), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 12582912;
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var7 = r71.r;
                            int iHashCode7 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM7 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var7, gqw0.x);
                            jpm0.o(fetVar, bh90VarM7, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC7, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode7), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var8 = r71.r;
                        int iHashCode8 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM8 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var8, gqw0.x);
                        jpm0.o(fetVar, bh90VarM8, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC8, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode8), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 24576;
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        if (fetVar.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (fetVar.e(i3)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i7 |= i15;
                    }
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (fetVar.e(i4)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i7 |= i17;
                        }
                        i18 = i6 & 256;
                        if (i18 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (fetVar.i(n4dVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i7 |= i19;
                            }
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var9 = r71.r;
                                int iHashCode9 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM9 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var9, gqw0.x);
                                jpm0.o(fetVar, bh90VarM9, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC9, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode9), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var10 = r71.r;
                            int iHashCode10 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC10 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM10 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var10, gqw0.x);
                            jpm0.o(fetVar, bh90VarM10, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC10, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode10), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 12582912;
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var11 = r71.r;
                            int iHashCode11 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC11 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM11 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var11, gqw0.x);
                            jpm0.o(fetVar, bh90VarM11, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC11, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode11), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var12 = r71.r;
                        int iHashCode12 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC12 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM12 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var12, gqw0.x);
                        jpm0.o(fetVar, bh90VarM12, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC12, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode12), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var13 = r71.r;
                            int iHashCode13 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC13 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM13 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var13, gqw0.x);
                            jpm0.o(fetVar, bh90VarM13, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC13, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode13), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var14 = r71.r;
                        int iHashCode14 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC14 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM14 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var14, gqw0.x);
                        jpm0.o(fetVar, bh90VarM14, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC14, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode14), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var15 = r71.r;
                        int iHashCode15 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC15 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM15 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var15, gqw0.x);
                        jpm0.o(fetVar, bh90VarM15, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC15, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode15), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var16 = r71.r;
                    int iHashCode16 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC16 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM16 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var16, gqw0.x);
                    jpm0.o(fetVar, bh90VarM16, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC16, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode16), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 3072;
            function2 = function1;
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    if (fetVar.e(i2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        if (fetVar.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (fetVar.e(i3)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i7 |= i15;
                    }
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (fetVar.e(i4)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i7 |= i17;
                        }
                        i18 = i6 & 256;
                        if (i18 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (fetVar.i(n4dVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i7 |= i19;
                            }
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var17 = r71.r;
                                int iHashCode17 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC17 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM17 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var17, gqw0.x);
                                jpm0.o(fetVar, bh90VarM17, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC17, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode17), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var18 = r71.r;
                            int iHashCode18 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC18 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM18 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var18, gqw0.x);
                            jpm0.o(fetVar, bh90VarM18, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC18, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode18), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 12582912;
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var19 = r71.r;
                            int iHashCode19 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC19 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM19 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var19, gqw0.x);
                            jpm0.o(fetVar, bh90VarM19, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC19, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode19), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var110 = r71.r;
                        int iHashCode110 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC110 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM110 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var110, gqw0.x);
                        jpm0.o(fetVar, bh90VarM110, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC110, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode110), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var111 = r71.r;
                            int iHashCode111 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC111 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM111 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var111, gqw0.x);
                            jpm0.o(fetVar, bh90VarM111, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC111, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode111), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var112 = r71.r;
                        int iHashCode112 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC112 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM112 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var112, gqw0.x);
                        jpm0.o(fetVar, bh90VarM112, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC112, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode112), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var113 = r71.r;
                        int iHashCode113 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC113 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM113 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var113, gqw0.x);
                        jpm0.o(fetVar, bh90VarM113, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC113, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode113), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var114 = r71.r;
                    int iHashCode114 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC114 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM114 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var114, gqw0.x);
                    jpm0.o(fetVar, bh90VarM114, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC114, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode114), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    if (fetVar.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var115 = r71.r;
                            int iHashCode115 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC115 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM115 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var115, gqw0.x);
                            jpm0.o(fetVar, bh90VarM115, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC115, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode115), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var116 = r71.r;
                        int iHashCode116 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC116 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM116 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var116, gqw0.x);
                        jpm0.o(fetVar, bh90VarM116, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC116, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode116), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var117 = r71.r;
                        int iHashCode117 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC117 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM117 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var117, gqw0.x);
                        jpm0.o(fetVar, bh90VarM117, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC117, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode117), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var118 = r71.r;
                    int iHashCode118 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC118 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM118 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var118, gqw0.x);
                    jpm0.o(fetVar, bh90VarM118, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC118, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode118), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
            i16 = i6 & 128;
            if (i16 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (fetVar.e(i4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i7 |= i17;
                }
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var119 = r71.r;
                        int iHashCode119 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC119 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM119 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var119, gqw0.x);
                        jpm0.o(fetVar, bh90VarM119, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC119, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode119), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var1110 = r71.r;
                    int iHashCode1110 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC1110 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM1110 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var1110, gqw0.x);
                    jpm0.o(fetVar, bh90VarM1110, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1110, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode1110), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i18 = i6 & 256;
            if (i18 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(n4dVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i7 |= i19;
                }
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var1111 = r71.r;
                    int iHashCode1111 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC1111 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM1111 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var1111, gqw0.x);
                    jpm0.o(fetVar, bh90VarM1111, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1111, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode1111), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var1112 = r71.r;
                int iHashCode1112 = Long.hashCode(fetVar.T);
                mm40 mm40VarC1112 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM1112 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var1112, gqw0.x);
                jpm0.o(fetVar, bh90VarM1112, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1112, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1112), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 48;
        mm40Var2 = mm40Var;
        if ((i5 & 384) == 0) {
            if (fetVar.g(y9q0Var)) {
                i31 = 256;
            } else {
                i31 = 128;
            }
            i7 |= i31;
        }
        i8 = i6 & 8;
        if (i8 != 0) {
            if ((i5 & 3072) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i7 |= i9;
            }
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    if (fetVar.e(i2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        if (fetVar.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (fetVar.e(i3)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i7 |= i15;
                    }
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (fetVar.e(i4)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i7 |= i17;
                        }
                        i18 = i6 & 256;
                        if (i18 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (fetVar.i(n4dVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i7 |= i19;
                            }
                            i20 = i6 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i7 |= i21;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zI = fetVar.g(n05Var);
                                } else {
                                    zI = fetVar.i(n05Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i7 |= i21;
                            }
                            if ((i7 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (fetVar.U(i7 & 1, z2)) {
                                if (i32 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i2;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i3;
                                }
                                if (i16 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i4;
                                }
                                if (i18 != 0) {
                                    n4dVar3 = null;
                                } else {
                                    n4dVar3 = n4dVar;
                                }
                                if (i20 != 0) {
                                    n05Var3 = null;
                                } else {
                                    n05Var3 = n05Var;
                                }
                                aac.j0(i27, i26);
                                if (fetVar.k(j5i0.f15934a) == null) {
                                    hny.b();
                                    return;
                                }
                                fetVar.e0(357055103);
                                fetVar.r(false);
                                mrqVar = (mrq) fetVar.k(bmd.k);
                                executor = (Executor) fetVar.k(ia6.f14421a);
                                if (executor == null) {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                } else {
                                    mrqVar2 = mrqVar;
                                    z5 = false;
                                    fetVar.e0(-1248455541);
                                    fetVar.r(false);
                                }
                                if (function4 == null) {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                } else {
                                    str2 = str;
                                    i28 = i27;
                                    i29 = i25;
                                    i30 = i26;
                                    n4dVar4 = n4dVar3;
                                    fetVar.e0(357432497);
                                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                    fetVar.r(false);
                                }
                                r71 r71Var1113 = r71.r;
                                int iHashCode1113 = Long.hashCode(fetVar.T);
                                mm40 mm40VarC1113 = kbc.c0(fetVar, mm40VarC0);
                                bh90 bh90VarM1113 = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, r71Var1113, gqw0.x);
                                jpm0.o(fetVar, bh90VarM1113, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC1113, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode1113), gqw0.y);
                                fetVar.r(true);
                                z3 = z4;
                                n4dVar2 = n4dVar4;
                                mm40Var3 = mm40Var4;
                                i23 = i30;
                                i24 = i28;
                                n05Var2 = n05Var3;
                                i22 = i29;
                                function3 = function4;
                            } else {
                                str2 = str;
                                fetVar.X();
                                i22 = i2;
                                i23 = i3;
                                i24 = i4;
                                n4dVar2 = n4dVar;
                                n05Var2 = n05Var;
                                mm40Var3 = mm40Var2;
                                function3 = function2;
                                z3 = z;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.aa6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var1114 = r71.r;
                            int iHashCode1114 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC1114 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM1114 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var1114, gqw0.x);
                            jpm0.o(fetVar, bh90VarM1114, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC1114, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode1114), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 12582912;
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var1115 = r71.r;
                            int iHashCode1115 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC1115 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM1115 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var1115, gqw0.x);
                            jpm0.o(fetVar, bh90VarM1115, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC1115, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode1115), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var1116 = r71.r;
                        int iHashCode1116 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC1116 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM1116 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var1116, gqw0.x);
                        jpm0.o(fetVar, bh90VarM1116, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1116, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode1116), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var1117 = r71.r;
                            int iHashCode1117 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC1117 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM1117 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var1117, gqw0.x);
                            jpm0.o(fetVar, bh90VarM1117, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC1117, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode1117), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var1118 = r71.r;
                        int iHashCode1118 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC1118 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM1118 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var1118, gqw0.x);
                        jpm0.o(fetVar, bh90VarM1118, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1118, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode1118), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var1119 = r71.r;
                        int iHashCode1119 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC1119 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM1119 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var1119, gqw0.x);
                        jpm0.o(fetVar, bh90VarM1119, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1119, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode1119), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var11110 = r71.r;
                    int iHashCode11110 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC11110 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM11110 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var11110, gqw0.x);
                    jpm0.o(fetVar, bh90VarM11110, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC11110, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode11110), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    if (fetVar.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var11111 = r71.r;
                            int iHashCode11111 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC11111 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM11111 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var11111, gqw0.x);
                            jpm0.o(fetVar, bh90VarM11111, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC11111, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode11111), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var11112 = r71.r;
                        int iHashCode11112 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC11112 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM11112 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var11112, gqw0.x);
                        jpm0.o(fetVar, bh90VarM11112, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC11112, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode11112), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var11113 = r71.r;
                        int iHashCode11113 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC11113 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM11113 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var11113, gqw0.x);
                        jpm0.o(fetVar, bh90VarM11113, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC11113, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode11113), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var11114 = r71.r;
                    int iHashCode11114 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC11114 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM11114 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var11114, gqw0.x);
                    jpm0.o(fetVar, bh90VarM11114, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC11114, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode11114), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
            i16 = i6 & 128;
            if (i16 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (fetVar.e(i4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i7 |= i17;
                }
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var11115 = r71.r;
                        int iHashCode11115 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC11115 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM11115 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var11115, gqw0.x);
                        jpm0.o(fetVar, bh90VarM11115, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC11115, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode11115), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var11116 = r71.r;
                    int iHashCode11116 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC11116 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM11116 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var11116, gqw0.x);
                    jpm0.o(fetVar, bh90VarM11116, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC11116, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode11116), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i18 = i6 & 256;
            if (i18 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(n4dVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i7 |= i19;
                }
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var11117 = r71.r;
                    int iHashCode11117 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC11117 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM11117 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var11117, gqw0.x);
                    jpm0.o(fetVar, bh90VarM11117, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC11117, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode11117), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var11118 = r71.r;
                int iHashCode11118 = Long.hashCode(fetVar.T);
                mm40 mm40VarC11118 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM11118 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var11118, gqw0.x);
                jpm0.o(fetVar, bh90VarM11118, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC11118, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode11118), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 3072;
        function2 = function1;
        i10 = i6 & 16;
        if (i10 != 0) {
            if ((i5 & 24576) == 0) {
                if (fetVar.e(i2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    if (fetVar.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    i7 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (fetVar.e(i3)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
                i16 = i6 & 128;
                if (i16 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (fetVar.e(i4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i7 |= i17;
                    }
                    i18 = i6 & 256;
                    if (i18 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (fetVar.i(n4dVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i7 |= i19;
                        }
                        i20 = i6 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i7 |= i21;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zI = fetVar.g(n05Var);
                            } else {
                                zI = fetVar.i(n05Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i7 |= i21;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i7 & 1, z2)) {
                            if (i32 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i2;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i3;
                            }
                            if (i16 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i4;
                            }
                            if (i18 != 0) {
                                n4dVar3 = null;
                            } else {
                                n4dVar3 = n4dVar;
                            }
                            if (i20 != 0) {
                                n05Var3 = null;
                            } else {
                                n05Var3 = n05Var;
                            }
                            aac.j0(i27, i26);
                            if (fetVar.k(j5i0.f15934a) == null) {
                                hny.b();
                                return;
                            }
                            fetVar.e0(357055103);
                            fetVar.r(false);
                            mrqVar = (mrq) fetVar.k(bmd.k);
                            executor = (Executor) fetVar.k(ia6.f14421a);
                            if (executor == null) {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            } else {
                                mrqVar2 = mrqVar;
                                z5 = false;
                                fetVar.e0(-1248455541);
                                fetVar.r(false);
                            }
                            if (function4 == null) {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            } else {
                                str2 = str;
                                i28 = i27;
                                i29 = i25;
                                i30 = i26;
                                n4dVar4 = n4dVar3;
                                fetVar.e0(357432497);
                                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                                fetVar.r(false);
                            }
                            r71 r71Var11119 = r71.r;
                            int iHashCode11119 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC11119 = kbc.c0(fetVar, mm40VarC0);
                            bh90 bh90VarM11119 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, r71Var11119, gqw0.x);
                            jpm0.o(fetVar, bh90VarM11119, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC11119, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode11119), gqw0.y);
                            fetVar.r(true);
                            z3 = z4;
                            n4dVar2 = n4dVar4;
                            mm40Var3 = mm40Var4;
                            i23 = i30;
                            i24 = i28;
                            n05Var2 = n05Var3;
                            i22 = i29;
                            function3 = function4;
                        } else {
                            str2 = str;
                            fetVar.X();
                            i22 = i2;
                            i23 = i3;
                            i24 = i4;
                            n4dVar2 = n4dVar;
                            n05Var2 = n05Var;
                            mm40Var3 = mm40Var2;
                            function3 = function2;
                            z3 = z;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.aa6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var111110 = r71.r;
                        int iHashCode111110 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC111110 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM111110 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var111110, gqw0.x);
                        jpm0.o(fetVar, bh90VarM111110, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC111110, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode111110), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var111111 = r71.r;
                        int iHashCode111111 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC111111 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM111111 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var111111, gqw0.x);
                        jpm0.o(fetVar, bh90VarM111111, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC111111, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode111111), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var111112 = r71.r;
                    int iHashCode111112 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111112 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM111112 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var111112, gqw0.x);
                    jpm0.o(fetVar, bh90VarM111112, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111112, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode111112), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
            i16 = i6 & 128;
            if (i16 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (fetVar.e(i4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i7 |= i17;
                }
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var111113 = r71.r;
                        int iHashCode111113 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC111113 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM111113 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var111113, gqw0.x);
                        jpm0.o(fetVar, bh90VarM111113, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC111113, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode111113), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var111114 = r71.r;
                    int iHashCode111114 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111114 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM111114 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var111114, gqw0.x);
                    jpm0.o(fetVar, bh90VarM111114, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111114, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode111114), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i18 = i6 & 256;
            if (i18 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(n4dVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i7 |= i19;
                }
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var111115 = r71.r;
                    int iHashCode111115 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111115 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM111115 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var111115, gqw0.x);
                    jpm0.o(fetVar, bh90VarM111115, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111115, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode111115), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var111116 = r71.r;
                int iHashCode111116 = Long.hashCode(fetVar.T);
                mm40 mm40VarC111116 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM111116 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var111116, gqw0.x);
                jpm0.o(fetVar, bh90VarM111116, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC111116, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode111116), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 24576;
        i12 = i6 & 32;
        if (i12 != 0) {
            if ((196608 & i5) == 0) {
                if (fetVar.h(z)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i7 |= i13;
            }
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (fetVar.e(i3)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
            i16 = i6 & 128;
            if (i16 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (fetVar.e(i4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i7 |= i17;
                }
                i18 = i6 & 256;
                if (i18 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (fetVar.i(n4dVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i7 |= i19;
                    }
                    i20 = i6 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i7 |= i21;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zI = fetVar.g(n05Var);
                        } else {
                            zI = fetVar.i(n05Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i7 |= i21;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i7 & 1, z2)) {
                        if (i32 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i2;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i3;
                        }
                        if (i16 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i4;
                        }
                        if (i18 != 0) {
                            n4dVar3 = null;
                        } else {
                            n4dVar3 = n4dVar;
                        }
                        if (i20 != 0) {
                            n05Var3 = null;
                        } else {
                            n05Var3 = n05Var;
                        }
                        aac.j0(i27, i26);
                        if (fetVar.k(j5i0.f15934a) == null) {
                            hny.b();
                            return;
                        }
                        fetVar.e0(357055103);
                        fetVar.r(false);
                        mrqVar = (mrq) fetVar.k(bmd.k);
                        executor = (Executor) fetVar.k(ia6.f14421a);
                        if (executor == null) {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        } else {
                            mrqVar2 = mrqVar;
                            z5 = false;
                            fetVar.e0(-1248455541);
                            fetVar.r(false);
                        }
                        if (function4 == null) {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        } else {
                            str2 = str;
                            i28 = i27;
                            i29 = i25;
                            i30 = i26;
                            n4dVar4 = n4dVar3;
                            fetVar.e0(357432497);
                            mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                            fetVar.r(false);
                        }
                        r71 r71Var111117 = r71.r;
                        int iHashCode111117 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC111117 = kbc.c0(fetVar, mm40VarC0);
                        bh90 bh90VarM111117 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, r71Var111117, gqw0.x);
                        jpm0.o(fetVar, bh90VarM111117, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC111117, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode111117), gqw0.y);
                        fetVar.r(true);
                        z3 = z4;
                        n4dVar2 = n4dVar4;
                        mm40Var3 = mm40Var4;
                        i23 = i30;
                        i24 = i28;
                        n05Var2 = n05Var3;
                        i22 = i29;
                        function3 = function4;
                    } else {
                        str2 = str;
                        fetVar.X();
                        i22 = i2;
                        i23 = i3;
                        i24 = i4;
                        n4dVar2 = n4dVar;
                        n05Var2 = n05Var;
                        mm40Var3 = mm40Var2;
                        function3 = function2;
                        z3 = z;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.aa6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var111118 = r71.r;
                    int iHashCode111118 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111118 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM111118 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var111118, gqw0.x);
                    jpm0.o(fetVar, bh90VarM111118, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111118, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode111118), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i18 = i6 & 256;
            if (i18 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(n4dVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i7 |= i19;
                }
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var111119 = r71.r;
                    int iHashCode111119 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111119 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM111119 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var111119, gqw0.x);
                    jpm0.o(fetVar, bh90VarM111119, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111119, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode111119), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var1111110 = r71.r;
                int iHashCode1111110 = Long.hashCode(fetVar.T);
                mm40 mm40VarC1111110 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM1111110 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var1111110, gqw0.x);
                jpm0.o(fetVar, bh90VarM1111110, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1111110, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1111110), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 196608;
        i14 = i6 & 64;
        if (i14 != 0) {
            i7 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            if (fetVar.e(i3)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i7 |= i15;
        }
        i16 = i6 & 128;
        if (i16 != 0) {
            if ((i5 & 12582912) == 0) {
                if (fetVar.e(i4)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i7 |= i17;
            }
            i18 = i6 & 256;
            if (i18 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (fetVar.i(n4dVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i7 |= i19;
                }
                i20 = i6 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i7 |= i21;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zI = fetVar.g(n05Var);
                    } else {
                        zI = fetVar.i(n05Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i7 |= i21;
                }
                if ((i7 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i32 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i2;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i3;
                    }
                    if (i16 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i4;
                    }
                    if (i18 != 0) {
                        n4dVar3 = null;
                    } else {
                        n4dVar3 = n4dVar;
                    }
                    if (i20 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    aac.j0(i27, i26);
                    if (fetVar.k(j5i0.f15934a) == null) {
                        hny.b();
                        return;
                    }
                    fetVar.e0(357055103);
                    fetVar.r(false);
                    mrqVar = (mrq) fetVar.k(bmd.k);
                    executor = (Executor) fetVar.k(ia6.f14421a);
                    if (executor == null) {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    } else {
                        mrqVar2 = mrqVar;
                        z5 = false;
                        fetVar.e0(-1248455541);
                        fetVar.r(false);
                    }
                    if (function4 == null) {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    } else {
                        str2 = str;
                        i28 = i27;
                        i29 = i25;
                        i30 = i26;
                        n4dVar4 = n4dVar3;
                        fetVar.e0(357432497);
                        mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                        fetVar.r(false);
                    }
                    r71 r71Var1111111 = r71.r;
                    int iHashCode1111111 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC1111111 = kbc.c0(fetVar, mm40VarC0);
                    bh90 bh90VarM1111111 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, r71Var1111111, gqw0.x);
                    jpm0.o(fetVar, bh90VarM1111111, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1111111, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode1111111), gqw0.y);
                    fetVar.r(true);
                    z3 = z4;
                    n4dVar2 = n4dVar4;
                    mm40Var3 = mm40Var4;
                    i23 = i30;
                    i24 = i28;
                    n05Var2 = n05Var3;
                    i22 = i29;
                    function3 = function4;
                } else {
                    str2 = str;
                    fetVar.X();
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                    n4dVar2 = n4dVar;
                    n05Var2 = n05Var;
                    mm40Var3 = mm40Var2;
                    function3 = function2;
                    z3 = z;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.aa6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var1111112 = r71.r;
                int iHashCode1111112 = Long.hashCode(fetVar.T);
                mm40 mm40VarC1111112 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM1111112 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var1111112, gqw0.x);
                jpm0.o(fetVar, bh90VarM1111112, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1111112, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1111112), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 12582912;
        i18 = i6 & 256;
        if (i18 != 0) {
            if ((i5 & 100663296) == 0) {
                if (fetVar.i(n4dVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i7 |= i19;
            }
            i20 = i6 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i7 |= i21;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zI = fetVar.g(n05Var);
                } else {
                    zI = fetVar.i(n05Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            if ((i7 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i32 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i25 = 1;
                } else {
                    i25 = i2;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i3;
                }
                if (i16 != 0) {
                    i27 = 1;
                } else {
                    i27 = i4;
                }
                if (i18 != 0) {
                    n4dVar3 = null;
                } else {
                    n4dVar3 = n4dVar;
                }
                if (i20 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                aac.j0(i27, i26);
                if (fetVar.k(j5i0.f15934a) == null) {
                    hny.b();
                    return;
                }
                fetVar.e0(357055103);
                fetVar.r(false);
                mrqVar = (mrq) fetVar.k(bmd.k);
                executor = (Executor) fetVar.k(ia6.f14421a);
                if (executor == null) {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                } else {
                    mrqVar2 = mrqVar;
                    z5 = false;
                    fetVar.e0(-1248455541);
                    fetVar.r(false);
                }
                if (function4 == null) {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                } else {
                    str2 = str;
                    i28 = i27;
                    i29 = i25;
                    i30 = i26;
                    n4dVar4 = n4dVar3;
                    fetVar.e0(357432497);
                    mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                    fetVar.r(false);
                }
                r71 r71Var1111113 = r71.r;
                int iHashCode1111113 = Long.hashCode(fetVar.T);
                mm40 mm40VarC1111113 = kbc.c0(fetVar, mm40VarC0);
                bh90 bh90VarM1111113 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, r71Var1111113, gqw0.x);
                jpm0.o(fetVar, bh90VarM1111113, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1111113, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1111113), gqw0.y);
                fetVar.r(true);
                z3 = z4;
                n4dVar2 = n4dVar4;
                mm40Var3 = mm40Var4;
                i23 = i30;
                i24 = i28;
                n05Var2 = n05Var3;
                i22 = i29;
                function3 = function4;
            } else {
                str2 = str;
                fetVar.X();
                i22 = i2;
                i23 = i3;
                i24 = i4;
                n4dVar2 = n4dVar;
                n05Var2 = n05Var;
                mm40Var3 = mm40Var2;
                function3 = function2;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.aa6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 100663296;
        i20 = i6 & 512;
        i21 = 805306368;
        if (i20 == 0) {
            i7 |= i21;
        } else if ((i5 & 805306368) == 0) {
            if ((i5 & 1073741824) == 0) {
                zI = fetVar.g(n05Var);
            } else {
                zI = fetVar.i(n05Var);
            }
            if (zI) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i7 |= i21;
        }
        if ((i7 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i7 & 1, z2)) {
            if (i32 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i8 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i10 != 0) {
                i25 = 1;
            } else {
                i25 = i2;
            }
            if (i12 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i14 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i3;
            }
            if (i16 != 0) {
                i27 = 1;
            } else {
                i27 = i4;
            }
            if (i18 != 0) {
                n4dVar3 = null;
            } else {
                n4dVar3 = n4dVar;
            }
            if (i20 != 0) {
                n05Var3 = null;
            } else {
                n05Var3 = n05Var;
            }
            aac.j0(i27, i26);
            if (fetVar.k(j5i0.f15934a) == null) {
                hny.b();
                return;
            }
            fetVar.e0(357055103);
            fetVar.r(false);
            mrqVar = (mrq) fetVar.k(bmd.k);
            executor = (Executor) fetVar.k(ia6.f14421a);
            if (executor == null) {
                mrqVar2 = mrqVar;
                z5 = false;
                fetVar.e0(-1248455541);
                fetVar.r(false);
            } else {
                mrqVar2 = mrqVar;
                z5 = false;
                fetVar.e0(-1248455541);
                fetVar.r(false);
            }
            if (function4 == null) {
                str2 = str;
                i28 = i27;
                i29 = i25;
                i30 = i26;
                n4dVar4 = n4dVar3;
                fetVar.e0(357432497);
                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                fetVar.r(false);
            } else {
                str2 = str;
                i28 = i27;
                i29 = i25;
                i30 = i26;
                n4dVar4 = n4dVar3;
                fetVar.e0(357432497);
                mm40VarC0 = c0(mm40Var4, new j83(str2), y9q0Var, function4, i29, z4, i30, i28, (mrq) fetVar.k(bmd.k), null, null, n4dVar4, null, n05Var3);
                fetVar.r(false);
            }
            r71 r71Var1111114 = r71.r;
            int iHashCode1111114 = Long.hashCode(fetVar.T);
            mm40 mm40VarC1111114 = kbc.c0(fetVar, mm40VarC0);
            bh90 bh90VarM1111114 = fetVar.m();
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, r71Var1111114, gqw0.x);
            jpm0.o(fetVar, bh90VarM1111114, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1111114, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode1111114), gqw0.y);
            fetVar.r(true);
            z3 = z4;
            n4dVar2 = n4dVar4;
            mm40Var3 = mm40Var4;
            i23 = i30;
            i24 = i28;
            n05Var2 = n05Var3;
            i22 = i29;
            function3 = function4;
        } else {
            str2 = str;
            fetVar.X();
            i22 = i2;
            i23 = i3;
            i24 = i4;
            n4dVar2 = n4dVar;
            n05Var2 = n05Var;
            mm40Var3 = mm40Var2;
            function3 = function2;
            z3 = z;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.aa6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aad.e(str2, mm40Var3, y9q0Var, function3, i22, z3, i23, i24, n4dVar2, n05Var2, (fet) obj, x8x.L(i5 | 1), i6);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    public static final qx4 e0(gx4 gx4Var, ctf0 ctf0Var, mnb0 mnb0Var, String str, boolean z) {
        boolean z2;
        String strA;
        String strA2;
        boolean z3;
        boolean z4;
        gx6 gx6Var;
        boolean z5;
        boolean z6;
        boolean z7;
        double d2;
        double d3;
        gx4Var.getClass();
        ctf0Var.getClass();
        str.getClass();
        xyc xycVar = gx4Var.b;
        a8q0 a8q0Var = gx4Var.f12059a;
        dx6 dx6Var = gx4Var.c;
        vw6 vw6Var = dx6Var.b;
        boolean z8 = vw6Var.n || z;
        pn40 pn40Var = pn40.f27267a;
        BigDecimal bigDecimal = xycVar.d;
        boolean z9 = xycVar.f;
        BigDecimal bigDecimal2 = xycVar.f41701a;
        BigDecimal bigDecimal3 = xycVar.e;
        boolean z10 = z8;
        Object[] objArr = {pn40.c(bigDecimal.doubleValue(), p3u0.c)};
        lsm0 lsm0Var = ctf0Var.b;
        nx6 nx6Var = new nx6(a8q0Var, lsm0Var.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(objArr, 1)), false, false, false);
        if (!xycVar.g) {
            if (z9) {
                strA2 = lsm0Var.a(R.string.max_coef_v2, Arrays.copyOf(new Object[]{pn40.g(bigDecimal3)}, 1));
            } else {
                z2 = false;
                strA = lsm0Var.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
            }
            pln0 pln0Var = new pln0(strA, true, z2);
            wnb0 wnb0Var = new wnb0("", "", z2);
            if (!z10 || bigDecimal2.compareTo(bigDecimal) <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z10 || bigDecimal2.compareTo(bigDecimal3) >= 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            kke kkeVar = new kke(true, true, z3, z4);
            if (z10) {
                gx6Var = gx6.c;
            } else if (z10) {
                gx6Var = gx6.b;
            } else {
                if (bigDecimal2.compareTo(bigDecimal) >= 0 || bigDecimal2.compareTo(bigDecimal3) > 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((z5 && !z6) || z9) {
                    gx6Var = gx6.b;
                }
            }
            zv6 zv6Var = new zv6(nx6Var, pln0Var, wnb0Var, kkeVar, gx6Var, "", true);
            zv6 zv6VarZ = jar0.Z(dx6Var, ctf0Var, mnb0Var, str, z);
            hxo0 hxo0VarN = cvm0.n(gx4Var.d, str, z);
            iul iulVar = iul.e;
            oe9 oe9Var = oe9.f25112a;
            ue9 ue9Var = new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
            BigDecimal bigDecimal4 = xycVar.d;
            BigDecimal bigDecimal5 = xycVar.f41701a;
            if (!vw6Var.j) {
                if (!vw6Var.k && !bigDecimal5.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal5.compareTo(bigDecimal4) >= 0) {
                    if (!z) {
                        z7 = true;
                    }
                }
                return new qx4(new wul(iulVar, oe9Var, ue9Var, z7, false, true), hxo0VarN, zv6VarZ, zv6Var);
            }
            d2 = vw6Var.f38133a;
            if (d2 != -1.0d) {
                d3 = vw6Var.d;
                double d4 = vw6Var.e;
                if (d3 > d2 && d2 <= d4 && !bigDecimal5.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal5.compareTo(bigDecimal4) >= 0) {
                    if (!z) {
                        z7 = true;
                    }
                }
                return new qx4(new wul(iulVar, oe9Var, ue9Var, z7, false, true), hxo0VarN, zv6VarZ, zv6Var);
            }
            z7 = false;
            return new qx4(new wul(iulVar, oe9Var, ue9Var, z7, false, true), hxo0VarN, zv6VarZ, zv6Var);
        }
        strA2 = lsm0Var.a(R.string.min_coef_v2, Arrays.copyOf(new Object[]{bigDecimal}, 1));
        strA = strA2;
        z2 = false;
        pln0 pln0Var2 = new pln0(strA, true, z2);
        wnb0 wnb0Var2 = new wnb0("", "", z2);
        if (z10) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (z10) {
            z4 = false;
        } else {
            z4 = false;
        }
        kke kkeVar2 = new kke(true, true, z3, z4);
        if (z10) {
            gx6Var = gx6.c;
        } else if (z10) {
            gx6Var = gx6.b;
        } else {
            if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            gx6Var = z5 ? gx6.f12062a : gx6.f12062a;
        }
        zv6 zv6Var2 = new zv6(nx6Var, pln0Var2, wnb0Var2, kkeVar2, gx6Var, "", true);
        zv6 zv6VarZ2 = jar0.Z(dx6Var, ctf0Var, mnb0Var, str, z);
        hxo0 hxo0VarN2 = cvm0.n(gx4Var.d, str, z);
        iul iulVar2 = iul.e;
        oe9 oe9Var2 = oe9.f25112a;
        ue9 ue9Var2 = new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        BigDecimal bigDecimal6 = xycVar.d;
        BigDecimal bigDecimal7 = xycVar.f41701a;
        if (!vw6Var.j) {
            d2 = vw6Var.f38133a;
            if (d2 != -1.0d) {
                d3 = vw6Var.d;
                double d5 = vw6Var.e;
                if (d3 > d2) {
                }
            }
        } else if (!vw6Var.k) {
        }
        z7 = false;
        return new qx4(new wul(iulVar2, oe9Var2, ue9Var2, z7, false, true), hxo0VarN2, zv6VarZ2, zv6Var2);
    }

    public static final void f(int i2, fet fetVar, String str, Function0 function0, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-2083824073);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            ThemeColors themeColors = (ThemeColors) fetVar2.k(zaq0.b);
            long secondary60 = z ? themeColors.getSecondary60() : themeColors.getBackgroundContent();
            long secondary61 = z ? themeColors.getSecondary60() : themeColors.getSecondary60();
            psq psqVar = z ? psq.f : psq.e;
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(8.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(i120.Q(lgb.J(jm40Var, ugg0VarA), secondary60, jd8.n), 12.0f, 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.n(), secondary61, 0L, psqVar, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777210), fetVar2, (i3 & 14) | 48, 0, 131068);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ot8(str, z, function0, i2, (byte) 0);
        }
    }

    public static final ycs f0(g17 g17Var) {
        ovm0 nvm0Var;
        g17Var.getClass();
        if (g17Var.b != null) {
            if (Intrinsics.d(g17Var.c, Boolean.TRUE)) {
                return vcs.f37201a;
            }
            List<f17> list = g17Var.d;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (f17 f17Var : list) {
                    f17Var.getClass();
                    Long l = f17Var.f8752a;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (Intrinsics.d(f17Var.c, Boolean.TRUE)) {
                            nvm0Var = new mvm0(jLongValue);
                        } else {
                            List list2 = f17Var.d;
                            if (list2 == null) {
                                list2 = iun.f15405a;
                            }
                            nvm0Var = new nvm0(jLongValue, list2);
                        }
                    } else {
                        nvm0Var = null;
                    }
                    if (nvm0Var != null) {
                        arrayList.add(nvm0Var);
                    }
                }
                return new wcs(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [a.fet] */
    public static final void g(mm40 mm40Var, List list, int i2, Function1 function1, fet fetVar, int i3) {
        int i4;
        mm40 mm40Var2;
        Object mc0Var;
        yje yjeVar;
        list.getClass();
        function1.getClass();
        fetVar.g0(-1159729442);
        int i5 = 2048;
        int i6 = i3 | 6 | (fetVar.g(list) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            rah0 rah0VarT = wha0.T(fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Integer numValueOf = Integer.valueOf(i2);
            boolean zG = ((i6 & 896) == 256) | fetVar.g(rah0VarT) | fetVar.i(vneVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                yjeVar = null;
                i4 = i2;
                mc0Var = new mc0((Object) rah0VarT, i4, (Object) vneVar, yjeVar, (byte) 4);
                fetVar.o0(mc0Var);
            } else {
                i4 = i2;
                mc0Var = objP2;
                yjeVar = null;
            }
            m0x0.t(fetVar, numValueOf, (Function2) mc0Var);
            mm40Var2 = jm40.b;
            mm40 mm40VarP = wha0.P(o7k0.d(mm40Var2, 1.0f), rah0VarT, false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarP, 8.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, 1112044914, list);
            int i7 = 0;
            while (itV.hasNext()) {
                Object next = itV.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    ?? r17 = yjeVar;
                    q3d.p();
                    throw r17;
                }
                String str = (String) next;
                boolean z = i7 == i4;
                yje yjeVar2 = yjeVar;
                boolean zE = ((i6 & 7168) == i5) | fetVar.e(i7);
                Object objP3 = fetVar.P();
                if (zE || objP3 == obj) {
                    objP3 = new re1(function1, i7, (byte) 1);
                    fetVar.o0(objP3);
                }
                f(0, fetVar, str, (Function0) objP3, z);
                i5 = 2048;
                yjeVar = yjeVar2;
                i7 = i8;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            i4 = i2;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nt8(mm40Var2, list, i4, function1, i3);
        }
    }

    public static void g0(int i2, r96 r96Var, k4e k4eVar) {
        boolean z;
        w2e w2eVar;
        w2e w2eVar2;
        w2e w2eVar3;
        w2e w2eVar4;
        if (k4eVar.o) {
            return;
        }
        if (!(k4eVar instanceof l4e) && k4eVar.B() && I(k4eVar)) {
            l4e.c0(k4eVar, r96Var, new q96());
        }
        w2e w2eVarK = k4eVar.k(3);
        w2e w2eVarK2 = k4eVar.k(5);
        int iD = w2eVarK.d();
        int iD2 = w2eVarK2.d();
        HashSet<w2e> hashSet = w2eVarK.f38443a;
        j4e j4eVar = j4e.c;
        if (hashSet != null && w2eVarK.c) {
            for (w2e w2eVar5 : hashSet) {
                k4e k4eVar2 = w2eVar5.d;
                int i3 = i2 + 1;
                boolean zI = I(k4eVar2);
                w2e w2eVar6 = k4eVar2.K;
                w2e w2eVar7 = k4eVar2.M;
                if (k4eVar2.B() && zI) {
                    l4e.c0(k4eVar2, r96Var, new q96());
                }
                boolean z2 = (w2eVar5 == w2eVar6 && (w2eVar4 = w2eVar7.f) != null && w2eVar4.c) || (w2eVar5 == w2eVar7 && (w2eVar3 = w2eVar6.f) != null && w2eVar3.c);
                j4e j4eVar2 = k4eVar2.U[1];
                if (j4eVar2 != j4eVar || zI) {
                    if (!k4eVar2.B()) {
                        if (w2eVar5 == w2eVar6 && w2eVar7.f == null) {
                            int iE = w2eVar6.e() + iD;
                            k4eVar2.N(iE, k4eVar2.m() + iE);
                            g0(i3, r96Var, k4eVar2);
                        } else if (w2eVar5 == w2eVar7 && w2eVar6.f == null) {
                            int iE2 = iD - w2eVar7.e();
                            k4eVar2.N(iE2 - k4eVar2.m(), iE2);
                            g0(i3, r96Var, k4eVar2);
                        } else if (z2 && !k4eVar2.A()) {
                            Z(i3, r96Var, k4eVar2);
                        }
                    }
                } else if (j4eVar2 == j4eVar && k4eVar2.z >= 0 && k4eVar2.y >= 0 && (k4eVar2.i0 == 8 || (k4eVar2.t == 0 && k4eVar2.Y == 0.0f))) {
                    if (!k4eVar2.A() && !k4eVar2.G && z2 && !k4eVar2.A()) {
                        a0(i3, k4eVar, r96Var, k4eVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (k4eVar instanceof qiv) {
            return;
        }
        HashSet<w2e> hashSet2 = w2eVarK2.f38443a;
        if (hashSet2 != null && w2eVarK2.c) {
            for (w2e w2eVar8 : hashSet2) {
                k4e k4eVar3 = w2eVar8.d;
                int i4 = i2 + 1;
                boolean zI2 = I(k4eVar3);
                w2e w2eVar9 = k4eVar3.K;
                w2e w2eVar10 = k4eVar3.M;
                if (k4eVar3.B() && zI2) {
                    l4e.c0(k4eVar3, r96Var, new q96());
                }
                boolean z4 = (w2eVar8 == w2eVar9 && (w2eVar2 = w2eVar10.f) != null && w2eVar2.c) || (w2eVar8 == w2eVar10 && (w2eVar = w2eVar9.f) != null && w2eVar.c);
                j4e j4eVar3 = k4eVar3.U[1];
                if (j4eVar3 != j4eVar || zI2) {
                    if (!k4eVar3.B()) {
                        if (w2eVar8 == w2eVar9 && w2eVar10.f == null) {
                            int iE3 = w2eVar9.e() + iD2;
                            k4eVar3.N(iE3, k4eVar3.m() + iE3);
                            g0(i4, r96Var, k4eVar3);
                        } else if (w2eVar8 == w2eVar10 && w2eVar9.f == null) {
                            int iE4 = iD2 - w2eVar10.e();
                            k4eVar3.N(iE4 - k4eVar3.m(), iE4);
                            g0(i4, r96Var, k4eVar3);
                        } else if (z4 && !k4eVar3.A()) {
                            Z(i4, r96Var, k4eVar3);
                        }
                    }
                } else if (j4eVar3 == j4eVar && k4eVar3.z >= 0 && k4eVar3.y >= 0 && (k4eVar3.i0 == 8 || (k4eVar3.t == 0 && k4eVar3.Y == 0.0f))) {
                    if (!k4eVar3.A() && !k4eVar3.G && z4 && !k4eVar3.A()) {
                        a0(i4, k4eVar, r96Var, k4eVar3);
                    }
                }
            }
        }
        w2e w2eVarK3 = k4eVar.k(6);
        if (w2eVarK3.f38443a != null && w2eVarK3.c) {
            int iD3 = w2eVarK3.d();
            for (w2e w2eVar11 : w2eVarK3.f38443a) {
                k4e k4eVar4 = w2eVar11.d;
                int i5 = i2 + 1;
                boolean zI3 = I(k4eVar4);
                w2e w2eVar12 = k4eVar4.N;
                if (k4eVar4.B() && zI3) {
                    l4e.c0(k4eVar4, r96Var, new q96());
                }
                if (k4eVar4.U[z3 ? 1 : 0] != j4eVar || zI3) {
                    if (!k4eVar4.B()) {
                        if (w2eVar11 == w2eVar12) {
                            int iE5 = w2eVar11.e() + iD3;
                            if (k4eVar4.F) {
                                int i6 = iE5 - k4eVar4.c0;
                                int i7 = k4eVar4.X + i6;
                                k4eVar4.b0 = i6;
                                k4eVar4.K.l(i6);
                                k4eVar4.M.l(i7);
                                w2eVar12.l(iE5);
                                z = z3 ? 1 : 0;
                                k4eVar4.m = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g0(i5, r96Var, k4eVar4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        k4eVar.o = z3;
    }

    public static final void h(mm40 mm40Var, y3w0 y3w0Var, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, fet fetVar, int i2) {
        int i3;
        y3w0 y3w0Var2;
        pz40 pz40Var;
        boolean z;
        mm40 mm40VarJ;
        y3w0Var.getClass();
        String str = y3w0Var.f41973a;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar.g0(974806608);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(y3w0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            Object objF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objF2 = androidx.compose.runtime.e.f(function2, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function3, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(function4, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new x3w0(new xx(pz40VarF, (byte) 16), new ca6(pz40VarF2, (byte) 6), new ca6(pz40VarF3, (byte) 7));
                fetVar.o0(objP);
            }
            Object obj2 = (x3w0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            GameZoneWebView gameZoneWebView = (GameZoneWebView) pz40Var2.getValue();
            if (gameZoneWebView == null || !gameZoneWebView.b()) {
                gameZoneWebView = null;
            }
            boolean z2 = y3w0Var.b;
            boolean z3 = str.length() == 0;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(new qkx(0L));
                fetVar.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP4);
            }
            cgk0 cgk0Var = (cgk0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP5);
            }
            pz40 pz40Var4 = (pz40) objP5;
            boolean zE = fetVar.e(cgk0Var.l());
            Object objP6 = fetVar.P();
            if (zE || objP6 == obj) {
                objP6 = androidx.compose.runtime.e.e(new qkx(T(((qkx) pz40Var3.getValue()).f28908a)));
                fetVar.o0(objP6);
            }
            pz40 pz40Var5 = (pz40) objP6;
            boolean zE2 = fetVar.e(cgk0Var.l());
            Object objP7 = fetVar.P();
            if (zE2 || objP7 == obj) {
                objP7 = androidx.compose.runtime.e.a(1.0f);
                fetVar.o0(objP7);
            }
            agk0 agk0Var = (agk0) objP7;
            qkx qkxVar = (qkx) pz40Var3.getValue();
            GameZoneWebView gameZoneWebView2 = gameZoneWebView;
            long j2 = qkxVar.f28908a;
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zH = fetVar.h(z3) | fetVar.g(agk0Var) | fetVar.g(pz40Var5);
            Object objP8 = fetVar.P();
            if (zH || objP8 == obj) {
                pz40Var = pz40Var5;
                objP8 = new l19(z3, pz40Var, pz40Var3, (c8m0) agk0Var, (yje) null, (byte) 7);
                fetVar.o0(objP8);
            } else {
                pz40Var = pz40Var5;
            }
            m0x0.v(qkxVar, numValueOf, (Function2) objP8, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH2 = fetVar.h(z3);
            Object objP9 = fetVar.P();
            if (zH2 || objP9 == obj) {
                boolean z4 = z3;
                objP9 = new l19(z4, pz40Var4, pz40Var2, (c8m0) cgk0Var, (yje) null, (byte) 8);
                z = z4;
                fetVar.o0(objP9);
            } else {
                z = z3;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP9);
            Object objP10 = fetVar.P();
            if (objP10 == obj) {
                objP10 = new ca6(pz40Var3, (byte) 8);
                fetVar.o0(objP10);
            }
            mm40 mm40VarY = fre0.Y(mm40Var, (Function1) objP10);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.b0(-853553349, Integer.valueOf(cgk0Var.l()));
            long j3 = ((qkx) pz40Var.getValue()).f28908a;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            if (qkx.a(j3, 0L)) {
                mm40VarJ = o7k0.c;
            } else {
                mm40VarJ = o7k0.j(jm40.b, w6kVar.r0((int) (j3 >> 32)), w6kVar.r0((int) (j3 & 4294967295L)));
            }
            boolean zG = fetVar.g(pz40VarF) | fetVar.g(objF) | fetVar.g(objF2) | fetVar.i(obj2);
            Object objP11 = fetVar.P();
            if (zG || objP11 == obj) {
                objP11 = new dg(obj2, pz40VarF, objF, objF2, pz40Var2, (byte) 6);
                fetVar.o0(objP11);
            }
            Function1 function5 = (Function1) objP11;
            boolean zG2 = fetVar.g(agk0Var);
            Object objP12 = fetVar.P();
            if (zG2 || objP12 == obj) {
                objP12 = new fc3(agk0Var, (byte) 2);
                fetVar.o0(objP12);
            }
            dwi0.b(function5, mm40VarJ, (Function1) objP12, fetVar, 0, 0);
            fetVar.r(false);
            fetVar.r(true);
            Object[] objArr = {gameZoneWebView2, str, Boolean.valueOf(z2), y3w0Var.c};
            int i4 = i3 & 112;
            boolean zI = fetVar.i(gameZoneWebView2) | fetVar.h(z) | (i4 == 32);
            Object objP13 = fetVar.P();
            if (zI || objP13 == obj) {
                y3w0Var2 = y3w0Var;
                Object l19Var = new l19(gameZoneWebView2, z, y3w0Var2, pz40Var4, (yje) null);
                fetVar.o0(l19Var);
                objP13 = l19Var;
            } else {
                y3w0Var2 = y3w0Var;
            }
            m0x0.w(objArr, (Function2) objP13, fetVar);
            Object[] objArr2 = {gameZoneWebView2, Boolean.valueOf(z2), y3w0Var2.e, y3w0Var2.f};
            boolean zI2 = fetVar.i(gameZoneWebView2) | (i4 == 32);
            Object objP14 = fetVar.P();
            if (zI2 || objP14 == obj) {
                objP14 = new yp6(gameZoneWebView2, y3w0Var2, null, (byte) 21);
                fetVar.o0(objP14);
            }
            m0x0.w(objArr2, (Function2) objP14, fetVar);
        } else {
            y3w0Var2 = y3w0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) y3w0Var2, (Object) function0, (Object) function1, (Object) function2, (Object) function3, (Object) function4, i2, (byte) 2);
        }
    }

    public static final void i(mm40 mm40Var, boolean z, String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1033197820);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            nul nulVar = nul.e;
            oe9 oe9Var = oe9.f25112a;
            qzb.n(mm40VarD, new wul(nulVar, oe9Var, new ue9(str), z, false, false), function1, fetVar2, ((i3 >> 9) & 896) | 6, 0);
            fetVar2 = fetVar;
            qzb.n(o7k0.d(jm40Var, 1.0f), new wul(nulVar, oe9Var, new ue9(str2), true, false, false), function0, fetVar2, ((i3 >> 6) & 896) | 6, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cya(mm40Var, z, str, str2, function0, function1, i2, (byte) 1);
        }
    }

    public static final void j(int i2, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        fetVar.g0(-1941398528);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
                i4 = i3 & (-113);
            } else {
                fetVar.X();
                i4 = i3 & (-113);
                z3 = z;
            }
            fetVar.s();
            boolean zH = fetVar.h(z3);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new kp2(b2, z3);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar2.F(mrv.k0(jm40Var, "SCORE"), fetVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
            ugdVar.F(mrv.k0(jm40Var, Request.INFO), fetVar, Integer.valueOf(((i4 >> 3) & 112) | 6));
            fetVar.r(true);
            z2 = z3;
        } else {
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((byte) 5, i2, (Object) mm40Var, (Object) ugdVar, (Object) ugdVar2, z2);
        }
    }

    public static final void k(h1p0 h1p0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(33300969);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(h1p0Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, backgroundContent, vgg0.a(16.0f)), qmk.a(fetVar).e, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v(null, h1p0Var.f12295a, h1p0Var.b, h1p0Var.c, fetVar, 0);
            w(0, fetVar, h1p0Var.c, s5x0.N(jm40Var, 48.0f, 0.0f, 0.0f, 0.0f, 14));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(h1p0Var, i2);
        }
    }

    public static final void l(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1285247932);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 12);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 9);
        }
    }

    public static final void m(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1008295158);
        byte b2 = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i2, (byte) 4);
        }
    }

    public static final void n(mm40 mm40Var, vkw vkwVar, Function0 function0, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        vkwVar.getClass();
        function0.getClass();
        fetVar2.g0(-621423625);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(vkwVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 110.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            boolean z = (i4 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 19);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarE2, null, null, false, null, (Function0) objP, fetVar2, 0, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(vkwVar.c, 0, fetVar2);
            k7x.b(vkwVar.b, null, o7k0.c, pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
            v8q0.a(vkwVar.f37596a, jr8.f16991a.b(o7k0.d(s5x0.J(jm40Var, 16.0f), 1.0f), gqw0.h), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) vkwVar, (Object) function0, i2, i3, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.pz40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r3v10, types: [a.pz40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r45v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    public static final void o(final mm40 mm40Var, final j83 j83Var, final Function1 function1, final boolean z, final Map map, final y9q0 y9q0Var, final int i2, final boolean z2, final int i3, final int i4, final mrq mrqVar, final Function1 function2, final n05 n05Var, fet fetVar, final int i5, final int i6) {
        e9q0 e9q0Var;
        Function0 function0;
        Function0 function3;
        Pair pair;
        Function1 function4;
        ?? r10;
        byte b2;
        Object obj;
        Object h13Var;
        boolean z3;
        Object obj2;
        List list;
        Object obj3;
        fetVar.g0(-2118572703);
        int i7 = (i5 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i7 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= fetVar.i(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= fetVar.g(y9q0Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= fetVar.e(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= fetVar.h(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= fetVar.e(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= fetVar.e(i4) ? 536870912 : 268435456;
        }
        int i8 = (i6 & 6) == 0 ? i6 | (fetVar.i(mrqVar) ? 4 : 2) : i6;
        int i9 = i7;
        if ((i6 & 48) == 0) {
            i8 |= fetVar.i(null) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= fetVar.i(null) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? fetVar.g(n05Var) : fetVar.i(n05Var) ? 16384 : 8192;
        }
        if (fetVar.U(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zM = tnq0.m(j83Var);
            cl5 cl5Var = ukd.f35823a;
            if (zM) {
                fetVar.e0(145641571);
                boolean z4 = (i9 & 112) == 32;
                Object objP = fetVar.P();
                Object obj4 = objP;
                if (z4 || objP == cl5Var) {
                    e9q0 e9q0Var2 = new e9q0(j83Var);
                    fetVar.o0(e9q0Var2);
                    obj4 = e9q0Var2;
                }
                fetVar.r(false);
                e9q0Var = (e9q0) obj4;
            } else {
                fetVar.e0(145707228);
                fetVar.r(false);
                e9q0Var = null;
            }
            if (tnq0.m(j83Var)) {
                fetVar.e0(145905443);
                boolean zG = ((i9 & 112) == 32) | fetVar.g(e9q0Var);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    gj4 gj4Var = new gj4(e9q0Var, j83Var, (byte) 13);
                    fetVar.o0(gj4Var);
                    obj3 = gj4Var;
                } else {
                    obj3 = objP2;
                }
                function0 = (Function0) obj3;
                fetVar.r(false);
            } else {
                fetVar.e0(146002721);
                boolean z5 = (i9 & 112) == 32;
                Object objP3 = fetVar.P();
                Object obj5 = objP3;
                if (z5 || objP3 == cl5Var) {
                    zo4 zo4Var = new zo4(j83Var, (byte) 17);
                    fetVar.o0(zo4Var);
                    obj5 = zo4Var;
                }
                function0 = (Function0) obj5;
                fetVar.r(false);
            }
            if (z) {
                if (map != null) {
                    Pair pair2 = l83.f19590a;
                    if (map.isEmpty()) {
                        function3 = function0;
                        pair = l83.f19590a;
                    } else {
                        int length = j83Var.b.length();
                        List list2 = j83Var.f16067a;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size = list2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list3 = list2;
                                i83 i83Var = (i83) list2.get(i10);
                                int i11 = size;
                                Object obj6 = i83Var.f14321a;
                                int i12 = i10;
                                int i13 = i83Var.c;
                                Function0 function5 = function0;
                                int i14 = i83Var.b;
                                String str = i83Var.d;
                                if ((obj6 instanceof fsm0) && "androidx.compose.foundation.text.inlineContent".equals(str) && k83.b(0, length, i14, i13)) {
                                    Object obj7 = i83Var.f14321a;
                                    obj7.getClass();
                                    arrayList.add(new i83(i14, i13, ((fsm0) obj7).f10072a, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list2 = list3;
                                function0 = function5;
                            }
                            function3 = function0;
                            list = arrayList;
                        } else {
                            function3 = function0;
                            list = iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = list.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            if (map.get(((i83) list.get(i15)).f14321a) != null) {
                                hny.b();
                                return;
                            }
                        }
                        pair = new Pair(arrayList2, arrayList3);
                    }
                } else {
                    function3 = function0;
                    pair = l83.f19590a;
                }
                function4 = null;
            } else {
                e9q0Var = e9q0Var;
                function3 = function0;
                function4 = null;
                pair = new Pair(null, null);
            }
            List list4 = (List) pair.f46059a;
            List list5 = (List) pair.b;
            if (z) {
                fetVar.e0(146318828);
                Object objP4 = fetVar.P();
                Object obj8 = objP4;
                if (objP4 == cl5Var) {
                    pz40 pz40VarE = androidx.compose.runtime.e.e(function4);
                    fetVar.o0(pz40VarE);
                    obj8 = pz40VarE;
                }
                fetVar.r(false);
                r10 = (pz40) obj8;
            } else {
                fetVar.e0(146406588);
                fetVar.r(false);
                r10 = function4;
            }
            if (z) {
                fetVar.e0(146499837);
                boolean zG2 = fetVar.g(r10);
                Object objP5 = fetVar.P();
                if (zG2 || objP5 == cl5Var) {
                    z3 = false;
                    ca6 ca6Var = new ca6(r10, false ? 1 : 0);
                    fetVar.o0(ca6Var);
                    obj2 = ca6Var;
                } else {
                    z3 = false;
                    obj2 = objP5;
                }
                function4 = (Function1) obj2;
                fetVar.r(z3);
            } else {
                fetVar.e0(146571260);
                fetVar.r(false);
            }
            Function1 function6 = function4;
            int i16 = (i9 >> 3) & 14;
            e9q0 e9q0Var3 = e9q0Var;
            ia6.a(j83Var, y9q0Var, mrqVar, list4, z2, fetVar);
            j83 j83Var2 = (j83) function3.invoke();
            boolean zI = fetVar.i(e9q0Var3) | ((i9 & 896) == 256);
            Object objP6 = fetVar.P();
            if (zI || objP6 == cl5Var) {
                b2 = 0;
                da6 da6Var = new da6(e9q0Var3, function1, b2);
                fetVar.o0(da6Var);
                obj = da6Var;
            } else {
                b2 = 0;
                obj = objP6;
            }
            Function1 function7 = (Function1) obj;
            ?? r4 = b2;
            ?? r3 = r10;
            byte b3 = 1;
            mm40 mm40VarC0 = c0(mm40Var, j83Var2, y9q0Var, function7, i2, z2, i3, i4, mrqVar, list4, function6, null, function2, n05Var);
            if (z) {
                fetVar.e0(147956465);
                boolean zI2 = fetVar.i(e9q0Var3);
                Object objP7 = fetVar.P();
                Object obj9 = objP7;
                if (zI2 || objP7 == cl5Var) {
                    ea6 ea6Var = new ea6(e9q0Var3, b3);
                    fetVar.o0(ea6Var);
                    obj9 = ea6Var;
                }
                Function0 function8 = (Function0) obj9;
                boolean zG3 = fetVar.g(r3);
                Object objP8 = fetVar.P();
                Object obj10 = objP8;
                if (zG3 || objP8 == cl5Var) {
                    xx xxVar = new xx(r3, (byte) 13);
                    fetVar.o0(xxVar);
                    obj10 = xxVar;
                }
                h13Var = new h13(function8, (Function0) obj10, (byte) 2);
                fetVar.r(r4);
            } else {
                fetVar.e0(147779703);
                boolean zI3 = fetVar.i(e9q0Var3);
                Object objP9 = fetVar.P();
                Object obj11 = objP9;
                if (zI3 || objP9 == cl5Var) {
                    ea6 ea6Var2 = new ea6(e9q0Var3, r4 == true ? (byte) 1 : (byte) 0);
                    fetVar.o0(ea6Var2);
                    obj11 = ea6Var2;
                }
                h13Var = new qf6((Function0) obj11, (byte) 6);
                fetVar.r(r4);
            }
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, h13Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            if (e9q0Var3 == null) {
                fetVar.e0(-433557001);
            } else {
                fetVar.e0(-291080374);
                e9q0Var3.a(r4 == true ? 1 : 0, fetVar);
            }
            fetVar.r(r4);
            if (list5 == null) {
                fetVar.e0(-433506223);
            } else {
                fetVar.e0(-433506222);
                l83.a(j83Var, list5, fetVar, i16);
            }
            fetVar.r(r4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.fa6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    int iL = x8x.L(i5 | 1);
                    int iL2 = x8x.L(i6);
                    aad.o(mm40Var, j83Var, function1, z, map, y9q0Var, i2, z2, i3, i4, mrqVar, function2, n05Var, (fet) obj12, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(int i2, fet fetVar) {
        fetVar.g0(-1442988966);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            yyw.v(vbc.d0(null, fetVar, 0, 1), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ei20(i2, (byte) 17);
        }
    }

    public static final void q(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(320402987);
        byte b2 = 16;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ylm(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        k6z k6zVar;
        fetVar.g0(-2106264579);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object value = l7m0Var.getValue();
            value.getClass();
            nc30 nc30Var = (nc30) value;
            if (nc30Var.g) {
                fetVar.e0(-1190655228);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1190654304);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            int i4 = (int) nc30Var.e;
            boolean zG = fetVar.g(nc30Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new rx00(nc30Var, (byte) 23);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(i4, (Function0) objP, fetVar, 0, 2);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new LinkedHashMap();
                fetVar.o0(objP2);
            }
            Map map = (Map) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            Object obj2 = (vne) objP3;
            Integer numValueOf = Integer.valueOf(kwjVarB.k());
            int i5 = i3 & 112;
            boolean zG2 = (i5 == 32) | fetVar.g(kwjVarB);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                objP4 = new fc30(function1, kwjVarB, (yje) null, b2);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP4);
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar2, zclVar2, jm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            vxl vxlVar = vxl.b;
            fyl fylVar = new fyl(nc30Var.c, null, null, s5x0.u(20.0f, 0.0f, 20.0f, 0.0f, 10), null, 22);
            boolean zI = fetVar.i(obj2) | (i5 == 32) | fetVar.g(kwjVarB);
            Object objP5 = fetVar.P();
            if (zI || objP5 == obj) {
                objP5 = new k9v((Object) function1, obj2, (Object) kwjVarB, (byte) 25);
                fetVar.o0(objP5);
            }
            ebc.r(mm40VarN, fylVar, vxlVar, (Function1) objP5, null, fetVar, 384, 40);
            obc.d(bmd.n.a(k6zVar2), u1c.M(1114990855, new znk(kwjVarB, map, nc30Var, (byte) 1), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 15);
        }
    }

    public static final void s(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-662123472);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_match_progress_title, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((oc30) l7m0Var.getValue()).b().f659a;
            j9m0 j9m0Var = ((oc30) l7m0Var.getValue()).b().b;
            boolean zA = ((oc30) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 3);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-2072585502, new xs4(l7m0Var, function1, (byte) 8), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 14);
        }
    }

    public static final void t(String str, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i2) {
        Object objJ;
        Object objJ2;
        qja qjaVar = qja.j;
        fetVar.g0(-1944455863);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 1159337632, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, (byte) 2), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj) {
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
                fetVar.r(false);
            }
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 1159337632, fetVar), ((Number) objJ).floatValue(), false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new tx50(oms0VarZ, (byte) 22));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 1159337632, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new tx50(oms0VarZ, (byte) 23));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, 1297295872, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 466305582, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, 466305582, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new tx50(oms0VarZ, (byte) 24));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, 466305582, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new tx50(oms0VarZ, (byte) 25));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, -1077174898, false), lxs0Var2, fetVar, 0);
            mm40 mm40VarX = yyw.X(o7k0.d(jm40.b, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP7 = fetVar.P();
            if (zH || objP7 == obj) {
                objP7 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, !((Boolean) l7m0Var2.getValue()).booleanValue(), null);
                fetVar.o0(objP7);
            }
            imm immVar = (imm) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = new vkm(1);
                fetVar.o0(objP8);
            }
            hlm.c(mm40VarX, immVar, (vkm) objP8, null, null, null, null, null, null, u1c.M(462471757, new cb3(function0, cms0VarE2, cms0VarE, (byte) 6), fetVar), u1c.M(1497199259, new c9o(str, l7m0Var, (byte) 2), fetVar), null, fetVar, 805306752, 6, 2552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d9o(str, l7m0Var, l7m0Var2, function0, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0215  */
    /* JADX WARN: Code duplicated, block: B:60:0x0217  */
    /* JADX WARN: Code duplicated, block: B:64:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x0230  */
    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
    /* JADX WARN: Code duplicated, block: B:72:0x023b  */
    public static final void u(hh80 hh80Var, final dv80 dv80Var, boolean z, final Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        boolean z2;
        boolean z3;
        boolean z4;
        ch80 ch80VarF;
        cl5 cl5Var;
        Function1 function3;
        boolean z5;
        Object objP;
        boolean z6;
        Object objP2;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        hh80Var.getClass();
        dv80Var.getClass();
        function1.getClass();
        fetVar2.g0(-2131576774);
        int i3 = i2 | (fetVar2.g(hh80Var) ? 4 : 2) | (fetVar2.g(dv80Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar2), fetVar2, 24576);
            ot80 ot80Var = dv80Var.c;
            cv80 cv80Var = dv80Var.d;
            ku80 ku80Var = dv80Var.e;
            boolean zG = fetVar2.g(cloVarB);
            Object objP3 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP3 == cl5Var2) {
                objP3 = new is80(cloVarB, yjeVar, b2);
                fetVar2.o0(objP3);
            }
            m0x0.v(ot80Var, ku80Var, (Function2) objP3, fetVar2);
            mm40 mm40VarI = s5x0.I(o7k0.c, hh80Var);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(cjx.V(lgb.K(i120.Q(mm40VarI, background, ljcVar)), cloVarB.e, null), "NEW_GAME_FOLDER_COLUMN");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
                fetVar2.l(pcyVar);
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
            boolean z8 = dv80Var.f6732a;
            final byte b3 = 0;
            ugd ugdVarM = u1c.M(-1878114395, new Function2() { // from class: a.pu80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    jm40 jm40Var;
                    byte b4 = b3;
                    cl5 cl5Var3 = ukd.f35823a;
                    Function1 function4 = function1;
                    dv80 dv80Var2 = dv80Var;
                    fet fetVar3 = (fet) obj;
                    switch (b4) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                imm immVar = dv80Var2.b;
                                boolean zG2 = fetVar3.g(function4);
                                Object objP4 = fetVar3.P();
                                if (zG2 || objP4 == cl5Var3) {
                                    objP4 = new qu80(function4, (byte) 4);
                                    fetVar3.o0(objP4);
                                }
                                Function0 function0 = (Function0) objP4;
                                boolean zG3 = fetVar3.g(function4);
                                Object objP5 = fetVar3.P();
                                if (zG3 || objP5 == cl5Var3) {
                                    objP5 = new hs80(function4, (byte) 3);
                                    fetVar3.o0(objP5);
                                }
                                hlm.c(null, immVar, null, function0, null, (Function1) objP5, null, null, null, null, null, null, fetVar3, 0, 0, 4053);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM2 = fetVar3.m();
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var2);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(e7z.u1);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, x5dVarA2, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar3);
                                jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                                ot80 ot80Var2 = dv80Var2.c;
                                ku80 ku80Var2 = dv80Var2.e;
                                if (ot80Var2 instanceof mt80) {
                                    fetVar3.e0(1396222593);
                                    mt80 mt80Var = (mt80) ot80Var2;
                                    ijl ijlVarA = mt80Var.a();
                                    jjl jjlVarB = mt80Var.b();
                                    boolean zG4 = fetVar3.g(function4);
                                    Object objP6 = fetVar3.P();
                                    if (zG4 || objP6 == cl5Var3) {
                                        objP6 = new ma70(function4, (byte) 28);
                                        fetVar3.o0(objP6);
                                    }
                                    Function0 function5 = (Function0) objP6;
                                    boolean zG5 = fetVar3.g(function4);
                                    Object objP7 = fetVar3.P();
                                    if (zG5 || objP7 == cl5Var3) {
                                        objP7 = new ma70(function4, (byte) 29);
                                        fetVar3.o0(objP7);
                                    }
                                    Function0 function6 = (Function0) objP7;
                                    boolean zG6 = fetVar3.g(function4);
                                    Object objP8 = fetVar3.P();
                                    if (zG6 || objP8 == cl5Var3) {
                                        objP8 = new qu80(function4, (byte) 0);
                                        fetVar3.o0(objP8);
                                    }
                                    jm40Var = jm40Var2;
                                    feb.k(ijlVarA, jjlVarB, null, function5, function6, (Function0) objP8, fetVar3, 0, 4);
                                    fetVar3.r(false);
                                } else {
                                    jm40Var = jm40Var2;
                                    fetVar3.e0(1396996198);
                                    fetVar3.r(false);
                                }
                                mbc.o(zfi0.f44303a, null, false, fetVar3, 6, 6);
                                boolean z9 = ku80Var2 instanceof hu80;
                                if ((!z9 || ((hu80) ku80Var2).b.isEmpty()) && !(ku80Var2 instanceof ju80)) {
                                    fetVar3.e0(1398383014);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(1397399911);
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
                                    a4x a4xVar = z9 ? ((hu80) ku80Var2).b : lak0.c;
                                    lq5 lq5VarA = ku80Var2.a();
                                    boolean z10 = ku80Var2 instanceof ju80;
                                    boolean zG7 = fetVar3.g(function4);
                                    Object objP9 = fetVar3.P();
                                    if (zG7 || objP9 == cl5Var3) {
                                        objP9 = new ru80(function4, (byte) 0);
                                        fetVar3.o0(objP9);
                                    }
                                    etl.e(mm40VarN, a4xVar, lq5VarA, z10, null, 0.0f, 0, null, (Function2) objP9, fetVar3, 0, 240);
                                    fetVar3 = fetVar3;
                                    fetVar3.r(false);
                                }
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2);
            final byte b4 = 1;
            ugd ugdVarM2 = u1c.M(552636070, new Function2() { // from class: a.pu80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    jm40 jm40Var;
                    byte b5 = b4;
                    cl5 cl5Var3 = ukd.f35823a;
                    Function1 function4 = function1;
                    dv80 dv80Var2 = dv80Var;
                    fet fetVar3 = (fet) obj;
                    switch (b5) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                imm immVar = dv80Var2.b;
                                boolean zG2 = fetVar3.g(function4);
                                Object objP4 = fetVar3.P();
                                if (zG2 || objP4 == cl5Var3) {
                                    objP4 = new qu80(function4, (byte) 4);
                                    fetVar3.o0(objP4);
                                }
                                Function0 function0 = (Function0) objP4;
                                boolean zG3 = fetVar3.g(function4);
                                Object objP5 = fetVar3.P();
                                if (zG3 || objP5 == cl5Var3) {
                                    objP5 = new hs80(function4, (byte) 3);
                                    fetVar3.o0(objP5);
                                }
                                hlm.c(null, immVar, null, function0, null, (Function1) objP5, null, null, null, null, null, null, fetVar3, 0, 0, 4053);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM2 = fetVar3.m();
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var2);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(e7z.u1);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, x5dVarA2, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar3);
                                jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                                ot80 ot80Var2 = dv80Var2.c;
                                ku80 ku80Var2 = dv80Var2.e;
                                if (ot80Var2 instanceof mt80) {
                                    fetVar3.e0(1396222593);
                                    mt80 mt80Var = (mt80) ot80Var2;
                                    ijl ijlVarA = mt80Var.a();
                                    jjl jjlVarB = mt80Var.b();
                                    boolean zG4 = fetVar3.g(function4);
                                    Object objP6 = fetVar3.P();
                                    if (zG4 || objP6 == cl5Var3) {
                                        objP6 = new ma70(function4, (byte) 28);
                                        fetVar3.o0(objP6);
                                    }
                                    Function0 function5 = (Function0) objP6;
                                    boolean zG5 = fetVar3.g(function4);
                                    Object objP7 = fetVar3.P();
                                    if (zG5 || objP7 == cl5Var3) {
                                        objP7 = new ma70(function4, (byte) 29);
                                        fetVar3.o0(objP7);
                                    }
                                    Function0 function6 = (Function0) objP7;
                                    boolean zG6 = fetVar3.g(function4);
                                    Object objP8 = fetVar3.P();
                                    if (zG6 || objP8 == cl5Var3) {
                                        objP8 = new qu80(function4, (byte) 0);
                                        fetVar3.o0(objP8);
                                    }
                                    jm40Var = jm40Var2;
                                    feb.k(ijlVarA, jjlVarB, null, function5, function6, (Function0) objP8, fetVar3, 0, 4);
                                    fetVar3.r(false);
                                } else {
                                    jm40Var = jm40Var2;
                                    fetVar3.e0(1396996198);
                                    fetVar3.r(false);
                                }
                                mbc.o(zfi0.f44303a, null, false, fetVar3, 6, 6);
                                boolean z9 = ku80Var2 instanceof hu80;
                                if ((!z9 || ((hu80) ku80Var2).b.isEmpty()) && !(ku80Var2 instanceof ju80)) {
                                    fetVar3.e0(1398383014);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(1397399911);
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
                                    a4x a4xVar = z9 ? ((hu80) ku80Var2).b : lak0.c;
                                    lq5 lq5VarA = ku80Var2.a();
                                    boolean z10 = ku80Var2 instanceof ju80;
                                    boolean zG7 = fetVar3.g(function4);
                                    Object objP9 = fetVar3.P();
                                    if (zG7 || objP9 == cl5Var3) {
                                        objP9 = new ru80(function4, (byte) 0);
                                        fetVar3.o0(objP9);
                                    }
                                    etl.e(mm40VarN, a4xVar, lq5VarA, z10, null, 0.0f, 0, null, (Function2) objP9, fetVar3, 0, 240);
                                    fetVar3 = fetVar3;
                                    fetVar3.r(false);
                                }
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2);
            jm40 jm40Var = jm40.b;
            ahy.b(jm40Var, cloVarB, z8, ugdVarM, ugdVarM2, fetVar2, 27654, 0);
            fetVar2 = fetVar2;
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (cv80Var != null) {
                if (cv80Var instanceof zu80) {
                    fetVar2.e0(-1123071570);
                    mm40 mm40VarQ = i120.Q(o7k0.d(new x7z(1.0f, true), 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar);
                    bml bmlVar = ((zu80) cv80Var).f44998a;
                    fetVar2.e0(-867491757);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80Var = new lh80(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f);
                    if (z) {
                        fetVar2.e0(-971526122);
                        ch80VarF = knm0.g(lh80Var, fetVar2);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-971433649);
                        ch80VarF = knm0.f(lh80Var, fetVar2);
                        fetVar2.r(false);
                    }
                    ch80 ch80Var = ch80VarF;
                    fetVar2.r(false);
                    int i4 = i3 & 7168;
                    boolean z9 = i4 == 2048;
                    Object objP4 = fetVar2.P();
                    if (z9) {
                        cl5Var = cl5Var2;
                    } else {
                        cl5Var = cl5Var2;
                        if (objP4 != cl5Var) {
                            function3 = function1;
                        }
                        Function0 function0 = (Function0) objP4;
                        if (i4 == 2048) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP = fetVar2.P();
                        if (z5 || objP == cl5Var) {
                            objP = new hs80(function3, (byte) 1);
                            fetVar2.o0(objP);
                        }
                        Function1 function4 = (Function1) objP;
                        if (i4 == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z6 || objP2 == cl5Var) {
                            objP2 = new hs80(function3, (byte) 2);
                            fetVar2.o0(objP2);
                        }
                        ckb.f(mm40VarQ, bmlVar, null, ch80Var, function0, null, function4, (Function1) objP2, fetVar2, 0, 36);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                        z2 = z;
                        function2 = function3;
                        z4 = true;
                    }
                    function3 = function1;
                    objP4 = new qu80(function3, (byte) 1);
                    fetVar2.o0(objP4);
                    Function0 function5 = (Function0) objP4;
                    if (i4 == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP = fetVar2.P();
                    if (z5) {
                        objP = new hs80(function3, (byte) 1);
                        fetVar2.o0(objP);
                    } else {
                        objP = new hs80(function3, (byte) 1);
                        fetVar2.o0(objP);
                    }
                    Function1 function6 = (Function1) objP;
                    if (i4 == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z6) {
                        objP2 = new hs80(function3, (byte) 2);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new hs80(function3, (byte) 2);
                        fetVar2.o0(objP2);
                    }
                    ckb.f(mm40VarQ, bmlVar, null, ch80Var, function5, null, function6, (Function1) objP2, fetVar2, 0, 36);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    z2 = z;
                    function2 = function3;
                    z4 = true;
                } else {
                    function2 = function1;
                    if (cv80Var instanceof av80) {
                        fetVar2.e0(-1121292542);
                        mm40 mm40VarD = o7k0.d(new x7z(1.0f, true), 1.0f);
                        tj30 tj30VarC = zq8.c(zx7Var, false);
                        int iHashCode3 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM3 = fetVar2.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, shdVar);
                        jpm0.o(fetVar2, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC2, shdVar4);
                        z2 = z;
                        mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar2, z2), 7);
                        mdm mdmVar = ((av80) cv80Var).f1514a;
                        boolean z10 = (i3 & 7168) == 2048;
                        Object objP5 = fetVar2.P();
                        if (z10 || objP5 == cl5Var2) {
                            objP5 = new qu80(function2, (byte) 2);
                            fetVar2.o0(objP5);
                        }
                        jcb.l(mm40VarN, mdmVar, false, (Function0) objP5, fetVar2, 0, 4);
                        z4 = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        z2 = z;
                        if (cv80Var instanceof bv80) {
                            fetVar2.e0(-1120547550);
                            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                            int iHashCode4 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM4 = fetVar2.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD2);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC2, shdVar);
                            jpm0.o(fetVar2, bh90VarM4, shdVar2);
                            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                            jpm0.o(fetVar2, mm40VarC3, shdVar4);
                            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar2, z2), 7);
                            mdm mdmVar2 = ((bv80) cv80Var).f3268a;
                            boolean z11 = (i3 & 7168) == 2048;
                            Object objP6 = fetVar2.P();
                            if (z11 || objP6 == cl5Var2) {
                                objP6 = new qu80(function2, (byte) 3);
                                fetVar2.o0(objP6);
                            }
                            jcb.l(mm40VarN2, mdmVar2, false, (Function0) objP6, fetVar2, 0, 4);
                            z4 = true;
                            fetVar2.r(true);
                            fetVar2.r(false);
                        }
                    }
                }
                fetVar2.r(z4);
                fetVar2.r(z4);
            } else {
                z3 = false;
            }
            throw b1j.f(-867513692, fetVar2, z3);
        }
        function2 = function1;
        z2 = z;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 25, i2, (Object) hh80Var, (Object) dv80Var, (Object) function2, z2);
        }
    }

    public static final void v(mm40 mm40Var, String str, String str2, a4x a4xVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1756634054);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(a4xVar) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(mm40Var2, 100.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            int i4 = i3 >> 6;
            z(i4 & 112, fetVar2, a4xVar, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarP, fetVar2, (i3 >> 3) & 14, 24960, 110586);
            mm40 mm40VarU = o7k0.u(mm40Var2, 0.0f, 66.0f, 1);
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarU, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar2, i4 & 14, 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 11, i2, mm40Var2, str, str2, a4xVar);
        }
    }

    public static final void w(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar2.g0(-327043316);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(mm40Var, 0.0f, 200.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -1523608543, a4xVar);
            while (itO.hasNext()) {
                g1p0 g1p0Var = (g1p0) itO.next();
                fetVar2.b0(-1430129601, g1p0Var.f10526a);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                jm40 jm40Var = jm40.b;
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar2, i120.Q(o7k0.n(s5x0.J(jm40Var, 1.0f), 10.0f), g1p0Var.d, vgg0.f37379a));
                mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                String str = g1p0Var.f10526a;
                zfn zfnVar = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                y9q0 y9q0VarD = g1t0.d();
                shd shdVar5 = shdVar2;
                zfn zfnVar2 = zaq0.b;
                v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 0, 24960, 110584);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                String str2 = g1p0Var.c;
                ((g1t0) fetVar.k(zfnVar)).getClass();
                v8q0.a(str2, mm40VarN2, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 0, 24576, 114680);
                fetVar2 = fetVar;
                z2 = true;
                fetVar2.r(true);
                z = false;
                fetVar2.r(false);
                shdVar4 = shdVar4;
                pcyVar = pcyVar;
                shdVar2 = shdVar5;
                shdVar = shdVar;
                shdVar3 = shdVar3;
            }
            fetVar2.r(z);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i2, (byte) 24);
        }
    }

    public static final void x(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1736606931);
        int i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2 | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(l7m0Var.getValue(), fetVar2);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function1, fetVar);
            zfn zfnVar = m8m0.f21378a;
            float fD = y3d.d(((StaticColors) fetVar2.k(zfnVar)).m109getOverlayBackground400d7_KjU());
            if (!((u2e0) pz40VarF.getValue()).d) {
                fD = 0.0f;
            }
            l7m0 l7m0VarB = d43.b(fD, ro4.m0(Response.OK, 0, null, 6), "overlay_alpha", null, fetVar2, 3120, 20);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new zsf(0.0f, 0.0f, 0.5f, 1.0f);
                fetVar2.o0(objP);
            }
            zsf zsfVar = (zsf) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new zsf(0.5f, 0.0f, 1.0f, 1.0f);
                fetVar2.o0(objP2);
            }
            zsf zsfVar2 = (zsf) objP2;
            mm40 mm40VarQ = i120.Q(o7k0.c, y3d.c(((Number) l7m0VarB.getValue()).floatValue(), ((StaticColors) fetVar2.k(zfnVar)).m109getOverlayBackground400d7_KjU()), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = ((u2e0) l7m0Var.getValue()).d;
            uts0 uts0VarM0 = ro4.m0(Response.OK, 0, zsfVar, 2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new bod0((byte) 14);
                fetVar2.o0(objP3);
            }
            pzn pznVarA = kzn.j(uts0VarM0, (Function1) objP3).a(kzn.f(ro4.m0(Response.OK, 0, zsfVar, 2), 0.8f, 4)).a(kzn.d(ro4.m0(Response.OK, 0, zsfVar, 2), 0.0f, 2));
            uts0 uts0VarM1 = ro4.m0(Response.OK, 0, zsfVar2, 2);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new bod0((byte) 15);
                fetVar2.o0(objP4);
            }
            b34.h(z, jm40.b, pznVarA, kzn.l(uts0VarM1, (Function1) objP4).a(kzn.g(ro4.m0(Response.OK, 0, zsfVar2, 2), 0.8f, 4)).a(kzn.e(ro4.m0(Response.OK, 0, zsfVar2, 2), 2)), "dialog_animation", u1c.M(-127885557, new sqc0(pz40VarF2, pz40VarF, function1), fetVar2), fetVar, 224688, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 28);
        }
    }

    public static final void y(k3t0 k3t0Var, fet fetVar, int i2) {
        k3t0Var.getClass();
        fetVar.g0(1592269718);
        byte b2 = 4;
        int i3 = (fetVar.i(k3t0Var) ? 4 : 2) | i2;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            int i4 = i3 & 14;
            int i5 = 8 | i4;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            Object obj = (Context) fetVar.k(dy2.b);
            boolean zI = fetVar.i(obj) | (i4 == 4 || fetVar.i(i3t0Var));
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zI || objP == obj2) {
                objP = new oac0(obj, i3t0Var, (byte) 18);
                fetVar.o0(objP);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = ((((i5 & 14) ^ 6) > 4 && fetVar.i(i3t0Var)) || (i5 & 6) == 4) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj2) {
                objP2 = new xfc(i3t0Var, clzVar, pz40VarF, null, (byte) 2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            if (i4 != 4 && !fetVar.i(i3t0Var)) {
                z = false;
            }
            Object objP3 = fetVar.P();
            if (z || objP3 == obj2) {
                Object prc0Var = new prc0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                fetVar.o0(prc0Var);
                objP3 = prc0Var;
            }
            x(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i2, b2);
        }
    }

    public static final void z(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(793886331);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar) {
                if (((g1p0) obj).b > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new d3m(a4xVar, i2, (byte) 2);
                    return;
                }
                return;
            }
            Iterator it = arrayList.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 += ((g1p0) it.next()).b;
            }
            float f2 = i4;
            n0q n0qVar = o7k0.c;
            boolean zI = fetVar.i(arrayList) | fetVar.d(f2);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new a1l(arrayList, f2);
                fetVar.o0(objP);
            }
            p8a.k(n0qVar, (Function1) objP, fetVar, 0);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new zph(mm40Var, a4xVar, i2, (byte) 15);
        }
    }
}
