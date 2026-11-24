package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q77 extends i26 {
    public final /* synthetic */ byte g = 1;
    public final String h;
    public final Object i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q77(List list, y1s0 y1s0Var, String str, String str2) {
        super(list, new ij4((byte) 29));
        list.getClass();
        str2.getClass();
        this.i = y1s0Var;
        this.h = str;
        this.j = str2;
    }

    @Override // a.i26
    public final int A(int i) {
        switch (this.g) {
            case 0:
                return R.layout.item_selector_type;
            default:
                throw new ss3((byte) 29);
        }
    }

    @Override // a.i26
    /* JADX INFO: renamed from: E */
    public v46 p(ViewGroup viewGroup, int i) {
        View viewInflate = viewGroup;
        switch (this.g) {
            case 1:
                if (i != 0) {
                    viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
                }
                viewInflate.getClass();
                if (i == R.layout.daily_tournament_item_result_fg) {
                    return new v70(this, viewInflate, (byte) 3);
                }
                return i == R.layout.daily_tournament_item_prize_fg ? new v70(this, viewInflate, (byte) 2) : new gw3(viewInflate);
            default:
                return super.p(viewGroup, i);
        }
    }

    @Override // a.i26, a.yge0
    public int f(int i) {
        switch (this.g) {
            case 1:
                return ((px40) ((ArrayList) this.f).get(i)).a();
            default:
                return super.f(i);
        }
    }

    @Override // a.i26, a.yge0
    public /* bridge */ /* synthetic */ xhe0 p(ViewGroup viewGroup, int i) {
        switch (this.g) {
            case 1:
                return p(viewGroup, i);
            default:
                return super.p(viewGroup, i);
        }
    }

    @Override // a.i26
    public final v46 z(View view) {
        byte b = this.g;
        view.getClass();
        switch (b) {
            case 0:
                return new p77(this, view, this.h, (ur6) this.i);
            default:
                throw new ss3((byte) 29);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q77(List list, String str, ur6 ur6Var, sys0 sys0Var) {
        super(list, ur6Var);
        list.getClass();
        str.getClass();
        this.h = str;
        this.i = ur6Var;
        this.j = sys0Var;
    }
}
