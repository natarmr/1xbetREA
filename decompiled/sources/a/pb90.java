package a;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class pb90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26694a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ Object e;

    public pb90(b1x0 b1x0Var, AtomicReference atomicReference, String str, String str2) {
        this.f26694a = (byte) 9;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(b1x0Var);
        this.e = b1x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0439  */
    /* JADX WARN: Code duplicated, block: B:126:0x044e A[LOOP:1: B:124:0x0448->B:126:0x044e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x049e A[Catch: zew0 -> 0x0506, LOOP:2: B:129:0x0494->B:131:0x049e, LOOP_END, TryCatch #13 {zew0 -> 0x0506, blocks: (B:128:0x0487, B:129:0x0494, B:131:0x049e, B:132:0x04d4, B:134:0x04ee), top: B:270:0x0487 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x04ee A[Catch: zew0 -> 0x0506, TRY_LEAVE, TryCatch #13 {zew0 -> 0x0506, blocks: (B:128:0x0487, B:129:0x0494, B:131:0x049e, B:132:0x04d4, B:134:0x04ee), top: B:270:0x0487 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        pfx pfxVarI;
        BottomSheetBehavior bottomSheetBehaviorM0;
        pfx pfxVarI2;
        BottomSheetBehavior bottomSheetBehavior;
        Bundle bundle;
        zzom zzomVar;
        exw0 exw0Var;
        int i;
        long jElapsedRealtime = 0;
        byte[] bArrH = null;
        switch (this.f26694a) {
            case 0:
                PrintDocumentAdapter.WriteResultCallback writeResultCallback = (PrintDocumentAdapter.WriteResultCallback) this.d;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                ?? fileOutputStream = (byte[]) ((qb90) this.e).d.f23980a;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(fileOutputStream);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(((ParcelFileDescriptor) this.b).getFileDescriptor());
                        try {
                            if (!cancellationSignal.isCanceled()) {
                                wha0.J(byteArrayInputStream, fileOutputStream, 16384);
                            }
                            if (cancellationSignal.isCanceled()) {
                                writeResultCallback.onWriteCancelled();
                            } else {
                                writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                            }
                        } catch (Exception e) {
                            writeResultCallback.onWriteFailed(e.getMessage());
                            Log.e(pb90.class.getSimpleName(), "Exception printing PDF", e);
                        }
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(byteArrayInputStream, th3);
                        throw th4;
                    }
                }
            case 1:
                nw5 nw5Var = (nw5) this.e;
                View view = (View) this.d;
                uiv0 uiv0Var = ((xiv0) this.c).f40966a;
                View view2 = (View) this.b;
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view2);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (xiv0VarA == null || !xiv0VarA.f40966a.u(8)) ? uiv0Var.i(2).d : uiv0Var.i(8).d);
                if (xiv0VarA != null && xiv0VarA.f40966a.u(8) && nw5Var.Q() && (bottomSheetBehaviorM0 = nw5Var.M0()) != null) {
                    bottomSheetBehaviorM0.N(3);
                }
                Object parent = view.getParent();
                View view3 = parent instanceof View ? (View) parent : null;
                if (view3 != null) {
                    view3.setPadding(view3.getPaddingLeft(), (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(1)) == null) ? 0 : pfxVarI.b, view3.getPaddingRight(), view3.getPaddingBottom());
                    return;
                }
                return;
            case 2:
                wva wvaVar = (wva) ((r7v) this.e).f29996a;
                hz30 hz30Var = (hz30) this.c;
                vva vvaVar = (vva) this.b;
                if (vvaVar != null) {
                    wvaVar.A = true;
                    vvaVar.b.c(false);
                    wvaVar.A = false;
                }
                if (hz30Var.isEnabled() && hz30Var.hasSubMenu()) {
                    ((ox30) this.d).q(hz30Var, null, 4);
                    return;
                }
                return;
            case 3:
                m7l m7lVar = (m7l) this.d;
                x23 x23Var = (x23) this.e;
                ImageView imageView = (ImageView) x23Var.c;
                o5l o5lVar = (o5l) this.c;
                boolean z = o5lVar.f;
                if (z) {
                    boolean z2 = m7lVar.getDrawable() == null;
                    if (z2) {
                        List list = u0d.f34849a;
                        u0d.j(m7lVar, o5lVar.b, 0, 0, null, null, null, 510);
                        m7lVar.setRadiant(o5lVar.c);
                    }
                    float f = o5lVar.d / 100.0f;
                    float f2 = o5lVar.e / 100.0f;
                    int i2 = x23Var.b / 2;
                    float width = imageView.getWidth() * f;
                    float f3 = i2;
                    float f4 = width - f3;
                    float height = (imageView.getHeight() * f2) - f3;
                    if (z2) {
                        m7lVar.layout((int) (imageView.getLeft() + f4), (int) (imageView.getTop() + height), (int) (imageView.getLeft() + f4 + x23Var.b), (int) (imageView.getTop() + height + x23Var.b));
                    } else {
                        m7lVar.animate().x(imageView.getLeft() + f4).y(imageView.getTop() + height).getClass();
                    }
                }
                m7lVar.setVisibility(z ? 0 : 8);
                return;
            case 4:
                View view4 = (View) this.e;
                uiv0 uiv0Var2 = ((xiv0) this.d).f40966a;
                stl stlVar = (stl) this.c;
                View view5 = (View) this.b;
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA2 = jgu0.a(view5);
                if (xiv0VarA2 != null && xiv0VarA2.f40966a.u(8) && stlVar.Q() && (bottomSheetBehavior = stlVar.c2) != null) {
                    bottomSheetBehavior.N(3);
                }
                view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), (xiv0VarA2 == null || !xiv0VarA2.f40966a.u(8)) ? uiv0Var2.i(2).d : uiv0Var2.i(8).d);
                Object parent2 = view4.getParent();
                View view6 = parent2 instanceof View ? (View) parent2 : null;
                if (view6 != null) {
                    view6.setPadding(view6.getPaddingLeft(), (xiv0VarA2 == null || (pfxVarI2 = xiv0VarA2.f40966a.i(1)) == null) ? 0 : pfxVarI2.b, view6.getPaddingRight(), view6.getPaddingBottom());
                    return;
                }
                return;
            case 5:
                yhv0.i((View) this.b, (div0) this.c, (hcp0) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 6:
                oyw0 oyw0Var = (oyw0) this.b;
                String str = (String) this.c;
                zzoo zzooVar = (zzoo) this.d;
                ttw0 ttw0Var = (ttw0) this.e;
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                m6x0Var.J().m1();
                m6x0Var.l0();
                zlw0 zlw0Var = m6x0Var.c;
                m6x0.T(zlw0Var);
                List<p6x0> listR1 = zlw0Var.r1(str, zzooVar, ((Integer) btw0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (p6x0 p6x0Var : listR1) {
                    String str2 = p6x0Var.c;
                    long j = p6x0Var.h;
                    long j2 = p6x0Var.f26479a;
                    if (m6x0Var.n(str, str2)) {
                        int i3 = p6x0Var.i;
                        if (i3 > 0) {
                            if (i3 <= ((Integer) btw0.z.a(bArrH)).intValue()) {
                                long jMin = Math.min(((Long) btw0.x.a(bArrH)).longValue() * (1 << (i3 - 1)), ((Long) btw0.y.a(bArrH)).longValue());
                                m6x0Var.S().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : p6x0Var.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    zzomVar = new zzom(p6x0Var.f26479a, p6x0Var.b.a(), p6x0Var.c, bundle, p6x0Var.e.f27975a, p6x0Var.g, "");
                                    try {
                                        exw0Var = (exw0) r6x0.X1(ixw0.y(), zzomVar.b);
                                        for (i = 0; i < ((ixw0) exw0Var.b).s(); i++) {
                                            jxw0 jxw0Var = (jxw0) ((ixw0) exw0Var.b).t(i).i();
                                            m6x0Var.S().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            jxw0Var.c();
                                            ((mxw0) jxw0Var.b).h0(jCurrentTimeMillis);
                                            exw0Var.c();
                                            ((ixw0) exw0Var.b).A(i, (mxw0) jxw0Var.e());
                                        }
                                        zzomVar.b = ((ixw0) exw0Var.e()).a();
                                        if (Log.isLoggable(m6x0Var.r().s1(), 2)) {
                                            r6x0 r6x0Var = m6x0Var.g;
                                            m6x0.T(r6x0Var);
                                            zzomVar.g = r6x0Var.N1((ixw0) exw0Var.e());
                                        }
                                        arrayList.add(zzomVar);
                                    } catch (zew0 unused) {
                                        m6x0Var.r().j.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            m6x0Var.r().o.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            zzomVar = new zzom(p6x0Var.f26479a, p6x0Var.b.a(), p6x0Var.c, bundle, p6x0Var.e.f27975a, p6x0Var.g, "");
                            exw0Var = (exw0) r6x0.X1(ixw0.y(), zzomVar.b);
                            while (i < ((ixw0) exw0Var.b).s()) {
                                jxw0 jxw0Var2 = (jxw0) ((ixw0) exw0Var.b).t(i).i();
                                m6x0Var.S().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                jxw0Var2.c();
                                ((mxw0) jxw0Var2.b).h0(jCurrentTimeMillis2);
                                exw0Var.c();
                                ((ixw0) exw0Var.b).A(i, (mxw0) jxw0Var2.e());
                            }
                            zzomVar.b = ((ixw0) exw0Var.e()).a();
                            if (Log.isLoggable(m6x0Var.r().s1(), 2)) {
                                r6x0 r6x0Var2 = m6x0Var.g;
                                m6x0.T(r6x0Var2);
                                zzomVar.g = r6x0Var2.N1((ixw0) exw0Var.e());
                            }
                            arrayList.add(zzomVar);
                        }
                        bArrH = null;
                    } else {
                        m6x0Var.r().o.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), p6x0Var.c);
                    }
                }
                try {
                    ttw0Var.w(new zzoq(arrayList));
                    m6x0Var.r().o.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e2) {
                    m6x0Var.r().g.c(str, e2, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 7:
                a4x0 a4x0VarI = ((AppMeasurementDynamiteService) this.e).f45539a.i();
                gpw0 gpw0Var = (gpw0) this.b;
                zzbh zzbhVar = (zzbh) this.c;
                String str3 = (String) this.d;
                a4x0VarI.m1();
                a4x0VarI.n1();
                kxw0 kxw0Var = (kxw0) a4x0VarI.b;
                x6x0 x6x0Var = kxw0Var.i;
                kxw0.e(x6x0Var);
                if (pav.b.c(((kxw0) x6x0Var.b).f19080a, 12451000) == 0) {
                    a4x0VarI.z1(new pb90((Object) a4x0VarI, (Object) zzbhVar, (Object) str3, (Object) gpw0Var, false, (byte) 13));
                    return;
                }
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.a("Not bundling data. Service unavailable or out of date");
                x6x0 x6x0Var2 = kxw0Var.i;
                kxw0.e(x6x0Var2);
                x6x0Var2.c2(gpw0Var, new byte[0]);
                return;
            case 8:
                oyw0 oyw0Var2 = (oyw0) this.b;
                Bundle bundle2 = (Bundle) this.c;
                String str4 = (String) this.d;
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) this.e;
                boolean zIsEmpty = bundle2.isEmpty();
                m6x0 m6x0Var2 = oyw0Var2.f26078a;
                if (zIsEmpty) {
                    zlw0 zlw0Var2 = m6x0Var2.c;
                    m6x0.T(zlw0Var2);
                    zlw0Var2.m1();
                    zlw0Var2.n1();
                    try {
                        zlw0Var2.c2().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e3) {
                        uuw0 uuw0Var2 = ((kxw0) zlw0Var2.b).f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.b(e3, "Error clearing default event params");
                        return;
                    }
                }
                zlw0 zlw0Var3 = m6x0Var2.c;
                m6x0.T(zlw0Var3);
                kxw0 kxw0Var2 = (kxw0) zlw0Var3.b;
                zlw0Var3.m1();
                zlw0Var3.n1();
                lmw0 lmw0Var = new lmw0((kxw0) zlw0Var3.b, "", str4, "dep", 0L, 0L, 0L, bundle2);
                r6x0 r6x0Var3 = zlw0Var3.c.g;
                m6x0.T(r6x0Var3);
                byte[] bArrA = r6x0Var3.M1(lmw0Var).a();
                uuw0 uuw0Var3 = kxw0Var2.f;
                kxw0.g(uuw0Var3);
                uuw0Var3.o.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (zlw0Var3.c2().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        kxw0.g(uuw0Var3);
                        uuw0Var3.g.b(uuw0.q1(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e4) {
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.c(uuw0.q1(str4), e4, "Error storing default event parameters. appId");
                }
                zlw0 zlw0Var4 = m6x0Var2.c;
                m6x0.T(zlw0Var4);
                long j3 = zzrVar.Z;
                try {
                    if (zlw0Var4.J1("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) <= 0 && zlw0Var4.J1("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) > 0) {
                        zlw0 zlw0Var5 = m6x0Var2.c;
                        m6x0.T(zlw0Var5);
                        zlw0Var5.F1(str4, Long.valueOf(j3), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e5) {
                    uuw0 uuw0Var4 = ((kxw0) zlw0Var4.b).f;
                    kxw0.g(uuw0Var4);
                    uuw0Var4.g.b(e5, "Error checking backfill conditions");
                    return;
                }
            case 9:
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                a4x0 a4x0VarI2 = ((kxw0) ((b1x0) this.e).b).i();
                AtomicReference atomicReference = (AtomicReference) this.b;
                a4x0VarI2.m1();
                a4x0VarI2.n1();
                a4x0VarI2.z1(new ob90(a4x0VarI2, (Serializable) atomicReference, str5, (Object) str6, (Object) a4x0VarI2.B1(false), (byte) 2));
                return;
            case 10:
                fui0 fui0Var = (fui0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                Context context = (Context) this.d;
                k0x0 k0x0Var = (k0x0) this.e;
                if ((fui0Var.f29706a instanceof e2) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(k0x0Var);
                        return;
                    } catch (IllegalArgumentException e6) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e6);
                        return;
                    }
                }
                return;
            case 11:
                do20 do20Var = v1x0.f36655a;
                Level level = (Level) this.b;
                dwb dwbVar = (dwb) do20Var.f6397a;
                boolean zA = dwbVar.a(level);
                String str7 = dwbVar.f6789a;
                ((wbw0) rbw0.f30210a).getClass();
                ccw0.b.a(str7, level, zA);
                ((gfx0) ((gfx0) (!zA ? do20.c : new lfx0(do20Var, level)).a((Throwable) this.c)).zzn()).b((String) this.d, (Object[]) this.e);
                return;
            case 12:
                a4x0 a4x0VarI3 = ((AppMeasurementDynamiteService) this.e).f45539a.i();
                gpw0 gpw0Var2 = (gpw0) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                a4x0VarI3.m1();
                a4x0VarI3.n1();
                a4x0VarI3.z1(new ob90(a4x0VarI3, (Serializable) str8, str9, (Object) a4x0VarI3.B1(false), (Object) gpw0Var2, (byte) 3));
                return;
            case 13:
                gpw0 gpw0Var3 = (gpw0) this.d;
                a4x0 a4x0Var = (a4x0) this.e;
                kxw0 kxw0Var3 = (kxw0) a4x0Var.b;
                try {
                    try {
                        gtw0 gtw0Var = a4x0Var.e;
                        if (gtw0Var != null) {
                            bArrH = gtw0Var.h((zzbh) this.b, (String) this.c);
                            a4x0Var.y1();
                            return;
                        } else {
                            uuw0 uuw0Var5 = kxw0Var3.f;
                            kxw0.g(uuw0Var5);
                            uuw0Var5.g.a("Discarding data. Failed to send event to service to bundle");
                            return;
                        }
                    } finally {
                        x6x0 x6x0Var3 = kxw0Var3.i;
                        kxw0.e(x6x0Var3);
                        x6x0Var3.c2(gpw0Var3, null);
                    }
                } catch (RemoteException e7) {
                    uuw0 uuw0Var6 = kxw0Var3.f;
                    kxw0.g(uuw0Var6);
                    uuw0Var6.g.b(e7, "Failed to send event to the service to bundle");
                }
                break;
            case 14:
                a4x0 a4x0Var2 = (a4x0) this.b;
                AtomicReference atomicReference2 = (AtomicReference) this.c;
                com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) this.d;
                Bundle bundle3 = (Bundle) this.e;
                synchronized (atomicReference2) {
                    try {
                        gtw0 gtw0Var2 = a4x0Var2.e;
                        if (gtw0Var2 != null) {
                            gtw0Var2.k(zzrVar2, bundle3, new h2x0(a4x0Var2, atomicReference2));
                            a4x0Var2.y1();
                            return;
                        } else {
                            uuw0 uuw0Var7 = ((kxw0) a4x0Var2.b).f;
                            kxw0.g(uuw0Var7);
                            uuw0Var7.g.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        uuw0 uuw0Var8 = ((kxw0) a4x0Var2.b).f;
                        kxw0.g(uuw0Var8);
                        uuw0Var8.g.b(e8, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 15:
                a4x0 a4x0Var3 = (a4x0) this.b;
                AtomicReference atomicReference3 = (AtomicReference) this.c;
                com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) this.d;
                zzoo zzooVar2 = (zzoo) this.e;
                synchronized (atomicReference3) {
                    try {
                        gtw0 gtw0Var3 = a4x0Var3.e;
                        if (gtw0Var3 != null) {
                            gtw0Var3.g(zzrVar3, zzooVar2, new j2x0(a4x0Var3, atomicReference3));
                            a4x0Var3.y1();
                            return;
                        } else {
                            uuw0 uuw0Var9 = ((kxw0) a4x0Var3.b).f;
                            kxw0.g(uuw0Var9);
                            uuw0Var9.g.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e9) {
                        uuw0 uuw0Var10 = ((kxw0) a4x0Var3.b).f;
                        kxw0.g(uuw0Var10);
                        uuw0Var10.g.b(e9, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                m6x0 m6x0Var3 = (m6x0) ((zlt0) this.e).b;
                x6x0 x6x0VarK0 = m6x0Var3.k0();
                m6x0Var3.S().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (m6x0Var3.e0().x1(null, btw0.e1)) {
                    m6x0Var3.S().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                Bundle bundle4 = (Bundle) this.d;
                String str10 = (String) this.c;
                String str11 = (String) this.b;
                zzbh zzbhVarT1 = x6x0VarK0.T1(str10, bundle4, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                s0x.H(zzbhVarT1);
                m6x0Var3.c(zzbhVarT1, str11);
                return;
        }
    }

    public /* synthetic */ pb90(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.f26694a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ pb90(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f26694a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public pb90(qb90 qb90Var, PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback, Context context) {
        this.f26694a = (byte) 0;
        this.e = qb90Var;
        this.b = parcelFileDescriptor;
        this.c = cancellationSignal;
        this.d = writeResultCallback;
    }
}
