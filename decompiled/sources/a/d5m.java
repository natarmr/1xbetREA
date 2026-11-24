package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5513a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5m(int i, long j, String str, boolean z) {
        this.d = str;
        this.b = j;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5513a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                long j = this.b;
                thb.p(iL, j, (fet) obj, (String) obj3, this.c);
                return Unit.f46060a;
            case 1:
                a820 a820Var = (a820) obj2;
                txe txeVar = a820Var.b;
                int i = on20.m1;
                return a820.a(a820Var, txe.a(txeVar, this.b, ((on20) obj3).c0(), null, null, null, this.c, null, 92), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
            case 2:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                dm40.c(this.b, (Function0) obj3, this.c, (fet) obj, iL2);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                q7x.s(this.b, this.c, (Function1) obj3, (fet) obj, iL3);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ d5m(int i, long j, Function1 function1, boolean z) {
        this.b = j;
        this.c = z;
        this.d = function1;
    }

    public /* synthetic */ d5m(long j, on20 on20Var, boolean z) {
        this.b = j;
        this.d = on20Var;
        this.c = z;
    }

    public /* synthetic */ d5m(long j, Function0 function0, boolean z, int i) {
        this.b = j;
        this.d = function0;
        this.c = z;
    }
}
