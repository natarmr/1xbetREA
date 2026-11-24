package a;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class dtw0 extends kbw0 {
    public final /* synthetic */ hz5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtw0(hz5 hz5Var, int i, Bundle bundle) {
        super(hz5Var, i, bundle);
        this.g = hz5Var;
    }

    @Override // a.kbw0
    public final boolean a() {
        this.g.j.a(ConnectionResult.f);
        return true;
    }

    @Override // a.kbw0
    public final void b(ConnectionResult connectionResult) {
        this.g.j.a(connectionResult);
        System.currentTimeMillis();
    }
}
