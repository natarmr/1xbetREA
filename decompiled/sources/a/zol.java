package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44725a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ tpl h;

    public /* synthetic */ zol(mm40 mm40Var, boolean z, hpl hplVar, float f, float f2, Function1 function1, int i) {
        this.f44725a = (byte) 0;
        this.b = mm40Var;
        this.c = z;
        this.h = hplVar;
        this.d = f;
        this.e = f2;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44725a;
        int i = this.g;
        tpl tplVar = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                boolean z = this.c;
                uzb.q(mm40Var, z, (hpl) tplVar, this.d, this.e, this.f, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                u1c.e(mm40Var2, (kpl) tplVar, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mm40 mm40Var3 = this.b;
                v3c.l(mm40Var3, (npl) tplVar, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                mm40 mm40Var4 = this.b;
                n4c.h(mm40Var4, (qpl) tplVar, this.c, this.d, this.e, this.f, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zol(mm40 mm40Var, tpl tplVar, boolean z, float f, float f2, Function1 function1, int i, byte b) {
        this.f44725a = b;
        this.b = mm40Var;
        this.h = tplVar;
        this.c = z;
        this.d = f;
        this.e = f2;
        this.f = function1;
        this.g = i;
    }
}
