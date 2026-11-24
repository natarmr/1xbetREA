package a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.security.Provider;
import java.security.Signature;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class sxs0 implements vdo, lix0, Continuation, xmw0 {
    public static final /* synthetic */ sxs0 b = new sxs0((byte) 21);
    public static final /* synthetic */ sxs0 c = new sxs0((byte) 23);
    public static final /* synthetic */ sxs0 d = new sxs0((byte) 25);
    public static final /* synthetic */ sxs0 e = new sxs0((byte) 26);
    public static final /* synthetic */ sxs0 f = new sxs0((byte) 27);
    public static final /* synthetic */ sxs0 g = new sxs0((byte) 28);
    public static final /* synthetic */ sxs0 h = new sxs0((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32995a;

    public sxs0(Context context, hny hnyVar) {
        this.f32995a = (byte) 19;
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new g5g(this, (byte) 3));
    }

    public static upt0 a(fot0 fot0Var) {
        fot0Var.getClass();
        if (fot0Var instanceof oub0) {
            return upt0.c;
        }
        if (fot0Var instanceof mzw) {
            return upt0.d;
        }
        if (fot0Var instanceof jyw) {
            return upt0.e;
        }
        if (qsm0.v(fot0Var)) {
            return upt0.f;
        }
        return fot0Var instanceof qrm0 ? upt0.g : upt0.h;
    }

    public static void c(androidx.fragment.app.e eVar, boolean z, long j, long j2, String str) {
        eVar.getClass();
        ywu0 ywu0Var = new ywu0();
        iiy[] iiyVarArr = ywu0.t2;
        ywu0Var.n2.v(ywu0Var, iiyVarArr[0], z);
        ywu0Var.o2.j(ywu0Var, iiyVarArr[1], j);
        ywu0Var.p2.j(ywu0Var, iiyVarArr[2], j2);
        ywu0Var.q2.x(ywu0Var, iiyVarArr[3], str);
        ywu0Var.H0(eVar, ywu0.class.getSimpleName());
    }

    public static void d(androidx.fragment.app.e eVar, yx5 yx5Var, Function1 function1) {
        eVar.getClass();
        eVar.u0("WildFreeBetFeature.FRAGMENT_RESULT_KEY", yx5Var, new sa4(function1, (byte) 9));
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) throws IOException {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        csj.c("SERVICE_NOT_AVAILABLE", task.getException());
        return null;
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f32995a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new Boolean(((Boolean) khw0.b.get()).booleanValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_public_events_per_day", 72, 50000L).get()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(44, "measurement.sgtm.service_upload_apps_list", "").get();
            default:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.batch.retry_interval", 41, 1800000L).get();
        }
    }

    public sxs0(r9u r9uVar) {
        this.f32995a = (byte) 12;
        r9uVar.getClass();
    }

    public /* synthetic */ sxs0(byte b2) {
        this.f32995a = b2;
    }
}
