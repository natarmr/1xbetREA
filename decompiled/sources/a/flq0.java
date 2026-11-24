package a;

import android.text.format.DateFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class flq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9752a;
    public final /* synthetic */ ilq0 b;

    public /* synthetic */ flq0(ilq0 ilq0Var, byte b) {
        this.f9752a = b;
        this.b = ilq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iIntValue;
        byte b = this.f9752a;
        uaq0 uaq0Var = null;
        ilq0 ilq0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = ilq0.l2;
                fiu0 fiu0Var = ilq0Var.h2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s2m0 s2m0Var2 = ilq0.l2;
                nlq0 nlq0VarW0 = ilq0Var.W0();
                ol60 ol60Var = nlq0VarW0.q;
                boolean zIs24HourFormat = DateFormat.is24HourFormat(ilq0Var.Q0().f15197a.getContext());
                wyu wyuVar = nlq0VarW0.e;
                boolean z = nlq0VarW0.i;
                p7m0 p7m0Var = nlq0VarW0.m;
                if (zIs24HourFormat) {
                    iIntValue = ((Number) p7m0Var.getValue()).intValue();
                } else {
                    usd usdVar = nlq0VarW0.d;
                    int iIntValue2 = ((Number) p7m0Var.getValue()).intValue();
                    uhq0 uhq0Var = ((Number) nlq0VarW0.o.getValue()).intValue() == 1 ? uhq0.b : uhq0.f35695a;
                    usdVar.getClass();
                    if (iIntValue2 == 12 && uhq0Var == uhq0.f35695a) {
                        iIntValue = 0;
                    } else {
                        if (iIntValue2 < 12 && uhq0Var == uhq0.b) {
                            iIntValue2 += 12;
                        }
                        iIntValue = iIntValue2;
                    }
                }
                int iIntValue3 = ((Number) nlq0VarW0.n.getValue()).intValue();
                vkq0 vkq0VarA = nlq0VarW0.f.a(z);
                if (vkq0VarA.f37587a != iIntValue || vkq0VarA.b != iIntValue3) {
                    uaq0 uaq0VarA = wyuVar.a();
                    if (z) {
                        v6j0 v6j0Var = nlq0VarW0.g.f43485a;
                        v6j0Var.f36880a.e(iIntValue, "NIGHT_MODE_TURN_ON_HOURS");
                        v6j0Var.f36880a.e(iIntValue3, "NIGHT_MODE_TURN_ON_MINUTES");
                    } else {
                        v6j0 v6j0Var2 = nlq0VarW0.h.f41723a;
                        v6j0Var2.f36880a.e(iIntValue, "NIGHT_MODE_TURN_OFF_HOURS");
                        v6j0Var2.f36880a.e(iIntValue3, "NIGHT_MODE_TURN_OFF_MINUTES");
                    }
                    nlq0VarW0.b.a();
                    if (wyuVar.a() != uaq0VarA) {
                        uaq0Var = uaq0VarA;
                    }
                }
                if (uaq0Var != null) {
                    ol60Var.f(new blq0(uaq0Var));
                } else {
                    ol60Var.f(alq0.f1081a);
                }
                dyb.u0();
                break;
            default:
                s2m0 s2m0Var3 = ilq0.l2;
                ilq0Var.x0();
                dyb.u0();
                break;
        }
        return Boolean.TRUE;
    }
}
