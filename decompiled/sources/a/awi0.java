package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class awi0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1575a = 1;
    public final /* synthetic */ qfj0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ awi0(qfj0 qfj0Var, Function1 function1) {
        this.b = qfj0Var;
        this.c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f1575a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        final Function1 function1 = this.c;
        final qfj0 qfj0Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                    long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarQ = i120.Q(mm40VarA, backgroundContent, vgg0.a(16.0f));
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new w7i0(function1, (byte) 9);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15);
                    ksh0 ksh0Var = qfj0Var.b;
                    t9x.w(ksh0Var.f18813a, ksh0Var.c, ksh0Var.d, ksh0Var.e, ksh0Var.b, mm40VarY, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarA2 = yhg0Var2.a(1.0f, o7k0.c(jm40Var, 1.0f), true);
                    long backgroundContent2 = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarA2, backgroundContent2, vgg0.a(16.0f));
                    yg ygVar = qfj0Var.f28638a;
                    String str = ygVar.f42562a;
                    String str2 = ygVar.b;
                    String str3 = ygVar.c;
                    boolean z = ygVar.d;
                    boolean z2 = ygVar.e;
                    boolean zG2 = fetVar2.g(qfj0Var) | fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objP2 = new Function0() { // from class: a.bwi0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = objArr2;
                                Function1 function2 = function1;
                                qfj0 qfj0Var2 = qfj0Var;
                                switch (b3) {
                                    case 0:
                                        if (qfj0Var2.f28638a.d) {
                                            function2.invoke(wyi0.f39975a);
                                        }
                                        break;
                                    default:
                                        if (qfj0Var2.f28638a.e) {
                                            function2.invoke(vyi0.f38250a);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zG3 = fetVar2.g(qfj0Var) | fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new Function0() { // from class: a.bwi0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b2;
                                Function1 function2 = function1;
                                qfj0 qfj0Var2 = qfj0Var;
                                switch (b3) {
                                    case 0:
                                        if (qfj0Var2.f28638a.d) {
                                            function2.invoke(wyi0.f39975a);
                                        }
                                        break;
                                    default:
                                        if (qfj0Var2.f28638a.e) {
                                            function2.invoke(vyi0.f38250a);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP3);
                    }
                    wha0.a(function0, (Function0) objP3, str, str2, str3, z, z2, mm40VarQ2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ awi0(Function1 function1, qfj0 qfj0Var) {
        this.c = function1;
        this.b = qfj0Var;
    }
}
