package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.huawei.hms.android.HwBuildEx;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f45077a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static kb30 A(a5w a5wVar, boolean z, long j) {
        kb30 kb30VarD = null;
        kb30VarD = null;
        kb30VarD = null;
        if (a5wVar instanceof vw4) {
            vw4 vw4Var = (vw4) a5wVar;
            z0w z0wVar = (z0w) CollectionsKt.firstOrNull(vw4Var.T);
            if (z0wVar != null) {
                uoy uoyVar = vw4Var.N;
                q4f q4fVar = vw4Var.b;
                String str = vw4Var.y;
                String str2 = str.length() > 0 ? str : null;
                if (str2 == null) {
                    str2 = z0wVar.u;
                }
                kb30VarD = D(uoyVar, z, q4fVar, str2, z0wVar, j);
            }
        } else if (a5wVar instanceof kzv) {
            kzv kzvVar = (kzv) a5wVar;
            z0w z0wVar2 = (z0w) CollectionsKt.firstOrNull(kzvVar.Y);
            if (z0wVar2 != null) {
                uoy uoyVar2 = kzvVar.S;
                q4f q4fVar2 = kzvVar.b;
                String str3 = kzvVar.A;
                String str4 = str3.length() > 0 ? str3 : null;
                if (str4 == null) {
                    str4 = z0wVar2.u;
                }
                kb30VarD = D(uoyVar2, z, q4fVar2, str4, z0wVar2, j);
            }
        }
        return kb30VarD == null ? hb30.f12752a : kb30VarD;
    }

    public static final i4 B(String str, ArrayList arrayList) {
        ArrayList<wmg> arrayListU = ohs0.u(str);
        Iterator it = new IntRange(0, 4, 1).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayListU.add((wmg) ((iNextInt < 0 || iNextInt >= arrayList.size()) ? new wmg("", "", "", null, null, null, null, null, false, 0, iun.f15405a, "") : arrayList.get(iNextInt)));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        for (wmg wmgVar : arrayListU) {
            String str2 = wmgVar.f39405a;
            arrayList2.add(new hfa0(kkg.j, str2, wmgVar.b, "", wmgVar.c, Intrinsics.d(str2, str)));
        }
        return dyb.r0(arrayList2);
    }

    public static ArrayList C(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static kb30 D(uoy uoyVar, boolean z, q4f q4fVar, String str, z0w z0wVar, long j) {
        db30 bb30Var;
        String str2 = z0wVar.u;
        String str3 = z0wVar.p;
        String str4 = z0wVar.m;
        if (uoyVar == uoy.FINANCE_365) {
            return new gb30(str2, new ab30(str4), z);
        }
        if (j == 95) {
            return new gb30(str, new za30(str4, str3), z);
        }
        if (q4fVar != q4f.c) {
            return hb30.f12752a;
        }
        String strB0 = CollectionsKt.b0(q3d.j(str2, str), ". ", null, null, null, 62);
        List list = z0wVar.r;
        List list2 = z0wVar.o;
        List listSplit$default = StringsKt__StringsKt.split$default(str4, new String[]{Separators.SLASH}, false, 0, 6, null);
        List listSplit$default2 = StringsKt__StringsKt.split$default(str3, new String[]{Separators.SLASH}, false, 0, 6, null);
        boolean z2 = listSplit$default.size() == 2 || listSplit$default2.size() == 2;
        boolean z3 = listSplit$default.size() > 2 || listSplit$default2.size() > 2;
        if (z2) {
            String str5 = (String) CollectionsKt.W(0, list2);
            if (str5 == null) {
                str5 = "";
            }
            String strT = vsm0.t(str5);
            String str6 = (String) CollectionsKt.W(1, list2);
            if (str6 == null) {
                str6 = "";
            }
            String strT2 = vsm0.t(str6);
            String str7 = (String) CollectionsKt.W(0, list);
            if (str7 == null) {
                str7 = "";
            }
            String strT3 = vsm0.t(str7);
            String str8 = (String) CollectionsKt.W(1, list);
            bb30Var = new cb30(str4, str3, strT, strT2, strT3, vsm0.t(str8 != null ? str8 : ""));
        } else if (z3) {
            bb30Var = new za30(str4, str3);
        } else if (str4.length() <= 0 || str3.length() != 0) {
            String str9 = (String) CollectionsKt.W(0, list2);
            if (str9 == null) {
                str9 = "";
            }
            String strS = vsm0.s(z0wVar.n, str9);
            String str10 = (String) CollectionsKt.W(0, list);
            bb30Var = new bb30(str4, str3, strS, vsm0.s(z0wVar.q, str10 != null ? str10 : ""));
        } else {
            bb30Var = new ab30(str4);
        }
        return new gb30(strB0, bb30Var, z);
    }

    public static final s6q0 E(String str, String str2, String str3, boolean z) {
        return new s6q0(str, e6q0.f7299a, o6q0.f24750a, str3.length() > 0 ? new s7q0(str3) : r7q0.f29989a, z, str3.length() > 0, null, str2, null, 32128);
    }

    public static final void F(CoroutineContext coroutineContext, CancellationException cancellationException) {
        bby bbyVar = (bby) coroutineContext.get(gqw0.o1);
        if (bbyVar != null) {
            bbyVar.cancel(cancellationException);
        }
    }

    public static void G(bby bbyVar, String str) {
        bbyVar.cancel(plc.b(str, null));
    }

    public static final Object H(bby bbyVar, yje yjeVar) {
        bbyVar.cancel(null);
        Object objJoin = bbyVar.join(yjeVar);
        return objJoin == wne.f39444a ? objJoin : Unit.f46060a;
    }

    public static void I(CoroutineContext coroutineContext) {
        Sequence children;
        bby bbyVar = (bby) coroutineContext.get(gqw0.o1);
        if (bbyVar == null || (children = bbyVar.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((bby) it.next()).cancel(null);
        }
    }

    public static final void J(int i, int i2) {
        if (i < 0 || i >= i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static final void K(int i, int i2) {
        if (i < 0 || i > i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static final void L(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            hny.k(i3, dw9.t("fromIndex: ", i, ", toIndex: ", ", size: ", i2));
        } else {
            if (i <= i2) {
                return;
            }
            jf4.o(f140.j(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static long[] M(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        x0x.x("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    public static jre0 N(Class cls) {
        cry cryVar;
        lry onvVar;
        bry bryVar;
        mae0 mae0Var = new mae0();
        mae0Var.f21454a = null;
        mae0Var.b = null;
        boolean z = false;
        mae0Var.c = 0;
        mae0Var.d = null;
        mae0Var.e = null;
        mae0Var.f = null;
        mae0Var.g = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsG = azw.G(azw.F(annotation));
            qlc qlcVarA = bqe0.a(clsG);
            if (qlcVarA.a().equals(bey.f2475a)) {
                onvVar = new jw20((Object) mae0Var, (byte) 18);
            } else if (mae0.h || mae0Var.g != null || (bryVar = (bry) mae0.i.get(qlcVarA)) == null) {
                onvVar = null;
            } else {
                mae0Var.g = bryVar;
                onvVar = new onv(mae0Var);
            }
            if (onvVar != null) {
                gfx.O(onvVar, annotation, clsG);
            }
        }
        vd40 vd40Var = vd40.g;
        if (mae0Var.g == null || mae0Var.f21454a == null) {
            cryVar = null;
        } else {
            vd40 vd40Var2 = new vd40(mae0Var.f21454a, (mae0Var.c & 8) != 0);
            vd40Var.getClass();
            vd40 vd40Var3 = vd40Var2.f ? vd40Var : vd40.h;
            int i = vd40Var3.b;
            int i2 = vd40Var.b;
            if (i > i2 || (i >= i2 && vd40Var3.c > vd40Var.c)) {
                vd40Var = vd40Var3;
            }
            int i3 = vd40Var2.c;
            int i4 = vd40Var2.b;
            if ((i4 != 1 || i3 != 0) && i4 != 0) {
                int i5 = vd40Var.b;
                if (i4 > i5 || (i4 >= i5 && i3 > vd40Var.c)) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                bry bryVar2 = mae0Var.g;
                if ((bryVar2 == bry.CLASS || bryVar2 == bry.FILE_FACADE || bryVar2 == bry.MULTIFILE_CLASS_PART) && mae0Var.d == null) {
                    cryVar = null;
                }
            } else {
                mae0Var.f = mae0Var.d;
                mae0Var.d = null;
            }
            cryVar = new cry(mae0Var.g, vd40Var2, mae0Var.d, mae0Var.f, mae0Var.e, mae0Var.b, mae0Var.c);
        }
        if (cryVar == null) {
            return null;
        }
        return new jre0(cls, cryVar);
    }

    public static final void O(CoroutineContext coroutineContext) {
        bby bbyVar = (bby) coroutineContext.get(gqw0.o1);
        if (bbyVar != null && !bbyVar.isActive()) {
            throw bbyVar.getCancellationException();
        }
    }

    public static final u3i P(d0t d0tVar, boolean z, boolean z2) {
        boolean zA0 = kpb.a0(d0tVar, z, z2);
        boolean zF0 = kpb.f0(d0tVar, z);
        if (zA0) {
            return new v3i(c2i.f3624a);
        }
        return zF0 ? new v3i(e2i.f7087a) : w3i.f38503a;
    }

    public static final u3i Q(d0t d0tVar, boolean z) {
        if (kpb.b0(d0tVar, z)) {
            return new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        }
        return y3i.f41954a;
    }

    public static final bby R(CoroutineContext coroutineContext) {
        bby bbyVar = (bby) coroutineContext.get(gqw0.o1);
        if (bbyVar != null) {
            return bbyVar;
        }
        udk.e(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final String S(nij0 nij0Var, ctf0 ctf0Var) {
        switch (nij0Var.ordinal()) {
            case 0:
                return ctf0Var.b.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
            case 1:
                return ctf0Var.b.a(R.string.player_turn, Arrays.copyOf(new Object[0], 0));
            case 2:
                return ctf0Var.b.a(R.string.dealer_turn, Arrays.copyOf(new Object[0], 0));
            case 3:
                return ctf0Var.b.a(R.string.player_win, Arrays.copyOf(new Object[0], 0));
            case 4:
                return ctf0Var.b.a(R.string.draw_game, Arrays.copyOf(new Object[0], 0));
            case 5:
                return ctf0Var.b.a(R.string.dealer_win, Arrays.copyOf(new Object[0], 0));
            case 6:
                return "";
            default:
                t9f.b();
                return null;
        }
    }

    public static final u3i T(d0t d0tVar, boolean z) {
        if (kpb.d0(d0tVar, z)) {
            return new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        }
        return a4i.f224a;
    }

    public static long U(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = HwBuildEx.VersionCodes.CUR_DEVELOPMENT << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : HwBuildEx.VersionCodes.CUR_DEVELOPMENT << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static final thc0 V(o7c0 o7c0Var, ctf0 ctf0Var) {
        o7c0Var.getClass();
        ctf0Var.getClass();
        StringBuilder sb = new StringBuilder();
        int i = o7c0Var.f24780a;
        int i2 = o7c0Var.e;
        if (i == 0) {
            sb.append(String.format(Locale.ENGLISH, ctf0Var.f(R.string.you_got_bonus_points_v2, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(o7c0Var.c)}, 1)));
        } else {
            sb.append(o7c0Var.b);
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(Separators.RETURN);
            }
            sb.append(String.format(Locale.ENGLISH, ctf0Var.f(R.string.promo_bonus_date_v2, Integer.valueOf(i2)), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        }
        return new thc0(ctf0Var.f(i == 0 ? R.string.success : R.string.error, new Object[0]), sb.toString());
    }

    public static final nwk W(bby bbyVar, boolean z, eby ebyVar) {
        if (bbyVar instanceof pby) {
            return ((pby) bbyVar).L(z, ebyVar);
        }
        return bbyVar.invokeOnCompletion(ebyVar.l(), z, new g1y(1, ebyVar, eby.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 11));
    }

    public static final boolean X(CoroutineContext coroutineContext) {
        bby bbyVar = (bby) coroutineContext.get(gqw0.o1);
        if (bbyVar != null) {
            return bbyVar.isActive();
        }
        return true;
    }

    public static final void Y(ArrayList arrayList, List list) {
        Object objPrevious;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hw20 hw20Var = (hw20) it.next();
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (((xt20) objPrevious).b != hw20Var.b);
            xt20 xt20Var = (xt20) objPrevious;
            if (xt20Var != null) {
                arrayList.remove(xt20Var);
            }
        }
    }

    public static final u4s Z(mz60 mz60Var, ctf0 ctf0Var) {
        v4s v4sVar;
        mz60Var.getClass();
        ctf0Var.getClass();
        a570 a570Var = mz60Var.b;
        hds hdsVar = mz60Var.d;
        long jD = x1x.D(a570Var);
        if (x1x.G(a570Var)) {
            v4sVar = mz60Var.e ? v4s.c : v4s.f36795a;
        } else {
            v4sVar = v4s.b;
        }
        String str = hdsVar.b;
        String str2 = hdsVar.f12884a;
        return new u4s(jD, v4sVar, new n0x(str), new n0x(azw.R(hdsVar.b)), new n0x(str2), new n0x(azw.R(str2)), x1x.G(a570Var) ? mz60Var.f22638a : ctf0Var.f(R.string.all_games, new Object[0]));
    }

    public static final void a(mm40 mm40Var, xcz xczVar, boolean z, pz40 pz40Var, lh80 lh80Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-581738107);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(pz40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(lh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            float fB0 = f7k.b0(fetVar);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "EVENT_CARD_LAZY_ROW");
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new y9v(pz40Var, (byte) 23);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zD = (i3 == 2048) | ((458752 & i2) == 131072) | fetVar.d(fB0);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                objP2 = new tb90(pz40Var, ugdVar, fB0, (byte) 0);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarA, xczVar, lh80Var, false, qw3Var, null, null, z, null, (Function1) objP2, fetVar, (i2 & 112) | ((i2 >> 6) & 896) | ((i2 << 15) & 29360128), 360);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) xczVar, z, (Object) pz40Var, (Object) lh80Var, (wdr) ugdVar, i, (byte) 22);
        }
    }

    public static final String a0(long j, String str) {
        String strReplace = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)).replace(',', '.');
        strReplace.getClass();
        return strReplace;
    }

    public static final void b(int i, ugd ugdVar, fet fetVar, wvw wvwVar, mm40 mm40Var, yjj0 yjj0Var, Function0 function0, boolean z) {
        int i2;
        fetVar.g0(947208840);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(wvwVar) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i4 = 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
            int i5 = i3 << 3;
            w(i4 | (3670016 & i5) | (i5 & 29360128), ugdVar, fetVar, wvwVar, mm40Var, yjj0Var, function0, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvw(function0, mm40Var, z, yjj0Var, wvwVar, ugdVar, i, (byte) 1);
        }
    }

    public static final mo60 b0(mz60 mz60Var, String str) {
        mz60Var.getClass();
        str.getClass();
        a570 a570Var = mz60Var.b;
        String str2 = mz60Var.f22638a;
        hds hdsVar = mz60Var.d;
        return new mo60(str, a570Var, str2, hdsVar.b, hdsVar.f12884a, mz60Var.e);
    }

    public static final void c(mm40 mm40Var, pqv pqvVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        pqvVar.getClass();
        function0.getClass();
        fetVar.g0(146144739);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(pqvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var3 = mm40Var;
            if (pqvVar instanceof nqv) {
                fetVar.e0(-1298731105);
                jiq0.y(mm40Var3, ((nqv) pqvVar).c, function0, null, null, fetVar, i3 & 910, 24);
                fetVar.r(false);
            } else {
                if (!(pqvVar instanceof oqv)) {
                    throw b1j.f(-1288822467, fetVar, false);
                }
                fetVar.e0(-1298519995);
                nkb.h(mm40Var3, ((oqv) pqvVar).b, kjm.f18392a, null, null, null, fetVar, i3 & 14, 56);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var2, (Object) pqvVar, (Object) function0, i, i2, (byte) 1);
        }
    }

    public static final t0a0 c0(a9a0 a9a0Var, String str) {
        a9a0Var.getClass();
        str.getClass();
        String strA = a9a0Var.a();
        c280 c280Var = new c280(kng0.l(str, Separators.SLASH, a9a0Var.d()), R.drawable.ic_glyph_placeholder_player);
        String name = a9a0Var.getName();
        String strB = a9a0Var.b();
        naa0 naa0VarC = a9a0Var.c();
        return new t0a0(strA, c280Var, name, strB, naa0VarC instanceof laa0 ? new s0a0(((laa0) naa0VarC).f19697a) : null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void d(Function0 function0, mm40 mm40Var, boolean z, wvw wvwVar, yjj0 yjj0Var, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        yjj0 yjj0VarA;
        mm40 mm40Var3;
        wvw wvwVar2;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        long j;
        t4d t4dVar;
        wvw wvwVar3;
        wvw wvwVarA;
        int i6;
        boolean z4;
        wvw wvwVar4;
        int i7;
        fetVar.g0(1413012038);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                i4 = i3 | 1408;
            }
            i5 = i4 | 24576;
            if ((196608 & i) == 0) {
                i5 = 90112 | i4;
            }
            if ((1572864 & i) == 0) {
                if (fetVar.i(ugdVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            if ((599187 & i5) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i5 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if (i8 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    j = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                    t4dVar = (t4d) fetVar.k(v4d.f36771a);
                    wvwVar3 = t4dVar.Y;
                    if (wvwVar3 == null) {
                        long j2 = y3d.f;
                        wvwVarA = new wvw(j2, j, j2, y3d.c(f4m0.f8922a, j));
                        t4dVar.Y = wvwVarA;
                    } else {
                        wvwVarA = wvwVar3;
                    }
                    if (!h2t0.a(wvwVarA.b, j)) {
                        wvwVarA = wvwVarA.a(wvwVarA.f39859a, j, wvwVarA.c, y3d.c(f4m0.f8922a, j));
                    }
                    i6 = i5 & (-465921);
                    yjj0VarA = elj0.a(gak0.f10971a, fetVar);
                    z4 = true;
                    mm40Var2 = mm40Var4;
                    wvwVar4 = wvwVarA;
                } else {
                    fetVar.X();
                    i6 = i5 & (-465921);
                    z4 = z;
                    wvwVar4 = wvwVar;
                    yjj0VarA = yjj0Var;
                }
                fetVar.s();
                int i9 = i6 << 3;
                e((i6 & 3670016) | ((i6 >> 3) & 14) | (i9 & 112) | (i6 & 896) | (i9 & 458752), ugdVar, fetVar, wvwVar4, mm40Var2, yjj0VarA, function0, z4);
                mm40Var3 = mm40Var2;
                wvwVar2 = wvwVar4;
                z3 = z4;
            } else {
                fetVar.X();
                z3 = z;
                yjj0VarA = yjj0Var;
                mm40Var3 = mm40Var2;
                wvwVar2 = wvwVar;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ltl(function0, mm40Var3, z3, wvwVar2, yjj0VarA, ugdVar, i, i2);
            }
        }
        i3 |= 48;
        mm40Var2 = mm40Var;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            i5 = 90112 | i4;
        }
        if ((1572864 & i) == 0) {
            if (fetVar.i(ugdVar)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i5 |= i7;
        }
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i5 & 1, z2)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                j = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                t4dVar = (t4d) fetVar.k(v4d.f36771a);
                wvwVar3 = t4dVar.Y;
                if (wvwVar3 == null) {
                    long j3 = y3d.f;
                    wvwVarA = new wvw(j3, j, j3, y3d.c(f4m0.f8922a, j));
                    t4dVar.Y = wvwVarA;
                } else {
                    wvwVarA = wvwVar3;
                }
                if (!h2t0.a(wvwVarA.b, j)) {
                    wvwVarA = wvwVarA.a(wvwVarA.f39859a, j, wvwVarA.c, y3d.c(f4m0.f8922a, j));
                }
                i6 = i5 & (-465921);
                yjj0VarA = elj0.a(gak0.f10971a, fetVar);
                z4 = true;
                mm40Var2 = mm40Var4;
                wvwVar4 = wvwVarA;
            } else {
                if (i8 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                j = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                t4dVar = (t4d) fetVar.k(v4d.f36771a);
                wvwVar3 = t4dVar.Y;
                if (wvwVar3 == null) {
                    long j4 = y3d.f;
                    wvwVarA = new wvw(j4, j, j4, y3d.c(f4m0.f8922a, j));
                    t4dVar.Y = wvwVarA;
                } else {
                    wvwVarA = wvwVar3;
                }
                if (!h2t0.a(wvwVarA.b, j)) {
                    wvwVarA = wvwVarA.a(wvwVarA.f39859a, j, wvwVarA.c, y3d.c(f4m0.f8922a, j));
                }
                i6 = i5 & (-465921);
                yjj0VarA = elj0.a(gak0.f10971a, fetVar);
                z4 = true;
                mm40Var2 = mm40Var4;
                wvwVar4 = wvwVarA;
            }
            fetVar.s();
            int i10 = i6 << 3;
            e((i6 & 3670016) | ((i6 >> 3) & 14) | (i10 & 112) | (i6 & 896) | (i10 & 458752), ugdVar, fetVar, wvwVar4, mm40Var2, yjj0VarA, function0, z4);
            mm40Var3 = mm40Var2;
            wvwVar2 = wvwVar4;
            z3 = z4;
        } else {
            fetVar.X();
            z3 = z;
            yjj0VarA = yjj0Var;
            mm40Var3 = mm40Var2;
            wvwVar2 = wvwVar;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltl(function0, mm40Var3, z3, wvwVar2, yjj0VarA, ugdVar, i, i2);
        }
    }

    public static final xjg0 d0(wjg0 wjg0Var) {
        jkg0 jkg0Var;
        wjg0Var.getClass();
        ikg0 ikg0Var = wjg0Var.f39262a;
        fkg0 fkg0VarE0 = ikg0Var != null ? e0(ikg0Var) : new fkg0(lig0.d, ekg0.d);
        ikg0 ikg0Var2 = wjg0Var.b;
        fkg0 fkg0VarE1 = ikg0Var2 != null ? e0(ikg0Var2) : new fkg0(lig0.d, ekg0.d);
        ikg0 ikg0Var3 = wjg0Var.c;
        fkg0 fkg0VarE2 = ikg0Var3 != null ? e0(ikg0Var3) : new fkg0(lig0.d, ekg0.d);
        Integer num = wjg0Var.d;
        if (num != null && num.intValue() == 1) {
            jkg0Var = jkg0.f16667a;
        } else if (num != null && num.intValue() == 2) {
            jkg0Var = jkg0.b;
        } else {
            jkg0Var = (num != null && num.intValue() == 3) ? jkg0.c : jkg0.d;
        }
        return new xjg0(fkg0VarE0, fkg0VarE1, fkg0VarE2, jkg0Var);
    }

    public static final void e(int i, ugd ugdVar, fet fetVar, wvw wvwVar, mm40 mm40Var, yjj0 yjj0Var, Function0 function0, boolean z) {
        int i2;
        fetVar.g0(-1134296466);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(wvwVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.e0(977045485);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            fetVar.r(false);
            ykw ykwVar = rlx.f30719a;
            mm40 mm40VarE = mm40Var.e(tg40.b);
            float f2 = gak0.b;
            mm40 mm40VarE2 = y860.W(i120.Q(lgb.J(o7k0.o(qbc.i(gak0.c + f2 + f2, 40.0f), mm40VarE), yjj0Var), z ? wvwVar.f39859a : wvwVar.c, yjj0Var), gy40Var, lcg0.a(0.0f, 7), z, new ucg0(0), function0, 8).e(new mac(new e6c(b2)));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(yde.f42431a.a(new y3d(z ? wvwVar.b : wvwVar.d)), ugdVar, fetVar, ((i2 >> 15) & 112) | 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvw(mm40Var, function0, z, yjj0Var, wvwVar, ugdVar, i);
        }
    }

    public static final fkg0 e0(ikg0 ikg0Var) {
        lig0 lig0Var;
        ekg0 ekg0Var;
        Integer num = ikg0Var.f14924a;
        if (num != null && num.intValue() == 1) {
            lig0Var = lig0.f20104a;
        } else if (num != null && num.intValue() == 2) {
            lig0Var = lig0.b;
        } else {
            lig0Var = (num != null && num.intValue() == 3) ? lig0.c : lig0.d;
        }
        Integer num2 = ikg0Var.b;
        if (num2 != null && num2.intValue() == 1) {
            ekg0Var = ekg0.f7950a;
        } else if (num2 != null && num2.intValue() == 2) {
            ekg0Var = ekg0.b;
        } else {
            ekg0Var = (num2 != null && num2.intValue() == 3) ? ekg0.c : ekg0.d;
        }
        return new fkg0(lig0Var, ekg0Var);
    }

    public static final void f(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(12870570);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            bww.d(mm40Var, pz40Var, false, hh80Var, xczVar, u1c.M(391640635, new hgx(xdrVar, b2), fetVar), u1c.M(-1756256050, new kgx(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), function1, function2, (byte) 1), fetVar), ccq0.d, fetVar, (i2 & 14) | 14352768 | (i2 & 112) | (i2 & 7168) | ((i2 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jgx(mm40Var, pz40Var, xczVar, hh80Var, function1, function2, xdrVar, i, (byte) 2);
        }
    }

    public static final String f0(float f2) {
        return f2 == 0.0f ? "0" : String.valueOf(f2);
    }

    public static dby g() {
        return new dby(null);
    }

    public static final tfa g0(d0t d0tVar, v5l0 v5l0Var, m5l0 m5l0Var, ctf0 ctf0Var, boolean z) {
        v5l0Var.getClass();
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            return new ofa(d0tVar.f5282a, new mga(T(d0tVar, z), Q(d0tVar, z)), new hga(xvw.P(d0tVar), xvw.E(d0tVar), kpb.G(d0tVar, ctf0Var), xvw.O(qzb.c0(d0tVar), kpb.D(d0tVar)), xvw.O(qzb.r0(d0tVar), kpb.U(d0tVar))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            return new sfa(d0tVar.f5282a, new qga(T(d0tVar, z), Q(d0tVar, z)), new lga(xvw.P(d0tVar), xvw.E(d0tVar), kpb.G(d0tVar, ctf0Var), xvw.O(qzb.c0(d0tVar), kpb.D(d0tVar)), xvw.O(qzb.r0(d0tVar), kpb.U(d0tVar))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            long j = d0tVar.f5282a;
            String strG = kpb.G(d0tVar, ctf0Var);
            return new rfa(j, new pga(T(d0tVar, z), Q(d0tVar, z), strG), new kga(xvw.P(d0tVar), xvw.E(d0tVar), xvw.O(qzb.c0(d0tVar), kpb.D(d0tVar)), xvw.O(qzb.r0(d0tVar), kpb.U(d0tVar))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 3) {
            long j2 = d0tVar.f5282a;
            String strG2 = kpb.G(d0tVar, ctf0Var);
            return new qfa(j2, new oga(T(d0tVar, z), Q(d0tVar, z), strG2), new jga(xvw.P(d0tVar), xvw.E(d0tVar), xvw.O(qzb.c0(d0tVar), kpb.D(d0tVar)), xvw.O(qzb.r0(d0tVar), kpb.U(d0tVar))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        return new pfa(d0tVar.f5282a, new nga(T(d0tVar, z), Q(d0tVar, z)), new iga(xvw.P(d0tVar), xvw.E(d0tVar), kpb.G(d0tVar, ctf0Var), xvw.O(qzb.c0(d0tVar), kpb.D(d0tVar)), xvw.O(qzb.r0(d0tVar), kpb.U(d0tVar))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static final void h(mm40 mm40Var, p3w p3wVar, boolean z, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(935982709);
        int i2 = i | 6 | (fetVar.g(p3wVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40Var2 = jm40.b;
            if (z) {
                fetVar.e0(933404308);
                obb.A(mm40Var2, p3wVar, function1, fetVar, ((i2 >> 3) & 896) | (i2 & 126), 0);
                fetVar.r(false);
            } else {
                fetVar.e0(933593873);
                thb.c(p3wVar, function1, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 18, i, (Object) mm40Var2, (Object) p3wVar, (Object) function1, z);
        }
    }

    public static final void h0(tai0 tai0Var, int i, zz zzVar) {
        xz40 xz40Var = new xz40(new tai0[16]);
        List listI = tai0Var.i(false, false);
        while (true) {
            xz40Var.d(xz40Var.c, listI);
            while (true) {
                int i2 = xz40Var.c;
                if (i2 == 0) {
                    return;
                }
                tai0 tai0Var2 = (tai0) xz40Var.k(i2 - 1);
                boolean zR = phu0.R(tai0Var2);
                nai0 nai0Var = tai0Var2.d;
                hz40 hz40Var = nai0Var.f23193a;
                if (!zR && !hz40Var.c(xai0.j)) {
                    s460 s460VarD = tai0Var2.d();
                    if (s460VarD == null) {
                        throw cs0.g("Expected semantics node to have a coordinator.");
                    }
                    mkx mkxVarC = m2x.C(k7x.z(s460VarD, true));
                    if (mkxVarC.f21964a < mkxVarC.c && mkxVarC.b < mkxVarC.d) {
                        Object objG = nai0Var.f23193a.g(mai0.e);
                        if (objG == null) {
                            objG = null;
                        }
                        Function2 function2 = (Function2) objG;
                        Object objG2 = hz40Var.g(xai0.w);
                        t9h0 t9h0Var = (t9h0) (objG2 != null ? objG2 : null);
                        if (function2 == null || t9h0Var == null || ((Number) t9h0Var.b.invoke()).floatValue() <= 0.0f) {
                            listI = tai0Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            zzVar.invoke(new v9h0(tai0Var2, i3, mkxVarC, s460VarD));
                            h0(tai0Var2, i3, zzVar);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(mm40 mm40Var, final my30 my30Var, final Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Function0 function0;
        my30Var.getClass();
        function1.getClass();
        fetVar.g0(-782519558);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(my30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var2 = jm40.b;
            }
            boolean z = my30Var instanceof ky30;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1042525395);
                ky30 ky30Var = (ky30) my30Var;
                gy30 gy30Var = ky30Var.c;
                int i5 = i3 & 896;
                boolean z2 = ((i3 & 112) == 32) | (i5 == 256);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new Function0() { // from class: a.j040
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            my30 my30Var2 = my30Var;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(((ky30) my30Var2).e);
                                    break;
                                default:
                                    function2.invoke(((jy30) my30Var2).d);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                Function0 function2 = (Function0) objP;
                wy30 wy30Var = ky30Var.f;
                if (wy30Var == null) {
                    fetVar.e0(1042783159);
                    fetVar.r(false);
                    function0 = null;
                } else {
                    fetVar.e0(1042783160);
                    boolean z3 = (fetVar.g(wy30Var) ? 1 : 0) | (i5 != 256 ? (byte) 0 : (byte) 1);
                    Object objP2 = fetVar.P();
                    if (z3 != 0 || objP2 == cl5Var) {
                        objP2 = new mbz(function1, wy30Var, (byte) 28);
                        fetVar.o0(objP2);
                    }
                    function0 = (Function0) objP2;
                    fetVar.r(false);
                }
                jiq0.y(mm40Var2, gy30Var, function2, null, function0, fetVar, i3 & 14, 8);
                fetVar.r(false);
            } else {
                int i6 = i3;
                if (my30Var instanceof ly30) {
                    fetVar.e0(1042939059);
                    x(mm40Var2, (ly30) my30Var, function1, fetVar, i6 & 1022);
                    fetVar.r(false);
                } else if (my30Var instanceof jy30) {
                    fetVar.e0(1043141117);
                    c0m c0mVar = ((jy30) my30Var).f;
                    boolean z4 = ((i6 & 112) == 32) | ((i6 & 896) == 256);
                    Object objP3 = fetVar.P();
                    if (z4 || objP3 == cl5Var) {
                        objP3 = new Function0() { // from class: a.j040
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                my30 my30Var2 = my30Var;
                                Function1 function3 = function1;
                                switch (b4) {
                                    case 0:
                                        function3.invoke(((ky30) my30Var2).e);
                                        break;
                                    default:
                                        function3.invoke(((jy30) my30Var2).d);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    qcc.i(mm40Var2, c0mVar, (Function0) objP3, fetVar, i6 & 14);
                    fetVar.r(false);
                } else if (my30Var instanceof hy30) {
                    fetVar.e0(1043425015);
                    cll cllVar = ((hy30) my30Var).c;
                    boolean z5 = ((i6 & 896) == 256 ? (byte) 1 : (byte) 0) | ((i6 & 112) != 32 ? (byte) 0 : (byte) 1);
                    Object objP4 = fetVar.P();
                    if (z5 != 0 || objP4 == cl5Var) {
                        objP4 = new Function1() { // from class: a.k040
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b4 = b2;
                                my30 my30Var2 = my30Var;
                                Function1 function3 = function1;
                                switch (b4) {
                                    case 0:
                                        ((cll) obj).getClass();
                                        function3.invoke(((hy30) my30Var2).e);
                                        break;
                                    default:
                                        ((fc0) obj).getClass();
                                        function3.invoke(((iy30) my30Var2).d);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP4);
                    }
                    x8f.x(mm40Var2, cllVar, (Function1) objP4, fetVar, i6 & 14);
                    fetVar.r(false);
                } else {
                    if (!(my30Var instanceof iy30)) {
                        throw b1j.f(-382013018, fetVar, false);
                    }
                    fetVar.e0(1043721499);
                    fc0 fc0Var = ((iy30) my30Var).c;
                    boolean z6 = ((i6 & 112) == 32) | ((i6 & 896) == 256);
                    Object objP5 = fetVar.P();
                    if (z6 || objP5 == cl5Var) {
                        objP5 = new Function1() { // from class: a.k040
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b4 = b3;
                                my30 my30Var2 = my30Var;
                                Function1 function3 = function1;
                                switch (b4) {
                                    case 0:
                                        ((cll) obj).getClass();
                                        function3.invoke(((hy30) my30Var2).e);
                                        break;
                                    default:
                                        ((fc0) obj).getClass();
                                        function3.invoke(((iy30) my30Var2).d);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP5);
                    }
                    ny9.a(mm40Var2, fc0Var, (Function1) objP5, fetVar, i6 & 14);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        mm40 mm40Var3 = mm40Var2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var3, (Object) my30Var, (Object) function1, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final zsv zsvVar, final Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        Object objE;
        boolean z;
        boolean z2 = zsvVar.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(807771207);
        int i2 = i | (fetVar.g(zsvVar) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zH = fetVar.h(z2);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zH || objP == obj) {
                if (z2) {
                    ic50 ic50Var = ic50.c;
                    objE = q3d.e(new gc50("infoIconResId", ic50Var, R.drawable.ic_glyph_info_circle, new a2z(function1, (byte) 15), 2032), new gc50("editIconResId", ic50Var, zsvVar.d, new a2z(function2, (byte) 16), 2032));
                } else {
                    objE = q3d.e(new gc50("infoIconResId", ic50.c, R.drawable.ic_glyph_info_circle, new a2z(function1, (byte) 17), 2032));
                }
                objP = objE;
                fetVar.o0(objP);
            }
            final ArrayList arrayList = (ArrayList) objP;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            if (zsvVar.b.length() > 0) {
                fetVar.e0(756325468);
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = qd50.f28519a;
                    fetVar.o0(objP2);
                }
                xdr xdrVar = (xdr) ((jhy) objP2);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 56.0f, 1);
                boolean zI = ((i2 & 112) == 32) | ((i2 & 14) == 4) | fetVar.i(arrayList);
                Object objP3 = fetVar.P();
                if (zI || objP3 == obj) {
                    z = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objP3 = new Function1() { // from class: a.od50
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = objArr;
                            ArrayList<gc50> arrayList2 = arrayList;
                            Function0 function3 = function0;
                            zsv zsvVar2 = zsvVar;
                            switch (b3) {
                                case 0:
                                    yc50 yc50Var = (yc50) obj2;
                                    yc50Var.getClass();
                                    DsNavigationBarBasic dsNavigationBarBasic = yc50Var.b;
                                    Context context = yc50Var.f42370a.getContext();
                                    context.getClass();
                                    dsNavigationBarBasic.setTitleColor(m5d.b(R.attr.uikitTextPrimary, context));
                                    dsNavigationBarBasic.setTitle(zsvVar2.f44925a);
                                    String str = zsvVar2.b;
                                    if (str.length() > 0) {
                                        dsNavigationBarBasic.setSubTitle(str);
                                    }
                                    dsNavigationBarBasic.b(function3);
                                    dsNavigationBarBasic.setNavigationBarButtons(arrayList2);
                                    break;
                                default:
                                    zc50 zc50Var = (zc50) obj2;
                                    zc50Var.getClass();
                                    DsNavigationBarBasic dsNavigationBarBasic2 = zc50Var.b;
                                    dsNavigationBarBasic2.setTitle(zsvVar2.f44925a);
                                    dsNavigationBarBasic2.b(function3);
                                    dsNavigationBarBasic2.setNavigationBarButtons(arrayList2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP3);
                } else {
                    z = false;
                }
                y860.f(xdrVar, mm40VarG, (Function1) objP3, fetVar, 6, 0);
                fetVar.r(z);
            } else {
                fetVar.e0(757012242);
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = rd50.f30275a;
                    fetVar.o0(objP4);
                }
                xdr xdrVar2 = (xdr) ((jhy) objP4);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarG2 = o7k0.g(mm40VarD2, 0.0f, 56.0f, 1);
                boolean zI2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | fetVar.i(arrayList);
                Object objP5 = fetVar.P();
                if (zI2 || objP5 == obj) {
                    objP5 = new Function1() { // from class: a.od50
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b2;
                            ArrayList<gc50> arrayList2 = arrayList;
                            Function0 function3 = function0;
                            zsv zsvVar2 = zsvVar;
                            switch (b3) {
                                case 0:
                                    yc50 yc50Var = (yc50) obj2;
                                    yc50Var.getClass();
                                    DsNavigationBarBasic dsNavigationBarBasic = yc50Var.b;
                                    Context context = yc50Var.f42370a.getContext();
                                    context.getClass();
                                    dsNavigationBarBasic.setTitleColor(m5d.b(R.attr.uikitTextPrimary, context));
                                    dsNavigationBarBasic.setTitle(zsvVar2.f44925a);
                                    String str = zsvVar2.b;
                                    if (str.length() > 0) {
                                        dsNavigationBarBasic.setSubTitle(str);
                                    }
                                    dsNavigationBarBasic.b(function3);
                                    dsNavigationBarBasic.setNavigationBarButtons(arrayList2);
                                    break;
                                default:
                                    zc50 zc50Var = (zc50) obj2;
                                    zc50Var.getClass();
                                    DsNavigationBarBasic dsNavigationBarBasic2 = zc50Var.b;
                                    dsNavigationBarBasic2.setTitle(zsvVar2.f44925a);
                                    dsNavigationBarBasic2.b(function3);
                                    dsNavigationBarBasic2.setNavigationBarButtons(arrayList2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP5);
                }
                y860.f(xdrVar2, mm40VarG2, (Function1) objP5, fetVar, 6, 0);
                fetVar.r(false);
            }
            if (zsvVar.e) {
                fetVar.e0(757528950);
                zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), jd8.n));
                fetVar.r(false);
            } else {
                fetVar.e0(757739409);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 0, i, (Object) zsvVar, (Object) function0, (Object) function1, (Object) function2);
        }
    }

    public static final void k(mm40 mm40Var, vb90 vb90Var, boolean z, xcz xczVar, lh80 lh80Var, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        vb90Var.getClass();
        xczVar.getClass();
        function1.getClass();
        int i3 = i2 & 1;
        mm40 mm40VarS = jm40.b;
        mm40 mm40Var3 = i3 != 0 ? mm40VarS : mm40Var;
        ThemeColors themeColors = (ThemeColors) fetVar2.k(zaq0.b);
        Object objP = fetVar2.P();
        if (objP == ukd.f35823a) {
            if (z) {
                zcl zclVar = qmk.f28987a;
                long separator60 = themeColors.getSeparator60();
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarS = i120.S(mm40VarS, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            }
            fetVar2.o0(mm40VarS);
            objP = mm40VarS;
        }
        mm40 mm40Var4 = (mm40) objP;
        q0s q0sVar = vb90Var.b;
        a4x a4xVar = vb90Var.c;
        int iOrdinal = q0sVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw b1j.f(-975517472, fetVar2, false);
            }
            fetVar2.e0(-174639927);
            a(mm40Var3, xczVar, vb90Var.d, androidx.compose.runtime.e.f(a4xVar, fetVar2), lh80Var, u1c.M(323119106, new n82(mm40Var4, vb90Var, function1, (byte) 21), fetVar2), fetVar2, (i & 14) | 196608 | ((i >> 6) & 112) | (i & 57344));
            fetVar2.r(false);
            return;
        }
        fetVar2.e0(-176252950);
        mm40 mm40VarE0 = o2e.e0(s5x0.I(mm40Var3, lh80Var), "PEEKING_GAME_CARD_LIST_COLUMN");
        zcl zclVar3 = qmk.f28987a;
        x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
        Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 1151273100, a4xVar);
        while (itO.hasNext()) {
            a2n a2nVar = (a2n) itO.next();
            if (a2nVar == null) {
                mm40Var2 = mm40Var4;
            } else {
                if (a2nVar instanceof y56) {
                    fetVar2.e0(836369796);
                    mm40Var2 = mm40Var4;
                    vcc.i(mm40Var2, (y56) a2nVar, vb90Var.e, function1, null, fetVar2, ((i >> 6) & 7168) | 6, 16);
                    fetVar2.r(false);
                } else {
                    mm40Var2 = mm40Var4;
                    if (a2nVar instanceof c2o0) {
                        fetVar2.e0(836756800);
                        hkb.n(mm40Var2, (c2o0) a2nVar, vb90Var.e, function1, null, fetVar2, ((i >> 6) & 7168) | 6, 16);
                        fetVar2.r(false);
                    } else if (a2nVar instanceof x0g0) {
                        fetVar2.e0(837149694);
                        fet fetVar3 = fetVar2;
                        plc.m(mm40Var2, (x0g0) a2nVar, vb90Var.e, function1, fetVar3, ((i >> 6) & 7168) | 6, 0);
                        fetVar2 = fetVar3;
                        fetVar2.r(false);
                    }
                }
                mm40Var4 = mm40Var2;
            }
            fetVar2.e0(837476000);
            fetVar2.r(false);
            mm40Var4 = mm40Var2;
        }
        ohs0.x(fetVar2, false, true, false);
    }

    public static final void l(tnb0 tnb0Var, fet fetVar, int i) {
        tnb0Var.getClass();
        fetVar.g0(-1406651258);
        int i2 = (fetVar.g(tnb0Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int i3 = 0;
            for (Object obj : tnb0Var.f34226a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                yls ylsVar = (yls) obj;
                if (ylsVar != null) {
                    boolean z = ylsVar instanceof xls;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(405193431);
                        zcl zclVar = qmk.f28987a;
                        unh0.Y(0, (xls) ylsVar, fetVar, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13));
                        fetVar.r(false);
                    } else if (ylsVar instanceof wls) {
                        fetVar.e0(405433495);
                        zcl zclVar2 = qmk.f28987a;
                        ep20.a(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), (wls) ylsVar, fetVar, 0);
                        fetVar.r(false);
                    }
                    i3 = i4;
                }
                throw b1j.f(-818215048, fetVar, false);
            }
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snb0(tnb0Var, i, b2);
        }
    }

    public static final void m(epd0 epd0Var, tnd0 tnd0Var, Function1 function1, fet fetVar, int i) {
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1602752410);
        int i2 = i | (fetVar2.g(epd0Var) ? 32 : 16) | (fetVar2.g(tnd0Var) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b2));
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.5f, jm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z2 = epd0Var.f8182a;
            int i3 = i2 & 7168;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 2048) | (i4 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                function2 = function1;
                objP = new wod0((byte) 10, epd0Var, function2);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
            }
            int i5 = (i2 << 3) & 7168;
            byte b3 = 14;
            r(mm40VarA, str, str2, tnd0Var, z2, (Function0) objP, fetVar2, i5);
            mm40 mm40VarA2 = zhg0Var.a(0.5f, jm40Var, true);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z4 = epd0Var.f8182a;
            boolean z5 = (i3 == 2048) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new wod0((byte) 11, epd0Var, function2);
                fetVar2.o0(objP2);
            }
            r(mm40VarA2, str3, str4, tnd0Var, z4, (Function0) objP2, fetVar2, i5);
            fetVar2.r(true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4(b3)), yx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarA3 = zhg0Var.a(0.5f, jm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z6 = epd0Var.f8182a;
            boolean z7 = (i3 == 2048) | (i4 == 32);
            Object objP3 = fetVar2.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new wod0((byte) 12, epd0Var, function2);
                fetVar2.o0(objP3);
            }
            r(mm40VarA3, str5, str6, tnd0Var, z6, (Function0) objP3, fetVar2, i5);
            mm40 mm40VarA4 = zhg0Var.a(0.5f, jm40Var, true);
            String upperCase = rsm0.w(R.string.maximum, 0, fetVar2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            boolean z8 = epd0Var.f8182a;
            boolean z9 = (i4 == 32) | (i3 == 2048);
            Object objP4 = fetVar2.P();
            if (z9 || objP4 == cl5Var) {
                objP4 = new wod0(epd0Var, function2);
                fetVar2.o0(objP4);
            }
            q(mm40VarA4, upperCase, tnd0Var, z8, (Function0) objP4, fetVar2, i2 & 896);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(epd0Var, tnd0Var, function2, i, (byte) 8);
        }
    }

    public static final void n(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(353824270);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        int i3 = i2 | (fetVar.g(y9q0Var) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            long j = qmk.o;
            jm40 jm40Var = jm40.b;
            nnw0.g(s5x0.K(jm40Var, 8.0f, 4.0f), null, false, u1c.M(142366328, new apd0(w6kVar, str, y9q0Var, str2, j, g9q0VarN), fetVar), fetVar, 3072, 6);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 5, i, mm40Var2, str, str2, y9q0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(mm40 mm40Var, epd0 epd0Var, tnd0 tnd0Var, Function1 function1, xdr xdrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        xdr xdrVar2;
        boolean z;
        fetVar.g0(-206738810);
        int i2 = i | 6 | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.g(tnd0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | 24576;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xdr xdrVarM = u1c.M(1995901909, new sqc0((byte) 3, (Object) epd0Var, (Object) tnd0Var, function1), fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.25f, jm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z2 = epd0Var.f8182a;
            int i3 = i2 & 7168;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 2048) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new wod0((byte) 18, epd0Var, function1);
                fetVar.o0(objP);
            }
            int i5 = (i2 << 3) & 7168;
            r(mm40VarA, str, str2, tnd0Var, z2, (Function0) objP, fetVar, i5);
            mm40 mm40VarA2 = zhg0Var.a(0.25f, jm40Var, true);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z4 = epd0Var.f8182a;
            boolean z5 = (i3 == 2048) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new wod0((byte) 20, epd0Var, function1);
                fetVar.o0(objP2);
            }
            r(mm40VarA2, str3, str4, tnd0Var, z4, (Function0) objP2, fetVar, i5);
            mm40 mm40VarA3 = zhg0Var.a(0.25f, jm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z6 = epd0Var.f8182a;
            boolean z7 = (i3 == 2048) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (z7 || objP3 == cl5Var) {
                z = false;
                objP3 = new wod0(null == true ? 1 : 0, epd0Var, function1);
                fetVar.o0(objP3);
            } else {
                z = false;
            }
            r(mm40VarA3, str5, str6, tnd0Var, z6, (Function0) objP3, fetVar, i5);
            fetVar.e0(-1761648402);
            xdrVarM.F(zhg0Var, fetVar, 54);
            fetVar.r(z);
            fetVar.r(true);
            mm40Var2 = jm40Var;
            xdrVar2 = xdrVarM;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw(mm40Var2, epd0Var, tnd0Var, function1, xdrVar2, i);
        }
    }

    public static final void p(mm40 mm40Var, long j, boolean z, Function0 function0, xdr xdrVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-224639770);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(xdrVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 32.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new l3c0(function0, (byte) 5);
                fetVar.o0(objP);
            }
            Function0 function0G = phu0.G(0, 1, fetVar, (Function0) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, (gy40) objP2, null, z, null, function0G, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (xdrVar == null) {
                fetVar.e0(-483285899);
            } else {
                fetVar.e0(-292684532);
                xdrVar.F(jr8.f16991a, fetVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5h(mm40Var, j, z, function0, xdrVar, i, (byte) 5);
        }
    }

    public static final void q(mm40 mm40Var, String str, tnd0 tnd0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-218120459);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(tnd0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = (i2 & 14) | 24576;
            int i4 = i2 >> 3;
            p(mm40Var, tnd0Var.c, z, function0, u1c.M(793761134, new in80(str, tnd0Var, (byte) 12), fetVar), fetVar, i3 | (i4 & 896) | (i4 & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, (Object) str, (Object) tnd0Var, z, (wdr) function0, i, (byte) 4);
        }
    }

    public static final void r(mm40 mm40Var, String str, String str2, tnd0 tnd0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-274138468);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(tnd0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 >> 6;
            p(o2e.e0(mm40Var, "QUICK_BET_LABEL"), tnd0Var.c, z, function0, u1c.M(-1336147197, new sqc0(str, str2, tnd0Var, b2), fetVar), fetVar, (i3 & 7168) | (i3 & 896) | 24576);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) str, (Object) str2, (Object) tnd0Var, z, (wdr) function0, i, (byte) 26);
        }
    }

    public static final void s(mm40 mm40Var, epd0 epd0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        w6k w6kVar;
        tnd0 tnd0Var;
        function1.getClass();
        fetVar.g0(-775919878);
        int i2 = i | 6 | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = epd0Var.b;
            String str2 = epd0Var.c;
            String str3 = epd0Var.d;
            String upperCase = rsm0.w(R.string.maximum, 0, fetVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            g9q0 g9q0VarN = pym0.n(fetVar);
            w6k w6kVar2 = (w6k) fetVar.k(bmd.h);
            boolean zG = fetVar.g(str) | fetVar.g(str2) | fetVar.g(str3) | fetVar.g(upperCase);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                j83 j83Var = new j83(str);
                w6kVar = w6kVar2;
                objP = Integer.valueOf(idd.c(new int[]{(int) (g9q0.b(g9q0VarN, new j83(str2), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0VarN, new j83(str3), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0VarN, new j83(upperCase), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)}, (int) (g9q0.b(g9q0VarN, j83Var, g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)));
                fetVar.o0(objP);
            } else {
                w6kVar = w6kVar2;
            }
            float fR0 = w6kVar.r0(((Number) objP).intValue());
            zcl zclVar = qmk.f28987a;
            float f2 = ((fR0 + 2.0f + 24.0f) * 4.0f) + 12.0f + 32.0f;
            if (epd0Var.f8182a) {
                fetVar.e0(-1714489458);
                tnd0Var = new tnd0(R.style.TextStyle_Text_Medium_PrimaryForeground, ibm0.m(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary());
                fetVar.r(false);
            } else {
                fetVar.e0(-1714234762);
                tnd0Var = new tnd0(R.style.TextStyle_Text_Medium_Secondary40, ibm0.p(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20());
                fetVar.r(false);
            }
            jm40 jm40Var = jm40.b;
            nnw0.g(o7k0.d(jm40Var, 1.0f), null, false, u1c.M(1295468880, new tp7(f2, epd0Var, tnd0Var, function1), fetVar), fetVar, 3072, 6);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yod0(mm40Var2, epd0Var, function1, i, (byte) 1);
        }
    }

    public static final void t(mm40 mm40Var, jzh0 jzh0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        jzh0Var.getClass();
        fetVar.g0(1878166864);
        int i2 = i | 6 | (fetVar.g(jzh0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, 8.0f, 0.0f, 0.0f, 0.0f, 14), jzh0Var.b, kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) jzh0Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0209  */
    /* JADX WARN: Code duplicated, block: B:66:0x020b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0220  */
    /* JADX WARN: Code duplicated, block: B:70:0x0222  */
    /* JADX WARN: Code duplicated, block: B:73:0x0229  */
    /* JADX WARN: Code duplicated, block: B:76:0x022e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0241  */
    /* JADX WARN: Code duplicated, block: B:81:0x0243  */
    /* JADX WARN: Code duplicated, block: B:84:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x024c  */
    public static final void u(mm40 mm40Var, uzb0 uzb0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        cl5 cl5Var2;
        boolean z2;
        boolean z3;
        Object objP2;
        cl5 cl5Var3;
        boolean z4;
        Object objP3;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1098124853);
        int i2 = i | 6 | (fetVar2.e(uzb0Var.ordinal()) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.N(jm40Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
            wwb.i(null, xsm0.s(R.string.casino_providers_choose_sort_type, fetVar2), 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            kvl kvlVar = new kvl(uuidRandomUUID, new tui0(xsm0.s(R.string.casino_sort_type_popular, fetVar), null), null, new nvi0(uzb0Var == uzb0.f36529a), null, 500);
            int i3 = i2 & 896;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (z5 || objP4 == cl5Var4) {
                objP4 = new abh0(function1, (byte) 25);
                fetVar.o0(objP4);
            }
            Function1 function2 = (Function1) objP4;
            boolean z6 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var4) {
                objP5 = new abh0(function1, (byte) 26);
                fetVar.o0(objP5);
            }
            dub.x(mm40VarL, kvlVar, function2, (Function1) objP5, fetVar, 0, 4);
            qqm qqmVar = qqm.f29173a;
            zfi0 zfi0Var = zfi0.f44303a;
            vtb.t(null, qqmVar, zfi0Var, 0L, fetVar, 432, 9);
            mm40 mm40VarL2 = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            uuidRandomUUID2.getClass();
            kvl kvlVar2 = new kvl(uuidRandomUUID2, new tui0(xsm0.s(R.string.sort_type_a_z, fetVar), null), null, new nvi0(uzb0Var == uzb0.b), null, 500);
            boolean z7 = i3 == 256;
            Object objP6 = fetVar.P();
            if (z7) {
                cl5Var = cl5Var4;
            } else {
                cl5Var = cl5Var4;
                if (objP6 == cl5Var) {
                }
                Function1 function3 = (Function1) objP6;
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new abh0(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                cl5Var2 = cl5Var;
                dub.x(mm40VarL2, kvlVar2, function3, (Function1) objP, fetVar, 0, 4);
                vtb.t(null, qqmVar, zfi0Var, 0L, fetVar, 432, 9);
                mm40 mm40VarL3 = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                UUID uuidRandomUUID3 = UUID.randomUUID();
                uuidRandomUUID3.getClass();
                tui0 tui0Var = new tui0(xsm0.s(R.string.sort_type_z_a, fetVar), null);
                if (uzb0Var == uzb0.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                kvl kvlVar3 = new kvl(uuidRandomUUID3, tui0Var, null, new nvi0(z2), null, 500);
                if (i3 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = fetVar.P();
                if (z3) {
                    cl5Var3 = cl5Var2;
                } else {
                    cl5Var3 = cl5Var2;
                    if (objP2 == cl5Var3) {
                    }
                    Function1 function4 = (Function1) objP2;
                    if (i3 == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = fetVar.P();
                    if (z4 || objP3 == cl5Var3) {
                        objP3 = new elk0(function1, (byte) 0);
                        fetVar.o0(objP3);
                    }
                    dub.x(mm40VarL3, kvlVar3, function4, (Function1) objP3, fetVar, 0, 4);
                    fetVar2 = fetVar;
                    wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                    fetVar2.r(true);
                    mm40Var2 = jm40Var;
                }
                objP2 = new abh0(function1, (byte) 29);
                fetVar.o0(objP2);
                Function1 function5 = (Function1) objP2;
                if (i3 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = fetVar.P();
                if (z4) {
                    objP3 = new elk0(function1, (byte) 0);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new elk0(function1, (byte) 0);
                    fetVar.o0(objP3);
                }
                dub.x(mm40VarL3, kvlVar3, function5, (Function1) objP3, fetVar, 0, 4);
                fetVar2 = fetVar;
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            objP6 = new abh0(function1, (byte) 27);
            fetVar.o0(objP6);
            Function1 function6 = (Function1) objP6;
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new abh0(function1, (byte) 28);
                fetVar.o0(objP);
            } else {
                objP = new abh0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            cl5Var2 = cl5Var;
            dub.x(mm40VarL2, kvlVar2, function6, (Function1) objP, fetVar, 0, 4);
            vtb.t(null, qqmVar, zfi0Var, 0L, fetVar, 432, 9);
            mm40 mm40VarL4 = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            UUID uuidRandomUUID4 = UUID.randomUUID();
            uuidRandomUUID4.getClass();
            tui0 tui0Var2 = new tui0(xsm0.s(R.string.sort_type_z_a, fetVar), null);
            if (uzb0Var == uzb0.c) {
                z2 = true;
            } else {
                z2 = false;
            }
            kvl kvlVar4 = new kvl(uuidRandomUUID4, tui0Var2, null, new nvi0(z2), null, 500);
            if (i3 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP2 = fetVar.P();
            if (z3) {
                cl5Var3 = cl5Var2;
                if (objP2 == cl5Var3) {
                }
                Function1 function7 = (Function1) objP2;
                if (i3 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = fetVar.P();
                if (z4) {
                    objP3 = new elk0(function1, (byte) 0);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new elk0(function1, (byte) 0);
                    fetVar.o0(objP3);
                }
                dub.x(mm40VarL4, kvlVar4, function7, (Function1) objP3, fetVar, 0, 4);
                fetVar2 = fetVar;
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            } else {
                cl5Var3 = cl5Var2;
            }
            objP2 = new abh0(function1, (byte) 29);
            fetVar.o0(objP2);
            Function1 function8 = (Function1) objP2;
            if (i3 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP3 = fetVar.P();
            if (z4) {
                objP3 = new elk0(function1, (byte) 0);
                fetVar.o0(objP3);
            } else {
                objP3 = new elk0(function1, (byte) 0);
                fetVar.o0(objP3);
            }
            dub.x(mm40VarL4, kvlVar4, function8, (Function1) objP3, fetVar, 0, 4);
            fetVar2 = fetVar;
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, uzb0Var, function1, i, (byte) 7);
        }
    }

    public static final void v(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        int i2 = i >> 3;
        int i3 = i >> 6;
        int i4 = i3 & 896;
        kcx.r(mm40Var, j83Var, y9q0Var, fetVar, (i2 & 126) | i4);
        kcx.r(mm40Var, j83Var2, y9q0Var, fetVar, (i3 & 112) | (i2 & 14) | i4);
    }

    public static final void w(int i, ugd ugdVar, fet fetVar, wvw wvwVar, mm40 mm40Var, yjj0 yjj0Var, Function0 function0, boolean z) {
        int i2;
        fetVar.g0(-171935091);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(wvwVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new h7w((byte) 15);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40Var, false, (Function1) objP);
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            gmn0.b(function0, mm40VarA, z, yjj0Var, z ? wvwVar.f39859a : wvwVar.c, z ? wvwVar.b : wvwVar.d, 0.0f, 0.0f, null, u1c.M(669231714, new hja(ugdVar, (byte) 1), fetVar), fetVar, i3 | (234881024 & i4) | (i4 & 1879048192), 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvw(function0, mm40Var, z, yjj0Var, wvwVar, ugdVar, i, (byte) 2);
        }
    }

    public static final void x(mm40 mm40Var, ly30 ly30Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(108755609);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ly30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(h97.e(zclVar, zclVar, zclVar, zclVar, i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar))), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            gy30 gy30Var = ly30Var.f;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mbz(function1, ly30Var, (byte) 29);
                fetVar2.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            jiq0.y(jm40Var, gy30Var, (Function0) objP, null, null, fetVar2, 6, 24);
            cjm cjmVar = ly30Var.g;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ba30(function1, ly30Var, (byte) 5);
                fetVar2.o0(objP2);
            }
            v3c.r(jm40Var, cjmVar, 0.0f, null, null, (Function2) objP2, fetVar, 6, 28);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) ly30Var, (Object) function1, i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v19 */
    public static final void y(lc00 lc00Var, m9s m9sVar, oij0 oij0Var, long j, ctf0 ctf0Var) {
        ?? arrayList;
        long j2 = oij0Var.f;
        m9sVar.getClass();
        ctf0Var.getClass();
        String str = m9sVar.i;
        ArrayList arrayList2 = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, str, 0, R.color.static_white_80, 0, 0, 38);
        pzw.E(bnk0Var, "   ", 0, 0, 0, 0, 62);
        pzw.E(bnk0Var, f0(oij0Var.d), 0, R.color.static_white, 1, 0, 38);
        ank0 ank0VarL = w6x.l(arrayList2, bnk0Var.f2888a, arrayList2);
        nij0 nij0Var = oij0Var.f25315a;
        List list = oij0Var.c;
        nij0 nij0Var2 = nij0.d;
        int i = R.drawable.cybergame_killer_joker_bg;
        zij0 zij0Var = new zij0(ank0VarL, nij0Var == nij0Var2 ? R.drawable.cybergame_killer_joker_winner_bg : R.drawable.cybergame_killer_joker_bg);
        String str2 = m9sVar.j;
        ArrayList arrayList3 = new ArrayList();
        bnk0 bnk0Var2 = new bnk0();
        pzw.E(bnk0Var2, str2, 0, R.color.static_white_80, 0, 0, 38);
        pzw.E(bnk0Var2, "   ", 0, 0, 0, 0, 62);
        pzw.E(bnk0Var2, f0(oij0Var.e), 0, R.color.static_white, 1, 0, 38);
        ank0 ank0VarL2 = w6x.l(arrayList3, bnk0Var2.f2888a, arrayList3);
        if (nij0Var == nij0.f) {
            i = R.drawable.cybergame_killer_joker_winner_bg;
        }
        wij0 wij0Var = new wij0(ank0VarL2, i);
        List list2 = oij0Var.b;
        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList4.add(new una0(z1x.F((tna0) it.next())));
        }
        if (!list.isEmpty() || nij0Var == nij0.f23591a) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new una0(z1x.F((tna0) it2.next())));
            }
        } else {
            arrayList = kotlin.collections.a.c(new una0(R.drawable.card_back));
        }
        arrayList.getClass();
        xij0 xij0Var = new xij0(S(nij0Var, ctf0Var), !(j2 > 0 && nij0Var != nij0.f23591a));
        StringBuilder sb = new StringBuilder(ujn.h);
        if (StringsKt.O("static/img/ImgDefault/Esports/Sette_e_mezzo/Table.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/Sette_e_mezzo/Table.png", "https://", false)) {
            sb.setLength(0);
            sb.append("static/img/ImgDefault/Esports/Sette_e_mezzo/Table.png");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Sette_e_mezzo/Table.png", '/'));
        }
        String string = sb.toString();
        long j3 = j2 * 1000;
        String strS = S(nij0Var, ctf0Var);
        boolean z = j2 > 0 && nij0Var != nij0.f23591a;
        znq0 znq0Var = m9sVar.h.k;
        lc00Var.add(new cjj0(zij0Var, wij0Var, arrayList4, arrayList, xij0Var, string, new ajj0(j3, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, strS, z)));
        mij0 mij0Var = oij0Var.g;
        Integer numValueOf = Integer.valueOf(R.drawable.fool_7_spade);
        Integer numValueOf2 = Integer.valueOf(R.drawable.fool_k_heart);
        Integer numValueOf3 = Integer.valueOf(R.drawable.fool_7_heart);
        Integer numValueOf4 = Integer.valueOf(R.drawable.fool_a_heart);
        if (mij0Var == mij0.c) {
            return;
        }
        List<tij0> listJ = q3d.j(tij0.COST, tij0.COMBINATION);
        ArrayList arrayList5 = new ArrayList(r3d.q(listJ, 10));
        for (tij0 tij0Var : listJ) {
            mij0 mij0Var2 = mij0Var;
            arrayList5.add(new lxl(tij0Var.f34012a, (dyl) new xxl(ctf0Var.b.a(tij0Var.b, Arrays.copyOf(new Object[0], 0))), false, ((long) tij0Var.f34012a) == j ? uxl.b : uxl.f36445a, (cwl) null, 108));
            mij0Var = mij0Var2;
        }
        mij0 mij0Var3 = mij0Var;
        a4x a4xVarO0 = dyb.o0(arrayList5);
        lsm0 lsm0Var = ctf0Var.b;
        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2);
        pz40 pz40Var = s6t0.f31722a;
        y3d y3dVar = null;
        lc00Var.add(new boo0("SETTOE_MEZZO_TAB_KEY", new fyl(a4xVarO0, null, null, lh80VarT, new jyl(new y3d(ijg.D0), y3dVar, y3dVar, 126), 6), pno0.f27299a));
        tij0 tij0Var2 = tij0.COST;
        if (j == 1) {
            lc00Var.add(new kij0(new lij0(R.drawable.fool_a_heart, "1"), new lij0(R.drawable.fool_2_heart, "2"), new lij0(R.drawable.fool_3_heart, "3"), new lij0(R.drawable.fool_4_heart, "4"), new lij0(R.drawable.fool_5_heart, "5"), new lij0(R.drawable.fool_6_heart, "6"), new lij0(R.drawable.fool_7_heart, "7"), new lij0(R.drawable.fool_j_heart, "0.5"), new lij0(R.drawable.fool_q_heart, "0.5"), new lij0(R.drawable.fool_k_heart, "0.5")));
            return;
        }
        if (j == 2) {
            int iOrdinal = mij0Var3.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return;
                }
                iij0 iij0Var = new iij0("SETTOE_MEZZO_DEFAULT_FIRST_COMBINATION_KEY", lsm0Var.a(R.string.sette_e_mezzo_classic, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_first, Arrays.copyOf(new Object[0], 0)), false, q3d.j(numValueOf2, Integer.valueOf(R.drawable.fool_6_heart), numValueOf4), R.drawable.synthetic_settoe_mezzo_first_bg);
                iij0 iij0Var2 = new iij0("SETTOE_MEZZO_DEFAULT_SECOND_COMBINATION_KEY", lsm0Var.a(R.string.sette_e_mezzo_reale, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_second_new, Arrays.copyOf(new Object[0], 0)), false, q3d.j(numValueOf2, numValueOf3), R.drawable.synthetic_settoe_mezzo_middle_bg);
                iij0 iij0Var3 = new iij0("SETTOE_MEZZO_DEFAULT_THIRD_COMBINATION_KEY", lsm0Var.a(R.string.sette_e_mezzo_realissimo, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_third_new, Arrays.copyOf(new Object[0], 0)), false, q3d.j(Integer.valueOf(R.drawable.fool_k_diamond), numValueOf), R.drawable.synthetic_settoe_mezzo_middle_bg);
                iij0 iij0Var4 = new iij0("SETTOE_MEZZO_DEFAULT_FOURTH_COMBINATION_KEY", lsm0Var.a(R.string.sette_e_mezzo_doppio, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_fourth, Arrays.copyOf(new Object[0], 0)), false, q3d.j(numValueOf, numValueOf3), R.drawable.synthetic_settoe_mezzo_last_bg);
                lc00Var.add(iij0Var);
                lc00Var.add(iij0Var2);
                lc00Var.add(iij0Var3);
                lc00Var.add(iij0Var4);
                return;
            }
            String strA = lsm0Var.a(R.string.sette_e_mezzo_royal, Arrays.copyOf(new Object[0], 0));
            String strA2 = lsm0Var.a(R.string.settoe_mezzo_rule_five, Arrays.copyOf(new Object[0], 0));
            Integer numValueOf5 = Integer.valueOf(R.drawable.fool_7_diamond);
            iij0 iij0Var5 = new iij0("SETTOE_MEZZO_CUSTOM_FIRST_COMBINATION_KEY", strA, strA2, false, q3d.j(numValueOf5, Integer.valueOf(R.drawable.fool_k_spade)), R.drawable.synthetic_settoe_mezzo_first_bg);
            iij0 iij0Var6 = new iij0("SETTOE_MEZZO_CUSTOM_SECOND_COMBINATION_KEY", lsm0Var.a(R.string.sette_e_mezzo_partita, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_six, Arrays.copyOf(new Object[0], 0)), true, q3d.j(numValueOf3, numValueOf), R.drawable.synthetic_settoe_mezzo_middle_bg);
            iij0 iij0Var7 = new iij0("SETTOE_MEZZO_CUSTOM_THIRD_COMBINATION_KEY", lsm0Var.a(R.string.settoe_mezzo_rule_streat, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_seven, Arrays.copyOf(new Object[0], 0)), false, q3d.j(Integer.valueOf(R.drawable.fool_4_spade), Integer.valueOf(R.drawable.fool_3_club), Integer.valueOf(R.drawable.fool_2_heart)), R.drawable.synthetic_settoe_mezzo_middle_bg);
            String strA3 = lsm0Var.a(R.string.settoe_mezzo_rule_flash, Arrays.copyOf(new Object[0], 0));
            String strA4 = lsm0Var.a(R.string.settoe_mezzo_rule_eight, Arrays.copyOf(new Object[0], 0));
            Integer numValueOf6 = Integer.valueOf(R.drawable.fool_j_diamond);
            Integer numValueOf7 = Integer.valueOf(R.drawable.fool_6_diamond);
            iij0 iij0Var8 = new iij0("SETTOE_MEZZO_CUSTOM_FOURTH_COMBINATION_KEY", strA3, strA4, false, q3d.j(numValueOf6, numValueOf7, Integer.valueOf(R.drawable.fool_3_diamond)), R.drawable.synthetic_settoe_mezzo_middle_bg);
            String strA5 = lsm0Var.a(R.string.settoe_mezzo_rule_set, Arrays.copyOf(new Object[0], 0));
            String strA6 = lsm0Var.a(R.string.settoe_mezzo_rule_twelve, Arrays.copyOf(new Object[0], 0));
            Integer numValueOf8 = Integer.valueOf(R.drawable.fool_q_diamond);
            Integer numValueOf9 = Integer.valueOf(R.drawable.fool_q_spade);
            Integer numValueOf10 = Integer.valueOf(R.drawable.fool_q_heart);
            iij0 iij0Var9 = new iij0("SETTOE_MEZZO_CUSTOM_FIVE_COMBINATION_KEY", strA5, strA6, false, q3d.j(numValueOf8, numValueOf9, numValueOf10), R.drawable.synthetic_settoe_mezzo_middle_bg);
            iij0 iij0Var10 = new iij0("SETTOE_MEZZO_CUSTOM_SIX_COMBINATION_KEY", lsm0Var.a(R.string.settoe_mezzo_rule_streat_flash, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_ten, Arrays.copyOf(new Object[0], 0)), false, q3d.j(numValueOf5, numValueOf7, Integer.valueOf(R.drawable.fool_5_diamond)), R.drawable.synthetic_settoe_mezzo_middle_bg);
            iij0 iij0Var11 = new iij0("SETTOE_MEZZO_CUSTOM_SEVEN_COMBINATION_KEY", lsm0Var.a(R.string.settoe_mezzo_rule_royal_flash, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.settoe_mezzo_rule_eleven, Arrays.copyOf(new Object[0], 0)), false, q3d.j(numValueOf4, numValueOf2, numValueOf10), R.drawable.synthetic_settoe_mezzo_last_bg);
            lc00Var.add(iij0Var5);
            lc00Var.add(iij0Var6);
            lc00Var.add(iij0Var7);
            lc00Var.add(iij0Var8);
            lc00Var.add(iij0Var9);
            lc00Var.add(iij0Var10);
            lc00Var.add(iij0Var11);
        }
    }

    public static final mm40 z(fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new d39();
            fetVar.o0(objP);
        }
        d39 d39Var = (d39) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP2);
        }
        vne vneVar = (vne) objP2;
        mm40 mm40VarB = cfx0.B(jm40.b, d39Var);
        boolean zI = fetVar.i(vneVar) | fetVar.i(d39Var);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            objP3 = new nm40(vneVar, d39Var, (byte) 0);
            fetVar.o0(objP3);
        }
        return mm40Var.e(o050.T(mm40VarB, (Function1) objP3));
    }
}
