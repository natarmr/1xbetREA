package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25619a;
    public final /* synthetic */ f3w b;

    public /* synthetic */ op2(f3w f3wVar, byte b) {
        this.f25619a = b;
        this.b = f3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25619a;
        jm40 jm40Var = jm40.b;
        f3w f3wVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(mrv.k0(jm40Var, "TITLE_TEXT"), "STRING_TITLE_TEXT_TEST_TAG");
                    String str = f3wVar.b;
                    long j = qmk.q;
                    long j2 = qmk.s;
                    aad.e(str, mm40VarE0, ibm0.n(new y9q0(0L, j2, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar), null, 2, false, 2, 0, null, new n05(j, j2, qmk.n), fetVar, 1597488, 424);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(f3wVar.b, o2e.e0(mrv.k0(jm40Var, "TITLE_TEXT"), "STRING_TITLE_TEXT_TEST_TAG"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
