package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import android.webkit.SslErrorHandler;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public class cgx0 implements e1x, cm30, nae0, xsy, vuw {
    public static final cgx0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4336a;
    public boolean b;
    public Object c;
    public Object d;

    static {
        Object obj = null;
        e = new cgx0(true, obj, obj, (byte) 0);
    }

    public cgx0(byte b) {
        this.f4336a = b;
        switch (b) {
            case 16:
                this.c = new ArrayList();
                this.d = new HashMap();
                this.b = false;
                break;
            default:
                this.b = false;
                this.c = new HashMap();
                this.d = new LinkedBlockingQueue();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cgx0 A(String str, Exception exc) {
        return new cgx0(false, str, exc, 0 == true ? 1 : 0);
    }

    public static boolean e(agn agnVar, agn agnVar2) {
        int i;
        boolean zB = agnVar2.b();
        int i2 = agnVar2.f832a;
        if (zB) {
            int i3 = agnVar.f832a;
            return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = agnVar.b) == 0 || i == agnVar2.b);
        }
        c99.t(agnVar2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static boolean g(agn agnVar, agn agnVar2, LinkedHashSet linkedHashSet) {
        if (linkedHashSet.contains(agnVar2)) {
            return e(agnVar, agnVar2);
        }
        if (!l8x.f0("CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + agnVar + "\nCandidate dynamic range:\n  " + agnVar2);
        return false;
    }

    public static agn m(agn agnVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        if (agnVar.f832a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                agn agnVar2 = (agn) it.next();
                int i = agnVar2.f832a;
                if (!agnVar2.b()) {
                    jf4.n("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1 && g(agnVar, agnVar2, linkedHashSet2)) {
                    return agnVar2;
                }
            }
        }
        return null;
    }

    public static void w(LinkedHashSet linkedHashSet, agn agnVar, vqc vqcVar) {
        z1x.y("Cannot update already-empty constraints.", !linkedHashSet.isEmpty());
        vqcVar.getClass();
        agnVar.getClass();
        Set setC = ((dgn) vqcVar.b).c(agnVar);
        Set set = setC;
        if (set.isEmpty()) {
            return;
        }
        Set setP0 = CollectionsKt.P0(linkedHashSet);
        linkedHashSet.retainAll(set);
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + agnVar + "\nConstraints:\n  " + setC + "\nExisting constraints:\n  " + setP0).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cgx0 z(String str) {
        return new cgx0(false, str, null, 0 == true ? 1 : 0);
    }

    @Override // a.e1x
    public int G() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    @Override // a.xsy
    public boolean a(iys0 iys0Var, iys0 iys0Var2) {
        boolean z = this.b;
        kp9 kp9Var = (kp9) this.c;
        kp9 kp9Var2 = (kp9) this.d;
        if (iys0Var.equals(iys0Var2)) {
            return true;
        }
        foc focVarN = iys0Var.n();
        foc focVarN2 = iys0Var2.n();
        if ((focVarN instanceof hzs0) && (focVarN2 instanceof hzs0)) {
            return gqw0.i1.H0((hzs0) focVarN, (hzs0) focVarN2, z, new a8(kp9Var, kp9Var2, (byte) 8));
        }
        return false;
    }

    @Override // a.e1x
    public b1x b() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new wz2(imageAcquireLatestImage);
        }
    }

    @Override // a.e1x
    public b1x b0() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new wz2(imageAcquireNextImage);
        }
    }

    @Override // a.e1x
    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    public boolean d(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((zn00) this.d).f44650a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (b5x.I(((fpa0) obj).f9919a, j)) {
                break;
            }
            i++;
        }
        fpa0 fpa0Var = (fpa0) obj;
        if (fpa0Var != null) {
            return fpa0Var.h;
        }
        return false;
    }

    @Override // a.e1x
    public int f() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // a.e1x
    public Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // a.e1x
    public int h() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // a.cm30
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public r04 c(pzu pzuVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        gm30 t04Var;
        int i;
        String str = ((jm30) pzuVar.f27863a).f16746a;
        r04 r04Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    t04Var = new t04(mediaCodecCreateByCodecName, (HandlerThread) ((q04) this.d).get());
                    i = 0;
                } else {
                    t04Var = new dpi0(mediaCodecCreateByCodecName);
                    i = 4;
                }
                r04 r04Var2 = new r04(mediaCodecCreateByCodecName, (HandlerThread) ((q04) this.c).get(), t04Var, (dq00) pzuVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) pzuVar.d;
                    if (surface == null && ((jm30) pzuVar.f27863a).h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    r04Var2.j((MediaFormat) pzuVar.b, surface, (MediaCrypto) pzuVar.e, i);
                    return r04Var2;
                } catch (Exception e2) {
                    e = e2;
                    r04Var = r04Var2;
                    if (r04Var != null) {
                        r04Var.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // a.e1x
    public int j() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // a.e1x
    public void k() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    public void l() {
        this.b = true;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((SslErrorHandler) it.next()).cancel();
        }
        linkedHashSet.clear();
    }

    @Override // a.e1x
    public void o(final d1x d1xVar, final Executor executor) {
        Handler handler;
        synchronized (this.d) {
            this.b = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: a.xz2
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    cgx0 cgx0Var = this.f41734a;
                    Executor executor2 = executor;
                    d1x d1xVar2 = d1xVar;
                    synchronized (cgx0Var.d) {
                        try {
                            if (!cgx0Var.b) {
                                executor2.execute(new fy2(cgx0Var, d1xVar2, (byte) 1));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.c;
            if (i120.f13975a != null) {
                handler = i120.f13975a;
            } else {
                synchronized (i120.class) {
                    try {
                        if (i120.f13975a == null) {
                            i120.f13975a = thb.y(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                handler = i120.f13975a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // a.vuw
    public synchronized zv00 p(String str) {
        xen0 xen0Var;
        xen0Var = (xen0) ((HashMap) this.c).get(str);
        if (xen0Var == null) {
            xen0Var = new xen0(str, (LinkedBlockingQueue) this.d, this.b);
            ((HashMap) this.c).put(str, xen0Var);
        }
        return xen0Var;
    }

    public fef q() {
        hu5 hu5Var = (hu5) this.d;
        int i = hu5Var.b;
        int i2 = hu5Var.c;
        if (i < i2) {
            return fef.b;
        }
        return i > i2 ? fef.f9404a : fef.c;
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean n(Fragment fragment, iiy iiyVar) {
        boolean zBooleanValue = this.b;
        fragment.getClass();
        iiyVar.getClass();
        Boolean bool = (Boolean) this.d;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Bundle bundle = fragment.g;
            Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean((String) this.c, zBooleanValue)) : null;
            this.d = boolValueOf;
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public void s() {
        if (this.b) {
            ((k7q0) this.d).n((o9q0) this.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x020f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x0225  */
    /* JADX WARN: Code duplicated, block: B:91:0x0238 A[EDGE_INSN: B:91:0x0238->B:95:0x025e BREAK  A[LOOP:4: B:80:0x0213->B:125:0x0213]] */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0238, please report this as an issue */
    public LinkedHashMap t(ArrayList arrayList, List list, List list2) {
        agn agnVar;
        agn agnVarM;
        Iterator it;
        agn agnVar2;
        Set set;
        Iterator it2;
        agn agnVarJ;
        vqc vqcVar = (vqc) this.d;
        list.getClass();
        list2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            agn agnVar3 = ((l15) it3.next()).d;
            agnVar3.getClass();
            linkedHashSet.add(agnVar3);
        }
        Set setA = ((dgn) vqcVar.b).a();
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(setA);
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            w(linkedHashSetO0, (agn) it4.next(), vqcVar);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (true) {
            boolean zHasNext = it5.hasNext();
            agnVar = agn.c;
            if (!zHasNext) {
                break;
            }
            fpt0 fpt0Var = (fpt0) list.get(((Number) it5.next()).intValue());
            agn agnVar4 = (agn) fpt0Var.e(h0x.j0, agnVar);
            agnVar4.getClass();
            if (agnVar4.equals(agnVar)) {
                arrayList4.add(fpt0Var);
            } else {
                int i = agnVar4.f832a;
                int i2 = agnVar4.b;
                if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                    arrayList3.add(fpt0Var);
                } else {
                    arrayList2.add(fpt0Var);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            fpt0 fpt0Var2 = (fpt0) it6.next();
            agn agnVar5 = (agn) fpt0Var2.e(h0x.j0, agnVar);
            agnVar5.getClass();
            String str = (String) fpt0Var2.d(xto0.z0);
            str.getClass();
            if (agnVar5.b()) {
                set = setA;
                it = it6;
                if (linkedHashSetO0.contains(agnVar5)) {
                    agnVarM = agnVar5;
                    agnVar2 = agnVar;
                } else {
                    agnVar2 = agnVar;
                    agnVarM = null;
                }
            } else {
                int i3 = agnVar5.f832a;
                int i4 = agnVar5.b;
                agn agnVar6 = agn.d;
                if (i3 != 1 || i4 != 0) {
                    agnVarM = m(agnVar5, linkedHashSet, linkedHashSetO0);
                    it = it6;
                    agnVar2 = agnVar;
                    set = setA;
                    if (agnVarM == null) {
                        agnVarM = m(agnVar5, linkedHashSet2, linkedHashSetO0);
                        if (agnVarM == null) {
                            if (!g(agnVar5, agnVar6, linkedHashSetO0)) {
                                if (i3 != 2 || (i4 != 10 && i4 != 0)) {
                                    it2 = linkedHashSetO0.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            agnVarM = null;
                                            break;
                                        }
                                        agnVarM = (agn) it2.next();
                                        if (agnVarM.b()) {
                                            jf4.n("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!agnVarM.equals(agnVar6) && e(agnVar5, agnVarM)) {
                                            if (l8x.f0("CXCP")) {
                                                break;
                                            }
                                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + agnVar5 + "\n->\n" + agnVarM);
                                            break;
                                        }
                                    }
                                } else {
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        agnVarJ = f7.j((c1a) this.c);
                                        if (agnVarJ != null) {
                                            linkedHashSet3.add(agnVarJ);
                                        }
                                    } else {
                                        agnVarJ = null;
                                    }
                                    linkedHashSet3.add(agn.e);
                                    agn agnVarM2 = m(agnVar5, linkedHashSet3, linkedHashSetO0);
                                    if (agnVarM2 == null) {
                                        it2 = linkedHashSetO0.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                agnVarM = null;
                                                break;
                                            }
                                            agnVarM = (agn) it2.next();
                                            if (agnVarM.b()) {
                                                jf4.n("Candidate dynamic range must be fully specified.");
                                                return null;
                                            }
                                            if (!agnVarM.equals(agnVar6)) {
                                                if (l8x.f0("CXCP")) {
                                                    break;
                                                }
                                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + agnVar5 + "\n->\n" + agnVarM);
                                                break;
                                            }
                                        }
                                    } else {
                                        if (l8x.f0("CXCP")) {
                                            StringBuilder sbT = kng0.t("DynamicRangeResolver: Resolved dynamic range for use case ", str, "from ");
                                            sbT.append(agnVarM2.equals(agnVarJ) ? "recommended" : ParameterNames.REQUIRED);
                                            sbT.append(" 10-bit supported dynamic range.\n");
                                            sbT.append(agnVar5);
                                            sbT.append("\n->\n");
                                            sbT.append(agnVarM2);
                                            Log.d("CXCP", sbT.toString());
                                        }
                                        agnVarM = agnVarM2;
                                    }
                                }
                            } else if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " to no compatible HDR dynamic ranges.\n" + agnVar5 + "\n->\n" + agnVar6);
                            }
                        } else if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from concurrently bound use case.\n" + agnVar5 + "\n->\n" + agnVarM);
                        }
                    } else if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from existing attached surface.\n" + agnVar5 + "\n->\n" + agnVarM);
                    }
                } else if (linkedHashSetO0.contains(agnVar6)) {
                    set = setA;
                    it = it6;
                    agnVar2 = agnVar;
                } else {
                    agnVarM = null;
                    set = setA;
                    it = it6;
                    agnVar2 = agnVar;
                }
                agnVarM = agnVar6;
            }
            if (agnVarM == null) {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) fpt0Var2.d(xto0.z0)) + "\nRequested dynamic range:\n  " + agnVar5 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + linkedHashSetO0);
            }
            w(linkedHashSetO0, agnVarM, vqcVar);
            linkedHashMap.put(fpt0Var2, agnVarM);
            if (!linkedHashSet.contains(agnVarM)) {
                linkedHashSet2.add(agnVarM);
            }
            it6 = it;
            agnVar = agnVar2;
            setA = set;
        }
        return linkedHashMap;
    }

    public String toString() {
        switch (this.f4336a) {
            case 11:
                return "JavaTypeEnhancementState(jsr305=" + ((ydy) this.c) + ')';
            case 12:
            default:
                return super.toString();
            case 13:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + q() + ", info=\n\t" + ((hu5) this.d) + Separators.RPAREN;
        }
    }

    public void u(List list, RecyclerView recyclerView) {
        list.getClass();
        jpg jpgVar = (jpg) this.c;
        if (jpgVar != null) {
            jpgVar.B(list, new a4e(this, recyclerView, (byte) 16));
        }
    }

    public void v(Fragment fragment, iiy iiyVar, boolean z) {
        fragment.getClass();
        iiyVar.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putBoolean((String) this.c, z);
        this.d = Boolean.valueOf(z);
    }

    public long x(a8q0 a8q0Var, long j, boolean z, w4i0 w4i0Var) {
        k7q0 k7q0Var = (k7q0) this.d;
        long jV = k7q0Var.v(a8q0Var, j, z, false, w4i0Var, false, null);
        if (!o9q0.a((o9q0) this.c, jV)) {
            this.b = false;
        }
        k7q0Var.r(o9q0.c(jV) ? dmv.c : dmv.b);
        return jV;
    }

    public String y() {
        return (String) this.c;
    }

    public /* synthetic */ cgx0(boolean z, Object obj, Object obj2, byte b) {
        this.f4336a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public cgx0(boolean z, pmt0 pmt0Var, List list) {
        this.f4336a = (byte) 8;
        list.getClass();
        this.b = z;
        this.c = pmt0Var;
        this.d = list;
    }

    public cgx0(i5v0 i5v0Var, avs0 avs0Var) {
        this.f4336a = (byte) 12;
        this.c = avs0Var;
        this.d = new LinkedHashSet();
    }

    public cgx0(ydy ydyVar, w0 w0Var) {
        this.f4336a = (byte) 11;
        this.c = ydyVar;
        this.d = w0Var;
        this.b = ydyVar.d || w0Var.invoke(v9y.f37057a) == zlf0.IGNORE;
    }

    public cgx0(u710 u710Var, zn00 zn00Var) {
        this.f4336a = (byte) 10;
        this.c = u710Var;
        this.d = zn00Var;
    }

    public cgx0(c1a c1aVar) {
        this.f4336a = (byte) 7;
        c1aVar.getClass();
        this.c = c1aVar;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key);
        this.b = iArr != null ? tx3.w(iArr, 18) : false;
        this.d = mbc.T(c1aVar);
    }

    public /* synthetic */ cgx0(byte b, boolean z) {
        this.f4336a = b;
    }

    public cgx0(ImageReader imageReader) {
        this.f4336a = (byte) 1;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public cgx0(e06 e06Var) {
        this.f4336a = (byte) 4;
        e06Var.getClass();
        this.c = e06Var;
        this.d = new mtc();
    }

    public cgx0(String str) {
        this.f4336a = (byte) 3;
        this.c = str;
        this.b = false;
    }

    public cgx0(String str, boolean z) {
        this.f4336a = (byte) 3;
        this.c = str;
        this.b = z;
    }

    public cgx0(q04 q04Var, q04 q04Var2) {
        this.f4336a = (byte) 2;
        this.c = q04Var;
        this.d = q04Var2;
        this.b = true;
    }

    public cgx0(k7q0 k7q0Var) {
        this.f4336a = (byte) 15;
        this.d = k7q0Var;
        this.b = true;
    }
}
