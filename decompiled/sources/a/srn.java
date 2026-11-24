package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class srn implements Callback {
    public static final long[] e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32686a;
    public Object b;
    public Object c;
    public final Object d;

    public srn(ugi0 ugi0Var, ens ensVar) {
        ugi0Var.getClass();
        this.b = ugi0Var;
        this.c = ensVar;
        int iD = ugi0Var.d();
        if (iD <= 64) {
            this.f32686a = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.f32686a = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fe A[PHI: r14 r16 r17
  0x00fe: PHI (r14v1 android.database.Cursor) = (r14v2 android.database.Cursor), (r14v4 android.database.Cursor) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r16v5 a.sww0) = (r16v7 a.sww0), (r16v11 a.sww0) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public sww0 a(sww0 sww0Var, String str) throws Throwable {
        Cursor cursor;
        sww0 sww0Var2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strW = sww0Var.w();
        List listT = sww0Var.t();
        ydw0 ydw0Var = (ydw0) this.d;
        m6x0 m6x0Var = ydw0Var.c;
        kxw0 kxw0Var = (kxw0) ydw0Var.b;
        m6x0Var.j0();
        yww0 yww0VarW1 = r6x0.w1(sww0Var, "_eid");
        Long l = (Long) (yww0VarW1 == null ? null : r6x0.E1(yww0VarW1));
        if (l != null) {
            if (strW.equals("_ep")) {
                m6x0Var.j0();
                yww0 yww0VarW2 = r6x0.w1(sww0Var, "_en");
                String str2 = (String) (yww0VarW2 == null ? null : r6x0.E1(yww0VarW2));
                if (TextUtils.isEmpty(str2)) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.h.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((sww0) this.b) == null || ((Long) this.c) == null || l.longValue() != ((Long) this.c).longValue()) {
                    zlw0 zlw0Var = m6x0Var.c;
                    m6x0.T(zlw0Var);
                    kxw0 kxw0Var2 = (kxw0) zlw0Var.b;
                    zlw0Var.m1();
                    zlw0Var.n1();
                    try {
                        cursorRawQuery = zlw0Var.c2().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    sww0Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((sww0) ((qww0) r6x0.X1(sww0.H(), cursorRawQuery.getBlob(0))).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            j = 0;
                                            uuw0 uuw0Var2 = kxw0Var2.f;
                                            kxw0.g(uuw0Var2);
                                            uuw0Var2.g.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = sww0Var2;
                                        }
                                    } catch (IOException e3) {
                                        uuw0 uuw0Var3 = kxw0Var2.f;
                                        kxw0.g(uuw0Var3);
                                        j = 0;
                                        try {
                                            uuw0Var3.g.d("Failed to merge main event. appId, eventId", uuw0.q1(str), l, e3);
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            uuw0 uuw0Var4 = kxw0Var2.f;
                                            kxw0.g(uuw0Var4);
                                            uuw0Var4.g.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = sww0Var2;
                                            if (pair != 0) {
                                            }
                                            uuw0 uuw0Var5 = kxw0Var.f;
                                            kxw0.g(uuw0Var5);
                                            uuw0Var5.h.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                            return sww0Var2;
                                        }
                                        cursorRawQuery.close();
                                        pair = sww0Var2;
                                    }
                                } else {
                                    uuw0 uuw0Var6 = kxw0Var2.f;
                                    kxw0.g(uuw0Var6);
                                    uuw0Var6.o.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    sww0Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e5) {
                                e = e5;
                                sww0Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        sww0Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        uuw0 uuw0Var7 = kxw0Var.f;
                        kxw0.g(uuw0Var7);
                        uuw0Var7.h.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return sww0Var2;
                    }
                    this.b = (sww0) obj;
                    this.f32686a = ((Long) pair.second).longValue();
                    m6x0Var.j0();
                    this.c = (Long) r6x0.y1((sww0) this.b, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.f32686a - 1;
                this.f32686a = j2;
                if (j2 <= j) {
                    zlw0 zlw0Var2 = m6x0Var.c;
                    m6x0.T(zlw0Var2);
                    kxw0 kxw0Var3 = (kxw0) zlw0Var2.b;
                    zlw0Var2.m1();
                    uuw0 uuw0Var8 = kxw0Var3.f;
                    kxw0.g(uuw0Var8);
                    uuw0Var8.o.b(str, "Clearing complex main event info. appId");
                    try {
                        zlw0Var2.c2().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e7) {
                        uuw0 uuw0Var9 = kxw0Var3.f;
                        kxw0.g(uuw0Var9);
                        uuw0Var9.g.b(e7, "Error clearing complex main event");
                    }
                } else {
                    zlw0 zlw0Var3 = m6x0Var.c;
                    m6x0.T(zlw0Var3);
                    zlw0Var3.E1(str, l, this.f32686a, (sww0) this.b);
                }
                ArrayList arrayList = new ArrayList();
                for (yww0 yww0Var : ((sww0) this.b).t()) {
                    m6x0Var.j0();
                    if (r6x0.w1(sww0Var, yww0Var.s()) == null) {
                        arrayList.add(yww0Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    uuw0 uuw0Var10 = kxw0Var.f;
                    kxw0.g(uuw0Var10);
                    uuw0Var10.h.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listT);
                    listT = arrayList;
                }
                strW = str2;
            } else {
                this.c = l;
                this.b = sww0Var;
                m6x0Var.j0();
                yww0 yww0VarW3 = r6x0.w1(sww0Var, "_epc");
                Serializable serializableE1 = yww0VarW3 != null ? r6x0.E1(yww0VarW3) : null;
                long jLongValue = ((Long) (serializableE1 != null ? serializableE1 : 0L)).longValue();
                this.f32686a = jLongValue;
                if (jLongValue <= 0) {
                    uuw0 uuw0Var11 = kxw0Var.f;
                    kxw0.g(uuw0Var11);
                    uuw0Var11.h.b(strW, "Complex event with zero extra param count. eventName");
                } else {
                    zlw0 zlw0Var4 = m6x0Var.c;
                    m6x0.T(zlw0Var4);
                    zlw0Var4.E1(str, l, this.f32686a, sww0Var);
                }
            }
        }
        qww0 qww0Var = (qww0) sww0Var.i();
        qww0Var.r(strW);
        qww0Var.c();
        ((sww0) qww0Var.b).L();
        qww0Var.c();
        ((sww0) qww0Var.b).K(listT);
        return (sww0) qww0Var.e();
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException iOException) {
        ml50 ml50Var = (ml50) this.c;
        Request b = call.getB();
        if (b != null) {
            HttpUrl httpUrl = b.f46108a;
            if (httpUrl != null) {
                ml50Var.n(httpUrl.j().toString());
            }
            String str = b.b;
            if (str != null) {
                ml50Var.d(str);
            }
        }
        ml50Var.i(this.f32686a);
        twn.y((Timer) this.d, ml50Var, ml50Var);
        ((Callback) this.b).b(call, iOException);
    }

    @Override // okhttp3.Callback
    public void h(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, (ml50) this.c, this.f32686a, ((Timer) this.d).a());
        ((Callback) this.b).h(call, response);
    }

    public srn(Callback callback, dps0 dps0Var, Timer timer, long j) {
        this.b = callback;
        this.c = new ml50(dps0Var);
        this.f32686a = j;
        this.d = timer;
    }

    public srn(srn srnVar) {
        this.b = Collections.unmodifiableList((ArrayList) srnVar.b);
        this.c = Collections.unmodifiableList((ArrayList) srnVar.c);
        this.d = Collections.unmodifiableList((ArrayList) srnVar.d);
        this.f32686a = srnVar.f32686a;
    }

    public srn(wd40 wd40Var) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f32686a = 5000L;
        arrayList.add(wd40Var);
    }
}
