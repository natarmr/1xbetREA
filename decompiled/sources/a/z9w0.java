package a;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class z9w0 extends eaw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f44042a;
    public final /* synthetic */ GoogleApiActivity b;

    public z9w0(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f44042a = intent;
        this.b = googleApiActivity;
    }

    @Override // a.eaw0
    public final void a() {
        Intent intent = this.f44042a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
