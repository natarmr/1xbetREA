package a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcq0 f39829a;
    public final cx9 b;
    public final ix9 c;
    public final k7d0 d;
    public final cad e;
    public final Object f;
    public final LinkedHashSet g;

    public wv9(qcq0 qcq0Var, cx9 cx9Var, ix9 ix9Var, k7d0 k7d0Var, cad cadVar, Context context) {
        qcq0Var.getClass();
        cx9Var.getClass();
        ix9Var.getClass();
        k7d0Var.getClass();
        this.f39829a = qcq0Var;
        this.b = cx9Var;
        this.c = ix9Var;
        this.d = k7d0Var;
        this.e = cadVar;
        this.f = new Object();
        this.g = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:106:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0217  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0224  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0  */
    public final Object a(tz9 tz9Var, zje zjeVar) throws Exception {
        vv9 vv9Var;
        SessionConfiguration sessionConfigurationG;
        tz9 tz9Var2;
        ea0 ea0Var;
        OutputConfiguration outputConfiguration;
        fx9 fx9Var;
        CaptureRequest.Builder builderCreateCaptureRequest;
        Integer num;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        int i;
        tz9 tz9Var3 = tz9Var;
        if (zjeVar instanceof vv9) {
            vv9Var = (vv9) zjeVar;
            int i2 = vv9Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vv9Var.n = i2 - Integer.MIN_VALUE;
            } else {
                vv9Var = new vv9(this, zjeVar);
            }
        } else {
            vv9Var = new vv9(this, zjeVar);
        }
        Object objA = vv9Var.l;
        wne wneVar = wne.f39444a;
        int i3 = vv9Var.n;
        cx9 cx9Var = this.b;
        if (i3 == 0) {
            z1x.P(objA);
            if (Build.VERSION.SDK_INT < 35) {
                return new csd(0);
            }
            String str = tz9Var3.f34794a;
            vv9Var.i = tz9Var3;
            vv9Var.n = 1;
            objA = cx9Var.a(str, vv9Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            tz9Var3 = vv9Var.i;
            z1x.P(objA);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SessionConfiguration sessionConfigurationF = x6.f(vv9Var.k);
            ea0Var = vv9Var.j;
            tz9Var2 = vv9Var.i;
            z1x.P(objA);
            sessionConfigurationG = sessionConfigurationF;
        }
        fx9Var = (fx9) objA;
        if (fx9Var != null) {
            int i4 = tz9Var2.f;
            String str2 = fx9Var.b;
            gx9 gx9Var = fx9Var.c;
            try {
                builderCreateCaptureRequest = fx9Var.f10299a.createCaptureRequest(i4);
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    boolean z = true;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z = true;
                    } else {
                        i = 3;
                    }
                    gx9Var.a(str2, i, z);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    gx9Var.a(str2, 9, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
                builderCreateCaptureRequest = null;
            }
        } else {
            builderCreateCaptureRequest = null;
        }
        if (builderCreateCaptureRequest != null) {
            for (Map.Entry entry : tz9Var2.g.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderCreateCaptureRequest.set(key2, value);
                }
            }
            CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
            captureRequestBuild.getClass();
            sessionConfigurationG.getClass();
            sessionConfigurationG.setSessionParameters(captureRequestBuild);
        }
        if (ea0Var != null) {
            num = new Integer(ea0Var.a(sessionConfigurationG).f40449a);
        } else {
            num = null;
        }
        return num != null ? new csd(num.intValue()) : new csd(0);
        ea0 ea0Var2 = (ea0) objA;
        int i5 = tz9Var3.h;
        String str3 = tz9Var3.f34794a;
        if (i5 == 0) {
            i5 = 0;
        } else if (i5 == 1) {
            i5 = 1;
        } else if (i5 == 2) {
            Log.i("CXCP", "Unsupported session mode: " + ((Object) dwi0.S(tz9Var3.h)));
            return new csd(0);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = tz9Var3.b.iterator();
        while (it.hasNext()) {
            for (gf80 gf80Var : ((e3a) it.next()).f7123a) {
                int i6 = gf80Var.b;
                String str4 = gf80Var.c;
                o03 o03VarF = gfk0.f(null, Integer.valueOf(i6), m2a.A, gf80Var.d, gf80Var.e, gf80Var.f, gf80Var.h, gf80Var.f11196a, false, 0, !(str4 == null ? false : str4.equals(str3)) ? str4 : null, 1536);
                if (o03VarF != null && (outputConfiguration = (OutputConfiguration) o03VarF.H(sre0.f32672a.b(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        List listL0 = CollectionsKt.L0(linkedHashSet);
        listL0.getClass();
        sessionConfigurationG = oa3.g(i5, listL0);
        vv9Var.i = tz9Var3;
        vv9Var.j = ea0Var2;
        vv9Var.k = sessionConfigurationG;
        vv9Var.n = 2;
        Object objB = cx9Var.b(str3, vv9Var);
        if (objB != wneVar) {
            tz9Var2 = tz9Var3;
            ea0Var = ea0Var2;
            objA = objB;
            fx9Var = (fx9) objA;
            if (fx9Var != null) {
                int i7 = tz9Var2.f;
                String str5 = fx9Var.b;
                gx9 gx9Var2 = fx9Var.c;
                builderCreateCaptureRequest = fx9Var.f10299a.createCaptureRequest(i7);
            } else {
                builderCreateCaptureRequest = null;
            }
            if (builderCreateCaptureRequest != null) {
                while (r2.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderCreateCaptureRequest.set(key2, value);
                    }
                }
                CaptureRequest captureRequestBuild2 = builderCreateCaptureRequest.build();
                captureRequestBuild2.getClass();
                sessionConfigurationG.getClass();
                sessionConfigurationG.setSessionParameters(captureRequestBuild2);
            }
            if (ea0Var != null) {
                num = new Integer(ea0Var.a(sessionConfigurationG).f40449a);
            } else {
                num = null;
            }
            if (num != null) {
            }
        }
        return wneVar;
    }
}
