package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f42511a = q3d.j("static/img/ImgDefault/Esports/Real/HLTV/header/HLTVAwards.png", "static/img/ImgDefault/Esports/Real/HLTV/header/PanelAwards.png", "static/img/ImgDefault/Esports/Real/HLTV/header/CommunityAwards.png");

    public static final xew a(Cnew cnew, long j, String str, boolean z, boolean z2) {
        List<vcw> list;
        Object next;
        Iterable iterable;
        if (cnew == null || (list = cnew.b) == null) {
            list = iun.f15405a;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vcw) next).f37207a != j);
        int iIndexOf = list.indexOf(next);
        if (z2) {
            iterable = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (vcw vcwVar : list) {
                long j2 = vcwVar.f37207a;
                arrayList.add(new uew(vcwVar.b, j2, j2 == j));
            }
            iterable = arrayList;
        }
        i4 i4VarR0 = dyb.r0(iterable);
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = (String) CollectionsKt.W(iIndexOf, f42511a);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new xew(str, i4VarR0, sb.toString(), z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder);
    }
}
