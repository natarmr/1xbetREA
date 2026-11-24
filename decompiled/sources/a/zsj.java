package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zsj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44908a;
    public final /* synthetic */ btj b;

    public /* synthetic */ zsj(btj btjVar, byte b) {
        this.f44908a = b;
        this.b = btjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44908a;
        btj btjVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                btjVar.g.b(th, new yfg(btjVar, (byte) 18));
                break;
            default:
                th.getClass();
                btjVar.g.b(th, new zuh((byte) 19));
                break;
        }
        return Unit.f46060a;
    }
}
