package a;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ap3 extends zo3 {
    public final n0o0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap3(Context context, Intent intent) {
        super(context, intent, (byte) 0);
        context.getClass();
        intent.getClass();
        this.s = maz.b(new a13(this, (byte) 15));
    }

    @Override // a.a56
    public final RemoteViews b() {
        Context context = this.f254a;
        return context.getResources().getConfiguration().fontScale > 1.29f ? new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game) : new RemoteViews(context.getPackageName(), R.layout.widget_small_item_game);
    }

    @Override // a.a56
    public final RemoteViews c() {
        return new RemoteViews(this.f254a.getPackageName(), R.layout.widget_small_item_game_doubles);
    }

    @Override // a.a56
    public final RemoteViews d() {
        this.g = wdv0.b;
        return new RemoteViews(this.f254a.getPackageName(), R.layout.widget_small_item_game_quarter);
    }

    @Override // a.zo3
    public final void l() {
        ((kdv0) this.s.getValue()).a(this);
        super.l();
    }
}
