package a;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes2.dex */
public final class m2a implements w58, vke, l9a, hje, syh, jyj0, k3p, qsr, l3u0, k3z, yd40, igk0, nwp0, qv90 {
    public static final m2a A;
    public static final m2a B;
    public static final m2a Y;
    public static final m2a x;
    public static final m2a y;
    public static final m2a z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21046a;
    public static final m2a b = new m2a(1);
    public static final m2a c = new m2a(2);
    public static final m2a d = new m2a(3);
    public static final m2a e = new m2a(4);
    public static final m2a f = new m2a(5);
    public static final m2a g = new m2a(6);
    public static final ek5 h = new ek5(16);
    public static final m2a i = new m2a(8);
    public static final m2a j = new m2a(9);
    public static final m2a k = new m2a(10);
    public static final m2a l = new m2a(11);
    public static final m2a m = new m2a(12);
    public static final m2a n = new m2a(14);
    public static final m2a o = new m2a(15);
    public static final m2a p = new m2a(16);
    public static final m2a q = new m2a(17);
    public static final m2a r = new m2a(18);
    public static final pn20 s = new pn20(1);
    public static final m2a t = new m2a(20);
    public static final m2a u = new m2a(21);
    public static final m2a v = new m2a(22);
    public static final m2a w = new m2a(23);
    public static final m2a Z = new m2a(25);
    public static final m2a f1 = new m2a(26);
    public static final e9d0 g1 = new e9d0(28);
    public static final e9d0 h1 = new e9d0(29);
    public static final v4i0 i1 = new v4i0(0);
    public static final v4i0 j1 = new v4i0(1);
    public static final m2a k1 = new m2a(29);

    static {
        byte b2 = 24;
        x = new m2a(b2);
        y = new m2a(b2);
        z = new m2a(b2);
        A = new m2a(b2);
        B = new m2a(b2);
        Y = new m2a(b2);
    }

    public /* synthetic */ m2a(byte b2) {
        this.f21046a = b2;
    }

