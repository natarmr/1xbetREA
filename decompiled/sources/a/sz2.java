package a;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.database.Cursor;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.view.InputDevice;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class sz2 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33050a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz2(Object obj, byte b) {
        super(0);
        this.f33050a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        boolean z = true;
        switch (this.f33050a) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) ((h03) this.b).b;
                contentResolver.getClass();
                String string = Settings.Secure.getString(contentResolver, "android_id");
                string.getClass();
                return string;
            case 1:
                ((pz40) this.b).setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 2:
                oms0 oms0Var = (oms0) this.b;
                Object objY0 = oms0Var.f25519a.y0();
                azn aznVar = azn.c;
                return Boolean.valueOf(objY0 == aznVar && ((hgk0) oms0Var.d).getValue() == aznVar);
            case 3:
                ((wa3) this.b).d.getClass();
                return 0;
            case 4:
                return (xnb) this.b;
            case 5:
                piu0 piu0VarG = ((xnb) ((sz2) this.b).b).g();
                piu0VarG.getClass();
                return piu0VarG;
            case 6:
                MediaCodecList mediaCodecList = (MediaCodecList) ((rrc) this.b).b;
                mediaCodecList.getClass();
                MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
                codecInfos.getClass();
                ArrayList arrayList = new ArrayList(codecInfos.length);
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    mediaCodecInfo.getClass();
                    String name = mediaCodecInfo.getName();
                    name.getClass();
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    supportedTypes.getClass();
                    ArrayList arrayList2 = new ArrayList(supportedTypes.length);
                    for (String str : supportedTypes) {
                        arrayList2.add(String.valueOf(str));
                    }
                    arrayList.add(new im30(name, arrayList2));
                }
                return arrayList;
            case 7:
                Locale locale = Locale.US;
                xyj xyjVar = (xyj) this.b;
                String str2 = xyjVar.f41708a;
                String str3 = xyjVar.b;
                String str4 = Build.VERSION.RELEASE;
                Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                String str5 = Build.CPU_ABI;
                String str6 = Build.MANUFACTURER;
                String str7 = Build.MODEL;
                String property = System.getProperty("user.language");
                Point point = xyjVar.c;
                String str8 = String.format(locale, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{"VKAndroidSDK", str2, str3, str4, numValueOf, str5, str6, str7, property, Integer.valueOf(Math.max(point.x, point.y)), Integer.valueOf(Math.min(point.x, point.y))}, 11));
                int iCharCount = 0;
                while (iCharCount < str8.length()) {
                    int iCodePointAt = str8.codePointAt(iCharCount);
                    if (32 > iCodePointAt || iCodePointAt >= 127) {
                        f99 f99Var = new f99();
                        f99Var.b0(0, iCharCount, str8);
                        while (iCharCount < str8.length()) {
                            int iCodePointAt2 = str8.codePointAt(iCharCount);
                            f99Var.e0((32 > iCodePointAt2 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                            iCharCount += Character.charCount(iCodePointAt2);
                        }
                        return f99Var.O();
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return str8;
            case 8:
                ((heq) ((a7q) this.b).f384a).getClass();
                return jeq.NOT_SUPPORTED;
            case 9:
                iqi iqiVar = (iqi) this.b;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = (peq) ((neq) iqiVar.c).invoke();
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return new j0g0(g0g0Var);
            case 10:
                ActivityManager activityManager = (ActivityManager) ((hnu) this.b).f13365a;
                activityManager.getClass();
                ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                deviceConfigurationInfo.getClass();
                String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
                glEsVersion.getClass();
                return glEsVersion;
            case 11:
                xsu xsuVar = (xsu) this.b;
                Uri uri = Uri.parse("content://com.google.android.gsf.gservices");
                String[] strArr = {"android_id"};
                try {
                    ContentResolver contentResolver2 = (ContentResolver) xsuVar.f41434a;
                    contentResolver2.getClass();
                    Cursor cursorQuery = contentResolver2.query(uri, null, null, strArr, null);
                    cursorQuery.getClass();
                    try {
                        if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
                            throw new IllegalStateException("Check failed.");
                        }
                        String string2 = cursorQuery.getString(1);
                        string2.getClass();
                        String hexString = Long.toHexString(Long.parseLong(string2));
                        cursorQuery.close();
                        return hexString;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            bkb.E(cursorQuery, th2);
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 12:
                InputManager inputManager = (InputManager) ((svu) this.b).f32888a;
                inputManager.getClass();
                int[] inputDeviceIds = inputManager.getInputDeviceIds();
                inputDeviceIds.getClass();
                ArrayList arrayList3 = new ArrayList(inputDeviceIds.length);
                for (int i : inputDeviceIds) {
                    InputDevice inputDevice = inputManager.getInputDevice(i);
                    inputDevice.getClass();
                    String strValueOf = String.valueOf(inputDevice.getVendorId());
                    String name2 = inputDevice.getName();
                    name2.getClass();
                    arrayList3.add(new pex(name2, strValueOf));
                }
                return arrayList3;
            case 13:
                return axq.m(new StringBuilder("Internal server error occurred while executing "), ((imx) this.b).d, '.');
            case 14:
                qb00 qb00Var = (qb00) this.b;
                ar20 ar20Var = cy2.D;
                ar20 ar20Var2 = cy2.E;
                int[] iArrB = qb00Var.b(ar20Var, ar20Var2);
                ArrayList arrayList4 = qb00Var.f28423a;
                int[] iArr = new int[arrayList4.size()];
                int i2 = -1;
                for (int size = arrayList4.size() - 1; -1 < size; size--) {
                    Object obj = arrayList4.get(size);
                    obj.getClass();
                    wvq0 wvq0Var = (wvq0) obj;
                    ar20 ar20VarG = wvq0Var.g();
                    char cB = wvq0Var.b(1);
                    boolean z2 = cB == 0 || Character.isSpaceChar(cB) || CharsKt.d(cB) || ar20VarG == null;
                    if (z2) {
                        i2 = size;
                    }
                    int i3 = iArrB[size];
                    iArr[size] = Intrinsics.d(wvq0Var.e(), ar20Var) ? (i3 == -1 || i3 > i2) ? -1 : iArr[i3] : (z2 || Intrinsics.d(ar20VarG, ar20Var2)) ? size : iArr[size + 1];
                }
                return iArr;
            case 15:
                xc00 xc00Var = (xc00) this.b;
                if (!vvw.y(xc00Var)) {
                    for (j jVar : xc00Var.e) {
                        if (!Intrinsics.d(jVar.f15657a, wb.p) || !vvw.y(jVar)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                List list = rnh0.b;
                return g8x.A(((dw00) this.b).b);
            case 17:
                if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
                    jf4.n("UI thread");
                    return null;
                }
                kf60 kf60Var = (kf60) this.b;
                tvt0 tvt0Var = (tvt0) ((wut0) kf60Var.f18184a.b).f;
                tvt0Var.getClass();
                OkHttpClient.Builder builderB = tvt0Var.a().b();
                if (vv00.NONE != ((wut0) kf60Var.f18184a.b).g.f11832a.getValue()) {
                    wut0 wut0Var = (wut0) kf60Var.f18184a.b;
                    boolean z3 = wut0Var.k;
                    gsj gsjVar = wut0Var.g;
                    yvj yvjVar = wut0Var.h;
                    gsjVar.getClass();
                    yvjVar.getClass();
                    builderB.c.add(new dw00(z3, gsjVar, yvjVar));
                }
                tvt0Var.f34619a = new OkHttpClient(builderB);
                return ((wut0) ((kf60) this.b).f18184a.b).f;
            case 18:
                return (List) this.b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return axq.m(new StringBuilder("Section temporary unavailable for "), ((imx) this.b).d, '.');
            case 20:
                SensorManager sensorManager = (SensorManager) ((eyg0) this.b).b;
                sensorManager.getClass();
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                sensorList.getClass();
                ArrayList arrayList5 = new ArrayList(r3d.q(sensorList, 10));
                for (Sensor sensor : sensorList) {
                    sensor.getClass();
                    String name3 = sensor.getName();
                    name3.getClass();
                    String vendor = sensor.getVendor();
                    vendor.getClass();
                    arrayList5.add(new nfi0(name3, vendor));
                }
                return arrayList5;
            case 21:
                return ((Context) this.b).getSharedPreferences("rate_limit_backoff_storage", 0);
            default:
                jdg0 jdg0Var = new jdg0(2);
                jdg0Var.b(((wut0) this.b).w.toArray(new mvj[0]));
                jdg0Var.a(new mvj());
                ArrayList arrayList6 = jdg0Var.b;
                return new ktf0(q3d.j(arrayList6.toArray(new mvj[arrayList6.size()])));
        }
    }
}
