package a;

import android.content.ComponentCallbacks2;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/i6q;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i6q extends yx5 {
    public static final /* synthetic */ iiy[] V1 = {new j0d0(i6q.class, "binding", "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentBinding;", 0)};
    public final hnm0 K1;
    public final e9o0 L1;
    public fiu0 M1;
    public xi70 N1;
    public ii O1;
    public wdk0 P1;
    public lgn0 Q1;
    public d720 R1;
    public final kiu0 S1;
    public final s0r U1;

    public i6q() {
        super(R.layout.fin_bet_fragment);
        this.K1 = hnm0.f13359a;
        this.L1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitBackgroundContent, 12);
        d6q d6qVar = new d6q(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 18), (byte) 19));
        this.S1 = agc.G(this, sre0.f32672a.b(r8q.class), new r6p(a8zVarA, (byte) 4), new r6p(a8zVarA, (byte) 5), d6qVar);
        this.U1 = ltt0.o(this, f6q.f9025a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        knm0.i(G0().m, false);
        G0().t.setText(H(R.string.finance_bets));
        final byte b2 = 1;
        G0().j.b(new d6q(this, b2));
        FrameLayout frameLayout = G0().k;
        ymx ymxVar = ymx.INTERVAL_600;
        dyb.N(frameLayout, ymxVar, new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b3 = b;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var2 = r8qVarH2.U;
                            l7q l7qVarA = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, l7qVarA);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX2 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var3 = r8qVarH2.U;
                        l7q l7qVarA2 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, l7qVarA2);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.N(G0().t, ymxVar, new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b3 = b2;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX2 = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX2.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var3 = r8qVarH2.U;
                            l7q l7qVarA2 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, l7qVarA2);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX3 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var4 = r8qVarH2.U;
                        l7q l7qVarA3 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, l7qVarA3);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.N(G0().h, ymxVar, new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b4 = b3;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b4) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX3 = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX3.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var4 = r8qVarH2.U;
                            l7q l7qVarA3 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var4.getClass();
                            p7m0Var4.o(null, l7qVarA3);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX4 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var5 = r8qVarH2.U;
                        l7q l7qVarA4 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var5.getClass();
                        p7m0Var5.o(null, l7qVarA4);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.N(G0().k, ymxVar, new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b5 = b4;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b5) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX4 = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX4.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var5 = r8qVarH2.U;
                            l7q l7qVarA4 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var5.getClass();
                            p7m0Var5.o(null, l7qVarA4);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX5 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var6 = r8qVarH2.U;
                        l7q l7qVarA5 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, l7qVarA5);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().e.setOnSpinnerValueClicked(new f5o(this, (byte) 23));
        final byte b5 = 4;
        G0().e.setOnCarriageViewClicked(new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b6 = b5;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b6) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX5 = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX5.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var6 = r8qVarH2.U;
                            l7q l7qVarA5 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, l7qVarA5);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX6 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var7 = r8qVarH2.U;
                        l7q l7qVarA6 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, l7qVarA6);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "BET_ALREADY_DONE_REQUEST_KEY", new d6q(this, b4));
        C().u0("REQUEST_FINISH_MAKE_BET_DIALOG_KEY", this, new z9f(this, (byte) 25));
        final byte b6 = 5;
        sj3.t0(this, "CHOOSE_INSTRUMENTS_DIALOG_KEY", new Function1(this) { // from class: a.e6q
            public final /* synthetic */ i6q b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0073  */
            /* JADX WARN: Code duplicated, block: B:42:0x0092 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x008a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0098 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kt2 kt2Var;
                String str;
                ArrayList arrayList;
                boolean z;
                String str2;
                byte b7 = b6;
                yje yjeVar = null;
                i6q i6qVar = this.b;
                switch (b7) {
                    case 0:
                        iiy[] iiyVarArr = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH0 = i6qVar.H0();
                        r8qVarH0.T.f(new w7q(r8qVarH0.x().c, !r8qVarH0.x().b));
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = i6q.V1;
                        ((View) obj).getClass();
                        r8q r8qVarH1 = i6qVar.H0();
                        r8qVarH1.T.f(new w7q(r8qVarH1.x().c, !r8qVarH1.x().b));
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = i6q.V1;
                        ((View) obj).getClass();
                        i6qVar.H0().E();
                        break;
                    case 4:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr5 = i6q.V1;
                        p7m0 p7m0Var = i6qVar.H0().R;
                        s7q s7qVar = new s7q(new p0d(iIntValue, qic.c));
                        p7m0Var.getClass();
                        p7m0Var.o(null, s7qVar);
                        break;
                    default:
                        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
                        iiy[] iiyVarArr6 = i6q.V1;
                        finInstrumentUIModel.getClass();
                        r8q r8qVarH2 = i6qVar.H0();
                        int i = finInstrumentUIModel.f46648a;
                        String str3 = finInstrumentUIModel.b;
                        r8qVarH2.W = i;
                        mii0 mii0Var = r8qVarH2.e;
                        zr1 zr1Var = r8qVarH2.N;
                        fcq fcqVar = finInstrumentUIModel.d;
                        zr1Var.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
                        int iOrdinal = fcqVar.ordinal();
                        if (iOrdinal == 1) {
                            kt2Var = (kt2) mii0Var.b;
                            str = "random";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                kt2Var = (kt2) mii0Var.b;
                                str = "bull";
                            }
                            l7q l7qVarX6 = r8qVarH2.x();
                            arrayList = new ArrayList();
                            for (FinInstrumentUIModel finInstrumentUIModel2 : l7qVarX6.c) {
                                z = finInstrumentUIModel2.e;
                                str2 = finInstrumentUIModel2.b;
                                if (!z && Intrinsics.d(str2, str3)) {
                                    break;
                                } else if (finInstrumentUIModel2.e) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                                } else if (Intrinsics.d(str2, str3)) {
                                    arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                                } else {
                                    arrayList.add(finInstrumentUIModel2);
                                }
                            }
                            p7m0 p7m0Var7 = r8qVarH2.U;
                            l7q l7qVarA6 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                            p7m0Var7.getClass();
                            p7m0Var7.o(null, l7qVarA6);
                            qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        } else {
                            kt2Var = (kt2) mii0Var.b;
                            str = "bear";
                        }
                        i8i.D("option", str, kt2Var, "finbet_type_choose");
                        l7q l7qVarX7 = r8qVarH2.x();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            z = finInstrumentUIModel2.e;
                            str2 = finInstrumentUIModel2.b;
                            if (!z) {
                            }
                            if (finInstrumentUIModel2.e) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel2, false));
                            } else if (Intrinsics.d(str2, str3)) {
                                arrayList.add(FinInstrumentUIModel.a(finInstrumentUIModel, true));
                            } else {
                                arrayList.add(finInstrumentUIModel2);
                            }
                        }
                        p7m0 p7m0Var8 = r8qVarH2.U;
                        l7q l7qVarA7 = l7q.a(r8qVarH2.x(), false, arrayList, 3);
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, l7qVarA7);
                        qjj.W(r8qVarH2.X, r8qVarH2.i.b, null, new j0l((Object) r8qVarH2, (Object) arrayList, yjeVar, (byte) 29), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new d6q(this, b3));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(k6q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            k6q k6qVar = (k6q) (ze3Var instanceof k6q ? ze3Var : null);
            if (k6qVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                o0();
                i1w0VarF.getClass();
                cad cadVar = k6qVar.f17782a;
                m1e m1eVar = k6qVar.b;
                ctf0 ctf0Var = k6qVar.c;
                btt0 btt0Var = k6qVar.d;
                ort ortVar = k6qVar.e;
                sa10 sa10Var = k6qVar.g;
                mii0 mii0Var = k6qVar.h;
                duj dujVar = k6qVar.i;
                lgn0 lgn0Var = k6qVar.n;
                ii iiVar = k6qVar.f;
                v88 v88Var = k6qVar.j;
                wsf0 wsf0Var = k6qVar.o;
                rmd0 rmd0Var = k6qVar.k;
                drm0 drm0Var = k6qVar.p;
                gii0 gii0Var = k6qVar.m;
                knf0 knf0Var = k6qVar.l;
                wdk0 wdk0Var = k6qVar.q;
                o2j0 o2j0Var = k6qVar.r;
                vqc vqcVar = k6qVar.s;
                j1q0 j1q0Var = k6qVar.t;
                pru pruVar = k6qVar.u;
                pmi pmiVar = k6qVar.v;
                d1p d1pVar = k6qVar.w;
                q6q q6qVar = k6qVar.x;
                dev devVar = k6qVar.y;
                lbu lbuVar = k6qVar.z;
                r9u r9uVar = k6qVar.A;
                rou rouVar = k6qVar.B;
                rmd0Var.getClass();
                o2j0Var.getClass();
                d1pVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                j1q0Var.getClass();
                q6qVar.getClass();
                devVar.getClass();
                r9uVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(r8q.class, (f7i) new t7i(cadVar, rmd0Var, drm0Var, wsf0Var, o2j0Var, vqcVar, d1pVar, iiVar, lgn0Var, i1w0VarF, m1eVar, ctf0Var, btt0Var, ortVar, sa10Var, mii0Var, dujVar, v88Var, knf0Var, gii0Var, wdk0Var, pruVar, pmiVar, q6qVar, devVar, lbuVar, r9uVar, rouVar).y));
                this.N1 = rmd0Var.f();
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                this.Q1 = lgn0Var;
                this.R1 = new d720(lbuVar, new lk5(pruVar, r9uVar, (byte) 3));
                return;
            }
        }
        jf4.n(b1j.i(k6q.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().T;
        yje yjeVar = null;
        h6q h6qVar = new h6q(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g6q((gmq) ol60Var, clzVarW, h6qVar, (yje) null, (byte) 0), 3);
        xae0 xae0VarN = vtb.N(H0().Q);
        h6q h6qVar2 = new h6q(this, yjeVar, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g6q(xae0VarN, clzVarW2, h6qVar2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(H0().S);
        h6q h6qVar3 = new h6q(this, yjeVar, (byte) 4);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g6q(xae0VarN2, clzVarW3, h6qVar3, (yje) null, (char) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().U);
        h6q h6qVar4 = new h6q(this, yjeVar, (byte) 0);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new g6q(xae0VarN3, clzVarW4, h6qVar4, (yje) null), 3);
        p7m0 p7m0Var = H0().R;
        h6q h6qVar5 = new h6q(this, yjeVar, (byte) 1);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new g6q(p7m0Var, clzVarW5, h6qVar5, (yje) null), 3);
    }

    public final j6q G0() {
        Object objN = this.U1.n(V1[0], this);
        objN.getClass();
        return (j6q) objN;
    }

    public final r8q H0() {
        return (r8q) this.S1.getValue();
    }

    public final void I0(boolean z) {
        J0(!z);
        G0().h.setVisibility(!z ? 0 : 8);
        if (z) {
            G0().t.setText(H(R.string.finance_bets));
        }
    }

    public final void J0(boolean z) {
        G0().l.setAlpha(z ? 1.0f : 0.5f);
        G0().l.setEnabled(z);
        G0().k.setEnabled(z);
    }

    public final void K0(double d, long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        brm0.B(str, str2, str5);
        lgn0 lgn0Var = this.Q1;
        if (lgn0Var == null) {
            Intrinsics.h("successBetAlertManager");
            throw null;
        }
        String strH = H(R.string.bet_processed_successfully);
        strH.getClass();
        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
        String strH2 = H(R.string.finance_bet);
        lc00 lc00VarB = kotlin.collections.a.b();
        String strH3 = H(R.string.coefficient);
        strH3.getClass();
        lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, str3));
        String strH4 = H(R.string.bet_sum);
        strH4.getClass();
        pn40 pn40Var = pn40.f27267a;
        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, o0()), strH4, pn40.c(d, p3u0.c), str2, true));
        if (!z) {
            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, o0()), StringsKt.v0(kotlin.text.c.r(str5, Separators.COLON, "", false)).toString(), StringsKt.v0(kotlin.text.c.r(str4, str2, "", false)).toString(), str2, false));
        }
        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH2, str, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j), "SIMPLE", kotlin.collections.a.a(lc00VarB)), this);
    }

    public final void L0(long j, String str, String str2) {
        str.getClass();
        lgn0 lgn0Var = this.Q1;
        if (lgn0Var == null) {
            Intrinsics.h("successBetAlertManager");
            throw null;
        }
        String strH = H(R.string.bet_processed_successfully);
        strH.getClass();
        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
        String strQ = w6x.q(H(R.string.promo), ": ", H(R.string.finance_bet));
        String strH2 = H(R.string.coefficient);
        strH2.getClass();
        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strQ, str, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j), "PROMO", kotlin.collections.a.c(new SuccessBetInfoItem.Simple(strH2, str2))), this);
    }

    public final void M0(boolean z) {
        if (z) {
            G0().g.setImageDrawable(epv0.U(R.drawable.ic_arrow_downward, o0()));
            AppCompatImageView appCompatImageView = G0().g;
            TypedValue typedValue = j5d.f15927a;
            appCompatImageView.setImageTintList(j5d.c(o0(), R.color.static_red, R.color.static_red));
            return;
        }
        G0().g.setImageDrawable(epv0.U(R.drawable.ic_arrow_upward, o0()));
        AppCompatImageView appCompatImageView2 = G0().g;
        TypedValue typedValue2 = j5d.f15927a;
        appCompatImageView2.setImageTintList(j5d.c(o0(), R.color.static_green, R.color.static_green));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        r8q r8qVarH0 = H0();
        v3c.N(r8qVarH0.V);
        p7m0 p7m0Var = r8qVarH0.Q;
        if (p7m0Var.getValue() instanceof f8q) {
            return;
        }
        p7m0Var.o(null, g8q.f10878a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        r8q r8qVarH0 = H0();
        ((h7q) r8qVarH0.p.b).c.c = 0L;
        if (r8qVarH0.Q.getValue() instanceof g8q) {
            qjj.W(r8qVarH0.X, r8qVarH0.i.b, null, new e3p(r8qVarH0, null, (byte) 2), 2);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
