package a;

import android.javax.sip.message.Response;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class hjg implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13158a = 0;
    public final ctf0 b;
    public final g2v c;
    public final n0o0 d;

    public hjg(g2v g2vVar, ctf0 ctf0Var, sig sigVar) {
        ctf0Var.getClass();
        this.c = g2vVar;
        this.b = ctf0Var;
        iun iunVar = iun.f15405a;
        wcb wcbVar = sigVar.g;
        List list = sigVar.j;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.d = maz.b(new yw9(new lig(iunVar, wcbVar, list, "", false, iunVar, false, lunVar), new hfg(sigVar, (byte) 6), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        lgg lggVar;
        lgg lggVar2;
        switch (this.f13158a) {
            case 0:
                sig sigVar = (sig) obj;
                sigVar.getClass();
                String str = sigVar.i;
                List list = sigVar.l;
                mig migVar = sigVar.h;
                j0g0 j0g0Var = migVar != null ? new j0g0(migVar.f21844a) : null;
                long j = sigVar.f32262a.b;
                vef vefVar = new vef(this, sigVar, (byte) 5);
                boolean z = sigVar.f;
                g2v g2vVar = this.c;
                if (j0g0Var != null || z) {
                    mgg mggVar = mgg.f21741a;
                    if (j0g0Var == null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < 4; i++) {
                            arrayList.add(new ncg(twn.m(i, "CHAMP_HEADER_SHIMMER_KEY"), new ijm(new qjm())));
                            for (int i2 = 0; i2 < 3; i2++) {
                                arrayList.add(new acg(f140.j(i, "CHAMP_CELL_SHIMMER_KEY", i2, BundleUtil.UNDERLINE_TAG)));
                            }
                        }
                        lggVar = new lgg(dyb.o0(arrayList), mggVar);
                    } else {
                        Object obj2 = j0g0Var.f15681a;
                        boolean z2 = obj2 instanceof g0g0;
                        if ((z2 ? null : obj2) == null) {
                            lggVar2 = rcb.e0(j, g2vVar);
                        } else {
                            List list2 = (List) (z2 ? null : obj2);
                            if (list2 == null) {
                                list2 = iun.f15405a;
                            }
                            a4x a4xVar = list2.isEmpty() ? lak0.c : (a4x) vefVar.invoke();
                            if (a4xVar.isEmpty()) {
                                lggVar2 = new lgg(lak0.c, new ngg(!StringsKt.W(str) ? g2v.b(g2vVar, ozb.N(j, -1L), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990) : g2v.b(g2vVar, ozb.N(j, -1L), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
                            } else {
                                lggVar = new lgg(a4xVar, mggVar);
                            }
                        }
                    }
                    lggVar2 = lggVar;
                } else {
                    lggVar2 = rcb.e0(j, g2vVar);
                }
                boolean z3 = sigVar.k;
                Object[] objArr = {String.valueOf(list.size()), "10"};
                ctf0 ctf0Var = this.b;
                ue9 ue9Var = new ue9(ctf0Var.b.a(R.string.seleceted_amount, Arrays.copyOf(objArr, 2)));
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.b;
                return new tig(lggVar2, new kgg(z3, new wul(lulVar, oe9Var, ue9Var, list.size() > 0, false, false), new wul(nul.e, oe9Var, new ue9(ctf0Var.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false)), str);
            default:
                pyy pyyVar = (pyy) obj;
                pyyVar.getClass();
                j0g0 j0g0Var2 = pyyVar.c;
                g2v g2vVar2 = this.c;
                if (j0g0Var2 == null && !pyyVar.f27820a) {
                    return new qyy(new myy(yyw.N(g2vVar2, ldm.f19857a)));
                }
                lyy lyyVar = lyy.f20884a;
                if (j0g0Var2 == null) {
                    v5l0 v5l0Var = pyyVar.f.g.y;
                    boolean z4 = pyyVar.g;
                    ArrayList arrayList2 = new ArrayList(4);
                    for (int i3 = 0; i3 < 4; i3++) {
                        arrayList2.add(hkb.G(v5l0Var));
                    }
                    return new qyy(lyyVar, dyb.g0(new jyy(dyb.o0(arrayList2), "RESULT_CARD_SHIMMER_KEY", z4)));
                }
                if (j0g0Var2.f15681a instanceof g0g0) {
                    return new qyy(new myy(yyw.N(g2vVar2, ldm.f19857a)));
                }
                n0o0 n0o0Var = this.d;
                ((fee) n0o0Var.getValue()).d(pyyVar);
                lc00 lc00VarB = kotlin.collections.a.b();
                a4x a4xVarK = twn.k(lc00VarB, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB);
                return a4xVarK.isEmpty() ? new qyy(new myy(yyw.M(g2vVar2))) : new qyy(lyyVar, a4xVarK);
        }
    }

    public hjg(pyy pyyVar, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = maz.b(new yw9(pyyVar, new adw(this, (byte) 22), (byte) 20));
    }
}
