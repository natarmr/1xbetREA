package a;

import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class apj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1255a;
    public final /* synthetic */ Object b;

    public /* synthetic */ apj0(o55 o55Var, ozw ozwVar) {
        this.f1255a = (byte) 12;
        this.b = o55Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        View viewFindFocus;
        byte b = this.f1255a;
        boolean z = true;
        String str = null;
        Map mapUnmodifiableMap = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                y3v y3vVar = (y3v) obj;
                synchronized (((ArrayDeque) y3vVar.c)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) y3vVar.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) y3vVar.c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(Separators.COMMA);
                    }
                    editorEdit.putString("topic_operation_queue", sb.toString()).apply();
                    break;
                }
                return;
            case 1:
                qo8 qo8Var = (qo8) obj;
                qo8Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) qo8Var.e;
                ygu0 ygu0Var = sideSheetBehavior.i;
                if (ygu0Var != null && ygu0Var.f()) {
                    qo8Var.d(qo8Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.y(qo8Var.b);
                        return;
                    }
                    return;
                }
            case 2:
                qxk0 qxk0Var = (qxk0) obj;
                int i = qxk0.l;
                Surface surface = qxk0Var.h;
                if (surface != null) {
                    Iterator it2 = qxk0Var.f29488a.iterator();
                    while (it2.hasNext()) {
                        ((qlo) it2.next()).f28944a.S(null);
                    }
                }
                SurfaceTexture surfaceTexture = qxk0Var.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                qxk0Var.g = null;
                qxk0Var.h = null;
                return;
            case 3:
                j2m0 j2m0Var = (j2m0) obj;
                LinearLayoutManager linearLayoutManager = j2m0Var.f;
                int iF1 = linearLayoutManager != null ? linearLayoutManager.f1() : -1;
                if (iF1 == -1 && (iF1 = j2m0Var.l) <= 0) {
                    iF1 = j2m0Var.j;
                }
                j2m0Var.g(iF1, true);
                return;
            case 4:
                r4n0 r4n0Var = (r4n0) obj;
                r4n0Var.i();
                DsSearchField dsSearchField = r4n0Var.k;
                String strValueOf = String.valueOf(dsSearchField.getEditText().getText());
                if (strValueOf.length() == 0) {
                    dsSearchField.setHint(r4n0Var.h);
                }
                dsSearchField.getEditText().setSelection(strValueOf.length());
                return;
            case 5:
                kgn0.setSeparatorBigText$lambda$0((kgn0) obj);
                return;
            case 6:
                btd btdVar = (btd) ((cyu) obj).c;
                if (btdVar != null) {
                    Iterator it3 = btdVar.values().iterator();
                    while (it3.hasNext()) {
                        ((cmn0) it3.next()).b();
                    }
                    return;
                }
                return;
            case 7:
                ((hi) obj).b();
                return;
            case 8:
                int[] iArr = SwipeRefreshLayout.o1;
                ((SwipeRefreshLayout) obj).l();
                return;
            case 9:
                j6m0 j6m0Var = vvn0.W1;
                ((CardStackLayoutManager) obj).r.f = 0;
                return;
            case 10:
                a9o0 a9o0Var = ((b9o0) obj).f2221a;
                ViewParent parent = a9o0Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(a9o0Var);
                    return;
                }
                return;
            case 11:
                TableViewImpl.setupHorizontalEdgeFading$lambda$0((TableViewImpl) obj);
                return;
            case 12:
                mz9 mz9Var = ((o55) obj).d;
                if (mz9Var == null) {
                    jf4.n("One and only one callback is allowed.");
                    return;
                }
                qz9 qz9Var = mz9Var.f22642a;
                kl5 kl5Var = qz9.t2;
                qz9Var.S0().C(t0k0.f33124a);
                return;
            case 13:
                int[][] iArr2 = TextInputLayout.e2;
                ((TextInputLayout) obj).e.requestLayout();
                return;
            case 14:
                q8q0 q8q0Var = (q8q0) obj;
                y3v y3vVar2 = q8q0Var.b;
                q8q0Var.n = null;
                xz40 xz40Var = q8q0Var.m;
                View view = q8q0Var.f28312a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    xz40Var.g();
                    return;
                }
                mie0 mie0Var = new mie0();
                mie0 mie0Var2 = new mie0();
                Object[] objArr = xz40Var.f41739a;
                int i2 = xz40Var.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    p8q0 p8q0Var = (p8q0) objArr[i3];
                    int iOrdinal = p8q0Var.ordinal();
                    if (iOrdinal == 0) {
                        Boolean bool = Boolean.TRUE;
                        mie0Var.f21842a = bool;
                        mie0Var2.f21842a = bool;
                    } else if (iOrdinal == 1) {
                        Boolean bool2 = Boolean.FALSE;
                        mie0Var.f21842a = bool2;
                        mie0Var2.f21842a = bool2;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        t9f.b();
                        return;
                    } else if (!Intrinsics.d(mie0Var.f21842a, Boolean.FALSE)) {
                        mie0Var2.f21842a = Boolean.valueOf(p8q0Var == p8q0.c);
                    }
                }
                xz40Var.g();
                if (Intrinsics.d(mie0Var.f21842a, Boolean.TRUE)) {
                    ((InputMethodManager) ((a8z) y3vVar2.c).getValue()).restartInput((View) y3vVar2.b);
                }
                Boolean bool3 = (Boolean) mie0Var2.f21842a;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((lef0) ((ani0) y3vVar2.d).f1155a).l();
                    } else {
                        ((lef0) ((ani0) y3vVar2.d).f1155a).h();
                    }
                }
                if (Intrinsics.d(mie0Var.f21842a, Boolean.FALSE)) {
                    ((InputMethodManager) ((a8z) y3vVar2.c).getValue()).restartInput((View) y3vVar2.b);
                    return;
                }
                return;
            case 15:
                ArrayList arrayList = (ArrayList) obj;
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((ExecutorService) it4.next()).shutdownNow();
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((ExecutorService) it5.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            case 16:
                HandlerThread handlerThread = (HandlerThread) obj;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 17:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 18:
                qrq0 qrq0Var = (qrq0) obj;
                qrq0Var.i();
                DsSearchField dsSearchField2 = qrq0Var.l;
                String strValueOf2 = String.valueOf(dsSearchField2.getEditText().getText());
                if (strValueOf2.length() == 0) {
                    dsSearchField2.setHint(qrq0Var.h);
                }
                dsSearchField2.getEditText().setSelection(strValueOf2.length());
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ywq0 ywq0Var = (ywq0) obj;
                synchronized (((AtomicMarkableReference) ywq0Var.g)) {
                    try {
                        if (((AtomicMarkableReference) ywq0Var.g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) ywq0Var.g).getReference();
                            ((AtomicMarkableReference) ywq0Var.g).set(str, false);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    ((oa40) ywq0Var.f43384a).j((String) ywq0Var.c, str);
                    return;
                }
                return;
            case 20:
                o24 o24Var = (o24) obj;
                ((AtomicReference) o24Var.c).set(null);
                synchronized (o24Var) {
                    if (((AtomicMarkableReference) o24Var.b).isMarked()) {
                        qmy qmyVar = (qmy) ((AtomicMarkableReference) o24Var.b).getReference();
                        synchronized (qmyVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(qmyVar.f29008a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o24Var.b;
                        atomicMarkableReference.set((qmy) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    ywq0 ywq0Var2 = (ywq0) o24Var.d;
                    ((oa40) ywq0Var2.f43384a).h((String) ywq0Var2.c, mapUnmodifiableMap, o24Var.f24513a);
                    return;
                }
                return;
            case 21:
                yeu0 yeu0Var = (yeu0) obj;
                yeu0Var.f39037a.postVsyncCallback(yeu0Var);
                return;
            case 22:
                nov0 nov0Var = (nov0) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + nov0Var.f23885a.getAction() + " finishing.");
                nov0Var.b.trySetResult(null);
                return;
            case 23:
                fht0 fht0Var = (fht0) obj;
                ((wpg0) fht0Var.d).l(new ytt0(fht0Var, (byte) 5));
                return;
            default:
                ((x3w0) obj).f40240a.invoke();
                return;
        }
    }

    public /* synthetic */ apj0(Object obj, byte b) {
        this.f1255a = b;
        this.b = obj;
    }
}
