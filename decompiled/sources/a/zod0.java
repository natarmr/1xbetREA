package a;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zod0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44715a;
    public final /* synthetic */ epd0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zod0(byte b, epd0 epd0Var, Function1 function1) {
        this.f44715a = b;
        this.b = epd0Var;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f44715a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        epd0 epd0Var = this.b;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (epd0Var.f == null) {
                    fetVar.e0(-75221259);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-75221258);
                    mm40 mm40VarA = yhg0Var.a(0.25f, jm40Var, true);
                    String upperCase = rsm0.w(R.string.maximum, 0, fetVar).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    boolean z = epd0Var.f8182a;
                    boolean zG = fetVar.g(function1) | fetVar.i(epd0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new wod0((byte) 8, epd0Var, function1);
                        fetVar.o0(objP);
                    }
                    xvw.m(0, fetVar, mm40VarA, upperCase, (Function0) objP, z);
                    fetVar.r(false);
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
                if (!fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    fetVar2.X();
                } else if (epd0Var.f == null) {
                    fetVar2.e0(-1593970865);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1593970864);
                    mm40 mm40VarA2 = yhg0Var2.a(0.25f, jm40Var, true);
                    String upperCase2 = rsm0.w(R.string.maximum, 0, fetVar2).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    boolean z2 = epd0Var.f8182a;
                    boolean zG2 = fetVar2.g(function1) | fetVar2.i(epd0Var);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new wod0((byte) 9, epd0Var, function1);
                        fetVar2.o0(objP2);
                    }
                    bww.p(0, fetVar2, mm40VarA2, upperCase2, (Function0) objP2, z2);
                    fetVar2.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
