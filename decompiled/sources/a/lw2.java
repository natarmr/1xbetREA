package a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class lw2 implements fy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw2 f20741a;
    public final CameraCaptureSession b;
    public final gx9 c;
    public final Handler d;

    public lw2(nw2 nw2Var, CameraCaptureSession cameraCaptureSession, gx9 gx9Var, Handler handler) {
        cameraCaptureSession.getClass();
        gx9Var.getClass();
        handler.getClass();
        this.f20741a = nw2Var;
        this.b = cameraCaptureSession;
        this.c = gx9Var;
        this.d = handler;
        z04 z04Var = w0a.f38340a;
        z04Var.getClass();
        z04.b.incrementAndGet(z04Var);
    }

    @Override // a.fy9
    public final boolean C() throws Throwable {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            gx9 gx9Var = this.c;
            try {
                this.b.abortCaptures();
                unit = Unit.f46060a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
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
                    unit = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // a.fy9
    public final yy9 E() {
        return this.f20741a;
    }

    @Override // a.kft0
    public Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(CameraCaptureSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // a.fy9
    public final boolean K(List list) throws Throwable {
        double d;
        Unit unit;
        String str = this.f20741a.c;
        list.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            jf4.n("Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed.");
            return false;
        }
        String strK = kng0.k("CXCP#finalizeOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            gx9 gx9Var = this.c;
            try {
                CameraCaptureSession cameraCaptureSession = this.b;
                d = 1000000.0d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((o03) it.next()).H(sre0.f32672a.b(OutputConfiguration.class)));
                        }
                        cameraCaptureSession.getClass();
                        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                        unit = Unit.f46060a;
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            int i = 3;
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
                        unit = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(strK, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // a.fy9
    public final boolean M0() throws Throwable {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            gx9 gx9Var = this.c;
            try {
                this.b.stopRepeating();
                unit = Unit.f46060a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
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
                    unit = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // a.fy9
    public final Integer T0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                gx9 gx9Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingBurst(arrayList, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // a.fy9
    public final Integer d0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                gx9 gx9Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingRequest(captureRequest, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }

    @Override // a.fy9
    public final Integer g0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                gx9 gx9Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.captureBurst(arrayList, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }

    @Override // a.fy9
    public final Surface getInputSurface() {
        return this.b.getInputSurface();
    }

    @Override // a.fy9
    public final Integer w0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        String str = this.f20741a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                gx9 gx9Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.capture(captureRequest, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", cs0.o(new Object[]{Double.valueOf(cs0.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", brm0.t(string, " - ")));
            throw th;
        }
    }
}
