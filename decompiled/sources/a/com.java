package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class com implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4708a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ hzc0 d;
    public final /* synthetic */ hh80 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;

    public /* synthetic */ com(mm40 mm40Var, List list, hzc0 hzc0Var, hh80 hh80Var, boolean z, Integer num, Function2 function2, int i, byte b) {
        this.f4708a = b;
        this.b = mm40Var;
        this.c = list;
        this.d = hzc0Var;
        this.e = hh80Var;
        this.f = z;
        this.g = num;
        this.h = function2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4708a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uzb.O(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                uzb.D(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
