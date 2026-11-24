package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class edg extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ gdg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edg(gdg gdgVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = gdgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new edg(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((edg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        gdg gdgVar = this.j;
        if (!z) {
            z1x.P(obj);
            qc3 qc3Var = gdgVar.i;
            CyberChampParams cyberChampParams = gdgVar.d;
            p7m0 p7m0Var = gdgVar.u;
            p7m0 p7m0Var2 = qc3Var.f;
            do {
                value = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value, new mc3(((mc3) value).f21532a, false)));
            if (((cfb) p7m0Var.getValue()).f4251a.isEmpty()) {
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, cfb.a((cfb) value2, gdgVar.x(), 0, 6)));
            }
            Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(cyberChampParams.c, org.xplatform.cyber.section.api.domain.entity.d.d(cyberChampParams.d));
            j3c j3cVar = gdgVar.f;
            long jLongValue = ((Number) pairC.f46059a).longValue();
            long jLongValue2 = ((Number) pairC.b).longValue();
            this.i = true;
            obj = j3cVar.a(jLongValue, jLongValue2, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ypl0 ypl0Var = (ypl0) obj;
        String str = gdgVar.r ? ypl0Var.c.h : ypl0Var.c.g;
        qc3 qc3Var2 = gdgVar.i;
        int i = gdgVar.d.d;
        byte b = CyberGamesPage.Real.INSTANCE.f46556a;
        String strM0 = gdgVar.s;
        if (i == b) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        String str2 = strM0;
        jc3 jc3Var = new jc3(str);
        int i2 = gdgVar.r ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
        qc3Var2.getClass();
        str2.getClass();
        p7m0 p7m0Var3 = qc3Var2.g;
        do {
            value3 = p7m0Var3.getValue();
        } while (!p7m0Var3.m(value3, new kc3(str2, i2, jc3Var)));
        return Unit.f46060a;
    }
}
