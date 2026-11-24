package a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ax9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ String j;
    public final /* synthetic */ cx9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax9(String str, cx9 cx9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = str;
        this.k = cx9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cx9 cx9Var = this.k;
        String str = this.j;
        switch (b) {
            case 0:
                return new ax9(str, cx9Var, yjeVar, (byte) 0);
            default:
                return new ax9(str, cx9Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ax9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
        Boolean boolValueOf;
        int i2;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i3;
        byte b = this.i;
        cx9 cx9Var = this.k;
        String str = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) g0a.b(str)));
                gx9 gx9Var = cx9Var.c;
                try {
                    xy9 xy9Var = (xy9) cx9Var.l.getValue();
                    xy9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    jw9 jw9Var = xy9Var.f41696a;
                    if (jw9Var != null) {
                        arrayList.add(new ea0(jw9Var.f17241a, str));
                    }
                    jw9 jw9Var2 = xy9Var.b;
                    if (jw9Var2 != null) {
                        try {
                            arrayList.add(new ea0(jw9Var2.f17241a, str));
                            break;
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new ea0(arrayList);
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i = 3;
                        } else if (reason == 2) {
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
                    return null;
                }
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                o5d0 o5d0Var = cx9Var.f5112a;
                gx9 gx9Var2 = cx9Var.c;
                try {
                    boolValueOf = Boolean.valueOf(((CameraManager) o5d0Var.get()).isCameraDeviceSetupSupported(str));
                    break;
                } catch (Exception e2) {
                    if (e2 instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                        CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                        int reason2 = cameraAccessException2.getReason();
                        if (reason2 == 1) {
                            i2 = 3;
                        } else if (reason2 == 2) {
                            i2 = 6;
                        } else if (reason2 == 3) {
                            i2 = 0;
                        } else if (reason2 == 4) {
                            i2 = 1;
                        } else if (reason2 != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                        gx9Var2.a(str, i2, true);
                    } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        gx9Var2.a(str, 9, false);
                    } else {
                        if (!(e2 instanceof IllegalStateException)) {
                            throw e2;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    boolValueOf = null;
                }
                if (Intrinsics.d(boolValueOf, Boolean.TRUE)) {
                    Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) g0a.b(str)));
                    try {
                        cameraDeviceSetup = ((CameraManager) o5d0Var.get()).getCameraDeviceSetup(str);
                    } catch (Exception e3) {
                        if (e3 instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e3.getMessage());
                            CameraAccessException cameraAccessException3 = (CameraAccessException) e3;
                            int reason3 = cameraAccessException3.getReason();
                            if (reason3 == 1) {
                                i3 = 3;
                            } else if (reason3 == 2) {
                                i3 = 6;
                            } else if (reason3 == 3) {
                                i3 = 0;
                            } else if (reason3 == 4) {
                                i3 = 1;
                            } else if (reason3 != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException3);
                                i3 = 11;
                            } else {
                                i3 = 2;
                            }
                            gx9Var2.a(str, i3, true);
                        } else if ((e3 instanceof IllegalArgumentException) || (e3 instanceof SecurityException) || (e3 instanceof UnsupportedOperationException) || (e3 instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e3.getMessage());
                            gx9Var2.a(str, 9, false);
                        } else {
                            if (!(e3 instanceof IllegalStateException)) {
                                throw e3;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        cameraDeviceSetup = null;
                    }
                    if (cameraDeviceSetup != null) {
                        return new fx9(cameraDeviceSetup, str, gx9Var2);
                    }
                    break;
                }
                return null;
        }
    }
}
