package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qdo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rah0 f28545a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    public qdo0(rah0 rah0Var, float f, ugd ugdVar, Function2 function2, ugd ugdVar2, int i) {
        this.f28545a = rah0Var;
        this.b = f;
        this.c = ugdVar;
        this.d = function2;
        this.e = ugdVar2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            nul0 nul0VarP = d7x.P(yt40.f43200a, fetVar);
            rah0 rah0Var = this.f28545a;
            boolean zG = fetVar.g(rah0Var) | fetVar.g(vneVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new cch0(rah0Var, vneVar, nul0VarP);
                fetVar.o0(objP2);
            }
            cch0 cch0Var = (cch0) objP2;
            mm40 mm40VarK = lgb.K(pai0.a(wha0.P(o7k0.y(o7k0.d(jm40.b, 1.0f), gqw0.d, 2), rah0Var, false, 14), false, new eoh0((byte) 15)));
            boolean zD = fetVar.d(this.b);
            ugd ugdVar = this.c;
            boolean zG2 = zD | fetVar.g(ugdVar) | fetVar.g(this.d);
            ugd ugdVar2 = this.e;
            boolean zG3 = zG2 | fetVar.g(ugdVar2) | fetVar.i(cch0Var) | fetVar.e(this.f);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                pt1 pt1Var = new pt1(this.b, ugdVar, this.d, cch0Var, this.f, ugdVar2);
                fetVar.o0(pt1Var);
                objP3 = pt1Var;
            }
            x4n0.a(mm40VarK, (Function2) objP3, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
