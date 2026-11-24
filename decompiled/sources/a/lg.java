package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19982a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lg(sd sdVar, boolean z, ym10 ym10Var, boolean z2, boolean z3, Function1 function1, String str) {
        this.g = sdVar;
        this.b = z;
        this.h = ym10Var;
        this.c = z2;
        this.d = z3;
        this.e = function1;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19982a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ro4.c(this.b, this.c, this.e, (mm40) obj4, this.f, (String) obj3, this.d, (fet) obj, x8x.L(1));
                break;
            default:
                sd sdVar = (sd) obj4;
                ym10 ym10Var = (ym10) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = !(ym10Var instanceof um10);
                    Function1 function1 = this.e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new pd10(function1, (byte) 14);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new pd10(function1, (byte) 15);
                        fetVar.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new pd10(function1, (byte) 16);
                        fetVar.o0(objP3);
                    }
                    km10.g(sdVar, this.b, z, this.c, this.d, function0, function2, (Function0) objP3, fetVar, 0);
                    String str = this.f;
                    if (str != null) {
                        fetVar.e0(1913582890);
                        km10.h(0, fetVar, null, str);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1913647277);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lg(boolean z, boolean z2, Function1 function1, mm40 mm40Var, String str, String str2, boolean z3, int i) {
        this.b = z;
        this.c = z2;
        this.e = function1;
        this.g = mm40Var;
        this.f = str;
        this.h = str2;
        this.d = z3;
    }
}
