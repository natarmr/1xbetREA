package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t9l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33570a;
    public final /* synthetic */ ArrayList b;

    public t9l0(ArrayList arrayList) {
        this.f33570a = (byte) 1;
        s9l0 s9l0Var = s9l0.b;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33570a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 1:
                return s9l0.b.get(arrayList.get(((Number) obj).intValue()));
            case 2:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 3:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 4:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 5:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 6:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 7:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 8:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 9:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 10:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 11:
                return sre0.f32672a.b(((a2n) arrayList.get(((Number) obj).intValue())).getClass());
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ t9l0(ArrayList arrayList, byte b) {
        this.f33570a = b;
        this.b = arrayList;
    }
}
