package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sgg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32158a;
    public final /* synthetic */ vgg b;

    public /* synthetic */ sgg(vgg vggVar, byte b) {
        this.f32158a = b;
        this.b = vggVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32158a;
        byte b2 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                qud qudVar = vgg.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = mr00.f22246a;
                    vgg vggVar = this.b;
                    l5d0 l5d0VarA = zfnVar.a(vggVar);
                    l5d0 l5d0VarA2 = jgg.f16477a.a((CyberChampsMainParams) vggVar.M1.n(vggVar, vgg.R1[0]));
                    zfn zfnVar2 = jgg.b;
                    cog cogVar = vggVar.L1;
                    if (cogVar == null) {
                        Intrinsics.h("cyberFeedFilterRepository");
                        throw null;
                    }
                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(cogVar)}, u1c.M(1329117013, new sgg(vggVar, b2), fetVar), fetVar, 48);
                    aig aigVar = (aig) vggVar.O1.getValue();
                    boolean zI = fetVar.i(vggVar);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new ugg(vggVar, (byte) 1);
                        fetVar.o0(objP);
                    }
                    int i = aig.x;
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                    boolean zI2 = fetVar.i(aigVar) | fetVar.i(vggVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        ua7 ua7Var = new ua7(aigVar, vggVar, pz40VarF, null, (byte) 21);
                        fetVar.o0(ua7Var);
                        objP2 = ua7Var;
                    }
                    m0x0.t(fetVar, vggVar, (Function2) objP2);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                qud qudVar2 = vgg.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vgg vggVar2 = this.b;
                    ib50 ib50Var = vggVar2.K1;
                    if (ib50Var == null) {
                        Intrinsics.h("navDestinations");
                        throw null;
                    }
                    aig aigVar2 = (aig) vggVar2.O1.getValue();
                    int i2 = aig.x;
                    qjj.l(ib50Var, aigVar2, fetVar, 72);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }
}
