package a;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dnu0 implements yy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw2 f6389a;
    public final Object b = new Object();
    public boolean c;

    public dnu0(nw2 nw2Var) {
        this.f6389a = nw2Var;
    }

    @Override // a.yy9
    public final String F() {
        return this.f6389a.c;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        return this.f6389a.H(sgyVar);
    }

    @Override // a.yy9
    public final CaptureRequest.Builder I(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderI;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    builderI = null;
                } else {
                    builderI = this.f6389a.I(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderI;
    }

    @Override // a.yy9
    public final void J(int i) {
        this.f6389a.J(i);
    }

    @Override // a.yy9
    public final boolean O(kex kexVar, ArrayList arrayList, ey9 ey9Var) {
        boolean zO;
        ey9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((r9a) ey9Var).a();
                    zO = false;
                } else {
                    zO = this.f6389a.O(kexVar, arrayList, ey9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zO;
    }

    @Override // a.yy9
    public final boolean S(ArrayList arrayList, ey9 ey9Var) {
        boolean zS;
        ey9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((r9a) ey9Var).a();
                    zS = false;
                } else {
                    zS = this.f6389a.S(arrayList, ey9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zS;
    }

    @Override // a.yy9
    public final void T() {
        this.f6389a.T();
    }

    @Override // a.yy9
    public final boolean l(List list, ey9 ey9Var) {
        boolean zL;
        list.getClass();
        ey9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    ey9Var.a();
                    zL = false;
                } else {
                    zL = this.f6389a.l(list, ey9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zL;
    }

    @Override // a.yy9
    public final void n() {
        this.f6389a.n();
    }

    @Override // a.yy9
    public final CaptureRequest.Builder q(int i) {
        CaptureRequest.Builder builderQ;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    builderQ = null;
                } else {
                    builderQ = this.f6389a.q(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderQ;
    }

    @Override // a.yy9
    public final boolean r(aji0 aji0Var) {
        boolean zR;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    aji0Var.e.a();
                    zR = false;
                } else {
                    zR = this.f6389a.r(aji0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zR;
    }

    @Override // a.yy9
    public final boolean v(bto btoVar) {
        boolean zV;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    btoVar.g.a();
                    zV = false;
                } else {
                    zV = this.f6389a.v(btoVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zV;
    }

    @Override // a.yy9
    public final boolean w(ArrayList arrayList, ey9 ey9Var) {
        boolean zW;
        ey9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((r9a) ey9Var).a();
                    zW = false;
                } else {
                    zW = this.f6389a.w(arrayList, ey9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zW;
    }

    @Override // a.yy9
    public final boolean y(InputConfiguration inputConfiguration, ArrayList arrayList, ey9 ey9Var) {
        boolean zY;
        ey9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((r9a) ey9Var).a();
                    zY = false;
                } else {
                    zY = this.f6389a.y(inputConfiguration, arrayList, ey9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zY;
    }
}
