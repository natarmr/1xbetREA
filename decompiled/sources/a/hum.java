package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hum implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13688a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k6z d;

    public /* synthetic */ hum(String str, int i, k6z k6zVar, int i2, byte b) {
        this.f13688a = b;
        this.b = str;
        this.c = i;
        this.d = k6zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13688a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                f7k.q(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                dub.H(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
