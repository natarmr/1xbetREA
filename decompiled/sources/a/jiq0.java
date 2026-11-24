package a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jiq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f16588a = new ugd(-1518456969, false, new wgd(16));
    public static final ugd b = new ugd(1166787183, false, new zgd(19));
    public static final ugd c = new ugd(489074511, false, new bhd(6));
    public static final ugd d = new ugd(1174886262, false, new fhd(7));
    public static final ugd e = new ugd(917571977, false, new jhd(29));
    public static final ugd f = new ugd(-1913891676, false, new mhd(0));
    public static final ugd g = new ugd(-1651442213, false, new mhd(1));
    public static final ugd h = new ugd(-1613052078, false, new mhd(2));
    public static final ugd i = new ugd(670829952, false, new mhd(3));
    public static final ugd j = new ugd(783795474, false, new ihd(22));
    public static final ugd k = new ugd(1697221712, false, new mhd(4));
    public static final ugd l = new ugd(861578458, false, new lhd(27));
    public static final byte[] m = {48, 49, 53, 0};
    public static final byte[] n = {48, 49, 48, 0};
    public static final byte[] o = {48, 48, 57, 0};
    public static final byte[] p = {48, 48, 53, 0};
    public static final byte[] q = {48, 48, 49, 0};
    public static final byte[] r = {48, 48, 49, 0};
    public static final byte[] s = {48, 48, 50, 0};

    public static final void A(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1536749555);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hcr(function1, (byte) 11);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i2, (byte) 3);
        }
    }

    public static int A0(int i2, ojw0 ojw0Var, dlw0 dlw0Var) {
        return ojw0Var.b(dlw0Var) + (p4.i1(i2 << 3) << 1);
    }

    public static final void B(mm40 mm40Var, uzm uzmVar, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2;
        boolean z;
        Object obj;
        fet fetVar3 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar3.g0(-1409654792);
        if ((i2 & 6) == 0) {
            i3 = (fetVar3.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar3.g(uzmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar3.e(0) ? 256 : 128;
        }
        if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.o, (byte) 12)), gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            String str = uzmVar.f36542a;
            d280 d280Var = uzmVar.b;
            b2 = 0;
            v8q0.a(str, hne.i(1.0f, false, "FIRST_OPPONENTS_CONTAINER_TEXT"), ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, g1t0.m().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 109424);
            fet fetVar4 = fetVar;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40.b);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            if (d280Var != null) {
                fetVar4.e0(1389014306);
                boolean zG = fetVar4.g(d280Var);
                Object objP = fetVar4.P();
                cl5 cl5Var = ukd.f35823a;
                Object obj2 = objP;
                if (zG || objP == cl5Var) {
                    u6n u6nVar = new u6n(d4d.SECONDARY60, w6n.h, d280Var);
                    fetVar4.o0(u6nVar);
                    obj2 = u6nVar;
                }
                u6n u6nVar2 = (u6n) obj2;
                boolean zG2 = fetVar4.g(u6nVar2);
                Object objP2 = fetVar4.P();
                if (zG2 || objP2 == cl5Var) {
                    z = true;
                    d1n d1nVar = new d1n(u6nVar2, (byte) 1);
                    fetVar4.o0(d1nVar);
                    obj = d1nVar;
                } else {
                    z = true;
                    obj = objP2;
                }
                kkb.p(z ? 1 : 0, fetVar4, null, (Function0) obj);
                fetVar4.r(false);
            } else {
                z = true;
                fetVar4.e0(1389442912);
                fetVar4.r(false);
            }
            fetVar4.e0(1389886336);
            fetVar4.r(false);
            if (d280Var != null) {
                uso0 uso0Var2 = uso0.f36223a;
            }
            fetVar4.e0(1390294048);
            fetVar4.r(false);
            fetVar4.r(z);
            fetVar4.r(z);
            fetVar2 = fetVar4;
        } else {
            b2 = 0;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzm(mm40Var, uzmVar, i2, b2);
        }
    }

    public static void B0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.V0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            i4++;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.P0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static final void C(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1394424229);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ((wbs) l7m0Var.getValue()).getClass();
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_events, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarB = ((wbs) l7m0Var.getValue()).b();
            j9m0 j9m0VarD = ((wbs) l7m0Var.getValue()).d();
            boolean zA = ((wbs) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hcr(function1, (byte) 10);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0VarB, j9m0VarD, zA, (Function0) objP, null, null, u1c.M(1639377331, new xs4(l7m0Var, function1, (byte) 24), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, (byte) 17);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void C0(Object obj, Object obj2) {
        jkw0 jkw0Var = (jkw0) obj;
        klw0 klw0Var = jkw0Var.zzb;
        klw0 klw0Var2 = ((jkw0) obj2).zzb;
        klw0 klw0Var3 = klw0.f;
        if (!klw0Var3.equals(klw0Var2)) {
            if (klw0Var3.equals(klw0Var)) {
                int i2 = klw0Var.f18511a + klw0Var2.f18511a;
                int[] iArrCopyOf = Arrays.copyOf(klw0Var.b, i2);
                System.arraycopy(klw0Var2.b, 0, iArrCopyOf, klw0Var.f18511a, klw0Var2.f18511a);
                Object[] objArrCopyOf = Arrays.copyOf(klw0Var.c, i2);
                System.arraycopy(klw0Var2.c, 0, objArrCopyOf, klw0Var.f18511a, klw0Var2.f18511a);
                klw0Var = new klw0(i2, iArrCopyOf, objArrCopyOf, true);
            } else {
                klw0Var.getClass();
                if (!klw0Var2.equals(klw0Var3)) {
                    if (!klw0Var.e) {
                        e9d0.b();
                        return;
                    }
                    int i3 = klw0Var.f18511a + klw0Var2.f18511a;
                    klw0Var.b(i3);
                    System.arraycopy(klw0Var2.b, 0, klw0Var.b, klw0Var.f18511a, klw0Var2.f18511a);
                    System.arraycopy(klw0Var2.c, 0, klw0Var.c, klw0Var.f18511a, klw0Var2.f18511a);
                    klw0Var.f18511a = i3;
                }
            }
        }
        jkw0Var.zzb = klw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void D(mm40 mm40Var, rx30 rx30Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        mm40 mm40Var2;
        ?? r3;
        fet fetVar3;
        long background;
        fet fetVar4 = fetVar;
        long j2 = rx30Var.f;
        fetVar4.g0(1386045169);
        if ((i2 & 6) == 0) {
            i3 = (fetVar4.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(rx30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar4.h(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar4.i(function0) ? 2048 : 1024;
        }
        if (fetVar4.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar4.e0(549553183);
            rc5 rc5Var = rx30Var.g;
            ene eneVar = rx30Var.h;
            if (rc5Var instanceof pc5) {
                fetVar4.e0(-1299176337);
                y3d y3dVar = ((pc5) rc5Var).f26741a;
                if (y3dVar == null) {
                    fetVar4.e0(1205020609);
                    background = ((ThemeColors) fetVar4.k(zaq0.b)).getBackground();
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(1205018997);
                    fetVar4.r(false);
                    background = y3dVar.f41946a;
                }
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40Var, background, new ugg0(eneVar, eneVar, eneVar, eneVar));
                fetVar4.r(false);
                mm40Var2 = mm40VarQ;
            } else {
                fetVar4.e0(1205025083);
                fetVar4.r(false);
                mm40Var2 = mm40Var;
            }
            fetVar4.r(false);
            boolean z = function0 != null;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP = fetVar4.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new b1i(function0, (byte) 0);
                fetVar4.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40Var2, null, null, z, null, (Function0) objP, 24), "DS_CELL_ICON_BOX");
            boolean z3 = (i3 & 112) == 32;
            Object objP2 = fetVar4.P();
            if (z3 || objP2 == obj) {
                objP2 = new hfg(rx30Var, (byte) 26);
                fetVar4.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarA);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            qc5 qc5Var = rc5Var instanceof qc5 ? (qc5) rc5Var : null;
            jm40 jm40Var = jm40.b;
            if (qc5Var != null) {
                fetVar4.e0(-454633620);
                y3d y3dVar2 = ((qc5) rc5Var).c;
                i4d i4dVar = y3dVar2 != null ? new i4d(y3dVar2.f41946a) : null;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                ugg0 ugg0Var2 = vgg0.f37379a;
                mm40 mm40VarJ = lgb.J(mm40VarN, new ugg0(eneVar, eneVar, eneVar, eneVar));
                Object objA = qc5Var.b.a();
                Integer num = qc5Var.f28470a;
                int iIntValue = num != null ? num.intValue() : 0;
                y3d y3dVar3 = qc5Var.c;
                pz40 pz40Var = s6t0.f31722a;
                if (y3dVar3 == null ? false : h2t0.a(y3dVar3.f41946a, StaticColors.INSTANCE.m121getTransparent0d7_KjU())) {
                    y3dVar3 = null;
                }
                fet fetVar5 = fetVar;
                r3 = 0;
                F(mm40VarJ, objA, iIntValue, i4dVar, null, y3dVar3, gqw0.h1, fetVar5, 1576960, 16);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                r3 = 0;
                fetVar4.e0(-453896533);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            Object objA2 = rx30Var.f31245a.a();
            int i4 = rx30Var.d;
            long j3 = rx30Var.b;
            y3d y3dVar4 = new y3d(j3);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            y3d y3dVar5 = (h2t0.a(j3, staticColors.m121getTransparent0d7_KjU()) || !(rc5Var instanceof pc5)) ? null : y3dVar4;
            long j4 = rx30Var.e;
            F(mm40VarN2, objA2, i4, null, y3dVar5, !h2t0.a(j4, staticColors.m121getTransparent0d7_KjU()) ? new y3d(j4) : null, gqw0.A, fetVar3, 1572864, 8);
            if (h2t0.a(j2, staticColors.m121getTransparent0d7_KjU())) {
                fetVar3.e0(-453060277);
                fetVar3.r(r3);
            } else {
                fetVar3.e0(-453216920);
                G(6, j2, fetVar3, o7k0.c);
                fetVar3.r(r3);
            }
            miz mizVar = rx30Var.c;
            if (mizVar instanceof kiz) {
                fetVar3.e0(-452960581);
                zx7 zx7Var = gqw0.i;
                zcl zclVar2 = qmk.f28987a;
                c(jr8.f16991a.b(jm40Var, zx7Var), (kiz) mizVar, -2.0f, fetVar3, r3);
                fetVar3.r(r3);
            } else {
                fetVar3.e0(-452738807);
                fetVar3.r(r3);
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, rx30Var, function0, i2, (byte) 24);
        }
    }

    public static boolean D0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void E(mm40 mm40Var, qx30 qx30Var, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        fetVar.g0(2060943313);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(qx30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = function0 != null;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 29);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40Var2, null, null, z, null, (Function0) objP, 24), "DS_CELL_ICON_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            float f2 = qx30Var.f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, f2);
            Object objA = qx30Var.f29462a.a();
            long j2 = qx30Var.e;
            y3d y3dVar = new y3d(j2);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            if (h2t0.a(j2, staticColors.m121getTransparent0d7_KjU())) {
                y3dVar = null;
            }
            int i4 = qx30Var.d;
            long j3 = qx30Var.b;
            F(mm40VarN, objA, i4, null, !h2t0.a(j3, staticColors.m121getTransparent0d7_KjU()) ? new y3d(j3) : null, y3dVar, gqw0.A, fetVar, 1572864, 8);
            miz mizVar = qx30Var.c;
            if (mizVar instanceof kiz) {
                fetVar.e0(-1029852549);
                zx7 zx7Var = gqw0.i;
                zcl zclVar = qmk.f28987a;
                c(jr8.f16991a.b(jm40Var, zx7Var), (kiz) mizVar, -8.0f, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1029630775);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, qx30Var, function0, i2, (byte) 23);
        }
    }

    public static int E0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE1 += p4.e1(((Integer) list.get(i2)).intValue());
        }
        return iE1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(final mm40 mm40Var, final Object obj, final int i2, pm80 pm80Var, y3d y3dVar, final y3d y3dVar2, final qge qgeVar, fet fetVar, final int i3, final int i4) {
        int i5;
        y3d y3dVar3;
        int i6;
        final y3d y3dVar4;
        final byte b2;
        final pm80 i4dVar;
        boolean z;
        fet fetVar2;
        fet fetVar3;
        pm80 pm80Var2 = pm80Var;
        fet fetVar4 = fetVar;
        fetVar4.g0(2086940183);
        int i7 = (fetVar4.g(mm40Var) ? 4 : 2) | i3 | (fetVar4.i(obj) ? 32 : 16) | (fetVar4.e(i2) ? 256 : 128);
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 = i7 | 3072;
        } else {
            i5 = i7 | ((i3 & 4096) == 0 ? fetVar4.g(pm80Var2) : fetVar4.i(pm80Var2) ? 2048 : 1024);
        }
        int i9 = i4 & 16;
        if (i9 != 0) {
            i6 = i5 | 24576;
            y3dVar3 = y3dVar;
        } else {
            y3dVar3 = y3dVar;
            i6 = i5 | (fetVar4.g(y3dVar3) ? 16384 : 8192);
        }
        int i10 = i6 | (fetVar4.g(y3dVar2) ? 131072 : 65536);
        final byte b3 = 1;
        if (fetVar4.U(i10 & 1, (599187 & i10) != 599186)) {
            if (i8 != 0) {
                pm80Var2 = null;
            }
            y3dVar4 = i9 != 0 ? null : y3dVar3;
            if (pm80Var2 != null) {
                fetVar4.e0(-200199863);
                fetVar4.r(false);
                i4dVar = pm80Var2;
                b2 = 0;
                fetVar3 = fetVar4;
            } else if (i2 != 0) {
                fetVar4.e0(-1911172376);
                if (y3dVar2 != null) {
                    fetVar4.e0(-1911133409);
                    i4dVar = ju70.T(a8k0.F(i2, (i10 >> 6) & 14, fetVar4), new m78(y3dVar2.f41946a, 5), null, 10);
                    fet fetVar5 = fetVar;
                    z = false;
                    fetVar5.r(false);
                    fetVar2 = fetVar5;
                } else {
                    z = false;
                    fetVar4.e0(-1910929553);
                    i4dVar = a8k0.F(i2, (i10 >> 6) & 14, fetVar4);
                    fetVar4.r(false);
                    fetVar2 = fetVar4;
                }
                fetVar2.r(z);
                b2 = z;
                fetVar3 = fetVar2;
            } else {
                b2 = 0;
                fetVar4.e0(-200187434);
                fetVar4.r(false);
                i4dVar = new i4d(y3d.f);
                fetVar3 = fetVar4;
            }
            ugd ugdVarM = u1c.M(1333399710, new ydr() { // from class: a.c1i
                @Override // a.ydr
                public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (b2) {
                        case 0:
                            pbe0 pbe0Var = (pbe0) obj2;
                            fet fetVar6 = (fet) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            pbe0Var.getClass();
                            ((jz3) obj3).getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar6.g(pbe0Var) ? 4 : 2;
                            }
                            if (fetVar6.U(iIntValue & 1, (iIntValue & 131) != 130)) {
                                u4n0.e(pbe0Var, null, i4dVar, null, qgeVar, 0.0f, null, false, fetVar6, (iIntValue & 14) | 512, 237);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            pbe0 pbe0Var2 = (pbe0) obj2;
                            fet fetVar7 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            pbe0Var2.getClass();
                            ((iz3) obj3).getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar7.g(pbe0Var2) ? 4 : 2;
                            }
                            if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                                u4n0.e(pbe0Var2, null, i4dVar, null, qgeVar, 0.0f, null, false, fetVar7, (iIntValue2 & 14) | 512, 237);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar3);
            ugd ugdVarM2 = u1c.M(1505079032, new ec30(y3dVar4, qgeVar, (byte) 21), fetVar3);
            ugd ugdVarM3 = u1c.M(-1974698412, new ydr() { // from class: a.c1i
                @Override // a.ydr
                public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (b3) {
                        case 0:
                            pbe0 pbe0Var = (pbe0) obj2;
                            fet fetVar6 = (fet) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            pbe0Var.getClass();
                            ((jz3) obj3).getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar6.g(pbe0Var) ? 4 : 2;
                            }
                            if (fetVar6.U(iIntValue & 1, (iIntValue & 131) != 130)) {
                                u4n0.e(pbe0Var, null, i4dVar, null, qgeVar, 0.0f, null, false, fetVar6, (iIntValue & 14) | 512, 237);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            pbe0 pbe0Var2 = (pbe0) obj2;
                            fet fetVar7 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            pbe0Var2.getClass();
                            ((iz3) obj3).getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar7.g(pbe0Var2) ? 4 : 2;
                            }
                            if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                                u4n0.e(pbe0Var2, null, i4dVar, null, qgeVar, 0.0f, null, false, fetVar7, (iIntValue2 & 14) | 512, 237);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar3);
            int i11 = ((i10 << 6) & 896) | ((i10 >> 3) & 14) | 1794096;
            zx7 zx7Var = gqw0.e;
            qz3 qz3Var = new qz3(obj, (fz3) fetVar3.k(dr00.f6538a), o5k0.a((Context) fetVar3.k(dy2.b)));
            int i12 = iut0.b;
            u4n0.d(qz3Var, mm40Var, mz3.v, null, zx7Var, qgeVar, new ugd(-1106738291, true, new sqc0((Object) ugdVarM, (Object) ugdVarM2, (Object) ugdVarM3, (byte) 15)), fetVar3, (((((i11 & 126) | ((i11 << 3) & 7168)) | 14352384) >> 3) & 896) | 1572912, 0);
        } else {
            fetVar.X();
            y3dVar4 = y3dVar3;
        }
        final pm80 pm80Var3 = pm80Var2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.d1i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jiq0.F(mm40Var, obj, i2, pm80Var3, y3dVar4, y3dVar2, qgeVar, (fet) obj2, x8x.L(i3 | 1), i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static void F0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.S0(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            i4 += 8;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.W0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static final void G(int i2, long j2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1065061978);
        int i3 = (fetVar.f(j2) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nme((byte) 9, j2);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j2, i2, (byte) 3);
        }
    }

    public static int G0(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p4.i1(i2 << 3) + 4) * size;
    }

    public static final void H(mm40 mm40Var, pz40 pz40Var, final Function0 function0, final Function0 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1988284794);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(1.0f);
                fetVar2.o0(objP3);
            }
            t33 t33Var = (t33) objP3;
            final sw7 sw7Var = (sw7) pz40Var.getValue();
            Unit unit = Unit.f46060a;
            boolean zI = ((i3 & 112) == 32) | fetVar2.i(vneVar) | fetVar2.i(t33Var);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new ow7(pz40Var, vneVar, t33Var, pz40Var2, null, (byte) 0);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, unit, (Function2) objP4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = epv0.N(o7k0.e(mm40Var, 32.0f), sw7Var.d ? 0.2f : 1.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP5 = fetVar2.P();
            if (zI2 || objP5 == cl5Var) {
                objP5 = new m53(t33Var, (byte) 5);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN2, (Function1) objP5);
            wul wulVar = new wul(iul.e, oe9.d, new se9(R.drawable.ic_glyph_plus_small), true, false, false);
            boolean zG = ((i3 & 896) == 256) | fetVar2.g(sw7Var);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                final byte b2 = 0;
                objP6 = new Function0() { // from class: a.ew7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        Function0 function2 = function0;
                        sw7 sw7Var2 = sw7Var;
                        switch (b3) {
                            case 0:
                                if (!sw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                            default:
                                if (!sw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP6);
            }
            qzb.n(mm40VarT, wulVar, (Function0) objP6, fetVar, 0, 0);
            fetVar2 = fetVar;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            boolean zG2 = ((i3 & 7168) == 2048) | fetVar2.g(sw7Var);
            Object objP7 = fetVar2.P();
            if (zG2 || objP7 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP7 = new Function0() { // from class: a.ew7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = c2;
                        Function0 function2 = function1;
                        sw7 sw7Var2 = sw7Var;
                        switch (b3) {
                            case 0:
                                if (!sw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                            default:
                                if (!sw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP7);
            } else {
                z = true;
            }
            mm40 mm40VarW = y860.W(mm40VarC, null, null, false, null, (Function0) objP7, 28);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1200618242, new m87(sw7Var, (byte) 8), fetVar2), fetVar2, 56);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o2e.e0(o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 16.0f), "ICON_ALL_ACCOUNTS"), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw7(mm40Var, pz40Var, function0, function1, i2, (byte) 0);
        }
    }

    public static void H0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.a1(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iE1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iE1 += p4.e1(((Integer) list.get(i4)).intValue());
        }
        p4Var.g1(iE1);
        while (i3 < list.size()) {
            p4Var.Z0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static final void I(final mm40 mm40Var, final int i2, final a4x a4xVar, final float f2, final float f3, final Function1 function1, final Function1 function2, fet fetVar, final int i3) {
        mm40 mm40Var2;
        a4x a4xVar2;
        yfe0 yfe0VarU;
        Function2 function3;
        a4xVar.getClass();
        fetVar.g0(-1579252496);
        int i4 = i3 | (fetVar.e(i2) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.d(f2) ? 16384 : 8192) | (fetVar.d(f3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288) | (fetVar.i(function2) ? 8388608 : 4194304);
        if (fetVar.U(i4 & 1, (4793491 & i4) != 4793490)) {
            fetVar.Z();
            if ((i3 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            ua00 ua00Var = (ua00) CollectionsKt.W(i2, a4xVar);
            if (ua00Var == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function3 = new Function2(mm40Var, i2, a4xVar, f2, f3, function1, function2, i3, b2) { // from class: a.ea00

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f7447a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ a4x d;
                    public final /* synthetic */ float e;
                    public final /* synthetic */ float f;
                    public final /* synthetic */ Function1 g;
                    public final /* synthetic */ Function1 h;

                    {
                        this.f7447a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f7447a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(3079);
                                jiq0.I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(3079);
                                jiq0.I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                a4xVar2 = a4xVar;
                mm40Var2 = mm40Var;
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                boolean z = ((i4 & 896) == 256) | ((((i4 & 57344) ^ 24576) > 16384 && fetVar.d(f2)) || (i4 & 24576) == 16384) | ((((i4 & 458752) ^ 196608) > 131072 && fetVar.d(f3)) || (i4 & 196608) == 131072);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new fa00(a4xVar2, f2, f3);
                    fetVar.o0(objP);
                }
                tj30 tj30Var = (tj30) objP;
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
                jpm0.o(fetVar, tj30Var, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                int i5 = i4 >> 3;
                bkb.d(mrv.k0(jm40.b, "COMPACT_ID").e(o7k0.c), ua00Var, f2, f3, function1, function2, fetVar, (57344 & i5) | (i5 & 7168) | 390 | (i5 & 458752) | (i5 & 3670016));
                fetVar.r(true);
            }
            yfe0VarU.d = function3;
        }
        mm40Var2 = mm40Var;
        a4xVar2 = a4xVar;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final a4x a4xVar3 = a4xVar2;
            final mm40 mm40Var3 = mm40Var2;
            function3 = new Function2(mm40Var3, i2, a4xVar3, f2, f3, function1, function2, i3, b3) { // from class: a.ea00

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f7447a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ a4x d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;

                {
                    this.f7447a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f7447a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(3079);
                            jiq0.I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(3079);
                            jiq0.I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static int I0(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p4.i1(i2 << 3) + 8) * size;
    }

    public static final void J(int i2, fet fetVar) {
        fetVar.g0(-1556161777);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar, 6, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(mm40VarD, 192.0f), 16.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarJ), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.s(jm40Var, 152.0f), 12.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13)), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.J(n0qVar, 16.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4s(i2);
        }
    }

    public static void J0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.R0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            i4 += 4;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.Q0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static final void K(gy30 gy30Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        float f2;
        fetVar.g0(1219494728);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(gy30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(!(gy30Var.b instanceof px30));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            tx30 tx30Var = gy30Var.b;
            if (tx30Var instanceof sx30) {
                fetVar.e0(-1160566264);
                ugdVar.F(tx30Var, fetVar, Integer.valueOf(i3 & 112));
                fetVar.r(false);
            } else {
                fetVar.e0(-1160500296);
                fetVar.r(false);
            }
            if (zBooleanValue) {
                zcl zclVar = qmk.f28987a;
                f2 = 0.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 16.0f;
            }
            ugdVar2.j(s5x0.N(jm40.b, f2, 0.0f, 16.0f, 0.0f, 10), gy30Var.f12106a, fetVar, Integer.valueOf(i3 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(gy30Var, ugdVar, ugdVar2, i2, (byte) 25);
        }
    }

    public static int K0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE1 += p4.e1(((Integer) list.get(i2)).intValue());
        }
        return iE1;
    }

    public static final void L(mm40 mm40Var, wx30 wx30Var, fet fetVar, int i2) {
        int i3;
        boolean z;
        boolean z2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1392239507);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(wx30Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            String title = wx30Var.getTitle();
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long jB = wx30Var.b();
            String subTitle = wx30Var.getSubTitle();
            int i4 = (subTitle == null || subTitle.length() == 0) ? 2 : 1;
            jm40 jm40Var2 = jm40.b;
            v8q0.a(title, o2e.e0(jm40Var2, "MENU_CELL_TITLE"), jB, null, 0L, null, null, null, 0L, null, 0L, 2, false, i4, 0, null, y9q0VarM, fetVar, 48, 384, 110584);
            fetVar2 = fetVar;
            String subTitle2 = wx30Var.getSubTitle();
            if (subTitle2 == null || subTitle2.length() == 0) {
                z = true;
                fetVar2.e0(349609433);
                fetVar2.r(false);
            } else {
                fetVar2.e0(348574436);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var2);
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
                if ((wx30Var instanceof vx30 ? (vx30) wx30Var : null) == null) {
                    fetVar2.e0(-1879194841);
                    z2 = false;
                    fetVar2.r(false);
                    jm40Var = jm40Var2;
                } else {
                    z2 = false;
                    fetVar2.e0(-1879194840);
                    jm40Var = jm40Var2;
                    k7x.b(((vx30) wx30Var).e, null, o7k0.n(jm40Var2, 14.0f), a8k0.F(R.drawable.ic_status_green_check_circle, 0, fetVar2), a8k0.F(R.drawable.ic_status_green_check_circle, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
                    fetVar2.r(false);
                }
                String subTitle3 = wx30Var.getSubTitle();
                if (subTitle3 == null) {
                    subTitle3 = "";
                }
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                v8q0.a(subTitle3, o2e.e0(jm40Var, "MENU_CELL_SUBTITLE"), wx30Var.c(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
                fetVar2 = fetVar;
                z = true;
                fetVar2.r(true);
                fetVar2.r(z2);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, wx30Var, i2, (byte) 22);
        }
    }

    public static void L0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.S0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            i4 += 8;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.W0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static final void M(mm40 mm40Var, sx30 sx30Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(187955319);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(true) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(sx30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (sx30Var instanceof qx30) {
            fetVar.e0(-1260204690);
            E(mm40Var, (qx30) sx30Var, function0, fetVar, (i3 & 7168) | (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896));
            fetVar.r(false);
        } else {
            if (!(sx30Var instanceof rx30)) {
                throw b1j.f(236441074, fetVar, false);
            }
            fetVar.e0(-1259934742);
            D(mm40Var, (rx30) sx30Var, function0, fetVar, (i3 & 7168) | (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, sx30Var, function0, i2, (byte) 22);
        }
    }

    public static int M0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE1 += p4.e1(((Long) list.get(i2)).longValue());
        }
        return iE1;
    }

    public static final void N(l7m0 l7m0Var, final Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-986158006);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            final vu60 vu60Var = (vu60) l7m0Var.getValue();
            if (vu60Var != null) {
                if (vu60Var instanceof uu60) {
                    fetVar.e0(-1056631384);
                    uu60 uu60Var = (uu60) vu60Var;
                    t(uu60Var.f36285a, uu60Var.b, function1, cjx.k, fetVar, ((i3 << 3) & 896) | 3072);
                    fetVar.r(false);
                } else if (vu60Var instanceof tu60) {
                    fetVar.e0(-1056314750);
                    tu60 tu60Var = (tu60) vu60Var;
                    t(tu60Var.f34536a, tu60Var.b, function1, u1c.M(637562547, new xdr() { // from class: a.du60
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            byte b4 = b3;
                            Function1 function2 = function1;
                            vu60 vu60Var2 = vu60Var;
                            ir8 ir8Var = (ir8) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (b4) {
                                case 0:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        jiq0.p((tu60) vu60Var2, function2, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        jiq0.n((su60) vu60Var2, function2, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, ((i3 << 3) & 896) | 3072);
                    fetVar.r(false);
                } else if (vu60Var instanceof su60) {
                    fetVar.e0(-1055959769);
                    su60 su60Var = (su60) vu60Var;
                    t(su60Var.f32808a, su60Var.b, function1, u1c.M(809976628, new xdr() { // from class: a.du60
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            byte b4 = b2;
                            Function1 function2 = function1;
                            vu60 vu60Var2 = vu60Var;
                            ir8 ir8Var = (ir8) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (b4) {
                                case 0:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        jiq0.p((tu60) vu60Var2, function2, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        jiq0.n((su60) vu60Var2, function2, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, ((i3 << 3) & 896) | 3072);
                    fetVar.r(false);
                }
            }
            throw b1j.f(1489933943, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 26);
        }
    }

    public static void N0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.R0(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            i4 += 4;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.Q0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static final void O(mm40 mm40Var, uzm uzmVar, uzm uzmVar2, mpm mpmVar, boolean z, fet fetVar, int i2) {
        mm40 mm40Var2;
        uso0 uso0Var = uso0.f36223a;
        fetVar.g0(-206432796);
        int i3 = i2 | 6 | (fetVar.g(uzmVar) ? 32 : 16) | (fetVar.g(uzmVar2) ? 256 : 128) | (fetVar.g(mpmVar) ? 2048 : 1024) | (fetVar.e(0) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i4 = (i3 >> 6) & 896;
            B(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), uzmVar, fetVar, (i3 & 112) | i4);
            n4c.l(null, mpmVar, z, fetVar, 1);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            X(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), uzmVar2, fetVar, ((i3 >> 3) & 112) | i4);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, uzmVar, uzmVar2, mpmVar, z, i2);
        }
    }

    public static int O0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iI1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iI1 += p4.i1(p4.l1(((Integer) list.get(i2)).intValue()));
        }
        return iI1;
    }

    public static final void P(mm40 mm40Var, pz40 pz40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(249581195);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 32.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
            Q(pz40Var, function0, fetVar, (i3 & 896) | (i3 & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dw7(mm40Var, pz40Var, function0, i2, (byte) 1);
        }
    }

    public static void P0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.a1(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iE1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iE1 += p4.e1(((Integer) list.get(i4)).intValue());
        }
        p4Var.g1(iE1);
        while (i3 < list.size()) {
            p4Var.Z0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x017a  */
    public static final void Q(pz40 pz40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        String strA;
        String str;
        androidx.compose.runtime.d dVar;
        long textPrimary;
        long secondary;
        Function0 function1 = function0;
        fetVar.g0(1810177140);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(zhg0.f44392a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.runtime.d dVar2 = bmd.n;
            Object objK = fetVar.k(dVar2);
            Object obj = k6z.f17794a;
            boolean z = objK == obj;
            if ((pz40Var.getValue() instanceof k30) || (pz40Var.getValue() instanceof b30)) {
                strA = ((w30) pz40Var.getValue()).a();
            } else {
                strA = z ? ohs0.n(((w30) pz40Var.getValue()).a(), ": ") : kng0.k(" :", ((w30) pz40Var.getValue()).a());
            }
            String str2 = strA;
            w30 w30Var = (w30) pz40Var.getValue();
            String str3 = "";
            if (w30Var == null) {
                str = "";
            } else if (w30Var instanceof q30) {
                str = ((q30) w30Var).c;
            } else if (w30Var instanceof n30) {
                str = ((n30) w30Var).c;
            } else if (w30Var instanceof t30) {
                str = ((t30) w30Var).c;
            } else {
                str = "";
            }
            w30 w30Var2 = (w30) pz40Var.getValue();
            if (w30Var2 != null) {
                if (w30Var2 instanceof q30) {
                    str3 = ((q30) w30Var2).b;
                } else if (w30Var2 instanceof n30) {
                    str3 = ((n30) w30Var2).b;
                } else if (w30Var2 instanceof t30) {
                    str3 = ((t30) w30Var2).b;
                }
            }
            w30 w30Var3 = (w30) pz40Var.getValue();
            if (w30Var3 == null) {
                fetVar.e0(-1814007936);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getTextPrimary();
                fetVar.r(false);
            } else if ((w30Var3 instanceof b30) || (w30Var3 instanceof t30)) {
                fetVar.e0(-1814011682);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            } else if (w30Var3 instanceof e30) {
                fetVar.e0(-1814009408);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getSecondary20();
                fetVar.r(false);
            } else {
                fetVar.e0(-1814007936);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getTextPrimary();
                fetVar.r(false);
            }
            w30 w30Var4 = (w30) pz40Var.getValue();
            if (w30Var4 == null) {
                fetVar.e0(-852852955);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            } else if (w30Var4 instanceof q30) {
                fetVar.e0(-852856761);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary40();
                fetVar.r(false);
            } else if (w30Var4 instanceof e30) {
                fetVar.e0(-852854425);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary20();
                fetVar.r(false);
            } else {
                fetVar.e0(-852852955);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            }
            w30 w30Var5 = (w30) pz40Var.getValue();
            boolean z2 = w30Var5 != null && ((w30Var5 instanceof b30) || (w30Var5 instanceof t30));
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            boolean z3 = (pz40Var.getValue() instanceof k30) || (pz40Var.getValue() instanceof n30);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = fetVar.h(z2) | fetVar.i(t33Var);
            boolean z4 = z;
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj2) {
                objP2 = new pw7((byte) 0, t33Var, null, z2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            function1 = function0;
            boolean z5 = z3;
            obc.d(dVar2.a(obj), u1c.M(776548660, new hw7(z5, function1, z4, str3, str, t33Var, secondary, str2, textPrimary, (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iw7(pz40Var, function1, i2, (byte) 0);
        }
    }

    public static int Q0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE1 += p4.e1(p4.j1(((Long) list.get(i2)).longValue()));
        }
        return iE1;
    }

    public static final void R(yx30 yx30Var, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1177688724);
        int i3 = (fetVar.g(yx30Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.p(jm40Var, 36.0f, 48.0f), 0.0f, 12.0f, 12.0f, 12.0f, 1);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), "DS_MENU_CELL_RIGHT_SIDE");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar2 = fetVar;
            dww.c(a8k0.F(yx30Var.f43403a ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small, 0, fetVar), "", o2e.e0(o7k0.n(jm40Var, 14.0f), "DS_ACCORDION_CHEVRON"), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(yx30Var, i2, (byte) 15);
        }
    }

    public static void R0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.b1(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iE1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iE1 += p4.e1(((Long) list.get(i4)).longValue());
        }
        p4Var.g1(iE1);
        while (i3 < list.size()) {
            p4Var.c1(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void S(mm40 mm40Var, zx30 zx30Var, fet fetVar, int i2) {
        boolean z;
        l78 l78Var;
        mm40 mm40VarT;
        PorterDuff.Mode mode;
        l78 l78Var2;
        int i3;
        o0x o0xVar = zx30Var.b;
        fetVar.g0(478535027);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(zx30Var) ? 32 : 16);
        if (!fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            fetVar.X();
        } else if (ycl.a(bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a()), 380.0f) > 0 || !zx30Var.f45140a) {
            fetVar.e0(1040832837);
            bzw bzwVarD = o0xVar.d();
            if (bzwVarD != null) {
                int i5 = 17;
                if (Build.VERSION.SDK_INT >= 29) {
                    switch (bzwVarD.ordinal()) {
                        case 0:
                            i3 = 0;
                            z = true;
                            break;
                        case 1:
                            i3 = 1;
                            z = true;
                            break;
                        case 2:
                            i3 = 2;
                            z = true;
                            break;
                        case 3:
                            i3 = 3;
                            z = true;
                            break;
                        case 4:
                            i3 = 4;
                            z = true;
                            break;
                        case 5:
                            i3 = 5;
                            z = true;
                            break;
                        case 6:
                            i3 = 6;
                            z = true;
                            break;
                        case 7:
                            i3 = 7;
                            z = true;
                            break;
                        case 8:
                            i3 = 8;
                            z = true;
                            break;
                        case 9:
                            i3 = 9;
                            z = true;
                            break;
                        case 10:
                            i3 = 10;
                            z = true;
                            break;
                        case 11:
                            i3 = 11;
                            z = true;
                            break;
                        case 12:
                            i3 = 12;
                            z = true;
                            break;
                        case 13:
                            i3 = 13;
                            z = true;
                            break;
                        case 14:
                            i3 = 14;
                            z = true;
                            break;
                        case 15:
                            i3 = 15;
                            z = true;
                            break;
                        case 16:
                            i3 = 16;
                            z = true;
                            break;
                        case 17:
                            i3 = i5;
                            z = true;
                            break;
                        case 18:
                            i3 = 18;
                            z = true;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            i3 = 19;
                            z = true;
                            break;
                        case 20:
                            i5 = 20;
                            i3 = i5;
                            z = true;
                            break;
                        case 21:
                            i5 = 21;
                            i3 = i5;
                            z = true;
                            break;
                        case 22:
                            i5 = 22;
                            i3 = i5;
                            z = true;
                            break;
                        case 23:
                            i5 = 23;
                            i3 = i5;
                            z = true;
                            break;
                        case 24:
                            i5 = 24;
                            i3 = i5;
                            z = true;
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            i5 = 25;
                            i3 = i5;
                            z = true;
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            i5 = 26;
                            i3 = i5;
                            z = true;
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            i5 = 27;
                            i3 = i5;
                            z = true;
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            i5 = 28;
                            i3 = i5;
                            z = true;
                            break;
                        default:
                            t9f.b();
                            break;
                    }
                }
                switch (bzwVarD.ordinal()) {
                    case 0:
                        mode = PorterDuff.Mode.CLEAR;
                        break;
                    case 1:
                        mode = PorterDuff.Mode.SRC;
                        break;
                    case 2:
                        mode = PorterDuff.Mode.DST;
                        break;
                    case 3:
                        mode = PorterDuff.Mode.SRC_OVER;
                        break;
                    case 4:
                        mode = PorterDuff.Mode.DST_OVER;
                        break;
                    case 5:
                        mode = PorterDuff.Mode.SRC_IN;
                        break;
                    case 6:
                        mode = PorterDuff.Mode.DST_IN;
                        break;
                    case 7:
                        mode = PorterDuff.Mode.SRC_OUT;
                        break;
                    case 8:
                        mode = PorterDuff.Mode.DST_OUT;
                        break;
                    case 9:
                        mode = PorterDuff.Mode.SRC_ATOP;
                        break;
                    case 10:
                        mode = PorterDuff.Mode.DST_ATOP;
                        break;
                    case 11:
                        mode = PorterDuff.Mode.XOR;
                        break;
                    case 12:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    case 13:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 14:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.OVERLAY;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.DARKEN;
                        break;
                    case 17:
                        mode = PorterDuff.Mode.LIGHTEN;
                        break;
                    case 18:
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        mode = null;
                        break;
                    default:
                        t9f.b();
                        return;
                }
                switch (mode == null ? -1 : p0x.f26174a[mode.ordinal()]) {
                    case 1:
                        z = true;
                        l78Var2 = new l78(0);
                        break;
                    case 2:
                        z = true;
                        l78Var2 = new l78(1);
                        break;
                    case 3:
                        l78Var2 = new l78(2);
                        z = true;
                        break;
                    case 4:
                        l78Var2 = new l78(3);
                        z = true;
                        break;
                    case 5:
                        l78Var2 = new l78(4);
                        z = true;
                        break;
                    case 6:
                        l78Var2 = new l78(5);
                        z = true;
                        break;
                    case 7:
                        l78Var2 = new l78(6);
                        z = true;
                        break;
                    case 8:
                        l78Var2 = new l78(7);
                        z = true;
                        break;
                    case 9:
                        l78Var2 = new l78(8);
                        z = true;
                        break;
                    case 10:
                        l78Var2 = new l78(9);
                        z = true;
                        break;
                    case 11:
                        l78Var2 = new l78(10);
                        z = true;
                        break;
                    case 12:
                        l78Var2 = new l78(11);
                        z = true;
                        break;
                    case 13:
                        l78Var2 = new l78(12);
                        z = true;
                        break;
                    case 14:
                        l78Var2 = new l78(13);
                        z = true;
                        break;
                    case 15:
                        l78Var2 = new l78(14);
                        z = true;
                        break;
                    case 16:
                        l78Var2 = new l78(15);
                        z = true;
                        break;
                    case 17:
                        l78Var2 = new l78(16);
                        z = true;
                        break;
                    case 18:
                        l78Var2 = new l78(17);
                        z = true;
                        break;
                    default:
                        l78Var2 = null;
                        z = true;
                        break;
                }
                i3 = l78Var2 != null ? l78Var2.f19545a : 3;
                l78Var = new l78(i3);
            } else {
                z = true;
                l78Var = null;
            }
            mm40 mm40Var2 = jm40.b;
            if (l78Var == null) {
                fetVar.e0(1040936221);
                fetVar.r(false);
                mm40VarT = null;
            } else {
                fetVar.e0(1040936222);
                int i6 = l78Var.f19545a;
                boolean zE = fetVar.e(i6);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new dx2(i6, (byte) 8);
                    fetVar.o0(objP);
                }
                mm40VarT = i4w0.T(mm40Var2, (Function1) objP);
                fetVar.r(false);
            }
            if (mm40VarT != null) {
                mm40Var2 = mm40VarT;
            }
            mm40 mm40VarA = o7k0.A(o7k0.c(mm40Var, 1.0f), null, 3);
            zcl zclVar = qmk.i;
            zcl zclVar2 = qmk.f28987a;
            k7x.a(o0xVar.a(), "", yyw.V(h97.e(zclVar2, zclVar, zclVar, zclVar2, mm40VarA).e(mm40Var2), fetVar.k(bmd.n) == k6z.b ? z : false), gqw0.Y, null, fetVar, 1572912, 1976);
            fetVar.r(false);
        } else {
            fetVar.e0(1041734255);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, zx30Var, i2, (byte) 19);
        }
    }

    public static int S0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iI1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iI1 += p4.i1(((Integer) list.get(i2)).intValue());
        }
        return iI1;
    }

    public static final void T(by30 by30Var, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1321045176);
        int i3 = i2 | (fetVar2.g(by30Var) ? 4 : 2) | (fetVar2.h(true) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.p(jm40.b, 78.0f, 48.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            boolean z = function0 != null;
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 28);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, null, null, z, null, (Function0) objP, 24), "DS_MENU_CELL_RIGHT_SIDE");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            String str = by30Var.f3400a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), null, qmk.r, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 130026);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(by30Var, function0, i2, (byte) 20);
        }
    }

    public static void T0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.R0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            i4 += 4;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.Q0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static final void U(ay30 ay30Var, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(539033175);
        int i3 = (fetVar.g(ay30Var) ? 4 : 2) | i2 | (fetVar.h(true) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(s5x0.N(o7k0.p(jm40Var, 52.0f, 48.0f), 0.0f, 4.0f, 12.0f, 4.0f, 1), ((ThemeColors) fetVar.k(zaq0.b)).getWarning(), vgg0.f37379a);
            boolean z = function0 != null;
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new b1i(function0, (byte) 1);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarQ, null, null, z, null, (Function0) objP, 24), "DS_MENU_CELL_RIGHT_SIDE");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                objP2 = dw9.e(StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar);
            }
            long j2 = ((y3d) objP2).f41946a;
            k7x.a(ay30Var.f1653a.a(), "", o7k0.n(jm40Var, 24.0f), gqw0.f1, new m78(j2, 5), fetVar, 102236208, 1720);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(ay30Var, function0, i2, (byte) 21);
        }
    }

    public static int U0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE1 += p4.e1(((Long) list.get(i2)).longValue());
        }
        return iE1;
    }

    public static final void V(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1321473061);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), "", o2e.e0(s5x0.N(o7k0.p(jm40.b, 28.0f, 48.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), "DS_MENU_CELL_RIGHT_SIDE"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i2, (byte) 3);
        }
    }

    public static void V0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.S0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            i4 += 8;
        }
        p4Var.g1(i4);
        while (i3 < list.size()) {
            p4Var.W0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static final void W(dy30 dy30Var, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1510251948);
        int i3 = (fetVar.g(dy30Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            tdc.e(dy30Var.f6875a, dy30Var.b, o2e.e0(s5x0.N(jm40.b, 0.0f, 12.0f, 12.0f, 12.0f, 1), "DS_MENU_CELL_RIGHT_SIDE"), fetVar2, 0, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(dy30Var, i2, (byte) 16);
        }
    }

    public static void W0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.k1(i2, p4.l1(((Integer) list.get(i3)).intValue()));
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iI1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iI1 += p4.i1(p4.l1(((Integer) list.get(i4)).intValue()));
        }
        p4Var.g1(iI1);
        while (i3 < list.size()) {
            p4Var.g1(p4.l1(((Integer) list.get(i3)).intValue()));
            i3++;
        }
    }

    public static final void X(mm40 mm40Var, uzm uzmVar, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar2.g0(-225941544);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(uzmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(0) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.m, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40.b);
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
            d280 d280Var = uzmVar.b;
            if (d280Var != null) {
                fetVar2.e0(1858003542);
                boolean zG = fetVar2.g(d280Var);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.h, d280Var);
                    fetVar2.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar2.g(u6nVar);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar2.o0(objP2);
                }
                kkb.p(1, fetVar2, null, (Function0) objP2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1858432148);
                fetVar2.r(false);
            }
            fetVar2.e0(1858878548);
            fetVar2.r(false);
            if (d280Var != null) {
                uso0 uso0Var2 = uso0.f36223a;
            }
            fetVar2.e0(1859287252);
            fetVar2.r(false);
            fetVar2.r(true);
            b2 = 1;
            v8q0.a(uzmVar.f36542a, hne.i(1.0f, true, "SECOND_OPPONENTS_CONTAINER_TEXT"), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, g1t0.m().f42262a.f, 0L, null, 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 110448);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzm(mm40Var, uzmVar, i2, b2);
        }
    }

    public static void X0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.b1(i2, p4.j1(((Long) list.get(i3)).longValue()));
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iE1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iE1 += p4.e1(p4.j1(((Long) list.get(i4)).longValue()));
        }
        p4Var.g1(iE1);
        while (i3 < list.size()) {
            p4Var.c1(p4.j1(((Long) list.get(i3)).longValue()));
            i3++;
        }
    }

    public static final void Y(mm40 mm40Var, u0i0 u0i0Var, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        u0i0Var.getClass();
        function0.getClass();
        fetVar.g0(743893830);
        int i3 = i2 | 6 | (fetVar.g(u0i0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zx7 zx7Var = gqw0.e;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            mdm mdmVar = u0i0Var.f34855a;
            jm40 jm40Var = jm40.b;
            jcb.l(jm40Var, mdmVar, false, function0, fetVar, 3078, 4);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, u0i0Var, function0, i2, (byte) 29);
        }
    }

    public static void Y0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.k1(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iI1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iI1 += p4.i1(((Integer) list.get(i4)).intValue());
        }
        p4Var.g1(iI1);
        while (i3 < list.size()) {
            p4Var.g1(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static final void Z(mm40 mm40Var, float f2, fet fetVar, int i2, int i3) {
        int i4;
        fetVar.g0(1281109344);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        int i6 = i4 | (fetVar.d(f2) ? 32 : 16) | 384;
        if (fetVar.U(i6 & 1, (i6 & 147) != 146)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f2);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(mm40VarE, vgg0.a(12.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0i(mm40Var, f2, i2, i3);
        }
    }

    public static void Z0(int i2, List list, zlt0 zlt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4 p4Var = (p4) zlt0Var.b;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                p4Var.b1(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        p4Var.h1(i2, 2);
        int iE1 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iE1 += p4.e1(((Long) list.get(i4)).longValue());
        }
        p4Var.g1(iE1);
        while (i3 < list.size()) {
            p4Var.c1(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static final void a(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-1699313093);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var.e(o7k0.c), "ALL_EVENTS_LAZY_ROW");
            float f2 = xfn.a(fetVar).c;
            float f3 = xfn.a(fetVar).c;
            float f4 = ((ycl) ((hgk0) ((cwk) fetVar.k(jr00.b)).a()).getValue()).f42389a;
            zcl zclVar = qmk.f28987a;
            bgx bgxVarW = v2n0.w(new j0w0[]{new yzv0(f2, f3, f4 + 24.0f, 2), xzv0.f41773a}, fetVar);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, bgxVarW, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar, function1, i2, (byte) 0);
        }
    }

    public static final void a0(int i2, fet fetVar) {
        fetVar.g0(-1756854850);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            Z(o7k0.s(s5x0.N(jm40.b, 8.0f, 2.0f, 0.0f, 2.0f, 4), 96.0f), 12.0f, fetVar, 0, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cr60(i2, (byte) 3);
        }
    }

    public static final void b(k3q k3qVar, Function1 function1, mm40 mm40Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        k3qVar.getClass();
        function1.getClass();
        fetVar2.g0(-1316021885);
        int i3 = i2 | (fetVar2.g(k3qVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.g(mm40Var) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 6.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = k3qVar.f17631a;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 10.0f, 0.0f, 0.0f, 0.0f, 14), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            qxw.o(fetVar2, o7k0.n(jm40Var, 8.0f));
            lh80 lh80VarT = s5x0.t(0.0f, 0.0f, 3);
            lh80 lh80Var = ee9.f7659a;
            be9 be9VarA = ee9.a(((StaticColors) fetVar2.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, 0L, fetVar2, 12);
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new gj4(function1, k3qVar, (byte) 2);
                fetVar2.o0(objP);
            }
            o050.g((Function0) objP, mm40VarN, false, null, be9VarA, null, lh80VarT, wb.f, fetVar2, 817889280, 364);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) k3qVar, (Object) function1, (Object) mm40Var, i2, (byte) 8);
        }
    }

    public static final void b0(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1417128732);
        int i3 = i2 | 6 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((ubn0) l7m0Var.getValue()).c;
            zfn zfnVar = zaq0.b;
            oim oimVar = new oim(((ubn0) l7m0Var.getValue()).f35390a, false, "", "", false, new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_trash, z, ra50.f30118a, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary()))), 0, lak0.c, axh0.f1625a, null);
            Object[] objArr = new Object[0];
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new f7f0(l7m0Var, (byte) 26);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z3 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new f7f0(l7m0Var, (byte) 27);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), "SUBSCRIPTION_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            mm40 mm40VarW = o050.W(jm40Var);
            int i5 = i3 & 896;
            boolean z4 = i5 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new zbm0(function1, (byte) 8);
                fetVar2.o0(objP3);
            }
            ckb.k(mm40VarW, oimVar, true, null, null, (Function1) objP3, fetVar, 384, 24);
            fetVar2 = fetVar;
            boolean z5 = i5 == 256;
            Object objP4 = fetVar2.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new zbm0(function1, (byte) 9);
                fetVar2.o0(objP4);
            }
            ohq0.S(l7m0VarY, l7m0VarY2, function1, (Function1) objP4, fetVar2, i5);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void c(mm40 mm40Var, kiz kizVar, float f2, fet fetVar, int i2) {
        fetVar.g0(1983783392);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(kizVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40 mm40VarQ = ffb0.Q(mm40Var, f2, f2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            zcl zclVar = qmk.f28987a;
            thb.f(knx.Q(jm40.b, new thd((byte) 9)), kizVar.f18360a, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv(mm40Var, (Object) kizVar, f2, i2, (byte) 4);
        }
    }

    public static final void c0(vbs vbsVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-37909929);
        int i3 = i2 | (fetVar2.g(vbsVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            if (vbsVar.d.f10362a.isEmpty()) {
                fetVar2.e0(-829135711);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-829371466);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                vxl vxlVar = vxl.f38204a;
                fyl fylVar = vbsVar.d;
                boolean z2 = (i3 & 896) == 256;
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new baq(function1, (byte) 14);
                    fetVar2.o0(objP);
                }
                ebc.r(mm40VarN, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            int i4 = i3 << 6;
            tdc.m(null, vbsVar.e, t3n.f33276a, z, null, function2, fetVar2, (i4 & 7168) | 384 | (i4 & 458752), 17);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((Object) vbsVar, z, (Object) function1, function2, i2, (byte) 10);
        }
    }

    public static final void d(mm40 mm40Var, pz40 pz40Var, pz40 pz40Var2, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-388918188);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(pz40Var2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.i;
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
            int i4 = i3 >> 3;
            H(mrv.k0(jm40Var, "LEFT_SECTION_ID"), pz40Var2, function0, function1, fetVar, (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168));
            if (pz40Var.getValue() instanceof h30) {
                fetVar.e0(1651389797);
                fetVar.r(false);
            } else {
                fetVar.e0(1651146664);
                P(mrv.k0(jm40Var, "RIGHT_SECTION_ID"), pz40Var, function2, fetVar, ((i3 >> 9) & 896) | (i3 & 112) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw7(mm40Var, pz40Var, pz40Var2, function0, function1, function2, i2, (byte) 1);
        }
    }

    public static final void d0(mm40 mm40Var, f6s0 f6s0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1106594756);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(f6s0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            a4x a4xVar = f6s0Var.b;
            ci ciVar = f6s0Var.c;
            ohq0.U((i4 << 3) & 7168, fetVar2, a4xVar, null, function1, ciVar != null);
            function2 = function1;
            if (ciVar == null) {
                fetVar2.e0(926177419);
                fetVar2.r(false);
            } else {
                fetVar2.e0(926177420);
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
                mtl mtlVar = ciVar.f4387a;
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z = ((i4 & 896) == 256) | ((i4 & 112) == 32);
                Object objP = fetVar2.P();
                if (z || objP == ukd.f35823a) {
                    objP = new b8q0((Object) function2, (Object) f6s0Var, (byte) 26);
                    fetVar2.o0(objP);
                }
                bkb.f(mm40VarB, mtlVar, null, false, lh80VarU, (Function1) objP, fetVar, 0, 12);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, f6s0Var, function2, i2, (byte) 13);
        }
    }

    public static final void e(id8 id8Var, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        fet fetVar2;
        id8Var.getClass();
        function0.getClass();
        fetVar.g0(663494993);
        int i3 = (fetVar.g(id8Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (!id8Var.c || id8Var.d == null) {
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.e0(740261873);
            fetVar2.r(false);
        } else {
            fetVar.e0(740017593);
            zx7 zx7Var = gqw0.e;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            function1 = function0;
            fetVar2 = fetVar;
            jcb.l(null, id8Var.d, false, function1, fetVar2, (i3 << 6) & 7168, 5);
            fetVar2.r(true);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(id8Var, function1, i2, (byte) 13);
        }
    }

    public static final void e0(mm40 mm40Var, h6s0 h6s0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2005794495);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(h6s0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (h6s0Var != null) {
                if (h6s0Var instanceof f6s0) {
                    fetVar.e0(-1255929324);
                    d0(mm40Var, (f6s0) h6s0Var, function1, fetVar, i3 & 1022);
                    fetVar.r(false);
                } else if (h6s0Var instanceof g6s0) {
                    fetVar.e0(-1255706341);
                    f0((g6s0) h6s0Var, function1, fetVar, (i3 >> 3) & 126);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-871799757, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, h6s0Var, function1, i2, (byte) 12);
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function2 e2sVar;
        l7m0Var.getClass();
        fetVar.g0(-1141213742);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String str = (String) l7m0Var.getValue();
            if (str == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    e2sVar = new cw0(l7m0Var, i2, (byte) 2);
                }
            } else {
                y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                mm40Var2 = jm40.b;
                v8q0.a(str, mm40Var2, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 48, 0, 131064);
            }
            yfe0VarU.d = e2sVar;
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            e2sVar = new e2s(mm40Var2, l7m0Var, i2, (byte) 1);
            yfe0VarU.d = e2sVar;
        }
    }

    public static final void f0(g6s0 g6s0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1624208873);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(g6s0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            mdm mdmVar = g6s0Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarH, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) g6s0Var, (Object) function1, i2, (byte) 5);
        }
    }

    public static final void g(zva zvaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-843051366);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar2.g(zvaVar) : fetVar2.i(zvaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function1) ? 32 : 16;
        }
        byte b2 = 27;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            if (zvaVar != null) {
                boolean z2 = zvaVar instanceof yva;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar2.e0(1625732307);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar2).d, 8.0f);
                    yva yvaVar = (yva) zvaVar;
                    String str = yvaVar.f43309a;
                    String str2 = yvaVar.b;
                    int i4 = i3 & 112;
                    boolean z3 = i4 == 32;
                    Object objP = fetVar2.P();
                    if (z3 || objP == cl5Var) {
                        objP = new xv50(function1, (byte) 23);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    z = i4 == 32;
                    Object objP2 = fetVar2.P();
                    if (z || objP2 == cl5Var) {
                        objP2 = new xv50(function1, (byte) 24);
                        fetVar2.o0(objP2);
                    }
                    pzb.g(mm40VarK, str, str2, function0, (Function0) objP2, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    int i5 = i3;
                    if (zvaVar instanceof xva) {
                        fetVar2.e0(1626487684);
                        xva xvaVar = (xva) zvaVar;
                        ijl ijlVar = xvaVar.d;
                        jjl jjlVar = new jjl(xvaVar.b, xvaVar.c, xvaVar.e, xvaVar.f41549a);
                        int i6 = i5 & 112;
                        boolean z4 = i6 == 32;
                        Object objP3 = fetVar2.P();
                        if (z4 || objP3 == cl5Var) {
                            objP3 = new xv50(function1, (byte) 25);
                            fetVar2.o0(objP3);
                        }
                        Function0 function2 = (Function0) objP3;
                        boolean z5 = i6 == 32;
                        Object objP4 = fetVar2.P();
                        if (z5 || objP4 == cl5Var) {
                            objP4 = new xv50(function1, (byte) 26);
                            fetVar2.o0(objP4);
                        }
                        Function0 function3 = (Function0) objP4;
                        z = i6 == 32;
                        Object objP5 = fetVar2.P();
                        if (z || objP5 == cl5Var) {
                            objP5 = new xv50(function1, b2);
                            fetVar2.o0(objP5);
                        }
                        feb.k(ijlVar, jjlVar, null, function2, function3, (Function0) objP5, fetVar2, 0, 4);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                }
            }
            throw b1j.f(1576461850, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(zvaVar, function1, i2, b2);
        }
    }

    public static final void g0(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        Function1 function2;
        l7m0Var.getClass();
        fetVar.g0(1814273831);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(knm0.r(yyw.X(mm40Var.e(o7k0.c), null, fetVar, 1)), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            imm immVarA = ((h6s0) l7m0Var.getValue()).a();
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarH, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            int i4 = i3 & 910;
            mm40Var2 = mm40Var;
            function2 = function1;
            e0(mm40Var2, (h6s0) l7m0Var.getValue(), function2, fetVar, i4);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function2, i2, (byte) 14);
        }
    }

    public static final void h(mm40 mm40Var, wwa wwaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1795114740);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(wwaVar) : fetVar.i(wwaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            byte b3 = 14;
            if (wwaVar instanceof vwa) {
                fetVar.e0(-1625204244);
                i(mm40Var, u1c.M(1828090185, new ds60(wwaVar, b2), fetVar), fetVar, (i3 & 14) | 48, 0);
                fetVar.r(false);
            } else {
                if (!(wwaVar instanceof uwa)) {
                    throw b1j.f(1471593365, fetVar, false);
                }
                fetVar.e0(-1624856920);
                i(mm40Var, u1c.M(1895271360, new jt50(wwaVar, function1, b3), fetVar), fetVar, (i3 & 14) | 48, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) wwaVar, (Object) function1, i2, (byte) 22);
        }
    }

    public static final void h0(mm40 mm40Var, long j2, qol qolVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-2002041591);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(qolVar) : fetVar.i(qolVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.a(10.0f));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarJ, s6t0.b().f33626a.getSecondary10(), jd8.n), 0.0f, 10.0f, 1);
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
            fxb.k(new Date(j2), qolVar, null, tol.c, jwb.E(cjx.l, fetVar), sol.f32548a, null, fetVar, 199680 | ((i3 >> 3) & 112), 68);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((byte) 8, i2, j2, mm40Var, (Object) qolVar);
        }
    }

    public static final void i(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        fetVar.g0(-306094638);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mm40Var2 = i5 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.a(12.0f));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ2);
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
            twn.v((i4 >> 3) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gu60(mm40Var2, ugdVar, i2, i3, (byte) 0);
        }
    }

    public static final void i0(mm40 mm40Var, uwa uwaVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1989887931);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(uwaVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long j2 = uwaVar.f;
            boolean zF = fetVar2.f(j2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = androidx.compose.runtime.e.c(j2 - System.currentTimeMillis());
                fetVar2.o0(objP);
            }
            egk0 egk0Var = (egk0) objP;
            Long lValueOf = Long.valueOf(j2);
            boolean zG = ((i3 & 112) == 32) | fetVar2.g(egk0Var);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ku60(uwaVar, egk0Var, null, b2);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, lValueOf, (Function2) objP2);
            if (j2 <= 0 || egk0Var.l() <= 0) {
                mm40Var2 = mm40Var;
                fetVar2.e0(1613571147);
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(uwaVar.d), uwaVar.e, false, false);
                boolean z = (i3 & 896) == 256;
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new xv50(function1, (byte) 28);
                    fetVar2.o0(objP3);
                }
                qzb.n(mm40VarD, wulVar, (Function0) objP3, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1613390665);
                h0(mm40Var, uwaVar.f, uwaVar.g, fetVar, i3 & 14);
                mm40Var2 = mm40Var;
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var2, uwaVar, function1, i2, (byte) 8);
        }
    }

    public static final void j(final String str, final y9q0 y9q0Var, final long j2, String str2, String str3, fet fetVar, final int i2, final int i3) {
        String str4;
        int i4;
        String str5;
        int i5;
        final String str6;
        final String str7;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1070254969);
        int i6 = i2 | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(y9q0Var) ? 32 : 16) | (fetVar2.f(j2) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i6 | (fetVar2.g(str4) ? 2048 : 1024);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            str5 = str3;
        } else {
            str5 = str3;
            i5 = i4 | (fetVar2.g(str5) ? 16384 : 8192);
        }
        int i9 = i5;
        if (fetVar2.U(i9 & 1, (i9 & 9363) != 9362)) {
            String str8 = i7 != 0 ? null : str4;
            String str9 = i8 != 0 ? null : str5;
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 40.0f), vgg0.a(10.0f));
            pz40 pz40Var = s6t0.f31722a;
            String str10 = str9;
            mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_cashback, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), s6t0.b().f33626a.getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            String str11 = str10;
            v8q0.a(str, null, j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, i9 & 910, (i9 << 18) & 29360128, 131066);
            fetVar2 = fetVar;
            if (str8 == null) {
                fetVar2.e0(-941603120);
                fetVar2.r(false);
                z2 = true;
            } else {
                fetVar2.e0(-941603119);
                thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.l, fetVar2, 48);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                v8q0.a(str8, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.v(), fetVar, 0, 0, 131066);
                str11 = str11;
                if (str11 == null) {
                    fetVar.e0(1710874728);
                    fetVar.r(false);
                    fetVar2 = fetVar;
                    z = false;
                } else {
                    fetVar.e0(1710874729);
                    v8q0.a(Separators.LPAREN + str11 + Separators.RPAREN, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.v(), fetVar, 0, 0, 131064);
                    fetVar2 = fetVar;
                    z = false;
                    fetVar2.r(false);
                }
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(z);
            }
            fetVar2.r(z2);
            fetVar2.r(z2);
            str6 = str8;
            str7 = str11;
        } else {
            fetVar2.X();
            str6 = str4;
            str7 = str5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, y9q0Var, j2, str6, str7, i2, i3) { // from class: a.hu60

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f13664a;
                public final /* synthetic */ y9q0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ byte f;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    jiq0.j(this.f13664a, this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static int j0(Context context, String str) {
        if (str == null) {
            hny.u("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new o760(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final void k(mm40 mm40Var, dxa dxaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(793665072);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(dxaVar) : fetVar.i(dxaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (dxaVar != null) {
                if (dxaVar instanceof cxa) {
                    fetVar.e0(-1792037939);
                    r(mm40Var, (cxa) dxaVar, function1, fetVar, i3 & 1022);
                    fetVar.r(false);
                } else if (dxaVar instanceof bxa) {
                    fetVar.e0(-1792032658);
                    v(mm40Var, (bxa) dxaVar, function1, fetVar, i3 & 1022);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1792039627, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) dxaVar, (Object) function1, i2, (byte) 24);
        }
    }

    public static final a32 k0(z22 z22Var, ctf0 ctf0Var) {
        int i2;
        ctf0Var.getClass();
        int iOrdinal = z22Var.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string.events_live;
        } else if (iOrdinal == 1) {
            i2 = R.string.events_line;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i2 = R.string.results;
        }
        return new a32(new hjm(ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, z22Var == z22.f43650a, null, null, false, null, null, 8126), z22Var);
    }

    public static final void l(mm40 mm40Var, Function0 function0, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        Function0 function1;
        fetVar.g0(71692051);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.a(12.0f));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            boolean z = function0 != null;
            if (function0 == null) {
                fetVar.e0(1179551021);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new fq60((byte) 7);
                    fetVar.o0(objP);
                }
                fetVar.r(false);
                function1 = (Function0) objP;
            } else {
                fetVar.e0(176597024);
                fetVar.r(false);
                function1 = function0;
            }
            mm40 mm40VarJ2 = s5x0.J(y860.Y(mm40VarQ, z, null, null, function1, 14), 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ2);
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
            h97.p(((i3 >> 3) & 112) | 6, ugdVar, zhg0.f44392a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) function0, (Object) ugdVar, i2, (byte) 27);
        }
    }

    public static final Object l0(Class cls, Map map, List list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        n0o0 n0o0VarB = maz.b(new f80(map, (byte) 13));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new r83(cls, map, maz.b(new h5((Object) cls, (Object) map, (byte) 4)), n0o0VarB, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static final void m(mm40 mm40Var, String str, boolean z, String str2, long j2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-11659639);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            j6n.h(str, z ? bqo0.f3042a : apo0.f1263a, null, 0, 0, fetVar2, (i3 >> 3) & 14, 28);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str2, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (14 & (i3 >> 9)) | ((i3 >> 6) & 896), 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u13(mm40Var, str, z, str2, j2, i2);
        }
    }

    public static /* synthetic */ Object m0(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(r3d.q(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return l0(cls, map, arrayList);
    }

    public static final void n(su60 su60Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(955438040);
        int i3 = (fetVar.g(su60Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarA0 = wha0.a0(o7k0.c, wha0.T(fetVar), false, 14);
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarA0, f2, 8.0f, f3, 24.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            int i4 = (i3 << 3) & 896;
            h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), su60Var.c, function1, fetVar, i4);
            s(su60Var.d, fetVar, 0);
            l0b l0bVar = su60Var.e;
            q(l0bVar.f19191a, l0bVar.b, function1, fetVar, i4);
            l0b l0bVar2 = su60Var.f;
            q(l0bVar2.f19191a, l0bVar2.b, function1, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(su60Var, function1, i2, (byte) 15);
        }
    }

    public static ColorStateList n0(int i2, Context context) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ftf0 ftf0Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        gtf0 gtf0Var = new gtf0(resources, theme);
        synchronized (itf0.c) {
            try {
                SparseArray sparseArray = (SparseArray) itf0.b.get(gtf0Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (ftf0Var = (ftf0) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (ftf0Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || ftf0Var.c != 0) {
                            if (theme == null || ftf0Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = ftf0Var.f10110a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = itf0.f15351a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = b5d.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (itf0.c) {
            try {
                WeakHashMap weakHashMap = itf0.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(gtf0Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(gtf0Var, sparseArray2);
                }
                sparseArray2.append(i2, new ftf0(colorStateListA, gtf0Var.f11878a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final void o(mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(258819256);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 24.0f, 2);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jcb.l(jr8.f16991a.b(jm40.b, zx7Var), mdmVar, false, function0, fetVar, ((i3 << 3) & 112) | ((i3 << 6) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eu60(mdmVar, function0, i2, b2);
        }
    }

    public static Executor o0(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? ia3.o(context) : new k03(new Handler(context.getMainLooper()), (byte) 2);
    }

    public static final void p(tu60 tu60Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        fetVar.g0(1801863553);
        byte b2 = 16;
        int i3 = (fetVar.g(tu60Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mdm mdmVar = tu60Var.d;
            mdm mdmVar2 = tu60Var.c;
            cl5 cl5Var = ukd.f35823a;
            if (mdmVar != null) {
                fetVar.e0(816013478);
                mdm mdmVar3 = tu60Var.d;
                z = (i3 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new xv50(function1, (byte) 29);
                    fetVar.o0(objP);
                }
                o(mdmVar3, (Function0) objP, fetVar, 0);
                fetVar.r(false);
            } else if (mdmVar2 != null) {
                fetVar.e0(816231594);
                z = (i3 & 112) == 32;
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new ju60(function1, b3);
                    fetVar.o0(objP2);
                }
                o(mdmVar2, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(816413409);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(tu60Var, function1, i2, b2);
        }
    }

    public static final ArrayList p0(List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (!(((io9) obj) instanceof fo9)) {
                arrayListU.add(obj);
            }
        }
        return arrayListU;
    }

    public static final void q(String str, List list, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-198041027);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        int i4 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            u(str, fetVar, i3 & 14);
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                dxa dxaVar = (dxa) obj;
                mm40 mm40VarN = jm40.b;
                if (i4 != 0) {
                    zcl zclVar = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                }
                k(mm40VarN, dxaVar, function1, fetVar, i3 & 896);
                i4 = i5;
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) str, (Object) list, (Object) function1, i2, (byte) 23);
        }
    }

    public static String q0(int i2, Context context) {
        ss00 ss00VarA;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            Object systemService = context.getSystemService("locale");
            ss00VarA = systemService != null ? ss00.c(f7.r(systemService)) : ss00.b;
        } else {
            ss00VarA = ss00.a(jd8.j0(context));
        }
        if (i3 <= 32 && !ss00VarA.b()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(ss00VarA.f32705a.f34441a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i2);
    }

    public static final void r(mm40 mm40Var, cxa cxaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1858971935);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(cxaVar) : fetVar.i(cxaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(cxaVar))) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new a540((Object) cxaVar, (Object) function1, (byte) 20);
                fetVar.o0(objP);
            }
            l(mm40Var, (Function0) objP, u1c.M(514510705, new p0z((Object) cxaVar, (byte) 21), fetVar), fetVar, (i3 & 14) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) cxaVar, (Object) function1, i2, (byte) 26);
        }
    }

    public static final i1b r0(pbv pbvVar, boolean z, int i2) {
        boolean z2;
        boolean z3;
        a570 a570Var = pbvVar.e;
        a570Var.getClass();
        if (i2 >= 2 || z) {
            z2 = false;
            z3 = true;
        } else {
            z3 = true;
            z2 = true;
        }
        String str = pbvVar.c;
        str.getClass();
        String str2 = pbvVar.n.f12884a;
        d1b d1bVar = new d1b(str2, azw.R(str2));
        boolean z4 = (pbvVar.o && (a570Var instanceof z470)) ? z3 : false;
        hcs hcsVar = pbvVar.d;
        hcsVar.getClass();
        String str3 = pbvVar.f;
        str3.getClass();
        return new i1b(a570Var, z2, z, str, d1bVar, z4, hcsVar, str3);
    }

    public static final void s(rza rzaVar, fet fetVar, int i2) {
        fetVar.g0(600653300);
        int i3 = (fetVar.g(rzaVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            i(null, u1c.M(156402527, new fu60(rzaVar), fetVar), fetVar, 48, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fu60(rzaVar, i2);
        }
    }

    public static final void s0(cza czaVar, String str, Function1 function1) {
        int iOrdinal = czaVar.ordinal();
        if (iOrdinal == 0) {
            function1.invoke(new it60(str));
            return;
        }
        if (iOrdinal == 1) {
            function1.invoke(new pt60(str));
        } else if (iOrdinal == 2) {
            function1.invoke(new ht60(str));
        } else {
            t9f.b();
        }
    }

    public static final void t(ed50 ed50Var, zva zvaVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        ugd ugdVar2 = ugdVar;
        fetVar.g0(-221684099);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(ed50Var) : fetVar.i(ed50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(zvaVar) : fetVar.i(zvaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarS = knm0.s(0, fetVar, i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ed50Var.f7602a;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ju60(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new i160(function1, (byte) 2);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 6, 0, 4052);
            fetVar2 = fetVar;
            g(zvaVar, function1, fetVar2, (i3 >> 3) & 126);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            int i5 = i3 & 7168;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            ugdVar2 = ugdVar;
            ua80.p(((i5 >> 6) & 112) | 6, ugdVar2, jr8.f16991a, fetVar2, true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 24, i2, (Object) ed50Var, (Object) zvaVar, (Object) function1, (Object) ugdVar2);
        }
    }

    public static Intent t0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return ga3.q(context, broadcastReceiver, intentFilter);
        }
        return i2 >= 26 ? ga3.p(context, broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    public static final void u(String str, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1666268104);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(jm40.b, 8.0f, 8.0f, 8.0f, 0.0f, 8), new hjm(str, new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 11, i2, str);
        }
    }

    public static void u0(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                jf4.o(axq.n(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        activity.requestPermissions(strArr, i2);
    }

    public static final void v(mm40 mm40Var, bxa bxaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1331057796);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(bxaVar) : fetVar.i(bxaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            Function0 function0 = null;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (bxaVar.g) {
                fetVar.e0(-1889921054);
            } else {
                fetVar.e0(-1889881467);
                boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(bxaVar))) | ((i3 & 896) == 256);
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new ck60(bxaVar, function1, pz40Var, b2);
                    fetVar.o0(objP2);
                }
                function0 = (Function0) objP2;
            }
            fetVar.r(false);
            l(mm40Var, function0, u1c.M(-1669826284, new iu60(bxaVar, pz40Var, b3), fetVar), fetVar, (i3 & 14) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) bxaVar, (Object) function1, i2, (byte) 25);
        }
    }

    public static boolean v0(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (i2 != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static final void w(int i2, fet fetVar) {
        fetVar.g0(-1967514023);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarA0 = wha0.a0(o7k0.c, wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarA0, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            Z(null, 114.0f, fetVar, 0, 5);
            Z(null, 68.0f, fetVar, 0, 5);
            a0(0, fetVar);
            Z(null, 84.0f, fetVar, 0, 5);
            Z(null, 84.0f, fetVar, 0, 5);
            a0(0, fetVar);
            Z(null, 84.0f, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cr60(i2, (byte) 2);
        }
    }

    public static final ou0 w0(lu0 lu0Var) {
        ArrayList arrayList;
        lu0Var.getClass();
        long j2 = lu0Var.f20650a;
        Integer num = lu0Var.b;
        String str = lu0Var.c;
        List<g3z> list = lu0Var.d;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (g3z g3zVar : list) {
                arrayList.add(new j3z(g3zVar.f10637a, g3zVar.b));
            }
        } else {
            arrayList = null;
        }
        return new ou0(j2, num, str, arrayList);
    }

    public static final void x(ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(1026603674);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 72.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i2, (byte) 23);
        }
    }

    public static final on5 x0(ql5 ql5Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (ql5Var == null) {
            return new cn5(ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
        }
        pn40 pn40Var = pn40.f27267a;
        return new dn5("\u200e".concat(pn40.i(ql5Var.b, 2)), ql5Var.f, ibm0.h(ql5Var), ql5Var.m, ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:102:0x01de  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x023c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0274  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0294  */
    /* JADX WARN: Code duplicated, block: B:125:0x0297  */
    /* JADX WARN: Code duplicated, block: B:127:0x029f  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:140:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0308  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    public static final void y(mm40 mm40Var, gy30 gy30Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        Function0 function3;
        int i5;
        Function0 function4;
        int i6;
        int i7;
        Function0 function5;
        int i8;
        boolean z;
        mm40 mm40Var3;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        Function0 function9;
        fy30 fy30Var;
        int i9;
        Function0 function10;
        int iOrdinal;
        float f2;
        char c2;
        yjj0 ugg0Var;
        mm40 mm40VarQ;
        Object objP;
        cl5 cl5Var;
        boolean z2;
        pcy pcyVar;
        boolean z3;
        int i10;
        boolean z4;
        Object objP2;
        Function0 function11;
        boolean z5;
        Function0 function12;
        Function0 function13;
        gy30Var.getClass();
        List list = gy30Var.e;
        fetVar.g0(525943547);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(gy30Var) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                function3 = function0;
                i4 |= fetVar.i(function3) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    function4 = function1;
                    if (fetVar.i(function4)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        function5 = function2;
                        if (fetVar.i(function5)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        jm40Var = jm40.b;
                        if (i11 != 0) {
                            mm40Var2 = jm40Var;
                        }
                        if (i12 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i5 != 0) {
                            function4 = null;
                        }
                        if (i7 != 0) {
                            function5 = null;
                        }
                        fy30Var = gy30Var.c;
                        if (list.isEmpty()) {
                            i9 = i4;
                            function10 = function4;
                            long j2 = gy30Var.d;
                            iOrdinal = gy30Var.f.ordinal();
                            if (iOrdinal != 0) {
                                f2 = 0.0f;
                                c2 = 3;
                                zcl zclVar = qmk.i;
                                ugg0 ugg0Var2 = vgg0.f37379a;
                                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
                            } else if (iOrdinal != 1) {
                                f2 = 0.0f;
                                c2 = 3;
                                zcl zclVar2 = qmk.f28987a;
                                ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                            } else if (iOrdinal != 2) {
                                c2 = 3;
                                if (iOrdinal == 3) {
                                    t9f.b();
                                    return;
                                } else {
                                    ugg0Var = jd8.n;
                                    f2 = 0.0f;
                                }
                            } else {
                                c2 = 3;
                                zcl zclVar3 = qmk.f28987a;
                                f2 = 0.0f;
                                ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                            }
                            mm40VarQ = i120.Q(mm40Var2, j2, ugg0Var);
                        } else {
                            i9 = i4;
                            function10 = function4;
                            e900 e900Var = new e900(list, null, 0L, 9187343241974906880L);
                            zcl zclVar4 = qmk.i;
                            ugg0 ugg0Var3 = vgg0.f37379a;
                            mm40VarQ = i120.P(mm40Var2, e900Var, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4), 4);
                            f2 = 0.0f;
                            c2 = 3;
                        }
                        w6k w6kVar = (w6k) fetVar.k(bmd.h);
                        objP = fetVar.P();
                        cl5Var = ukd.f35823a;
                        if (objP == cl5Var) {
                            zcl zclVar5 = qmk.f28987a;
                            objP = androidx.compose.runtime.e.e(new ycl(f2));
                            fetVar.o0(objP);
                        }
                        pz40 pz40Var = (pz40) objP;
                        mm40 mm40VarD = o7k0.d(mm40VarQ, 1.0f);
                        zcl zclVar6 = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                        mkd.c0.getClass();
                        fetVar.i0();
                        z2 = fetVar.S;
                        pcyVar = e7z.u1;
                        if (z2) {
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
                        if (fy30Var instanceof zx30) {
                            fetVar.e0(-1543930234);
                            S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-1543738995);
                            fetVar.r(false);
                        }
                        n0q n0qVar = o7k0.c;
                        if (function9 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i10 = i9;
                        if ((i10 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP2 = fetVar.P();
                        if (z4 || objP2 == cl5Var) {
                            objP2 = new pk9(function9, (byte) 27);
                            fetVar.o0(objP2);
                        }
                        mm40 mm40VarE0 = o2e.e0(y860.W(n0qVar, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
                        fetVar.i0();
                        function11 = function9;
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA, shdVar);
                        jpm0.o(fetVar, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar4);
                        function4 = function10;
                        K(gy30Var, u1c.M(2000286406, new x2g(w6kVar, gy30Var, function4, pz40Var), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                        if (fy30Var instanceof yx30) {
                            fetVar.e0(1235491599);
                            z5 = false;
                            R((yx30) fy30Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z5 = false;
                            if (fy30Var instanceof ay30) {
                                fetVar.e0(1235494541);
                                ay30 ay30Var = (ay30) fy30Var;
                                if (function5 == null) {
                                    function13 = function11;
                                } else {
                                    function13 = function5;
                                }
                                U(ay30Var, function13, fetVar, 0);
                                fetVar.r(false);
                            } else if (fy30Var instanceof by30) {
                                fetVar.e0(1235502356);
                                by30 by30Var = (by30) fy30Var;
                                if (function5 == null) {
                                    function12 = function11;
                                } else {
                                    function12 = function5;
                                }
                                T(by30Var, function12, fetVar, 0);
                                fetVar.r(false);
                            } else if (fy30Var instanceof cy30) {
                                fetVar.e0(1235510083);
                                V(0, fetVar);
                                fetVar.r(false);
                            } else if (fy30Var instanceof dy30) {
                                fetVar.e0(1235512301);
                                W((dy30) fy30Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-353772561);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                        fetVar.e0(-1540687603);
                        fetVar.r(z5);
                        fetVar.r(true);
                        function6 = function11;
                        mm40Var3 = mm40Var2;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function6 = function3;
                    }
                    function7 = function4;
                    function8 = function5;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
                    }
                }
                i4 |= 24576;
                function5 = function2;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i11 != 0) {
                        mm40Var2 = jm40Var;
                    }
                    if (i12 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    }
                    fy30Var = gy30Var.c;
                    if (list.isEmpty()) {
                        i9 = i4;
                        function10 = function4;
                        e900 e900Var2 = new e900(list, null, 0L, 9187343241974906880L);
                        zcl zclVar7 = qmk.i;
                        ugg0 ugg0Var4 = vgg0.f37379a;
                        mm40VarQ = i120.P(mm40Var2, e900Var2, new ugg0(zclVar7, zclVar7, zclVar7, zclVar7), 4);
                        f2 = 0.0f;
                        c2 = 3;
                    } else {
                        i9 = i4;
                        function10 = function4;
                        long j3 = gy30Var.d;
                        iOrdinal = gy30Var.f.ordinal();
                        if (iOrdinal != 0) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar8 = qmk.i;
                            ugg0 ugg0Var5 = vgg0.f37379a;
                            ugg0Var = new ugg0(zclVar8, zclVar8, zclVar8, zclVar8);
                        } else if (iOrdinal != 1) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar9 = qmk.f28987a;
                            ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                        } else if (iOrdinal != 2) {
                            c2 = 3;
                            if (iOrdinal == 3) {
                                t9f.b();
                                return;
                            } else {
                                ugg0Var = jd8.n;
                                f2 = 0.0f;
                            }
                        } else {
                            c2 = 3;
                            zcl zclVar10 = qmk.f28987a;
                            f2 = 0.0f;
                            ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                        }
                        mm40VarQ = i120.Q(mm40Var2, j3, ugg0Var);
                    }
                    w6k w6kVar2 = (w6k) fetVar.k(bmd.h);
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        zcl zclVar11 = qmk.f28987a;
                        objP = androidx.compose.runtime.e.e(new ycl(f2));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var2 = (pz40) objP;
                    mm40 mm40VarD2 = o7k0.d(mm40VarQ, 1.0f);
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD2, 64.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z2 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar, tj30VarC2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM3, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar, numValueOf2, shdVar7);
                    jpm0.n(fetVar);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC2, shdVar8);
                    if (fy30Var instanceof zx30) {
                        fetVar.e0(-1543930234);
                        S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1543738995);
                        fetVar.r(false);
                    }
                    n0q n0qVar2 = o7k0.c;
                    if (function9 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i10 = i9;
                    if ((i10 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP2 = fetVar.P();
                    if (z4) {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarE1 = o2e.e0(y860.W(n0qVar2, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE1);
                    fetVar.i0();
                    function11 = function9;
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar5);
                    jpm0.o(fetVar, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar, shdVar7, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar8);
                    function4 = function10;
                    K(gy30Var, u1c.M(2000286406, new x2g(w6kVar2, gy30Var, function4, pz40Var2), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                    if (fy30Var instanceof yx30) {
                        fetVar.e0(1235491599);
                        z5 = false;
                        R((yx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z5 = false;
                        if (fy30Var instanceof ay30) {
                            fetVar.e0(1235494541);
                            ay30 ay30Var2 = (ay30) fy30Var;
                            if (function5 == null) {
                                function13 = function11;
                            } else {
                                function13 = function5;
                            }
                            U(ay30Var2, function13, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof by30) {
                            fetVar.e0(1235502356);
                            by30 by30Var2 = (by30) fy30Var;
                            if (function5 == null) {
                                function12 = function11;
                            } else {
                                function12 = function5;
                            }
                            T(by30Var2, function12, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof cy30) {
                            fetVar.e0(1235510083);
                            V(0, fetVar);
                            fetVar.r(false);
                        } else if (fy30Var instanceof dy30) {
                            fetVar.e0(1235512301);
                            W((dy30) fy30Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-353772561);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                    fetVar.e0(-1540687603);
                    fetVar.r(z5);
                    fetVar.r(true);
                    function6 = function11;
                    mm40Var3 = mm40Var2;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function6 = function3;
                }
                function7 = function4;
                function8 = function5;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
                }
            }
            i4 |= 3072;
            function4 = function1;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function5 = function2;
                    if (fetVar.i(function5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i11 != 0) {
                        mm40Var2 = jm40Var;
                    }
                    if (i12 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    }
                    fy30Var = gy30Var.c;
                    if (list.isEmpty()) {
                        i9 = i4;
                        function10 = function4;
                        e900 e900Var3 = new e900(list, null, 0L, 9187343241974906880L);
                        zcl zclVar13 = qmk.i;
                        ugg0 ugg0Var6 = vgg0.f37379a;
                        mm40VarQ = i120.P(mm40Var2, e900Var3, new ugg0(zclVar13, zclVar13, zclVar13, zclVar13), 4);
                        f2 = 0.0f;
                        c2 = 3;
                    } else {
                        i9 = i4;
                        function10 = function4;
                        long j4 = gy30Var.d;
                        iOrdinal = gy30Var.f.ordinal();
                        if (iOrdinal != 0) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar14 = qmk.i;
                            ugg0 ugg0Var7 = vgg0.f37379a;
                            ugg0Var = new ugg0(zclVar14, zclVar14, zclVar14, zclVar14);
                        } else if (iOrdinal != 1) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar15 = qmk.f28987a;
                            ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                        } else if (iOrdinal != 2) {
                            c2 = 3;
                            if (iOrdinal == 3) {
                                t9f.b();
                                return;
                            } else {
                                ugg0Var = jd8.n;
                                f2 = 0.0f;
                            }
                        } else {
                            c2 = 3;
                            zcl zclVar16 = qmk.f28987a;
                            f2 = 0.0f;
                            ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                        }
                        mm40VarQ = i120.Q(mm40Var2, j4, ugg0Var);
                    }
                    w6k w6kVar3 = (w6k) fetVar.k(bmd.h);
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        zcl zclVar17 = qmk.f28987a;
                        objP = androidx.compose.runtime.e.e(new ycl(f2));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var3 = (pz40) objP;
                    mm40 mm40VarD3 = o7k0.d(mm40VarQ, 1.0f);
                    zcl zclVar18 = qmk.f28987a;
                    mm40 mm40VarE3 = o7k0.e(mm40VarD3, 64.0f);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE3);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z2 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar9 = gqw0.x;
                    jpm0.o(fetVar, tj30VarC3, shdVar9);
                    shd shdVar10 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM5, shdVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    shd shdVar11 = gqw0.y;
                    jpm0.o(fetVar, numValueOf3, shdVar11);
                    jpm0.n(fetVar);
                    shd shdVar12 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC4, shdVar12);
                    if (fy30Var instanceof zx30) {
                        fetVar.e0(-1543930234);
                        S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1543738995);
                        fetVar.r(false);
                    }
                    n0q n0qVar3 = o7k0.c;
                    if (function9 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i10 = i9;
                    if ((i10 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP2 = fetVar.P();
                    if (z4) {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarE4 = o2e.e0(y860.W(n0qVar3, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarE4);
                    fetVar.i0();
                    function11 = function9;
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar9);
                    jpm0.o(fetVar, bh90VarM6, shdVar10);
                    vqd.u(iHashCode6, fetVar, shdVar11, fetVar);
                    jpm0.o(fetVar, mm40VarC5, shdVar12);
                    function4 = function10;
                    K(gy30Var, u1c.M(2000286406, new x2g(w6kVar3, gy30Var, function4, pz40Var3), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                    if (fy30Var instanceof yx30) {
                        fetVar.e0(1235491599);
                        z5 = false;
                        R((yx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z5 = false;
                        if (fy30Var instanceof ay30) {
                            fetVar.e0(1235494541);
                            ay30 ay30Var3 = (ay30) fy30Var;
                            if (function5 == null) {
                                function13 = function11;
                            } else {
                                function13 = function5;
                            }
                            U(ay30Var3, function13, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof by30) {
                            fetVar.e0(1235502356);
                            by30 by30Var3 = (by30) fy30Var;
                            if (function5 == null) {
                                function12 = function11;
                            } else {
                                function12 = function5;
                            }
                            T(by30Var3, function12, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof cy30) {
                            fetVar.e0(1235510083);
                            V(0, fetVar);
                            fetVar.r(false);
                        } else if (fy30Var instanceof dy30) {
                            fetVar.e0(1235512301);
                            W((dy30) fy30Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-353772561);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                    fetVar.e0(-1540687603);
                    fetVar.r(z5);
                    fetVar.r(true);
                    function6 = function11;
                    mm40Var3 = mm40Var2;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function6 = function3;
                }
                function7 = function4;
                function8 = function5;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
                }
            }
            i4 |= 24576;
            function5 = function2;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                jm40Var = jm40.b;
                if (i11 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i12 != 0) {
                    function9 = null;
                } else {
                    function9 = function3;
                }
                if (i5 != 0) {
                    function4 = null;
                }
                if (i7 != 0) {
                    function5 = null;
                }
                fy30Var = gy30Var.c;
                if (list.isEmpty()) {
                    i9 = i4;
                    function10 = function4;
                    e900 e900Var4 = new e900(list, null, 0L, 9187343241974906880L);
                    zcl zclVar19 = qmk.i;
                    ugg0 ugg0Var8 = vgg0.f37379a;
                    mm40VarQ = i120.P(mm40Var2, e900Var4, new ugg0(zclVar19, zclVar19, zclVar19, zclVar19), 4);
                    f2 = 0.0f;
                    c2 = 3;
                } else {
                    i9 = i4;
                    function10 = function4;
                    long j5 = gy30Var.d;
                    iOrdinal = gy30Var.f.ordinal();
                    if (iOrdinal != 0) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar110 = qmk.i;
                        ugg0 ugg0Var9 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar110, zclVar110, zclVar110, zclVar110);
                    } else if (iOrdinal != 1) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar111 = qmk.f28987a;
                        ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        c2 = 3;
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        } else {
                            ugg0Var = jd8.n;
                            f2 = 0.0f;
                        }
                    } else {
                        c2 = 3;
                        zcl zclVar112 = qmk.f28987a;
                        f2 = 0.0f;
                        ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                    mm40VarQ = i120.Q(mm40Var2, j5, ugg0Var);
                }
                w6k w6kVar4 = (w6k) fetVar.k(bmd.h);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    zcl zclVar113 = qmk.f28987a;
                    objP = androidx.compose.runtime.e.e(new ycl(f2));
                    fetVar.o0(objP);
                }
                pz40 pz40Var4 = (pz40) objP;
                mm40 mm40VarD4 = o7k0.d(mm40VarQ, 1.0f);
                zcl zclVar114 = qmk.f28987a;
                mm40 mm40VarE5 = o7k0.e(mm40VarD4, 64.0f);
                tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                int iHashCode7 = Long.hashCode(fetVar.T);
                bh90 bh90VarM7 = fetVar.m();
                mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarE5);
                mkd.c0.getClass();
                fetVar.i0();
                z2 = fetVar.S;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar13 = gqw0.x;
                jpm0.o(fetVar, tj30VarC4, shdVar13);
                shd shdVar14 = gqw0.w;
                jpm0.o(fetVar, bh90VarM7, shdVar14);
                Integer numValueOf4 = Integer.valueOf(iHashCode7);
                shd shdVar15 = gqw0.y;
                jpm0.o(fetVar, numValueOf4, shdVar15);
                jpm0.n(fetVar);
                shd shdVar16 = gqw0.v;
                jpm0.o(fetVar, mm40VarC6, shdVar16);
                if (fy30Var instanceof zx30) {
                    fetVar.e0(-1543930234);
                    S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1543738995);
                    fetVar.r(false);
                }
                n0q n0qVar4 = o7k0.c;
                if (function9 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i10 = i9;
                if ((i10 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP2 = fetVar.P();
                if (z4) {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarE6 = o2e.e0(y860.W(n0qVar4, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode8 = Long.hashCode(fetVar.T);
                bh90 bh90VarM8 = fetVar.m();
                mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarE6);
                fetVar.i0();
                function11 = function9;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA4, shdVar13);
                jpm0.o(fetVar, bh90VarM8, shdVar14);
                vqd.u(iHashCode8, fetVar, shdVar15, fetVar);
                jpm0.o(fetVar, mm40VarC7, shdVar16);
                function4 = function10;
                K(gy30Var, u1c.M(2000286406, new x2g(w6kVar4, gy30Var, function4, pz40Var4), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                if (fy30Var instanceof yx30) {
                    fetVar.e0(1235491599);
                    z5 = false;
                    R((yx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    z5 = false;
                    if (fy30Var instanceof ay30) {
                        fetVar.e0(1235494541);
                        ay30 ay30Var4 = (ay30) fy30Var;
                        if (function5 == null) {
                            function13 = function11;
                        } else {
                            function13 = function5;
                        }
                        U(ay30Var4, function13, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof by30) {
                        fetVar.e0(1235502356);
                        by30 by30Var4 = (by30) fy30Var;
                        if (function5 == null) {
                            function12 = function11;
                        } else {
                            function12 = function5;
                        }
                        T(by30Var4, function12, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof cy30) {
                        fetVar.e0(1235510083);
                        V(0, fetVar);
                        fetVar.r(false);
                    } else if (fy30Var instanceof dy30) {
                        fetVar.e0(1235512301);
                        W((dy30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-353772561);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
                fetVar.e0(-1540687603);
                fetVar.r(z5);
                fetVar.r(true);
                function6 = function11;
                mm40Var3 = mm40Var2;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function6 = function3;
            }
            function7 = function4;
            function8 = function5;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
            }
        }
        i4 |= 384;
        function3 = function0;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                function4 = function1;
                if (fetVar.i(function4)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function5 = function2;
                    if (fetVar.i(function5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i11 != 0) {
                        mm40Var2 = jm40Var;
                    }
                    if (i12 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    }
                    fy30Var = gy30Var.c;
                    if (list.isEmpty()) {
                        i9 = i4;
                        function10 = function4;
                        e900 e900Var5 = new e900(list, null, 0L, 9187343241974906880L);
                        zcl zclVar115 = qmk.i;
                        ugg0 ugg0Var10 = vgg0.f37379a;
                        mm40VarQ = i120.P(mm40Var2, e900Var5, new ugg0(zclVar115, zclVar115, zclVar115, zclVar115), 4);
                        f2 = 0.0f;
                        c2 = 3;
                    } else {
                        i9 = i4;
                        function10 = function4;
                        long j6 = gy30Var.d;
                        iOrdinal = gy30Var.f.ordinal();
                        if (iOrdinal != 0) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar116 = qmk.i;
                            ugg0 ugg0Var11 = vgg0.f37379a;
                            ugg0Var = new ugg0(zclVar116, zclVar116, zclVar116, zclVar116);
                        } else if (iOrdinal != 1) {
                            f2 = 0.0f;
                            c2 = 3;
                            zcl zclVar117 = qmk.f28987a;
                            ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                        } else if (iOrdinal != 2) {
                            c2 = 3;
                            if (iOrdinal == 3) {
                                t9f.b();
                                return;
                            } else {
                                ugg0Var = jd8.n;
                                f2 = 0.0f;
                            }
                        } else {
                            c2 = 3;
                            zcl zclVar118 = qmk.f28987a;
                            f2 = 0.0f;
                            ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                        }
                        mm40VarQ = i120.Q(mm40Var2, j6, ugg0Var);
                    }
                    w6k w6kVar5 = (w6k) fetVar.k(bmd.h);
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        zcl zclVar119 = qmk.f28987a;
                        objP = androidx.compose.runtime.e.e(new ycl(f2));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var5 = (pz40) objP;
                    mm40 mm40VarD5 = o7k0.d(mm40VarQ, 1.0f);
                    zcl zclVar1110 = qmk.f28987a;
                    mm40 mm40VarE7 = o7k0.e(mm40VarD5, 64.0f);
                    tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                    int iHashCode9 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM9 = fetVar.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarE7);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z2 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar17 = gqw0.x;
                    jpm0.o(fetVar, tj30VarC5, shdVar17);
                    shd shdVar18 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM9, shdVar18);
                    Integer numValueOf5 = Integer.valueOf(iHashCode9);
                    shd shdVar19 = gqw0.y;
                    jpm0.o(fetVar, numValueOf5, shdVar19);
                    jpm0.n(fetVar);
                    shd shdVar110 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC8, shdVar110);
                    if (fy30Var instanceof zx30) {
                        fetVar.e0(-1543930234);
                        S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1543738995);
                        fetVar.r(false);
                    }
                    n0q n0qVar5 = o7k0.c;
                    if (function9 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i10 = i9;
                    if ((i10 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP2 = fetVar.P();
                    if (z4) {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new pk9(function9, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarE8 = o2e.e0(y860.W(n0qVar5, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                    thg0 thg0VarA5 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode10 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM10 = fetVar.m();
                    mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarE8);
                    fetVar.i0();
                    function11 = function9;
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA5, shdVar17);
                    jpm0.o(fetVar, bh90VarM10, shdVar18);
                    vqd.u(iHashCode10, fetVar, shdVar19, fetVar);
                    jpm0.o(fetVar, mm40VarC9, shdVar110);
                    function4 = function10;
                    K(gy30Var, u1c.M(2000286406, new x2g(w6kVar5, gy30Var, function4, pz40Var5), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                    if (fy30Var instanceof yx30) {
                        fetVar.e0(1235491599);
                        z5 = false;
                        R((yx30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z5 = false;
                        if (fy30Var instanceof ay30) {
                            fetVar.e0(1235494541);
                            ay30 ay30Var5 = (ay30) fy30Var;
                            if (function5 == null) {
                                function13 = function11;
                            } else {
                                function13 = function5;
                            }
                            U(ay30Var5, function13, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof by30) {
                            fetVar.e0(1235502356);
                            by30 by30Var5 = (by30) fy30Var;
                            if (function5 == null) {
                                function12 = function11;
                            } else {
                                function12 = function5;
                            }
                            T(by30Var5, function12, fetVar, 0);
                            fetVar.r(false);
                        } else if (fy30Var instanceof cy30) {
                            fetVar.e0(1235510083);
                            V(0, fetVar);
                            fetVar.r(false);
                        } else if (fy30Var instanceof dy30) {
                            fetVar.e0(1235512301);
                            W((dy30) fy30Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-353772561);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                    fetVar.e0(-1540687603);
                    fetVar.r(z5);
                    fetVar.r(true);
                    function6 = function11;
                    mm40Var3 = mm40Var2;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function6 = function3;
                }
                function7 = function4;
                function8 = function5;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
                }
            }
            i4 |= 24576;
            function5 = function2;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                jm40Var = jm40.b;
                if (i11 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i12 != 0) {
                    function9 = null;
                } else {
                    function9 = function3;
                }
                if (i5 != 0) {
                    function4 = null;
                }
                if (i7 != 0) {
                    function5 = null;
                }
                fy30Var = gy30Var.c;
                if (list.isEmpty()) {
                    i9 = i4;
                    function10 = function4;
                    e900 e900Var6 = new e900(list, null, 0L, 9187343241974906880L);
                    zcl zclVar1111 = qmk.i;
                    ugg0 ugg0Var12 = vgg0.f37379a;
                    mm40VarQ = i120.P(mm40Var2, e900Var6, new ugg0(zclVar1111, zclVar1111, zclVar1111, zclVar1111), 4);
                    f2 = 0.0f;
                    c2 = 3;
                } else {
                    i9 = i4;
                    function10 = function4;
                    long j7 = gy30Var.d;
                    iOrdinal = gy30Var.f.ordinal();
                    if (iOrdinal != 0) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar1112 = qmk.i;
                        ugg0 ugg0Var13 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar1112, zclVar1112, zclVar1112, zclVar1112);
                    } else if (iOrdinal != 1) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar1113 = qmk.f28987a;
                        ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        c2 = 3;
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        } else {
                            ugg0Var = jd8.n;
                            f2 = 0.0f;
                        }
                    } else {
                        c2 = 3;
                        zcl zclVar1114 = qmk.f28987a;
                        f2 = 0.0f;
                        ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                    mm40VarQ = i120.Q(mm40Var2, j7, ugg0Var);
                }
                w6k w6kVar6 = (w6k) fetVar.k(bmd.h);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    zcl zclVar1115 = qmk.f28987a;
                    objP = androidx.compose.runtime.e.e(new ycl(f2));
                    fetVar.o0(objP);
                }
                pz40 pz40Var6 = (pz40) objP;
                mm40 mm40VarD6 = o7k0.d(mm40VarQ, 1.0f);
                zcl zclVar1116 = qmk.f28987a;
                mm40 mm40VarE9 = o7k0.e(mm40VarD6, 64.0f);
                tj30 tj30VarC6 = zq8.c(gqw0.f11754a, false);
                int iHashCode11 = Long.hashCode(fetVar.T);
                bh90 bh90VarM11 = fetVar.m();
                mm40 mm40VarC10 = kbc.c0(fetVar, mm40VarE9);
                mkd.c0.getClass();
                fetVar.i0();
                z2 = fetVar.S;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar111 = gqw0.x;
                jpm0.o(fetVar, tj30VarC6, shdVar111);
                shd shdVar112 = gqw0.w;
                jpm0.o(fetVar, bh90VarM11, shdVar112);
                Integer numValueOf6 = Integer.valueOf(iHashCode11);
                shd shdVar113 = gqw0.y;
                jpm0.o(fetVar, numValueOf6, shdVar113);
                jpm0.n(fetVar);
                shd shdVar114 = gqw0.v;
                jpm0.o(fetVar, mm40VarC10, shdVar114);
                if (fy30Var instanceof zx30) {
                    fetVar.e0(-1543930234);
                    S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1543738995);
                    fetVar.r(false);
                }
                n0q n0qVar6 = o7k0.c;
                if (function9 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i10 = i9;
                if ((i10 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP2 = fetVar.P();
                if (z4) {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarE10 = o2e.e0(y860.W(n0qVar6, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                thg0 thg0VarA6 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode12 = Long.hashCode(fetVar.T);
                bh90 bh90VarM12 = fetVar.m();
                mm40 mm40VarC11 = kbc.c0(fetVar, mm40VarE10);
                fetVar.i0();
                function11 = function9;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA6, shdVar111);
                jpm0.o(fetVar, bh90VarM12, shdVar112);
                vqd.u(iHashCode12, fetVar, shdVar113, fetVar);
                jpm0.o(fetVar, mm40VarC11, shdVar114);
                function4 = function10;
                K(gy30Var, u1c.M(2000286406, new x2g(w6kVar6, gy30Var, function4, pz40Var6), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                if (fy30Var instanceof yx30) {
                    fetVar.e0(1235491599);
                    z5 = false;
                    R((yx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    z5 = false;
                    if (fy30Var instanceof ay30) {
                        fetVar.e0(1235494541);
                        ay30 ay30Var6 = (ay30) fy30Var;
                        if (function5 == null) {
                            function13 = function11;
                        } else {
                            function13 = function5;
                        }
                        U(ay30Var6, function13, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof by30) {
                        fetVar.e0(1235502356);
                        by30 by30Var6 = (by30) fy30Var;
                        if (function5 == null) {
                            function12 = function11;
                        } else {
                            function12 = function5;
                        }
                        T(by30Var6, function12, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof cy30) {
                        fetVar.e0(1235510083);
                        V(0, fetVar);
                        fetVar.r(false);
                    } else if (fy30Var instanceof dy30) {
                        fetVar.e0(1235512301);
                        W((dy30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-353772561);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
                fetVar.e0(-1540687603);
                fetVar.r(z5);
                fetVar.r(true);
                function6 = function11;
                mm40Var3 = mm40Var2;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function6 = function3;
            }
            function7 = function4;
            function8 = function5;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
            }
        }
        i4 |= 3072;
        function4 = function1;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                function5 = function2;
                if (fetVar.i(function5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                jm40Var = jm40.b;
                if (i11 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i12 != 0) {
                    function9 = null;
                } else {
                    function9 = function3;
                }
                if (i5 != 0) {
                    function4 = null;
                }
                if (i7 != 0) {
                    function5 = null;
                }
                fy30Var = gy30Var.c;
                if (list.isEmpty()) {
                    i9 = i4;
                    function10 = function4;
                    e900 e900Var7 = new e900(list, null, 0L, 9187343241974906880L);
                    zcl zclVar1117 = qmk.i;
                    ugg0 ugg0Var14 = vgg0.f37379a;
                    mm40VarQ = i120.P(mm40Var2, e900Var7, new ugg0(zclVar1117, zclVar1117, zclVar1117, zclVar1117), 4);
                    f2 = 0.0f;
                    c2 = 3;
                } else {
                    i9 = i4;
                    function10 = function4;
                    long j8 = gy30Var.d;
                    iOrdinal = gy30Var.f.ordinal();
                    if (iOrdinal != 0) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar1118 = qmk.i;
                        ugg0 ugg0Var15 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar1118, zclVar1118, zclVar1118, zclVar1118);
                    } else if (iOrdinal != 1) {
                        f2 = 0.0f;
                        c2 = 3;
                        zcl zclVar1119 = qmk.f28987a;
                        ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        c2 = 3;
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        } else {
                            ugg0Var = jd8.n;
                            f2 = 0.0f;
                        }
                    } else {
                        c2 = 3;
                        zcl zclVar11110 = qmk.f28987a;
                        f2 = 0.0f;
                        ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                    mm40VarQ = i120.Q(mm40Var2, j8, ugg0Var);
                }
                w6k w6kVar7 = (w6k) fetVar.k(bmd.h);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    zcl zclVar11111 = qmk.f28987a;
                    objP = androidx.compose.runtime.e.e(new ycl(f2));
                    fetVar.o0(objP);
                }
                pz40 pz40Var7 = (pz40) objP;
                mm40 mm40VarD7 = o7k0.d(mm40VarQ, 1.0f);
                zcl zclVar11112 = qmk.f28987a;
                mm40 mm40VarE11 = o7k0.e(mm40VarD7, 64.0f);
                tj30 tj30VarC7 = zq8.c(gqw0.f11754a, false);
                int iHashCode13 = Long.hashCode(fetVar.T);
                bh90 bh90VarM13 = fetVar.m();
                mm40 mm40VarC12 = kbc.c0(fetVar, mm40VarE11);
                mkd.c0.getClass();
                fetVar.i0();
                z2 = fetVar.S;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar115 = gqw0.x;
                jpm0.o(fetVar, tj30VarC7, shdVar115);
                shd shdVar116 = gqw0.w;
                jpm0.o(fetVar, bh90VarM13, shdVar116);
                Integer numValueOf7 = Integer.valueOf(iHashCode13);
                shd shdVar117 = gqw0.y;
                jpm0.o(fetVar, numValueOf7, shdVar117);
                jpm0.n(fetVar);
                shd shdVar118 = gqw0.v;
                jpm0.o(fetVar, mm40VarC12, shdVar118);
                if (fy30Var instanceof zx30) {
                    fetVar.e0(-1543930234);
                    S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1543738995);
                    fetVar.r(false);
                }
                n0q n0qVar7 = o7k0.c;
                if (function9 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i10 = i9;
                if ((i10 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP2 = fetVar.P();
                if (z4) {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new pk9(function9, (byte) 27);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarE12 = o2e.e0(y860.W(n0qVar7, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
                thg0 thg0VarA7 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode14 = Long.hashCode(fetVar.T);
                bh90 bh90VarM14 = fetVar.m();
                mm40 mm40VarC13 = kbc.c0(fetVar, mm40VarE12);
                fetVar.i0();
                function11 = function9;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA7, shdVar115);
                jpm0.o(fetVar, bh90VarM14, shdVar116);
                vqd.u(iHashCode14, fetVar, shdVar117, fetVar);
                jpm0.o(fetVar, mm40VarC13, shdVar118);
                function4 = function10;
                K(gy30Var, u1c.M(2000286406, new x2g(w6kVar7, gy30Var, function4, pz40Var7), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
                if (fy30Var instanceof yx30) {
                    fetVar.e0(1235491599);
                    z5 = false;
                    R((yx30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    z5 = false;
                    if (fy30Var instanceof ay30) {
                        fetVar.e0(1235494541);
                        ay30 ay30Var7 = (ay30) fy30Var;
                        if (function5 == null) {
                            function13 = function11;
                        } else {
                            function13 = function5;
                        }
                        U(ay30Var7, function13, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof by30) {
                        fetVar.e0(1235502356);
                        by30 by30Var7 = (by30) fy30Var;
                        if (function5 == null) {
                            function12 = function11;
                        } else {
                            function12 = function5;
                        }
                        T(by30Var7, function12, fetVar, 0);
                        fetVar.r(false);
                    } else if (fy30Var instanceof cy30) {
                        fetVar.e0(1235510083);
                        V(0, fetVar);
                        fetVar.r(false);
                    } else if (fy30Var instanceof dy30) {
                        fetVar.e0(1235512301);
                        W((dy30) fy30Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-353772561);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
                fetVar.e0(-1540687603);
                fetVar.r(z5);
                fetVar.r(true);
                function6 = function11;
                mm40Var3 = mm40Var2;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function6 = function3;
            }
            function7 = function4;
            function8 = function5;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
            }
        }
        i4 |= 24576;
        function5 = function2;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            jm40Var = jm40.b;
            if (i11 != 0) {
                mm40Var2 = jm40Var;
            }
            if (i12 != 0) {
                function9 = null;
            } else {
                function9 = function3;
            }
            if (i5 != 0) {
                function4 = null;
            }
            if (i7 != 0) {
                function5 = null;
            }
            fy30Var = gy30Var.c;
            if (list.isEmpty()) {
                i9 = i4;
                function10 = function4;
                e900 e900Var8 = new e900(list, null, 0L, 9187343241974906880L);
                zcl zclVar11113 = qmk.i;
                ugg0 ugg0Var16 = vgg0.f37379a;
                mm40VarQ = i120.P(mm40Var2, e900Var8, new ugg0(zclVar11113, zclVar11113, zclVar11113, zclVar11113), 4);
                f2 = 0.0f;
                c2 = 3;
            } else {
                i9 = i4;
                function10 = function4;
                long j9 = gy30Var.d;
                iOrdinal = gy30Var.f.ordinal();
                if (iOrdinal != 0) {
                    f2 = 0.0f;
                    c2 = 3;
                    zcl zclVar11114 = qmk.i;
                    ugg0 ugg0Var17 = vgg0.f37379a;
                    ugg0Var = new ugg0(zclVar11114, zclVar11114, zclVar11114, zclVar11114);
                } else if (iOrdinal != 1) {
                    f2 = 0.0f;
                    c2 = 3;
                    zcl zclVar11115 = qmk.f28987a;
                    ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else if (iOrdinal != 2) {
                    c2 = 3;
                    if (iOrdinal == 3) {
                        t9f.b();
                        return;
                    } else {
                        ugg0Var = jd8.n;
                        f2 = 0.0f;
                    }
                } else {
                    c2 = 3;
                    zcl zclVar11116 = qmk.f28987a;
                    f2 = 0.0f;
                    ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                }
                mm40VarQ = i120.Q(mm40Var2, j9, ugg0Var);
            }
            w6k w6kVar8 = (w6k) fetVar.k(bmd.h);
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar11117 = qmk.f28987a;
                objP = androidx.compose.runtime.e.e(new ycl(f2));
                fetVar.o0(objP);
            }
            pz40 pz40Var8 = (pz40) objP;
            mm40 mm40VarD8 = o7k0.d(mm40VarQ, 1.0f);
            zcl zclVar11118 = qmk.f28987a;
            mm40 mm40VarE13 = o7k0.e(mm40VarD8, 64.0f);
            tj30 tj30VarC8 = zq8.c(gqw0.f11754a, false);
            int iHashCode15 = Long.hashCode(fetVar.T);
            bh90 bh90VarM15 = fetVar.m();
            mm40 mm40VarC14 = kbc.c0(fetVar, mm40VarE13);
            mkd.c0.getClass();
            fetVar.i0();
            z2 = fetVar.S;
            pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar119 = gqw0.x;
            jpm0.o(fetVar, tj30VarC8, shdVar119);
            shd shdVar1110 = gqw0.w;
            jpm0.o(fetVar, bh90VarM15, shdVar1110);
            Integer numValueOf8 = Integer.valueOf(iHashCode15);
            shd shdVar1111 = gqw0.y;
            jpm0.o(fetVar, numValueOf8, shdVar1111);
            jpm0.n(fetVar);
            shd shdVar1112 = gqw0.v;
            jpm0.o(fetVar, mm40VarC14, shdVar1112);
            if (fy30Var instanceof zx30) {
                fetVar.e0(-1543930234);
                S(o2e.e0(jr8.f16991a.b(jm40Var, gqw0.f), "MENU_RIGHT_SIDE_BANNER"), (zx30) fy30Var, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1543738995);
                fetVar.r(false);
            }
            n0q n0qVar8 = o7k0.c;
            if (function9 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            i10 = i9;
            if ((i10 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP2 = fetVar.P();
            if (z4) {
                objP2 = new pk9(function9, (byte) 27);
                fetVar.o0(objP2);
            } else {
                objP2 = new pk9(function9, (byte) 27);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE14 = o2e.e0(y860.W(n0qVar8, null, null, z3, null, (Function0) objP2, 24), "DS_MENU_CELL");
            thg0 thg0VarA8 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode16 = Long.hashCode(fetVar.T);
            bh90 bh90VarM16 = fetVar.m();
            mm40 mm40VarC15 = kbc.c0(fetVar, mm40VarE14);
            fetVar.i0();
            function11 = function9;
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA8, shdVar119);
            jpm0.o(fetVar, bh90VarM16, shdVar1110);
            vqd.u(iHashCode16, fetVar, shdVar1111, fetVar);
            jpm0.o(fetVar, mm40VarC15, shdVar1112);
            function4 = function10;
            K(gy30Var, u1c.M(2000286406, new x2g(w6kVar8, gy30Var, function4, pz40Var8), fetVar), u1c.M(-1730870071, new awh(gy30Var, (byte) 25), fetVar), fetVar, ((i10 >> 3) & 14) | 432);
            if (fy30Var instanceof yx30) {
                fetVar.e0(1235491599);
                z5 = false;
                R((yx30) fy30Var, fetVar, 0);
                fetVar.r(false);
            } else {
                z5 = false;
                if (fy30Var instanceof ay30) {
                    fetVar.e0(1235494541);
                    ay30 ay30Var8 = (ay30) fy30Var;
                    if (function5 == null) {
                        function13 = function11;
                    } else {
                        function13 = function5;
                    }
                    U(ay30Var8, function13, fetVar, 0);
                    fetVar.r(false);
                } else if (fy30Var instanceof by30) {
                    fetVar.e0(1235502356);
                    by30 by30Var8 = (by30) fy30Var;
                    if (function5 == null) {
                        function12 = function11;
                    } else {
                        function12 = function5;
                    }
                    T(by30Var8, function12, fetVar, 0);
                    fetVar.r(false);
                } else if (fy30Var instanceof cy30) {
                    fetVar.e0(1235510083);
                    V(0, fetVar);
                    fetVar.r(false);
                } else if (fy30Var instanceof dy30) {
                    fetVar.e0(1235512301);
                    W((dy30) fy30Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-353772561);
                    fetVar.r(false);
                }
            }
            fetVar.r(true);
            fetVar.e0(-1540687603);
            fetVar.r(z5);
            fetVar.r(true);
            function6 = function11;
            mm40Var3 = mm40Var2;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            function6 = function3;
        }
        function7 = function4;
        function8 = function5;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var3, (Object) gy30Var, (Object) function6, (Object) function7, (Object) function8, i2, i3, (byte) 5);
        }
    }

    public static final g5a0 y0(long j2, String str, List list, boolean z) {
        zfp zfpVar;
        c280 c280Var = new c280(vsm0.s(j2, str), R.drawable.ic_glyph_placeholder_player);
        if (z) {
            zfpVar = null;
        } else {
            boolean z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((xcp) it.next()).f40657a == j2) {
                        z2 = true;
                        break;
                    }
                }
            }
            zfpVar = new zfp(j2, z2, z9p.f44030a);
        }
        return new g5a0(c280Var, zfpVar);
    }

    public static final void z(mm40 mm40Var, uzm uzmVar, uzm uzmVar2, mpm mpmVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z, fet fetVar, int i2) {
        int i3;
        k6z k6zVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar.g0(553697353);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uzmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(uzmVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(mpmVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? fetVar.g(jwmVar) : fetVar.i(jwmVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? fetVar.g(jwmVar2) : fetVar.i(jwmVar2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? fetVar.g(jwmVar3) : fetVar.i(jwmVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.e(0) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            if (z) {
                fetVar.e0(-472770320);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-472769396);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(476361609, new ntm(mm40Var, uzmVar, uzmVar2, mpmVar, z, jwmVar, jwmVar2, jwmVar3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, uzmVar, uzmVar2, mpmVar, jwmVar, jwmVar2, jwmVar3, z, i2);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final a.yv6 z0(a.dx6 r22, a.ctf0 r23, a.mnb0 r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jiq0.z0(a.dx6, a.ctf0, a.mnb0, java.lang.String, boolean):a.yv6");
    }
}
