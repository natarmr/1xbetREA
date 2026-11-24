package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b8q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2169a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8q0(cp cpVar, String str) {
        this.f2169a = (byte) 29;
        this.c = cpVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0585  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f9q0 f9q0VarB;
        f9q0 f9q0VarB2;
        f9q0 f9q0VarB3;
        a9q0 a9q0Var;
        w03 w03VarK;
        z8q0 z8q0Var;
        byte b = this.f2169a;
        byte b2 = 3;
        byte b3 = 4;
        byte b4 = 0;
        smk0 smk0VarD = 0;
        smk0VarD = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Editable editable = (Editable) obj;
                editable.getClass();
                ((hz) obj2).invoke(editable.toString(), ((x7q0) ((cp) obj3).u()).f40425a);
                return Unit.f46060a;
            case 1:
                i83 i83Var = (i83) obj2;
                cgk0 cgk0Var = ((vb00) obj3).b;
                m2q0 m2q0Var = (m2q0) obj;
                kb00 kb00Var = (kb00) i83Var.f14321a;
                f9q0 f9q0VarB4 = kb00Var.b();
                smk0 smk0Var = f9q0VarB4 != null ? f9q0VarB4.f9167a : null;
                smk0 smk0VarD2 = ((cgk0Var.l() & 1) == 0 || (f9q0VarB3 = kb00Var.b()) == null) ? null : f9q0VarB3.b;
                if (smk0Var != null) {
                    smk0VarD2 = smk0Var.d(smk0VarD2);
                }
                smk0 smk0VarD3 = ((cgk0Var.l() & 2) == 0 || (f9q0VarB2 = kb00Var.b()) == null) ? null : f9q0VarB2.c;
                if (smk0VarD2 != null) {
                    smk0VarD3 = smk0VarD2.d(smk0VarD3);
                }
                if ((cgk0Var.l() & 4) != 0 && (f9q0VarB = kb00Var.b()) != null) {
                    smk0VarD = f9q0VarB.d;
                }
                if (smk0VarD3 != null) {
                    smk0VarD = smk0VarD3.d(smk0VarD);
                }
                m2q0Var.b = m2q0Var.f21076a.b(new nej0((Object) new hie0(), (Object) i83Var, smk0VarD, (byte) 19));
                return Unit.f46060a;
            case 2:
                e9q0 e9q0Var = (e9q0) obj2;
                i83 i83Var2 = (i83) obj3;
                uag0 uag0Var = (uag0) obj;
                j83 j83Var = e9q0Var.b;
                pz40 pz40Var = e9q0Var.f7435a;
                a9q0 a9q0Var2 = (a9q0) ((hgk0) pz40Var).getValue();
                if (Intrinsics.d(j83Var, (a9q0Var2 == null || (z8q0Var = a9q0Var2.f491a) == null) ? null : z8q0Var.f43981a) && (a9q0Var = (a9q0) ((hgk0) pz40Var).getValue()) != null) {
                    bw40 bw40Var = a9q0Var.b;
                    i83 i83VarC = e9q0.c(i83Var2, a9q0Var);
                    if (i83VarC == null) {
                        w03VarK = null;
                    } else {
                        int i = i83VarC.c;
                        int i2 = i83VarC.b;
                        w03VarK = a9q0Var.k(i2, i);
                        jge0 jge0VarB = a9q0Var.b(i2);
                        int i3 = i - 1;
                        w03VarK.k(((((long) Float.floatToRawIntBits(bw40Var.d(i2) == bw40Var.d(i3) ? Math.min(a9q0Var.b(i3).f16474a, jge0VarB.f16474a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(jge0VarB.b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    w03VarK = null;
                }
                d9q0 d9q0Var = w03VarK != null ? new d9q0(w03VarK) : null;
                if (d9q0Var != null) {
                    uag0Var.D(d9q0Var);
                    uag0Var.g(true);
                }
                return Unit.f46060a;
            case 3:
                ((x5q0) obj).getClass();
                ((Function1) obj2).invoke(new q9f0((k9q0) obj3));
                return Unit.f46060a;
            case 4:
                ((x5q0) obj).getClass();
                ((Function1) obj2).invoke(new fwe0((l9q0) obj3));
                return Unit.f46060a;
            case 5:
                ((x5q0) obj).getClass();
                ((Function1) obj2).invoke(new o3f0((m9q0) obj3));
                return Unit.f46060a;
            case 6:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                String string = StringsKt.u0((String) obj2).toString();
                string.getClass();
                zai0 zai0Var = paq0.b;
                iiy[] iiyVarArr = paq0.f26667a;
                iiy iiyVar = iiyVarArr[0];
                zai0Var.getClass();
                abi0Var.b(zai0Var, string);
                String string2 = StringsKt.u0((String) obj3).toString();
                string2.getClass();
                zai0 zai0Var2 = paq0.c;
                iiy iiyVar2 = iiyVarArr[1];
                zai0Var2.getClass();
                abi0Var.b(zai0Var2, string2);
                return Unit.f46060a;
            case 7:
                chq0 chq0Var = (chq0) obj2;
                DsChip dsChip = (DsChip) obj;
                dsChip.getClass();
                dsChip.setSelectedForced(chq0Var.a());
                dsChip.setText(null);
                dsChip.setText(chq0Var.getTitle());
                dsChip.setIconTint(null);
                dsChip.setCount(null);
                dsChip.setValueText(null);
                dsChip.setOnClickListener(new bs50(obj3, (Object) chq0Var, (byte) 16));
                if (chq0Var instanceof ahq0) {
                    dsChip.setActionIcon(null);
                } else {
                    if (!(chq0Var instanceof bhq0)) {
                        t9f.b();
                        return null;
                    }
                    Context context = dsChip.getContext();
                    context.getClass();
                    dsChip.setRightIcon(context.getDrawable(R.drawable.ic_glyph_chevron_down_small));
                    Context context2 = dsChip.getContext();
                    context2.getClass();
                    Integer numValueOf = Integer.valueOf(m5d.b(R.attr.uikitSecondary, context2));
                    Context context3 = dsChip.getContext();
                    context3.getClass();
                    dsChip.setIconTint(m5d.d(numValueOf, Integer.valueOf(m5d.b(R.attr.uikitPrimaryForeground, context3))));
                }
                return Unit.f46060a;
            case 8:
                anq0 anq0Var = (anq0) obj2;
                ctf0 ctf0Var = (ctf0) obj3;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                if (anq0Var.j) {
                    if (anq0Var.e != 0) {
                        pzw.E(bnk0Var, pzb.I(anq0Var, ctf0Var), 0, R.color.static_white_60, 0, 0, 54);
                        pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                        pzw.E(bnk0Var, pzb.V(anq0Var), 0, R.color.static_white_60, 0, 0, 54);
                    }
                } else if (anq0Var.d != 0) {
                    pzw.E(bnk0Var, pzb.H(anq0Var, ctf0Var), 0, R.color.static_white_60, 0, 0, 54);
                    if (!bnk0Var.f2888a.isEmpty()) {
                        pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                    }
                    pzw.E(bnk0Var, pzb.U(anq0Var), 0, R.color.static_white_60, 0, 0, 54);
                }
                return Unit.f46060a;
            case 9:
                noq0 noq0Var = (noq0) obj3;
                y2m0 y2m0Var = noq0.m2;
                ((View) obj).getClass();
                ((qjk) obj2).h.e(noq0Var.V0() + 1, true);
                noq0Var.Y0().w(noq0Var.X0(), noq0Var.V0() + 1, ((ArrayList) noq0Var.T0().f).size(), noq0Var.i2.n(noq0Var, noq0.n2[4]), jf3.NEXT);
                return Unit.f46060a;
            case 10:
                qrq0 qrq0Var = (qrq0) obj2;
                Function0 function0 = (Function0) obj3;
                ((View) obj).getClass();
                DsSearchField dsSearchField = qrq0Var.l;
                if (dsSearchField.getVisibility() == 0) {
                    rsq0 rsq0Var = qrq0Var.m;
                    dsSearchField.getEditText().clearFocus();
                    TextInputEditText editText = dsSearchField.getEditText();
                    editText.getClass();
                    editText.setText("");
                    dsSearchField.setVisibility(8);
                    dsSearchField.c();
                    boolean z = qrq0Var.g;
                    View view = qrq0Var.k;
                    if (z) {
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        rsq0Var.setVisibility(8);
                    } else {
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        rsq0Var.setVisibility(0);
                    }
                    qrq0Var.o.a();
                    qrq0Var.i.invoke();
                    Function1 function1 = qrq0Var.j;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                } else {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                jsx jsxVar = (jsx) cpVar.u;
                ComposeView composeView = jsxVar.b;
                Context context4 = cpVar.w;
                sj3.L0(composeView, context4.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic), 0, context4.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic), 0, 10);
                jsxVar.b.setViewCompositionStrategy(pek0.g);
                cpVar.t(new nej0((Object) cpVar, obj2, obj3, (byte) 26));
                return Unit.f46060a;
            case 12:
                d240 d240Var = (d240) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((xtq0) obj2).m.q(new fr1(new fs80(d240Var.g, d240Var.d, null, null, 0L, false, 124), null, 2)));
                return Unit.f46060a;
            case 13:
                c240 c240Var = (c240) obj3;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                peg0 peg0Var = ((xtq0) obj2).m;
                String str = c240Var.g;
                long j = c240Var.e;
                if (j > 0) {
                    str = null;
                }
                k0w0Var2.h(peg0Var.q(new fr1(new fs80(str == null ? "" : str, c240Var.d, null, null, j, false, 108), null, 2)));
                return Unit.f46060a;
            case 14:
                t270 t270Var = (t270) obj3;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(oct.f(((xtq0) obj2).n, 0L, null, 0, t270Var, null, 23));
                return Unit.f46060a;
            case 15:
                jdk0 jdk0Var = ((xtq0) obj2).W;
                vh0 vh0Var = ((gx10) obj3).b;
                long j2 = vh0Var.g;
                String str2 = vh0Var.b;
                boolean z2 = vh0Var.i;
                long j3 = vh0Var.h;
                boolean z3 = vh0Var.j;
                jdk0Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j2, str2, 0L, z2, j3, z3, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 16:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                yox yoxVar = (yox) ((g2g0) obj2).j;
                String str3 = ((kr5) obj3).w;
                yoxVar.getClass();
                k0w0Var4.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str3));
                return Unit.f46060a;
            case 17:
                v9r0 v9r0Var = (v9r0) obj2;
                k3t0 k3t0Var = (k3t0) obj3;
                cbr0 cbr0Var = (cbr0) obj;
                j6m0 j6m0Var = v9r0.O1;
                cbr0Var.getClass();
                if (cbr0Var.equals(cbr0.f4074a)) {
                    String str4 = y9r0.m2;
                    androidx.fragment.app.e eVarC = v9r0Var.C();
                    eVarC.getClass();
                    String str5 = y9r0.m2;
                    if (eVarC.J(str5) == null) {
                        new y9r0().H0(eVarC, str5);
                    }
                }
                k3t0Var.x(f9r0.f9169a);
                return Unit.f46060a;
            case 18:
                l7m0 l7m0Var = (l7m0) obj2;
                hcz hczVar = (hcz) obj;
                int i4 = ylr0.m2;
                hczVar.getClass();
                a4x a4xVar = ((cmr0) l7m0Var.getValue()).b;
                hczVar.f(a4xVar.size(), new xlr0(new efr0(b3), a4xVar, b4), new e0m0(a4xVar, (byte) 5), new ugd(2039820996, true, new zip0(a4xVar, (ylr0) obj3, l7m0Var, b2)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l7m0 l7m0Var2 = (l7m0) obj2;
                hcz hczVar2 = (hcz) obj;
                int i5 = amr0.m2;
                hczVar2.getClass();
                List list = ((jq8) l7m0Var2.getValue()).b;
                hczVar2.f(list.size(), null, new vdr0(list, (byte) 2), new ugd(2039820996, true, new zip0(list, (amr0) obj3, l7m0Var2, b3)));
                return Unit.f46060a;
            case 20:
                l7m0 l7m0Var3 = (l7m0) obj3;
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(((asr0) ((pz40) obj2).getValue()).f1404a instanceof grq0 ? 1.0f : ((Number) l7m0Var3.getValue()).floatValue());
                return Unit.f46060a;
            case 21:
                a050 a050Var = (a050) obj2;
                vhv0 vhv0Var = (vhv0) obj;
                vhv0Var.getClass();
                ujo ujoVar = new ujo((vhv0) obj3, vhv0Var);
                a050Var.getClass();
                ((hgk0) a050Var.f10a).setValue(ujoVar);
                return Unit.f46060a;
            case 22:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar2 = ((pwr0) obj2).c;
                hczVar3.f(a4xVar2.size(), null, new vdr0(a4xVar2, (byte) 5), new ugd(802480018, true, new njh0(a4xVar2, (Function1) obj3, (byte) 22)));
                return Unit.f46060a;
            case 23:
                o6s0 o6s0Var = (o6s0) obj2;
                qkx qkxVar = (qkx) obj;
                long j4 = qkxVar.f28908a;
                ((pz40) obj3).setValue(qkxVar);
                o6s0Var.b(o6s0Var.a());
                return Unit.f46060a;
            case 24:
                qjj.W((vne) obj2, null, null, new gjg((kwj) obj3, ((Integer) obj).intValue(), smk0VarD, b2), 3);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((jtl) obj).getClass();
                ci ciVar = ((c4s0) obj3).g;
                ((Function1) obj2).invoke(new n3s0(ciVar.b, ciVar.c));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((jtl) obj).getClass();
                ci ciVar2 = ((f6s0) obj3).c;
                ((Function1) obj2).invoke(new x5s0(ciVar2.b, ciVar2.c));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((jtl) obj).getClass();
                ci ciVar3 = ((f7s0) obj3).c;
                ((Function1) obj2).invoke(new t6s0(ciVar3.b, ciVar3.c));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((List) obj).getClass();
                ((bg5) obj2).A(((n8s0) ((cp) obj3).u()).f23104a);
                return Unit.f46060a;
            default:
                cp cpVar2 = (cp) obj3;
                String str6 = (String) obj2;
                ((List) obj).getClass();
                cfs0 cfs0Var = (cfs0) cpVar2.u;
                TextView textView = cfs0Var.c;
                rdj rdjVar = rdj.f30294a;
                textView.setText(rdj.g(new znq0(((m7w) cpVar2.u()).f21339a), efj.UNIVERSAL, Boolean.valueOf(((m7w) cpVar2.u()).e), false, 56));
                TextView textView2 = cfs0Var.b;
                pn40 pn40Var = pn40.f27267a;
                double d = ((m7w) cpVar2.u()).c;
                p3u0 p3u0Var = p3u0.c;
                textView2.setText(pn40.d(d, str6, p3u0Var));
                cfs0Var.d.setText(pn40.d(((m7w) cpVar2.u()).d, str6, p3u0Var));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b8q0(e9q0 e9q0Var, i83 i83Var, vb00 vb00Var) {
        this.f2169a = (byte) 1;
        this.b = i83Var;
        this.c = vb00Var;
    }

    public /* synthetic */ b8q0(Object obj, Object obj2, byte b) {
        this.f2169a = b;
        this.b = obj;
        this.c = obj2;
    }
}
