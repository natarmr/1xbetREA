package a;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kno implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18596a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ kno(LinkedHashMap linkedHashMap, byte b) {
        this.f18596a = b;
        this.b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18596a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                lno lnoVar = (lno) obj;
                lnoVar.getClass();
                boolean z = lnoVar.b;
                Map map = lnoVar.f20356a;
                if (!z) {
                    return new lno(linkedHashMap, z);
                }
                Set setF = eui0.f(linkedHashMap.keySet(), map.keySet());
                int iA = wp20.a(r3d.q(setF, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                for (Object obj2 : setF) {
                    ((Number) obj2).longValue();
                    linkedHashMap2.put(obj2, Boolean.FALSE);
                }
                return new lno(xp20.j(map, linkedHashMap2), z);
            case 1:
                muy muyVar = (muy) obj;
                muyVar.getClass();
                Integer num = (Integer) pgi0.r(pgi0.q(CollectionsKt.I(muyVar.f22433a), new kno(linkedHashMap, (byte) 2)));
                if (num != null) {
                    return new Pair(Integer.valueOf(num.intValue()), muyVar);
                }
                return null;
            default:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String strReplace = lowerCase.replace('-', '_');
                strReplace.getClass();
                return (Integer) linkedHashMap.get(strReplace);
        }
    }
}
