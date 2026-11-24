package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qiz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28812a;
    public final /* synthetic */ siz b;

    public /* synthetic */ qiz(siz sizVar, byte b) {
        this.f28812a = b;
        this.b = sizVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28812a;
        siz sizVar = this.b;
        switch (b) {
            case 0:
                sizVar.h = "";
                break;
            case 1:
                sizVar.i = "";
                break;
            case 2:
                sizVar.g = "";
                break;
            default:
                sizVar.f = "";
                break;
        }
        return Unit.f46060a;
    }
}
