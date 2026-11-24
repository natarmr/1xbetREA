package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ue implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35502a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ue(q0z q0zVar, String str, boolean z, boolean z2, Function0 function0, int i) {
        this.f35502a = (byte) 3;
        this.e = q0zVar;
        this.g = str;
        this.b = z;
        this.c = z2;
        this.f = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35502a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                wha0.F(iL, (fet) obj, (mm40) obj4, (Function0) obj5, (Function0) obj3, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).intValue();
                hp4.d((xcz) obj4, (vne) obj5, (a4x) obj3, this.b, this.c, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                acb.D((mm40) obj4, (bye) obj3, this.b, (Function0) obj5, (fet) obj, x8x.L(i | 1), this.c ? 1 : 0);
                break;
            case 3:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                art artVar = q0z.n2;
                int iL2 = x8x.L(i | 1);
                ((q0z) obj4).P0((String) obj3, this.b, this.c, (Function0) obj5, fetVar, iL2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                x0x.l((String) obj3, this.b, (Function0) obj5, this.c, (mm40) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                c9x.l((mm40) obj4, this.b, this.c, (Function1) obj5, (gqh0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                fzn0.a(z, (Function1) obj5, (mm40) obj4, z2, (dzn0) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ue(xcz xczVar, vne vneVar, a4x a4xVar, boolean z, boolean z2, int i) {
        this.f35502a = (byte) 1;
        this.e = xczVar;
        this.f = vneVar;
        this.g = a4xVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ue(mm40 mm40Var, bye byeVar, boolean z, Function0 function0, int i, int i2) {
        this.f35502a = (byte) 2;
        this.e = mm40Var;
        this.g = byeVar;
        this.b = z;
        this.f = function0;
        this.d = i;
        this.c = i2;
    }

    public /* synthetic */ ue(mm40 mm40Var, boolean z, boolean z2, wdr wdrVar, Object obj, int i, byte b) {
        this.f35502a = b;
        this.e = mm40Var;
        this.b = z;
        this.c = z2;
        this.f = wdrVar;
        this.g = obj;
        this.d = i;
    }

    public /* synthetic */ ue(String str, boolean z, Function0 function0, boolean z2, mm40 mm40Var, int i) {
        this.f35502a = (byte) 4;
        this.g = str;
        this.b = z;
        this.f = function0;
        this.c = z2;
        this.e = mm40Var;
        this.d = i;
    }

    public /* synthetic */ ue(boolean z, Function1 function1, mm40 mm40Var, boolean z2, dzn0 dzn0Var, int i) {
        this.f35502a = (byte) 6;
        this.b = z;
        this.f = function1;
        this.e = mm40Var;
        this.c = z2;
        this.g = dzn0Var;
        this.d = i;
    }
}
