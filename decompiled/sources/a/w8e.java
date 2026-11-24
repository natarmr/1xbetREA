package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w8e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38718a;
    public final /* synthetic */ fae b;

    public /* synthetic */ w8e(fae faeVar, byte b) {
        this.f38718a = b;
        this.b = faeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38718a;
        fae faeVar = this.b;
        switch (b) {
            case 0:
                faeVar.A.f(e9e.f7417a);
                return Unit.f46060a;
            case 1:
                faeVar.K.f(new g9e(false));
                return Unit.f46060a;
            default:
                return sa10.b(faeVar.l, pb10.g, R.string.error_get_data, 0, null, 28);
        }
    }
}
