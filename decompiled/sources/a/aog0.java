package a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public final class aog0 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final mne A;
    public final grj B;
    public final i1w0 C;
    public c4m0 D;
    public bby E;
    public bby F;
    public final tlg0 o;
    public final nv20 p;
    public final tzi q;
    public final m1e r;
    public final duj s;
    public final u58 t;
    public final ag3 u;
    public final gg5 v;
    public final au0 w;
    public final ih5 x;
    public final l7k y;
    public final cmt z;

    public aog0(tlg0 tlg0Var, nv20 nv20Var, tzi tziVar, m1e m1eVar, duj dujVar, u58 u58Var, ag3 ag3Var, gg5 gg5Var, au0 au0Var, ih5 ih5Var, l7k l7kVar, cmt cmtVar, mne mneVar, ctf0 ctf0Var, grj grjVar, bzt bztVar, i1w0 i1w0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        gvb0 gvb0Var = new gvb0(tlg0Var, bztVar, (byte) 29);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 26);
        rwj rwjVar = mneVar.f22085a;
        super(null, gvb0Var, iv80Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = tlg0Var;
        this.p = nv20Var;
        this.q = tziVar;
        this.r = m1eVar;
        this.s = dujVar;
        this.t = u58Var;
        this.u = ag3Var;
        this.v = gg5Var;
        this.w = au0Var;
        this.x = ih5Var;
        this.y = l7kVar;
        this.z = cmtVar;
        this.A = mneVar;
        this.B = grjVar;
        this.C = i1w0Var;
        RuleData ruleData = tlg0Var.f34143a;
        if (ruleData.b.containsKey("TITLE_KEY") && ruleData.b.containsKey("DESCRIPTION_KEY")) {
            H(new dke0(this, (byte) 24));
        } else {
            M();
        }
    }

    public final void M() {
        bby bbyVar = this.E;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.E = sac.i0(jiu0.a(this), "RulesViewModel_getRules()", 3, 0L, q3d.j(kcy.class, ff5.class), q3d.j(Integer.valueOf(i2o.NotFound.getErrorCode()), Integer.valueOf(i2o.Forbidden.getErrorCode()), Integer.valueOf(i2o.BadRequest.getErrorCode()), Integer.valueOf(i2o.l1.getErrorCode()), Integer.valueOf(i2o.TooManyRequests.getErrorCode())), new k6d0((Object) this, (Object) (this.o.b ? bm5.d : bm5.f2822a), (yje) null, (byte) 25), null, this.A.b, new vng0(this, b), null, 580);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object N(bm5 bm5Var, zje zjeVar) {
        xng0 xng0Var;
        aog0 aog0Var = this;
        if (zjeVar instanceof xng0) {
            xng0Var = (xng0) zjeVar;
            int i = xng0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xng0Var.l = i - Integer.MIN_VALUE;
            } else {
                xng0Var = new xng0(aog0Var, zjeVar);
            }
        } else {
            xng0Var = new xng0(aog0Var, zjeVar);
        }
        xng0 xng0Var2 = xng0Var;
        Object objR = xng0Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = xng0Var2.l;
        if (i2 == 0) {
            z1x.P(objR);
            RuleData ruleData = aog0Var.o.f34143a;
            String str = ruleData.f46902a;
            Map map = ruleData.b;
            String str2 = ruleData.c;
            xng0Var2.i = aog0Var;
            xng0Var2.l = 1;
            objR = tzi.r(aog0Var.q, str, map, str2, bm5Var, xng0Var2, 40);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aog0Var = xng0Var2.i;
            z1x.P(objR);
        }
        List list = (List) objR;
        RuleData ruleData2 = aog0Var.o.f34143a;
        Map map2 = ruleData2.b;
        if (!ruleData2.b.containsKey("TITLE_KEY") || !map2.containsKey("DESCRIPTION_KEY")) {
            return list;
        }
        ArrayList arrayListN0 = CollectionsKt.N0(list);
        final wtf0 wtf0Var = new wtf0((byte) 26);
        arrayListN0.removeIf(new Predicate() { // from class: a.wng0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) wtf0Var.invoke(obj)).booleanValue();
            }
        });
        String str3 = (String) map2.getOrDefault("TITLE_KEY", "");
        ysw yswVar = new ysw(ruleData2.c, 7);
        ysw yswVar2 = new ysw(ruleData2.d, 7);
        clg0 clg0Var = clg0.DEFAULT;
        arrayListN0.add(0, new ykg0(true, str3, yswVar, yswVar2, clg0Var));
        String str4 = (String) map2.getOrDefault("DESCRIPTION_KEY", "");
        ysw yswVar3 = new ysw(null, 15);
        arrayListN0.add(1, new ykg0(false, str4, yswVar3, yswVar3, clg0Var));
        return arrayListN0;
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
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xkg0 xkg0Var;
        olg0 olg0Var = (olg0) obj;
        olg0Var.getClass();
        super.x(olg0Var);
        boolean z = olg0Var instanceof ilg0;
        byte b = 0;
        mne mneVar = this.A;
        m1e m1eVar = this.r;
        ohk0 ohk0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            c4m0 c4m0Var = this.D;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.D = sac.T(new fnq(m1eVar.b(), new yng0(this, objArr2 == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), zng0.h);
                return;
            }
            return;
        }
        if (olg0Var instanceof hlg0) {
            c4m0 c4m0Var2 = this.D;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
                return;
            }
            return;
        }
        boolean z2 = olg0Var instanceof klg0;
        i1w0 i1w0Var = this.C;
        if (!z2) {
            if (!(olg0Var instanceof llg0)) {
                if (olg0Var instanceof mlg0) {
                    if (m1eVar.c()) {
                        M();
                        return;
                    }
                    return;
                }
                if (olg0Var.equals(jlg0.f16716a)) {
                    E();
                    return;
                }
                if (!olg0Var.equals(nlg0.f23726a)) {
                    t9f.b();
                    return;
                }
                bby bbyVar = this.F;
                if ((bbyVar == null || !bbyVar.isActive()) && (xkg0Var = ((ong0) D()).h) != null) {
                    String str = xkg0Var.b;
                    String str2 = xkg0Var.f41028a;
                    this.F = sac.V(jiu0.a(this), new vng0(this, b), null, mneVar.f22085a, new qkb0(str, this, str2, objArr == true ? 1 : 0, (byte) 9), 10);
                    return;
                }
                return;
            }
            llg0 llg0Var = (llg0) olg0Var;
            String str3 = llg0Var.f20247a;
            if (llg0Var.b) {
                G(new eng0(str3));
                return;
            }
            if (str3.length() == 0) {
                return;
            }
            boolean zX = kotlin.text.c.x(str3, "tel:", false);
            gg5 gg5Var = this.v;
            u58 u58Var = this.t;
            if (zX) {
                u58Var.f35083a.a("information_contacts_call", wp20.b(new Pair("point", "phone")));
                gg5Var.o();
                G(new fng0(Uri.parse(str3)));
                return;
            }
            if (StringsKt.O(str3, "tg://resolve?domain", false)) {
                u58Var.f35083a.a("information_contacts_call", wp20.b(new Pair("point", "telegram")));
                gg5Var.s();
                G(new gng0(str3));
                return;
            }
            if (StringsKt.O(str3, "viber://chat?number", false)) {
                i8i.D("point", "viber", u58Var.f35083a, "information_contacts_call");
                gg5Var.f11237a.a(cui0.b(new j1p("viber", (byte) 0)), 3080L);
                G(new gng0(str3));
                return;
            }
            boolean zO = StringsKt.O(str3, "facebook.com", false);
            au0 au0Var = this.w;
            if (zO || StringsKt.O(str3, "instagram.com", false)) {
                if (StringsKt.O(str3, "facebook.com", false)) {
                    ohk0Var = ohk0.FACEBOOK;
                } else if (StringsKt.O(str3, "instagram.com", false)) {
                    ohk0Var = ohk0.INSTAGRAM;
                }
                if (ohk0Var != null) {
                    i8i.D("social_media", ohk0Var.f25269a, this.u.f809a, "information_smm_call");
                    au0Var.p(ohk0Var);
                }
                G(new gng0(str3));
                return;
            }
            if (StringsKt.O(str3, "twitter.com", false)) {
                au0Var.p(ohk0.TWITTER);
                G(new gng0(str3));
                return;
            } else if (kotlin.text.c.x(str3, "mailto", false)) {
                G(new hng0(str3));
                return;
            } else {
                i1w0Var.d(new dff0(this, str3, (byte) 19));
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
