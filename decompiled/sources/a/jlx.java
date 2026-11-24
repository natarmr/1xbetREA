package a;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jlx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f16738a;
    public final fnq b;

    public jlx() {
        p7m0 p7m0VarA = q7m0.a(elx.f8023a);
        this.f16738a = p7m0VarA;
        this.b = new fnq(new h2c(p7m0VarA, (byte) 14), new gkr(this, null, (byte) 29), (byte) 4);
    }

    public final void a(Intent intent) {
        blx.d(intent);
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
            intent.removeExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        }
        Bundle extras2 = intent.getExtras();
        boolean z = (extras2 == null || extras2.isEmpty()) ? false : true;
        boolean z2 = intent.getBooleanExtra("INTENT_ALREADY_PROCESSED", false);
        if ((Intrinsics.d(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.DEFAULT")) || z2) {
            return;
        }
        if (Intrinsics.d(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER") && !z) {
            return;
        }
        intent.putExtra("INTENT_ALREADY_PROCESSED", true);
        flx flxVar = new flx(intent);
        p7m0 p7m0Var = this.f16738a;
        p7m0Var.getClass();
        p7m0Var.o(null, flxVar);
    }
}
