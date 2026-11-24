package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h83 implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f12607a;
    public final ArrayList b;
    public final ArrayList c;

    public h83(int i) {
        this.f12607a = new StringBuilder(i);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(smk0 smk0Var, int i, int i2) {
        this.c.add(new g83(smk0Var, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof j83;
        StringBuilder sb = this.f12607a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        j83 j83Var = (j83) charSequence;
        int length = sb.length();
        sb.append((CharSequence) j83Var.b, i, i2);
        List listA = k83.a(j83Var, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                i83 i83Var = (i83) listA.get(i3);
                this.c.add(new g83(i83Var.b + length, i83Var.c + length, i83Var.f14321a, i83Var.d));
            }
        }
        return this;
    }

    public final void b(j83 j83Var) {
        StringBuilder sb = this.f12607a;
        int length = sb.length();
        sb.append(j83Var.b);
        List list = j83Var.f16067a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                i83 i83Var = (i83) list.get(i);
                this.c.add(new g83(i83Var.b + length, i83Var.c + length, i83Var.f14321a, i83Var.d));
            }
        }
    }

    public final void c(String str) {
        this.f12607a.append(str);
    }

    public final void d(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ycx.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                ycx.b("Nothing to pop.");
            }
            ((g83) hne.k(1, arrayList)).c = this.f12607a.length();
        }
    }

    public final int e(jb00 jb00Var) {
        g83 g83Var = new g83(jb00Var, this.f12607a.length(), 0, 12);
        ArrayList arrayList = this.b;
        arrayList.add(g83Var);
        this.c.add(g83Var);
        return arrayList.size() - 1;
    }

    public final int f(eo80 eo80Var) {
        g83 g83Var = new g83(eo80Var, this.f12607a.length(), 0, 12);
        ArrayList arrayList = this.b;
        arrayList.add(g83Var);
        this.c.add(g83Var);
        return arrayList.size() - 1;
    }

    public final int g(smk0 smk0Var) {
        g83 g83Var = new g83(smk0Var, this.f12607a.length(), 0, 12);
        ArrayList arrayList = this.b;
        arrayList.add(g83Var);
        this.c.add(g83Var);
        return arrayList.size() - 1;
    }

    public final j83 h() {
        StringBuilder sb = this.f12607a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((g83) arrayList.get(i)).a(sb.length()));
        }
        return new j83(string, arrayList2);
    }

    public /* synthetic */ h83() {
        this(16);
    }

    public h83(j83 j83Var) {
        this();
        b(j83Var);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof j83) {
            b((j83) charSequence);
            return this;
        }
        this.f12607a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f12607a.append(c);
        return this;
    }
}
