package a;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.Layout;
import android.util.Log;
import android.util.Size;
import android.view.ActionMode;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1783a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b1(j8f j8fVar, Throwable th) {
        this.f1783a = (byte) 9;
        Map map = Collections.EMPTY_MAP;
        this.c = j8fVar;
        this.b = th;
        this.d = map;
    }

    private final void a() {
        boolean zBooleanValue;
        xov0 xov0VarK;
        ArrayList arrayList;
        ezb0 ezb0Var = (ezb0) this.b;
        wu9 wu9Var = (wu9) this.c;
        nqv0 nqv0Var = (nqv0) this.d;
        ezb0Var.getClass();
        try {
            zBooleanValue = ((Boolean) wu9Var.b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (ezb0Var.k) {
            try {
                xov0VarK = jpm0.k(nqv0Var.f23975a);
                String str = xov0VarK.f41241a;
                if (ezb0Var.c(str) == nqv0Var) {
                    ezb0Var.b(str);
                }
                wv00.f().a(ezb0.l, ezb0.class.getSimpleName() + Separators.SP + str + " executed; reschedule = " + zBooleanValue);
                arrayList = new ArrayList(ezb0Var.j);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zjo) it.next()).c(xov0VarK, zBooleanValue);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0a n0aVar;
        wh00 wh00VarB;
        JSONObject jSONObjectOptJSONObject;
        int ellipsisCount;
        Object value;
        InputMethodManager inputMethodManager = null;
        Object obj = null;
        switch (this.f1783a) {
            case 0:
                Throwable th = (Throwable) this.b;
                c1 c1Var = (c1) this.c;
                List list = (List) this.d;
                if (th != null) {
                    c1Var.b.onError(th);
                    return;
                } else {
                    c1Var.b.a(list);
                    return;
                }
            case 1:
                h23 h23Var = (h23) this.b;
                f23 f23Var = (f23) this.c;
                g23 g23Var = (g23) this.d;
                ActionMode actionModeStartActionMode = h23Var.f12312a.startActionMode(new emq(f23Var), 1);
                h23Var.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    g23Var.close();
                    return;
                }
                return;
            case 2:
                Context context = (Context) this.b;
                IBinder iBinder = (IBinder) this.c;
                Function0 function0 = (Function0) this.d;
                Object systemService = context.getSystemService("input_method");
                inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                }
                function0.invoke();
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                vg00 vg00Var = (vg00) this.d;
                byte b = 15;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new w1(vg00Var, b));
                    }
                    synchronized (l44.r) {
                        try {
                            int i = l44.t - 1;
                            l44.t = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = l44.s;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                l44.s = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new w1(vg00Var, b));
                    }
                    synchronized (l44.r) {
                        try {
                            int i2 = l44.t - 1;
                            l44.t = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = l44.s;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                l44.s = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 4:
                ((vx9) this.b).b(ux9.g((gnf0) this.c), (j9a) this.d);
                return;
            case 5:
                ((vx9) this.b).c(ux9.g((gnf0) this.c), (yk5) this.d);
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.b;
                ee60 ee60Var = (ee60) this.c;
                String str = (String) this.d;
                try {
                    for (Object obj2 : arrayList) {
                        if (Intrinsics.d(((n0a) obj2).e(), str)) {
                            obj = obj2;
                            n0aVar = (n0a) obj;
                            if (n0aVar != null || (wh00VarB = n0aVar.b()) == null) {
                                return;
                            }
                            wh00VarB.j(ee60Var);
                            return;
                        }
                    }
                    n0aVar = (n0a) obj;
                    if (n0aVar != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 7:
                off0 off0Var = (off0) this.b;
                String str2 = (String) this.c;
                mrd mrdVar = (mrd) this.d;
                zn00 zn00Var = off0Var.f25166a;
                vp2 vp2Var = (vp2) ((p5d0) zn00Var.f44650a).get();
                if (vp2Var == null) {
                    return;
                }
                JSONObject jSONObject = mrdVar.e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = mrdVar.b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) zn00Var.b)) {
                        try {
                            if (!strOptString.equals(((Map) zn00Var.b).get(str2))) {
                                ((Map) zn00Var.b).put(str2, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str2);
                                bundle.putString("arm_value", jSONObject2.optString(str2));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                wp2 wp2Var = (wp2) vp2Var;
                                wp2Var.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                wp2Var.a("fp", "_fpc", bundle2);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    return;
                }
                return;
            case 8:
                j8f j8fVar = (j8f) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                f8f f8fVar = j8fVar.g;
                f8fVar.getClass();
                try {
                    ((o24) f8fVar.d.d).s(str3, str4);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context2 = f8fVar.f9100a;
                    if (context2 != null && (context2.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 9:
                j8f j8fVar2 = (j8f) this.c;
                Throwable th6 = (Throwable) this.b;
                Map map = Collections.EMPTY_MAP;
                f8f f8fVar2 = j8fVar2.g;
                Thread threadCurrentThread = Thread.currentThread();
                f8fVar2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                y9f y9fVar = f8fVar2.n;
                if (y9fVar == null || !y9fVar.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = f8fVar2.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    qeo qeoVar = new qeo(strE, j, map);
                    ywq0 ywq0Var = f8fVar2.m;
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    ywq0Var.v(th6, threadCurrentThread, "error", qeoVar, false);
                    return;
                }
                return;
            case 10:
                zri zriVar = (zri) this.b;
                pp9 pp9Var = (pp9) this.c;
                jtf0 jtf0Var = (jtf0) this.d;
                ktj ktjVar = (ktj) zriVar.c;
                if (ktjVar.b.q()) {
                    pp9Var.m(ktjVar, new IOException("Canceled"));
                    return;
                } else {
                    pp9Var.g(ktjVar, jtf0Var);
                    return;
                }
            case 11:
                ((pp9) this.d).m((ktj) ((zri) this.c).c, (Throwable) this.b);
                return;
            case 12:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                ixj ixjVar = (ixj) this.d;
                viewGroup.endViewTransition(view);
                ((rnk0) ixjVar.c.b).c(ixjVar);
                return;
            case 13:
                txj txjVar = (txj) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (txjVar.j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 14:
                DsAccountSelection dsAccountSelection = (DsAccountSelection) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                String str5 = (String) this.d;
                jg jgVar = dsAccountSelection.q;
                Layout layout = jgVar.b.getLayout();
                if (layout == null || (ellipsisCount = layout.getEllipsisCount(0)) <= 0) {
                    return;
                }
                TextView textView = jgVar.b;
                int length = textView.getText().length() - ellipsisCount;
                int length2 = length - (charSequence.length() + 1);
                if (length2 >= length / 2) {
                    CharSequence text = textView.getText();
                    text.getClass();
                    str5 = String.format("%s… %s", Arrays.copyOf(new Object[]{text.subSequence(0, length2).toString(), charSequence}, 2));
                }
                textView.setText(str5);
                return;
            case 15:
                mbn mbnVar = (mbn) this.b;
                Runnable runnable3 = (Runnable) this.c;
                Runnable runnable4 = (Runnable) this.d;
                if (mbnVar.f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 16:
                dwj dwjVar = (dwj) this.b;
                rcb rcbVar = (rcb) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    zrq zrqVarQ = aac.Q(dwjVar.f6801a);
                    if (zrqVarQ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    yrq yrqVar = (yrq) zrqVarQ.f44869a;
                    synchronized (yrqVar.c) {
                        yrqVar.e = threadPoolExecutor;
                        break;
                    }
                    zrqVarQ.f44869a.a(new ssn(rcbVar, threadPoolExecutor));
                    return;
                } catch (Throwable th7) {
                    rcbVar.a1(th7);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 17:
                vyn vynVar = (vyn) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    vynVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 18:
                ((mzw) this.b).K((Executor) this.c, (mz9) this.d);
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                tu9 tu9Var = (tu9) this.c;
                zbg0 zbg0Var = (zbg0) this.d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    zbg0Var.invoke();
                    tu9Var.b(null);
                    return;
                } catch (Throwable th8) {
                    tu9Var.d(th8);
                    return;
                }
            case 20:
                Function1 function1 = (Function1) this.c;
                Throwable th9 = (Throwable) this.b;
                LoadableImageView loadableImageView = (LoadableImageView) this.d;
                int i3 = LoadableImageView.i;
                if (((Boolean) function1.invoke(th9)).booleanValue()) {
                    return;
                }
                loadableImageView.h.invoke(th9);
                return;
            case 21:
                pn30 pn30Var = (pn30) this.b;
                u3x u3xVar = (u3x) this.c;
                vn30 vn30Var = (vn30) this.d;
                fsj fsjVar = pn30Var.c;
                rcf0 rcf0VarG = u3xVar.g();
                uii uiiVar = fsjVar.d;
                my90 my90Var = fsjVar.g;
                my90Var.getClass();
                uiiVar.b = b4x.o(rcf0VarG);
                if (!rcf0VarG.isEmpty()) {
                    uiiVar.e = (vn30) rcf0VarG.get(0);
                    vn30Var.getClass();
                    uiiVar.f = vn30Var;
                }
                if (((vn30) uiiVar.d) == null) {
                    uiiVar.d = uii.g(my90Var, (b4x) uiiVar.b, (vn30) uiiVar.e, (amq0) uiiVar.f35730a);
                }
                uiiVar.K(((ulo) my90Var).n());
                return;
            case 22:
                ((tea0) this.b).a((SurfaceView) this.c, (wss) this.d);
                return;
            case 23:
                a();
                return;
            case 24:
                ((SessionManager) this.b).lambda$setApplicationContext$0((Context) this.c, (PerfSession) this.d);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                RecyclerView recyclerView = (RecyclerView) this.b;
                iej0 iej0Var = (iej0) this.c;
                t1j0 t1j0Var = (t1j0) this.d;
                recyclerView.b0();
                if (iej0Var.b) {
                    recyclerView.y0(0);
                    zie0 zie0Var = t1j0.Y1;
                    p7m0 p7m0Var = t1j0Var.I0().X0;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, caj0.a((caj0) value, false, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554429)));
                    return;
                }
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((cyu) this.b).f((cmn0) this.c, (Map.Entry) this.d);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wmn0 wmn0Var = (wmn0) this.b;
                pmn0 pmn0Var = (pmn0) this.c;
                hi hiVar = (hi) this.d;
                vmn0 vmn0Var = wmn0Var.f;
                vmn0Var.a();
                if (vmn0Var.g) {
                    vmn0Var.g = false;
                    pmn0Var.c();
                    pmn0Var.i.b(null);
                    return;
                }
                vmn0Var.b = pmn0Var;
                vmn0Var.d = hiVar;
                Size size = pmn0Var.b;
                vmn0Var.f37680a = size;
                vmn0Var.f = false;
                if (vmn0Var.b()) {
                    return;
                }
                l8x.U("SurfaceViewImpl", "Wait for new Surface creation.");
                vmn0Var.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dps0 dps0Var = (dps0) this.b;
                set setVar = (set) this.c;
                ts3 ts3Var = (ts3) this.d;
                md90 md90VarT = nd90.t();
                md90VarT.i();
                ((nd90) md90VarT.b).v(setVar);
                dps0Var.d(md90VarT, ts3Var);
                return;
            default:
                dps0 dps0Var2 = (dps0) this.b;
                ibs0 ibs0Var = (ibs0) this.c;
                ts3 ts3Var2 = (ts3) this.d;
                md90 md90VarT2 = nd90.t();
                md90VarT2.i();
                ((nd90) md90VarT2.b).x(ibs0Var);
                dps0Var2.d(md90VarT2, ts3Var2);
                return;
        }
    }

    public /* synthetic */ b1(vx9 vx9Var, ux9 ux9Var, gnf0 gnf0Var, Object obj, byte b) {
        this.f1783a = b;
        this.b = vx9Var;
        this.c = gnf0Var;
        this.d = obj;
    }

    public /* synthetic */ b1(zri zriVar, pp9 pp9Var, Throwable th) {
        this.f1783a = (byte) 11;
        this.c = zriVar;
        this.d = pp9Var;
        this.b = th;
    }

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, byte b) {
        this.f1783a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ b1(Function1 function1, Throwable th, LoadableImageView loadableImageView) {
        this.f1783a = (byte) 20;
        this.c = function1;
        this.b = th;
        this.d = loadableImageView;
    }
}
