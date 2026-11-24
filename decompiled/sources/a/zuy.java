package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zuy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45030a;
    public final /* synthetic */ fvy b;

    public /* synthetic */ zuy(fvy fvyVar, byte b) {
        this.f45030a = b;
        this.b = fvyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45030a;
        fvy fvyVar = this.b;
        switch (b) {
            case 0:
                return fvyVar;
            default:
                return new r0x(fvyVar.f);
        }
    }
}
