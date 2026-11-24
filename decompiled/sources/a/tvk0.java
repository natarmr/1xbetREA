package a;

import a.ik30;
import a.m1r;
import a.v9r0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tvk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34604a;
    public final /* synthetic */ iwk0 b;
    public final /* synthetic */ ttk0 c;

    public /* synthetic */ tvk0(iwk0 iwk0Var, ttk0 ttk0Var, byte b) {
        this.f34604a = b;
        this.b = iwk0Var;
        this.c = ttk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34604a;
        ttk0 ttk0Var = this.c;
        iwk0 iwk0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                final m6m0 m6m0Var = iwk0Var.v0;
                final int i = ttk0Var.f34513a;
                m6m0Var.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.special_event.impl.top_players.navigation.TopPlayersScreenFactoryImpl$getScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        v9r0.O1.getClass();
                        v9r0 v9r0Var = new v9r0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("BUNDLE_EVENT_ID", i);
                        v9r0Var.s0(bundle);
                        return v9r0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        m6m0Var.getClass();
                        v9r0.O1.getClass();
                        return v9r0.Q1;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
            default:
                k0w0Var.getClass();
                mk30 mk30Var = iwk0Var.M;
                final int i2 = ttk0Var.f34513a;
                mk30Var.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.special_event.impl.medal_statistic.navigation.MedalStatisticScreenFactoryImpl$getMedalStatisticScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        ik30.W1.getClass();
                        ik30 ik30Var = new ik30();
                        ik30Var.M1.I(ik30Var, ik30.X1[0], i2);
                        return ik30Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        ik30.W1.getClass();
                        return ik30.Y1;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
