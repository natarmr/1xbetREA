package a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tpg0 implements upg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34331a;
    public final /* synthetic */ q55 b;

    public /* synthetic */ tpg0(long j, q55 q55Var) {
        this.f34331a = j;
        this.b = q55Var;
    }

    @Override // a.upg0
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f34331a));
        q55 q55Var = this.b;
        String str = q55Var.f28133a;
        mwb0 mwb0Var = q55Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(pwb0.a(mwb0Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(pwb0.a(mwb0Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
