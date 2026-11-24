package a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class rrc implements vo9, qe60, giu0, jyj0, ler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30976a;
    public final Object b;

    public rrc(std stdVar, knf0 knf0Var, gii0 gii0Var, htz htzVar, jh70 jh70Var, kys0 kys0Var, xuz xuzVar, j1q0 j1q0Var) {
        this.f30976a = (byte) 9;
        knf0Var.getClass();
        gii0Var.getClass();
        j1q0Var.getClass();
        gr00 gr00Var = new gr00();
        gr00Var.f11760a = htzVar;
        gr00Var.b = jh70Var;
        gr00Var.c = kys0Var;
        gr00Var.d = xuzVar;
        gr00Var.e = gii0Var;
        this.b = gr00Var;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    public static igp B(giv givVar, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        boolean z4 = false;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((fot0) it.next()) instanceof mzw) {
                z = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    fot0 fot0Var = (fot0) it2.next();
                    if ((fot0Var instanceof oub0) || qsm0.v(fot0Var)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    fot0 fot0Var2 = (fot0) it3.next();
                    if ((fot0Var2 instanceof oub0) || (fot0Var2 instanceof jyw) || qsm0.v(fot0Var2)) {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (qsm0.v((fot0) it4.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        int iOrdinal = givVar.a().ordinal();
        if (iOrdinal == 0) {
            string = upt0.c + " or " + upt0.f;
            if (z2) {
                string = null;
            }
        } else if (iOrdinal == 1) {
            string = upt0.c + " or " + upt0.f + " or " + upt0.e;
            if (z3) {
                string = null;
            }
        } else if (iOrdinal == 2) {
            int iOrdinal2 = ((sfu0) givVar).f32133a.ordinal();
            if (iOrdinal2 == 2) {
                string = upt0.f.toString();
                if (z4) {
                    string = null;
                }
            } else if (iOrdinal2 != 3) {
                string = null;
            } else {
                string = upt0.c + " or " + upt0.f + " or " + upt0.e;
                if (z3) {
                    string = null;
                }
            }
        } else if (iOrdinal == 3) {
            string = upt0.d.toString();
            if (z) {
                string = null;
            }
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            string = upt0.f.toString();
            if (z4) {
                string = null;
            }
        }
        if (string != null) {
            return new igp(string, givVar);
        }
        return null;
    }

    public jgp A(rrd rrdVar, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            jgp jgpVarA = A(rrdVar, arrayList, i2, CollectionsKt.r0(list, arrayList.get(i)));
            return jgpVarA instanceof fgp ? jgpVarA : A(rrdVar, arrayList, i2, list);
        }
        LinkedHashSet<giv> linkedHashSetG = eui0.g((Set) rrdVar.e, list);
        l8x.U("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetG + ", useCases = " + ((List) rrdVar.g));
        ArrayList arrayList2 = new ArrayList(r3d.q(linkedHashSetG, 10));
        Iterator it = linkedHashSetG.iterator();
        while (it.hasNext()) {
            arrayList2.add(((giv) it.next()).a());
        }
        for (lhp lhpVar : CollectionsKt.L0(CollectionsKt.O0(arrayList2))) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSetG) {
                if (((giv) obj).a() == lhpVar) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.size() > 1) {
                return ggp.f11262a;
            }
        }
        n0a n0aVar = (n0a) this.b;
        byte b = 0;
        wsf0 wsf0Var = new wsf0(linkedHashSetG, b);
        for (giv givVar : linkedHashSetG) {
            if (!givVar.b(n0aVar, rrdVar)) {
                l8x.U("CameraInfoInternal", givVar + " is not supported.");
                return ggp.f11262a;
            }
        }
        try {
            osm0.o(n0aVar, rrdVar, wsf0Var);
            return new fgp(new wsf0(linkedHashSetG, b));
        } catch (n3a | IllegalArgumentException e) {
            String strC0 = l8x.C0("CameraInfoInternal");
            if (l8x.i0(3, strC0)) {
                Log.d(strC0, "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
            }
        }
    }

    public j9i C() {
        return new j9i((bbw0) this.b);
    }

    public Object D(long j, bnn0 bnn0Var) {
        mii0 mii0Var = (mii0) this.b;
        Object objD0 = qjj.d0(((mne) mii0Var.b).b, new ey((Object) mii0Var, j, (yje) null, (byte) 9), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }

    public void E() {
        ((xxn0) ((dpi0) this.b).f6468a).f41667a.o(null, new jsn0(-1.0d, 0L));
    }

    public boolean F() {
        return ((Boolean) ((tgk) this.b).k.getValue()).booleanValue();
    }

    public void G(sd60 sd60Var, Thread thread, Throwable th) {
        f8f f8fVar = (f8f) this.b;
        synchronized (f8fVar) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                ckb.Y();
                try {
                    eut0.a(((aaf) f8fVar.e.b).b(new d8f(f8fVar, System.currentTimeMillis(), th, thread, sd60Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int H() {
        ((tgk) this.b).getClass();
        return Build.VERSION.SDK_INT;
    }

    public eyg0 I() {
        return new eyg0((Object) new r7v((ku0) this.b), (byte) 7);
    }

    public void J(wep wepVar, List list) {
        Object value;
        Object value2;
        t6p t6pVar = (t6p) this.b;
        list.getClass();
        int iOrdinal = wepVar.ordinal();
        if (iOrdinal == 0) {
            t6pVar.getClass();
            p7m0 p7m0Var = t6pVar.f33429a;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, list));
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        t6pVar.getClass();
        p7m0 p7m0Var2 = t6pVar.b;
        do {
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, list));
    }

    @Override // a.ler
    public ler a(List list) {
        list.getClass();
        return this;
    }

    @Override // a.ler
    public mer build() {
        return (j1o) this.b;
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        byte b = this.f30976a;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                c7i c7iVar = (c7i) obj2;
                xfi xfiVar = (xfi) c7iVar.c;
                v88 v88VarU0 = xfiVar.f40791a.u0();
                wsf0 wsf0VarF0 = xfiVar.f40791a.f0();
                mne mneVarV1 = xfiVar.f40791a.v1();
                fpi0 fpi0Var = (fpi0) xfiVar.m.get();
                fq fqVar = (fq) xfiVar.x.get();
                r8i r8iVar = (r8i) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) xfiVar.u.get(), (qni0) xfiVar.d0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) xfiVar.e0.get(), (qa60) xfiVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) xfiVar.f0.get(), (lzt) xfiVar.f.get(), (xcc) xfiVar.U.get(), (ztt) xfiVar.k.get(), (d3c) xfiVar.e.get(), (xyb) xfiVar.h.get(), (oqt) xfiVar.p.get(), (y5s) xfiVar.T.get(), (t0u) xfiVar.X.get());
            default:
                qsi qsiVar = (qsi) ((c7i) obj2).c;
                qa60 qa60Var = (qa60) qsiVar.F.get();
                xcc xccVar = (xcc) qsiVar.U.get();
                return new gh70((fq) qsiVar.x.get(), xccVar, qsiVar.f29259a.v1(), (lzt) qsiVar.f.get(), qa60Var, (i1w0) obj);
        }
    }

    @Override // a.ler
    public ler d(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // a.vo9
    public Type e() {
        return (Type) this.b;
    }

    @Override // a.vo9
    public Object f(jf60 jf60Var) {
        pdd pddVar = new pdd(jf60Var);
        jf60Var.y(new a1d((Object) pddVar, (byte) 1));
        return pddVar;
    }

    @Override // a.ler
    public ler k(tek tekVar) {
        tekVar.getClass();
        return this;
    }

    @Override // a.jyj0
    public void lock() {
        ((ReentrantLock) this.b).lock();
    }

    @Override // a.qe60
    public int n(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    @Override // a.ler
    public ler o(g93 g93Var) {
        g93Var.getClass();
        return this;
    }

    @Override // a.ler
    public ler p(iun iunVar) {
        iunVar.getClass();
        return this;
    }

    @Override // a.qe60
    public int s(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    @Override // a.ler
    public ler t(wsy wsyVar) {
        wsyVar.getClass();
        return this;
    }

    @Override // a.jyj0
    public void unlock() {
        ((ReentrantLock) this.b).unlock();
    }

    public ube v(Object obj, sgy sgyVar, Activity activity, eto etoVar) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        sgyVar.getClass();
        tbe tbeVar = new tbe(sgyVar, etoVar);
        ClassLoader classLoader = (ClassLoader) this.b;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, tbeVar);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new ube(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:241:0x040e A[LOOP:15: B:203:0x0370->B:241:0x040e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x048f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0496  */
    /* JADX WARN: Code duplicated, block: B:274:0x049e A[LOOP:16: B:271:0x0494->B:274:0x049e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:529:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x040c A[SYNTHETIC] */
    public ykj w(r68 r68Var) throws bwq, q9c {
        byte[] bArr;
        byte[] bArr2;
        int i;
        int iB;
        char c;
        char c2;
        int iB2;
        int i2;
        int iB3;
        int i3;
        int i4;
        byte[] bArr3;
        int i5;
        int i6;
        byte[] bArr4;
        int i7;
        khf0 khf0Var = new khf0(r68Var);
        tbu0 tbu0Var = (tbu0) khf0Var.d;
        r68 r68Var2 = (r68) khf0Var.c;
        int i8 = tbu0Var.g;
        byte[] bArr5 = new byte[i8];
        r68 r68Var3 = (r68) khf0Var.b;
        int i9 = r68Var3.b;
        int i10 = r68Var3.f29923a;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        int i13 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i14 = 4;
        while (true) {
            if (i14 == i9 && i12 == 0 && !z) {
                int i15 = i13 + 1;
                int i16 = i9 - 1;
                int i17 = (khf0Var.H(i16, i11, i9, i10) ? 1 : 0) << 1;
                if (khf0Var.H(i16, 1, i9, i10)) {
                    i17 |= 1;
                }
                int i18 = i17 << 1;
                if (khf0Var.H(i16, 2, i9, i10)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                bArr = bArr5;
                if (khf0Var.H(0, i10 - 2, i9, i10)) {
                    i19 |= 1;
                }
                int i20 = i19 << 1;
                int i21 = i10 - 1;
                if (khf0Var.H(0, i21, i9, i10)) {
                    i20 |= 1;
                }
                int i22 = i20 << 1;
                if (khf0Var.H(1, i21, i9, i10)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                if (khf0Var.H(2, i21, i9, i10)) {
                    i23 |= 1;
                }
                int i24 = i23 << 1;
                if (khf0Var.H(3, i21, i9, i10)) {
                    i24 |= 1;
                }
                bArr[i13] = (byte) i24;
                i14 -= 2;
                i12 += 2;
                i13 = i15;
                z = true;
            } else {
                bArr = bArr5;
                int i25 = i9 - 2;
                if (i14 == i25 && i12 == 0 && (i10 & 3) != 0 && !z2) {
                    int i26 = i13 + 1;
                    int i27 = (khf0Var.H(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
                    if (khf0Var.H(i25, 0, i9, i10)) {
                        i27 |= 1;
                    }
                    int i28 = i27 << 1;
                    if (khf0Var.H(i9 - 1, 0, i9, i10)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    if (khf0Var.H(0, i10 - 4, i9, i10)) {
                        i29 |= 1;
                    }
                    int i30 = i29 << 1;
                    if (khf0Var.H(0, i10 - 3, i9, i10)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    if (khf0Var.H(0, i10 - 2, i9, i10)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    int i33 = i10 - 1;
                    if (khf0Var.H(0, i33, i9, i10)) {
                        i32 |= 1;
                    }
                    int i34 = i32 << 1;
                    if (khf0Var.H(1, i33, i9, i10)) {
                        i34 |= 1;
                    }
                    bArr[i13] = (byte) i34;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i26;
                    z2 = true;
                } else if (i14 == i9 + 4 && i12 == 2 && (i10 & 7) == 0 && !z3) {
                    int i35 = i13 + 1;
                    int i36 = i9 - 1;
                    int i37 = (khf0Var.H(i36, 0, i9, i10) ? 1 : 0) << 1;
                    int i38 = i10 - 1;
                    if (khf0Var.H(i36, i38, i9, i10)) {
                        i37 |= 1;
                    }
                    int i39 = i37 << 1;
                    int i40 = i10 - 3;
                    if (khf0Var.H(0, i40, i9, i10)) {
                        i39 |= 1;
                    }
                    int i41 = i39 << 1;
                    int i42 = i10 - 2;
                    if (khf0Var.H(0, i42, i9, i10)) {
                        i41 |= 1;
                    }
                    int i43 = i41 << 1;
                    if (khf0Var.H(0, i38, i9, i10)) {
                        i43 |= 1;
                    }
                    int i44 = i43 << 1;
                    int i45 = (khf0Var.H(1, i40, i9, i10) ? i44 | 1 : i44) << 1;
                    if (khf0Var.H(1, i42, i9, i10)) {
                        i45 |= 1;
                    }
                    int i46 = i45 << 1;
                    if (khf0Var.H(1, i38, i9, i10)) {
                        i46 |= 1;
                    }
                    bArr[i13] = (byte) i46;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i35;
                    z3 = true;
                } else if (i14 == i25 && i12 == 0 && (i10 & 7) == 4 && !z4) {
                    int i47 = i13 + 1;
                    int i48 = (khf0Var.H(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
                    if (khf0Var.H(i25, 0, i9, i10)) {
                        i48 |= 1;
                    }
                    int i49 = i48 << 1;
                    if (khf0Var.H(i9 - 1, 0, i9, i10)) {
                        i49 |= 1;
                    }
                    int i50 = i49 << 1;
                    if (khf0Var.H(0, i10 - 2, i9, i10)) {
                        i50 |= 1;
                    }
                    int i51 = i50 << 1;
                    int i52 = i10 - 1;
                    if (khf0Var.H(0, i52, i9, i10)) {
                        i51 |= 1;
                    }
                    int i53 = i51 << 1;
                    if (khf0Var.H(1, i52, i9, i10)) {
                        i53 |= 1;
                    }
                    int i54 = i53 << 1;
                    if (khf0Var.H(2, i52, i9, i10)) {
                        i54 |= 1;
                    }
                    int i55 = i54 << 1;
                    if (khf0Var.H(3, i52, i9, i10)) {
                        i55 |= 1;
                    }
                    bArr[i13] = (byte) i55;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i47;
                    z4 = true;
                } else {
                    while (true) {
                        if (i14 < i9 && i12 >= 0 && !r68Var2.b(i12, i14)) {
                            bArr[i13] = (byte) khf0Var.I(i14, i12, i9, i10);
                            i13++;
                        }
                        int i56 = i14 - 2;
                        int i57 = i12 + 2;
                        if (i56 < 0 || i57 >= i10) {
                            break;
                        }
                        i14 = i56;
                        i12 = i57;
                    }
                    int i58 = i14 - 1;
                    int i59 = i12 + 5;
                    while (true) {
                        if (i58 >= 0 && i59 < i10 && !r68Var2.b(i59, i58)) {
                            bArr[i13] = (byte) khf0Var.I(i58, i59, i9, i10);
                            i13++;
                        }
                        int i60 = i58 + 2;
                        int i61 = i59 - 2;
                        if (i60 >= i9 || i61 < 0) {
                            break;
                        }
                        i58 = i60;
                        i59 = i61;
                    }
                    i14 = i58 + 5;
                    i12 = i59 - 1;
                }
            }
            if (i14 >= i9 && i12 >= i10) {
                break;
            }
            i11 = 0;
            bArr5 = bArr;
        }
        if (i13 != i8) {
            throw bwq.a();
        }
        oo8 oo8Var = tbu0Var.f;
        rbu0[] rbu0VarArr = (rbu0[]) oo8Var.b;
        byte b = oo8Var.f25582a;
        int i62 = 0;
        for (rbu0 rbu0Var : rbu0VarArr) {
            i62 += rbu0Var.f30208a;
        }
        oaj[] oajVarArr = new oaj[i62];
        int i63 = 0;
        for (rbu0 rbu0Var2 : rbu0VarArr) {
            int i64 = 0;
            while (i64 < rbu0Var2.f30208a) {
                short s = rbu0Var2.b;
                oajVarArr[i63] = new oaj(new byte[b + s], s);
                i64++;
                i63++;
            }
        }
        int length = oajVarArr[0].b.length - b;
        int i65 = length - 1;
        int i66 = 0;
        for (int i67 = 0; i67 < i65; i67++) {
            int i68 = 0;
            while (i68 < i63) {
                oajVarArr[i68].b[i67] = bArr[i66];
                i68++;
                i66++;
            }
        }
        boolean z5 = tbu0Var.f33686a == 24;
        int i69 = 8;
        int i70 = z5 ? 8 : i63;
        int i71 = 0;
        while (i71 < i70) {
            oajVarArr[i71].b[i65] = bArr[i66];
            i71++;
            i66++;
        }
        int length2 = oajVarArr[0].b.length;
        while (length < length2) {
            int i72 = 0;
            while (i72 < i63) {
                int i73 = z5 ? (i72 + 8) % i63 : i72;
                oajVarArr[i73].b[(!z5 || i73 <= 7) ? length : length - 1] = bArr[i66];
                i72++;
                i66++;
            }
            length++;
        }
        if (i66 != i8) {
            e9d0.o();
            return null;
        }
        int i74 = 0;
        for (int i75 = 0; i75 < i62; i75++) {
            i74 += oajVarArr[i75].f24929a;
        }
        byte[] bArr6 = new byte[i74];
        int i76 = 0;
        for (int i77 = 0; i77 < i62; i77++) {
            oaj oajVar = oajVarArr[i77];
            byte[] bArr7 = oajVar.b;
            short s2 = oajVar.f24929a;
            int length3 = bArr7.length;
            int[] iArr = new int[length3];
            for (int i78 = 0; i78 < length3; i78++) {
                iArr[i78] = bArr7[i78] & 255;
            }
            try {
                int iF = ((yox) this.b).f(iArr, bArr7.length - s2);
                for (int i79 = 0; i79 < s2; i79++) {
                    bArr7[i79] = (byte) iArr[i79];
                }
                i76 += iF;
                for (int i80 = 0; i80 < s2; i80++) {
                    bArr6[(i80 * i62) + i77] = bArr7[i80];
                }
            } catch (eie0 unused) {
                throw q9c.a();
            }
        }
        t68 t68Var = new t68(bArr6);
        oif0 oif0Var = new oif0(100);
        StringBuilder sb = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        HashSet hashSet = new HashSet();
        int i81 = 2;
        boolean z6 = false;
        while (true) {
            int i82 = 254;
            if (i81 == 2) {
                boolean z7 = false;
                while (true) {
                    int iB4 = t68Var.b(i69);
                    if (iB4 == 0) {
                        throw bwq.a();
                    }
                    if (iB4 <= 128) {
                        if (z7) {
                            iB4 += 128;
                        }
                        oif0Var.b((char) (iB4 - 1));
                        i81 = 2;
                    } else if (iB4 == 129) {
                        i81 = 1;
                    } else {
                        if (iB4 > 229) {
                            switch (iB4) {
                                case 230:
                                    i81 = 3;
                                    break;
                                case 231:
                                    i81 = 7;
                                    break;
                                case 232:
                                    hashSet.add(Integer.valueOf(oif0Var.toString().length()));
                                    oif0Var.b((char) 29);
                                    z7 = z7;
                                    if (t68Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 233:
                                case 234:
                                    break;
                                case 235:
                                    z7 = true;
                                    if (t68Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 236:
                                    ((StringBuilder) oif0Var.b).append("[)>\u001e05\u001d");
                                    sb.insert(0, "\u001e\u0004");
                                    z7 = z7;
                                    if (t68Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 237:
                                    ((StringBuilder) oif0Var.b).append("[)>\u001e06\u001d");
                                    sb.insert(0, "\u001e\u0004");
                                    z7 = z7;
                                    if (t68Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 238:
                                    i81 = 5;
                                    break;
                                case 239:
                                    i81 = 4;
                                    break;
                                case 240:
                                    i81 = 6;
                                    break;
                                case 241:
                                    i81 = 8;
                                    break;
                                default:
                                    if (iB4 != i82 || t68Var.a() != 0) {
                                        throw bwq.a();
                                    }
                                    break;
                            }
                        } else {
                            int i83 = iB4 - 130;
                            if (i83 < 10) {
                                oif0Var.b('0');
                            }
                            ((StringBuilder) oif0Var.b).append(String.valueOf(i83));
                        }
                        z7 = z7;
                        if (t68Var.a() <= 0) {
                            i81 = 2;
                        } else {
                            i82 = 254;
                            i69 = 8;
                        }
                    }
                }
                bArr2 = bArr6;
                i76 = i76;
                i = 6;
            } else {
                switch (hne.E(i81)) {
                    case 2:
                        bArr2 = bArr6;
                        i76 = i76;
                        i = 6;
                        int[] iArr2 = new int[3];
                        boolean z8 = false;
                        int i84 = 0;
                        while (t68Var.a() != 8 && (iB = t68Var.b(8)) != 254) {
                            hew0.R(iB, t68Var.b(8), iArr2);
                            for (int i85 = 0; i85 < 3; i85++) {
                                int i86 = iArr2[i85];
                                if (i84 != 0) {
                                    if (i84 != 1) {
                                        if (i84 == 2) {
                                            char[] cArr = hew0.g;
                                            if (i86 < 27) {
                                                char c3 = cArr[i86];
                                                if (z8) {
                                                    oif0Var.b((char) (c3 + 128));
                                                    z8 = false;
                                                } else {
                                                    oif0Var.b(c3);
                                                }
                                                c = 30;
                                            } else if (i86 != 27) {
                                                c = 30;
                                                if (i86 != 30) {
                                                    throw bwq.a();
                                                }
                                                z8 = true;
                                            } else {
                                                c = 30;
                                                hashSet.add(Integer.valueOf(oif0Var.toString().length()));
                                                c2 = 29;
                                                oif0Var.b((char) 29);
                                            }
                                            c2 = 29;
                                        } else {
                                            if (i84 != 3) {
                                                throw bwq.a();
                                            }
                                            if (z8) {
                                                oif0Var.b((char) (i86 + 224));
                                                z8 = false;
                                            } else {
                                                oif0Var.b((char) (i86 + 96));
                                            }
                                            i84 = 0;
                                        }
                                    } else if (z8) {
                                        oif0Var.b((char) (i86 + 128));
                                        z8 = false;
                                    } else {
                                        oif0Var.b((char) i86);
                                    }
                                    i84 = 0;
                                } else if (i86 < 3) {
                                    i84 = i86 + 1;
                                } else {
                                    char[] cArr2 = hew0.f;
                                    if (i86 >= 40) {
                                        throw bwq.a();
                                    }
                                    char c4 = cArr2[i86];
                                    if (z8) {
                                        oif0Var.b((char) (c4 + 128));
                                        z8 = false;
                                    } else {
                                        oif0Var.b(c4);
                                    }
                                }
                            }
                            if (t68Var.a() <= 0) {
                                i81 = 2;
                                break;
                            }
                        }
                        i81 = 2;
                        break;
                    case 3:
                        bArr2 = bArr6;
                        i = 6;
                        int[] iArr3 = new int[3];
                        boolean z9 = false;
                        int i87 = 0;
                        while (true) {
                            if (t68Var.a() == 8 || (iB2 = t68Var.b(8)) == 254) {
                                i76 = i76;
                            } else {
                                i76 = i76;
                                hew0.R(iB2, t68Var.b(8), iArr3);
                                int i88 = 0;
                                while (i88 < 3) {
                                    int i89 = iArr3[i88];
                                    if (i87 != 0) {
                                        if (i87 == 1) {
                                            if (z9) {
                                                oif0Var.b((char) (i89 + 128));
                                                z9 = false;
                                            } else {
                                                oif0Var.b((char) i89);
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        } else if (i87 == 2) {
                                            char[] cArr3 = hew0.i;
                                            if (i89 < 27) {
                                                char c5 = cArr3[i89];
                                                if (z9) {
                                                    oif0Var.b((char) (c5 + 128));
                                                    z9 = false;
                                                } else {
                                                    oif0Var.b(c5);
                                                }
                                            } else if (i89 == 27) {
                                                hashSet.add(Integer.valueOf(oif0Var.toString().length()));
                                                oif0Var.b((char) 29);
                                            } else {
                                                if (i89 != 30) {
                                                    throw bwq.a();
                                                }
                                                z9 = true;
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        } else {
                                            if (i87 != 3) {
                                                throw bwq.a();
                                            }
                                            char[] cArr4 = hew0.j;
                                            if (i89 >= 32) {
                                                throw bwq.a();
                                            }
                                            char c6 = cArr4[i89];
                                            if (z9) {
                                                oif0Var.b((char) (c6 + 128));
                                                z9 = false;
                                            } else {
                                                oif0Var.b(c6);
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        }
                                    } else if (i89 < 3) {
                                        i2 = i88;
                                        i87 = i89 + 1;
                                    } else {
                                        char[] cArr5 = hew0.h;
                                        i2 = i88;
                                        if (i89 >= 40) {
                                            throw bwq.a();
                                        }
                                        char c7 = cArr5[i89];
                                        if (z9) {
                                            oif0Var.b((char) (c7 + 128));
                                            z9 = false;
                                        } else {
                                            oif0Var.b(c7);
                                        }
                                    }
                                    i88 = i2 + 1;
                                }
                                if (t68Var.a() > 0) {
                                    i76 = i76;
                                }
                            }
                        }
                        i81 = 2;
                        break;
                    case 4:
                        bArr2 = bArr6;
                        int i90 = 3;
                        int[] iArr4 = new int[3];
                        while (t68Var.a() != 8 && (iB3 = t68Var.b(8)) != 254) {
                            hew0.R(iB3, t68Var.b(8), iArr4);
                            int i91 = 0;
                            while (i91 < i90) {
                                int i92 = iArr4[i91];
                                if (i92 == 0) {
                                    oif0Var.b('\r');
                                } else if (i92 == 1) {
                                    oif0Var.b('*');
                                } else if (i92 == 2) {
                                    oif0Var.b('>');
                                } else if (i92 == i90) {
                                    oif0Var.b(' ');
                                } else if (i92 < 14) {
                                    oif0Var.b((char) (i92 + 44));
                                } else {
                                    if (i92 >= 40) {
                                        throw bwq.a();
                                    }
                                    oif0Var.b((char) (i92 + 51));
                                }
                                i91++;
                                i90 = 3;
                            }
                            if (t68Var.a() <= 0) {
                                i = 6;
                                i81 = 2;
                            } else {
                                i90 = 3;
                            }
                            break;
                        }
                        i = 6;
                        i81 = 2;
                        break;
                    case 5:
                        bArr2 = bArr6;
                        do {
                            if (t68Var.a() <= 16) {
                                i3 = 6;
                            } else {
                                int i93 = 0;
                                while (true) {
                                    if (i93 < 4) {
                                        i3 = 6;
                                        int iB5 = t68Var.b(6);
                                        if (iB5 == 31) {
                                            int i94 = 8 - t68Var.c;
                                            if (i94 != 8) {
                                                t68Var.b(i94);
                                            }
                                        } else {
                                            if ((iB5 & 32) == 0) {
                                                iB5 |= 64;
                                            }
                                            oif0Var.b((char) iB5);
                                            i93++;
                                        }
                                    } else {
                                        i3 = 6;
                                    }
                                }
                            }
                            i76 = i76;
                            i = i3;
                            i81 = 2;
                            break;
                        } while (t68Var.a() > 0);
                        i76 = i76;
                        i = i3;
                        i81 = 2;
                        break;
                    case 6:
                        int i95 = t68Var.b;
                        int i96 = i95 + 2;
                        int iY = hew0.Y(t68Var.b(8), i95 + 1);
                        if (iY != 0) {
                            if (iY >= 250) {
                                i4 = 8;
                                iY = ((iY - 249) * 250) + hew0.Y(t68Var.b(8), i96);
                                i96 = i95 + 3;
                            }
                            if (iY >= 0) {
                                throw bwq.a();
                            }
                            bArr3 = new byte[iY];
                            i5 = i96;
                            i6 = 0;
                            while (i6 < iY) {
                                bArr4 = bArr6;
                                if (t68Var.a() >= i4) {
                                    throw bwq.a();
                                }
                                int iB6 = t68Var.b(i4);
                                int i97 = i5;
                                i5 = i97 + 1;
                                bArr3[i6] = (byte) hew0.Y(iB6, i97);
                                i6++;
                                bArr6 = bArr4;
                                i4 = 8;
                            }
                            bArr2 = bArr6;
                            arrayList.add(bArr3);
                            ((StringBuilder) oif0Var.b).append(new String(bArr3, StandardCharsets.ISO_8859_1));
                            i = 6;
                            i81 = 2;
                        } else {
                            iY = t68Var.a() / 8;
                        }
                        i4 = 8;
                        if (iY >= 0) {
                            throw bwq.a();
                        }
                        bArr3 = new byte[iY];
                        i5 = i96;
                        i6 = 0;
                        while (i6 < iY) {
                            bArr4 = bArr6;
                            if (t68Var.a() >= i4) {
                                throw bwq.a();
                            }
                            int iB7 = t68Var.b(i4);
                            int i98 = i5;
                            i5 = i98 + 1;
                            bArr3[i6] = (byte) hew0.Y(iB7, i98);
                            i6++;
                            bArr6 = bArr4;
                            i4 = 8;
                        }
                        bArr2 = bArr6;
                        arrayList.add(bArr3);
                        ((StringBuilder) oif0Var.b).append(new String(bArr3, StandardCharsets.ISO_8859_1));
                        i = 6;
                        i81 = 2;
                        break;
                        break;
                    case 7:
                        if (t68Var.a() < 8) {
                            throw bwq.a();
                        }
                        int iB8 = t68Var.b(8);
                        if (iB8 <= 127) {
                            oif0Var.c(iB8 - 1);
                        }
                        bArr2 = bArr6;
                        z6 = true;
                        i = 6;
                        i81 = 2;
                        break;
                        break;
                    default:
                        throw bwq.a();
                }
            }
            if (i81 == 1 || t68Var.a() <= 0) {
                if (sb.length() > 0) {
                    oif0Var.j();
                    ((StringBuilder) oif0Var.c).append((CharSequence) sb);
                }
                if (z6) {
                    i7 = (hashSet.contains(0) || hashSet.contains(4)) ? 5 : (hashSet.contains(1) || hashSet.contains(5)) ? i : 4;
                } else if (hashSet.contains(0) || hashSet.contains(4)) {
                    i7 = 2;
                } else {
                    i7 = (hashSet.contains(1) || hashSet.contains(5)) ? 3 : 1;
                }
                ykj ykjVar = new ykj(bArr2, oif0Var.toString(), arrayList.isEmpty() ? null : arrayList, null, -1, -1, i7);
                ykjVar.e = Integer.valueOf(i76);
                return ykjVar;
            }
            bArr6 = bArr2;
            i76 = i76;
            i69 = 8;
        }
    }

    public uyn x() {
        return new uyn(new r7v((ku0) this.b));
    }

    public Set y() {
        tgk tgkVar = (tgk) this.b;
        tgkVar.getClass();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PackageManager packageManager = tgkVar.f33916a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayListU = twn.u(listQueryIntentActivities);
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            String str = activityInfo != null ? activityInfo.packageName : null;
            if (str != null) {
                arrayListU.add(str);
            }
        }
        return CollectionsKt.P0(arrayListU);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(int i, zje zjeVar, String str) {
        k6l k6lVar;
        if (zjeVar instanceof k6l) {
            k6lVar = (k6l) zjeVar;
            int i2 = k6lVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k6lVar.k = i2 - Integer.MIN_VALUE;
            } else {
                k6lVar = new k6l(this, zjeVar);
            }
        } else {
            k6lVar = new k6l(this, zjeVar);
        }
        Object objA = k6lVar.i;
        wne wneVar = wne.f39444a;
        int i3 = k6lVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            z1l z1lVar = (z1l) ((sza) this.b).invoke();
            k6lVar.k = 1;
            objA = z1lVar.a(i, str, k6lVar);
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
        return ((dx5) objA).a();
    }

    @Override // a.ler
    public ler g() {
        return this;
    }

    @Override // a.ler
    public ler i() {
        return this;
    }

    @Override // a.ler
    public ler j() {
        return this;
    }

    @Override // a.ler
    public ler l() {
        return this;
    }

    @Override // a.ler
    public ler m() {
        return this;
    }

    @Override // a.ler
    public ler u() {
        return this;
    }

    @Override // a.ler
    public ler b(c8z c8zVar) {
        return this;
    }

    @Override // a.ler
    public ler h(vjj vjjVar) {
        return this;
    }

    @Override // a.ler
    public ler q(g950 g950Var) {
        return this;
    }

    @Override // a.ler
    public ler r(gm40 gm40Var) {
        return this;
    }

    public rrc(fno fnoVar) {
        this.f30976a = (byte) 26;
        fnoVar.getClass();
        this.b = fnoVar;
    }

    public rrc(hoo hooVar) {
        this.f30976a = (byte) 4;
        hooVar.getClass();
        this.b = hooVar;
    }

    public rrc(tgk tgkVar) {
        this.f30976a = (byte) 20;
        tgkVar.getClass();
        this.b = tgkVar;
    }

    public rrc(xkn xknVar) {
        this.f30976a = (byte) 23;
        xknVar.getClass();
        this.b = xknVar;
    }

    public rrc(gii0 gii0Var) {
        this.f30976a = (byte) 21;
        gii0Var.getClass();
        this.b = new sza(gii0Var, (byte) 29);
    }

    public rrc(igl iglVar) {
        this.f30976a = (byte) 22;
        iglVar.getClass();
        this.b = iglVar;
    }

    public rrc(xep xepVar) {
        this.f30976a = (byte) 28;
        xepVar.getClass();
        this.b = xepVar;
    }

    public rrc(t6p t6pVar) {
        this.f30976a = (byte) 27;
        t6pVar.getClass();
        this.b = t6pVar;
    }

    public /* synthetic */ rrc(Object obj, byte b) {
        this.f30976a = b;
        this.b = obj;
    }

    public rrc(OnexDatabase onexDatabase) {
        this.f30976a = (byte) 14;
        onexDatabase.getClass();
        this.b = onexDatabase;
    }

    public rrc(ClassLoader classLoader) {
        this.f30976a = (byte) 6;
        classLoader.getClass();
        this.b = classLoader;
    }

    public rrc() {
        this.f30976a = (byte) 15;
        this.b = new yox(wjt.m);
    }

    public rrc(TextView textView) {
        this.f30976a = (byte) 24;
        this.b = new gtn(textView);
    }
}
