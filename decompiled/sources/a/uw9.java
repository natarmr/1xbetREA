package a;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uw9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy9 f36382a;
    public final qcq0 b;
    public final Map c;
    public final Map d;
    public final lrm0 e;
    public final bsm0 f;
    public final boolean g;
    public final int h;
    public final Object i;
    public boolean j;
    public tw9 k;
    public final yz2 l;

    public uw9(fy9 fy9Var, qcq0 qcq0Var, Map map, Map map2, lrm0 lrm0Var, bsm0 bsm0Var, boolean z) {
        fy9Var.getClass();
        qcq0Var.getClass();
        map.getClass();
        map2.getClass();
        bsm0Var.getClass();
        this.f36382a = fy9Var;
        this.b = qcq0Var;
        this.c = map;
        this.d = map2;
        this.e = lrm0Var;
        this.f = bsm0Var;
        this.g = z;
        z04 z04Var = vw9.f38138a;
        z04Var.getClass();
        this.h = z04.b.incrementAndGet(z04Var);
        this.i = new Object();
        List list = lrm0Var.f;
        yz2 yz2VarA0 = null;
        if (!list.isEmpty()) {
            irm0 irm0Var = (irm0) CollectionsKt.U(list);
            Surface inputSurface = fy9Var.getInputSurface();
            if (inputSurface == null) {
                jf4.n("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                yz2VarA0 = o2e.a0(inputSurface, irm0Var.f15265a, new grm0(irm0Var.b), qcq0Var.a());
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.f36382a + "! Reprocessing will not be supported!", e);
            }
            if (yz2VarA0 != null) {
                Log.d("CXCP", "Created ImageWriter " + yz2VarA0 + " for session " + this.f36382a);
            }
        }
        this.l = yz2VarA0;
    }

    public final void a(tw9 tw9Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + tw9Var);
        if (((Unit) this.b.b(2000L, new pn(tw9Var, null, (byte) 13))) == null) {
            Log.e("CXCP", this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + tw9Var);
        }
    }

    public final tw9 b(boolean z, List list, Map map, Map map2, Map map3, svu svuVar, List list2) {
        CaptureRequest.Builder builderQ;
        ArrayMap arrayMap;
        Iterator it;
        long j;
        boolean zA;
        boolean zIsTerminated;
        boolean z2;
        Iterator it2;
        boolean z3;
        boolean z4;
        Map map4 = map3;
        list.getClass();
        map2.getClass();
        map4.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        fy9 fy9Var = this.f36382a;
        lrm0 lrm0Var = this.e;
        if (list.isEmpty()) {
            jf4.n("build(...) should never be called with an empty request list!");
            return null;
        }
        if (fy9Var instanceof mw2) {
            Iterator it3 = list.iterator();
            Boolean bool = null;
            Boolean bool2 = null;
            while (it3.hasNext()) {
                cmf0 cmf0Var = (cmf0) it3.next();
                List list3 = cmf0Var.f4601a;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            int i = ((mrm0) it4.next()).f22281a;
                            ArrayList arrayList3 = lrm0Var.h;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator it5 = arrayList3.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        krm0 krm0Var = (krm0) it5.next();
                                        it2 = it3;
                                        jf80 jf80Var = krm0Var.g;
                                        kf80 kf80Var = krm0Var.i;
                                        if (!(jf80Var == null ? false : jf80.a(jf80Var.f16412a, 1L))) {
                                            if (!(kf80Var == null ? false : kf80.a(kf80Var.f18185a, 0L)) && kf80Var != null) {
                                                it3 = it2;
                                                it4 = it4;
                                                it5 = it5;
                                                arrayList = arrayList;
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                            it3 = it3;
                            it4 = it4;
                            arrayList = arrayList;
                            arrayList2 = arrayList2;
                        } else {
                            it2 = it3;
                            arrayList = arrayList;
                            arrayList2 = arrayList2;
                            z3 = false;
                        }
                    }
                } else {
                    it2 = it3;
                    arrayList = arrayList;
                    arrayList2 = arrayList2;
                    z3 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                if (bool != null && !bool.equals(boolValueOf)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool.booleanValue() + ". Current request contains preview stream use case or hint: " + z3 + '.');
                }
                List list4 = cmf0Var.f4601a;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it6 = list4.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            int i2 = ((mrm0) it6.next()).f22281a;
                            ArrayList arrayList4 = lrm0Var.h;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        krm0 krm0Var2 = (krm0) it7.next();
                                        jf80 jf80Var2 = krm0Var2.g;
                                        if (!(jf80Var2 == null ? false : jf80.a(jf80Var2.f16412a, 3L))) {
                                            kf80 kf80Var2 = krm0Var2.i;
                                            if (!(kf80Var2 == null ? false : kf80.a(kf80Var2.f18185a, 1L))) {
                                                it7 = it7;
                                            }
                                        }
                                        z4 = true;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            z4 = false;
                        }
                    }
                } else {
                    z4 = false;
                }
                Object objValueOf = Boolean.valueOf(z4);
                Boolean bool3 = bool2;
                if (bool3 != null && !bool3.equals(objValueOf)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool3.booleanValue() + ". Current request contains video stream use case: " + z4 + '.');
                }
                ArrayList arrayList5 = lrm0Var.h;
                if (arrayList5 == null || !arrayList5.isEmpty()) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        if (!((krm0) it8.next()).a()) {
                            Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + lrm0Var.h);
                            return null;
                        }
                    }
                }
                bool2 = objValueOf;
                bool = boolValueOf;
                it3 = it2;
                arrayList = arrayList;
                arrayList2 = arrayList2;
            }
        }
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = arrayList2;
        if (list.isEmpty()) {
            jf4.n("build(...) should never be called with an empty request list!");
            return null;
        }
        Iterator it9 = list.iterator();
        do {
            char c = '!';
            if (!it9.hasNext()) {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    cmf0 cmf0Var2 = (cmf0) it10.next();
                    Log.d("CXCP", "Building CaptureRequest for " + cmf0Var2);
                    onf0 onf0Var = cmf0Var2.e;
                    int i3 = onf0Var != null ? onf0Var.f25544a : 1;
                    fy9 fy9Var2 = this.f36382a;
                    dfx dfxVar = cmf0Var2.f;
                    if (dfxVar != null) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) dfxVar.b.H(sre0.f32672a.b(TotalCaptureResult.class));
                        if (totalCaptureResult == null) {
                            c99.t(dfxVar.b, " as TotalCaptureResult", "Failed to unwrap FrameInfo ");
                            return null;
                        }
                        builderQ = fy9Var2.E().I(totalCaptureResult);
                    } else {
                        builderQ = fy9Var2.E().q(i3);
                    }
                    if (builderQ == null) {
                        if (dfxVar != null) {
                            Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + dfxVar.b + c);
                        } else {
                            Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((Object) onf0.b(i3)) + c);
                        }
                        builderQ = null;
                    }
                    if (builderQ == null) {
                        return null;
                    }
                    dd40 dd40Var = n1a.b;
                    Object obj = map4.get(dd40Var);
                    if (obj == null) {
                        obj = map.get(dd40Var);
                    }
                    builderQ.setTag(obj);
                    int size = cmf0Var2.f4601a.size();
                    boolean z5 = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        Surface surface = (Surface) arrayMap4.get(cmf0Var2.f4601a.get(i4));
                        if (surface != null) {
                            builderQ.addTarget(surface);
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        jf4.n("Check failed.");
                        return null;
                    }
                    dfx dfxVar2 = cmf0Var2.f;
                    if (dfxVar2 != null) {
                        if (this.l == null) {
                            Log.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
                            return null;
                        }
                        b3x b3xVar = dfxVar2.f6020a;
                        synchronized (this.i) {
                            if (this.j) {
                                Log.w("CXCP", this + " disconnected. " + b3xVar + " can't be queued to " + this.l);
                                return null;
                            }
                            Log.d("CXCP", "Queuing image " + b3xVar + " for reprocessing to ImageWriter " + this.l);
                            yz2 yz2Var = this.l;
                            yz2Var.getClass();
                            try {
                                Image image = (Image) b3xVar.H(sre0.f32672a.b(Image.class));
                                if (image == null) {
                                    Log.w("CXCP", "Failed to unwrap image wrapper " + b3xVar);
                                } else {
                                    yz2Var.f43496a.queueInputImage(image);
                                    tfx.P(builderQ, cmf0Var2.b);
                                }
                            } catch (Throwable th) {
                                Log.w("CXCP", "Failed to queue image to " + yz2Var + " due to error " + th.getMessage() + ". Ignoring failure and closing " + b3xVar);
                                if (b3xVar instanceof AutoCloseable) {
                                    b3xVar.close();
                                } else {
                                    if (!(b3xVar instanceof ExecutorService)) {
                                        e9d0.o();
                                        return null;
                                    }
                                    ExecutorService executorService = (ExecutorService) b3xVar;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z6 = false;
                                        while (!zIsTerminated) {
                                            try {
                                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z6) {
                                                    executorService.shutdownNow();
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z6) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                }
                            }
                            Log.d("CXCP", "Failed to queue image " + b3xVar + " for reprocessing to ImageWriter " + this.l);
                            return null;
                        }
                    }
                    tfx.P(builderQ, map);
                    tfx.P(builderQ, map2);
                    tfx.P(builderQ, cmf0Var2.b);
                    tfx.P(builderQ, map4);
                    b14 b14Var = vw9.c;
                    b14Var.getClass();
                    long jIncrementAndGet = b14.b.incrementAndGet(b14Var);
                    CaptureRequest captureRequestBuild = builderQ.build();
                    captureRequestBuild.getClass();
                    fy9 fy9Var3 = this.f36382a;
                    if (fy9Var3 instanceof mw2) {
                        mw2 mw2Var = (mw2) fy9Var3;
                        nw2 nw2Var = mw2Var.f20741a;
                        arrayMap = arrayMap3;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> listCreateHighSpeedRequestList = mw2Var.e.createHighSpeedRequestList(captureRequestBuild);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused2) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + nw2Var + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                listCreateHighSpeedRequestList = null;
                            } catch (IllegalStateException unused3) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList. " + nw2Var + " may be closed.");
                                listCreateHighSpeedRequestList = null;
                            } catch (UnsupportedOperationException unused4) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + nw2Var + " because the output surface was not available.");
                                listCreateHighSpeedRequestList = null;
                            }
                            if (listCreateHighSpeedRequestList == null) {
                                return null;
                            }
                            List list5 = cmf0Var2.f4601a;
                            if (list5 == null || !list5.isEmpty()) {
                                Iterator it11 = list5.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        int i5 = ((mrm0) it11.next()).f22281a;
                                        ArrayList arrayList8 = this.e.h;
                                        if (arrayList8 == null || !arrayList8.isEmpty()) {
                                            Iterator it12 = arrayList8.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    krm0 krm0Var3 = (krm0) it12.next();
                                                    jf80 jf80Var3 = krm0Var3.g;
                                                    if (jf80Var3 == null ? false : jf80.a(jf80Var3.f16412a, 3L)) {
                                                        j = 1;
                                                    } else {
                                                        kf80 kf80Var3 = krm0Var3.i;
                                                        if (kf80Var3 == null) {
                                                            zA = false;
                                                            j = 1;
                                                        } else {
                                                            j = 1;
                                                            zA = kf80.a(kf80Var3.f18185a, 1L);
                                                        }
                                                        if (!zA) {
                                                            it11 = it11;
                                                            it12 = it12;
                                                        }
                                                    }
                                                    int size2 = listCreateHighSpeedRequestList.size();
                                                    int i6 = 0;
                                                    while (i6 < size2) {
                                                        int i7 = size2;
                                                        int i8 = i6;
                                                        kx9 kx9Var = new kx9(this.f36382a, listCreateHighSpeedRequestList.get(i6), map, map2, map4, arrayMap4, z, cmf0Var2, jIncrementAndGet);
                                                        arrayList7.add(listCreateHighSpeedRequestList.get(i8));
                                                        arrayList6.add(kx9Var);
                                                        i6 = i8 + 1;
                                                        size2 = i7;
                                                        map4 = map3;
                                                        it10 = it10;
                                                        j = j;
                                                    }
                                                    map4 = map3;
                                                    it10 = it10;
                                                    arrayMap3 = arrayMap;
                                                }
                                            }
                                        }
                                        it11 = it11;
                                        map4 = map3;
                                        arrayList6 = arrayList6;
                                        arrayList7 = arrayList7;
                                        it10 = it10;
                                    }
                                    c = '!';
                                }
                            }
                            it = it10;
                            ArrayList arrayList9 = arrayList7;
                            arrayList6 = arrayList6;
                            map4 = map3;
                            kx9 kx9Var2 = new kx9(this.f36382a, listCreateHighSpeedRequestList.get(0), map, map2, map4, arrayMap4, z, cmf0Var2, jIncrementAndGet);
                            arrayList9.add(listCreateHighSpeedRequestList.get(0));
                            arrayList6.add(kx9Var2);
                            arrayList7 = arrayList9;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        arrayMap = arrayMap3;
                        it = it10;
                        map4 = map3;
                        kx9 kx9Var3 = new kx9(fy9Var3, captureRequestBuild, map, map2, map4, arrayMap4, z, cmf0Var2, jIncrementAndGet);
                        arrayList7.add(captureRequestBuild);
                        arrayList6.add(kx9Var3);
                    }
                    it10 = it;
                    arrayMap3 = arrayMap;
                    arrayMap2 = arrayMap2;
                    c = '!';
                }
                return new tw9(this.f36382a.E().F(), z, arrayList7, arrayList6, list2, svuVar, arrayMap2, arrayMap3, this.e, this.f);
            }
            cmf0 cmf0Var3 = (cmf0) it9.next();
            z2 = false;
            for (mrm0 mrm0Var : cmf0Var3.f4601a) {
                int i9 = mrm0Var.f22281a;
                if (!arrayMap4.containsKey(mrm0Var)) {
                    Surface surface2 = (Surface) this.c.get(mrm0Var);
                    if (surface2 != null) {
                        arrayMap2.put(surface2, mrm0Var);
                        arrayMap4.put(mrm0Var, surface2);
                        f3a f3aVarA = this.e.a(i9);
                        if (f3aVarA == null) {
                            jf4.n("Required value was null.");
                            return null;
                        }
                        for (krm0 krm0Var4 : f3aVarA.b) {
                            Object obj2 = this.d.get(new xe80(krm0Var4.f18773a));
                            if (obj2 == null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            arrayMap3.put((Surface) obj2, new xe80(krm0Var4.f18773a));
                        }
                    } else {
                        continue;
                    }
                }
                z2 = true;
            }
            if (!z2) {
                Log.i("CXCP", "  Failed to bind any surfaces for " + cmf0Var3 + '!');
                return null;
            }
        } while (z2);
        jf4.n("Check failed.");
        return null;
    }

    public final void c() {
        tw9 tw9Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.i) {
                try {
                    if (this.j) {
                        tw9Var = null;
                    } else {
                        this.j = true;
                        yz2 yz2Var = this.l;
                        if (yz2Var != null) {
                            dw9.y(yz2Var);
                        }
                        Surface inputSurface = this.f36382a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        tw9Var = this.k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.g && tw9Var != null) {
                a(tw9Var);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    public final Integer d(tw9 tw9Var) {
        boolean z;
        fy9 fy9Var;
        ArrayList arrayList;
        Integer numG0;
        synchronized (this.i) {
            if (this.j) {
                Log.w("CXCP", this + " disconnected. " + tw9Var + " won't be submitted");
                return null;
            }
            if (tw9Var.c.size() == 1) {
                fy9 fy9Var2 = this.f36382a;
                if (fy9Var2 instanceof mw2) {
                    z = tw9Var.b;
                    fy9Var = this.f36382a;
                    arrayList = tw9Var.c;
                    if (z) {
                        numG0 = fy9Var.T0(arrayList, tw9Var);
                    } else {
                        numG0 = fy9Var.g0(arrayList, tw9Var);
                    }
                } else if (tw9Var.b) {
                    if (this.g) {
                        this.k = tw9Var;
                    }
                    numG0 = fy9Var2.d0((CaptureRequest) tw9Var.c.get(0), tw9Var);
                } else {
                    numG0 = fy9Var2.w0((CaptureRequest) tw9Var.c.get(0), tw9Var);
                }
            } else {
                z = tw9Var.b;
                fy9Var = this.f36382a;
                arrayList = tw9Var.c;
                if (z) {
                    numG0 = fy9Var.T0(arrayList, tw9Var);
                } else {
                    numG0 = fy9Var.g0(arrayList, tw9Var);
                }
            }
            return numG0;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.h;
    }
}
