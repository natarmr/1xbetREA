package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kgc extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kgc f18231a = new kgc(1, zgc.class, "toUiState", "toUiState(Lorg/xplatform/feature/online_call/impl/presentation/ui/choose_language_dialog/ChooseLanguageViewModel$State;)Lorg/xplatform/feature/online_call/impl/presentation/ui/choose_language_dialog/ChooseLanguageViewModel$UiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qgc qgcVar = (qgc) obj;
        qgcVar.getClass();
        String str = qgcVar.f28677a;
        boolean z = str.length() > 0;
        List<mr70> list = qgcVar.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (mr70 mr70Var : list) {
            mr70Var.getClass();
            arrayList.add(new or70(mr70Var.b, mr70Var.f22255a, mr70Var.e));
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (StringsKt.O(((or70) obj2).b, str, true)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        return new rgc(dyb.o0(CollectionsKt.A0(arrayList, new vt5((byte) 9))), str);
    }
}
