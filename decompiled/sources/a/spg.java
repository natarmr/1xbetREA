package a;

import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class spg implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqg f32592a;

    public spg(vqg vqgVar) {
        this.f32592a = vqgVar;
    }

    public final void a(String str) {
        vqg vqgVar = this.f32592a;
        vqgVar.getClass();
        if (str.length() == 0) {
            vqgVar.D.f(new pqg(R.string.statistics_dont_found_for_event));
            return;
        }
        hzg hzgVar = vqgVar.d;
        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = vqgVar.b;
        uzg uzgVar = (uzg) hzgVar;
        uzgVar.h(str, cyberGameStatisticScreenParams.d, cyberGameStatisticScreenParams.b);
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f32592a, vqg.class, "onLastMatchesGameClick", "onLastMatchesGameClick(Ljava/lang/String;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof spg) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
