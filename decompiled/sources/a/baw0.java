package a;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class baw0 extends eaw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2279a;
    public final /* synthetic */ alz b;

    public baw0(Intent intent, alz alzVar) {
        this.f2279a = intent;
        this.b = alzVar;
    }

    @Override // a.eaw0
    public final void a() {
        Intent intent = this.f2279a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
