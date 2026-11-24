package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class mea0 extends i3t0 {
    public final hzg o;
    public final u8u p;
    public final ctf0 q;
    public final ih5 r;
    public final zr1 s;
    public bby t;

    /* JADX WARN: Illegal instructions before constructor call */
    public mea0(PlayerTransfersScreenParams playerTransfersScreenParams, mne mneVar, hzg hzgVar, u8u u8uVar, ctf0 ctf0Var, g2v g2vVar, ih5 ih5Var, zr1 zr1Var) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new l3a0(playerTransfersScreenParams, (byte) 10), cvm0.p(rwjVar, rwjVar), new o20(g2vVar, ctf0Var, (byte) 18), (yzn0) null);
        this.o = hzgVar;
        this.p = u8uVar;
        this.q = ctf0Var;
        this.r = ih5Var;
        this.s = zr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        j0g0 j0g0Var;
        Object obj2;
        jda0 jda0Var;
        List list;
        Iterator it;
        Object next;
        fea0 fea0Var;
        List list2;
        Object next2;
        yca0 yca0Var = (yca0) obj;
        yca0Var.getClass();
        super.x(yca0Var);
        byte b = 23;
        aea0 aea0Var = 0;
        aea0Var = 0;
        aea0Var = 0;
        aea0Var = 0;
        if (!(yca0Var instanceof xca0)) {
            if (!(yca0Var instanceof tca0)) {
                t9f.b();
                return;
            }
            tca0 tca0Var = (tca0) yca0Var;
            if (tca0Var.equals(sca0.f31977a)) {
                if (((zda0) D()).b == null) {
                    bby bbyVar = this.t;
                    if (bbyVar != null) {
                        e3c.n(bbyVar);
                    }
                    this.t = i3t0.K(this, null, null, new epp(this, aea0Var, b), 3);
                    return;
                }
                return;
            }
            if (tca0Var.equals(rca0.f30229a)) {
                bby bbyVar2 = this.t;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                    return;
                }
                return;
            }
            if (tca0Var.equals(qca0.f28476a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        xca0 xca0Var = (xca0) yca0Var;
        boolean zEquals = xca0Var.equals(uca0.f35419a);
        hzg hzgVar = this.o;
        if (zEquals) {
            ((uzg) hzgVar).a();
            return;
        }
        if (xca0Var.equals(vca0.f37179a)) {
            bby bbyVar3 = this.t;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            this.t = i3t0.K(this, null, null, new epp(this, aea0Var, b), 3);
            return;
        }
        if (!(xca0Var instanceof wca0)) {
            t9f.b();
            return;
        }
        wca0 wca0Var = (wca0) xca0Var;
        long j = wca0Var.f38916a;
        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it2 = listJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it2.next()).f43419a));
        }
        j0g0 j0g0Var2 = ((zda0) D()).b;
        if (j0g0Var2 != null) {
            Object obj3 = j0g0Var2.f15681a;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            jda0 jda0Var2 = (jda0) obj3;
            if (jda0Var2 == null || (list2 = jda0Var2.b) == null) {
                j0g0Var = ((zda0) D()).b;
                if (j0g0Var != null) {
                    obj2 = j0g0Var.f15681a;
                    if (obj2 instanceof g0g0) {
                        obj2 = null;
                    }
                    jda0Var = (jda0) obj2;
                    if (jda0Var != null && (list = jda0Var.b) != null) {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((fea0) next).e.f718a != j);
                        fea0Var = (fea0) next;
                        if (fea0Var != null) {
                            aea0Var = fea0Var.e;
                        }
                    }
                }
            } else {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((fea0) next2).d.f718a != j);
                fea0 fea0Var2 = (fea0) next2;
                if (fea0Var2 != null) {
                    aea0Var = fea0Var2.d;
                } else {
                    j0g0Var = ((zda0) D()).b;
                    if (j0g0Var != null) {
                        obj2 = j0g0Var.f15681a;
                        if (obj2 instanceof g0g0) {
                            obj2 = null;
                        }
                        jda0Var = (jda0) obj2;
                        if (jda0Var != null) {
                            it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((fea0) next).e.f718a != j);
                            fea0Var = (fea0) next;
                            if (fea0Var != null) {
                                aea0Var = fea0Var.e;
                            }
                        }
                    }
                }
            }
        } else {
            j0g0Var = ((zda0) D()).b;
            if (j0g0Var != null) {
                obj2 = j0g0Var.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                jda0Var = (jda0) obj2;
                if (jda0Var != null) {
                    it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((fea0) next).e.f718a != j);
                    fea0Var = (fea0) next;
                    if (fea0Var != null) {
                        aea0Var = fea0Var.e;
                    }
                }
            }
        }
        if (!arrayList.contains(Long.valueOf(((zda0) D()).f44203a.f46566a)) || aea0Var == 0 || !aea0Var.f) {
            G(new yda0(this.q.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
            return;
        }
        this.r.p(r1g.PLAYER_TRANSFERS, ((zda0) D()).f44203a.f46566a);
        this.s.z(((zda0) D()).f44203a.f46566a, "player_transfers");
        ((uzg) hzgVar).n(((zda0) D()).f44203a.f46566a, wca0Var.f38916a, wca0Var.b, k1g.UNKNOWN);
    }
}
