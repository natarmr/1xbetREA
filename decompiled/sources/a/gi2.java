package a;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gi2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11324a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi2(Object obj, byte b) {
        this.f11324a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.f11324a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((Number) ((ma2) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (Function1 function1 : (Function1[]) obj3) {
                    int iB = hdd.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iB != 0) {
                        return iB;
                    }
                }
                return 0;
            case 2:
                return ((Number) ((e87) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((s3t) obj3).invoke(obj, obj2)).intValue();
            case 4:
                return ((Number) ((jar) obj3).invoke(obj, obj2)).intValue();
            case 5:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.v).compareTo(Boolean.valueOf(materialButton2.v));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            case 6:
                pm30 pm30Var = (pm30) obj3;
                return pm30Var.h(obj2) - pm30Var.h(obj);
            default:
                return ((Number) ((y43) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
