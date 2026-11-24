package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x5q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40330a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x5q(ArrayList arrayList, ArrayList arrayList2, byte b) {
        this.f40330a = b;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40330a;
        int i = 0;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ou90Var.m((pu90) arrayList.get(i2), ((Number) arrayList2.get(i2)).intValue(), 0, 0.0f);
                }
                return Unit.f46060a;
            case 1:
                ou90Var.getClass();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ou90Var.m((pu90) arrayList.get(i3), ((Number) arrayList2.get(i3)).intValue(), 0, 0.0f);
                }
                return Unit.f46060a;
            case 2:
                ou90Var.getClass();
                int size3 = arrayList2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ou90Var.m((pu90) arrayList.get(i4), ((Number) arrayList2.get(i4)).intValue(), 0, 0.0f);
                }
                return Unit.f46060a;
            case 3:
                ou90Var.getClass();
                int size4 = arrayList2.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ou90Var.g((pu90) arrayList2.get(i5), 0, 0, 0.0f);
                }
                int size5 = arrayList.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    ou90Var.g((pu90) arrayList.get(i6), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            case 4:
                ou90Var.getClass();
                for (Object obj2 : arrayList2) {
                    int i7 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    g43 g43Var = (g43) arrayList.get(i);
                    ou90Var.g((pu90) obj2, (int) g43Var.b, (int) g43Var.c, 0.0f);
                    i = i7;
                }
                return Unit.f46060a;
            default:
                ou90Var.getClass();
                int size6 = arrayList2.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    ou90Var.m((pu90) arrayList.get(i8), 0, ((Number) arrayList2.get(i8)).intValue(), 0.0f);
                }
                return Unit.f46060a;
        }
    }
}
