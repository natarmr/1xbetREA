package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jc9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16265a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ wdr i;

    public /* synthetic */ jc9(mm40 mm40Var, long j, String str, String str2, String str3, eb9 eb9Var, uwe uweVar, int i) {
        this.b = mm40Var;
        this.d = j;
        this.c = str;
        this.f = str2;
        this.g = str3;
        this.h = eb9Var;
        this.i = uweVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16265a;
        int i = this.e;
        wdr wdrVar = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                x8f.n(this.b, this.d, this.c, (String) obj5, (String) obj4, (eb9) obj3, (uwe) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                obb.r(this.b, this.c, this.d, (qol) obj5, (Integer) obj4, (tol) obj3, (Function0) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jc9(mm40 mm40Var, String str, long j, qol qolVar, Integer num, tol tolVar, Function0 function0, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = j;
        this.f = qolVar;
        this.g = num;
        this.h = tolVar;
        this.i = function0;
        this.e = i;
    }
}
