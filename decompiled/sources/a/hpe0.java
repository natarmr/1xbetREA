package a;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hpe0;", "La/nw5;", "La/jjk;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hpe0 extends nw5<jjk> {
    public final phf0 e2 = new phf0("extra_request_key");
    public final nae0 f2 = ltt0.p(this, gpe0.f11679a);
    public static final /* synthetic */ iiy[] h2 = {new ez40(hpe0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(hpe0.class, "binding", "getBinding()Lorg/xplatform/referral/impl/databinding/DialogReferralsDateFilterBinding;", 0)};
    public static final cge0 g2 = new cge0((byte) 2);

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.f2.n(h2[1], this);
        objN.getClass();
        return (jjk) objN;
    }

    @Override // a.nw5
    public final void O0() {
        iiy[] iiyVarArr = h2;
        final byte b = 1;
        iiy iiyVar = iiyVarArr[1];
        nae0 nae0Var = this.f2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        final byte b2 = 0;
        dyb.O(((jjk) objN).c, new Function1(this) { // from class: a.fpe0
            public final /* synthetic */ hpe0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                hpe0 hpe0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        cge0 cge0Var = hpe0.g2;
                        view.getClass();
                        phf0 phf0Var = hpe0Var.e2;
                        iiy[] iiyVarArr2 = hpe0.h2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(hpe0Var, iiyVarArr2[0]), Boolean.TRUE)), hpe0Var, phf0Var.n(hpe0Var, iiyVarArr2[0]));
                        hpe0Var.x0();
                        break;
                    default:
                        cge0 cge0Var2 = hpe0.g2;
                        view.getClass();
                        phf0 phf0Var2 = hpe0Var.e2;
                        iiy[] iiyVarArr3 = hpe0.h2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(hpe0Var, iiyVarArr3[0]), Boolean.FALSE)), hpe0Var, phf0Var2.n(hpe0Var, iiyVarArr3[0]));
                        hpe0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        Object objN2 = nae0Var.n(iiyVarArr[1], this);
        objN2.getClass();
        dyb.O(((jjk) objN2).d, new Function1(this) { // from class: a.fpe0
            public final /* synthetic */ hpe0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                hpe0 hpe0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        cge0 cge0Var = hpe0.g2;
                        view.getClass();
                        phf0 phf0Var = hpe0Var.e2;
                        iiy[] iiyVarArr2 = hpe0.h2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(hpe0Var, iiyVarArr2[0]), Boolean.TRUE)), hpe0Var, phf0Var.n(hpe0Var, iiyVarArr2[0]));
                        hpe0Var.x0();
                        break;
                    default:
                        cge0 cge0Var2 = hpe0.g2;
                        view.getClass();
                        phf0 phf0Var2 = hpe0Var.e2;
                        iiy[] iiyVarArr3 = hpe0.h2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(hpe0Var, iiyVarArr3[0]), Boolean.FALSE)), hpe0Var, phf0Var2.n(hpe0Var, iiyVarArr3[0]));
                        hpe0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.choose_date_period_title);
        string.getClass();
        return string;
    }
}
