package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class brw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3099a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ brw(long j, String str, long j2, Function1 function1, byte b) {
        this.f3099a = b;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3099a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.e;
        byte b2 = 2;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gmm gmmVar = (gmm) fetVar.k(gpw.f11703a);
                    long j = this.b;
                    imm immVar = new imm(new ilm(j), new plm(this.c, ha50.TWO_LINES, j, fa50.f9191a), gmmVar, this.d, true, null);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new i8v(function1, (byte) 27);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dht(function1, (byte) 23);
                        fetVar.o0(objP2);
                    }
                    hlm.c(jm40.b, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4052);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    gmm gmmVar2 = (gmm) fetVar2.k(zwp0.f45118a);
                    long j2 = this.b;
                    imm immVar2 = new imm(new ilm(j2), new plm(this.c, ha50.TWO_LINES, j2, fa50.f9191a), gmmVar2, this.d, true, null);
                    boolean zG3 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new o0q0(function1, b2);
                        fetVar2.o0(objP3);
                    }
                    Function0 function2 = (Function0) objP3;
                    boolean zG4 = fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new coo0(function1, (byte) 21);
                        fetVar2.o0(objP4);
                    }
                    hlm.c(jm40.b, immVar2, null, function2, null, (Function1) objP4, null, null, null, null, null, null, fetVar2, 0, 0, 4052);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
