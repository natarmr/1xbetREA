package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lph implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20442a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lph(mm40 mm40Var, Object obj, Object obj2, Object obj3, int i, int i2, byte b) {
        this.f20442a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20442a;
        byte b2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                mbc.h(this.b, (String) obj5, (String) obj4, (y3d) obj3, (fet) obj, iL, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                saj.r(this.b, (jll) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL2, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(b2 | 1);
                mm40 mm40Var = this.b;
                vdb.v(mm40Var, (gx1) obj5, (asl) obj4, (Function0) obj3, (fet) obj, iL3, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
