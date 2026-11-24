package a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class o4w0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rkt0 f24660a;
    public final /* synthetic */ n5a b;
    public final /* synthetic */ Sensor c;

    public o4w0(rkt0 rkt0Var, n5a n5aVar, Sensor sensor) {
        this.f24660a = rkt0Var;
        this.b = n5aVar;
        this.c = sensor;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        ((SensorManager) this.f24660a.b).unregisterListener(this);
        Sensor sensor = this.c;
        String name = sensor.getName();
        name.getClass();
        String vendor = sensor.getVendor();
        vendor.getClass();
        int version = sensor.getVersion();
        float power = sensor.getPower();
        float maximumRange = sensor.getMaximumRange();
        float resolution = sensor.getResolution();
        float[] fArr = sensorEvent.values;
        fArr.getClass();
        u8w0 u8w0Var = new u8w0(name, vendor, version, power, maximumRange, resolution, Arrays.copyOf(fArr, fArr.length));
        e0g0 e0g0Var = j0g0.b;
        this.b.resumeWith(u8w0Var);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
