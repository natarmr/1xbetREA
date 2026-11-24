package a;

import androidx.activity.result.ActivityResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rg3 implements wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30413a;

    public /* synthetic */ rg3(byte b) {
        this.f30413a = b;
    }

    @Override // a.wn
    public final void a(Object obj) {
        switch (this.f30413a) {
            case 0:
                hfk0 hfk0Var = vg3.R1;
                int i = ((ActivityResult) obj).f45280a;
                break;
            case 1:
                hfk0 hfk0Var2 = qp4.R1;
                break;
            default:
                xuz xuzVar = co00.R1;
                int i2 = ((ActivityResult) obj).f45280a;
                break;
        }
    }
}
