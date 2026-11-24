package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalGlowView;

/* JADX INFO: loaded from: classes4.dex */
public final class vzv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38316a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vzv0(Object obj, Object obj2, byte b) {
        this.f38316a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        miu0 miu0VarN;
        byte b = this.f38316a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                riu0 riu0Var = (riu0) ((a8z) obj).getValue();
                wmv wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((wzv0) obj2).n() : miu0VarN;
            default:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((egf) obj2).getContext());
                layoutInflaterFrom.getClass();
                egf egfVar = (egf) obj;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.synthetic_crystal_view, (ViewGroup) egfVar, false);
                egfVar.addView(viewInflate);
                int i = R.id.ivBackground;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivBackground);
                if (imageView != null) {
                    i = R.id.ivCrystal;
                    ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivCrystal);
                    if (imageView2 != null) {
                        i = R.id.ivWinBackground;
                        CrystalGlowView crystalGlowView = (CrystalGlowView) yum0.f(viewInflate, R.id.ivWinBackground);
                        if (crystalGlowView != null) {
                            return new c1o0((FrameLayout) viewInflate, imageView, imageView2, crystalGlowView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
        }
    }
}
