package a;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g9a implements f8a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7a f10903a;
    public final vjq b;
    public final dgr0 c;
    public final ufu0 d;
    public final tpt0 e;
    public final p7d f;
    public final dqt0 g;
    public final o5d0 h;
    public final kpt0 i;
    public final n0o0 j;
    public final n0o0 k;
    public int l;
    public pz2 m;
    public final n8a n;

    public g9a(v7a v7aVar, vjq vjqVar, dgr0 dgr0Var, ufu0 ufu0Var, tpt0 tpt0Var, p7d p7dVar, dqt0 dqt0Var, l1a l1aVar, o5d0 o5d0Var, kpt0 kpt0Var) {
        v7aVar.getClass();
        vjqVar.getClass();
        dgr0Var.getClass();
        ufu0Var.getClass();
        tpt0Var.getClass();
        p7dVar.getClass();
        l1aVar.getClass();
        o5d0Var.getClass();
        kpt0Var.getClass();
        this.f10903a = v7aVar;
        this.b = vjqVar;
        this.c = dgr0Var;
        this.d = ufu0Var;
        this.e = tpt0Var;
        this.f = p7dVar;
        this.g = dqt0Var;
        this.h = o5d0Var;
        this.i = kpt0Var;
        byte b = 0;
        this.j = maz.b(new g8a(l1aVar, b));
        this.k = maz.b(new h8a(this, b));
        this.l = 1;
        this.n = new n8a();
    }

    @Override // a.f8a
    public final r8a a(int i, int i2) {
        return new r8a(this, i, i2);
    }

    @Override // a.f8a
    public final Object b(List list, int i, drd drdVar, int i2, int i3, int i4, zje zjeVar) {
        return h(q3d.j(j8a.f16073a, j8a.b, j8a.c), i2, i4, i3, new i8a(list, i, drdVar), zjeVar);
    }

    @Override // a.f8a
    public final void c(int i) {
        this.l = i;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:64:0x0128, B:66:0x012e), top: B:93:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [a.yje, a.yne, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r2v29 */
    public final Object d(i8a i8aVar, long j, int i, List list, zje zjeVar) {
        k8a k8aVar;
        i8a i8aVar2;
        int i2;
        g9a g9aVar;
        i8a i8aVar3;
        long j2;
        int i3;
        g9a g9aVar2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        AutoCloseable autoCloseable3;
        i8a i8aVar4;
        List list2;
        int i4;
        g9a g9aVar3;
        List list3;
        ?? r2;
        List listC;
        List list4 = list;
        if (zjeVar instanceof k8a) {
            k8aVar = (k8a) zjeVar;
            int i5 = k8aVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k8aVar.q = i5 - Integer.MIN_VALUE;
            } else {
                k8aVar = new k8a(this, zjeVar);
            }
        } else {
            k8aVar = new k8a(this, zjeVar);
        }
        Object objC = k8aVar.o;
        wne wneVar = wne.f39444a;
        int i6 = k8aVar.q;
        try {
            if (i6 == 0) {
                z1x.P(objC);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture");
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list4);
                }
                if (list4.contains(j8a.f16073a)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                    }
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for locking 3A");
                    }
                    b0a b0aVarA = this.i.a();
                    k8aVar.k = this;
                    k8aVar.l = list4;
                    i8aVar3 = i8aVar;
                    k8aVar.m = i8aVar3;
                    j2 = j;
                    k8aVar.i = j2;
                    i3 = i;
                    k8aVar.j = i3;
                    k8aVar.q = 1;
                    objC = b0aVarA.c(k8aVar);
                    if (objC != wneVar) {
                        g9aVar2 = this;
                    }
                    return wneVar;
                }
                i8aVar2 = i8aVar;
                i2 = i;
                g9aVar = this;
                if (list4.contains(j8a.b)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (i8aVar2 != null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    ArrayList arrayListN = g9aVar.n(i8aVar2);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                    listC = arrayListN;
                    r2 = 0;
                } else {
                    r2 = 0;
                    listC = kotlin.collections.a.c(ozb.j(null));
                }
                if (list4.contains(j8a.c)) {
                    qjj.W(g9aVar.e.f, r2, r2, new xn2(listC, (yje) r2, this, i2), 3);
                }
                return listC;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = k8aVar.j;
                    autoCloseable2 = k8aVar.n;
                    i8aVar2 = k8aVar.m;
                    list3 = k8aVar.l;
                    g9aVar = k8aVar.k;
                    try {
                        z1x.P(objC);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                        }
                        ay3.L(autoCloseable2, null);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i2 = i4;
                        list4 = list3;
                        if (list4.contains(j8a.b)) {
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (i8aVar2 != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            ArrayList arrayListN2 = g9aVar.n(i8aVar2);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                            listC = arrayListN2;
                            r2 = 0;
                        } else {
                            r2 = 0;
                            listC = kotlin.collections.a.c(ozb.j(null));
                        }
                        if (list4.contains(j8a.c)) {
                            qjj.W(g9aVar.e.f, r2, r2, new xn2(listC, (yje) r2, this, i2), 3);
                        }
                        return listC;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            ay3.L(autoCloseable2, th);
                            throw th3;
                        }
                    }
                }
                i4 = k8aVar.j;
                autoCloseable3 = k8aVar.n;
                i8aVar4 = k8aVar.m;
                list2 = k8aVar.l;
                g9aVar3 = k8aVar.k;
                try {
                    z1x.P(objC);
                    k8aVar.k = g9aVar3;
                    k8aVar.l = list2;
                    k8aVar.m = i8aVar4;
                    k8aVar.n = autoCloseable3;
                    k8aVar.j = i4;
                    k8aVar.q = 3;
                    if (((jzj) objC).join(k8aVar) != wneVar) {
                        autoCloseable2 = autoCloseable3;
                        i8aVar2 = i8aVar4;
                        list3 = list2;
                        g9aVar = g9aVar3;
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                        }
                        ay3.L(autoCloseable2, null);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i2 = i4;
                        list4 = list3;
                        if (list4.contains(j8a.b)) {
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (i8aVar2 != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            ArrayList arrayListN3 = g9aVar.n(i8aVar2);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                            listC = arrayListN3;
                            r2 = 0;
                        } else {
                            r2 = 0;
                            listC = kotlin.collections.a.c(ozb.j(null));
                        }
                        if (list4.contains(j8a.c)) {
                            qjj.W(g9aVar.e.f, r2, r2, new xn2(listC, (yje) r2, this, i2), 3);
                        }
                        return listC;
                    }
                    return wneVar;
                } catch (Throwable th4) {
                    th = th4;
                    autoCloseable2 = autoCloseable3;
                    throw th;
                }
            }
            int i7 = k8aVar.j;
            j2 = k8aVar.i;
            i8aVar3 = k8aVar.m;
            List list5 = k8aVar.l;
            g9aVar2 = k8aVar.k;
            z1x.P(objC);
            i3 = i7;
            list4 = list5;
            e0a e0aVar = (e0a) autoCloseable;
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture");
            }
            boolean z = i3 == 0;
            boolean z2 = i3 == 0;
            k8aVar.k = g9aVar2;
            k8aVar.l = list4;
            k8aVar.m = i8aVar3;
            k8aVar.n = autoCloseable;
            k8aVar.j = i3;
            k8aVar.q = 2;
            odd oddVarD = e0a.d(e0aVar, z, z2, j2);
            if (oddVarD != wneVar) {
                i8a i8aVar5 = i8aVar3;
                autoCloseable3 = autoCloseable;
                objC = oddVarD;
                i8aVar4 = i8aVar5;
                list2 = list4;
                i4 = i3;
                g9aVar3 = g9aVar2;
                k8aVar.k = g9aVar3;
                k8aVar.l = list2;
                k8aVar.m = i8aVar4;
                k8aVar.n = autoCloseable3;
                k8aVar.j = i4;
                k8aVar.q = 3;
                if (((jzj) objC).join(k8aVar) != wneVar) {
                    autoCloseable2 = autoCloseable3;
                    i8aVar2 = i8aVar4;
                    list3 = list2;
                    g9aVar = g9aVar3;
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                    }
                    ay3.L(autoCloseable2, null);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    i2 = i4;
                    list4 = list3;
                    if (list4.contains(j8a.b)) {
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (i8aVar2 != null) {
                            jf4.n("Required value was null.");
                            return null;
                        }
                        ArrayList arrayListN4 = g9aVar.n(i8aVar2);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                        listC = arrayListN4;
                        r2 = 0;
                    } else {
                        r2 = 0;
                        listC = kotlin.collections.a.c(ozb.j(null));
                    }
                    if (list4.contains(j8a.c)) {
                        qjj.W(g9aVar.e.f, r2, r2, new xn2(listC, (yje) r2, this, i2), 3);
                    }
                    return listC;
                }
            }
            return wneVar;
        } catch (Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
            throw th;
        }
        autoCloseable = (AutoCloseable) objC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(i8a i8aVar, int i, int i2, List list, zje zjeVar) {
        l8a l8aVar;
        if (zjeVar instanceof l8a) {
            l8aVar = (l8a) zjeVar;
            int i3 = l8aVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l8aVar.n = i3 - Integer.MIN_VALUE;
            } else {
                l8aVar = new l8a(this, zjeVar);
            }
        } else {
            l8aVar = new l8a(this, zjeVar);
        }
        l8a l8aVar2 = l8aVar;
        Object objK = l8aVar2.l;
        Object obj = wne.f39444a;
        int i4 = l8aVar2.n;
        if (i4 == 0) {
            z1x.P(objK);
            if (((Boolean) this.j.getValue()).booleanValue()) {
                l8aVar2.i = i8aVar;
                l8aVar2.j = list;
                l8aVar2.k = i;
                l8aVar2.n = 1;
                objK = k(i2, l8aVar2);
                if (objK != obj) {
                }
            } else {
                l8aVar2.n = 4;
                Object objF = f(i8aVar, i, list, l8aVar2);
                if (objF != obj) {
                    return objF;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objK);
                return objK;
            }
            if (i4 == 3) {
                z1x.P(objK);
                return objK;
            }
            if (i4 == 4) {
                z1x.P(objK);
                return objK;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = l8aVar2.k;
        list = l8aVar2.j;
        i8aVar = l8aVar2.i;
        z1x.P(objK);
        i8a i8aVar2 = i8aVar;
        int i5 = i;
        boolean zBooleanValue = ((Boolean) objK).booleanValue();
        long j = zBooleanValue ? 5000000000L : 1000000000L;
        if (zBooleanValue || i5 == 0) {
            l8aVar2.i = null;
            l8aVar2.j = null;
            l8aVar2.n = 2;
            Object objD = d(i8aVar2, j, i5, list, l8aVar2);
            if (objD != obj) {
                return objD;
            }
        } else {
            l8aVar2.i = null;
            l8aVar2.j = null;
            l8aVar2.n = 3;
            Object objF2 = f(i8aVar2, i5, list, l8aVar2);
            if (objF2 != obj) {
                return objF2;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(i8a i8aVar, int i, List list, zje zjeVar) {
        m8a m8aVar;
        int i2;
        g9a g9aVar;
        List listC;
        if (zjeVar instanceof m8a) {
            m8aVar = (m8a) zjeVar;
            int i3 = m8aVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8aVar.o = i3 - Integer.MIN_VALUE;
            } else {
                m8aVar = new m8a(this, zjeVar);
            }
        } else {
            m8aVar = new m8a(this, zjeVar);
        }
        Object obj = m8aVar.m;
        wne wneVar = wne.f39444a;
        int i4 = m8aVar.o;
        if (i4 == 0) {
            z1x.P(obj);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture");
            }
            i2 = i == 0 ? 1 : 0;
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(j8a.f16073a)) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                if (i2 != 0) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A");
                    }
                    m8aVar.j = this;
                    m8aVar.k = list;
                    m8aVar.l = i8aVar;
                    m8aVar.i = i2;
                    m8aVar.o = 1;
                    if (l(1000000000L, m8aVar, false) == wneVar) {
                        return wneVar;
                    }
                    g9aVar = this;
                } else {
                    g9aVar = this;
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
            } else {
                g9aVar = this;
            }
            if (list.contains(j8a.b)) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (i8aVar != null) {
                    jf4.n("Required value was null.");
                    return null;
                }
                listC = g9aVar.n(i8aVar);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                listC = kotlin.collections.a.c(ozb.j(null));
            }
            if (list.contains(j8a.c)) {
                qjj.W(g9aVar.e.f, null, null, new xj1(listC, (yje) null, i2 != 0, this), 3);
            }
            return listC;
        }
        if (i4 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = m8aVar.i;
        i8a i8aVar2 = m8aVar.l;
        list = m8aVar.k;
        g9aVar = m8aVar.j;
        z1x.P(obj);
        i2 = i5;
        i8aVar = i8aVar2;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A done");
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list.contains(j8a.b)) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (i8aVar != null) {
                jf4.n("Required value was null.");
                return null;
            }
            listC = g9aVar.n(i8aVar);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listC = kotlin.collections.a.c(ozb.j(null));
        }
        if (list.contains(j8a.c)) {
            qjj.W(g9aVar.e.f, null, null, new xj1(listC, (yje) null, i2 != 0, this), 3);
        }
        return listC;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x006a, please report this as an issue */
    public final Object g(zje zjeVar) {
        s8a s8aVar;
        g9a g9aVar;
        if (zjeVar instanceof s8a) {
            s8aVar = (s8a) zjeVar;
            int i = s8aVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8aVar.l = i - Integer.MIN_VALUE;
            } else {
                s8aVar = new s8a(this, zjeVar);
            }
        } else {
            s8aVar = new s8a(this, zjeVar);
        }
        Object objR = s8aVar.j;
        wne wneVar = wne.f39444a;
        int i2 = s8aVar.l;
        if (i2 == 0) {
            z1x.P(objR);
            if (this.m == null) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "getFrameMetadata: waiting for result");
                }
                s8aVar.i = this;
                s8aVar.l = 1;
                objR = r(1000000000L, new d69((byte) 10), s8aVar);
                if (objR == wneVar) {
                    return wneVar;
                }
                g9aVar = this;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
            }
            return this.m;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g9aVar = s8aVar.i;
        z1x.P(objR);
        b7r b7rVar = (b7r) objR;
        g9aVar.m = b7rVar != null ? b7rVar.getMetadata() : null;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
        }
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(List list, int i, int i2, int i3, i8a i8aVar, zje zjeVar) {
        t8a t8aVar;
        Object objC;
        if (zjeVar instanceof t8a) {
            t8aVar = (t8a) zjeVar;
            int i4 = t8aVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t8aVar.o = i4 - Integer.MIN_VALUE;
            } else {
                t8aVar = new t8a(this, zjeVar);
            }
        } else {
            t8aVar = new t8a(this, zjeVar);
        }
        Object obj = t8aVar.m;
        Object obj2 = wne.f39444a;
        int i5 = t8aVar.o;
        yje yjeVar = null;
        if (i5 == 0) {
            z1x.P(obj);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#invokeCaptureTasks: tasks = " + list + ", captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3);
            }
            this.m = null;
            if (list.contains(j8a.b) && i8aVar == null) {
                jf4.n("Must not be null for PipelineType.MAIN_CAPTURE");
                return null;
            }
            if (i2 == 3) {
                t8aVar.o = 1;
                Object objM = m(i8aVar, i, list, t8aVar);
                if (objM != obj2) {
                    return objM;
                }
            } else {
                t8aVar.i = list;
                t8aVar.j = i8aVar;
                t8aVar.k = i;
                t8aVar.l = i2;
                t8aVar.o = 2;
                if (this.l == 3 || i3 == 1) {
                    objC = Boolean.TRUE;
                } else {
                    objC = this.g.c(new pn(this, yjeVar, (byte) 14), t8aVar);
                }
                obj = objC;
                if (obj != obj2) {
                }
            }
            return obj2;
        }
        if (i5 == 1) {
            z1x.P(obj);
            return obj;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                z1x.P(obj);
                return obj;
            }
            if (i5 == 4) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = t8aVar.l;
        i = t8aVar.k;
        i8aVar = t8aVar.j;
        list = t8aVar.i;
        z1x.P(obj);
        List list2 = list;
        i8a i8aVar2 = i8aVar;
        if (((Boolean) obj).booleanValue()) {
            t8aVar.i = null;
            t8aVar.j = null;
            t8aVar.o = 3;
            Object objP = p(i8aVar2, i, i2, list2, t8aVar);
            if (objP != obj2) {
                return objP;
            }
        } else {
            t8a t8aVar2 = t8aVar;
            t8aVar2.i = null;
            t8aVar2.j = null;
            t8aVar2.o = 4;
            Object objE = e(i8aVar2, i, i2, list2, t8aVar2);
            if (objE != obj2) {
                return objE;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:33:0x0078, B:35:0x0081, B:41:0x0090), top: B:56:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:45:0x009c, B:47:0x00a2), top: B:54:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(int i, zje zjeVar) {
        u8a u8aVar;
        int i2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        e0a e0aVar;
        if (zjeVar instanceof u8a) {
            u8aVar = (u8a) zjeVar;
            int i3 = u8aVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u8aVar.m = i3 - Integer.MIN_VALUE;
            } else {
                u8aVar = new u8a(this, zjeVar);
            }
        } else {
            u8aVar = new u8a(this, zjeVar);
        }
        Object objC = u8aVar.k;
        wne wneVar = wne.f39444a;
        int i4 = u8aVar.m;
        boolean z = true;
        if (i4 == 0) {
            z1x.P(objC);
            u8aVar.i = i;
            u8aVar.m = 1;
            if (this.b.f(u8aVar) != wneVar) {
            }
            return wneVar;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                autoCloseable2 = u8aVar.j;
                try {
                    z1x.P(objC);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    ay3.L(autoCloseable2, null);
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ay3.L(autoCloseable2, th);
                        throw th3;
                    }
                }
            }
            i2 = u8aVar.i;
            z1x.P(objC);
            autoCloseable = (AutoCloseable) objC;
            try {
                e0aVar = (e0a) autoCloseable;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
                }
                if (i2 == 0) {
                    z = false;
                }
                u8aVar.j = autoCloseable;
                u8aVar.m = 3;
                if (e0aVar.q(z) != wneVar) {
                    autoCloseable2 = autoCloseable;
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    ay3.L(autoCloseable2, null);
                    return Unit.f46060a;
                }
                return wneVar;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                throw th;
            }
        }
        i = u8aVar.i;
        z1x.P(objC);
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "screenFlashPostCapture: Acquiring session for unlocking 3A");
        }
        b0a b0aVarA = this.i.a();
        u8aVar.i = i;
        u8aVar.m = 2;
        objC = b0aVarA.c(u8aVar);
        if (objC != wneVar) {
            i2 = i;
            autoCloseable = (AutoCloseable) objC;
            e0aVar = (e0a) autoCloseable;
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
            }
            if (i2 == 0) {
                z = false;
            }
            u8aVar.j = autoCloseable;
            u8aVar.m = 3;
            if (e0aVar.q(z) != wneVar) {
                autoCloseable2 = autoCloseable;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                }
                ay3.L(autoCloseable2, null);
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:34:0x0078, B:36:0x0081, B:42:0x0091), top: B:58:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r13 == r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.g9a] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g9a.j(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i, zje zjeVar) {
        w8a w8aVar;
        if (zjeVar instanceof w8a) {
            w8aVar = (w8a) zjeVar;
            int i2 = w8aVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w8aVar.k = i2 - Integer.MIN_VALUE;
            } else {
                w8aVar = new w8a(this, zjeVar);
            }
        } else {
            w8aVar = new w8a(this, zjeVar);
        }
        Object objG = w8aVar.i;
        Object obj = wne.f39444a;
        int i3 = w8aVar.k;
        boolean z = false;
        if (i3 == 0) {
            z1x.P(objG);
            if (i == 0) {
                w8aVar.k = 1;
                objG = g(w8aVar);
                if (objG == obj) {
                    return obj;
                }
            } else if (i == 1) {
                z = true;
            } else if (i != 2 && i != 3) {
                c99.h(i);
                return null;
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objG);
        pz2 pz2Var = (pz2) objG;
        if (pz2Var != null) {
            CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
            key.getClass();
            Integer num = (Integer) pz2Var.f27824a.get(key);
            if (num != null && num.intValue() == 4) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final Object l(long j, zje zjeVar, boolean z) {
        x8a x8aVar;
        long j2;
        boolean z2;
        long j3;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        wne wneVar;
        ?? r2;
        x8a x8aVar2;
        AutoCloseable autoCloseable3;
        Throwable th;
        Object objAwait;
        if (zjeVar instanceof x8a) {
            x8aVar = (x8a) zjeVar;
            int i = x8aVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8aVar.n = i - Integer.MIN_VALUE;
            } else {
                x8aVar = new x8a(this, zjeVar);
            }
        } else {
            x8aVar = new x8a(this, zjeVar);
        }
        Object objC = x8aVar.l;
        wne wneVar2 = wne.f39444a;
        int i2 = x8aVar.n;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                b0a b0aVarA = this.i.a();
                j2 = j;
                x8aVar.i = j2;
                z2 = z;
                x8aVar.j = z2;
                x8aVar.n = 1;
                objC = b0aVarA.c(x8aVar);
                if (objC == wneVar2) {
                    return wneVar2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            z1x.P(objC);
                            return objC;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autoCloseable2 = x8aVar.k;
                    try {
                        z1x.P(objC);
                        wneVar = wneVar2;
                        autoCloseable3 = autoCloseable2;
                        x8aVar2 = x8aVar;
                        r2 = 0;
                        try {
                            jzj jzjVar = (jzj) objC;
                            ay3.L(autoCloseable3, r2);
                            x8aVar2.k = r2;
                            x8aVar2.n = 3;
                            objAwait = jzjVar.await(x8aVar2);
                            if (objAwait == wneVar) {
                                return wneVar;
                            }
                            return objAwait;
                        } catch (Throwable th2) {
                            th = th2;
                            autoCloseable2 = autoCloseable3;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                ay3.L(autoCloseable2, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                }
                z2 = x8aVar.j;
                j2 = x8aVar.i;
                z1x.P(objC);
            }
            vt00 vt00Var = new vt00(2);
            x9 x9Var = new x9((Object) this, z2, (byte) 6);
            x8aVar.k = autoCloseable;
            x8aVar.n = 2;
            wneVar = wneVar2;
            x8a x8aVar3 = x8aVar;
            r2 = 0;
            Object objC2 = e0a.c((e0a) autoCloseable, null, null, null, null, vt00Var, null, null, x9Var, j3, 1000000000L, x8aVar3, 6719);
            x8aVar2 = x8aVar3;
            if (objC2 == wneVar) {
                return wneVar;
            }
            autoCloseable3 = autoCloseable;
            objC = objC2;
            jzj jzjVar2 = (jzj) objC;
            ay3.L(autoCloseable3, r2);
            x8aVar2.k = r2;
            x8aVar2.n = 3;
            objAwait = jzjVar2.await(x8aVar2);
            if (objAwait == wneVar) {
                return wneVar;
            }
            return objAwait;
        } catch (Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
            th = th;
            throw th;
        }
        j3 = j2;
        autoCloseable = (AutoCloseable) objC;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(i8a i8aVar, int i, List list, zje zjeVar) {
        y8a y8aVar;
        g9a g9aVar;
        List listC;
        if (zjeVar instanceof y8a) {
            y8aVar = (y8a) zjeVar;
            int i2 = y8aVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y8aVar.o = i2 - Integer.MIN_VALUE;
            } else {
                y8aVar = new y8a(this, zjeVar);
            }
        } else {
            y8aVar = new y8a(this, zjeVar);
        }
        Object obj = y8aVar.m;
        wne wneVar = wne.f39444a;
        int i3 = y8aVar.o;
        if (i3 == 0) {
            z1x.P(obj);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#screenFlashCapture");
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(j8a.f16073a)) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                y8aVar.j = this;
                y8aVar.k = list;
                y8aVar.l = i8aVar;
                y8aVar.i = i;
                y8aVar.o = 1;
                if (j(i, y8aVar) == wneVar) {
                    return wneVar;
                }
                g9aVar = this;
            } else {
                g9aVar = this;
            }
            if (list.contains(j8a.b)) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (i8aVar != null) {
                    jf4.n("Required value was null.");
                    return null;
                }
                listC = g9aVar.n(i8aVar);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                listC = kotlin.collections.a.c(ozb.j(null));
            }
            if (list.contains(j8a.c)) {
                qjj.W(g9aVar.e.f, null, null, new gc1(listC, (yje) null, this, i), 3);
            }
            return listC;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = y8aVar.i;
        i8aVar = y8aVar.l;
        list = y8aVar.k;
        g9aVar = y8aVar.j;
        z1x.P(obj);
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list.contains(j8a.b)) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (i8aVar != null) {
                jf4.n("Required value was null.");
                return null;
            }
            listC = g9aVar.n(i8aVar);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listC = kotlin.collections.a.c(ozb.j(null));
        }
        if (list.contains(j8a.c)) {
            qjj.W(g9aVar.e.f, null, null, new gc1(listC, (yje) null, this, i), 3);
        }
        return listC;
    }

    public final ArrayList n(i8a i8aVar) {
        List list = i8aVar.f14328a;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "CapturePipeline#submitRequestInternal; Submitting " + list + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            cmf0 cmf0VarA = null;
            if (!it.hasNext()) {
                break;
            }
            t7a t7aVar = (t7a) it.next();
            odd oddVar = new odd();
            arrayList.add(oddVar);
            try {
                cmf0VarA = this.f10903a.a(t7aVar, i8aVar.b, i8aVar.c, kotlin.collections.a.c(new z8a(oddVar)));
            } catch (IllegalStateException e) {
                if (l8x.h0()) {
                    Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e);
                }
                oddVar.b0(new ozw(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (cmf0VarA != null) {
                arrayList2.add(cmf0VarA);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        qjj.W(this.e.f, null, null, new xb2((yje) null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0225  */
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x0253  */
    /* JADX WARN: Code duplicated, block: B:109:0x025b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0264  */
    /* JADX WARN: Code duplicated, block: B:115:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0295  */
    /* JADX WARN: Code duplicated, block: B:119:0x029b  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:142:0x0303  */
    /* JADX WARN: Code duplicated, block: B:143:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x0308  */
    /* JADX WARN: Code duplicated, block: B:146:0x030a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x021f  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x01f9, please report this as an issue */
    public final Object o(i8a i8aVar, int i, long j, List list, boolean z, zje zjeVar) {
        c9a c9aVar;
        int i2;
        int i3;
        i8a i8aVar2;
        int i4;
        List list2;
        g9a g9aVar;
        boolean z2;
        i8a i8aVar3;
        long j2;
        boolean z3;
        List list3;
        int i5;
        i8a i8aVar4;
        int i6;
        int i7;
        w0 w0Var;
        int i8;
        g9a g9aVar2;
        Object objC;
        i8a i8aVar5;
        long j3;
        g9a g9aVar3;
        List list4;
        int i9;
        int i10;
        boolean z4;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        boolean z5;
        boolean z6;
        int i11;
        odd oddVarD;
        AutoCloseable autoCloseable3;
        g9a g9aVar4;
        int i12;
        g9a g9aVar5;
        i8a i8aVar6;
        List list5;
        k0g0 k0g0Var;
        List listC;
        List list6;
        boolean z7;
        boolean z8;
        g9a g9aVar6 = this;
        int i13 = i;
        if (zjeVar instanceof c9a) {
            c9aVar = (c9a) zjeVar;
            int i14 = c9aVar.t;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c9aVar.t = i14 - Integer.MIN_VALUE;
            } else {
                c9aVar = new c9a(g9aVar6, zjeVar);
            }
        } else {
            c9aVar = new c9a(g9aVar6, zjeVar);
        }
        Object objAwait = c9aVar.r;
        wne wneVar = wne.f39444a;
        switch (c9aVar.t) {
            case 0:
                z1x.P(objAwait);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture");
                }
                dgr0 dgr0Var = g9aVar6.c;
                Integer num = (Integer) dgr0Var.e.d();
                i2 = (num != null && num.intValue() == 0) ? 1 : 0;
                i3 = (i2 != 0 || i13 == 0) ? 1 : 0;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
                }
                if (list.contains(j8a.f16073a)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                    }
                    if (i2 != 0) {
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch");
                        }
                        odd oddVarA = dgr0Var.a(2, true, (6 & 4) == 0);
                        c9aVar.n = g9aVar6;
                        c9aVar.o = list;
                        i8aVar3 = i8aVar;
                        c9aVar.p = i8aVar3;
                        c9aVar.i = i13;
                        j2 = j;
                        c9aVar.l = j2;
                        z3 = z;
                        c9aVar.m = z3;
                        c9aVar.j = i2;
                        c9aVar.k = i3;
                        c9aVar.t = 1;
                        if (oddVarA.join(c9aVar) != wneVar) {
                            int i15 = i3;
                            list3 = list;
                            i5 = i15;
                            g9aVar = g9aVar6;
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                            }
                            if (!z3) {
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                }
                                b0a b0aVarA = g9aVar6.i.a();
                                c9aVar.n = g9aVar;
                                c9aVar.o = list3;
                                c9aVar.p = i8aVar3;
                                c9aVar.i = i13;
                                c9aVar.l = j2;
                                c9aVar.m = z3;
                                c9aVar.j = i2;
                                c9aVar.k = i5;
                                c9aVar.t = 2;
                                objC = b0aVarA.c(c9aVar);
                                if (objC != wneVar) {
                                    i8aVar5 = i8aVar3;
                                    j3 = j2;
                                    g9aVar3 = g9aVar;
                                    objAwait = objC;
                                    list4 = list3;
                                    i9 = i13;
                                    i10 = i5;
                                    i6 = i2;
                                    z4 = z3;
                                    autoCloseable = (AutoCloseable) objAwait;
                                    try {
                                        e0a e0aVar = (e0a) autoCloseable;
                                        if (i9 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i9 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        c9aVar.n = g9aVar3;
                                        c9aVar.o = list4;
                                        c9aVar.p = i8aVar5;
                                        c9aVar.q = autoCloseable;
                                        c9aVar.i = i9;
                                        c9aVar.m = z4;
                                        c9aVar.j = i6;
                                        c9aVar.k = i10;
                                        i11 = i10;
                                        c9aVar.t = 3;
                                        oddVarD = e0a.d(e0aVar, z5, z6, j3);
                                        if (oddVarD != wneVar) {
                                            autoCloseable3 = autoCloseable;
                                            g9aVar4 = g9aVar3;
                                            objAwait = oddVarD;
                                            i12 = i11;
                                            c9aVar.n = g9aVar4;
                                            c9aVar.o = list4;
                                            c9aVar.p = i8aVar5;
                                            c9aVar.q = autoCloseable3;
                                            c9aVar.i = i9;
                                            c9aVar.m = z4;
                                            c9aVar.j = i6;
                                            c9aVar.k = i12;
                                            c9aVar.t = 4;
                                            objAwait = ((jzj) objAwait).await(c9aVar);
                                            if (objAwait != wneVar) {
                                                z2 = z4;
                                                i7 = i9;
                                                autoCloseable2 = autoCloseable3;
                                                g9aVar5 = g9aVar4;
                                                i8aVar6 = i8aVar5;
                                                list5 = list4;
                                                k0g0Var = (k0g0) objAwait;
                                                ay3.L(autoCloseable2, null);
                                                if (l8x.f0("CXCP")) {
                                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                                                }
                                                g9aVar6 = this;
                                                i3 = i12;
                                                g9aVar = g9aVar5;
                                                i8aVar4 = i8aVar6;
                                                list2 = list5;
                                                if (l8x.f0("CXCP")) {
                                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                                }
                                                i8aVar2 = i8aVar4;
                                                i4 = i7;
                                                i2 = i6;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        autoCloseable2 = autoCloseable;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            ay3.L(autoCloseable2, th);
                                            throw th3;
                                        }
                                    }
                                }
                            } else {
                                if (i5 == 0) {
                                    g9aVar6 = this;
                                    list2 = list3;
                                    i8aVar4 = i8aVar3;
                                    z2 = z3;
                                    i3 = i5;
                                    i6 = i2;
                                    i7 = i13;
                                } else if (i13 == 0) {
                                    if (l8x.f0("CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                    }
                                    c9aVar.n = g9aVar;
                                    c9aVar.o = list3;
                                    c9aVar.p = i8aVar3;
                                    c9aVar.i = i13;
                                    c9aVar.m = z3;
                                    c9aVar.j = i2;
                                    c9aVar.k = i5;
                                    c9aVar.t = 5;
                                    g9aVar6 = this;
                                    if (g9aVar6.l(j2, c9aVar, true) != wneVar) {
                                        int i16 = i2;
                                        i7 = i13;
                                        i8 = i5;
                                        i6 = i16;
                                        g9aVar2 = g9aVar;
                                        list2 = list3;
                                        i8aVar4 = i8aVar3;
                                        z2 = z3;
                                        if (l8x.f0("CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                        }
                                        i3 = i8;
                                        g9aVar = g9aVar2;
                                    }
                                } else {
                                    g9aVar6 = this;
                                    if (l8x.f0("CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                    }
                                    w0Var = new w0((Object) g9aVar6, (byte) 12);
                                    c9aVar.n = g9aVar;
                                    c9aVar.o = list3;
                                    c9aVar.p = i8aVar3;
                                    c9aVar.i = i13;
                                    c9aVar.m = z3;
                                    c9aVar.j = i2;
                                    c9aVar.k = i5;
                                    c9aVar.t = 6;
                                    if (g9aVar6.r(j2, w0Var, c9aVar) != wneVar) {
                                        int i17 = i2;
                                        i7 = i13;
                                        i8 = i5;
                                        i6 = i17;
                                        g9aVar2 = g9aVar;
                                        list2 = list3;
                                        i8aVar4 = i8aVar3;
                                        z2 = z3;
                                        if (l8x.f0("CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                        }
                                        i3 = i8;
                                        g9aVar = g9aVar2;
                                    }
                                }
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                }
                                i8aVar2 = i8aVar4;
                                i4 = i7;
                                i2 = i6;
                            }
                        }
                    } else {
                        i8aVar3 = i8aVar;
                        j2 = j;
                        z3 = z;
                        int i18 = i3;
                        list3 = list;
                        i5 = i18;
                        g9aVar = g9aVar6;
                        if (!z3) {
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                            }
                            b0a b0aVarA2 = g9aVar6.i.a();
                            c9aVar.n = g9aVar;
                            c9aVar.o = list3;
                            c9aVar.p = i8aVar3;
                            c9aVar.i = i13;
                            c9aVar.l = j2;
                            c9aVar.m = z3;
                            c9aVar.j = i2;
                            c9aVar.k = i5;
                            c9aVar.t = 2;
                            objC = b0aVarA2.c(c9aVar);
                            if (objC != wneVar) {
                                i8aVar5 = i8aVar3;
                                j3 = j2;
                                g9aVar3 = g9aVar;
                                objAwait = objC;
                                list4 = list3;
                                i9 = i13;
                                i10 = i5;
                                i6 = i2;
                                z4 = z3;
                                autoCloseable = (AutoCloseable) objAwait;
                                e0a e0aVar2 = (e0a) autoCloseable;
                                if (i9 == 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i9 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                c9aVar.n = g9aVar3;
                                c9aVar.o = list4;
                                c9aVar.p = i8aVar5;
                                c9aVar.q = autoCloseable;
                                c9aVar.i = i9;
                                c9aVar.m = z4;
                                c9aVar.j = i6;
                                c9aVar.k = i10;
                                i11 = i10;
                                c9aVar.t = 3;
                                oddVarD = e0a.d(e0aVar2, z5, z6, j3);
                                if (oddVarD != wneVar) {
                                    autoCloseable3 = autoCloseable;
                                    g9aVar4 = g9aVar3;
                                    objAwait = oddVarD;
                                    i12 = i11;
                                    c9aVar.n = g9aVar4;
                                    c9aVar.o = list4;
                                    c9aVar.p = i8aVar5;
                                    c9aVar.q = autoCloseable3;
                                    c9aVar.i = i9;
                                    c9aVar.m = z4;
                                    c9aVar.j = i6;
                                    c9aVar.k = i12;
                                    c9aVar.t = 4;
                                    objAwait = ((jzj) objAwait).await(c9aVar);
                                    if (objAwait != wneVar) {
                                        z2 = z4;
                                        i7 = i9;
                                        autoCloseable2 = autoCloseable3;
                                        g9aVar5 = g9aVar4;
                                        i8aVar6 = i8aVar5;
                                        list5 = list4;
                                        k0g0Var = (k0g0) objAwait;
                                        ay3.L(autoCloseable2, null);
                                        if (l8x.f0("CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                                        }
                                        g9aVar6 = this;
                                        i3 = i12;
                                        g9aVar = g9aVar5;
                                        i8aVar4 = i8aVar6;
                                        list2 = list5;
                                        if (l8x.f0("CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                        }
                                        i8aVar2 = i8aVar4;
                                        i4 = i7;
                                        i2 = i6;
                                    }
                                }
                            }
                        } else {
                            if (i5 == 0) {
                                g9aVar6 = this;
                                list2 = list3;
                                i8aVar4 = i8aVar3;
                                z2 = z3;
                                i3 = i5;
                                i6 = i2;
                                i7 = i13;
                            } else if (i13 == 0) {
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                }
                                c9aVar.n = g9aVar;
                                c9aVar.o = list3;
                                c9aVar.p = i8aVar3;
                                c9aVar.i = i13;
                                c9aVar.m = z3;
                                c9aVar.j = i2;
                                c9aVar.k = i5;
                                c9aVar.t = 5;
                                g9aVar6 = this;
                                if (g9aVar6.l(j2, c9aVar, true) != wneVar) {
                                    int i19 = i2;
                                    i7 = i13;
                                    i8 = i5;
                                    i6 = i19;
                                    g9aVar2 = g9aVar;
                                    list2 = list3;
                                    i8aVar4 = i8aVar3;
                                    z2 = z3;
                                    if (l8x.f0("CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                    }
                                    i3 = i8;
                                    g9aVar = g9aVar2;
                                }
                            } else {
                                g9aVar6 = this;
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                }
                                w0Var = new w0((Object) g9aVar6, (byte) 12);
                                c9aVar.n = g9aVar;
                                c9aVar.o = list3;
                                c9aVar.p = i8aVar3;
                                c9aVar.i = i13;
                                c9aVar.m = z3;
                                c9aVar.j = i2;
                                c9aVar.k = i5;
                                c9aVar.t = 6;
                                if (g9aVar6.r(j2, w0Var, c9aVar) != wneVar) {
                                    int i110 = i2;
                                    i7 = i13;
                                    i8 = i5;
                                    i6 = i110;
                                    g9aVar2 = g9aVar;
                                    list2 = list3;
                                    i8aVar4 = i8aVar3;
                                    z2 = z3;
                                    if (l8x.f0("CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                    }
                                    i3 = i8;
                                    g9aVar = g9aVar2;
                                }
                            }
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            i8aVar2 = i8aVar4;
                            i4 = i7;
                            i2 = i6;
                        }
                    }
                    return wneVar;
                }
                i8aVar2 = i8aVar;
                i4 = i13;
                list2 = list;
                g9aVar = g9aVar6;
                z2 = z;
                if (list2.contains(j8a.b)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (i8aVar2 != null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    listC = g9aVar.n(i8aVar2);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                } else {
                    listC = kotlin.collections.a.c(ozb.j(null));
                }
                list6 = listC;
                if (list2.contains(j8a.c)) {
                    sje sjeVar = g9aVar.e.f;
                    if (i2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i3 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    qjj.W(sjeVar, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                }
                return list6;
            case 1:
                int i20 = c9aVar.k;
                int i21 = c9aVar.j;
                boolean z9 = c9aVar.m;
                j2 = c9aVar.l;
                int i22 = c9aVar.i;
                i8a i8aVar7 = c9aVar.p;
                list3 = c9aVar.o;
                g9a g9aVar7 = c9aVar.n;
                z1x.P(objAwait);
                g9aVar = g9aVar7;
                z3 = z9;
                i2 = i21;
                i5 = i20;
                i13 = i22;
                i8aVar3 = i8aVar7;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                }
                if (!z3) {
                    if (i5 == 0) {
                        g9aVar6 = this;
                        list2 = list3;
                        i8aVar4 = i8aVar3;
                        z2 = z3;
                        i3 = i5;
                        i6 = i2;
                        i7 = i13;
                    } else if (i13 == 0) {
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                        }
                        c9aVar.n = g9aVar;
                        c9aVar.o = list3;
                        c9aVar.p = i8aVar3;
                        c9aVar.i = i13;
                        c9aVar.m = z3;
                        c9aVar.j = i2;
                        c9aVar.k = i5;
                        c9aVar.t = 5;
                        g9aVar6 = this;
                        if (g9aVar6.l(j2, c9aVar, true) != wneVar) {
                            int i111 = i2;
                            i7 = i13;
                            i8 = i5;
                            i6 = i111;
                            g9aVar2 = g9aVar;
                            list2 = list3;
                            i8aVar4 = i8aVar3;
                            z2 = z3;
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                            }
                            i3 = i8;
                            g9aVar = g9aVar2;
                        }
                    } else {
                        g9aVar6 = this;
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                        }
                        w0Var = new w0((Object) g9aVar6, (byte) 12);
                        c9aVar.n = g9aVar;
                        c9aVar.o = list3;
                        c9aVar.p = i8aVar3;
                        c9aVar.i = i13;
                        c9aVar.m = z3;
                        c9aVar.j = i2;
                        c9aVar.k = i5;
                        c9aVar.t = 6;
                        if (g9aVar6.r(j2, w0Var, c9aVar) != wneVar) {
                            int i112 = i2;
                            i7 = i13;
                            i8 = i5;
                            i6 = i112;
                            g9aVar2 = g9aVar;
                            list2 = list3;
                            i8aVar4 = i8aVar3;
                            z2 = z3;
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                            }
                            i3 = i8;
                            g9aVar = g9aVar2;
                        }
                    }
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    i8aVar2 = i8aVar4;
                    i4 = i7;
                    i2 = i6;
                    if (list2.contains(j8a.b)) {
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (i8aVar2 != null) {
                            jf4.n("Required value was null.");
                            return null;
                        }
                        listC = g9aVar.n(i8aVar2);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listC = kotlin.collections.a.c(ozb.j(null));
                    }
                    list6 = listC;
                    if (list2.contains(j8a.c)) {
                        sje sjeVar2 = g9aVar.e.f;
                        if (i2 != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i3 != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        qjj.W(sjeVar2, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                    }
                    return list6;
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                }
                b0a b0aVarA3 = g9aVar6.i.a();
                c9aVar.n = g9aVar;
                c9aVar.o = list3;
                c9aVar.p = i8aVar3;
                c9aVar.i = i13;
                c9aVar.l = j2;
                c9aVar.m = z3;
                c9aVar.j = i2;
                c9aVar.k = i5;
                c9aVar.t = 2;
                objC = b0aVarA3.c(c9aVar);
                if (objC != wneVar) {
                    i8aVar5 = i8aVar3;
                    j3 = j2;
                    g9aVar3 = g9aVar;
                    objAwait = objC;
                    list4 = list3;
                    i9 = i13;
                    i10 = i5;
                    i6 = i2;
                    z4 = z3;
                    autoCloseable = (AutoCloseable) objAwait;
                    e0a e0aVar3 = (e0a) autoCloseable;
                    if (i9 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i9 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c9aVar.n = g9aVar3;
                    c9aVar.o = list4;
                    c9aVar.p = i8aVar5;
                    c9aVar.q = autoCloseable;
                    c9aVar.i = i9;
                    c9aVar.m = z4;
                    c9aVar.j = i6;
                    c9aVar.k = i10;
                    i11 = i10;
                    c9aVar.t = 3;
                    oddVarD = e0a.d(e0aVar3, z5, z6, j3);
                    if (oddVarD != wneVar) {
                        autoCloseable3 = autoCloseable;
                        g9aVar4 = g9aVar3;
                        objAwait = oddVarD;
                        i12 = i11;
                        c9aVar.n = g9aVar4;
                        c9aVar.o = list4;
                        c9aVar.p = i8aVar5;
                        c9aVar.q = autoCloseable3;
                        c9aVar.i = i9;
                        c9aVar.m = z4;
                        c9aVar.j = i6;
                        c9aVar.k = i12;
                        c9aVar.t = 4;
                        objAwait = ((jzj) objAwait).await(c9aVar);
                        if (objAwait != wneVar) {
                            z2 = z4;
                            i7 = i9;
                            autoCloseable2 = autoCloseable3;
                            g9aVar5 = g9aVar4;
                            i8aVar6 = i8aVar5;
                            list5 = list4;
                            k0g0Var = (k0g0) objAwait;
                            ay3.L(autoCloseable2, null);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                            }
                            g9aVar6 = this;
                            i3 = i12;
                            g9aVar = g9aVar5;
                            i8aVar4 = i8aVar6;
                            list2 = list5;
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            i8aVar2 = i8aVar4;
                            i4 = i7;
                            i2 = i6;
                            if (list2.contains(j8a.b)) {
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                }
                                if (i8aVar2 != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                listC = g9aVar.n(i8aVar2);
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                }
                            } else {
                                listC = kotlin.collections.a.c(ozb.j(null));
                            }
                            list6 = listC;
                            if (list2.contains(j8a.c)) {
                                sje sjeVar3 = g9aVar.e.f;
                                if (i2 != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (i3 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                qjj.W(sjeVar3, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                            }
                            return list6;
                        }
                    }
                }
                return wneVar;
            case 2:
                i10 = c9aVar.k;
                i6 = c9aVar.j;
                z4 = c9aVar.m;
                j3 = c9aVar.l;
                i9 = c9aVar.i;
                i8aVar5 = c9aVar.p;
                list4 = c9aVar.o;
                g9aVar3 = c9aVar.n;
                z1x.P(objAwait);
                autoCloseable = (AutoCloseable) objAwait;
                e0a e0aVar4 = (e0a) autoCloseable;
                if (i9 == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i9 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c9aVar.n = g9aVar3;
                c9aVar.o = list4;
                c9aVar.p = i8aVar5;
                c9aVar.q = autoCloseable;
                c9aVar.i = i9;
                c9aVar.m = z4;
                c9aVar.j = i6;
                c9aVar.k = i10;
                i11 = i10;
                c9aVar.t = 3;
                oddVarD = e0a.d(e0aVar4, z5, z6, j3);
                if (oddVarD != wneVar) {
                    autoCloseable3 = autoCloseable;
                    g9aVar4 = g9aVar3;
                    objAwait = oddVarD;
                    i12 = i11;
                    c9aVar.n = g9aVar4;
                    c9aVar.o = list4;
                    c9aVar.p = i8aVar5;
                    c9aVar.q = autoCloseable3;
                    c9aVar.i = i9;
                    c9aVar.m = z4;
                    c9aVar.j = i6;
                    c9aVar.k = i12;
                    c9aVar.t = 4;
                    objAwait = ((jzj) objAwait).await(c9aVar);
                    if (objAwait != wneVar) {
                        z2 = z4;
                        i7 = i9;
                        autoCloseable2 = autoCloseable3;
                        g9aVar5 = g9aVar4;
                        i8aVar6 = i8aVar5;
                        list5 = list4;
                        k0g0Var = (k0g0) objAwait;
                        ay3.L(autoCloseable2, null);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                        }
                        g9aVar6 = this;
                        i3 = i12;
                        g9aVar = g9aVar5;
                        i8aVar4 = i8aVar6;
                        list2 = list5;
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i8aVar2 = i8aVar4;
                        i4 = i7;
                        i2 = i6;
                        if (list2.contains(j8a.b)) {
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (i8aVar2 != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            listC = g9aVar.n(i8aVar2);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                        } else {
                            listC = kotlin.collections.a.c(ozb.j(null));
                        }
                        list6 = listC;
                        if (list2.contains(j8a.c)) {
                            sje sjeVar4 = g9aVar.e.f;
                            if (i2 != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i3 != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            qjj.W(sjeVar4, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                        }
                        return list6;
                    }
                }
                return wneVar;
            case 3:
                i12 = c9aVar.k;
                i6 = c9aVar.j;
                z4 = c9aVar.m;
                i9 = c9aVar.i;
                autoCloseable3 = c9aVar.q;
                i8aVar5 = c9aVar.p;
                list4 = c9aVar.o;
                g9aVar4 = c9aVar.n;
                try {
                    z1x.P(objAwait);
                    c9aVar.n = g9aVar4;
                    c9aVar.o = list4;
                    c9aVar.p = i8aVar5;
                    c9aVar.q = autoCloseable3;
                    c9aVar.i = i9;
                    c9aVar.m = z4;
                    c9aVar.j = i6;
                    c9aVar.k = i12;
                    c9aVar.t = 4;
                    objAwait = ((jzj) objAwait).await(c9aVar);
                    if (objAwait != wneVar) {
                        z2 = z4;
                        i7 = i9;
                        autoCloseable2 = autoCloseable3;
                        g9aVar5 = g9aVar4;
                        i8aVar6 = i8aVar5;
                        list5 = list4;
                        k0g0Var = (k0g0) objAwait;
                        ay3.L(autoCloseable2, null);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                        }
                        g9aVar6 = this;
                        i3 = i12;
                        g9aVar = g9aVar5;
                        i8aVar4 = i8aVar6;
                        list2 = list5;
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i8aVar2 = i8aVar4;
                        i4 = i7;
                        i2 = i6;
                        if (list2.contains(j8a.b)) {
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (i8aVar2 != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            listC = g9aVar.n(i8aVar2);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                        } else {
                            listC = kotlin.collections.a.c(ozb.j(null));
                        }
                        list6 = listC;
                        if (list2.contains(j8a.c)) {
                            sje sjeVar5 = g9aVar.e.f;
                            if (i2 != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i3 != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            qjj.W(sjeVar5, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                        }
                        return list6;
                    }
                    return wneVar;
                } catch (Throwable th4) {
                    th = th4;
                    autoCloseable2 = autoCloseable3;
                    throw th;
                }
            case 4:
                i12 = c9aVar.k;
                i6 = c9aVar.j;
                z2 = c9aVar.m;
                i7 = c9aVar.i;
                autoCloseable2 = c9aVar.q;
                i8aVar6 = c9aVar.p;
                list5 = c9aVar.o;
                g9aVar5 = c9aVar.n;
                try {
                    z1x.P(objAwait);
                    k0g0Var = (k0g0) objAwait;
                    ay3.L(autoCloseable2, null);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + k0g0Var);
                    }
                    g9aVar6 = this;
                    i3 = i12;
                    g9aVar = g9aVar5;
                    i8aVar4 = i8aVar6;
                    list2 = list5;
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    i8aVar2 = i8aVar4;
                    i4 = i7;
                    i2 = i6;
                    if (list2.contains(j8a.b)) {
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (i8aVar2 != null) {
                            jf4.n("Required value was null.");
                            return null;
                        }
                        listC = g9aVar.n(i8aVar2);
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listC = kotlin.collections.a.c(ozb.j(null));
                    }
                    list6 = listC;
                    if (list2.contains(j8a.c)) {
                        sje sjeVar6 = g9aVar.e.f;
                        if (i2 != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i3 != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        qjj.W(sjeVar6, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                    }
                    return list6;
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            case 5:
                i8 = c9aVar.k;
                i6 = c9aVar.j;
                z2 = c9aVar.m;
                i7 = c9aVar.i;
                i8aVar4 = c9aVar.p;
                list2 = c9aVar.o;
                g9aVar2 = c9aVar.n;
                z1x.P(objAwait);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                }
                i3 = i8;
                g9aVar = g9aVar2;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
                i8aVar2 = i8aVar4;
                i4 = i7;
                i2 = i6;
                if (list2.contains(j8a.b)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (i8aVar2 != null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    listC = g9aVar.n(i8aVar2);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                } else {
                    listC = kotlin.collections.a.c(ozb.j(null));
                }
                list6 = listC;
                if (list2.contains(j8a.c)) {
                    sje sjeVar7 = g9aVar.e.f;
                    if (i2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i3 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    qjj.W(sjeVar7, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                }
                return list6;
            case 6:
                i8 = c9aVar.k;
                i6 = c9aVar.j;
                z2 = c9aVar.m;
                i7 = c9aVar.i;
                i8aVar4 = c9aVar.p;
                list2 = c9aVar.o;
                g9aVar2 = c9aVar.n;
                z1x.P(objAwait);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                }
                i3 = i8;
                g9aVar = g9aVar2;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
                i8aVar2 = i8aVar4;
                i4 = i7;
                i2 = i6;
                if (list2.contains(j8a.b)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (i8aVar2 != null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    listC = g9aVar.n(i8aVar2);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                } else {
                    listC = kotlin.collections.a.c(ozb.j(null));
                }
                list6 = listC;
                if (list2.contains(j8a.c)) {
                    sje sjeVar8 = g9aVar.e.f;
                    if (i2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i3 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    qjj.W(sjeVar8, null, null, new b9a(list6, null, z7, g9aVar6, z2, z8, i4), 3);
                }
                return list6;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(i8a i8aVar, int i, int i2, List list, zje zjeVar) {
        d9a d9aVar;
        Object objF;
        boolean z;
        if (zjeVar instanceof d9a) {
            d9aVar = (d9a) zjeVar;
            int i3 = d9aVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d9aVar.n = i3 - Integer.MIN_VALUE;
            } else {
                d9aVar = new d9a(this, zjeVar);
            }
        } else {
            d9aVar = new d9a(this, zjeVar);
        }
        d9a d9aVar2 = d9aVar;
        Object objK = d9aVar2.l;
        Object obj = wne.f39444a;
        int i4 = d9aVar2.n;
        if (i4 == 0) {
            z1x.P(objK);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "CapturePipeline#torchAsFlashCapture");
            }
            if (((Boolean) this.j.getValue()).booleanValue()) {
                d9aVar2.i = i8aVar;
                d9aVar2.j = list;
                d9aVar2.k = i;
                d9aVar2.n = 1;
                objK = k(i2, d9aVar2);
                if (objK != obj) {
                }
            } else {
                d9aVar2.i = null;
                d9aVar2.j = null;
                d9aVar2.n = 3;
                objF = f(i8aVar, i, list, d9aVar2);
                if (objF == obj) {
                    return objF;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objK);
                return objK;
            }
            if (i4 == 3) {
                z1x.P(objK);
                return objK;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = d9aVar2.k;
        list = d9aVar2.j;
        i8aVar = d9aVar2.i;
        z1x.P(objK);
        if (((Boolean) objK).booleanValue()) {
            if (!this.g.d()) {
                int i5 = this.d.f35592a.f43546a;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "isInVideoUsage: videoUsage = " + i5);
                }
                z = i5 <= 0;
            }
            boolean z2 = z;
            d9aVar2.i = null;
            d9aVar2.j = null;
            d9aVar2.n = 2;
            Object objO = o(i8aVar, i, 5000000000L, list, z2, d9aVar2);
            if (objO != obj) {
                return objO;
            }
        } else {
            d9aVar2.i = null;
            d9aVar2.j = null;
            d9aVar2.n = 3;
            objF = f(i8aVar, i, list, d9aVar2);
            if (objF == obj) {
                return objF;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.g9a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
    public final Object q(long j, zje zjeVar) {
        e9a e9aVar;
        Object objAwait;
        if (zjeVar instanceof e9a) {
            e9aVar = (e9a) zjeVar;
            int i = e9aVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9aVar.m = i - Integer.MIN_VALUE;
            } else {
                e9aVar = new e9a(this, zjeVar);
            }
        } else {
            e9aVar = new e9a(this, zjeVar);
        }
        Object objC = e9aVar.k;
        wne wneVar = wne.f39444a;
        int i2 = e9aVar.m;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                b0a b0aVarA = this.i.a();
                e9aVar.i = (int) j;
                e9aVar.m = 1;
                objC = b0aVarA.c(e9aVar);
                if (objC != wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                j = e9aVar.i;
                z1x.P(objC);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        z1x.P(objC);
                        return objC;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AutoCloseable autoCloseable = e9aVar.j;
                z1x.P(objC);
                this = autoCloseable;
            }
            jzj jzjVar = (jzj) objC;
            ay3.L(this, null);
            e9aVar.j = null;
            e9aVar.m = 3;
            objAwait = jzjVar.await(e9aVar);
            if (objAwait != wneVar) {
                return wneVar;
            }
            return objAwait;
            AutoCloseable autoCloseable2 = (AutoCloseable) objC;
            e9aVar.j = autoCloseable2;
            e9aVar.m = 2;
            objC = e0a.n((e0a) autoCloseable2, j, 29);
            this = autoCloseable2;
            if (objC != wneVar) {
                jzj jzjVar2 = (jzj) objC;
                ay3.L(this, null);
                e9aVar.j = null;
                e9aVar.m = 3;
                objAwait = jzjVar2.await(e9aVar);
                if (objAwait != wneVar) {
                    return objAwait;
                }
            }
            return wneVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(this, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(long j, Function1 function1, zje zjeVar) {
        f9a f9aVar;
        u2g0 u2g0Var;
        if (zjeVar instanceof f9a) {
            f9aVar = (f9a) zjeVar;
            int i = f9aVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9aVar.l = i - Integer.MIN_VALUE;
            } else {
                f9aVar = new f9a(this, zjeVar);
            }
        } else {
            f9aVar = new f9a(this, zjeVar);
        }
        Object obj = f9aVar.j;
        wne wneVar = wne.f39444a;
        int i2 = f9aVar.l;
        yje yjeVar = null;
        p7d p7dVar = this.f;
        if (i2 == 0) {
            z1x.P(obj);
            u2g0 u2g0Var2 = new u2g0(j, function1);
            tpt0 tpt0Var = this.e;
            p7dVar.b(u2g0Var2, tpt0Var.e);
            qjj.W(tpt0Var.f, null, null, new d09((Object) u2g0Var2, (Object) this, yjeVar, (byte) 15), 3);
            qv3 qv3Var = new qv3(u2g0Var2, yjeVar, (byte) 28);
            f9aVar.i = u2g0Var2;
            f9aVar.l = 1;
            Object objU = msm0.u(j / 1000000, qv3Var, f9aVar);
            if (objU == wneVar) {
                return wneVar;
            }
            obj = objU;
            u2g0Var = u2g0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u2g0Var = f9aVar.i;
            z1x.P(obj);
        }
        if (((b7r) obj) == null) {
            p7dVar.f(u2g0Var);
        }
        return obj;
    }
}
