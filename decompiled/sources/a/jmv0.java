package a;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.hardware.display.DisplayManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.fingerprint.impl.MathTribunal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jmv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16785a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jmv0(Object obj, byte b) {
        this.f16785a = b;
        this.b = obj;
    }

    private final Object a() {
        oxv0 oxv0Var = (oxv0) this.b;
        ((hgk0) ((pz40) oxv0Var.f.f21959a)).setValue(Boolean.FALSE);
        oxv0Var.h = 0.0f;
        return Unit.f46060a;
    }

    private final Object b() {
        return (ywv0) ((hgk0) ((txv0) this.b).e.f22524a).getValue();
    }

    private final Object c() {
        cyv0 cyv0Var = (cyv0) this.b;
        sxs0 sxs0Var = cyv0.O1;
        gdv0 gdv0Var = new gdv0((Object) cyv0Var, (byte) 6);
        uqv0 uqv0Var = new uqv0((Object) cyv0Var, (byte) 3);
        ayv0 ayv0Var = new ayv0();
        gbn gbnVarB = zjb.B(gdv0Var);
        dp dpVar = ayv0Var.d;
        dpVar.b(gbnVarB);
        dpVar.b(gkb.T(gdv0Var));
        dpVar.b(e3c.y(gdv0Var));
        byte b = 16;
        dpVar.b(new gbn(new i9v0(b), new fyv0(3, (byte) 0), new zfv0(gdv0Var, uqv0Var, b), mnu0.i));
        return ayv0Var;
    }

    private final Object g() {
        wzv0 wzv0Var = (wzv0) this.b;
        wxs0 wxs0Var = wzv0.O1;
        gdv0 gdv0Var = new gdv0((Object) wzv0Var, (byte) 7);
        uqv0 uqv0Var = new uqv0((Object) wzv0Var, (byte) 5);
        szv0 szv0Var = new szv0();
        gbn gbnVarL = k9x.L(gdv0Var);
        dp dpVar = szv0Var.d;
        dpVar.b(gbnVarL);
        dpVar.b(gkb.T(gdv0Var));
        dpVar.b(e3c.y(gdv0Var));
        dpVar.b(pym0.k(gdv0Var, uqv0Var));
        return szv0Var;
    }

    private final Object h() {
        return Boolean.valueOf(((j1w0) ((o1w0) this.b).g.getValue()).f15757a);
    }

    private final Object i() {
        return (c2w0) ((azj0) ((afm0) this.b).b).d(sre0.f32672a.b(c2w0.class));
    }

    private final Object l() {
        c1a c1aVar = ((g4w0) this.b).f10689a;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        if (objC != null) {
            return (StreamConfigurationMap) objC;
        }
        jf4.n("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0587  */
    /* JADX WARN: Code duplicated, block: B:110:0x0660  */
    /* JADX WARN: Code duplicated, block: B:113:0x0671  */
    /* JADX WARN: Code duplicated, block: B:114:0x0675  */
    /* JADX WARN: Code duplicated, block: B:116:0x067f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0682  */
    /* JADX WARN: Code duplicated, block: B:119:0x0685  */
    /* JADX WARN: Code duplicated, block: B:120:0x068b  */
    /* JADX WARN: Code duplicated, block: B:122:0x068e  */
    /* JADX WARN: Code duplicated, block: B:128:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0743  */
    /* JADX WARN: Code duplicated, block: B:133:0x0749  */
    /* JADX WARN: Code duplicated, block: B:136:0x0759  */
    /* JADX WARN: Code duplicated, block: B:138:0x075f  */
    /* JADX WARN: Code duplicated, block: B:141:0x076f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0775  */
    /* JADX WARN: Code duplicated, block: B:146:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x0892  */
    /* JADX WARN: Code duplicated, block: B:162:0x0895  */
    /* JADX WARN: Code duplicated, block: B:165:0x089d  */
    /* JADX WARN: Code duplicated, block: B:166:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:169:0x098d A[LOOP:1: B:168:0x098b->B:169:0x098d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x028b  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0340 A[Catch: all -> 0x03b9, TryCatch #7 {all -> 0x03b9, blocks: (B:72:0x033a, B:74:0x0340, B:76:0x036a, B:78:0x0374, B:80:0x0381, B:82:0x038b, B:84:0x0398, B:86:0x03a2), top: B:267:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x036a A[Catch: all -> 0x03b9, TryCatch #7 {all -> 0x03b9, blocks: (B:72:0x033a, B:74:0x0340, B:76:0x036a, B:78:0x0374, B:80:0x0381, B:82:0x038b, B:84:0x0398, B:86:0x03a2), top: B:267:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0372  */
    /* JADX WARN: Code duplicated, block: B:80:0x0381 A[Catch: all -> 0x03b9, TryCatch #7 {all -> 0x03b9, blocks: (B:72:0x033a, B:74:0x0340, B:76:0x036a, B:78:0x0374, B:80:0x0381, B:82:0x038b, B:84:0x0398, B:86:0x03a2), top: B:267:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0389  */
    /* JADX WARN: Code duplicated, block: B:84:0x0398 A[Catch: all -> 0x03b9, TryCatch #7 {all -> 0x03b9, blocks: (B:72:0x033a, B:74:0x0340, B:76:0x036a, B:78:0x0374, B:80:0x0381, B:82:0x038b, B:84:0x0398, B:86:0x03a2), top: B:267:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:85:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0410  */
    /* JADX WARN: Code duplicated, block: B:94:0x0413  */
    /* JADX WARN: Code duplicated, block: B:96:0x0417  */
    /* JADX WARN: Code duplicated, block: B:97:0x041a  */
    /* JADX WARN: Code duplicated, block: B:98:0x041d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0420  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dwv0 bwv0Var;
        Object g0g0Var;
        Object g0g0Var2;
        String str;
        ln4 ln4Var;
        PackageInfo packageInfo;
        Object g0g0Var3;
        Object obj;
        Map map;
        Map map2;
        Object g0g0Var4;
        Object obj2;
        int i;
        String str2;
        String property;
        CameraManager cameraManager;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        DisplayMetrics displayMetrics;
        int iD;
        String str3;
        Object g0g0Var5;
        String property2;
        Object systemService;
        DisplayManager displayManager;
        Display display;
        Object obj3;
        Display.Mode[] supportedModes;
        Object obj4;
        String string;
        Object obj5;
        String string2;
        Object obj6;
        String string3;
        Object obj7;
        String string4;
        String language;
        String string5;
        String id;
        String string6;
        ti30 ti30VarA;
        String str4;
        Double dValueOf;
        ArrayList arrayList7;
        int i2;
        String[] cameraIdList;
        int length;
        int i3;
        float[] fArr;
        String string7;
        float[] fArr2;
        String string8;
        int[] iArr;
        String string9;
        byte b = this.f16785a;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                wxs0 wxs0Var = lmv0.P1;
                fiu0 fiu0Var = ((lmv0) obj8).M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kys0 kys0Var = hnv0.Q1;
                fiu0 fiu0Var2 = ((hnv0) obj8).N1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                xyn.a((qov0) obj8);
                return Unit.f46060a;
            case 3:
                cpv0 cpv0Var = (cpv0) obj8;
                WorkDatabase workDatabase = cpv0Var.c;
                Context context = cpv0Var.f4768a;
                String str5 = x9o0.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    fby.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListC = x9o0.c(context, jobScheduler);
                if (arrayListC != null && !arrayListC.isEmpty()) {
                    Iterator it = arrayListC.iterator();
                    while (it.hasNext()) {
                        x9o0.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) kpb.h0(workDatabase.y().f36087a, false, true, new ejv0((byte) 12))).intValue();
                m2h0.b(cpv0Var.b, workDatabase, cpv0Var.e);
                return Unit.f46060a;
            case 4:
                return ((Worker) obj8).c();
            case 5:
                hsv0 hsv0Var = (hsv0) obj8;
                u950 u950Var = hsv0Var.c;
                if (u950Var != null && u950Var.f35267a.size() > 1) {
                    hsv0Var.b((rb50) u950Var.remove(q3d.i(u950Var)));
                }
                return Unit.f46060a;
            case 6:
                etv0 etv0Var = (etv0) obj8;
                zvv0 zvv0Var = (zvv0) ((hgk0) ((l7m0) etv0Var.q.g.b)).getValue();
                xcz xczVar = etv0Var.p;
                if (xczVar == null) {
                    bwv0Var = new cwv0(zvv0Var.d.f24069a, etv0Var.o.j.a(), etv0Var.o.d(), etv0Var.o.c());
                } else {
                    mcz mczVarJ = xczVar.j();
                    xczVar.d();
                    if (((bvv0) mbc.R(etv0Var, os00.f25761a)) != null) {
                        mczVarJ.h();
                    }
                    bwv0Var = new bwv0(mczVarJ, xczVar.j.a(), xczVar.d(), xczVar.c());
                }
                return new awv0(bwv0Var, zvv0Var, (etv0Var.r && (etv0Var.q.j.g() || etv0Var.q.f.b())) ? false : true);
            case 7:
                ((hgk0) ((pz40) ((mkt0) ((vkr0) obj8).c).b)).setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 8:
                ywv0 ywv0Var = ((qwv0) obj8).f29454a;
                pkk0 pkk0Var = (pkk0) ((hgk0) ywv0Var.f43392a.g).getValue();
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                wpq wpqVar = (wpq) ((hgk0) ywv0Var.f43392a.h).getValue();
                if (wpqVar != null) {
                    ((ypq) wpqVar).b(true);
                }
                return Unit.f46060a;
            case 9:
                return ((fht0) obj8).f();
            case 10:
                return Boolean.valueOf(((mkt0) ((pzu) obj8).f).b());
            case 11:
                return a();
            case 12:
                return b();
            case 13:
                return c();
            case 14:
                return g();
            case 15:
                return h();
            case 16:
                return i();
            case 17:
                return l();
            default:
                x7w0 x7w0Var = (x7w0) obj8;
                ln4 ln4Var2 = x7w0Var.b;
                us00 us00Var = ln4Var2.f20325a;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                displayMetrics2.getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = new StatFs(Environment.getDataDirectory().getPath());
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                StatFs statFs = (StatFs) g0g0Var;
                try {
                    g0g0Var2 = us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), 0);
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = null;
                }
                PackageInfo packageInfo2 = (PackageInfo) g0g0Var2;
                try {
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    if (Intrinsics.d(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                        map = lun.f20680a;
                        map.getClass();
                        str = "null";
                        ln4Var = ln4Var2;
                        packageInfo = packageInfo2;
                        map2 = map;
                    } else {
                        int[] iArr2 = new int[2];
                        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 0);
                        eGLDisplayEglGetDisplay.getClass();
                        str = "null";
                        try {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            if (eGLConfig == null) {
                                lun lunVar = lun.f20680a;
                                lunVar.getClass();
                                map2 = lunVar;
                                ln4Var = ln4Var2;
                                packageInfo = packageInfo2;
                            } else {
                                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                                ln4Var = ln4Var2;
                                try {
                                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                                    packageInfo = packageInfo2;
                                    try {
                                        g0g0Var3 = xp20.f(new Pair("vendor", GLES20.glGetString(7936)), new Pair("renderer", GLES20.glGetString(7937)), new Pair("version", GLES20.glGetString(7938)));
                                        eGLSurfaceEglCreatePbufferSurface.getClass();
                                        eGLContextEglCreateContext.getClass();
                                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        e0g0 e0g0Var4 = j0g0.b;
                                        g0g0Var3 = new g0g0(th);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    packageInfo = packageInfo2;
                                    e0g0 e0g0Var5 = j0g0.b;
                                    g0g0Var3 = new g0g0(th);
                                    obj = lun.f20680a;
                                    obj.getClass();
                                    if (g0g0Var3 instanceof g0g0) {
                                        g0g0Var3 = obj;
                                    }
                                    map = (Map) g0g0Var3;
                                    map2 = map;
                                    Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                                    Object objInvoke = method.invoke(null, "ro.kernel.qemu");
                                    objInvoke.getClass();
                                    Pair pair = new Pair("kernelQemu", (String) objInvoke);
                                    Object objInvoke2 = method.invoke(null, "ro.hardware");
                                    objInvoke2.getClass();
                                    Pair pair2 = new Pair("hardware", (String) objInvoke2);
                                    Object objInvoke3 = method.invoke(null, "ro.product.board");
                                    objInvoke3.getClass();
                                    Pair pair3 = new Pair("board", (String) objInvoke3);
                                    Object objInvoke4 = method.invoke(null, "ro.product.device");
                                    objInvoke4.getClass();
                                    Pair pair4 = new Pair("device", (String) objInvoke4);
                                    Object objInvoke5 = method.invoke(null, "ro.product.name");
                                    objInvoke5.getClass();
                                    Pair pair5 = new Pair("cpuAbi", (String) objInvoke5);
                                    Object objInvoke6 = method.invoke(null, "ro.product.cpu.abi");
                                    objInvoke6.getClass();
                                    Pair pair6 = new Pair("qemu", (String) objInvoke6);
                                    Object objInvoke7 = method.invoke(null, "ro.build.characteristics");
                                    objInvoke7.getClass();
                                    Pair pair7 = new Pair("characteristics", (String) objInvoke7);
                                    Object objInvoke8 = method.invoke(null, "ro.bootloader");
                                    objInvoke8.getClass();
                                    Pair pair8 = new Pair("bootloader", (String) objInvoke8);
                                    Object objInvoke9 = method.invoke(null, "ro.boot.verifiedbootstate");
                                    objInvoke9.getClass();
                                    Pair pair9 = new Pair("verifiedbootstate", (String) objInvoke9);
                                    Object objInvoke10 = method.invoke(null, "ro.boot.flash.locked");
                                    objInvoke10.getClass();
                                    Pair pair10 = new Pair("flashLocked", (String) objInvoke10);
                                    Object objInvoke11 = method.invoke(null, "ro.boot.vbmeta.device_state");
                                    objInvoke11.getClass();
                                    g0g0Var4 = xp20.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("deviceState", (String) objInvoke11));
                                    obj2 = lun.f20680a;
                                    obj2.getClass();
                                    if (g0g0Var4 instanceof g0g0) {
                                        g0g0Var4 = obj2;
                                    }
                                    Map map3 = (Map) g0g0Var4;
                                    ContentResolver contentResolver = us00Var.getContentResolver();
                                    i = us00Var.getResources().getConfiguration().uiMode & 48;
                                    if (i == 16) {
                                        str2 = AuthorizationHeaderIms.NO;
                                    } else if (i != 32) {
                                        str2 = "undefined";
                                    } else {
                                        str2 = AuthorizationHeaderIms.YES;
                                    }
                                    Pair pair11 = new Pair("darkMode", str2);
                                    property = System.getProperty("os.version");
                                    if (property == null) {
                                        property = "";
                                    }
                                    Map mapF = xp20.f(pair11, new Pair("osVersion", property), new Pair("brightness", String.valueOf(Settings.System.getInt(contentResolver, "screen_brightness", -1))), new Pair("screenTimeout", String.valueOf(Settings.System.getInt(contentResolver, "screen_off_timeout", -1))));
                                    Object systemService2 = us00Var.getSystemService("camera");
                                    systemService2.getClass();
                                    cameraManager = (CameraManager) systemService2;
                                    arrayList = new ArrayList();
                                    arrayList2 = new ArrayList();
                                    arrayList3 = new ArrayList();
                                    arrayList4 = new ArrayList();
                                    Map map4 = map2;
                                    arrayList5 = new ArrayList();
                                    arrayList6 = new ArrayList();
                                    cameraIdList = cameraManager.getCameraIdList();
                                    cameraIdList.getClass();
                                    displayMetrics = displayMetrics2;
                                    length = cameraIdList.length;
                                    i3 = 0;
                                    while (i3 < length) {
                                        int i4 = i3;
                                        String str6 = cameraIdList[i4];
                                        int i5 = length;
                                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str6);
                                        cameraCharacteristics.getClass();
                                        str6.getClass();
                                        arrayList.add(str6);
                                        arrayList2.add(String.valueOf(cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                                        fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                        if (fArr != null) {
                                            string7 = Arrays.toString(fArr);
                                            string7.getClass();
                                        } else {
                                            string7 = str;
                                        }
                                        arrayList3.add(string7);
                                        fArr2 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                                        if (fArr2 != null) {
                                            string8 = Arrays.toString(fArr2);
                                            string8.getClass();
                                        } else {
                                            string8 = str;
                                        }
                                        arrayList4.add(string8);
                                        iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                                        if (iArr != null) {
                                            string9 = Arrays.toString(iArr);
                                            string9.getClass();
                                        } else {
                                            string9 = str;
                                        }
                                        arrayList5.add(string9);
                                        arrayList6.add(String.valueOf(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)));
                                        i3 = i4 + 1;
                                        length = i5;
                                    }
                                    Map mapF2 = xp20.f(new Pair(ParameterNames.ID, arrayList), new Pair("sensorSize", arrayList2), new Pair("focalLengths", arrayList3), new Pair("apertures", arrayList4), new Pair("ois", arrayList5), new Pair("flash", arrayList6));
                                    PackageManager packageManager = us00Var.getPackageManager();
                                    iD = new nhf0(new o58(us00Var, (byte) 0)).d(15);
                                    if (iD == 0) {
                                        str3 = "success";
                                    } else if (iD == 1) {
                                        str3 = "unavailable";
                                    } else if (iD != 12) {
                                        str3 = "none_enrolled";
                                    } else {
                                        str3 = "no_hw";
                                    }
                                    Map mapF3 = xp20.f(new Pair("nfc", String.valueOf(packageManager.hasSystemFeature("android.hardware.nfc"))), new Pair("bluetooth", String.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth"))), new Pair("camera", String.valueOf(packageManager.hasSystemFeature("android.hardware.camera.any"))), new Pair("cameraFront", String.valueOf(packageManager.hasSystemFeature("android.hardware.camera.front"))), new Pair("autofocus", String.valueOf(packageManager.hasSystemFeature("android.hardware.camera.autofocus"))), new Pair("telephony", String.valueOf(packageManager.hasSystemFeature("android.hardware.telephony"))), new Pair("bluetoothLe", String.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth_le"))), new Pair("wifi", String.valueOf(packageManager.hasSystemFeature("android.hardware.wifi"))), new Pair("usbHost", String.valueOf(packageManager.hasSystemFeature("android.hardware.usb.host"))), new Pair("ethernet", String.valueOf(packageManager.hasSystemFeature("android.hardware.ethernet"))), new Pair("gps", String.valueOf(packageManager.hasSystemFeature("android.hardware.location.gps"))), new Pair("microphone", String.valueOf(packageManager.hasSystemFeature("android.hardware.microphone"))), new Pair(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, String.valueOf(packageManager.hasSystemFeature("android.hardware.fingerprint"))), new Pair("biometric", str3), new Pair("ir", String.valueOf(packageManager.hasSystemFeature("android.hardware.consumerir"))));
                                    Configuration configuration = Resources.getSystem().getConfiguration();
                                    Pair pair12 = new Pair("screenLayout", String.valueOf(configuration.screenLayout));
                                    Pair pair13 = new Pair("smallestScreenWidth", String.valueOf(configuration.smallestScreenWidthDp));
                                    e0g0 e0g0Var6 = j0g0.b;
                                    Object systemService3 = us00Var.getSystemService("activity");
                                    systemService3.getClass();
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    ((ActivityManager) systemService3).getMemoryInfo(memoryInfo);
                                    g0g0Var5 = String.valueOf(memoryInfo.totalMem);
                                    if (g0g0Var5 instanceof g0g0) {
                                        g0g0Var5 = "unknown";
                                    }
                                    Map mapF4 = xp20.f(pair12, pair13, new Pair("totalRam", g0g0Var5), new Pair("buildFingerprint", Build.FINGERPRINT), new Pair("buildDisplay", Build.DISPLAY), new Pair("buildUser", Build.USER));
                                    Map mapF5 = xp20.f(new Pair("brand", Build.BRAND), new Pair("device", Build.DEVICE), new Pair("product", Build.PRODUCT), new Pair("hardware", Build.HARDWARE), new Pair("board", Build.BOARD), new Pair("bootloader", Build.BOOTLOADER), new Pair("host", Build.HOST), new Pair("tags", Build.TAGS), new Pair(Payload.TYPE, Build.TYPE));
                                    String[] strArr = Build.SUPPORTED_ABIS;
                                    strArr.getClass();
                                    Pair pair14 = new Pair("supported", tx3.g0(strArr));
                                    String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
                                    strArr2.getClass();
                                    Pair pair15 = new Pair("supported32", tx3.g0(strArr2));
                                    String[] strArr3 = Build.SUPPORTED_64_BIT_ABIS;
                                    strArr3.getClass();
                                    Map mapF6 = xp20.f(pair14, pair15, new Pair("supported64", tx3.g0(strArr3)));
                                    property2 = System.getProperty("os.version");
                                    if (property2 == null) {
                                        property2 = "";
                                    }
                                    Map mapB = wp20.b(new Pair("osVersion", property2));
                                    if (Build.VERSION.SDK_INT < 30) {
                                        obj3 = iun.f15405a;
                                    } else {
                                        systemService = us00Var.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
                                        if (systemService instanceof DisplayManager) {
                                            displayManager = (DisplayManager) systemService;
                                        } else {
                                            displayManager = null;
                                        }
                                        if (displayManager != null) {
                                            display = displayManager.getDisplay(0);
                                        } else {
                                            display = null;
                                        }
                                        if (display != null) {
                                            obj3 = iun.f15405a;
                                        } else {
                                            obj3 = iun.f15405a;
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    byte b2 = 7;
                                    arrayList8.add(x7w0.a("Build", new yzn(mapF5, b2)));
                                    n7w0 n7w0Var = new n7w0();
                                    n7w0Var.a(Build.MODEL, "model");
                                    n7w0Var.a(Build.MANUFACTURER, "manufacturer");
                                    n7w0Var.a(Integer.valueOf(Build.VERSION.SDK_INT), "sdkInt");
                                    n7w0Var.a(Build.VERSION.RELEASE, "release");
                                    arrayList8.add(new h6w0("System", n7w0Var.f23061a));
                                    arrayList8.add(x7w0.a("Hardware", new yzn(mapF4, (byte) 6)));
                                    ArrayList arrayList9 = new ArrayList();
                                    obj4 = mapF6.get("supported");
                                    if (obj4 != null) {
                                        string = str;
                                    } else {
                                        string = str;
                                    }
                                    arrayList9.add(new g7w0("supported", string));
                                    obj5 = mapF6.get("supported32");
                                    if (obj5 != null) {
                                        string2 = str;
                                    } else {
                                        string2 = str;
                                    }
                                    arrayList9.add(new g7w0("supported32", string2));
                                    obj6 = mapF6.get("supported64");
                                    if (obj6 != null) {
                                        string3 = str;
                                    } else {
                                        string3 = str;
                                    }
                                    arrayList9.add(new g7w0("supported64", string3));
                                    arrayList8.add(new h6w0("CpuAbi", arrayList9));
                                    arrayList8.add(x7w0.a("Display", new zfv0(obj3, displayMetrics, (byte) 20)));
                                    ArrayList arrayList10 = new ArrayList();
                                    obj7 = mapB.get("osVersion");
                                    if (obj7 != null) {
                                        string4 = str;
                                    } else {
                                        string4 = str;
                                    }
                                    arrayList10.add(new g7w0("osVersion", string4));
                                    arrayList8.add(new h6w0("Kernel", arrayList10));
                                    ArrayList arrayList11 = new ArrayList();
                                    Locale locale = Locale.getDefault();
                                    TimeZone timeZone = TimeZone.getDefault();
                                    language = locale.getLanguage();
                                    if (language != null) {
                                        string5 = str;
                                    } else {
                                        string5 = str;
                                    }
                                    arrayList11.add(new g7w0("language", string5));
                                    id = timeZone.getID();
                                    if (id != null) {
                                        string6 = str;
                                    } else {
                                        string6 = str;
                                    }
                                    arrayList11.add(new g7w0("timezoneId", string6));
                                    arrayList8.add(new h6w0("Locale", arrayList11));
                                    arrayList8.add(x7w0.a("Keyboards", new r7w0(x7w0Var, (byte) 2)));
                                    arrayList8.add(x7w0.a("Sensors", new r7w0(x7w0Var, (byte) 3)));
                                    arrayList8.add(x7w0.a("SensorDataFirst", new r7w0(x7w0Var, (byte) 4)));
                                    arrayList8.add(x7w0.a("SensorDataSecond", new r7w0(x7w0Var, b2)));
                                    arrayList8.add(x7w0.a("Storage", new gdv0((Object) statFs, (byte) 14)));
                                    PackageInfo packageInfo3 = packageInfo;
                                    arrayList8.add(x7w0.a("AppMetadata", new gdv0(packageInfo3, x7w0Var)));
                                    arrayList8.add(x7w0.a("OpenGL", new yzn(map4, (byte) 2)));
                                    arrayList8.add(x7w0.a("GpuSpectrometer", new ejv0(x7w0Var, (byte) 24)));
                                    n7w0 n7w0Var2 = new n7w0();
                                    ti30VarA = MathTribunal.a(x7w0Var.d);
                                    if (ti30VarA != null) {
                                        str4 = ti30VarA.f33989a;
                                    } else {
                                        str4 = null;
                                    }
                                    n7w0Var2.a(str4, "bitMaskHex");
                                    if (ti30VarA != null) {
                                        dValueOf = Double.valueOf(ti30VarA.b);
                                    } else {
                                        dValueOf = null;
                                    }
                                    n7w0Var2.a(dValueOf, "executionTimeMs");
                                    arrayList8.add(new h6w0("MathTribunal", n7w0Var2.f23061a));
                                    arrayList8.add(x7w0.a("AudioTract", new r7w0(x7w0Var, (byte) 0)));
                                    arrayList8.add(x7w0.a("MediaCodec", new ejv0(x7w0Var, (byte) 25)));
                                    arrayList8.add(x7w0.a("Security", new r7w0(x7w0Var, (byte) 1)));
                                    arrayList8.add(x7w0.a("Emulator", new yzn(map3, x7w0Var)));
                                    arrayList8.add(x7w0.a("AppIdentity", new zfv0(x7w0Var, packageInfo3, (byte) 19)));
                                    n7w0 n7w0Var3 = new n7w0();
                                    n7w0Var3.a(mapF.get("osVersion"), "osVersion");
                                    n7w0Var3.a(mapF.get("darkMode"), "darkMode");
                                    n7w0Var3.a(mapF.get("brightness"), "brightness");
                                    n7w0Var3.a(mapF.get("screenTimeout"), "screenTimeout");
                                    arrayList8.add(new h6w0("SystemPreferences", n7w0Var3.f23061a));
                                    arrayList8.add(x7w0.a("HardwareFeatures", new yzn(mapF3, (byte) 4)));
                                    arrayList8.add(x7w0.a("Cameras", new yzn(mapF2, (byte) 5)));
                                    arrayList8.add(x7w0.a("InputDevices", new ejv0(x7w0Var, (byte) 26)));
                                    arrayList8.add(x7w0.a("AndroidGraphicsFingerprint", new ejv0(x7w0Var, (byte) 27)));
                                    n7w0 n7w0Var4 = new n7w0();
                                    Provider[] providers = Security.getProviders();
                                    providers.getClass();
                                    arrayList7 = new ArrayList(providers.length);
                                    for (Provider provider : providers) {
                                        arrayList7.add(provider.getName());
                                    }
                                    n7w0Var4.a(arrayList7, "providers");
                                    arrayList8.add(new h6w0("Crypto", n7w0Var4.f23061a));
                                    n7w0 n7w0Var5 = new n7w0();
                                    String string10 = Arrays.toString(ln4Var.f20325a.getPackageManager().getSystemSharedLibraryNames());
                                    string10.getClass();
                                    n7w0Var5.a(string10, "list");
                                    arrayList8.add(new h6w0("SystemLibraries", n7w0Var5.f23061a));
                                    arrayList8.add(x7w0.a("StackTrace", new ejv0(x7w0Var, (byte) 28)));
                                    return arrayList8;
                                }
                                obj = lun.f20680a;
                                obj.getClass();
                                if (g0g0Var3 instanceof g0g0) {
                                    g0g0Var3 = obj;
                                }
                                map = (Map) g0g0Var3;
                                map2 = map;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            ln4Var = ln4Var2;
                            packageInfo = packageInfo2;
                            e0g0 e0g0Var7 = j0g0.b;
                            g0g0Var3 = new g0g0(th);
                            obj = lun.f20680a;
                            obj.getClass();
                            if (g0g0Var3 instanceof g0g0) {
                                g0g0Var3 = obj;
                            }
                            map = (Map) g0g0Var3;
                            map2 = map;
                            Method method2 = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                            Object objInvoke12 = method2.invoke(null, "ro.kernel.qemu");
                            objInvoke12.getClass();
                            Pair pair16 = new Pair("kernelQemu", (String) objInvoke12);
                            Object objInvoke13 = method2.invoke(null, "ro.hardware");
                            objInvoke13.getClass();
                            Pair pair17 = new Pair("hardware", (String) objInvoke13);
                            Object objInvoke14 = method2.invoke(null, "ro.product.board");
                            objInvoke14.getClass();
                            Pair pair18 = new Pair("board", (String) objInvoke14);
                            Object objInvoke15 = method2.invoke(null, "ro.product.device");
                            objInvoke15.getClass();
                            Pair pair19 = new Pair("device", (String) objInvoke15);
                            Object objInvoke16 = method2.invoke(null, "ro.product.name");
                            objInvoke16.getClass();
                            Pair pair20 = new Pair("cpuAbi", (String) objInvoke16);
                            Object objInvoke17 = method2.invoke(null, "ro.product.cpu.abi");
                            objInvoke17.getClass();
                            Pair pair21 = new Pair("qemu", (String) objInvoke17);
                            Object objInvoke18 = method2.invoke(null, "ro.build.characteristics");
                            objInvoke18.getClass();
                            Pair pair22 = new Pair("characteristics", (String) objInvoke18);
                            Object objInvoke19 = method2.invoke(null, "ro.bootloader");
                            objInvoke19.getClass();
                            Pair pair23 = new Pair("bootloader", (String) objInvoke19);
                            Object objInvoke20 = method2.invoke(null, "ro.boot.verifiedbootstate");
                            objInvoke20.getClass();
                            Pair pair24 = new Pair("verifiedbootstate", (String) objInvoke20);
                            Object objInvoke110 = method2.invoke(null, "ro.boot.flash.locked");
                            objInvoke110.getClass();
                            Pair pair110 = new Pair("flashLocked", (String) objInvoke110);
                            Object objInvoke111 = method2.invoke(null, "ro.boot.vbmeta.device_state");
                            objInvoke111.getClass();
                            g0g0Var4 = xp20.f(pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair110, new Pair("deviceState", (String) objInvoke111));
                            obj2 = lun.f20680a;
                            obj2.getClass();
                            if (g0g0Var4 instanceof g0g0) {
                                g0g0Var4 = obj2;
                            }
                            Map map5 = (Map) g0g0Var4;
                            ContentResolver contentResolver2 = us00Var.getContentResolver();
                            i = us00Var.getResources().getConfiguration().uiMode & 48;
                            if (i == 16) {
                                str2 = AuthorizationHeaderIms.NO;
                            } else if (i != 32) {
                                str2 = "undefined";
                            } else {
                                str2 = AuthorizationHeaderIms.YES;
                            }
                            Pair pair111 = new Pair("darkMode", str2);
                            property = System.getProperty("os.version");
                            if (property == null) {
                                property = "";
                            }
                            Map mapF7 = xp20.f(pair111, new Pair("osVersion", property), new Pair("brightness", String.valueOf(Settings.System.getInt(contentResolver2, "screen_brightness", -1))), new Pair("screenTimeout", String.valueOf(Settings.System.getInt(contentResolver2, "screen_off_timeout", -1))));
                            Object systemService4 = us00Var.getSystemService("camera");
                            systemService4.getClass();
                            cameraManager = (CameraManager) systemService4;
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            Map map6 = map2;
                            arrayList5 = new ArrayList();
                            arrayList6 = new ArrayList();
                            cameraIdList = cameraManager.getCameraIdList();
                            cameraIdList.getClass();
                            displayMetrics = displayMetrics2;
                            length = cameraIdList.length;
                            i3 = 0;
                            while (i3 < length) {
                                int i6 = i3;
                                String str7 = cameraIdList[i6];
                                int i7 = length;
                                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str7);
                                cameraCharacteristics2.getClass();
                                str7.getClass();
                                arrayList.add(str7);
                                arrayList2.add(String.valueOf(cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                                fArr = (float[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                if (fArr != null) {
                                    string7 = Arrays.toString(fArr);
                                    string7.getClass();
                                } else {
                                    string7 = str;
                                }
                                arrayList3.add(string7);
                                fArr2 = (float[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                                if (fArr2 != null) {
                                    string8 = Arrays.toString(fArr2);
                                    string8.getClass();
                                } else {
                                    string8 = str;
                                }
                                arrayList4.add(string8);
                                iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                                if (iArr != null) {
                                    string9 = Arrays.toString(iArr);
                                    string9.getClass();
                                } else {
                                    string9 = str;
                                }
                                arrayList5.add(string9);
                                arrayList6.add(String.valueOf(cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)));
                                i3 = i6 + 1;
                                length = i7;
                            }
                            Map mapF8 = xp20.f(new Pair(ParameterNames.ID, arrayList), new Pair("sensorSize", arrayList2), new Pair("focalLengths", arrayList3), new Pair("apertures", arrayList4), new Pair("ois", arrayList5), new Pair("flash", arrayList6));
                            PackageManager packageManager2 = us00Var.getPackageManager();
                            iD = new nhf0(new o58(us00Var, (byte) 0)).d(15);
                            if (iD == 0) {
                                str3 = "success";
                            } else if (iD == 1) {
                                str3 = "unavailable";
                            } else if (iD != 12) {
                                str3 = "none_enrolled";
                            } else {
                                str3 = "no_hw";
                            }
                            Map mapF9 = xp20.f(new Pair("nfc", String.valueOf(packageManager2.hasSystemFeature("android.hardware.nfc"))), new Pair("bluetooth", String.valueOf(packageManager2.hasSystemFeature("android.hardware.bluetooth"))), new Pair("camera", String.valueOf(packageManager2.hasSystemFeature("android.hardware.camera.any"))), new Pair("cameraFront", String.valueOf(packageManager2.hasSystemFeature("android.hardware.camera.front"))), new Pair("autofocus", String.valueOf(packageManager2.hasSystemFeature("android.hardware.camera.autofocus"))), new Pair("telephony", String.valueOf(packageManager2.hasSystemFeature("android.hardware.telephony"))), new Pair("bluetoothLe", String.valueOf(packageManager2.hasSystemFeature("android.hardware.bluetooth_le"))), new Pair("wifi", String.valueOf(packageManager2.hasSystemFeature("android.hardware.wifi"))), new Pair("usbHost", String.valueOf(packageManager2.hasSystemFeature("android.hardware.usb.host"))), new Pair("ethernet", String.valueOf(packageManager2.hasSystemFeature("android.hardware.ethernet"))), new Pair("gps", String.valueOf(packageManager2.hasSystemFeature("android.hardware.location.gps"))), new Pair("microphone", String.valueOf(packageManager2.hasSystemFeature("android.hardware.microphone"))), new Pair(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, String.valueOf(packageManager2.hasSystemFeature("android.hardware.fingerprint"))), new Pair("biometric", str3), new Pair("ir", String.valueOf(packageManager2.hasSystemFeature("android.hardware.consumerir"))));
                            Configuration configuration2 = Resources.getSystem().getConfiguration();
                            Pair pair112 = new Pair("screenLayout", String.valueOf(configuration2.screenLayout));
                            Pair pair113 = new Pair("smallestScreenWidth", String.valueOf(configuration2.smallestScreenWidthDp));
                            e0g0 e0g0Var8 = j0g0.b;
                            Object systemService5 = us00Var.getSystemService("activity");
                            systemService5.getClass();
                            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                            ((ActivityManager) systemService5).getMemoryInfo(memoryInfo2);
                            g0g0Var5 = String.valueOf(memoryInfo2.totalMem);
                            if (g0g0Var5 instanceof g0g0) {
                                g0g0Var5 = "unknown";
                            }
                            Map mapF10 = xp20.f(pair112, pair113, new Pair("totalRam", g0g0Var5), new Pair("buildFingerprint", Build.FINGERPRINT), new Pair("buildDisplay", Build.DISPLAY), new Pair("buildUser", Build.USER));
                            Map mapF11 = xp20.f(new Pair("brand", Build.BRAND), new Pair("device", Build.DEVICE), new Pair("product", Build.PRODUCT), new Pair("hardware", Build.HARDWARE), new Pair("board", Build.BOARD), new Pair("bootloader", Build.BOOTLOADER), new Pair("host", Build.HOST), new Pair("tags", Build.TAGS), new Pair(Payload.TYPE, Build.TYPE));
                            String[] strArr4 = Build.SUPPORTED_ABIS;
                            strArr4.getClass();
                            Pair pair114 = new Pair("supported", tx3.g0(strArr4));
                            String[] strArr5 = Build.SUPPORTED_32_BIT_ABIS;
                            strArr5.getClass();
                            Pair pair115 = new Pair("supported32", tx3.g0(strArr5));
                            String[] strArr6 = Build.SUPPORTED_64_BIT_ABIS;
                            strArr6.getClass();
                            Map mapF12 = xp20.f(pair114, pair115, new Pair("supported64", tx3.g0(strArr6)));
                            property2 = System.getProperty("os.version");
                            if (property2 == null) {
                                property2 = "";
                            }
                            Map mapB2 = wp20.b(new Pair("osVersion", property2));
                            if (Build.VERSION.SDK_INT < 30) {
                                obj3 = iun.f15405a;
                            } else {
                                systemService = us00Var.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
                                if (systemService instanceof DisplayManager) {
                                    displayManager = (DisplayManager) systemService;
                                } else {
                                    displayManager = null;
                                }
                                if (displayManager != null) {
                                    display = displayManager.getDisplay(0);
                                } else {
                                    display = null;
                                }
                                if (display != null) {
                                    obj3 = iun.f15405a;
                                } else {
                                    obj3 = iun.f15405a;
                                }
                            }
                            ArrayList arrayList12 = new ArrayList();
                            byte b3 = 7;
                            arrayList12.add(x7w0.a("Build", new yzn(mapF11, b3)));
                            n7w0 n7w0Var6 = new n7w0();
                            n7w0Var6.a(Build.MODEL, "model");
                            n7w0Var6.a(Build.MANUFACTURER, "manufacturer");
                            n7w0Var6.a(Integer.valueOf(Build.VERSION.SDK_INT), "sdkInt");
                            n7w0Var6.a(Build.VERSION.RELEASE, "release");
                            arrayList12.add(new h6w0("System", n7w0Var6.f23061a));
                            arrayList12.add(x7w0.a("Hardware", new yzn(mapF10, (byte) 6)));
                            ArrayList arrayList13 = new ArrayList();
                            obj4 = mapF12.get("supported");
                            if (obj4 != null) {
                                string = str;
                            } else {
                                string = str;
                            }
                            arrayList13.add(new g7w0("supported", string));
                            obj5 = mapF12.get("supported32");
                            if (obj5 != null) {
                                string2 = str;
                            } else {
                                string2 = str;
                            }
                            arrayList13.add(new g7w0("supported32", string2));
                            obj6 = mapF12.get("supported64");
                            if (obj6 != null) {
                                string3 = str;
                            } else {
                                string3 = str;
                            }
                            arrayList13.add(new g7w0("supported64", string3));
                            arrayList12.add(new h6w0("CpuAbi", arrayList13));
                            arrayList12.add(x7w0.a("Display", new zfv0(obj3, displayMetrics, (byte) 20)));
                            ArrayList arrayList14 = new ArrayList();
                            obj7 = mapB2.get("osVersion");
                            if (obj7 != null) {
                                string4 = str;
                            } else {
                                string4 = str;
                            }
                            arrayList14.add(new g7w0("osVersion", string4));
                            arrayList12.add(new h6w0("Kernel", arrayList14));
                            ArrayList arrayList15 = new ArrayList();
                            Locale locale2 = Locale.getDefault();
                            TimeZone timeZone2 = TimeZone.getDefault();
                            language = locale2.getLanguage();
                            if (language != null) {
                                string5 = str;
                            } else {
                                string5 = str;
                            }
                            arrayList15.add(new g7w0("language", string5));
                            id = timeZone2.getID();
                            if (id != null) {
                                string6 = str;
                            } else {
                                string6 = str;
                            }
                            arrayList15.add(new g7w0("timezoneId", string6));
                            arrayList12.add(new h6w0("Locale", arrayList15));
                            arrayList12.add(x7w0.a("Keyboards", new r7w0(x7w0Var, (byte) 2)));
                            arrayList12.add(x7w0.a("Sensors", new r7w0(x7w0Var, (byte) 3)));
                            arrayList12.add(x7w0.a("SensorDataFirst", new r7w0(x7w0Var, (byte) 4)));
                            arrayList12.add(x7w0.a("SensorDataSecond", new r7w0(x7w0Var, b3)));
                            arrayList12.add(x7w0.a("Storage", new gdv0((Object) statFs, (byte) 14)));
                            PackageInfo packageInfo4 = packageInfo;
                            arrayList12.add(x7w0.a("AppMetadata", new gdv0(packageInfo4, x7w0Var)));
                            arrayList12.add(x7w0.a("OpenGL", new yzn(map6, (byte) 2)));
                            arrayList12.add(x7w0.a("GpuSpectrometer", new ejv0(x7w0Var, (byte) 24)));
                            n7w0 n7w0Var7 = new n7w0();
                            ti30VarA = MathTribunal.a(x7w0Var.d);
                            if (ti30VarA != null) {
                                str4 = ti30VarA.f33989a;
                            } else {
                                str4 = null;
                            }
                            n7w0Var7.a(str4, "bitMaskHex");
                            if (ti30VarA != null) {
                                dValueOf = Double.valueOf(ti30VarA.b);
                            } else {
                                dValueOf = null;
                            }
                            n7w0Var7.a(dValueOf, "executionTimeMs");
                            arrayList12.add(new h6w0("MathTribunal", n7w0Var7.f23061a));
                            arrayList12.add(x7w0.a("AudioTract", new r7w0(x7w0Var, (byte) 0)));
                            arrayList12.add(x7w0.a("MediaCodec", new ejv0(x7w0Var, (byte) 25)));
                            arrayList12.add(x7w0.a("Security", new r7w0(x7w0Var, (byte) 1)));
                            arrayList12.add(x7w0.a("Emulator", new yzn(map5, x7w0Var)));
                            arrayList12.add(x7w0.a("AppIdentity", new zfv0(x7w0Var, packageInfo4, (byte) 19)));
                            n7w0 n7w0Var8 = new n7w0();
                            n7w0Var8.a(mapF7.get("osVersion"), "osVersion");
                            n7w0Var8.a(mapF7.get("darkMode"), "darkMode");
                            n7w0Var8.a(mapF7.get("brightness"), "brightness");
                            n7w0Var8.a(mapF7.get("screenTimeout"), "screenTimeout");
                            arrayList12.add(new h6w0("SystemPreferences", n7w0Var8.f23061a));
                            arrayList12.add(x7w0.a("HardwareFeatures", new yzn(mapF9, (byte) 4)));
                            arrayList12.add(x7w0.a("Cameras", new yzn(mapF8, (byte) 5)));
                            arrayList12.add(x7w0.a("InputDevices", new ejv0(x7w0Var, (byte) 26)));
                            arrayList12.add(x7w0.a("AndroidGraphicsFingerprint", new ejv0(x7w0Var, (byte) 27)));
                            n7w0 n7w0Var9 = new n7w0();
                            Provider[] providers2 = Security.getProviders();
                            providers2.getClass();
                            arrayList7 = new ArrayList(providers2.length);
                            while (i2 < r3) {
                                arrayList7.add(provider.getName());
                            }
                            n7w0Var9.a(arrayList7, "providers");
                            arrayList12.add(new h6w0("Crypto", n7w0Var9.f23061a));
                            n7w0 n7w0Var10 = new n7w0();
                            String string11 = Arrays.toString(ln4Var.f20325a.getPackageManager().getSystemSharedLibraryNames());
                            string11.getClass();
                            n7w0Var10.a(string11, "list");
                            arrayList12.add(new h6w0("SystemLibraries", n7w0Var10.f23061a));
                            arrayList12.add(x7w0.a("StackTrace", new ejv0(x7w0Var, (byte) 28)));
                            return arrayList12;
                        }
                    }
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    str = "null";
                }
                try {
                    Method method3 = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                    Object objInvoke112 = method3.invoke(null, "ro.kernel.qemu");
                    objInvoke112.getClass();
                    Pair pair116 = new Pair("kernelQemu", (String) objInvoke112);
                    Object objInvoke113 = method3.invoke(null, "ro.hardware");
                    objInvoke113.getClass();
                    Pair pair117 = new Pair("hardware", (String) objInvoke113);
                    Object objInvoke114 = method3.invoke(null, "ro.product.board");
                    objInvoke114.getClass();
                    Pair pair118 = new Pair("board", (String) objInvoke114);
                    Object objInvoke115 = method3.invoke(null, "ro.product.device");
                    objInvoke115.getClass();
                    Pair pair119 = new Pair("device", (String) objInvoke115);
                    Object objInvoke116 = method3.invoke(null, "ro.product.name");
                    objInvoke116.getClass();
                    Pair pair25 = new Pair("cpuAbi", (String) objInvoke116);
                    Object objInvoke117 = method3.invoke(null, "ro.product.cpu.abi");
                    objInvoke117.getClass();
                    Pair pair26 = new Pair("qemu", (String) objInvoke117);
                    Object objInvoke118 = method3.invoke(null, "ro.build.characteristics");
                    objInvoke118.getClass();
                    Pair pair27 = new Pair("characteristics", (String) objInvoke118);
                    Object objInvoke119 = method3.invoke(null, "ro.bootloader");
                    objInvoke119.getClass();
                    Pair pair28 = new Pair("bootloader", (String) objInvoke119);
                    Object objInvoke21 = method3.invoke(null, "ro.boot.verifiedbootstate");
                    objInvoke21.getClass();
                    Pair pair29 = new Pair("verifiedbootstate", (String) objInvoke21);
                    Object objInvoke1110 = method3.invoke(null, "ro.boot.flash.locked");
                    objInvoke1110.getClass();
                    Pair pair1110 = new Pair("flashLocked", (String) objInvoke1110);
                    Object objInvoke1111 = method3.invoke(null, "ro.boot.vbmeta.device_state");
                    objInvoke1111.getClass();
                    g0g0Var4 = xp20.f(pair116, pair117, pair118, pair119, pair25, pair26, pair27, pair28, pair29, pair1110, new Pair("deviceState", (String) objInvoke1111));
                    break;
                } catch (Throwable th7) {
                    e0g0 e0g0Var9 = j0g0.b;
                    g0g0Var4 = new g0g0(th7);
                }
                obj2 = lun.f20680a;
                obj2.getClass();
                if (g0g0Var4 instanceof g0g0) {
                    g0g0Var4 = obj2;
                }
                Map map7 = (Map) g0g0Var4;
                ContentResolver contentResolver3 = us00Var.getContentResolver();
                i = us00Var.getResources().getConfiguration().uiMode & 48;
                if (i == 16) {
                    str2 = AuthorizationHeaderIms.NO;
                } else if (i != 32) {
                    str2 = "undefined";
                } else {
                    str2 = AuthorizationHeaderIms.YES;
                }
                Pair pair1111 = new Pair("darkMode", str2);
                property = System.getProperty("os.version");
                if (property == null) {
                    property = "";
                }
                Map mapF13 = xp20.f(pair1111, new Pair("osVersion", property), new Pair("brightness", String.valueOf(Settings.System.getInt(contentResolver3, "screen_brightness", -1))), new Pair("screenTimeout", String.valueOf(Settings.System.getInt(contentResolver3, "screen_off_timeout", -1))));
                Object systemService6 = us00Var.getSystemService("camera");
                systemService6.getClass();
                cameraManager = (CameraManager) systemService6;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                arrayList4 = new ArrayList();
                Map map8 = map2;
                arrayList5 = new ArrayList();
                arrayList6 = new ArrayList();
                try {
                    cameraIdList = cameraManager.getCameraIdList();
                    cameraIdList.getClass();
                    displayMetrics = displayMetrics2;
                    try {
                        length = cameraIdList.length;
                        i3 = 0;
                        while (i3 < length) {
                            int i8 = i3;
                            String str8 = cameraIdList[i8];
                            int i9 = length;
                            CameraCharacteristics cameraCharacteristics3 = cameraManager.getCameraCharacteristics(str8);
                            cameraCharacteristics3.getClass();
                            str8.getClass();
                            arrayList.add(str8);
                            arrayList2.add(String.valueOf(cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                            fArr = (float[]) cameraCharacteristics3.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                            if (fArr != null) {
                                string7 = Arrays.toString(fArr);
                                string7.getClass();
                            } else {
                                string7 = str;
                            }
                            arrayList3.add(string7);
                            fArr2 = (float[]) cameraCharacteristics3.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                            if (fArr2 != null) {
                                string8 = Arrays.toString(fArr2);
                                string8.getClass();
                            } else {
                                string8 = str;
                            }
                            arrayList4.add(string8);
                            iArr = (int[]) cameraCharacteristics3.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                            if (iArr != null) {
                                string9 = Arrays.toString(iArr);
                                string9.getClass();
                            } else {
                                string9 = str;
                            }
                            arrayList5.add(string9);
                            arrayList6.add(String.valueOf(cameraCharacteristics3.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)));
                            i3 = i8 + 1;
                            length = i9;
                        }
                    } catch (Throwable unused) {
                        e0g0 e0g0Var10 = j0g0.b;
                    }
                } catch (Throwable unused2) {
                    displayMetrics = displayMetrics2;
                }
                Map mapF14 = xp20.f(new Pair(ParameterNames.ID, arrayList), new Pair("sensorSize", arrayList2), new Pair("focalLengths", arrayList3), new Pair("apertures", arrayList4), new Pair("ois", arrayList5), new Pair("flash", arrayList6));
                PackageManager packageManager3 = us00Var.getPackageManager();
                iD = new nhf0(new o58(us00Var, (byte) 0)).d(15);
                if (iD == 0) {
                    str3 = "success";
                } else if (iD == 1) {
                    str3 = "unavailable";
                } else if (iD != 12) {
                    str3 = "none_enrolled";
                } else {
                    str3 = "no_hw";
                }
                Map mapF15 = xp20.f(new Pair("nfc", String.valueOf(packageManager3.hasSystemFeature("android.hardware.nfc"))), new Pair("bluetooth", String.valueOf(packageManager3.hasSystemFeature("android.hardware.bluetooth"))), new Pair("camera", String.valueOf(packageManager3.hasSystemFeature("android.hardware.camera.any"))), new Pair("cameraFront", String.valueOf(packageManager3.hasSystemFeature("android.hardware.camera.front"))), new Pair("autofocus", String.valueOf(packageManager3.hasSystemFeature("android.hardware.camera.autofocus"))), new Pair("telephony", String.valueOf(packageManager3.hasSystemFeature("android.hardware.telephony"))), new Pair("bluetoothLe", String.valueOf(packageManager3.hasSystemFeature("android.hardware.bluetooth_le"))), new Pair("wifi", String.valueOf(packageManager3.hasSystemFeature("android.hardware.wifi"))), new Pair("usbHost", String.valueOf(packageManager3.hasSystemFeature("android.hardware.usb.host"))), new Pair("ethernet", String.valueOf(packageManager3.hasSystemFeature("android.hardware.ethernet"))), new Pair("gps", String.valueOf(packageManager3.hasSystemFeature("android.hardware.location.gps"))), new Pair("microphone", String.valueOf(packageManager3.hasSystemFeature("android.hardware.microphone"))), new Pair(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, String.valueOf(packageManager3.hasSystemFeature("android.hardware.fingerprint"))), new Pair("biometric", str3), new Pair("ir", String.valueOf(packageManager3.hasSystemFeature("android.hardware.consumerir"))));
                Configuration configuration3 = Resources.getSystem().getConfiguration();
                Pair pair1112 = new Pair("screenLayout", String.valueOf(configuration3.screenLayout));
                Pair pair1113 = new Pair("smallestScreenWidth", String.valueOf(configuration3.smallestScreenWidthDp));
                try {
                    e0g0 e0g0Var11 = j0g0.b;
                    Object systemService7 = us00Var.getSystemService("activity");
                    systemService7.getClass();
                    ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
                    ((ActivityManager) systemService7).getMemoryInfo(memoryInfo3);
                    g0g0Var5 = String.valueOf(memoryInfo3.totalMem);
                    break;
                } catch (Throwable th8) {
                    e0g0 e0g0Var12 = j0g0.b;
                    g0g0Var5 = new g0g0(th8);
                }
                if (g0g0Var5 instanceof g0g0) {
                    g0g0Var5 = "unknown";
                }
                Map mapF16 = xp20.f(pair1112, pair1113, new Pair("totalRam", g0g0Var5), new Pair("buildFingerprint", Build.FINGERPRINT), new Pair("buildDisplay", Build.DISPLAY), new Pair("buildUser", Build.USER));
                Map mapF17 = xp20.f(new Pair("brand", Build.BRAND), new Pair("device", Build.DEVICE), new Pair("product", Build.PRODUCT), new Pair("hardware", Build.HARDWARE), new Pair("board", Build.BOARD), new Pair("bootloader", Build.BOOTLOADER), new Pair("host", Build.HOST), new Pair("tags", Build.TAGS), new Pair(Payload.TYPE, Build.TYPE));
                String[] strArr7 = Build.SUPPORTED_ABIS;
                strArr7.getClass();
                Pair pair1114 = new Pair("supported", tx3.g0(strArr7));
                String[] strArr8 = Build.SUPPORTED_32_BIT_ABIS;
                strArr8.getClass();
                Pair pair1115 = new Pair("supported32", tx3.g0(strArr8));
                String[] strArr9 = Build.SUPPORTED_64_BIT_ABIS;
                strArr9.getClass();
                Map mapF18 = xp20.f(pair1114, pair1115, new Pair("supported64", tx3.g0(strArr9)));
                property2 = System.getProperty("os.version");
                if (property2 == null) {
                    property2 = "";
                }
                Map mapB3 = wp20.b(new Pair("osVersion", property2));
                if (Build.VERSION.SDK_INT < 30) {
                    obj3 = iun.f15405a;
                } else {
                    systemService = us00Var.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
                    if (systemService instanceof DisplayManager) {
                        displayManager = (DisplayManager) systemService;
                    } else {
                        displayManager = null;
                    }
                    if (displayManager != null) {
                        display = displayManager.getDisplay(0);
                    } else {
                        display = null;
                    }
                    if (display != null || (supportedModes = display.getSupportedModes()) == null) {
                        obj3 = iun.f15405a;
                    } else {
                        ArrayList arrayList16 = new ArrayList(supportedModes.length);
                        int length2 = supportedModes.length;
                        int i10 = 0;
                        while (i10 < length2) {
                            Display.Mode mode = supportedModes[i10];
                            StringBuilder sb = new StringBuilder();
                            sb.append(mode.getModeId());
                            sb.append(':');
                            sb.append(mode.getPhysicalWidth());
                            sb.append('x');
                            sb.append(mode.getPhysicalHeight());
                            sb.append('@');
                            sb.append(mode.getRefreshRate());
                            arrayList16.add(sb.toString());
                            i10++;
                            supportedModes = supportedModes;
                        }
                        obj3 = arrayList16;
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                byte b4 = 7;
                arrayList17.add(x7w0.a("Build", new yzn(mapF17, b4)));
                n7w0 n7w0Var11 = new n7w0();
                n7w0Var11.a(Build.MODEL, "model");
                n7w0Var11.a(Build.MANUFACTURER, "manufacturer");
                n7w0Var11.a(Integer.valueOf(Build.VERSION.SDK_INT), "sdkInt");
                n7w0Var11.a(Build.VERSION.RELEASE, "release");
                arrayList17.add(new h6w0("System", n7w0Var11.f23061a));
                arrayList17.add(x7w0.a("Hardware", new yzn(mapF16, (byte) 6)));
                ArrayList arrayList18 = new ArrayList();
                obj4 = mapF18.get("supported");
                if (obj4 != null || (string = obj4.toString()) == null) {
                    string = str;
                }
                arrayList18.add(new g7w0("supported", string));
                obj5 = mapF18.get("supported32");
                if (obj5 != null || (string2 = obj5.toString()) == null) {
                    string2 = str;
                }
                arrayList18.add(new g7w0("supported32", string2));
                obj6 = mapF18.get("supported64");
                if (obj6 != null || (string3 = obj6.toString()) == null) {
                    string3 = str;
                }
                arrayList18.add(new g7w0("supported64", string3));
                arrayList17.add(new h6w0("CpuAbi", arrayList18));
                arrayList17.add(x7w0.a("Display", new zfv0(obj3, displayMetrics, (byte) 20)));
                ArrayList arrayList19 = new ArrayList();
                obj7 = mapB3.get("osVersion");
                if (obj7 != null || (string4 = obj7.toString()) == null) {
                    string4 = str;
                }
                arrayList19.add(new g7w0("osVersion", string4));
                arrayList17.add(new h6w0("Kernel", arrayList19));
                ArrayList arrayList110 = new ArrayList();
                Locale locale3 = Locale.getDefault();
                TimeZone timeZone3 = TimeZone.getDefault();
                language = locale3.getLanguage();
                if (language != null || (string5 = language.toString()) == null) {
                    string5 = str;
                }
                arrayList110.add(new g7w0("language", string5));
                id = timeZone3.getID();
                if (id != null || (string6 = id.toString()) == null) {
                    string6 = str;
                }
                arrayList110.add(new g7w0("timezoneId", string6));
                arrayList17.add(new h6w0("Locale", arrayList110));
                arrayList17.add(x7w0.a("Keyboards", new r7w0(x7w0Var, (byte) 2)));
                arrayList17.add(x7w0.a("Sensors", new r7w0(x7w0Var, (byte) 3)));
                arrayList17.add(x7w0.a("SensorDataFirst", new r7w0(x7w0Var, (byte) 4)));
                arrayList17.add(x7w0.a("SensorDataSecond", new r7w0(x7w0Var, b4)));
                arrayList17.add(x7w0.a("Storage", new gdv0((Object) statFs, (byte) 14)));
                PackageInfo packageInfo5 = packageInfo;
                arrayList17.add(x7w0.a("AppMetadata", new gdv0(packageInfo5, x7w0Var)));
                arrayList17.add(x7w0.a("OpenGL", new yzn(map8, (byte) 2)));
                arrayList17.add(x7w0.a("GpuSpectrometer", new ejv0(x7w0Var, (byte) 24)));
                n7w0 n7w0Var12 = new n7w0();
                ti30VarA = MathTribunal.a(x7w0Var.d);
                if (ti30VarA != null) {
                    str4 = ti30VarA.f33989a;
                } else {
                    str4 = null;
                }
                n7w0Var12.a(str4, "bitMaskHex");
                if (ti30VarA != null) {
                    dValueOf = Double.valueOf(ti30VarA.b);
                } else {
                    dValueOf = null;
                }
                n7w0Var12.a(dValueOf, "executionTimeMs");
                arrayList17.add(new h6w0("MathTribunal", n7w0Var12.f23061a));
                arrayList17.add(x7w0.a("AudioTract", new r7w0(x7w0Var, (byte) 0)));
                arrayList17.add(x7w0.a("MediaCodec", new ejv0(x7w0Var, (byte) 25)));
                arrayList17.add(x7w0.a("Security", new r7w0(x7w0Var, (byte) 1)));
                arrayList17.add(x7w0.a("Emulator", new yzn(map7, x7w0Var)));
                arrayList17.add(x7w0.a("AppIdentity", new zfv0(x7w0Var, packageInfo5, (byte) 19)));
                n7w0 n7w0Var13 = new n7w0();
                n7w0Var13.a(mapF13.get("osVersion"), "osVersion");
                n7w0Var13.a(mapF13.get("darkMode"), "darkMode");
                n7w0Var13.a(mapF13.get("brightness"), "brightness");
                n7w0Var13.a(mapF13.get("screenTimeout"), "screenTimeout");
                arrayList17.add(new h6w0("SystemPreferences", n7w0Var13.f23061a));
                arrayList17.add(x7w0.a("HardwareFeatures", new yzn(mapF15, (byte) 4)));
                arrayList17.add(x7w0.a("Cameras", new yzn(mapF14, (byte) 5)));
                arrayList17.add(x7w0.a("InputDevices", new ejv0(x7w0Var, (byte) 26)));
                arrayList17.add(x7w0.a("AndroidGraphicsFingerprint", new ejv0(x7w0Var, (byte) 27)));
                n7w0 n7w0Var14 = new n7w0();
                Provider[] providers3 = Security.getProviders();
                providers3.getClass();
                arrayList7 = new ArrayList(providers3.length);
                while (i2 < r3) {
                    arrayList7.add(provider.getName());
                }
                n7w0Var14.a(arrayList7, "providers");
                arrayList17.add(new h6w0("Crypto", n7w0Var14.f23061a));
                n7w0 n7w0Var15 = new n7w0();
                String string12 = Arrays.toString(ln4Var.f20325a.getPackageManager().getSystemSharedLibraryNames());
                string12.getClass();
                n7w0Var15.a(string12, "list");
                arrayList17.add(new h6w0("SystemLibraries", n7w0Var15.f23061a));
                arrayList17.add(x7w0.a("StackTrace", new ejv0(x7w0Var, (byte) 28)));
                return arrayList17;
        }
    }
}
