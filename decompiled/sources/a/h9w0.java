package a;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h9w0 implements qav, rav {
    public final b9v b;
    public final ua3 c;
    public final fuj0 d;
    public final int l;
    public final r9w0 m;
    public boolean n;
    public final /* synthetic */ sav r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f12698a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList o = new ArrayList();
    public ConnectionResult p = null;
    public int q = 0;

    public h9w0(sav savVar, nav navVar) {
        this.r = savVar;
        Looper looper = savVar.m.getLooper();
        es esVarA = navVar.a();
        qgd qgdVar = new qgd((String) esVarA.b, (String) esVarA.c, (lx3) esVarA.f8305a);
        b9v b9vVarI = ((cwr0) navVar.d.f43523a).I(navVar.f23210a, looper, qgdVar, navVar.e, this, this);
        fvt0 fvt0Var = navVar.c;
        if (fvt0Var == null || !(b9vVarI instanceof hz5)) {
            String str = navVar.b;
            if (str != null && (b9vVarI instanceof hz5)) {
                b9vVarI.s = str;
            }
        } else {
            b9vVarI.t = fvt0Var;
        }
        this.b = b9vVarI;
        this.c = navVar.f;
        this.d = new fuj0((byte) 22);
        this.l = navVar.h;
        if (!b9vVarI.r()) {
            this.m = null;
            return;
        }
        Context context = savVar.e;
        jaw0 jaw0Var = savVar.m;
        es esVarA2 = navVar.a();
        this.m = new r9w0(context, jaw0Var, new qgd((String) esVarA2.b, (String) esVarA2.c, (lx3) esVarA2.f8305a));
    }

    public final void a() {
        b9v b9vVar = this.b;
        sav savVar = this.r;
        s0x.D(savVar.m);
        this.p = null;
        j(ConnectionResult.f);
        if (this.n) {
            jaw0 jaw0Var = savVar.m;
            ua3 ua3Var = this.c;
            jaw0Var.removeMessages(11, ua3Var);
            savVar.m.removeMessages(9, ua3Var);
            this.n = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            o24 o24Var = ((q9w0) it.next()).f28369a;
            if (k((Feature[]) o24Var.c) != null) {
                it.remove();
            } else {
                try {
                    ((glt0) ((td9) o24Var.d).b).accept(b9vVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    b9vVar.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        e();
        i();
    }

    @Override // a.rav
    public final void b(ConnectionResult connectionResult) {
        m(connectionResult, null);
    }

    public final void c(int i) {
        s0x.D(this.r.m);
        this.p = null;
        this.n = true;
        String str = this.b.f13892a;
        fuj0 fuj0Var = this.d;
        fuj0Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        fuj0Var.H(true, new Status(20, sb.toString(), null, null));
        ua3 ua3Var = this.c;
        sav savVar = this.r;
        jaw0 jaw0Var = savVar.m;
        jaw0Var.sendMessageDelayed(Message.obtain(jaw0Var, 9, ua3Var), 5000L);
        jaw0 jaw0Var2 = savVar.m;
        jaw0Var2.sendMessageDelayed(Message.obtain(jaw0Var2, 11, ua3Var), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) savVar.g.f23789a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((q9w0) it.next()).getClass();
        }
    }

    public final boolean d(ConnectionResult connectionResult) {
        synchronized (sav.q) {
            this.r.getClass();
        }
        return false;
    }

    public final void e() {
        LinkedList linkedList = this.f12698a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            caw0 caw0Var = (caw0) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (f(caw0Var)) {
                linkedList.remove(caw0Var);
            }
        }
    }

    public final boolean f(caw0 caw0Var) {
        if (!(caw0Var instanceof n9w0)) {
            fuj0 fuj0Var = this.d;
            b9v b9vVar = this.b;
            caw0Var.c(fuj0Var, b9vVar.r());
            try {
                caw0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                b9vVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        n9w0 n9w0Var = (n9w0) caw0Var;
        Feature featureK = k(n9w0Var.f(this));
        if (featureK == null) {
            fuj0 fuj0Var2 = this.d;
            b9v b9vVar2 = this.b;
            caw0Var.c(fuj0Var2, b9vVar2.r());
            try {
                caw0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                b9vVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = featureK.f45481a;
        long jM = featureK.m();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM).length() + 2);
        f140.v(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jM);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        sav savVar = this.r;
        if (!savVar.n || !n9w0Var.g(this)) {
            n9w0Var.b(new qft0(featureK));
            return true;
        }
        int iH = n9w0Var.h(this);
        i9w0 i9w0Var = new i9w0(this.c, featureK);
        ArrayList arrayList = this.o;
        int iIndexOf = arrayList.indexOf(i9w0Var);
        if (iIndexOf >= 0) {
            i9w0 i9w0Var2 = (i9w0) arrayList.get(iIndexOf);
            savVar.m.removeMessages(15, i9w0Var2);
            savVar.m.sendMessageDelayed(Message.obtain(savVar.m, 15, i9w0Var2), 5000L);
            return false;
        }
        arrayList.add(i9w0Var);
        savVar.m.sendMessageDelayed(Message.obtain(savVar.m, 15, i9w0Var), 5000L);
        savVar.m.sendMessageDelayed(Message.obtain(savVar.m, 16, i9w0Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iH));
        if (d(connectionResult)) {
            String str2 = featureK.f45481a;
            long jM2 = featureK.m();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM2).length());
            hne.B(sb2, "A dialog should be displayed for missing feature: ", str2, ", version: ");
            sb2.append(jM2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!savVar.g(connectionResult, this.l)) {
            return false;
        }
        String str3 = featureK.f45481a;
        long jM3 = featureK.m();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM3).length());
        hne.B(sb3, "Notification displayed for missing feature: ", str3, ", version: ");
        sb3.append(jM3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void g(Status status, Exception exc, boolean z) {
        s0x.D(this.r.m);
        if ((status == null) == (exc == null)) {
            jf4.o("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f12698a.iterator();
        while (it.hasNext()) {
            caw0 caw0Var = (caw0) it.next();
            if (!z || caw0Var.f4034a == 2) {
                if (status != null) {
                    caw0Var.a(status);
                } else {
                    caw0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void h(Status status) {
        s0x.D(this.r.m);
        g(status, null, false);
    }

    public final void i() {
        sav savVar = this.r;
        jaw0 jaw0Var = savVar.m;
        ua3 ua3Var = this.c;
        jaw0Var.removeMessages(12, ua3Var);
        jaw0 jaw0Var2 = savVar.m;
        jaw0Var2.sendMessageDelayed(jaw0Var2.obtainMessage(12, ua3Var), savVar.f31901a);
    }

    public final void j(ConnectionResult connectionResult) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            hny.b();
            return;
        }
        if (l8x.Z(connectionResult, ConnectionResult.f)) {
            b9v b9vVar = this.b;
            if (!b9vVar.p() || b9vVar.b == null) {
                itt0.k("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final Feature k(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            com.google.android.gms.common.internal.zzj zzjVar = this.b.w;
            Feature[] featureArr2 = zzjVar == null ? null : zzjVar.b;
            if (featureArr2 == null) {
                featureArr2 = new Feature[0];
            }
            gx3 gx3Var = new gx3(featureArr2.length);
            for (Feature feature : featureArr2) {
                gx3Var.put(feature.f45481a, Long.valueOf(feature.m()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) gx3Var.get(feature2.f45481a);
                if (l == null || l.longValue() < feature2.m()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void l(ConnectionResult connectionResult) {
        s0x.D(this.r.m);
        b9v b9vVar = this.b;
        String name = b9vVar.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        b9v b9vVar2 = b9vVar;
        b9vVar2.d(ua80.m(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        m(connectionResult, null);
    }

    public final void m(ConnectionResult connectionResult, RuntimeException runtimeException) {
        buj0 buj0Var;
        sav savVar = this.r;
        s0x.D(savVar.m);
        r9w0 r9w0Var = this.m;
        if (r9w0Var != null && (buj0Var = r9w0Var.l) != null) {
            buj0Var.c();
        }
        s0x.D(this.r.m);
        this.p = null;
        SparseIntArray sparseIntArray = (SparseIntArray) savVar.g.f23789a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        j(connectionResult);
        if ((this.b instanceof kaw0) && connectionResult.b != 24) {
            savVar.b = true;
            jaw0 jaw0Var = savVar.m;
            jaw0Var.sendMessageDelayed(jaw0Var.obtainMessage(19), 300000L);
        }
        int i = connectionResult.b;
        if (i == 4) {
            h(sav.p);
            return;
        }
        if (i == 25) {
            h(sav.d(this.c, connectionResult));
            return;
        }
        LinkedList linkedList = this.f12698a;
        if (linkedList.isEmpty()) {
            this.p = connectionResult;
            return;
        }
        if (runtimeException != null) {
            s0x.D(savVar.m);
            g(null, runtimeException, false);
            return;
        }
        boolean z = savVar.n;
        ua3 ua3Var = this.c;
        if (!z) {
            h(sav.d(ua3Var, connectionResult));
            return;
        }
        g(sav.d(ua3Var, connectionResult), null, true);
        if (linkedList.isEmpty() || d(connectionResult) || savVar.g(connectionResult, this.l)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.n = true;
        }
        if (!this.n) {
            h(sav.d(ua3Var, connectionResult));
        } else {
            jaw0 jaw0Var2 = savVar.m;
            jaw0Var2.sendMessageDelayed(Message.obtain(jaw0Var2, 9, ua3Var), 5000L);
        }
    }

    public final void n(caw0 caw0Var) {
        s0x.D(this.r.m);
        boolean zP = this.b.p();
        LinkedList linkedList = this.f12698a;
        if (zP) {
            if (f(caw0Var)) {
                i();
                return;
            } else {
                linkedList.add(caw0Var);
                return;
            }
        }
        linkedList.add(caw0Var);
        ConnectionResult connectionResult = this.p;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            p();
        } else {
            m(connectionResult, null);
        }
    }

    public final void o() {
        sav savVar = this.r;
        s0x.D(savVar.m);
        Status status = sav.o;
        h(status);
        this.d.H(false, status);
        for (qg00 qg00Var : (qg00[]) this.f.keySet().toArray(new qg00[0])) {
            n(new y9w0(qg00Var, new TaskCompletionSource()));
        }
        j(new ConnectionResult(4, null, null));
        if (this.b.p()) {
            savVar.m.post(new fju0((Object) new w4p0((Object) this, (byte) 19), (byte) 2));
        }
    }

    @Override // a.qav
    public final void onConnected() {
        sav savVar = this.r;
        if (Looper.myLooper() == savVar.m.getLooper()) {
            a();
        } else {
            savVar.m.post(new fju0((Object) this, (byte) 1));
        }
    }

    @Override // a.qav
    public final void onConnectionSuspended(int i) {
        sav savVar = this.r;
        if (Looper.myLooper() == savVar.m.getLooper()) {
            c(i);
        } else {
            savVar.m.post(new y63(this, i, (byte) 4));
        }
    }

    public final void p() {
        sav savVar = this.r;
        s0x.D(savVar.m);
        b9v b9vVar = this.b;
        if (b9vVar.p()) {
            return;
        }
        b9v b9vVar2 = b9vVar;
        if (b9vVar2.q()) {
            return;
        }
        try {
            int iD = savVar.g.d(savVar.e, b9vVar);
            if (iD != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iD, null, null);
                String name = b9vVar.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m(connectionResult, null);
                return;
            }
            qaj qajVar = new qaj(savVar, b9vVar, this.c);
            if (b9vVar.r()) {
                r9w0 r9w0Var = this.m;
                s0x.H(r9w0Var);
                buj0 buj0Var = r9w0Var.l;
                if (buj0Var != null) {
                    buj0Var.c();
                }
                qgd qgdVar = r9w0Var.f;
                qgdVar.h = Integer.valueOf(System.identityHashCode(r9w0Var));
                kmx kmxVar = r9w0Var.d;
                Context context = r9w0Var.b;
                Handler handler = r9w0Var.c;
                r9w0Var.l = (buj0) kmxVar.I(context, handler.getLooper(), qgdVar, (cuj0) qgdVar.g, r9w0Var, r9w0Var);
                r9w0Var.m = qajVar;
                Set set = r9w0Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new fju0(r9w0Var));
                } else {
                    buj0 buj0Var2 = r9w0Var.l;
                    buj0Var2.getClass();
                    buj0Var2.j = new r7v((hz5) buj0Var2);
                    buj0Var2.v(2, null);
                }
            }
            try {
                b9vVar2.j = qajVar;
                b9vVar2.v(2, null);
            } catch (SecurityException e) {
                m(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m(new ConnectionResult(10, null, null), e2);
        }
    }
}
