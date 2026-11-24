package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gk60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11431a;
    public final /* synthetic */ ik60 b;

    public /* synthetic */ gk60(ik60 ik60Var, byte b) {
        this.f11431a = b;
        this.b = ik60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11431a;
        ik60 ik60Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = ik60.Q1;
                i1w0 i1w0Var = ((pk60) ik60Var.M1.getValue()).o;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                iiy[] iiyVarArr2 = ik60.Q1;
                i1w0 i1w0VarF = a4n0.f(ik60Var);
                lmi lmiVar = ik60Var.L1;
                if (lmiVar != null) {
                    return new ry3(i1w0VarF, lmiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr3 = ik60.Q1;
                jw50 jw50Var = new jw50(1, this.b, ik60.class, "onOnboardingSectionClick", "onOnboardingSectionClick(Lorg/xplatform/onboarding_section/impl/presentation/OnboardingSectionsUiModel;)V", 0, (byte) 16);
                kk60 kk60Var = new kk60();
                kk60Var.d.b(new gbn(new rj50((byte) 26), new tvx(3, (byte) 28), new cd60((Object) jw50Var, (byte) 5), gvy.f1));
                return kk60Var;
        }
    }
}
