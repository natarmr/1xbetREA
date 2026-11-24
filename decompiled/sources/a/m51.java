package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.javax.sip.message.Response;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m51 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21199a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m51(vne vneVar, qj1 qj1Var, d9z d9zVar) {
        this.f21199a = (byte) 6;
        this.b = qj1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        au1 au1Var;
        Object value;
        byte b = this.f21199a;
        fa50 fa50Var = fa50.f9191a;
        byte b2 = 10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                return pi9Var.a(new n51(new e900(((xzh) obj2).n, null, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)))) & 4294967295L)), objArr == true ? 1 : 0));
            case 1:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                return pi9Var2.a(new n51(new e900(((yzh) obj2).f, null, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)))) & 4294967295L)), b3));
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((b61) obj2).q.b(th, new yr0(th, (byte) 3));
                return Unit.f46060a;
            case 3:
                rek0 rek0Var = m71.e2;
                ((eg60) obj).getClass();
                ((m71) obj2).J0().x(q61.f28178a);
                return Unit.f46060a;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((ce1) obj2).p.q(new jr1(new cvc0(d7v.b))));
                return Unit.f46060a;
            case 5:
                ej1 ej1Var = (ej1) obj2;
                ((Boolean) obj).getClass();
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                n0o0 n0o0Var = ej1Var.k;
                fee feeVar = (fee) n0o0Var.getValue();
                ctf0 ctf0Var = ej1Var.b;
                tlm nlmVar = ((Boolean) feeVar.c()).booleanValue() ? new nlm(new hmm(10, (String) ((fee) ej1Var.l.getValue()).c(), ctf0Var.b.a(R.string.search_providers, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var);
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue();
                ra50 ra50Var = ra50.f30118a;
                return new imm(ilmVar, nlmVar, new dmm(zBooleanValue ? new ta50(new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary())) : new va50(new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
            case 6:
                qj1 qj1Var = (qj1) obj2;
                i8d0 i8d0Var = (i8d0) obj;
                qek0 qek0Var = qj1.X1;
                i8d0Var.getClass();
                if (i8d0Var instanceof h8d0) {
                    h8d0 h8d0Var = (h8d0) i8d0Var;
                    String str = h8d0Var.f12620a;
                    String str2 = h8d0Var.b;
                    String str3 = h8d0Var.c;
                    ii iiVar = qj1Var.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) str3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = qj1Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (i8d0Var.equals(f8d0.f9099a)) {
                    q5j q5jVar = qj1Var.M1;
                    if (q5jVar == null) {
                        Intrinsics.h("dailyTasksScreenFactory");
                        throw null;
                    }
                    q5jVar.a(qj1Var.F());
                } else {
                    if (!(i8d0Var instanceof g8d0)) {
                        t9f.b();
                        return null;
                    }
                    String str4 = ((g8d0) i8d0Var).f10859a;
                    wdk0 wdk0Var = qj1Var.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str4, null, null, null, null, 124), qj1Var, null, null, false, null, 1020);
                }
                return Unit.f46060a;
            case 7:
                ((Boolean) obj).getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((qk1) obj2).b.b.a(R.string.tournaments_available_publishers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
            case 8:
                au1 au1Var2 = (au1) obj2;
                xu1 xu1Var = (xu1) obj;
                jdk0 jdk0Var = au1.Z1;
                xu1Var.getClass();
                if (xu1Var.equals(tu1.f34530a)) {
                    qcc.c0(au1Var2);
                } else if (xu1Var instanceof uu1) {
                    ii iiVar2 = au1Var2.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    uu1 uu1Var = (uu1) xu1Var;
                    DialogFields dialogFields2 = new DialogFields((CharSequence) uu1Var.f36281a, (CharSequence) uu1Var.b, (CharSequence) uu1Var.c, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = au1Var2.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else {
                    if (!(xu1Var instanceof wu1)) {
                        if (xu1Var instanceof su1) {
                            ob0 ob0Var = ((su1) xu1Var).f32799a;
                            if (ob0Var instanceof mb0) {
                                String str5 = ((mb0) ob0Var).f21481a;
                                ynb ynbVar = au1Var2.L1;
                                if (ynbVar == null) {
                                    Intrinsics.h("changeBalanceDialogProvider");
                                    throw null;
                                }
                                bm5 bm5Var = bm5.e;
                                androidx.fragment.app.e eVarC3 = au1Var2.C();
                                eVarC3.getClass();
                                ynb.b(ynbVar, bm5Var, str5, eVarC3, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                            } else if (ob0Var.equals(lb0.f19732a)) {
                                kxq kxqVarB = au1Var2.B();
                                if (kxqVarB != null) {
                                    ii iiVar3 = au1Var2.M1;
                                    if (iiVar3 == null) {
                                        Intrinsics.h("actionDialogManager");
                                        throw null;
                                    }
                                    String string = kxqVarB.getString(R.string.attention);
                                    String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                                    String string3 = kxqVarB.getString(R.string.ok);
                                    string3.getClass();
                                    iiVar3.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                                }
                            } else {
                                if (!ob0Var.equals(nb0.f23215a)) {
                                    t9f.b();
                                    return null;
                                }
                                kxq kxqVarB2 = au1Var2.B();
                                if (kxqVarB2 != null) {
                                    ii iiVar4 = au1Var2.M1;
                                    if (iiVar4 == null) {
                                        Intrinsics.h("actionDialogManager");
                                        throw null;
                                    }
                                    String string4 = kxqVarB2.getString(R.string.attention);
                                    String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                                    String string6 = kxqVarB2.getString(R.string.ok);
                                    string6.getClass();
                                    iiVar4.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                                }
                            }
                        } else {
                            if (!(xu1Var instanceof vu1)) {
                                t9f.b();
                                return null;
                            }
                            String str6 = ((vu1) xu1Var).f38031a;
                            wdk0 wdk0Var2 = au1Var2.N1;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            au1Var = au1Var2;
                            wdk0.k(wdk0Var2, new xdk0(rek0.b, str6, null, null, null, null, 124), au1Var, null, null, false, null, 1020);
                        }
                        au1Var.G0().x(as1.f1370a);
                        return Unit.f46060a;
                    }
                    gfk0 gfk0Var = cl1.o2;
                    wu1 wu1Var = (wu1) xu1Var;
                    long j = wu1Var.f39770a;
                    String str7 = wu1Var.b;
                    gfk0Var.getClass();
                    cl1 cl1VarG = gfk0.g(j, str7);
                    androidx.fragment.app.e eVarC4 = au1Var2.C();
                    eVarC4.getClass();
                    sj3.D0(cl1VarG, eVarC4);
                }
                au1Var = au1Var2;
                au1Var.G0().x(as1.f1370a);
                return Unit.f46060a;
            case 9:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((mu1) ((ou1) obj2)).f22392a;
                hczVar.f(a4xVar.size(), new g5(new xg1(b2), a4xVar, (byte) 22), new wl0(a4xVar, (byte) 4), new ugd(2039820996, true, new zd1(a4xVar, (byte) 2)));
                return Unit.f46060a;
            case 10:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                i4 i4Var = ((cbs0) obj2).f4076a;
                hczVar2.f(i4Var.size(), null, new b8(i4Var, (byte) 20), new ugd(2039820996, true, new xy1(i4Var, objArr2 == true ? 1 : 0)));
                return Unit.f46060a;
            case 11:
                q12 q12Var = (q12) obj;
                q12Var.getClass();
                return Boolean.valueOf(q12Var.f27930a.equals((AlertsPipeType) obj2));
            case 12:
                f7z f7zVar = (f7z) obj2;
                b22 b22Var = (b22) obj;
                if (b22Var.N() == Integer.MAX_VALUE) {
                    return Unit.f46060a;
                }
                if (b22Var.a().b) {
                    b22Var.y();
                }
                for (Map.Entry entry : b22Var.a().i.entrySet()) {
                    f7zVar.a((w12) entry.getKey(), ((Number) entry.getValue()).intValue(), b22Var.H());
                }
                s460 s460Var = b22Var.H().w;
                s460Var.getClass();
                while (!s460Var.equals(f7zVar.f9082a.H())) {
                    for (w12 w12Var : f7zVar.b(s460Var).keySet()) {
                        f7zVar.a(w12Var, f7zVar.c(s460Var, w12Var), s460Var);
                    }
                    s460Var = s460Var.w;
                    s460Var.getClass();
                }
                return Unit.f46060a;
            case 13:
                uid uidVar = (uid) obj;
                hfk0 hfk0Var = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                uidVar.getClass();
                ((org.xplatform.special_event.impl.alleventsgames.presentation.a) obj2).H0().x(new o22(uidVar));
                return Unit.f46060a;
            case 14:
                h2i0 h2i0Var = (h2i0) obj;
                pek0 pek0Var = w62.Q1;
                h2i0Var.getClass();
                ((w62) obj2).G0().x(new g62(h2i0Var.f12336a, h2i0Var.b, h2i0Var.c));
                return Unit.f46060a;
            case 15:
                h2i0 h2i0Var2 = (h2i0) obj;
                rek0 rek0Var2 = ia2.Q1;
                h2i0Var2.getClass();
                ((ia2) obj2).G0().x(new v92(h2i0Var2.f12336a, h2i0Var2.b, h2i0Var2.c));
                return Unit.f46060a;
            case 16:
                hb2 hb2Var = (hb2) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = hb2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hb2Var.f.getClass();
                } while (!p7m0Var.m(value, ab2.a((ab2) value, null, null, false, new wa2(th2), false, false, false, null, null, null, 65007)));
                return Unit.f46060a;
            case 17:
                hd2 hd2Var = (hd2) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                hd2Var.t.b(th3, new fa2(hd2Var, b3));
                return Unit.f46060a;
            case 18:
                h2i0 h2i0Var3 = (h2i0) obj;
                hfk0 hfk0Var2 = ef2.V1;
                h2i0Var3.getClass();
                ((ef2) obj2).L0().x(new qe2(h2i0Var3.f12336a, h2i0Var3.b, h2i0Var3.c));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, new ugd(-62003410, true, new un6((vce) obj2, (byte) 14)), 3);
                return Unit.f46060a;
            case 20:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.e(hczVar4, null, null, new ugd(1133588520, true, new un6((uce) obj2, (byte) 15)), 3);
                return Unit.f46060a;
            case 21:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8z.f(i8zVar, ((whe) obj2).f39163a, null, null, epv0.f8206a, 14);
                return Unit.f46060a;
            case 22:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hcz.e(hczVar5, null, null, new ugd(844248578, true, new un6((fie) obj2, (byte) 16)), 3);
                return Unit.f46060a;
            case 23:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((yn2) obj2).H.b(th4, new ma2((byte) 17));
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new j9(cpVar, (mo2) obj2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gp2 gp2Var = (gp2) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                p7m0 p7m0Var2 = gp2Var.i;
                cp2 cp2Var = new cp2(sa10.b(gp2Var.d, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                p7m0Var2.getClass();
                p7m0Var2.o(null, cp2Var);
                gp2Var.g.a(th5);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a810 a810Var = (a810) obj;
                AndroidComposeView androidComposeView = ((ix2) obj2).p;
                if (androidComposeView.getInsetsListener().g.l() > 0) {
                    ey40 ey40Var = ijv0.f14897a;
                    a810Var.f402a = true;
                    c810 c810Var = a810Var.d;
                    j6z j6zVarI0 = c810Var.I0();
                    if (ikx.b(a810Var.b, 9223372034707292159L)) {
                        a810Var.b = x1x.J(j6zVarI0.R(0L));
                        a810Var.c = j6zVarI0.g();
                    }
                    c810Var.L0().i1.b();
                    long jG = j6zVarI0.g();
                    hz40 hz40Var = androidComposeView.getInsetsListener().f;
                    int i = (int) (jG >> 32);
                    int i2 = (int) (jG & 4294967295L);
                    for (gjv0 gjv0Var : ijv0.b) {
                        Object objG = hz40Var.g(gjv0Var);
                        objG.getClass();
                        vjv0 vjv0Var = (vjv0) objG;
                        ijv0.a(a810Var, ((hjv0) gjv0Var).c, vjv0Var.h, i, i2);
                        if (((Boolean) ((hgk0) vjv0Var.b).getValue()).booleanValue()) {
                            ijv0.a(a810Var, vjv0Var.f, vjv0Var.j, i, i2);
                            ijv0.a(a810Var, vjv0Var.g, vjv0Var.k, i, i2);
                        }
                        ijv0.a(a810Var, ((hjv0) gjv0Var).d, vjv0Var.i, i, i2);
                    }
                    vy40 vy40Var = androidComposeView.getInsetsListener().h;
                    if (vy40Var.j()) {
                        SnapshotStateList snapshotStateList = androidComposeView.getInsetsListener().i;
                        Object[] objArr3 = vy40Var.f38232a;
                        int i3 = vy40Var.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            pz40 pz40Var3 = (pz40) objArr3[i4];
                            tdx tdxVar = (tdx) snapshotStateList.get(i4);
                            Rect rect = (Rect) pz40Var3.getValue();
                            a810Var.a(tdxVar.b(), rect.left);
                            a810Var.a(tdxVar.d(), rect.top);
                            a810Var.a(tdxVar.c(), rect.right);
                            a810Var.a(tdxVar.a(), rect.bottom);
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Boolean.valueOf(((gkx) obj2).a(((tai0) obj).f));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(p8a.Y((tai0) obj, (Resources) obj2));
            default:
                ((abi0) obj).b(h5i0.f12481a, new g5i0(blv.f2811a, ((ye60) obj2).a(), f5i0.b, true));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ m51(Object obj, byte b) {
        this.f21199a = b;
        this.b = obj;
    }
}
