package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f2293a;

    public /* synthetic */ bb6(us00 us00Var) {
        this.f2293a = us00Var;
    }

    public int a(String str, dkq dkqVar) {
        str.getClass();
        us00 us00Var = this.f2293a;
        int identifier = us00Var.getResources().getIdentifier(str, dkqVar.f6245a, us00Var.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return 0;
    }

    public ArrayList b(String[] strArr) {
        dkq dkqVar = dkq.DRAWABLE;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int iC = 0;
        while (iC < length) {
            String str = strArr[iC];
            us00 us00Var = this.f2293a;
            int identifier = us00Var.getResources().getIdentifier(str, "drawable", us00Var.getPackageName());
            if (identifier == 0) {
                identifier = 0;
            }
            iC = w6x.c(identifier, iC, 1, arrayList);
        }
        return arrayList;
    }
}
