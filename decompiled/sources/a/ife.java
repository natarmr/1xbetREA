package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ife implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14683a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ ife(a4x a4xVar, byte b) {
        this.f14683a = b;
        this.b = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        byte b = this.f14683a;
        int i = 0;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                size = a4xVar.size();
                break;
            case 1:
                size = a4xVar.size();
                break;
            case 2:
                List listD0 = CollectionsKt.D0(a4xVar, 5);
                ArrayList arrayList = new ArrayList(5);
                while (i < 5) {
                    arrayList.add((oem) CollectionsKt.W(i, listD0));
                    i++;
                }
                return arrayList;
            case 3:
                List listD1 = CollectionsKt.D0(a4xVar, 5);
                ArrayList arrayList2 = new ArrayList(5);
                while (i < 5) {
                    arrayList2.add((egm) CollectionsKt.W(i, listD1));
                    i++;
                }
                return arrayList2;
            case 4:
                size = a4xVar.size();
                break;
            case 5:
                size = a4xVar.size();
                break;
            case 6:
                size = a4xVar.size();
                break;
            case 7:
                size = a4xVar.size();
                break;
            default:
                size = a4xVar.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
