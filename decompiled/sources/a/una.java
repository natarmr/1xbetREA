package a;

import android.os.Build;
import android.view.View;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class una extends efk0 {
    public int d;
    public int e;

    @Override // a.efk0
    public final int[] c(androidx.recyclerview.widget.b bVar, View view) {
        bVar.getClass();
        view.getClass();
        if (bVar instanceof CardStackLayoutManager) {
            CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) bVar;
            xna xnaVar = cardStackLayoutManager.r;
            if (bVar.D(xnaVar.f) != null) {
                int translationX = (int) view.getTranslationX();
                int translationY = (int) view.getTranslationY();
                if (translationX != 0 || translationY != 0) {
                    float fAbs = (float) (Math.abs(translationX) / ((double) view.getWidth()));
                    pek pekVar = ven.b;
                    int i = this.e;
                    int i2 = this.d;
                    if (i < i2) {
                        i = i2;
                    }
                    pekVar.getClass();
                    ven venVar = i > 4000 ? ven.Normal : ven.Slow;
                    cardStackLayoutManager.q.getClass();
                    if (0.3f <= fAbs) {
                        ron0 ron0Var = cardStackLayoutManager.s;
                        ron0 ron0Var2 = new ron0(ron0Var.f30848a, venVar.f37294a, bpn0.f2993a, ron0Var.d);
                        if (Build.VERSION.SDK_INT >= 30) {
                            ckb.Z(view, 16);
                        }
                        cardStackLayoutManager.s = ron0Var2;
                        xnaVar.g = xnaVar.f + 1;
                        this.d = 0;
                        this.e = 0;
                        tna tnaVar = new tna(sna.b, cardStackLayoutManager);
                        tnaVar.f32207a = xnaVar.f;
                        bVar.S0(tnaVar);
                    } else {
                        tna tnaVar2 = new tna(sna.c, cardStackLayoutManager);
                        tnaVar2.f32207a = xnaVar.f;
                        bVar.S0(tnaVar2);
                    }
                }
            }
        }
        return new int[2];
    }

    @Override // a.efk0
    public final int f(androidx.recyclerview.widget.b bVar, int i, int i2) {
        this.d = (int) Math.abs(i);
        this.e = (int) Math.abs(i2);
        if (bVar instanceof CardStackLayoutManager) {
            return ((CardStackLayoutManager) bVar).r.f;
        }
        return -1;
    }
}
