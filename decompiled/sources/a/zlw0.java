package a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.gov.nist.core.Separators;
import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zlw0 extends u5x0 {
    public static final String[] g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final ylw0 e;
    public final mtc f;

    public zlw0(m6x0 m6x0Var) {
        super(m6x0Var);
        this.f = new mtc(((kxw0) this.b).k);
        bkw0 bkw0Var = ((kxw0) this.b).d;
        this.e = new ylw0(this, ((kxw0) this.b).f19080a);
    }

    public static final String R1(List list) {
        return list.isEmpty() ? "" : kng0.l(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void Z1(ContentValues contentValues, Object obj) {
        s0x.E("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            jf4.o("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long A1(String str) {
        long j2;
        ContentValues contentValues;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        s0x.E("first_open_count");
        m1();
        n1();
        SQLiteDatabase sQLiteDatabaseC2 = c2();
        sQLiteDatabaseC2.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j2 = -1;
                long jJ1 = J1(sb.toString(), new String[]{str}, -1L);
                if (jJ1 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseC2.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.g.c(uuw0.q1(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jJ1 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jJ1));
                            if (sQLiteDatabaseC2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                uuw0 uuw0Var2 = kxw0Var.f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.c(uuw0.q1(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseC2.setTransactionSuccessful();
                                j2 = jJ1;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j3 = jJ1;
                            uuw0 uuw0Var3 = kxw0Var.f;
                            kxw0.g(uuw0Var3);
                            uuw0Var3.g.d("Error inserting column. appId", uuw0.q1(str), "first_open_count", e);
                            j2 = j3;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jJ1));
                    if (sQLiteDatabaseC2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        uuw0 uuw0Var4 = kxw0Var.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.g.c(uuw0.q1(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseC2.setTransactionSuccessful();
                        j2 = jJ1;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return j2;
        } finally {
            sQLiteDatabaseC2.endTransaction();
        }
    }

    public final boolean B1(String str, String str2) {
        return I1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void C1(List list) {
        s0x.H(list);
        m1();
        n1();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(Separators.COMMA);
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(Separators.RPAREN);
        int iDelete = c2().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long D1(String str) {
        s0x.E(str);
        return J1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void E1(String str, Long l2, long j2, sww0 sww0Var) {
        m1();
        n1();
        s0x.H(sww0Var);
        s0x.E(str);
        kxw0 kxw0Var = (kxw0) this.b;
        byte[] bArrA = sww0Var.a();
        uuw0 uuw0Var = kxw0Var.f;
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.o.c(kxw0Var.j.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrA);
        try {
            if (c2().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(uuw0.q1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(uuw0.q1(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x011f->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    public final void F1(String str, Long l2, String str2, Bundle bundle) {
        r34 r34Var;
        uuw0 uuw0Var;
        Bundle bundle2;
        long j2;
        String str3;
        ContentValues contentValues;
        uuw0 uuw0Var2;
        mxw0 mxw0Var;
        Iterator it;
        zlw0 zlw0Var = this;
        String str4 = str;
        kxw0 kxw0Var = (kxw0) zlw0Var.b;
        s0x.H(bundle);
        zlw0Var.m1();
        zlw0Var.n1();
        if (l2 != null) {
            long jLongValue = l2.longValue();
            r34Var = new r34();
            r34Var.c = zlw0Var;
            s0x.E(str4);
            r34Var.b = str4;
            r34Var.f29768a = zlw0Var.J1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str4, String.valueOf(jLongValue)}, -1L);
        } else {
            r34Var = new r34();
            r34Var.c = zlw0Var;
            s0x.E(str4);
            r34Var.b = str4;
            r34Var.f29768a = -1L;
        }
        r34 r34Var2 = r34Var;
        List<vlw0> listK = r34Var2.k();
        while (!listK.isEmpty()) {
            for (vlw0 vlw0Var : listK) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        mxw0 mxw0Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = zlw0Var.c2().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(vlw0Var.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                mxw0Var = (mxw0) ((jxw0) r6x0.X1(mxw0.W(), cursorQuery.getBlob(0))).e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        uuw0 uuw0Var3 = kxw0Var.f;
                                                        kxw0.g(uuw0Var3);
                                                        uuw0Var3.j.b(uuw0.q1(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    uuw0 uuw0Var4 = kxw0Var.f;
                                                    kxw0.g(uuw0Var4);
                                                    uuw0Var4.g.c(uuw0.q1(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                mxw0Var2 = mxw0Var;
                                            } catch (IOException e2) {
                                                uuw0 uuw0Var5 = kxw0Var.f;
                                                kxw0.g(uuw0Var5);
                                                uuw0Var5.g.c(uuw0.q1(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (mxw0Var2 != null) {
                                                it = mxw0Var2.X1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((eyw0) it.next()).t().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            uuw0 uuw0Var6 = kxw0Var.f;
                                            kxw0.g(uuw0Var6);
                                            uuw0Var6.g.b(uuw0.q1(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        mxw0Var = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            mxw0Var = null;
                        }
                        if (mxw0Var2 != null) {
                            it = mxw0Var2.X1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((eyw0) it.next()).t().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = c2().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        kxw0.g(uuw0Var);
                        uuw0Var2 = uuw0Var;
                        try {
                            uuw0Var2.g.c(uuw0.q1(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            kxw0.g(uuw0Var2);
                            uuw0Var2.g.c(uuw0.q1(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    uuw0Var2 = uuw0Var;
                }
                r6x0 r6x0Var = zlw0Var.c.g;
                m6x0.T(r6x0Var);
                sww0 sww0Var = vlw0Var.d;
                Bundle bundle3 = new Bundle();
                for (yww0 yww0Var : sww0Var.t()) {
                    if (yww0Var.z()) {
                        bundle3.putDouble(yww0Var.s(), yww0Var.A());
                    } else if (yww0Var.x()) {
                        bundle3.putFloat(yww0Var.s(), yww0Var.y());
                    } else if (yww0Var.v()) {
                        bundle3.putLong(yww0Var.s(), yww0Var.w());
                    } else if (yww0Var.t()) {
                        bundle3.putString(yww0Var.s(), yww0Var.u());
                    } else if (yww0Var.B().isEmpty()) {
                        uuw0 uuw0Var7 = ((kxw0) r6x0Var.b).f;
                        kxw0.g(uuw0Var7);
                        uuw0Var7.g.b(yww0Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(yww0Var.s(), r6x0.Z1(yww0Var.B()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strW = sww0Var.w();
                if (string == null) {
                    string = "";
                }
                x6x0 x6x0Var = kxw0Var.i;
                uuw0Var = kxw0Var.f;
                kxw0.e(x6x0Var);
                if (strW.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        vlw0 vlw0Var2 = vlw0Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        vlw0Var = vlw0Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                vlw0 vlw0Var3 = vlw0Var;
                x6x0Var.z1(bundle3, bundle2);
                lmw0 lmw0Var = new lmw0((kxw0) zlw0Var.b, string, str4, sww0Var.w(), sww0Var.y(), sww0Var.G(), sww0Var.A(), bundle3);
                j2 = vlw0Var3.f37650a;
                long j3 = vlw0Var3.b;
                boolean z = vlw0Var3.c;
                m1();
                n1();
                str3 = lmw0Var.f20318a;
                s0x.E(str3);
                m6x0.T(r6x0Var);
                byte[] bArrA = r6x0Var.M1(lmw0Var).a();
                contentValues = new ContentValues();
                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str3);
                contentValues.put("name", lmw0Var.b);
                contentValues.put("timestamp", Long.valueOf(lmw0Var.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put(RemoteMessageConst.DATA, bArrA);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(lmw0Var.e));
                zlw0Var = this;
                str4 = str;
            }
            listK = r34Var2.k();
            zlw0Var = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.p4, a.u5x0, a.zlw0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final xyw0 G1(String str) {
        Throwable th;
        SQLiteException e;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.H(str);
        m1();
        n1();
        ?? r2 = 0;
        xyw0VarC = null;
        xyw0VarC = null;
        xyw0 xyw0VarC = null;
        try {
            try {
                this = c2().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        xyw0VarC = xyw0.c(this.getInt(1), this.getString(0));
                    } else {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.o.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (xyw0VarC == null) {
                        return xyw0.c;
                    }
                    return xyw0VarC;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (xyw0VarC == null) {
            return xyw0.c;
        }
        return xyw0VarC;
    }

    public final void H1(String str, zzoh zzohVar) {
        m1();
        n1();
        s0x.E(str);
        kxw0 kxw0Var = (kxw0) this.b;
        lwf lwfVar = kxw0Var.k;
        uuw0 uuw0Var = kxw0Var.f;
        lwfVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        atw0 atw0Var = btw0.u0;
        long jLongValue = jCurrentTimeMillis - ((Long) atw0Var.a(null)).longValue();
        long j2 = zzohVar.b;
        if (j2 < jLongValue || j2 > ((Long) atw0Var.a(null)).longValue() + jCurrentTimeMillis) {
            kxw0.g(uuw0Var);
            uuw0Var.j.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", uuw0.q1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        kxw0.g(uuw0Var);
        uuw0Var.o.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.f45545a);
        contentValues.put(Payload.SOURCE, Integer.valueOf(zzohVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (c2().insert("trigger_uris", null, contentValues) == -1) {
                kxw0.g(uuw0Var);
                uuw0Var.g.b(uuw0.q1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            kxw0.g(uuw0Var);
            uuw0Var.g.c(uuw0.q1(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long I1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = c2().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                uuw0 uuw0Var = ((kxw0) this.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long J1(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c2().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                uuw0 uuw0Var = ((kxw0) this.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String K1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c2().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                uuw0 uuw0Var = ((kxw0) this.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void L1(ContentValues contentValues) {
        kxw0 kxw0Var = (kxw0) this.b;
        try {
            SQLiteDatabase sQLiteDatabaseC2 = c2();
            String asString = contentValues.getAsString(HiAnalyticsConstant.BI_KEY_APP_ID);
            if (asString == null) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.i.b(uuw0.q1(HiAnalyticsConstant.BI_KEY_APP_ID), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseC2.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseC2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.c(uuw0.q1("consent_settings"), uuw0.q1(HiAnalyticsConstant.BI_KEY_APP_ID), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.g.d("Error storing into table. key", uuw0.q1("consent_settings"), uuw0.q1(HiAnalyticsConstant.BI_KEY_APP_ID), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final mmw0 M1(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str2);
        s0x.E(str3);
        m1();
        n1();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = c2().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = 0;
                        long j6 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j5 = cursorQuery.getLong(8);
                        }
                        mmw0 mmw0Var = new mmw0(str2, str3, j2, j3, j5, j4, j6, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(uuw0.q1(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return mmw0Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.d("Error querying events. appId", uuw0.q1(str2), kxw0Var.j.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void N1(String str, mmw0 mmw0Var) {
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.H(mmw0Var);
        m1();
        n1();
        ContentValues contentValues = new ContentValues();
        String str2 = mmw0Var.f22064a;
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str2);
        contentValues.put("name", mmw0Var.b);
        contentValues.put("lifetime_count", Long.valueOf(mmw0Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(mmw0Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(mmw0Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(mmw0Var.g));
        contentValues.put("last_bundled_day", mmw0Var.h);
        contentValues.put("last_sampled_complex_event_id", mmw0Var.i);
        contentValues.put("last_sampling_rate", mmw0Var.j);
        contentValues.put("current_session_count", Long.valueOf(mmw0Var.e));
        Boolean bool = mmw0Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (c2().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.g.b(uuw0.q1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(uuw0.q1(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void O1(String str, String str2) {
        s0x.E(str2);
        m1();
        n1();
        try {
            c2().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.c(uuw0.q1(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final p6x0 P1(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        q1x0 q1x0Var;
        kxw0 kxw0Var = (kxw0) this.b;
        if (TextUtils.isEmpty(str2)) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.n.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            exw0 exw0Var = (exw0) r6x0.X1(ixw0.y(), bArr);
            q1x0[] q1x0VarArrValues = q1x0.values();
            int length = q1x0VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    q1x0Var = q1x0.UNKNOWN;
                    break;
                }
                q1x0Var = q1x0VarArrValues[i4];
                if (q1x0Var.f27975a == i2) {
                    break;
                }
                i4++;
            }
            if (q1x0Var != q1x0.GOOGLE_SIGNAL && q1x0Var != q1x0.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((ixw0) exw0Var.b).r()).iterator();
                while (it.hasNext()) {
                    jxw0 jxw0Var = (jxw0) ((mxw0) it.next()).i();
                    jxw0Var.c();
                    ((mxw0) jxw0Var.b).V0(i3);
                    arrayList.add((mxw0) jxw0Var.e());
                }
                exw0Var.c();
                ((ixw0) exw0Var.b).D();
                exw0Var.c();
                ((ixw0) exw0Var.b).C(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split(Separators.NEWLINE)) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new p6x0(j2, (ixw0) exw0Var.e(), str2, map, q1x0Var, j3, j4, j5, i3);
        } catch (IOException e) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.g.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String Q1() {
        ((kxw0) this.b).k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l2 = (Long) btw0.S.a(null);
        l2.getClass();
        StringBuilder sb = new StringBuilder("(upload_type = 1 AND ABS(creation_timestamp - ");
        sb.append(jCurrentTimeMillis);
        sb.append(") > ");
        String strR = ohs0.r(sb, l2, Separators.RPAREN);
        String strK = brm0.k(((Long) btw0.R.a(null)).longValue(), Separators.RPAREN, kng0.q(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb2 = new StringBuilder(hne.D(strR.length(), 5, strK.length(), 1));
        f140.v(sb2, Separators.LPAREN, strR, " OR ", strK);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    public final void S1(String str, xyw0 xyw0Var) {
        s0x.H(str);
        s0x.H(xyw0Var);
        m1();
        n1();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("consent_state", xyw0Var.g());
        contentValues.put("consent_source", Integer.valueOf(xyw0Var.b));
        L1(contentValues);
    }

    public final List T1(String str) {
        List list;
        String string;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseC2 = c2();
            sQLiteDatabaseC2.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseC2.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                s0x.H(string);
                            }
                            if (string2 == null) {
                                uuw0 uuw0Var = kxw0Var.f;
                                kxw0.g(uuw0Var);
                                uuw0Var.g.b(uuw0.q1(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j2 = cursorQuery.getLong(2);
                                asw0 asw0VarR = csw0.r();
                                asw0VarR.c();
                                ((csw0) asw0VarR.b).s(string2);
                                asw0VarR.c();
                                ((csw0) asw0VarR.b).v(j2);
                                asw0VarR.c();
                                ((csw0) asw0VarR.b).u(string);
                                if (zIsEmpty) {
                                    asw0VarR.c();
                                    ((csw0) asw0VarR.b).t();
                                }
                                arrayList.add((csw0) asw0VarR.e());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseC2.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseC2.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseC2.setTransactionSuccessful();
                        list = arrayList;
                    }
                } catch (SQLiteException e) {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.c(uuw0.q1(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseC2.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseC2.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.g.c(uuw0.q1(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void U1(String str, xyw0 xyw0Var) {
        s0x.H(str);
        m1();
        n1();
        S1(str, G1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("storage_consent_at_bundling", xyw0Var.g());
        L1(contentValues);
    }

    public final xyw0 V1(String str) {
        s0x.H(str);
        m1();
        n1();
        return xyw0.c(100, K1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final mmw0 W1(String str, sww0 sww0Var, String str2) {
        mmw0 mmw0VarM1 = M1("events", str, sww0Var.w());
        if (mmw0VarM1 != null) {
            long j2 = mmw0VarM1.e + 1;
            long j3 = mmw0VarM1.d + 1;
            return new mmw0(mmw0VarM1.f22064a, mmw0VarM1.b, mmw0VarM1.c + 1, j3, j2, mmw0VarM1.f, mmw0VarM1.g, mmw0VarM1.h, mmw0VarM1.i, mmw0VarM1.j, mmw0VarM1.k);
        }
        kxw0 kxw0Var = (kxw0) this.b;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.j.c(uuw0.q1(str), kxw0Var.j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new mmw0(str, sww0Var.w(), 1L, 1L, 1L, sww0Var.y(), 0L, null, null, null, null);
    }

    public final boolean X1() {
        return ((kxw0) this.b).f19080a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void Y1(String str, long j2, long j3, g6x0 g6x0Var) {
        ?? IsEmpty;
        ?? string;
        String[] strArr;
        String str2;
        String string2;
        ?? r3;
        long jJ1;
        long j4;
        String[] strArr2;
        String str3;
        long j5;
        qww0 qww0Var;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC2 = c2();
                IsEmpty = TextUtils.isEmpty(str);
                if (IsEmpty != 0) {
                    String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                    str2 = j3 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str2.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str2);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseC2.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseC2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        mxw0 mxw0Var = (mxw0) ((jxw0) r6x0.X1(mxw0.W(), cursorRawQuery.getBlob(0))).e();
                                        if (cursorRawQuery.moveToNext()) {
                                            uuw0 uuw0Var = kxw0Var.f;
                                            kxw0.g(uuw0Var);
                                            uuw0Var.j.b(uuw0.q1(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        g6x0Var.f10788a = mxw0Var;
                                        jJ1 = J1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j3 == -1) {
                                            if (jJ1 != -1) {
                                                j4 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseC2.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j5 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j6 = cursorRawQuery.getLong(4);
                                                    try {
                                                        qww0Var = (qww0) r6x0.X1(sww0.H(), blob);
                                                        qww0Var.r(cursorRawQuery.getString(1));
                                                        long j7 = cursorRawQuery.getLong(2);
                                                        qww0Var.c();
                                                        ((sww0) qww0Var.b).O(j7);
                                                        qww0Var.c();
                                                        ((sww0) qww0Var.b).r(j6);
                                                        if (!g6x0Var.a(j5, (sww0) qww0Var.e())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        uuw0 uuw0Var2 = kxw0Var.f;
                                                        kxw0.g(uuw0Var2);
                                                        uuw0Var2.g.c(uuw0.q1(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                uuw0 uuw0Var3 = kxw0Var.f;
                                                kxw0.g(uuw0Var3);
                                                uuw0Var3.j.b(uuw0.q1(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j4 = j3;
                                        }
                                        if (j4 == -1 && jJ1 != -1) {
                                            jJ1 = Math.min(j4, jJ1);
                                        } else if (j4 != -1) {
                                            jJ1 = j4;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jJ1)};
                                        cursorRawQuery = sQLiteDatabaseC2.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j5 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j8 = cursorRawQuery.getLong(4);
                                                qww0Var = (qww0) r6x0.X1(sww0.H(), blob2);
                                                qww0Var.r(cursorRawQuery.getString(1));
                                                long j9 = cursorRawQuery.getLong(2);
                                                qww0Var.c();
                                                ((sww0) qww0Var.b).O(j9);
                                                qww0Var.c();
                                                ((sww0) qww0Var.b).r(j8);
                                                if (!g6x0Var.a(j5, (sww0) qww0Var.e())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            uuw0 uuw0Var4 = kxw0Var.f;
                                            kxw0.g(uuw0Var4);
                                            uuw0Var4.j.b(uuw0.q1(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        uuw0 uuw0Var5 = kxw0Var.f;
                                        kxw0.g(uuw0Var5);
                                        uuw0Var5.g.c(uuw0.q1(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    uuw0 uuw0Var6 = kxw0Var.f;
                                    kxw0.g(uuw0Var6);
                                    uuw0Var6.g.b(uuw0.q1(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                uuw0 uuw0Var7 = kxw0Var.f;
                                kxw0.g(uuw0Var7);
                                uuw0Var7.g.c(uuw0.q1(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j3 != -1) {
                            String str4 = str;
                            strArr = new String[]{str4, String.valueOf(j3)};
                            IsEmpty = str4;
                        } else {
                            String str5 = str;
                            strArr = new String[]{str5};
                            IsEmpty = str5;
                        }
                        str2 = j3 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseC2.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseC2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                uuw0 uuw0Var8 = kxw0Var.f;
                                kxw0.g(uuw0Var8);
                                uuw0Var8.g.b(uuw0.q1(r3), "Raw event metadata record is missing. appId");
                            } else {
                                mxw0 mxw0Var2 = (mxw0) ((jxw0) r6x0.X1(mxw0.W(), cursorRawQuery.getBlob(0))).e();
                                if (cursorRawQuery.moveToNext()) {
                                    uuw0 uuw0Var9 = kxw0Var.f;
                                    kxw0.g(uuw0Var9);
                                    uuw0Var9.j.b(uuw0.q1(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                g6x0Var.f10788a = mxw0Var2;
                                jJ1 = J1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j3 == -1) {
                                    if (jJ1 != -1) {
                                        j4 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseC2.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j5 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j10 = cursorRawQuery.getLong(4);
                                            qww0Var = (qww0) r6x0.X1(sww0.H(), blob3);
                                            qww0Var.r(cursorRawQuery.getString(1));
                                            long j11 = cursorRawQuery.getLong(2);
                                            qww0Var.c();
                                            ((sww0) qww0Var.b).O(j11);
                                            qww0Var.c();
                                            ((sww0) qww0Var.b).r(j10);
                                            if (!g6x0Var.a(j5, (sww0) qww0Var.e())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        uuw0 uuw0Var10 = kxw0Var.f;
                                        kxw0.g(uuw0Var10);
                                        uuw0Var10.j.b(uuw0.q1(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j4 = j3;
                                }
                                if (j4 == -1) {
                                    if (j4 != -1) {
                                        jJ1 = j4;
                                    }
                                } else if (j4 != -1) {
                                    jJ1 = j4;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jJ1)};
                                cursorRawQuery = sQLiteDatabaseC2.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j5 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j12 = cursorRawQuery.getLong(4);
                                        qww0Var = (qww0) r6x0.X1(sww0.H(), blob4);
                                        qww0Var.r(cursorRawQuery.getString(1));
                                        long j13 = cursorRawQuery.getLong(2);
                                        qww0Var.c();
                                        ((sww0) qww0Var.b).O(j13);
                                        qww0Var.c();
                                        ((sww0) qww0Var.b).r(j12);
                                        if (!g6x0Var.a(j5, (sww0) qww0Var.e())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    uuw0 uuw0Var11 = kxw0Var.f;
                                    kxw0.g(uuw0Var11);
                                    uuw0Var11.j.b(uuw0.q1(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        uuw0 uuw0Var12 = kxw0Var.f;
                        kxw0.g(uuw0Var12);
                        uuw0Var12.g.c(uuw0.q1(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    public final void a2() {
        n1();
        c2().beginTransaction();
    }

    public final void b2() {
        n1();
        c2().endTransaction();
    }

    public final SQLiteDatabase c2() {
        m1();
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error opening database");
            throw e;
        }
    }

    public final void d2(String str) {
        mmw0 mmw0VarM1;
        O1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c2().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (mmw0VarM1 = M1("events", str, string)) != null) {
                            N1("events_snapshot", mmw0VarM1);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                uuw0 uuw0Var = ((kxw0) this.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.g.c(uuw0.q1(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void e2(String str) throws Throwable {
        boolean z;
        mmw0 mmw0VarM1;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        mmw0 mmw0VarM2 = M1("events", str, "_f");
        mmw0 mmw0VarM3 = M1("events", str, "_v");
        O1("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = c2().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (mmw0VarM1 = M1("events_snapshot", str, string)) != null) {
                            N1("events", mmw0VarM1);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            uuw0 uuw0Var = ((kxw0) this.b).f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.c(uuw0.q1(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && mmw0VarM2 != null) {
                                N1("events", mmw0VarM2);
                            } else if (!z && mmw0VarM3 != null) {
                                N1("events", mmw0VarM3);
                            }
                            O1("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                N1("events", mmw0VarM3);
                            }
                        } else if (!z) {
                            N1("events", mmw0VarM3);
                        }
                        O1("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && mmw0VarM2 != null) {
                    N1("events", mmw0VarM2);
                } else if (!z && mmw0VarM3 != null) {
                    N1("events", mmw0VarM3);
                }
            } else {
                cursorQuery.close();
                if (mmw0VarM2 != null) {
                    N1("events", mmw0VarM2);
                } else if (mmw0VarM3 != null) {
                    N1("events", mmw0VarM3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        O1("events_snapshot", str);
    }

    @Override // a.p4
    public final void f1() {
        n1();
        c2().setTransactionSuccessful();
    }

    public final void f2(String str, String str2) {
        s0x.E(str);
        s0x.E(str2);
        m1();
        n1();
        try {
            c2().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            kxw0 kxw0Var = (kxw0) this.b;
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.d("Error deleting user property. appId", uuw0.q1(str), kxw0Var.j.c(str2), e);
        }
    }

    public final boolean g2(v6x0 v6x0Var) {
        kxw0 kxw0Var = (kxw0) this.b;
        String str = v6x0Var.b;
        m1();
        n1();
        String str2 = v6x0Var.f36897a;
        String str3 = v6x0Var.c;
        if (h2(str2, str3) == null) {
            if (x6x0.m2(str3)) {
                if (I1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(kxw0Var.d.v1(str2, btw0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jI1 = I1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                bkw0 bkw0Var = kxw0Var.d;
                if (jI1 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(v6x0Var.d));
        Z1(contentValues, v6x0Var.e);
        try {
            if (c2().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(uuw0.q1(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(uuw0.q1(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final v6x0 h2(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        s0x.E(str2);
        m1();
        n1();
        Cursor cursor = null;
        try {
            cursorQuery = c2().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Object objZ1 = z1(cursorQuery, 1);
                        if (objZ1 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                v6x0 v6x0Var = new v6x0(str3, cursorQuery.getString(2), str4, j2, objZ1);
                                if (cursorQuery.moveToNext()) {
                                    uuw0 uuw0Var = kxw0Var.f;
                                    kxw0.g(uuw0Var);
                                    uuw0Var.g.b(uuw0.q1(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return v6x0Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.d("Error querying user property. appId", uuw0.q1(str3), kxw0Var.j.c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List i2(String str) {
        String str2;
        SQLiteException sQLiteException;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        m1();
        n1();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                bkw0 bkw0Var = kxw0Var.d;
                cursorQuery = c2().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objZ1 = z1(cursorQuery, 3);
                        if (objZ1 == null) {
                            try {
                                uuw0 uuw0Var = kxw0Var.f;
                                kxw0.g(uuw0Var);
                                uuw0Var.g.b(uuw0.q1(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                uuw0 uuw0Var2 = kxw0Var.f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.c(uuw0.q1(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new v6x0(str2, str3, string, j2, objZ1));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            uuw0 uuw0Var3 = kxw0Var.f;
                            kxw0.g(uuw0Var3);
                            uuw0Var3.g.c(uuw0.q1(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List j2(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        m1();
        n1();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append(Separators.STAR);
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            bkw0 bkw0Var = kxw0Var.d;
            uuw0 uuw0Var = kxw0Var.f;
            cursorQuery = c2().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    kxw0.g(uuw0Var);
                                    uuw0Var.g.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j2 = cursorQuery.getLong(1);
                                Object objZ1 = z1(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objZ1 == null) {
                                    try {
                                        kxw0.g(uuw0Var);
                                        uuw0Var.g.d("(2)Read invalid user property value, ignoring it", uuw0.q1(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            uuw0 uuw0Var2 = kxw0Var.f;
                                            kxw0.g(uuw0Var2);
                                            uuw0Var2.g.d("(2)Error querying user properties", uuw0.q1(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new v6x0(str, str5, string2, j2, objZ1));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    uuw0 uuw0Var3 = kxw0Var.f;
                                    kxw0.g(uuw0Var3);
                                    uuw0Var3.g.d("(2)Error querying user properties", uuw0.q1(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                uuw0 uuw0Var4 = kxw0Var.f;
                                kxw0.g(uuw0Var4);
                                uuw0Var4.g.d("(2)Error querying user properties", uuw0.q1(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean k2(zzah zzahVar) {
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        String str = zzahVar.f45541a;
        s0x.H(str);
        if (h2(str, zzahVar.c.b) == null) {
            long jI1 = I1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            bkw0 bkw0Var = kxw0Var.d;
            if (jI1 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("origin", zzahVar.b);
        contentValues.put("name", zzahVar.c.b);
        Object objM = zzahVar.c.m();
        s0x.H(objM);
        Z1(contentValues, objM);
        contentValues.put(SubscriptionStateHeader.ACTIVE, Boolean.valueOf(zzahVar.e));
        contentValues.put("trigger_event_name", zzahVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.h));
        zzbh zzbhVar = zzahVar.g;
        x6x0 x6x0Var = kxw0Var.i;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.e(x6x0Var);
        contentValues.put("timed_out_event", x6x0.V1(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.d));
        kxw0.e(x6x0Var);
        contentValues.put("triggered_event", x6x0.V1(zzahVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.j));
        contentValues.put("expired_event", x6x0.V1(zzahVar.k));
        try {
            if (c2().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            kxw0.g(uuw0Var);
            uuw0Var.g.b(uuw0.q1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            kxw0.g(uuw0Var);
            uuw0Var.g.c(uuw0.q1(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    public final zzah l2(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        s0x.E(str2);
        m1();
        n1();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = c2().query("conditional_properties", new String[]{"origin", "value", SubscriptionStateHeader.ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objZ1 = z1(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    r6x0 r6x0Var = this.c.g;
                    m6x0.T(r6x0Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                    zzbh zzbhVar = (zzbh) r6x0Var.P1(blob, creator);
                    long j3 = cursorQuery.getLong(6);
                    m6x0.T(r6x0Var);
                    zzbh zzbhVar2 = (zzbh) r6x0Var.P1(cursorQuery.getBlob(7), creator);
                    long j4 = cursorQuery.getLong(8);
                    long j5 = cursorQuery.getLong(9);
                    m6x0.T(r6x0Var);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(j4, objZ1, str3, str4), j3, z, string2, zzbhVar, j2, zzbhVar2, j5, (zzbh) r6x0Var.P1(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.c(uuw0.q1(str), kxw0Var.j.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.g(uuw0Var2);
        uuw0Var2.g.d("Error querying conditional property", uuw0.q1(str), kxw0Var.j.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void m2(String str, String str2) {
        s0x.E(str);
        s0x.E(str2);
        m1();
        n1();
        try {
            c2().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            kxw0 kxw0Var = (kxw0) this.b;
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.d("Error deleting conditional property", uuw0.q1(str), kxw0Var.j.c(str2), e);
        }
    }

    public final List n2(String str, String str2, String str3) {
        s0x.E(str);
        m1();
        n1();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Separators.STAR));
            sb.append(" and name glob ?");
        }
        return o2(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List o2(String str, String[] strArr) {
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC2 = c2();
                String[] strArr2 = {HiAnalyticsConstant.BI_KEY_APP_ID, "origin", "name", "value", SubscriptionStateHeader.ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                bkw0 bkw0Var = kxw0Var.d;
                cursorQuery = sQLiteDatabaseC2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objZ1 = z1(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j2 = cursorQuery.getLong(6);
                        r6x0 r6x0Var = this.c.g;
                        m6x0.T(r6x0Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) r6x0Var.P1(blob, creator);
                        long j3 = cursorQuery.getLong(8);
                        m6x0.T(r6x0Var);
                        zzbh zzbhVar2 = (zzbh) r6x0Var.P1(cursorQuery.getBlob(9), creator);
                        long j4 = cursorQuery.getLong(10);
                        long j5 = cursorQuery.getLong(11);
                        m6x0.T(r6x0Var);
                        arrayList.add(new zzah(string, string2, new zzpl(j4, objZ1, string3, string2), j3, z, string4, zzbhVar, j2, zzbhVar2, j5, (zzbh) r6x0Var.P1(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @Override // a.u5x0
    public final void p1() {
        kxw0 kxw0Var = (kxw0) this.b;
        if (kxw0Var.d.x1(null, btw0.e1)) {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new fju0((Object) this, (byte) 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    public final hvw0 p2(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        m1();
        n1();
        Cursor cursor = null;
        try {
            cursorQuery = c2().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        m6x0 m6x0Var = this.c;
                        hvw0 hvw0Var = new hvw0(m6x0Var.l, str);
                        kxw0 kxw0Var2 = hvw0Var.f13743a;
                        xyw0 xyw0VarA = m6x0Var.a(str);
                        wyw0 wyw0Var = wyw0.ANALYTICS_STORAGE;
                        if (xyw0VarA.i(wyw0Var)) {
                            hvw0Var.G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        hvw0Var.I(cursorQuery.getString(1));
                        if (m6x0Var.a(str).i(wyw0.AD_STORAGE)) {
                            hvw0Var.J(cursorQuery.getString(2));
                        }
                        hvw0Var.e(cursorQuery.getLong(3));
                        hvw0Var.M(cursorQuery.getLong(4));
                        hvw0Var.N(cursorQuery.getLong(5));
                        hvw0Var.P(cursorQuery.getString(6));
                        hvw0Var.S(cursorQuery.getString(7));
                        hvw0Var.T(cursorQuery.getLong(8));
                        hvw0Var.a(cursorQuery.getLong(9));
                        hvw0Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        hvw0Var.i(cursorQuery.getLong(11));
                        hvw0Var.j(cursorQuery.getLong(12));
                        hvw0Var.k(cursorQuery.getLong(13));
                        hvw0Var.l(cursorQuery.getLong(14));
                        hvw0Var.f(cursorQuery.getLong(15));
                        hvw0Var.g(cursorQuery.getLong(16));
                        hvw0Var.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        hvw0Var.L(cursorQuery.getString(18));
                        hvw0Var.n(cursorQuery.getLong(19));
                        hvw0Var.m(cursorQuery.getLong(20));
                        hvw0Var.w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        fxw0 fxw0Var = kxw0Var2.g;
                        kxw0.g(fxw0Var);
                        fxw0Var.m1();
                        hvw0Var.R |= hvw0Var.p != z2;
                        hvw0Var.p = z2;
                        hvw0Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            hvw0Var.y(Arrays.asList(cursorQuery.getString(26).split(Separators.COMMA, -1)));
                        }
                        if (m6x0Var.a(str).i(wyw0Var)) {
                            String string2 = cursorQuery.getString(28);
                            fxw0 fxw0Var2 = kxw0Var2.g;
                            kxw0.g(fxw0Var2);
                            fxw0Var2.m1();
                            hvw0Var.R |= !Objects.equals(hvw0Var.t, string2);
                            hvw0Var.t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        fxw0 fxw0Var3 = kxw0Var2.g;
                        kxw0.g(fxw0Var3);
                        fxw0Var3.m1();
                        hvw0Var.R |= hvw0Var.u != z3;
                        hvw0Var.u = z3;
                        hvw0Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        fxw0 fxw0Var4 = kxw0Var2.g;
                        kxw0.g(fxw0Var4);
                        fxw0Var4.m1();
                        hvw0Var.R |= hvw0Var.C != string3;
                        hvw0Var.C = string3;
                        hvw0Var.A(cursorQuery.getLong(30));
                        hvw0Var.B(cursorQuery.getLong(31));
                        miw0.a();
                        if (kxw0Var.d.x1(str, btw0.O0)) {
                            int i2 = cursorQuery.getInt(32);
                            fxw0 fxw0Var5 = kxw0Var2.g;
                            kxw0.g(fxw0Var5);
                            fxw0Var5.m1();
                            hvw0Var.R |= hvw0Var.x != i2;
                            hvw0Var.x = i2;
                            hvw0Var.C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        fxw0 fxw0Var6 = kxw0Var2.g;
                        kxw0.g(fxw0Var6);
                        fxw0Var6.m1();
                        hvw0Var.R |= hvw0Var.y != z4;
                        hvw0Var.y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        fxw0 fxw0Var7 = kxw0Var2.g;
                        kxw0.g(fxw0Var7);
                        fxw0Var7.m1();
                        hvw0Var.R |= !Objects.equals(hvw0Var.q, boolValueOf);
                        hvw0Var.q = boolValueOf;
                        hvw0Var.p(cursorQuery.getInt(37));
                        hvw0Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            s0x.H(string);
                        }
                        fxw0 fxw0Var8 = kxw0Var2.g;
                        kxw0.g(fxw0Var8);
                        fxw0Var8.m1();
                        hvw0Var.R |= hvw0Var.G != string;
                        hvw0Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            fxw0 fxw0Var9 = kxw0Var2.g;
                            kxw0.g(fxw0Var9);
                            fxw0Var9.m1();
                            hvw0Var.R |= !Objects.equals(hvw0Var.z, lValueOf);
                            hvw0Var.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            fxw0 fxw0Var10 = kxw0Var2.g;
                            kxw0.g(fxw0Var10);
                            fxw0Var10.m1();
                            hvw0Var.R |= !Objects.equals(hvw0Var.A, lValueOf2);
                            hvw0Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        fxw0 fxw0Var11 = kxw0Var2.g;
                        kxw0.g(fxw0Var11);
                        fxw0Var11.m1();
                        hvw0Var.R |= hvw0Var.H != blob;
                        hvw0Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i3 = cursorQuery.getInt(44);
                            fxw0 fxw0Var12 = kxw0Var2.g;
                            kxw0.g(fxw0Var12);
                            fxw0Var12.m1();
                            boolean z5 = hvw0Var.R;
                            if (hvw0Var.I == i3) {
                                z = false;
                            }
                            hvw0Var.R = z | z5;
                            hvw0Var.I = i3;
                        }
                        if (kxw0Var.d.x1(str, btw0.j1) && !cursorQuery.isNull(45)) {
                            hvw0Var.u(cursorQuery.getLong(45));
                        }
                        fxw0 fxw0Var13 = kxw0Var2.g;
                        kxw0.g(fxw0Var13);
                        fxw0Var13.m1();
                        hvw0Var.R = false;
                        if (cursorQuery.moveToNext()) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(uuw0.q1(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return hvw0Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.c(uuw0.q1(str), e, "Error querying app. appId");
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final long q1(String str, ixw0 ixw0Var, String str2, Map map, q1x0 q1x0Var, Long l2) {
        int iDelete;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        s0x.H(ixw0Var);
        s0x.E(str);
        m1();
        n1();
        if (X1()) {
            m6x0 m6x0Var = this.c;
            long jA = m6x0Var.i.g.a();
            lwf lwfVar = kxw0Var.k;
            uuw0 uuw0Var = kxw0Var.f;
            lwfVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) btw0.M.a(null)).longValue()) {
                m6x0Var.i.g.b(jElapsedRealtime);
                m1();
                n1();
                if (X1() && (iDelete = c2().delete("upload_queue", Q1(), new String[0])) > 0) {
                    kxw0.g(uuw0Var);
                    uuw0Var.o.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                s0x.E(str);
                m1();
                n1();
                try {
                    int iV1 = kxw0Var.d.v1(str, btw0.A);
                    if (iV1 > 0) {
                        c2().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iV1)});
                    }
                } catch (SQLiteException e) {
                    kxw0.g(uuw0Var);
                    uuw0Var.g.c(uuw0.q1(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = ixw0Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join(Separators.NEWLINE, arrayList));
        contentValues.put("upload_type", Integer.valueOf(q1x0Var.f27975a));
        lwf lwfVar2 = kxw0Var.k;
        uuw0 uuw0Var2 = kxw0Var.f;
        lwfVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = c2().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final void q2(hvw0 hvw0Var, boolean z) {
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0 kxw0Var2 = hvw0Var.f13743a;
        m1();
        n1();
        String strE = hvw0Var.E();
        s0x.H(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, strE);
        wyw0 wyw0Var = wyw0.ANALYTICS_STORAGE;
        m6x0 m6x0Var = this.c;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (m6x0Var.a(strE).i(wyw0Var)) {
            contentValues.put("app_instance_id", hvw0Var.F());
        }
        contentValues.put("gmp_app_id", hvw0Var.H());
        if (m6x0Var.a(strE).i(wyw0.AD_STORAGE)) {
            fxw0 fxw0Var = kxw0Var2.g;
            kxw0.g(fxw0Var);
            fxw0Var.m1();
            contentValues.put("resettable_device_id_hash", hvw0Var.e);
        }
        fxw0 fxw0Var2 = kxw0Var2.g;
        kxw0.g(fxw0Var2);
        fxw0Var2.m1();
        contentValues.put("last_bundle_index", Long.valueOf(hvw0Var.g));
        fxw0 fxw0Var3 = kxw0Var2.g;
        kxw0.g(fxw0Var3);
        fxw0Var3.m1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(hvw0Var.h));
        fxw0 fxw0Var4 = kxw0Var2.g;
        kxw0.g(fxw0Var4);
        fxw0Var4.m1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(hvw0Var.i));
        contentValues.put("app_version", hvw0Var.O());
        fxw0 fxw0Var5 = kxw0Var2.g;
        kxw0.g(fxw0Var5);
        fxw0Var5.m1();
        contentValues.put("app_store", hvw0Var.l);
        fxw0 fxw0Var6 = kxw0Var2.g;
        kxw0.g(fxw0Var6);
        fxw0Var6.m1();
        contentValues.put("gmp_version", Long.valueOf(hvw0Var.m));
        fxw0 fxw0Var7 = kxw0Var2.g;
        kxw0.g(fxw0Var7);
        fxw0Var7.m1();
        contentValues.put("dev_cert_hash", Long.valueOf(hvw0Var.n));
        fxw0 fxw0Var8 = kxw0Var2.g;
        kxw0.g(fxw0Var8);
        fxw0Var8.m1();
        contentValues.put("measurement_enabled", Boolean.valueOf(hvw0Var.o));
        fxw0 fxw0Var9 = kxw0Var2.g;
        fxw0 fxw0Var10 = kxw0Var2.g;
        kxw0.g(fxw0Var9);
        fxw0Var9.m1();
        contentValues.put("day", Long.valueOf(hvw0Var.K));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_public_events_count", Long.valueOf(hvw0Var.L));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_events_count", Long.valueOf(hvw0Var.M));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_conversions_count", Long.valueOf(hvw0Var.N));
        fxw0 fxw0Var11 = kxw0Var2.g;
        kxw0.g(fxw0Var11);
        fxw0Var11.m1();
        contentValues.put("config_fetched_time", Long.valueOf(hvw0Var.S));
        fxw0 fxw0Var12 = kxw0Var2.g;
        kxw0.g(fxw0Var12);
        fxw0Var12.m1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(hvw0Var.T));
        contentValues.put("app_version_int", Long.valueOf(hvw0Var.Q()));
        contentValues.put("firebase_instance_id", hvw0Var.K());
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_error_events_count", Long.valueOf(hvw0Var.O));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(hvw0Var.P));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("health_monitor_sample", hvw0Var.Q);
        contentValues.put("android_id", (Long) 0L);
        fxw0 fxw0Var13 = kxw0Var2.g;
        kxw0.g(fxw0Var13);
        fxw0Var13.m1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(hvw0Var.p));
        contentValues.put("dynamite_version", Long.valueOf(hvw0Var.b()));
        if (m6x0Var.a(strE).i(wyw0Var)) {
            fxw0 fxw0Var14 = kxw0Var2.g;
            kxw0.g(fxw0Var14);
            fxw0Var14.m1();
            contentValues.put("session_stitching_token", hvw0Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(hvw0Var.z()));
        fxw0 fxw0Var15 = kxw0Var2.g;
        kxw0.g(fxw0Var15);
        fxw0Var15.m1();
        contentValues.put("target_os_version", Long.valueOf(hvw0Var.v));
        fxw0 fxw0Var16 = kxw0Var2.g;
        kxw0.g(fxw0Var16);
        fxw0Var16.m1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(hvw0Var.w));
        miw0.a();
        bkw0 bkw0Var = kxw0Var.d;
        uuw0 uuw0Var = kxw0Var.f;
        if (bkw0Var.x1(strE, btw0.O0)) {
            fxw0 fxw0Var17 = kxw0Var2.g;
            kxw0.g(fxw0Var17);
            fxw0Var17.m1();
            contentValues.put("ad_services_version", Integer.valueOf(hvw0Var.x));
            fxw0 fxw0Var18 = kxw0Var2.g;
            kxw0.g(fxw0Var18);
            fxw0Var18.m1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(hvw0Var.B));
        }
        fxw0 fxw0Var19 = kxw0Var2.g;
        kxw0.g(fxw0Var19);
        fxw0Var19.m1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(hvw0Var.y));
        contentValues.put("npa_metadata_value", hvw0Var.x());
        fxw0 fxw0Var20 = kxw0Var2.g;
        kxw0.g(fxw0Var20);
        fxw0Var20.m1();
        contentValues.put("bundle_delivery_index", Long.valueOf(hvw0Var.F));
        contentValues.put("sgtm_preview_key", hvw0Var.D());
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("dma_consent_state", Integer.valueOf(hvw0Var.D));
        kxw0.g(fxw0Var10);
        fxw0Var10.m1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(hvw0Var.E));
        contentValues.put("serialized_npa_metadata", hvw0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(hvw0Var.t()));
        fxw0 fxw0Var21 = kxw0Var2.g;
        kxw0.g(fxw0Var21);
        fxw0Var21.m1();
        ArrayList arrayList = hvw0Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                kxw0.g(uuw0Var);
                uuw0Var.j.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Separators.COMMA, arrayList));
            }
        }
        if (bkw0Var.x1(null, btw0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        fxw0 fxw0Var22 = kxw0Var2.g;
        kxw0.g(fxw0Var22);
        fxw0Var22.m1();
        contentValues.put("unmatched_pfo", hvw0Var.z);
        fxw0 fxw0Var23 = kxw0Var2.g;
        kxw0.g(fxw0Var23);
        fxw0Var23.m1();
        contentValues.put("unmatched_uwa", hvw0Var.A);
        fxw0 fxw0Var24 = kxw0Var2.g;
        kxw0.g(fxw0Var24);
        fxw0Var24.m1();
        contentValues.put("ad_campaign_info", hvw0Var.H);
        if (bkw0Var.x1(strE, btw0.j1)) {
            fxw0 fxw0Var25 = kxw0Var2.g;
            kxw0.g(fxw0Var25);
            fxw0Var25.m1();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(hvw0Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseC2 = c2();
            if (sQLiteDatabaseC2.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseC2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                kxw0.g(uuw0Var);
                uuw0Var.g.b(uuw0.q1(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            kxw0.g(uuw0Var);
            uuw0Var.g.c(uuw0.q1(strE), e, "Error storing app. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List r1(String str, zzoo zzooVar, int i2) {
        ?? arrayList;
        s0x.E(str);
        m1();
        n1();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseC2 = c2();
            String[] strArr = {"rowId", HiAnalyticsConstant.BI_KEY_APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strR1 = R1(zzooVar.f45547a);
            String strQ1 = Q1();
            StringBuilder sb = new StringBuilder(strR1.length() + 17 + strQ1.length());
            sb.append("app_id=?");
            sb.append(strR1);
            sb.append(" AND NOT ");
            sb.append(strQ1);
            cursorQuery = sQLiteDatabaseC2.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                p6x0 p6x0VarP1 = P1(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (p6x0VarP1 != null) {
                    arrayList.add(p6x0VarP1);
                }
            }
        } catch (SQLiteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final rlw0 r2(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return s2(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final boolean s1(String str) {
        q1x0[] q1x0VarArr = {q1x0.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(q1x0VarArr[0].f27975a));
        String strR1 = R1(arrayList);
        String strQ1 = Q1();
        return I1(ua80.m(new StringBuilder((strR1.length() + 61) + strQ1.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strR1, " AND NOT ", strQ1), new String[]{str}) != 0;
    }

    public final rlw0 s2(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        m1();
        n1();
        String[] strArr = {str};
        rlw0 rlw0Var = new rlw0();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC2 = c2();
                cursorQuery = sQLiteDatabaseC2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        rlw0Var.b = cursorQuery.getLong(1);
                        rlw0Var.f30718a = cursorQuery.getLong(2);
                        rlw0Var.c = cursorQuery.getLong(3);
                        rlw0Var.d = cursorQuery.getLong(4);
                        rlw0Var.e = cursorQuery.getLong(5);
                        rlw0Var.f = cursorQuery.getLong(6);
                        rlw0Var.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        rlw0Var.b += j3;
                    }
                    if (z2) {
                        rlw0Var.f30718a += j3;
                    }
                    if (z3) {
                        rlw0Var.c += j3;
                    }
                    if (z4) {
                        rlw0Var.d += j3;
                    }
                    if (z5) {
                        rlw0Var.e += j3;
                    }
                    if (z6) {
                        rlw0Var.f += j3;
                    }
                    if (z7) {
                        rlw0Var.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(rlw0Var.f30718a));
                    contentValues.put("daily_events_count", Long.valueOf(rlw0Var.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(rlw0Var.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(rlw0Var.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(rlw0Var.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(rlw0Var.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(rlw0Var.g));
                    sQLiteDatabaseC2.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.j.b(uuw0.q1(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.c(uuw0.q1(str), e, "Error updating daily counts. appId");
            }
            return rlw0Var;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final void t1(Long l2) {
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        try {
            if (c2().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final ykv0 t2(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        m1();
        n1();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = c2().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(uuw0.q1(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            ykv0 ykv0Var = new ykv0(blob, string, string2);
                            cursorQuery.close();
                            return ykv0Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.c(uuw0.q1(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String u1() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseC2 = c2();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseC2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    uuw0 uuw0Var = ((kxw0) this.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.g.b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseC2;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final void u2(mxw0 mxw0Var, boolean z) {
        m1();
        n1();
        s0x.E(mxw0Var.r());
        if (!mxw0Var.e2()) {
            v4i0.e();
            return;
        }
        w1();
        kxw0 kxw0Var = (kxw0) this.b;
        lwf lwfVar = kxw0Var.k;
        uuw0 uuw0Var = kxw0Var.f;
        lwfVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jF2 = mxw0Var.f2();
        atw0 atw0Var = btw0.R;
        if (jF2 < jCurrentTimeMillis - ((Long) atw0Var.a(null)).longValue() || mxw0Var.f2() > ((Long) atw0Var.a(null)).longValue() + jCurrentTimeMillis) {
            kxw0.g(uuw0Var);
            uuw0Var.j.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", uuw0.q1(mxw0Var.r()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(mxw0Var.f2()));
        }
        byte[] bArrA = mxw0Var.a();
        try {
            r6x0 r6x0Var = this.c.g;
            m6x0.T(r6x0Var);
            byte[] bArrW1 = r6x0Var.W1(bArrA);
            kxw0.g(uuw0Var);
            uuw0Var.o.b(Integer.valueOf(bArrW1.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, mxw0Var.r());
            contentValues.put("bundle_end_timestamp", Long.valueOf(mxw0Var.f2()));
            contentValues.put(RemoteMessageConst.DATA, bArrW1);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (mxw0Var.r0()) {
                contentValues.put("retry_count", Integer.valueOf(mxw0Var.s0()));
            }
            try {
                if (c2().insert("queue", null, contentValues) == -1) {
                    kxw0.g(uuw0Var);
                    uuw0Var.g.b(uuw0.q1(mxw0Var.r()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                kxw0.g(uuw0Var);
                uuw0Var.g.c(uuw0.q1(mxw0Var.r()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            kxw0.g(uuw0Var);
            uuw0Var.g.c(uuw0.q1(mxw0Var.r()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void v1(long j2) {
        m1();
        n1();
        try {
            if (c2().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void w1() {
        m1();
        n1();
        if (X1()) {
            m6x0 m6x0Var = this.c;
            long jA = m6x0Var.i.f.a();
            kxw0 kxw0Var = (kxw0) this.b;
            kxw0Var.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) btw0.M.a(null)).longValue()) {
                m6x0Var.i.f.b(jElapsedRealtime);
                m1();
                n1();
                if (X1()) {
                    SQLiteDatabase sQLiteDatabaseC2 = c2();
                    kxw0Var.k.getClass();
                    int iDelete = sQLiteDatabaseC2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) btw0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.o.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void x1(ArrayList arrayList) {
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        s0x.H(arrayList);
        if (arrayList.size() == 0) {
            jf4.o("Given Integer is zero");
            return;
        }
        if (X1()) {
            String strJoin = TextUtils.join(Separators.COMMA, arrayList);
            String strO = rw2.o(new StringBuilder(String.valueOf(strJoin).length() + 2), Separators.LPAREN, strJoin, Separators.RPAREN);
            if (I1(rw2.o(new StringBuilder(strO.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strO, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseC2 = c2();
                StringBuilder sb = new StringBuilder(strO.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strO);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseC2.execSQL(sb.toString());
            } catch (SQLiteException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void y1(Long l2) {
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        if (X1()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (I1(sb.toString(), null) > 0) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseC2 = c2();
                kxw0Var.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l2.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l2);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseC2.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object z1(Cursor cursor, int i2) {
        kxw0 kxw0Var = (kxw0) this.b;
        int type = cursor.getType(i2);
        if (type == 0) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        uuw0 uuw0Var3 = kxw0Var.f;
        kxw0.g(uuw0Var3);
        uuw0Var3.g.a("Loaded invalid blob type value, ignoring it");
        return null;
    }
}
