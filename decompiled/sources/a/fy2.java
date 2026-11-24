package a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Handler;
import android.text.Layout;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10340a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fy2(Object obj, Object obj2, byte b) {
        this.f10340a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        j4a j4aVar = (j4a) this.b;
        tu9 tu9Var = (tu9) this.c;
        ru ruVar = j4aVar.g;
        if (!((AtomicBoolean) ruVar.j).getAndSet(true)) {
            wy9 wy9Var = (wy9) ruVar.e;
            wy9Var.getClass();
            wy9Var.g = false;
            synchronized (wy9Var.b) {
                wy9Var.c = null;
                lun.f20680a.getClass();
                wy9Var.d = iun.f15405a;
                wy9Var.f = false;
                wy9Var.e.clear();
            }
            jrs0 jrs0Var = (jrs0) ruVar.f;
            jrs0Var.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (((AtomicBoolean) jrs0Var.i).compareAndSet(true, false)) {
                c4m0 c4m0Var = (c4m0) jrs0Var.h;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                jrs0Var.h = null;
            }
            if (((n0o0) ruVar.f31100a).a()) {
                m1a m1aVar = (m1a) ((n0o0) ruVar.f31100a).getValue();
                synchronized (m1aVar.c) {
                    if (m1aVar.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ((r1a) ((n5d0) m1aVar.f20997a.e).get()).b();
                    m1aVar.d = true;
                }
            }
        }
        if (j4aVar.f != null) {
            Executor executor = j4aVar.d;
            if (executor instanceof dz9) {
                dz9 dz9Var = (dz9) executor;
                synchronized (dz9Var.f6931a) {
                    try {
                        if (!dz9Var.b.isShutdown()) {
                            dz9Var.b.shutdown();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j4aVar.f.quit();
        }
        tu9Var.b(null);
    }

    private final void b() {
        izj izjVar;
        y680 y680Var = (y680) this.b;
        p5d0 p5d0Var = (p5d0) this.c;
        if (y680Var.b != y680.d) {
            jf4.n("provide() can be called only once.");
            return;
        }
        synchronized (y680Var) {
            izjVar = y680Var.f42084a;
            y680Var.f42084a = null;
            y680Var.b = p5d0Var;
        }
        izjVar.a(p5d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        krs0 krs0Var;
        byte b = 1;
        int i = 0;
        Object[] objArr = 0;
        String absolutePath = null;
        absolutePath = null;
        Unit unit = null;
        switch (this.f10340a) {
            case 0:
                gy2.b((iy2) this.b, (LongSparseArray) this.c);
                return;
            case 1:
                ((d1x) this.c).e((cgx0) this.b);
                return;
            case 2:
                Context context = (Context) this.b;
                View view = (View) this.c;
                Object systemService = context.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).showSoftInput(view, 0);
                return;
            case 3:
                Fragment fragment = (Fragment) this.b;
                Function0 function0 = (Function0) this.c;
                if (fragment.Q()) {
                    function0.invoke();
                    return;
                }
                return;
            case 4:
                gd3 gd3Var = (gd3) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    gd3Var.a();
                }
            case 5:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                fbs0 fbs0Var = (fbs0) this.c;
                Timer timer = AppStartTrace.x;
                appStartTrace.b.c((ibs0) fbs0Var.h(), ts3.FOREGROUND_BACKGROUND);
                return;
            case 6:
                Context context2 = (Context) this.b;
                brd brdVar = (brd) this.c;
                b34.f1884a = (AudioManager) context2.getSystemService("audio");
                brdVar.c();
                return;
            case 7:
                xex xexVar = (xex) this.b;
                hyc hycVar = (hyc) this.c;
                qlo qloVar = (qlo) xexVar.b;
                String str = vtt0.f38024a;
                qloVar.f28944a.F.A(hycVar);
                return;
            case 8:
                xex xexVar2 = (xex) this.b;
                synchronized (((tkj) this.c)) {
                }
                qlo qloVar2 = (qlo) xexVar2.b;
                String str2 = vtt0.f38024a;
                fsj fsjVar = qloVar2.f28944a.s;
                fsjVar.N(fsjVar.J((vn30) fsjVar.d.e), 1013, new csj((byte) 3));
                return;
            case 9:
                nhf0 nhf0Var = (nhf0) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) nhf0Var.c).post(new fy2(nhf0Var, routedDevice, (byte) 10));
                    return;
                }
                return;
            case 10:
                nhf0 nhf0Var2 = (nhf0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((h44) nhf0Var2.d) == null || (krs0Var = ((n44) ((do20) nhf0Var2.b).f6397a).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) krs0Var.j)) {
                    return;
                }
                krs0Var.j = audioDeviceInfo;
                Context context3 = (Context) krs0Var.b;
                m24 m24Var = (m24) krs0Var.k;
                List listB = krs0Var.b();
                rcf0 rcf0Var = q24.e;
                krs0Var.d(q24.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), m24Var, audioDeviceInfo, listB));
                return;
            case 11:
                fp fpVar = (fp) this.b;
                Object objApply = ((plo) this.c).apply(fpVar.g);
                fpVar.g = objApply;
                nd5 nd5Var = new nd5(fpVar, objApply, b);
                q9o0 q9o0Var = (q9o0) fpVar.d;
                if (q9o0Var.f28360a.getLooper().getThread().isAlive()) {
                    q9o0Var.e(nd5Var);
                    return;
                }
                return;
            case 12:
                l58 l58Var = (l58) this.b;
                p58 p58Var = (p58) this.c;
                t58 t58Var = l58Var.H1;
                nnw0 s58Var = t58Var.c;
                if (s58Var == null) {
                    s58Var = new s58();
                    t58Var.c = s58Var;
                }
                s58Var.G(p58Var);
                return;
            case 13:
                b99 b99Var = (b99) this.b;
                String str3 = (String) this.c;
                TextView textView = b99Var.l;
                Layout layout = textView.getLayout();
                if (layout != null) {
                    if (kotlin.text.c.o(layout.getText().toString(), str3)) {
                        textView.setTextSize(12.0f);
                        return;
                    } else {
                        textView.setTextSize(10.0f);
                        return;
                    }
                }
                return;
            case 14:
                ((o3a) this.b).f24573a.onCaptureSequenceAborted((CameraCaptureSession) this.c, -1);
                return;
            case 15:
                x1a x1aVar = (x1a) this.b;
                Set<h0a> set = (Set) this.c;
                rrd rrdVar = x1aVar.f40112a;
                set.getClass();
                ofm0.m();
                synchronized (rrdVar.b) {
                    try {
                        for (h0a h0aVar : set) {
                            Set setKeySet = ((HashMap) rrdVar.h).keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : setKeySet) {
                                if (((h0a) obj).f12224a.equals(h0aVar.f12224a)) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((HashMap) rrdVar.h).remove((h0a) it.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 16:
                ((s0a) this.b).h().b().j((ee60) this.c);
                return;
            case 17:
                ((n0a) this.b).b().f((w1a) this.c);
                return;
            case 18:
                j2a j2aVar = (j2a) this.b;
                s0a s0aVar = (s0a) this.c;
                synchronized (j2aVar.f15771a) {
                    try {
                        j2aVar.c.remove(s0aVar);
                        if (j2aVar.c.isEmpty()) {
                            j2aVar.e.getClass();
                            j2aVar.e.b(null);
                            j2aVar.e = null;
                            j2aVar.d = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((sbe) this.b).accept((o15) this.c);
                return;
            case 20:
                a();
                return;
            case 21:
                cpv0 cpv0Var = (cpv0) this.b;
                String string = ((UUID) this.c).toString();
                string.getClass();
                dj8.T(cpv0Var, string);
                return;
            case 22:
                a8a a8aVar = (a8a) this.b;
                lu5 lu5Var = (lu5) this.c;
                i0g0 i0g0Var = lu5Var.f20658a;
                b8a b8aVar = a8aVar.f417a;
                CaptureActivity captureActivity = b8aVar.f2147a;
                if (b8aVar.d) {
                    fmk0 fmk0Var = lu5Var.b;
                    t68 t68Var = fmk0Var.f9787a;
                    int i2 = fmk0Var.c;
                    Rect rect = new Rect(0, 0, t68Var.b, t68Var.c);
                    YuvImage yuvImage = new YuvImage(t68Var.f33403a, fmk0Var.b, t68Var.b, t68Var.c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i2 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i2);
                        bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        absolutePath = fileCreateTempFile.getAbsolutePath();
                    } catch (IOException e) {
                        Log.w("b8a", "Unable to create temporary file and store bitmap! " + e);
                    }
                    break;
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", i0g0Var.f13947a);
                intent.putExtra("SCAN_RESULT_FORMAT", i0g0Var.d.toString());
                byte[] bArr = i0g0Var.b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                Map map = i0g0Var.e;
                if (map != null) {
                    a3g0 a3g0Var = a3g0.i;
                    if (map.containsKey(a3g0Var)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(a3g0Var).toString());
                    }
                    Number number = (Number) map.get(a3g0.f170a);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str4 = (String) map.get(a3g0.c);
                    if (str4 != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str4);
                    }
                    Iterable iterable = (Iterable) map.get(a3g0.b);
                    if (iterable != null) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, (byte[]) it2.next());
                            i++;
                        }
                    }
                }
                if (absolutePath != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", absolutePath);
                }
                captureActivity.setResult(-1, intent);
                b8aVar.a();
                return;
            case 23:
                CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) this.b;
                zj zjVar = (zj) this.c;
                xna xnaVar = cardStackLayoutManager.r;
                qna qnaVar = cardStackLayoutManager.p;
                if (xnaVar.f == cardStackLayoutManager.S()) {
                    qnaVar.getClass();
                }
                qnaVar.a(zjVar, cardStackLayoutManager.s.c);
                return;
            case 24:
                z9c z9cVar = (z9c) this.b;
                cym0 cym0Var = (cym0) this.c;
                z9cVar.f = y9c.f42237a;
                z9cVar.h.f();
                cym0Var.invoke();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((bmf0) this.b).q((cmf0) this.c);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cu cuVar = (cu) this.b;
                t7d[] t7dVarArr = (t7d[]) this.c;
                cuVar.getClass();
                rs3 rs3Var = (rs3) cuVar.b;
                if (rs3Var != null) {
                    rs3Var.b(t7dVarArr);
                    unit = Unit.f46060a;
                }
                if (unit == null) {
                    ((ArrayList) cuVar.c).add(t7dVarArr);
                    return;
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                agd agdVar = (agd) this.b;
                agdVar.f44297a.a(new sfd((jg60) this.c, agdVar, objArr == true ? 1 : 0));
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b();
                return;
            default:
                sdz sdzVar = (sdz) this.b;
                p5d0 p5d0Var = (p5d0) this.c;
                synchronized (sdzVar) {
                    try {
                        if (sdzVar.b == null) {
                            sdzVar.f32054a.add(p5d0Var);
                        } else {
                            sdzVar.b.add(p5d0Var.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
