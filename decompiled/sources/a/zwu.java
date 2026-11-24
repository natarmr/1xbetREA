package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zwu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f45126a;

    public /* synthetic */ zwu(z220 z220Var) {
        this.f45126a = z220Var;
    }

    public ArrayList a(uaq0 uaq0Var, String str) {
        String str2;
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("ru_RU");
        int iOrdinal = uaq0Var.ordinal();
        if (iOrdinal != 1) {
            str2 = iOrdinal != 2 ? "_l.png" : "_n.png";
        } else {
            str2 = "_d.png";
        }
        ((yvn0) this.f45126a.d).getClass();
        List listJ = zEqualsIgnoreCase ? q3d.j("/static/img/ImgDefault/swipex/onboarding/android/ru/A_1", "/static/img/ImgDefault/swipex/onboarding/android/ru/A_2", "/static/img/ImgDefault/swipex/onboarding/android/ru/A_3") : q3d.j("/static/img/ImgDefault/swipex/onboarding/android/en/A_1", "/static/img/ImgDefault/swipex/onboarding/android/en/A_2", "/static/img/ImgDefault/swipex/onboarding/android/en/A_3");
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + str2);
        }
        return arrayList;
    }
}
