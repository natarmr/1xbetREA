package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c36 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3658a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c36(x3m x3mVar, vtj vtjVar, boolean z, agk0 agk0Var, l7m0 l7m0Var, pz40 pz40Var) {
        this.d = x3mVar;
        this.e = vtjVar;
        this.b = z;
        this.f = agk0Var;
        this.g = l7m0Var;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jE;
        y3m y3mVar;
        byte b = this.f3658a;
        boolean z = this.b;
        Object obj = this.g;
        Object obj2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                String str = (String) obj4;
                String string = (String) obj3;
                pz40 pz40Var = (pz40) obj;
                ((pz40) obj2).setValue((Pair) obj5);
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = string.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = string.charAt(i);
                        if (StringsKt.P(str, cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    string = sb.toString();
                }
                if (!Intrinsics.d(((a8q0) pz40Var.getValue()).f440a.b, string)) {
                    a8q0 a8q0Var = (a8q0) pz40Var.getValue();
                    if (z) {
                        jE = o9q0.b;
                    } else {
                        int length2 = string.length();
                        jE = s7n0.e(length2, length2);
                    }
                    pz40Var.setValue(a8q0.b(a8q0Var, string, jE, 4));
                }
                return Unit.f46060a;
            case 1:
                x3m x3mVar = (x3m) obj5;
                pz40 pz40Var2 = x3mVar.f40227a;
                vtj vtjVar = (vtj) obj4;
                l7m0 l7m0Var = (l7m0) obj;
                pz40 pz40Var3 = (pz40) obj2;
                if (((agk0) obj3).l() <= 0.0f) {
                    return Unit.f46060a;
                }
                rv2 rv2Var = x3mVar.d;
                zbk zbkVar = rv2Var.e;
                boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var2).getValue()).booleanValue();
                boolean zD = x3mVar.d();
                pz40 pz40Var4 = rv2Var.c;
                agk0 agk0Var = rv2Var.f;
                hgk0 hgk0Var = (hgk0) pz40Var4;
                i = hgk0Var.getValue() == zbkVar.getValue() ? 1 : 0;
                if (!zBooleanValue || Float.isNaN(agk0Var.l())) {
                    y3mVar = (y3m) zbkVar.getValue();
                } else if (i != 0) {
                    y3mVar = (y3m) hgk0Var.getValue();
                } else {
                    y3mVar = (y3m) vtjVar.a(agk0Var.l());
                    if (y3mVar == null) {
                        y3mVar = (y3m) zbkVar.getValue();
                    }
                }
                if (zD) {
                    y3mVar = y3m.c;
                } else if (!z) {
                    Object value = zbkVar.getValue();
                    y3m y3mVar2 = y3m.f41958a;
                    if (value == y3mVar2 || hgk0Var.getValue() == y3m.b) {
                        y3mVar = y3mVar2;
                    }
                }
                rv2Var.i(vtjVar, y3mVar);
                Boolean bool = Boolean.TRUE;
                ((hgk0) pz40Var2).setValue(bool);
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40Var3.setValue(bool);
                }
                return Unit.f46060a;
            default:
                pru pruVar = (pru) obj2;
                return new yu80(true, false, false, ((iqt) obj5).f15225a.a(), true, ((bzt) obj4).f3488a.a().r, ((dmt) obj3).b(), pruVar.a().b.l, pruVar.a().b.e, pruVar.a().b.C, pruVar.a().O0, (AggregatorScreenModel) obj, iun.f15405a, xun.f41520a, fu80.f10151a, null, this.b);
        }
    }

    public /* synthetic */ c36(iqt iqtVar, bzt bztVar, dmt dmtVar, pru pruVar, AggregatorScreenModel aggregatorScreenModel, boolean z) {
        this.d = iqtVar;
        this.e = bztVar;
        this.f = dmtVar;
        this.c = pruVar;
        this.g = aggregatorScreenModel;
        this.b = z;
    }

    public /* synthetic */ c36(Pair pair, String str, String str2, boolean z, pz40 pz40Var, pz40 pz40Var2) {
        this.d = pair;
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = pz40Var;
        this.g = pz40Var2;
    }
}
