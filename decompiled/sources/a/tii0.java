package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tii0 extends sii0 {
    public static tii0 d(fpt0 fpt0Var, Size size) {
        if (((r3a) fpt0Var.e(fpt0.E0, null)) == null) {
            hny.w((String) fpt0Var.e(xto0.z0, fpt0Var.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        tii0 tii0Var = new tii0();
        size.getClass();
        xii0 xii0Var = (xii0) fpt0Var.e(fpt0.C0, null);
        b780 b780Var = b780.c;
        b780Var.getClass();
        int i = xii0.a().g.c;
        ArrayList arrayList = tii0Var.d;
        ArrayList arrayList2 = tii0Var.c;
        ucs0 ucs0Var = tii0Var.b;
        if (xii0Var != null) {
            t7a t7aVar = xii0Var.g;
            i = t7aVar.c;
            for (CameraDevice.StateCallback stateCallback : xii0Var.c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : xii0Var.d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            ucs0Var.e(t7aVar.d);
            b780Var = t7aVar.b;
        }
        ucs0Var.d = wy40.p(b780Var);
        byte b = 20;
        if (fpt0Var instanceof pub0) {
            Rational rational = rub0.f31118a;
            if (((PreviewPixelHDRnetQuirk) mhk.a().b(PreviewPixelHDRnetQuirk.class)) != null && !Intrinsics.d(rub0.f31118a, new Rational(size.getWidth(), size.getHeight()))) {
                wy40 wy40VarL = wy40.l();
                CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                key.getClass();
                wy40VarL.y(s5x0.C(key), 2);
                ucs0Var.g(new hx9(b780.j(wy40VarL), b));
            }
        }
        Object objE = fpt0Var.e(hx9.d, Integer.valueOf(i));
        objE.getClass();
        ucs0Var.b = ((Number) objE).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) fpt0Var.e(hx9.e, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) fpt0Var.e(hx9.f, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) fpt0Var.e(hx9.g, null);
        if (captureCallback != null) {
            o3a o3aVar = new o3a(captureCallback);
            ucs0Var.f(o3aVar);
            ArrayList arrayList3 = tii0Var.e;
            if (!arrayList3.contains(o3aVar)) {
                arrayList3.add(o3aVar);
            }
        }
        int iQ = fpt0Var.q();
        if (iQ != 0 && iQ != 0) {
            ((wy40) ucs0Var.d).y(fpt0.O0, Integer.valueOf(iQ));
        }
        int iN = fpt0Var.n();
        if (iN != 0 && iN != 0) {
            ((wy40) ucs0Var.d).y(fpt0.P0, Integer.valueOf(iN));
        }
        wy40 wy40VarL2 = wy40.l();
        u15 u15Var = hx9.j;
        String str = (String) fpt0Var.e(u15Var, null);
        if (str != null) {
            wy40VarL2.y(u15Var, str);
        }
        u15 u15Var2 = hx9.h;
        Long l = (Long) fpt0Var.e(u15Var2, null);
        if (l != null) {
            wy40VarL2.y(u15Var2, Long.valueOf(l.longValue()));
        }
        ucs0Var.g(wy40VarL2);
        peg0 peg0Var = new peg0((byte) 19);
        fpt0Var.i(new uq((Object) peg0Var, (Object) fpt0Var, (byte) 3));
        ucs0Var.g(new h03(b780.j((wy40) peg0Var.b), b));
        return tii0Var;
    }

    public final void a(drd drdVar) {
        this.b.g(drdVar);
    }

    public final void b(hzj hzjVar, agn agnVar, int i) {
        gr00 gr00VarA = a55.a(hzjVar);
        if (agnVar == null) {
            hny.u("Null dynamicRange");
            return;
        }
        gr00VarA.e = agnVar;
        gr00VarA.c = Integer.valueOf(i);
        this.f32265a.add(gr00VarA.g());
        ((HashSet) this.b.c).add(hzjVar);
    }

    public final xii0 c() {
        return new xii0(new ArrayList(this.f32265a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.j(), this.f, this.g, this.h, this.i);
    }
}
