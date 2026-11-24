package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xnr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41182a;
    public final /* synthetic */ spr b;

    public /* synthetic */ xnr(spr sprVar, byte b) {
        this.f41182a = b;
        this.b = sprVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41182a;
        spr sprVar = this.b;
        switch (b) {
            case 0:
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                qnr qnrVarA = qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -1, 491519);
                sprVar.o.e("KEY_EXPANDED_CARD_SECTION", Boolean.valueOf(qnrVarA.V));
                return qnrVarA;
            default:
                qnr qnrVarA2 = qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, true, null, null, null, null, null, null, null, null, null, false, null, false, -1, 524259);
                sprVar.o.e("KEY_SHOW_SUB_GAMES", Boolean.valueOf(qnrVarA2.J));
                return qnrVarA2;
        }
    }
}
