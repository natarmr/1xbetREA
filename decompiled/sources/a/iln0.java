package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iln0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14988a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ short d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ iln0(byte b, int i, mm40 mm40Var, Object obj, Object obj2, Object obj3, boolean z) {
        this.f14988a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.c = z;
        this.g = obj3;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14988a;
        short s = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                mm40 mm40Var = this.b;
                boolean z = this.c;
                wgm0.h(mm40Var, (t7q0) obj5, (q7q0) obj4, z, (a7n) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                mm40 mm40Var2 = this.b;
                boolean z2 = this.c;
                gq80.O(mm40Var2, (ArrayList) obj5, (skb0) obj4, z2, (Function1) obj3, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
