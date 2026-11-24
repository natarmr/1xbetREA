package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class di9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6127a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public di9(int i, String str) {
        this.f6127a = 0;
        this.b = null;
        this.f6127a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(new qh9(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6127a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = Separators.STAR;
        }
        sb.append(str);
        ArrayList<qh9> arrayList = this.c;
        if (arrayList != null) {
            for (qh9 qh9Var : arrayList) {
                sb.append('[');
                String str2 = qh9Var.f28726a;
                String str3 = qh9Var.c;
                sb.append(str2);
                int iE = hne.E(qh9Var.b);
                if (iE == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iE == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iE == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<th9> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (th9 th9Var : arrayList2) {
                sb.append(':');
                sb.append(th9Var);
            }
        }
        return sb.toString();
    }
}
