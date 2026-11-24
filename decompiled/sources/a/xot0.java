package a;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xot0 implements pot0 {
    public static final odd l = ozb.j(new k0g0(4, null));
    public static final odd m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f41238a;
    public final o5d0 b;
    public final kpt0 c;
    public final o5d0 d;
    public final tpt0 e;
    public final l4a f;
    public volatile boolean g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final LinkedHashMap k;

    static {
        odd oddVar = new odd();
        oddVar.cancel(null);
        m = oddVar;
    }

    public xot0(o5d0 o5d0Var, o5d0 o5d0Var2, kpt0 kpt0Var, o5d0 o5d0Var3, tpt0 tpt0Var, l4a l4aVar) {
        o5d0Var.getClass();
        o5d0Var2.getClass();
        kpt0Var.getClass();
        o5d0Var3.getClass();
        tpt0Var.getClass();
        this.f41238a = o5d0Var;
        this.b = o5d0Var2;
        this.c = kpt0Var;
        this.d = o5d0Var3;
        this.e = tpt0Var;
        this.f = l4aVar;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final byte b = 0;
        this.h = maz.b(new Function0(this) { // from class: a.qot0
            public final /* synthetic */ xot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                xot0 xot0Var = this.b;
                switch (b2) {
                    case 0:
                        return (f8a) xot0Var.f41238a.get();
                    case 1:
                        return (spt0) xot0Var.d.get();
                    default:
                        return (cpt0) xot0Var.b.get();
                }
            }
        });
        final byte b2 = 1;
        this.i = maz.b(new Function0(this) { // from class: a.qot0
            public final /* synthetic */ xot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                xot0 xot0Var = this.b;
                switch (b3) {
                    case 0:
                        return (f8a) xot0Var.f41238a.get();
                    case 1:
                        return (spt0) xot0Var.d.get();
                    default:
                        return (cpt0) xot0Var.b.get();
                }
            }
        });
        final byte b3 = 2;
        this.j = maz.b(new Function0(this) { // from class: a.qot0
            public final /* synthetic */ xot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                xot0 xot0Var = this.b;
                switch (b4) {
                    case 0:
                        return (f8a) xot0Var.f41238a.get();
                    case 1:
                        return (spt0) xot0Var.d.get();
                    default:
                        return (cpt0) xot0Var.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static ArrayList n(int i, String str) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            odd oddVar = new odd();
            oddVar.b0(new ozw(2, str, null));
            arrayList.add(oddVar);
        }
        return arrayList;
    }

    public static rot0 o(LinkedHashMap linkedHashMap) {
        rot0 rot0Var = new rot0((bbw0) null, (LinkedHashMap) null, new onf0(1), 7);
        c0o c0oVar = oot0.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            rot0 rot0Var2 = (rot0) linkedHashMap.get((oot0) y2VarH.next());
            if (rot0Var2 != null) {
                rot0Var.f30856a.o((wy40) rot0Var2.f30856a.b);
                rot0Var.b.putAll(rot0Var2.b);
                rot0Var.c.addAll(rot0Var2.c);
                onf0 onf0Var = rot0Var2.d;
                if (onf0Var != null) {
                    rot0Var.d = onf0Var;
                }
            }
        }
        return rot0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pot0
    public final List a(int i, int i2, int i3, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        Object[] objArr = 0;
        if (this.g) {
            arrayList2 = arrayList;
        } else {
            int size = arrayList.size();
            arrayList2 = arrayList;
            sot0 sot0Var = new sot0(this, arrayList2, i, i2, i3, null);
            tpt0 tpt0Var = this.e;
            tpt0Var.getClass();
            yne yneVar = Intrinsics.d(tpt0Var.d.get(), Boolean.TRUE) ? yne.d : yne.f42936a;
            ArrayList arrayList4 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList4.add(new odd());
            }
            qjj.W(tpt0Var.f, null, yneVar, new n7t0(sot0Var, arrayList4, objArr == true ? 1 : 0, (byte) 4), 1);
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? n(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pot0
    public final jzj b(LinkedHashSet linkedHashSet, boolean z) {
        odd oddVarP = null;
        Object[] objArr = 0;
        if (!this.g) {
            oddVarP = p(new ni2(linkedHashSet, z, this, objArr == true ? 1 : 0, (byte) 4));
        }
        return oddVarP == null ? m : oddVarP;
    }

    @Override // a.pot0
    public final void close() {
        this.g = true;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        cpt0 cpt0Var = (cpt0) this.j.getValue();
        synchronized (cpt0Var.c) {
            try {
                if (cpt0Var.g) {
                    cpt0Var.g = false;
                    odd oddVar = cpt0Var.d;
                    if (oddVar != null) {
                        oddVar.b0(new CancellationException("UseCaseCameraState closed"));
                    }
                    cpt0Var.d = null;
                }
                while (!cpt0Var.f.isEmpty()) {
                    ((odd) ((zot0) cpt0Var.f.removeFirst()).b).b0(new CancellationException("UseCaseCameraState closed"));
                    cpt0Var.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pot0
    public final jzj d() {
        odd oddVarP = null;
        Object[] objArr = 0;
        if (!this.g) {
            oddVarP = p(new fwk0(this, objArr == true ? 1 : 0, (byte) 6));
        }
        return oddVarP == null ? l : oddVarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pot0
    public final jzj e() {
        odd oddVarP = null;
        Object[] objArr = 0;
        if (!this.g) {
            oddVarP = p(new jtr0((Object) this, (yje) (objArr == true ? 1 : 0), (byte) 6));
        }
        return oddVarP == null ? l : oddVarP;
    }

    @Override // a.pot0
    public final jzj f(List list, List list2, List list3) {
        odd oddVarP = !this.g ? p(new vot0(this, list, list2, list3, null)) : null;
        return oddVarP == null ? l : oddVarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pot0
    public final jzj g(hx9 hx9Var, Map map) {
        map.getClass();
        odd oddVarP = null;
        Object[] objArr = 0;
        if (!this.g) {
            oddVarP = p(new xg0(this, hx9Var, map, objArr == true ? 1 : 0, (byte) 22));
        }
        return oddVarP == null ? m : oddVarP;
    }

    @Override // a.pot0
    public final jzj h(Map map, oot0 oot0Var, crd crdVar) {
        oot0Var.getClass();
        crdVar.getClass();
        if (this.g) {
            return m;
        }
        if (!Intrinsics.d(this.e.d.get(), Boolean.TRUE)) {
            hny.t(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
            return null;
        }
        sje sjeVar = this.e.f;
        yne yneVar = yne.f42936a;
        return qjj.M(sjeVar, null, new pnd0(this, oot0Var, map, crdVar, null, (byte) 18), 1);
    }

    @Override // a.pot0
    public final jzj i(int i) {
        odd oddVarP = this.g ? null : p(new tot0(this, i, null));
        return oddVarP == null ? l : oddVarP;
    }

    @Override // a.pot0
    public final jzj j(List list) {
        oot0 oot0Var = oot0.f25610a;
        list.getClass();
        odd oddVarP = this.g ? null : p(new gv60(this, list, (yje) null));
        return oddVarP == null ? m : oddVarP;
    }

    @Override // a.pot0
    public final Object k(bnn0 bnn0Var) {
        spt0 spt0Var = (spt0) this.i.getValue();
        spt0Var.getClass();
        return spt0.a(spt0Var, bnn0Var);
    }

    @Override // a.pot0
    public final jzj l(List list, List list2, List list3, vt00 vt00Var, z40 z40Var, long j) {
        odd oddVarP = !this.g ? p(new uot0(this, list, list2, list3, vt00Var, z40Var, j, null)) : null;
        return oddVarP == null ? l : oddVarP;
    }

    @Override // a.pot0
    public final jzj m(Map map, crd crdVar) {
        oot0 oot0Var = oot0.f25610a;
        map.getClass();
        crdVar.getClass();
        odd oddVarP = this.g ? null : p(new xg0(this, map, crdVar, (yje) null));
        return oddVarP == null ? m : oddVarP;
    }

    public final odd p(Function1 function1) {
        tpt0 tpt0Var = this.e;
        tpt0Var.getClass();
        yne yneVar = Intrinsics.d(tpt0Var.d.get(), Boolean.TRUE) ? yne.d : yne.f42936a;
        odd oddVar = new odd();
        qjj.W(tpt0Var.f, null, yneVar, new n7t0(function1, oddVar, null, (byte) 3), 1);
        return oddVar;
    }

    public final Object q(oot0 oot0Var, Map map, crd crdVar, bnn0 bnn0Var) {
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + oot0Var + "] values = " + map + ", optionPriority = " + crdVar);
        }
        LinkedHashMap linkedHashMap = this.k;
        Object rot0Var = linkedHashMap.get(oot0Var);
        if (rot0Var == null) {
            rot0Var = new rot0((bbw0) null, (LinkedHashMap) null, (onf0) null, 15);
            linkedHashMap.put(oot0Var, rot0Var);
        }
        rot0 rot0Var2 = (rot0) rot0Var;
        bbw0 bbw0Var = new bbw0((byte) 16);
        bbw0Var.o((wy40) rot0Var2.f30856a.b);
        map.getClass();
        crdVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((wy40) bbw0Var.b).x(s5x0.C(key), crdVar, entry.getValue());
        }
        linkedHashMap.put(oot0Var, new rot0(bbw0Var, xp20.p(rot0Var2.b), CollectionsKt.O0(rot0Var2.c), rot0Var2.d));
        return r(o(linkedHashMap), null, bnn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object r(rot0 rot0Var, LinkedHashSet linkedHashSet, zje zjeVar) {
        wot0 wot0Var;
        int i;
        if (zjeVar instanceof wot0) {
            wot0Var = (wot0) zjeVar;
            int i2 = wot0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wot0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                wot0Var = new wot0(this, zjeVar);
            }
        } else {
            wot0Var = new wot0(this, zjeVar);
        }
        wot0 wot0Var2 = wot0Var;
        Object objC = wot0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = wot0Var2.k;
        jzj jzjVar = null;
        if (i3 == 0) {
            z1x.P(objC);
            if (!this.g) {
                l4a l4aVar = this.f;
                u15 u15Var = sw9.f32911a;
                if (l4aVar.f19393a.e(sw9.f32911a, null) != null) {
                    hny.b();
                    return null;
                }
                f8a f8aVar = (f8a) this.h.getValue();
                onf0 onf0Var = rot0Var.d;
                onf0Var.getClass();
                if (onf0Var.f25544a != -1) {
                    onf0 onf0Var2 = rot0Var.d;
                    onf0Var2.getClass();
                    i = onf0Var2.f25544a;
                } else {
                    i = 1;
                }
                f8aVar.c(i);
                cpt0 cpt0Var = (cpt0) this.j.getValue();
                LinkedHashMap linkedHashMapU = s5x0.U(rot0Var.f30856a.c());
                dd40 dd40Var = vso0.f37960a;
                tz40 tz40VarA = tz40.a();
                for (Map.Entry entry : rot0Var.b.entrySet()) {
                    tz40VarA.f8147a.put((String) entry.getKey(), entry.getValue());
                }
                Map mapB = wp20.b(new Pair(dd40Var, tz40VarA));
                onf0 onf0Var3 = rot0Var.d;
                Set set = rot0Var.c;
                wot0Var2.k = 1;
                objC = cpt0Var.c(linkedHashMapU, mapB, linkedHashSet, onf0Var3, set, wot0Var2);
                if (objC == wneVar) {
                    return wneVar;
                }
            }
            if (jzjVar == null) {
                return m;
            }
            return jzjVar;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objC);
        jzjVar = (jzj) objC;
        if (jzjVar == null) {
            return m;
        }
        return jzjVar;
    }
}
