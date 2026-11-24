package a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xvk {
    public static final pek g = new pek();
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 240);
    public static final Size j = new Size(640, Response.TEMPORARILY_UNAVAILABLE);
    public static volatile xvk k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zx10 f41564a = new zx10();
    public final psc b = new psc((byte) 26);
    public final Object c = new Object();
    public volatile Display[] d;
    public final DisplayManager e;
    public volatile Size f;

    public xvk(Context context) {
        wvk wvkVar = new wvk(this, (byte) 0);
        Object systemService = context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(wvkVar, new Handler(Looper.getMainLooper()));
        this.e = displayManager;
    }

    public final Size a() {
        Size sizeB;
        Size size;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (v7k0.a(size2) < v7k0.a(i)) {
            if (((SmallDisplaySizeQuirk) this.b.b) != null) {
                Map map = SmallDisplaySizeQuirk.f45325a;
                String str = Build.MODEL;
                str.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Object obj = map.get(upperCase);
                obj.getClass();
                size = (Size) obj;
            } else {
                size = null;
            }
            if (size == null) {
                size = j;
            }
            size2 = size;
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        Size size3 = h;
        if (v7k0.a(size3) < v7k0.a(size2)) {
            size2 = size3;
        }
        zx10 zx10Var = this.f41564a;
        zx10Var.getClass();
        if (((ExtraCroppingQuirk) zx10Var.f45137a) != null && (sizeB = ExtraCroppingQuirk.b(vln0.f37634a)) != null) {
            if (sizeB.getHeight() * sizeB.getWidth() > size2.getHeight() * size2.getWidth()) {
                return sizeB;
            }
        }
        return size2;
    }

    public final Display b(boolean z) {
        Display[] displays;
        int i2;
        synchronized (this.c) {
            displays = this.d;
            if (displays == null) {
                displays = this.e.getDisplays();
                this.d = displays;
                displays.getClass();
            }
        }
        if (displays.length == 1) {
            return displays[0];
        }
        int i3 = -1;
        int i4 = -1;
        Display display = null;
        Display display2 = null;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            int i5 = point.x * point.y;
            if (i5 > i3) {
                display = display3;
                i3 = i5;
            }
            if (display3.getState() != 1 && (i2 = point.x * point.y) > i4) {
                display2 = display3;
                i4 = i2;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String string = Arrays.toString(displays);
        string.getClass();
        udk.a(33, "No displays found from ", string);
        return null;
    }

    public final Size c() {
        synchronized (this.c) {
            if (this.f != null) {
                Size size = this.f;
                size.getClass();
                return size;
            }
            this.f = a();
            Size size2 = this.f;
            size2.getClass();
            return size2;
        }
    }
}
