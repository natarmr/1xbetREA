package a;

import android.gov.nist.core.Separators;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.AnyValue;
import okhttp3.tls.internal.der.DerWriter;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17493a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(Object obj, Object obj2, byte b) {
        this.f17493a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        jv jvVar;
        String string;
        String strE;
        byte b = this.f17493a;
        byte b2 = 4;
        byte b3 = 9;
        byte b4 = 17;
        byte b5 = 10;
        byte b6 = 6;
        byte b7 = 3;
        byte b8 = 2;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        byte b9 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((gy40) obj3).b((iub0) obj2);
                return Unit.f46060a;
            case 1:
                rno0 rno0Var = (rno0) obj3;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = rno0Var.b;
                i8zVar.e(a4xVar.size(), new g5(new hhd(b9), a4xVar, b7), new a8(new ahd((byte) 16), a4xVar, objArr3 == true ? 1 : 0), new b8(a4xVar, objArr2 == true ? 1 : 0), new ugd(-1942245546, true, new c8((List) a4xVar, obj2, (Object) rno0Var, (byte) (objArr == true ? 1 : 0))));
                return Unit.f46060a;
            case 2:
                sno0 sno0Var = (sno0) obj3;
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                a4x a4xVar2 = sno0Var.b;
                i8zVar2.e(a4xVar2.size(), new g5(new hhd(b8), a4xVar2, b2), new a8(new ahd(b4), a4xVar2, b9), new b8(a4xVar2, b9), new ugd(-1942245546, true, new c8(a4xVar2, (Function1) obj2, sno0Var, b9)));
                return Unit.f46060a;
            case 3:
                tno0 tno0Var = (tno0) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar3 = tno0Var.b;
                hczVar.f(a4xVar3.size(), new g5(new hhd(b7), a4xVar3, (byte) 5), new b8(a4xVar3, b8), new ugd(2039820996, true, new c8(a4xVar3, (Function1) obj2, tno0Var, b8)));
                return Unit.f46060a;
            case 4:
                uno0 uno0Var = (uno0) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar4 = uno0Var.b;
                hczVar2.f(a4xVar4.size(), new g5(new hhd(b2), a4xVar4, b6), new b8(a4xVar4, b7), new ugd(2039820996, true, new c8(a4xVar4, (Function1) obj2, uno0Var, b7)));
                return Unit.f46060a;
            case 5:
                c240 c240Var = (c240) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                peg0 peg0Var = ((ab) obj3).m;
                String str = c240Var.g;
                long j = c240Var.e;
                if (j > 0) {
                    str = null;
                }
                k0w0Var.h(peg0Var.q(new fr1(new fs80(str == null ? "" : str, c240Var.d, null, null, j, false, 108), null, 2)));
                return Unit.f46060a;
            case 6:
                d240 d240Var = (d240) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(((ab) obj3).m.q(new fr1(new fs80(d240Var.g, d240Var.d, null, null, 0L, false, 124), null, 2)));
                return Unit.f46060a;
            case 7:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(oct.f(((ab) obj3).n, 0L, null, 0, (t270) obj2, null, 23));
                return Unit.f46060a;
            case 8:
                jdk0 jdk0Var = ((ab) obj3).V;
                vh0 vh0Var = ((gx10) obj2).b;
                long j2 = vh0Var.g;
                String str2 = vh0Var.b;
                boolean z = vh0Var.i;
                long j3 = vh0Var.h;
                boolean z2 = vh0Var.j;
                jdk0Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j2, str2, 0L, z, j3, z2, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 9:
                ((View) obj).getClass();
                ((q9) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 10:
                ((View) obj).getClass();
                ((q9) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.f40887a.setOnClickListener(new wg(obj3, (Object) cpVar, (byte) (objArr5 == true ? 1 : 0)));
                cpVar.t(new xg(cpVar, obj2, cpVar, (byte) (objArr4 == true ? 1 : 0)));
                return Unit.f46060a;
            case 12:
                ((View) obj).getClass();
                ((du20) obj3).invoke(((li) ((cp) obj2).u()).f20081a);
                return Unit.f46060a;
            case 13:
                ((View) obj).getClass();
                ((du20) obj3).invoke(((mi) ((cp) obj2).u()).f21821a);
                return Unit.f46060a;
            case 14:
                ((View) obj).getClass();
                ((t0) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 15:
                DerWriter derWriter = (DerWriter) obj3;
                AnyValue anyValue = (AnyValue) obj2;
                ((t99) obj).getClass();
                qg9 qg9Var = anyValue.e;
                derWriter.getClass();
                qg9Var.getClass();
                derWriter.a().N0(qg9Var);
                derWriter.d = anyValue.c;
                return Unit.f46060a;
            case 16:
                au90 au90Var = (au90) obj;
                au90Var.getClass();
                ((Function1) obj3).invoke(new vs(((lt) obj2).b.e, au90Var));
                return Unit.f46060a;
            case 17:
                ((View) obj).getClass();
                ((ttn0) obj3).invoke(((xt) ((cp) obj2).u()).f41440a);
                return Unit.f46060a;
            case 18:
                xu xuVar = (xu) obj3;
                pz40 pz40Var = (pz40) obj2;
                x5q0 x5q0Var = (x5q0) obj;
                gfk0 gfk0Var = xu.Q1;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    pz40Var.setValue(((w5q0) x5q0Var).f38596a);
                    pv pvVarJ0 = xuVar.J0();
                    String str3 = (String) pz40Var.getValue();
                    String str4 = (str3 == null || (string = str3.toString()) == null) ? "" : string;
                    p7m0 p7m0Var = pvVarJ0.o;
                    do {
                        value = p7m0Var.getValue();
                        jvVar = (jv) value;
                    } while (!p7m0Var.m(value, jv.a(jvVar, false, null, str4, str4.length() > 0, false, c6q0.a(jvVar.f, String.valueOf(str3), r7q0.f29989a, false, 262102), 19)));
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g00 g00Var = (g00) obj3;
                swp0 swp0Var = (swp0) obj2;
                ((k0w0) obj).h(g00Var.i.J0(new TokenRestoreData(swp0Var.b, swp0Var.f32933a, ((TokenRestoreData) g00Var.c.b).c), -1L, we50.d));
                return Unit.f46060a;
            case 20:
                ctf0 ctf0Var = (ctf0) obj3;
                a40 a40Var = (a40) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                pzw.E(bnk0Var, ctf0Var.f(R.string.available_prepayment, new Object[0]).concat(Separators.SP), 0, 0, 0, 0, 62);
                double d = a40Var.f198a;
                if (d == -1.0d) {
                    strE = ctf0Var.f(R.string.em_dash, new Object[0]);
                } else {
                    int i2 = cy7.f5159a;
                    pn40 pn40Var = pn40.f27267a;
                    strE = cy7.e(pn40.d(d, a40Var.b, p3u0.c));
                }
                pzw.E(bnk0Var, strE, 0, 0, 1, 0, 46);
                return Unit.f46060a;
            case 21:
                i8z i8zVar3 = (i8z) obj;
                i8zVar3.getClass();
                ArrayList arrayList = ((bi0) ((di0) obj3)).f2634a;
                i8zVar3.e(arrayList.size(), new b8(xdx.E(arrayList, new b5((byte) 25)), b6), null, new g5(new b5((byte) 26), arrayList, b3), new ugd(-2091135074, true, new sh0(arrayList, (Function1) obj2, objArr6 == true ? 1 : 0)));
                return Unit.f46060a;
            case 22:
                vh0 vh0Var2 = (vh0) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(((peg0) ((kb0) obj3).m).q(new fr1(new fs80(vh0Var2.b, vh0Var2.f37408a, iun.f15405a, null, 0L, false, 120), null, 2)));
                return Unit.f46060a;
            case 23:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(((peg0) ((kb0) obj3).m).q(new er1(false, ((yj0) obj2).b)));
                return Unit.f46060a;
            case 24:
                ((lwk) obj).getClass();
                return new pr0(obj3, obj2, (byte) (objArr7 == true ? 1 : 0));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                st0 st0Var = (st0) obj3;
                pz40 pz40Var2 = (pz40) obj2;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                o0x o0xVar = ((Boolean) pz40Var2.getValue()).booleanValue() ? st0Var.e : st0Var.f;
                zai0 zai0Var = lt0.c;
                iiy iiyVar = lt0.f20606a[1];
                zai0Var.getClass();
                abi0Var.b(zai0Var, o0xVar);
                cbi0.d(abi0Var, ((Boolean) pz40Var2.getValue()).booleanValue());
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                s11 s11Var = (s11) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                if (s11Var.d instanceof h7v) {
                    hcz.e(hczVar3, "chips_unique_key_for_column", null, new ugd(-1120579997, true, new ri1(s11Var, function1, (byte) 21)), 2);
                }
                for (Object obj4 : s11Var.e) {
                    int i3 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    r11 r11Var = (r11) obj4;
                    if (r11Var.f29655a instanceof vzh) {
                        hcz.e(hczVar3, null, null, new ugd(-496313323, true, new un6(r11Var, b3)), 3);
                    } else {
                        hcz.e(hczVar3, w6x.n(i, r11Var.g, BundleUtil.UNDERLINE_TAG), null, new ugd(-1133560930, true, new ri1(r11Var, function1, (byte) 22)), 2);
                    }
                    i = i3;
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                u11 u11Var = (u11) obj3;
                Function1 function2 = (Function1) obj2;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                if (u11Var.c instanceof h7v) {
                    hcz.e(hczVar4, null, null, new ugd(2106715372, true, new ri1(u11Var, function2, (byte) 20)), 3);
                }
                hcz.e(hczVar4, null, null, new ugd(134020241, true, new un6(u11Var, (byte) 8)), 3);
                a4x a4xVar5 = u11Var.d;
                hczVar4.f(a4xVar5.size(), new g5(new eo0(b5), a4xVar5, b4), new b8(a4xVar5, (byte) 15), new ugd(802480018, true, new vb(a4xVar5, function2, b6)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.e(abi0Var2, ((ayq0) obj3).f1682a);
                cbi0.d(abi0Var2, ((Boolean) ((pz40) obj2).getValue()).booleanValue());
                return Unit.f46060a;
            default:
                List list = (List) obj3;
                ctf0 ctf0Var2 = (ctf0) obj2;
                ((Unit) obj).getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                int i4 = 0;
                for (Object obj5 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str5 = (String) obj5;
                    str5.getClass();
                    Spanned spannedFromHtml = Html.fromHtml(str5, 0);
                    spannedFromHtml.getClass();
                    String string2 = spannedFromHtml.toString();
                    if (i4 == list.size() - 1) {
                        string2 = w6x.q(StringsKt.v0(string2).toString(), Separators.RETURN, ctf0Var2.b.a(R.string.bonus_freespin_gifts_hint, Arrays.copyOf(new Object[0], 0)));
                    }
                    arrayList2.add(string2);
                    i4 = i5;
                }
                a4x a4xVarO0 = dyb.o0(arrayList2);
                lsm0 lsm0Var = ctf0Var2.b;
                lsm0 lsm0Var2 = ctf0Var2.b;
                String strA = lsm0Var.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                return new yec0(a4xVarO0, strA, new wul(lulVar, oe9Var, new ue9(lsm0Var2.a(R.string.go_to_gifts, Arrays.copyOf(new Object[0], 0))), true, false, false), new wul(nul.e, oe9Var, new ue9(lsm0Var2.a(R.string.later, Arrays.copyOf(new Object[0], 0))), true, false, false));
        }
    }
}
