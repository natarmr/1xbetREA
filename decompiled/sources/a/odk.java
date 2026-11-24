package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class odk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25079a;
    public final qdk b;

    public /* synthetic */ odk(qdk qdkVar, byte b) {
        this.f25079a = b;
        this.b = qdkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25079a;
        qdk qdkVar = this.b;
        switch (b) {
            case 0:
                return new pdk(qdkVar);
            default:
                return qdkVar.A();
        }
    }
}
