package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35094a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u5h(jbm jbmVar, boolean z, long j, Function2 function2, Function2 function3, int i) {
        this.f35094a = (byte) 4;
        this.b = jbmVar;
        this.d = z;
        this.c = j;
        this.f = function2;
        this.g = function3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35094a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                long j = this.c;
                uzb.d((mm40) obj5, j, (Function0) obj4, (ugd) obj3, (fet) obj, iL, this.d ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                long j2 = this.c;
                boolean z = this.d;
                bfb.j((mm40) obj5, j2, z, (zqh) obj4, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                long j3 = this.c;
                boolean z2 = this.d;
                qbc.q((mm40) obj5, j3, z2, (uzl) obj4, (Function1) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                kbc.E((mm40) obj5, (r2m) obj4, (String) obj3, this.d, this.c, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                boolean z3 = this.d;
                long j4 = this.c;
                obc.p((jbm) obj5, z3, j4, (Function2) obj4, (Function2) obj3, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                long j5 = this.c;
                boolean z4 = this.d;
                zvw.p((mm40) obj5, j5, z4, (Function0) obj4, (xdr) obj3, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u5h(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, int i, int i2) {
        this.f35094a = (byte) 0;
        this.b = mm40Var;
        this.c = j;
        this.f = function0;
        this.g = ugdVar;
        this.e = i;
        this.d = i2;
    }

    public /* synthetic */ u5h(mm40 mm40Var, long j, boolean z, Object obj, wdr wdrVar, int i, byte b) {
        this.f35094a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = z;
        this.f = obj;
        this.g = wdrVar;
        this.e = i;
    }

    public /* synthetic */ u5h(mm40 mm40Var, r2m r2mVar, String str, boolean z, long j, int i) {
        this.f35094a = (byte) 3;
        this.b = mm40Var;
        this.f = r2mVar;
        this.g = str;
        this.d = z;
        this.c = j;
        this.e = i;
    }
}
