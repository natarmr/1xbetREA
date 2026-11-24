package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rdb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30281a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;

    public /* synthetic */ rdb(mm40 mm40Var, mdm mdmVar, int i, byte b) {
        this.f30281a = b;
        this.b = mm40Var;
        this.c = mdmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30281a;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                saj.j(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            case 1:
                j120.t(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            case 2:
                ntr.x(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            case 3:
                ahy.O(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            case 4:
                i120.u(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            case 5:
                o050.t(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
            default:
                xia0.u(mm40Var, mdmVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
