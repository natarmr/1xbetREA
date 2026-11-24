package a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class met {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21663a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = vtt0.f38024a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f21663a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    public final void b(ed40 ed40Var) {
        cd40 cd40Var;
        ed40Var.getClass();
        u3x u3xVarL = b4x.l();
        cd40[] cd40VarArr = ed40Var.f7600a;
        int length = cd40VarArr.length;
        int i = 0;
        while (true) {
            cd40 cd40Var2 = null;
            if (i >= length) {
                break;
            }
            cd40 cd40Var3 = cd40VarArr[i];
            if (k8d.class.isAssignableFrom(cd40Var3.getClass())) {
                cd40 cd40Var4 = (cd40) k8d.class.cast(cd40Var3);
                if (((k8d) cd40Var4).c.equals("iTunSMPB")) {
                    cd40Var2 = cd40Var4;
                }
            }
            if (cd40Var2 != null) {
                u3xVarL.b(cd40Var2);
            }
            i++;
        }
        v3x v3xVarListIterator = u3xVarL.g().listIterator(0);
        while (v3xVarListIterator.hasNext()) {
            if (a(((k8d) v3xVarListIterator.next()).d)) {
                return;
            }
        }
        wuj wujVar = new wuj((byte) 2);
        u3x u3xVarL2 = b4x.l();
        for (cd40 cd40Var5 : ed40Var.f7600a) {
            if (jmx.class.isAssignableFrom(cd40Var5.getClass())) {
                cd40Var = (cd40) jmx.class.cast(cd40Var5);
                if (!wujVar.apply(cd40Var)) {
                    cd40Var = null;
                }
            } else {
                cd40Var = null;
            }
            if (cd40Var != null) {
                u3xVarL2.b(cd40Var);
            }
        }
        v3x v3xVarListIterator2 = u3xVarL2.g().listIterator(0);
        while (v3xVarListIterator2.hasNext() && !a(((jmx) v3xVarListIterator2.next()).d)) {
        }
    }
}
