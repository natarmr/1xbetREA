package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wor implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39510a;
    public final /* synthetic */ ui9 b;

    public /* synthetic */ wor(ui9 ui9Var, byte b) {
        this.f39510a = b;
        this.b = ui9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39510a) {
            case 0:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, this.b, null, false, null, false, -1, 516095);
            case 1:
                dja djaVar = dja.PENALTY;
                q7x.F((oyg0) obj, djaVar, "KEY_CURRENT_CARD_TYPE");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, djaVar, null, null, null, null, null, this.b, null, false, null, -1, 63455);
            case 2:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, this.b, null, false, null, -1, 63487);
            case 3:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, this.b, null, null, false, -1, 1015807);
            default:
                return njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, this.b, null, null, -1, 61439);
        }
    }
}
