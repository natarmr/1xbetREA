package a;

import android.view.View;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ls60 extends i26 {
    public final Function1 g;

    public ls60() {
        iun iunVar = iun.f15405a;
        wk60 wk60Var = new wk60((byte) 2);
        iunVar.getClass();
        super(iunVar, wk60Var);
        this.g = wk60Var;
    }

    @Override // a.i26
    public final int A(int i) {
        int i2 = v70.x;
        return R.layout.view_bonus_info_item;
    }

    @Override // a.i26
    public final v46 z(View view) {
        view.getClass();
        return new v70(view, this.g);
    }
}
