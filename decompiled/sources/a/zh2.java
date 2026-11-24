package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44371a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zh2(mm40 mm40Var, float f, j8l0 j8l0Var, j700 j700Var, zcz zczVar, List list, int i) {
        this.f44371a = (byte) 3;
        this.b = mm40Var;
        this.e = f;
        this.c = j8l0Var;
        this.d = j700Var;
        this.h = zczVar;
        this.f = list;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44371a;
        int i = this.g;
        Object obj3 = this.f;
        Object obj4 = this.h;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                phu0.b(this.b, (bdz) obj6, (bzl) obj5, (fi2) obj4, this.e, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                i4w0.b(this.b, (bdz) obj6, (bzl) obj5, (qj2) obj4, this.e, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                e3c.l(this.b, (jpm) obj6, (ipm) obj5, (j83) obj4, this.e, (zcl) obj3, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                ahy.L(this.b, this.e, (j8l0) obj6, (j700) obj5, (zcz) obj4, (List) obj3, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zh2(mm40 mm40Var, Object obj, Object obj2, Object obj3, float f, Object obj4, int i, byte b) {
        this.f44371a = b;
        this.b = mm40Var;
        this.c = obj;
        this.d = obj2;
        this.h = obj3;
        this.e = f;
        this.f = obj4;
        this.g = i;
    }
}
