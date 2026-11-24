package a;

import a.h97;
import a.m1r;
import a.z1a0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.playersduel.api.presentation.PlayerDuelParams;
import org.xplatform.playersduel.impl.presentation.players_duel.screen.PlayersDuelParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ab9 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final PlayerDuelParams o;
    public final i1w0 p;
    public final x4u q;
    public final reu r;
    public final d1u s;
    public final d1u t;
    public final roi0 u;
    public final hbu v;
    public final reu w;
    public final ibu x;
    public final r7v y;
    public final rl70 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ab9(mne mneVar, PlayerDuelParams playerDuelParams, ctf0 ctf0Var, ocl oclVar, i1w0 i1w0Var, x4u x4uVar, yfu yfuVar, reu reuVar, d1u d1uVar, d1u d1uVar2, roi0 roi0Var, hbu hbuVar, reu reuVar2, ibu ibuVar, r7v r7vVar, rl70 rl70Var) {
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.f22085a, mneVar.c);
        byte b = 12;
        yje yjeVar = null;
        super(new ej8((byte) 12), g090VarP, new cz(ctf0Var, oclVar, (byte) 8), (yzn0) null);
        this.o = playerDuelParams;
        this.p = i1w0Var;
        this.q = x4uVar;
        this.r = reuVar;
        this.s = d1uVar;
        this.t = d1uVar2;
        this.u = roi0Var;
        this.v = hbuVar;
        this.w = reuVar2;
        this.x = ibuVar;
        this.y = r7vVar;
        this.z = rl70Var;
        List listA = ((kym0) yfuVar.f42558a).f19113a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof rvm0) {
                arrayList.add(obj);
            }
        }
        d1u d1uVar3 = this.t;
        d1uVar3.getClass();
        udn udnVar = d1uVar3.f5328a.f37240a;
        udnVar.getClass();
        udnVar.f35488a.o(null, arrayList);
        udnVar.b.n(CollectionsKt.firstOrNull(arrayList));
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            ArrayList arrayList2 = arrayList;
            if (p7m0Var.m(value, pa9.a((pa9) value, null, arrayList2, null, false, null, null, null, null, false, 509))) {
                N();
                i3t0.K(this, null, null, new pn(this, yjeVar, b), 3);
                i3t0.L(this, new fnq(new va(this.v.f12788a.f14642a.b, (byte) 13), new ya9(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
                i3t0.L(this, new fnq(new va(((ien) this.w.b).f14642a.b, (byte) 14), new ya9(this, yjeVar, (byte) 1), (byte) 4), null, null, 3);
                return;
            }
            arrayList = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M(zje zjeVar) {
        za9 za9Var;
        Object value;
        if (zjeVar instanceof za9) {
            za9Var = (za9) zjeVar;
            int i = za9Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                za9Var.k = i - Integer.MIN_VALUE;
            } else {
                za9Var = new za9(this, zjeVar);
            }
        } else {
            za9Var = new za9(this, zjeVar);
        }
        Object objD0 = za9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = za9Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            boolean z = this.o.b;
            rvm0 rvm0Var = ((pa9) D()).c;
            if (rvm0Var == null) {
                return Unit.f46060a;
            }
            long j = rvm0Var.f31177a;
            za9Var.k = 1;
            fga0 fga0Var = (fga0) this.r.b;
            objD0 = qjj.d0(fga0Var.c.b, new ega0(fga0Var, z, j, null), za9Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        List list = (List) objD0;
        roi0 roi0Var = this.u;
        roi0Var.getClass();
        list.getClass();
        gen genVar = ((ien) roi0Var.f30839a).f14642a;
        genVar.getClass();
        genVar.f11164a.o(null, list);
        qoj0 qoj0Var = genVar.b;
        iun iunVar = iun.f15405a;
        qoj0Var.g(new hen(iunVar, iunVar));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, pa9.a((pa9) value, list, null, null, false, null, null, null, null, false, 246)));
        return Unit.f46060a;
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.A = i3t0.L(this, new fnq(new i89(this.s.f5328a.f37240a.b, (byte) 22), new d09((Object) this, yjeVar, (byte) 8), (byte) 4), null, new d38(this, (byte) 19), 1);
    }

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
        Object value;
        Object value2;
        Object value3;
        Object value4;
        pa9 pa9Var;
        wdn wdnVar;
        Object next;
        Object next2;
        ha9 ha9Var = (ha9) obj;
        ha9Var.getClass();
        super.x(ha9Var);
        if (ha9Var instanceof z99) {
            E();
            return;
        }
        boolean z = ha9Var instanceof aa9;
        i1w0 i1w0Var = this.p;
        if (z) {
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
        } else {
            if (ha9Var instanceof ea9) {
                long j = ((ea9) ha9Var).f7456a;
                wdn wdnVar2 = ((pa9) D()).g;
                int iOrdinal = wdnVar2.ordinal();
                r7v r7vVar = this.y;
                ibu ibuVar = this.x;
                tdn tdnVar = null;
                Object obj2 = null;
                tdn tdnVar2 = null;
                Object obj3 = null;
                if (iOrdinal == 0) {
                    Iterator it = ((pa9) D()).e.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((tdn) next).f33777a != j);
                    tdn tdnVar3 = (tdn) next;
                    List list = ((pa9) D()).f26644a;
                    if (list != null) {
                        for (Object obj4 : list) {
                            if (((tdn) obj4).f33777a == j) {
                                obj3 = obj4;
                                break;
                            }
                        }
                        tdnVar = (tdn) obj3;
                    }
                    if (tdnVar3 != null) {
                        ibuVar.a(tdnVar3, wdnVar2);
                        return;
                    } else {
                        if (((pa9) D()).e.size() >= 5 || tdnVar == null) {
                            return;
                        }
                        r7vVar.h(tdnVar, wdnVar2);
                        return;
                    }
                }
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                Iterator it2 = ((pa9) D()).f.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((tdn) next2).f33777a != j);
                tdn tdnVar4 = (tdn) next2;
                List list2 = ((pa9) D()).f26644a;
                if (list2 != null) {
                    for (Object obj5 : list2) {
                        if (((tdn) obj5).f33777a == j) {
                            obj2 = obj5;
                            break;
                        }
                    }
                    tdnVar2 = (tdn) obj2;
                }
                if (tdnVar4 != null) {
                    ibuVar.a(tdnVar4, wdnVar2);
                    return;
                } else {
                    if (((pa9) D()).f.size() >= 5 || tdnVar2 == null) {
                        return;
                    }
                    r7vVar.h(tdnVar2, wdnVar2);
                    return;
                }
            }
            if (ha9Var instanceof da9) {
                G(na9.f23179a);
                return;
            }
            if (ha9Var instanceof ba9) {
                G(ma9.f21448a);
                return;
            }
            boolean z2 = ha9Var instanceof ga9;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    pa9Var = (pa9) value4;
                    oyg0Var.getClass();
                    int i = ((ga9) ha9Var).f10954a;
                    wdnVar = wdn.c;
                    if (i != 0) {
                        wdnVar = wdn.d;
                    }
                } while (!p7m0Var.m(value4, pa9.a(pa9Var, null, null, null, false, null, null, wdnVar, null, false, 447)));
                return;
            }
            if (!(ha9Var instanceof ca9)) {
                if (!(ha9Var instanceof fa9)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, pa9.a((pa9) value, null, null, null, false, null, null, null, null, true, 247)));
                N();
                return;
            }
            boolean zIsEmpty = ((pa9) D()).e.isEmpty();
            boolean zIsEmpty2 = ((pa9) D()).f.isEmpty();
            if (zIsEmpty || zIsEmpty2) {
                if (!zIsEmpty) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value3, pa9.a((pa9) value3, null, null, null, false, null, null, wdn.d, null, false, 447)));
                    return;
                }
                if (zIsEmpty2) {
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value2, pa9.a((pa9) value2, null, null, null, false, null, null, wdn.c, null, false, 447)));
                return;
            }
            rvm0 rvm0Var = ((pa9) D()).c;
            if (rvm0Var == null) {
                return;
            }
            long j2 = rvm0Var.f31177a;
            PlayerDuelParams playerDuelParams = this.o;
            final PlayersDuelParams playersDuelParams = new PlayersDuelParams(playerDuelParams.f46823a, j2, playerDuelParams.c, playerDuelParams.b);
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            final rl70 rl70Var = this.z;
            rl70Var.getClass();
            k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.playersduel.impl.navigation.PlayerDuelScreenFactory$getScreen$1
                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    z1a0.U1.getClass();
                    z1a0 z1a0Var = new z1a0();
                    z1a0Var.R1.J(z1a0Var, z1a0.V1[0], playersDuelParams);
                    return z1a0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    rl70Var.getClass();
                    return h97.h(playersDuelParams.f46826a, "PLAYER_DUEL_FRAGMENT");
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            });
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
