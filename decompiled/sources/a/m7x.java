package a;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f21340a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;

    public static final List A(nz50 nz50Var) {
        nz50Var.getClass();
        List list = (List) B(nz50Var);
        return list == null ? iun.f15405a : list;
    }

    public static final Object B(nz50 nz50Var) {
        Object obj;
        nz50Var.getClass();
        kz50 kz50Var = nz50Var instanceof kz50 ? (kz50) nz50Var : null;
        if (kz50Var != null && (obj = kz50Var.f19139a) != null) {
            return obj;
        }
        lz50 lz50Var = nz50Var instanceof lz50 ? (lz50) nz50Var : null;
        if (lz50Var != null) {
            return lz50Var.f20891a;
        }
        return null;
    }

    public static boolean C(hky hkyVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (hkyVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return hkyVar.f(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f21340a) {
                            try {
                                b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f21340a = true;
                        }
                        Method method = b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (rgu0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    c = true;
                }
                Field field = d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (rgu0.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && rgu0.c(view, keyEvent)) || hkyVar.f(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final Throwable D(nz50 nz50Var) {
        nz50Var.getClass();
        lz50 lz50Var = nz50Var instanceof lz50 ? (lz50) nz50Var : null;
        if (lz50Var != null) {
            return lz50Var.b;
        }
        return null;
    }

    public static final j83 E(ctf0 ctf0Var, String str, int i) {
        h83 h83Var = new h83();
        h83 h83Var2 = new h83();
        String strR = w6x.r(new Object[0], 0, ctf0Var.b, i, ": ");
        long j = y3d.g;
        long j2 = daq0.c;
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
        nrq nrqVar = g1t0.d().f42262a.f;
        long j3 = g1t0.d().f42262a.b;
        j56 j56Var = new j56(0.0f);
        k5q0 k5q0Var = k5q0.b;
        smk0 smk0Var = new smk0(jM123getWhite0d7_KjU, j3, null, null, null, nrqVar, null, j2, j56Var, null, null, j, k5q0Var, null, null, 17424);
        h83Var2.c(strR);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        h83 h83Var3 = new h83();
        str.getClass();
        smk0 smk0Var2 = new smk0(staticColors.m123getWhite0d7_KjU(), g1t0.g().f42262a.b, null, null, null, g1t0.g().f42262a.f, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
        h83Var3.c(str);
        StringBuilder sb2 = h83Var3.f12607a;
        h83Var3.a(smk0Var2, 0, sb2.length());
        sb2.length();
        h83Var.b(h83Var3.h());
        return h83Var.h();
    }

    public static ArrayList F(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = iun.f15405a;
        }
        ArrayList arrayListS = CollectionsKt.S(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListS) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new ryb0(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, Intrinsics.d(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final gbn G(Function1 function1) {
        byte b2 = 26;
        return new gbn(new v1x((byte) 5), new pkv(3, b2), new dht(function1, b2), btv.w);
    }

    public static final String H(rbb rbbVar) {
        String str = rbbVar.g;
        str.getClass();
        pcb pcbVar = new pcb(str);
        String str2 = rbbVar.h;
        str2.getClass();
        return rcb.d0(pcbVar, new pcb(str2), rbbVar.k);
    }

    public static final String I(sum0 sum0Var, zmb zmbVar) {
        int iOrdinal = zmbVar.ordinal();
        if (iOrdinal == 0) {
            String str = sum0Var.g;
            str.getClass();
            pcb pcbVar = new pcb(str);
            String str2 = sum0Var.f;
            str2.getClass();
            return rcb.d0(pcbVar, new pcb(str2), sum0Var.j);
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        String str3 = sum0Var.f;
        str3.getClass();
        pcb pcbVar2 = new pcb(str3);
        String str4 = sum0Var.g;
        str4.getClass();
        return rcb.d0(pcbVar2, new pcb(str4), sum0Var.j);
    }

    public static ryb0 J(Context context) {
        Object next;
        String strW;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = F(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ryb0) next).b != iMyPid);
        ryb0 ryb0Var = (ryb0) next;
        if (ryb0Var != null) {
            return ryb0Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            strW = Process.myProcessName();
            strW.getClass();
        } else if ((i < 28 || (strW = Application.getProcessName()) == null) && (strW = p7x.w()) == null) {
            strW = "";
        }
        return new ryb0(iMyPid, 0, strW, false);
    }

    public static final wui0 K(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }

    public static final gbn L(Function1 function1) {
        return new gbn(new jak0((byte) 16), new asj0(3, (byte) 5), new elk0(function1, (byte) 2), wjj0.l);
    }

    public static final kgy M(wsy wsyVar) {
        wsyVar.getClass();
        return (kgy) lmc.V(wsyVar, azs0.i, tv9.e);
    }

    public static final boolean N(AtomicReference atomicReference) {
        while (true) {
            Object obj = atomicReference.get();
            obj.getClass();
            y5k0 y5k0Var = (y5k0) obj;
            if (y5k0Var.t) {
                return false;
            }
            y5k0 y5k0VarA = y5k0.a(y5k0Var, null, null, null, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 1572863);
            while (!atomicReference.compareAndSet(y5k0Var, y5k0VarA)) {
                if (atomicReference.get() != y5k0Var) {
                }
            }
            return true;
        }
    }

    public static final khf0 O(kxq kxqVar, String str, String... strArr) {
        v1r v1rVarR = kxqVar.r();
        v1rVarR.getClass();
        ugf0 ugf0Var = new ugf0();
        ugf0Var.f35622a = v1rVarR;
        khf0 khf0Var = new khf0(kxqVar);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length + 1;
        String[] strArr3 = new String[length];
        int i = 0;
        while (i < length) {
            strArr3[i] = i == 0 ? str : strArr2[i - 1];
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            if (str2.length() > 0) {
                arrayList.add(str2);
            }
        }
        khf0Var.b = (String[]) arrayList.toArray(new String[0]);
        khf0Var.c = ugf0Var;
        return khf0Var;
    }

    public static final khf0 P(Fragment fragment, String str, String... strArr) {
        fragment.getClass();
        return O(fragment.n0(), str, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final khf0 Q(Fragment fragment, String str, String... strArr) {
        fragment.getClass();
        kxq kxqVarB = fragment.B();
        if (kxqVarB != null) {
            return O(kxqVarB, str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return null;
    }

    public static final uv20 R(ou20 ou20Var, boolean z, y9q0 y9q0Var, boolean z2) {
        tv20 tv20Var;
        long j = ou20Var.b;
        String str = ou20Var.c;
        if (z) {
            str = "[" + j + "]: " + str;
        }
        String str2 = str;
        boolean z3 = ou20Var.g;
        boolean z4 = ou20Var.f;
        Iterator it = ou20Var.f25856a.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        f07 f07Var = ou20Var.e;
        boolean z5 = f07Var == f07.b;
        boolean z6 = f07Var == f07.c;
        boolean z7 = ou20Var.d;
        if (z5) {
            tv20Var = rv20.f31151a;
        } else if (z6 && z2) {
            tv20Var = pv20.f27643a;
        } else {
            tv20Var = z7 ? sv20.f32848a : qv20.f29369a;
        }
        return new uv20(j, str2, z3, z4, size, tv20Var, true, f07Var, y9q0Var);
    }

    public static final a2l0 S(String str) {
        pz40 pz40Var = s6t0.f31722a;
        return new a2l0(str, s6t0.b().f33626a.getTextPrimary());
    }

    public static final cra0 T(rbb rbbVar, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState) {
        boolean z = feedsChampsItemsSelectionState.f46666a;
        Set set = feedsChampsItemsSelectionState.b;
        boolean z2 = z && set.contains(Long.valueOf(rbbVar.f30176a));
        boolean z3 = z2 || set.size() < 10;
        int i = rbbVar.l ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
        String strH = H(rbbVar);
        String str = rbbVar.c;
        int i2 = (int) rbbVar.f;
        pgb pgbVar = rbbVar.o;
        return new cra0(rbbVar.f30176a, rbbVar.c, rbbVar.n, strH, z(str, i2, strH, r(pgbVar == pgb.b, pgbVar == pgb.c), feedsChampsItemsSelectionState.f46666a, z2, z3, i), rbbVar.j, rbbVar.m, rbbVar.l);
    }

    public static final fdl0 U(cok0 cok0Var, Set set) {
        String string;
        cok0Var.getClass();
        set.getClass();
        boolean zContains = set.contains(Long.valueOf(cok0Var.f4705a));
        long j = cok0Var.f4705a;
        String str = cok0Var.b;
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new fdl0(j, str, string, zContains);
    }

    public static final dra0 V(sum0 sum0Var, zmb zmbVar, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState) {
        boolean z = feedsChampsItemsSelectionState.f46666a;
        Set set = feedsChampsItemsSelectionState.b;
        boolean z2 = z && set.contains(Long.valueOf(sum0Var.f32829a));
        boolean z3 = z2 || set.size() < 10;
        int i = sum0Var.k ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
        String strI = I(sum0Var, zmbVar);
        String str = sum0Var.c;
        int i2 = (int) sum0Var.e;
        pgb pgbVar = sum0Var.n;
        return new dra0(sum0Var.f32829a, sum0Var.c, sum0Var.l, strI, z(str, i2, strI, r(pgbVar == pgb.b, pgbVar == pgb.c), feedsChampsItemsSelectionState.f46666a, z2, z3, i), sum0Var.i, sum0Var.k, new yi00(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public static final void a(voa0 voa0Var, fet fetVar, int i) {
        fet fetVar2;
        ?? r14;
        fet fetVar3 = fetVar;
        voa0Var.getClass();
        fetVar3.g0(790783810);
        int i2 = i | (fetVar3.g(voa0Var) ? 4 : 2);
        if (fetVar3.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarY, 0.0f, 2.0f, 0.0f, 2.0f, 5);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 1.0f, 0.0f, 1.0f, 4);
            nrq nrqVar = g1t0.g().f42262a.f;
            long j = g1t0.g().f42262a.b;
            String str = voa0Var.f37757a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, j, null, null, nrqVar, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 261992);
            fet fetVar4 = fetVar;
            if (voa0Var.b) {
                fetVar4.e0(1368191568);
                r14 = 0;
                b(rsm0.w(R.string.match_progress_break_point, 0, fetVar4), StaticColors.INSTANCE.m92getDarkPink0d7_KjU(), fetVar4, 0);
                fetVar4.r(false);
            } else {
                r14 = 0;
                fetVar4.e0(1368364548);
                fetVar4.r(false);
            }
            if (voa0Var.c) {
                fetVar4.e0(1368407700);
                b(rsm0.w(R.string.match_progress_set_point, r14, fetVar4), StaticColors.INSTANCE.m111getPurple0d7_KjU(), fetVar4, r14);
                fetVar4.r(r14);
            } else {
                fetVar4.e0(1368576836);
                fetVar4.r(r14);
            }
            if (voa0Var.d) {
                fetVar4.e0(1368621972);
                b(rsm0.w(R.string.match_progress_match_point, r14, fetVar4), StaticColors.INSTANCE.m119getTeal0d7_KjU(), fetVar4, r14);
                fetVar4.r(r14);
            } else {
                fetVar4.e0(1368791108);
                fetVar4.r(r14);
            }
            if (voa0Var.e) {
                fetVar4.e0(1368834167);
                b(rsm0.w(R.string.match_progress_darts_140, r14, fetVar4), s6t0.b().f33626a.getSecondary(), fetVar4, r14);
                fetVar4.r(r14);
            } else {
                fetVar4.e0(1369000420);
                fetVar4.r(r14);
            }
            if (voa0Var.f) {
                fetVar4.e0(1369043417);
                b(rsm0.w(R.string.match_progress_darts_180, r14, fetVar4), s6t0.b().f33626a.getPrimary(), fetVar4, r14);
                fetVar4.r(r14);
            } else {
                fetVar4.e0(1369207748);
                fetVar4.r(r14);
            }
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(voa0Var, i, (byte) 19);
        }
    }

    public static final void b(String str, long j, fet fetVar, int i) {
        fetVar.g0(943826626);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, s5x0.K(i120.Q(s5x0.N(jm40.b, 2.0f, 0.0f, 0.0f, 0.0f, 14), j, vgg0.a(2.0f)), 4.0f, 1.0f), y3d.c, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, (i2 & 14) | 384, 0, 260968);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bs0(str, j, i, (byte) 4);
        }
    }

    public static final void c(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        pfx pfxVarI;
        fetVar.g0(-421890762);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            int i3 = q33Var.e().d;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 == 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                fetVar.e0(-1472772378);
                View view = (View) fetVar.k(dy2.f);
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(2)) != null) {
                    numValueOf2 = Integer.valueOf(pfxVarI.d);
                }
                fetVar.r(false);
                numValueOf = numValueOf2;
            } else {
                fetVar.e0(-1710082321);
                fetVar.r(false);
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean zE = fetVar.e(iIntValue);
            Object objP = fetVar.P();
            byte b2 = 6;
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iIntValue, b2);
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
            ugdVar.F(mrv.k0(jm40Var, "MEDIA_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(-1219596865);
                fetVar.r(false);
            } else {
                fetVar.e0(376300162);
                w6x.v(((i2 >> 3) & 112) | 6, xdrVar, mrv.k0(jm40Var, "COMPANY_LOGO_ID"), fetVar, false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(-1219518497);
                fetVar.r(false);
            } else {
                fetVar.e0(376302690);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "PARTNER_LOGO_ID"), fetVar, false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "STEP_PROGRESS_BAR_ID"), fetVar, 54);
            ugdVar5 = ugdVar3;
            ugdVar5.F(mrv.k0(jm40Var, "APP_VERSION_ID"), fetVar, 54);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar, xdrVar2, ugdVar4, ugdVar5, i, (byte) 3);
        }
    }

    public static final void d(nv10 nv10Var, Function0 function0, fet fetVar, int i) {
        function0.getClass();
        fetVar.g0(1160956675);
        int i2 = i | (fetVar.g(nv10Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        byte b2 = 9;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(l4b.ALL);
                fetVar.o0(objP);
            }
            m8x.y(null, u1c.M(-1370690873, new wr4(function0, (byte) 8), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(-280683566, new ri1((pz40) objP, nv10Var, b2), fetVar), fetVar, 805306416, 445);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) nv10Var, (Object) function0, i, (byte) 9);
        }
    }

    public static final void e(int i, fet fetVar) {
        fetVar.g0(644316497);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            v8q0.a(rsm0.w(R.string.operator_rating_title, 0, fetVar), o7k0.d(s5x0.L(jm40.b, 16.0f, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 0, 130040);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zc70(i, (byte) 7);
        }
    }

    public static final void f(mm40 mm40Var, l4b l4bVar, nv10 nv10Var, fet fetVar, int i) {
        l4b l4bVar2;
        mm40 mm40Var2;
        l4bVar.getClass();
        fetVar.g0(-1261764386);
        int i2 = i | 6 | (fetVar.e(l4bVar.ordinal()) ? 32 : 16) | (fetVar.g(nv10Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new km00(nv10Var, (byte) 12);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                l4bVar2 = l4bVar;
                objP2 = new km00(l4bVar2, (byte) 13);
                fetVar.o0(objP2);
            } else {
                l4bVar2 = l4bVar;
            }
            dwi0.b(function1, mm40VarN, (Function1) objP2, fetVar, 0, 0);
            mm40Var2 = jm40Var;
        } else {
            l4bVar2 = l4bVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, l4bVar2, nv10Var, i, (byte) 9);
        }
    }

    public static final void g(int i, fet fetVar) {
        fetVar.g0(1434745332);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            p3c0.a(o7k0.n(jm40Var, 32.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0.0f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), 0, 0.0f, fetVar, 0, 52);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zc70(i, (byte) 17);
        }
    }

    public static final void h(mm40 mm40Var, final h6a0 h6a0Var, Function2 function2, xdr xdrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(1470272260);
        int i2 = i | 6 | (fetVar.g(h6a0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new e6a0(function2, h6a0Var, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            ugd ugdVarM = u1c.M(-724015963, new Function2() { // from class: a.g6a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    h6a0 h6a0Var2 = h6a0Var;
                    fet fetVar2 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b4) {
                        case 0:
                            if (!fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                fetVar2.X();
                            } else if (h6a0Var2.f) {
                                fetVar2.e0(166256319);
                                r7x.g(0, fetVar2, null);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(166315901);
                                fetVar2.r(false);
                            }
                            break;
                        default:
                            if (!fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                fetVar2.X();
                            } else if (h6a0Var2.d) {
                                fetVar2.e0(714877947);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(714788574);
                                l7x.u(0, fetVar2, null, h6a0Var2.e);
                                fetVar2.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            ugd ugdVarM2 = u1c.M(-1879723250, new p0z((Object) h6a0Var, (byte) 23), fetVar);
            ugd ugdVarM3 = u1c.M(-40055257, new Function2() { // from class: a.g6a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    h6a0 h6a0Var2 = h6a0Var;
                    fet fetVar2 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b4) {
                        case 0:
                            if (!fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                fetVar2.X();
                            } else if (h6a0Var2.f) {
                                fetVar2.e0(166256319);
                                r7x.g(0, fetVar2, null);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(166315901);
                                fetVar2.r(false);
                            }
                            break;
                        default:
                            if (!fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                fetVar2.X();
                            } else if (h6a0Var2.d) {
                                fetVar2.e0(714877947);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(714788574);
                                l7x.u(0, fetVar2, null, h6a0Var2.e);
                                fetVar2.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            ugd ugdVarM4 = u1c.M(-1845558552, new xd80(h6a0Var, xdrVar, (byte) 27), fetVar);
            ugd ugdVarM5 = u1c.M(643905449, new xd80(h6a0Var, function2, (byte) 28), fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarW, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVarM.invoke(fetVar, 6);
            ugdVarM2.F(zhg0.f44392a, fetVar, 54);
            ugdVarM3.invoke(fetVar, 6);
            ugdVarM4.invoke(fetVar, 6);
            ugdVarM5.invoke(fetVar, 6);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 25, i, (Object) mm40Var2, (Object) h6a0Var, (Object) function2, (Object) xdrVar);
        }
    }

    public static final void i(mm40 mm40Var, lzc0 lzc0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        lzc0Var.getClass();
        v12 v12Var = lzc0Var.b;
        function1.getClass();
        fetVar.g0(935126315);
        int i2 = i | 6 | (fetVar.g(lzc0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = v12Var.ordinal();
            float f2 = (iOrdinal == 1 || iOrdinal == 2) ? 8.0f : 0.0f;
            int iOrdinal2 = v12Var.ordinal();
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarD, 0.0f, f2, 0.0f, (iOrdinal2 == 2 || iOrdinal2 == 3) ? 8.0f : 0.0f, 5), "DS_PROMOTION_CARD");
            kzc0 kzc0Var = lzc0Var.f20898a;
            hzc0 hzc0Var = new hzc0(ma80.f21447a);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ru80(function1, (byte) 7);
                fetVar.o0(objP);
            }
            uzb.t(mm40VarE0, kzc0Var, hzc0Var, null, (Function2) objP, fetVar, 3456);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, lzc0Var, function1, i, (byte) 6);
        }
    }

    public static final void j(mm40 mm40Var, n1e0 n1e0Var, fet fetVar, int i) {
        n1e0Var.getClass();
        fetVar.g0(-1723644267);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(n1e0Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 64.0f), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            z1x.m(s5x0.L(i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(20.0f)), 12.0f, 0.0f, 2), new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, u1c.M(340490, new o3m((Object) n1e0Var, z, (byte) 6), fetVar), u1c.M(1007263179, new rqc0(n1e0Var, b2), fetVar), null, fetVar, 28032, 32);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, n1e0Var, i, (byte) 7);
        }
    }

    public static final void k(int i, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, xdr xdrVar, fet fetVar, mm40 mm40Var) {
        ugd ugdVar4;
        xdr xdrVar2;
        ugd ugdVar5;
        ugd ugdVar6;
        fetVar.g0(1871323345);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(xdrVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            ugdVar5 = ugdVar3;
            iop iopVar = new iop(ugdVar, ugdVar2, ugdVar5, xdrVar, (byte) 2);
            ugdVar6 = ugdVar;
            ugdVar4 = ugdVar2;
            xdrVar2 = xdrVar;
            d7x.l(mm40VarQ, null, u1c.M(857768872, iopVar, fetVar), fetVar, 384);
        } else {
            ugdVar4 = ugdVar2;
            xdrVar2 = xdrVar;
            ugdVar5 = ugdVar3;
            ugdVar6 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a330(mm40Var, xdrVar2, ugdVar6, ugdVar4, ugdVar5, i);
        }
    }

    public static final void l(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, xdr xdrVar, ydr ydrVar, fet fetVar, int i) {
        ugd ugdVar3;
        ydr ydrVar2;
        ugd ugdVar4;
        boolean z;
        fetVar.g0(-548250179);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(xdrVar) ? 2048 : 1024) | (fetVar.i(ydrVar) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 2.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            y5d y5dVar = y5d.f42040a;
            ugdVar4 = ugdVar;
            ugdVar4.F(y5dVar, fetVar, 54);
            ugdVar3 = ugdVar2;
            ugdVar3.F(y5dVar, fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(-574451076);
                z = false;
            } else {
                z = false;
                fetVar.e0(951300645);
                xdrVar.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
            }
            fetVar.r(z);
            fetVar.r(true);
            if (ydrVar == null) {
                fetVar.e0(-1170177552);
                fetVar.r(z);
                ydrVar2 = ydrVar;
            } else {
                fetVar.e0(-37747663);
                zx7 zx7Var = gqw0.c;
                jr8 jr8Var = jr8.f16991a;
                ydrVar2 = ydrVar;
                ydrVar2.j(jr8Var, jr8Var.b(jm40Var, zx7Var), fetVar, Integer.valueOf(6 | ((i2 >> 6) & 896)));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            ugdVar3 = ugdVar2;
            ydrVar2 = ydrVar;
            ugdVar4 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) ugdVar4, (Object) ugdVar3, (Object) xdrVar, (Object) ydrVar2, i, (byte) 25);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1932011939);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.K(jm40Var, 4.0f, 12.0f), 96.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 196.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 21);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-64764084);
        int i2 = (fetVar.g(l7m0Var) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            qjh0 qjh0Var = (qjh0) l7m0Var.getValue();
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(ddz.a(0, 0, fetVar, 0, 3), fetVar), null);
            boolean zG = fetVar.g(qjh0Var) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new dff0(qjh0Var, function1, (byte) 24);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 22);
        }
    }

    public static final void o(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fetVar.g0(182945009);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kr00.a(u1c.M(-585461138, new esw((byte) 3, mm40Var, pz40Var), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 5);
        }
    }

    public static final double p(double d2, int i) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN);
        bigDecimalDivide.getClass();
        return bigDecimalDivide.doubleValue();
    }

    public static final double q(double d2, double d3) {
        BigDecimal bigDecimalMultiply = new BigDecimal(String.valueOf(d2)).multiply(new BigDecimal(String.valueOf(d3)));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply.doubleValue();
    }

    public static final uf5 r(boolean z, boolean z2) {
        if (z) {
            return new pf5(3, null);
        }
        if (z2) {
            return new of5();
        }
        return null;
    }

    public static final mgh s(long j, ArrayList arrayList, ctf0 ctf0Var) {
        int i;
        ctf0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((StatisticBlockModel) obj).c) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int size2 = arrayList.size();
        String strA = size == 0 ? "" : ctf0Var.b.a(R.string.hidden_amount, Arrays.copyOf(new Object[]{String.valueOf(size), Integer.valueOf(size2)}, 2));
        if (arrayList.isEmpty()) {
            i = R.drawable.ic_glyph_select_all_inactive;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StatisticBlockModel statisticBlockModel = (StatisticBlockModel) it.next();
                if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            StatisticBlockModel statisticBlockModel2 = (StatisticBlockModel) it2.next();
                            if (!statisticBlockModel2.c || statisticBlockModel2.b != arrayList.indexOf(statisticBlockModel2)) {
                                i = R.drawable.ic_glyph_select_all_active;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            i = R.drawable.ic_glyph_select_all_inactive;
        }
        return new mgh(strA, i, j);
    }

    public static final int t(c810 c810Var, w12 w12Var) {
        c810 c810VarH0 = c810Var.H0();
        if (c810VarH0 == null) {
            xcx.b("Child of " + c810Var + " cannot be null when calculating alignment line");
        }
        if (c810Var.N0().a().containsKey(w12Var)) {
            Integer num = (Integer) c810Var.N0().a().get(w12Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iC0 = c810VarH0.c0(w12Var);
            if (iC0 != Integer.MIN_VALUE) {
                boolean z = c810Var.n;
                boolean z2 = c810Var.o;
                c810VarH0.n = true;
                c810Var.o = true;
                c810Var.T0();
                c810VarH0.n = z;
                c810Var.o = z2;
                return iC0 + ((int) (w12Var instanceof ykw ? c810VarH0.P0() & 4294967295L : c810VarH0.P0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final void u(AtomicReference atomicReference) {
        atomicReference.getClass();
        while (true) {
            Object obj = atomicReference.get();
            obj.getClass();
            y5k0 y5k0Var = (y5k0) obj;
            if (y5k0Var.u) {
                y5k0 y5k0VarA = y5k0.a(y5k0Var, null, null, null, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 1048575);
                while (!atomicReference.compareAndSet(y5k0Var, y5k0VarA)) {
                    if (atomicReference.get() != y5k0Var) {
                    }
                }
                return;
            }
            return;
        }
    }

    public static int v(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long jT = vtt0.T(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (jT > 0 && jT <= 2147483647L) {
                return (int) jT;
            }
        }
        return -2147483647;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String w(mer merVar, int i) {
        String strB;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        merVar.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (merVar instanceof x4e) {
                strB = "<init>";
            } else {
                strB = ((wjj) merVar).getName().b();
                strB.getClass();
            }
            sb.append(strB);
        }
        sb.append(Separators.LPAREN);
        c8z c8zVarF = merVar.F();
        if (c8zVarF != null) {
            wsy type = c8zVarF.getType();
            type.getClass();
            sb.append(M(type));
        }
        Iterator it = merVar.z().iterator();
        while (it.hasNext()) {
            wsy type2 = ((k3u0) it.next()).getType();
            type2.getClass();
            sb.append(M(type2));
        }
        sb.append(Separators.RPAREN);
        if (z) {
            if (merVar instanceof x4e) {
                sb.append(TokenNames.V);
            } else {
                wsy returnType = merVar.getReturnType();
                returnType.getClass();
                g950 g950Var = ary.e;
                if (ary.E(returnType, i4m0.d)) {
                    wsy returnType2 = merVar.getReturnType();
                    returnType2.getClass();
                    if (!e0t0.e(returnType2) && !(merVar instanceof g0d0)) {
                        sb.append(TokenNames.V);
                    }
                }
                wsy returnType3 = merVar.getReturnType();
                returnType3.getClass();
                sb.append(M(returnType3));
            }
        }
        return sb.toString();
    }

    public static final String x(kp9 kp9Var) {
        if (!oek.n(kp9Var)) {
            vjj vjjVarJ = kp9Var.j();
            wm40 wm40Var = vjjVarJ instanceof wm40 ? (wm40) vjjVarJ : null;
            if (wm40Var != null && !wm40Var.getName().b) {
                kp9 kp9VarO1 = kp9Var.o1();
                fyj0 fyj0Var = kp9VarO1 instanceof fyj0 ? (fyj0) kp9VarO1 : null;
                if (fyj0Var != null) {
                    String strW = w(fyj0Var, 3);
                    String str = bay.f2281a;
                    qlc qlcVarH = bay.h(rek.g(wm40Var).f32934a);
                    return (qlcVarH != null ? rey.b(qlcVarH) : lmc.F(wm40Var, hfk0.f)) + '.' + strW;
                }
            }
        }
        return null;
    }

    public static final bra0 y(rbb rbbVar, String str) {
        String string;
        long j = rbbVar.n;
        str.getClass();
        if (j != 0) {
            bzu bzuVarE = rz4.e("static", "svg", "sports_v3", str);
            rz4.s(j, ".svg", bzuVarE);
            string = ((StringBuilder) bzuVarE.b).toString();
        } else {
            string = "";
        }
        String str2 = string;
        boolean zEquals = str.equals("monochrome");
        ojm ojmVar = new ojm(127);
        String str3 = rbbVar.e;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        return new bra0(new hjm(str3, ojmVar, null, new n0x(str2), null, new m0x(R.drawable.ic_glyph_category_new, null, 6), false, null, null, zEquals, null, null, 7636), rbbVar.e, rbbVar.n, str2);
    }

    public static final s7l0 z(String str, int i, String str2, uf5 uf5Var, boolean z, boolean z2, boolean z3, int i2) {
        return z ? new m7l0(S(str), i, str2, uf5Var, z2, z3, 24) : new l7l0(S(str), i, i2, str2, uf5Var, 48);
    }
}
