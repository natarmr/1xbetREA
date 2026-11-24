package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class g9y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10939a;
    public final ihy b;

    public /* synthetic */ g9y(ihy ihyVar, byte b) {
        this.f10939a = b;
        this.b = ihyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10939a;
        ihy ihyVar = this.b;
        switch (b) {
            case 0:
                ihyVar.getClass();
                return n2x.v((xgy) ihyVar);
            case 1:
                return xm40.a(ihyVar.j());
            default:
                ihyVar.getClass();
                return n2x.v((xgy) ihyVar);
        }
    }
}
