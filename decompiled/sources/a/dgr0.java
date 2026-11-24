package a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dgr0 implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7m0 f6054a;
    public pot0 b;
    public final boolean c;
    public cgr0 d;
    public final hy40 e;
    public final boolean f;
    public final int g;
    public final hy40 h;
    public odd i;
    public odd j;

    public dgr0(l1a l1aVar, i7m0 i7m0Var, tpt0 tpt0Var) {
        l1aVar.getClass();
        i7m0Var.getClass();
        tpt0Var.getClass();
        this.f6054a = i7m0Var;
        this.c = lgb.c0(l1aVar);
        boolean z = false;
        this.e = new hy40(0);
        b1a b1aVar = c1a.a0;
        c1a c1aVar = l1aVar.b;
        b1aVar.getClass();
        c1aVar.getClass();
        int i = Build.VERSION.SDK_INT;
        int iIntValue = 1;
        if (i >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key.getClass();
            Integer num = (Integer) ((ow9) c1aVar).c(key);
            if (num != null && num.intValue() > 1) {
                z = true;
            }
        }
        this.f = z;
        if (i >= 35) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            key2.getClass();
            Integer num2 = (Integer) ((ow9) c1aVar).c(key2);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
        }
        this.g = iIntValue;
        if (i >= 35) {
            CameraCharacteristics.Key key3 = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key3.getClass();
        }
        this.h = new hy40(Integer.valueOf(iIntValue));
    }

    public final odd a(int i, boolean z, boolean z2) {
        int i2;
        jzj jzjVarI;
        i7m0 i7m0Var = this.f6054a;
        if (l8x.f0("CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        odd oddVar = new odd();
        if (!z2 && !this.c) {
            oddVar.b0(new IllegalStateException("No flash unit"));
            return oddVar;
        }
        pot0 pot0Var = this.b;
        if (pot0Var == null) {
            dw9.z("Camera is not active.", oddVar);
            return oddVar;
        }
        d(i);
        odd oddVar2 = this.i;
        if (z) {
            if (oddVar2 != null) {
                dw9.z("There is a new enableTorch being set", oddVar2);
            }
            this.i = null;
        } else if (oddVar2 != null) {
            vzb.g0(oddVar, oddVar2);
        }
        this.i = oddVar;
        Integer num = i == 0 ? null : 1;
        synchronized (i7m0Var.d) {
            i7m0Var.k = num;
        }
        i7m0Var.f();
        List list = z40.b;
        z40 z40VarU = dj8.U(i7m0Var.e());
        if (z40VarU != null) {
            i2 = z40VarU.f43743a;
        } else {
            if (l8x.j0()) {
                Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + i7m0Var.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            i2 = 1;
        }
        if (i == 0) {
            jzjVarI = pot0Var.i(i2);
        } else {
            if (i == 1) {
                Integer num2 = (Integer) this.h.d();
                if (num2 != null) {
                    e(num2.intValue());
                }
            } else {
                e(this.g);
            }
            jzjVarI = pot0Var.e();
        }
        t9r0 t9r0Var = new t9r0((byte) 17);
        jzjVarI.getClass();
        jzjVarI.invokeOnCompletion(new sw8((Object) jzjVarI, (Object) oddVar, (Object) t9r0Var, (byte) 15));
        return oddVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        int i;
        this.b = pot0Var;
        if (this.d != null) {
            Integer num = (Integer) this.e.d();
            if (num != null) {
                i = num.intValue() != 1 ? 0 : 1;
            }
            a(i, false, false);
        }
    }

    public final void d(int i) {
        this.d = new cgr0(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zV = ofm0.v();
        hy40 hy40Var = this.e;
        if (zV) {
            hy40Var.l(Integer.valueOf(i2));
        } else {
            hy40Var.i(Integer.valueOf(i2));
        }
    }

    public final void e(int i) {
        jzj jzjVarC;
        odd oddVar = new odd();
        if (Build.VERSION.SDK_INT < 35 || !this.f) {
            oddVar.b0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        odd oddVar2 = this.j;
        if (oddVar2 != null) {
            if (oddVar2 != null) {
                dw9.z("There is a new torch strength being set", oddVar2);
            }
            this.j = null;
        }
        this.j = oddVar;
        oddVar.invokeOnCompletion(new lcr0(this, (byte) 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
        pot0 pot0Var = this.b;
        if (pot0Var == null || (jzjVarC = pot0.c(pot0Var, linkedHashMap)) == null) {
            dw9.z("Camera is not active.", oddVar);
        } else {
            vzb.g0(jzjVarC, oddVar);
        }
    }

    @Override // a.jot0
    public final void reset() {
        odd oddVar = this.i;
        if (oddVar != null) {
            dw9.z("There is a new enableTorch being set", oddVar);
        }
        this.i = null;
        odd oddVar2 = this.j;
        if (oddVar2 != null) {
            dw9.z("There is a new torch strength being set", oddVar2);
        }
        this.j = null;
        if (this.d != null) {
            d(0);
            a(0, true, false);
            this.d = null;
        }
    }
}
