package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class e7g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f7g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7g(f7g f7gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f7gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f7g f7gVar = this.k;
        switch (b) {
            case 0:
                e7g e7gVar = new e7g(f7gVar, yjeVar, (byte) 0);
                e7gVar.j = obj;
                return e7gVar;
            default:
                e7g e7gVar2 = new e7g(f7gVar, yjeVar, (byte) 1);
                e7gVar2.j = obj;
                return e7gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e7g) create((h7g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e7g) create((och) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        f7g f7gVar = this.k;
        switch (b) {
            case 0:
                h7g h7gVar = (h7g) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(h7gVar, h7g.f12572a)) {
                    f7gVar.x0();
                } else if (Intrinsics.d(h7gVar, h7g.b)) {
                    ii iiVar = f7gVar.h2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = f7gVar.H(R.string.caution);
                    String strH2 = f7gVar.H(R.string.cyber_calendar_select_one_sport);
                    String strH3 = f7gVar.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = f7gVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                return Unit.f46060a;
            default:
                a8z a8zVar = f7gVar.l2;
                och ochVar = (och) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ochVar != null) {
                    if (ochVar instanceof lch) {
                        f7gVar.V0().c.setVisibility(8);
                        ((x6g) a8zVar.getValue()).A(((lch) ochVar).f19799a);
                    } else if (ochVar instanceof mch) {
                        nwd nwdVar = f7g.o2;
                        ((x6g) a8zVar.getValue()).A(iun.f15405a);
                        f7gVar.V0().c.a(((mch) ochVar).f21551a);
                        f7gVar.V0().c.setVisibility(0);
                    } else if (ochVar instanceof nch) {
                        pb10 pb10VarK = ozb.K(-1L);
                        nwd nwdVar2 = f7g.o2;
                        ((x6g) a8zVar.getValue()).A(iun.f15405a);
                        DSLottieEmptyContainer dSLottieEmptyContainer = f7gVar.V0().c;
                        g2v g2vVar = f7gVar.i2;
                        if (g2vVar == null) {
                            Intrinsics.h("lottieEmptyConfigurator");
                            throw null;
                        }
                        dSLottieEmptyContainer.a(g2v.d(g2vVar, pb10VarK, null, null, 0, 0, null, 510));
                        f7gVar.V0().c.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
