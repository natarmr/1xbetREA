package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$LimitsScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hjr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13173a;
    public final /* synthetic */ ljr b;

    public /* synthetic */ hjr(ljr ljrVar, byte b) {
        this.f13173a = b;
        this.b = ljrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13173a;
        ljr ljrVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = ljr.Q1;
                i1w0 i1w0VarF = a4n0.f(ljrVar);
                khi khiVar = ljrVar.K1;
                if (khiVar != null) {
                    return new ry3(i1w0VarF, khiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = ljr.Q1;
                brk brkVar = new brk(2, ljrVar.H0(), vkr.class, "questionAnswered", "questionAnswered(Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/GamblingExamQuestionUiModel;Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/GamblingExamAnswerUiEnum;)V", 0, (byte) 24);
                cjr cjrVar = new cjr();
                gbn gbnVar = new gbn(new nuq((byte) 6), new atq(3, (byte) 6), new g7p((Object) brkVar, (byte) 15), gzn.Z);
                dp dpVar = cjrVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new nuq((byte) 4), new atq(3, (byte) 5), new dcr((byte) 2), gzn.Y));
                return cjrVar;
            default:
                iiy[] iiyVarArr3 = ljr.Q1;
                vkr vkrVarH0 = ljrVar.H0();
                lef0 lef0Var = vkrVarH0.d;
                iun iunVar = iun.f15405a;
                lef0Var.getClass();
                iunVar.getClass();
                xio xioVar = (xio) ((pmi) lef0Var.f19899a).c;
                xioVar.getClass();
                xioVar.b = iunVar;
                ani0 ani0Var = vkrVarH0.c;
                ani0Var.getClass();
                xio xioVar2 = (xio) ((pmi) ani0Var.f1155a).c;
                xioVar2.getClass();
                xioVar2.b = iunVar;
                xioVar2.c = iunVar;
                i1w0 i1w0Var = vkrVarH0.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(new ResponsibleGamblingScreens$LimitsScreen())), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
