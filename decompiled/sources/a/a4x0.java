package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a4x0 extends etw0 {
    public final t3x0 d;
    public gtw0 e;
    public volatile Boolean f;
    public final w2x0 g;
    public ScheduledExecutorService h;
    public final mtc i;
    public final ArrayList j;
    public final w2x0 k;

    public a4x0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.j = new ArrayList();
        this.i = new mtc(kxw0Var.k);
        this.d = new t3x0(this);
        this.g = new w2x0(this, kxw0Var, (byte) 0);
        this.k = new w2x0(this, kxw0Var, (byte) 1);
    }

    public final void A1() {
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        quw0 quw0Var = uuw0Var.o;
        ArrayList arrayList = this.j;
        quw0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.k.c();
    }

    public final com.google.android.gms.measurement.internal.zzr B1(boolean z) {
        long jAbs;
        Pair pair;
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.getClass();
        vtw0 vtw0VarK = kxw0Var.k();
        String strO = null;
        if (z) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            kxw0 kxw0Var2 = (kxw0) uuw0Var.b;
            wvw0 wvw0Var = kxw0Var2.e;
            kxw0.e(wvw0Var);
            if (wvw0Var.f != null) {
                wvw0 wvw0Var2 = kxw0Var2.e;
                kxw0.e(wvw0Var2);
                hac hacVar = wvw0Var2.f;
                wvw0 wvw0Var3 = (wvw0) hacVar.c;
                wvw0Var3.m1();
                wvw0Var3.m1();
                long j = ((wvw0) hacVar.c).q1().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    hacVar.A();
                    jAbs = 0;
                } else {
                    ((kxw0) wvw0Var3.b).k.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = hacVar.b;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    hacVar.A();
                    pair = null;
                } else {
                    String string = wvw0Var3.q1().getString("health_monitor:value", null);
                    long j3 = wvw0Var3.q1().getLong("health_monitor:count", 0L);
                    hacVar.A();
                    pair = (string == null || j3 <= 0) ? wvw0.A : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != wvw0.A) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strO = rw2.o(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, Separators.COLON, str);
                }
            }
        }
        return vtw0VarK.p1(strO);
    }

    public final boolean C1() {
        m1();
        n1();
        return this.e != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0439 A[Catch: all -> 0x0475, TRY_ENTER, TryCatch #49 {all -> 0x0475, blocks: (B:268:0x0465, B:258:0x0439, B:260:0x043f, B:261:0x0442, B:278:0x0486, B:207:0x0370, B:209:0x037a, B:214:0x038b), top: B:394:0x0465 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0451  */
    /* JADX WARN: Code duplicated, block: B:271:0x046c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0471 A[PHI: r4 r6 r23 r24 r26 r36 r37
  0x0471: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0495  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:304:0x0504  */
    /* JADX WARN: Code duplicated, block: B:305:0x058e  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bb A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #43 {RemoteException -> 0x05ea, blocks: (B:314:0x05b0, B:316:0x05bb), top: B:388:0x05b0 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:338:0x0626  */
    /* JADX WARN: Code duplicated, block: B:340:0x062a  */
    /* JADX WARN: Code duplicated, block: B:342:0x064b  */
    /* JADX WARN: Code duplicated, block: B:348:0x066a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0682  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:380:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0596 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x049b A[SYNTHETIC] */
    public final void D1(gtw0 gtw0Var, AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.measurement.internal.zzr zzrVar) throws Throwable {
        ArrayList arrayList;
        kxw0 kxw0Var;
        Context context;
        uuw0 uuw0Var;
        int i;
        SQLiteDatabase sQLiteDatabaseR1;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        zzbf zzbfVarCreateFromParcel;
        int i5;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        int size;
        int size2;
        int i6;
        auw0 auw0Var;
        AbstractSafeParcelable abstractSafeParcelable2;
        atw0 atw0Var;
        kxw0 kxw0Var2;
        Context context2;
        uuw0 uuw0Var2;
        long jElapsedRealtime;
        long j3;
        ykv0 ykv0Var;
        long jCurrentTimeMillis;
        ykv0 ykv0Var2;
        String str2;
        m1();
        n1();
        x1();
        kxw0 kxw0Var3 = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var3.d;
        Context context3 = kxw0Var3.f19080a;
        bkw0 bkw0Var2 = kxw0Var3.d;
        uuw0 uuw0Var3 = kxw0Var3.f;
        lwf lwfVar = kxw0Var3.k;
        int i7 = 100;
        com.google.android.gms.measurement.internal.zzr zzrVar2 = zzrVar;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            euw0 euw0VarH = kxw0Var3.h();
            String str3 = "entry";
            int i10 = i7;
            String str4 = Payload.TYPE;
            String str5 = "rowid";
            lwf lwfVar2 = lwfVar;
            kxw0 kxw0Var4 = (kxw0) euw0VarH.b;
            euw0VarH.m1();
            int i11 = i8;
            if (euw0VarH.e) {
                kxw0Var = kxw0Var3;
                context = context3;
                uuw0Var = uuw0Var3;
            } else {
                arrayList = new ArrayList();
                kxw0Var = kxw0Var3;
                if (((kxw0) euw0VarH.b).f19080a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    uuw0Var = uuw0Var3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseR1 = euw0VarH.r1();
                                if (sQLiteDatabaseR1 == null) {
                                    try {
                                        try {
                                            euw0VarH.e = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseR1 != null) {
                                                sQLiteDatabaseR1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseR1 != null) {
                                                sQLiteDatabaseR1.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseR1 != null) {
                                                sQLiteDatabaseR1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        uuw0 uuw0Var4 = kxw0Var4.f;
                                        kxw0.g(uuw0Var4);
                                        uuw0Var4.g.b(e, "Error reading entries from local database");
                                        euw0VarH.e = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseR1 != null) {
                                            sQLiteDatabaseR1.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseR1 != null) {
                                            sQLiteDatabaseR1.endTransaction();
                                        }
                                        uuw0 uuw0Var5 = kxw0Var4.f;
                                        kxw0.g(uuw0Var5);
                                        uuw0Var5.g.b(e, "Error reading entries from local database");
                                        euw0VarH.e = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseR1 != null) {
                                            sQLiteDatabaseR1.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseR1.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseR1.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR1 != null) {
                                                            sQLiteDatabaseR1.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        uuw0 uuw0Var6 = kxw0Var4.f;
                                                        kxw0.g(uuw0Var6);
                                                        uuw0Var6.g.b(e, "Error reading entries from local database");
                                                        euw0VarH.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR1 != null) {
                                                            sQLiteDatabaseR1.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseR1 != null && sQLiteDatabaseR1.inTransaction()) {
                                                            sQLiteDatabaseR1.endTransaction();
                                                        }
                                                        uuw0 uuw0Var7 = kxw0Var4.f;
                                                        kxw0.g(uuw0Var7);
                                                        uuw0Var7.g.b(e, "Error reading entries from local database");
                                                        euw0VarH.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR1 != null) {
                                                            sQLiteDatabaseR1.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            uuw0 uuw0Var8 = kxw0Var4.f;
                                                            kxw0.g(uuw0Var8);
                                                            uuw0Var8.g.b(e, "Error reading entries from local database");
                                                            euw0VarH.e = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.endTransaction();
                                                            }
                                                            uuw0 uuw0Var9 = kxw0Var4.f;
                                                            kxw0.g(uuw0Var9);
                                                            uuw0Var9.g.b(e, "Error reading entries from local database");
                                                            euw0VarH.e = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                bkw0 bkw0Var3 = kxw0Var4.d;
                                                atw0 atw0Var2 = btw0.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (bkw0Var3.x1(null, atw0Var2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                uuw0 uuw0Var10 = kxw0Var4.f;
                                                                kxw0.g(uuw0Var10);
                                                                uuw0Var10.g.b(e, "Error reading entries from local database");
                                                                euw0VarH.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.endTransaction();
                                                                }
                                                                uuw0 uuw0Var11 = kxw0Var4.f;
                                                                kxw0.g(uuw0Var11);
                                                                uuw0Var11.g.b(e, "Error reading entries from local database");
                                                                euw0VarH.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseR1.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (kxw0Var4.d.x1(null, atw0Var2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                uuw0 uuw0Var12 = kxw0Var4.f;
                                                                                                kxw0.g(uuw0Var12);
                                                                                                uuw0Var12.g.b(e, "Error reading entries from local database");
                                                                                                euw0VarH.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.endTransaction();
                                                                                                }
                                                                                                uuw0 uuw0Var13 = kxw0Var4.f;
                                                                                                kxw0.g(uuw0Var13);
                                                                                                uuw0Var13.g.b(e, "Error reading entries from local database");
                                                                                                euw0VarH.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            zzbh zzbhVarCreateFromParcel = zzbh.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (zzbhVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new auw0(zzbhVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (ctg0 unused6) {
                                                                                                        uuw0 uuw0Var14 = kxw0Var4.f;
                                                                                                        kxw0.g(uuw0Var14);
                                                                                                        uuw0Var14.g.a("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseR1 != null) {
                                                                                                        sQLiteDatabaseR1.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e11) {
                                                                                                e = e11;
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                uuw0 uuw0Var15 = kxw0Var4.f;
                                                                                                kxw0.g(uuw0Var15);
                                                                                                uuw0Var15.g.b(e, "Error reading entries from local database");
                                                                                                euw0VarH.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.endTransaction();
                                                                                                }
                                                                                                uuw0 uuw0Var16 = kxw0Var4.f;
                                                                                                kxw0.g(uuw0Var16);
                                                                                                uuw0Var16.g.b(e, "Error reading entries from local database");
                                                                                                euw0VarH.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseR1 != null) {
                                                                                                    sQLiteDatabaseR1.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (ctg0 unused8) {
                                                                                                    uuw0 uuw0Var17 = kxw0Var4.f;
                                                                                                    kxw0.g(uuw0Var17);
                                                                                                    uuw0Var17.g.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    zzplVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (zzplVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new auw0(zzplVarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th8) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    } catch (ctg0 unused9) {
                                                                                                        uuw0 uuw0Var18 = kxw0Var4.f;
                                                                                                        kxw0.g(uuw0Var18);
                                                                                                        uuw0Var18.g.a("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        zzahVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (zzahVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new auw0(zzahVarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (zzbfVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new auw0(zzbfVarCreateFromParcel, string, j2));
                                                                                                                        }
                                                                                                                        i5 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                                            sQLiteDatabaseR1.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                                        i3 = 5;
                                                                                                                        uuw0 uuw0Var19 = kxw0Var4.f;
                                                                                                                        kxw0.g(uuw0Var19);
                                                                                                                        uuw0Var19.g.b(e, "Error reading entries from local database");
                                                                                                                        euw0VarH.e = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                                            sQLiteDatabaseR1.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                                            sQLiteDatabaseR1.endTransaction();
                                                                                                                        }
                                                                                                                        uuw0 uuw0Var110 = kxw0Var4.f;
                                                                                                                        kxw0.g(uuw0Var110);
                                                                                                                        uuw0Var110.g.b(e, "Error reading entries from local database");
                                                                                                                        euw0VarH.e = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                                            sQLiteDatabaseR1.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (ctg0 unused11) {
                                                                                                                uuw0 uuw0Var20 = kxw0Var4.f;
                                                                                                                kxw0.g(uuw0Var20);
                                                                                                                uuw0Var20.g.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                zzbfVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (ctg0 unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                            sQLiteDatabaseR1.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                        i3 = 5;
                                                                                                        uuw0 uuw0Var111 = kxw0Var4.f;
                                                                                                        kxw0.g(uuw0Var111);
                                                                                                        uuw0Var111.g.b(e, "Error reading entries from local database");
                                                                                                        euw0VarH.e = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                            sQLiteDatabaseR1.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                            sQLiteDatabaseR1.endTransaction();
                                                                                                        }
                                                                                                        uuw0 uuw0Var112 = kxw0Var4.f;
                                                                                                        kxw0.g(uuw0Var112);
                                                                                                        uuw0Var112.g.b(e, "Error reading entries from local database");
                                                                                                        euw0VarH.e = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR1 != null) {
                                                                                                            sQLiteDatabaseR1.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    uuw0 uuw0Var21 = kxw0Var4.f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        kxw0.g(uuw0Var21);
                                                                                                        uuw0Var21.o.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        kxw0.g(uuw0Var21);
                                                                                                        uuw0Var21.g.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                atw0Var2 = atw0Var2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        atw0Var2 = atw0Var2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseR1 != null) {
                                                                                        sQLiteDatabaseR1.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                    i3 = 5;
                                                                                    uuw0 uuw0Var113 = kxw0Var4.f;
                                                                                    kxw0.g(uuw0Var113);
                                                                                    uuw0Var113.g.b(e, "Error reading entries from local database");
                                                                                    euw0VarH.e = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseR1 != null) {
                                                                                        sQLiteDatabaseR1.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseR1 != null) {
                                                                                        sQLiteDatabaseR1.endTransaction();
                                                                                    }
                                                                                    uuw0 uuw0Var114 = kxw0Var4.f;
                                                                                    kxw0.g(uuw0Var114);
                                                                                    uuw0Var114.g.b(e, "Error reading entries from local database");
                                                                                    euw0VarH.e = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseR1 != null) {
                                                                                        sQLiteDatabaseR1.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                            try {
                                                                if (sQLiteDatabaseR1.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    uuw0 uuw0Var22 = kxw0Var4.f;
                                                                    kxw0.g(uuw0Var22);
                                                                    uuw0Var22.g.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseR1.setTransactionSuccessful();
                                                                sQLiteDatabaseR1.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseR1.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                uuw0 uuw0Var115 = kxw0Var4.f;
                                                                kxw0.g(uuw0Var115);
                                                                uuw0Var115.g.b(e, "Error reading entries from local database");
                                                                euw0VarH.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.endTransaction();
                                                                }
                                                                uuw0 uuw0Var116 = kxw0Var4.f;
                                                                kxw0.g(uuw0Var116);
                                                                uuw0Var116.g.b(e, "Error reading entries from local database");
                                                                euw0VarH.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR1 != null) {
                                                                    sQLiteDatabaseR1.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR1 != null) {
                                                                sQLiteDatabaseR1.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str3 = str3;
                                                        sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR1 != null) {
                                                            sQLiteDatabaseR1.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    str3 = str3;
                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    uuw0 uuw0Var117 = kxw0Var4.f;
                                                    kxw0.g(uuw0Var117);
                                                    uuw0Var117.g.b(e, "Error reading entries from local database");
                                                    euw0VarH.e = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseR1 != null) {
                                                        sQLiteDatabaseR1.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    str3 = str3;
                                                    sQLiteDatabaseR1 = sQLiteDatabaseR1;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseR1 != null) {
                                                        sQLiteDatabaseR1.endTransaction();
                                                    }
                                                    uuw0 uuw0Var118 = kxw0Var4.f;
                                                    kxw0.g(uuw0Var118);
                                                    uuw0Var118.g.b(e, "Error reading entries from local database");
                                                    euw0VarH.e = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseR1 != null) {
                                                        sQLiteDatabaseR1.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseR1 = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseR1 = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseR1 = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseR1 = null;
                            }
                        } else {
                            i = 0;
                            uuw0 uuw0Var23 = kxw0Var4.f;
                            kxw0.g(uuw0Var23);
                            uuw0Var23.j.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    uuw0Var = uuw0Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractSafeParcelable != null && size < i10) {
                    arrayList2.add(new auw0(abstractSafeParcelable, zzrVar2.c, zzrVar2.j));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    auw0Var = (auw0) arrayList2.get(i6);
                    abstractSafeParcelable2 = auw0Var.f1499a;
                    atw0Var = btw0.W0;
                    if (bkw0Var2.x1(null, atw0Var)) {
                        str2 = auw0Var.b;
                        if (!TextUtils.isEmpty(str2)) {
                            zzrVar2 = new com.google.android.gms.measurement.internal.zzr(zzrVar2.f45550a, zzrVar2.b, str2, auw0Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.g, zzrVar2.h, zzrVar2.i, zzrVar2.k, zzrVar2.l, zzrVar2.m, zzrVar2.n, zzrVar2.o, zzrVar2.p, zzrVar2.q, zzrVar2.r, zzrVar2.s, zzrVar2.t, zzrVar2.u, zzrVar2.v, zzrVar2.w, zzrVar2.x, zzrVar2.y, zzrVar2.z, zzrVar2.A, zzrVar2.B, zzrVar2.Y, zzrVar2.Z, zzrVar2.f1, zzrVar2.g1);
                        }
                    }
                    if (abstractSafeParcelable2 instanceof zzbh) {
                        try {
                            lwfVar2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                lwfVar2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        gtw0Var.z((zzbh) abstractSafeParcelable2, zzrVar2);
                                        kxw0.g(uuw0Var);
                                        uuw0Var2 = uuw0Var;
                                        try {
                                            uuw0Var2.o.a("Logging telemetry for logEvent from database");
                                            ykv0Var2 = ykv0.d;
                                            if (ykv0Var2 == null) {
                                                kxw0Var2 = kxw0Var;
                                                context2 = context;
                                                try {
                                                    ykv0Var2 = new ykv0(context2, kxw0Var2);
                                                    ykv0.d = ykv0Var2;
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    kxw0.g(uuw0Var2);
                                                    uuw0Var2.g.b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        ykv0Var = ykv0.d;
                                                        if (ykv0Var == null) {
                                                            ykv0Var = new ykv0(context2, kxw0Var2);
                                                            ykv0.d = ykv0Var;
                                                        }
                                                        lwfVar2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        lwfVar2.getClass();
                                                        ykv0Var.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                kxw0Var2 = kxw0Var;
                                                context2 = context;
                                            }
                                            ykv0 ykv0Var3 = ykv0Var2;
                                            lwfVar2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            lwfVar2.getClass();
                                            ykv0Var3.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            kxw0Var2 = kxw0Var;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        kxw0Var2 = kxw0Var;
                                        context2 = context;
                                        uuw0Var2 = uuw0Var;
                                        j3 = jCurrentTimeMillis;
                                        kxw0.g(uuw0Var2);
                                        uuw0Var2.g.b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            ykv0Var = ykv0.d;
                                            if (ykv0Var == null) {
                                                ykv0Var = new ykv0(context2, kxw0Var2);
                                                ykv0.d = ykv0Var;
                                            }
                                            lwfVar2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            lwfVar2.getClass();
                                            ykv0Var.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        uuw0Var = uuw0Var2;
                                        kxw0Var = kxw0Var2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                kxw0Var2 = kxw0Var;
                                context2 = context;
                                uuw0Var2 = uuw0Var;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            kxw0Var2 = kxw0Var;
                            context2 = context;
                            uuw0Var2 = uuw0Var;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        kxw0Var2 = kxw0Var;
                        context2 = context;
                        uuw0Var2 = uuw0Var;
                        if (abstractSafeParcelable2 instanceof zzpl) {
                            try {
                                gtw0Var.m((zzpl) abstractSafeParcelable2, zzrVar2);
                            } catch (RemoteException e41) {
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractSafeParcelable2 instanceof zzah) {
                                try {
                                    gtw0Var.e((zzah) abstractSafeParcelable2, zzrVar2);
                                } catch (RemoteException e42) {
                                    kxw0.g(uuw0Var2);
                                    uuw0Var2.g.b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (bkw0Var2.x1(null, atw0Var) || !(abstractSafeParcelable2 instanceof zzbf)) {
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    gtw0Var.t(((zzbf) abstractSafeParcelable2).s(), zzrVar2);
                                } catch (RemoteException e43) {
                                    kxw0.g(uuw0Var2);
                                    uuw0Var2.g.b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            uuw0Var = uuw0Var2;
                            kxw0Var = kxw0Var2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    uuw0Var = uuw0Var2;
                    kxw0Var = kxw0Var2;
                    context = context2;
                    size = size;
                }
                uuw0Var3 = uuw0Var;
                kxw0Var3 = kxw0Var;
                context3 = context;
                lwfVar = lwfVar2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractSafeParcelable != null) {
                arrayList2.add(new auw0(abstractSafeParcelable, zzrVar2.c, zzrVar2.j));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                auw0Var = (auw0) arrayList2.get(i6);
                abstractSafeParcelable2 = auw0Var.f1499a;
                atw0Var = btw0.W0;
                if (bkw0Var2.x1(null, atw0Var)) {
                    str2 = auw0Var.b;
                    if (!TextUtils.isEmpty(str2)) {
                        zzrVar2 = new com.google.android.gms.measurement.internal.zzr(zzrVar2.f45550a, zzrVar2.b, str2, auw0Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.g, zzrVar2.h, zzrVar2.i, zzrVar2.k, zzrVar2.l, zzrVar2.m, zzrVar2.n, zzrVar2.o, zzrVar2.p, zzrVar2.q, zzrVar2.r, zzrVar2.s, zzrVar2.t, zzrVar2.u, zzrVar2.v, zzrVar2.w, zzrVar2.x, zzrVar2.y, zzrVar2.z, zzrVar2.A, zzrVar2.B, zzrVar2.Y, zzrVar2.Z, zzrVar2.f1, zzrVar2.g1);
                    }
                }
                if (abstractSafeParcelable2 instanceof zzbh) {
                    lwfVar2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    lwfVar2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    gtw0Var.z((zzbh) abstractSafeParcelable2, zzrVar2);
                    kxw0.g(uuw0Var);
                    uuw0Var2 = uuw0Var;
                    uuw0Var2.o.a("Logging telemetry for logEvent from database");
                    ykv0Var2 = ykv0.d;
                    if (ykv0Var2 == null) {
                        kxw0Var2 = kxw0Var;
                        context2 = context;
                        ykv0Var2 = new ykv0(context2, kxw0Var2);
                        ykv0.d = ykv0Var2;
                    } else {
                        kxw0Var2 = kxw0Var;
                        context2 = context;
                    }
                    ykv0 ykv0Var4 = ykv0Var2;
                    lwfVar2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    lwfVar2.getClass();
                    ykv0Var4.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    kxw0Var2 = kxw0Var;
                    context2 = context;
                    uuw0Var2 = uuw0Var;
                    if (abstractSafeParcelable2 instanceof zzpl) {
                        gtw0Var.m((zzpl) abstractSafeParcelable2, zzrVar2);
                    } else {
                        if (abstractSafeParcelable2 instanceof zzah) {
                            gtw0Var.e((zzah) abstractSafeParcelable2, zzrVar2);
                        } else if (bkw0Var2.x1(null, atw0Var)) {
                            kxw0.g(uuw0Var2);
                            uuw0Var2.g.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            kxw0.g(uuw0Var2);
                            uuw0Var2.g.a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        uuw0Var = uuw0Var2;
                        kxw0Var = kxw0Var2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                uuw0Var = uuw0Var2;
                kxw0Var = kxw0Var2;
                context = context2;
                size = size;
            }
            uuw0Var3 = uuw0Var;
            kxw0Var3 = kxw0Var;
            context3 = context;
            lwfVar = lwfVar2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    public final void E1(zzah zzahVar) {
        boolean zS1;
        m1();
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.getClass();
        euw0 euw0VarH = kxw0Var.h();
        kxw0 kxw0Var2 = (kxw0) euw0VarH.b;
        kxw0.e(kxw0Var2.i);
        byte[] bArrV1 = x6x0.V1(zzahVar);
        if (bArrV1.length > 131072) {
            uuw0 uuw0Var = kxw0Var2.f;
            kxw0.g(uuw0Var);
            uuw0Var.h.a("Conditional user property too long for local database. Sending directly to service");
            zS1 = false;
        } else {
            zS1 = euw0VarH.s1(bArrV1, 2);
        }
        z1(new ftw0(this, B1(true), zS1, new zzah(zzahVar)));
    }

    @Override // a.etw0
    public final boolean o1() {
        return false;
    }

    public final void p1(AtomicReference atomicReference) {
        m1();
        n1();
        z1(new hf5(this, atomicReference, B1(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void q1(Bundle bundle) {
        boolean z;
        boolean zS1;
        m1();
        n1();
        zzbf zzbfVar = new zzbf(bundle);
        x1();
        kxw0 kxw0Var = (kxw0) this.b;
        if (kxw0Var.d.x1(null, btw0.W0)) {
            euw0 euw0VarH = kxw0Var.h();
            kxw0 kxw0Var2 = (kxw0) euw0VarH.b;
            x6x0 x6x0Var = kxw0Var2.i;
            uuw0 uuw0Var = kxw0Var2.f;
            kxw0.e(x6x0Var);
            byte[] bArrV1 = x6x0.V1(zzbfVar);
            if (bArrV1 == null) {
                kxw0.g(uuw0Var);
                uuw0Var.h.a("Null default event parameters; not writing to database");
            } else {
                if (bArrV1.length > 131072) {
                    kxw0.g(uuw0Var);
                    uuw0Var.h.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zS1 = euw0VarH.s1(bArrV1, 4);
                }
                if (zS1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zS1 = false;
            if (zS1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        z1(new mzw0(this, B1(false), z, zzbfVar, bundle));
    }

    public final void r1() {
        m1();
        n1();
        if (C1()) {
            return;
        }
        if (s1()) {
            t3x0 t3x0Var = this.d;
            a4x0 a4x0Var = t3x0Var.c;
            a4x0Var.m1();
            Context context = ((kxw0) a4x0Var.b).f19080a;
            synchronized (t3x0Var) {
                try {
                    if (t3x0Var.f33290a) {
                        uuw0 uuw0Var = ((kxw0) t3x0Var.c.b).f;
                        kxw0.g(uuw0Var);
                        uuw0Var.o.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (t3x0Var.b != null && (t3x0Var.b.q() || t3x0Var.b.p())) {
                            uuw0 uuw0Var2 = ((kxw0) t3x0Var.c.b).f;
                            kxw0.g(uuw0Var2);
                            uuw0Var2.o.a("Already awaiting connection attempt");
                            return;
                        }
                        t3x0Var.b = new kuw0(context, Looper.getMainLooper(), d7x0.a(context), pav.b, 93, t3x0Var, t3x0Var, null);
                        uuw0 uuw0Var3 = ((kxw0) t3x0Var.c.b).f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.o.a("Connecting to remote service");
                        t3x0Var.f33290a = true;
                        s0x.H(t3x0Var.b);
                        t3x0Var.b.a();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kxw0 kxw0Var = (kxw0) this.b;
        if (kxw0Var.d.p1()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = kxw0Var.f19080a.getPackageManager().queryIntentServices(new Intent().setClassName(kxw0Var.f19080a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            uuw0 uuw0Var4 = kxw0Var.f;
            kxw0.g(uuw0Var4);
            uuw0Var4.g.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(kxw0Var.f19080a, "com.google.android.gms.measurement.AppMeasurementService"));
        t3x0 t3x0Var2 = this.d;
        a4x0 a4x0Var2 = t3x0Var2.c;
        a4x0Var2.m1();
        Context context2 = ((kxw0) a4x0Var2.b).f19080a;
        bbw0 bbw0VarM = bbw0.m();
        synchronized (t3x0Var2) {
            try {
                boolean z = t3x0Var2.f33290a;
                a4x0 a4x0Var3 = t3x0Var2.c;
                kxw0 kxw0Var2 = (kxw0) a4x0Var3.b;
                if (z) {
                    uuw0 uuw0Var5 = kxw0Var2.f;
                    kxw0.g(uuw0Var5);
                    uuw0Var5.o.a("Connection attempt already in progress");
                } else {
                    uuw0 uuw0Var6 = kxw0Var2.f;
                    kxw0.g(uuw0Var6);
                    uuw0Var6.o.a("Using local app measurement service");
                    t3x0Var2.f33290a = true;
                    bbw0VarM.a(context2, intent, a4x0Var3.d, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean s1() {
        m1();
        n1();
        if (this.f == null) {
            m1();
            n1();
            kxw0 kxw0Var = (kxw0) this.b;
            wvw0 wvw0Var = kxw0Var.e;
            kxw0.e(wvw0Var);
            wvw0Var.m1();
            boolean z = false;
            Boolean boolValueOf = !wvw0Var.q1().contains("use_service") ? null : Boolean.valueOf(wvw0Var.q1().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                vtw0 vtw0VarK = ((kxw0) this.b).k();
                vtw0VarK.n1();
                if (vtw0VarK.o == 1) {
                    z = true;
                } else {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.o.a("Checking service availability");
                    x6x0 x6x0Var = kxw0Var.i;
                    kxw0.e(x6x0Var);
                    int iC = pav.b.c(((kxw0) x6x0Var.b).f19080a, 12451000);
                    if (iC == 0) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.o.a("Service available");
                    } else if (iC == 1) {
                        uuw0 uuw0Var3 = kxw0Var.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.o.a("Service missing");
                    } else if (iC != 2) {
                        if (iC != 3) {
                            uuw0 uuw0Var4 = kxw0Var.f;
                            if (iC == 9) {
                                kxw0.g(uuw0Var4);
                                uuw0Var4.j.a("Service invalid");
                            } else if (iC != 18) {
                                kxw0.g(uuw0Var4);
                                uuw0Var4.j.b(Integer.valueOf(iC), "Unexpected service status");
                            } else {
                                kxw0.g(uuw0Var4);
                                uuw0Var4.j.a("Service updating");
                            }
                        } else {
                            uuw0 uuw0Var5 = kxw0Var.f;
                            kxw0.g(uuw0Var5);
                            uuw0Var5.j.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        uuw0 uuw0Var6 = kxw0Var.f;
                        kxw0.g(uuw0Var6);
                        uuw0Var6.n.a("Service container out of date");
                        x6x0 x6x0Var2 = kxw0Var.i;
                        kxw0.e(x6x0Var2);
                        if (x6x0Var2.X1() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && kxw0Var.d.p1()) {
                    uuw0 uuw0Var7 = kxw0Var.f;
                    kxw0.g(uuw0Var7);
                    uuw0Var7.g.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    wvw0 wvw0Var2 = kxw0Var.e;
                    kxw0.e(wvw0Var2);
                    wvw0Var2.m1();
                    SharedPreferences.Editor editorEdit = wvw0Var2.q1().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f = Boolean.valueOf(z2);
        }
        return this.f.booleanValue();
    }

    public final void t1() {
        m1();
        n1();
        t3x0 t3x0Var = this.d;
        if (t3x0Var.b != null && (t3x0Var.b.p() || t3x0Var.b.q())) {
            t3x0Var.b.c();
        }
        t3x0Var.b = null;
        try {
            bbw0.m().s(((kxw0) this.b).f19080a, t3x0Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.e = null;
    }

    public final boolean u1() {
        m1();
        n1();
        if (!s1()) {
            return true;
        }
        x6x0 x6x0Var = ((kxw0) this.b).i;
        kxw0.e(x6x0Var);
        return x6x0Var.X1() >= ((Integer) btw0.J0.a(null)).intValue();
    }

    public final boolean v1() {
        m1();
        n1();
        if (!s1()) {
            return true;
        }
        x6x0 x6x0Var = ((kxw0) this.b).i;
        kxw0.e(x6x0Var);
        return x6x0Var.X1() >= 241200;
    }

    public final void w1(ComponentName componentName) {
        m1();
        if (this.e != null) {
            this.e = null;
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.o.b(componentName, "Disconnected from device MeasurementService");
            m1();
            r1();
        }
    }

    public final void x1() {
        ((kxw0) this.b).getClass();
    }

    public final void y1() {
        m1();
        mtc mtcVar = this.i;
        mtcVar.getClass();
        mtcVar.f22363a = SystemClock.elapsedRealtime();
        bkw0 bkw0Var = ((kxw0) this.b).d;
        this.g.b(((Long) btw0.Y.a(null)).longValue());
    }

    public final void z1(Runnable runnable) {
        m1();
        if (C1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.j;
        long size = arrayList.size();
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        if (size >= 1000) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.k.b(60000L);
            r1();
        }
    }
}
