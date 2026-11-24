package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dik extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ikd f6143a;

    public dik(ikd ikdVar) {
        this.f6143a = ikdVar;
        if (ikdVar.b) {
            return;
        }
        int[] iArr = {201, Response.ACCEPTED, 204, 206, 207, 125, -127, 126665345, Response.OK};
        List list = ikdVar.f14920a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            kkd kkdVar = (kkd) list.get(i);
            if (!tx3.w(iArr, kkdVar.f18431a)) {
                if (kkdVar.f18431a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((kkd) list.get(i3)).f18431a == 1000) {
                        break;
                    } else {
                        w3d.A(arrayList);
                    }
                } else {
                    arrayList.add(kkdVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", twn.m(((kkd) arrayList.get(i4)).f18431a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ikd ikdVar = this.f6143a;
        if (!ikdVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        lc00 lc00VarB = kotlin.collections.a.b();
        List list = ikdVar.f14920a;
        list.getClass();
        ah30 ah30Var = new ah30(list);
        int iB = ah30Var.b();
        for (int i = 0; i < iB; i++) {
            ((kkd) ah30Var.get(i)).getClass();
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        lc00VarA.getClass();
        ah30 ah30Var2 = new ah30(lc00VarA);
        int iB2 = ah30Var2.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            String str = (String) ah30Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
