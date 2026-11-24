package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.domain.models.AggregatorGameLanguage;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;

/* JADX INFO: loaded from: classes3.dex */
public final class b09 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1755a = 2;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;

    public b09(sas0 sas0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(sas0Var.d));
        this.c = n0o0VarH;
        this.d = bkb.G(((fee) n0o0VarH.getValue()).d, new g4s0((byte) 14));
        byte b = 15;
        this.e = bkb.G(((fee) n0o0VarH.getValue()).d, new g4s0(b));
        this.f = maz.b(new qir0(this, b));
        this.g = maz.b(new yw9(sas0Var.c, new lcr0(this, (byte) 11), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        wui0 wui0Var;
        boolean z;
        String str;
        byte b = this.f1755a;
        n0o0 n0o0Var = this.e;
        n0o0 n0o0Var2 = this.d;
        n0o0 n0o0Var3 = this.f;
        n0o0 n0o0Var4 = this.g;
        n0o0 n0o0Var5 = this.c;
        switch (b) {
            case 0:
                zz8 zz8Var = (zz8) obj;
                zz8Var.getClass();
                fee feeVar = (fee) n0o0Var3.getValue();
                Set set = zz8Var.b;
                feeVar.d(set);
                imm immVar = (imm) n0o0Var5.getValue();
                hjm hjmVar = (hjm) n0o0Var2.getValue();
                rqm rqmVar = (rqm) ((fee) n0o0Var3.getValue()).b();
                hjm hjmVar2 = (hjm) n0o0Var.getValue();
                mtl mtlVar = (mtl) n0o0Var4.getValue();
                List list = zz8Var.f45239a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    AggregatorGameLanguage aggregatorGameLanguage = (AggregatorGameLanguage) obj2;
                    int i3 = aggregatorGameLanguage.f46282a;
                    int size = list.size();
                    if (size == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (i == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = i == size + (-1) ? wui0.d : wui0.c;
                    }
                    wui0 wui0Var2 = wui0Var;
                    String str2 = aggregatorGameLanguage.b;
                    pz40 pz40Var = s6t0.f31722a;
                    arrayList.add(new vz8(i3, new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new lvi0(tc00.f33696a, set.contains(Integer.valueOf(aggregatorGameLanguage.f46282a))), d4d.BACKGROUND_CONTENT, (tvi0) null, wui0Var2, false, (e900) null, 426)));
                    i = i2;
                }
                return new c09(immVar, hjmVar, rqmVar, hjmVar2, mtlVar, dyb.r0(arrayList));
            case 1:
                ybn ybnVar = (ybn) obj;
                ybnVar.getClass();
                fee feeVar2 = (fee) n0o0Var5.getValue();
                Set set2 = ybnVar.c;
                feeVar2.d(set2);
                fee feeVar3 = (fee) n0o0Var.getValue();
                l9s l9sVar = ybnVar.f;
                feeVar3.d(l9sVar);
                ((fee) n0o0Var3.getValue()).d(l9sVar);
                fee feeVar4 = (fee) n0o0Var4.getValue();
                Set set3 = ybnVar.e;
                feeVar4.d(set3);
                fee feeVar5 = (fee) n0o0Var2.getValue();
                List<tdn> list2 = ybnVar.b;
                feeVar5.d(list2);
                String strA = this.b.b.a(R.string.players_duel_builder_dialog_title_placeholder_v2, Arrays.copyOf(new Object[]{String.valueOf((int) ybnVar.f42347a.b)}, 1));
                boolean z2 = set3.size() < 5;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (tdn tdnVar : list2) {
                    long j = tdnVar.f33777a;
                    boolean zContains = set3.contains(Long.valueOf(j));
                    boolean zContains2 = set2.contains(Long.valueOf(j));
                    Integer num = tdnVar.d;
                    if (num == null) {
                        z = z2;
                        str = null;
                    } else {
                        z = z2;
                        str = num.intValue() == 1 ? (String) ((fee) n0o0Var.getValue()).b() : (String) ((fee) n0o0Var3.getValue()).b();
                    }
                    arrayList2.add(new wbn(j, fww.K(tdnVar, str, zContains || zContains2, zContains || (!zContains2 && z), wui0.f39793a)));
                    z2 = z;
                }
                return new zbn(strA, dyb.o0(arrayList2), new wul(lul.e, oe9.f25112a, new ue9((String) ((fee) n0o0Var4.getValue()).b()), !set3.isEmpty(), false, false));
            case 2:
                dbr0 dbr0Var = (dbr0) obj;
                dbr0Var.getClass();
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(dbr0Var.b));
                ((fee) n0o0Var5.getValue()).d(dbr0Var.f.f28411a);
                ((fee) n0o0Var4.getValue()).d(dbr0Var.e);
                ((fee) n0o0Var3.getValue()).d(dbr0Var.g);
                if (zcr0.f44179a[((par0) ((fee) n0o0Var5.getValue()).c()).ordinal()] == 1) {
                    return new adr0((imm) ((fee) n0o0Var4.getValue()).b(), (xcr0) ((fee) n0o0Var3.getValue()).b());
                }
                return new bdr0((mdm) ((fee) n0o0Var.getValue()).b(), (imm) ((fee) n0o0Var4.getValue()).b());
            default:
                sas0 sas0Var = (sas0) obj;
                sas0Var.getClass();
                ((fee) n0o0Var5.getValue()).d(Integer.valueOf(sas0Var.d));
                ((fee) n0o0Var4.getValue()).d(sas0Var.c);
                return new tas0((imm) n0o0Var3.getValue(), (jas0) ((fee) n0o0Var4.getValue()).b());
        }
    }

    public b09(dbr0 dbr0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(dbr0Var.f.f28411a);
        this.c = n0o0VarH;
        this.d = bkb.H(Boolean.valueOf(dbr0Var.b));
        final byte b = 1;
        this.e = bkb.G(((fee) n0o0VarH.getValue()).d, new lcr0(dbr0Var, b));
        final byte b2 = 0;
        this.f = maz.b(new yw9(dbr0Var.g, new Function1(this) { // from class: a.ycr0
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hyl fylVar;
                byte b3 = b2;
                int i = 0;
                b09 b09Var = this.b;
                switch (b3) {
                    case 0:
                        wcr0 wcr0Var = (wcr0) obj;
                        wcr0Var.getClass();
                        List list = wcr0Var.b;
                        n0o0 n0o0Var = b09Var.d;
                        if (!((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && (list.isEmpty() || list.size() == 1)) {
                            return null;
                        }
                        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue();
                        ctf0 ctf0Var2 = b09Var.b;
                        int i2 = wcr0Var.f38937a;
                        ctf0Var2.getClass();
                        float f = ctf0Var2.j() ? 32.0f : 8.0f;
                        int size = zBooleanValue ? 0 : list.size();
                        if (zBooleanValue) {
                            fylVar = new gyl(null, null, 3);
                        } else {
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (Object obj2 : list) {
                                int i3 = i + 1;
                                if (i < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                arrayList.add(new lxl(i, (dyl) new xxl(((tcr0) obj2).f33732a), false, i == i2 ? uxl.b : uxl.f36445a, (cwl) null, 104));
                                i = i3;
                            }
                            fylVar = new fyl(dyb.o0(arrayList), null, null, s5x0.t(f, 0.0f, 2), null, 22);
                        }
                        return new xcr0(i2, size, fylVar);
                    default:
                        TopPlayersSearchModel topPlayersSearchModel = (TopPlayersSearchModel) obj;
                        topPlayersSearchModel.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = topPlayersSearchModel.f46977a;
                        ctf0 ctf0Var3 = b09Var.b;
                        tlm nlmVar = z ? new nlm(new hmm(10, topPlayersSearchModel.b, ctf0Var3.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var3.b.a(R.string.statistic_top_player_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, (z || ((fee) b09Var.c.getValue()).c() != par0.f26668a) ? new dmm(new ta50(new wkm(2, R.drawable.ic_glyph_info_circle, true, ra50Var, s6t0.b().f33626a.getSecondary()))) : new dmm(new va50(new wkm(1, R.drawable.ic_glyph_search, !((Boolean) ((fee) b09Var.d.getValue()).c()).booleanValue(), ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(2, R.drawable.ic_glyph_info_circle, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                }
            }
        }, (byte) 20));
        this.g = maz.b(new yw9(dbr0Var.e, new Function1(this) { // from class: a.ycr0
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hyl fylVar;
                byte b3 = b;
                int i = 0;
                b09 b09Var = this.b;
                switch (b3) {
                    case 0:
                        wcr0 wcr0Var = (wcr0) obj;
                        wcr0Var.getClass();
                        List list = wcr0Var.b;
                        n0o0 n0o0Var = b09Var.d;
                        if (!((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && (list.isEmpty() || list.size() == 1)) {
                            return null;
                        }
                        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue();
                        ctf0 ctf0Var2 = b09Var.b;
                        int i2 = wcr0Var.f38937a;
                        ctf0Var2.getClass();
                        float f = ctf0Var2.j() ? 32.0f : 8.0f;
                        int size = zBooleanValue ? 0 : list.size();
                        if (zBooleanValue) {
                            fylVar = new gyl(null, null, 3);
                        } else {
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (Object obj2 : list) {
                                int i3 = i + 1;
                                if (i < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                arrayList.add(new lxl(i, (dyl) new xxl(((tcr0) obj2).f33732a), false, i == i2 ? uxl.b : uxl.f36445a, (cwl) null, 104));
                                i = i3;
                            }
                            fylVar = new fyl(dyb.o0(arrayList), null, null, s5x0.t(f, 0.0f, 2), null, 22);
                        }
                        return new xcr0(i2, size, fylVar);
                    default:
                        TopPlayersSearchModel topPlayersSearchModel = (TopPlayersSearchModel) obj;
                        topPlayersSearchModel.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = topPlayersSearchModel.f46977a;
                        ctf0 ctf0Var3 = b09Var.b;
                        tlm nlmVar = z ? new nlm(new hmm(10, topPlayersSearchModel.b, ctf0Var3.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var3.b.a(R.string.statistic_top_player_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, (z || ((fee) b09Var.c.getValue()).c() != par0.f26668a) ? new dmm(new ta50(new wkm(2, R.drawable.ic_glyph_info_circle, true, ra50Var, s6t0.b().f33626a.getSecondary()))) : new dmm(new va50(new wkm(1, R.drawable.ic_glyph_search, !((Boolean) ((fee) b09Var.d.getValue()).c()).booleanValue(), ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(2, R.drawable.ic_glyph_info_circle, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                }
            }
        }, (byte) 20));
    }

    public b09(zz8 zz8Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = maz.b(new Function0(this) { // from class: a.a09
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                b09 b09Var = this.b;
                switch (b2) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(b09Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = b09Var.b.b.a(R.string.by_default, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        String strA2 = b09Var.b.b.a(R.string.available_languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    default:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = b09Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), wz8.f40011a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), rz8.f31345a)));
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.a09
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                b09 b09Var = this.b;
                switch (b3) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(b09Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = b09Var.b.b.a(R.string.by_default, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        String strA2 = b09Var.b.b.a(R.string.available_languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    default:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = b09Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), wz8.f40011a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), rz8.f31345a)));
                }
            }
        });
        final byte b3 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.a09
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                b09 b09Var = this.b;
                switch (b4) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(b09Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = b09Var.b.b.a(R.string.by_default, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        String strA2 = b09Var.b.b.a(R.string.available_languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    default:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = b09Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), wz8.f40011a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), rz8.f31345a)));
                }
            }
        });
        this.f = maz.b(new yw9(zz8Var.b, new d38(this, (byte) 14), (byte) 20));
        final byte b4 = 3;
        this.g = maz.b(new Function0(this) { // from class: a.a09
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                b09 b09Var = this.b;
                switch (b5) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(b09Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = b09Var.b.b.a(R.string.by_default, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        String strA2 = b09Var.b.b.a(R.string.available_languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    default:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = b09Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), wz8.f40011a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), rz8.f31345a)));
                }
            }
        });
    }

    public b09(ybn ybnVar, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(ybnVar.c);
        final byte b2 = 0;
        this.d = maz.b(new yw9(ybnVar.b, new Function1(this) { // from class: a.acn
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                b09 b09Var = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        int i = 0;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (!((Set) ((fee) b09Var.c.getValue()).c()).contains(Long.valueOf(((tdn) it.next()).f33777a)) && (i = i + 1) < 0) {
                                    q3d.o();
                                    throw null;
                                }
                            }
                        }
                        return Integer.valueOf(i);
                    default:
                        Set set = (Set) obj;
                        set.getClass();
                        return b09Var.b.b.a(R.string.players_duel_builder_dialog_chosen_players_counter, Arrays.copyOf(new Object[]{String.valueOf(set.size()), Integer.valueOf(Math.min(((Number) ((fee) b09Var.d.getValue()).b()).intValue(), 5))}, 2));
                }
            }
        }, (byte) 20));
        l9s l9sVar = ybnVar.f;
        this.e = maz.b(new yw9(l9sVar, new aim((byte) 26), (byte) 20));
        this.f = maz.b(new yw9(l9sVar, new aim((byte) 27), (byte) 20));
        this.g = maz.b(new yw9(ybnVar.e, new Function1(this) { // from class: a.acn
            public final /* synthetic */ b09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                b09 b09Var = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        int i = 0;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (!((Set) ((fee) b09Var.c.getValue()).c()).contains(Long.valueOf(((tdn) it.next()).f33777a)) && (i = i + 1) < 0) {
                                    q3d.o();
                                    throw null;
                                }
                            }
                        }
                        return Integer.valueOf(i);
                    default:
                        Set set = (Set) obj;
                        set.getClass();
                        return b09Var.b.b.a(R.string.players_duel_builder_dialog_chosen_players_counter, Arrays.copyOf(new Object[]{String.valueOf(set.size()), Integer.valueOf(Math.min(((Number) ((fee) b09Var.d.getValue()).b()).intValue(), 5))}, 2));
                }
            }
        }, (byte) 20));
    }
}
