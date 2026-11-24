package a;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e0a implements vy9, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m050 f6978a;
    public final iev b;
    public final hke c;
    public final c0a d;
    public final d0a e;
    public final int f;

    public e0a(m050 m050Var, iev ievVar, hke hkeVar, y6r y6rVar, c0a c0aVar, d0a d0aVar) {
        m050Var.getClass();
        ievVar.getClass();
        hkeVar.getClass();
        y6rVar.getClass();
        c0aVar.getClass();
        d0aVar.getClass();
        this.f6978a = m050Var;
        this.b = ievVar;
        this.c = hkeVar;
        this.d = c0aVar;
        this.e = d0aVar;
        z04 z04Var = f0a.f8707a;
        z04Var.getClass();
        this.f = z04.b.incrementAndGet(z04Var);
    }

    public static Object c(e0a e0aVar, List list, List list2, List list3, vt00 vt00Var, vt00 vt00Var2, vt00 vt00Var3, z40 z40Var, x9 x9Var, long j, long j2, zje zjeVar, int i) {
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        z40 z40Var2 = (i & 512) != 0 ? null : z40Var;
        x9 x9Var2 = (i & 1024) != 0 ? null : x9Var;
        if (!e0aVar.f6978a.a()) {
            return e0aVar.c.a(list4, list5, list6, vt00Var, vt00Var2, vt00Var3, z40Var2, x9Var2, 60, new Long(j), new Long(j2), zjeVar);
        }
        c99.t(e0aVar, " after close.", "Cannot call lock3A on ");
        return null;
    }

    public static odd d(e0a e0aVar, final boolean z, final boolean z2, long j) {
        if (e0aVar.f6978a.a()) {
            c99.t(e0aVar, " after close.", "Cannot call lock3AForCapture on ");
            return null;
        }
        hke hkeVar = e0aVar.c;
        hkeVar.getClass();
        Map map = hke.q;
        Map map2 = z ? map : hke.p;
        Function1 function1 = new Function1() { // from class: a.fke
            /* JADX WARN: Code duplicated, block: B:11:0x0034  */
            /* JADX WARN: Code duplicated, block: B:28:0x0079  */
            /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zL;
                boolean z3;
                boolean zContains;
                pz2 pz2Var = (pz2) obj;
                pz2Var.getClass();
                CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
                key.getClass();
                CaptureResult captureResult = pz2Var.f27824a;
                Integer num = (Integer) captureResult.get(key);
                if (num != null) {
                    int iIntValue = num.intValue();
                    List list = q70.b;
                    if (iIntValue == 0) {
                        zL = true;
                    } else if (z) {
                        CaptureResult.Key key2 = CaptureResult.CONTROL_AF_STATE;
                        key2.getClass();
                        Object obj2 = captureResult.get(key2);
                        List list2 = hke.k;
                        if (obj2 != null) {
                            zL = list2.contains(obj2);
                        } else {
                            zL = true;
                        }
                    } else if (iIntValue == 3 || iIntValue == 4) {
                        List list3 = hke.h;
                        CaptureResult.Key key3 = CaptureResult.CONTROL_AF_STATE;
                        key3.getClass();
                        zL = CollectionsKt.L(list3, captureResult.get(key3));
                    } else {
                        zL = true;
                    }
                } else {
                    zL = false;
                }
                CaptureResult.Key key4 = CaptureResult.CONTROL_AE_MODE;
                key4.getClass();
                Integer num2 = (Integer) captureResult.get(key4);
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    List list4 = z40.b;
                    if (iIntValue2 != 0) {
                        CaptureResult.Key key5 = CaptureResult.CONTROL_AE_STATE;
                        key5.getClass();
                        Object obj3 = captureResult.get(key5);
                        if (!(obj3 != null ? hke.l.contains(obj3) : true)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                CaptureResult.Key key6 = CaptureResult.CONTROL_AWB_MODE;
                key6.getClass();
                Integer num3 = (Integer) captureResult.get(key6);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                List list5 = va5.b;
                boolean z4 = z2;
                if (z4 && num3 == null) {
                    zContains = false;
                } else if (!z4 || iIntValue3 == 0) {
                    zContains = true;
                } else {
                    CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_STATE;
                    key7.getClass();
                    Object obj4 = captureResult.get(key7);
                    List list6 = hke.m;
                    if (obj4 != null) {
                        zContains = list6.contains(obj4);
                    } else {
                        zContains = true;
                    }
                }
                Log.d("CXCP", "lock3AForCapture state " + ((Object) f7r.a(captureResult.getFrameNumber())) + ": meetsAeCondition = " + z3 + ", meetsAfCondition = " + zL + ", meetsAwbCondition = " + zContains);
                return Boolean.valueOf(z3 && zL && zContains);
            }
        };
        pg00 pg00Var = hkeVar.d;
        odd oddVar = hke.r;
        iev ievVar = hkeVar.f13203a;
        if (ievVar.c.d() == null) {
            return oddVar;
        }
        if (map2 != null) {
            map = map2;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Intrinsics.d(((Map.Entry) it.next()).getValue(), 1);
        }
        l0g0 l0g0Var = new l0g0(function1, 60, Long.valueOf(j));
        pg00Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = pg00Var.f26931a;
        copyOnWriteArrayList.add(l0g0Var);
        Log.d("CXCP", "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        if (ievVar.e(map)) {
            ievVar.f(hkeVar.c.a());
            return l0g0Var.d;
        }
        copyOnWriteArrayList.remove(l0g0Var);
        return oddVar;
    }

    public static odd n(e0a e0aVar, long j, int i) {
        Map map;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (e0aVar.f6978a.a()) {
            c99.t(e0aVar, " after close.", "Cannot call unlock3A on ");
            return null;
        }
        hke hkeVar = e0aVar.c;
        Long l = new Long(j2);
        odd oddVar = hke.r;
        iev ievVar = hkeVar.f13203a;
        b1a b1aVar = c1a.a0;
        c1a c1aVar = hkeVar.b;
        b1aVar.getClass();
        Boolean bool4 = !b1a.a(c1aVar) ? null : bool;
        if (!Intrinsics.d(bool2, bool) && !Intrinsics.d(bool4, bool) && !Intrinsics.d(bool3, bool)) {
            return ozb.j(new k0g0(0, null));
        }
        if (ievVar.c.d() == null) {
            return oddVar;
        }
        if (Intrinsics.d(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!ievVar.e(hke.o)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return oddVar;
            }
            qev.b(hkeVar.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean zD = Intrinsics.d(bool2, bool);
        boolean zD2 = Intrinsics.d(bool4, bool);
        boolean zD3 = Intrinsics.d(bool3, bool);
        if (zD || zD2 || zD3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zD) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, hke.s);
            }
            if (zD2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, hke.t);
            }
            if (zD3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, hke.u);
            }
            map = linkedHashMap;
        } else {
            map = lun.f20680a;
            map.getClass();
        }
        l0g0 l0g0Var = new l0g0(new yzn(map, (byte) 1), 60, l);
        pg00 pg00Var = hkeVar.d;
        pg00Var.getClass();
        pg00Var.f26931a.add(l0g0Var);
        Boolean bool5 = Intrinsics.d(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = Intrinsics.d(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            qev.b(hkeVar.c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        ievVar.f(hkeVar.c.a());
        return l0g0Var.d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d.f3514a) {
        }
        synchronized (this.e.f5258a) {
        }
        this.f6978a.b();
    }

    public final odd e() {
        z40 z40Var = null;
        if (this.f6978a.a()) {
            c99.t(this, " after close.", "Cannot call setTorchOn on ");
            return null;
        }
        hke hkeVar = this.c;
        z40 z40Var2 = ((h7m0) hkeVar.c.f28601a.f3556a).f12583a;
        List list = z40.b;
        if ((z40Var2 == null || z40Var2.f43743a != 1) && (z40Var2 == null || z40Var2.f43743a != 0)) {
            z40Var = new z40(1);
        }
        return hke.b(hkeVar, z40Var, null, null, new xjq(2), null, null, null, 118);
    }

    public final void k() {
        if (this.f6978a.a()) {
            c99.t(this, " after close.", "Cannot call stopRepeating on ");
        } else {
            this.b.d(null);
        }
    }

    public final void l(ArrayList arrayList) {
        Object next;
        if (this.f6978a.a()) {
            c99.t(this, " after close.", "Cannot call submit on ");
            return;
        }
        if (arrayList.isEmpty()) {
            jf4.n("Cannot call submit with an empty list of Requests!");
            return;
        }
        iev ievVar = this.b;
        ievVar.getClass();
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmf0) next).f == null);
        cmf0 cmf0Var = (cmf0) next;
        if (cmf0Var == null || ievVar.b.d != null) {
            bev bevVar = ievVar.c;
            if (bevVar.g.k0(new qdv(arrayList))) {
                return;
            }
            bevVar.a(arrayList);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot submit ");
        sb.append(cmf0Var);
        dfx dfxVar = cmf0Var.f;
        sb.append(" with input request ");
        sb.append(dfxVar);
        sb.append(" to ");
        sb.append(ievVar);
        sb.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final odd q(boolean z) {
        l0g0 l0g0Var;
        if (this.f6978a.a()) {
            c99.t(this, " after close.", "Cannot call unlock3APostCapture on ");
            return null;
        }
        odd oddVar = hke.r;
        hke hkeVar = this.c;
        iev ievVar = hkeVar.f13203a;
        if (ievVar.c.d() != null) {
            Log.d("CXCP", "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
            if (ievVar.e(z ? hke.z : hke.y)) {
                if (z) {
                    l0g0Var = new l0g0(hke.A, null, null);
                } else {
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    l0g0Var = new l0g0(lunVar);
                }
                pg00 pg00Var = hkeVar.d;
                pg00Var.getClass();
                pg00Var.f26931a.add(l0g0Var);
                ievVar.f(hkeVar.c.a());
                return l0g0Var.d;
            }
        }
        return oddVar;
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f;
    }
}
