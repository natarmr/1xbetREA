package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29471a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qx9(txj txjVar, agn agnVar, tu9 tu9Var) {
        this.f29471a = (byte) 3;
        Map map = Collections.EMPTY_MAP;
        this.b = txjVar;
        this.c = agnVar;
        this.d = map;
        this.e = tu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte b = this.f29471a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((o3a) obj4).f24573a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj, (TotalCaptureResult) obj2);
                return;
            case 1:
                ((o3a) obj4).f24573a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj, (CaptureFailure) obj2);
                return;
            case 2:
                swj swjVar = (swj) obj4;
                q55 q55Var = (q55) obj3;
                String str = q55Var.f28133a;
                fps0 fps0Var = (fps0) obj;
                q35 q35Var = (q35) obj2;
                swjVar.getClass();
                Logger logger = swj.f;
                try {
                    los0 los0VarA = swjVar.c.a(str);
                    if (los0VarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        fps0Var.b(new IllegalArgumentException(str2));
                    } else {
                        swjVar.e.l(new hi(swjVar, q55Var, ((k8b) los0VarA).a(q35Var), (byte) 4));
                        fps0Var.b(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    fps0Var.b(e);
                    return;
                }
            case 3:
                txj txjVar = (txj) obj4;
                agn agnVar = (agn) obj3;
                Map map = Collections.EMPTY_MAP;
                tu9 tu9Var = (tu9) obj2;
                try {
                    txjVar.f34703a.o(agnVar);
                    tu9Var.b(null);
                    return;
                } catch (RuntimeException e2) {
                    tu9Var.d(e2);
                    return;
                }
            case 4:
                mbn mbnVar = (mbn) obj4;
                agn agnVar2 = (agn) obj3;
                Map map2 = Collections.EMPTY_MAP;
                tu9 tu9Var2 = (tu9) obj2;
                try {
                    mbnVar.f21518a.o(agnVar2);
                    tu9Var2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    tu9Var2.d(e3);
                    return;
                }
            case 5:
                Fragment fragment = (Fragment) obj4;
                fragment.l1 = fragment.X((LayoutInflater) obj3, (ViewGroup) obj, (Bundle) obj2);
                return;
            case 6:
                LoadableImageView.l((LoadableImageView) obj4, (Drawable) obj3, (Function1) obj, (Function1) obj2);
                return;
            case 7:
                String strSubstring = (String) obj4;
                Function0 function0 = (Function0) obj3;
                hy40 hy40Var = (hy40) obj;
                tu9 tu9Var3 = (tu9) obj2;
                boolean zW = afn0.w();
                if (zW) {
                    try {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } catch (Throwable th) {
                        if (zW) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    function0.invoke();
                    k080 k080Var = gqw0.w1;
                    hy40Var.i(k080Var);
                    tu9Var3.b(k080Var);
                    break;
                } catch (Throwable th2) {
                    hy40Var.i(new j080(th2));
                    tu9Var3.d(th2);
                    break;
                }
                if (zW) {
                    Trace.endSection();
                    return;
                }
                return;
            case 8:
                WorkDatabase workDatabase = (WorkDatabase) obj4;
                xov0 xov0Var = (xov0) obj3;
                List list = (List) obj;
                wsd wsdVar = (wsd) obj2;
                upv0 upv0VarY = workDatabase.y();
                String str3 = xov0Var.f41241a;
                upv0VarY.getClass();
                str3.getClass();
                if (((Boolean) kpb.h0(upv0VarY.f36087a, true, false, new ka6(str3, (byte) 23))).booleanValue()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((j2h0) it.next()).b(xov0Var.f41241a);
                }
                m2h0.b(wsdVar, workDatabase, list);
                return;
            case 9:
                raq0 raq0Var = (raq0) obj4;
                Surface surface = (Surface) obj3;
                wu9 wu9Var = (wu9) obj;
                pmn0 pmn0Var = (pmn0) obj2;
                l8x.U("TextureViewImpl", "Safe to release surface.");
                hi hiVar = raq0Var.l;
                if (hiVar != null) {
                    hiVar.b();
                    raq0Var.l = null;
                }
                surface.release();
                if (raq0Var.g == wu9Var) {
                    raq0Var.g = null;
                }
                if (raq0Var.h == pmn0Var) {
                    raq0Var.h = null;
                    return;
                }
                return;
            case 10:
                ywq0 ywq0Var = (ywq0) obj4;
                String str4 = (String) obj3;
                Map map3 = (Map) obj;
                List list2 = (List) obj2;
                oa40 oa40Var = (oa40) ywq0Var.f43384a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) ywq0Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    oa40Var.j(str4, (String) atomicMarkableReference.getReference());
                }
                if (!map3.isEmpty()) {
                    oa40Var.h(str4, map3, false);
                }
                if (list2.isEmpty()) {
                    return;
                }
                oa40Var.i(str4, list2);
                return;
            default:
                Context context = (Context) obj4;
                context.getClass();
                Intent intentPutExtra = new Intent(context, (Class<?>) VKCaptchaActivity.class).addFlags(268435456).putExtra("key_url", (String) obj3).putExtra("key_height", (Integer) obj).putExtra("key_width", (Integer) obj2);
                intentPutExtra.getClass();
                context.startActivity(intentPutExtra);
                return;
        }
    }

    public /* synthetic */ qx9(std stdVar, String str, Function0 function0, hy40 hy40Var, tu9 tu9Var) {
        this.f29471a = (byte) 7;
        this.b = str;
        this.c = function0;
        this.d = hy40Var;
        this.e = tu9Var;
    }

    public /* synthetic */ qx9(mbn mbnVar, agn agnVar, tu9 tu9Var) {
        this.f29471a = (byte) 4;
        Map map = Collections.EMPTY_MAP;
        this.b = mbnVar;
        this.c = agnVar;
        this.d = map;
        this.e = tu9Var;
    }

    public /* synthetic */ qx9(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f29471a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
