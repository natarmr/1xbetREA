package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ifd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14681a = 1;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ ocl c;
    public final /* synthetic */ vjp d;
    public final /* synthetic */ r9u e;

    public /* synthetic */ ifd(vjp vjpVar, r9u r9uVar, ctf0 ctf0Var, ocl oclVar) {
        this.d = vjpVar;
        this.e = r9uVar;
        this.b = ctf0Var;
        this.c = oclVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a4x a4xVarO0;
        a4x a4xVarO1;
        byte b = this.f14681a;
        String str = "";
        r9u r9uVar = this.e;
        vjp vjpVar = this.d;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                sed sedVar = (sed) obj;
                sedVar.getClass();
                v5l0 v5l0VarE = vjpVar.e();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                ctf0Var.getClass();
                String strA = ctf0Var.b.a(R.string.completed_matches, Arrays.copyOf(new Object[0], 0));
                boolean z = sedVar.b;
                boolean z2 = sedVar.f32072a;
                List list = sedVar.c;
                ocl oclVar = this.c;
                mdm mdmVarB = z ? ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE) : (!list.isEmpty() || z2) ? null : ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990);
                if (z2) {
                    zdd zddVar = zdd.f44207a;
                    a4xVarO0 = dyb.g0(zddVar, zddVar, zddVar, zddVar);
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rvf rvfVar = (rvf) it.next();
                        rvfVar.getClass();
                        cys0 cys0Var = rvfVar.l;
                        List list2 = rvfVar.m;
                        List list3 = rvfVar.n;
                        y3n0 y3n0Var = (y3n0) CollectionsKt.f0(list2);
                        String str2 = y3n0Var != null ? y3n0Var.b : null;
                        if (str2 == null) {
                            str2 = str;
                        }
                        String strT = vsm0.t(str2);
                        y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list3);
                        String str3 = y3n0Var2 != null ? y3n0Var2.b : null;
                        if (str3 == null) {
                            str3 = str;
                        }
                        arrayList.add(new ydd(wwb.S(rvfVar.b, cys0Var, new kbo(rvfVar.d, a8k0.w(rvfVar.f, list2, cys0Var), rvfVar.e, a8k0.w(rvfVar.g, list3, cys0Var), strT, vsm0.t(str3), rvfVar.h, rvfVar.i, false, "", "", rvfVar.j, rvfVar.k, ctf0Var.h(), kotlin.collections.a.c(new Pair(rvfVar.h, rvfVar.i))), v5l0VarE, ctf0Var, oim0.f25320a), rvfVar));
                        it = it;
                        str = str;
                    }
                    a4xVarO0 = dyb.o0(arrayList);
                }
                return new hfd(mdmVarB, a4xVarO0, strA, zD);
            default:
                rgp rgpVar = (rgp) obj;
                rgpVar.getClass();
                boolean zH = ctf0Var.h();
                v5l0 v5l0VarE2 = vjpVar.e();
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                boolean z3 = rgpVar.c;
                ocl oclVar2 = this.c;
                mdm mdmVarB2 = z3 ? ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990) : rgpVar.b ? ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE) : null;
                if (rgpVar.f30449a) {
                    tgp tgpVar = tgp.f33924a;
                    a4xVarO1 = dyb.g0(tgpVar, tgpVar, tgpVar, tgpVar);
                } else {
                    List<uft0> list4 = rgpVar.d;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                    for (uft0 uft0Var : list4) {
                        long j = rgpVar.e;
                        uft0Var.getClass();
                        ufp0 ufp0Var = uft0Var.d;
                        List list5 = ufp0Var.e;
                        ufp0 ufp0Var2 = uft0Var.e;
                        List list6 = ufp0Var2.e;
                        cys0 cys0VarV = wvb.V(j, q3d.j(ufp0Var, ufp0Var2));
                        y3n0 y3n0Var3 = (y3n0) CollectionsKt.f0(list5);
                        String str4 = y3n0Var3 != null ? y3n0Var3.b : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String strT2 = vsm0.t(str4);
                        y3n0 y3n0Var4 = (y3n0) CollectionsKt.f0(list6);
                        String str5 = y3n0Var4 != null ? y3n0Var4.b : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        kbo kboVar = new kbo(ufp0Var.b, a8k0.w(ufp0Var.d, list5, cys0VarV), ufp0Var2.b, a8k0.w(ufp0Var2.d, list6, cys0VarV), strT2, vsm0.t(str5), "", "", true, "", "", uft0Var.f.b(), 0, zH, iun.f15405a);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(new sgp(ntb.c0(uft0Var.b, cys0VarV, kboVar, v5l0VarE2, oim0.f25320a), uft0Var));
                        arrayList2 = arrayList3;
                    }
                    a4xVarO1 = dyb.o0(arrayList2);
                }
                return new vgp(mdmVarB2, a4xVarO1, zD2);
        }
    }

    public /* synthetic */ ifd(ctf0 ctf0Var, ocl oclVar, vjp vjpVar, r9u r9uVar) {
        this.b = ctf0Var;
        this.c = oclVar;
        this.d = vjpVar;
        this.e = r9uVar;
    }
}
