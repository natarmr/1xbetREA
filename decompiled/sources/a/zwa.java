package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zwa implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45096a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ o0x c;

    public /* synthetic */ zwa(mm40 mm40Var, o0x o0xVar, int i, byte b) {
        this.f45096a = b;
        this.b = mm40Var;
        this.c = o0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45096a;
        o0x o0xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ffb0.k(mm40Var, o0xVar, fetVar, x8x.L(1));
                break;
            case 1:
                etl.d(mm40Var, o0xVar, fetVar, x8x.L(1));
                break;
            case 2:
                q0x.D(mm40Var, o0xVar, fetVar, x8x.L(1));
                break;
            default:
                r3m0.f(mm40Var, o0xVar, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
