package a;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class cpt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpt0 f4765a;
    public final nwp0 b;
    public final Object c;
    public odd d;
    public final z04 e;
    public final xw3 f;
    public boolean g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public onf0 l;
    public z40 m;
    public q70 n;
    public va5 o;
    public final yot0 p;
    public final z04 q;

    public cpt0(kpt0 kpt0Var, nwp0 nwp0Var) {
        kpt0Var.getClass();
        this.f4765a = kpt0Var;
        this.b = nwp0Var;
        this.c = new Object();
        this.e = o2e.Y(0);
        this.f = new xw3();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.p = new yot0(this);
        this.q = o2e.Y(0);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #4 {, blocks: (B:73:0x016a, B:75:0x016e), top: B:93:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0154, please report this as an issue */
    public final Object a(zje zjeVar) {
        apt0 apt0Var;
        mie0 mie0Var;
        odd oddVar;
        int iIncrementAndGet;
        if (zjeVar instanceof apt0) {
            apt0Var = (apt0) zjeVar;
            int i = apt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                apt0Var.l = i - Integer.MIN_VALUE;
            } else {
                apt0Var = new apt0(this, zjeVar);
            }
        } else {
            apt0Var = new apt0(this, zjeVar);
        }
        Object objC = apt0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = apt0Var.l;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(objC);
            try {
                b0a b0aVarA = this.f4765a.a();
                apt0Var.i = mie0VarJ;
                apt0Var.l = 1;
                objC = b0aVarA.c(apt0Var);
                if (objC == wneVar) {
                    return wneVar;
                }
                mie0Var = mie0VarJ;
            } catch (CancellationException e) {
                e = e;
                mie0Var = mie0VarJ;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        mie0Var.f21842a = this.d;
                        this.d = null;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = apt0Var.i;
            try {
                z1x.P(objC);
            } catch (CancellationException e2) {
                e = e2;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        mie0Var.f21842a = this.d;
                        this.d = null;
                    }
                }
            }
        }
        AutoCloseable autoCloseable = (AutoCloseable) objC;
        try {
            e0a e0aVar = (e0a) autoCloseable;
            mie0 mie0Var2 = new mie0();
            mie0 mie0Var3 = new mie0();
            synchronized (this.c) {
                try {
                    if (this.j.isEmpty()) {
                        mie0Var2.f21842a = null;
                    } else {
                        onf0 onf0Var = this.l;
                        List listL0 = CollectionsKt.L0(this.j);
                        LinkedHashMap linkedHashMapJ = xp20.j(this.b.a(this.l), xp20.n(this.h));
                        LinkedHashMap linkedHashMapP = xp20.p(this.i);
                        dd40 dd40Var = vso0.b;
                        z04 z04Var = this.e;
                        z04Var.getClass();
                        linkedHashMapP.put(dd40Var, new Integer(z04.b.incrementAndGet(z04Var)));
                        ArrayList arrayListN0 = CollectionsKt.N0(this.k);
                        arrayListN0.add(this.p);
                        mie0Var2.f21842a = new cmf0(listL0, linkedHashMapJ, linkedHashMapP, arrayListN0, onf0Var, 32);
                    }
                    oddVar = this.d;
                    mie0Var3.f21842a = oddVar;
                    this.g = false;
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mie0Var2.f21842a == null) {
                e0aVar.k();
                mie0Var.f21842a = mie0Var3.f21842a;
            } else {
                if (oddVar != null) {
                    synchronized (this.c) {
                        this.f.addLast(new zot0(this.e.f43546a, oddVar));
                        z04 z04Var2 = this.q;
                        z04Var2.getClass();
                        iIncrementAndGet = z04.b.incrementAndGet(z04Var2);
                    }
                    m0x0.H(iIncrementAndGet);
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Update RepeatingRequest: " + mie0Var2.f21842a);
                }
                cmf0 cmf0Var = (cmf0) mie0Var2.f21842a;
                e0aVar.getClass();
                cmf0Var.getClass();
                if (e0aVar.f6978a.a()) {
                    c99.t(e0aVar, " after close.", "Cannot call startRepeating on ");
                } else {
                    e0aVar.b.d(cmf0Var);
                }
                b(e0aVar, ((cmf0) mie0Var2.f21842a).b);
            }
            ay3.L(autoCloseable, null);
            ndd nddVar = (ndd) mie0Var.f21842a;
            if (nddVar != null) {
                ((odd) nddVar).N(Unit.f46060a);
            }
            return Unit.f46060a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ay3.L(autoCloseable, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(e0a e0aVar, Map map) {
        z40 z40VarU;
        q70 q70Var;
        Object next;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        Object obj = null;
        Object obj2 = map != null ? map.get(key) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = z40.b;
            z40VarU = dj8.U(iIntValue);
        } else {
            z40VarU = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        Object obj3 = map != null ? map.get(key2) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = q70.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((q70) next).f28225a != iIntValue2);
            q70Var = (q70) next;
        } else {
            q70Var = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        Object obj4 = map != null ? map.get(key3) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (Object obj5 : va5.b) {
                if (((va5) obj5).f37069a == iIntValue3) {
                    obj = obj5;
                    break;
                }
            }
            obj = (va5) obj;
        }
        va5 va5Var = obj;
        boolean z = false;
        boolean z2 = (z40VarU == null || z40VarU.equals(this.m)) ? false : true;
        boolean z3 = (q70Var == null || q70Var.equals(this.n)) ? false : true;
        if (va5Var != 0 && !va5Var.equals(this.o)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + z40VarU + ", changed=" + z2 + "), AF(" + q70Var + ", changed=" + z3 + "), AWB(" + va5Var + ", changed=" + z + ')');
            }
            vy9.a(e0aVar, z40VarU, q70Var, va5Var, null, null, null, 56);
            if (z40VarU != null) {
                this.m = z40VarU;
            }
            if (q70Var != null) {
                this.n = q70Var;
            }
            if (va5Var != 0) {
                this.o = va5Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(LinkedHashMap linkedHashMap, Map map, Set set, onf0 onf0Var, Set set2, zje zjeVar) {
        bpt0 bpt0Var;
        mie0 mie0Var;
        if (zjeVar instanceof bpt0) {
            bpt0Var = (bpt0) zjeVar;
            int i = bpt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpt0Var.l = i - Integer.MIN_VALUE;
            } else {
                bpt0Var = new bpt0(this, zjeVar);
            }
        } else {
            bpt0Var = new bpt0(this, zjeVar);
        }
        Object obj = bpt0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = bpt0Var.l;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            synchronized (this.c) {
                try {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + onf0Var);
                    }
                    if (linkedHashMap != null) {
                        this.h.clear();
                        this.h.putAll(linkedHashMap);
                    }
                    if (map != null) {
                        this.i.clear();
                        this.i.putAll(map);
                    }
                    if (set != null) {
                        this.j.clear();
                        this.j.addAll(set);
                    }
                    if (onf0Var != null) {
                        this.l = onf0Var;
                    }
                    if (set2 != null) {
                        this.k.clear();
                        this.k.addAll(set2);
                    }
                    odd oddVar = this.d;
                    if (oddVar == null) {
                        oddVar = new odd();
                        this.d = oddVar;
                    }
                    if (this.g) {
                        return oddVar;
                    }
                    this.g = true;
                    mie0VarJ.f21842a = oddVar;
                    bpt0Var.i = mie0VarJ;
                    bpt0Var.l = 1;
                    if (a(bpt0Var) == obj2) {
                        return obj2;
                    }
                    mie0Var = mie0VarJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = bpt0Var.i;
            z1x.P(obj);
        }
        return mie0Var.f21842a;
    }
}
