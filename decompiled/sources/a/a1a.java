package a;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a1a {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f63a;
    public Camera.CameraInfo b;
    public oz4 c;
    public ip2 d;
    public boolean e;
    public String f;
    public zz2 h;
    public g7k0 i;
    public g7k0 j;
    public o2a g = new o2a();
    public int k = -1;
    public final z0a l = new z0a(this);

    public a1a(Context context) {
    }

    public final int a() {
        int i = this.h.f45232a;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                i2 = 90;
            } else if (i == 2) {
                i2 = 180;
            } else if (i == 3) {
                i2 = SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        Camera.CameraInfo cameraInfo = this.b;
        int i3 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % 360)) % 360 : ((cameraInfo.orientation - i2) + 360) % 360;
        Log.i("a1a", "Camera Display Orientation: " + i3);
        return i3;
    }

    public final void b() {
        g7k0 g7k0Var;
        if (this.f63a == null) {
            itt0.k("Camera not open");
            return;
        }
        try {
            int iA = a();
            this.k = iA;
            this.f63a.setDisplayOrientation(iA);
        } catch (Exception unused) {
            Log.w("a1a", "Failed to set rotation.");
        }
        try {
            c(false);
        } catch (Exception unused2) {
            try {
                c(true);
            } catch (Exception unused3) {
                Log.w("a1a", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f63a.getParameters().getPreviewSize();
        if (previewSize == null) {
            g7k0Var = this.i;
            this.j = g7k0Var;
        } else {
            g7k0 g7k0Var2 = new g7k0(previewSize.width, previewSize.height);
            this.j = g7k0Var2;
            g7k0Var = g7k0Var2;
        }
        this.l.b = g7k0Var;
    }

    public final void c(boolean z) {
        String strA;
        String string;
        Camera.Parameters parameters = this.f63a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            Log.w("a1a", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("a1a", "Initial camera parameters: " + parameters.flatten());
        if (z) {
            Log.w("a1a", "In camera config safe mode -- most settings will not be honored");
        }
        int i = this.g.b;
        int i2 = ly9.f20851a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        int[] iArr = null;
        if (z || i == 1) {
            strA = ly9.a("focus mode", supportedFocusModes, "auto");
        } else if (i == 2) {
            strA = ly9.a("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (i == 3) {
            strA = ly9.a("focus mode", supportedFocusModes, "infinity");
        } else {
            strA = i == 4 ? ly9.a("focus mode", supportedFocusModes, "macro") : null;
        }
        if (!z && strA == null) {
            strA = ly9.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strA != null) {
            if (strA.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(strA));
            } else {
                parameters.setFocusMode(strA);
            }
        }
        if (!z) {
            ly9.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new g7k0(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new g7k0(size.width, size.height));
            }
        }
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            zz2 zz2Var = this.h;
            int i3 = this.k;
            if (i3 == -1) {
                jf4.n("Rotation not calculated yet. Call configure() first.");
                return;
            }
            boolean z2 = i3 % 180 != 0;
            g7k0 g7k0Var = (g7k0) zz2Var.b;
            if (g7k0Var == null) {
                g7k0Var = null;
            } else if (z2) {
                g7k0Var = new g7k0(g7k0Var.b, g7k0Var.f10819a);
            }
            tub0 tub0Var = (tub0) zz2Var.c;
            tub0Var.getClass();
            if (g7k0Var != null) {
                Collections.sort(arrayList, new sr0(tub0Var, g7k0Var));
            }
            Log.i("tub0", "Viewfinder size: " + g7k0Var);
            Log.i("tub0", "Preview in order of preference: " + arrayList);
            g7k0 g7k0Var2 = (g7k0) arrayList.get(0);
            this.i = g7k0Var2;
            parameters.setPreviewSize(g7k0Var2.f10819a, g7k0Var2.b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                string = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                string = sb2.toString();
            }
            sb.append(string);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    int i4 = iArr2[0];
                    int i5 = iArr2[1];
                    if (i4 >= 10000 && i5 <= 20000) {
                        iArr = iArr2;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr3 = new int[2];
                    parameters.getPreviewFpsRange(iArr3);
                    if (Arrays.equals(iArr3, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("a1a", "Final camera parameters: " + parameters.flatten());
        this.f63a.setParameters(parameters);
    }

    public final void d(boolean z) {
        String flashMode;
        Camera camera = this.f63a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    oz4 oz4Var = this.c;
                    if (oz4Var != null) {
                        oz4Var.c();
                    }
                    Camera.Parameters parameters2 = this.f63a.getParameters();
                    ly9.b(parameters2, z);
                    this.g.getClass();
                    this.f63a.setParameters(parameters2);
                    oz4 oz4Var2 = this.c;
                    if (oz4Var2 != null) {
                        oz4Var2.f26087a = false;
                        oz4Var2.b();
                    }
                }
            } catch (RuntimeException e) {
                Log.e("a1a", "Failed to set torch", e);
            }
        }
    }

    public final void e() {
        Camera camera = this.f63a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new oz4(this.f63a, this.g);
        o2a o2aVar = this.g;
        ip2 ip2Var = new ip2();
        ip2Var.f15142a = this;
        ip2Var.b = new Handler();
        this.d = ip2Var;
        o2aVar.getClass();
    }
}
