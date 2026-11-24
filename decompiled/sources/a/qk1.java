package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qk1 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28865a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;

    public qk1(d7p d7pVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(d7pVar.f5604a);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(d7pVar.b);
        this.d = n0o0VarH2;
        this.e = maz.b(new yw9((fee) n0o0VarH.getValue(), new g7p(this, (byte) 0), (byte) 20));
        this.f = maz.b(new yw9((fee) n0o0VarH2.getValue(), new e4p((byte) 9), (byte) 20));
    }

    public static kvl a(s9p s9pVar, boolean z, wui0 wui0Var) {
        return new kvl(s9pVar, new tui0(s9pVar.a(), null), null, new hvi0(new kpe(), s9pVar.b(), z), wui0Var, 436);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        jk1 hk1Var;
        boolean z;
        lm6 lm6Var;
        byte b = this.f28865a;
        ctf0 ctf0Var = this.b;
        n0o0 n0o0Var = this.f;
        n0o0 n0o0Var2 = this.e;
        n0o0 n0o0Var3 = this.d;
        n0o0 n0o0Var4 = this.c;
        switch (b) {
            case 0:
                ok1 ok1Var = (ok1) obj;
                ok1Var.getClass();
                fee feeVar = (fee) n0o0Var4.getValue();
                boolean z2 = ok1Var.e;
                List<lc1> list = ok1Var.f25384a;
                feeVar.d(Boolean.valueOf(z2));
                if (ok1Var.c) {
                    hk1Var = new ik1((mdm) n0o0Var.getValue());
                } else {
                    boolean z3 = ok1Var.b;
                    if (z3) {
                        hk1Var = new hk1(new col(new b0i(sh1.f32187a, rh1.b), 9));
                    } else if (z3 || !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lc1 lc1Var : list) {
                            arrayList.add(new eol(String.valueOf(lc1Var.f19778a), new n0x(lc1Var.c), false, lc1Var.b, "", ctf0Var.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                        }
                        hk1Var = new hk1(new bol(dyb.o0(arrayList), new b0i(sh1.f32187a, rh1.b)));
                    } else {
                        hk1Var = new ik1((mdm) n0o0Var2.getValue());
                    }
                }
                return new rk1((imm) ((fee) n0o0Var3.getValue()).b(), hk1Var);
            case 1:
                d7p d7pVar = (d7p) obj;
                d7pVar.getClass();
                ((fee) n0o0Var4.getValue()).d(d7pVar.f5604a);
                ((fee) n0o0Var3.getValue()).d(d7pVar.b);
                return new f7p((a4x) ((fee) n0o0Var2.getValue()).b(), ((Boolean) ((fee) n0o0Var.getValue()).b()).booleanValue());
            default:
                dz20 dz20Var = (dz20) obj;
                dz20Var.getClass();
                fee feeVar2 = (fee) n0o0Var4.getValue();
                List list2 = dz20Var.f6921a;
                boolean z4 = dz20Var.l;
                sf6 sf6Var = dz20Var.k;
                xvm0 xvm0Var = dz20Var.f;
                udl0 udl0Var = dz20Var.g;
                feeVar2.d(list2);
                ((fee) n0o0Var3.getValue()).d(dz20Var.c);
                fee feeVar3 = (fee) n0o0Var2.getValue();
                List list3 = dz20Var.d;
                feeVar3.d(list3);
                ((fee) n0o0Var.getValue()).d(dz20Var.e);
                boolean z5 = dz20Var.j instanceof lx7;
                boolean z6 = !z5;
                js20 js20Var = dz20Var.b;
                if (js20Var == null) {
                    return new jz20(udl0Var);
                }
                if (xvm0Var == null) {
                    return new jz20(udl0Var);
                }
                ol6 ol6Var = sf6Var.f32102a;
                boolean z7 = ol6Var instanceof nl6;
                boolean z8 = ol6Var instanceof ml6;
                boolean z9 = ((List) ((fee) n0o0Var4.getValue()).b()).size() > 1 || (!z7 && (z8 || z4));
                List list4 = (List) ((fee) n0o0Var4.getValue()).b();
                qym0 qym0Var = (qym0) ((fee) n0o0Var2.getValue()).b();
                long id = xvm0Var.getId();
                long jA = js20Var.a();
                boolean z10 = z4 || z8;
                if (z8) {
                    z = !((ml6) ol6Var).f21972a;
                } else {
                    if (!ol6Var.equals(nl6.f23712a) && !ol6Var.equals(ll6.f20231a)) {
                        t9f.b();
                        return null;
                    }
                    z = js20Var instanceof gs20;
                }
                boolean z11 = list3 == null;
                nym0 nym0Var = (!dz20Var.h || z5) ? null : new nym0(dz20Var.i);
                boolean z12 = !z8;
                if (z7 || !z9) {
                    lm6Var = null;
                } else {
                    String strA = ctf0Var.b.a(R.string.game_screen_bet_builder_mode, Arrays.copyOf(new Object[0], 0));
                    boolean z13 = sf6Var.b;
                    tf6 tf6Var = tf6.f33852a;
                    lm6Var = new lm6(strA, z8, z13);
                }
                return new kz20(list4, qym0Var, id, jA, z9, z10, z, z11, udl0Var, nym0Var, z6, z12, lm6Var);
        }
    }

    public qk1(dz20 dz20Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        final byte b = 0;
        this.c = maz.b(new yw9(dz20Var.f6921a, new Function1(this) { // from class: a.mz20
            public final /* synthetic */ qk1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object os20Var;
                rwm0 rwm0Var;
                byte b2 = b;
                boolean z = false;
                qk1 qk1Var = this.b;
                List list = null;
                switch (b2) {
                    case 0:
                        List<js20> list2 = (List) obj;
                        if (list2 == null) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (js20 js20Var : list2) {
                            Long l = (Long) ((fee) qk1Var.d.getValue()).c();
                            ctf0 ctf0Var2 = qk1Var.b;
                            js20Var.getClass();
                            ctf0Var2.getClass();
                            if (js20Var instanceof gs20) {
                                os20Var = new os20(ctf0Var2.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0)), -26L, l != null && l.longValue() == -26);
                            } else if (js20Var instanceof hs20) {
                                os20Var = new ns20(ctf0Var2.b.a(R.string.players, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (!(js20Var instanceof is20)) {
                                    t9f.b();
                                    return null;
                                }
                                is20 is20Var = (is20) js20Var;
                                String str = is20Var.b;
                                long j = is20Var.f15285a;
                                if (j == 2) {
                                    os20Var = new qs20(str, j, l != null && l.longValue() == j);
                                } else if (j == 19) {
                                    os20Var = new ps20(str, j, l != null && l.longValue() == j);
                                } else {
                                    os20Var = new os20(str, j, l != null && l.longValue() == j);
                                }
                            }
                            arrayList.add(os20Var);
                        }
                        return arrayList;
                    default:
                        List<xvm0> list3 = (List) obj;
                        if (list3 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (xvm0 xvm0Var : list3) {
                                Long l2 = (Long) ((fee) qk1Var.f.getValue()).c();
                                ctf0 ctf0Var3 = qk1Var.b;
                                xvm0Var.getClass();
                                ctf0Var3.getClass();
                                if (xvm0Var instanceof wvm0) {
                                    wvm0 wvm0Var = (wvm0) xvm0Var;
                                    long jA = wvm0Var.a();
                                    long id = wvm0Var.getId();
                                    String name = wvm0Var.getName();
                                    if (name == null) {
                                        name = ctf0Var3.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                                    }
                                    rwm0Var = new rwm0(jA, id, name, false, l2 != null && l2.longValue() == wvm0Var.getId());
                                } else if (xvm0Var instanceof svm0) {
                                    svm0 svm0Var = (svm0) xvm0Var;
                                    rwm0Var = new rwm0(svm0Var.b, svm0Var.f32876a, ctf0Var3.f(R.string.game_insights_title, new Object[0]), true, l2 != null && l2.longValue() == svm0Var.f32876a);
                                } else if (xvm0Var instanceof rvm0) {
                                    rwm0Var = null;
                                } else {
                                    if (!(xvm0Var instanceof tvm0)) {
                                        t9f.b();
                                        return null;
                                    }
                                    tvm0 tvm0Var = (tvm0) xvm0Var;
                                    long j2 = tvm0Var.b;
                                    long j3 = tvm0Var.f34607a;
                                    String strA = tvm0Var.d;
                                    if (strA == null) {
                                        strA = ctf0Var3.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                                    }
                                    rwm0Var = new rwm0(j2, j3, strA, false, l2 != null && l2.longValue() == tvm0Var.f34607a);
                                }
                                if (rwm0Var != null) {
                                    arrayList2.add(rwm0Var);
                                }
                            }
                            list = arrayList2;
                        }
                        List list4 = list == null ? iun.f15405a : list;
                        if (list != null && list.size() >= 4) {
                            z = true;
                        }
                        return new qym0(list4, z);
                }
            }
        }, (byte) 20));
        this.d = bkb.H(dz20Var.c);
        final byte b2 = 1;
        this.e = maz.b(new yw9(dz20Var.d, new Function1(this) { // from class: a.mz20
            public final /* synthetic */ qk1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object os20Var;
                rwm0 rwm0Var;
                byte b3 = b2;
                boolean z = false;
                qk1 qk1Var = this.b;
                List list = null;
                switch (b3) {
                    case 0:
                        List<js20> list2 = (List) obj;
                        if (list2 == null) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (js20 js20Var : list2) {
                            Long l = (Long) ((fee) qk1Var.d.getValue()).c();
                            ctf0 ctf0Var2 = qk1Var.b;
                            js20Var.getClass();
                            ctf0Var2.getClass();
                            if (js20Var instanceof gs20) {
                                os20Var = new os20(ctf0Var2.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0)), -26L, l != null && l.longValue() == -26);
                            } else if (js20Var instanceof hs20) {
                                os20Var = new ns20(ctf0Var2.b.a(R.string.players, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (!(js20Var instanceof is20)) {
                                    t9f.b();
                                    return null;
                                }
                                is20 is20Var = (is20) js20Var;
                                String str = is20Var.b;
                                long j = is20Var.f15285a;
                                if (j == 2) {
                                    os20Var = new qs20(str, j, l != null && l.longValue() == j);
                                } else if (j == 19) {
                                    os20Var = new ps20(str, j, l != null && l.longValue() == j);
                                } else {
                                    os20Var = new os20(str, j, l != null && l.longValue() == j);
                                }
                            }
                            arrayList.add(os20Var);
                        }
                        return arrayList;
                    default:
                        List<xvm0> list3 = (List) obj;
                        if (list3 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (xvm0 xvm0Var : list3) {
                                Long l2 = (Long) ((fee) qk1Var.f.getValue()).c();
                                ctf0 ctf0Var3 = qk1Var.b;
                                xvm0Var.getClass();
                                ctf0Var3.getClass();
                                if (xvm0Var instanceof wvm0) {
                                    wvm0 wvm0Var = (wvm0) xvm0Var;
                                    long jA = wvm0Var.a();
                                    long id = wvm0Var.getId();
                                    String name = wvm0Var.getName();
                                    if (name == null) {
                                        name = ctf0Var3.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                                    }
                                    rwm0Var = new rwm0(jA, id, name, false, l2 != null && l2.longValue() == wvm0Var.getId());
                                } else if (xvm0Var instanceof svm0) {
                                    svm0 svm0Var = (svm0) xvm0Var;
                                    rwm0Var = new rwm0(svm0Var.b, svm0Var.f32876a, ctf0Var3.f(R.string.game_insights_title, new Object[0]), true, l2 != null && l2.longValue() == svm0Var.f32876a);
                                } else if (xvm0Var instanceof rvm0) {
                                    rwm0Var = null;
                                } else {
                                    if (!(xvm0Var instanceof tvm0)) {
                                        t9f.b();
                                        return null;
                                    }
                                    tvm0 tvm0Var = (tvm0) xvm0Var;
                                    long j2 = tvm0Var.b;
                                    long j3 = tvm0Var.f34607a;
                                    String strA = tvm0Var.d;
                                    if (strA == null) {
                                        strA = ctf0Var3.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                                    }
                                    rwm0Var = new rwm0(j2, j3, strA, false, l2 != null && l2.longValue() == tvm0Var.f34607a);
                                }
                                if (rwm0Var != null) {
                                    arrayList2.add(rwm0Var);
                                }
                            }
                            list = arrayList2;
                        }
                        List list4 = list == null ? iun.f15405a : list;
                        if (list != null && list.size() >= 4) {
                            z = true;
                        }
                        return new qym0(list4, z);
                }
            }
        }, (byte) 20));
        this.f = bkb.H(dz20Var.e);
    }

    public qk1(final ok1 ok1Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(ok1Var.e));
        this.c = n0o0VarH;
        this.d = bkb.G(((fee) n0o0VarH.getValue()).d, new m51(this, (byte) 7));
        this.e = maz.b(new Function0() { // from class: a.pk1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ok1 ok1Var2 = ok1Var;
                switch (b2) {
                    case 0:
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        int i = ok1Var2.d;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
                    default:
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        int i2 = ok1Var2.d;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
            }
        });
        final byte b2 = 1;
        this.f = maz.b(new Function0() { // from class: a.pk1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ok1 ok1Var2 = ok1Var;
                switch (b3) {
                    case 0:
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        int i = ok1Var2.d;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
                    default:
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        int i2 = ok1Var2.d;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
            }
        });
    }
}
