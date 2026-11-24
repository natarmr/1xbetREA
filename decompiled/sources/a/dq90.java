package a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class dq90 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6504a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ dq90(Integer num, byte b) {
        this.f6504a = b;
        this.b = num;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.f6504a;
        Integer num = this.b;
        switch (b) {
            case 0:
                Integer num2 = 1;
                Integer num3 = (num != null && ((nq90) obj).getId() == num.intValue()) ? 0 : num2;
                int id = ((nq90) obj2).getId();
                if (num != null && id == num.intValue()) {
                    num2 = 0;
                }
                return num3.compareTo(num2);
            default:
                Integer num4 = 1;
                Integer num5 = (num != null && ((nq90) obj).getId() == num.intValue()) ? 0 : num4;
                int id2 = ((nq90) obj2).getId();
                if (num != null && id2 == num.intValue()) {
                    num4 = 0;
                }
                return num5.compareTo(num4);
        }
    }
}
