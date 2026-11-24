package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s5n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31662a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s5n(s4i s4iVar, boolean z, boolean z2, qao0 qao0Var, boolean z3, int i) {
        this.f = s4iVar;
        this.b = z;
        this.c = z2;
        this.g = qao0Var;
        this.d = z3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31662a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                z5n.e((s4i) obj4, this.b, this.c, (qao0) obj3, this.d, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                g7x.b((n6q0) obj4, z, z2, z3, (Function1) obj3, (fet) obj, iL);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s5n(n6q0 n6q0Var, boolean z, boolean z2, boolean z3, Function1 function1, int i) {
        this.f = n6q0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = function1;
        this.e = i;
    }
}
