package a;

import android.view.View;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickItemView;

/* JADX INFO: loaded from: classes3.dex */
public final class w2l implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DotaBanPickItemView f38454a;
    public final DotaBanPickItemView b;

    public w2l(DotaBanPickItemView dotaBanPickItemView, DotaBanPickItemView dotaBanPickItemView2) {
        this.f38454a = dotaBanPickItemView;
        this.b = dotaBanPickItemView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38454a;
    }
}
