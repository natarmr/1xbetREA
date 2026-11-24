package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24258a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ik00 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ e2d f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ nwy(mm40 mm40Var, ik00 ik00Var, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, int i, byte b) {
        this.f24258a = b;
        this.b = mm40Var;
        this.c = ik00Var;
        this.d = z;
        this.e = qdzVar;
        this.f = e2dVar;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24258a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x8f.D(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kc5.j0(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dj8.y(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                j47.m0(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
