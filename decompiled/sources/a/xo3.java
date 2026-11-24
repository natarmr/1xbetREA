package a;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xo3 extends vo3 {
    public final n0o0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo3(Context context, Intent intent) {
        super(context, intent);
        context.getClass();
        intent.getClass();
        this.y = maz.b(new a13(this, (byte) 13));
    }

    @Override // a.a56
    public final RemoteViews b() {
        return new RemoteViews(this.f254a.getPackageName(), R.layout.widget_small_item_game);
    }

    @Override // a.a56
    public final RemoteViews c() {
        Context context = this.f254a;
        return context.getResources().getConfiguration().fontScale > 1.29f ? new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game_doubles) : new RemoteViews(context.getPackageName(), R.layout.widget_small_item_game_doubles);
    }

    @Override // a.a56
    public final RemoteViews d() {
        this.g = wdv0.b;
        Context context = this.f254a;
        return context.getResources().getConfiguration().fontScale > 1.29f ? new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game_quarter) : new RemoteViews(context.getPackageName(), R.layout.widget_small_item_game_quarter);
    }

    @Override // a.vo3
    public final int m(xdv0 xdv0Var) {
        return n(xdv0Var);
    }

    @Override // a.vo3
    public final void s() {
        ((kdv0) this.y.getValue()).g(this);
    }
}
