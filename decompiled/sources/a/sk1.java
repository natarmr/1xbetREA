package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32325a;
    public final /* synthetic */ bzt b;

    public /* synthetic */ sk1(bzt bztVar, byte b) {
        this.f32325a = b;
        this.b = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32325a;
        bzt bztVar = this.b;
        switch (b) {
            case 0:
                return new ok1(bztVar.f3488a.a().r, iun.f15405a, false, false, false);
            case 1:
                return bztVar.f3488a.a();
            case 2:
                return new jw8(tx8.f34684a, ww8.f39876a, bztVar.f3488a.a().r);
            case 3:
                iun iunVar = iun.f15405a;
                return new yo50(true, 0, true, iunVar, iunVar, bztVar.f3488a.a().r, null);
            case 4:
                iun iunVar2 = iun.f15405a;
                return new np50(true, iunVar2, iunVar2, bztVar.f3488a.a().r, null);
            case 5:
                iun iunVar3 = iun.f15405a;
                return new iq50(true, iunVar3, iunVar3, bztVar.f3488a.a().r, null);
            case 6:
                iun iunVar4 = iun.f15405a;
                return new gr50(true, 0, iunVar4, iunVar4, bztVar.f3488a.a().r, null);
            default:
                xyq0 xyq0Var = new xyq0(true, true, false);
                iun iunVar5 = iun.f15405a;
                return new ws50(true, 0, xyq0Var, iunVar5, iunVar5, bztVar.f3488a.a().r, null);
        }
    }
}
