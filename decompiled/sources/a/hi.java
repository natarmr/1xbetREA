package a;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import androidx.camera.view.PreviewView;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi implements k4r, Continuation, wzn0, pyj, SuccessContinuation, uu9, rbe, xbf, omn0, OnSuccessListener, upg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13088a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hi(nyj nyjVar, String str, String str2) {
        this.f13088a = (byte) 5;
        this.c = nyjVar;
        this.b = str;
        this.d = str2;
    }

    @Override // a.pyj
    public rcf0 a(int i, ccs0 ccs0Var, int[] iArr) {
        nyj nyjVar = (nyj) this.c;
        String str = (String) this.b;
        String str2 = (String) this.d;
        u3x u3xVarL = b4x.l();
        for (int i2 = 0; i2 < ccs0Var.f4128a; i2++) {
            u3xVarL.b(new oyj(i, ccs0Var, i2, nyjVar, iArr[i2], str, str2));
        }
        return u3xVarL.g();
    }

    @Override // a.rbe
    public void accept(Object obj) {
        zhl zhlVar = (zhl) this.b;
        ((bo30) obj).z(zhlVar.f44398a, (vn30) this.d, (in30) this.c);
    }

    @Override // a.upg0
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        wpg0 wpg0Var;
        jv00 jv00Var;
        byte b = this.f13088a;
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        jv00 jv00Var2 = jv00.CACHE_FULL;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        int i7 = 0;
        switch (b) {
            case 14:
                wpg0 wpg0Var2 = (wpg0) obj4;
                q35 q35Var = (q35) obj3;
                zvn zvnVar = q35Var.c;
                String str = q35Var.f28034a;
                q55 q55Var = (q55) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = wpg0Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * wpg0Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                r35 r35Var = wpg0Var2.d;
                if (jSimpleQueryForLong >= r35Var.f29770a) {
                    wpg0Var2.k(1L, jv00Var2, str);
                    return -1L;
                }
                Long lC = wpg0.c(sQLiteDatabase, q55Var);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", q55Var.f28133a);
                    contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(pwb0.a(q55Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = q55Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = r35Var.e;
                byte[] bArr2 = zvnVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(q35Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(q35Var.e));
                contentValues2.put("payload_encoding", zvnVar.f45066a.f12034a);
                contentValues2.put("code", q35Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", q35Var.g);
                contentValues2.put("pseudonymous_id", q35Var.h);
                contentValues2.put("experiment_ids_clear_blob", q35Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", q35Var.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(q35Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 15:
                wpg0 wpg0Var3 = (wpg0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                q55 q55Var2 = (q55) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    ru ruVar = new ru();
                    ruVar.f = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        hny.u("Null transportName");
                        return null;
                    }
                    ruVar.f31100a = string;
                    ruVar.d = Long.valueOf(cursor2.getLong(i5));
                    ruVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        ruVar.c = new zvn(string2 == null ? wpg0.f : new gwn(string2), cursor2.getBlob(5));
                        wpg0Var = wpg0Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        gwn gwnVar = string3 == null ? wpg0.f : new gwn(string3);
                        Cursor cursorQuery = wpg0Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                wpg0 wpg0Var4 = wpg0Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    wpg0Var3 = wpg0Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            wpg0Var = wpg0Var3;
                            cursorQuery.close();
                            ruVar.c = new zvn(gwnVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        ruVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        ruVar.g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        ruVar.h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        ruVar.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        ruVar.j = cursor2.getBlob(11);
                    }
                    arrayList.add(new o45(j, q55Var2, ruVar.b()));
                    wpg0Var3 = wpg0Var;
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                wpg0 wpg0Var5 = (wpg0) obj4;
                HashMap map = (HashMap) obj3;
                mii0 mii0Var = (mii0) obj2;
                ArrayList arrayList3 = (ArrayList) mii0Var.d;
                Cursor cursor3 = (Cursor) obj;
                wpg0Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    jv00 jv00Var3 = jv00.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            jv00Var3 = jv00.MESSAGE_TOO_OLD;
                        } else if (i12 == 2) {
                            jv00Var = jv00Var2;
                        } else if (i12 == i4) {
                            jv00Var3 = jv00.PAYLOAD_TOO_BIG;
                        } else if (i12 == i3) {
                            jv00Var3 = jv00.MAX_RETRIES_REACHED;
                        } else if (i12 == i2) {
                            jv00Var3 = jv00.INVALID_PAYLOD;
                        } else if (i12 == i) {
                            jv00Var3 = jv00.SERVER_ERROR;
                        } else {
                            m8x.N(Integer.valueOf(i12), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        jv00Var = jv00Var3;
                    } else {
                        jv00Var = jv00Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new kv00(j2, jv00Var));
                    i = 6;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = ov00.c;
                    new ArrayList();
                    arrayList3.add(new ov00((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long time = wpg0Var5.b.getTime();
                SQLiteDatabase sQLiteDatabaseA = wpg0Var5.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        xlq0 xlq0Var = new xlq0(cursorRawQuery.getLong(0), time);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        mii0Var.c = xlq0Var;
                        mii0Var.e = new s7v(new zqm0(wpg0Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * wpg0Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), r35.f.f29770a));
                        mii0Var.b = (String) wpg0Var5.e.get();
                        return new auc((xlq0) mii0Var.c, Collections.unmodifiableList(arrayList3), (s7v) mii0Var.e, (String) mii0Var.b);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseA.endTransaction();
                    throw th4;
                }
        }
    }

    public void b() {
        nv20 nv20Var = (nv20) this.b;
        zub0 zub0Var = (zub0) this.d;
        s0a s0aVar = (s0a) this.c;
        AtomicReference atomicReference = ((PreviewView) nv20Var.f24171a).g;
        do {
            if (atomicReference.compareAndSet(zub0Var, null)) {
                zub0Var.b(cvb0.f5022a);
                break;
            }
        } while (atomicReference.get() == zub0Var);
        dfr dfrVar = zub0Var.e;
        if (dfrVar != null) {
            dfrVar.cancel(false);
            zub0Var.e = null;
        }
        s0aVar.b().a(zub0Var);
    }

    @Override // a.xbf
    public Object c(Object obj) {
        TokenRestoreData tokenRestoreData = (TokenRestoreData) this.b;
        long[] jArr = (long[]) this.d;
        we50 we50Var = (we50) this.c;
        ((m1r) obj).getClass();
        nd.S1.getClass();
        we50Var.getClass();
        nd ndVar = new nd();
        iiy[] iiyVarArr = nd.U1;
        ndVar.O1.J(ndVar, iiyVarArr[1], tokenRestoreData);
        ndVar.P1.r(ndVar, iiyVarArr[2], jArr);
        ndVar.Q1.u(ndVar, iiyVarArr[3], we50Var);
        return ndVar;
    }

    @Override // a.omn0
    public void d(l55 l55Var) {
        dvb0 dvb0Var;
        nv20 nv20Var = (nv20) this.b;
        s0a s0aVar = (s0a) this.d;
        pmn0 pmn0Var = (pmn0) this.c;
        PreviewView previewView = (PreviewView) nv20Var.f24171a;
        l8x.U("PreviewView", "Preview transformation info updated. " + l55Var);
        boolean z = s0aVar.h().h() == 0;
        n8z n8zVar = previewView.d;
        Size size = pmn0Var.b;
        n8zVar.getClass();
        l8x.U("PreviewTransform", "Transformation info set: " + l55Var + Separators.SP + size + Separators.SP + z);
        n8zVar.f = l55Var.f19438a;
        n8zVar.f23114a = l55Var.b;
        int i = l55Var.c;
        n8zVar.b = i;
        n8zVar.e = size;
        n8zVar.c = z;
        n8zVar.d = l55Var.d;
        n8zVar.g = l55Var.e;
        if (i == -1 || ((dvb0Var = previewView.b) != null && (dvb0Var instanceof wmn0))) {
            previewView.e = true;
        } else {
            previewView.e = false;
        }
        previewView.a();
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        CoroutineContext coroutineContext = (CoroutineContext) this.b;
        yne yneVar = (yne) this.d;
        Function2 function2 = (Function2) this.c;
        tu9Var.a(new wss((bby) coroutineContext.get(gqw0.o1), (byte) 5), zmk.f44629a);
        return qjj.W(d5c.a(coroutineContext), null, yneVar, new zd00(function2, tu9Var, null), 1);
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        byte b = this.f13088a;
        Object obj = this.c;
        Object obj2 = this.d;
        String str2 = (String) this.b;
        switch (b) {
            case 0:
                String str3 = (String) obj2;
                Function0 function0 = (Function0) obj;
                str.getClass();
                if (str.equals(str2) && bundle.getBoolean(str3, false)) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                Function0 function1 = (Function0) obj;
                Function1 function2 = (Function1) obj2;
                str.getClass();
                if (str2.equals(str)) {
                    if (!bundle.containsKey(str2)) {
                        function1.invoke();
                    } else {
                        function2.invoke((iqt0) ahy.f0(bundle, str2));
                    }
                }
                break;
            default:
                ghn0 ghn0Var = (ghn0) obj2;
                Function2 function3 = (Function2) obj;
                str.getClass();
                if (str.equals(str2) && bundle.getBoolean(ghn0Var.name(), false)) {
                    Long lValueOf = Long.valueOf(bundle.getLong("BALANCE_ID"));
                    String string = bundle.getString("BET_MODE", "");
                    string.getClass();
                    function3.invoke(lValueOf, string);
                    break;
                }
                break;
        }
    }

    @Override // a.wzn0
    public Object k() {
        swj swjVar = (swj) this.b;
        q55 q55Var = (q55) this.d;
        q35 q35Var = (q35) this.c;
        wpg0 wpg0Var = swjVar.d;
        wpg0Var.getClass();
        mwb0 mwb0Var = q55Var.c;
        String str = q35Var.f28034a;
        String str2 = q55Var.f28133a;
        String strY = m8x.Y("SQLiteEventStore");
        if (Log.isLoggable(strY, 3)) {
            Log.d(strY, "Storing event with priority=" + mwb0Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) wpg0Var.d(new hi(wpg0Var, q35Var, q55Var, (byte) 14))).getClass();
        swjVar.f32924a.v(q55Var, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        n660 n660Var = (n660) this.b;
        Task task = (Task) this.d;
        p8f p8fVar = (p8f) this.c;
        try {
            mrd mrdVar = (mrd) task.getResult();
            if (mrdVar != null) {
                ((Executor) n660Var.c).execute(new kdg0(p8fVar, ((j910) n660Var.b).h(mrdVar), (byte) 1));
            }
        } catch (zgq e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        mrd mrdVar;
        byte b = this.f13088a;
        URL url = null;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                esd esdVar = (esd) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new ygq("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                }
                try {
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new ygq("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                    }
                    try {
                        url = new URL(esdVar.c(esdVar.n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    esdVar.i(httpURLConnection, (String) task3.getResult(), ((d45) task2.getResult()).f5438a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new ygq("Failed to open HTTP stream connection", e));
                }
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            default:
                xgq xgqVar = (xgq) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                xgqVar.getClass();
                if (!task4.isSuccessful() || task4.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                mrd mrdVar2 = (mrd) task4.getResult();
                if (task5.isSuccessful() && (mrdVar = (mrd) task5.getResult()) != null && mrdVar2.c.equals(mrdVar.c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                krd krdVar = xgqVar.d;
                Executor executor = krdVar.f18759a;
                return Tasks.call(executor, new ird(krdVar, mrdVar2, (byte) 0)).onSuccessTask(executor, new uq((Object) krdVar, (Object) mrdVar2, (byte) 5)).continueWith(xgqVar.b, new wgq(xgqVar));
        }
    }

    public /* synthetic */ hi(FirebaseMessaging firebaseMessaging, String str, crm0 crm0Var) {
        this.f13088a = (byte) 6;
        this.d = firebaseMessaging;
        this.b = str;
        this.c = crm0Var;
    }

    public /* synthetic */ hi(Object obj, Object obj2, Object obj3, byte b) {
        this.f13088a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hi(String str, Function0 function0, Function1 function1) {
        this.f13088a = (byte) 1;
        this.b = str;
        this.c = function0;
        this.d = function1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String strF;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
        String str = (String) this.b;
        crm0 crm0Var = (crm0) this.c;
        String str2 = (String) obj;
        drm0 drm0VarC = FirebaseMessaging.c(firebaseMessaging.b);
        nfq nfqVar = firebaseMessaging.f45665a;
        nfqVar.a();
        if ("[DEFAULT]".equals(nfqVar.b)) {
            strF = "";
        } else {
            strF = nfqVar.f();
        }
        String strA = firebaseMessaging.i.a();
        synchronized (drm0VarC) {
            String strA2 = crm0.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) drm0VarC.f6568a).edit();
                editorEdit.putString(strF + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (firebaseMessaging.d.J() || crm0Var == null || !str2.equals(crm0Var.b)) {
            nfq nfqVar2 = firebaseMessaging.f45665a;
            nfqVar2.a();
            String str3 = nfqVar2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    nfqVar2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean zJ = firebaseMessaging.d.J();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (zJ) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new ehf0(firebaseMessaging.b).q(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
