package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class tbn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33672a;
    public final /* synthetic */ vbn b;
    public final /* synthetic */ wbn c;

    public /* synthetic */ tbn(vbn vbnVar, wbn wbnVar, byte b) {
        this.f33672a = b;
        this.b = vbnVar;
        this.c = wbnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33672a;
        wbn wbnVar = this.c;
        vbn vbnVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = vbn.n2;
                ((k3t0) vbnVar.m2.getValue()).x(new pbn(wbnVar.f38887a));
                break;
            default:
                nek nekVar2 = vbn.n2;
                ((k3t0) vbnVar.m2.getValue()).x(new pbn(wbnVar.f38887a));
                break;
        }
        return Unit.f46060a;
    }
}
