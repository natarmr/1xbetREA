package a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.javax.sip.message.Response;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.Window;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j47 implements bwn, cld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f15870a;
    public static final ugd c;
    public static final ugd b = new ugd(369637882, false, new chd(13));
    public static final ugd d = new ugd(988179457, false, new ihd(7));
    public static final ugd e = new ugd(2117465672, false, new ihd(8));
    public static final ugd f = new ugd(532347763, false, new ihd(9));
    public static final ugd g = new ugd(798699216, false, new ihd(10));
    public static final ugd h = new ugd(-1122775971, false, new fhd(25));
    public static final ugd i = new ugd(684404777, false, new mhd(22));
    public static final String[] j = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String[] k = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    public static final String[] l = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system_ext/bin/", "/cache/", "/data/", "/dev/"};
    public static final String[] m = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static final Class[] n = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final nho o = new nho(1);
    public static final nav0 p = new nav0(0.31006f, 0.31616f);
    public static final nav0 q = new nav0(0.34567f, 0.3585f);
    public static final nav0 r = new nav0(0.32168f, 0.33767f);
    public static final nav0 s = new nav0(0.31271f, 0.32902f);
    public static final float[] t = {0.964212f, 1.0f, 0.825188f};

    static {
        byte b2 = 14;
        f15870a = new ugd(2041383741, false, new i5b(b2));
        c = new ugd(1260712504, false, new chd(b2));
    }

    public static boolean A0(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static final void B0(Context context, Intent intent) {
        Object g0g0Var;
        context.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = context.startService(intent);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            try {
                context.stopService(intent);
            } catch (Throwable unused) {
                e0g0 e0g0Var3 = j0g0.b;
            }
        }
    }

    public static final y00 C0(ly6 ly6Var) {
        w00 t00Var;
        h580 h580Var = ly6Var.c;
        String str = ly6Var.b.e;
        h580Var.getClass();
        str.getClass();
        if (h580Var instanceof f580) {
            t00Var = new u00(((f580) h580Var).f8949a, true, str);
        } else if (h580Var instanceof e580) {
            e580 e580Var = (e580) h580Var;
            t00Var = new v00(new aop0(e580Var.f7221a, e580Var.c), new aop0(e580Var.b, e580Var.d), str);
        } else if (h580Var instanceof d580) {
            d580 d580Var = (d580) h580Var;
            t00Var = new s00(d580Var.f5493a, d580Var.b, str);
        } else {
            if (!(h580Var instanceof g580)) {
                t9f.b();
                return null;
            }
            g580 g580Var = (g580) h580Var;
            t00Var = new t00(new Pair(new aop0(g580Var.f10706a, g580Var.c), new aop0("", g580Var.d)), new Pair(new aop0(g580Var.b, g580Var.e), new aop0("", g580Var.f)), str);
        }
        ld5 ld5Var = ly6Var.f20850a;
        return new y00(t00Var, ld5Var.f19833a, ld5Var.b);
    }

    public static final AggregatorProvidersFiltersUiModel D0(List list, AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        Object next;
        long j2 = aggregatorProvidersFiltersUiModel.f46276a;
        List<FilterCategoryUiModel> list2 = aggregatorProvidersFiltersUiModel.b;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (FilterCategoryUiModel filterCategoryUiModel : list2) {
            List<FilterItemUi> list3 = filterCategoryUiModel.d;
            if (list3 == null || !list3.isEmpty()) {
                for (FilterItemUi filterItemUi : list3) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            FilterItemUi filterItemUi2 = (FilterItemUi) it.next();
                            if (Intrinsics.d(filterItemUi2.getF46280a(), filterItemUi.getF46280a()) && filterItemUi.getClass().equals(filterItemUi2.getClass())) {
                                String str = filterCategoryUiModel.f46277a;
                                String str2 = filterCategoryUiModel.b;
                                w3q w3qVar = filterCategoryUiModel.c;
                                List<FilterItemUi> list4 = filterCategoryUiModel.d;
                                ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                                for (FilterItemUi filterItemUi3 : list4) {
                                    Iterator it2 = list.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!Intrinsics.d(((FilterItemUi) next).getF46280a(), filterItemUi3.getF46280a()));
                                    FilterItemUi filterItemUi4 = (FilterItemUi) next;
                                    arrayList2.add((filterItemUi4 == null || !filterItemUi3.getClass().equals(filterItemUi4.getClass())) ? filterItemUi3.O(false) : filterItemUi3.O(!filterItemUi3.getC()));
                                }
                                filterCategoryUiModel = new FilterCategoryUiModel(str, str2, w3qVar, arrayList2);
                                break;
                            }
                        }
                    }
                }
            }
            arrayList.add(filterCategoryUiModel);
        }
        return new AggregatorProvidersFiltersUiModel(j2, arrayList, aggregatorProvidersFiltersUiModel.c);
    }

    public static final zb6 E0(xb6 xb6Var) {
        xb6Var.getClass();
        String str = xb6Var.c;
        String str2 = xb6Var.b;
        String strR = xb6Var.e;
        if (ttm0.M(2, strR).equals(".0")) {
            strR = kotlin.text.c.r(strR, ".0", "", false);
        }
        return new zb6(str2, str, xb6Var.f, strR.concat(Separators.PERCENT));
    }

    public static final void F(mm40 mm40Var, tno0 tno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Object obj;
        Function1 function2;
        function1.getClass();
        fetVar.g0(1790230943);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(tno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            byte b2 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(tno0Var.f34246a);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zG = (i5 == 256) | (i4 == 32) | fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                obj = obj2;
                Object m1Var = new m1((Object) tno0Var, (Object) xczVarA, (Object) function1, (yje) null, (byte) 6);
                function2 = function1;
                fetVar.o0(m1Var);
                objP = m1Var;
            } else {
                function2 = function1;
                obj = obj2;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "MENU_ACCORDION_GRID");
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 20.0f, fetVar);
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new k1(tno0Var, function2, b2);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarF, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) tno0Var, (Object) function1, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[PHI: r1
  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static p15 F0(int i2) {
        int i3 = 6;
        if (i2 != 0) {
            int i4 = 1;
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = i4;
            } else {
                i4 = 5;
                if (i2 == 3) {
                    i3 = i4;
                } else if (i2 == 4) {
                    i3 = 3;
                } else if (i2 != 5) {
                    if (i2 == 6) {
                        i3 = 2;
                    } else {
                        i4 = 7;
                        if (i2 != 7 && i2 != 8) {
                            if (i2 == 9) {
                                i3 = 4;
                            } else if (i2 == 10) {
                                i3 = i4;
                            } else if (i2 != 11 && i2 != 12 && i2 != 13) {
                                ohq.k(az9.a(i2), "Unexpected CameraError: ");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return new p15(i3);
    }

    public static final void G(mm40 mm40Var, pqv pqvVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        fetVar.g0(-1061841165);
        int i3 = i2 | 6 | (fetVar.g(pqvVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean zF0 = pqvVar.f0();
            jm40 jm40Var = jm40.b;
            if (zF0) {
                mm40VarN = jm40Var;
            } else {
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            }
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new n8(function1, pqvVar, b2);
                fetVar.o0(objP);
            }
            zvw.c(mm40VarN, pqvVar, (Function0) objP, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o8(mm40Var2, pqvVar, function1, i2, (byte) 0);
        }
    }

    public static final List G0(List list) {
        list.getClass();
        c5q c5qVarH = pgi0.h(pgi0.p(pgi0.h(new sx3(list, (byte) 1), h47.b), i47.f14133a), new h26((byte) 18));
        return pgi0.f(c5qVarH) == list.size() ? kotlin.collections.a.c(z5w.u) : pgi0.t(c5qVarH);
    }

    public static final void H(mm40 mm40Var, long j2, long j3, vhv0 vhv0Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        byte b2;
        fetVar.g0(-1533213329);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(vhv0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i4 = (i3 & 7168) ^ 3072;
            boolean z = (i4 > 2048 && fetVar.g(vhv0Var)) || (i3 & 3072) == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.e(vhv0Var);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zG = fetVar.g(pz40Var) | ((i4 > 2048 && fetVar.g(vhv0Var)) || (i3 & 3072) == 2048);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                b2 = 1;
                objP2 = new tv2(pz40Var, vhv0Var, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 1;
            }
            int i5 = i3 << 3;
            gmn0.a(j120.a0(mm40Var, (Function1) objP2), null, j2, j3, 0.0f, 0.0f, null, u1c.M(1297077578, new uv2(pz40Var, ugdVar, ugdVar2, b2), fetVar), fetVar, (i5 & 896) | 12582912 | (i5 & 7168), 114);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vv2(mm40Var, j2, j3, vhv0Var, ugdVar, ugdVar2, i2, (byte) 1);
        }
    }

    public static String H0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (A0(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (A0(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void I(l7m0 l7m0Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        fetVar.g0(1333840385);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(ugdVar) ? 32 : 16) | (fetVar.i(ugdVar2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new zv2();
                fetVar.o0(objP);
            }
            zv2 zv2Var = (zv2) objP;
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ugd(4285156, true, new w(ugdVar, b2));
                fetVar.o0(objP2);
            }
            Function2 function2 = (Function2) objP2;
            boolean z2 = (i3 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new ugd(-1599112703, true, new sr1(ugdVar2, zv2Var, (byte) 9));
                fetVar.o0(objP3);
            }
            Function2 function3 = (Function2) objP3;
            boolean zG = ((i3 & 14) == 4) | fetVar.g(function2) | fetVar.g(function3);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                iop iopVar = new iop(function2, l7m0Var, zv2Var, function3, (byte) 17);
                fetVar.o0(iopVar);
                objP4 = iopVar;
            }
            x4n0.a(null, (Function2) objP4, fetVar, 0, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wv2(l7m0Var, ugdVar, ugdVar2, i2, (byte) 1);
        }
    }

    public static String I0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, float f2, float f3, float f4, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        byte b2;
        fet fetVar3 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar3.g0(-1406893869);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar3.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar3.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar3.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar3.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar3.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar3.i(function1) ? 1048576 : 524288;
        }
        if (fetVar3.U(i3 & 1, (599187 & i3) != 599186)) {
            float f5 = xfn.a(fetVar3).d;
            Object[] objArr = new Object[0];
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar3.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new jb(l7m0Var, (byte) 22);
                fetVar3.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            Object objP2 = fetVar3.P();
            if (objP2 == obj) {
                b2 = 1;
                Object fbnVar = new fbn(new za3(f2, f4, b2));
                fetVar3.o0(fbnVar);
                objP2 = fbnVar;
            } else {
                b2 = 1;
            }
            s3e s3eVar = (s3e) objP2;
            Object objP3 = fetVar3.P();
            if (objP3 == obj) {
                Object fbnVar2 = new fbn(new za3(f3, f4, (byte) 0));
                fetVar3.o0(fbnVar2);
                objP3 = fbnVar2;
            }
            s3e s3eVar2 = (s3e) objP3;
            float fFloatValue = ((Number) l7m0Var2.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP4 = fetVar3.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar3.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object objP5 = fetVar3.P();
            Object obj2 = objP5;
            if (objP5 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar3.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            ugd ugdVarM = u1c.M(284503157, new fb3(pz40Var, lwfVar, nie0Var2, l7m0Var, f5, function1, l7m0VarY, l7m0Var2), fetVar3);
            mm40Var2 = jm40Var;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarD2, pz40Var, nie0Var2, lwfVar, ugdVarM, fetVar, 805330998);
            fet fetVar4 = fetVar;
            fetVar4.r(b2);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new db3(mm40Var2, l7m0Var, l7m0Var2, f2, f3, f4, function1, i2);
        }
    }

    public static final void K(int i2, int i3, fet fetVar, mm40 mm40Var, String str) {
        int i4;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(437790124);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        int i6 = i4 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i6 & 1, (i6 & 19) != 18)) {
            mm40Var2 = i5 != 0 ? jm40.b : mm40Var;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            L(0, fetVar, null);
            M(0, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var2, str, i2, i3, (byte) 0);
        }
    }

    public static final void L(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1488935995);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_move_horizontal_small, 6, fetVar), fetVar), null, i120.Q(o7k0.n(jm40Var, 14.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), vgg0.f37379a), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 18);
        }
    }

    public static final void M(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-126646329);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, (i3 >> 3) & 14, 24960, 110588);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i2, (byte) 4);
        }
    }

    public static final void N(l7m0 l7m0Var, fet fetVar, int i2) {
        int i3;
        n0q n0qVar;
        fetVar.g0(-1927469533);
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2);
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            zfn zfnVar = j7x.f16059a;
            long updateGradientStart = ((IndividualColors) fetVar.k(zfnVar)).getUpdateGradientStart();
            long updateGradientEnd = ((IndividualColors) fetVar.k(zfnVar)).getUpdateGradientEnd();
            boolean zG = fetVar.g((String) l7m0Var.getValue());
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                e900 e900Var = new e900(q3d.j(new y3d(updateGradientStart), new y3d(updateGradientEnd)), null, 0L, 9187343241974906880L);
                fetVar.o0(e900Var);
                objP = e900Var;
            }
            t89 t89Var = (t89) objP;
            if (((CharSequence) l7m0Var.getValue()).length() > 0) {
                fetVar.e0(-1826500653);
                n0qVar = o7k0.c;
                i3 = 0;
                k7x.b((String) l7m0Var.getValue(), null, n0qVar, new hb3(t89Var), new hb3(t89Var), new hb3(t89Var), null, null, null, gqw0.b, gqw0.A, null, fetVar, 805605808, 6, 31168);
                fetVar.r(false);
            } else {
                i3 = 0;
                fetVar.e0(-1826104318);
                n0qVar = o7k0.c;
                zq8.a(0, fetVar, i120.P(n0qVar, t89Var, null, 6));
                fetVar.r(false);
            }
            zq8.a(i3, fetVar, i120.Q(n0qVar, ((StaticColors) fetVar.k(m8m0.f21378a)).m71getBlack300d7_KjU(), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i2, (byte) 1);
        }
    }

    public static final void O(mm40 mm40Var, tc7 tc7Var, fet fetVar, int i2) {
        fetVar.g0(-650842881);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(tc7Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40Var, background, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = tc7Var.f33705a;
            iln ilnVar = tc7Var.c;
            jm40 jm40Var = jm40.b;
            W(6, fetVar, jm40Var, str);
            T(6, fetVar, jm40Var, tc7Var.b);
            if (ilnVar instanceof gln) {
                fetVar.e0(-849815666);
                X(jm40Var, (gln) ilnVar, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-849662867);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, tc7Var, i2, b2);
        }
    }

    public static final void P(mm40 mm40Var, lda ldaVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1549228145);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ldaVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarE, 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            String str = ldaVar.f19840a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, ldaVar, i2, (byte) 28);
        }
    }

    public static final void Q(mm40 mm40Var, wka wkaVar, Function2 function2, fet fetVar, int i2) {
        wkaVar.getClass();
        fetVar.g0(1007559710);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(wkaVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            ny9.e(mm40Var, u1c.M(1439971884, new pka(wkaVar, b3), fetVar), u1c.M(456978507, new ec30(wkaVar, function2, (byte) 14), fetVar), u1c.M(-526014870, new pka(wkaVar, b2), fetVar), fetVar, (i3 & 14) | 28032, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, wkaVar, function2, i2, (byte) 25);
        }
    }

    public static final void R(mm40 mm40Var, xeb xebVar, boolean z, boolean z2, e2d e2dVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        jm40 jm40Var;
        xeb xebVar2 = xebVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1678029462);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xebVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            byte b2 = 6;
            xcz xczVarB = qdzVar.b("ALT_CHAMP_RESULTS_SCREEN", new ei20((byte) 25), fetVar2, ((i4 >> 9) & 896) | 6);
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i5 = zcm0.i(fetVar2).c.e().d - zcm0.i(fetVar2).e.e().d;
            if (i5 < 0) {
                i5 = 0;
            }
            float fR0 = w6kVar.r0(i5);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            wom womVarF = mom.f(fetVar2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zG = ((i4 & 7168) == 2048) | fetVar2.g(xczVarB);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == cl5Var) {
                objP = new qa2(z2, xczVarB, yjeVar, b2);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP);
            if (z2) {
                function1.invoke(n62.f22974a);
            }
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new j6g0((byte) 17);
                fetVar2.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var2, azlVarB, null);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.c, 0.0f, 0.0f, 0.0f, fMax, 7), "CHAMPS_ITEMS_TAG");
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true);
            int i6 = i4 & 3670016;
            boolean z3 = i6 == 1048576;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ia30(function1, (byte) 20);
                fetVar2.o0(objP3);
            }
            axy axyVar = new axy(mm40VarV, function1, xczVarB, xebVar2, (byte) 1);
            xebVar2 = xebVar2;
            byte b3 = 0;
            mom.c(x7zVarI, z, womVarF, null, false, null, (Function0) objP3, null, u1c.M(1438517015, axyVar, fetVar2), fetVar2, ((i4 >> 3) & 112) | 100663296, 184);
            fetVar2 = fetVar2;
            if (xebVar2.b != null) {
                fetVar2.e0(1364427581);
                mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 56.0f, 7);
                mtl mtlVar = xebVar2.b;
                boolean z4 = i6 == 1048576;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new rp30(function1, b3);
                    fetVar2.o0(objP4);
                }
                Function1 function2 = (Function1) objP4;
                jm40Var = jm40Var2;
                bkb.f(mm40VarN, mtlVar, null, false, null, function2, fetVar2, 0, 28);
                boolean zD = fetVar2.d(fR0);
                Object objP5 = fetVar2.P();
                if (zD || objP5 == cl5Var) {
                    objP5 = jgk0.b(new rt2(fR0, (byte) 8));
                    fetVar2.o0(objP5);
                }
                zq8.a(0, fetVar2, i120.Q(o7k0.d(o7k0.e(jm40Var, l7x.O(12.0f, 0.0f, ((Number) ((l7m0) objP5).getValue()).floatValue())), 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n));
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(1365281910);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new owy(mm40Var2, xebVar2, z, z2, e2dVar, qdzVar, function1, i2, (byte) 1);
        }
    }

    public static final void S(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1618933692);
        byte b2 = 4;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 22);
        }
    }

    public static final void T(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(141016140);
        int i3 = i2 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(rsm0.w(R.string.blocked_dependent_events_new, 0, fetVar2), s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 24576, 114684);
            v8q0.a(str, o7k0.A(jm40.b, null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, ((i3 >> 3) & 14) | 48, 24576, 114684);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i2, (byte) 6);
        }
    }

    public static final void U(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1981278622);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 19);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 18);
        }
    }

    public static final void V(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(617585897);
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
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nrj0(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var, mdmVar, function1, i2, (byte) 2);
        }
    }

    public static final void W(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1150893738);
        int i3 = i2 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(rsm0.w(R.string.events, 0, fetVar2), s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 24576, 114684);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(s5x0.N(o7k0.A(jm40Var, null, 3), 0.0f, 0.0f, 4.0f, 0.0f, 11), 18.0f, 18.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_multievent, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarP, s6t0.b().f33626a.getPrimary(), fetVar, 56, 0);
            str2 = str;
            v8q0.a(str2, o7k0.A(jm40Var, null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, ((i3 >> 3) & 14) | 48, 24576, 114684);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i2, (byte) 5);
        }
    }

    public static final void X(mm40 mm40Var, gln glnVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1164120105);
        int i3 = i2 | (fetVar2.g(glnVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 14.0f, 14.0f);
            b9x b9xVar = glnVar.f11500a;
            dww.c(a8k0.F(R.drawable.ic_glyph_move_horizontal_small, 0, fetVar2), null, i120.Q(mm40VarP, b9xVar.f2231a, b9xVar.b), y3d.g, fetVar2, 56, 0);
            v8q0.a(glnVar.b, new x7z(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24576, 114684);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, glnVar, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    public static final void Y(mm40 mm40Var, sfl0 sfl0Var, hhv hhvVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-2008103897);
        int i3 = i2 | 6 | (fetVar.e(sfl0Var.ordinal()) ? 32 : 16) | (fetVar.e(hhvVar.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = hhvVar.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(1176510430);
                int iOrdinal2 = sfl0Var.ordinal();
                zfi0 zfi0Var = zfi0.f44303a;
                if (iOrdinal2 == 0) {
                    fetVar.e0(1176645807);
                    zcl zclVar = qmk.f28987a;
                    mbc.o(zfi0Var, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else if (iOrdinal2 == 1) {
                    fetVar.e0(1177095245);
                    fetVar.r(false);
                } else if (iOrdinal2 == 2) {
                    fetVar.e0(1176645807);
                    zcl zclVar2 = qmk.f28987a;
                    mbc.o(zfi0Var, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw b1j.f(-1347521372, fetVar, false);
                    }
                    fetVar.e0(1176645807);
                    zcl zclVar3 = qmk.f28987a;
                    mbc.o(zfi0Var, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1176859614);
                    zcl zclVar4 = qmk.f28987a;
                    mbc.o(zfi0Var, s5x0.N(jm40Var, 46.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-1347524272, fetVar, false);
                }
                fetVar.e0(1177224701);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, sfl0Var, hhvVar, i2, (byte) 18);
        }
    }

    public static final void Z(int i2, fet fetVar) {
        fetVar.g0(-680607079);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(n0qVar, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b4u0(i2, (byte) 8);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void a0(mm40 mm40Var, i72 i72Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(446889143);
        byte b2 = 4;
        int i3 = i2 | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(i72Var) ? 32 : 16) | (fetVar3.g(qdzVar) ? 256 : 128) | (fetVar3.i(function1) ? 2048 : 1024);
        if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar3.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar3);
            e2d e2dVarD = nip.d(null, null, fetVar3, 7);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar3.i(window) | fetVar3.i(context) | fetVar3.h(zC);
            Object objP = fetVar3.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new la2(window, context, zC, b2);
                fetVar3.o0(objP);
            }
            s0x.d(boolValueOf, null, (Function1) objP, fetVar3, 0);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            mm40 mm40VarX = yyw.X(jm40.b, null, fetVar3, 1);
            qim qimVar = i72Var.f14269a;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP2 = fetVar3.P();
            if (z2 || objP2 == obj) {
                objP2 = new lj00(function1, (byte) 29);
                fetVar3.o0(objP2);
            }
            ckb.k(mm40VarX, qimVar, true, e2dVarD, null, (Function1) objP2, fetVar3, 24960, 0);
            fet fetVar4 = fetVar3;
            mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n), e2dVarD, fetVar4, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarC);
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
            afb afbVar = i72Var.b;
            if (afbVar instanceof yeb) {
                fetVar4.e0(991531119);
                U(null, ((yeb) afbVar).f42477a, function1, fetVar4, (i3 >> 3) & 896);
                fetVar4.r(false);
            } else {
                if (afbVar instanceof zeb) {
                    fetVar4.e0(309083913);
                    k0(0, fetVar4, null);
                    fetVar4.r(false);
                } else {
                    if (!(afbVar instanceof xeb)) {
                        throw b1j.f(309077120, fetVar4, false);
                    }
                    fetVar4.e0(991741113);
                    R(null, (xeb) afbVar, i72Var.c, i72Var.d, e2dVarD, qdzVar, function1, fetVar4, (i3 << 9) & 4128768);
                    fetVar4.r(false);
                }
                fetVar4.r(r21);
                fetVar4.r(true);
                fetVar2 = fetVar4;
            }
            fetVar4.r(r21);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 26, i2, (Object) mm40Var, (Object) i72Var, (Object) qdzVar, (Object) function1);
        }
    }

    public static final void b0(mm40 mm40Var, my30 my30Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        jm40 jm40Var;
        cl5 cl5Var;
        mm40 mm40VarN;
        mm40 mm40VarQ;
        jm40 jm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1565027634);
        int i3 = i2 | 6 | (fetVar2.g(my30Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zY0 = my30Var.y0();
            jm40 jm40Var3 = jm40.b;
            cl5 cl5Var2 = ukd.f35823a;
            if (zY0) {
                fetVar2.e0(1868422186);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean z2 = (i3 & 7168) == 2048;
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var2) {
                    objP = new y7(function1, (byte) 4);
                    fetVar2.o0(objP);
                }
                zvw.i(mm40VarN2, my30Var, (Function1) objP, fetVar2, i3 & 112, 0);
                fetVar2.r(false);
                jm40Var2 = jm40Var3;
            } else {
                fetVar2.e0(1868665071);
                if (z) {
                    zcl zclVar2 = qmk.f28987a;
                    cl5Var = cl5Var2;
                    jm40Var = jm40Var3;
                    mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                } else {
                    jm40Var = jm40Var3;
                    cl5Var = cl5Var2;
                    mm40VarN = jm40Var;
                }
                if (z) {
                    fetVar2.e0(1868968964);
                    long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar3 = qmk.f28987a;
                    zcl zclVar4 = qmk.i;
                    mm40VarQ = i120.Q(jm40Var, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar4, zclVar4));
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1869452905);
                    mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    fetVar2.r(false);
                }
                mm40 mm40VarE = mm40VarN.e(mm40VarQ);
                zcl zclVar5 = qmk.f28987a;
                jm40Var2 = jm40Var;
                mm40 mm40VarE2 = s5x0.L(mm40VarE, 12.0f, 0.0f, 2).e(z ? s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7) : s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE2);
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
                boolean z3 = (i3 & 7168) == 2048;
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new y7(function1, (byte) 5);
                    fetVar2.o0(objP2);
                }
                fetVar2 = fetVar2;
                zvw.i(null, my30Var, (Function1) objP2, fetVar2, i3 & 112, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var2;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) my30Var, z, function1, i2, (byte) 1);
        }
    }

    public static final void c0(oc90 oc90Var, fet fetVar, int i2) {
        oc90 oc90Var2;
        fet fetVar2;
        fetVar.g0(932708749);
        int i3 = (fetVar.g(oc90Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new d69((byte) 23);
                fetVar.o0(objP);
            }
            oc90Var2 = oc90Var;
            fetVar2 = fetVar;
            ay3.f(oc90Var2, null, (Function1) objP, null, null, null, x8f.f40458a, fetVar2, (i3 & 14) | 1573248, 58);
        } else {
            oc90Var2 = oc90Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m87(oc90Var2, i2, (byte) 29);
        }
    }

    public static final void d0(mm40 mm40Var, au90 au90Var, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1137591084);
        int i3 = i2 | 6 | (fetVar2.g(au90Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var2, 56.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new qw80((Object) au90Var, (Object) function0, (byte) 8);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            if (au90Var instanceof xt90) {
                fetVar2.e0(-1474197934);
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var2, 1.0f), 38.0f);
                xt90 xt90Var = (xt90) au90Var;
                String str = xt90Var.f41455a;
                y9q0 y9q0VarN = g1t0.n();
                long j2 = qmk.y;
                long j3 = qmk.J;
                zfn zfnVar = zaq0.b;
                v8q0.a(str, mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, j2, null, null, null, 0L, new f2q0(3), j3, 0, false, 1, 0, null, y9q0VarN, fetVar, 0, 24576, 111592);
                v8q0.a(xt90Var.b, s5x0.N(o7k0.c, 0.0f, 0.0f, 0.0f, 4.0f, 7), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.d(), fetVar, 0, 24576, 113656);
                fetVar2 = fetVar;
                fetVar2.r(false);
                jm40Var = jm40Var2;
            } else if (au90Var instanceof yt90) {
                fetVar2.e0(-1473212909);
                yt90 yt90Var = (yt90) au90Var;
                jm40Var = jm40Var2;
                dww.c(a8k0.F(yt90Var.f43207a, 0, fetVar2), null, o7k0.n(yyw.V(jm40Var, yt90Var.c), 32.0f), yt90Var.b, fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                if (!Intrinsics.d(au90Var, zt90.f44946a)) {
                    throw b1j.f(90990864, fetVar2, false);
                }
                fetVar2.e0(-1472861214);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, au90Var, function0, i2, (byte) 8);
        }
    }

    public static final void e0(mm40 mm40Var, du90 du90Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        du90 du90Var2;
        mm40 mm40Var2;
        long secondary40;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        function0.getClass();
        function2.getClass();
        fetVar2.g0(701103386);
        int i3 = i2 | 48 | (fetVar2.g(du90Var) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new z73((byte) 5);
                fetVar2.o0(objP2);
            }
            ghn ghnVar = (ghn) objP2;
            boolean z = du90Var.c;
            String str = du90Var.e;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | fetVar2.i(t33Var);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                o3s o3sVar = new o3s(du90Var, t33Var, ghnVar, function0, null, (byte) 27);
                fetVar2.o0(o3sVar);
                objP3 = o3sVar;
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP3);
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar2).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f2, 16.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarW = o7k0.w(o7k0.s(jr8Var.b(mm40VarK, zx7Var), 248.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP4 = fetVar2.P();
            if (zI2 || objP4 == cl5Var) {
                objP4 = new m53(t33Var, (byte) 23);
                fetVar2.o0(objP4);
            }
            v8q0.a(du90Var.f6690a, i4w0.T(mm40VarD, (Function1) objP4), du90Var.b, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, null, fetVar, 0, 384, 257016);
            mm40 mm40VarN = s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 60.0f), 0.0f, 12.0f, 0.0f, 4.0f, 5);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarK2 = s5x0.K(o7k0.d(jr8Var.b(o7k0.e(o7k0.d(jm40Var, 1.0f), 40.0f), gqw0.h), 1.0f), 8.0f, 2.0f);
            du90Var2 = du90Var;
            String str2 = du90Var2.f;
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, mm40VarK2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.y, null, j1t0.b, 0L, null, 0, 0, qmk.K, 16646109), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (str.length() == 0) {
                fetVar2.e0(-509641270);
                qxw.o(fetVar2, o7k0.e(jm40Var, 1.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-509572078);
                fetVar2.r(false);
            }
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), str.length() == 0 ? 1.0f : 2.0f);
            if (str.length() > 0) {
                fetVar2.e0(1091948695);
                secondary40 = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            } else {
                fetVar2.e0(1091949691);
                secondary40 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary40();
            }
            fetVar2.r(false);
            zq8.a(0, fetVar2, i120.Q(mm40VarE, secondary40, jd8.n));
            qxw.o(fetVar2, o7k0.e(jm40Var, 6.0f));
            zq8.a(0, fetVar2, o7k0.d(o7k0.e(jm40Var, 1.0f), 1.0f));
            qxw.o(fetVar2, o7k0.e(jm40Var, 32.0f));
            function2 = function1;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-206351024, new xd80(du90Var2, function2, (byte) 15), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            du90Var2 = du90Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50(mm40Var2, (Object) du90Var2, function0, function2, i2, (byte) 22);
        }
    }

    public static final void f0(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(-678749880);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new nrj0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i2, (byte) 7);
        }
    }

    public static final void g0(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(339425580);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar2), fetVar2, 24576);
            boolean zG = fetVar2.g((ofe0) l7m0Var.getValue());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Boolean.valueOf(((ofe0) l7m0Var.getValue()).c instanceof wee0);
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            mm40 mm40VarV = cjx.V(mm40Var.e(o7k0.c), cloVarB.e, null);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarV);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            ugd ugdVarM = u1c.M(-1274172319, new t5e0(l7m0Var, function1, (byte) 8), fetVar2);
            ugd ugdVarM2 = u1c.M(1363686720, new t5e0(l7m0Var, function1, (byte) 9), fetVar2);
            jm40 jm40Var = jm40.b;
            ahy.b(jm40Var, cloVarB, zBooleanValue, ugdVarM, ugdVarM2, fetVar2, 27654, 0);
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            fetVar2 = fetVar2;
            yee0 yee0Var = ((ofe0) l7m0Var.getValue()).c;
            if (yee0Var instanceof vee0) {
                fetVar2.e0(-1882338101);
                mm40 mm40VarD = o7k0.d(new x7z(1.0f, true), 1.0f);
                zll zllVar = ((vee0) yee0Var).f37283a;
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarF = h97.f(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f, fetVar2);
                int i4 = i3 & 896;
                boolean z3 = i4 == 256;
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new evd0(function2, (byte) 20);
                    fetVar2.o0(objP2);
                } else {
                    function2 = function1;
                }
                Function0 function0 = (Function0) objP2;
                boolean z4 = i4 == 256;
                Object objP3 = fetVar2.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new dvd0(function2, (byte) 18);
                    fetVar2.o0(objP3);
                }
                Function1 function3 = (Function1) objP3;
                boolean z5 = i4 == 256;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new dvd0(function2, (byte) 19);
                    fetVar2.o0(objP4);
                }
                ckb.f(mm40VarD, zllVar, null, ch80VarF, function0, null, function3, (Function1) objP4, fetVar2, 0, 36);
                fetVar2.r(false);
            } else {
                if (yee0Var instanceof xee0) {
                    fetVar2.e0(-1881219590);
                    mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
                    bml bmlVar = ((xee0) yee0Var).f40743a;
                    zcl zclVar2 = qmk.f28987a;
                    ckb.f(mm40VarD2, bmlVar, null, h97.f(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f, fetVar2), null, null, null, null, fetVar2, 0, 244);
                    fetVar2.r(false);
                    function2 = function1;
                } else {
                    if (!(yee0Var instanceof wee0)) {
                        throw b1j.f(-1169101345, fetVar2, false);
                    }
                    fetVar2.e0(-1880516913);
                    mm40 mm40VarD3 = o7k0.d(new x7z(1.0f, true), 1.0f);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD3);
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
                    function2 = function1;
                    mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                    mdm mdmVar = ((wee0) yee0Var).f39014a;
                    boolean z6 = (i3 & 896) == 256;
                    Object objP5 = fetVar2.P();
                    if (z6 || objP5 == cl5Var) {
                        objP5 = new evd0(function2, (byte) 21);
                        fetVar2.o0(objP5);
                    }
                    jcb.l(mm40VarN, mdmVar, false, (Function0) objP5, fetVar, 0, 4);
                    fetVar2 = fetVar;
                    z = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                fetVar2.r(z);
                fetVar2.r(z);
            }
            z = true;
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function2, i2, (byte) 2);
        }
    }

    public static final void h0(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        Object objJ;
        Object objJ2;
        Object obj = l7m0Var;
        l7m0 l7m0Var3 = l7m0Var2;
        Function0 function1 = function0;
        qja qjaVar = qja.j;
        obj.getClass();
        function1.getClass();
        fetVar.g0(-2130735077);
        int i3 = i2 | 6 | (fetVar.g(obj) ? 32 : 16) | (fetVar.g(l7m0Var3) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = jgk0.b(new jb(l7m0Var3, (byte) 21));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var4 = (l7m0) objP;
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var3.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 2104892210, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                objP2 = kng0.d(qjaVar, new s43(objF, (byte) 2), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP2;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj2) {
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
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 2104892210, fetVar), ((Number) objJ).floatValue(), false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj2) {
                objP3 = jgk0.b(new gb3(oms0VarZ, b2));
                fetVar.o0(objP3);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 2104892210, fetVar), ((Number) ((l7m0) objP3).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj2) {
                objP4 = jgk0.b(new gb3(oms0VarZ, b3));
                fetVar.o0(objP4);
            }
            jfk0 jfk0VarK = w6x.k((ams0) ((l7m0) objP4).getValue(), fetVar, -174291310, false);
            byte b4 = 2;
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, jfk0VarK, lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 1777914432, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj2) {
                objP5 = kng0.d(qjaVar, new s43(objF2, b4), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP5;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj2) {
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
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, 1777914432, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG7 || objP6 == obj2) {
                objP6 = jgk0.b(new gb3(oms0VarZ, b4));
                fetVar.o0(objP6);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP6).getValue()).floatValue(), twn.h(fetVar, 1777914432, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP7 = fetVar.P();
            if (zG8 || objP7 == obj2) {
                objP7 = jgk0.b(new gb3(oms0VarZ, (byte) 3));
                fetVar.o0(objP7);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP7).getValue(), fetVar, -686258784, false), lxs0Var2, fetVar, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = yyw.X(o7k0.d(jm40Var, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var4.getValue()).booleanValue());
            Object objP8 = fetVar.P();
            if (zH || objP8 == obj2) {
                objP8 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, !((Boolean) l7m0Var4.getValue()).booleanValue(), null);
                fetVar.o0(objP8);
            }
            imm immVar = (imm) objP8;
            function1 = function0;
            obj = l7m0Var;
            l7m0Var3 = l7m0Var2;
            hlm.c(mm40VarX, immVar, null, null, null, null, null, null, null, u1c.M(1527631391, new cb3(function1, cms0VarE, cms0VarE2, b2), fetVar), u1c.M(-1121568275, new sr1(l7m0Var3, obj, (byte) 13), fetVar), null, fetVar, 805309440, 6, 2548);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 18, i2, mm40Var2, obj, l7m0Var3, function1);
        }
    }

    public static final void i0(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2) {
        fetVar.g0(-780439830);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.g(l7m0Var2) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var2.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, 34.0f, fetVar), z, null, ffb0.d, fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o7p0(l7m0Var, l7m0Var2, xczVar, i2);
        }
    }

    public static final void j0(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1010730049);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 24.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 9);
        }
    }

    public static final void k0(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-1797624397);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, f2, 12.0f, f3, 32.0f);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarM.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40Var2 = jm40Var;
            nkb.h(mm40Var2, new ijm(), kjm.b, null, null, null, fetVar, 390, 56);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(lgb.J(n0qVar, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var2, i2, (byte) 22);
        }
    }

    public static final void l0(mm40 mm40Var, gk00 gk00Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1357717580);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(gk00Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 24.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new thj0(gk00Var, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwy(mm40Var, gk00Var, i2, (byte) 3);
        }
    }

    public static final void m0(mm40 mm40Var, ik00 ik00Var, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(1424432888);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ik00Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            if (ik00Var instanceof fk00) {
                fetVar.e0(1003702538);
                V(mm40VarQ, ((fk00) ik00Var).f9668a, function1, fetVar, (i4 >> 9) & 896);
                fetVar.r(false);
            } else if (ik00Var instanceof gk00) {
                fetVar.e0(-1214544117);
                l0(mm40VarQ, (gk00) ik00Var, fetVar, i4 & 112);
                fetVar.r(false);
            } else {
                if (!(ik00Var instanceof hk00)) {
                    throw b1j.f(-1214550032, fetVar, false);
                }
                fetVar.e0(1003939905);
                fetVar2 = fetVar;
                f0(null, z, function1, u1c.M(-1449812663, new jwy(ik00Var, mm40VarQ, qdzVar, e2dVar, function1, (byte) 3), fetVar), fetVar2, ((i4 >> 3) & 112) | 3072 | ((i4 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwy(mm40Var, ik00Var, z, qdzVar, e2dVar, function1, i2, (byte) 3);
        }
    }

    public static final void n0(mm40 mm40Var, fql0 fql0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        fetVar.g0(-2016481213);
        int i3 = i2 | 6 | (fetVar.g(fql0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            hhv hhvVar = fql0Var.i;
            sfl0 sfl0Var = fql0Var.g;
            int iOrdinal = hhvVar.ordinal();
            byte b2 = 3;
            byte b3 = 2;
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar.e0(716175511);
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(i120.Q(jm40Var, backgroundContent, vgg0.c(12.0f, 12.0f, 0.0f, 0.0f, 12)), 4.0f, 8.0f, 4.0f, 0.0f, 8);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-808172938);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar2 = qmk.f28987a;
                mm40VarN = s5x0.N(mm40VarQ, 4.0f, 0.0f, 4.0f, 0.0f, 10);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(716747988);
                long backgroundContent2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar3 = qmk.f28987a;
                mm40VarN = s5x0.N(i120.Q(jm40Var, backgroundContent2, vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3)), 4.0f, 0.0f, 4.0f, 8.0f, 2);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-808189280, fetVar, false);
                }
                fetVar.e0(717037218);
                long backgroundContent3 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar4 = qmk.f28987a;
                mm40VarN = s5x0.K(i120.Q(jm40Var, backgroundContent3, vgg0.a(12.0f)), 4.0f, 8.0f);
                fetVar.r(false);
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            int iOrdinal2 = sfl0Var.ordinal();
            mm40 mm40VarN2 = (iOrdinal2 == 3 || iOrdinal2 == 4) ? s5x0.N(jm40Var, 20.0f, 0.0f, 0.0f, 0.0f, 14) : jm40Var;
            b8l0 b8l0Var = fql0Var.d;
            d4d d4dVar = fql0Var.e;
            n3l0 n3l0Var = fql0Var.f;
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new qwy(fql0Var, function1, b3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qwy(fql0Var, function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = (i5 == 256) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new rwy(fql0Var, function1, (byte) 1);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarN2, b8l0Var, n3l0Var, d4dVar, false, function0, function2, null, (Function1) objP3, fetVar, 0, 144);
            Y(null, sfl0Var, fql0Var.i, fetVar, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new swy(mm40Var2, fql0Var, function1, i2, (byte) 1);
        }
    }

    public static final void o0(mm40 mm40Var, hk00 hk00Var, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        mtl mtlVar = hk00Var.c;
        fetVar.g0(845073797);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(hk00Var) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_LIVE_RESULTS_SCREEN", new jak0(b2), fetVar, (i3 & 896) | 6);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            mm40 mm40VarV = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (e2dVar != null) {
                fetVar.e0(-1504102619);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1504011355);
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, fMax, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarE = mm40VarV.e(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true));
            fetVar.e0(-2133654864);
            hh80 hh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7);
            if (mtlVar != null) {
                fetVar.e0(1211529500);
                z = false;
            } else {
                z = false;
                fetVar.e0(1211588617);
                hh80VarU = knm0.g(hh80VarU, fetVar);
            }
            fetVar.r(z);
            fetVar.r(z);
            boolean z2 = ((i3 & 112) == 32 ? true : z) | ((57344 & i3) == 16384 ? true : z);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zwy(hk00Var, function1, (byte) 3);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE, xczVarB, hh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            if (mtlVar != null) {
                fetVar.e0(-1717196330);
                cy2.b(null, mtlVar, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-1717056985);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwy(mm40Var, hk00Var, qdzVar, e2dVar, function1, i2, (byte) 3);
        }
    }

    public static final void p0(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-902251947);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            byte b2 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g7o0(l7m0Var, (byte) 9);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            mm40 mm40VarW = o050.W(i120.Q(o7k0.c, qcc.S(R.attr.uikitBackground, fetVar), jd8.n));
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
            imm immVar = ((r7p0) l7m0Var.getValue()).f29988a.f26619a;
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new g4p0(function1, b2);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            j7p0 j7p0Var = (j7p0) l7m0VarY.getValue();
            if (Intrinsics.d(j7p0Var, h7p0.f12587a)) {
                fetVar.e0(-80881831);
                Object[] objArr2 = new Object[0];
                boolean z3 = i4 == 4;
                Object objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP3 = new g7o0(l7m0Var2, (byte) 10);
                    fetVar.o0(objP3);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
                Object[] objArr3 = new Object[0];
                boolean z4 = i4 == 4;
                Object objP4 = fetVar.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new g7o0(l7m0Var2, (byte) 11);
                    fetVar.o0(objP4);
                }
                i0(0, fetVar, xczVarA, l7m0VarY2, v3c.Y(objArr3, (Function0) objP4, fetVar));
                fetVar.r(false);
                function2 = function1;
            } else {
                l7m0Var2 = l7m0Var;
                if (!(j7p0Var instanceof i7p0)) {
                    throw b1j.f(413030127, fetVar, false);
                }
                fetVar.e0(-80539653);
                Object[] objArr4 = new Object[0];
                boolean zI = fetVar.i(j7p0Var);
                Object objP5 = fetVar.P();
                if (zI || objP5 == cl5Var) {
                    objP5 = new nxo0((i7p0) j7p0Var, (byte) 8);
                    fetVar.o0(objP5);
                }
                function2 = function1;
                S(v3c.Y(objArr4, (Function0) objP5, fetVar), function2, fetVar, i5);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var2, function2, i2, (byte) 21);
        }
    }

    public static final void q0(a4x a4xVar, d9z d9zVar, fet fetVar, int i2) {
        fetVar.g0(-2121457126);
        byte b2 = 2;
        int i3 = (fetVar.g(a4xVar) ? 4 : 2) | i2 | (fetVar.g(d9zVar) ? 32 : 16);
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(2050143962, new qka(d9zVar, a4xVar, b3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qka(a4xVar, d9zVar, i2, b2);
        }
    }

    public static final void r0(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-702564691);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(jm40Var, 80.0f), lt40.b);
            tj30 tj30VarC = zq8.c(gqw0.g, false);
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
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 2);
            y9q0 y9q0Var = new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            long j2 = g1t0.p().f42262a.b;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(j2, g1t0.s().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i3 & 14, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 5, i2, str);
        }
    }

    public static final void s0(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-903569546);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 12;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            imm immVar = ((o9u0) l7m0Var.getValue()).f24898a;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zbt0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            s8u0 s8u0Var = ((o9u0) l7m0Var.getValue()).b;
            if (s8u0Var instanceof p8u0) {
                fetVar.e0(-273374733);
                zcl zclVar = qmk.f28987a;
                float f2 = qmk.a(fetVar).c;
                lh80 lh80Var = new lh80(f2, 12.0f, f2, 12.0f);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                boolean zG = fetVar.g(s8u0Var) | (i4 == 32);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new xis0((Object) s8u0Var, (Object) function2, (byte) 18);
                    fetVar.o0(objP2);
                } else {
                    function2 = function1;
                }
                b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, 490);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (s8u0Var instanceof q8u0) {
                    fetVar.e0(-272566160);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
                    mdm mdmVar = ((q8u0) s8u0Var).f28317a;
                    boolean z3 = i4 == 32;
                    Object objP3 = fetVar.P();
                    if (z3 || objP3 == cl5Var) {
                        objP3 = new zbt0(function2, (byte) 13);
                        fetVar.o0(objP3);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP3, fetVar, 0, 5);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (!s8u0Var.equals(r8u0.f30046a)) {
                        throw b1j.f(-1255747788, fetVar, false);
                    }
                    fetVar.e0(-1255707467);
                    Z(0, fetVar);
                    fetVar.r(false);
                }
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function2, i2, (byte) 12);
        }
    }

    public static final boolean t0(Object obj) {
        if (obj instanceof fgk0) {
            fgk0 fgk0Var = (fgk0) obj;
            if (fgk0Var.d() == m2a.v || fgk0Var.d() == rek0.c || fgk0Var.d() == ujn.A) {
                Object value = fgk0Var.getValue();
                if (value == null) {
                    return true;
                }
                return t0(value);
            }
        } else if (!(obj instanceof wdr) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (n[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void u0(ucs0 ucs0Var, BlurMaskFilter blurMaskFilter, int i2) {
        long j2 = y3d.b;
        int i3 = (i2 & 8) != 0 ? 0 : 1;
        ucs0Var.s(j2);
        ucs0Var.r(3);
        ucs0Var.A(i3);
        ((Paint) ucs0Var.c).setMaskFilter(blurMaskFilter);
    }

    public static boolean x0(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String[] y0() {
        ArrayList arrayList = new ArrayList(Arrays.asList(l));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] strArrSplit = str.split(Separators.COLON);
        int length = strArrSplit.length;
        for (int i2 = 0; i2 < length; i2++) {
            String strConcat = strArrSplit[i2];
            if (!strConcat.endsWith(Separators.SLASH)) {
                strConcat = strConcat.concat(Separators.SLASH);
            }
            if (!arrayList.contains(strConcat)) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean z0(int i2) {
        return i2 == 6 || i2 == 1 || i2 == 2 || i2 == 4;
    }

    @Override // a.bwn
    public bwn A(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return this;
    }

    @Override // a.bwn
    public void B(int i2) {
        w0(Integer.valueOf(i2));
    }

    @Override // a.cld
    public void D(ugi0 ugi0Var, int i2, char c2) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        w(c2);
    }

    @Override // a.bwn
    public void E(String str) {
        str.getClass();
        w0(str);
    }

    @Override // a.bwn
    public cld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return this;
    }

    @Override // a.cld
    public void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
    }

    @Override // a.cld
    public void e(vvb0 vvb0Var, int i2, short s2) {
        v0(vvb0Var, i2);
        r(s2);
    }

    @Override // a.bwn
    public void g(double d2) {
        w0(Double.valueOf(d2));
    }

    @Override // a.bwn
    public void h(byte b2) {
        w0(Byte.valueOf(b2));
    }

    @Override // a.cld
    public void i(int i2, int i3, ugi0 ugi0Var) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        B(i3);
    }

    @Override // a.cld
    public void j(ugi0 ugi0Var, int i2, double d2) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        g(d2);
    }

    @Override // a.cld
    public void k(vvb0 vvb0Var, int i2, byte b2) {
        v0(vvb0Var, i2);
        h(b2);
    }

    @Override // a.bwn
    public void l(long j2) {
        w0(Long.valueOf(j2));
    }

    @Override // a.cld
    public void m(ugi0 ugi0Var, int i2, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        v0(ugi0Var, i2);
        C(jiyVar, obj);
    }

    @Override // a.cld
    public void n(ugi0 ugi0Var, int i2, long j2) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        l(j2);
    }

    @Override // a.cld
    public void o(ugi0 ugi0Var, int i2, float f2) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        t(f2);
    }

    @Override // a.cld
    public void p(ugi0 ugi0Var, int i2, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        v0(ugi0Var, i2);
        if (jiyVar.getDescriptor().b()) {
            C(jiyVar, obj);
        } else if (obj == null) {
            q();
        } else {
            C(jiyVar, obj);
        }
    }

    @Override // a.bwn
    public void q() {
        throw new fhi0("'null' is not supported by default");
    }

    @Override // a.bwn
    public void r(short s2) {
        w0(Short.valueOf(s2));
    }

    @Override // a.bwn
    public void s(boolean z) {
        w0(Boolean.valueOf(z));
    }

    @Override // a.bwn
    public void t(float f2) {
        w0(Float.valueOf(f2));
    }

    @Override // a.cld
    public bwn v(vvb0 vvb0Var, int i2) {
        v0(vvb0Var, i2);
        return A(vvb0Var.g(i2));
    }

    public void v0(ugi0 ugi0Var, int i2) {
        ugi0Var.getClass();
    }

    @Override // a.bwn
    public void w(char c2) {
        w0(Character.valueOf(c2));
    }

    public void w0(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        tre0 tre0Var = sre0.f32672a;
        sb.append(tre0Var.b(cls));
        sb.append(" is not supported by ");
        sb.append(tre0Var.b(getClass()));
        sb.append(" encoder");
        throw new fhi0(sb.toString());
    }

    @Override // a.cld
    public void x(ugi0 ugi0Var, int i2, boolean z) {
        ugi0Var.getClass();
        v0(ugi0Var, i2);
        s(z);
    }

    @Override // a.bwn
    public void y(ugi0 ugi0Var, int i2) {
        ugi0Var.getClass();
        w0(Integer.valueOf(i2));
    }

    @Override // a.cld
    public void z(ugi0 ugi0Var, int i2, String str) {
        ugi0Var.getClass();
        str.getClass();
        v0(ugi0Var, i2);
        E(str);
    }
}
