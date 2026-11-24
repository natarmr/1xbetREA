package a;

import a.m1r;
import a.rwv;
import a.ufx;
import a.yo40;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.statistic.lastgames.presentation.screen.LastGamesScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u400 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35022a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u400(Object obj, Object obj2, byte b) {
        this.f35022a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj) {
        f120 f120Var = (f120) this.b;
        String str = (String) this.c;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        rl70 rl70Var = f120Var.v;
        String str2 = ((v020) f120Var.D()).f;
        long j = f120Var.p;
        rl70Var.getClass();
        k0w0Var.h(rl70.d(j, str, str2));
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        n3q n3qVar;
        int i;
        f120 f120Var = (f120) this.b;
        jam0 jam0Var = (jam0) this.c;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        tqt tqtVar = f120Var.Z;
        String str = ((v020) f120Var.D()).f;
        long j = f120Var.p;
        int iOrdinal = jam0Var.ordinal();
        if (iOrdinal == 4) {
            n3qVar = n3q.f22862a;
        } else if (iOrdinal != 5) {
            n3qVar = iOrdinal != 6 ? n3q.f22862a : n3q.c;
        } else {
            n3qVar = n3q.b;
        }
        int iOrdinal2 = jam0Var.ordinal();
        if (iOrdinal2 != 4) {
            i = iOrdinal2 != 5 ? 0 : ((v020) f120Var.D()).s.c;
        } else {
            i = ((v020) f120Var.D()).r.c;
        }
        int i2 = i;
        tqtVar.getClass();
        k0w0Var.h(new LastGamesScreen(str, j, n3qVar, i2));
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        w220 w220Var = (w220) this.b;
        pmt0 pmt0Var = (pmt0) this.c;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        tqt tqtVar = w220Var.J;
        final boolean z = pmt0Var != pmt0.c;
        tqtVar.getClass();
        k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.feature.hiddenbetting.navigation.HiddenBettingUpdateScreenFactoryImpl$provideHiddenBettingUpdateScreen$1
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                rwv.P1.getClass();
                rwv rwvVar = new rwv();
                rwvVar.O1.v(rwvVar, rwv.Q1[1], z);
                return rwvVar;
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
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) this.b;
        a720 a720Var = (a720) this.c;
        int iIntValue = ((Integer) obj).intValue();
        xuz xuzVar = a720.x2;
        fo7 fo7Var = (fo7) CollectionsKt.W(iIntValue, list);
        String strH = fo7Var != null ? a720Var.H(fo7Var.f9867a) : null;
        return strH == null ? "" : strH;
    }

    private final Object h(Object obj) {
        y920 y920Var = (y920) this.b;
        String str = (String) this.c;
        Throwable th = (Throwable) obj;
        th.getClass();
        y920Var.f.b(th, new j920(y920Var, (byte) 0));
        au0 au0Var = y920Var.g;
        au0Var.getClass();
        b1j.v(str, au0Var.f1455a, 3359L);
        i8i.D("promocode", str, y920Var.e.b, "betkit_bet_error");
        y920Var.m.f(r920.f30057a);
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        txu txuVar = (txu) this.b;
        StepInputUiModel stepInputUiModel = (StepInputUiModel) this.c;
        bnk0 bnk0Var = (bnk0) obj;
        bnk0Var.getClass();
        double d = txuVar.i;
        if (d > 0.0d) {
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            pzw.E(bnk0Var, cy7.e(pn40.p(stepInputUiModel.f, d)), 0, R.color.static_green, 0, 0, 54);
        } else if (d < 0.0d) {
            int i2 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            pzw.E(bnk0Var, cy7.e(pn40.p(stepInputUiModel.f, d)), 0, 0, 0, 0, 62);
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        du20 du20Var = (du20) this.b;
        f630 f630Var = (f630) this.c;
        cp cpVar = (cp) obj;
        cpVar.getClass();
        ConstraintLayout constraintLayout = ((iux) cpVar.u).f15418a;
        constraintLayout.getClass();
        dyb.c0(constraintLayout, new bw20((Object) du20Var, (Object) cpVar, (byte) 0));
        cpVar.t(new bw20(cpVar, (Object) f630Var, (byte) 2));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        du20 du20Var = (du20) this.b;
        x530 x530Var = (x530) this.c;
        cp cpVar = (cp) obj;
        cpVar.getClass();
        ConstraintLayout constraintLayout = ((hux) cpVar.u).f13701a;
        constraintLayout.getClass();
        dyb.c0(constraintLayout, new u400(du20Var, cpVar, (byte) 29));
        cpVar.t(new bw20(cpVar, (Object) x530Var, (byte) 1));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x03fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:134:0x0451  */
    /* JADX WARN: Code duplicated, block: B:137:0x047b  */
    /* JADX WARN: Code duplicated, block: B:139:0x048b  */
    /* JADX WARN: Code duplicated, block: B:141:0x048e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0491  */
    /* JADX WARN: Code duplicated, block: B:145:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:152:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:156:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:160:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x051f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0534  */
    /* JADX WARN: Code duplicated, block: B:169:0x053a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0543  */
    /* JADX WARN: Code duplicated, block: B:173:0x0549  */
    /* JADX WARN: Code duplicated, block: B:174:0x054b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0551  */
    /* JADX WARN: Code duplicated, block: B:179:0x0560  */
    /* JADX WARN: Code duplicated, block: B:181:0x0570  */
    /* JADX WARN: Code duplicated, block: B:184:0x0592  */
    /* JADX WARN: Code duplicated, block: B:186:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:187:0x05af  */
    /* JADX WARN: Code duplicated, block: B:189:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:191:0x05be  */
    /* JADX WARN: Code duplicated, block: B:193:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:195:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:198:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:200:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:205:0x0626  */
    /* JADX WARN: Code duplicated, block: B:235:0x085e  */
    /* JADX WARN: Code duplicated, block: B:238:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:240:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:241:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:244:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:245:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:247:0x0901  */
    /* JADX WARN: Code duplicated, block: B:359:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x092f A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        mj80 mj80Var;
        int i2;
        int i3;
        int i4;
        v0b v0bVar;
        int i5;
        jwa gwaVar;
        jwa hwaVar;
        ArrayList arrayList;
        int i6;
        boolean z;
        li10 li10Var;
        int i7;
        String strA;
        int i8;
        char c;
        ov0 ov0Var;
        String str;
        String str2;
        wi10 wi10Var;
        qza nzaVar;
        oza ozaVar;
        boolean z2;
        jwa hwaVar2;
        int i9;
        wi10 wi10Var2;
        ArrayList arrayList2;
        String str3;
        int iOrdinal;
        String str4;
        String str5;
        StringBuilder sb;
        int i10;
        int i11;
        char c2;
        o0b o0bVar;
        StringBuilder sb2;
        int i12;
        int i13;
        char c3;
        StringBuilder sb3;
        int i14;
        int i15;
        char c4;
        byte b = this.f35022a;
        String str6 = "";
        byte b2 = 14;
        dj80 dj80Var = dj80.f6171a;
        bwh0 bwh0Var = bwh0.f3325a;
        gj80 gj80Var = gj80.f11384a;
        byte b3 = 13;
        byte b4 = 3;
        byte b5 = 2;
        int i16 = 0;
        int i17 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                evz evzVar = ((w400) obj3).u;
                final int id = ((xrz) obj2).getId();
                evzVar.getClass();
                k0w0Var.h(new FragmentScreen(id) { // from class: org.xplatform.limits.rs.impl.navigation.internal.LimitsRsInternalScreens$MoneyLimitFragmentScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f46744a;

                    {
                        this.f46744a = id;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        yo40.P1.getClass();
                        yo40 yo40Var = new yo40();
                        yo40Var.L1.I(yo40Var, yo40.Q1[0], this.f46744a);
                        return yo40Var;
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
                return Unit.f46060a;
            case 1:
                z19 z19Var = (z19) obj3;
                zvh0 zvh0Var = (zvh0) obj2;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                ctf0 ctf0Var = z19Var.b;
                mj80 mj80Var2 = new mj80(gj80Var, new yvh0(ctf0Var.b.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                if (((ifc0) ((fee) z19Var.g.getValue()).c()).g) {
                    i = 0;
                    mj80Var = new mj80(dj80Var, new yvh0(ctf0Var.b.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                } else {
                    i = 0;
                    mj80Var = null;
                }
                i4 i4VarR0 = dyb.r0(tx3.z(new mj80[]{mj80Var2, mj80Var}));
                eo7 eo7Var = (eo7) feeVar.c();
                if (eo7Var != null) {
                    if (eo7Var instanceof bo7) {
                        i2 = i;
                    } else if (eo7Var instanceof yn7) {
                        i2 = 1;
                    }
                    return new uwh0(i2, i4VarR0, wdx.h0(zvh0Var));
                }
                t9f.b();
                return null;
            case 2:
                ((View) obj).getClass();
                ((cbl0) obj3).invoke(((y700) ((cp) obj2).u()).i());
                return Unit.f46060a;
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ek5 ek5Var = lwf.r;
                gkz gkzVar = new gkz(ek5Var);
                kyz kyzVar = new kyz((byte) 10);
                z8z z8zVar = new z8z((byte) 25);
                tvx tvxVar = new tvx(3, b3);
                gvy gvyVar = gvy.n;
                gbn gbnVar = new gbn(kyzVar, tvxVar, z8zVar, gvyVar);
                dp dpVar = gkzVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new kyz((byte) 11), new tvx(3, b2), new ebz((cbl0) obj3, (byte) 23), gvy.o));
                ssx ssxVar = (ssx) cpVar.u;
                RecyclerView recyclerView = ssxVar.d;
                recyclerView.setAdapter(gkzVar);
                recyclerView.m(new qmk0(recyclerView.getResources().getDimensionPixelSize(R.dimen.space_2), 0, 0, 0, 0, 1, new z8z((byte) 26), rmk0.d, 286));
                int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_16);
                rmk0 rmk0Var = rmk0.b;
                recyclerView.m(new qmk0(dimensionPixelSize, 0, 0, 0, 0, 1, new z8z((byte) 27), rmk0Var, 286));
                recyclerView.m(new qmk0(recyclerView.getResources().getDimensionPixelSize(R.dimen.space_16), 0, 0, 0, 0, 1, new z8z((byte) 28), rmk0Var, 286));
                gkz gkzVar2 = new gkz(ek5Var);
                gkzVar2.d.b(new gbn(new kyz((byte) 10), new tvx(3, b3), new z8z((byte) 25), gvyVar));
                ssxVar.c.setAdapter(gkzVar2);
                dyb.b0(ssxVar.b, ymx.INTERVAL_400, new asw((bbl0) obj2, cpVar, (byte) 1));
                cpVar.t(new c800(cpVar, gkzVar, gkzVar2, maz.b(new g8l(cpVar, gkzVar, gkzVar2, (byte) 22)), cpVar));
                cpVar.x(new bb(cpVar, (byte) 10));
                return Unit.f46060a;
            case 4:
                gb00 gb00Var = (gb00) obj3;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                rl70 rl70Var = gb00Var.u;
                String str7 = gb00Var.o;
                long j = gb00Var.p;
                rl70Var.getClass();
                k0w0Var2.h(rl70.d(j, (String) obj2, str7));
                return Unit.f46060a;
            case 5:
                ou90 ou90Var = (ou90) obj;
                ArrayList arrayListV = aad.V((List) obj3, (Function0) ((qf6) obj2).b);
                if (arrayListV != null) {
                    int size = arrayListV.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        Pair pair = (Pair) arrayListV.get(i18);
                        pu90 pu90Var = (pu90) pair.f46059a;
                        Function0 function0 = (Function0) pair.b;
                        ou90.j(ou90Var, pu90Var, function0 != null ? ((ikx) function0.invoke()).f14950a : 0L);
                    }
                }
                return Unit.f46060a;
            case 6:
                d240 d240Var = (d240) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(((ef00) obj3).G.q(new fr1(new fs80(d240Var.g, d240Var.d, null, null, 0L, false, 124), null, 2)));
                return Unit.f46060a;
            case 7:
                c240 c240Var = (c240) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                peg0 peg0Var = ((ef00) obj3).G;
                String str8 = c240Var.g;
                long j2 = c240Var.e;
                if (j2 > 0) {
                    str8 = null;
                }
                k0w0Var4.h(peg0Var.q(new fr1(new fs80(str8 == null ? "" : str8, c240Var.d, null, null, j2, false, 108), null, 2)));
                return Unit.f46060a;
            case 8:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(oct.f(((ef00) obj3).o, 0L, null, 0, (t270) obj2, null, 23));
                return Unit.f46060a;
            case 9:
                jdk0 jdk0Var = ((ef00) obj3).W;
                vh0 vh0Var = ((gx10) obj2).b;
                long j3 = vh0Var.g;
                String str9 = vh0Var.b;
                boolean z3 = vh0Var.i;
                long j4 = vh0Var.h;
                boolean z4 = vh0Var.j;
                jdk0Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j3, str9, 0L, z3, j4, z4, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 10:
                eh00 eh00Var = (eh00) obj3;
                zvh0 zvh0Var2 = (zvh0) obj2;
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                ctf0 ctf0Var2 = eh00Var.f7787a;
                mj80 mj80Var3 = new mj80(gj80Var, new yvh0(ctf0Var2.b.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                mj80 mj80Var4 = new mj80(dj80Var, new yvh0(ctf0Var2.b.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                if (((fee) eh00Var.g.getValue()).c() == null) {
                    mj80Var4 = null;
                }
                i4 i4VarR1 = dyb.r0(tx3.z(new mj80[]{mj80Var3, mj80Var4}));
                go7 go7Var = (go7) feeVar2.c();
                if (go7Var != null) {
                    if (!(go7Var instanceof do7)) {
                        i3 = go7Var instanceof ao7 ? 1 : 0;
                    }
                    return new uwh0(i3, i4VarR1, zdx.O(zvh0Var2));
                }
                t9f.b();
                return null;
            case 11:
                zvh0 zvh0Var3 = (zvh0) obj2;
                ewh0 ewh0Var = (ewh0) obj;
                ewh0Var.getClass();
                ctf0 ctf0Var3 = ((kh00) obj3).b;
                lsm0 lsm0Var = ctf0Var3.b;
                lsm0 lsm0Var2 = ctf0Var3.b;
                i4 i4VarR2 = dyb.r0(tx3.z(new mj80[]{new mj80(gj80Var, new yvh0(lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0)), bwh0Var)), ewh0Var.b ? new mj80(dj80Var, new yvh0(lsm0Var2.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)) : null, ewh0Var.c ? new mj80(aj80.f962a, new yvh0(lsm0Var2.a(R.string.bet_type_coeff, Arrays.copyOf(new Object[0], 0)), bwh0Var)) : null}));
                ko7 ko7Var = ewh0Var.f8526a;
                if (ko7Var instanceof jo7) {
                    i4 = 0;
                } else if (ko7Var instanceof io7) {
                    i4 = 1;
                } else {
                    if (!(ko7Var instanceof ho7)) {
                        t9f.b();
                        return null;
                    }
                    i4 = 2;
                }
                return new uwh0(i4, i4VarR2, idx.W(zvh0Var3));
            case 12:
                htz htzVar = yl00.n2;
                ((View) obj).getClass();
                xm00 xm00Var = (xm00) ((yl00) obj3).i2.getValue();
                String upperCase = String.valueOf(((zl00) obj2).c.getText()).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sac.V(jiu0.a(xm00Var), new km00(xm00Var, (byte) 0), null, xm00Var.e.f22085a, new fhq(xm00Var, upperCase, null, (byte) 19), 10);
                return Unit.f46060a;
            case 13:
                cp00 cp00Var = (cp00) obj;
                cp00Var.getClass();
                return new y11(cp00Var, (ctf0) obj3, (bb6) obj2);
            case 14:
                b310 b310Var = (b310) obj3;
                String str10 = (String) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                qgh qghVar = b310Var.r;
                sip.f32274a.getClass();
                sip sipVar = sip.b;
                ArrayList arrayList3 = b310Var.G;
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Integer.valueOf(((t9m0) it.next()).f33572a));
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVar, dam0.b, 40L, 2L, str10, arrayList4, b310Var.M);
                qghVar.getClass();
                k0w0Var6.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
            case 15:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((qe10) ((se10) obj3)).f28560a;
                hczVar.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 11), new ugd(802480018, true, new ws1(a4xVar, (Function1) obj2, (byte) 17)));
                return Unit.f46060a;
            case 16:
                lib libVar = (lib) obj3;
                we10 we10Var = (we10) obj;
                we10Var.getClass();
                int i19 = ((lf10) obj2).b;
                ctf0 ctf0Var4 = (ctf0) libVar.b;
                DecimalFormat decimalFormat = (DecimalFormat) libVar.f;
                if (we10Var instanceof te10) {
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    return new re10(new mdm(xuz.a(pb10Var, i19), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (we10Var instanceof ue10) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    yh10 yh10Var = ((ue10) we10Var).f35505a;
                    ei10 ei10Var = yh10Var.b;
                    ArrayList<ei10> arrayList5 = yh10Var.f42614a.e;
                    wi10 wi10Var3 = yh10Var.c;
                    ctf0Var4.getClass();
                    li10 li10Var2 = ei10Var.g;
                    int i20 = ei10Var.e;
                    String str11 = ei10Var.h;
                    if (li10Var2 instanceof ji10) {
                        o0x o0xVarO = q0x.O(ei10Var);
                        String str12 = ei10Var.c;
                        lsm0 lsm0Var3 = ctf0Var4.b;
                        ji10 ji10Var = (ji10) li10Var2;
                        v0bVar = new v0b(o0xVarO, str12, lsm0Var3.a(R.string.loyalty_cashback_percent_v2, Arrays.copyOf(new Object[]{str11}, 1)), lsm0Var3.a(R.string.loyalty_cashback_coeff_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i20)}, 1)), new t0b(lsm0Var3.a(R.string.cashback_card_experience, Arrays.copyOf(new Object[0], 0)), wi10Var3.b, decimalFormat.format(Integer.valueOf(wi10Var3.b)).toString(), kng0.k("/ ", decimalFormat.format(Integer.valueOf(ji10Var.f16555a))), ji10Var.f16555a));
                        i5 = 0;
                    } else if (li10Var2 instanceof ki10) {
                        o0x o0xVarO2 = q0x.O(ei10Var);
                        String str13 = ei10Var.c;
                        Object[] objArr = {str11};
                        lsm0 lsm0Var4 = ctf0Var4.b;
                        i5 = 0;
                        v0bVar = new v0b(o0xVarO2, str13, lsm0Var4.a(R.string.loyalty_cashback_percent_v2, Arrays.copyOf(objArr, 1)), lsm0Var4.a(R.string.loyalty_cashback_coeff_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i20)}, 1)), new s0b(lsm0Var4.a(R.string.loyalty_program_user_max_level_description, Arrays.copyOf(new Object[0], 0))));
                    } else {
                        t9f.b();
                    }
                    lc00VarB.add(new df10(v0bVar));
                    lsm0 lsm0Var5 = ctf0Var4.b;
                    String strA2 = lsm0Var5.a(R.string.loyalty_program_my_cashback_title, Arrays.copyOf(new Object[i5], i5));
                    String str14 = ei10Var.d;
                    m0x m0xVar = new m0x(R.drawable.ic_glyph_cashback, null, 6);
                    int iOrdinal2 = wi10Var3.d.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 2) {
                            hwaVar = new hwa(lsm0Var5.a(R.string.loyalty_program_unavailable_title, Arrays.copyOf(new Object[i5], i5)));
                        } else {
                            gwaVar = new iwa(new Date(wi10Var3.c + 999), lsm0Var5.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), xia0.e0(wi10Var3));
                        }
                        lc00VarB.add(new bf10(new kwa(strA2, str14, m0xVar, hwaVar)));
                        if (!arrayList5.isEmpty()) {
                            lc00VarB.add(new ef10(new hjm(lsm0Var5.a(R.string.vip_cashback_statuses, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            arrayList = new ArrayList(r3d.q(arrayList5, 10));
                            for (ei10 ei10Var2 : arrayList5) {
                                i6 = ei10Var.f7836a;
                                ei10Var2.getClass();
                                String str15 = ei10Var2.c;
                                o0x o0xVarO3 = q0x.O(ei10Var2);
                                if (i6 == ei10Var2.f7836a) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String strA3 = lsm0Var5.a(R.string.loyalty_cashback_percent_v2, Arrays.copyOf(new Object[]{ei10Var2.h}, 1));
                                String strA4 = lsm0Var5.a(R.string.experience, Arrays.copyOf(new Object[0], 0));
                                li10Var = ei10Var2.g;
                                if (li10Var instanceof ji10) {
                                    strA = decimalFormat.format(Integer.valueOf(((ji10) li10Var).f16555a)).toString();
                                    i7 = 0;
                                } else if (li10Var instanceof ki10) {
                                    i7 = 0;
                                    strA = lsm0Var5.a(R.string.em_dash, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                arrayList.add(new cf10(new gza(str15, o0xVarO3, z, strA3, strA4, strA, lsm0Var5.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i7], i7)), String.valueOf(ei10Var2.e))));
                            }
                            lc00VarB.addAll(arrayList);
                        }
                        return new qe10(dyb.r0(kotlin.collections.a.a(lc00VarB)));
                    }
                    pn40 pn40Var = pn40.f27267a;
                    gwaVar = new gwa(lsm0Var5.a(R.string.loyalty_program_cashback_claim_title_v2, Arrays.copyOf(new Object[]{kng0.l(pn40.c(wi10Var3.f, p3u0.c), Separators.SP, wi10Var3.g.b)}, 1)));
                    hwaVar = gwaVar;
                    lc00VarB.add(new bf10(new kwa(strA2, str14, m0xVar, hwaVar)));
                    if (!arrayList5.isEmpty()) {
                        lc00VarB.add(new ef10(new hjm(lsm0Var5.a(R.string.vip_cashback_statuses, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        arrayList = new ArrayList(r3d.q(arrayList5, 10));
                        while (r4.hasNext()) {
                            i6 = ei10Var.f7836a;
                            ei10Var2.getClass();
                            String str16 = ei10Var2.c;
                            o0x o0xVarO4 = q0x.O(ei10Var2);
                            if (i6 == ei10Var2.f7836a) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String strA5 = lsm0Var5.a(R.string.loyalty_cashback_percent_v2, Arrays.copyOf(new Object[]{ei10Var2.h}, 1));
                            String strA6 = lsm0Var5.a(R.string.experience, Arrays.copyOf(new Object[0], 0));
                            li10Var = ei10Var2.g;
                            if (li10Var instanceof ji10) {
                                strA = decimalFormat.format(Integer.valueOf(((ji10) li10Var).f16555a)).toString();
                                i7 = 0;
                            } else if (li10Var instanceof ki10) {
                                i7 = 0;
                                strA = lsm0Var5.a(R.string.em_dash, Arrays.copyOf(new Object[0], 0));
                            } else {
                                t9f.b();
                            }
                            arrayList.add(new cf10(new gza(str16, o0xVarO4, z, strA5, strA6, strA, lsm0Var5.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i7], i7)), String.valueOf(ei10Var2.e))));
                        }
                        lc00VarB.addAll(arrayList);
                    }
                    return new qe10(dyb.r0(kotlin.collections.a.a(lc00VarB)));
                }
                if (we10Var instanceof ve10) {
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    lc00VarB2.add(new df10(w0b.f38342a));
                    lc00VarB2.add(new bf10(new lwa(fwa.b)));
                    lc00VarB2.add(new ef10(new ijm()));
                    for (int i21 = 0; i21 < 8; i21++) {
                        lc00VarB2.add(new cf10(hza.f13898a));
                    }
                    return new qe10(dyb.r0(kotlin.collections.a.a(lc00VarB2)));
                }
                t9f.b();
                return null;
            case 17:
                ov0 ov0Var2 = (ov0) obj3;
                jg10 jg10Var = (jg10) obj;
                jg10Var.getClass();
                int i22 = ((gh10) obj2).b;
                ctf0 ctf0Var5 = (ctf0) ov0Var2.d;
                if (jg10Var instanceof gg10) {
                    rwa rwaVar = new rwa(new n0x(""), ctf0Var5.b.a(R.string.loyalty_program_current_level_title, Arrays.copyOf(new Object[0], 0)), ctf0Var5.b.a(R.string.loyalty_program_status_unknown_title, Arrays.copyOf(new Object[0], 0)));
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    return dyb.g0(new fg10(rwaVar, new rg10(new mdm(xuz.a(pb10Var2, i22), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE))));
                }
                if (jg10Var instanceof hg10) {
                    yh10 yh10Var2 = ((hg10) jg10Var).f12997a;
                    ai10 ai10Var = yh10Var2.f42614a;
                    wi10 wi10Var4 = yh10Var2.c;
                    int i23 = wi10Var4.f39192a;
                    ArrayList arrayList6 = new ArrayList(r3d.q(ai10Var.e, 10));
                    for (Iterator it2 = r1.iterator(); it2.hasNext(); it2 = it2) {
                        ei10 ei10Var3 = (ei10) it2.next();
                        ei10Var3.getClass();
                        ov0 ov0Var3 = ov0Var2;
                        double d = ei10Var3.f;
                        List list = ei10Var3.j;
                        int i24 = ei10Var3.f7836a;
                        ctf0Var5.getClass();
                        int i25 = i23 == i24 ? i17 : i16;
                        int i26 = i23 > i24 ? i17 : i16;
                        int i27 = i25 != 0 ? R.string.loyalty_program_current_level_title : i26 != 0 ? R.string.loyalty_program_success_level_title : R.string.loyalty_program_locked_level_title;
                        lsm0 lsm0Var6 = ctf0Var5.b;
                        String strA7 = lsm0Var6.a(i27, Arrays.copyOf(new Object[i16], i16));
                        String str17 = ei10Var3.c;
                        ctf0 ctf0Var6 = ctf0Var5;
                        ArrayList arrayList7 = arrayList6;
                        StringBuilder sb4 = new StringBuilder(ujn.h);
                        String str18 = ei10Var3.b;
                        boolean z5 = i25 == 0 && i26 == 0;
                        if (str18.length() <= 0) {
                            if (z5) {
                                str18 = "/static/img/android/casino/vip_cashback/Locked.webp";
                            } else if (i24 == 1) {
                                str18 = "/static/img/android/casino/vip_cashback/Copper.webp";
                            } else if (i24 == 2) {
                                str18 = "/static/img/android/casino/vip_cashback/Bronze.webp";
                            } else if (i24 == 3) {
                                str18 = "/static/img/android/casino/vip_cashback/Silver.webp";
                            } else if (i24 == 4) {
                                str18 = "/static/img/android/casino/vip_cashback/Gold.webp";
                            } else if (i24 == 5) {
                                str18 = "/static/img/android/casino/vip_cashback/Ruby.webp";
                            } else if (i24 == 6) {
                                str18 = "/static/img/android/casino/vip_cashback/Sapphire.webp";
                            } else if (i24 == 7) {
                                str18 = "/static/img/android/casino/vip_cashback/Brilliant.webp";
                            } else {
                                str18 = i24 == 8 ? "/static/img/android/casino/vip_cashback/Vip.webp" : str6;
                            }
                        }
                        wi10 wi10Var5 = wi10Var4;
                        if (str18.length() == 0) {
                            sb4.setLength(0);
                        } else {
                            int i28 = 0;
                            if (StringsKt.O(str18, ujn.h, false)) {
                                sb4.setLength(i28);
                                sb4.append(str18);
                            } else if (kotlin.text.c.x(str18, "https://", false)) {
                                i28 = 0;
                                sb4.setLength(i28);
                                sb4.append(str18);
                            } else {
                                if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                    i8 = 1;
                                    c = '/';
                                } else {
                                    sb4.append('/');
                                    c = '/';
                                    i8 = 1;
                                }
                                char[] cArr = new char[i8];
                                cArr[0] = c;
                                sb4.append(StringsKt.y0(str18, cArr));
                            }
                        }
                        rwa rwaVar2 = new rwa(new n0x(sb4.toString()), strA7, str17);
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        String str19 = yh10Var2.f42614a.d.b;
                        DecimalFormat decimalFormat2 = (DecimalFormat) ov0Var3.e;
                        str19.getClass();
                        li10 li10Var3 = ei10Var3.g;
                        int i29 = ei10Var3.e;
                        yh10 yh10Var3 = yh10Var2;
                        if (i23 <= i24 || !(li10Var3 instanceof ji10)) {
                            ov0Var = ov0Var3;
                            str = Separators.SLASH;
                            str2 = "https://";
                            if (i23 == i24 && (li10Var3 instanceof ji10)) {
                                wi10Var = wi10Var5;
                                String strA8 = lsm0Var6.a(R.string.loyalty_program_user_active_or_success_level_progress_description_v2, Arrays.copyOf(new Object[]{decimalFormat2.format(Integer.valueOf(wi10Var.b)).toString()}, 1));
                                ji10 ji10Var2 = (ji10) li10Var3;
                                String strK = kng0.k("/ ", decimalFormat2.format(Integer.valueOf(ji10Var2.f16555a)));
                                int i30 = wi10Var.b;
                                int i31 = ji10Var2.f16555a;
                                pn40 pn40Var2 = pn40.f27267a;
                                ozaVar = new oza(strA8, i30, strK, lsm0Var6.a(R.string.loyalty_program_user_active_or_success_level_description_v2, Arrays.copyOf(new Object[]{str19.concat(pn40.c(d, p3u0.c)), String.valueOf(i29)}, 2)), i31);
                            } else {
                                wi10Var = wi10Var5;
                                nzaVar = (i23 == i24 && (li10Var3 instanceof ki10)) ? new nza(lsm0Var6.a(R.string.loyalty_program_user_max_level_description, Arrays.copyOf(new Object[0], 0))) : new nza(lsm0Var6.a(R.string.loyalty_program_user_lock_level_description, Arrays.copyOf(new Object[0], 0)));
                            }
                            lc00VarB3.add(new ug10(nzaVar));
                            String strA9 = lsm0Var6.a(R.string.loyalty_program_cashback_percent_title_v2, Arrays.copyOf(new Object[]{ei10Var3.h}, 1));
                            String str20 = ei10Var3.d;
                            m0x m0xVar2 = new m0x(R.drawable.ic_glyph_cashback, null, 6);
                            vi10 vi10Var = wi10Var.d;
                            if (i23 == i24) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2 || vi10Var != vi10.AWAITING) {
                                if (z2 || vi10Var != vi10.AVAILABLE) {
                                    i9 = 0;
                                    hwaVar2 = new hwa(lsm0Var6.a(R.string.loyalty_program_unavailable_title, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    pn40 pn40Var3 = pn40.f27267a;
                                    hwaVar2 = new gwa(lsm0Var6.a(R.string.loyalty_program_cashback_claim_title_v2, Arrays.copyOf(new Object[]{kng0.l(pn40.c(wi10Var.f, p3u0.c), Separators.SP, wi10Var.g.b)}, 1)));
                                }
                                lc00VarB3.add(new tg10(new kwa(strA9, str20, m0xVar2, hwaVar2)));
                                if (list.size() >= 3) {
                                    String strA10 = lsm0Var6.a(R.string.loyalty_program_cashback_steps_title, Arrays.copyOf(new Object[i9], i9));
                                    List<mi10> listD0 = CollectionsKt.D0(list, 3);
                                    arrayList2 = new ArrayList(r3d.q(listD0, 10));
                                    for (mi10 mi10Var : listD0) {
                                        pg10 pg10Var = mi10Var.f21824a;
                                        str3 = mi10Var.b;
                                        iOrdinal = pg10Var.ordinal();
                                        if (iOrdinal == 0) {
                                            wi10Var = wi10Var;
                                            str4 = str;
                                            str5 = str2;
                                            sb = new StringBuilder(ujn.h);
                                            if (str3.length() == 0) {
                                                sb.setLength(0);
                                                i10 = 0;
                                            } else {
                                                if (StringsKt.O(str3, ujn.h, false)) {
                                                    i10 = 0;
                                                } else if (kotlin.text.c.x(str3, str5, false)) {
                                                    i10 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, str4)) {
                                                        i11 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i11 = 1;
                                                    }
                                                    char[] cArr2 = new char[i11];
                                                    i10 = 0;
                                                    cArr2[0] = c2;
                                                    sb.append(StringsKt.y0(str3, cArr2));
                                                }
                                                sb.setLength(i10);
                                                sb.append(str3);
                                            }
                                            o0bVar = new o0b(new n0x(sb.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_first_step_description, Arrays.copyOf(new Object[i10], i10)));
                                        } else if (iOrdinal == 1) {
                                            wi10Var = wi10Var;
                                            str4 = str;
                                            str5 = str2;
                                            sb2 = new StringBuilder(ujn.h);
                                            if (str3.length() == 0) {
                                                sb2.setLength(0);
                                                i12 = 0;
                                            } else {
                                                if (StringsKt.O(str3, ujn.h, false)) {
                                                    i12 = 0;
                                                } else if (kotlin.text.c.x(str3, str5, false)) {
                                                    i12 = 0;
                                                } else {
                                                    if (sb2.length() > 0 || StringsKt.S(sb2, str4)) {
                                                        i13 = 1;
                                                        c3 = '/';
                                                    } else {
                                                        sb2.append('/');
                                                        c3 = '/';
                                                        i13 = 1;
                                                    }
                                                    char[] cArr3 = new char[i13];
                                                    i12 = 0;
                                                    cArr3[0] = c3;
                                                    sb2.append(StringsKt.y0(str3, cArr3));
                                                }
                                                sb2.setLength(i12);
                                                sb2.append(str3);
                                            }
                                            o0bVar = new o0b(new n0x(sb2.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_second_step_description, Arrays.copyOf(new Object[i12], i12)));
                                        } else if (iOrdinal == 2) {
                                            sb3 = new StringBuilder(ujn.h);
                                            if (str3.length() == 0) {
                                                sb3.setLength(0);
                                                wi10Var = wi10Var;
                                                i14 = 0;
                                                str4 = str;
                                                str5 = str2;
                                            } else {
                                                if (StringsKt.O(str3, ujn.h, false)) {
                                                    i14 = 0;
                                                    str5 = str2;
                                                } else {
                                                    str5 = str2;
                                                    if (kotlin.text.c.x(str3, str5, false)) {
                                                        i14 = 0;
                                                    } else {
                                                        if (sb3.length() > 0) {
                                                            str4 = str;
                                                            if (!StringsKt.S(sb3, str4)) {
                                                                sb3.append('/');
                                                                c4 = '/';
                                                                i15 = 1;
                                                            }
                                                            char[] cArr4 = new char[i15];
                                                            i14 = 0;
                                                            cArr4[0] = c4;
                                                            sb3.append(StringsKt.y0(str3, cArr4));
                                                        } else {
                                                            str4 = str;
                                                        }
                                                        i15 = 1;
                                                        c4 = '/';
                                                        char[] cArr5 = new char[i15];
                                                        i14 = 0;
                                                        cArr5[0] = c4;
                                                        sb3.append(StringsKt.y0(str3, cArr5));
                                                    }
                                                }
                                                wi10Var = wi10Var;
                                                str4 = str;
                                                sb3.setLength(i14);
                                                sb3.append(str3);
                                            }
                                            o0bVar = new o0b(new n0x(sb3.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_tertiary_step_description, Arrays.copyOf(new Object[i14], i14)));
                                        } else {
                                            t9f.b();
                                        }
                                        arrayList2.add(o0bVar);
                                        str = str4;
                                        str2 = str5;
                                        wi10Var = wi10Var;
                                    }
                                    wi10Var2 = wi10Var;
                                    lc00VarB3.add(new vg10(new p0b(dyb.r0(arrayList2), strA10)));
                                } else {
                                    wi10Var2 = wi10Var;
                                }
                                arrayList7.add(new fg10(rwaVar2, new qg10(dyb.r0(kotlin.collections.a.a(lc00VarB3)))));
                                arrayList6 = arrayList7;
                                str6 = str6;
                                yh10Var2 = yh10Var3;
                                ctf0Var5 = ctf0Var6;
                                wi10Var4 = wi10Var2;
                                ov0Var2 = ov0Var;
                                i16 = 0;
                                i17 = 1;
                            } else {
                                hwaVar2 = new iwa(new Date(wi10Var.c + 999), lsm0Var6.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), xia0.e0(wi10Var));
                            }
                            i9 = 0;
                            lc00VarB3.add(new tg10(new kwa(strA9, str20, m0xVar2, hwaVar2)));
                            if (list.size() >= 3) {
                                String strA11 = lsm0Var6.a(R.string.loyalty_program_cashback_steps_title, Arrays.copyOf(new Object[i9], i9));
                                List<mi10> listD1 = CollectionsKt.D0(list, 3);
                                arrayList2 = new ArrayList(r3d.q(listD1, 10));
                                while (r6.hasNext()) {
                                    pg10 pg10Var2 = mi10Var.f21824a;
                                    str3 = mi10Var.b;
                                    iOrdinal = pg10Var2.ordinal();
                                    if (iOrdinal == 0) {
                                        wi10Var = wi10Var;
                                        str4 = str;
                                        str5 = str2;
                                        sb = new StringBuilder(ujn.h);
                                        if (str3.length() == 0) {
                                            sb.setLength(0);
                                            i10 = 0;
                                        } else {
                                            if (StringsKt.O(str3, ujn.h, false)) {
                                                i10 = 0;
                                            } else if (kotlin.text.c.x(str3, str5, false)) {
                                                i10 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i11 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i11 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr6 = new char[i11];
                                                i10 = 0;
                                                cArr6[0] = c2;
                                                sb.append(StringsKt.y0(str3, cArr6));
                                            }
                                            sb.setLength(i10);
                                            sb.append(str3);
                                        }
                                        o0bVar = new o0b(new n0x(sb.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_first_step_description, Arrays.copyOf(new Object[i10], i10)));
                                    } else if (iOrdinal == 1) {
                                        wi10Var = wi10Var;
                                        str4 = str;
                                        str5 = str2;
                                        sb2 = new StringBuilder(ujn.h);
                                        if (str3.length() == 0) {
                                            sb2.setLength(0);
                                            i12 = 0;
                                        } else {
                                            if (StringsKt.O(str3, ujn.h, false)) {
                                                i12 = 0;
                                            } else if (kotlin.text.c.x(str3, str5, false)) {
                                                i12 = 0;
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i13 = 1;
                                                    c3 = '/';
                                                } else {
                                                    i13 = 1;
                                                    c3 = '/';
                                                }
                                                char[] cArr7 = new char[i13];
                                                i12 = 0;
                                                cArr7[0] = c3;
                                                sb2.append(StringsKt.y0(str3, cArr7));
                                            }
                                            sb2.setLength(i12);
                                            sb2.append(str3);
                                        }
                                        o0bVar = new o0b(new n0x(sb2.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_second_step_description, Arrays.copyOf(new Object[i12], i12)));
                                    } else if (iOrdinal == 2) {
                                        sb3 = new StringBuilder(ujn.h);
                                        if (str3.length() == 0) {
                                            sb3.setLength(0);
                                            wi10Var = wi10Var;
                                            i14 = 0;
                                            str4 = str;
                                            str5 = str2;
                                        } else {
                                            if (StringsKt.O(str3, ujn.h, false)) {
                                                str5 = str2;
                                                if (kotlin.text.c.x(str3, str5, false)) {
                                                    i14 = 0;
                                                } else {
                                                    if (sb3.length() > 0) {
                                                        str4 = str;
                                                        if (!StringsKt.S(sb3, str4)) {
                                                            sb3.append('/');
                                                            c4 = '/';
                                                            i15 = 1;
                                                        }
                                                        char[] cArr8 = new char[i15];
                                                        i14 = 0;
                                                        cArr8[0] = c4;
                                                        sb3.append(StringsKt.y0(str3, cArr8));
                                                    } else {
                                                        str4 = str;
                                                    }
                                                    i15 = 1;
                                                    c4 = '/';
                                                    char[] cArr9 = new char[i15];
                                                    i14 = 0;
                                                    cArr9[0] = c4;
                                                    sb3.append(StringsKt.y0(str3, cArr9));
                                                }
                                            } else {
                                                i14 = 0;
                                                str5 = str2;
                                            }
                                            wi10Var = wi10Var;
                                            str4 = str;
                                            sb3.setLength(i14);
                                            sb3.append(str3);
                                        }
                                        o0bVar = new o0b(new n0x(sb3.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_tertiary_step_description, Arrays.copyOf(new Object[i14], i14)));
                                    } else {
                                        t9f.b();
                                    }
                                    arrayList2.add(o0bVar);
                                    str = str4;
                                    str2 = str5;
                                    wi10Var = wi10Var;
                                }
                                wi10Var2 = wi10Var;
                                lc00VarB3.add(new vg10(new p0b(dyb.r0(arrayList2), strA11)));
                            } else {
                                wi10Var2 = wi10Var;
                            }
                            arrayList7.add(new fg10(rwaVar2, new qg10(dyb.r0(kotlin.collections.a.a(lc00VarB3)))));
                            arrayList6 = arrayList7;
                            str6 = str6;
                            yh10Var2 = yh10Var3;
                            ctf0Var5 = ctf0Var6;
                            wi10Var4 = wi10Var2;
                            ov0Var2 = ov0Var;
                            i16 = 0;
                            i17 = 1;
                        } else {
                            ji10 ji10Var3 = (ji10) li10Var3;
                            int i32 = ji10Var3.f16555a;
                            ov0Var = ov0Var3;
                            String strA12 = lsm0Var6.a(R.string.loyalty_program_user_active_or_success_level_progress_description_v2, Arrays.copyOf(new Object[]{decimalFormat2.format(Integer.valueOf(i32)).toString()}, 1));
                            String strK2 = kng0.k("/ ", decimalFormat2.format(Integer.valueOf(i32)));
                            int i33 = ji10Var3.f16555a;
                            pn40 pn40Var4 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            str = Separators.SLASH;
                            str2 = "https://";
                            ozaVar = new oza(strA12, i33, strK2, lsm0Var6.a(R.string.loyalty_program_user_active_or_success_level_description_v2, Arrays.copyOf(new Object[]{str19.concat(pn40.c(d, p3u0Var)), String.valueOf(i29)}, 2)), i33);
                            wi10Var = wi10Var5;
                        }
                        nzaVar = ozaVar;
                        lc00VarB3.add(new ug10(nzaVar));
                        String strA13 = lsm0Var6.a(R.string.loyalty_program_cashback_percent_title_v2, Arrays.copyOf(new Object[]{ei10Var3.h}, 1));
                        String str21 = ei10Var3.d;
                        m0x m0xVar3 = new m0x(R.drawable.ic_glyph_cashback, null, 6);
                        vi10 vi10Var2 = wi10Var.d;
                        if (i23 == i24) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (z2) {
                            }
                            i9 = 0;
                            hwaVar2 = new hwa(lsm0Var6.a(R.string.loyalty_program_unavailable_title, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            if (z2) {
                            }
                            i9 = 0;
                            hwaVar2 = new hwa(lsm0Var6.a(R.string.loyalty_program_unavailable_title, Arrays.copyOf(new Object[0], 0)));
                        }
                        lc00VarB3.add(new tg10(new kwa(strA13, str21, m0xVar3, hwaVar2)));
                        if (list.size() >= 3) {
                            String strA14 = lsm0Var6.a(R.string.loyalty_program_cashback_steps_title, Arrays.copyOf(new Object[i9], i9));
                            List<mi10> listD2 = CollectionsKt.D0(list, 3);
                            arrayList2 = new ArrayList(r3d.q(listD2, 10));
                            while (r6.hasNext()) {
                                pg10 pg10Var3 = mi10Var.f21824a;
                                str3 = mi10Var.b;
                                iOrdinal = pg10Var3.ordinal();
                                if (iOrdinal == 0) {
                                    wi10Var = wi10Var;
                                    str4 = str;
                                    str5 = str2;
                                    sb = new StringBuilder(ujn.h);
                                    if (str3.length() == 0) {
                                        sb.setLength(0);
                                        i10 = 0;
                                    } else {
                                        if (StringsKt.O(str3, ujn.h, false)) {
                                            i10 = 0;
                                        } else if (kotlin.text.c.x(str3, str5, false)) {
                                            i10 = 0;
                                        } else {
                                            if (sb.length() > 0) {
                                                i11 = 1;
                                                c2 = '/';
                                            } else {
                                                i11 = 1;
                                                c2 = '/';
                                            }
                                            char[] cArr10 = new char[i11];
                                            i10 = 0;
                                            cArr10[0] = c2;
                                            sb.append(StringsKt.y0(str3, cArr10));
                                        }
                                        sb.setLength(i10);
                                        sb.append(str3);
                                    }
                                    o0bVar = new o0b(new n0x(sb.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_first_step_description, Arrays.copyOf(new Object[i10], i10)));
                                } else if (iOrdinal == 1) {
                                    wi10Var = wi10Var;
                                    str4 = str;
                                    str5 = str2;
                                    sb2 = new StringBuilder(ujn.h);
                                    if (str3.length() == 0) {
                                        sb2.setLength(0);
                                        i12 = 0;
                                    } else {
                                        if (StringsKt.O(str3, ujn.h, false)) {
                                            i12 = 0;
                                        } else if (kotlin.text.c.x(str3, str5, false)) {
                                            i12 = 0;
                                        } else {
                                            if (sb2.length() > 0) {
                                                i13 = 1;
                                                c3 = '/';
                                            } else {
                                                i13 = 1;
                                                c3 = '/';
                                            }
                                            char[] cArr11 = new char[i13];
                                            i12 = 0;
                                            cArr11[0] = c3;
                                            sb2.append(StringsKt.y0(str3, cArr11));
                                        }
                                        sb2.setLength(i12);
                                        sb2.append(str3);
                                    }
                                    o0bVar = new o0b(new n0x(sb2.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_second_step_description, Arrays.copyOf(new Object[i12], i12)));
                                } else if (iOrdinal == 2) {
                                    sb3 = new StringBuilder(ujn.h);
                                    if (str3.length() == 0) {
                                        sb3.setLength(0);
                                        wi10Var = wi10Var;
                                        i14 = 0;
                                        str4 = str;
                                        str5 = str2;
                                    } else {
                                        if (StringsKt.O(str3, ujn.h, false)) {
                                            str5 = str2;
                                            if (kotlin.text.c.x(str3, str5, false)) {
                                                i14 = 0;
                                            } else {
                                                if (sb3.length() > 0) {
                                                    str4 = str;
                                                    if (!StringsKt.S(sb3, str4)) {
                                                        sb3.append('/');
                                                        c4 = '/';
                                                        i15 = 1;
                                                    }
                                                    char[] cArr12 = new char[i15];
                                                    i14 = 0;
                                                    cArr12[0] = c4;
                                                    sb3.append(StringsKt.y0(str3, cArr12));
                                                } else {
                                                    str4 = str;
                                                }
                                                i15 = 1;
                                                c4 = '/';
                                                char[] cArr13 = new char[i15];
                                                i14 = 0;
                                                cArr13[0] = c4;
                                                sb3.append(StringsKt.y0(str3, cArr13));
                                            }
                                        } else {
                                            i14 = 0;
                                            str5 = str2;
                                        }
                                        wi10Var = wi10Var;
                                        str4 = str;
                                        sb3.setLength(i14);
                                        sb3.append(str3);
                                    }
                                    o0bVar = new o0b(new n0x(sb3.toString()), lsm0Var6.a(R.string.loyalty_program_cashback_tertiary_step_description, Arrays.copyOf(new Object[i14], i14)));
                                } else {
                                    t9f.b();
                                }
                                arrayList2.add(o0bVar);
                                str = str4;
                                str2 = str5;
                                wi10Var = wi10Var;
                            }
                            wi10Var2 = wi10Var;
                            lc00VarB3.add(new vg10(new p0b(dyb.r0(arrayList2), strA14)));
                        } else {
                            wi10Var2 = wi10Var;
                        }
                        arrayList7.add(new fg10(rwaVar2, new qg10(dyb.r0(kotlin.collections.a.a(lc00VarB3)))));
                        arrayList6 = arrayList7;
                        str6 = str6;
                        yh10Var2 = yh10Var3;
                        ctf0Var5 = ctf0Var6;
                        wi10Var4 = wi10Var2;
                        ov0Var2 = ov0Var;
                        i16 = 0;
                        i17 = 1;
                    }
                    return dyb.r0(arrayList6);
                }
                if (jg10Var instanceof ig10) {
                    return dyb.g0(new fg10(swa.f32912a, new qg10(dyb.g0(new ug10(pza.f27835a), new tg10(new lwa(fwa.f10250a)), new vg10(q0b.f27888a)))));
                }
                t9f.b();
                return null;
            case 18:
                wm10 wm10Var = (wm10) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, "title", null, new ugd(-498634180, true, new p0z(wm10Var, b4)), 2);
                List list2 = wm10Var.e;
                hczVar2.f(list2.size(), new ygy(new gm10((byte) 1), list2, b3), new bgz(list2, (byte) 23), new ugd(2039820996, true, new a100(list2, (Function1) obj2, b5)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gle0 gle0Var = ((pn10) obj3).J;
                RuleData ruleData = new RuleData((String) obj2, 14, (Map) null, (String) null);
                gle0Var.getClass();
                ((k0w0) obj).h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                return Unit.f46060a;
            case 20:
                mi70 mi70Var = ((vq10) obj3).s;
                xbi0 xbi0Var = new xbi0((String) obj2, 9, false);
                mi70Var.getClass();
                ((k0w0) obj).h(new SendConfirmationSMSScreen(xbi0Var));
                return Unit.f46060a;
            case 21:
                return a(obj);
            case 22:
                return b(obj);
            case 23:
                return c(obj);
            case 24:
                return g(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return h(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj);
            default:
                ((View) obj).getClass();
                ((du20) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
        }
    }
}
