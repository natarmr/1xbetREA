package org.xplatform.cyber.game.universal.impl.presentation.durak.view;

import a.hny;
import a.jk3;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CyberDurakCardDeckView extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk3 f46529a;
    public Integer b;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberDurakCardDeckView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.synthetic_durak_card_deck, this);
        int i2 = R.id.cardBack;
        ImageView imageView = (ImageView) yum0.f(this, R.id.cardBack);
        if (imageView != null) {
            i2 = R.id.cardCount;
            TextView textView = (TextView) yum0.f(this, R.id.cardCount);
            if (textView != null) {
                i2 = R.id.ivTrumpSuit;
                ImageView imageView2 = (ImageView) yum0.f(this, R.id.ivTrumpSuit);
                if (imageView2 != null) {
                    i2 = R.id.trumpCard;
                    ImageView imageView3 = (ImageView) yum0.f(this, R.id.trumpCard);
                    if (imageView3 != null) {
                        this.f46529a = new jk3(this, imageView, textView, imageView2, imageView3, (byte) 13);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberDurakCardDeckView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberDurakCardDeckView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
