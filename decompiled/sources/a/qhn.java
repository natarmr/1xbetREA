package a;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;

/* JADX INFO: loaded from: classes4.dex */
public final class qhn implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasternNightsCellGameView f28747a;
    public final TextView b;
    public final EasternNightsGameView c;
    public final Button d;
    public final View e;

    public qhn(EasternNightsCellGameView easternNightsCellGameView, TextView textView, EasternNightsGameView easternNightsGameView, Button button, View view) {
        this.f28747a = easternNightsCellGameView;
        this.b = textView;
        this.c = easternNightsGameView;
        this.d = button;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28747a;
    }
}
