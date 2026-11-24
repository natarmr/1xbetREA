package a;

import android.view.View;
import java.util.ArrayList;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;

/* JADX INFO: loaded from: classes4.dex */
public final class jah implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberPlayerCardsView f16189a;
    public final /* synthetic */ hah b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public jah(CyberPlayerCardsView cyberPlayerCardsView, hah hahVar, ArrayList arrayList, boolean z) {
        this.f16189a = cyberPlayerCardsView;
        this.b = hahVar;
        this.c = arrayList;
        this.d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        int i9 = CyberPlayerCardsView.o;
        this.f16189a.b(this.b, this.c, this.d);
    }
}
