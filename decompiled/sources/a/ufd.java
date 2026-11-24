package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ufd implements g0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35572a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ufd(Object obj, byte b) {
        this.f35572a = b;
        this.b = obj;
    }

    @Override // a.g0h0
    public final Bundle a() {
        v1r v1rVarR;
        Pair[] pairArr;
        byte b = this.f35572a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                yfd yfdVar = ((agd) obj).i;
                yfdVar.getClass();
                LinkedHashMap linkedHashMap = yfdVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(yfdVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(yfdVar.g));
                return bundle;
            case 1:
                Map mapE = ((gzg0) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                kxq kxqVar = (kxq) obj;
                do {
                    v1rVarR = kxqVar.r();
                    lkz lkzVar = lkz.f20223a;
                } while (kxq.s(v1rVarR));
                kxqVar.w.d(kkz.ON_STOP);
                return new Bundle();
            case 3:
                return ((androidx.fragment.app.e) obj).p0();
            default:
                w5z w5zVar = (w5z) obj;
                for (Map.Entry entry2 : xp20.n((LinkedHashMap) w5zVar.d).entrySet()) {
                    w5zVar.j0((String) entry2.getKey(), ((p7m0) ((qz40) entry2.getValue())).getValue());
                }
                for (Map.Entry entry3 : xp20.n((LinkedHashMap) w5zVar.b).entrySet()) {
                    w5zVar.j0((String) entry3.getKey(), ((g0h0) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) w5zVar.f38604a;
                if (linkedHashMap2.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return i120.V((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
