package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickHeroItemView;

/* JADX INFO: loaded from: classes3.dex */
public final class l2l implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f19314a;
    public final DotaBanPickHeroItemView b;
    public final DotaBanPickHeroItemView c;

    public l2l(LinearLayout linearLayout, DotaBanPickHeroItemView dotaBanPickHeroItemView, DotaBanPickHeroItemView dotaBanPickHeroItemView2) {
        this.f19314a = linearLayout;
        this.b = dotaBanPickHeroItemView;
        this.c = dotaBanPickHeroItemView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19314a;
    }
}
