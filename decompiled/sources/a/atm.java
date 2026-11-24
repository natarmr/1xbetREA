package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class atm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1438a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ r3i c;

    public /* synthetic */ atm(mm40 mm40Var, r3i r3iVar, int i, byte b) {
        this.f1438a = b;
        this.b = mm40Var;
        this.c = r3iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1438a;
        r3i r3iVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                feb.B(mm40Var, r3iVar, fetVar, x8x.L(1));
                break;
            default:
                feb.C(mm40Var, r3iVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
