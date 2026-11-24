package a;

import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CameraCharacteristics;
import android.javax.sip.header.PriorityHeader;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class b0a implements AutoCloseable, vy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iev f1757a;
    public final iev b;
    public final lrm0 c;
    public final dmn0 d;
    public final iw9 e;
    public final z6r f;
    public final y6r g;
    public final x34 h;
    public final zz9 i;
    public final c0a j;
    public final d0a k;
    public final lev l;
    public final vne m;
    public final hke n;
    public final x04 o;

    public b0a(tz9 tz9Var, c1a c1aVar, iev ievVar, iev ievVar2, lrm0 lrm0Var, dmn0 dmn0Var, iw9 iw9Var, z6r z6rVar, y6r y6rVar, x34 x34Var, zz9 zz9Var, c0a c0aVar, d0a d0aVar, lev levVar, vne vneVar, hke hkeVar) {
        String strA;
        int i = tz9Var.h;
        c1aVar.getClass();
        ievVar.getClass();
        ievVar2.getClass();
        lrm0Var.getClass();
        List<irm0> list = lrm0Var.f;
        dmn0Var.getClass();
        iw9Var.getClass();
        z6rVar.getClass();
        y6rVar.getClass();
        x34Var.getClass();
        c0aVar.getClass();
        d0aVar.getClass();
        levVar.getClass();
        vneVar.getClass();
        hkeVar.getClass();
        this.f1757a = ievVar;
        this.b = ievVar2;
        this.c = lrm0Var;
        this.d = dmn0Var;
        this.e = iw9Var;
        this.f = z6rVar;
        this.g = y6rVar;
        this.h = x34Var;
        this.i = zz9Var;
        this.j = c0aVar;
        this.k = d0aVar;
        this.l = levVar;
        this.m = vneVar;
        this.n = hkeVar;
        this.o = o2e.X(false);
        String str = tz9Var.f34794a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        ow9 ow9Var = (ow9) c1aVar;
        Integer num = (Integer) ow9Var.c(key);
        String str2 = "External";
        String str3 = "Unknown";
        int i2 = 1;
        String str4 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) ow9Var.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            str2 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str2 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str2 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str2 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str2 = "Unknown";
        }
        if (i == 1) {
            str3 = "High Speed";
        } else if (i == 0) {
            str3 = PriorityHeader.NORMAL;
        } else if (i == 2) {
            str3 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) ow9Var.c(key3);
        String str5 = (iArr == null || !tx3.w(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str + ")\n");
        StringBuilder sbN = b1j.n("  Facing:    ", str4, " (", str5, ", ");
        sbN.append(str2);
        sbN.append(")\n");
        sb.append(sbN.toString());
        sb.append("  Mode:      " + str3 + '\n');
        sb.append("Outputs:\n");
        Iterator it = lrm0Var.g.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str6 = Separators.RETURN;
            int i3 = 12;
            if (!zHasNext) {
                int i4 = i2;
                if (!list.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (irm0 irm0Var : list) {
                        sb.append(Separators.SP);
                        sb.append(StringsKt.a0(12, "Input-" + irm0Var.f15265a));
                        sb.append(StringsKt.a0(12, grm0.b(irm0Var.b)));
                        sb.append(StringsKt.a0(12, String.valueOf(i4)));
                        sb.append(Separators.RETURN);
                    }
                }
                sb.append("Session Template: " + onf0.a(tz9Var.f) + '\n');
                pzb.y(sb, "Session Parameters", tz9Var.g);
                sb.append("Default Template: " + onf0.a(i4) + '\n');
                pzb.y(sb, "Default Parameters", tz9Var.i);
                pzb.y(sb, "Required Parameters", tz9Var.l);
                Log.i("CXCP", sb.toString());
                ArrayList arrayList = tz9Var.d;
                if (i == i4) {
                    if (this.c.h.isEmpty()) {
                        jf4.o("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.c.h.size();
                    lrm0 lrm0Var2 = this.c;
                    if (size > 2) {
                        hny.v(lrm0Var2.h, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList2 = lrm0Var2.h;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((krm0) it2.next()).a()) {
                                hny.v(this.c.h, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        jf4.o("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList.size() > 1) {
                        jf4.o("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.c.e.isEmpty()) {
                    return;
                }
                this.d.a();
                return;
            }
            int i5 = 0;
            for (Object obj : ((f3a) it.next()).b) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                krm0 krm0Var = (krm0) obj;
                sb.append("  ");
                if (i5 == 0) {
                    f3a f3aVar = krm0Var.j;
                    if (f3aVar == null) {
                        Intrinsics.h("stream");
                        throw null;
                    }
                    strA = mrm0.a(f3aVar.f8851a);
                } else {
                    strA = "";
                }
                sb.append(StringsKt.a0(i3, strA));
                int i7 = krm0Var.f18773a;
                String str7 = krm0Var.d;
                int i8 = i2;
                sb.append(StringsKt.a0(i3, "Output-" + i7));
                String string = krm0Var.b.toString();
                string.getClass();
                sb.append(StringsKt.a0(i3, string));
                sb.append(StringsKt.a0(16, grm0.a(krm0Var.c)));
                if80 if80Var = krm0Var.e;
                if (if80Var != null) {
                    sb.append(" [" + ((Object) if80.a(if80Var.f14674a)) + ']');
                }
                hf80 hf80Var = krm0Var.f;
                String str8 = str6;
                if (hf80Var != null) {
                    sb.append(" [" + ((Object) hf80.a(hf80Var.f12960a)) + ']');
                }
                jf80 jf80Var = krm0Var.g;
                if (jf80Var != null) {
                    long j = jf80Var.f16412a;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                kf80 kf80Var = krm0Var.i;
                if (kf80Var != null) {
                    long j2 = kf80Var.f18185a;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!Intrinsics.d(str7, str)) {
                    sb.append(" [");
                    sb.append(new g0a(str7));
                    sb.append("]");
                }
                sb.append(str8);
                i2 = i8;
                str6 = str8;
                i5 = i6;
                i3 = 12;
                it = it;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        a0a a0aVar;
        if (zjeVar instanceof a0a) {
            a0aVar = (a0a) zjeVar;
            int i = a0aVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0aVar.k = i - Integer.MIN_VALUE;
            } else {
                a0aVar = new a0a(this, zjeVar);
            }
        } else {
            a0aVar = new a0a(this, zjeVar);
        }
        Object objA = a0aVar.i;
        wne wneVar = wne.f39444a;
        int i2 = a0aVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            a0aVar.k = 1;
            objA = this.l.a(a0aVar);
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
        return new e0a((m050) objA, this.f1757a, this.n, this.g, this.j, this.k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yje yjeVar;
        if (this.o.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.f1757a.c.close();
            iw9 iw9Var = this.e;
            synchronized (iw9Var.q) {
                try {
                    yjeVar = null;
                    if (!iw9Var.c()) {
                        iw9Var.s = ty9.l0;
                        Log.d("CXCP", "Closed " + iw9Var);
                        jnu0 jnu0Var = iw9Var.y;
                        r9a r9aVar = iw9Var.z;
                        iw9Var.y = null;
                        iw9Var.z = null;
                        c4m0 c4m0Var = iw9Var.w;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        c4m0 c4m0Var2 = iw9Var.B;
                        if (c4m0Var2 != null) {
                            c4m0Var2.cancel(null);
                        }
                        iw9Var.B = null;
                        c4m0 c4m0Var3 = iw9Var.C;
                        if (c4m0Var3 != null) {
                            c4m0Var3.cancel(null);
                        }
                        iw9Var.C = null;
                        c4m0 c4m0Var4 = iw9Var.D;
                        if (c4m0Var4 != null) {
                            c4m0Var4.cancel(null);
                        }
                        iw9Var.D = null;
                        dw9.y(iw9Var.g);
                        iw9Var.b(r9aVar, jnu0Var);
                        tz9 tz9Var = iw9Var.d;
                        if (tz9Var.n.e || iw9Var.l.a(tz9Var.f34794a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) g0a.b(iw9Var.d.f34794a)) + " during " + iw9Var + "#close");
                            iw9Var.j.a(iw9Var.d.f34794a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.close();
            this.g.close();
            this.d.close();
            this.c.close();
            x34 x34Var = this.h;
            x34Var.getClass();
            synchronized (x34Var.c) {
                y34 y34VarA = x34Var.a();
                x34Var.d.remove(this);
                y34 y34VarA2 = x34Var.a();
                if (y34VarA2 != null && !y34VarA2.equals(y34VarA)) {
                    vqc vqcVar = x34Var.b;
                    sje sjeVar = x34Var.f40198a;
                    cm3 cm3Var = new cm3(x34Var, y34VarA2, yjeVar, (byte) 6);
                    vqcVar.getClass();
                    sjeVar.getClass();
                    qjj.W(sjeVar, null, yne.d, new o3s((Object) vqcVar, (Object) cm3Var, yjeVar, (byte) 21), 1);
                }
            }
            d5c.G(this.m, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    public final void d(int i, Surface surface) throws Exception {
        String str;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Trace.beginSection(((Object) mrm0.a(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        dmn0 dmn0Var = this.d;
        if (dmn0Var.d.keySet().contains(new mrm0(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) mrm0.a(i));
            c99.r(sb, ", it is permanently assigned to ", dmn0Var.d.get(new mrm0(i)));
            return;
        }
        synchronized (dmn0Var.e) {
            if (!dmn0Var.i) {
                if (surface != null) {
                    str = "Configured " + ((Object) mrm0.a(i)) + " with " + surface;
                } else {
                    str = "Removed surface for " + ((Object) mrm0.a(i));
                }
                Log.i("CXCP", str);
                LinkedHashMap linkedHashMap = dmn0Var.f;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new mrm0(i));
                    if (!dmn0Var.h || surface2 == null) {
                        autoCloseable = null;
                    } else {
                        autoCloseable = (AutoCloseable) dmn0Var.g.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new mrm0(i));
                    dmn0Var.f.put(new mrm0(i), surface);
                    if (!dmn0Var.h || Intrinsics.d(surface3, surface)) {
                        autoCloseable = null;
                    } else {
                        if (dmn0Var.g.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        autoCloseable = (AutoCloseable) zys0.c(dmn0Var.g).remove(surface3);
                        dmn0Var.g.put(surface, dmn0Var.c.a(surface));
                    }
                }
                dmn0Var.a();
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            e9d0.o();
                            return;
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
            } else if (surface != null) {
                Log.w("CXCP", "Refusing to configure " + ((Object) mrm0.a(i)) + " with " + surface + " after close!");
            }
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.i.f45241a;
    }
}
