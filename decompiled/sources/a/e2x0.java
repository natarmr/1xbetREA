package a;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e2x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7108a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ a4x0 f;
    public final /* synthetic */ Object g;

    public e2x0(a4x0 a4x0Var, String str, String str2, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, gpw0 gpw0Var) {
        this.b = str;
        this.c = str2;
        this.d = zzrVar;
        this.e = z;
        this.g = gpw0Var;
        this.f = a4x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        x6x0 x6x0Var;
        AtomicReference atomicReference;
        switch (this.f7108a) {
            case 0:
                String str = this.c;
                String str2 = this.b;
                gpw0 gpw0Var = (gpw0) this.g;
                a4x0 a4x0Var = this.f;
                kxw0 kxw0Var = (kxw0) a4x0Var.b;
                Bundle bundle = new Bundle();
                try {
                    try {
                        gtw0 gtw0Var = a4x0Var.e;
                        if (gtw0Var == null) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.c(str2, str, "Failed to get user properties; not connected to service");
                            x6x0Var = kxw0Var.i;
                            kxw0.e(x6x0Var);
                            x6x0Var.e2(gpw0Var, bundle);
                            return;
                        }
                        List<zzpl> listY = gtw0Var.y(str2, str, this.e, this.d);
                        Bundle bundle2 = new Bundle();
                        if (listY != null) {
                            for (zzpl zzplVar : listY) {
                                String str3 = zzplVar.e;
                                String str4 = zzplVar.b;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = zzplVar.d;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = zzplVar.g;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            a4x0Var.y1();
                            x6x0 x6x0Var2 = kxw0Var.i;
                            kxw0.e(x6x0Var2);
                            x6x0Var2.e2(gpw0Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            uuw0 uuw0Var2 = kxw0Var.f;
                            kxw0.g(uuw0Var2);
                            uuw0Var2.g.c(str2, e, "Failed to get user properties; remote exception");
                            x6x0Var = kxw0Var.i;
                            kxw0.e(x6x0Var);
                            x6x0Var.e2(gpw0Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            x6x0 x6x0Var3 = kxw0Var.i;
                            kxw0.e(x6x0Var3);
                            x6x0Var3.e2(gpw0Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            a4x0 a4x0Var2 = this.f;
                            gtw0 gtw0Var2 = a4x0Var2.e;
                            if (gtw0Var2 == null) {
                                uuw0 uuw0Var3 = ((kxw0) a4x0Var2.b).f;
                                kxw0.g(uuw0Var3);
                                uuw0Var3.g.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(gtw0Var2.y(this.b, this.c, this.e, this.d));
                            } else {
                                atomicReference2.set(gtw0Var2.c(null, this.b, this.c, this.e));
                            }
                            a4x0Var2.y1();
                            atomicReference = (AtomicReference) this.g;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            uuw0 uuw0Var4 = ((kxw0) this.f.b).f;
                            kxw0.g(uuw0Var4);
                            uuw0Var4.g.d("(legacy) Failed to get user properties; remote exception", null, this.b, e3);
                            ((AtomicReference) this.g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.g;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.g).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public e2x0(a4x0 a4x0Var, AtomicReference atomicReference, String str, String str2, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        this.g = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = zzrVar;
        this.e = z;
        this.f = a4x0Var;
    }
}
