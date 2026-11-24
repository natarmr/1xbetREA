package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;

/* JADX INFO: loaded from: classes4.dex */
public final class p1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f26214a;
    public final ImageView b;
    public final View c;

    public p1o0(FrameLayout frameLayout, ImageView imageView, View view) {
        this.f26214a = frameLayout;
        this.b = imageView;
        this.c = view;
    }

    public static p1o0 a(LayoutInflater layoutInflater, CyberPlayerCardsView cyberPlayerCardsView) {
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_durak_player_card, (ViewGroup) cyberPlayerCardsView, false);
        int i = R.id.ivCard;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivCard);
        if (imageView != null) {
            i = R.id.shadow;
            View viewF = yum0.f(viewInflate, R.id.shadow);
            if (viewF != null) {
                return new p1o0((FrameLayout) viewInflate, imageView, viewF);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26214a;
    }
}
