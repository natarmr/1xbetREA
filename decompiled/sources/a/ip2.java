package a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ip2 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1a f15142a;
    public Handler b;

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.b;
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f <= 45.0f) {
            handler.post(new hp2((Object) this, true, (byte) 0));
        } else if (f >= 450.0f) {
            handler.post(new hp2((Object) this, z, (byte) 0));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
