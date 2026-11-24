package a;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lyb0 implements e2a {
    public static final lyb0 b = new lyb0(new rrd((byte) 23));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f20855a;

    public lyb0(rrd rrdVar) {
        this.f20855a = rrdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lx9 a(clz clzVar, n2a n2aVar, mpt0 mpt0Var) {
        boolean z;
        n2aVar.getClass();
        rrd rrdVar = this.f20855a;
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            j4a j4aVar = (j4a) rrdVar.e;
            boolean z2 = 0;
            if (j4aVar != null) {
                j4aVar.getClass();
                ru ruVar = j4aVar.g;
                if (ruVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                wy9 wy9Var = (wy9) ruVar.e;
                synchronized (wy9Var.b) {
                    z = wy9Var.f;
                }
                z2 = z;
            }
            if (z2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            rrdVar.A(1);
            okz okzVarA = rrd.a(rrdVar, clzVar, n2aVar, new rrd((ArrayList) mpt0Var.c, (wju0) mpt0Var.b, (ArrayList) mpt0Var.d));
            Trace.endSection();
            return okzVarA;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final List b() {
        rrd rrdVar = this.f20855a;
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            j4a j4aVar = (j4a) rrdVar.e;
            j4aVar.getClass();
            Iterator it = j4aVar.f15874a.c().iterator();
            while (it.hasNext()) {
                j0a j0aVarA = ((s0a) it.next()).a();
                j0aVarA.getClass();
                arrayList.add(j0aVarA);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
