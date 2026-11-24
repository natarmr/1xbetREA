package a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nw2 implements yy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1a f24214a;
    public final CameraDevice b;
    public final String c;
    public final gx9 d;
    public final chf0 e;
    public final qcq0 f;
    public final x04 g;
    public final c14 h;

    public nw2(c1a c1aVar, CameraDevice cameraDevice, String str, gx9 gx9Var, chf0 chf0Var, qcq0 qcq0Var) {
        c1aVar.getClass();
        str.getClass();
        gx9Var.getClass();
        qcq0Var.getClass();
        this.f24214a = c1aVar;
        this.b = cameraDevice;
        this.c = str;
        this.d = gx9Var;
        this.e = chf0Var;
        this.f = qcq0Var;
        this.g = o2e.X(false);
        this.h = o2e.Z(null);
    }

    @Override // a.yy9
    public final String F() {
        return this.c;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(CameraDevice.class))) {
            return this.b;
        }
        return null;
    }

    @Override // a.yy9
    public final CaptureRequest.Builder I(TotalCaptureResult totalCaptureResult) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            gx9 gx9Var = this.d;
            try {
                builderCreateReprocessCaptureRequest = this.b.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i = 3;
                        } else if (reason == 2) {
                            i = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        gx9Var.a(str, i, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        gx9Var.a(str, 9, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateReprocessCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }

    @Override // a.yy9
    public final void J(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.c;
            gx9 gx9Var = this.d;
            try {
                this.b.setCameraAudioRestriction(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i2 = 3;
                    } else if (reason == 2) {
                        i2 = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    gx9Var.a(str, i2, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    gx9Var.a(str, 9, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x005e, B:12:0x0064, B:14:0x006e, B:36:0x00c0, B:38:0x00c4, B:47:0x00f1, B:54:0x0118, B:56:0x011d, B:58:0x0123, B:60:0x0127, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:68:0x013a, B:69:0x013b, B:23:0x0091, B:25:0x009b, B:27:0x00a8), top: B:84:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x005e, B:12:0x0064, B:14:0x006e, B:36:0x00c0, B:38:0x00c4, B:47:0x00f1, B:54:0x0118, B:56:0x011d, B:58:0x0123, B:60:0x0127, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:68:0x013a, B:69:0x013b, B:23:0x0091, B:25:0x009b, B:27:0x00a8), top: B:84:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x005e, B:12:0x0064, B:14:0x006e, B:36:0x00c0, B:38:0x00c4, B:47:0x00f1, B:54:0x0118, B:56:0x011d, B:58:0x0123, B:60:0x0127, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:68:0x013a, B:69:0x013b, B:23:0x0091, B:25:0x009b, B:27:0x00a8), top: B:84:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x005e, B:12:0x0064, B:14:0x006e, B:36:0x00c0, B:38:0x00c4, B:47:0x00f1, B:54:0x0118, B:56:0x011d, B:58:0x0123, B:60:0x0127, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:68:0x013a, B:69:0x013b, B:23:0x0091, B:25:0x009b, B:27:0x00a8), top: B:84:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00c4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0178, please report this as an issue */
    @Override // a.yy9
    public final boolean O(kex kexVar, ArrayList arrayList, ey9 ey9Var) {
        gx9 gx9Var;
        boolean z;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        iki0 iki0Var;
        qcq0 qcq0Var = this.f;
        CameraDevice cameraDevice = this.b;
        ey9Var.getClass();
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var2 = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var2 != null) {
            b(iki0Var2);
        }
        String str = this.c;
        String strK = kng0.k("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            gx9 gx9Var2 = this.d;
            try {
                InputConfiguration inputConfiguration = new InputConfiguration(kexVar.f18170a, kexVar.b, kexVar.c);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        iki0Var = iki0Var2;
                        try {
                            arrayList2.add((OutputConfiguration) ((o03) it.next()).H(sre0.f32672a.b(OutputConfiguration.class)));
                            iki0Var2 = iki0Var;
                        } catch (Exception e) {
                            e = e;
                            gx9Var = gx9Var2;
                            iki0Var2 = iki0Var;
                            if (e instanceof CameraAccessException) {
                                gx9 gx9Var3 = gx9Var;
                                if (e instanceof IllegalArgumentException) {
                                }
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                gx9Var3.a(str, 9, false);
                                unit = null;
                                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                                if (unit == null) {
                                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                    if (iki0Var2 != null) {
                                        c(iki0Var2);
                                    }
                                }
                                if (unit != null) {
                                    return true;
                                }
                                return z;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z2 = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z2 = true;
                            }
                            gx9Var.a(str, i, z2);
                            unit = null;
                            z = false;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (iki0Var2 != null) {
                                    c(iki0Var2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return z;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        gx9Var = gx9Var2;
                        if (e instanceof CameraAccessException) {
                            gx9 gx9Var4 = gx9Var;
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                gx9Var4.a(str, 9, false);
                                unit = null;
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (iki0Var2 != null) {
                                    c(iki0Var2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return z;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z2 = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason != 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        gx9Var.a(str, i, z2);
                        unit = null;
                        z = false;
                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (iki0Var2 != null) {
                                c(iki0Var2);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return z;
                    }
                }
                iki0Var = iki0Var2;
                try {
                    gx9Var = gx9Var2;
                    iki0Var2 = iki0Var;
                    try {
                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new xw2(this, ey9Var, iki0Var2, this.d, this.e, qcq0Var.a()), qcq0Var.a());
                        unit = Unit.f46060a;
                    } catch (Exception e3) {
                        e = e3;
                        if (e instanceof CameraAccessException) {
                            gx9 gx9Var5 = gx9Var;
                            if (e instanceof IllegalArgumentException) {
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            gx9Var5.a(str, 9, false);
                            unit = null;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (iki0Var2 != null) {
                                    c(iki0Var2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return z;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z2 = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason != 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        gx9Var.a(str, i, z2);
                        unit = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    gx9Var = gx9Var2;
                    iki0Var2 = iki0Var;
                    if (e instanceof CameraAccessException) {
                        gx9 gx9Var6 = gx9Var;
                        if (e instanceof IllegalArgumentException) {
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        gx9Var6.a(str, 9, false);
                        unit = null;
                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (iki0Var2 != null) {
                                c(iki0Var2);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return z;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z2 = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z2 = true;
                            i = 0;
                        } else if (reason != 4) {
                            z2 = true;
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z2 = true;
                    }
                    gx9Var.a(str, i, z2);
                    unit = null;
                    z = false;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                    if (unit == null) {
                        Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                        if (iki0Var2 != null) {
                            c(iki0Var2);
                        }
                    }
                    if (unit != null) {
                        return true;
                    }
                    return z;
                }
            } catch (Exception e5) {
                e = e5;
            }
            z = false;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (iki0Var2 != null) {
                    c(iki0Var2);
                }
            }
            if (unit != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.yy9
    public final boolean S(ArrayList arrayList, ey9 ey9Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        boolean z;
        iki0 iki0Var;
        boolean z2;
        Unit unit;
        ?? r10;
        qcq0 qcq0Var = this.f;
        CameraDevice cameraDevice = this.b;
        ey9Var.getClass();
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var2 = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var2 != null) {
            b(iki0Var2);
        }
        String str3 = this.c;
        String strK = kng0.k("CXCP#createConstrainedHighSpeedCaptureSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            gx9 gx9Var = this.d;
            try {
                iki0Var = iki0Var2;
                try {
                    gx9 gx9Var2 = this.d;
                    chf0 chf0Var = this.e;
                    try {
                        Handler handlerA = qcq0Var.a();
                        str2 = strK;
                        z = true;
                        try {
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new xw2(this, ey9Var, iki0Var, gx9Var2, chf0Var, handlerA), qcq0Var.a());
                                unit = Unit.f46060a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    gx9Var.a(str3, i, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        gx9Var.a(str3, 9, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                    r10 = z;
                                }
                                z2 = false;
                                unit = null;
                                r10 = z;
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                            r9 = z;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", brm0.t(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = strK;
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = strK;
                        z = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                    str2 = strK;
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    str2 = strK;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = strK;
                iki0Var = iki0Var2;
                z = true;
            } catch (Throwable th4) {
                th = th4;
                str2 = strK;
                z = true;
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", brm0.t(str2, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (iki0Var != null) {
                    c(iki0Var);
                }
            }
            return unit != null ? r10 : z2;
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
        }
    }

    @Override // a.yy9
    public final void T() {
        if (!this.g.b()) {
            jf4.n("Check failed.");
            return;
        }
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.h, null);
        if (iki0Var != null) {
            c(iki0Var);
        }
    }

    public final Pair a(iki0 iki0Var) {
        if (this.g.b()) {
            c(iki0Var);
            return new Pair(Boolean.FALSE, null);
        }
        return new Pair(Boolean.TRUE, c14.b.getAndSet(this.h, iki0Var));
    }

    public final void b(iki0 iki0Var) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            iki0Var.d();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(iki0 iki0Var) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            iki0Var.a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.qcq0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.yy9
    public final boolean l(List list, ey9 ey9Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        iki0 iki0Var;
        boolean z;
        boolean z2;
        Unit unit;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        list.getClass();
        ey9Var.getClass();
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var2 = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var2 != null) {
            b(iki0Var2);
        }
        String str4 = this.c;
        String strK = kng0.k("CXCP#createCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                gx9 gx9Var = this.d;
                try {
                    iki0Var = iki0Var2;
                    try {
                        gx9 gx9Var2 = this.d;
                        chf0 chf0Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strK;
                            z = true;
                            try {
                                cameraDevice.createCaptureSession(list, new xw2(this, ey9Var, iki0Var, gx9Var2, chf0Var, handlerA), r11.a());
                                unit = Unit.f46060a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    gx9Var.a(str4, i, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        gx9Var.a(str4, 9, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                    r10 = z;
                                }
                                z2 = false;
                                unit = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strK;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strK;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", brm0.t(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strK;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strK;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strK;
                    iki0Var = iki0Var2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strK;
                    r11 = 1;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", brm0.t(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (iki0Var != null) {
                        c(iki0Var);
                    }
                }
                return unit != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", brm0.t(str, " - ")));
            throw th;
        }
    }

    @Override // a.yy9
    public final void n() {
        iki0 iki0Var;
        if (!this.g.a() || (iki0Var = (iki0) this.h.f3556a) == null) {
            return;
        }
        b(iki0Var);
    }

    @Override // a.yy9
    public final CaptureRequest.Builder q(int i) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            gx9 gx9Var = this.d;
            try {
                builderCreateCaptureRequest = this.b.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i2 = 3;
                        } else if (reason == 2) {
                            i2 = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i2 = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                        }
                        gx9Var.a(str, i2, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        gx9Var.a(str, 9, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            return builderCreateCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0266  */
    /* JADX WARN: Code duplicated, block: B:110:0x026b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x026d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0198 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:26:0x00a2, B:28:0x00ae, B:30:0x00b4, B:35:0x00c5, B:38:0x00f0, B:39:0x0113, B:41:0x0119, B:42:0x0127, B:43:0x0131, B:45:0x0137, B:47:0x0149, B:49:0x0156, B:50:0x015a, B:52:0x016c, B:55:0x0175, B:56:0x0178, B:58:0x017a, B:59:0x017d, B:68:0x0194, B:70:0x0198, B:79:0x01c5, B:87:0x01ea, B:89:0x01ef, B:91:0x01f5, B:93:0x01f9, B:95:0x01fd, B:98:0x0202, B:100:0x0206, B:101:0x020c, B:102:0x020d), top: B:125:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:26:0x00a2, B:28:0x00ae, B:30:0x00b4, B:35:0x00c5, B:38:0x00f0, B:39:0x0113, B:41:0x0119, B:42:0x0127, B:43:0x0131, B:45:0x0137, B:47:0x0149, B:49:0x0156, B:50:0x015a, B:52:0x016c, B:55:0x0175, B:56:0x0178, B:58:0x017a, B:59:0x017d, B:68:0x0194, B:70:0x0198, B:79:0x01c5, B:87:0x01ea, B:89:0x01ef, B:91:0x01f5, B:93:0x01f9, B:95:0x01fd, B:98:0x0202, B:100:0x0206, B:101:0x020c, B:102:0x020d), top: B:125:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ef A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:26:0x00a2, B:28:0x00ae, B:30:0x00b4, B:35:0x00c5, B:38:0x00f0, B:39:0x0113, B:41:0x0119, B:42:0x0127, B:43:0x0131, B:45:0x0137, B:47:0x0149, B:49:0x0156, B:50:0x015a, B:52:0x016c, B:55:0x0175, B:56:0x0178, B:58:0x017a, B:59:0x017d, B:68:0x0194, B:70:0x0198, B:79:0x01c5, B:87:0x01ea, B:89:0x01ef, B:91:0x01f5, B:93:0x01f9, B:95:0x01fd, B:98:0x0202, B:100:0x0206, B:101:0x020c, B:102:0x020d), top: B:125:0x003b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x024e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0198, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01c5, please report this as an issue */
    @Override // a.yy9
    public final boolean r(aji0 aji0Var) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        CameraDevice cameraDevice = this.b;
        ey9 ey9Var = aji0Var.e;
        List list = aji0Var.b;
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var != null) {
            b(iki0Var);
        }
        String str5 = this.c;
        String strK = kng0.k("CXCP#createCaptureSession-", str5);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                gx9 gx9Var = this.d;
                try {
                    int i2 = aji0Var.f978a;
                    ArrayList arrayList = aji0Var.c;
                    str3 = "%.3f ms";
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList2.add((OutputConfiguration) ((o03) it.next()).H(sre0.f32672a.b(OutputConfiguration.class)));
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, brm0.t(strK, str2)));
                                    throw th;
                                }
                            }
                            Executor executor = aji0Var.d;
                            try {
                                str4 = " - ";
                                gx9Var = gx9Var;
                                try {
                                    xw2 xw2Var = new xw2(this, aji0Var.e, iki0Var, this.d, this.e, this.f.a());
                                    executor.getClass();
                                    SessionConfiguration sessionConfigurationE = x6.e(i2, arrayList2, executor, xw2Var);
                                    if (list != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            sessionConfigurationE.setInputConfiguration(f1t0.b0(str5, list));
                                        } else {
                                            sessionConfigurationE.setInputConfiguration(new InputConfiguration(((kex) CollectionsKt.v0(list)).f18170a, ((kex) CollectionsKt.v0(list)).b, ((kex) CollectionsKt.v0(list)).c));
                                        }
                                    }
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(aji0Var.f);
                                        Trace.endSection();
                                        builderCreateCaptureRequest.getClass();
                                        Set set = (Set) ((ow9) this.f24214a).i.getValue();
                                        ArrayList arrayList3 = new ArrayList(r3d.q(set, 10));
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                        }
                                        for (Map.Entry entry : aji0Var.g.entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                                tfx.O(builderCreateCaptureRequest, key, value);
                                            }
                                        }
                                        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
                                        captureRequestBuild.getClass();
                                        sessionConfigurationE.setSessionParameters(captureRequestBuild);
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            cameraDevice.createCaptureSession(sessionConfigurationE);
                                            Trace.endSection();
                                            unit = Unit.f46060a;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof CameraAccessException) {
                                        gx9 gx9Var2 = gx9Var;
                                        if (e instanceof IllegalArgumentException) {
                                        }
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z = false;
                                        gx9Var2.a(str5, 9, false);
                                        unit = null;
                                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                                        if (unit == null) {
                                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                            if (iki0Var != null) {
                                                c(iki0Var);
                                            }
                                        }
                                        if (unit != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                i = 0;
                                            } else if (reason != 4) {
                                                i = 1;
                                            } else if (reason != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                i = 11;
                                            } else {
                                                i = 2;
                                            }
                                            z2 = true;
                                        } else {
                                            i = 6;
                                        }
                                        z2 = true;
                                    } else {
                                        gx9Var = gx9Var;
                                    }
                                    gx9Var.a(str5, i, z2);
                                    unit = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = " - ";
                                gx9Var = gx9Var;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str4 = " - ";
                            if (e instanceof CameraAccessException) {
                                gx9 gx9Var3 = gx9Var;
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    gx9Var3.a(str5, 9, false);
                                    unit = null;
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                                if (unit == null) {
                                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (iki0Var != null) {
                                        c(iki0Var);
                                    }
                                }
                                if (unit != null) {
                                    return true;
                                }
                                return z;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason != 1) {
                                if (reason != 2) {
                                    if (reason != 3) {
                                        i = 0;
                                    } else if (reason != 4) {
                                        i = 1;
                                    } else if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i = 11;
                                    } else {
                                        i = 2;
                                    }
                                    z2 = true;
                                } else {
                                    i = 6;
                                }
                                z2 = true;
                            } else {
                                gx9Var = gx9Var;
                            }
                            gx9Var.a(str5, i, z2);
                            unit = null;
                            z = false;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                if (iki0Var != null) {
                                    c(iki0Var);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return z;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str = str3;
                        str2 = " - ";
                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, brm0.t(strK, str2)));
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = "%.3f ms";
                } catch (Throwable th5) {
                    th = th5;
                    str3 = "%.3f ms";
                }
                z = false;
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (iki0Var != null) {
                        c(iki0Var);
                    }
                }
                if (unit != null) {
                    return true;
                }
                return z;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            str = "%.3f ms";
            str2 = " - ";
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) g0a.b(this.c)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ea A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:26:0x0095, B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:37:0x00be, B:38:0x00c5, B:39:0x00c6, B:51:0x00e6, B:53:0x00ea, B:62:0x0117, B:68:0x0136, B:71:0x013c, B:73:0x0140, B:75:0x0144, B:77:0x0148, B:80:0x014d, B:82:0x0151, B:83:0x0157, B:84:0x0158), top: B:100:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:26:0x0095, B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:37:0x00be, B:38:0x00c5, B:39:0x00c6, B:51:0x00e6, B:53:0x00ea, B:62:0x0117, B:68:0x0136, B:71:0x013c, B:73:0x0140, B:75:0x0144, B:77:0x0148, B:80:0x014d, B:82:0x0151, B:83:0x0157, B:84:0x0158), top: B:100:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:26:0x0095, B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:37:0x00be, B:38:0x00c5, B:39:0x00c6, B:51:0x00e6, B:53:0x00ea, B:62:0x0117, B:68:0x0136, B:71:0x013c, B:73:0x0140, B:75:0x0144, B:77:0x0148, B:80:0x014d, B:82:0x0151, B:83:0x0157, B:84:0x0158), top: B:100:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00ea, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0117, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0199, please report this as an issue */
    @Override // a.yy9
    public final boolean v(bto btoVar) throws Throwable {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        Unit unit;
        boolean z;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        k03 k03Var = btoVar.b;
        String str5 = "%.3f ms";
        CameraDevice cameraDevice = this.b;
        cto ctoVar = btoVar.g;
        Integer num = btoVar.f;
        Pair pairA = a(ctoVar);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var != null) {
            b(iki0Var);
        }
        String str6 = this.c;
        String strK = kng0.k("CXCP#createExtensionSession-", str6);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                gx9 gx9Var = this.d;
                try {
                    int iIntValue = num.intValue();
                    ArrayList arrayList = btoVar.f3190a;
                    j = jElapsedRealtimeNanos;
                    try {
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        try {
                            try {
                                while (true) {
                                    str3 = str5;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    try {
                                        try {
                                            int i2 = iIntValue;
                                            arrayList2.add((OutputConfiguration) ((o03) it.next()).H(sre0.f32672a.b(OutputConfiguration.class)));
                                            str5 = str3;
                                            iIntValue = i2;
                                        } catch (Exception e) {
                                            e = e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        str2 = " - ";
                                        str = str3;
                                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str, brm0.t(strK, str2)));
                                        throw th;
                                    }
                                    e = e;
                                    str4 = " - ";
                                    if (!(e instanceof CameraAccessException)) {
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            z = false;
                                            gx9Var.a(str6, 9, false);
                                        } else {
                                            if (!(e instanceof IllegalStateException)) {
                                                throw e;
                                            }
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        }
                                        unit = null;
                                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                                        if (unit == null) {
                                            Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                            if (iki0Var != null) {
                                                c(iki0Var);
                                            }
                                        }
                                        if (unit != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    gx9Var.a(str6, i, z2);
                                    z = false;
                                    unit = null;
                                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                                    if (unit == null) {
                                        Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                        if (iki0Var != null) {
                                            c(iki0Var);
                                        }
                                    }
                                    if (unit != null) {
                                        return true;
                                    }
                                    return z;
                                }
                                ExtensionSessionConfiguration extensionSessionConfigurationF = ow2.f(iIntValue, arrayList2, k03Var, new dz2(this, ctoVar, iki0Var, this.d, this.e, k03Var));
                                o03 o03Var = btoVar.h;
                                if (o03Var != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfiguration = (OutputConfiguration) o03Var.H(sre0.f32672a.b(OutputConfiguration.class));
                                    if (outputConfiguration == null) {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                    extensionSessionConfigurationF.setPostviewOutputConfiguration(outputConfiguration);
                                }
                                cameraDevice.createExtensionSession(extensionSessionConfigurationF);
                                unit = Unit.f46060a;
                                z = false;
                            } catch (Exception e2) {
                                e = e2;
                                if (!(e instanceof CameraAccessException)) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    gx9Var.a(str6, i, z2);
                                } else {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    gx9Var.a(str6, 9, false);
                                    unit = null;
                                }
                                z = false;
                                unit = null;
                            }
                            str4 = " - ";
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = " - ";
                            str = str3;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str, brm0.t(strK, str2)));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str3 = str5;
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = str5;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = "%.3f ms";
                    j = jElapsedRealtimeNanos;
                } catch (Throwable th4) {
                    th = th4;
                    str3 = "%.3f ms";
                    j = jElapsedRealtimeNanos;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str3, brm0.t(strK, str4)));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                    if (iki0Var != null) {
                        c(iki0Var);
                    }
                }
                if (unit != null) {
                    return true;
                }
                return z;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str = "%.3f ms";
            str2 = " - ";
            j = jElapsedRealtimeNanos;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(j) / 1000000.0d)}, 1, null, str, brm0.t(strK, str2)));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:8:0x003c, B:9:0x0041, B:10:0x0052, B:12:0x0058, B:18:0x007b, B:20:0x007f, B:22:0x0084, B:24:0x008d, B:32:0x00a4, B:34:0x00a8, B:43:0x00d5, B:50:0x00fc, B:52:0x0101, B:54:0x0107, B:56:0x010b, B:58:0x010f, B:61:0x0114, B:63:0x0118, B:64:0x011e, B:65:0x011f), top: B:80:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:8:0x003c, B:9:0x0041, B:10:0x0052, B:12:0x0058, B:18:0x007b, B:20:0x007f, B:22:0x0084, B:24:0x008d, B:32:0x00a4, B:34:0x00a8, B:43:0x00d5, B:50:0x00fc, B:52:0x0101, B:54:0x0107, B:56:0x010b, B:58:0x010f, B:61:0x0114, B:63:0x0118, B:64:0x011e, B:65:0x011f), top: B:80:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:8:0x003c, B:9:0x0041, B:10:0x0052, B:12:0x0058, B:18:0x007b, B:20:0x007f, B:22:0x0084, B:24:0x008d, B:32:0x00a4, B:34:0x00a8, B:43:0x00d5, B:50:0x00fc, B:52:0x0101, B:54:0x0107, B:56:0x010b, B:58:0x010f, B:61:0x0114, B:63:0x0118, B:64:0x011e, B:65:0x011f), top: B:80:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x015c, please report this as an issue */
    @Override // a.yy9
    public final boolean w(ArrayList arrayList, ey9 ey9Var) {
        iki0 iki0Var;
        gx9 gx9Var;
        boolean z;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        qcq0 qcq0Var = this.f;
        CameraDevice cameraDevice = this.b;
        ey9Var.getClass();
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var2 = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var2 != null) {
            b(iki0Var2);
        }
        String str = this.c;
        String strK = kng0.k("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            gx9 gx9Var2 = this.d;
            try {
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((o03) it.next()).H(sre0.f32672a.b(OutputConfiguration.class)));
                }
                iki0Var = iki0Var2;
                try {
                    try {
                        gx9Var = gx9Var2;
                        try {
                            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new xw2(this, ey9Var, iki0Var, this.d, this.e, qcq0Var.a()), qcq0Var.a());
                            unit = Unit.f46060a;
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                gx9 gx9Var3 = gx9Var;
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    gx9Var3.a(str, 9, false);
                                    unit = null;
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                                if (unit == null) {
                                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (iki0Var != null) {
                                        c(iki0Var);
                                    }
                                }
                                if (unit != null) {
                                    return true;
                                }
                                return z;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z2 = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z2 = true;
                            }
                            gx9Var.a(str, i, z2);
                            unit = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        gx9Var = gx9Var2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    gx9Var = gx9Var2;
                    if (e instanceof CameraAccessException) {
                        gx9 gx9Var4 = gx9Var;
                        if (e instanceof IllegalArgumentException) {
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        gx9Var4.a(str, 9, false);
                        unit = null;
                        Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (iki0Var != null) {
                                c(iki0Var);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return z;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z2 = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z2 = true;
                            i = 0;
                        } else if (reason != 4) {
                            z2 = true;
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z2 = true;
                    }
                    gx9Var.a(str, i, z2);
                    unit = null;
                    z = false;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                    if (unit == null) {
                        Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                        if (iki0Var != null) {
                            c(iki0Var);
                        }
                    }
                    if (unit != null) {
                        return true;
                    }
                    return z;
                }
            } catch (Exception e4) {
                e = e4;
                iki0Var = iki0Var2;
            }
            z = false;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (iki0Var != null) {
                    c(iki0Var);
                }
            }
            if (unit != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.qcq0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.yy9
    public final boolean y(InputConfiguration inputConfiguration, ArrayList arrayList, ey9 ey9Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        iki0 iki0Var;
        boolean z;
        boolean z2;
        Unit unit;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        ey9Var.getClass();
        Pair pairA = a(ey9Var);
        boolean zBooleanValue = ((Boolean) pairA.f46059a).booleanValue();
        iki0 iki0Var2 = (iki0) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (iki0Var2 != null) {
            b(iki0Var2);
        }
        String str4 = this.c;
        String strK = kng0.k("CXCP#createReprocessableCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                gx9 gx9Var = this.d;
                try {
                    iki0Var = iki0Var2;
                    try {
                        gx9 gx9Var2 = this.d;
                        chf0 chf0Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strK;
                            z = true;
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new xw2(this, ey9Var, iki0Var, gx9Var2, chf0Var, handlerA), r11.a());
                                unit = Unit.f46060a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    gx9Var.a(str4, i, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        gx9Var.a(str4, 9, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                    r10 = z;
                                }
                                z2 = false;
                                unit = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strK;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strK;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", brm0.t(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strK;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strK;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strK;
                    iki0Var = iki0Var2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strK;
                    r11 = 1;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", brm0.t(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                    if (iki0Var != null) {
                        c(iki0Var);
                    }
                }
                return unit != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", brm0.t(str, " - ")));
            throw th;
        }
    }
}
