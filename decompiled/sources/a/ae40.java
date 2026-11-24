package a;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ae40 extends fot0 {
    public final l1a r;
    public final xvk s;
    public final Size t;
    public final Object u;
    public uii0 v;
    public o3x w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    public ae40(l1a l1aVar, zd40 zd40Var, xvk xvkVar) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(zd40Var);
        l1aVar.getClass();
        xvkVar.getClass();
        this.r = l1aVar;
        this.s = xvkVar;
        Size size = be40.f2430a;
        c1a c1aVar = l1aVar.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar).c(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (l8x.g0()) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = dln0.f6292a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) mhk.a().b(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (dln0.b.compare(size4, dln0.f6292a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (l8x.j0()) {
                Log.w("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                lk30 lk30Var = new lk30((byte) 5);
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, lk30Var);
                }
            }
            Size sizeC = xvkVar.c();
            long jMin = Math.min(307200L, ((long) sizeC.getWidth()) * ((long) sizeC.getHeight()));
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Size size5 = outputSizes[i];
                    long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                    if (width == jMin) {
                        size = size5;
                    } else if (width <= jMin) {
                        i++;
                        size2 = size5;
                    } else if (size2 != null) {
                        size = size2;
                    }
                }
                if (size2 == null) {
                    size = outputSizes[0];
                } else {
                    size = size2;
                }
            }
        }
        this.t = size;
        this.u = new Object();
    }

    @Override // a.fot0
    public final void A() {
        uii0 uii0Var = this.v;
        if (uii0Var != null) {
            uii0Var.b();
        }
        this.v = null;
        synchronized (this.u) {
            try {
                o3x o3xVar = this.w;
                if (o3xVar != null) {
                    o3xVar.a();
                }
                this.w = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o3x G(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        o3x o3xVar = this.w;
        if (o3xVar != null) {
            o3xVar.a();
        }
        o3x o3xVar2 = new o3x(surface, size, this.i.k());
        this.w = o3xVar2;
        ro4.c0(o3xVar2.e).a(new llo(surface, surfaceTexture, (byte) 27), bnk.a());
        return o3xVar2;
    }

    public final tii0 H(Size size) {
        o3x o3xVarG;
        synchronized (this.u) {
            o3xVarG = G(size);
        }
        uii0 uii0Var = this.v;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new eyw(this, size, (byte) 1));
        this.v = uii0Var2;
        tii0 tii0VarD = tii0.d(new zd40(), size);
        tii0VarD.b.b = 1;
        tii0VarD.b(o3xVarG, agn.d, -1);
        tii0VarD.f = uii0Var2;
        return tii0VarD;
    }

    public final void I() {
        F(h55.a(be40.f2430a).i(), null);
    }

    @Override // a.fot0
    public final fpt0 g(boolean z, ipt0 ipt0Var) {
        ipt0Var.getClass();
        this.r.getClass();
        this.s.getClass();
        return new zd40();
    }

    @Override // a.fot0
    public final ept0 n(drd drdVar) {
        drdVar.getClass();
        this.r.getClass();
        this.s.getClass();
        return new evz();
    }

    @Override // a.fot0
    public final h55 z(h55 h55Var, h55 h55Var2) {
        Size size = this.t;
        E(kotlin.collections.a.c(H(size).c()));
        qgd qgdVarB = h55Var.b();
        qgdVarB.b = size;
        return qgdVarB.i();
    }
}
