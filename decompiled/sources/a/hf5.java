package a;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes2.dex */
public final class hf5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12956a;
    public Object b;
    public Object c;
    public Object d;

    public hf5(a4x0 a4x0Var, AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.f12956a = (byte) 19;
        this.b = atomicReference;
        this.c = zzrVar;
        Objects.requireNonNull(a4x0Var);
        this.d = a4x0Var;
    }

    private final void a() {
        x6x0 x6x0Var;
        gpw0 gpw0Var = (gpw0) this.c;
        a4x0 a4x0Var = (a4x0) this.d;
        kxw0 kxw0Var = (kxw0) a4x0Var.b;
        String strO = null;
        try {
            try {
                wvw0 wvw0Var = kxw0Var.e;
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.e(wvw0Var);
                if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
                    gtw0 gtw0Var = a4x0Var.e;
                    if (gtw0Var != null) {
                        strO = gtw0Var.o((com.google.android.gms.measurement.internal.zzr) this.b);
                        if (strO != null) {
                            b1x0 b1x0Var = kxw0Var.m;
                            kxw0.f(b1x0Var);
                            b1x0Var.h.set(strO);
                            kxw0.e(wvw0Var);
                            wvw0Var.h.u(strO);
                        }
                        a4x0Var.y1();
                        x6x0Var = kxw0Var.i;
                        kxw0.e(x6x0Var);
                        x6x0Var.Z1(strO, gpw0Var);
                    }
                    kxw0.g(uuw0Var);
                    uuw0Var.g.a("Failed to get app instance id");
                } else {
                    kxw0.g(uuw0Var);
                    uuw0Var.l.a("Analytics storage consent denied; will not get app instance id");
                    b1x0 b1x0Var2 = kxw0Var.m;
                    kxw0.f(b1x0Var2);
                    b1x0Var2.h.set(null);
                    kxw0.e(wvw0Var);
                    wvw0Var.h.u(null);
                }
                x6x0Var = kxw0Var.i;
            } catch (RemoteException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Failed to get app instance id");
            }
            kxw0.e(x6x0Var);
            x6x0Var.Z1(strO, gpw0Var);
        } catch (Throwable th) {
            x6x0 x6x0Var2 = kxw0Var.i;
            kxw0.e(x6x0Var2);
            x6x0Var2.Z1(null, gpw0Var);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x035b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OverScroller overScroller;
        Object objCall;
        int i;
        Task taskN;
        zzbf zzbfVar;
        Cursor cursor;
        long j;
        Cursor cursorQuery;
        p6x0 p6x0VarP1;
        Cursor cursor2;
        AtomicReference atomicReference;
        int i2 = 8;
        int i3 = 2;
        switch (this.f12956a) {
            case 0:
                if5 if5Var = (if5) this.c;
                if5Var.i = false;
                DsBadge dsBadge = if5Var.c;
                if (dsBadge != null) {
                    jmu0.j(dsBadge, (ColorStateList) this.d);
                    return;
                }
                return;
            case 1:
                DsBadge dsBadge2 = ((if5) this.c).c;
                if (dsBadge2 != null) {
                    ViewGroup viewGroup = (ViewGroup) this.d;
                    AtomicLong atomicLong = jmu0.f16783a;
                    jmu0.j(dsBadge2, viewGroup.getBackgroundTintList());
                    return;
                }
                return;
            case 2:
                View view = (View) this.b;
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && xiv0VarA.f40966a.u(8) && ((iw5) this.c).Q()) {
                    ((BottomSheetBehavior) this.d).N(3);
                    return;
                }
                return;
            case 3:
                List list = u0d.f34849a;
                cp cpVar = (cp) this.c;
                u0d.f(((v1k) cpVar.u).b, ibc.j0((yos0) this.d), kotlin.collections.a.c(f2x.f8836a), ((k1d) cpVar.u()).f17517a.d);
                return;
            case 4:
                e7e e7eVar = (e7e) this.b;
                kwd kwdVar = e7e.d2;
                int iI0 = e7eVar.I0();
                boolean z = iI0 != -1 && iI0 < e7eVar.G0().d() - 3;
                ((ImageView) this.c).setVisibility(z ? 0 : 8);
                TextView textView = (TextView) this.d;
                if (z) {
                    CharSequence text = textView.getText();
                    text.getClass();
                    if (text.length() > 0) {
                        i2 = 0;
                    }
                }
                textView.setVisibility(i2);
                return;
            case 5:
                Cs2MapMovementView cs2MapMovementView = (Cs2MapMovementView) this.c;
                ImageView imageView = (ImageView) this.d;
                Iterator it = ((Map) this.b).entrySet().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) ((Map.Entry) it.next()).getValue();
                    wof wofVar = (wof) pair.f46059a;
                    ImageView imageView2 = (ImageView) pair.b;
                    int i4 = wofVar.f;
                    int i5 = wofVar.c;
                    int i6 = wofVar.b;
                    imageView2.setImageResource(i4);
                    int i7 = cs2MapMovementView.u / i3;
                    imageView2.setVisibility((i6 == -1 || i5 == -1) ? 8 : 0);
                    float f = i6 + cs2MapMovementView.w;
                    float f2 = cs2MapMovementView.y;
                    float f3 = ((f / f2) / 1024.0f) * 100.0f;
                    float f4 = (((i5 + cs2MapMovementView.x) / f2) / 1024.0f) * 100.0f;
                    if (!cs2MapMovementView.z.isEmpty()) {
                        for (xof xofVar : cs2MapMovementView.z) {
                            int i8 = wofVar.d;
                            if (i8 > xofVar.b && i8 < xofVar.f41215a) {
                                f3 += xofVar.c;
                                f4 += xofVar.d;
                            }
                        }
                    }
                    float f5 = i7;
                    imageView2.animate().translationY((imageView.getBottom() - ((imageView.getHeight() * f4) / 100.0f)) - f5).translationX((imageView.getLeft() + ((imageView.getWidth() * f3) / 100.0f)) - f5);
                    i3 = 2;
                }
                return;
            case 6:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.c;
                aqv aqvVar = (aqv) this.d;
                View view2 = (View) this.b;
                if (view2 == null || (overScroller = aqvVar.d) == null) {
                    return;
                }
                if (!overScroller.computeScrollOffset()) {
                    aqvVar.B(coordinatorLayout, view2);
                    return;
                } else {
                    aqvVar.D(coordinatorLayout, view2, aqvVar.d.getCurrY());
                    view2.postOnAnimation(this);
                    return;
                }
            case 7:
                LottieView lottieView = (LottieView) this.c;
                ra10 ra10Var = (ra10) this.d;
                if (ra10Var.e > 0) {
                    lottieView.w(ra10Var);
                } else {
                    lottieView.v(ra10Var);
                }
                lottieView.setVisibility(0);
                return;
            case 8:
                amf0 amf0Var = (amf0) this.d;
                x15 x15Var = (x15) this.b;
                amf0Var.b(x15Var, (TaskCompletionSource) this.c);
                ((AtomicInteger) amf0Var.i.b).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(amf0Var.b, amf0Var.a()) * (60000.0d / amf0Var.f1105a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + x15Var.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 9:
                try {
                    objCall = ((asq) this.b).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.d).post(new lfr(this.c, objCall, (byte) 14));
                return;
            case 10:
                n5a n5aVar = (n5a) this.b;
                try {
                    eeq.U(n5aVar.e.minusKey(kotlin.coroutines.d.d1), new wmq(this.c, (Object) n5aVar, this.d, (yje) null, (byte) 29));
                    return;
                } catch (Throwable th) {
                    n5aVar.h(th);
                    return;
                }
            case 11:
                ((dgw0) this.c).d((TaskCompletionSource) this.d, (ffw0) ((fck0) this.b).b);
                return;
            case 12:
                nkz nkzVar = (nkz) this.b;
                vnw0 vnw0Var = (vnw0) this.d;
                if (vnw0Var.b > 0) {
                    Bundle bundle = vnw0Var.c;
                    nkzVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (vnw0Var.b >= 2) {
                    nkzVar.onStart();
                }
                if (vnw0Var.b >= 3) {
                    nkzVar.onResume();
                }
                if (vnw0Var.b >= 4) {
                    nkzVar.onStop();
                }
                if (vnw0Var.b >= 5) {
                    nkzVar.onDestroy();
                    return;
                }
                return;
            case 13:
                CloudMessage cloudMessage = (CloudMessage) this.c;
                Intent intent = cloudMessage.f45477a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    taskN = Tasks.forResult(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = cloudMessage.f45477a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = cloudMessage.f45477a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle2.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.b;
                    bundle2.putBoolean("supports_message_handled", true);
                    sbx0 sbx0VarM = sbx0.m(context);
                    synchronized (sbx0VarM) {
                        i = sbx0VarM.b;
                        sbx0VarM.b = i + 1;
                    }
                    taskN = sbx0VarM.n(new f8x0(i, 2, bundle2, (byte) 0));
                }
                taskN.addOnCompleteListener(haw0.e, new ilp0((CountDownLatch) this.d));
                return;
            case 14:
                m6x0 m6x0Var = ((oyw0) this.d).f26078a;
                m6x0Var.V();
                zzah zzahVar = (zzah) this.b;
                Object objM = zzahVar.c.m();
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) this.c;
                if (objM == null) {
                    m6x0Var.a0(zzahVar, zzrVar);
                    return;
                } else {
                    m6x0Var.Z(zzahVar, zzrVar);
                    return;
                }
            case 15:
                zzbh zzbhVar = (zzbh) this.b;
                com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) this.c;
                m6x0 m6x0Var2 = ((oyw0) this.d).f26078a;
                if ("_cmp".equals(zzbhVar.f45544a) && (zzbfVar = zzbhVar.b) != null) {
                    Bundle bundle3 = zzbfVar.f45543a;
                    if (bundle3.size() != 0) {
                        String string = bundle3.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            m6x0Var2.r().m.b(zzbhVar.toString(), "Event has been filtered ");
                            zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.c, zzbhVar.d, zzbhVar.e);
                        }
                    }
                }
                String str2 = zzbhVar.f45544a;
                uww0 uww0Var = m6x0Var2.f21293a;
                r6x0 r6x0Var = m6x0Var2.g;
                m6x0.T(uww0Var);
                String str3 = zzrVar2.f45550a;
                pnw0 pnw0Var = TextUtils.isEmpty(str3) ? null : (pnw0) uww0Var.l.c(str3);
                if (pnw0Var == null) {
                    m6x0Var2.r().o.b(zzrVar2.f45550a, "EES not loaded for");
                    m6x0Var2.V();
                    m6x0Var2.e(zzbhVar, zzrVar2);
                    return;
                }
                try {
                    mpt0 mpt0Var = pnw0Var.c;
                    m6x0.T(r6x0Var);
                    HashMap mapA2 = r6x0.a2(zzbhVar.b.s(), true);
                    String strX = o5n0.x(str2, cwr0.o, cwr0.j);
                    if (strX == null) {
                        strX = str2;
                    }
                    if (pnw0Var.a(new nbw0(strX, zzbhVar.d, mapA2))) {
                        if (((nbw0) mpt0Var.d).equals((nbw0) mpt0Var.b)) {
                            m6x0Var2.V();
                            m6x0Var2.e(zzbhVar, zzrVar2);
                        } else {
                            m6x0Var2.r().o.b(str2, "EES edited event");
                            m6x0.T(r6x0Var);
                            zzbh zzbhVarQ1 = r6x0.q1((nbw0) mpt0Var.d);
                            m6x0Var2.V();
                            m6x0Var2.e(zzbhVarQ1, zzrVar2);
                        }
                        if (((ArrayList) mpt0Var.c).isEmpty()) {
                            return;
                        }
                        for (nbw0 nbw0Var : (ArrayList) mpt0Var.c) {
                            m6x0Var2.r().o.b(nbw0Var.f23263a, "EES logging created event");
                            m6x0.T(r6x0Var);
                            zzbh zzbhVarQ2 = r6x0.q1(nbw0Var);
                            m6x0Var2.V();
                            m6x0Var2.e(zzbhVarQ2, zzrVar2);
                        }
                        return;
                    }
                } catch (cqw0 unused3) {
                    m6x0Var2.r().g.c(zzrVar2.b, str2, "EES error. appId, eventName");
                }
                m6x0Var2.r().o.b(str2, "EES was not applied to event");
                m6x0Var2.V();
                m6x0Var2.e(zzbhVar, zzrVar2);
                return;
            case 16:
                m6x0 m6x0Var3 = ((oyw0) this.d).f26078a;
                m6x0Var3.V();
                m6x0Var3.c((zzbh) this.b, (String) this.c);
                return;
            case 17:
                m6x0 m6x0Var4 = ((oyw0) this.d).f26078a;
                m6x0Var4.V();
                zzpl zzplVar = (zzpl) this.b;
                Object objM2 = zzplVar.m();
                com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) this.c;
                if (objM2 == null) {
                    m6x0Var4.X(zzplVar.b, zzrVar3);
                    return;
                } else {
                    m6x0Var4.W(zzplVar, zzrVar3);
                    return;
                }
            case 18:
                oyw0 oyw0Var = (oyw0) this.b;
                com.google.android.gms.measurement.internal.zzr zzrVar4 = (com.google.android.gms.measurement.internal.zzr) this.c;
                zzaf zzafVar = (zzaf) this.d;
                m6x0 m6x0Var5 = oyw0Var.f26078a;
                m6x0Var5.V();
                String str4 = zzrVar4.f45550a;
                s0x.H(str4);
                HashMap map = m6x0Var5.f1;
                m6x0Var5.J().m1();
                m6x0Var5.l0();
                zlw0 zlw0Var = m6x0Var5.c;
                m6x0.T(zlw0Var);
                long j2 = zzafVar.f45540a;
                long j3 = zzafVar.c;
                zlw0Var.m1();
                zlw0Var.n1();
                try {
                    cursorQuery = zlw0Var.c2().query("upload_queue", new String[]{"rowId", HiAnalyticsConstant.BI_KEY_APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string2 = cursorQuery.getString(1);
                            s0x.H(string2);
                            j = j2;
                            cursor2 = cursorQuery;
                            try {
                                p6x0VarP1 = zlw0Var.P1(string2, j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                cursor2.close();
                            } catch (SQLiteException e) {
                                e = e;
                                cursorQuery = cursor2;
                                try {
                                    uuw0 uuw0Var = ((kxw0) zlw0Var.b).f;
                                    kxw0.g(uuw0Var);
                                    uuw0Var.g.c(Long.valueOf(j), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    p6x0VarP1 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursor2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } else {
                            j = j2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            p6x0VarP1 = null;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        j = j2;
                        cursor2 = cursorQuery;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    j = j2;
                    cursorQuery = null;
                } catch (Throwable th5) {
                    th = th5;
                    cursor = null;
                }
                if (p6x0VarP1 == null) {
                    m6x0Var5.r().j.c(str4, Long.valueOf(j), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                String str5 = p6x0VarP1.c;
                int i9 = zzafVar.b;
                if (i9 != 1) {
                    if (i9 == 3) {
                        j6x0 j6x0Var = (j6x0) map.get(str5);
                        if (j6x0Var == null) {
                            j6x0Var = new j6x0(m6x0Var5);
                            map.put(str5, j6x0Var);
                        } else {
                            j6x0Var.b++;
                            j6x0Var.c = j6x0Var.a();
                        }
                        m6x0Var5.S().getClass();
                        m6x0Var5.r().o.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((j6x0Var.c - System.currentTimeMillis()) / 1000));
                    }
                    zlw0 zlw0Var2 = m6x0Var5.c;
                    m6x0.T(zlw0Var2);
                    Long lValueOf = Long.valueOf(zzafVar.f45540a);
                    zlw0Var2.y1(lValueOf);
                    m6x0Var5.r().o.c(str4, lValueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str5)) {
                    map.remove(str5);
                }
                zlw0 zlw0Var3 = m6x0Var5.c;
                m6x0.T(zlw0Var3);
                Long lValueOf2 = Long.valueOf(j);
                zlw0Var3.t1(lValueOf2);
                m6x0Var5.r().o.c(str4, lValueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j3 > 0) {
                    zlw0 zlw0Var4 = m6x0Var5.c;
                    m6x0.T(zlw0Var4);
                    kxw0 kxw0Var = (kxw0) zlw0Var4.b;
                    zlw0Var4.m1();
                    zlw0Var4.n1();
                    Long lValueOf3 = Long.valueOf(j3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    lwf lwfVar = kxw0Var.k;
                    uuw0 uuw0Var2 = kxw0Var.f;
                    lwfVar.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (zlw0Var4.c2().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str4, String.valueOf(4)}) != 1) {
                            kxw0.g(uuw0Var2);
                            uuw0Var2.j.c(str4, lValueOf3, "Google Signal pending batch not updated. appId, rowId");
                            break;
                        }
                        m6x0Var5.r().o.c(str4, Long.valueOf(j3), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                        m6x0Var5.o(str4);
                        return;
                    } catch (SQLiteException e4) {
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j3), e4);
                        throw e4;
                    }
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            a4x0 a4x0Var = (a4x0) this.d;
                            kxw0 kxw0Var2 = (kxw0) a4x0Var.b;
                            wvw0 wvw0Var = kxw0Var2.e;
                            kxw0.e(wvw0Var);
                            if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
                                gtw0 gtw0Var = a4x0Var.e;
                                if (gtw0Var != null) {
                                    atomicReference2.set(gtw0Var.o((com.google.android.gms.measurement.internal.zzr) this.c));
                                    String str6 = (String) atomicReference2.get();
                                    if (str6 != null) {
                                        b1x0 b1x0Var = ((kxw0) a4x0Var.b).m;
                                        kxw0.f(b1x0Var);
                                        b1x0Var.h.set(str6);
                                        wvw0 wvw0Var2 = kxw0Var2.e;
                                        kxw0.e(wvw0Var2);
                                        wvw0Var2.h.u(str6);
                                    }
                                    a4x0Var.y1();
                                    atomicReference = (AtomicReference) this.b;
                                    atomicReference.notify();
                                    return;
                                }
                                uuw0 uuw0Var3 = kxw0Var2.f;
                                kxw0.g(uuw0Var3);
                                uuw0Var3.g.a("Failed to get app instance id");
                            } else {
                                uuw0 uuw0Var4 = kxw0Var2.f;
                                kxw0.g(uuw0Var4);
                                uuw0Var4.l.a("Analytics storage consent denied; will not get app instance id");
                                b1x0 b1x0Var2 = ((kxw0) a4x0Var.b).m;
                                kxw0.f(b1x0Var2);
                                b1x0Var2.h.set(null);
                                wvw0 wvw0Var3 = kxw0Var2.e;
                                kxw0.e(wvw0Var3);
                                wvw0Var3.h.u(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e5) {
                            uuw0 uuw0Var5 = ((kxw0) ((a4x0) this.d).b).f;
                            kxw0.g(uuw0Var5);
                            uuw0Var5.g.b(e5, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.b;
                        }
                    } catch (Throwable th6) {
                        ((AtomicReference) this.b).notify();
                        throw th6;
                    }
                }
                break;
            case 20:
                a();
                return;
            case 21:
                a4x0 a4x0Var2 = (a4x0) this.b;
                com.google.android.gms.measurement.internal.zzr zzrVar5 = (com.google.android.gms.measurement.internal.zzr) this.c;
                zzaf zzafVar2 = (zzaf) this.d;
                kxw0 kxw0Var3 = (kxw0) a4x0Var2.b;
                gtw0 gtw0Var2 = a4x0Var2.e;
                if (gtw0Var2 == null) {
                    uuw0 uuw0Var6 = kxw0Var3.f;
                    kxw0.g(uuw0Var6);
                    uuw0Var6.g.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    gtw0Var2.r(zzrVar5, zzafVar2);
                    a4x0Var2.y1();
                    return;
                } catch (RemoteException e6) {
                    uuw0 uuw0Var7 = kxw0Var3.f;
                    kxw0.g(uuw0Var7);
                    uuw0Var7.g.c(Long.valueOf(zzafVar2.f45540a), e6, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 22:
                drm0 drm0Var = (drm0) this.b;
                uuw0 uuw0Var8 = (uuw0) this.c;
                JobParameters jobParameters = (JobParameters) this.d;
                uuw0Var8.o.a("AppMeasurementJobService processed last upload request.");
                ((h4x0) ((Service) drm0Var.f6568a)).b(jobParameters);
                return;
            default:
                if (((mie0) this.b).f21842a != null) {
                    hny.b();
                    return;
                }
                icx0 icx0Var = (icx0) this.c;
                pb90 pb90Var = (pb90) this.d;
                bex0 bex0VarC = wcx0.c();
                icx0 icx0VarB = wcx0.b(bex0VarC, icx0Var);
                try {
                    pb90Var.run();
                    wcx0.b(bex0VarC, icx0VarB);
                    return;
                } catch (Throwable th7) {
                    try {
                        qcx0.a(th7);
                        throw th7;
                    } catch (Throwable th8) {
                        wcx0.b(bex0VarC, icx0VarB);
                        throw th8;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f12956a) {
            case 23:
                pb90 pb90Var = (pb90) this.d;
                StringBuilder sb = new StringBuilder(pb90Var.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(pb90Var);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hf5(View view, Object obj, View view2, View view3, byte b) {
        this.f12956a = b;
        this.b = obj;
        this.c = view2;
        this.d = view3;
    }

    public /* synthetic */ hf5(Object obj, Object obj2, Object obj3, byte b) {
        this.f12956a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ hf5(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.f12956a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hf5(byte b) {
        this.f12956a = b;
    }

    public hf5(aqv aqvVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f12956a = (byte) 6;
        this.d = aqvVar;
        this.c = coordinatorLayout;
        this.b = view;
    }
}
