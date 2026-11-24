package a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qxk0 extends GLSurfaceView {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f29488a;
    public final SensorManager b;
    public final Sensor c;
    public final ra80 d;
    public final Handler e;
    public final e2h0 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public qxk0(Context context) {
        super(context, null);
        this.f29488a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        e2h0 e2h0Var = new e2h0();
        this.f = e2h0Var;
        pxk0 pxk0Var = new pxk0(this, e2h0Var);
        View.OnTouchListener gwr0Var = new gwr0(context, pxk0Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new ra80(windowManager.getDefaultDisplay(), gwr0Var, pxk0Var);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(pxk0Var);
        setOnTouchListener(gwr0Var);
    }

    public final void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        ra80 ra80Var = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(ra80Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(ra80Var);
        }
        this.k = z;
    }

    public d1a getCameraMotionListener() {
        return this.f;
    }

    public seu0 getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new apj0((Object) this, (byte) 2));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
