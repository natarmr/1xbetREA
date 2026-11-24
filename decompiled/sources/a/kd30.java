package a;

import android.gov.nist.core.Separators;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kd30 implements w6t0, d28, cfr, dm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18086a;
    public Object b;

    public kd30(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 9:
                this.f18086a = gii0Var;
                this.b = new l3a0(this, (byte) 8);
                break;
            case 14:
                this.f18086a = gii0Var;
                this.b = new p7d0(this, (byte) 9);
                break;
            case 18:
                this.f18086a = gii0Var;
                this.b = new a7g0(this, (byte) 2);
                break;
            case 23:
                this.f18086a = gii0Var;
                this.b = new goi0(this, (byte) 5);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.f18086a = gii0Var;
                this.b = new goi0(this, (byte) 21);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f18086a = gii0Var;
                this.b = new jfm0(this, (byte) 0);
                break;
            default:
                this.f18086a = gii0Var;
                this.b = new rx00(this, (byte) 26);
                break;
        }
    }

    public static void G(kd30 kd30Var, cb50 cb50Var, m7h0 m7h0Var, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            m7h0Var = null;
        }
        byte b = 0;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        kd30Var.F();
        kd30Var.Q(cb50Var, new kf50(m7h0Var, z, z2, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void J(e7z e7zVar) {
        if (e7zVar.r1 > 0) {
            if (e7zVar.i1.d == a7z.e && !e7zVar.q() && !e7zVar.r() && !e7zVar.s1 && e7zVar.J()) {
                lm40 lm40Var = (lm40) e7zVar.h1.g;
                if ((lm40Var.d & 256) != 0) {
                    while (lm40Var != null) {
                        if ((lm40Var.c & 256) != 0) {
                            ?? V = lm40Var;
                            ?? xz40Var = 0;
                            while (V != 0) {
                                if (V instanceof t7v) {
                                    t7v t7vVar = (t7v) V;
                                    t7vVar.P(vcc.X(t7vVar, 256));
                                } else if ((V.c & 256) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var2 = ((f3k) V).p;
                                    int i = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var2 != null) {
                                        if ((lm40Var2.c & 256) != 0) {
                                            i++;
                                            xz40Var = xz40Var;
                                            if (i == 1) {
                                                V = lm40Var2;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                        lm40Var2 = lm40Var2.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                        if ((lm40Var.d & 256) == 0) {
                            break;
                        } else {
                            lm40Var = lm40Var.f;
                        }
                    }
                }
            }
            e7zVar.q1 = false;
            xz40 xz40VarA = e7zVar.A();
            Object[] objArr = xz40VarA.f41739a;
            int i2 = xz40VarA.c;
            for (int i3 = 0; i3 < i2; i3++) {
                J((e7z) objArr[i3]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(zje zjeVar, swp0 swp0Var, String str) throws dwq0, zhi0 {
        rth0 rth0Var;
        if (zjeVar instanceof rth0) {
            rth0Var = (rth0) zjeVar;
            int i = rth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rth0Var.k = i - Integer.MIN_VALUE;
            } else {
                rth0Var = new rth0(this, zjeVar);
            }
        } else {
            rth0Var = new rth0(this, zjeVar);
        }
        Object objC0 = rth0Var.i;
        Object obj = wne.f39444a;
        int i2 = rth0Var.k;
        if (i2 == 0) {
            z1x.P(objC0);
            rth0Var.k = 1;
            objC0 = c0(rth0Var, swp0Var, str, true);
            if (objC0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC0);
        }
        jd jdVar = (jd) objC0;
        jdVar.getClass();
        if (jdVar.d != null) {
            return Unit.f46060a;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar, swp0 swp0Var, String str) throws dwq0, zhi0 {
        sth0 sth0Var;
        if (zjeVar instanceof sth0) {
            sth0Var = (sth0) zjeVar;
            int i = sth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sth0Var.k = i - Integer.MIN_VALUE;
            } else {
                sth0Var = new sth0(this, zjeVar);
            }
        } else {
            sth0Var = new sth0(this, zjeVar);
        }
        Object objC0 = sth0Var.i;
        Object obj = wne.f39444a;
        int i2 = sth0Var.k;
        if (i2 == 0) {
            z1x.P(objC0);
            sth0Var.k = 1;
            objC0 = c0(sth0Var, swp0Var, str, true);
            if (objC0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC0);
        }
        return wb.O((jd) objC0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(String str, zje zjeVar) throws dwq0, zhi0 {
        tth0 tth0Var;
        if (zjeVar instanceof tth0) {
            tth0Var = (tth0) zjeVar;
            int i = tth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tth0Var.k = i - Integer.MIN_VALUE;
            } else {
                tth0Var = new tth0(this, zjeVar);
            }
        } else {
            tth0Var = new tth0(this, zjeVar);
        }
        Object objC0 = tth0Var.i;
        Object obj = wne.f39444a;
        int i2 = tth0Var.k;
        if (i2 == 0) {
            z1x.P(objC0);
            swp0 swp0Var = new swp0("", "", false);
            tth0Var.k = 1;
            objC0 = c0(tth0Var, swp0Var, str, false);
            if (objC0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC0);
        }
        return wb.O((jd) objC0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(zje zjeVar, swp0 swp0Var, String str) {
        uth0 uth0Var;
        if (zjeVar instanceof uth0) {
            uth0Var = (uth0) zjeVar;
            int i = uth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uth0Var.k = i - Integer.MIN_VALUE;
            } else {
                uth0Var = new uth0(this, zjeVar);
            }
        } else {
            uth0Var = new uth0(this, zjeVar);
        }
        Object objD0 = uth0Var.i;
        Object obj = wne.f39444a;
        int i2 = uth0Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            uth0Var.k = 1;
            objD0 = d0(uth0Var, swp0Var, str);
            if (objD0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        jd jdVar = (jd) objD0;
        jdVar.getClass();
        Long l = jdVar.f16304a;
        String str2 = jdVar.d;
        if ((l != null && l.longValue() == 0) || str2 == null || str2.length() == 0 || jdVar.e == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        String str3 = jdVar.c;
        if (str3 != null) {
            return new mwt0(jLongValue, str3, str2);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(zje zjeVar, swp0 swp0Var, String str) throws dwq0, zhi0 {
        vth0 vth0Var;
        if (zjeVar instanceof vth0) {
            vth0Var = (vth0) zjeVar;
            int i = vth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vth0Var.k = i - Integer.MIN_VALUE;
            } else {
                vth0Var = new vth0(this, zjeVar);
            }
        } else {
            vth0Var = new vth0(this, zjeVar);
        }
        Object objC0 = vth0Var.i;
        Object obj = wne.f39444a;
        int i2 = vth0Var.k;
        if (i2 == 0) {
            z1x.P(objC0);
            vth0Var.k = 1;
            objC0 = c0(vth0Var, swp0Var, str, true);
            if (objC0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC0);
        }
        jd jdVar = (jd) objC0;
        jdVar.getClass();
        String str2 = jdVar.d;
        String str3 = str2 == null ? "" : str2;
        Long l = jdVar.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str4 = jdVar.c;
        String str5 = str4 == null ? "" : str4;
        Iterable<String> iterable = jdVar.m;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        zie0 zie0Var = obk0.b;
        ArrayList arrayList = new ArrayList();
        for (String str6 : iterable) {
            zie0Var.getClass();
            obk0 obk0VarB = zie0.b(str6);
            if (obk0VarB != null) {
                arrayList.add(obk0VarB);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = kotlin.collections.a.c(obk0.SMS);
        }
        List list = listC;
        Iterable<String> iterable2 = jdVar.n;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        zie0 zie0Var2 = obk0.b;
        ArrayList arrayList2 = new ArrayList();
        for (String str7 : iterable2) {
            zie0Var2.getClass();
            obk0 obk0VarB2 = zie0.b(str7);
            if (obk0VarB2 != null) {
                arrayList2.add(obk0VarB2);
            }
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = kotlin.collections.a.c(obk0.SMS);
        }
        List list2 = listC2;
        ywp0 ywp0Var = jdVar.i;
        return new wus0(str3, jLongValue, str5, list, list2, ywp0Var == null ? tus0.f34566a : new uus0(new swp0(ywp0Var, false)));
    }

    public void F() {
        i1w0 i1w0VarB = ((oeg0) this.b).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarB.a((oe50) pawVar.next());
            }
        }
    }

    public Bundle H(String str) {
        h0h0 h0h0Var = (h0h0) this.f18086a;
        if (!h0h0Var.g) {
            jf4.n("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = h0h0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleL = bundle.containsKey(str) ? b8k0.L(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            h0h0Var.f = null;
        }
        return bundleL;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public void I() {
        Object[] objArr;
        xz40 xz40Var = (xz40) this.f18086a;
        Arrays.sort(xz40Var.f41739a, 0, xz40Var.c, s7f.f);
        int i = xz40Var.c;
        e7z[] e7zVarArr = (e7z[]) this.b;
        if (e7zVarArr != null) {
            int length = e7zVarArr.length;
            objArr = e7zVarArr;
            if (length < i) {
                objArr = new e7z[Math.max(16, i)];
            }
        } else {
            objArr = new e7z[Math.max(16, i)];
        }
        this.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = xz40Var.f41739a[i2];
        }
        xz40Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.b = objArr;
                return;
            }
            e7z e7zVar = objArr[i];
            e7zVar.getClass();
            if (e7zVar.q1) {
                J(e7zVar);
            }
            objArr[i] = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable K(ArrayList arrayList, zje zjeVar) {
        sta0 sta0Var;
        if (zjeVar instanceof sta0) {
            sta0Var = (sta0) zjeVar;
            int i = sta0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sta0Var.k = i - Integer.MIN_VALUE;
            } else {
                sta0Var = new sta0(this, zjeVar);
            }
        } else {
            sta0Var = new sta0(this, zjeVar);
        }
        Object objA = sta0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = sta0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            zx10 zx10Var = (zx10) this.f18086a;
            String strC = ((knf0) this.b).c();
            String strB0 = CollectionsKt.b0(CollectionsKt.N(arrayList), Separators.COMMA, null, null, null, 62);
            sta0Var.k = 1;
            objA = ((lta0) ((rta0) zx10Var.f45137a).invoke()).a(strC, strB0, sta0Var);
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
        Iterable<vta0> iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        for (vta0 vta0Var : iterable) {
            vta0Var.getClass();
            Long l = vta0Var.f37997a;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = vta0Var.b;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            String str = vta0Var.c;
            if (str != null) {
                String str2 = !StringsKt.W(str) ? str : null;
                if (str2 != null) {
                    arrayList2.add(new kta0(jLongValue, jLongValue2, str2));
                }
            }
            jf4.k(null);
            return null;
        }
        return arrayList2;
    }

    public g0h0 L(String str) {
        g0h0 g0h0Var;
        h0h0 h0h0Var = (h0h0) this.f18086a;
        synchronized (h0h0Var.c) {
            g0h0Var = (g0h0) h0h0Var.d.g(str);
        }
        return g0h0Var;
    }

    public p6d M(boolean z, boolean z2) {
        yje yjeVar = null;
        int i = 3;
        byte b = 1;
        dnq dnqVar = new dnq(new ak9(new vsg0(new mu3((byte) 5, yjeVar, this.b, z, z2)), (byte) 8), new x5v(i, yjeVar, (byte) 10), b);
        vsg0 vsg0Var = new vsg0(new mu3((byte) 4, yjeVar, this.f18086a, z, z2));
        byte b2 = 9;
        return new p6d(dnqVar, new dnq(new ak9(vsg0Var, b2), new x5v(i, yjeVar, b2), b), new xc60(i, yjeVar, b), b);
    }

    public Unit N() {
        qot qotVar = (qot) this.b;
        boolean z = ((pru) this.f18086a).a().b.z;
        kki kkiVar = qotVar.f29084a;
        if (z) {
            p7m0 p7m0Var = ((o0j) kkiVar.c).f24427a;
            if (!(p7m0Var.getValue() instanceof avo0)) {
                p7m0Var.o(null, bvo0.f3288a);
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object O(Fragment fragment, int i, ViewGroup viewGroup, Function1 function1, Function0 function0, Function0 function2, zje zjeVar) {
        mhk0 mhk0Var;
        androidx.fragment.app.e eVar;
        if (zjeVar instanceof mhk0) {
            mhk0Var = (mhk0) zjeVar;
            int i2 = mhk0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mhk0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                mhk0Var = new mhk0(this, zjeVar);
            }
        } else {
            mhk0Var = new mhk0(this, zjeVar);
        }
        mhk0 mhk0Var2 = mhk0Var;
        Object obj = mhk0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = mhk0Var2.l;
        byte b = 2;
        if (i3 == 0) {
            z1x.P(obj);
            sj3.s0(fragment, "SUCCESS_SOCIAL", new abh0(function1, this));
            sj3.s0(fragment, "CLOSE_SOCIAL", new vpj0(function2, b));
            sj3.s0(fragment, "ERROR_SOCIAL", new l0i0((Object) this, (Object) fragment, (Object) viewGroup, (Object) function0, (byte) 2));
            sj3.s0(fragment, "NOT_AVAILABLE", new nej0((Object) this, (Object) fragment, (Object) viewGroup, (byte) 6));
            androidx.fragment.app.e eVarC = fragment.C();
            eVarC.getClass();
            uii uiiVar = (uii) this.f18086a;
            mhk0Var2.i = eVarC;
            mhk0Var2.l = 1;
            Object objY = uiiVar.y(i, mhk0Var2);
            if (objY == wneVar) {
                return wneVar;
            }
            eVar = eVarC;
            obj = objY;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = mhk0Var2.i;
            z1x.P(obj);
        }
        bik0 bik0Var = (bik0) obj;
        int i4 = bik0Var.f2663a;
        if (i4 == 1) {
            if ((bik0Var instanceof zhk0 ? (zhk0) bik0Var : null) != null) {
                rvt0.f2.getClass();
                rvt0 rvt0Var = new rvt0();
                sj3.E0(rvt0Var, eVar, rvt0Var.getClass().getSimpleName());
            }
        } else if (i4 == 5) {
            xhk0 xhk0Var = bik0Var instanceof xhk0 ? (xhk0) bik0Var : null;
            if (xhk0Var != null) {
                evz evzVar = of60.i2;
                String str = xhk0Var.b;
                String str2 = xhk0Var.c;
                evzVar.getClass();
                of60 of60Var = new of60();
                iiy[] iiyVarArr = of60.j2;
                of60Var.e2.x(of60Var, iiyVarArr[0], str);
                of60Var.f2.x(of60Var, iiyVarArr[1], str2);
                sj3.E0(of60Var, eVar, of60Var.getClass().getSimpleName());
            }
        } else if (i4 == 7) {
            if ((bik0Var instanceof aik0 ? (aik0) bik0Var : null) != null) {
                n2w0.h2.getClass();
                n2w0 n2w0Var = new n2w0();
                sj3.E0(n2w0Var, eVar, n2w0Var.getClass().getSimpleName());
            }
        } else if (i4 == 9) {
            whk0 whk0Var = bik0Var instanceof whk0 ? (whk0) bik0Var : null;
            if (whk0Var != null) {
                xuz xuzVar = gr10.g2;
                String str3 = whk0Var.b;
                String str4 = whk0Var.c;
                xuzVar.getClass();
                gr10 gr10Var = new gr10();
                iiy[] iiyVarArr2 = gr10.h2;
                gr10Var.e2.x(gr10Var, iiyVarArr2[0], str3);
                gr10Var.f2.x(gr10Var, iiyVarArr2[1], str4);
                sj3.E0(gr10Var, eVar, gr10Var.getClass().getSimpleName());
            }
        } else if (i4 == 11) {
            uhk0 uhk0Var = bik0Var instanceof uhk0 ? (uhk0) bik0Var : null;
            if (uhk0Var != null) {
                sqt sqtVar = wav.h2;
                String str5 = uhk0Var.b;
                sqtVar.getClass();
                wav wavVar = new wav();
                wavVar.c2.x(wavVar, wav.i2[1], str5);
                sj3.E0(wavVar, eVar, wavVar.getClass().getSimpleName());
            }
        } else if (i4 == 13) {
            hgq.g2.getClass();
            hgq hgqVar = new hgq();
            hgqVar.b2.I(hgqVar, hgq.h2[0], i4);
            sj3.E0(hgqVar, eVar, hgqVar.getClass().getSimpleName());
        } else if (i4 == 17) {
            yhk0 yhk0Var = bik0Var instanceof yhk0 ? (yhk0) bik0Var : null;
            if (yhk0Var != null) {
                g9m0 g9m0Var = fwp0.h2;
                String str6 = yhk0Var.b;
                String str7 = yhk0Var.c;
                int i5 = yhk0Var.d;
                g9m0Var.getClass();
                fwp0 fwp0Var = new fwp0();
                iiy[] iiyVarArr3 = fwp0.i2;
                fwp0Var.g2.I(fwp0Var, iiyVarArr3[2], i5);
                fwp0Var.e2.x(fwp0Var, iiyVarArr3[0], str6);
                fwp0Var.f2.x(fwp0Var, iiyVarArr3[1], str7);
                sj3.E0(fwp0Var, eVar, fwp0Var.getClass().getSimpleName());
            }
        } else if (i4 == 19) {
            hgq.g2.getClass();
            hgq hgqVar2 = new hgq();
            hgqVar2.b2.I(hgqVar2, hgq.h2[0], i4);
            sj3.E0(hgqVar2, eVar, hgqVar2.getClass().getSimpleName());
        } else if (i4 == 26) {
            vhk0 vhk0Var = bik0Var instanceof vhk0 ? (vhk0) bik0Var : null;
            if (vhk0Var != null) {
                bst bstVar = hzx.j2;
                String str8 = vhk0Var.b;
                String str9 = vhk0Var.c;
                String str10 = vhk0Var.d;
                boolean z = vhk0Var.e;
                bstVar.getClass();
                hzx hzxVar = new hzx();
                iiy[] iiyVarArr4 = hzx.k2;
                hzxVar.e2.x(hzxVar, iiyVarArr4[0], str8);
                hzxVar.f2.x(hzxVar, iiyVarArr4[1], str9);
                hzxVar.g2.x(hzxVar, iiyVarArr4[2], str10);
                hzxVar.h2.x(hzxVar, iiyVarArr4[3], z ? "e2e" : "prd");
                sj3.E0(hzxVar, eVar, hzxVar.getClass().getSimpleName());
            }
        } else {
            if (i4 != 31) {
                return Unit.f46060a;
            }
            thk0 thk0Var = bik0Var instanceof thk0 ? (thk0) bik0Var : null;
            if (thk0Var != null) {
                nek nekVar = wuk.j2;
                String str11 = thk0Var.b;
                String str12 = thk0Var.c;
                nekVar.getClass();
                wuk wukVar = new wuk();
                iiy[] iiyVarArr5 = wuk.k2;
                wukVar.e2.x(wukVar, iiyVarArr5[0], str11);
                wukVar.f2.x(wukVar, iiyVarArr5[1], str12);
                sj3.E0(wukVar, eVar, wukVar.getClass().getSimpleName());
            }
        }
        return Unit.f46060a;
    }

    public void Q(cb50 cb50Var, Function1 function1) {
        ouu ouuVar = (ouu) this.f18086a;
        if (ouuVar.t().f4046a.equals(cb50Var.f4046a)) {
            ouu.o(ouuVar, cb50Var, function1, 2);
        } else {
            ouuVar.p(cb50Var, function1);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void R(java.lang.String r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kd30.R(java.lang.String, java.util.ArrayList):void");
    }

    public void S(String str, g0h0 g0h0Var) {
        h0h0 h0h0Var = (h0h0) this.f18086a;
        synchronized (h0h0Var.c) {
            if (h0h0Var.d.b(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            h0h0Var.d.n(str, g0h0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object T(swp0 swp0Var, zje zjeVar) {
        wth0 wth0Var;
        if (zjeVar instanceof wth0) {
            wth0Var = (wth0) zjeVar;
            int i = wth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wth0Var.k = i - Integer.MIN_VALUE;
            } else {
                wth0Var = new wth0(this, zjeVar);
            }
        } else {
            wth0Var = new wth0(this, zjeVar);
        }
        Object objG = wth0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wth0Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            vwp0 vwp0Var = new vwp0(swp0Var);
            zie0 zie0Var = obk0.b;
            eck0 eck0Var = new eck0(vwp0Var, new vbk0("FlashCall"));
            wth0Var.k = 1;
            objG = fgVar.g(eck0Var, wth0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        return new pfi0((jd) ((q16) objG).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object U(swp0 swp0Var, zje zjeVar) {
        xth0 xth0Var;
        if (zjeVar instanceof xth0) {
            xth0Var = (xth0) zjeVar;
            int i = xth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xth0Var.k = i - Integer.MIN_VALUE;
            } else {
                xth0Var = new xth0(this, zjeVar);
            }
        } else {
            xth0Var = new xth0(this, zjeVar);
        }
        Object objG = xth0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xth0Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            vwp0 vwp0Var = new vwp0(swp0Var);
            zie0 zie0Var = obk0.b;
            eck0 eck0Var = new eck0(vwp0Var, new zbk0("Telegram"));
            xth0Var.k = 1;
            objG = fgVar.g(eck0Var, xth0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        return new pfi0((jd) ((q16) objG).a());
    }

    public void V() {
        if (!((h0h0) this.f18086a).h) {
            jf4.n("Can not perform this action after onSaveInstanceState");
            return;
        }
        wc3 wc3Var = (wc3) this.b;
        if (wc3Var == null) {
            wc3Var = new wc3(this);
        }
        this.b = wc3Var;
        try {
            cjz.class.getDeclaredConstructor(null);
            wc3 wc3Var2 = (wc3) this.b;
            if (wc3Var2 != null) {
                ((LinkedHashSet) wc3Var2.b).add(cjz.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cjz.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(a.zje r7, a.swp0 r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.yth0
            if (r0 == 0) goto L13
            r0 = r7
            a.yth0 r0 = (a.yth0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.yth0 r0 = new a.yth0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r7)
            goto L71
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L31:
            a.z1x.P(r7)
            goto L5f
        L35:
            a.z1x.P(r7)
            a.eck0 r7 = new a.eck0
            a.vwp0 r2 = new a.vwp0
            r2.<init>(r8)
            r7.<init>(r2)
            java.lang.Object r8 = r6.b
            a.rta0 r8 = (a.rta0) r8
            if (r10 == 0) goto L62
            java.lang.Object r8 = r8.invoke()
            a.fg r8 = (a.fg) r8
            java.lang.Object r6 = r6.f18086a
            a.btt0 r6 = (a.btt0) r6
            java.lang.String r6 = r6.a()
            r0.k = r3
            java.lang.Object r7 = r8.c(r6, r9, r7, r0)
            if (r7 != r1) goto L5f
            goto L70
        L5f:
            a.q16 r7 = (a.q16) r7
            goto L73
        L62:
            java.lang.Object r6 = r8.invoke()
            a.fg r6 = (a.fg) r6
            r0.k = r4
            java.lang.Object r7 = r6.c(r5, r9, r7, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            a.q16 r7 = (a.q16) r7
        L73:
            a.pfi0 r6 = new a.pfi0
            java.lang.Object r7 = r7.a()
            a.jd r7 = (a.jd) r7
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kd30.W(a.zje, a.swp0, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object X(zje zjeVar, swp0 swp0Var, String str) {
        zth0 zth0Var;
        if (zjeVar instanceof zth0) {
            zth0Var = (zth0) zjeVar;
            int i = zth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zth0Var.k = i - Integer.MIN_VALUE;
            } else {
                zth0Var = new zth0(this, zjeVar);
            }
        } else {
            zth0Var = new zth0(this, zjeVar);
        }
        Object objC = zth0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zth0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            eck0 eck0Var = new eck0(new vwp0(swp0Var));
            zth0Var.k = 1;
            objC = fgVar.c(null, str, eck0Var, zth0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return new pfi0((jd) ((q16) objC).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Y(obk0 obk0Var, swp0 swp0Var, String str, zje zjeVar) {
        im90 im90Var;
        dck0 cck0Var;
        if (zjeVar instanceof im90) {
            im90Var = (im90) zjeVar;
            int i = im90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                im90Var.k = i - Integer.MIN_VALUE;
            } else {
                im90Var = new im90(this, zjeVar);
            }
        } else {
            im90Var = new im90(this, zjeVar);
        }
        Object objC = im90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = im90Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            int iOrdinal = obk0Var.ordinal();
            String str2 = obk0Var.f24985a;
            if (iOrdinal == 0) {
                cck0Var = wbk0.INSTANCE;
            } else if (iOrdinal == 1) {
                cck0Var = new cck0(str2);
            } else if (iOrdinal == 2) {
                cck0Var = new zbk0(str2);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                cck0Var = new vbk0(str2);
            }
            eck0 eck0Var = new eck0(new vwp0(swp0Var), cck0Var);
            bs00 bs00Var = (bs00) this.f18086a;
            String strA = ((btt0) this.b).a();
            im90Var.k = 1;
            objC = ((il90) bs00Var.f3104a.b(sre0.f32672a.b(il90.class))).c(strA, eck0Var, str, im90Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        jd jdVar = (jd) ((q16) objC).a();
        ywp0 ywp0Var = jdVar.i;
        if (ywp0Var == null) {
            jf4.k(null);
            return null;
        }
        swp0 swp0Var2 = new swp0(ywp0Var, false);
        Integer num = jdVar.f;
        return new qfi0(swp0Var2, num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable Z(zje zjeVar, ynb0 ynb0Var, String str) {
        auh0 auh0Var;
        if (zjeVar instanceof auh0) {
            auh0Var = (auh0) zjeVar;
            int i = auh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                auh0Var.k = i - Integer.MIN_VALUE;
            } else {
                auh0Var = new auh0(this, zjeVar);
            }
        } else {
            auh0Var = new auh0(this, zjeVar);
        }
        Object objA = auh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = auh0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            String strA = ((btt0) this.f18086a).a();
            p28 p28Var = new p28(ynb0Var.f42933a, ynb0Var.b, str);
            auh0Var.k = 1;
            objA = fgVar.a(strA, p28Var, auh0Var);
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
        return new swp0(((jd) ((q16) objA).a()).i, false);
    }

    @Override // a.w6t0
    public void a() {
        ((ehf0) this.f18086a).u(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a0(String str, String str2, zje zjeVar) {
        jm90 jm90Var;
        if (zjeVar instanceof jm90) {
            jm90Var = (jm90) zjeVar;
            int i = jm90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm90Var.k = i - Integer.MIN_VALUE;
            } else {
                jm90Var = new jm90(this, zjeVar);
            }
        } else {
            jm90Var = new jm90(this, zjeVar);
        }
        Object objB = jm90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jm90Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strP = twn.p("[^0-9]", str + str2, "");
            bs00 bs00Var = (bs00) this.f18086a;
            jm90Var.k = 1;
            objB = ((il90) bs00Var.f3104a.b(sre0.f32672a.b(il90.class))).b(strP, jm90Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        String str3 = ((s4c) ((dx5) objB).a()).f31597a;
        if (str3 != null) {
            return new km90(str3);
        }
        throw new p4c();
    }

    @Override // a.dm30
    public void b(Bundle bundle) {
        ((MediaCodec) this.f18086a).setParameters(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b0(String str, zje zjeVar) throws Throwable {
        buh0 buh0Var;
        Object g0g0Var;
        if (zjeVar instanceof buh0) {
            buh0Var = (buh0) zjeVar;
            int i = buh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                buh0Var.l = i - Integer.MIN_VALUE;
            } else {
                buh0Var = new buh0(this, zjeVar);
            }
        } else {
            buh0Var = new buh0(this, zjeVar);
        }
        Object objF = buh0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = buh0Var.l;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                String strReplace = new Regex("[^0-9]").replace(str, "");
                e0g0 e0g0Var = j0g0.b;
                fg fgVar = (fg) ((rta0) this.b).invoke();
                buh0Var.i = str;
                buh0Var.l = 1;
                objF = fgVar.f("application/vnd.xenvelop+json", strReplace, buh0Var);
                if (objF == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = buh0Var.i;
                z1x.P(objF);
            }
            s4c s4cVar = (s4c) ((dx5) objF).a();
            String str2 = s4cVar.f31597a;
            if (str2 == null) {
                throw new p4c();
            }
            if (str2.equals("US")) {
                if (str.substring(0, 2).equals("+1")) {
                    throw new orv0();
                }
                throw new p4c();
            }
            g0g0Var = new o4c(s4cVar);
            e0g0 e0g0Var2 = j0g0.b;
            Throwable thA = j0g0.a(g0g0Var);
            if (thA == null) {
                return g0g0Var;
            }
            if ((thA instanceof zhi0) && ((zhi0) thA).c == i2o.l1) {
                throw new orv0();
            }
            throw thA;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    @Override // a.dm30
    public void c(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f18086a).queueInputBuffer(i, 0, i2, j, i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c0(zje zjeVar, swp0 swp0Var, String str, boolean z) throws dwq0, zhi0 {
        cuh0 cuh0Var;
        if (zjeVar instanceof cuh0) {
            cuh0Var = (cuh0) zjeVar;
            int i = cuh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cuh0Var.k = i - Integer.MIN_VALUE;
            } else {
                cuh0Var = new cuh0(this, zjeVar);
            }
        } else {
            cuh0Var = new cuh0(this, zjeVar);
        }
        Object objB = cuh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cuh0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                b8c b8cVar = new b8c(str, swp0Var);
                String strA = z ? ((btt0) this.f18086a).a() : "";
                fg fgVar = (fg) ((rta0) this.b).invoke();
                cuh0Var.k = 1;
                objB = fgVar.b(strA, b8cVar, cuh0Var);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            return (jd) ((q16) objB).a();
        } catch (zhi0 e) {
            if (e.c == i2o.TooManyRequests) {
                throw new dwq0();
            }
            throw e;
        }
    }

    @Override // a.dm30
    public void d(int i, pef pefVar, long j, int i2) {
        ((MediaCodec) this.f18086a).queueSecureInputBuffer(i, 0, pefVar.i, j, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d0(zje zjeVar, swp0 swp0Var, String str) {
        duh0 duh0Var;
        if (zjeVar instanceof duh0) {
            duh0Var = (duh0) zjeVar;
            int i = duh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                duh0Var.k = i - Integer.MIN_VALUE;
            } else {
                duh0Var = new duh0(this, zjeVar);
            }
        } else {
            duh0Var = new duh0(this, zjeVar);
        }
        Object objE = duh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = duh0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            b8c b8cVar = new b8c(str, swp0Var);
            duh0Var.k = 1;
            objE = fgVar.e(b8cVar, duh0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        return ((q16) objE).a();
    }

    @Override // a.dm30
    public MediaFormat e() {
        return ((MediaCodec) this.f18086a).getOutputFormat();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e0(swp0 swp0Var, zje zjeVar) {
        euh0 euh0Var;
        if (zjeVar instanceof euh0) {
            euh0Var = (euh0) zjeVar;
            int i = euh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                euh0Var.k = i - Integer.MIN_VALUE;
            } else {
                euh0Var = new euh0(this, zjeVar);
            }
        } else {
            euh0Var = new euh0(this, zjeVar);
        }
        Object objG = euh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = euh0Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            fg fgVar = (fg) ((rta0) this.b).invoke();
            vwp0 vwp0Var = new vwp0(swp0Var);
            zie0 zie0Var = obk0.b;
            eck0 eck0Var = new eck0(vwp0Var, new cck0("VoiceSms"));
            euh0Var.k = 1;
            objG = fgVar.g(eck0Var, euh0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        return new pfi0((jd) ((q16) objG).a());
    }

    @Override // a.dm30
    public void f() {
        ((MediaCodec) this.f18086a).detachOutputSurface();
    }

    @Override // a.dm30
    public void flush() {
        ((MediaCodec) this.f18086a).flush();
    }

    @Override // a.dm30
    public void g(int i) {
        ((MediaCodec) this.f18086a).setVideoScalingMode(i);
    }

    @Override // a.dm30
    public ByteBuffer h(int i) {
        return ((MediaCodec) this.f18086a).getInputBuffer(i);
    }

    @Override // a.dm30
    public void i(Surface surface) {
        ((MediaCodec) this.f18086a).setOutputSurface(surface);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x00e2
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // a.d28
    public a.c28 j(a.guo r17, long r18) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kd30.j(a.guo, long):a.c28");
    }

    @Override // a.dm30
    public void k(int i) {
        ((MediaCodec) this.f18086a).releaseOutputBuffer(i, false);
    }

    @Override // a.dm30
    public void m(wm30 wm30Var, Handler handler) {
        ((MediaCodec) this.f18086a).setOnFrameRenderedListener(new p04(this, wm30Var, (byte) 1), handler);
    }

    @Override // a.dm30
    public void n(int i, long j) {
        ((MediaCodec) this.f18086a).releaseOutputBuffer(i, j);
    }

    @Override // a.dm30
    public int o() {
        return ((MediaCodec) this.f18086a).dequeueInputBuffer(0L);
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        if (th instanceof nmn0) {
            z1x.y(null, ((wu9) this.b).cancel(false));
        } else {
            z1x.y(null, ((tu9) this.f18086a).b(null));
        }
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        z1x.y(null, ((tu9) this.f18086a).b(null));
    }

    @Override // a.w6t0
    public void p() {
        di80.b((di80) this.b);
    }

    @Override // a.dm30
    public int q(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f18086a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // a.dm30
    public void release() {
        dq00 dq00Var = (dq00) this.b;
        MediaCodec mediaCodec = (MediaCodec) this.f18086a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && dq00Var != null) {
                dq00Var.i(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // a.dm30
    public ByteBuffer s(int i) {
        return ((MediaCodec) this.f18086a).getOutputBuffer(i);
    }

    @Override // a.dm30
    public void t(ArrayList arrayList) {
        ((MediaCodec) this.f18086a).subscribeToVendorParameters(arrayList);
    }

    @Override // a.d28
    public void u() {
        fq80 fq80Var = (fq80) this.b;
        byte[] bArr = vtt0.b;
        fq80Var.K(bArr, bArr.length);
    }

    @Override // a.dm30
    public void v(ArrayList arrayList) {
        ((MediaCodec) this.f18086a).unsubscribeFromVendorParameters(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(String str, int i, ynb0 ynb0Var, zje zjeVar) {
        hm90 hm90Var;
        if (zjeVar instanceof hm90) {
            hm90Var = (hm90) zjeVar;
            int i2 = hm90Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hm90Var.k = i2 - Integer.MIN_VALUE;
            } else {
                hm90Var = new hm90(this, zjeVar);
            }
        } else {
            hm90Var = new hm90(this, zjeVar);
        }
        Object objA = hm90Var.i;
        wne wneVar = wne.f39444a;
        int i3 = hm90Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            xk xkVar = new xk(str, i, ynb0Var.f42933a, ynb0Var.b);
            bs00 bs00Var = (bs00) this.f18086a;
            String strA = ((btt0) this.b).a();
            hm90Var.k = 1;
            objA = ((il90) bs00Var.f3104a.b(sre0.f32672a.b(il90.class))).a(strA, xkVar, hm90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        jd jdVar = (jd) ((q16) objA).a();
        swp0 swp0Var = new swp0(jdVar.i, false);
        Iterable<String> iterable = jdVar.m;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterable) {
            obk0.b.getClass();
            obk0 obk0VarB = zie0.b(str2);
            if (obk0VarB != null) {
                arrayList.add(obk0VarB);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = kotlin.collections.a.c(obk0.SMS);
        }
        Iterable<String> iterable2 = jdVar.n;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : iterable2) {
            obk0.b.getClass();
            obk0 obk0VarB2 = zie0.b(str3);
            if (obk0VarB2 != null) {
                arrayList2.add(obk0VarB2);
            }
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = kotlin.collections.a.c(obk0.SMS);
        }
        return new pk(swp0Var, listC, listC2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r11 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.lang.String r7, java.lang.String r8, int r9, a.ynb0 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kd30.x(java.lang.String, java.lang.String, int, a.ynb0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(zje zjeVar, swp0 swp0Var, String str) throws dwq0, zhi0 {
        pth0 pth0Var;
        if (zjeVar instanceof pth0) {
            pth0Var = (pth0) zjeVar;
            int i = pth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pth0Var.k = i - Integer.MIN_VALUE;
            } else {
                pth0Var = new pth0(this, zjeVar);
            }
        } else {
            pth0Var = new pth0(this, zjeVar);
        }
        Object objC0 = pth0Var.i;
        Object obj = wne.f39444a;
        int i2 = pth0Var.k;
        if (i2 == 0) {
            z1x.P(objC0);
            pth0Var.k = 1;
            objC0 = c0(pth0Var, swp0Var, str, true);
            if (objC0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC0);
        }
        return cww.Q((jd) objC0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(zje zjeVar, swp0 swp0Var, String str) {
        qth0 qth0Var;
        if (zjeVar instanceof qth0) {
            qth0Var = (qth0) zjeVar;
            int i = qth0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qth0Var.k = i - Integer.MIN_VALUE;
            } else {
                qth0Var = new qth0(this, zjeVar);
            }
        } else {
            qth0Var = new qth0(this, zjeVar);
        }
        Object objD0 = qth0Var.i;
        Object obj = wne.f39444a;
        int i2 = qth0Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            qth0Var.k = 1;
            objD0 = d0(qth0Var, swp0Var, str);
            if (objD0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return cww.Q((jd) objD0);
    }

    public kd30(mii0 mii0Var, gst0 gst0Var) {
        gst0Var.getClass();
        this.f18086a = mii0Var;
        this.b = gst0Var;
    }

    public kd30(t940 t940Var, vwb0 vwb0Var) {
        t940Var.getClass();
        vwb0Var.getClass();
        this.f18086a = t940Var;
        this.b = vwb0Var;
    }

    public /* synthetic */ kd30(Object obj, Object obj2) {
        this.f18086a = obj;
        this.b = obj2;
    }

    public kd30(ouu ouuVar, oeg0 oeg0Var) {
        oeg0Var.getClass();
        this.f18086a = ouuVar;
        this.b = oeg0Var;
    }

    public kd30(zx10 zx10Var, knf0 knf0Var) {
        knf0Var.getClass();
        this.f18086a = zx10Var;
        this.b = knf0Var;
    }

    public kd30(bs00 bs00Var, btt0 btt0Var) {
        btt0Var.getClass();
        this.f18086a = bs00Var;
        this.b = btt0Var;
    }

    public kd30(byte b) {
        switch (b) {
            case 6:
                this.b = new float[64];
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f18086a = (ImageCaptureFailedForSpecificCombinationQuirk) khk.f18297a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.b = (PreviewGreenTintQuirk) khk.f18297a.b(PreviewGreenTintQuirk.class);
                break;
            default:
                this.f18086a = new xz40(new e7z[16]);
                break;
        }
    }

    public kd30(MediaCodec mediaCodec, dq00 dq00Var) {
        this.f18086a = mediaCodec;
        this.b = dq00Var;
        if (Build.VERSION.SDK_INT < 35 || dq00Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) dq00Var.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            x0x.K(((HashSet) dq00Var.b).add(mediaCodec));
        }
    }
}
