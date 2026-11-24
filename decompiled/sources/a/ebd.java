package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ebd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7513a;
    public final /* synthetic */ m3w b;

    public /* synthetic */ ebd(m3w m3wVar, byte b) {
        this.f7513a = b;
        this.b = m3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7513a;
        jm40 jm40Var = jm40.b;
        m3w m3wVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v8q0.a(m3wVar.f21138a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, 48, 24960, 110588);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(m3wVar.b, o2e.e0(mrv.k0(jm40Var, "DESCRIPTION_TEXT"), "DESCRIPTION_TEXT_TEST_TAG"), m3wVar.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.l(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar2, 48, 24960, 110584);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "TITLE_TEXT");
                    String str = m3wVar.f21138a;
                    long j = qmk.q;
                    long j2 = qmk.s;
                    aad.e(str, mm40VarK0, ibm0.n(new y9q0(0L, j2, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), null, 2, false, 2, 0, null, new n05(j, j2, qmk.n), fetVar3, 1597488, 424);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarK1 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                    String str2 = m3wVar.b;
                    long j3 = qmk.q;
                    long j4 = qmk.s;
                    n05 n05Var = new n05(j3, j4, qmk.n);
                    boolean zG = fetVar4.g(m3wVar);
                    Object objP = fetVar4.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new u3k(m3wVar, b2);
                        fetVar4.o0(objP);
                    }
                    aad.e(str2, mm40VarK1, y9q0.a(new y9q0(0L, j4, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 6, 0, 0L, null, null, 16744447), null, 2, false, 2, 0, (n4d) objP, n05Var, fetVar4, 1597488, 168);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
