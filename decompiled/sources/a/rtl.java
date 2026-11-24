package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rtl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31084a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rtl(mm40 mm40Var, vul vulVar, wul wulVar, long j, Function0 function0, int i, int i2) {
        this.b = mm40Var;
        this.f = vulVar;
        this.g = wulVar;
        this.c = j;
        this.h = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31084a;
        byte b2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                ckb.i(this.b, (vul) obj5, (wul) obj4, this.c, (Function0) obj3, (fet) obj, iL, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                tlb.l(this.b, (jwm) obj5, (jwm) obj4, (jwm) obj3, this.c, (fet) obj, iL2, this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rtl(mm40 mm40Var, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, long j, int i, int i2) {
        this.b = mm40Var;
        this.f = jwmVar;
        this.g = jwmVar2;
        this.h = jwmVar3;
        this.c = j;
        this.d = i;
        this.e = i2;
    }
}
