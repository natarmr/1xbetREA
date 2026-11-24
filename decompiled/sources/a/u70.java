package a;

import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class u70 extends i26 {
    public final /* synthetic */ byte g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(dxv dxvVar, List list) {
        super(2, list);
        this.g = (byte) 1;
        list.getClass();
        this.h = dxvVar;
    }

    @Override // a.i26
    public final int A(int i) {
        switch (this.g) {
            case 0:
                return R.layout.item_african_roulette_bet;
            case 1:
                return R.layout.history_time_menu_item;
            default:
                return R.layout.item_spin_and_win_bet;
        }
    }

    @Override // a.i26
    public final v46 z(View view) {
        byte b = this.g;
        Object obj = this.h;
        view.getClass();
        switch (b) {
            case 0:
                return new v70(view, (i80) obj);
            case 1:
                return new v70(this, view);
            default:
                return new v70(view, (cyk0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u70(Function1 function1, byte b) {
        super(3, (List) null);
        this.g = b;
        this.h = function1;
    }
}
