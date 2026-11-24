package a;

import a.brm0;
import a.hu0;
import a.iiy;
import a.m1r;
import a.m71;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hc1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12797a = 0;
    public final /* synthetic */ kc1 b;
    public final /* synthetic */ f02 c;

    public /* synthetic */ hc1(kc1 kc1Var, f02 f02Var) {
        this.b = kc1Var;
        this.c = f02Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12797a;
        f02 f02Var = this.c;
        kc1 kc1Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                final String str = f02Var.f8698a;
                final String str2 = f02Var.b;
                final String str3 = f02Var.c;
                final boolean z = ((xb1) kc1Var.D()).f40578a.f && !((xb1) kc1Var.D()).c;
                final long j = ((xb1) kc1Var.D()).g;
                final long j2 = ((xb1) kc1Var.D()).f;
                k0w0Var.k(new FragmentScreen(str, str2, str3, z, j, j2) { // from class: org.xplatform.aggregator.game.impl.game.navigation.AggregatorGameScreens$AggregatorGameFragmentScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f46271a;
                    public final String b;
                    public final String c;
                    public final boolean d;
                    public final long e;
                    public final long f;

                    {
                        str2.getClass();
                        str3.getClass();
                        this.f46271a = str;
                        this.b = str2;
                        this.c = str3;
                        this.d = z;
                        this.e = j;
                        this.f = j2;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        hu0.Y1.getClass();
                        String str4 = this.b;
                        str4.getClass();
                        String str5 = this.c;
                        str5.getClass();
                        hu0 hu0Var = new hu0();
                        iiy[] iiyVarArr = hu0.Z1;
                        hu0Var.L1.x(hu0Var, iiyVarArr[0], str4);
                        hu0Var.M1.x(hu0Var, iiyVarArr[1], this.f46271a);
                        hu0Var.N1.x(hu0Var, iiyVarArr[2], str5);
                        hu0Var.O1.v(hu0Var, iiyVarArr[3], this.d);
                        hu0Var.P1.j(hu0Var, iiyVarArr[4], this.e);
                        hu0Var.Q1.j(hu0Var, iiyVarArr[5], this.f);
                        return hu0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
            default:
                final long j3 = ((xb1) kc1Var.D()).f40578a.f5778a;
                final boolean z2 = ((xb1) kc1Var.D()).f40578a.g;
                final boolean z3 = ((xb1) kc1Var.D()).f40578a.i;
                final boolean z4 = ((xb1) kc1Var.D()).c;
                final String str4 = f02Var.b;
                final String str5 = f02Var.c;
                final long j4 = ((xb1) kc1Var.D()).g;
                final boolean z5 = ((xb1) kc1Var.D()).f40578a.j;
                final boolean z6 = ((xb1) kc1Var.D()).f40578a.e;
                final String str6 = ((xb1) kc1Var.D()).f40578a.l;
                ((k0w0) obj).k(new FragmentScreen(j3, z2, z3, z4, str4, str5, j4, z5, z6, str6) { // from class: org.xplatform.aggregator.game.impl.game.navigation.AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46272a;
                    public final boolean b;
                    public final boolean c;
                    public final boolean d;
                    public final String e;
                    public final String f;
                    public final long g;
                    public final boolean h;
                    public final boolean i;
                    public final String j;

                    {
                        brm0.B(str4, str5, str6);
                        this.f46272a = j3;
                        this.b = z2;
                        this.c = z3;
                        this.d = z4;
                        this.e = str4;
                        this.f = str5;
                        this.g = j4;
                        this.h = z5;
                        this.i = z6;
                        this.j = str6;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        m71.e2.getClass();
                        String str7 = this.e;
                        str7.getClass();
                        String str8 = this.f;
                        str8.getClass();
                        String str9 = this.j;
                        str9.getClass();
                        m71 m71Var = new m71();
                        iiy[] iiyVarArr = m71.f2;
                        m71Var.M1.j(m71Var, iiyVarArr[0], this.f46272a);
                        m71Var.N1.v(m71Var, iiyVarArr[1], this.b);
                        m71Var.O1.v(m71Var, iiyVarArr[2], this.c);
                        m71Var.P1.v(m71Var, iiyVarArr[3], this.d);
                        m71Var.Q1.u(m71Var, iiyVarArr[4], str7);
                        m71Var.R1.x(m71Var, iiyVarArr[5], str8);
                        m71Var.S1.j(m71Var, iiyVarArr[6], this.g);
                        m71Var.U1.v(m71Var, iiyVarArr[7], this.h);
                        m71Var.V1.v(m71Var, iiyVarArr[8], this.i);
                        m71Var.W1.x(m71Var, iiyVarArr[9], str9);
                        return m71Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
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

    public /* synthetic */ hc1(f02 f02Var, kc1 kc1Var) {
        this.c = f02Var;
        this.b = kc1Var;
    }
}
