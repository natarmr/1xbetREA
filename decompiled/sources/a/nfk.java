package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class nfk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23441a;
    public final ofk b;
    public final pfk c;

    public /* synthetic */ nfk(ofk ofkVar, pfk pfkVar, byte b) {
        this.f23441a = b;
        this.b = ofkVar;
        this.c = pfkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23441a;
        pfk pfkVar = this.c;
        ofk ofkVar = this.b;
        switch (b) {
            case 0:
                return eui0.g(ofkVar.f25174a.keySet(), pfkVar.o());
            default:
                return eui0.g(ofkVar.b.keySet(), pfkVar.p());
        }
    }
}
