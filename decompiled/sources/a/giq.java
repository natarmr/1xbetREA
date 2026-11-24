package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class giq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11361a;
    public final /* synthetic */ liq b;
    public final /* synthetic */ int c;

    public /* synthetic */ giq(liq liqVar, int i, byte b) {
        this.f11361a = b;
        this.b = liqVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11361a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                feb.w(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                ahy.u(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
