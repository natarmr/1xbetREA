package a;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.betting.presentation.filter.FilterActionResultUiModel;
import org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/v2q;", "La/nw5;", "La/oik;", "<init>", "()V", "a/pek", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v2q extends nw5<oik> {
    public final nae0 e2 = ltt0.p(this, t2q.f33227a);
    public final phf0 f2 = new phf0("REQUEST_FILTER_DIALOG_KEY");
    public final khf0 g2 = new khf0("BUNDLE_FILTER_ACTION");
    public static final /* synthetic */ iiy[] i2 = {new j0d0(v2q.class, "binding", "getBinding()Lorg/xplatform/cyber/game/core/databinding/DialogFilterActionBinding;", 0), new ez40(v2q.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(v2q.class, "filterActionDialogUiModel", "getFilterActionDialogUiModel()Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;", 0)};
    public static final pek h2 = new pek();
    public static final String j2 = v2q.class.getSimpleName();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.e2.n(i2[0], this);
        objN.getClass();
        return (oik) objN;
    }

    @Override // a.nw5
    public final void O0() {
        final byte b = 0;
        Object objN = this.e2.n(i2[0], this);
        objN.getClass();
        oik oikVar = (oik) objN;
        TextView textView = oikVar.d;
        TextView textView2 = oikVar.c;
        TextView textView3 = oikVar.b;
        String strH = T0().f46504a;
        if (strH.length() == 0) {
            strH = H(R.string.reset_settings);
            strH.getClass();
        }
        textView.setText(strH);
        textView3.setText(H(T0().c.a()));
        textView2.setText(H(T0().d.a()));
        dyb.c0(textView3, new Function1(this) { // from class: a.r2q
            public final /* synthetic */ v2q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                v2q v2qVar = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        pek pekVar = v2q.h2;
                        view.getClass();
                        phf0 phf0Var = v2qVar.f2;
                        iiy[] iiyVarArr = v2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(v2qVar, iiyVarArr[1]), new FilterActionResultUiModel(v2qVar.T0().b, v2qVar.T0().c.f18313a))), v2qVar, phf0Var.n(v2qVar, iiyVarArr[1]));
                        v2qVar.x0();
                        break;
                    default:
                        pek pekVar2 = v2q.h2;
                        view.getClass();
                        phf0 phf0Var2 = v2qVar.f2;
                        iiy[] iiyVarArr2 = v2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(v2qVar, iiyVarArr2[1]), new FilterActionResultUiModel(v2qVar.T0().b, v2qVar.T0().d.f18313a))), v2qVar, phf0Var2.n(v2qVar, iiyVarArr2[1]));
                        v2qVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.c0(textView2, new Function1(this) { // from class: a.r2q
            public final /* synthetic */ v2q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                v2q v2qVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        pek pekVar = v2q.h2;
                        view.getClass();
                        phf0 phf0Var = v2qVar.f2;
                        iiy[] iiyVarArr = v2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(v2qVar, iiyVarArr[1]), new FilterActionResultUiModel(v2qVar.T0().b, v2qVar.T0().c.f18313a))), v2qVar, phf0Var.n(v2qVar, iiyVarArr[1]));
                        v2qVar.x0();
                        break;
                    default:
                        pek pekVar2 = v2q.h2;
                        view.getClass();
                        phf0 phf0Var2 = v2qVar.f2;
                        iiy[] iiyVarArr2 = v2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(v2qVar, iiyVarArr2[1]), new FilterActionResultUiModel(v2qVar.T0().b, v2qVar.T0().d.f18313a))), v2qVar, phf0Var2.n(v2qVar, iiyVarArr2[1]));
                        v2qVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parentFilterActionDialog;
    }

    public final FilterActionDialogUiModel T0() {
        return (FilterActionDialogUiModel) this.g2.n(this, i2[2]);
    }
}