    public static final boolean b(yzs0 yzs0Var, dcg0 dcg0Var) {
        yzs0Var.getClass();
        if (!yzs0Var.R(dcg0Var)) {
            if (!(dcg0Var instanceof faa)) {
                return false;
            }
            eaa eaaVarU = yzs0Var.u((faa) dcg0Var);
            eaaVarU.getClass();
            zxs0 zxs0VarV = yzs0Var.V(eaaVarU);
            zxs0VarV.getClass();
            aty atyVarC0 = yzs0Var.C0(zxs0VarV);
            if (atyVarC0 == null || !yzs0Var.R(yzs0Var.W(atyVarC0))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(yzs0 yzs0Var, gys0 gys0Var, dcg0 dcg0Var, dcg0 dcg0Var2, boolean z2) {
        yzs0Var.getClass();
        Collection<aty> collectionK = yzs0Var.K(dcg0Var);
        if ((collectionK instanceof Collection) && collectionK.isEmpty()) {
            return false;
        }
        for (aty atyVar : collectionK) {
            atyVar.getClass();
            if (Intrinsics.d(yzs0Var.n0(atyVar), yzs0Var.N(dcg0Var2))) {
                return true;
            }
            if (z2 && s(b, gys0Var, dcg0Var2, atyVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(gys0 gys0Var, yzs0 yzs0Var, dcg0 dcg0Var, jys0 jys0Var) {
        xnm0 xnm0VarA0;
        fys0 fys0Var = fys0.c;
        yzs0Var.getClass();
        dcg0Var.getClass();
        yzs0Var.w0(dcg0Var, jys0Var);
        if (!yzs0Var.I(jys0Var) && yzs0Var.s0(dcg0Var)) {
            return iun.f15405a;
        }
        if (yzs0Var.D(jys0Var)) {
            if (!yzs0Var.Q(yzs0Var.N(dcg0Var), jys0Var)) {
                return iun.f15405a;
            }
            u9a u9aVar = u9a.f35274a;
            dcg0 dcg0VarO = yzs0Var.O(dcg0Var);
            if (dcg0VarO != null) {
                dcg0Var = dcg0VarO;
            }
            return kotlin.collections.a.c(dcg0Var);
        }
        mbk0 mbk0Var = new mbk0();
        gys0Var.b();
        yzs0 yzs0Var2 = gys0Var.c;
        ArrayDeque arrayDeque = gys0Var.g;
        arrayDeque.getClass();
        nbk0 nbk0Var = gys0Var.h;
        nbk0Var.getClass();
        arrayDeque.push(dcg0Var);
        while (!arrayDeque.isEmpty()) {
            dcg0 dcg0Var2 = (dcg0) arrayDeque.pop();
            dcg0Var2.getClass();
            if (nbk0Var.add(dcg0Var2)) {
                u9a u9aVar2 = u9a.f35274a;
                dcg0 dcg0VarO2 = yzs0Var.O(dcg0Var2);
                if (dcg0VarO2 == null) {
                    dcg0VarO2 = dcg0Var2;
                }
                if (yzs0Var.Q(yzs0Var.N(dcg0VarO2), jys0Var)) {
                    mbk0Var.add(dcg0VarO2);
                    xnm0VarA0 = fys0Var;
                } else {
                    xnm0VarA0 = yzs0Var.L(dcg0VarO2) == 0 ? fys0.b : yzs0Var2.A0(dcg0VarO2);
                }
                if (xnm0VarA0.equals(fys0Var)) {
                    xnm0VarA0 = null;
                }
                if (xnm0VarA0 != null) {
                    Iterator it = yzs0Var2.s(yzs0Var2.N(dcg0Var2)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(xnm0VarA0.n(gys0Var, (aty) it.next()));
                    }
                }
            }
        }
        gys0Var.a();
        return mbk0Var;
    }

    public static List i(gys0 gys0Var, yzs0 yzs0Var, dcg0 dcg0Var, jys0 jys0Var) {
        List listD = d(gys0Var, yzs0Var, dcg0Var, jys0Var);
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                dcg0 dcg0Var2 = (dcg0) obj;
                dcg0Var2.getClass();
                yxs0 yxs0VarQ = yzs0Var.q(dcg0Var2);
                int iG = yzs0Var.g(yxs0VarQ);
                int i2 = 0;
                while (true) {
                    if (i2 >= iG) {
                        arrayList.add(obj);
                        break;
                    }
                    zxs0 zxs0VarT = yzs0Var.T(yxs0VarQ, i2);
                    zxs0VarT.getClass();
                    aty atyVarC0 = yzs0Var.C0(zxs0VarT);
                    if ((atyVarC0 != null ? yzs0Var.S(atyVarC0) : null) != null) {
                        break;
                    }
                    i2++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static ncj k(mhi0 mhi0Var, ugf0 ugf0Var, sje sjeVar, Function0 function0) {
        iun iunVar = iun.f15405a;
        byte b2 = 18;
        yje yjeVar = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            iunVar.getClass();
            return new ncj(new szp(mhi0Var, new b530((Object) sjeVar, (byte) 13), function0), kotlin.collections.a.c(new b1f(iunVar, yjeVar, b2)), ugf0Var, sjeVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            iunVar.getClass();
            return new ncj(new szp(mhi0Var, new rnp((byte) 3), function0), kotlin.collections.a.c(new b1f(iunVar, yjeVar, b2)), ugf0Var, sjeVar);
        }
    }

    public static boolean l(gys0 gys0Var, aty atyVar, aty atyVar2) {
        atyVar.getClass();
        atyVar2.getClass();
        yzs0 yzs0Var = gys0Var.c;
        j2e j2eVar = gys0Var.e;
        if (atyVar == atyVar2) {
            return true;
        }
        if (q(yzs0Var, atyVar) && q(yzs0Var, atyVar2)) {
            aty atyVarC = gys0Var.c(j2eVar.T(atyVar));
            aty atyVarC2 = gys0Var.c(j2eVar.T(atyVar2));
            dcg0 dcg0VarM0 = yzs0Var.m0(atyVarC);
            if (!yzs0Var.Q(yzs0Var.n0(atyVarC), yzs0Var.n0(atyVarC2))) {
                return false;
            }
            if (yzs0Var.L(dcg0VarM0) == 0) {
                return yzs0Var.U(atyVarC) || yzs0Var.U(atyVarC2) || yzs0Var.l0(dcg0VarM0) == yzs0Var.l0(yzs0Var.m0(atyVarC2));
            }
        }
        m2a m2aVar = b;
        return s(m2aVar, gys0Var, atyVar, atyVar2) && s(m2aVar, gys0Var, atyVar2, atyVar);
    }

    public static ArrayList m(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = iun.f15405a;
        }
        ArrayList arrayListS = CollectionsKt.S(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListS) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            kjv kjvVar = new kjv();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                hny.u("Null processName");
                return null;
            }
            kjvVar.e = str2;
            kjvVar.f18405a = runningAppProcessInfo.pid;
            byte b2 = (byte) (kjvVar.d | 1);
            kjvVar.b = runningAppProcessInfo.importance;
            kjvVar.d = (byte) (b2 | 2);
            kjvVar.c = Intrinsics.d(str2, str);
            kjvVar.d = (byte) (kjvVar.d | 4);
            arrayList2.add(kjvVar.a());
        }
        return arrayList2;
    }

    public static jzs0 p(yzs0 yzs0Var, aty atyVar, dcg0 dcg0Var) {
        aty atyVarC0;
        yzs0Var.getClass();
        int iL = yzs0Var.L(atyVar);
        int i2 = 0;
        while (true) {
            if (i2 >= iL) {
                return null;
            }
            zxs0 zxs0VarE = yzs0Var.E(atyVar, i2);
            zxs0VarE.getClass();
            zxs0 zxs0Var = yzs0Var.q0(zxs0VarE) ? null : zxs0VarE;
            if (zxs0Var != null && (atyVarC0 = yzs0Var.C0(zxs0Var)) != null) {
                boolean z2 = yzs0Var.i(yzs0Var.m0(atyVarC0)) && yzs0Var.i(yzs0Var.m0(dcg0Var));
                if (atyVarC0.equals(dcg0Var) || (z2 && Intrinsics.d(yzs0Var.n0(atyVarC0), yzs0Var.n0(dcg0Var)))) {
                    jys0 jys0VarN0 = yzs0Var.n0(atyVar);
                    jys0VarN0.getClass();
                    return yzs0Var.r0(jys0VarN0, i2);
                }
                jzs0 jzs0VarP = p(yzs0Var, atyVarC0, dcg0Var);
                if (jzs0VarP != null) {
                    return jzs0VarP;
                }
            }
            i2++;
        }
    }

    public static boolean q(yzs0 yzs0Var, aty atyVar) {
        yzs0Var.getClass();
        atyVar.getClass();
        jys0 jys0VarN0 = yzs0Var.n0(atyVar);
        jys0VarN0.getClass();
        if (!yzs0Var.o0(jys0VarN0)) {
            return false;
        }
        yzs0Var.Z(atyVar);
        return (yzs0Var.P(atyVar) || yzs0Var.t(atyVar) || yzs0Var.F0(atyVar)) ? false : true;
    }

    public static boolean r(gys0 gys0Var, yzs0 yzs0Var, yxs0 yxs0Var, dcg0 dcg0Var) {
        boolean zS;
        yzs0Var.getClass();
        yxs0Var.getClass();
        jys0 jys0VarN = yzs0Var.N(dcg0Var);
        int iG = yzs0Var.g(yxs0Var);
        jys0VarN.getClass();
        int iX = yzs0Var.x(jys0VarN);
        if (iG == iX && iG == yzs0Var.L(dcg0Var)) {
            for (int i2 = 0; i2 < iX; i2++) {
                zxs0 zxs0VarE = yzs0Var.E(dcg0Var, i2);
                zxs0VarE.getClass();
                aty atyVarC0 = yzs0Var.C0(zxs0VarE);
                if (atyVarC0 != null) {
                    zxs0 zxs0VarT = yzs0Var.T(yxs0Var, i2);
                    zxs0VarT.getClass();
                    yzs0Var.k0(zxs0VarT);
                    f0t0 f0t0Var = f0t0.INV;
                    aty atyVarC1 = yzs0Var.C0(zxs0VarT);
                    atyVarC1.getClass();
                    jzs0 jzs0VarR0 = yzs0Var.r0(jys0VarN, i2);
                    jzs0VarR0.getClass();
                    f0t0 f0t0VarB0 = yzs0Var.B0(jzs0VarR0);
                    f0t0 f0t0VarK0 = yzs0Var.k0(zxs0VarE);
                    if (f0t0VarB0 == f0t0Var) {
                        f0t0VarB0 = f0t0VarK0;
                    } else if (f0t0VarK0 != f0t0Var && f0t0VarB0 != f0t0VarK0) {
                        f0t0VarB0 = null;
                    }
                    if (f0t0VarB0 == null) {
                        return gys0Var.f12147a;
                    }
                    if (f0t0VarB0 == f0t0Var) {
                        t(yzs0Var, atyVarC1, atyVarC0);
                        t(yzs0Var, atyVarC0, atyVarC1);
                    }
                    int i3 = gys0Var.f;
                    if (i3 > 100) {
                        udk.e(atyVarC1, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    gys0Var.f = i3 + 1;
                    int iOrdinal = f0t0VarB0.ordinal();
                    m2a m2aVar = b;
                    if (iOrdinal == 0) {
                        zS = s(m2aVar, gys0Var, atyVarC0, atyVarC1);
                    } else if (iOrdinal == 1) {
                        zS = s(m2aVar, gys0Var, atyVarC1, atyVarC0);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return false;
                        }
                        zS = l(gys0Var, atyVarC1, atyVarC0);
                    }
                    gys0Var.f--;
                    if (!zS) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean s(m2a m2aVar, gys0 gys0Var, aty atyVar, aty atyVar2) {
        yzs0 yzs0Var = gys0Var.c;
        atyVar.getClass();
        atyVar2.getClass();
        if (atyVar == atyVar2) {
            return true;
        }
        Function2 function2I0 = yzs0Var.i0();
        Boolean bool = function2I0 != null ? (Boolean) function2I0.invoke(atyVar, atyVar2) : null;
        return bool != null ? bool.booleanValue() : b.j(gys0Var, yzs0Var, atyVar, atyVar2);
    }

    public static void t(yzs0 yzs0Var, aty atyVar, aty atyVar2) {
        yzs0Var.getClass();
        atyVar.getClass();
        dcg0 dcg0VarA = yzs0Var.a(atyVar);
        if (dcg0VarA instanceof faa) {
            faa faaVar = (faa) dcg0VarA;
            if (yzs0Var.y(faaVar)) {
                return;
            }
            eaa eaaVarU = yzs0Var.u(faaVar);
            eaaVarU.getClass();
            zxs0 zxs0VarV = yzs0Var.V(eaaVarU);
            zxs0VarV.getClass();
            if (yzs0Var.q0(zxs0VarV) && yzs0Var.j0(faaVar) == u9a.f35274a) {
                atyVar2.getClass();
                yzs0Var.n0(atyVar2);
            }
        }
    }

    public static void u(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.d(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            itt0.j(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            itt0.j(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e2) {
            throw new IOException("Failed to create directory: " + parentFile, e2);
        }
    }

    public static rog0 v(x8y x8yVar) {
        x8yVar.getClass();
        return new rog0((qqe0) x8yVar);
    }

    @Override // a.nwp0
    public Map a(onf0 onf0Var) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    @Override // a.yd40
    public PointF e(wd40 wd40Var, int i2) {
        float f2 = wd40Var.b;
        float f3 = wd40Var.f38956a;
        return i2 == 1 ? new PointF(1.0f - f3, f2) : new PointF(f3, f2);
    }

    @Override // a.qv90
    public boolean f(wm40 wm40Var, sfk sfkVar) {
        wm40Var.getClass();
        return true;
    }

    @Override // a.igk0
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    @Override // a.syh
    public Iterable h(Object obj) {
        switch (this.f21046a) {
            case 10:
                int i2 = rek.f30339a;
                Collection collectionK = ((k3u0) obj).k();
                ArrayList arrayList = new ArrayList(r3d.q(collectionK, 10));
                Iterator it = ((ArrayList) collectionK).iterator();
                while (it.hasNext()) {
                    arrayList.add(((k3u0) it.next()).o1());
                }
                return arrayList;
            default:
                int i3 = eaz.p;
                Collection collectionB = ((wm40) obj).h().b();
                collectionB.getClass();
                return new rx3(pgi0.q(new sx3(collectionB, (byte) 1), j9x.y), (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0214  */
    /* JADX WARN: Code duplicated, block: B:159:0x0276  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:185:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0300  */
    /* JADX WARN: Code duplicated, block: B:190:0x0305  */
    /* JADX WARN: Code duplicated, block: B:194:0x030d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0323 A[LOOP:9: B:198:0x031d->B:200:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x034b A[LOOP:10: B:202:0x0345->B:204:0x034b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0375  */
    /* JADX WARN: Code duplicated, block: B:212:0x0389  */
    /* JADX WARN: Code duplicated, block: B:216:0x0394 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0396  */
    /* JADX WARN: Code duplicated, block: B:219:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:222:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x03de  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x043f  */
    /* JADX WARN: Code duplicated, block: B:244:0x044b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0462  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0474  */
    /* JADX WARN: Code duplicated, block: B:253:0x0483  */
    /* JADX WARN: Code duplicated, block: B:255:0x0488  */
    /* JADX WARN: Code duplicated, block: B:258:0x0496  */
    /* JADX WARN: Code duplicated, block: B:261:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:266:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:270:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:280:0x04ff A[LOOP:7: B:274:0x04db->B:280:0x04ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x03f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:330:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[LOOP:12: B:30:0x00a3->B:332:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:? A[LOOP:13: B:46:0x00e7->B:335:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [a.yzs0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    public boolean j(gys0 gys0Var, yzs0 yzs0Var, aty atyVar, aty atyVar2) {
        Boolean boolValueOf;
        Boolean bool;
        jys0 jys0VarN;
        mbk0<dcg0> mbk0Var;
        ArrayDeque arrayDeque;
        nbk0 nbk0Var;
        boolean z2;
        ArrayList arrayList;
        List<dcg0> listD;
        dcg0 dcg0Var;
        fys0 fys0Var;
        Iterator it;
        ArrayList<dcg0> arrayList2;
        int size;
        jys0 jys0VarN2;
        jys0 jys0VarN3;
        ArrayDeque arrayDeque2;
        nbk0 nbk0Var2;
        dcg0 dcg0Var2;
        fys0 fys0Var2;
        Iterator it2;
        dcg0 dcg0VarN;
        jys0 jys0VarN4;
        kw3 kw3Var;
        int iX;
        ?? r6;
        boolean zR;
        boolean zR2;
        jzs0 jzs0VarR0;
        zxs0 zxs0VarA0;
        aty atyVarC0;
        dcg0 dcg0VarA;
        jys0 jys0VarN5;
        jys0 jys0VarN6;
        jzs0 jzs0VarP;
        Collection collectionS;
        Iterator it3;
        Collection collectionS2;
        Iterator it4;
        boolean z3;
        atyVar.getClass();
        j2e j2eVar = gys0Var.e;
        aty atyVarC = gys0Var.c(j2eVar.T(atyVar));
        atyVar2.getClass();
        aty atyVarC2 = gys0Var.c(j2eVar.T(atyVar2));
        yzs0Var.getClass();
        atyVarC.getClass();
        dcg0 dcg0VarM0 = yzs0Var.m0(atyVarC);
        atyVarC2.getClass();
        dcg0 dcg0VarW = yzs0Var.W(atyVarC2);
        boolean z4 = false;
        boolean z5 = true;
        if (!yzs0Var.H(dcg0VarM0) && !yzs0Var.H(dcg0VarW)) {
            yzs0Var.t0(dcg0VarM0);
            yzs0Var.v0(dcg0VarM0);
            yzs0Var.v0(dcg0VarW);
            faa faaVarA = yzs0Var.A(dcg0VarW);
            aty atyVarD0 = faaVarA != null ? yzs0Var.d0(faaVarA) : null;
            if (faaVarA == null || atyVarD0 == null) {
                jys0VarN5 = yzs0Var.N(dcg0VarW);
                jys0VarN5.getClass();
                if (yzs0Var.Y(jys0VarN5)) {
                    collectionS2 = yzs0Var.s(jys0VarN5);
                    if (!(collectionS2 instanceof Collection) && collectionS2.isEmpty()) {
                        z3 = true;
                        break;
                    }
                    it4 = collectionS2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z3 = true;
                            break;
                        }
                        if (!s(b, gys0Var, dcg0VarM0, (aty) it4.next())) {
                            z3 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z3);
                } else {
                    jys0VarN6 = yzs0Var.N(dcg0VarM0);
                    if (dcg0VarM0 instanceof faa) {
                        jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                        if (jzs0VarP == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        jys0VarN6.getClass();
                        if (yzs0Var.Y(jys0VarN6)) {
                            collectionS = yzs0Var.s(jys0VarN6);
                            if ((collectionS instanceof Collection) || !collectionS.isEmpty()) {
                                it3 = collectionS.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                                        if (jzs0VarP == null && yzs0Var.w(jzs0VarP, yzs0Var.N(dcg0VarW))) {
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    } else if (!(((aty) it3.next()) instanceof faa)) {
                                    }
                                }
                            } else {
                                jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                                if (jzs0VarP == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (yzs0Var.l0(dcg0VarW)) {
                    atyVarD0 = yzs0Var.F(atyVarD0);
                } else if (yzs0Var.v(dcg0VarW)) {
                    atyVarD0 = yzs0Var.p(atyVarD0);
                }
                dys0[] dys0VarArr = dys0.f6910a;
                if (s(this, gys0Var, dcg0VarM0, atyVarD0)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    jys0VarN5 = yzs0Var.N(dcg0VarW);
                    jys0VarN5.getClass();
                    if (yzs0Var.Y(jys0VarN5)) {
                        collectionS2 = yzs0Var.s(jys0VarN5);
                        if (!(collectionS2 instanceof Collection)) {
                            it4 = collectionS2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!s(b, gys0Var, dcg0VarM0, (aty) it4.next())) {
                                    z3 = false;
                                    break;
                                }
                            }
                        } else {
                            it4 = collectionS2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!s(b, gys0Var, dcg0VarM0, (aty) it4.next())) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z3);
                    } else {
                        jys0VarN6 = yzs0Var.N(dcg0VarM0);
                        if (dcg0VarM0 instanceof faa) {
                            jys0VarN6.getClass();
                            if (yzs0Var.Y(jys0VarN6)) {
                                collectionS = yzs0Var.s(jys0VarN6);
                                if (collectionS instanceof Collection) {
                                    it3 = collectionS.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                                            if (jzs0VarP == null) {
                                            }
                                        } else if (!(((aty) it3.next()) instanceof faa)) {
                                        }
                                    }
                                } else {
                                    it3 = collectionS.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                                            if (jzs0VarP == null) {
                                            }
                                        } else if (!(((aty) it3.next()) instanceof faa)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        } else {
                            jzs0VarP = p(yzs0Var, dcg0VarW, dcg0VarM0);
                            if (jzs0VarP == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        }
                    }
                }
            }
        } else if (gys0Var.f12147a) {
            boolValueOf = Boolean.TRUE;
        } else if (!yzs0Var.l0(dcg0VarM0) || yzs0Var.l0(dcg0VarW)) {
            if (!yzs0Var.H(dcg0VarM0)) {
                dcg0VarM0 = yzs0Var.e0(dcg0VarM0, false);
            }
            if (!yzs0Var.H(dcg0VarW)) {
                dcg0VarW = yzs0Var.e0(dcg0VarW, false);
            }
            boolValueOf = Boolean.valueOf(y9a.R(yzs0Var, dcg0VarM0, dcg0VarW));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        dcg0 dcg0VarM1 = yzs0Var.m0(atyVarC);
        dcg0 dcg0VarW2 = yzs0Var.W(atyVarC2);
        fys0 fys0Var3 = fys0.c;
        fys0 fys0Var4 = fys0.b;
        yzs0 yzs0Var2 = gys0Var.c;
        if (!yzs0Var2.l0(dcg0VarW2) && !yzs0Var2.t(dcg0VarM1) && !yzs0Var2.v(dcg0VarM1) && ((!(dcg0VarM1 instanceof faa) || !yzs0Var2.u0((faa) dcg0VarM1)) && !uc9.X(gys0Var, dcg0VarM1, fys0Var4))) {
            if (yzs0Var2.v(dcg0VarW2) || uc9.X(gys0Var, dcg0VarW2, fys0.d) || yzs0Var2.s0(dcg0VarM1)) {
                return false;
            }
            jys0 jys0VarN7 = yzs0Var2.N(dcg0VarW2);
            jys0VarN7.getClass();
            if (!uc9.Y(gys0Var, dcg0VarM1, jys0VarN7)) {
                gys0Var.b();
                ArrayDeque arrayDeque3 = gys0Var.g;
                arrayDeque3.getClass();
                nbk0 nbk0Var3 = gys0Var.h;
                nbk0Var3.getClass();
                arrayDeque3.push(dcg0VarM1);
                loop0: while (true) {
                    if (arrayDeque3.isEmpty()) {
                        gys0Var.a();
                        return false;
                    }
                    dcg0 dcg0Var3 = (dcg0) arrayDeque3.pop();
                    dcg0Var3.getClass();
                    if (nbk0Var3.add(dcg0Var3)) {
                        fys0 fys0Var5 = yzs0Var2.l0(dcg0Var3) ? fys0Var3 : fys0Var4;
                        if (fys0Var5.equals(fys0Var3)) {
                            fys0Var5 = null;
                        }
                        if (fys0Var5 == null) {
                            continue;
                        } else {
                            Iterator it5 = yzs0Var2.s(yzs0Var2.N(dcg0Var3)).iterator();
                            while (it5.hasNext()) {
                                dcg0 dcg0VarN2 = fys0Var5.n(gys0Var, (aty) it5.next());
                                if (uc9.Y(gys0Var, dcg0VarN2, jys0VarN7)) {
                                    gys0Var.a();
                                    break loop0;
                                }
                                arrayDeque3.add(dcg0VarN2);
                            }
                        }
                    }
                }
            }
        }
        if (!yzs0Var.R(dcg0VarM1) && !yzs0Var.R(dcg0VarW2)) {
            bool = null;
        } else if (b(yzs0Var, dcg0VarM1) && b(yzs0Var, dcg0VarW2)) {
            bool = Boolean.TRUE;
        } else if (yzs0Var.R(dcg0VarM1)) {
            if (c(yzs0Var, gys0Var, dcg0VarM1, dcg0VarW2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (yzs0Var.R(dcg0VarW2)) {
            jys0 jys0VarN8 = yzs0Var.N(dcg0VarM1);
            if (jys0VarN8 instanceof xmx) {
                Collection collectionS3 = yzs0Var.s(jys0VarN8);
                if (!(collectionS3 instanceof Collection) || !collectionS3.isEmpty()) {
                    Iterator it6 = collectionS3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            aty atyVar3 = (aty) it6.next();
                            atyVar3.getClass();
                            dcg0 dcg0VarA2 = yzs0Var.a(atyVar3);
                            if (dcg0VarA2 == null || !yzs0Var.R(dcg0VarA2)) {
                            }
                        } else if (!c(yzs0Var, gys0Var, dcg0VarW2, dcg0VarM1, true)) {
                            bool = null;
                        }
                    }
                } else if (!c(yzs0Var, gys0Var, dcg0VarW2, dcg0VarM1, true)) {
                    bool = null;
                }
            } else if (!c(yzs0Var, gys0Var, dcg0VarW2, dcg0VarM1, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        jys0 jys0VarN9 = yzs0Var.N(dcg0VarW2);
        if (yzs0Var.Q(yzs0Var.N(dcg0VarM1), jys0VarN9)) {
            jys0VarN9.getClass();
            if (yzs0Var.x(jys0VarN9) != 0) {
                jys0VarN = yzs0Var.N(dcg0VarW2);
                jys0VarN.getClass();
                if (!yzs0Var.y0(jys0VarN)) {
                    jys0VarN9.getClass();
                    if (yzs0Var2.s0(dcg0VarM1)) {
                        if (!yzs0Var2.I(jys0VarN9) || yzs0Var2.p0(jys0VarN9)) {
                            mbk0Var = new mbk0();
                            gys0Var.b();
                            arrayDeque = gys0Var.g;
                            arrayDeque.getClass();
                            nbk0Var = gys0Var.h;
                            nbk0Var.getClass();
                            arrayDeque.push(dcg0VarM1);
                            while (!arrayDeque.isEmpty()) {
                                dcg0Var = (dcg0) arrayDeque.pop();
                                dcg0Var.getClass();
                                if (!nbk0Var.add(dcg0Var)) {
                                    if (yzs0Var2.s0(dcg0Var)) {
                                        mbk0Var.add(dcg0Var);
                                        fys0Var = fys0Var3;
                                    } else {
                                        fys0Var = fys0Var4;
                                    }
                                    if (fys0Var.equals(fys0Var3)) {
                                        fys0Var = null;
                                    }
                                    if (fys0Var == null) {
                                        it = yzs0Var2.s(yzs0Var2.N(dcg0Var)).iterator();
                                        while (it.hasNext()) {
                                            arrayDeque.add(fys0Var.n(gys0Var, (aty) it.next()));
                                            z4 = z4;
                                        }
                                    }
                                }
                            }
                            z2 = z4;
                            gys0Var.a();
                            arrayList = new ArrayList();
                            for (dcg0 dcg0Var4 : mbk0Var) {
                                dcg0Var4.getClass();
                                w3d.u(arrayList, i(gys0Var, yzs0Var2, dcg0Var4, jys0VarN9));
                            }
                            listD = arrayList;
                        } else {
                            listD = d(gys0Var, yzs0Var2, dcg0VarM1, jys0VarN9);
                        }
                        listD.size();
                        arrayList2 = new ArrayList(r3d.q(listD, 10));
                        for (dcg0 dcg0Var5 : listD) {
                            aty atyVarC3 = gys0Var.c(dcg0Var5);
                            atyVarC3.getClass();
                            dcg0VarA = yzs0Var.a(atyVarC3);
                            if (dcg0VarA == null) {
                                dcg0Var5 = dcg0VarA;
                            }
                            arrayList2.add(dcg0Var5);
                        }
                        size = arrayList2.size();
                        if (size != 0) {
                            jys0VarN2 = yzs0Var.N(dcg0VarM1);
                            jys0VarN2.getClass();
                            if (yzs0Var.I(jys0VarN2)) {
                                return yzs0Var.B(jys0VarN2);
                            }
                            jys0VarN3 = yzs0Var.N(dcg0VarM1);
                            jys0VarN3.getClass();
                            if (yzs0Var.B(jys0VarN3)) {
                                return true;
                            }
                            gys0Var.b();
                            arrayDeque2 = gys0Var.g;
                            arrayDeque2.getClass();
                            nbk0Var2 = gys0Var.h;
                            nbk0Var2.getClass();
                            arrayDeque2.push(dcg0VarM1);
                            while (!arrayDeque2.isEmpty()) {
                                dcg0Var2 = (dcg0) arrayDeque2.pop();
                                dcg0Var2.getClass();
                                if (!nbk0Var2.add(dcg0Var2)) {
                                    if (yzs0Var.s0(dcg0Var2)) {
                                        fys0Var2 = fys0Var3;
                                    } else {
                                        fys0Var2 = fys0Var4;
                                    }
                                    if (fys0Var2.equals(fys0Var3)) {
                                        fys0Var2 = null;
                                    }
                                    if (fys0Var2 == null) {
                                        continue;
                                    } else {
                                        it2 = yzs0Var2.s(yzs0Var2.N(dcg0Var2)).iterator();
                                        while (it2.hasNext()) {
                                            dcg0VarN = fys0Var2.n(gys0Var, (aty) it2.next());
                                            dcg0VarN.getClass();
                                            jys0VarN4 = yzs0Var.N(dcg0VarN);
                                            jys0VarN4.getClass();
                                            if (yzs0Var.B(jys0VarN4)) {
                                                gys0Var.a();
                                                return true;
                                            }
                                            arrayDeque2.add(dcg0VarN);
                                        }
                                    }
                                }
                            }
                            gys0Var.a();
                            return z2;
                        }
                        if (size != 1) {
                            dcg0 dcg0Var6 = (dcg0) CollectionsKt.T(arrayList2);
                            dcg0Var6.getClass();
                            return r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var6), dcg0VarW2);
                        }
                        kw3Var = new kw3(yzs0Var.x(jys0VarN9));
                        iX = yzs0Var.x(jys0VarN9);
                        r6 = z2;
                        while (true) {
                            if (r6 < iX) {
                                zR = r(gys0Var, yzs0Var, kw3Var, dcg0VarW2);
                                break;
                            }
                            jzs0VarR0 = yzs0Var.r0(jys0VarN9, r6);
                            jzs0VarR0.getClass();
                            if (yzs0Var.B0(jzs0VarR0) != f0t0.OUT) {
                                zR = z2;
                                break;
                            }
                            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                            for (dcg0 dcg0Var7 : arrayList2) {
                                dcg0Var7.getClass();
                                zxs0VarA0 = yzs0Var.a0(dcg0Var7, r6);
                                if (zxs0VarA0 != null) {
                                    boolean z6 = z5;
                                    if (yzs0Var.k0(zxs0VarA0) != f0t0.INV) {
                                        zxs0VarA0 = null;
                                    }
                                    if (zxs0VarA0 == null && (atyVarC0 = yzs0Var.C0(zxs0VarA0)) != null) {
                                        arrayList3.add(atyVarC0);
                                        z5 = z6;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + dcg0Var7 + ", subType: " + dcg0VarM1 + ", superType: " + dcg0VarW2).toString());
                            }
                            boolean z7 = z5;
                            aty atyVarZ = yzs0Var.z(arrayList3);
                            atyVarZ.getClass();
                            kw3Var.add(yzs0Var.n(atyVarZ));
                            z5 = z7;
                            r6++;
                        }
                        if (zR) {
                            return z5;
                        }
                        zR2 = z2;
                        for (dcg0 dcg0Var8 : arrayList2) {
                            if (zR2) {
                                dcg0Var8.getClass();
                                zR2 = r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var8), dcg0VarW2);
                            }
                        }
                        return zR2;
                    }
                    listD = i(gys0Var, yzs0Var2, dcg0VarM1, jys0VarN9);
                    z2 = false;
                    listD.size();
                    arrayList2 = new ArrayList(r3d.q(listD, 10));
                    while (r11.hasNext()) {
                        aty atyVarC4 = gys0Var.c(dcg0Var5);
                        atyVarC4.getClass();
                        dcg0VarA = yzs0Var.a(atyVarC4);
                        if (dcg0VarA == null) {
                            dcg0Var5 = dcg0VarA;
                        }
                        arrayList2.add(dcg0Var5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        jys0VarN2 = yzs0Var.N(dcg0VarM1);
                        jys0VarN2.getClass();
                        if (yzs0Var.I(jys0VarN2)) {
                            return yzs0Var.B(jys0VarN2);
                        }
                        jys0VarN3 = yzs0Var.N(dcg0VarM1);
                        jys0VarN3.getClass();
                        if (yzs0Var.B(jys0VarN3)) {
                            return true;
                        }
                        gys0Var.b();
                        arrayDeque2 = gys0Var.g;
                        arrayDeque2.getClass();
                        nbk0Var2 = gys0Var.h;
                        nbk0Var2.getClass();
                        arrayDeque2.push(dcg0VarM1);
                        while (!arrayDeque2.isEmpty()) {
                            dcg0Var2 = (dcg0) arrayDeque2.pop();
                            dcg0Var2.getClass();
                            if (!nbk0Var2.add(dcg0Var2)) {
                                if (yzs0Var.s0(dcg0Var2)) {
                                    fys0Var2 = fys0Var3;
                                } else {
                                    fys0Var2 = fys0Var4;
                                }
                                if (fys0Var2.equals(fys0Var3)) {
                                    fys0Var2 = null;
                                }
                                if (fys0Var2 == null) {
                                    continue;
                                } else {
                                    it2 = yzs0Var2.s(yzs0Var2.N(dcg0Var2)).iterator();
                                    while (it2.hasNext()) {
                                        dcg0VarN = fys0Var2.n(gys0Var, (aty) it2.next());
                                        dcg0VarN.getClass();
                                        jys0VarN4 = yzs0Var.N(dcg0VarN);
                                        jys0VarN4.getClass();
                                        if (yzs0Var.B(jys0VarN4)) {
                                            gys0Var.a();
                                            return true;
                                        }
                                        arrayDeque2.add(dcg0VarN);
                                    }
                                }
                            }
                        }
                        gys0Var.a();
                        return z2;
                    }
                    if (size != 1) {
                        dcg0 dcg0Var9 = (dcg0) CollectionsKt.T(arrayList2);
                        dcg0Var9.getClass();
                        return r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var9), dcg0VarW2);
                    }
                    kw3Var = new kw3(yzs0Var.x(jys0VarN9));
                    iX = yzs0Var.x(jys0VarN9);
                    r6 = z2;
                    while (true) {
                        if (r6 < iX) {
                            zR = r(gys0Var, yzs0Var, kw3Var, dcg0VarW2);
                            break;
                        }
                        jzs0VarR0 = yzs0Var.r0(jys0VarN9, r6);
                        jzs0VarR0.getClass();
                        if (yzs0Var.B0(jzs0VarR0) != f0t0.OUT) {
                            zR = z2;
                            break;
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList2, 10));
                        while (r13.hasNext()) {
                            dcg0Var7.getClass();
                            zxs0VarA0 = yzs0Var.a0(dcg0Var7, r6);
                            if (zxs0VarA0 != null) {
                                boolean z8 = z5;
                                if (yzs0Var.k0(zxs0VarA0) != f0t0.INV) {
                                    zxs0VarA0 = null;
                                }
                                if (zxs0VarA0 == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + dcg0Var7 + ", subType: " + dcg0VarM1 + ", superType: " + dcg0VarW2).toString());
                        }
                        boolean z9 = z5;
                        aty atyVarZ2 = yzs0Var.z(arrayList4);
                        atyVarZ2.getClass();
                        kw3Var.add(yzs0Var.n(atyVarZ2));
                        z5 = z9;
                        r6++;
                    }
                    if (zR) {
                        return z5;
                    }
                    zR2 = z2;
                    while (r3.hasNext()) {
                        if (zR2) {
                            dcg0Var8.getClass();
                            zR2 = r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var8), dcg0VarW2);
                        }
                    }
                    return zR2;
                }
            }
        } else {
            jys0VarN = yzs0Var.N(dcg0VarW2);
            jys0VarN.getClass();
            if (!yzs0Var.y0(jys0VarN)) {
                jys0VarN9.getClass();
                if (yzs0Var2.s0(dcg0VarM1)) {
                    if (yzs0Var2.I(jys0VarN9)) {
                    }
                    mbk0Var = new mbk0();
                    gys0Var.b();
                    arrayDeque = gys0Var.g;
                    arrayDeque.getClass();
                    nbk0Var = gys0Var.h;
                    nbk0Var.getClass();
                    arrayDeque.push(dcg0VarM1);
                    while (!arrayDeque.isEmpty()) {
                        dcg0Var = (dcg0) arrayDeque.pop();
                        dcg0Var.getClass();
                        if (!nbk0Var.add(dcg0Var)) {
                            if (yzs0Var2.s0(dcg0Var)) {
                                mbk0Var.add(dcg0Var);
                                fys0Var = fys0Var3;
                            } else {
                                fys0Var = fys0Var4;
                            }
                            if (fys0Var.equals(fys0Var3)) {
                                fys0Var = null;
                            }
                            if (fys0Var == null) {
                                it = yzs0Var2.s(yzs0Var2.N(dcg0Var)).iterator();
                                while (it.hasNext()) {
                                    arrayDeque.add(fys0Var.n(gys0Var, (aty) it.next()));
                                    z4 = z4;
                                }
                            }
                        }
                    }
                    z2 = z4;
                    gys0Var.a();
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        dcg0Var4.getClass();
                        w3d.u(arrayList, i(gys0Var, yzs0Var2, dcg0Var4, jys0VarN9));
                    }
                    listD = arrayList;
                    listD.size();
                    arrayList2 = new ArrayList(r3d.q(listD, 10));
                    while (r11.hasNext()) {
                        aty atyVarC5 = gys0Var.c(dcg0Var5);
                        atyVarC5.getClass();
                        dcg0VarA = yzs0Var.a(atyVarC5);
                        if (dcg0VarA == null) {
                            dcg0Var5 = dcg0VarA;
                        }
                        arrayList2.add(dcg0Var5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        jys0VarN2 = yzs0Var.N(dcg0VarM1);
                        jys0VarN2.getClass();
                        if (yzs0Var.I(jys0VarN2)) {
                            return yzs0Var.B(jys0VarN2);
                        }
                        jys0VarN3 = yzs0Var.N(dcg0VarM1);
                        jys0VarN3.getClass();
                        if (yzs0Var.B(jys0VarN3)) {
                            return true;
                        }
                        gys0Var.b();
                        arrayDeque2 = gys0Var.g;
                        arrayDeque2.getClass();
                        nbk0Var2 = gys0Var.h;
                        nbk0Var2.getClass();
                        arrayDeque2.push(dcg0VarM1);
                        while (!arrayDeque2.isEmpty()) {
                            dcg0Var2 = (dcg0) arrayDeque2.pop();
                            dcg0Var2.getClass();
                            if (!nbk0Var2.add(dcg0Var2)) {
                                if (yzs0Var.s0(dcg0Var2)) {
                                    fys0Var2 = fys0Var3;
                                } else {
                                    fys0Var2 = fys0Var4;
                                }
                                if (fys0Var2.equals(fys0Var3)) {
                                    fys0Var2 = null;
                                }
                                if (fys0Var2 == null) {
                                    continue;
                                } else {
                                    it2 = yzs0Var2.s(yzs0Var2.N(dcg0Var2)).iterator();
                                    while (it2.hasNext()) {
                                        dcg0VarN = fys0Var2.n(gys0Var, (aty) it2.next());
                                        dcg0VarN.getClass();
                                        jys0VarN4 = yzs0Var.N(dcg0VarN);
                                        jys0VarN4.getClass();
                                        if (yzs0Var.B(jys0VarN4)) {
                                            gys0Var.a();
                                            return true;
                                        }
                                        arrayDeque2.add(dcg0VarN);
                                    }
                                }
                            }
                        }
                        gys0Var.a();
                        return z2;
                    }
                    if (size != 1) {
                        dcg0 dcg0Var10 = (dcg0) CollectionsKt.T(arrayList2);
                        dcg0Var10.getClass();
                        return r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var10), dcg0VarW2);
                    }
                    kw3Var = new kw3(yzs0Var.x(jys0VarN9));
                    iX = yzs0Var.x(jys0VarN9);
                    r6 = z2;
                    while (true) {
                        if (r6 < iX) {
                            zR = r(gys0Var, yzs0Var, kw3Var, dcg0VarW2);
                            break;
                        }
                        jzs0VarR0 = yzs0Var.r0(jys0VarN9, r6);
                        jzs0VarR0.getClass();
                        if (yzs0Var.B0(jzs0VarR0) != f0t0.OUT) {
                            zR = z2;
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList2, 10));
                        while (r13.hasNext()) {
                            dcg0Var7.getClass();
                            zxs0VarA0 = yzs0Var.a0(dcg0Var7, r6);
                            if (zxs0VarA0 != null) {
                                boolean z10 = z5;
                                if (yzs0Var.k0(zxs0VarA0) != f0t0.INV) {
                                    zxs0VarA0 = null;
                                }
                                if (zxs0VarA0 == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + dcg0Var7 + ", subType: " + dcg0VarM1 + ", superType: " + dcg0VarW2).toString());
                        }
                        boolean z11 = z5;
                        aty atyVarZ3 = yzs0Var.z(arrayList5);
                        atyVarZ3.getClass();
                        kw3Var.add(yzs0Var.n(atyVarZ3));
                        z5 = z11;
                        r6++;
                    }
                    if (zR) {
                        return z5;
                    }
                    zR2 = z2;
                    while (r3.hasNext()) {
                        if (zR2) {
                            dcg0Var8.getClass();
                            zR2 = r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var8), dcg0VarW2);
                        }
                    }
                    return zR2;
                }
                listD = i(gys0Var, yzs0Var2, dcg0VarM1, jys0VarN9);
                z2 = false;
                listD.size();
                arrayList2 = new ArrayList(r3d.q(listD, 10));
                while (r11.hasNext()) {
                    aty atyVarC6 = gys0Var.c(dcg0Var5);
                    atyVarC6.getClass();
                    dcg0VarA = yzs0Var.a(atyVarC6);
                    if (dcg0VarA == null) {
                        dcg0Var5 = dcg0VarA;
                    }
                    arrayList2.add(dcg0Var5);
                }
                size = arrayList2.size();
                if (size != 0) {
                    jys0VarN2 = yzs0Var.N(dcg0VarM1);
                    jys0VarN2.getClass();
                    if (yzs0Var.I(jys0VarN2)) {
                        return yzs0Var.B(jys0VarN2);
                    }
                    jys0VarN3 = yzs0Var.N(dcg0VarM1);
                    jys0VarN3.getClass();
                    if (yzs0Var.B(jys0VarN3)) {
                        return true;
                    }
                    gys0Var.b();
                    arrayDeque2 = gys0Var.g;
                    arrayDeque2.getClass();
                    nbk0Var2 = gys0Var.h;
                    nbk0Var2.getClass();
                    arrayDeque2.push(dcg0VarM1);
                    while (!arrayDeque2.isEmpty()) {
                        dcg0Var2 = (dcg0) arrayDeque2.pop();
                        dcg0Var2.getClass();
                        if (!nbk0Var2.add(dcg0Var2)) {
                            if (yzs0Var.s0(dcg0Var2)) {
                                fys0Var2 = fys0Var3;
                            } else {
                                fys0Var2 = fys0Var4;
                            }
                            if (fys0Var2.equals(fys0Var3)) {
                                fys0Var2 = null;
                            }
                            if (fys0Var2 == null) {
                                continue;
                            } else {
                                it2 = yzs0Var2.s(yzs0Var2.N(dcg0Var2)).iterator();
                                while (it2.hasNext()) {
                                    dcg0VarN = fys0Var2.n(gys0Var, (aty) it2.next());
                                    dcg0VarN.getClass();
                                    jys0VarN4 = yzs0Var.N(dcg0VarN);
                                    jys0VarN4.getClass();
                                    if (yzs0Var.B(jys0VarN4)) {
                                        gys0Var.a();
                                        return true;
                                    }
                                    arrayDeque2.add(dcg0VarN);
                                }
                            }
                        }
                    }
                    gys0Var.a();
                    return z2;
                }
                if (size != 1) {
                    dcg0 dcg0Var11 = (dcg0) CollectionsKt.T(arrayList2);
                    dcg0Var11.getClass();
                    return r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var11), dcg0VarW2);
                }
                kw3Var = new kw3(yzs0Var.x(jys0VarN9));
                iX = yzs0Var.x(jys0VarN9);
                r6 = z2;
                while (true) {
                    if (r6 < iX) {
                        zR = r(gys0Var, yzs0Var, kw3Var, dcg0VarW2);
                        break;
                    }
                    jzs0VarR0 = yzs0Var.r0(jys0VarN9, r6);
                    jzs0VarR0.getClass();
                    if (yzs0Var.B0(jzs0VarR0) != f0t0.OUT) {
                        zR = z2;
                        break;
                    }
                    ArrayList arrayList6 = new ArrayList(r3d.q(arrayList2, 10));
                    while (r13.hasNext()) {
                        dcg0Var7.getClass();
                        zxs0VarA0 = yzs0Var.a0(dcg0Var7, r6);
                        if (zxs0VarA0 != null) {
                            boolean z12 = z5;
                            if (yzs0Var.k0(zxs0VarA0) != f0t0.INV) {
                                zxs0VarA0 = null;
                            }
                            if (zxs0VarA0 == null) {
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + dcg0Var7 + ", subType: " + dcg0VarM1 + ", superType: " + dcg0VarW2).toString());
                    }
                    boolean z13 = z5;
                    aty atyVarZ4 = yzs0Var.z(arrayList6);
                    atyVarZ4.getClass();
                    kw3Var.add(yzs0Var.n(atyVarZ4));
                    z5 = z13;
                    r6++;
                }
                if (zR) {
                    return z5;
                }
                zR2 = z2;
                while (r3.hasNext()) {
                    if (zR2) {
                        dcg0Var8.getClass();
                        zR2 = r(gys0Var, yzs0Var, yzs0Var.q(dcg0Var8), dcg0VarW2);
                    }
                }
                return zR2;
            }
        }
        return true;
    }

    public g9f n(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = m(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((x25) ((g9f) next)).b != iMyPid);
        g9f g9fVar = (g9f) next;
        if (g9fVar != null) {
            return g9fVar;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i2 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        kjv kjvVar = new kjv();
        kjvVar.e = processName;
        kjvVar.f18405a = iMyPid;
        byte b2 = (byte) (kjvVar.d | 1);
        kjvVar.b = 0;
        kjvVar.c = false;
        kjvVar.d = (byte) (((byte) (b2 | 2)) | 4);
        return kjvVar.a();
    }

    @Override // a.vke
    public Object o(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        try {
            f99 f99Var = new f99();
            responseBody.getD().u(f99Var);
            MediaType b2 = responseBody.getB();
            long c2 = responseBody.getC();
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
            return new ResponseBody$Companion$asResponseBody$1(b2, c2, f99Var);
        } finally {
            responseBody.close();
        }
    }

    public String toString() {
        switch (this.f21046a) {
            case 22:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f2) {
        return Integer.valueOf(Math.round(vdy.d(ndyVar) * f2));
    }

    @Override // a.jyj0
    public void lock() {
    }

    @Override // a.jyj0
    public void unlock() {
    }
}
