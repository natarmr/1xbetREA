package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ccz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4134a;
    public final /* synthetic */ dcz b;

    public /* synthetic */ ccz(dcz dczVar, byte b) {
        this.f4134a = b;
        this.b = dczVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4134a;
        dcz dczVar = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(dczVar.p.f());
            case 1:
                return Float.valueOf(dczVar.p.b());
            default:
                return Float.valueOf(dczVar.p.e() - dczVar.p.a());
        }
    }
}
