package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d2c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5349a;
    public final /* synthetic */ org.xplatform.personal.impl.presentation.edit.n b;

    public /* synthetic */ d2c0(org.xplatform.personal.impl.presentation.edit.n nVar, byte b) {
        this.f5349a = b;
        this.b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5349a;
        org.xplatform.personal.impl.presentation.edit.n nVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(nVar.f.a().k.s);
            default:
                nVar.D(new g2c0(false));
                return Unit.f46060a;
        }
    }
}
