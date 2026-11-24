package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy9 f16833a;

    public jnx(zy9 zy9Var) {
        this.f16833a = zy9Var;
    }

    public static int a(float f, float f2) {
        z1x.t("Focal length should be positive.", f > 0.0f);
        z1x.t("Sensor length should be positive.", f2 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
        z1x.v(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float c(c1a c1aVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        z1x.x(objC, "The focal lengths can not be empty.");
        float[] fArr = (float[]) objC;
        z1x.y("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float d(c1a c1aVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        key.getClass();
        ow9 ow9Var = (ow9) c1aVar;
        Object objC = ow9Var.c(key);
        z1x.x(objC, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) objC;
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key2.getClass();
        Object objC2 = ow9Var.c(key2);
        z1x.x(objC2, "The sensor orientation can't be null.");
        CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        key3.getClass();
        Object objC3 = ow9Var.c(key3);
        z1x.x(objC3, "The active array size can't be null.");
        Size size = (Size) objC3;
        CameraCharacteristics.Key key4 = CameraCharacteristics.SENSOR_ORIENTATION;
        key4.getClass();
        Object objC4 = ow9Var.c(key4);
        z1x.x(objC4, "The pixel array size can't be null.");
        int iIntValue = ((Number) objC4).intValue();
        Size sizeF2 = jls0.f((Rect) objC2);
        if (jls0.c(iIntValue)) {
            SizeF sizeF3 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeF2.getHeight(), sizeF2.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeF2 = size2;
            sizeF = sizeF3;
        }
        return (sizeF.getWidth() * sizeF2.getWidth()) / size.getWidth();
    }

    public final int b(c1a c1aVar) {
        zy9 zy9Var = this.f16833a;
        try {
            ArrayList arrayListA = zy9.a(zy9Var);
            z1x.x(arrayListA, "Failed to get available camera IDs");
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((g0a) it.next()).f10449a;
                c1a c1aVarB = zy9.b(zy9Var, str);
                g0a.b(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Object objC = ((ow9) c1aVarB).c(key);
                z1x.x(objC, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) g0a.b(str)));
                int iIntValue = ((Number) objC).intValue();
                ow9 ow9Var = (ow9) c1aVar;
                Object objC2 = ow9Var.c(key);
                z1x.x(objC2, "Failed to get the required LENS_FACING for " + ((Object) g0a.b(ow9Var.f25959a)));
                if (iIntValue == ((Number) objC2).intValue()) {
                    return a(c(c1aVarB), d(c1aVarB));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) g0a.b(((ow9) c1aVar).f25959a)));
        } catch (Exception e) {
            hny.q("Failed to get a valid view angle", e);
            return 0;
        }
    }
}
