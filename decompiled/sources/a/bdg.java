package a;

import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class bdg extends bnn0 implements xdr {
    public /* synthetic */ String i;
    public /* synthetic */ deg j;
    public final /* synthetic */ gdg k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdg(gdg gdgVar, String str, yje yjeVar) {
        super(3, yjeVar);
        this.k = gdgVar;
        this.l = str;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        bdg bdgVar = new bdg(this.k, this.l, (yje) obj3);
        bdgVar.i = (String) obj;
        bdgVar.j = (deg) obj2;
        return bdgVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        gdg gdgVar = this.k;
        qc3 qc3Var = gdgVar.i;
        String str = this.i;
        deg degVar = this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (str.length() > 0) {
            gdgVar.s = str;
        }
        int i = gdgVar.d.d;
        byte b = CyberGamesPage.Real.INSTANCE.f46556a;
        String strM0 = gdgVar.s;
        if (i == b) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        jc3 jc3Var = new jc3(this.l);
        int i2 = gdgVar.r ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
        qc3Var.getClass();
        strM0.getClass();
        p7m0 p7m0Var = qc3Var.g;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new kc3(strM0, i2, jc3Var)));
        boolean z = degVar instanceof beg;
        p7m0 p7m0Var2 = qc3Var.f;
        do {
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, new mc3(((mc3) value2).f21532a, z)));
        return Unit.f46060a;
    }
}
