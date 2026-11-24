package a;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionDialogUiModel;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionResultUiModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/u2q;", "La/nw5;", "La/nik;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u2q extends nw5<nik> {
    public final nae0 e2 = ltt0.p(this, s2q.f31514a);
    public final phf0 f2 = new phf0("REQUEST_FILTER_DIALOG_KEY");
    public final khf0 g2 = new khf0("BUNDLE_FILTER_ACTION");
    public static final /* synthetic */ iiy[] i2 = {new j0d0(u2q.class, "binding", "getBinding()Lorg/xplatform/sportgame/markets/settings/impl/databinding/DialogFilterActionBinding;", 0), new ez40(u2q.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(u2q.class, "filterActionDialogUiModel", "getFilterActionDialogUiModel()Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;", 0)};
    public static final nek h2 = new nek();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.e2.n(i2[0], this);
        objN.getClass();
        return (nik) objN;
    }

    @Override // a.nw5
    public final void O0() {
        final byte b = 0;
        Object objN = this.e2.n(i2[0], this);
        objN.getClass();
        nik nikVar = (nik) objN;
        TextView textView = nikVar.d;
        TextView textView2 = nikVar.c;
        TextView textView3 = nikVar.b;
        String strH = T0().f47011a;
        if (strH.length() == 0) {
            strH = H(R.string.reset_settings);
            strH.getClass();
        }
        textView.setText(strH);
        textView3.setText(H(T0().c.a()));
        textView2.setText(H(T0().d.a()));
        dyb.c0(textView3, new Function1(this) { // from class: a.q2q
            public final /* synthetic */ u2q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                u2q u2qVar = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        nek nekVar = u2q.h2;
                        view.getClass();
                        phf0 phf0Var = u2qVar.f2;
                        iiy[] iiyVarArr = u2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(u2qVar, iiyVarArr[1]), new FilterActionResultUiModel(u2qVar.T0().b, u2qVar.T0().c.f16551a))), u2qVar, phf0Var.n(u2qVar, iiyVarArr[1]));
                        u2qVar.x0();
                        break;
                    default:
                        nek nekVar2 = u2q.h2;
                        view.getClass();
                        phf0 phf0Var2 = u2qVar.f2;
                        iiy[] iiyVarArr2 = u2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(u2qVar, iiyVarArr2[1]), new FilterActionResultUiModel(u2qVar.T0().b, u2qVar.T0().d.f16551a))), u2qVar, phf0Var2.n(u2qVar, iiyVarArr2[1]));
                        u2qVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.c0(textView2, new Function1(this) { // from class: a.q2q
            public final /* synthetic */ u2q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                u2q u2qVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        nek nekVar = u2q.h2;
                        view.getClass();
                        phf0 phf0Var = u2qVar.f2;
                        iiy[] iiyVarArr = u2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(u2qVar, iiyVarArr[1]), new FilterActionResultUiModel(u2qVar.T0().b, u2qVar.T0().c.f16551a))), u2qVar, phf0Var.n(u2qVar, iiyVarArr[1]));
                        u2qVar.x0();
                        break;
                    default:
                        nek nekVar2 = u2q.h2;
                        view.getClass();
                        phf0 phf0Var2 = u2qVar.f2;
                        iiy[] iiyVarArr2 = u2q.i2;
                        vcc.f0(i120.V(new Pair(phf0Var2.n(u2qVar, iiyVarArr2[1]), new FilterActionResultUiModel(u2qVar.T0().b, u2qVar.T0().d.f16551a))), u2qVar, phf0Var2.n(u2qVar, iiyVarArr2[1]));
                        u2qVar.x0();
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
