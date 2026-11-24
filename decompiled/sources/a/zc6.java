package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44152a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zc6(pu90 pu90Var, pj30 pj30Var, vj30 vj30Var, int i, int i2, ar8 ar8Var) {
        this.f44152a = (byte) 1;
        this.d = pu90Var;
        this.e = pj30Var;
        this.f = vj30Var;
        this.b = i;
        this.c = i2;
        this.g = ar8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44152a;
        int i = 0;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj5;
                BetZip betZip = (BetZip) obj4;
                ao6 ao6Var = (ao6) obj3;
                bo6 bo6Var = (bo6) obj2;
                View view = (View) obj;
                view.getClass();
                boolean z = ((ah) cpVar.u()).c;
                yfu0 yfu0Var = cpVar.u;
                View view2 = cpVar.f40887a;
                nlr nlrVar = (nlr) yfu0Var;
                TextView textView = nlrVar.d;
                FlexboxLayout flexboxLayout = nlrVar.c;
                TextView textView2 = nlrVar.e;
                boolean z2 = betZip.f;
                textView.setCompoundDrawablesWithIntrinsicBounds(z2 ? R.drawable.ic_lock_icon : 0, 0, 0, 0);
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, betZip.w ? R.drawable.ic_eye_ : 0, 0);
                view2.setBackgroundColor(z2 ? this.b : this.c);
                dyb.N(view2, ymx.INTERVAL_500, new qo5(betZip, ao6Var, (byte) 15));
                nlrVar.b.setTag(R.id.tag_id, betZip);
                textView2.setText(betZip.u + Separators.SP + betZip.t);
                nlrVar.d.setText(ju70.M(betZip, z));
                int childCount = flexboxLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = flexboxLayout.getChildAt(i2);
                    childAt.getClass();
                    ad6 ad6Var = (ad6) childAt;
                    if (ad6Var != view) {
                        ad6Var.setSelected(false);
                    } else {
                        ad6Var.setSelected(true);
                        bo6Var.invoke(Long.valueOf(((ah) cpVar.u()).b), Integer.valueOf(i2));
                    }
                }
                break;
            case 1:
                zq8.d((ou90) obj, (pu90) obj5, (pj30) obj4, ((vj30) obj3).getLayoutDirection(), this.b, this.c, ((ar8) obj2).f1333a);
                break;
            default:
                pu90[] pu90VarArr = (pu90[]) obj5;
                x5d x5dVar = (x5d) obj4;
                vj30 vj30Var = (vj30) obj3;
                int[] iArr = (int[]) obj2;
                ou90 ou90Var = (ou90) obj;
                int length = pu90VarArr.length;
                int i3 = 0;
                while (i < length) {
                    pu90 pu90Var = pu90VarArr[i];
                    int i4 = i3 + 1;
                    pu90Var.getClass();
                    Object objN = pu90Var.n();
                    mhg0 mhg0Var = objN instanceof mhg0 ? (mhg0) objN : null;
                    k6z layoutDirection = vj30Var.getLayoutDirection();
                    wvb wvbVar = mhg0Var != null ? mhg0Var.c : null;
                    int i5 = this.b;
                    ou90Var.g(pu90Var, wvbVar != null ? wvbVar.K(i5, pu90Var.f27604a, layoutDirection, pu90Var, this.c) : x5dVar.b.a(pu90Var.f27604a, i5, layoutDirection), iArr[i3], 0.0f);
                    i++;
                    i3 = i4;
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zc6(byte b, int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f44152a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
        this.f = obj3;
        this.g = obj4;
    }
}
