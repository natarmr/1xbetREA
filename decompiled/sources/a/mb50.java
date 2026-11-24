package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.top.impl.utils.nested_list_scroll_anchor_holder.model.ScrollPosition;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mb50 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21492a;

    public /* synthetic */ mb50(byte b) {
        this.f21492a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        switch (this.f21492a) {
            case 0:
                return new lie(kzn.d(ro4.m0(700, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(700, 0, null, 6), 2), (u7k0) null, 12);
            case 1:
                return Unit.f46060a;
            case 2:
                rb50 rb50Var = (rb50) obj;
                rb50Var.getClass();
                throw new IllegalStateException("Unknown screen " + rb50Var);
            case 3:
                ve50 ve50Var = (ve50) obj;
                ve50Var.getClass();
                if (ve50Var instanceof ue50) {
                    return kng0.l("Single(", mf50.f(((ue50) ve50Var).f35509a.a()), Separators.RPAREN);
                }
                if (ve50Var instanceof se50) {
                    se50 se50Var = (se50) ve50Var;
                    String strF = mf50.f(se50Var.f32061a.a());
                    List list = se50Var.b;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(mf50.f(((wul0) it.next()).a()));
                    }
                    return "Chain.Child(root=" + strF + ", screens=" + arrayList + Separators.RPAREN;
                }
                if (!(ve50Var instanceof re50)) {
                    t9f.b();
                    return null;
                }
                re50 re50Var = (re50) ve50Var;
                nu4 nu4Var = re50Var.f30319a;
                String strF2 = mf50.f(re50Var.b.a());
                List list2 = re50Var.c;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(mf50.f(((wul0) it2.next()).a()));
                }
                StringBuilder sb = new StringBuilder("Chain.Auth(tag=");
                sb.append(nu4Var);
                sb.append(", root=");
                sb.append(strF2);
                sb.append(", screens=");
                return rz4.n(sb, arrayList2, Separators.RPAREN);
            case 4:
                m7h0 m7h0Var = (m7h0) obj;
                m7h0Var.getClass();
                return mf50.f(m7h0Var);
            case 5:
                List<ScrollPosition> list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                for (ScrollPosition scrollPosition : list3) {
                    arrayList3.add(new jzg0(scrollPosition.b, scrollPosition.c, scrollPosition.f47160a));
                }
                return new qj50(arrayList3);
            case 6:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 7:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 5, null, null, saj.d, 6);
                return Unit.f46060a;
            case 8:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, qjj.d, 3);
                hcz.g(hczVar2, 5, null, null, qjj.e, 6);
                hcz.e(hczVar2, null, null, qjj.f, 3);
                return Unit.f46060a;
            case 9:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, eeq.j, 3);
                hcz.g(hczVar3, 5, null, null, eeq.k, 6);
                hcz.e(hczVar3, null, null, eeq.l, 3);
                return Unit.f46060a;
            case 10:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 11:
                qu50 qu50Var = (qu50) obj;
                qu50Var.getClass();
                if (qu50Var.b) {
                    return tu50.f34535a;
                }
                mdm mdmVar = qu50Var.c.b;
                return mdmVar != null ? new su50(mdmVar) : new ru50(qu50Var.f29332a, qu50Var.d, qu50Var.e, qu50Var.f);
            case 12:
                rcz rczVar = ((hx50) obj).f13798a;
                if (rczVar != null) {
                    rczVar.invoke();
                }
                return Unit.f46060a;
            case 13:
                rbs0 rbs0Var = (rbs0) obj;
                rbs0Var.getClass();
                return rbs0Var.f30204a;
            case 14:
                tdp tdpVar = (tdp) obj;
                tdpVar.getClass();
                if (tdpVar instanceof qdp) {
                    return Long.valueOf(((qdp) tdpVar).f28546a);
                }
                if (tdpVar instanceof sdp) {
                    return Long.valueOf(((sdp) tdpVar).f32044a);
                }
                if (tdpVar instanceof rdp) {
                    return ((rdp) tdpVar).f30300a;
                }
                t9f.b();
                return null;
            case 15:
                sbs0 sbs0Var = (sbs0) obj;
                sbs0Var.getClass();
                return sbs0Var.b;
            case 16:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 17:
                jlb jlbVar = (jlb) obj;
                jlbVar.getClass();
                return jlbVar.getKey();
            case 18:
                tn60 tn60Var = (tn60) obj;
                tn60Var.getClass();
                return new t160(tn60Var);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new s160(sjdVar);
            case 20:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 21:
                o8w o8wVar = (o8w) obj;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 22:
                s460 s460Var = (s460) obj;
                e7z e7zVar = s460Var.u;
                try {
                    if (s460Var.h0()) {
                        s460Var.H1(true);
                        break;
                    }
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    e7zVar.Z(th2);
                    throw null;
                }
            case 23:
                bg80 bg80Var = ((s460) obj).u1;
                if (bg80Var != null) {
                    ((gfv) bg80Var).c();
                }
                return Unit.f46060a;
            case 24:
                p560 p560Var = (p560) obj;
                p560Var.getClass();
                return new q560(p560Var.c, p560Var.d, p560Var.f26390a, !p560Var.b, p560Var.e);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ge60 ge60Var = (ge60) obj;
                if (ge60Var.h0()) {
                    ge60Var.f11138a.R();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                throw rw2.g(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                throw rw2.g(obj);
            default:
                lk60 lk60Var = (lk60) obj;
                lk60Var.getClass();
                return Integer.valueOf(lk60Var.f20185a);
        }
    }

    public /* synthetic */ mb50(mf50 mf50Var, byte b) {
        this.f21492a = b;
    }
}
