package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class whh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39167a;
    public final /* synthetic */ long b;

    public /* synthetic */ whh(byte b, long j) {
        this.f39167a = b;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39167a) {
            case 0:
                uen uenVar = wen.b;
                return androidx.compose.runtime.e.c(wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS) + this.b);
            default:
                return new jnv0(this.b, iun.f15405a, true, false, false);
        }
    }
}
