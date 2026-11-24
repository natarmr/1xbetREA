package a;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/ikr0;", "La/stl;", "La/jkr0;", "La/i620;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ikr0 extends stl<jkr0> implements i620 {
    public wjk j2;
    public static final /* synthetic */ iiy[] m2 = {new ez40(ikr0.class, "totoName", "getTotoName()Ljava/lang/String;", 0), new ez40(ikr0.class, "outcomeCount", "getOutcomeCount()Ljava/lang/String;", 0), new ez40(ikr0.class, "isPromoEnable", "isPromoEnable()Z", 0), new j0d0(ikr0.class, "binding", "getBinding()Lorg/xplatform/toto_bet/impl/databinding/TotoBetMakeBetDsBottomsheetBinding;", 0)};
    public static final m6m0 l2 = new m6m0((byte) 24);
    public final phf0 g2 = new phf0("TOTO_NAME");
    public final phf0 h2 = new phf0("OUTCOME_COUNT");
    public final cgx0 i2 = new cgx0("IS_PROMO_ENABLE");
    public final nae0 k2 = ltt0.p(this, hkr0.f13221a);

    /* JADX WARN: Multi-variable type inference failed */
    public static e920 V0(Fragment fragment) {
        Fragment fragment2 = fragment.y;
        if (fragment2 != 0) {
            return fragment2 instanceof e920 ? (e920) fragment2 : V0(fragment2);
        }
        jf4.n("MakeBetLoader not found");
        return null;
    }

    @Override // a.stl
    public final void S0() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
        jkr0 jkr0VarQ0 = Q0();
        TextView textView = jkr0VarQ0.e;
        ViewPager2 viewPager2 = jkr0VarQ0.f;
        iiy[] iiyVarArr = m2;
        textView.setText(this.g2.n(this, iiyVarArr[0]));
        jkr0VarQ0.c.setText(this.h2.n(this, iiyVarArr[1]));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzs0.SIMPLE);
        iiy iiyVar = iiyVarArr[2];
        cgx0 cgx0Var = this.i2;
        if (cgx0Var.n(this, iiyVar).booleanValue()) {
            arrayList.add(zzs0.PROMO);
        }
        viewPager2.setOffscreenPageLimit(arrayList.size());
        viewPager2.setAdapter(new ft6(this, arrayList));
        Q0().d.setVisibility(cgx0Var.n(this, iiyVarArr[2]).booleanValue() ? 0 : 8);
        if (cgx0Var.n(this, iiyVarArr[2]).booleanValue()) {
            DsSegmentedGroup dsSegmentedGroup = Q0().d;
            vvh0 vvh0Var = new vvh0();
            vvh0Var.a(H(R.string.bet_type_simple));
            DsSegmentedGroup.a(dsSegmentedGroup, vvh0Var, false, 6);
            vvh0 vvh0Var2 = new vvh0();
            vvh0Var2.a(H(R.string.bet_type_promo));
            DsSegmentedGroup.a(dsSegmentedGroup, vvh0Var2, false, 6);
            dsSegmentedGroup.setSelectedPosition(0);
            new sbx0((byte) 13).b(Q0().f);
            Q0().f.setUserInputEnabled(false);
            Q0().f.c(new xp6(this, (byte) 14));
        }
        DsSegmentedGroup.f(Q0().d, new lcr0(this, (byte) 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.j2 = (wjk) context;
        }
        wjk wjkVar = this.j2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.stl
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final jkr0 Q0() {
        Object objN = this.k2.n(m2[3], this);
        objN.getClass();
        return (jkr0) objN;
    }

    public final void X0(boolean z) {
        E0(!z);
        V0(this).v(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        wjk wjkVar = this.j2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }
}
