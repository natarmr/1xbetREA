package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dll implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6287a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ dll(mm40 mm40Var, List list, int i) {
        this.b = mm40Var;
        this.c = list;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6287a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                thb.d(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            default:
                rsm0.m(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dll(mm40 mm40Var, List list, int i, int i2) {
        this.b = mm40Var;
        this.c = list;
        this.d = i;
    }
}
