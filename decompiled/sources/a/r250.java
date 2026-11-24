package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r250 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29714a;
    public final /* synthetic */ u250 b;

    public /* synthetic */ r250(u250 u250Var, byte b) {
        this.f29714a = b;
        this.b = u250Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        byte b = this.f29714a;
        u250 u250Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = u250.V1;
                str.getClass();
                u250Var.G0().x(y050.f41790a);
                break;
            default:
                wsz wszVar2 = u250.V1;
                str.getClass();
                u250Var.G0().x(q050.f27880a);
                break;
        }
    }
}
