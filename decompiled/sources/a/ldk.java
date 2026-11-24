package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class ldk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19854a;
    public final ndk b;

    public /* synthetic */ ldk(ndk ndkVar, byte b) {
        this.f19854a = b;
        this.b = ndkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19854a;
        ndk ndkVar = this.b;
        switch (b) {
            case 0:
                return new mdk(ndkVar);
            default:
                return ndkVar.A();
        }
    }
}
