package a;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class ur00 implements w6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f36142a;

    public ur00(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f36142a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // a.w6j0
    public final Boolean a() {
        Bundle bundle = this.f36142a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // a.w6j0
    public final wen b() {
        Bundle bundle = this.f36142a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new wen(ibc.v0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), bfn.SECONDS));
        }
        return null;
    }

    @Override // a.w6j0
    public final Double c() {
        Bundle bundle = this.f36142a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // a.w6j0
    public final Object d(yje yjeVar) {
        return Unit.f46060a;
    }
}
