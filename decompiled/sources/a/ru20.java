package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ru20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31104a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ru20(xdr xdrVar, long j, String str, boolean z, byte b) {
        this.f31104a = b;
        this.b = xdrVar;
        this.c = j;
        this.d = str;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31104a) {
            case 0:
                fxb.D(ivb0.b, new ru20(this.b, this.c, this.d, this.e, (byte) 1)).a();
                break;
            default:
                this.b.F(Long.valueOf(this.c), this.d, Boolean.valueOf(this.e));
                break;
        }
        return Unit.f46060a;
    }
}
