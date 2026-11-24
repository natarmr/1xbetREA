package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fgh0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f9493a;
    public final int b;
    public final boolean c;

    public fgh0(ctf0 ctf0Var, int i, boolean z) {
        ctf0Var.getClass();
        this.f9493a = ctf0Var;
        this.b = i;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ?? arrayList;
        Set setP0;
        bzv0 bzv0Var = (bzv0) obj;
        bzv0Var.getClass();
        boolean z = bzv0Var.f;
        h9p h9pVar = bzv0Var.b;
        int i = this.b;
        if (z) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.g;
            xuzVar.getClass();
            return new dzv0(new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        boolean z2 = bzv0Var.d;
        boolean z3 = this.c;
        ctf0 ctf0Var = this.f9493a;
        if (z2) {
            List list = bzv0Var.e;
            boolean z4 = h9pVar instanceof e9p;
            e9p e9pVar = z4 ? (e9p) h9pVar : null;
            if (e9pVar != null) {
                List list2 = e9pVar.f7432a;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((i8p) it.next()).f14350a));
                }
                setP0 = CollectionsKt.P0(arrayList2);
                if (setP0 == null) {
                    setP0 = xun.f41520a;
                }
            } else {
                setP0 = xun.f41520a;
            }
            if (list != null) {
                if (list.isEmpty()) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.e;
                    xuzVar2.getClass();
                    return new czv0(new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 734));
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(tlb.j0((pbv) it2.next(), ctf0Var, setP0, z4, z3));
                }
                return new ezv0(new ftr(dyb.r0(arrayList3)));
            }
        } else {
            qdt qdtVar = bzv0Var.c;
            String str = bzv0Var.f3492a;
            if (qdtVar instanceof ndt) {
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var3 = pb10.r1;
                xuzVar3.getClass();
                return new gzv0(new mdm(xuz.a(pb10Var3, i), pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852));
            }
            if (!(h9pVar instanceof f9p) && !(qdtVar instanceof kdt)) {
                boolean z5 = h9pVar instanceof e9p;
                if ((!z5 && !(h9pVar instanceof g9p)) || !(qdtVar instanceof hdt)) {
                    xuz xuzVar4 = pb10.c;
                    pb10 pb10Var4 = pb10.g;
                    xuzVar4.getClass();
                    return new dzv0(new mdm(xuz.a(pb10Var4, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                List list3 = ((hdt) qdtVar).f12886a;
                ArrayList<pbv> arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    pbv pbvVar = (pbv) obj2;
                    String str2 = pbvVar.c;
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String lowerCase2 = str.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (lowerCase2.length() == 0 || StringsKt.O(lowerCase, lowerCase2, false)) {
                        if (pbvVar.q) {
                            arrayList4.add(obj2);
                        }
                    }
                }
                if (str.length() == 0 && arrayList4.isEmpty()) {
                    xuz xuzVar5 = pb10.c;
                    pb10 pb10Var5 = pb10.g;
                    xuzVar5.getClass();
                    return new czv0(new mdm(xuz.a(pb10Var5, i), null, null, 0, 0, R.string.data_empty_games_error, 0, 0, 0L, 0L, 734));
                }
                if (arrayList4.isEmpty()) {
                    xuz xuzVar6 = pb10.c;
                    pb10 pb10Var6 = pb10.e;
                    xuzVar6.getClass();
                    return new czv0(new mdm(xuz.a(pb10Var6, i), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 734));
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                for (pbv pbvVar2 : arrayList4) {
                    e9p e9pVar2 = z5 ? (e9p) h9pVar : null;
                    if (e9pVar2 != null) {
                        List list4 = e9pVar2.f7432a;
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(Long.valueOf(((i8p) it3.next()).f14350a));
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    lc00VarB.add(tlb.j0(pbvVar2, ctf0Var, CollectionsKt.P0(arrayList), z5, z3));
                }
                return new ezv0(new ftr(dyb.r0(kotlin.collections.a.a(lc00VarB))));
            }
        }
        return fzv0.f10430a;
    }
}
