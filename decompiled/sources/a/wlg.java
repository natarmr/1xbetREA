package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final class wlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesParentSectionModel f39352a;
    public final List b;
    public final List c;
    public final ms2 d;
    public final List e;

    public wlg(CyberGamesParentSectionModel cyberGamesParentSectionModel, List list, List list2, ms2 ms2Var, List list3) {
        cyberGamesParentSectionModel.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f39352a = cyberGamesParentSectionModel;
        this.b = list;
        this.c = list2;
        this.d = ms2Var;
        this.e = list3;
    }

    public static wlg a(wlg wlgVar, CyberGamesParentSectionModel cyberGamesParentSectionModel, List list, List list2, lr2 lr2Var, int i) {
        if ((i & 1) != 0) {
            cyberGamesParentSectionModel = wlgVar.f39352a;
        }
        CyberGamesParentSectionModel cyberGamesParentSectionModel2 = cyberGamesParentSectionModel;
        if ((i & 2) != 0) {
            list = wlgVar.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = wlgVar.c;
        }
        List list4 = list2;
        ms2 ms2Var = lr2Var;
        if ((i & 8) != 0) {
            ms2Var = wlgVar.d;
        }
        List list5 = wlgVar.e;
        cyberGamesParentSectionModel2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new wlg(cyberGamesParentSectionModel2, list3, list4, ms2Var, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlg)) {
            return false;
        }
        wlg wlgVar = (wlg) obj;
        return Intrinsics.d(this.f39352a, wlgVar.f39352a) && Intrinsics.d(this.b, wlgVar.b) && Intrinsics.d(this.c, wlgVar.c) && this.d.equals(wlgVar.d) && Intrinsics.d(this.e, wlgVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dw9.a(dw9.a(this.f39352a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberDelegateState(parentSection=");
        sb.append(this.f39352a);
        sb.append(", disciplineList=");
        sb.append(this.b);
        sb.append(", champList=");
        sb.append(this.c);
        sb.append(", entryPointType=");
        sb.append(this.d);
        sb.append(", topEventList=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
