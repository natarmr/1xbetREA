package a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.PowerManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.api.ConnectionResult;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qaq0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28409a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qaq0(Object obj, Object obj2, byte b) {
        this.f28409a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x017a A[PHI: r0 r3
  0x017a: PHI (r0v54 okhttp3.ResponseBody) = (r0v53 okhttp3.ResponseBody), (r0v59 okhttp3.ResponseBody) binds: [B:76:0x0188, B:68:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x017a: PHI (r3v11 byte[]) = (r3v22 byte[]), (r3v16 byte[]) binds: [B:76:0x0188, B:68:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        ResponseBody responseBody;
        PowerManager.WakeLock wakeLock;
        ResponseBody responseBody2 = null;
        bArrC = null;
        bArrC = null;
        bArrC = null;
        byte[] bArrC = null;
        switch (this.f28409a) {
            case 0:
                raq0 raq0Var = (raq0) this.b;
                pmn0 pmn0Var = (pmn0) this.c;
                pmn0 pmn0Var2 = raq0Var.h;
                if (pmn0Var2 != null && pmn0Var2 == pmn0Var) {
                    raq0Var.h = null;
                    raq0Var.g = null;
                }
                hi hiVar = raq0Var.l;
                if (hiVar != null) {
                    hiVar.b();
                    raq0Var.l = null;
                    return;
                }
                return;
            case 1:
                mie0 mie0Var = (mie0) this.b;
                mie0 mie0Var2 = (mie0) this.c;
                d5c.G((vne) mie0Var.f21842a, null);
                d5c.G((vne) mie0Var2.f21842a, null);
                return;
            case 2:
                wss wssVar = (wss) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    wssVar.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 3:
                ((okt0) ((h0q0) this.b).b).k((h6m0) this.c, 3);
                return;
            case 4:
                qjk qjkVar = (qjk) this.b;
                noq0 noq0Var = (noq0) this.c;
                y2m0 y2m0Var = noq0.m2;
                qjkVar.c.setVisibility(!noq0Var.W0() ? 0 : 8);
                qjkVar.d.setVisibility(!noq0Var.W0() ? 0 : 8);
                qjkVar.b.setVisibility(noq0Var.W0() ? 0 : 8);
                return;
            case 5:
                Runnable runnable = (Runnable) this.b;
                gd3 gd3Var = (gd3) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    gd3Var.a();
                }
            case 6:
                dps0 dps0Var = (dps0) this.b;
                id90 id90Var = (id90) this.c;
                dps0Var.d(id90Var.f14573a, id90Var.b);
                return;
            case 7:
                tpt0 tpt0Var = (tpt0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ThreadLocal threadLocal = tpt0Var.d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 8:
                ywq0 ywq0Var = (ywq0) this.b;
                ((oa40) ywq0Var.f43384a).i((String) ywq0Var.c, (List) this.c);
                return;
            case 9:
                vvt0 vvt0Var = (vvt0) this.b;
                mkt0 mkt0Var = (mkt0) this.c;
                try {
                    wvt0.a(new qaq0(mkt0Var, tut0.a(vvt0Var), (byte) 10));
                    return;
                } catch (Exception e) {
                    wvt0.a(new qaq0(e, mkt0Var, (byte) 11));
                    return;
                }
            case 10:
                mkt0 mkt0Var2 = (mkt0) this.b;
                Object obj = this.c;
                if (mkt0Var2 != null) {
                    awt0 awt0Var = (awt0) obj;
                    try {
                        rvt0 rvt0Var = (rvt0) mkt0Var2.f21959a;
                        String str = (String) mkt0Var2.b;
                        String str2 = (String) mkt0Var2.c;
                        sxs0 sxs0Var = rvt0.f2;
                        rvt0Var.R0(awt0Var, str, str2);
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                return;
            case 11:
                Exception exc = (Exception) this.b;
                mkt0 mkt0Var3 = (mkt0) this.c;
                if ((exc instanceof yut0) && ((i = ((yut0) exc).b) == 4 || i == 5 || i == 3610)) {
                    fvt0 fvt0Var = tut0.c;
                    if (fvt0Var == null) {
                        Intrinsics.h("authManager");
                        throw null;
                    }
                    List list = uut0.j;
                    nmt0 nmt0Var = (nmt0) fvt0Var.f10231a;
                    nmt0Var.getClass();
                    for (String str3 : uut0.j) {
                        str3.getClass();
                        ((SharedPreferences) nmt0Var.f23789a).edit().remove(str3).apply();
                    }
                    Iterator it = tut0.d.iterator();
                    if (it.hasNext()) {
                        throw rw2.h(it);
                    }
                }
                if (mkt0Var3 != null) {
                    try {
                        rvt0 rvt0Var2 = (rvt0) mkt0Var3.f21959a;
                        String strH = rvt0Var2.H(R.string.something_went_wrong);
                        strH.getClass();
                        rvt0Var2.F().t0(i120.V(new Pair("ERROR_SOCIAL", strH)), "ERROR_SOCIAL");
                        rvt0Var2.y0();
                        return;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return;
                    }
                }
                return;
            case 12:
                String str4 = (String) this.b;
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) this.c;
                String str5 = VKCaptchaActivity.d;
                try {
                    Request.Builder builder = new Request.Builder();
                    builder.d(str4);
                    Response responseExecute = FirebasePerfOkHttpClient.execute(new RealCall(new tvt0().a(), new Request(builder), false));
                    if (responseExecute != null) {
                        responseBody = responseExecute.g;
                        if (responseBody != null) {
                            try {
                                bArrC = responseBody.c();
                            } catch (Exception unused) {
                                if (responseBody != null) {
                                    responseBody.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                responseBody2 = responseBody;
                                if (responseBody2 != null) {
                                    responseBody2.close();
                                }
                                throw th;
                            }
                        }
                        if (responseBody != null) {
                            responseBody.close();
                        }
                        break;
                    }
                } catch (Exception unused2) {
                    responseBody = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (bArrC != null) {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
                    bitmapDecodeByteArray.getClass();
                    wvt0.a(new qaq0(vKCaptchaActivity, bitmapDecodeByteArray, (byte) 13));
                    return;
                }
                return;
            case 13:
                VKCaptchaActivity vKCaptchaActivity2 = (VKCaptchaActivity) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                String str6 = VKCaptchaActivity.d;
                bitmap.getClass();
                ImageView imageView = vKCaptchaActivity2.b;
                if (imageView == null) {
                    Intrinsics.h("image");
                    throw null;
                }
                imageView.setImageBitmap(bitmap);
                ProgressBar progressBar = vKCaptchaActivity2.c;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    Intrinsics.h("progress");
                    throw null;
                }
            case 14:
                Context context = (Context) this.b;
                String str7 = (String) this.c;
                context.getClass();
                Intent intentPutExtra = new Intent(context, (Class<?>) VKConfirmationActivity.class).addFlags(268435456).putExtra("key_message", str7);
                intentPutExtra.getClass();
                context.startActivity(intentPutExtra);
                return;
            case 15:
                fck0 fck0Var = (fck0) this.b;
                qfu0 qfu0Var = (qfu0) this.c;
                qlo qloVar = (qlo) fck0Var.c;
                String str8 = vtt0.f38024a;
                ulo uloVar = qloVar.f28944a;
                uloVar.i0 = qfu0Var;
                uloVar.m.e(25, new esj(qfu0Var));
                return;
            case 16:
                fck0 fck0Var2 = (fck0) this.b;
                tkj tkjVar = (tkj) this.c;
                synchronized (tkjVar) {
                }
                qlo qloVar2 = (qlo) fck0Var2.c;
                String str9 = vtt0.f38024a;
                fsj fsjVar = qloVar2.f28944a.s;
                ft2 ft2VarJ = fsjVar.J((vn30) fsjVar.d.e);
                fsjVar.N(ft2VarJ, 1020, new z9f(ft2VarJ, tkjVar, (byte) 9));
                return;
            case 17:
                fck0 fck0Var3 = (fck0) this.b;
                hyc hycVar = (hyc) this.c;
                qlo qloVar3 = (qlo) fck0Var3.c;
                String str10 = vtt0.f38024a;
                qloVar3.f28944a.G.A(hycVar);
                return;
            case 18:
                vlu0 vlu0Var = (vlu0) this.b;
                View[] viewArr = (View[]) this.c;
                if (vlu0Var.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(vlu0Var.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (vlu0Var.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(vlu0Var.q, null);
                    }
                    return;
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                m9c m9cVar = (m9c) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                hcp0 hcp0Var = (hcp0) m9cVar.c;
                if (atomicBoolean.get()) {
                    new Thread(new qaq0(hcp0Var, atomicBoolean, (byte) 20), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 20:
                hcp0 hcp0Var2 = (hcp0) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (hcp0Var2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) hcp0Var2.c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            default:
                yqv0 yqv0Var = (yqv0) this.b;
                glz glzVar = (glz) this.c;
                if (yqv0Var.c) {
                    return;
                }
                yqv0Var.d = glzVar;
                glzVar.a(yqv0Var);
                return;
        }
    }
}
