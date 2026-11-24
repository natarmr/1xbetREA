package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.transation_history.presentation.TransactionHistoryScreen;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryPickerView;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.MultiLineChipsListView;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bw20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3305a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bw20(cp cpVar, Object obj, byte b) {
        this.f3305a = b;
        this.b = cpVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3305a;
        bj80 bj80Var = bj80.f2694a;
        ej80 ej80Var = ej80.f7896a;
        bwh0 bwh0Var = bwh0.f3325a;
        hj80 hj80Var = hj80.f13150a;
        byte b2 = 8;
        byte b3 = 9;
        byte b4 = 11;
        byte b5 = 2;
        byte b6 = 1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((View) obj).getClass();
                ((du20) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 1:
                cp cpVar = (cp) obj2;
                Context context = cpVar.w;
                x530 x530Var = (x530) obj3;
                ((List) obj).getClass();
                hux huxVar = (hux) cpVar.u;
                TextView textView = huxVar.d;
                textView.setText(((gw20) cpVar.u()).f12005a);
                ImageView imageView = huxVar.c;
                imageView.setVisibility(((gw20) cpVar.u()).c == cw20.f5060a ? 0 : 4);
                imageView.setOnTouchListener(new yv5(x530Var, cpVar, b6));
                boolean z = ((gw20) cpVar.u()).d;
                ImageView imageView2 = huxVar.b;
                if (z) {
                    Drawable background = imageView2.getBackground();
                    TypedValue typedValue = j5d.f15927a;
                    sj3.B0(background, context, j5d.a(context, R.attr.uikitPrimary, false));
                    textView.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
                } else {
                    Drawable background2 = imageView2.getBackground();
                    TypedValue typedValue2 = j5d.f15927a;
                    sj3.B0(background2, context, j5d.a(context, R.attr.uikitSecondary, false));
                    textView.setTextColor(j5d.a(context, R.attr.uikitSecondary, false));
                }
                return Unit.f46060a;
            case 2:
                cp cpVar2 = (cp) obj2;
                Context context2 = cpVar2.w;
                f630 f630Var = (f630) obj3;
                ((List) obj).getClass();
                iux iuxVar = (iux) cpVar2.u;
                TextView textView2 = iuxVar.d;
                textView2.setText(((hw20) cpVar2.u()).f13751a);
                ImageView imageView3 = iuxVar.c;
                imageView3.setVisibility(((hw20) cpVar2.u()).c == dw20.f6775a ? 0 : 4);
                imageView3.setOnTouchListener(new yv5(f630Var, cpVar2, (byte) 2));
                boolean z2 = ((hw20) cpVar2.u()).d;
                ImageView imageView4 = iuxVar.b;
                if (z2) {
                    Drawable background3 = imageView4.getBackground();
                    TypedValue typedValue3 = j5d.f15927a;
                    sj3.B0(background3, context2, j5d.a(context2, R.attr.uikitPrimary, false));
                    textView2.setTextColor(j5d.a(context2, R.attr.uikitTextPrimary, false));
                } else {
                    Drawable background4 = imageView4.getBackground();
                    TypedValue typedValue4 = j5d.f15927a;
                    sj3.B0(background4, context2, j5d.a(context2, R.attr.uikitSecondary, false));
                    textView2.setTextColor(j5d.a(context2, R.attr.uikitSecondary, false));
                }
                return Unit.f46060a;
            case 3:
                gho ghoVar = (gho) obj;
                ghoVar.getClass();
                ((Function2) obj3).invoke(ghoVar, Long.valueOf(((e530) obj2).f7212a));
                return Unit.f46060a;
            case 4:
                cbl0 cbl0Var = (cbl0) obj3;
                bbl0 bbl0Var = (bbl0) obj2;
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                xcz xczVar = new xcz(0, 3, 0);
                pz40 pz40VarE = androidx.compose.runtime.e.e(lak0.c);
                Boolean bool = Boolean.FALSE;
                pz40 pz40VarE2 = androidx.compose.runtime.e.e(bool);
                pz40 pz40VarE3 = androidx.compose.runtime.e.e(bool);
                pz40 pz40VarE4 = androidx.compose.runtime.e.e(bool);
                vsx vsxVar = (vsx) cpVar3.u;
                pkd.h(vsxVar.c, jdk0.g, null, new ugd(1907063064, true, new fn0((Object) pz40VarE, (Object) pz40VarE2, (Object) pz40VarE4, (Object) pz40VarE3, (Object) xczVar, (Object) cpVar3, (Object) cbl0Var, (byte) 10)));
                dyb.b0(vsxVar.b, ymx.INTERVAL_400, new asw(bbl0Var, cpVar3, (byte) 2));
                cpVar3.t(new ag30(pz40VarE2, cpVar3, pz40VarE, pz40VarE4, pz40VarE2, cpVar3, pz40VarE));
                cpVar3.x(new bb(cpVar3, b4));
                return Unit.f46060a;
            case 5:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((ug30) obj3).f35605a;
                hczVar.f(a4xVar.size(), null, new bgz(a4xVar, (byte) 29), new ugd(2039820996, true, new a100(a4xVar, (Function1) obj2, (byte) 4)));
                return Unit.f46060a;
            case 6:
                al30 al30Var = (al30) obj3;
                DsSettingsCell dsSettingsCell = (DsSettingsCell) obj;
                dsSettingsCell.getClass();
                zkk zkkVarA = zkk.a(dsSettingsCell);
                zkkVarA.d.setText(String.valueOf(al30Var.f1050a));
                ((TextView) zkkVarA.e).setText(al30Var.d);
                List list = u0d.f34849a;
                u0d.p((RoundCornerImageView) zkkVarA.i, u0d.q(al30Var.c), (Drawable) obj2);
                jk30 jk30Var = (jk30) zkkVarA.b;
                ImageView imageView5 = jk30Var.c;
                bl30 bl30Var = al30Var.g;
                imageView5.setImageResource(bl30Var.f2777a);
                jk30Var.d.setText(bl30Var.b);
                jk30 jk30Var2 = (jk30) zkkVarA.g;
                ImageView imageView6 = jk30Var2.c;
                bl30 bl30Var2 = al30Var.f;
                imageView6.setImageResource(bl30Var2.f2777a);
                jk30Var2.d.setText(bl30Var2.b);
                jk30 jk30Var3 = (jk30) zkkVarA.c;
                ImageView imageView7 = jk30Var3.c;
                bl30 bl30Var3 = al30Var.e;
                imageView7.setImageResource(bl30Var3.f2777a);
                jk30Var3.d.setText(bl30Var3.b);
                jk30 jk30Var4 = (jk30) zkkVarA.h;
                ImageView imageView8 = jk30Var4.c;
                bl30 bl30Var4 = al30Var.h;
                imageView8.setImageResource(bl30Var4.f2777a);
                jk30Var4.d.setText(bl30Var4.b);
                return Unit.f46060a;
            case 7:
                cp cpVar4 = (cp) obj2;
                Context context3 = cpVar4.w;
                ((List) obj).getClass();
                List list2 = u0d.f34849a;
                yfu0 yfu0Var = cpVar4.u;
                u0d.p(((gl30) yfu0Var).b, u0d.q(((hl30) cpVar4.u()).d), (Drawable) obj3);
                gl30 gl30Var = (gl30) yfu0Var;
                gl30Var.f.setText(String.valueOf(((hl30) cpVar4.u()).f13238a));
                gl30Var.d.setText(((hl30) cpVar4.u()).c);
                gl30Var.c.setText(((hl30) cpVar4.u()).g);
                gl30Var.g.setText(((hl30) cpVar4.u()).f);
                gl30Var.e.setText(((hl30) cpVar4.u()).e);
                gl30Var.h.setText(((hl30) cpVar4.u()).h);
                int i = ((hl30) cpVar4.u()).f13238a % 2;
                ConstraintLayout constraintLayout = gl30Var.f11472a;
                if (i == 0) {
                    constraintLayout.setBackgroundColor(m5d.f(context3, R.attr.uikitBackgroundGroup, false, m5d.e(m5d.g(context3, R.attr.uikitTheme, 6), context3)));
                } else {
                    constraintLayout.setBackgroundColor(m5d.f(context3, R.attr.uikitBackgroundContent, false, m5d.e(m5d.g(context3, R.attr.uikitTheme, 6), context3)));
                }
                return Unit.f46060a;
            case 8:
                HistoryMenuItem historyMenuItem = (HistoryMenuItem) obj;
                historyMenuItem.getClass();
                ((Function1) obj3).invoke(new t27(historyMenuItem, ((qp30) obj2).b));
                return Unit.f46060a;
            case 9:
                zvh0 zvh0Var = (zvh0) obj2;
                iwh0 iwh0Var = (iwh0) obj;
                iwh0Var.getClass();
                ctf0 ctf0Var = ((mkw) obj3).b;
                nj80 nj80Var = new nj80(hj80Var, new yvh0(ctf0Var.b.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                nj80 nj80Var2 = new nj80(ej80Var, new yvh0(ctf0Var.b.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                if (!iwh0Var.b) {
                    nj80Var2 = null;
                }
                nj80 nj80Var3 = new nj80(bj80Var, new yvh0(ctf0Var.b.a(R.string.bet_type_coeff, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                if (!iwh0Var.c) {
                    nj80Var3 = null;
                }
                i4 i4VarR0 = dyb.r0(tx3.z(new nj80[]{nj80Var, nj80Var2, nj80Var3}));
                fo7 fo7Var = iwh0Var.f15490a;
                if (fo7Var instanceof co7) {
                    b6 = 0;
                } else if (!(fo7Var instanceof zn7)) {
                    if (!(fo7Var instanceof xn7)) {
                        t9f.b();
                        return null;
                    }
                    b6 = 2;
                }
                return new vwh0(b6, i4VarR0, xdx.O(zvh0Var));
            case 10:
                zvh0 zvh0Var2 = (zvh0) obj2;
                fwh0 fwh0Var = (fwh0) obj;
                fwh0Var.getClass();
                ctf0 ctf0Var2 = ((op30) obj3).b;
                lsm0 lsm0Var = ctf0Var2.b;
                lsm0 lsm0Var2 = ctf0Var2.b;
                i4 i4VarR1 = dyb.r0(tx3.z(new nj80[]{new nj80(hj80Var, new yvh0(lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0)), bwh0Var)), fwh0Var.b ? new nj80(ej80Var, new yvh0(lsm0Var2.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)) : null, fwh0Var.c ? new nj80(bj80Var, new yvh0(lsm0Var2.a(R.string.bet_type_coeff, Arrays.copyOf(new Object[0], 0)), bwh0Var)) : null}));
                ko7 ko7Var = fwh0Var.f10260a;
                if (ko7Var instanceof jo7) {
                    b6 = 0;
                } else if (!(ko7Var instanceof io7)) {
                    if (!(ko7Var instanceof ho7)) {
                        t9f.b();
                        return null;
                    }
                    b6 = 2;
                }
                return new vwh0(b6, i4VarR1, vdx.f0(zvh0Var2));
            case 11:
                slp slpVar = (slp) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = slpVar.b;
                hczVar2.f(a4xVar2.size(), new dwy(new pua((byte) 17), a4xVar2, (byte) 2), new ap30(a4xVar2, (byte) 5), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) slpVar, (Function1) obj2, b2)));
                return Unit.f46060a;
            case 12:
                Function1 function1 = (Function1) obj3;
                vhp vhpVar = (vhp) obj2;
                mzl mzlVar = (mzl) obj;
                mzlVar.getClass();
                if ((mzlVar instanceof hzl) || (mzlVar instanceof izl)) {
                    function1.invoke(new gmp(vhpVar));
                } else if (mzlVar instanceof jzl) {
                    function1.invoke(new fmp(vhpVar.f37442a));
                } else if (mzlVar instanceof kzl) {
                    kzl kzlVar = (kzl) mzlVar;
                    function1.invoke(new imp(kzlVar.f19157a, kzlVar.b, kzlVar.c, kzlVar.d));
                } else {
                    if (!(mzlVar instanceof lzl)) {
                        t9f.b();
                        return null;
                    }
                    lzl lzlVar = (lzl) mzlVar;
                    function1.invoke(new jmp(lzlVar.f20911a, lzlVar.b, lzlVar.c, lzlVar.d));
                }
                return Unit.f46060a;
            case 13:
                int i2 = MemoryPickerView.c;
                ((View) obj).getClass();
                ((MemoryPickerView) obj3).f46442a.invoke((ht30) obj2);
                return Unit.f46060a;
            case 14:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new TransactionHistoryScreen(((kzv) obj2).f19169a, String.valueOf(((ql5) obj3).f28916a)));
                return Unit.f46060a;
            case 15:
                c240 c240Var = (c240) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                peg0 peg0Var = ((j340) obj3).W;
                String str = c240Var.g;
                long j = c240Var.e;
                if (j > 0) {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                k0w0Var2.h(peg0Var.q(new fr1(new fs80(str, c240Var.d, null, null, j, false, 108), null, 2)));
                return Unit.f46060a;
            case 16:
                d240 d240Var = (d240) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(((j340) obj3).W.q(new fr1(new fs80(d240Var.g, d240Var.d, null, null, 0L, false, 124), null, 2)));
                return Unit.f46060a;
            case 17:
                ((d140) obj).getClass();
                return new db2((ctf0) obj3, (qho) obj2);
            case 18:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(oct.f(((j340) obj3).X, 0L, null, 0, (t270) obj2, null, 23));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jdk0 jdk0Var = ((j340) obj3).A0;
                vh0 vh0Var = ((gx10) obj2).b;
                long j2 = vh0Var.g;
                String str2 = vh0Var.b;
                boolean z3 = vh0Var.i;
                long j3 = vh0Var.h;
                boolean z4 = vh0Var.j;
                jdk0Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j2, str2, 0L, z3, j3, z4, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 20:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar3 = ((w740) obj3).f38653a;
                hczVar3.f(a4xVar3.size(), new ygy(new tr20((byte) 27), a4xVar3, (byte) 19), new ap30(a4xVar3, (byte) 8), new ugd(802480018, true, new a100(a4xVar3, (Function1) obj2, b3)));
                return Unit.f46060a;
            case 21:
                mlr mlrVar = (mlr) obj2;
                uf3 uf3Var = ((m940) obj3).Q;
                long j4 = mlrVar.f22006a;
                String str3 = mlrVar.f;
                long j5 = mlrVar.c;
                boolean z5 = mlrVar.l;
                long j6 = mlrVar.b;
                boolean z6 = mlrVar.m;
                boolean z7 = mlrVar.n;
                uf3Var.getClass();
                str3.getClass();
                c8d c8dVar2 = (c8d) ((k0w0) obj).h(jdk0.f(j4, str3, j5, z5, j6, z6, true, 0, z7, true, false, "", true)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(!mlrVar.n, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 22:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar4 = ((ia40) obj3).b.i;
                hczVar4.f(a4xVar4.size(), null, new ap30(a4xVar4, (byte) 9), new ugd(802480018, true, new a100(a4xVar4, (Function1) obj2, (byte) 10)));
                return Unit.f46060a;
            case 23:
                hcz hczVar5 = (hcz) obj;
                uuz uuzVar = kc40.l2;
                hczVar5.getClass();
                a4x a4xVar5 = ((ic40) obj3).f14518a;
                hczVar5.f(a4xVar5.size(), null, new ap30(a4xVar5, (byte) 11), new ugd(802480018, true, new a100(a4xVar5, (Function1) obj2, b4)));
                return Unit.f46060a;
            case 24:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(((bd40) obj3).t.h(new GameScreenGeneralParams(((xa40) obj2).f40536a, 0L, 40L, 1L, true, 0L, true, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                ((ql40) obj3).f(th, (vne) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                t33 t33Var = (t33) obj2;
                uag0 uag0Var = (uag0) obj;
                float fL = ((agk0) ((xpj0) obj3).e.l).l();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (uag0Var.r & 4294967295L));
                if (!Float.isNaN(fL) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) t33Var.d()).floatValue();
                    uag0Var.w(dm40.d(uag0Var, fFloatValue));
                    uag0Var.y(dm40.e(uag0Var, fFloatValue));
                    uag0Var.G(osm0.e(0.5f, (fL + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hp40 hp40Var = (hp40) obj3;
                Function1 function2 = (Function1) obj2;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                if (!StringsKt.W(hp40Var.b)) {
                    hcz.e(hczVar6, null, null, new ugd(1092657307, true, new p0z((Object) hp40Var, (byte) 16)), 3);
                }
                x6q0 x6q0Var = hp40Var.c;
                if (x6q0Var != null) {
                    hcz.e(hczVar6, null, null, new ugd(-2146116106, true, new ngz(x6q0Var, function2, (byte) 21)), 3);
                }
                jjm jjmVar = hp40Var.d;
                if (jjmVar != null) {
                    hcz.e(hczVar6, null, null, new ugd(70840095, true, new yz8(jjmVar, b5)), 3);
                    List list3 = hp40Var.e;
                    hczVar6.f(list3.size(), null, new ap30(list3, (byte) 14), new ugd(2039820996, true, new a100(list3, function2, (byte) 12)));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ip40 ip40Var = (ip40) obj3;
                pcq pcqVar = (pcq) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                duj dujVar = ip40Var.r;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                dujVar.b(th2, new ba30(ip40Var, pcqVar, (byte) 13));
                return Unit.f46060a;
            default:
                int i3 = MultiLineChipsListView.x;
                ((View) obj).getClass();
                ((MultiLineChipsListView) obj3).w.invoke((aw40) obj2);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bw20(Object obj, Object obj2, byte b) {
        this.f3305a = b;
        this.c = obj;
        this.b = obj2;
    }
}
