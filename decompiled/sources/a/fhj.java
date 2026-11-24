package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fhj implements cfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9543a;
    public Object b;

    public fhj(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.f9543a = gii0Var;
                this.b = new yip(this, (byte) 5);
                break;
            default:
                this.f9543a = gii0Var;
                this.b = new ntl(this, (byte) 22);
                break;
        }
    }

    public static hyc a(hyc hycVar, List list) {
        hycVar.getClass();
        Map map = hycVar.f13853a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new hyc(map2);
    }

    public void A(hyc hycVar) {
        for (Map.Entry entry : new HashMap((HashMap) this.f9543a).entrySet()) {
            if (entry.getKey() != null) {
                hny.b();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!a(hycVar, list).equals(a((hyc) this.b, list))) {
                    throw null;
                }
            }
        }
        this.b = hycVar;
    }

    public void b(Fragment fragment, boolean z) {
        Fragment fragment2 = ((androidx.fragment.app.e) this.f9543a).z;
        if (fragment2 != null) {
            fragment2.F().p.b(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.getClass();
            }
        }
    }

    public void c(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Context context = eVar.x.b;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.c(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.a(eVar, fragment, context);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = ((androidx.fragment.app.e) this.f9543a).z;
        if (fragment2 != null) {
            fragment2.F().p.d(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.getClass();
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.e(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.b(eVar, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.f(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.c(eVar, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.g(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.d(eVar, fragment);
            }
        }
    }

    public void h(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Context context = eVar.x.b;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.h(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.getClass();
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragment2 = ((androidx.fragment.app.e) this.f9543a).z;
        if (fragment2 != null) {
            fragment2.F().p.i(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.getClass();
            }
        }
    }

    public void j(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.j(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.e(eVar, fragment);
            }
        }
    }

    public void k(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = ((androidx.fragment.app.e) this.f9543a).z;
        if (fragment2 != null) {
            fragment2.F().p.k(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.getClass();
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.l(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.f(eVar, fragment);
            }
        }
    }

    public void m(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.m(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.g(eVar, fragment);
            }
        }
    }

    public void n(Fragment fragment, View view, Bundle bundle, boolean z) {
        view.getClass();
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.n(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.h(eVar, fragment, view);
            }
        }
    }

    public void o(Fragment fragment, boolean z) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f9543a;
        Fragment fragment2 = eVar.z;
        if (fragment2 != null) {
            fragment2.F().p.o(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            x0r x0rVar = (x0r) it.next();
            if (!z || x0rVar.b) {
                x0rVar.f40084a.i(eVar, fragment);
            }
        }
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        int i = ((cmn0) this.f9543a).f;
        if (i == 2 && (th instanceof CancellationException)) {
            l8x.U("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        } else {
            l8x.F0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(ohm0.m(i)), th);
        }
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        imn0 imn0Var = (imn0) obj;
        imn0Var.getClass();
        ((jmn0) ((kki) this.b).e).a(imn0Var);
    }

    public d34 p(androidx.media3.common.b bVar, m24 m24Var) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        bVar.getClass();
        int i = bVar.L;
        m24Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return d34.d;
        }
        Context context = (Context) this.f9543a;
        Boolean bool = (Boolean) this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = b34.g0(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                this.b = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = bVar.p;
        str.getClass();
        int iC = mg40.c(str, bVar.l);
        if (iC == 0 || i2 < vtt0.o(iC)) {
            return d34.d;
        }
        int iP = bVar.K;
        if (iP == -1) {
            iP = vtt0.p(bVar.J);
        }
        if (iP == 0) {
            return d34.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iP).setEncoding(iC).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, m24Var.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return d34.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                c34 c34Var = new c34();
                c34Var.f3655a = true;
                c34Var.b = z;
                c34Var.c = zBooleanValue;
                return c34Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, m24Var.a())) {
                    return d34.d;
                }
                c34 c34Var2 = new c34();
                c34Var2.f3655a = true;
                c34Var2.c = zBooleanValue;
                return c34Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, m24Var.a());
            if (playbackOffloadSupport == 0) {
                return d34.d;
            }
            c34 c34Var3 = new c34();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            c34Var3.f3655a = true;
            c34Var3.b = z;
            c34Var3.c = zBooleanValue;
            return c34Var3.a();
        } catch (IllegalArgumentException unused) {
            return d34.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(ArrayList arrayList, zje zjeVar) {
        cwp cwpVar;
        if (zjeVar instanceof cwp) {
            cwpVar = (cwp) zjeVar;
            int i = cwpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwpVar.k = i - Integer.MIN_VALUE;
            } else {
                cwpVar = new cwp(this, zjeVar);
            }
        } else {
            cwpVar = new cwp(this, zjeVar);
        }
        Object objA = cwpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cwpVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            awp awpVar = (awp) ((yip) this.b).invoke();
            String strB0 = CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62);
            cwpVar.k = 1;
            objA = awpVar.a(strB0, cwpVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:76|29|(1:32)|72) */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0141  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        if (a.qcc.P(r9, r7) == r4) goto L72;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0103 -> B:28:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0171 -> B:63:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0177 -> B:63:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0180 -> B:49:0x0137). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(a.zje r21, java.lang.String r22, java.lang.String r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhj.r(a.zje, java.lang.String, java.lang.String, boolean):java.lang.Object");
    }

    public nc5 s(String str, long j, uaq0 uaq0Var, long j2) {
        Object next;
        str.getClass();
        uaq0Var.getClass();
        if (j2 == 0) {
            j2 = ((weu) this.f9543a).a(str).a();
        }
        Iterator it = ((luu) this.b).f20692a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != j2);
        lok0 lok0Var = (lok0) next;
        if (j2 == 0 || lok0Var == null) {
            uaq0.f35345a.getClass();
            return new mc5(!s9m0.j(uaq0Var), j);
        }
        int i = lok0Var.f20396a;
        String str2 = lok0Var.u;
        uaq0.f35345a.getClass();
        return new lc5(i, j, str2, !s9m0.j(uaq0Var));
    }

    public f2u t(c5g c5gVar, long j, long j2) {
        return new f2u(((z1u) this.f9543a).f43639a.d(), this, c5gVar, j, j2);
    }

    public vsg0 u(sgs sgsVar, boolean z, boolean z2) {
        long j;
        sgsVar.getClass();
        xzp xzpVar = (xzp) this.f9543a;
        zos zosVar = new zos(sgsVar.f32177a, sgsVar.b, sgsVar.h);
        boolean zJ = ((j1q0) this.b).f15748a.j();
        jo20 jo20VarU = n7x.u(((knf0) xzpVar.b).d(), sgsVar, zosVar, null);
        sip sipVar = sgsVar.b;
        sipVar.getClass();
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            j = 30;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            j = 8;
        }
        long j2 = j;
        h7w h7wVar = new h7w((byte) 2);
        fdw fdwVar = new fdw(xzpVar, sgsVar, zosVar, jo20VarU, zJ, z, z2, null);
        TimeUnit.SECONDS.getClass();
        return new vsg0(new ifw(j2, fdwVar, h7wVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object v(int i, int i2, boolean z, boolean z2, boolean z3, zje zjeVar) {
        ast astVar;
        if (zjeVar instanceof ast) {
            astVar = (ast) zjeVar;
            int i3 = astVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                astVar.l = i3 - Integer.MIN_VALUE;
            } else {
                astVar = new ast(this, zjeVar);
            }
        } else {
            astVar = new ast(this, zjeVar);
        }
        ast astVar2 = astVar;
        Object objF = astVar2.j;
        wne wneVar = wne.f39444a;
        int i4 = astVar2.l;
        if (i4 == 0) {
            z1x.P(objF);
            cu5 cu5Var = (cu5) this.f9543a;
            boolean zI = ((j1q0) this.b).f15748a.i();
            String str = ujn.h;
            astVar2.i = i;
            astVar2.l = 1;
            objF = cu5Var.f(i2, astVar2, str, z, zI, z2, z3);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = astVar2.i;
            z1x.P(objF);
        }
        List list = ((it5) objF).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (rz4.C(i, ((kr5) obj).s)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.A0(arrayList, new e3l((byte) 26));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.knk
            if (r0 == 0) goto L13
            r0 = r9
            a.knk r0 = (a.knk) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.knk r0 = new a.knk
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L6f
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L31:
            a.ts4 r8 = r0.i
            a.z1x.P(r9)
            goto L51
        L37:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.f9543a
            a.ts4 r9 = (a.ts4) r9
            java.lang.Object r8 = r8.b
            a.rou r8 = (a.rou) r8
            r0.i = r9
            r0.l = r5
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4e
            goto L6e
        L4e:
            r7 = r9
            r9 = r8
            r8 = r7
        L51:
            a.m2c0 r9 = (a.m2c0) r9
            long r5 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r5)
            r0.i = r3
            r0.l = r4
            a.knf0 r2 = r8.i
            java.lang.String r2 = r2.a()
            java.lang.Object r8 = r8.q(r9, r2, r0)
            if (r8 != r1) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L6c:
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhj.w(a.zje):java.lang.Object");
    }

    public Object x(String str, zje zjeVar) {
        return ((pbt) this.f9543a).e(zjeVar, str, ((gst0) this.b).a());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.iun] */
    public Serializable y(String str, String str2, zje zjeVar) {
        mbs mbsVar;
        String str3;
        int i;
        Iterable iterable;
        String str4;
        ?? arrayList;
        String str5;
        Object next;
        Object next2;
        Object next3;
        Boolean bool;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof mbs) {
            mbsVar = (mbs) zjeVar;
            int i2 = mbsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mbsVar.l = i2 - Integer.MIN_VALUE;
            } else {
                mbsVar = new mbs(this, zjeVar);
            }
        } else {
            mbsVar = new mbs(this, zjeVar);
        }
        mbs mbsVar2 = mbsVar;
        Object obj = mbsVar2.j;
        wne wneVar = wne.f39444a;
        int i3 = mbsVar2.l;
        String str6 = null;
        if (i3 == 0) {
            z1x.P(obj);
            iqi iqiVar = (iqi) this.f9543a;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            mbsVar2.i = str2;
            mbsVar2.l = 1;
            Object objA = ((ebs) ((yip) iqiVar.b).invoke()).a(str, strC, 1, iB, "application/vnd.xenvelop+json", mbsVar2);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            str3 = str2;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = mbsVar2.i;
            z1x.P(obj);
        }
        hbs hbsVar = (hbs) ((dx5) obj).a();
        Iterable iterable2 = hbsVar.b;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        Iterable iterable3 = hbsVar.f12785a;
        if (iterable3 == null) {
            iterable3 = iun.f15405a;
        }
        List<eos> list = hbsVar.d;
        int i4 = 10;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (eos eosVar : list) {
                eosVar.getClass();
                iterable2.getClass();
                iterable3.getClass();
                str3.getClass();
                String str7 = eosVar.f8150a;
                if (str7 == null) {
                    String str8 = str6;
                    jf4.k(str8);
                    return str8;
                }
                List<sas> list2 = eosVar.b;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list2, i4));
                    for (sas sasVar : list2) {
                        sasVar.getClass();
                        Iterator it = iterable2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str5 = str6;
                                next = str5;
                                break;
                            }
                            next = it.next();
                            String str9 = ((haa0) next).f12715a;
                            str5 = str6;
                            List list3 = sasVar.f31899a;
                            if (Intrinsics.d(str9, list3 != null ? (String) CollectionsKt.firstOrNull(list3) : str5)) {
                                break;
                            }
                            str6 = str5;
                        }
                        haa0 haa0Var = (haa0) next;
                        b9a0 b9a0VarS = haa0Var != null ? q0x.S(haa0Var) : b9a0.g;
                        String str10 = sasVar.b;
                        Integer num = sasVar.h;
                        if (str10 == null) {
                            jf4.k(str5);
                            return str5;
                        }
                        String str11 = sasVar.c;
                        if (str11 == null) {
                            str11 = "";
                        }
                        String str12 = str11;
                        Iterator it2 = iterable2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = str5;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.d(((haa0) next2).f12715a, sasVar.d));
                        haa0 haa0Var2 = (haa0) next2;
                        b9a0 b9a0VarS2 = haa0Var2 != null ? q0x.S(haa0Var2) : b9a0.g;
                        String strL = kng0.l(str3, Separators.SLASH, sasVar.e);
                        String strL2 = kng0.l(str3, Separators.SLASH, sasVar.f);
                        Iterator it3 = iterable3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next3 = str5;
                                break;
                            }
                            next3 = it3.next();
                        } while (!Intrinsics.d(((gip0) next3).f11360a, sasVar.g));
                        gip0 gip0Var = (gip0) next3;
                        ufp0 ufp0VarQ = gip0Var != null ? dnm0.q(gip0Var) : new ufp0(0, "", "", "", iun.f15405a);
                        boolean zBooleanValue = false;
                        boolean z = (num != null && num.intValue() == 2) || (num != null && num.intValue() == 16) || ((num != null && num.intValue() == 40) || (num != null && num.intValue() == 51));
                        jas jasVar = sasVar.i;
                        if (jasVar != null && (bool = jasVar.f16206a) != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        arrayList3.add(new mas(b9a0VarS, str10, str12, b9a0VarS2, strL, strL2, ufp0VarQ, z, zBooleanValue));
                        str6 = str5;
                    }
                    str4 = str6;
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (!((mas) obj2).g.equals(new ufp0(0, "", "", "", iun.f15405a))) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    str4 = str6;
                    arrayList = str4;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList2.add(new bos(str7, arrayList));
                str6 = str4;
                i4 = 10;
            }
            i = i4;
            iterable = arrayList2;
        } else {
            i = 10;
            iterable = iun.f15405a;
        }
        int iA = wp20.a(r3d.q(iterable, i));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj3 : iterable) {
            linkedHashMap.put(((bos) obj3).f2950a, obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((bos) entry.getValue()).b);
        }
        return linkedHashMap2;
    }

    public void z() throws IOException {
        String str = (String) this.f9543a;
        if (((FileChannel) this.b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.b = null;
            hny.q(kng0.l("Unable to lock file: '", str, "'."), th);
        }
    }

    public /* synthetic */ fhj(Object obj, Object obj2) {
        this.f9543a = obj;
        this.b = obj2;
    }

    public fhj(iqi iqiVar, knf0 knf0Var) {
        knf0Var.getClass();
        this.f9543a = iqiVar;
        this.b = knf0Var;
    }

    public fhj(String str, Set set) {
        str.getClass();
        set.getClass();
        this.f9543a = str;
        this.b = set;
    }

    public fhj(Context context, byte b) {
        switch (b) {
            case 4:
                this.f9543a = context;
                this.b = null;
                break;
            default:
                this.f9543a = context != null ? context.getApplicationContext() : null;
                break;
        }
    }

    public fhj() {
        this.f9543a = new HashMap();
        this.b = hyc.b;
    }
}
