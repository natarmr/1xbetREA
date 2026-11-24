package a;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import kotlin.Unit;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes5.dex */
public final class rkt0 implements h5v0, fz5, OnCompleteListener, zuw0, jix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30665a;
    public final Object b;

    public rkt0(us00 us00Var) {
        this.f30665a = (byte) 9;
        Object systemService = us00Var.getSystemService("sensor");
        systemService.getClass();
        this.b = (SensorManager) systemService;
    }

    public static rkt0 h(int i) {
        return new rkt0(icw0.a(s7x0.a(i)), (byte) 11);
    }

    public static rkt0 i(String str) {
        return new rkt0((TextUtils.isEmpty(str) || str.length() > 1) ? tyw0.UNINITIALIZED : xyw0.e(str.charAt(0)), (byte) 12);
    }

    public Object a(int i, a9w0 a9w0Var) {
        n5a n5aVar = new n5a(1, pnx.b(a9w0Var));
        n5aVar.r();
        SensorManager sensorManager = (SensorManager) this.b;
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor == null) {
            e0g0 e0g0Var = j0g0.b;
            u8w0.Companion.getClass();
            n5aVar.resumeWith(new u8w0("", "", 0, 0.0f, 0.0f, 0.0f, new float[0]));
        } else {
            o4w0 o4w0Var = new o4w0(this, n5aVar, defaultSensor);
            sensorManager.registerListener(o4w0Var, defaultSensor, 3);
            n5aVar.t(new xlr0(this, o4w0Var, (byte) 13));
        }
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    @Override // a.fz5
    public void b(ConnectionResult connectionResult) {
        ((rav) this.b).b(connectionResult);
    }

    @Override // a.zuw0
    public /* synthetic */ void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((m6x0) this.b).y(str, i, th, bArr, map);
    }

    @Override // a.h5v0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) rq8.G(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(zje zjeVar) {
        a9w0 a9w0Var;
        u8w0 u8w0Var;
        u8w0 u8w0Var2;
        Object objA;
        u8w0 u8w0Var3;
        u8w0 u8w0Var4;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (zjeVar instanceof a9w0) {
            a9w0Var = (a9w0) zjeVar;
            int i = a9w0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                a9w0Var.m = i - Integer.MIN_VALUE;
            } else {
                a9w0Var = new a9w0(this, zjeVar);
            }
        } else {
            a9w0Var = new a9w0(this, zjeVar);
        }
        Object objA2 = a9w0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = a9w0Var.m;
        if (i2 == 0) {
            z1x.P(objA2);
            a9w0Var.m = 1;
            objA2 = a(1, a9w0Var);
            if (objA2 != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objA2);
        } else {
            if (i2 == 2) {
                u8w0Var = a9w0Var.i;
                z1x.P(objA2);
                u8w0Var2 = (u8w0) objA2;
                a9w0Var.i = u8w0Var;
                a9w0Var.j = u8w0Var2;
                a9w0Var.m = 3;
                objA = a(2, a9w0Var);
                if (objA != wneVar) {
                    u8w0Var3 = u8w0Var2;
                    u8w0Var4 = u8w0Var;
                    objA2 = objA;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u8w0 u8w0Var5 = a9w0Var.j;
            u8w0 u8w0Var6 = a9w0Var.i;
            z1x.P(objA2);
            u8w0Var3 = u8w0Var5;
            u8w0Var4 = u8w0Var6;
        }
        u8w0 u8w0Var7 = (u8w0) objA2;
        fArr = u8w0Var4.g;
        fArr2 = u8w0Var7.g;
        if (fArr.length != 3) {
            fArr3 = new float[]{Float.NaN, Float.NaN, Float.NaN};
        } else if (fArr2.length == 3) {
            fArr4 = new float[9];
            if (SensorManager.getRotationMatrix(fArr4, new float[9], fArr, fArr2)) {
                float[] fArr5 = new float[3];
                SensorManager.getOrientation(fArr4, fArr5);
                fArr3 = new float[]{(float) Math.toDegrees(fArr5[0]), (float) Math.toDegrees(fArr5[1]), (float) Math.toDegrees(fArr5[2])};
            } else {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                fArr3 = new float[]{Float.NaN, (float) Math.toDegrees(Math.atan2(-f, Math.sqrt((f3 * f3) + (f2 * f2)))), (float) Math.toDegrees(Math.atan2(f2, f3))};
            }
        } else {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[2];
            fArr3 = new float[]{Float.NaN, (float) Math.toDegrees(Math.atan2(-f4, Math.sqrt((f6 * f6) + (f5 * f5)))), (float) Math.toDegrees(Math.atan2(f5, f6))};
        }
        return new y8w0(u8w0Var4, u8w0Var3, u8w0Var7, fArr3[0], fArr3[1], fArr3[2]);
        u8w0 u8w0Var8 = (u8w0) objA2;
        a9w0Var.i = u8w0Var8;
        a9w0Var.m = 2;
        Object objA3 = a(4, a9w0Var);
        if (objA3 != wneVar) {
            u8w0Var = u8w0Var8;
            objA2 = objA3;
            u8w0Var2 = (u8w0) objA2;
            a9w0Var.i = u8w0Var;
            a9w0Var.j = u8w0Var2;
            a9w0Var.m = 3;
            objA = a(2, a9w0Var);
            if (objA != wneVar) {
                u8w0Var3 = u8w0Var2;
                u8w0Var4 = u8w0Var;
                objA2 = objA;
                u8w0 u8w0Var9 = (u8w0) objA2;
                fArr = u8w0Var4.g;
                fArr2 = u8w0Var9.g;
                if (fArr.length != 3) {
                    fArr3 = new float[]{Float.NaN, Float.NaN, Float.NaN};
                } else if (fArr2.length == 3) {
                    fArr4 = new float[9];
                    if (SensorManager.getRotationMatrix(fArr4, new float[9], fArr, fArr2)) {
                        float[] fArr6 = new float[3];
                        SensorManager.getOrientation(fArr4, fArr6);
                        fArr3 = new float[]{(float) Math.toDegrees(fArr6[0]), (float) Math.toDegrees(fArr6[1]), (float) Math.toDegrees(fArr6[2])};
                    } else {
                        float f7 = fArr[0];
                        float f8 = fArr[1];
                        float f9 = fArr[2];
                        fArr3 = new float[]{Float.NaN, (float) Math.toDegrees(Math.atan2(-f7, Math.sqrt((f9 * f9) + (f8 * f8)))), (float) Math.toDegrees(Math.atan2(f8, f9))};
                    }
                } else {
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    float f12 = fArr[2];
                    fArr3 = new float[]{Float.NaN, (float) Math.toDegrees(Math.atan2(-f10, Math.sqrt((f12 * f12) + (f11 * f11)))), (float) Math.toDegrees(Math.atan2(f11, f12))};
                }
                return new y8w0(u8w0Var4, u8w0Var3, u8w0Var9, fArr3[0], fArr3[1], fArr3[2]);
            }
        }
        return wneVar;
    }

    public Object e(wt20 wt20Var, mt00 mt00Var) {
        Object objW0;
        wne wneVar = wne.f39444a;
        long j = wt20Var.f39719a;
        boolean z = wt20Var.d;
        eio eioVar = ((q430) this.b).f28079a;
        int i = wt20Var.c;
        yje yjeVar = null;
        if (i != 0 || z) {
            ut20 ut20Var = new ut20(i, j, z);
            tt20 tt20VarA = eioVar.a();
            objW0 = sj3.w0(mt00Var, tt20VarA.f34491a, new v620((Object) tt20VarA, (Object) ut20Var, yjeVar, (byte) 28), false, true);
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
        } else {
            objW0 = sj3.w0(mt00Var, eioVar.a().f34491a, new hu6(j, yjeVar, (byte) 7), false, true);
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public void f(smi0 smi0Var) {
        lmi0 lmi0Var = (lmi0) ((pmi0) this.b).f27236a;
        lmi0Var.getClass();
        p7m0 p7m0Var = (p7m0) lmi0Var.a();
        p7m0Var.getClass();
        p7m0Var.o(null, smi0Var);
        vwb0 vwb0Var = lmi0Var.b;
        vby vbyVar = lmi0Var.f20297a;
        vbyVar.getClass();
        vwb0Var.h("SAVED_TIMER_STATUS_KEY", vbyVar.d(smi0.Companion.serializer(), smi0Var));
    }

    public void g(boolean z) {
        byte b = this.f30665a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bad) ((cad) obj).b).f2252a.o(null, Boolean.valueOf(z));
                break;
            default:
                x2c0 x2c0Var = ((b3c0) obj).b;
                m2c0 m2c0VarA = x2c0Var.a();
                if (m2c0VarA != null) {
                    x2c0Var.f40159a.o(null, m2c0.a(m2c0VarA, null, 0, z, -2097153, 255));
                    break;
                }
                break;
        }
    }

    @Override // a.h5v0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) rq8.G(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // a.h5v0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) rq8.G(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // a.h5v0
    public String[] k() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        n0x0 n0x0Var = (n0x0) this.b;
        if (task.isCanceled()) {
            n0x0Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            n0x0Var.m(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            n0x0Var.n(exception);
        } else {
            v4i0.e();
        }
    }

    @Override // a.jix0
    public Object zza(String str) {
        return ((lix0) this.b).b(str, null);
    }

    public /* synthetic */ rkt0(Object obj, byte b) {
        this.f30665a = b;
        this.b = obj;
    }

    public rkt0(b3c0 b3c0Var) {
        this.f30665a = (byte) 3;
        b3c0Var.getClass();
        this.b = b3c0Var;
    }

    public rkt0(gii0 gii0Var) {
        this.f30665a = (byte) 6;
        gii0Var.getClass();
        this.b = new lkr0(gii0Var, (byte) 18);
    }
}
