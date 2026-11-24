package a;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.fingerprint.impl.JniProfiler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r7w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29998a;
    public final /* synthetic */ x7w0 b;

    public /* synthetic */ r7w0(x7w0 x7w0Var, byte b) {
        this.f29998a = b;
        this.b = x7w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.n7w0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object g0g0Var;
        ?? arrayList;
        ?? arrayList2;
        String strD;
        String strD2;
        u8w0 u8w0Var;
        List<Sensor> sensorList;
        List<Sensor> sensorList2;
        u8w0 u8w0Var2;
        Object g0g0Var2;
        u8w0 u8w0Var3;
        byte b = this.f29998a;
        String strD3 = null;
        x7w0 x7w0Var = this.b;
        ?? r12 = (n7w0) obj;
        switch (b) {
            case 0:
                r12.getClass();
                p44 p44VarA = x7w0Var.e.a();
                r12.a(p44VarA != null ? Integer.valueOf(p44VarA.f26332a) : null, "sharingMode");
                r12.a(p44VarA != null ? Integer.valueOf(p44VarA.b) : null, "framesPerBurst");
                r12.a(p44VarA != null ? Integer.valueOf(p44VarA.c) : null, "bufferCapacity");
                r12.a(p44VarA != null ? Integer.valueOf(p44VarA.d) : null, "sampleRate");
                break;
            case 1:
                r12.getClass();
                us00 us00Var = x7w0Var.f40435a;
                r12.a(Integer.valueOf(Settings.Secure.getInt(us00Var.getContentResolver(), "accessibility_enabled", 0)), "accessibilityEnabled");
                r12.a(Integer.valueOf(Settings.Global.getInt(us00Var.getContentResolver(), "development_settings_enabled", 0)), "devSettingsEnabled");
                boolean z = Settings.Global.getInt(us00Var.getContentResolver(), "adb_enabled", 0) > 0;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = Boolean.valueOf(Settings.Global.getInt(us00Var.getContentResolver(), "adb_wifi_enabled", 0) > 0);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Boolean bool = Boolean.FALSE;
                boolean z2 = g0g0Var instanceof g0g0;
                Object obj2 = g0g0Var;
                if (z2) {
                    obj2 = bool;
                }
                r12.a(Boolean.valueOf(z || ((Boolean) obj2).booleanValue()), "adbEnabled");
                break;
            case 2:
                r12.getClass();
                Object systemService = x7w0Var.b.f20325a.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                List<InputMethodInfo> enabledInputMethodList = inputMethodManager != null ? inputMethodManager.getEnabledInputMethodList() : null;
                if (enabledInputMethodList == null) {
                    enabledInputMethodList = iun.f15405a;
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(enabledInputMethodList, 10));
                Iterator it = enabledInputMethodList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((InputMethodInfo) it.next()).getPackageName());
                }
                r12.a(arrayList3, "packageNames");
                r12.a(Float.valueOf(Resources.getSystem().getConfiguration().fontScale), "fontScale");
                break;
            case 3:
                r12.getClass();
                ln4 ln4Var = x7w0Var.b;
                Object systemService2 = ln4Var.f20325a.getSystemService("sensor");
                SensorManager sensorManager = systemService2 instanceof SensorManager ? (SensorManager) systemService2 : null;
                if (sensorManager == null || (sensorList2 = sensorManager.getSensorList(-1)) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(r3d.q(sensorList2, 10));
                    for (Sensor sensor : sensorList2) {
                        arrayList.add(sensor.getName() + ':' + sensor.getVendor() + ':' + sensor.getVersion());
                    }
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                r12.a(arrayList, "sensorFingerprint");
                Object systemService3 = ln4Var.f20325a.getSystemService("sensor");
                SensorManager sensorManager2 = systemService3 instanceof SensorManager ? (SensorManager) systemService3 : null;
                if (sensorManager2 == null || (sensorList = sensorManager2.getSensorList(-1)) == null) {
                    arrayList2 = 0;
                } else {
                    arrayList2 = new ArrayList(r3d.q(sensorList, 10));
                    Iterator it2 = sensorList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Sensor) it2.next()).getName());
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                r12.a(arrayList2, "collectSensorSample");
                y8w0 y8w0Var = x7w0Var.f;
                if (y8w0Var != null) {
                    u8w0 u8w0Var4 = y8w0Var.f42215a;
                    uby ubyVar = vby.d;
                    ubyVar.getClass();
                    strD = ubyVar.d(u8w0.Companion.serializer(), u8w0Var4);
                } else {
                    strD = null;
                }
                r12.a(strD, "accelerometer");
                y8w0 y8w0Var2 = x7w0Var.f;
                if (y8w0Var2 == null || (u8w0Var = y8w0Var2.b) == null) {
                    strD2 = null;
                } else {
                    uby ubyVar2 = vby.d;
                    ubyVar2.getClass();
                    strD2 = ubyVar2.d(u8w0.Companion.serializer(), u8w0Var);
                }
                r12.a(strD2, "gyroscope");
                y8w0 y8w0Var3 = x7w0Var.f;
                if (y8w0Var3 != null) {
                    u8w0 u8w0Var5 = y8w0Var3.c;
                    uby ubyVar3 = vby.d;
                    ubyVar3.getClass();
                    strD3 = ubyVar3.d(u8w0.Companion.serializer(), u8w0Var5);
                }
                r12.a(strD3, "magnetometer");
                break;
            case 4:
                r12.getClass();
                y8w0 y8w0Var4 = x7w0Var.f;
                r12.a(y8w0Var4 != null ? Float.valueOf(y8w0Var4.d) : null, "azimuth");
                y8w0 y8w0Var5 = x7w0Var.f;
                r12.a(y8w0Var5 != null ? Float.valueOf(y8w0Var5.e) : null, "pitch");
                y8w0 y8w0Var6 = x7w0Var.f;
                r12.a(y8w0Var6 != null ? Float.valueOf(y8w0Var6.f) : null, "roll");
                y8w0 y8w0Var7 = x7w0Var.f;
                String string = Arrays.toString(y8w0Var7 != null ? y8w0Var7.f42215a.g : null);
                string.getClass();
                r12.a(string, "accelerometer.values");
                y8w0 y8w0Var8 = x7w0Var.f;
                String string2 = Arrays.toString((y8w0Var8 == null || (u8w0Var2 = y8w0Var8.b) == null) ? null : u8w0Var2.g);
                string2.getClass();
                r12.a(string2, "gyroscope.values");
                y8w0 y8w0Var9 = x7w0Var.f;
                String string3 = Arrays.toString(y8w0Var9 != null ? y8w0Var9.c.g : null);
                string3.getClass();
                r12.a(string3, "magnetometer.values");
                break;
            case 5:
                r12.getClass();
                ln4 ln4Var2 = x7w0Var.b;
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    Object systemService4 = ln4Var2.f20325a.getSystemService("activity");
                    systemService4.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) systemService4).getMemoryInfo(memoryInfo);
                    g0g0Var2 = String.valueOf(memoryInfo.availMem);
                } catch (Throwable th2) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                boolean z3 = g0g0Var2 instanceof g0g0;
                Object obj3 = g0g0Var2;
                if (z3) {
                    obj3 = "unknown";
                }
                r12.a((String) obj3, "availRam");
                break;
            case 6:
                r12.getClass();
                aby abyVarA = JniProfiler.a(x7w0Var.c);
                r12.a(abyVarA != null ? 100000 : null, "iterations");
                r12.a(abyVarA != null ? Double.valueOf(abyVarA.f601a) : null, "averageTimeNs");
                r12.a(abyVarA != null ? Boolean.valueOf(abyVarA.b) : null, "isHookSuspected");
                break;
            default:
                r12.getClass();
                y8w0 y8w0Var10 = x7w0Var.g;
                r12.a(y8w0Var10 != null ? Float.valueOf(y8w0Var10.d) : null, "azimuth");
                y8w0 y8w0Var11 = x7w0Var.g;
                r12.a(y8w0Var11 != null ? Float.valueOf(y8w0Var11.e) : null, "pitch");
                y8w0 y8w0Var12 = x7w0Var.g;
                r12.a(y8w0Var12 != null ? Float.valueOf(y8w0Var12.f) : null, "roll");
                y8w0 y8w0Var13 = x7w0Var.g;
                String string4 = Arrays.toString(y8w0Var13 != null ? y8w0Var13.f42215a.g : null);
                string4.getClass();
                r12.a(string4, "accelerometer.values");
                y8w0 y8w0Var14 = x7w0Var.g;
                String string5 = Arrays.toString((y8w0Var14 == null || (u8w0Var3 = y8w0Var14.b) == null) ? null : u8w0Var3.g);
                string5.getClass();
                r12.a(string5, "gyroscope.values");
                y8w0 y8w0Var15 = x7w0Var.g;
                String string6 = Arrays.toString(y8w0Var15 != null ? y8w0Var15.c.g : null);
                string6.getClass();
                r12.a(string6, "magnetometer.values");
                break;
        }
        return Unit.f46060a;
    }
}
