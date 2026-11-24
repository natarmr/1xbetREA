package a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import android.text.TextUtils;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f24406a = new ugd(-1831513893, false, new qbd((byte) 24));
    public static final ugd b = new ugd(116216540, false, new qbd((byte) 25));
    public static final ugd c = new ugd(2063946973, false, new qbd((byte) 26));
    public static final ugd d = new ugd(-858962966, false, new ehd(12));
    public static final ugd e = new ugd(-947080424, false, new jhd(21));
    public static final ugd f = new ugd(-477404619, false, new qhd(3));
    public static final String[] g = {"SHA-256", "SHA-384", "SHA-512"};
    public static final ejv0 h = new ejv0(0);
    public static final ejv0 i = new ejv0(1);
    public static final ejv0 j = new ejv0(2);
    public static final ejv0 k = new ejv0(3);

    /* JADX WARN: Code duplicated, block: B:100:0x033b  */
    /* JADX WARN: Code duplicated, block: B:102:0x036b  */
    /* JADX WARN: Code duplicated, block: B:103:0x036d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0378  */
    /* JADX WARN: Code duplicated, block: B:112:0x0390  */
    /* JADX WARN: Code duplicated, block: B:113:0x039d  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:117:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0240  */
    /* JADX WARN: Code duplicated, block: B:81:0x0242  */
    /* JADX WARN: Code duplicated, block: B:85:0x024b  */
    /* JADX WARN: Code duplicated, block: B:88:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
    /* JADX WARN: Code duplicated, block: B:96:0x0309  */
    /* JADX WARN: Code duplicated, block: B:99:0x032f  */
    public static final void A(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, Function0 function0, fet fetVar, int i2) {
        int i3;
        pcy pcyVar;
        cl5 cl5Var;
        Function1 function2;
        boolean z;
        Object objP;
        pcy pcyVar2;
        qsa0 qsa0Var;
        boolean z2;
        a4x a4xVar;
        bms bmsVar;
        boolean z3;
        Object objP2;
        boolean z4;
        Function1 function3 = function1;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function3.getClass();
        function0.getClass();
        fetVar2.g0(1265714061);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 896;
            boolean z5 = i4 == 256;
            Object objP3 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z5 || objP3 == cl5Var2) {
                objP3 = new i0a0(function3, (byte) 27);
                fetVar2.o0(objP3);
            }
            Function0 function4 = (Function0) objP3;
            boolean z6 = i4 == 256;
            Object objP4 = fetVar2.P();
            if (z6 || objP4 == cl5Var2) {
                objP4 = new i0a0(function3, (byte) 28);
                fetVar2.o0(objP4);
            }
            v3c.A(function4, (Function0) objP4, null, fetVar2, 0, 4);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, background, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z7) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int i5 = i3;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            k7x.b(((qsa0) l7m0Var.getValue()).b(), null, jr8.f16991a.a(jm40Var), a8k0.F(R.drawable.default_background, 0, fetVar2), a8k0.F(R.drawable.default_background, 0, fetVar2), null, null, null, null, null, gqw0.A, new m78(StaticColors.INSTANCE.m76getBlack700d7_KjU(), 3), fetVar2, 36912, 6, 27616);
            mm40 mm40VarW = W(o7k0.d(jm40Var, 1.0f));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar3;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            imm immVarC = ((qsa0) l7m0Var.getValue()).c();
            boolean z8 = i4 == 256;
            Object objP5 = fetVar2.P();
            if (!z8) {
                cl5Var = cl5Var2;
                if (objP5 != cl5Var) {
                    function2 = function1;
                }
                Function0 function5 = (Function0) objP5;
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == cl5Var) {
                    objP = new rpa0(function2, (byte) 4);
                    fetVar2.o0(objP);
                }
                pcyVar2 = pcyVar;
                cl5 cl5Var3 = cl5Var;
                hlm.c(null, immVarC, null, function5, null, (Function1) objP, null, null, null, null, null, null, fetVar, 0, 0, 4053);
                fetVar2 = fetVar;
                qbc.t(null, ((qsa0) l7m0Var.getValue()).a(), fetVar2, 0);
                fetVar2.r(true);
                fetVar2.r(true);
                qsa0Var = (qsa0) l7m0Var.getValue();
                if (qsa0Var != null) {
                    if (qsa0Var instanceof psa0) {
                        fetVar2.e0(1401812280);
                        jcb.l(n0qVar, ((psa0) qsa0Var).d, false, function0, fetVar2, (i5 & 7168) | 6, 4);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                        function3 = function1;
                    } else if (qsa0Var instanceof osa0) {
                        fetVar2.e0(1402106594);
                        mm40 mm40VarR = knm0.r(wha0.a0(n0qVar, wha0.T(fetVar2), false, 14));
                        x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                        int iHashCode4 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM4 = fetVar2.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarR);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar2);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA3, shdVar);
                        jpm0.o(fetVar2, bh90VarM4, shdVar2);
                        vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC3, shdVar4);
                        osa0 osa0Var = (osa0) qsa0Var;
                        a4xVar = osa0Var.f;
                        function3 = function1;
                        w(i4, fetVar2, osa0Var.d, null, function3);
                        bmsVar = osa0Var.e;
                        if (bmsVar == null) {
                            fetVar2.e0(-1925706617);
                            fetVar2.r(false);
                            z4 = false;
                        } else {
                            fetVar2.e0(-1925706616);
                            mm40 mm40VarK = s5x0.K(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar), xfn.a(fetVar2).d, 12.0f);
                            if (i4 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objP2 = fetVar2.P();
                            if (z3 || objP2 == cl5Var3) {
                                objP2 = new rpa0(function3, (byte) 5);
                                fetVar2.o0(objP2);
                            }
                            z4 = false;
                            bfb.v(mm40VarK, bmsVar, (Function1) objP2, fetVar2, 0);
                            fetVar2.r(false);
                        }
                        if (a4xVar.isEmpty()) {
                            fetVar2.e0(-1924752126);
                            fetVar2.r(z4);
                        } else {
                            fetVar2.e0(-1924944326);
                            C(i4, fetVar2, a4xVar, null, function3);
                            fetVar2.r(z4);
                        }
                        fetVar2.r(true);
                        fetVar2.r(z4);
                    } else {
                        z2 = false;
                    }
                    fetVar2.r(true);
                } else {
                    z2 = false;
                }
                throw b1j.f(-924612517, fetVar2, z2);
            }
            cl5Var = cl5Var2;
            function2 = function1;
            objP5 = new i0a0(function2, (byte) 29);
            fetVar2.o0(objP5);
            Function0 function6 = (Function0) objP5;
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                objP = new rpa0(function2, (byte) 4);
                fetVar2.o0(objP);
            } else {
                objP = new rpa0(function2, (byte) 4);
                fetVar2.o0(objP);
            }
            pcyVar2 = pcyVar;
            cl5 cl5Var4 = cl5Var;
            hlm.c(null, immVarC, null, function6, null, (Function1) objP, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            qbc.t(null, ((qsa0) l7m0Var.getValue()).a(), fetVar2, 0);
            fetVar2.r(true);
            fetVar2.r(true);
            qsa0Var = (qsa0) l7m0Var.getValue();
            if (qsa0Var != null) {
                if (qsa0Var instanceof psa0) {
                    fetVar2.e0(1401812280);
                    jcb.l(n0qVar, ((psa0) qsa0Var).d, false, function0, fetVar2, (i5 & 7168) | 6, 4);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    function3 = function1;
                } else if (qsa0Var instanceof osa0) {
                    fetVar2.e0(1402106594);
                    mm40 mm40VarR2 = knm0.r(wha0.a0(n0qVar, wha0.T(fetVar2), false, 14));
                    x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarR2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar2);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA4, shdVar);
                    jpm0.o(fetVar2, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC4, shdVar4);
                    osa0 osa0Var2 = (osa0) qsa0Var;
                    a4xVar = osa0Var2.f;
                    function3 = function1;
                    w(i4, fetVar2, osa0Var2.d, null, function3);
                    bmsVar = osa0Var2.e;
                    if (bmsVar == null) {
                        fetVar2.e0(-1925706617);
                        fetVar2.r(false);
                        z4 = false;
                    } else {
                        fetVar2.e0(-1925706616);
                        mm40 mm40VarK2 = s5x0.K(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar), xfn.a(fetVar2).d, 12.0f);
                        if (i4 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z3) {
                            objP2 = new rpa0(function3, (byte) 5);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new rpa0(function3, (byte) 5);
                            fetVar2.o0(objP2);
                        }
                        z4 = false;
                        bfb.v(mm40VarK2, bmsVar, (Function1) objP2, fetVar2, 0);
                        fetVar2.r(false);
                    }
                    if (a4xVar.isEmpty()) {
                        fetVar2.e0(-1924944326);
                        C(i4, fetVar2, a4xVar, null, function3);
                        fetVar2.r(z4);
                    } else {
                        fetVar2.e0(-1924752126);
                        fetVar2.r(z4);
                    }
                    fetVar2.r(true);
                    fetVar2.r(z4);
                } else {
                    z2 = false;
                }
                fetVar2.r(true);
            } else {
                z2 = false;
            }
            throw b1j.f(-924612517, fetVar2, z2);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(mm40Var, l7m0Var, function3, function0, i2);
        }
    }

    public static final void B(int i2, fet fetVar, l7m0 l7m0Var, Function0 function0, Function1 function1) {
        fet fetVar2;
        l7m0 l7m0Var2;
        Function0 function2;
        Function1 function3;
        l7m0Var.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(-1182675249);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 << 3;
            fetVar2 = fetVar;
            l7m0Var2 = l7m0Var;
            function2 = function0;
            function3 = function1;
            A(o7k0.c, l7m0Var2, function3, function2, fetVar2, (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168));
        } else {
            fetVar2 = fetVar;
            l7m0Var2 = l7m0Var;
            function2 = function0;
            function3 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsa0(l7m0Var2, function3, function2, i2);
        }
    }

    public static final void C(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(656084136);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            nkb.h(null, new hjm(rsm0.w(R.string.top_polybet, 0, fetVar2), null, new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), kjm.f18392a, null, null, null, fetVar2, 384, 57);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40Var, 324.0f);
            mm40 mm40VarD2 = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            boolean zG = ((i3 & 112) == 32) | fetVar2.g(mm40VarS) | ((i3 & 896) == 256);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new g160(a4xVar, mm40VarS, function1, (byte) 4);
                fetVar2.o0(objP);
            }
            b8k0.f(mm40VarD2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 0, 490);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i2, (byte) 11);
        }
    }

    public static final void D(nsl0 nsl0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1671137704);
        int i3 = i2 | (fetVar.g(nsl0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            m8x.y(null, null, u1c.M(1196179821, new bsl0(nsl0Var, function1), fetVar), null, null, 0, 0L, 0L, null, u1c.M(1416150071, new nhl0(nsl0Var, function1, (byte) 5), fetVar), fetVar, 805306752, 507);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl0(nsl0Var, function1, i2);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1470544486);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            n0q n0qVar = o7k0.c;
            boolean zF = fetVar.f(background);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new r2a0((byte) 8, background);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(rq8.K(n0qVar, (Function1) objP), "SPORT_FILTER_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            x(null, ((nsl0) l7m0Var.getValue()).f24056a, function1, fetVar, (i3 << 3) & 896);
            D((nsl0) l7m0Var.getValue(), function1, fetVar, i3 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 12);
        }
    }

    public static final void F(mm40 mm40Var, w2d w2dVar, fqj0 fqj0Var, kr50 kr50Var, xdr xdrVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(440980901);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.g(fqj0Var) ? 256 : 128) | (fetVar.g(kr50Var) ? 2048 : 1024) | (fetVar.i(xdrVar) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            m2x.c(o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3), w2dVar, u1c.M(1799255806, new dr50(kr50Var, fqj0Var, xdrVar), fetVar), u1c.M(-404181953, new wr4(function0, (byte) 10), fetVar), fetVar, 3520 | (i3 & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, w2dVar, fqj0Var, kr50Var, xdrVar, function0, i2, (byte) 24);
        }
    }

    public static final void G(mm40 mm40Var, ArrayList arrayList, Function2 function2, fet fetVar, int i2) {
        fetVar.g0(1142649145);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            q7x.k(o7k0.d(mm40Var, 1.0f), arrayList, function2, fetVar, i3 & 1008);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new er50(mm40Var, arrayList, function2, i2, (byte) 0);
        }
    }

    public static final void H(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i2) {
        fetVar.g0(-2065206576);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            r7x.h(mm40Var, fqj0Var, fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new buv(mm40Var, fqj0Var, i2, b2);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        mm40 mm40Var2;
        boolean z;
        l7m0Var.getClass();
        fetVar.g0(-557994699);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (((cqr) l7m0Var.getValue()).c) {
                fetVar.e0(638011464);
                z = fetVar.k(bmd.n) == k6z.b;
                fetVar.r(false);
            } else {
                fetVar.e0(-1696479859);
                fetVar.r(false);
                z = false;
            }
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(n0qVar, obc.O(((cqr) l7m0Var.getValue()).b, fetVar), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            uc9.c(yyw.V(n0qVar, z), null, new n0x(((cqr) l7m0Var.getValue()).f4810a), null, null, null, null, gqw0.A, null, fetVar, 12585984, WarningHeader.INSUFFICIENT_BANDWIDTH);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2s(mm40Var2, l7m0Var, i2, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void J(final String str, final int i2, final long j2, Function0 function0, fet fetVar, final int i3, final int i4) {
        String str2;
        int i5;
        Function0 function1;
        int i6;
        boolean z;
        final Function0 function2;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        Function0 function3;
        boolean z2;
        Object objP;
        boolean z3;
        pcy pcyVar;
        Object objP2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1329658477);
        byte b2 = 4;
        if ((i3 & 6) == 0) {
            str2 = str;
            i5 = (fetVar2.g(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= fetVar2.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= fetVar2.f(j2) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 == 0) {
            if ((i3 & 3072) == 0) {
                function1 = function0;
                i5 |= fetVar2.i(function1) ? 2048 : 1024;
            }
            i6 = i5;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i6 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i7 != 0) {
                    objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new c51((byte) 22);
                        fetVar2.o0(objP2);
                    }
                    function3 = (Function0) objP2;
                } else {
                    function3 = function1;
                }
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
                zcl zclVar2 = qmk.f;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE0 = o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), "STATUS_BUTTON_ROW");
                if ((i6 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new tq(function3, b2);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarY = y860.Y(mm40VarE0, false, null, null, (Function0) objP, 15);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
                mkd.c0.getClass();
                fetVar2.i0();
                z3 = fetVar2.S;
                pcyVar = e7z.u1;
                if (z3) {
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
                mm40 mm40VarA = o7k0.A(s5x0.L(o7k0.c(jm40Var, 1.0f), 12.0f, 0.0f, 2), gqw0.n, 2);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA);
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
                dww.c(a8k0.F(i2, (i6 >> 3) & 14, fetVar2), null, o7k0.n(jm40Var, 16.0f), y3d.g, fetVar2, 3128, 0);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                aad.e(str2, null, y9q0.a(g1t0.j(), j2, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.o, qmk.s, qmk.n), fetVar2, (14 & i6) | 1794048, 394);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(true);
                function2 = function3;
            } else {
                fetVar2.X();
                function2 = function1;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ey1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o050.J(str, i2, j2, function2, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 3072;
        function1 = function0;
        i6 = i5;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i6 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i7 != 0) {
                objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new c51((byte) 22);
                    fetVar2.o0(objP2);
                }
                function3 = (Function0) objP2;
            } else {
                function3 = function1;
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 40.0f);
            zcl zclVar4 = qmk.f;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarE1 = o2e.e0(i120.Q(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), "STATUS_BUTTON_ROW");
            if ((i6 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar2.P();
            if (z2) {
                objP = new tq(function3, b2);
                fetVar2.o0(objP);
            } else {
                objP = new tq(function3, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY2 = y860.Y(mm40VarE1, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarY2);
            mkd.c0.getClass();
            fetVar2.i0();
            z3 = fetVar2.S;
            pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC2, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM3, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf2, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC2, shdVar8);
            mm40 mm40VarA2 = o7k0.A(s5x0.L(o7k0.c(jm40Var2, 1.0f), 12.0f, 0.0f, 2), gqw0.n, 2);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarA2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar5);
            jpm0.o(fetVar2, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar8);
            dww.c(a8k0.F(i2, (i6 >> 3) & 14, fetVar2), null, o7k0.n(jm40Var2, 16.0f), y3d.g, fetVar2, 3128, 0);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            aad.e(str2, null, y9q0.a(g1t0.j(), j2, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.o, qmk.s, qmk.n), fetVar2, (14 & i6) | 1794048, 394);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            function2 = function3;
        } else {
            fetVar2.X();
            function2 = function1;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ey1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o050.J(str, i2, j2, function2, (fet) obj, x8x.L(i3 | 1), i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void K(oy1 oy1Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        Function0 function1 = function0;
        fet fetVar2 = fetVar;
        fetVar2.g0(-466088631);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(oy1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function1) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = oy1Var.b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    fetVar2.e0(383635981);
                    J(oy1Var.f26039a, R.drawable.ic_status_green_check_circle, ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU(), null, fetVar2, 0, 8);
                    fetVar2.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw b1j.f(-1234570503, fetVar2, false);
                    }
                    fetVar2.e0(383935720);
                    J(oy1Var.f26039a, R.drawable.ic_status_red_warning_circle, ((ThemeColors) fetVar2.k(zaq0.b)).getWarning(), function1, fetVar2, (i3 << 6) & 7168, 0);
                    fetVar2.r(false);
                }
                function1 = function0;
            } else {
                fetVar2.e0(383082693);
                function1 = function0;
                qzb.n(o7k0.d(jm40.b, 1.0f), new wul(lul.e, oe9.f25112a, new ue9(oy1Var.f26039a), true, false, false), function1, fetVar, ((i3 << 3) & 896) | 6, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) oy1Var, function1, i2, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.Throwable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public static final ArrayList L(List list, List list2, boolean z, HashMap map, boolean z2, ctf0 ctf0Var) {
        boolean z3;
        ?? r22;
        boolean z4;
        boolean z5;
        List list3;
        h5d h5dVar;
        int iB;
        de7 de7Var;
        int iIntValue;
        boolean z6;
        int i2;
        BetZip betZip;
        List list4 = list2;
        list.getClass();
        list4.getClass();
        map.getClass();
        ctf0Var.getClass();
        int i3 = 1;
        ?? r11 = 0;
        if (z2) {
            if (list.isEmpty()) {
                z6 = false;
            } else {
                List listM = M(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM) {
                    if (((BetZip) obj).f46426a > 0) {
                        arrayList.add(obj);
                    }
                }
                List listM2 = M(list4);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM2) {
                    if (((BetZip) obj2).f46426a > 0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
                int i4 = 0;
                for (Object obj3 : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    BetZip betZip2 = (BetZip) obj3;
                    ArrayList arrayList4 = i4 < arrayList2.size() ? arrayList2 : null;
                    if (arrayList4 == null || (betZip = (BetZip) arrayList4.get(i4)) == null) {
                        i2 = 0;
                    } else {
                        if (betZip.f46426a != betZip2.f46426a) {
                            betZip = null;
                        }
                        if (betZip != null) {
                            i2 = ((int) (betZip2.b * 10000.0d)) - ((int) (betZip.b * 10000.0d));
                        } else {
                            i2 = 0;
                        }
                    }
                    arrayList3.add(Boolean.valueOf(i2 != 0));
                    i4 = i5;
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z6 = false;
                            }
                        }
                    }
                }
                z6 = true;
            }
            z3 = z6;
        } else {
            z3 = false;
        }
        ArrayList arrayList5 = new ArrayList();
        int i6 = 0;
        for (Object obj4 : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                ?? r23 = r11;
                q3d.p();
                throw r23;
            }
            BetGroupZip betGroupZip = (BetGroupZip) obj4;
            List list5 = betGroupZip.g;
            long j2 = betGroupZip.b;
            if (list5.isEmpty()) {
                r22 = r11;
            } else {
                long j3 = betGroupZip.b;
                String str = betGroupZip.c;
                str.getClass();
                r22 = r11;
                boolean z7 = betGroupZip.h;
                arrayList5.add(new r07(j3, str, z7, z7 ? 0.0f : 180.0f));
                if (betGroupZip.h) {
                    if (lo7.f20377a[betGroupZip.i.ordinal()] == i3) {
                        ArrayList arrayList6 = new ArrayList();
                        int i8 = 0;
                        for (Object obj5 : list5) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw r22;
                            }
                            ChildBets childBets = (ChildBets) obj5;
                            long j4 = j2;
                            List list6 = list5;
                            long j5 = betGroupZip.b;
                            uuz uuzVar = zq20.f44789a;
                            int size = list6.size();
                            uuzVar.getClass();
                            zq20 zq20VarD = uuz.d(size, i8);
                            Integer num = (Integer) map.get(Long.valueOf(j4));
                            if (num != null) {
                                int iIntValue2 = num.intValue();
                                ?? r7 = num;
                                if (iIntValue2 <= 0) {
                                    r7 = r22;
                                }
                                if (r7 != 0) {
                                    iIntValue = r7.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                            } else {
                                iIntValue = 0;
                            }
                            BetGroupZip betGroupZip2 = betGroupZip;
                            arrayList6.add(new ah(childBets, j5, z, zq20VarD, iIntValue));
                            betGroupZip = betGroupZip2;
                            i8 = i9;
                            list5 = list6;
                            j2 = j4;
                        }
                        arrayList5.addAll(arrayList6);
                        r22 = r22;
                    } else {
                        BetGroupZip betGroupZip3 = (BetGroupZip) CollectionsKt.W(i6, list4);
                        List list7 = (betGroupZip3 == null || betGroupZip3.b != j2) ? iun.f15405a : ((BetGroupZip) list4.get(i6)).f;
                        ArrayList arrayList7 = new ArrayList();
                        List list8 = betGroupZip.f;
                        int i10 = betGroupZip.e;
                        int i11 = 0;
                        for (Object obj6 : list8) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                q3d.p();
                                throw r22;
                            }
                            BetZip betZip3 = (BetZip) obj6;
                            if (Intrinsics.d(betZip3, y860.a0())) {
                                hio.b.getClass();
                                hio hioVar = i10 != 1 ? (i10 == 2 || i10 != 3) ? hio.TWO_EVENT : hio.THREE_EVENT : hio.ONE_EVENT;
                                de7Var = new de7(0L, "", null, false, "", zq20.e, hioVar.f13123a, R.attr.uikitTextPrimary, 0, 0, 0.45f, false, null);
                                list3 = list7;
                                z5 = z3;
                            } else {
                                zq20.f44789a.getClass();
                                zq20 zq20VarD2 = uuz.d(i10, i11);
                                hio.b.getClass();
                                hio hioVar2 = i10 != 1 ? (i10 == 2 || i10 != 3) ? hio.TWO_EVENT : hio.THREE_EVENT : hio.ONE_EVENT;
                                BetZip betZip4 = (BetZip) CollectionsKt.W(i11, list7);
                                betZip3.getClass();
                                z5 = z3;
                                double d2 = betZip3.b;
                                if (z5 || betZip4 == null) {
                                    h5dVar = h5d.f12474a;
                                    list3 = list7;
                                } else {
                                    list3 = list7;
                                    double d3 = betZip4.b;
                                    h5dVar = d2 > d3 ? h5d.b : d2 < d3 ? h5d.c : h5d.f12474a;
                                }
                                long j6 = betZip3.f46426a;
                                boolean z8 = betZip3.f;
                                String str2 = betZip3.t;
                                str2.getClass();
                                byte b2 = hioVar2.f13123a;
                                String strM = ju70.M(betZip3, z);
                                boolean z9 = d2 == 0.0d && str2.length() == 0;
                                int iOrdinal = h5dVar.ordinal();
                                if (iOrdinal == 0) {
                                    iB = ctf0.b(R.attr.uikitTextPrimary, ctf0Var);
                                } else if (iOrdinal == 1) {
                                    iB = ctf0Var.a(R.color.static_green);
                                } else {
                                    if (iOrdinal != 2) {
                                        t9f.b();
                                        return r22;
                                    }
                                    iB = ctf0Var.a(R.color.static_red);
                                }
                                de7Var = new de7(j6, str2, betZip3, z9, strM, zq20VarD2, b2, iB, z8 ? R.drawable.ic_lock_icon : 0, betZip3.w ? R.drawable.ic_eye_ : 0, z8 ? 0.45f : 1.0f, (z8 || d2 == 0.0d || str2.length() <= 0) ? false : true, new chl0(betZip3.t, ju70.M(betZip3, z), z8 ? k0d.b : k0d.f17460a, a65.f301a, false, betZip3.w, false, false, new xgl0(0L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false)));
                            }
                            arrayList7.add(de7Var);
                            z3 = z5;
                            i11 = i12;
                            list7 = list3;
                        }
                        z4 = z3;
                        arrayList5.addAll(arrayList7);
                    }
                    list4 = list2;
                    z3 = z4;
                    i6 = i7;
                    r11 = r22;
                    i3 = 1;
                } else {
                    r22 = r22;
                }
            }
            z4 = z3;
            list4 = list2;
            z3 = z4;
            i6 = i7;
            r11 = r22;
            i3 = 1;
        }
        return arrayList5;
    }

    public static final List M(List list) {
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BetGroupZip) it.next()).f);
        }
        return r3d.r(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] N(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoB = grv0.a(context).b(64, str);
        Signature[] signatureArr = packageInfoB.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoB.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoB.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static final long O(float f2, long j2, long j3) {
        float fH = y3d.h(j2);
        float fH2 = ((y3d.h(j3) - fH) * f2) + fH;
        float fG = y3d.g(j2);
        float fG2 = ((y3d.g(j3) - fG) * f2) + fG;
        float fE = y3d.e(j2);
        float fE2 = ((y3d.e(j3) - fE) * f2) + fE;
        float fD = y3d.d(j2);
        return fbc.c(fH2, fG2, fE2, ((y3d.d(j3) - fD) * f2) + fD, a5d.e);
    }

    public static final mm40 P(mm40 mm40Var) {
        return mm40Var.e(new u9o0(j));
    }

    public static final mm40 Q(mm40 mm40Var, eiy eiyVar, xbz xbzVar, ma80 ma80Var, boolean z, boolean z2) {
        return mm40Var.e(new acz(eiyVar, xbzVar, ma80Var, z, z2));
    }

    public static final void R(k050 k050Var, bnn0 bnn0Var) {
        if (pnx.c(n050.f22685a, k050Var, bnn0Var) != wne.f39444a) {
            yje yjeVarB = pnx.b(bnn0Var);
            Unit unit = Unit.f46060a;
            e0g0 e0g0Var = j0g0.b;
            yjeVarB.resumeWith(unit);
        }
    }

    public static final mm40 S(mm40 mm40Var) {
        return mm40Var.e(new u9o0(k));
    }

    public static final mm40 T(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new kpq(function1));
    }

    public static final String U(Throwable th, ctf0 ctf0Var) {
        String message;
        th.getClass();
        ctf0Var.getClass();
        return (!(th instanceof zhi0) || (message = th.getMessage()) == null || StringsKt.W(message)) ? ctf0Var.f(R.string.error_something_went_wrong, new Object[0]) : String.valueOf(th.getMessage());
    }

    public static String V(String str) {
        byte[] bytes;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            afn0.j("SHA", "content or algorithm is null.");
            return "";
        }
        for (int i2 = 0; i2 < 3; i2++) {
            String[] strArr = g;
            if (strArr[i2].equals("SHA-256")) {
                try {
                    bytes = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    bytes = new byte[0];
                    afn0.j("SHA", "Error in generate SHA UnsupportedEncodingException");
                }
                if (bytes == null || TextUtils.isEmpty("SHA-256")) {
                    afn0.j("SHA", "content or algorithm is null.");
                    bArrDigest = new byte[0];
                } else {
                    for (int i3 = 0; i3 < 3; i3++) {
                        if (strArr[i3].equals("SHA-256")) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(bytes);
                                bArrDigest = messageDigest.digest();
                            } catch (NoSuchAlgorithmException unused2) {
                                afn0.j("SHA", "Error in generate SHA NoSuchAlgorithmException");
                                bArrDigest = new byte[0];
                            }
                        }
                    }
                    afn0.j("SHA", "algorithm is not safe or legal");
                    bArrDigest = new byte[0];
                }
                return obc.M(bArrDigest);
            }
        }
        afn0.j("SHA", "algorithm is not safe or legal");
        return "";
    }

    public static final mm40 W(mm40 mm40Var) {
        return mm40Var.e(new u9o0(i));
    }

    public static final mm40 X(mm40 mm40Var) {
        return mm40Var.e(new u9o0(h));
    }

    public static final ArrayList Y(long j2, ctf0 ctf0Var, List list) {
        list.getClass();
        ctf0Var.getClass();
        List listC = kotlin.collections.a.c(osq0.f25795a);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            long jLongValue = ((Number) obj).longValue();
            boolean z = i2 == list.size() - 1;
            boolean z2 = jLongValue == j2;
            arrayList.add(new ug(jLongValue, z, z2, z2 ? ctf0.b(R.attr.uikitPrimary, ctf0Var) : ctf0.b(R.attr.uikitTextPrimary, ctf0Var), z2 ? ctf0.b(R.attr.uikitPrimary, ctf0Var) : ctf0.b(R.attr.uikitSecondary, ctf0Var)));
            i2 = i3;
        }
        return CollectionsKt.q0(listC, arrayList);
    }

    public static final qu6 Z(pu6 pu6Var, vby vbyVar) {
        zfa0 zfa0Var;
        Object obj;
        Object next;
        long j2;
        pu6Var.getClass();
        vbyVar.getClass();
        long j3 = pu6Var.f27599a;
        long j4 = pu6Var.b;
        long j5 = pu6Var.c;
        long j6 = pu6Var.d;
        long j7 = pu6Var.e;
        String str = pu6Var.f;
        String str2 = pu6Var.g;
        int i2 = pu6Var.C;
        String str3 = pu6Var.h;
        String str4 = pu6Var.i;
        String str5 = pu6Var.j;
        String str6 = pu6Var.k;
        String str7 = pu6Var.l;
        String str8 = pu6Var.m;
        long j8 = pu6Var.n;
        String str9 = pu6Var.o;
        double d2 = pu6Var.p;
        String str10 = pu6Var.t;
        tqt tqtVar = uoy.b;
        byte b2 = pu6Var.u.f34306a;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(b2);
        long j9 = pu6Var.v;
        tv6 tv6Var = new tv6(pu6Var.r, pu6Var.s, pu6Var.D, pu6Var.E, pu6Var.q);
        String str11 = pu6Var.w;
        if (str11.length() == 0) {
            zfa0Var = yfa0.INSTANCE;
        } else {
            try {
                zfa0Var = (zfa0) vbyVar.b(xfa0.Companion.serializer(), str11);
            } catch (Exception e2) {
                e2.printStackTrace();
                zfa0Var = yfa0.INSTANCE;
            }
        }
        zfa0 zfa0Var2 = zfa0Var;
        std stdVar = gwe.b;
        int i3 = pu6Var.x;
        stdVar.getClass();
        Iterator it = gwe.v.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Iterator it2 = it;
            if (((gwe) next).ordinal() == i3) {
                break;
            }
            it = it2;
        }
        gwe gweVar = (gwe) next;
        if (gweVar == null) {
            gweVar = gwe.DEFAULT;
        }
        gwe gweVar2 = gweVar;
        String str12 = pu6Var.y;
        String str13 = pu6Var.z;
        String str14 = pu6Var.A;
        String str15 = pu6Var.B;
        long j10 = pu6Var.F;
        double d3 = pu6Var.G;
        String str16 = pu6Var.H;
        int i4 = pu6Var.I;
        int i5 = pu6Var.J;
        int i6 = pu6Var.K;
        int i7 = pu6Var.L;
        bj5 bj5Var = uyc.b;
        int i8 = pu6Var.M;
        bj5Var.getClass();
        Iterator it3 = uyc.g.iterator();
        while (true) {
            if (!it3.hasNext()) {
                j2 = j5;
                break;
            }
            Object next2 = it3.next();
            j2 = j5;
            if (((uyc) next2).f36481a == i8) {
                obj = next2;
                break;
            }
            j5 = j2;
        }
        uyc uycVar = (uyc) obj;
        if (uycVar == null) {
            uycVar = uyc.IDLE;
        }
        return new qu6(j3, j4, j2, j6, j7, str, str2, str3, str4, str12, str5, str6, str13, str14, str15, str7, str8, j8, str9, d2, tv6Var, str10, uoyVarJ, j9, zfa0Var2, gweVar2, i2, j10, d3, str16, i4, new ic9(i5, i6, i7, uycVar));
    }

    public static final void a(mm40 mm40Var, zs1 zs1Var, xcz xczVar, mtl mtlVar, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        boolean z;
        fet fetVar2 = fetVar;
        zs1Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar2.g0(-873956314);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        int i6 = i4 | (fetVar2.g(zs1Var) ? 32 : 16) | (fetVar2.g(xczVar) ? 256 : 128) | (fetVar2.g(mtlVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i5 != 0 ? jm40Var : mm40Var2;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var3.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarE0 = o2e.e0(n0qVar, "FULL_INFO_CONDITIONS_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            byte b2 = 5;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, mtlVar != null ? 100.0f : 24.0f, 5), fetVar2);
            int i7 = 57344 & i6;
            boolean z2 = ((i6 & 112) == 32) | (i7 == 16384);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new df1(zs1Var, function1, b2);
                fetVar2.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, ((i6 >> 3) & 112) | 6, Response.SERVER_TIMEOUT);
            fetVar2 = fetVar;
            if (mtlVar == null) {
                fetVar2.e0(-826276497);
                fetVar2.r(false);
                z = true;
            } else {
                fetVar2.e0(-826276496);
                mm40 mm40VarE1 = o2e.e0(s5x0.N(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), "FULL_INFO_CONDITIONS_BOTTOM_BAR");
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z3 = i7 == 16384;
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new h61(function1, (byte) 17);
                    fetVar2.o0(objP2);
                }
                z = true;
                bkb.f(mm40VarE1, mtlVar, null, false, lh80VarU, (Function1) objP2, fetVar2, 3072, 4);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vs1(mm40Var3, (Object) zs1Var, xczVar, mtlVar, function1, i2, i3, (byte) 0);
        }
    }

    public static final qu6 a0(m0k0 m0k0Var, lvj0 lvj0Var, gwe gweVar, q4f q4fVar, ic9 ic9Var) {
        m0k0Var.getClass();
        lvj0Var.getClass();
        gweVar.getClass();
        q4fVar.getClass();
        long j2 = lvj0Var.f20718a;
        long j3 = m0k0Var.Y;
        long j4 = lvj0Var.b;
        long j5 = m0k0Var.f20959a;
        String str = lvj0Var.d;
        String strB = m0k0Var.b();
        int i2 = m0k0Var.k;
        String str2 = m0k0Var.e;
        String str3 = m0k0Var.f;
        String str4 = m0k0Var.i;
        String str5 = m0k0Var.j;
        String str6 = lvj0Var.e;
        String strValueOf = String.valueOf(lvj0Var.f);
        double d2 = lvj0Var.h;
        tv6 tv6Var = new tv6(m0k0Var.v, m0k0Var.t, "", "", m0k0Var.y);
        String str7 = m0k0Var.s;
        String str8 = lvj0Var.c;
        long j6 = lvj0Var.j;
        return new qu6(0L, j2, j3, j4, j5, str, strB, str2, str3, m0k0Var.d, str4, str5, m0k0Var.h, "", "", str6, str7, 0L, strValueOf, d2, tv6Var, str8, j6 != 707 ? lvj0Var.i : uoy.BONUS, j6, lvj0Var.l, gweVar, i2, lvj0Var.k, 0.0d, "", q4fVar.a(), ic9Var == null ? new ic9(0, 0, 0, uyc.IDLE) : ic9Var);
    }

    public static final void b(final fy1 fy1Var, final Function0 function0, final Function0 function1, fet fetVar, final int i2) {
        int i3;
        Function0 function2;
        yfe0 yfe0VarU;
        Function2 function3;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-2134701791);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(fy1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            oy1 oy1Var = fy1Var.f10339a;
            String str = fy1Var.b;
            if (oy1Var == null && (str == null || str.length() == 0)) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function3 = new Function2() { // from class: a.dy1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        int i4 = i2;
                        Function0 function4 = function1;
                        Function0 function5 = function0;
                        fy1 fy1Var2 = fy1Var;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b3) {
                            case 0:
                                o050.b(fy1Var2, function5, function4, fetVar2, x8x.L(i4 | 1));
                                break;
                            default:
                                o050.b(fy1Var2, function5, function4, fetVar2, x8x.L(i4 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                function2 = function0;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarM = s5x0.M(mm40VarD, 12.0f, 12.0f, 12.0f, 12.0f);
                x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
                if (oy1Var != null) {
                    fetVar.e0(-1514301186);
                    K(oy1Var, function2, fetVar, i3 & 112);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1514165685);
                    fetVar.r(false);
                }
                if (str == null || str.length() == 0) {
                    fetVar.e0(-1513604213);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1514098167);
                    qzb.n(o7k0.d(jm40Var, 1.0f), new wul(nul.e, oe9.f25112a, new ue9(str), true, false, false), function1, fetVar, (i3 & 896) | 6, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            yfe0VarU.d = function3;
        }
        function2 = function0;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final Function0 function4 = function2;
            function3 = new Function2() { // from class: a.dy1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    int i4 = i2;
                    Function0 function5 = function1;
                    Function0 function6 = function4;
                    fy1 fy1Var2 = fy1Var;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b4) {
                        case 0:
                            o050.b(fy1Var2, function6, function5, fetVar2, x8x.L(i4 | 1));
                            break;
                        default:
                            o050.b(fy1Var2, function6, function5, fetVar2, x8x.L(i4 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static final String b0(oc5 oc5Var, iy3 iy3Var) {
        oc5Var.getClass();
        iy3Var.getClass();
        if (iy3Var != null) {
            if (iy3Var instanceof gy3) {
                return oc5Var.f25012a;
            }
            if (iy3Var instanceof ey3) {
                return oc5Var.b;
            }
            if ((iy3Var instanceof fy3) || (iy3Var instanceof hy3)) {
                return oc5Var.c;
            }
        }
        t9f.b();
        return null;
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, boolean z, fet fetVar, int i2) {
        boolean z2;
        boolean z3;
        l7m0Var.getClass();
        fetVar.g0(-1003190532);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | 128;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
            } else {
                fetVar.X();
                z3 = z;
            }
            fetVar.s();
            androidx.compose.runtime.d dVar = j7x.f16059a;
            long updateGradientStart = ((IndividualColors) fetVar.k(dVar)).getUpdateGradientStart();
            long updateGradientEnd = ((IndividualColors) fetVar.k(dVar)).getUpdateGradientEnd();
            boolean zG = fetVar.g((String) l7m0Var.getValue());
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new e900(z3 ? q3d.j(new y3d(updateGradientStart), new y3d(updateGradientEnd)) : q3d.j(new y3d(updateGradientStart), new y3d(updateGradientEnd)), null, 0L, 9187343241974906880L);
                fetVar.o0(objP);
            }
            t89 t89Var = (t89) objP;
            if (((CharSequence) l7m0Var.getValue()).length() > 0) {
                fetVar.e0(-1666140357);
                boolean zG2 = fetVar.g((String) l7m0Var.getValue());
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP2);
                }
                pz40 pz40Var = (pz40) objP2;
                boolean zG3 = fetVar.g(pz40Var) | fetVar.g(t89Var);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == obj) {
                    objP3 = new ys3(t89Var, pz40Var, (byte) 11);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarM = rq8.M(mm40Var, (Function1) objP3);
                String str = (String) l7m0Var.getValue();
                pge pgeVar = gqw0.A;
                boolean zG4 = fetVar.g(pz40Var);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == obj) {
                    objP4 = new we(pz40Var, (byte) 18);
                    fetVar.o0(objP4);
                }
                Function1 function1 = (Function1) objP4;
                boolean zG5 = fetVar.g(pz40Var);
                Object objP5 = fetVar.P();
                if (zG5 || objP5 == obj) {
                    objP5 = new we(pz40Var, (byte) 19);
                    fetVar.o0(objP5);
                }
                Function1 function2 = (Function1) objP5;
                boolean zG6 = fetVar.g(pz40Var);
                Object objP6 = fetVar.P();
                if (zG6 || objP6 == obj) {
                    objP6 = new we(pz40Var, (byte) 20);
                    fetVar.o0(objP6);
                }
                k7x.b(str, null, mm40VarM, null, null, null, function1, function2, (Function1) objP6, null, pgeVar, null, fetVar, 48, 6, 31288);
                fetVar.r(false);
            } else {
                fetVar.e0(-1665472245);
                boolean zG7 = fetVar.g(t89Var);
                Object objP7 = fetVar.P();
                if (zG7 || objP7 == obj) {
                    objP7 = new oi4(t89Var, b2);
                    fetVar.o0(objP7);
                }
                zq8.a(0, fetVar, rq8.K(mm40Var, (Function1) objP7));
                fetVar.r(false);
            }
            z2 = z3;
        } else {
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pi4(mm40Var, l7m0Var, z2, i2);
        }
    }

    public static final void d(Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(-1027746650);
        int i3 = i2 | (fetVar.i(function1) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.verification, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new fj4(function1, (byte) 27);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag0(function1, i2);
        }
    }

    public static final void e(mm40 mm40Var, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1044342025);
        byte b2 = 16;
        int i3 = i2 | 6 | (fetVar.g(mtlVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            mm40Var2 = jm40.b;
            mm40 mm40VarP = P(j120.L(mm40Var2, q33Var));
            boolean z = false;
            ma80 ma80Var = ma80.b;
            if ((i3 & 896) == 256) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new elk0(function1, b2);
                fetVar.o0(objP);
            }
            bkb.f(mm40VarP, mtlVar, ma80Var, false, null, (Function1) objP, fetVar, (i3 & 112) | 384, 24);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, mtlVar, function1, i2, (byte) 24);
        }
    }

    public static final void f(mm40 mm40Var, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(18780383);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mtlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uo6(function1, (byte) 19);
                fetVar.o0(objP);
            }
            int i4 = (i3 & 14) | 3072 | (i3 & 112);
            jm40 jm40Var = jm40.b;
            bkb.f(jm40Var, mtlVar, null, false, lh80VarU, (Function1) objP, fetVar, i4, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vb2(mm40Var2, mtlVar, function1, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:112:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0133  */
    /* JADX WARN: Code duplicated, block: B:116:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x0144  */
    /* JADX WARN: Code duplicated, block: B:120:0x0149  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x015a  */
    /* JADX WARN: Code duplicated, block: B:128:0x016e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0179  */
    /* JADX WARN: Code duplicated, block: B:132:0x017c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0180  */
    /* JADX WARN: Code duplicated, block: B:135:0x0183  */
    /* JADX WARN: Code duplicated, block: B:138:0x0189  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:159:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x021d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0271  */
    /* JADX WARN: Code duplicated, block: B:185:0x0294  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    public static final void g(Function0 function0, mm40 mm40Var, boolean z, yjj0 yjj0Var, be9 be9Var, je9 je9Var, hh80 hh80Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        boolean z2;
        yjj0 yjj0Var2;
        je9 je9Var2;
        int i5;
        int i6;
        hh80 hh80Var2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        hh80 hh80Var3;
        boolean z5;
        je9 je9Var3;
        yjj0 yjj0Var3;
        yfe0 yfe0VarU;
        yjj0 yjj0VarA;
        je9 je9Var4;
        Object objP;
        Object obj;
        gy40 gy40Var;
        long j2;
        long j3;
        int i9;
        Object objP2;
        SnapshotStateList snapshotStateList;
        boolean zG;
        Object objP3;
        nlx nlxVar;
        float f2;
        Object objP4;
        t33 t33Var;
        boolean zI;
        Object objP5;
        boolean z6;
        je9 je9Var5;
        l73 l73Var;
        float f3;
        Object objP6;
        int i10;
        int i11;
        fetVar.g0(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= fetVar.h(z2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    yjj0Var2 = yjj0Var;
                    int i13 = fetVar.g(yjj0Var2) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    yjj0Var2 = yjj0Var;
                }
                i4 |= i13;
            } else {
                yjj0Var2 = yjj0Var;
            }
            if ((i2 & 24576) == 0) {
                if (fetVar.g(be9Var)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i4 |= i11;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    je9Var2 = je9Var;
                    int i14 = fetVar.g(je9Var2) ? 131072 : 65536;
                    i4 |= i14;
                } else {
                    je9Var2 = je9Var;
                }
                i4 |= i14;
            } else {
                je9Var2 = je9Var;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (fetVar.g(null)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i4 |= i5;
            }
            i6 = i3 & 128;
            if (i6 != 0) {
                i4 |= 12582912;
                hh80Var2 = hh80Var;
            } else {
                hh80Var2 = hh80Var;
                if ((i2 & 12582912) == 0) {
                    if (fetVar.g(hh80Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (fetVar.g(null)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((805306368 & i2) == 0) {
                if (fetVar.i(ugdVar)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            z3 = true;
            if ((306783379 & i4) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i4 & 1, z4)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        lh80 lh80Var = ee9.f7659a;
                        yjj0VarA = elj0.a(pe9.f26841a, fetVar);
                        i4 &= -7169;
                    } else {
                        yjj0VarA = yjj0Var2;
                    }
                    if ((i3 & 32) != 0) {
                        lh80 lh80Var2 = ee9.f7659a;
                        je9Var4 = new je9(p0q.f);
                        i4 &= -458753;
                    } else {
                        je9Var4 = je9Var2;
                    }
                    if (i6 != 0) {
                        hh80Var3 = ee9.f7659a;
                    } else {
                        hh80Var3 = hh80Var2;
                    }
                    je9Var2 = je9Var4;
                    yjj0Var2 = yjj0VarA;
                } else {
                    fetVar.X();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    hh80Var3 = hh80Var2;
                }
                fetVar.s();
                fetVar.e0(1691738187);
                objP = fetVar.P();
                obj = ukd.f35823a;
                if (objP == obj) {
                    objP = dw9.j(fetVar);
                }
                gy40Var = (gy40) objP;
                fetVar.r(false);
                if (z2) {
                    j2 = be9Var.f2438a;
                } else {
                    j2 = be9Var.c;
                }
                if (z2) {
                    j3 = be9Var.b;
                } else {
                    j3 = be9Var.d;
                }
                if (je9Var2 == null) {
                    fetVar.e0(1691921830);
                    fetVar.r(false);
                    i4 = i4;
                    gy40Var = gy40Var;
                    z6 = z2;
                    yjj0Var2 = yjj0Var2;
                    je9Var5 = je9Var2;
                    j2 = j2;
                    l73Var = null;
                } else {
                    fetVar.e0(-499611205);
                    i9 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                    objP2 = fetVar.P();
                    if (objP2 == obj) {
                        objP2 = new SnapshotStateList();
                        fetVar.o0(objP2);
                    }
                    snapshotStateList = (SnapshotStateList) objP2;
                    zG = fetVar.g(gy40Var);
                    objP3 = fetVar.P();
                    if (zG || objP3 == obj) {
                        objP3 = new d09((Object) gy40Var, (Object) snapshotStateList, (yje) null, (byte) 9);
                        fetVar.o0(objP3);
                    }
                    m0x0.t(fetVar, gy40Var, (Function2) objP3);
                    nlxVar = (nlx) CollectionsKt.f0(snapshotStateList);
                    if (z2 || (nlxVar instanceof jub0) || !(nlxVar instanceof rsw)) {
                        f2 = 0.0f;
                    } else {
                        f2 = je9Var2.f16362a;
                    }
                    objP4 = fetVar.P();
                    if (objP4 == obj) {
                        objP4 = new t33(new ycl(f2), hp4.l, null, 12);
                        fetVar.o0(objP4);
                    }
                    t33Var = (t33) objP4;
                    ycl yclVar = new ycl(f2);
                    boolean zI2 = fetVar.i(t33Var) | fetVar.d(f2) | ((((i9 & 14) ^ 6) <= 4 && fetVar.h(z2)) || (i9 & 6) == 4);
                    if ((((i9 & 896) ^ 384) > 256 || !fetVar.g(je9Var2)) && (i9 & 384) != 256) {
                    }
                    zI = zI2 | z3 | fetVar.i(nlxVar);
                    objP5 = fetVar.P();
                    if (!zI || objP5 == obj) {
                        z6 = z2;
                        je9Var5 = je9Var2;
                        objP5 = new ie9(t33Var, f2, z6, je9Var5, nlxVar, null);
                        fetVar.o0(objP5);
                    } else {
                        z6 = z2;
                        je9Var5 = je9Var2;
                    }
                    m0x0.t(fetVar, yclVar, (Function2) objP5);
                    l73Var = t33Var.c;
                    fetVar.r(false);
                }
                if (l73Var != null) {
                    f3 = ((ycl) ((hgk0) l73Var.b).getValue()).f42389a;
                } else {
                    f3 = 0.0f;
                }
                objP6 = fetVar.P();
                if (objP6 == obj) {
                    objP6 = new d69((byte) 3);
                    fetVar.o0(objP6);
                }
                int i15 = i4;
                boolean z7 = z6;
                yjj0Var2 = yjj0Var2;
                gmn0.b(function0, pai0.a(mm40Var, false, (Function1) objP6), z7, yjj0Var2, j2, j3, 0.0f, f3, gy40Var, u1c.M(-535639973, new me9(j3, hh80Var3, ugdVar), fetVar), fetVar, (i15 & 8078) | ((i15 << 6) & 234881024), 64);
                z5 = z7;
                je9Var3 = je9Var5;
            } else {
                fetVar.X();
                hh80Var3 = hh80Var2;
                z5 = z2;
                je9Var3 = je9Var2;
            }
            yjj0Var3 = yjj0Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(function0, mm40Var, z5, yjj0Var3, be9Var, je9Var3, hh80Var3, ugdVar, i2, i3);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                yjj0Var2 = yjj0Var;
                if (fetVar.g(yjj0Var2)) {
                }
                i4 |= i13;
            } else {
                yjj0Var2 = yjj0Var;
            }
            i4 |= i13;
        } else {
            yjj0Var2 = yjj0Var;
        }
        if ((i2 & 24576) == 0) {
            if (fetVar.g(be9Var)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i4 |= i11;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                je9Var2 = je9Var;
                if (fetVar.g(je9Var2)) {
                }
                i4 |= i14;
            } else {
                je9Var2 = je9Var;
            }
            i4 |= i14;
        } else {
            je9Var2 = je9Var;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (fetVar.g(null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        i6 = i3 & 128;
        if (i6 != 0) {
            i4 |= 12582912;
            hh80Var2 = hh80Var;
        } else {
            hh80Var2 = hh80Var;
            if ((i2 & 12582912) == 0) {
                if (fetVar.g(hh80Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (fetVar.g(null)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((805306368 & i2) == 0) {
            if (fetVar.i(ugdVar)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i4 |= i10;
        }
        z3 = true;
        if ((306783379 & i4) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar.U(i4 & 1, z4)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    z2 = true;
                }
                if ((i3 & 8) != 0) {
                    lh80 lh80Var3 = ee9.f7659a;
                    yjj0VarA = elj0.a(pe9.f26841a, fetVar);
                    i4 &= -7169;
                } else {
                    yjj0VarA = yjj0Var2;
                }
                if ((i3 & 32) != 0) {
                    lh80 lh80Var4 = ee9.f7659a;
                    je9Var4 = new je9(p0q.f);
                    i4 &= -458753;
                } else {
                    je9Var4 = je9Var2;
                }
                if (i6 != 0) {
                    hh80Var3 = ee9.f7659a;
                } else {
                    hh80Var3 = hh80Var2;
                }
                je9Var2 = je9Var4;
                yjj0Var2 = yjj0VarA;
            } else {
                if (i12 != 0) {
                    z2 = true;
                }
                if ((i3 & 8) != 0) {
                    lh80 lh80Var5 = ee9.f7659a;
                    yjj0VarA = elj0.a(pe9.f26841a, fetVar);
                    i4 &= -7169;
                } else {
                    yjj0VarA = yjj0Var2;
                }
                if ((i3 & 32) != 0) {
                    lh80 lh80Var6 = ee9.f7659a;
                    je9Var4 = new je9(p0q.f);
                    i4 &= -458753;
                } else {
                    je9Var4 = je9Var2;
                }
                if (i6 != 0) {
                    hh80Var3 = ee9.f7659a;
                } else {
                    hh80Var3 = hh80Var2;
                }
                je9Var2 = je9Var4;
                yjj0Var2 = yjj0VarA;
            }
            fetVar.s();
            fetVar.e0(1691738187);
            objP = fetVar.P();
            obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40Var = (gy40) objP;
            fetVar.r(false);
            if (z2) {
                j2 = be9Var.f2438a;
            } else {
                j2 = be9Var.c;
            }
            if (z2) {
                j3 = be9Var.b;
            } else {
                j3 = be9Var.d;
            }
            if (je9Var2 == null) {
                fetVar.e0(1691921830);
                fetVar.r(false);
                i4 = i4;
                gy40Var = gy40Var;
                z6 = z2;
                yjj0Var2 = yjj0Var2;
                je9Var5 = je9Var2;
                j2 = j2;
                l73Var = null;
            } else {
                fetVar.e0(-499611205);
                i9 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = new SnapshotStateList();
                    fetVar.o0(objP2);
                }
                snapshotStateList = (SnapshotStateList) objP2;
                zG = fetVar.g(gy40Var);
                objP3 = fetVar.P();
                if (zG) {
                    objP3 = new d09((Object) gy40Var, (Object) snapshotStateList, (yje) null, (byte) 9);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new d09((Object) gy40Var, (Object) snapshotStateList, (yje) null, (byte) 9);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, gy40Var, (Function2) objP3);
                nlxVar = (nlx) CollectionsKt.f0(snapshotStateList);
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = je9Var2.f16362a;
                }
                objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new t33(new ycl(f2), hp4.l, null, 12);
                    fetVar.o0(objP4);
                }
                t33Var = (t33) objP4;
                ycl yclVar2 = new ycl(f2);
                boolean zI3 = fetVar.i(t33Var) | fetVar.d(f2) | ((((i9 & 14) ^ 6) <= 4 && fetVar.h(z2)) || (i9 & 6) == 4);
                z3 = ((i9 & 896) ^ 384) > 256 ? false : false;
                zI = zI3 | z3 | fetVar.i(nlxVar);
                objP5 = fetVar.P();
                if (zI) {
                    z6 = z2;
                    je9Var5 = je9Var2;
                    objP5 = new ie9(t33Var, f2, z6, je9Var5, nlxVar, null);
                    fetVar.o0(objP5);
                } else {
                    z6 = z2;
                    je9Var5 = je9Var2;
                    objP5 = new ie9(t33Var, f2, z6, je9Var5, nlxVar, null);
                    fetVar.o0(objP5);
                }
                m0x0.t(fetVar, yclVar2, (Function2) objP5);
                l73Var = t33Var.c;
                fetVar.r(false);
            }
            if (l73Var != null) {
                f3 = ((ycl) ((hgk0) l73Var.b).getValue()).f42389a;
            } else {
                f3 = 0.0f;
            }
            objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = new d69((byte) 3);
                fetVar.o0(objP6);
            }
            int i16 = i4;
            boolean z8 = z6;
            yjj0Var2 = yjj0Var2;
            gmn0.b(function0, pai0.a(mm40Var, false, (Function1) objP6), z8, yjj0Var2, j2, j3, 0.0f, f3, gy40Var, u1c.M(-535639973, new me9(j3, hh80Var3, ugdVar), fetVar), fetVar, (i16 & 8078) | ((i16 << 6) & 234881024), 64);
            z5 = z8;
            je9Var3 = je9Var5;
        } else {
            fetVar.X();
            hh80Var3 = hh80Var2;
            z5 = z2;
            je9Var3 = je9Var2;
        }
        yjj0Var3 = yjj0Var2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new le9(function0, mm40Var, z5, yjj0Var3, be9Var, je9Var3, hh80Var3, ugdVar, i2, i3);
        }
    }

    public static final void h(mm40 mm40Var, final pda pdaVar, Function2 function2, fet fetVar, int i2) {
        function2.getClass();
        fetVar.g0(-474599823);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(pdaVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            uc9.h(mm40Var, u1c.M(-1038261341, new ydr() { // from class: a.rca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b2;
                    pda pdaVar2 = pdaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, pdaVar2.f26799a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, pdaVar2.e, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1170863140, new ec30(pdaVar, function2, (byte) 11), fetVar), u1c.M(-914979675, new ydr() { // from class: a.rca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b3;
                    pda pdaVar2 = pdaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, pdaVar2.f26799a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, pdaVar2.e, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i3 & 14) | 28080, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sca(mm40Var, pdaVar, function2, i2);
        }
    }

    public static final void i(mm40 mm40Var, xcz xczVar, fet fetVar, int i2) {
        int i3;
        int i4;
        Object jtaVar;
        t33 t33Var;
        float f2;
        int i5;
        fetVar.g0(2067925868);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var2 = (t33) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = jgk0.b(new eb(xczVar, (byte) 8));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var = (cgk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP4);
            }
            cgk0 cgk0Var2 = (cgk0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.b(-1);
                fetVar.o0(objP5);
            }
            cgk0 cgk0Var3 = (cgk0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = androidx.compose.runtime.e.b(-1);
                fetVar.o0(objP6);
            }
            cgk0 cgk0Var4 = (cgk0) objP6;
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            Object objP7 = fetVar.P();
            if (z || objP7 == obj) {
                i4 = i6;
                Object htaVar = new hta(xczVar, cgk0Var2, cgk0Var3, cgk0Var4, null, (byte) 1);
                fetVar.o0(htaVar);
                objP7 = htaVar;
            } else {
                i4 = i6;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP7);
            boolean zI = (i4 == 32) | fetVar.i(t33Var2);
            Object objP8 = fetVar.P();
            if (zI || objP8 == obj) {
                t33Var = t33Var2;
                jtaVar = new jta(xczVar, cgk0Var, cgk0Var2, t33Var, null, (byte) 1);
                fetVar.o0(jtaVar);
            } else {
                jtaVar = objP8;
                t33Var = t33Var2;
            }
            m0x0.t(fetVar, xczVar, (Function2) jtaVar);
            Object objP9 = fetVar.P();
            if (objP9 == obj) {
                objP9 = jgk0.b(new eb(xczVar, (byte) 10));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var2 = (l7m0) objP9;
            if (((Number) l7m0Var2.getValue()).intValue() > 1) {
                fetVar.e0(-1429011426);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
                fetVar.e0(-923111257);
                int iIntValue = ((Number) l7m0Var2.getValue()).intValue();
                int i7 = 0;
                while (i7 < iIntValue) {
                    if (i7 != ((Number) l7m0Var2.getValue()).intValue() - 1) {
                        zcl zclVar = qmk.f28987a;
                        f2 = 4.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, f2, 0.0f, 11);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarC = o7k0.c(o7k0.s(mm40VarN, 8.0f), 1.0f);
                    boolean zE = fetVar.e(i7) | fetVar.i(t33Var);
                    Object objP10 = fetVar.P();
                    if (zE || objP10 == obj) {
                        i5 = i7;
                        Object etaVar = new eta(cgk0Var4, cgk0Var3, i5, t33Var, l7m0Var, (byte) 1);
                        fetVar.o0(etaVar);
                        objP10 = etaVar;
                    } else {
                        i5 = i7;
                    }
                    zq8.a(0, fetVar, rq8.K(mm40VarC, (Function1) objP10));
                    i7 = i5 + 1;
                }
                ohs0.x(fetVar, false, true, false);
            } else {
                fetVar.e0(-1427844214);
                zq8.a(0, fetVar, o7k0.d(mm40Var, 1.0f));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fta(mm40Var, xczVar, i2, b2);
        }
    }

    public static final void j(mm40 mm40Var, pnc pncVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        pncVar.getClass();
        function1.getClass();
        fetVar.g0(-1718005800);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pncVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            vhm vhmVar = pncVar.f27280a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new trb(function1, (byte) 13);
                fetVar.o0(objP);
            }
            thb.g(vhmVar, null, (Function1) objP, fetVar, 5);
            int i5 = pncVar.d;
            a4x a4xVar = pncVar.b;
            boolean z2 = false;
            aoo0 aoo0Var = pncVar.c;
            if (i4 == 256) {
                z2 = true;
            }
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new trb(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            z5n.h(i5, a4xVar, aoo0Var, null, null, false, (Function1) objP2, fetVar, 0, 56);
            ugdVar2 = ugdVar;
            ugdVar2.j(y5d.f42040a, pncVar.e, fetVar, 390);
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var, (Object) pncVar, function1, (wdr) ugdVar2, i2, (byte) 9);
        }
    }

    public static final void k(nsl0 nsl0Var, hh80 hh80Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object zol0Var;
        int i4;
        Boolean bool;
        yje yjeVar;
        fetVar.g0(1374746544);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(nsl0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            Object obj2 = (vne) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object obj3 = (wpq) fetVar.k(bmd.i);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            Boolean boolValueOf = Boolean.valueOf(nsl0Var.b);
            int i5 = i3 & 14;
            boolean zG = (i5 == 4) | fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            yje yjeVar2 = null;
            if (zG || objP2 == obj) {
                i4 = i5;
                bool = boolValueOf;
                zol0Var = new zol0((Object) nsl0Var, (Object) xczVarA, (Object) pz40VarF, yjeVar2, (byte) 2);
                fetVar.o0(zol0Var);
            } else {
                i4 = i5;
                bool = boolValueOf;
                zol0Var = objP2;
            }
            m0x0.t(fetVar, bool, (Function2) zol0Var);
            Boolean boolValueOf2 = Boolean.valueOf(xczVarA.j.a());
            boolean zG2 = fetVar.g(xczVarA) | (i4 == 4) | fetVar.g(r19) | fetVar.i(obj3);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                yjeVar = null;
                Object ah0Var = new ah0((Object) xczVarA, (Object) nsl0Var, (Object) pkk0Var, obj3, (yje) null, (byte) 20);
                fetVar.o0(ah0Var);
                objP3 = ah0Var;
            } else {
                yjeVar = null;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP3);
            boolean zG3 = fetVar.g(pz40VarF);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == obj) {
                objP4 = new o060(pz40VarF, yjeVar, (byte) 1);
                fetVar.o0(objP4);
            }
            Object objP5 = ydx.P(xczVarA, (ydr) objP4, fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            n0q n0qVar = o7k0.c;
            boolean zF = fetVar.f(background);
            Object objP6 = fetVar.P();
            if (zF || objP6 == obj) {
                objP6 = new r2a0((byte) 9, background);
                fetVar.o0(objP6);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.I(rq8.K(n0qVar, (Function1) objP6), hh80Var), "LAZY_COLUMN_SPORTS_FILTER");
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 12.0f);
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            boolean zG4 = (i4 == 4) | fetVar.g(objP5) | fetVar.g(pz40VarF) | fetVar.i(obj2);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == obj) {
                Object l0i0Var = new l0i0((Object) nsl0Var, objP5, (Object) pz40VarF, obj2, (byte) 4);
                fetVar.o0(l0i0Var);
                objP7 = l0i0Var;
            }
            b8k0.e(mm40VarE0, xczVarA, lh80Var, qw3Var, null, null, false, null, (Function1) objP7, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) nsl0Var, (Object) hh80Var, (Object) function1, i2, (byte) 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void l(mm40 mm40Var, w2d w2dVar, boolean z, ArrayList arrayList, xdr xdrVar, Function1 function1, fet fetVar, int i2) {
        ArrayList arrayList2;
        fet fetVar2;
        xcz xczVar;
        kwj kwjVar;
        kwj kwjVar2;
        ?? r3;
        fet fetVar3 = fetVar;
        fetVar3.g0(569398501);
        int i3 = i2 | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.i(w2dVar) ? 32 : 16) | (fetVar3.h(z) ? 256 : 128) | (fetVar3.g(arrayList) ? 2048 : 1024) | (fetVar3.i(xdrVar) ? 16384 : 8192) | (fetVar3.i(function1) ? 131072 : 65536);
        byte b2 = 1;
        if (fetVar3.U(i3 & 1, (74899 & i3) != 74898)) {
            int iB = (int) (((yez) ((rhv0) fetVar3.k(bmd.u))).b() >> 32);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar3.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (((wo5) it.next()).b.e) {
                        break;
                    } else {
                        i5++;
                    }
                }
                objP = Integer.valueOf(i5);
                fetVar3.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar3.P();
            if (z3 || objP2 == obj) {
                objP2 = new l82(arrayList, b2);
                fetVar3.o0(objP2);
            }
            kwj kwjVarB = zk80.b(iIntValue, (Function0) objP2, fetVar3, 0, 2);
            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
            Object objP3 = fetVar3.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar3.o0(objP3);
            }
            cgk0 cgk0Var = (cgk0) objP3;
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zG = fetVar3.g(kwjVarB) | fetVar3.e(iIntValue) | fetVar3.g(xczVarA) | fetVar3.e(iB);
            Object objP4 = fetVar3.P();
            if (zG || objP4 == obj) {
                xczVar = xczVarA;
                objP4 = new gd7(kwjVarB, iIntValue, xczVar, iB, cgk0Var, null);
                kwjVar = kwjVarB;
                fetVar3.o0(objP4);
            } else {
                kwjVar = kwjVarB;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar3, numValueOf, (Function2) objP4);
            Boolean boolValueOf = Boolean.valueOf(kwjVar.k.a());
            int i6 = i3 & 458752;
            boolean zG2 = fetVar3.g(kwjVar) | (i6 == 131072);
            Object objP5 = fetVar3.P();
            yje yjeVar = null;
            if (zG2 || objP5 == obj) {
                objP5 = new fc30(kwjVar, function1, yjeVar, (byte) 1);
                fetVar3.o0(objP5);
            }
            m0x0.t(fetVar3, boolValueOf, (Function2) objP5);
            mm40 mm40VarV = cjx.V(mm40Var, w2dVar, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarV);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (arrayList.size() > 1) {
                fetVar3.e0(-1995600997);
                if (z) {
                    fetVar3.e0(-1995606577);
                    qxw.o(fetVar3, o7k0.e(jm40.b, (1.0f - w2dVar.f38442a.a()) * 4.0f));
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-1995429753);
                    fetVar3.r(false);
                }
                float f2 = xfn.a(fetVar3).d;
                float f3 = xfn.a(fetVar3).d;
                zcl zclVar = qmk.f28987a;
                lh80 lh80Var = new lh80(f2, 8.0f, f3, 8.0f);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                boolean zG3 = (i6 == 131072) | (i4 == 2048) | fetVar3.g(kwjVar);
                Object objP6 = fetVar3.P();
                if (zG3 || objP6 == obj) {
                    kwj kwjVar3 = kwjVar;
                    Object enmVar = new enm((Object) arrayList, (Object) function1, (Object) kwjVar3, (Object) cgk0Var, (byte) 22);
                    kwjVar2 = kwjVar3;
                    fetVar3.o0(enmVar);
                    objP6 = enmVar;
                } else {
                    kwjVar2 = kwjVar;
                }
                arrayList2 = arrayList;
                r3 = 1;
                b8k0.f(null, xczVar, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP6, fetVar3, 0, Response.BAD_EVENT);
                fetVar3.r(false);
            } else {
                arrayList2 = arrayList;
                kwjVar2 = kwjVar;
                r3 = 1;
                fetVar3.e0(-1994051865);
                fetVar3.r(false);
            }
            q5x.e(kwjVar2, o7k0.c, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(997244892, new ec30(arrayList2, xdrVar, r3), fetVar3), fetVar, 48, 24576, 16380);
            fet fetVar4 = fetVar;
            fetVar4.r(r3);
            fetVar2 = fetVar4;
        } else {
            arrayList2 = arrayList;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var, (Object) w2dVar, z, (Object) arrayList2, (Object) xdrVar, function1, i2, (byte) 12);
        }
    }

    public static final void m(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1138555787);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 5);
        }
    }

    public static final void n(mm40 mm40Var, w2d w2dVar, fqj0 fqj0Var, fet fetVar, int i2) {
        fqj0 fqj0Var2 = fqj0Var;
        x2d x2dVar = w2dVar.f38442a;
        fetVar.g0(-2102414062);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.g(fqj0Var2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(mm40Var, w2dVar, null);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarB = vgg0.b((1.0f - x2dVar.a()) * 24.0f, (1.0f - x2dVar.a()) * 24.0f, 0.0f, 0.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0VarB);
            lh80 lh80Var = new lh80(xfn.a(fetVar).c, 16.0f, xfn.a(fetVar).c, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new yq5(fqj0Var2, (byte) 2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarJ, xczVarA, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fqj0Var2 = fqj0Var;
            a8k0.i(o7k0.c, fqj0Var2, fetVar, ((i3 >> 3) & 112) | 6);
            qxw.o(fetVar, o7k0.e(jm40Var, 32.0f));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, w2dVar, fqj0Var2, i2, (byte) 0);
        }
    }

    public static final void o(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1108601573);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ir8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            vuh vuhVar = (vuh) l7m0Var2.getValue();
            if (vuhVar != null) {
                if (vuhVar instanceof uuh) {
                    fetVar.e0(214228851);
                    v(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = vuhVar instanceof tuh;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(-1948781092);
                        u(ir8Var.b(jm40Var, gqw0.e), ((tuh) vuhVar).e, function1, fetVar, i3 & 896);
                        fetVar.r(false);
                    } else if (vuhVar instanceof suh) {
                        fetVar.e0(-1948498124);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean zG = fetVar.g(vuhVar) | ((i3 & 896) == 256);
                        Object objP = fetVar.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = new ngh(vuhVar, function1, (byte) 6);
                            fetVar.o0(objP);
                        }
                        b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 510);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(214228608, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i2, (byte) 1);
        }
    }

    public static final void p(mm40 mm40Var, trl trlVar, fet fetVar, int i2) {
        int i3;
        trlVar.getClass();
        fetVar.g0(-1907727164);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(trlVar) ? 32 : 16;
        }
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (trlVar instanceof rrl) {
            fetVar.e0(-2092422332);
            rrl rrlVar = (rrl) trlVar;
            xrl xrlVar = rrlVar.d;
            if (xrlVar.equals(url.f36169a)) {
                fetVar.e0(-2092353543);
                q(mm40Var, rrlVar, fetVar, i3 & 126);
                fetVar.r(false);
            } else if (xrlVar.equals(vrl.f37904a)) {
                fetVar.e0(-2092088648);
                r(mm40Var, rrlVar, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (!(xrlVar instanceof wrl)) {
                    throw b1j.f(625239166, fetVar, false);
                }
                fetVar.e0(-2091817336);
                s(mm40Var, rrlVar, (wrl) xrlVar, fetVar, i3 & 126);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!trlVar.equals(srl.f32682a)) {
                throw b1j.f(625236649, fetVar, false);
            }
            fetVar.e0(-2091488612);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new orl(mm40Var, trlVar, i2, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, rrl rrlVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(467520436);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(rrlVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 2), "TOURNAMENT_STAGES_CELL_ROW");
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            boolean zF = fetVar2.f(background);
            Object objP = fetVar2.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 20, background);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE1 = o2e.e0(o7k0.s(jm40Var, 24.0f), "TOURNAMENT_STAGES_CELL_NUMBER");
            String strL = ttm0.L(3, rrlVar.f30990a);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarJ = g1t0.j();
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long j2 = qmk.r;
            v8q0.a(strL, mm40VarE1, textPrimary, gfk0.b(j2, qmk.s), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24576, 113648);
            fetVar.r(true);
            mm40 mm40VarE2 = o2e.e0(new x7z(1.0f, true), "TOURNAMENT_STAGES_CELL_TITLE");
            String str = rrlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(qmk.q, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar, i2, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    public static final void r(mm40 mm40Var, rrl rrlVar, fet fetVar, int i2) {
        int i3;
        rrl rrlVar2;
        yx7 yx7Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(731985481);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(rrlVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 2);
            yx7 yx7Var2 = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var2, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zfn zfnVar2 = m8m0.f21378a;
            long jM98getGreen0d7_KjU = ((StaticColors) fetVar2.k(zfnVar2)).m98getGreen0d7_KjU();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            boolean zF = fetVar2.f(jM98getGreen0d7_KjU);
            Object objP = fetVar2.P();
            if (zF) {
                yx7Var = yx7Var2;
            } else {
                yx7Var = yx7Var2;
                if (objP == ukd.f35823a) {
                }
                mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
                String strL = ttm0.L(3, rrlVar.f30990a);
                zfn zfnVar3 = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar3)).getClass();
                y9q0 y9q0VarJ = g1t0.j();
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU();
                long j2 = qmk.r;
                v8q0.a(strL, mm40VarS, jM123getWhite0d7_KjU, gfk0.b(j2, qmk.s), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24576, 113648);
                fetVar.r(true);
                mm40 mm40VarE2 = new x7z(1.0f, true).e(new ecu0(yx7Var));
                rrlVar2 = rrlVar;
                String str = rrlVar2.b;
                ((g1t0) fetVar.k(zfnVar3)).getClass();
                v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(qmk.q, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            objP = new nme((byte) 19, jM98getGreen0d7_KjU);
            fetVar2.o0(objP);
            mm40 mm40VarK2 = rq8.K(mm40VarN, (Function1) objP);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarK2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarS2 = o7k0.s(jm40Var, 24.0f);
            String strL2 = ttm0.L(3, rrlVar.f30990a);
            zfn zfnVar4 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar4)).getClass();
            y9q0 y9q0VarJ2 = g1t0.j();
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU();
            long j3 = qmk.r;
            v8q0.a(strL2, mm40VarS2, jM123getWhite0d7_KjU2, gfk0.b(j3, qmk.s), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarJ2, fetVar, 0, 24576, 113648);
            fetVar.r(true);
            mm40 mm40VarE3 = new x7z(1.0f, true).e(new ecu0(yx7Var));
            rrlVar2 = rrlVar;
            String str2 = rrlVar2.b;
            ((g1t0) fetVar.k(zfnVar4)).getClass();
            v8q0.a(str2, mm40VarE3, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(qmk.q, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            rrlVar2 = rrlVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i2, (byte) 7);
        }
    }

    public static final void s(mm40 mm40Var, rrl rrlVar, wrl wrlVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        rrl rrlVar2 = rrlVar;
        fetVar.g0(1317646246);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(rrlVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(wrlVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(piz.R(o7k0.e(mm40VarD, 60.0f), afn0.m(fetVar).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 22.0f);
            String strL = ttm0.L(3, rrlVar2.f30990a);
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarI = g1t0.i();
            long primary = afn0.m(fetVar).getPrimary();
            long j2 = qmk.q;
            int i4 = i3;
            v8q0.a(strL, mm40VarS, primary, gfk0.b(j2, qmk.s), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarI, fetVar, 0, 24576, 113648);
            long primary2 = afn0.m(fetVar).getPrimary();
            long background = afn0.m(fetVar).getBackground();
            n0q n0qVar = o7k0.c;
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                unm unmVar = new unm(tnm.b, primary2, primary2, background, 6.0f, 6.0f, wrlVar.f39649a, wrlVar.b, true, 512);
                fetVar.o0(unmVar);
                objP = unmVar;
            }
            snm.b(n0qVar, (unm) objP, fetVar, 6);
            fetVar.r(true);
            mm40 mm40VarE = new x7z(1.0f, true).e(new ecu0(yx7Var));
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            rrlVar2 = rrlVar;
            String str = rrlVar2.b;
            afn0.v(fetVar).getClass();
            v8q0.a(str, null, afn0.m(fetVar).getTextPrimary(), gfk0.b(j2, qmk.r), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.l(), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            String str2 = rrlVar2.c;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(1987477090);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1987014415);
                String str3 = rrlVar2.c;
                afn0.v(fetVar).getClass();
                v8q0.a(str3, null, afn0.m(fetVar).getSecondary(), gfk0.b(qmk.p, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qrl(mm40Var, rrlVar2, wrlVar, i2, (byte) 2);
        }
    }

    public static final void t(mm40 mm40Var, mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1954765300);
        int i3 = i2 | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            n0q n0qVar = o7k0.c;
            boolean zF = fetVar.f(background);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new r2a0((byte) 10, background);
                fetVar.o0(objP);
            }
            mm40 mm40VarS = S(rq8.K(n0qVar, (Function1) objP));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = P(s5x0.N(mm40VarS, 0.0f, 0.0f, 0.0f, 56.0f, 7));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            jcb.l(null, mdmVar2, false, null, fetVar2, i3 & 112, 13);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i2, (byte) 5);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-921339518);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 8);
        }
    }

    public static final void v(int i2, fet fetVar) {
        fetVar.g0(523607454);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            zdx.j(0, fetVar, s5x0.N(jm40.b, xfn.a(fetVar).e, 12.0f, xfn.a(fetVar).e, 0.0f, 8).e(o7k0.c));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i2, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0210  */
    /* JADX WARN: Code duplicated, block: B:40:0x0212  */
    /* JADX WARN: Code duplicated, block: B:46:0x0221  */
    /* JADX WARN: Code duplicated, block: B:49:0x0232  */
    /* JADX WARN: Code duplicated, block: B:50:0x0234  */
    /* JADX WARN: Code duplicated, block: B:54:0x023d  */
    public static final void w(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        boolean z;
        boolean z2;
        fet fetVar2;
        Iterator<E> it;
        int i3;
        boolean z3;
        Object objP;
        Function1 function3;
        boolean z4;
        Object objP2;
        fet fetVar3 = fetVar;
        fetVar3.g0(1616141956);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar3.i(function1) ? 256 : 128;
        }
        if (fetVar3.U(i4 & 1, (i4 & 147) != 146)) {
            boolean z5 = CollectionsKt.firstOrNull(a4xVar) instanceof j4n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar3).d, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            mm40 mm40VarM = s5x0.M(jm40Var, 8.0f, 8.0f, 8.0f, 12.0f);
            byte b2 = 3;
            if (z5) {
                fetVar3.e0(1308471626);
                mm40 mm40VarP = o7k0.p(mm40VarM, 64.0f, 18.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary20(), ljcVar), vbc.d0(null, fetVar3, 0, 1), fetVar3, false);
                z = false;
                z2 = true;
            } else {
                if (a4xVar.isEmpty()) {
                    fetVar3.e0(1308902588);
                    z = false;
                    z2 = true;
                    v8q0.a(rsm0.w(R.string.no_available_bets_hint, 0, fetVar3), s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 24.0f, 1), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 130040);
                    fetVar3 = fetVar;
                    fetVar3.r(false);
                } else {
                    jm40Var = jm40Var;
                    z = false;
                    fetVar3.e0(1309346415);
                    mm40 mm40VarD2 = o7k0.d(mm40VarM, 1.0f);
                    z2 = true;
                    v8q0.a(rsm0.w(R.string.polybet_event, 0, fetVar3), mm40VarD2, ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.e0(2120459760);
                it = a4xVar.iterator();
                while (it.hasNext()) {
                    k4n k4nVar = (k4n) it.next();
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    i3 = i4 & 896;
                    if (i3 == 256) {
                        z3 = z2;
                    } else {
                        z3 = z;
                    }
                    objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (!z3 || objP == cl5Var) {
                        function3 = function1;
                        objP = new rpa0(function3, (byte) 6);
                        fetVar2.o0(objP);
                    } else {
                        function3 = function1;
                    }
                    Function1 function4 = (Function1) objP;
                    if (i3 == 256) {
                        z4 = z2;
                    } else {
                        z4 = z;
                    }
                    objP2 = fetVar2.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new rpa0(function3, b2);
                        fetVar2.o0(objP2);
                    }
                    agc.t(mm40VarN, k4nVar, false, function4, (Function1) objP2, fetVar, 0, 4);
                    fetVar2 = fetVar;
                }
                function2 = function1;
                fetVar3 = fetVar2;
                fetVar3.r(z);
                fetVar3.r(z2);
                mm40Var2 = jm40Var;
            }
            fetVar2 = fetVar3;
            fetVar2.e0(2120459760);
            it = a4xVar.iterator();
            while (it.hasNext()) {
                k4n k4nVar2 = (k4n) it.next();
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                i3 = i4 & 896;
                if (i3 == 256) {
                    z3 = z2;
                } else {
                    z3 = z;
                }
                objP = fetVar2.P();
                cl5 cl5Var2 = ukd.f35823a;
                if (z3) {
                    function3 = function1;
                    objP = new rpa0(function3, (byte) 6);
                    fetVar2.o0(objP);
                } else {
                    function3 = function1;
                    objP = new rpa0(function3, (byte) 6);
                    fetVar2.o0(objP);
                }
                Function1 function5 = (Function1) objP;
                if (i3 == 256) {
                    z4 = z2;
                } else {
                    z4 = z;
                }
                objP2 = fetVar2.P();
                if (z4) {
                    objP2 = new rpa0(function3, b2);
                    fetVar2.o0(objP2);
                } else {
                    objP2 = new rpa0(function3, b2);
                    fetVar2.o0(objP2);
                }
                agc.t(mm40VarN2, k4nVar2, false, function5, (Function1) objP2, fetVar, 0, 4);
                fetVar2 = fetVar;
            }
            function2 = function1;
            fetVar3 = fetVar2;
            fetVar3.r(z);
            fetVar3.r(z2);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function2, i2, (byte) 10);
        }
    }

    public static final void x(mm40 mm40Var, imm immVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1991985232);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(immVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new yhl0(function1, (byte) 9);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new elk0(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z3 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new elk0(function1, (byte) 18);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z4 = i4 == 256;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new yhl0(function1, (byte) 10);
                fetVar.o0(objP4);
            }
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar, null, function0, null, function2, function3, null, (Function0) objP4, null, null, null, fetVar, i3 & 126, 0, 3732);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4q(mm40Var2, immVar, function1, i2, (byte) 1);
        }
    }

    public static final void y(int i2, fet fetVar, Function0 function0) {
        fetVar.g0(1141579946);
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zfn zfnVar = zaq0.b;
            hlm.c(mm40VarW2, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.news_catalog, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, ((i3 << 9) & 7168) | 6, 0, 4084);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wr4((byte) 9, i2, function0);
        }
    }

    public static final void z(mm40 mm40Var, w2d w2dVar, kr50 kr50Var, String str, Function1 function1, fet fetVar, int i2) {
        kr50Var.getClass();
        function1.getClass();
        fetVar.g0(1093426803);
        int i3 = i2 | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.g(kr50Var) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            v2n0.b(mm40Var, w2dVar, 0L, 0.0f, u1c.M(1497353192, new ajw(w2dVar, fqj0VarD0, kr50Var, function1, str), fetVar), u1c.M(-314327892, new hgs0(kr50Var, w2dVar, function1, str, fqj0VarD0, (byte) 9), fetVar), fetVar, 224326 | (i3 & 112), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) w2dVar, (Object) kr50Var, (Object) str, function1, i2, (byte) 12);
        }
    }
}
