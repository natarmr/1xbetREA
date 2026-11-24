package a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class vmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ulw0 f37690a;
    public static final vmw0 b;

    static {
        Object[] objArr = {"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "statusMessage", "timestamp"};
        ejw0 ejw0Var = hhw0.e;
        for (int i = 0; i < 8; i++) {
            if (objArr[i] == null) {
                hny.u(twn.m(i, "at index "));
                return;
            }
        }
        f37690a = new ulw0(8, objArr);
        b = new vmw0();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, status.f45486a);
        editorEdit.putString("statusMessage", status.b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        ulw0 ulw0Var = f37690a;
        int i = ulw0Var.g;
        int i2 = 0;
        while (i2 < i) {
            Object obj = ulw0Var.get(i2);
            i2++;
            editorEdit.remove((String) obj);
        }
        editorEdit.commit();
    }
}
