package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rlg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30695a;
    public final /* synthetic */ luu b;

    public /* synthetic */ rlg(luu luuVar, byte b) {
        this.f30695a = b;
        this.b = luuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30695a;
        luu luuVar = this.b;
        switch (b) {
            case 0:
                CyberGamesParentSectionModel.FromMain fromMain = CyberGamesParentSectionModel.FromMain.INSTANCE;
                iun iunVar = iun.f15405a;
                return new wlg(fromMain, iunVar, iunVar, new ls2(), luuVar.f20692a.a());
            default:
                List listA = luuVar.f20692a.a();
                ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((lok0) it.next()).f20396a));
                }
                return new mll0("", arrayList, iun.f15405a);
        }
    }
}
