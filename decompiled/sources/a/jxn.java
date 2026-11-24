package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jxn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17315a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ j43 c;
    public final /* synthetic */ k43 d;
    public final /* synthetic */ int e;

    public /* synthetic */ jxn(mm40 mm40Var, j43 j43Var, k43 k43Var, int i, byte b) {
        this.f17315a = b;
        this.b = mm40Var;
        this.c = j43Var;
        this.d = k43Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17315a;
        int i = this.e;
        k43 k43Var = this.d;
        j43 j43Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kkb.q(mm40Var, j43Var, k43Var, fetVar, x8x.L(i | 1));
                break;
            default:
                w9x.z(mm40Var, j43Var, k43Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
