package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class otk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ptk k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otk(ptk ptkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ptkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ptk ptkVar = this.k;
        switch (b) {
            case 0:
                otk otkVar = new otk(ptkVar, yjeVar, (byte) 0);
                otkVar.j = obj;
                return otkVar;
            default:
                otk otkVar2 = new otk(ptkVar, yjeVar, (byte) 1);
                otkVar2.j = obj;
                return otkVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((otk) create((vtk) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((otk) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ptk ptkVar = this.k;
        switch (b) {
            case 0:
                kiu0 kiu0Var = ptkVar.O1;
                vtk vtkVar = (vtk) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (vtkVar != null) {
                    if (vtkVar instanceof ttk) {
                        ddk ddkVar = ptk.U1;
                        ptkVar.G0().b.setVisibility(8);
                        x0x.O(ptkVar.G0().d.b);
                        vqc vqcVarH0 = ptkVar.H0();
                        ArrayList arrayList = ((ttk) vtkVar).f34512a;
                        ltk ltkVar = (ltk) vqcVarH0.b;
                        if (ltkVar != null) {
                            ltkVar.A(arrayList);
                        }
                    } else if (vtkVar instanceof rtk) {
                        ddk ddkVar2 = ptk.U1;
                        x0x.O(ptkVar.G0().d.b);
                        DSLottieEmptyContainer dSLottieEmptyContainer = ptkVar.G0().b;
                        dSLottieEmptyContainer.a(((rtk) vtkVar).f31082a);
                        dSLottieEmptyContainer.setVisibility(0);
                        vqc vqcVarH1 = ptkVar.H0();
                        iun iunVar = iun.f15405a;
                        iunVar.getClass();
                        ltk ltkVar2 = (ltk) vqcVarH1.b;
                        if (ltkVar2 != null) {
                            ltkVar2.A(iunVar);
                        }
                    } else if (vtkVar instanceof stk) {
                        ddk ddkVar3 = ptk.U1;
                        x0x.O(ptkVar.G0().d.b);
                        stk stkVar = (stk) vtkVar;
                        Class<xtk> cls = xtk.class;
                        ptkVar.G0().b.b(stkVar.f32776a, stkVar.b, new wej(0, (xtk) kiu0Var.getValue(), cls, "setEndTimerState", "setEndTimerState()V", 0, (byte) 6));
                        ptkVar.G0().b.setVisibility(0);
                        ptkVar.G0().b.setButtonOnClickListener(new wej(0, (xtk) kiu0Var.getValue(), cls, "onRefreshClick", "onRefreshClick()V", 0, (byte) 7));
                        vqc vqcVarH2 = ptkVar.H0();
                        iun iunVar2 = iun.f15405a;
                        iunVar2.getClass();
                        ltk ltkVar3 = (ltk) vqcVarH2.b;
                        if (ltkVar3 != null) {
                            ltkVar3.A(iunVar2);
                        }
                    } else if (vtkVar instanceof utk) {
                        ddk ddkVar4 = ptk.U1;
                        ptkVar.G0().d.b.setVisibility(0);
                        x0x.s(ptkVar.G0().d.b);
                        ptkVar.G0().b.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                String str = (String) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ddk ddkVar5 = ptk.U1;
                xtk xtkVar = (xtk) ptkVar.O1.getValue();
                boolean zS = ptkVar.S();
                str.getClass();
                e3c.n(xtkVar.q);
                xtkVar.q = sac.V(jiu0.a(xtkVar), wtk.f39744a, null, xtkVar.k.f22085a, new ys8((Object) xtkVar, (Object) str, zS, (yje) null, (byte) 4), 10);
                return Unit.f46060a;
        }
    }
}
