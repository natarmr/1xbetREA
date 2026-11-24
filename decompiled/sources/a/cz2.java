package a;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cz2 implements m9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcq0 f5204a;
    public final tz9 b;
    public final lrm0 c;
    public final ix9 d;
    public final bsm0 e;

    public cz2(qcq0 qcq0Var, tz9 tz9Var, lrm0 lrm0Var, ix9 ix9Var, bsm0 bsm0Var) {
        qcq0Var.getClass();
        ix9Var.getClass();
        bsm0Var.getClass();
        this.f5204a = qcq0Var;
        this.b = tz9Var;
        this.c = lrm0Var;
        this.d = ix9Var;
        this.e = bsm0Var;
    }

    @Override // a.m9a
    public final l9a a(yy9 yy9Var, Map map, r9a r9aVar) throws Exception {
        lw9 lw9VarB;
        yy9Var.getClass();
        map.getClass();
        r9aVar.getClass();
        tz9 tz9Var = this.b;
        if (tz9Var.h != 2) {
            e9d0.w(dwi0.S(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
            return null;
        }
        Object obj = tz9Var.g.get(n1a.f22740a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            jf4.n("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.b.d != null) {
            jf4.n("Reprocessing is not supported for Extensions");
            return null;
        }
        ow9 ow9Var = (ow9) this.d.a(yy9Var.F());
        Set set = (Set) ow9Var.g.getValue();
        bsm0 bsm0Var = this.e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            bsm0Var.getClass();
            Log.w("CXCP", yy9Var + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
        }
        if (this.b.e != null) {
            synchronized (ow9Var.f) {
                lw9VarB = (lw9) ow9Var.f.get(Integer.valueOf(iIntValue));
            }
            if (lw9VarB == null) {
                ix9 ix9Var = ow9Var.c;
                String str = ow9Var.f25959a;
                str.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(twn.m(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) g0a.b(str)) + "#awaitExtensionMetadata");
                    synchronized (ix9Var.g) {
                        lw9 lw9VarB2 = (lw9) ix9Var.g.get(str);
                        if (lw9VarB2 != null) {
                            lw9VarB = lw9VarB2;
                        } else if (ix9Var.e()) {
                            lw9VarB = ix9Var.b(str, iIntValue, true);
                        } else {
                            lw9VarB2 = ix9Var.b(str, iIntValue, false);
                            ix9Var.g.put(str, lw9VarB2);
                            lw9VarB = lw9VarB2;
                        }
                    }
                    Trace.endSection();
                    synchronized (ow9Var.f) {
                        ow9Var.f.put(Integer.valueOf(iIntValue), lw9VarB);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            bsm0 bsm0Var2 = this.e;
            if (!((Boolean) lw9VarB.d.getValue()).booleanValue()) {
                bsm0Var2.getClass();
                Log.w("CXCP", yy9Var + " does not support Postview streams");
            }
            if (this.b.e.f7123a.size() != 1) {
                jf4.n("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        te80 te80VarH = j2e.H(this.b, this.c, map);
        if (te80VarH.f33807a.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.b);
            r9aVar.a();
            return m2a.g;
        }
        if (!te80VarH.b.isEmpty()) {
            jf4.n("Deferred output is not supported for Extensions");
            return null;
        }
        cto ctoVar = new cto(r9aVar);
        ArrayList arrayList = te80VarH.f33807a;
        k03 k03Var = new k03(this.f5204a.a());
        tz9 tz9Var2 = this.b;
        if (yy9Var.v(new bto(arrayList, k03Var, r9aVar, tz9Var2.f, tz9Var2.g, Integer.valueOf(iIntValue), ctoVar, te80VarH.c))) {
            return new k9a(te80VarH.b, te80VarH.d);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + yy9Var + " for " + r9aVar + '!');
        r9aVar.a();
        return m2a.g;
    }
}
