package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rlb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30687a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ c280 c;

    public /* synthetic */ rlb(mm40 mm40Var, c280 c280Var, int i, byte b) {
        this.f30687a = b;
        this.b = mm40Var;
        this.c = c280Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30687a;
        c280 c280Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                slb.G(mm40Var, c280Var, fetVar, x8x.L(1));
                break;
            default:
                kpb.i(mm40Var, c280Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
