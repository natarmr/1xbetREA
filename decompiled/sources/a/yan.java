package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yan implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42308a;
    public final /* synthetic */ xg b;
    public final /* synthetic */ wim c;

    public /* synthetic */ yan(xg xgVar, wim wimVar, byte b) {
        this.f42308a = b;
        this.b = xgVar;
        this.c = wimVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        byte b = this.f42308a;
        wim wimVar = this.c;
        xg xgVar = this.b;
        switch (b) {
            case 0:
                dyb.Q(new yan(xgVar, wimVar, (byte) 1));
                return Unit.f46060a;
            default:
                xgVar.invoke(wimVar);
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
