package a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g4w0 implements f4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1a f10689a;
    public final n0o0 b = maz.b(new jmv0(this, (byte) 17));
    public final fck0 c = new fck0(new itt0());
    public boolean d;
    public boolean e;
    public final boolean f;
    public ibe0 g;
    public o3x h;

    public g4w0(l1a l1aVar) {
        this.f10689a = l1aVar.b;
        this.f = mhk.a().b(ZslDisablerQuirk.class) != null;
    }

    @Override // a.f4w0
    public final void a() throws Exception {
        j();
    }

    @Override // a.f4w0
    public final void b(tii0 tii0Var) throws Exception {
        ucs0 ucs0Var = tii0Var.b;
        j();
        if (this.d) {
            ucs0Var.b = 1;
            return;
        }
        if (this.f) {
            ucs0Var.b = 1;
            return;
        }
        c1a.a0.getClass();
        c1a c1aVar = this.f10689a;
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key);
        if (iArr == null) {
            iArr = b1a.b;
        }
        if (!tx3.w(iArr, 4)) {
            if (l8x.h0()) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            ucs0Var.b = 1;
            return;
        }
        n0o0 n0o0Var = this.b;
        Size[] inputSizes = ((StreamConfigurationMap) n0o0Var.getValue()).getInputSizes(34);
        inputSizes.getClass();
        Iterator it = tx3.g0(inputSizes).iterator();
        if (!it.hasNext()) {
            itt0.a();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            size.getClass();
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                size2.getClass();
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (l8x.j0()) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        int[] validOutputFormatsForInput = ((StreamConfigurationMap) n0o0Var.getValue()).getValidOutputFormatsForInput(34);
        validOutputFormatsForInput.getClass();
        if (!tx3.w(validOutputFormatsForInput, 256)) {
            if (l8x.j0()) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        ld40 ld40Var = new ld40(size3.getWidth(), size3.getHeight(), 34, 9);
        wx9 wx9Var = ld40Var.b;
        wx9Var.getClass();
        ibe0 ibe0Var = new ibe0(ld40Var);
        ld40Var.o(new ytt0(this, (byte) 6), vox.a());
        Surface surface = ibe0Var.getSurface();
        if (surface == null) {
            jf4.n("Required value was null.");
            return;
        }
        o3x o3xVar = new o3x(surface, new Size(ibe0Var.j(), ibe0Var.f()), 34);
        ro4.c0(o3xVar.e).a(new d8a(ibe0Var, (byte) 3), j120.T());
        tii0Var.b(o3xVar, agn.d, -1);
        ucs0Var.f(wx9Var);
        ArrayList arrayList = tii0Var.e;
        if (!arrayList.contains(wx9Var)) {
            arrayList.add(wx9Var);
        }
        tii0Var.g = new InputConfiguration(ibe0Var.j(), ibe0Var.f(), ibe0Var.h());
        this.g = ibe0Var;
        this.h = o3xVar;
    }

    @Override // a.f4w0
    public final boolean c() {
        return this.d;
    }

    @Override // a.f4w0
    public final void d(boolean z) {
        this.e = z;
    }

    @Override // a.f4w0
    public final void e(boolean z) throws Exception {
        if (this.d != z && z) {
            i();
        }
        this.d = z;
    }

    @Override // a.f4w0
    public final b1x f() {
        try {
            return (b1x) this.c.c();
        } catch (NoSuchElementException unused) {
            if (!l8x.j0()) {
                return null;
            }
            Log.w("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    @Override // a.f4w0
    public final boolean g(hzj hzjVar, xii0 xii0Var) {
        hzjVar.getClass();
        xii0Var.getClass();
        InputConfiguration inputConfiguration = xii0Var.i;
        return inputConfiguration != null && hzjVar.i == inputConfiguration.getFormat() && hzjVar.h.getWidth() == inputConfiguration.getWidth() && hzjVar.h.getHeight() == inputConfiguration.getHeight();
    }

    @Override // a.f4w0
    public final boolean h() {
        return this.e;
    }

    public final void i() throws Exception {
        boolean zIsEmpty;
        fck0 fck0Var = this.c;
        while (true) {
            synchronized (fck0Var.c) {
                zIsEmpty = ((ArrayDeque) fck0Var.b).isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((b1x) fck0Var.c()).close();
            }
        }
    }

    public final void j() throws Exception {
        o3x o3xVar = this.h;
        if (o3xVar != null) {
            ibe0 ibe0Var = this.g;
            if (ibe0Var != null) {
                ro4.c0(o3xVar.e).a(new d8a(ibe0Var, (byte) 4), j120.T());
                ibe0Var.k();
                this.g = null;
            }
            o3xVar.a();
            this.h = null;
        }
        i();
    }
}
