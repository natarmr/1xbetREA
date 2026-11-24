package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r5n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29895a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ r5n(mm40 mm40Var, ope opeVar, int i, boolean z, boolean z2, Function1 function1, int i2) {
        this.f29895a = (byte) 2;
        this.d = mm40Var;
        this.e = opeVar;
        this.b = i;
        this.c = z;
        this.f = z2;
        this.g = function1;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29895a;
        int i = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                int i2 = this.b;
                boolean z = this.c;
                z5n.j(i2, z, (qao0) obj4, (a4x) obj3, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                int i3 = this.b;
                boolean z2 = this.c;
                z5n.l(i3, z2, (qao0) obj4, (a4x) obj3, this.f, this.g, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.m((mm40) obj4, (ope) obj3, this.b, this.c, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ r5n(int i, boolean z, qao0 qao0Var, a4x a4xVar, boolean z2, Function1 function1, int i2, byte b) {
        this.f29895a = b;
        this.b = i;
        this.c = z;
        this.d = qao0Var;
        this.e = a4xVar;
        this.f = z2;
        this.g = function1;
        this.h = i2;
    }
}
