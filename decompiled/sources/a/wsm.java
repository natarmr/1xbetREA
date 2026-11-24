package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wsm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39699a;
    public final /* synthetic */ w1n b;

    public /* synthetic */ wsm(w1n w1nVar, byte b) {
        this.f39699a = b;
        this.b = w1nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39699a;
        w1n w1nVar = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.b);
            case 1:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.c);
            case 2:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.b);
            case 3:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.c);
            case 4:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.b);
            default:
                return new u6n(d4d.SECONDARY60, w6n.j, w1nVar.c);
        }
    }
}
