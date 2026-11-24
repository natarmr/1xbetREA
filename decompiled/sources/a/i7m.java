package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14298a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i7m(tvw tvwVar, float f, int i) {
        this.f14298a = (byte) 1;
        this.d = tvwVar;
        this.b = f;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14298a;
        int i = this.c;
        Object obj3 = this.d;
        float f = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                dub.n(f, (l7m) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                feb.y((tvw) obj3, f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                k7x.f(f, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ i7m(byte b, float f, int i, Object obj) {
        this.f14298a = b;
        this.b = f;
        this.d = obj;
        this.c = i;
    }
}
