package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayedCardsTableView;

/* JADX INFO: loaded from: classes4.dex */
public final class o1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberPlayedCardsTableView f24492a;
    public final n1o0 b;
    public final n1o0 c;
    public final n1o0 d;
    public final n1o0 e;
    public final n1o0 f;
    public final n1o0 g;

    public o1o0(CyberPlayedCardsTableView cyberPlayedCardsTableView, n1o0 n1o0Var, n1o0 n1o0Var2, n1o0 n1o0Var3, n1o0 n1o0Var4, n1o0 n1o0Var5, n1o0 n1o0Var6) {
        this.f24492a = cyberPlayedCardsTableView;
        this.b = n1o0Var;
        this.c = n1o0Var2;
        this.d = n1o0Var3;
        this.e = n1o0Var4;
        this.f = n1o0Var5;
        this.g = n1o0Var6;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24492a;
    }
}
