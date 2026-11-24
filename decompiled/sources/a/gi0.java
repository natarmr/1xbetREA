package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11323a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ kie0 d;

    public /* synthetic */ gi0(ArrayList arrayList, ArrayList arrayList2, kie0 kie0Var, byte b) {
        this.f11323a = b;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = kie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11323a;
        kie0 kie0Var = this.d;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ou90Var.g((pu90) arrayList2.get(i), 0, kie0Var.f18333a, 0.0f);
                }
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ou90Var.g((pu90) arrayList.get(i2), 0, 0, 0.0f);
                }
                break;
            case 1:
                ou90Var.getClass();
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    pu90 pu90Var = (pu90) arrayList2.get(i3);
                    int i4 = kie0Var.f18333a;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    ou90Var.g(pu90Var, 0, i4, 0.0f);
                }
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ou90Var.g((pu90) arrayList.get(i5), 0, 0, 0.0f);
                }
                break;
            case 2:
                ou90Var.getClass();
                int size5 = arrayList2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    ou90Var.g((pu90) arrayList2.get(i6), 0, kie0Var.f18333a, 0.0f);
                }
                int size6 = arrayList.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    ou90Var.g((pu90) arrayList.get(i7), 0, 0, 0.0f);
                }
                break;
            case 3:
                ou90Var.getClass();
                int size7 = arrayList2.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    ou90Var.g((pu90) arrayList2.get(i8), 0, kie0Var.f18333a, 0.0f);
                }
                int size8 = arrayList.size();
                for (int i9 = 0; i9 < size8; i9++) {
                    ou90Var.g((pu90) arrayList.get(i9), 0, 0, 0.0f);
                }
                break;
            case 4:
                ou90Var.getClass();
                int size9 = arrayList2.size();
                for (int i10 = 0; i10 < size9; i10++) {
                    ou90Var.g((pu90) arrayList2.get(i10), 0, kie0Var.f18333a, 0.0f);
                }
                int size10 = arrayList.size();
                for (int i11 = 0; i11 < size10; i11++) {
                    ou90Var.g((pu90) arrayList.get(i11), 0, 0, 0.0f);
                }
                break;
            case 5:
                ou90Var.getClass();
                int size11 = arrayList2.size();
                for (int i12 = 0; i12 < size11; i12++) {
                    ou90Var.g((pu90) arrayList2.get(i12), 0, kie0Var.f18333a, 0.0f);
                }
                int size12 = arrayList.size();
                for (int i13 = 0; i13 < size12; i13++) {
                    ou90Var.g((pu90) arrayList.get(i13), 0, 0, 0.0f);
                }
                break;
            case 6:
                ou90Var.getClass();
                int size13 = arrayList2.size();
                for (int i14 = 0; i14 < size13; i14++) {
                    ou90Var.g((pu90) arrayList2.get(i14), 0, kie0Var.f18333a, 0.0f);
                }
                int size14 = arrayList.size();
                for (int i15 = 0; i15 < size14; i15++) {
                    ou90Var.g((pu90) arrayList.get(i15), 0, 0, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                int size15 = arrayList2.size();
                for (int i16 = 0; i16 < size15; i16++) {
                    ou90Var.g((pu90) arrayList2.get(i16), 0, kie0Var.f18333a, 0.0f);
                }
                int size16 = arrayList.size();
                for (int i17 = 0; i17 < size16; i17++) {
                    ou90Var.g((pu90) arrayList.get(i17), 0, 0, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }
}
