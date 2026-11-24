package a;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ob90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24968a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ob90(oyw0 oyw0Var, com.google.android.gms.measurement.internal.zzr zzrVar, Bundle bundle, mtw0 mtw0Var, String str) {
        this.f24968a = (byte) 1;
        this.b = oyw0Var;
        this.c = zzrVar;
        this.d = bundle;
        this.e = mtw0Var;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        x6x0 x6x0Var;
        switch (this.f24968a) {
            case 0:
                PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = (PrintDocumentAdapter.LayoutResultCallback) this.e;
                if (((CancellationSignal) this.d).isCanceled()) {
                    layoutResultCallback.onLayoutCancelled();
                    return;
                }
                PrintDocumentInfo.Builder builder = new PrintDocumentInfo.Builder(((qb90) this.f).c);
                builder.setContentType(0).setPageCount(-1).build();
                layoutResultCallback.onLayoutFinished(builder.build(), !((PrintAttributes) this.c).equals((PrintAttributes) this.b));
                return;
            case 1:
                oyw0 oyw0Var = (oyw0) this.b;
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) this.c;
                Bundle bundle = (Bundle) this.d;
                mtw0 mtw0Var = (mtw0) this.e;
                String str = (String) this.f;
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                try {
                    mtw0Var.n(m6x0Var.d0(bundle, zzrVar));
                    return;
                } catch (RemoteException e) {
                    m6x0Var.r().g.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            a4x0 a4x0Var = (a4x0) this.f;
                            gtw0 gtw0Var = a4x0Var.e;
                            if (gtw0Var == null) {
                                uuw0 uuw0Var = ((kxw0) a4x0Var.b).f;
                                kxw0.g(uuw0Var);
                                uuw0Var.g.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.c, (String) this.d);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(gtw0Var.A((String) this.c, (String) this.d, (com.google.android.gms.measurement.internal.zzr) this.e));
                            } else {
                                atomicReference2.set(gtw0Var.f(null, (String) this.c, (String) this.d));
                            }
                            a4x0Var.y1();
                            atomicReference = (AtomicReference) this.b;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e2) {
                            uuw0 uuw0Var2 = ((kxw0) ((a4x0) this.f).b).f;
                            kxw0.g(uuw0Var2);
                            uuw0Var2.g.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.c, e2);
                            ((AtomicReference) this.b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.b;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.b).notify();
                        throw th;
                    }
                }
                break;
            default:
                gpw0 gpw0Var = (gpw0) this.e;
                String str2 = (String) this.c;
                String str3 = (String) this.b;
                a4x0 a4x0Var2 = (a4x0) this.f;
                kxw0 kxw0Var = (kxw0) a4x0Var2.b;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        gtw0 gtw0Var2 = a4x0Var2.e;
                        if (gtw0Var2 == null) {
                            uuw0 uuw0Var3 = kxw0Var.f;
                            kxw0.g(uuw0Var3);
                            uuw0Var3.g.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            x6x0Var = kxw0Var.i;
                        } else {
                            arrayList = x6x0.g2(gtw0Var2.A(str3, str2, (com.google.android.gms.measurement.internal.zzr) this.d));
                            a4x0Var2.y1();
                            x6x0Var = kxw0Var.i;
                        }
                    } catch (RemoteException e3) {
                        uuw0 uuw0Var4 = kxw0Var.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.g.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    kxw0.e(x6x0Var);
                    x6x0Var.f2(gpw0Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    x6x0 x6x0Var2 = kxw0Var.i;
                    kxw0.e(x6x0Var2);
                    x6x0Var2.f2(gpw0Var, arrayList);
                    throw th2;
                }
        }
    }

    public /* synthetic */ ob90(a4x0 a4x0Var, Serializable serializable, String str, Object obj, Object obj2, byte b) {
        this.f24968a = b;
        this.b = serializable;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = a4x0Var;
    }

    public ob90(qb90 qb90Var, PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.f24968a = (byte) 0;
        this.f = qb90Var;
        this.b = printAttributes;
        this.c = printAttributes2;
        this.d = cancellationSignal;
        this.e = layoutResultCallback;
    }
}
