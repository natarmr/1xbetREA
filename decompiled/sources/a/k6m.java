package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k6m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17777a;
    public final /* synthetic */ i8n b;
    public final /* synthetic */ int c;

    public /* synthetic */ k6m(i8n i8nVar, int i, byte b) {
        this.f17777a = b;
        this.b = i8nVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17777a;
        int i = this.c;
        i8n i8nVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ulb.q(i8nVar, fetVar, x8x.L(i | 1));
                break;
            default:
                ulb.u(i8nVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
