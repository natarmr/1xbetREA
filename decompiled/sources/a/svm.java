package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class svm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32875a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ svm(float f, j8l0 j8l0Var, List list, int i) {
        this.f32875a = (byte) 7;
        this.c = f;
        this.b = j8l0Var;
        this.e = list;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32875a;
        int i = this.d;
        Object obj3 = this.e;
        Object obj4 = this.b;
        float f = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wwb.u((mm40) obj4, (tum) obj3, f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mbc.F((mm40) obj4, (k2n) obj3, f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ieb.B((mm40) obj4, (atv) obj3, f, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ibc.A((mm40) obj4, f, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                km10.l((wm10) obj4, f, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                k7x.n((o30) obj4, f, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                k7x.x((u30) obj4, f, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ahy.A(f, (j8l0) obj4, (List) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ svm(mm40 mm40Var, Object obj, float f, int i, byte b) {
        this.f32875a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = f;
        this.d = i;
    }

    public /* synthetic */ svm(Object obj, float f, wdr wdrVar, int i, byte b) {
        this.f32875a = b;
        this.b = obj;
        this.c = f;
        this.e = wdrVar;
        this.d = i;
    }
}
