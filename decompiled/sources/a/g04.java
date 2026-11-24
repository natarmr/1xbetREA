package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g04 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10440a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g04(Object obj, Object obj2, Object obj3, Function1 function1, wdr wdrVar, int i, int i2, byte b) {
        this.f10440a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.b = function1;
        this.h = wdrVar;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10440a;
        short s = this.c;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                y9a.f((o0x) obj5, (o0x) obj4, (m0x) obj3, this.b, (ugd) wdrVar, (fet) obj, iL, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                gq80.p((mm40) obj5, (gzh) obj4, (azh) obj3, this.b, (Function1) wdrVar, (fet) obj, iL2, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
