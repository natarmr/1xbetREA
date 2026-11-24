package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g2u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10578a;
    public final /* synthetic */ long b;

    public g2u(long j, long j2) {
        this.f10578a = j;
        this.b = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uag uagVar = (uag) obj;
        uagVar.getClass();
        return Boolean.valueOf(fre0.Z(this.f10578a, this.b, uagVar.k, uagVar.l));
    }
}
