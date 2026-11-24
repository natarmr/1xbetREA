package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yr50 extends i26 {
    public final /* synthetic */ byte g;
    public final Object h;
    public final wdr i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr50(byte b, wdr wdrVar, Object obj) {
        super(3, (List) null);
        this.g = b;
        this.h = obj;
        this.i = wdrVar;
    }

    @Override // a.i26
    public final int A(int i) {
        switch (this.g) {
            case 0:
                return R.layout.item_catalog_header;
            default:
                int i2 = rij.x;
                return R.layout.item_weekly_reward_day;
        }
    }

    @Override // a.i26
    public final v46 z(View view) {
        byte b = this.g;
        wdr wdrVar = this.i;
        Object obj = this.h;
        view.getClass();
        switch (b) {
            case 0:
                return new zr50(view, (RecyclerView) obj, (jt50) wdrVar);
            default:
                return new rij(view, (avs0) obj, (g6v0) wdrVar);
        }
    }
}
