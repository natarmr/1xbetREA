package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jfs0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16444a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ jjm c;

    public /* synthetic */ jfs0(mm40 mm40Var, jjm jjmVar, int i, byte b) {
        this.f16444a = b;
        this.b = mm40Var;
        this.c = jjmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16444a;
        jjm jjmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ghm0.j(mm40Var, jjmVar, fetVar, x8x.L(1));
                break;
            default:
                gnm0.f(mm40Var, jjmVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
