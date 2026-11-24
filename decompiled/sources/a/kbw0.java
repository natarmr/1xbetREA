package a;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kbw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f18035a;
    public boolean b;
    public final /* synthetic */ hz5 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ hz5 f;

    public kbw0(hz5 hz5Var, int i, Bundle bundle) {
        this.f = hz5Var;
        Boolean bool = Boolean.TRUE;
        this.c = hz5Var;
        this.f18035a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);
}
