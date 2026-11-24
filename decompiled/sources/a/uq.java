package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.ActivityScreen;
import com.github.terrakok.cicerone.androidx.ActivityScreen$Companion$invoke$1;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq implements k4r, xbf, jgd, SuccessContinuation, Continuation, OnFailureListener, tg00, sg00, omn0, OnCompleteListener, uu9, fdq0, pm30, rbe, d1x, izj, isj0, zf60, upg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36093a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uq(vq vqVar, Fragment fragment, ms2 ms2Var) {
        this.f36093a = (byte) 0;
        this.b = vqVar;
        this.c = ms2Var;
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
        izj izjVar = (izj) this.b;
        izj izjVar2 = (izj) this.c;
        izjVar.a(p5d0Var);
        izjVar2.a(p5d0Var);
    }

    @Override // a.rbe
    public void accept(Object obj) {
        zhl zhlVar = (zhl) this.b;
        ((bo30) obj).p(zhlVar.f44398a, zhlVar.b, (in30) this.c);
    }

    @Override // a.upg0
    public Object apply(Object obj) {
        wpg0 wpg0Var = (wpg0) this.b;
        q55 q55Var = (q55) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        r35 r35Var = wpg0Var.d;
        ArrayList arrayListE = wpg0Var.e(sQLiteDatabase, q55Var, r35Var.b);
        for (mwb0 mwb0Var : mwb0.values()) {
            if (mwb0Var != q55Var.c) {
                int size = r35Var.b - arrayListE.size();
                if (size <= 0) {
                    break;
                }
                arrayListE.addAll(wpg0Var.e(sQLiteDatabase, q55Var.b(mwb0Var), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListE.size(); i++) {
            sb.append(((o45) arrayListE.get(i)).f24616a);
            if (i < arrayListE.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new vpg0(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListE.listIterator();
        while (listIterator.hasNext()) {
            o45 o45Var = (o45) listIterator.next();
            long j2 = o45Var.f24616a;
            if (map.containsKey(Long.valueOf(j2))) {
                ru ruVarC = o45Var.c.c();
                for (vpg0 vpg0Var : (Set) map.get(Long.valueOf(j2))) {
                    ruVarC.a(vpg0Var.f37804a, vpg0Var.b);
                }
                listIterator.set(new o45(j2, o45Var.b, ruVarC.b()));
            }
        }
        return arrayListE;
    }

    @Override // a.tg00
    public void b(Object obj, jjq jjqVar) {
        fsj fsjVar = (fsj) this.b;
        my90 my90Var = (my90) this.c;
        gt2 gt2Var = (gt2) obj;
        SparseArray sparseArray = fsjVar.e;
        xr xrVar = new xr();
        xrVar.f41344a = jjqVar;
        SparseBooleanArray sparseBooleanArray = jjqVar.f16630a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            x0x.D(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            ft2 ft2Var = (ft2) sparseArray.get(iKeyAt);
            ft2Var.getClass();
            sparseArray2.append(iKeyAt, ft2Var);
        }
        xrVar.b = sparseArray2;
        ((kn30) gt2Var).d(my90Var, xrVar);
    }

    @Override // a.xbf
    public Object c(Object obj) {
        byte b = this.f36093a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                ((m1r) obj).getClass();
                return ((FragmentScreen) obj3).a(((rs3) obj2).d);
            case 2:
                ((Context) obj).getClass();
                return ((ActivityScreen$Companion$invoke$1) ((ActivityScreen) obj3)).c(((rs3) obj2).f31015a);
            default:
                we50 we50Var = (we50) obj2;
                ((m1r) obj).getClass();
                mz.V1.getClass();
                we50Var.getClass();
                mz mzVar = new mz();
                iiy[] iiyVarArr = mz.W1;
                iiy iiyVar = iiyVarArr[1];
                mzVar.S1.J(mzVar, iiyVar, (TokenRestoreData) obj3);
                mzVar.U1.u(mzVar, iiyVarArr[2], we50Var);
                return mzVar;
        }
    }

    @Override // a.omn0
    public void d(l55 l55Var) {
        txj txjVar = (txj) this.b;
        sfr sfrVar = (((pmn0) this.c).c.a() && l55Var.d) ? sfr.c : sfr.b;
        p8l p8lVar = txjVar.f34703a;
        vfr.d((AtomicBoolean) p8lVar.c, true);
        vfr.c((Thread) p8lVar.b);
        if (((sfr) p8lVar.m) != sfrVar) {
            p8lVar.m = sfrVar;
            p8lVar.B(p8lVar.f26560a);
        }
    }

    @Override // a.d1x
    public void e(e1x e1xVar) {
        byte b = this.f36093a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                ((d1x) obj).e((zn00) obj2);
                break;
            default:
                ((d1x) obj).e((ibe0) obj2);
                break;
        }
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        Executor executor = (Executor) this.b;
        zbg0 zbg0Var = (zbg0) this.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        tu9Var.a(new jg00(atomicBoolean, (byte) 0), zmk.f44629a);
        executor.execute(new b1(atomicBoolean, tu9Var, zbg0Var, (byte) 19));
        return "setForegroundAsync";
    }

    @Override // a.isj0
    public boolean g() {
        ktb0 ktb0Var = (ktb0) this.b;
        aa5 aa5Var = (aa5) this.c;
        boolean z = ktb0Var.q;
        if (z) {
            return z;
        }
        ktb0Var.h();
        long jA = aa5.a(ktb0Var.o, aa5Var.f508a);
        aa5Var.f508a = jA;
        boolean z2 = !ktb0Var.g(ktb0Var.n, jA + aa5Var.b);
        ktb0Var.q = z2;
        return z2;
    }

    @Override // a.pm30
    public int h(Object obj) {
        Context context = (Context) this.b;
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.c;
        jm30 jm30Var = (jm30) obj;
        String str = jm30Var.b;
        return ((str.equals(bVar.p) || str.equals(qm30.c(bVar))) && jm30Var.c(context, bVar, false) && jm30Var.d(bVar)) ? 1 : 0;
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        byte b = this.f36093a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vq vqVar = (vq) obj2;
                ms2 ms2Var = (ms2) obj;
                str.getClass();
                if (str.equals("REQUEST_ALREADY_COUPON_DIALOG_KEYSECOND")) {
                    vqVar.g(ms2Var, aao.c);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                Function2 function2 = (Function2) obj;
                str.getClass();
                Serializable serializable = bundle.getSerializable("BOTTOM_SHEET_RESULT");
                lw5 lw5Var = serializable instanceof lw5 ? (lw5) serializable : null;
                if (str.equals(str2) && lw5Var != null) {
                    function2.invoke(lw5Var, Integer.valueOf(bundle.getInt("BOTTOM_SHEET_ITEM_INDEX")));
                    break;
                }
                break;
        }
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ft2 ft2Var = (ft2) this.b;
        in30 in30Var = (in30) this.c;
        kn30 kn30Var = (kn30) ((gt2) obj);
        kn30Var.getClass();
        vn30 vn30Var = ft2Var.d;
        if (vn30Var == null) {
            return;
        }
        androidx.media3.common.b bVar = in30Var.c;
        bVar.getClass();
        int i = in30Var.d;
        owj owjVar = kn30Var.c;
        bmq0 bmq0Var = ft2Var.b;
        vn30Var.getClass();
        zz2 zz2Var = new zz2(bVar, i, owjVar.c(bmq0Var, vn30Var));
        int i2 = in30Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                kn30Var.q = zz2Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                kn30Var.r = zz2Var;
                return;
            }
        }
        kn30Var.p = zz2Var;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        ((pz40) this.b).setValue(new ycl(((w6k) this.c).r0(xiv0Var.f40966a.i(1).b)));
        return xiv0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((vyn) this.b).a((Intent) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        e0u b0uVar;
        e0u b0uVar2;
        byte b = this.f36093a;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                dcf dcfVar = (dcf) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                String str = ((exc instanceof qa3) && ecf.b.contains(Integer.valueOf(((qa3) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            b0uVar = new d0u(str2, (byte) 4);
                        } else {
                            b0uVar = new d0u(str2, (byte) 3);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        b0uVar = new d0u(str2, (byte) 1);
                    } else {
                        b0uVar = new d0u(str2, (byte) 3);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    b0uVar = new b0u(str2);
                } else {
                    b0uVar = new d0u(str2, (byte) 3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!ocf.a(cancellationSignal)) {
                    dcfVar.e().execute(new bcf(dcfVar, b0uVar, b2));
                    break;
                }
                break;
            default:
                icf icfVar = (icf) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                exc.getClass();
                String str3 = ((exc instanceof qa3) && ecf.b.contains(Integer.valueOf(((qa3) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str4 = "During get sign-in intent, failure response from one tap: " + exc.getMessage();
                int iHashCode2 = str3.hashCode();
                if (iHashCode2 != -1567968963) {
                    if (iHashCode2 != -154594663) {
                        if (iHashCode2 == 1996705159 && str3.equals("GET_NO_CREDENTIALS")) {
                            b0uVar2 = new d0u(str4, (byte) 4);
                        } else {
                            b0uVar2 = new d0u(str4, (byte) 3);
                        }
                    } else if (str3.equals("GET_INTERRUPTED")) {
                        b0uVar2 = new d0u(str4, (byte) 1);
                    } else {
                        b0uVar2 = new d0u(str4, (byte) 3);
                    }
                } else if (str3.equals("GET_CANCELED_TAG")) {
                    b0uVar2 = new b0u(str4);
                } else {
                    b0uVar2 = new d0u(str4, (byte) 3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!ocf.a(cancellationSignal2)) {
                    icfVar.e().execute(new hcf(icfVar, b0uVar2, b2));
                    break;
                }
                break;
        }
    }

    @Override // a.fdq0
    public void run() {
        mm30 mm30Var = (mm30) this.b;
        mm30Var.Y.set(mm30Var.y((hsj) this.c, mm30Var.w, 0));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:164:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #3 {all -> 0x0069, blocks: (B:19:0x0052, B:21:0x0055, B:22:0x0056, B:30:0x0072, B:70:0x00e0, B:72:0x00e4, B:74:0x00e7, B:78:0x00eb, B:79:0x00ec, B:73:0x00e5), top: B:166:0x002e, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #3 {all -> 0x0069, blocks: (B:19:0x0052, B:21:0x0055, B:22:0x0056, B:30:0x0072, B:70:0x00e0, B:72:0x00e4, B:74:0x00e7, B:78:0x00eb, B:79:0x00ec, B:73:0x00e5), top: B:166:0x002e, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [a.esd] */
    /* JADX WARN: Type inference failed for: r12v19, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v53, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Integer, java.lang.Object] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        InputStream errorStream;
        ?? r9;
        ?? ValueOf;
        boolean z = true;
        switch (this.f36093a) {
            case 6:
                rrd rrdVar = (rrd) this.b;
                Date date = (Date) this.c;
                if (task.isSuccessful()) {
                    msd msdVar = (msd) rrdVar.h;
                    synchronized (msdVar.b) {
                        msdVar.f22313a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        boolean z2 = exception instanceof ahq;
                        msd msdVar2 = (msd) rrdVar.h;
                        Object obj = msdVar2.b;
                        if (!z2) {
                            synchronized (obj) {
                                msdVar2.f22313a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            synchronized (obj) {
                                msdVar2.f22313a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            case 7:
                return ((rrd) this.b).e(task, 0L, (HashMap) this.c);
            case 8:
                ?? r0 = (esd) this.b;
                ?? inputStream = (Task) this.c;
                ?? r6 = 0;
                try {
                    try {
                        if (!inputStream.isSuccessful()) {
                            throw new IOException(inputStream.getException());
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.getResult();
                        r0.f = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            errorStream = r0.f.getErrorStream();
                            try {
                                int responseCode = r0.f.getResponseCode();
                                ValueOf = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        synchronized (r0) {
                                            r0.c = 8;
                                        }
                                        r0.p.e(0, msd.f);
                                        grd grdVarJ = r0.j(r0.f);
                                        r0.g = grdVarJ;
                                        grdVarJ.f();
                                    } catch (IOException e) {
                                        e = e;
                                        if (r0.e) {
                                            synchronized (r0) {
                                                r0.c = 8;
                                            }
                                        } else {
                                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                        }
                                        r0.b(inputStream, errorStream);
                                        synchronized (r0) {
                                            r0.b = false;
                                        }
                                        if (r0.e || (ValueOf != 0 && !esd.d(ValueOf.intValue()))) {
                                            z = false;
                                        }
                                        if (z) {
                                            r0.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z || ValueOf.intValue() == 200) {
                                            r0.h();
                                        } else {
                                            String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (ValueOf.intValue() == 403) {
                                                strF = esd.f(r0.f.getErrorStream());
                                            }
                                            new chq(ValueOf.intValue(), 0, strF);
                                        }
                                        r0.f = null;
                                        r0.g = null;
                                        return Tasks.forResult(null);
                                    }
                                }
                                r0.b(inputStream, errorStream);
                                synchronized (r0) {
                                    r0.b = false;
                                }
                                z = !r0.e && esd.d(responseCode);
                                if (z) {
                                    r0.k(new Date(System.currentTimeMillis()));
                                }
                                if (z || responseCode == 200) {
                                    r0.h();
                                } else {
                                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (responseCode == 403) {
                                        strF2 = esd.f(r0.f.getErrorStream());
                                    }
                                    new chq(responseCode, 0, strF2);
                                    r0.g();
                                }
                            } catch (IOException e2) {
                                e = e2;
                                ValueOf = 0;
                            } catch (Throwable th) {
                                th = th;
                                ValueOf = 0;
                                r6 = inputStream;
                                r9 = ValueOf;
                                r0.b(r6, errorStream);
                                synchronized (r0) {
                                    r0.b = false;
                                    if (r0.e) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        r0.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (z) {
                                        r0.h();
                                    } else {
                                        r0.h();
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            errorStream = null;
                            inputStream = inputStream;
                            ValueOf = errorStream;
                            if (r0.e) {
                                synchronized (r0) {
                                    r0.c = 8;
                                }
                            } else {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            }
                            r0.b(inputStream, errorStream);
                            synchronized (r0) {
                                r0.b = false;
                                if (r0.e) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    r0.k(new Date(System.currentTimeMillis()));
                                }
                                if (z) {
                                }
                                r0.h();
                                r0.f = null;
                                r0.g = null;
                                return Tasks.forResult(null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            errorStream = null;
                            ValueOf = 0;
                        }
                        r0.f = null;
                        r0.g = null;
                        return Tasks.forResult(null);
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = inputStream;
                        r9 = ValueOf;
                        r0.b(r6, errorStream);
                        synchronized (r0) {
                            r0.b = false;
                        }
                        if (r0.e || (r9 != 0 && !esd.d(r9.intValue()))) {
                            z = false;
                        }
                        if (z) {
                            r0.k(new Date(System.currentTimeMillis()));
                        }
                        if (z || r9.intValue() == 200) {
                            r0.h();
                        } else {
                            String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r9);
                            if (r9.intValue() == 403) {
                                strF3 = esd.f(r0.f.getErrorStream());
                            }
                            new chq(r9.intValue(), 0, strF3);
                            r0.g();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    inputStream = 0;
                    errorStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    errorStream = null;
                    r9 = 0;
                    r0.b(r6, errorStream);
                    synchronized (r0) {
                        r0.b = false;
                        if (r0.e) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            r0.k(new Date(System.currentTimeMillis()));
                        }
                        if (z) {
                            r0.h();
                        } else {
                            r0.h();
                        }
                        throw th;
                    }
                }
                break;
            default:
                g090 g090Var = (g090) this.b;
                String str = (String) this.c;
                synchronized (g090Var) {
                    ((gx3) g090Var.b).remove(str);
                    break;
                }
                return task;
        }
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        byte b = this.f36093a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (b) {
            case 4:
                pfd pfdVar = (pfd) obj;
                try {
                    Trace.beginSection(str);
                    return pfdVar.f.x0(pzuVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) pzuVar.a(Context.class);
                byte b2 = ((udk) obj).f35483a;
                String strValueOf = "";
                switch (b2) {
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 21:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new e45(str, strValueOf);
        }
    }

    public /* synthetic */ uq(Object obj, Object obj2, byte b) {
        this.f36093a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        krd krdVar = (krd) this.b;
        mrd mrdVar = (mrd) this.c;
        synchronized (krdVar) {
            krdVar.c = Tasks.forResult(mrdVar);
        }
        return Tasks.forResult(mrdVar);
    }
}
