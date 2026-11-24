package a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.HorizontalScrollView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes.dex */
public final class mx2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22533a;
    public final Object b;

    public /* synthetic */ mx2(ViewGroup viewGroup, ViewGroup viewGroup2, byte b) {
        this.f22533a = b;
        this.b = viewGroup2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        a.l8x.Y("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L4f
            a.rgi0 r2 = (a.rgi0) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.f30438a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            a.rgi0 r0 = (a.rgi0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L69
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            a.rgi0 r4 = (a.rgi0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f30438a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L20
            a.rgi0 r10 = (a.rgi0) r10     // Catch: java.lang.Throwable -> L20
            r10.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            a.l8x.Y(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mx2.a():void");
    }

    /* JADX WARN: Code duplicated, block: B:241:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4  */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int actionMasked;
        int i;
        boolean zA;
        int iO;
        Object obj;
        xi xiVar;
        byte b = 8;
        byte b2 = 2;
        int iO2 = 0;
        switch (this.f22533a) {
            case 0:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.b;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.N1;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked == 7) {
                    i = 7;
                } else if (actionMasked == 8) {
                    i = 9;
                } else if (actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                androidComposeView.J(motionEvent, i, androidComposeView.O1, false);
                return;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                if (appStartTrace.i == null) {
                    appStartTrace.j = new Timer();
                    return;
                }
                return;
            case 2:
                rf00 rf00Var = (rf00) this.b;
                hil hilVar = rf00Var.c;
                g05 g05Var = rf00Var.f30363a;
                if (rf00Var.n) {
                    if (rf00Var.l) {
                        rf00Var.l = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        g05Var.e = jCurrentAnimationTimeMillis;
                        g05Var.g = -1L;
                        g05Var.f = jCurrentAnimationTimeMillis;
                        g05Var.h = 0.5f;
                    }
                    if ((g05Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > g05Var.g + ((long) g05Var.i)) || !rf00Var.e()) {
                        rf00Var.n = false;
                        return;
                    }
                    if (rf00Var.m) {
                        rf00Var.m = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        hilVar.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (g05Var.f == 0) {
                        itt0.k("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = g05Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - g05Var.f;
                    g05Var.f = jCurrentAnimationTimeMillis2;
                    rf00Var.p.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * g05Var.d));
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    hilVar.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                qo8 qo8Var = (qo8) this.b;
                qo8Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) qo8Var.e;
                ygu0 ygu0Var = bottomSheetBehavior.Q;
                if (ygu0Var != null && ygu0Var.f()) {
                    qo8Var.d(qo8Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.O(qo8Var.b);
                        return;
                    }
                    return;
                }
            case 4:
                esd esdVar = (esd) this.b;
                synchronized (esdVar) {
                    zA = esdVar.a();
                    if (zA) {
                        synchronized (esdVar) {
                            esdVar.b = true;
                        }
                    }
                }
                if (zA) {
                    if (new Date(System.currentTimeMillis()).before(esdVar.p.c().b)) {
                        esdVar.h();
                        return;
                    }
                    cgq cgqVar = (cgq) esdVar.k;
                    Task taskD = cgqVar.d();
                    Task taskC = cgqVar.c();
                    Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskC}).continueWithTask(esdVar.h, new hi(esdVar, taskD, taskC, b2));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(esdVar.h, new uq(esdVar, taskContinueWithTask, b));
                    return;
                }
                return;
            case 5:
                sik sikVar = (sik) this.b;
                sikVar.K1.onDismiss(sikVar.S1);
                return;
            case 6:
                m5l m5lVar = (m5l) this.b;
                dc3 dc3Var = m5lVar.f21225a;
                ((HorizontalScrollView) dc3Var.e).scrollTo(m5lVar.getLayoutDirection() == 1 ? ((HorizontalScrollView) dc3Var.e).getMeasuredWidth() : 0, 0);
                return;
            case 7:
                o6l o6lVar = (o6l) this.b;
                o6lVar.scrollTo(o6lVar.getLayoutDirection() == 1 ? o6lVar.getMeasuredWidth() : 0, 0);
                return;
            case 8:
                hil hilVar2 = (hil) this.b;
                hilVar2.l = null;
                hilVar2.drawableStateChanged();
                return;
            case 9:
                DsTimer dsTimer = (DsTimer) this.b;
                Handler handler = dsTimer.g;
                handler.removeCallbacks(this);
                boolean zE = dsTimer.e();
                dsTimer.l = zE;
                if (zE && dsTimer.getVisibility() == 0) {
                    handler.postDelayed(this, dsTimer.h);
                    return;
                }
                return;
            case 10:
                m0p m0pVar = (m0p) this.b;
                ValueAnimator valueAnimator = m0pVar.z;
                byte b3 = m0pVar.A;
                if (b3 == 1) {
                    valueAnimator.cancel();
                } else if (b3 != 2) {
                    return;
                }
                m0pVar.A = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 11:
                zdq zdqVar = (zdq) this.b;
                Context contextD = zdqVar.D();
                if (contextD == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                zdqVar.a2.w(1);
                t58 t58Var = zdqVar.a2;
                String string = contextD.getString(R.string.fingerprint_dialog_touch_sensor);
                hy40 hy40Var = t58Var.C;
                if (hy40Var == null) {
                    hy40Var = new hy40();
                    t58Var.C = hy40Var;
                }
                t58.z(hy40Var, string);
                return;
            case 12:
                Fragment fragment = (Fragment) this.b;
                if (fragment.o1 != null) {
                    fragment.A();
                    return;
                }
                return;
            case 13:
                ((androidx.fragment.app.e) this.b).C(true);
                return;
            case 14:
                f5r f5rVar = (f5r) this.b;
                f5rVar.k = false;
                f5rVar.C();
                return;
            case 15:
                imv.c((n5a) this.b);
                return;
            case 16:
                gxu gxuVar = (gxu) this.b;
                kmv kmvVar = (kmv) gxuVar.c;
                if (kmvVar.f18559a.getAndSet(null) != null) {
                    ((Handler) gxuVar.f12096a).removeCallbacks(kmvVar);
                    return;
                }
                return;
            case 17:
                vyx vyxVar = (vyx) this.b;
                if (vyxVar.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = vyxVar.A;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    androidx.recyclerview.widget.b layoutManager = vyxVar.q.getLayoutManager();
                    Rect rect = vyxVar.z;
                    if (rect == null) {
                        rect = new Rect();
                        vyxVar.z = rect;
                    }
                    layoutManager.p(rect, vyxVar.c.f40887a);
                    if (layoutManager.q()) {
                        int i2 = (int) (vyxVar.j + vyxVar.h);
                        int paddingLeft = (i2 - vyxVar.z.left) - vyxVar.q.getPaddingLeft();
                        float f = vyxVar.h;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((vyxVar.c.f40887a.getWidth() + i2) + vyxVar.z.right) - (vyxVar.q.getWidth() - vyxVar.q.getPaddingRight())) <= 0)) {
                            iO = 0;
                        } else {
                            iO = paddingLeft;
                        }
                    } else {
                        iO = 0;
                    }
                    if (layoutManager.r()) {
                        int i3 = (int) (vyxVar.k + vyxVar.i);
                        int paddingTop = (i3 - vyxVar.z.top) - vyxVar.q.getPaddingTop();
                        float f2 = vyxVar.i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((vyxVar.c.f40887a.getHeight() + i3) + vyxVar.z.bottom) - (vyxVar.q.getHeight() - vyxVar.q.getPaddingBottom())) > 0)) {
                            iO2 = paddingTop;
                        }
                    }
                    if (iO != 0) {
                        iO = vyxVar.m.o(vyxVar.q, vyxVar.c.f40887a.getWidth(), iO, vyxVar.q.getWidth(), j3);
                    }
                    int i4 = iO;
                    if (iO2 != 0) {
                        iO2 = vyxVar.m.o(vyxVar.q, vyxVar.c.f40887a.getHeight(), iO2, vyxVar.q.getHeight(), j3);
                    }
                    if (i4 == 0 && iO2 == 0) {
                        vyxVar.A = Long.MIN_VALUE;
                        return;
                    }
                    if (vyxVar.A == Long.MIN_VALUE) {
                        vyxVar.A = jCurrentTimeMillis;
                    }
                    vyxVar.q.scrollBy(i4, iO2);
                    xhe0 xhe0Var = vyxVar.c;
                    if (xhe0Var != null) {
                        vyxVar.q(xhe0Var);
                    }
                    vyxVar.q.removeCallbacks(vyxVar.r);
                    RecyclerView recyclerView = vyxVar.q;
                    WeakHashMap weakHashMap2 = rgu0.f30456a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 18:
                gd00 gd00Var = (gd00) this.b;
                gd00Var.b = null;
                gd00Var.f11084a = null;
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                synchronized (((wh00) this.b).f39142a) {
                    obj = ((wh00) this.b).f;
                    ((wh00) this.b).f = wh00.k;
                    break;
                }
                ((wh00) this.b).l(obj);
                return;
            case 20:
                ((lq00) this.b).i();
                return;
            case 21:
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) this.b;
                matchInfoContainerView.getBinding().i.y0(matchInfoContainerView.h1.b);
                return;
            case 22:
                aa40 aa40Var = (aa40) this.b;
                if (aa40Var.h) {
                    if (((guc) aa40Var.m.getValue()).g.get()) {
                        if (System.currentTimeMillis() - aa40Var.g >= 15000) {
                            aa40Var.g = System.currentTimeMillis();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$type", 6);
                            try {
                                e0g0 e0g0Var = j0g0.b;
                                String string2 = jSONObject.toString();
                                string2.getClass();
                                aa40Var.b(string2);
                            } catch (Throwable unused) {
                                e0g0 e0g0Var2 = j0g0.b;
                            }
                            break;
                        }
                        jwd jwdVar = aa40Var.c;
                        if (jwdVar != null) {
                            jwdVar.invoke();
                        }
                        aa40Var.k.postDelayed(this, 5000L);
                        return;
                    }
                    Collection<z940> collectionValues = aa40Var.j.values();
                    collectionValues.getClass();
                    for (z940 z940Var : collectionValues) {
                        UnknownHostException unknownHostException = new UnknownHostException();
                        z940Var.f44000a.j.remove(Integer.valueOf(z940Var.b));
                        n5a n5aVar = z940Var.d;
                        e0g0 e0g0Var3 = j0g0.b;
                        n5aVar.resumeWith(new g0g0(unknownHostException));
                    }
                    ejd ejdVar = aa40Var.d;
                    if (ejdVar != null) {
                        ejdVar.invoke(new TimeoutException());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ((MotionLayout) this.b).N1.a();
                return;
            case 24:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.g) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.g = false;
                    return;
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((rgi0) this.b).f30438a) {
                        ((rgi0) this.b).d = 1;
                        throw e;
                    }
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((StaggeredGridLayoutManager) this.b).U0();
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ActionMenuView actionMenuView = ((Toolbar) this.b).f45299a;
                if (actionMenuView == null || (xiVar = actionMenuView.t) == null) {
                    return;
                }
                xiVar.l();
                return;
            default:
                ((ygu0) this.b).m(0);
                return;
        }
    }

    public /* synthetic */ mx2(Object obj, byte b) {
        this.f22533a = b;
        this.b = obj;
    }
}
