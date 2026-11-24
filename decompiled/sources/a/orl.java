package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class orl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25738a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ trl c;
    public final /* synthetic */ int d;

    public /* synthetic */ orl(mm40 mm40Var, trl trlVar, int i, byte b) {
        this.f25738a = b;
        this.b = mm40Var;
        this.c = trlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25738a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obb.m(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                jcb.g(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                rcb.s(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                o050.p(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
