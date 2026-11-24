package a;

import android.javax.sip.message.Response;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ov0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25901a = 4;
    public final n0o0 b;
    public final n0o0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ov0(j0v0 j0v0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.d = ctf0Var;
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        this.e = new imm(ilmVar, new plm(lsm0Var.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        i4 i4VarG0 = dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.add_wallet, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.b));
        this.f = new mtl(i4VarG0);
        ArrayList arrayList = new ArrayList(r3d.q(i4VarG0, 10));
        ListIterator listIterator = i4VarG0.listIterator(0);
        while (listIterator.hasNext()) {
            itl itlVar = (itl) listIterator.next();
            wul wulVarA = wul.a(55, itlVar.f15358a);
            jtl jtlVar = itlVar.b;
            jtlVar.getClass();
            arrayList.add(new itl(wulVarA, jtlVar));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        a4xVarO0.getClass();
        this.g = new mtl(a4xVarO0);
        this.b = maz.b(new c3p(g2vVar, (byte) 2));
        this.c = maz.b(new yw9(j0v0Var.e, new npt0(this, (byte) 21), (byte) 20));
    }

    public static mdm a(g2v g2vVar, azw azwVar) {
        int i;
        if (azwVar.equals(qb10.b)) {
            i = R.string.express_events_no_events;
        } else {
            azwVar.equals(qb10.f28425a);
            i = R.string.data_retrieval_error;
        }
        return g2v.b(g2vVar, pb10.g, null, null, 0, 0, i, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public static float b(cis cisVar, bis bisVar) {
        int iOrdinal = bisVar.c.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return 0.0f;
        }
        if (cisVar.f != j700.f16016a) {
            zcl zclVar2 = qmk.f28987a;
            return 12.0f;
        }
        zcl zclVar3 = qmk.f28987a;
        return 0.0f;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ov0.invoke(java.lang.Object):java.lang.Object");
    }

    public ov0(y6a0 y6a0Var, boolean z, int i, udl0 udl0Var) {
        this.d = udl0Var;
        this.b = bkb.H(y6a0Var.c);
        this.c = bkb.H(y6a0Var.d);
        this.e = bkb.H(Boolean.valueOf(y6a0Var.f));
        this.f = maz.b(new yw9(y6a0Var.b, new ij90(z, (Object) this, (byte) 1), (byte) 20));
        this.g = maz.b(new yw9(y6a0Var.f42088a, new z08((Object) this, i, (byte) 13), (byte) 20));
    }

    public ov0(hj6 hj6Var, boolean z, ctf0 ctf0Var, g2v g2vVar, edu eduVar) {
        ctf0Var.getClass();
        this.d = ctf0Var;
        this.e = g2vVar;
        this.f = eduVar;
        this.b = bkb.H(eduVar.g());
        this.c = bkb.H(hj6Var.j);
        this.g = maz.b(new yw9(hj6Var.b, new r91(z, this, hj6Var, (byte) 4), (byte) 20));
    }

    public ov0(mv0 mv0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        this.d = lsm0Var.a(R.string.create_nickname_title, Arrays.copyOf(new Object[0], 0));
        this.e = lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0));
        this.f = lsm0Var.a(R.string.enter_nickname_placeholder, Arrays.copyOf(new Object[0], 0));
        this.b = maz.b(new yw9(mv0Var.f22435a, new w0(this, (byte) 7), (byte) 20));
        this.g = dyb.r0(q3d.j(lsm0Var.a(R.string.nickname_first_rule_description, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.nickname_second_rule_description, Arrays.copyOf(new Object[0], 0))));
        this.c = maz.b(new yw9(Boolean.valueOf(mv0Var.c), new t1(this, (byte) 26), (byte) 20));
    }

    public ov0(ubt0 ubt0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.d = ubt0Var;
        this.e = ctf0Var;
        this.f = g2vVar;
        this.b = maz.b(new yw9(null, new caz(this, (byte) 28), (byte) 20));
        this.c = maz.b(new yw9(ubt0Var, new qzs0((byte) 4), (byte) 20));
        this.g = maz.b(new yw9(ubt0Var, new lcr0(this, (byte) 29), (byte) 20));
    }

    public ov0(gh10 gh10Var, ctf0 ctf0Var, DecimalFormat decimalFormat) {
        ctf0Var.getClass();
        this.d = ctf0Var;
        this.e = decimalFormat;
        this.b = bkb.H(gh10Var.f11277a);
        this.c = bkb.H(Boolean.valueOf(gh10Var.g));
        jg10 jg10Var = gh10Var.d;
        this.f = maz.b(new yw9(jg10Var, new p610(this), (byte) 20));
        this.g = maz.b(new yw9(jg10Var, new u400(this, gh10Var, (byte) 17), (byte) 20));
    }

    public ov0(cis cisVar, ctf0 ctf0Var, y78 y78Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.d = g2vVar;
        this.b = bkb.H(cisVar.d);
        this.c = bkb.H(cisVar.f4427a);
        this.e = bkb.H(Boolean.valueOf(cisVar.e));
        this.f = bkb.H(Boolean.valueOf(cisVar.g));
        this.g = maz.b(new yw9(cisVar.b, new f8m((Object) this, (Object) ctf0Var, (Object) y78Var, (byte) 26), (byte) 20));
    }

    public ov0(ctf0 ctf0Var, z0j z0jVar) {
        ctf0Var.getClass();
        this.d = ctf0Var;
        this.b = bkb.H(Long.valueOf(z0jVar.f43569a));
        this.c = bkb.H(Integer.valueOf(z0jVar.b));
        this.e = bkb.H(Integer.valueOf(z0jVar.c));
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        this.f = new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.close, Arrays.copyOf(new Object[0], 0))), true, false, false);
        this.g = new wul(lul.e, oe9Var, new ue9(lsm0Var.a(R.string.daily_task_button_text_open_games, Arrays.copyOf(new Object[0], 0))), true, false, false);
    }

    public ov0(pqo pqoVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.d = pqoVar;
        this.e = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(pqoVar.c));
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(pqoVar.b);
        this.c = n0o0VarH2;
        final byte b = 0;
        this.f = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.rqo
            public final /* synthetic */ ov0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                dxh0 dxh0Var;
                byte b2 = b;
                ov0 ov0Var = this.b;
                switch (b2) {
                    case 0:
                        ((Boolean) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((ctf0) ov0Var.e).b.a(R.string.day_express, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, ((Boolean) ((fee) ov0Var.b.getValue()).c()).booleanValue() ? R.drawable.ic_glyph_compressed_inactive : R.drawable.ic_glyph_extended, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        ((swh0) obj).getClass();
                        ctf0 ctf0Var2 = (ctf0) ov0Var.e;
                        String strA = ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        a4x a4xVarO0 = dyb.o0(q3d.j(new yvh0(strA, bwh0Var), new yvh0(ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        int iOrdinal = ((pqo) ov0Var.d).d.ordinal();
                        if (iOrdinal == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        return new wro(((swh0) ((fee) ov0Var.c.getValue()).c()).f32922a ? 1 : 0, a4xVarO0, dxh0Var);
                }
            }
        });
        final byte b2 = 1;
        this.g = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.rqo
            public final /* synthetic */ ov0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                dxh0 dxh0Var;
                byte b3 = b2;
                ov0 ov0Var = this.b;
                switch (b3) {
                    case 0:
                        ((Boolean) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((ctf0) ov0Var.e).b.a(R.string.day_express, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, ((Boolean) ((fee) ov0Var.b.getValue()).c()).booleanValue() ? R.drawable.ic_glyph_compressed_inactive : R.drawable.ic_glyph_extended, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        ((swh0) obj).getClass();
                        ctf0 ctf0Var2 = (ctf0) ov0Var.e;
                        String strA = ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        a4x a4xVarO0 = dyb.o0(q3d.j(new yvh0(strA, bwh0Var), new yvh0(ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        int iOrdinal = ((pqo) ov0Var.d).d.ordinal();
                        if (iOrdinal == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        return new wro(((swh0) ((fee) ov0Var.c.getValue()).c()).f32922a ? 1 : 0, a4xVarO0, dxh0Var);
                }
            }
        });
    }
}
