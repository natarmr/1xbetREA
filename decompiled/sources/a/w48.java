package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w48 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38532a;
    public final /* synthetic */ kwj b;

    public /* synthetic */ w48(kwj kwjVar, byte b) {
        this.f38532a = b;
        this.b = kwjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38532a;
        kwj kwjVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(kwjVar.k.a());
            case 1:
                return Boolean.valueOf(kwjVar.k.a());
            case 2:
                return Integer.valueOf(kwjVar.k());
            case 3:
                return Integer.valueOf(kwjVar.k());
            case 4:
                return Float.valueOf(kwjVar.l() + kwjVar.k());
            default:
                return Integer.valueOf(kwjVar.k());
        }
    }
}
