package a;

import android.javax.sip.header.SubscriptionStateHeader;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/im60;", "La/nw5;", "La/zik;", "<init>", "()V", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class im60 extends nw5<zik> {
    public static final /* synthetic */ iiy[] i2 = {new ez40(im60.class, SubscriptionStateHeader.ACTIVE, "getActive()Z", 0), new ez40(im60.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(im60.class, "hasFavorite", "getHasFavorite()Z", 0), new j0d0(im60.class, "binding", "getBinding()Lorg/xplatform/games_list/databinding/DialogOneXGameActionBinding;", 0)};
    public final cgx0 e2 = new cgx0("ACTIVE_FLAG");
    public final phf0 f2 = new phf0("REQUEST_KEY");
    public final cgx0 g2 = new cgx0("HAS_FAVORITE_KEY");
    public final nae0 h2 = ltt0.p(this, hm60.f13292a);

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.h2.n(i2[3], this);
        objN.getClass();
        return (zik) objN;
    }

    @Override // a.nw5
    public final void O0() {
        iiy[] iiyVarArr = i2;
        Object objN = this.h2.n(iiyVarArr[3], this);
        objN.getClass();
        zik zikVar = (zik) objN;
        TextView textView = zikVar.c;
        iiy iiyVar = iiyVarArr[2];
        cgx0 cgx0Var = this.g2;
        if (!cgx0Var.n(this, iiyVar).booleanValue()) {
            textView.setVisibility(8);
            zikVar.b.setVisibility(8);
            return;
        }
        final byte b = 0;
        iiy iiyVar2 = iiyVarArr[0];
        cgx0 cgx0Var2 = this.e2;
        if (cgx0Var2.n(this, iiyVar2).booleanValue() && cgx0Var.n(this, iiyVarArr[2]).booleanValue()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_favorite_inactive_dialog_new, 0, 0, 0);
            textView.setText(H(R.string.favorites_remove));
            dyb.O(textView, new Function1(this) { // from class: a.gm60
                public final /* synthetic */ im60 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    im60 im60Var = this.b;
                    View view = (View) obj;
                    switch (b2) {
                        case 0:
                            iiy[] iiyVarArr2 = im60.i2;
                            view.getClass();
                            im60Var.T0();
                            break;
                        default:
                            iiy[] iiyVarArr3 = im60.i2;
                            view.getClass();
                            im60Var.T0();
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else {
            if (cgx0Var2.n(this, iiyVarArr[0]).booleanValue() || !cgx0Var.n(this, iiyVarArr[2]).booleanValue()) {
                return;
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_favorite_active_dialog_new, 0, 0, 0);
            textView.setText(H(R.string.favorites_add));
            final byte b2 = 1;
            dyb.O(textView, new Function1(this) { // from class: a.gm60
                public final /* synthetic */ im60 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    im60 im60Var = this.b;
                    View view = (View) obj;
                    switch (b3) {
                        case 0:
                            iiy[] iiyVarArr2 = im60.i2;
                            view.getClass();
                            im60Var.T0();
                            break;
                        default:
                            iiy[] iiyVarArr3 = im60.i2;
                            view.getClass();
                            im60Var.T0();
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.select_action);
        string.getClass();
        return string;
    }

    public final void T0() {
        vcc.f0(i120.V(new Pair("CHANGE_FAVORITE_STATUS_KEY", new String())), this, this.f2.n(this, i2[1]));
        x0();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void e0() {
        BottomSheetBehavior bottomSheetBehaviorM0;
        super.e0();
        if (!o0().getResources().getBoolean(R.bool.isTablet) || (bottomSheetBehaviorM0 = M0()) == null) {
            return;
        }
        bottomSheetBehaviorM0.l = (int) G().getDimension(R.dimen.size_512);
    }
}
