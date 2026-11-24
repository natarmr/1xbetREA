package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class esl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8334a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;

    public /* synthetic */ esl(mm40 mm40Var, float f, int i, byte b) {
        this.f8334a = b;
        this.b = mm40Var;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8334a;
        float f = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                feb.j(mm40Var, f, fetVar, x8x.L(1));
                break;
            case 1:
                ieb.I(mm40Var, f, fetVar, x8x.L(1));
                break;
            case 2:
                jeb.I(mm40Var, f, fetVar, x8x.L(1));
                break;
            case 3:
                bfb.E(mm40Var, f, fetVar, x8x.L(1));
                break;
            default:
                xia0.S(mm40Var, f, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
