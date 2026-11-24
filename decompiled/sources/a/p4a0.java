package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class p4a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26344a;
    public final /* synthetic */ szy b;

    public /* synthetic */ p4a0(szy szyVar, byte b) {
        this.f26344a = b;
        this.b = szyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26344a;
        szy szyVar = this.b;
        switch (b) {
            case 0:
                return szyVar.g;
            default:
                return szyVar.f;
        }
    }
}
