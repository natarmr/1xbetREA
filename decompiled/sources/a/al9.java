package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class al9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1057a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ al9(byte b, long j, long j2) {
        this.f1057a = b;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1057a;
        long j = this.c;
        long j2 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(j2 <= j);
            case 1:
                return Boolean.valueOf(j2 <= j);
            default:
                uen uenVar = wen.b;
                long jW0 = ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS);
                bfn bfnVar = bfn.SECONDS;
                return androidx.compose.runtime.e.c(wen.l(jW0, bfnVar) - (j2 / wen.l(j, bfnVar)));
        }
    }
}
