package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iew0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mew0 f14658a;
    public mew0 b;

    public iew0(mew0 mew0Var) {
        this.f14658a = mew0Var;
        if (mew0Var.e()) {
            jf4.o("Default instance must be immutable.");
            throw null;
        }
        this.b = mew0Var.g();
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        String strP = vqd.p(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strP);
            }
            list.remove(size2);
        }
    }

    public static void b(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof bfw0) {
            List listZza = ((bfw0) iterable).zza();
            if (list != null) {
                hny.b();
                return;
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof qdw0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                qdw0.k(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof zfw0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof bgw0) {
                bgw0 bgw0Var = (bgw0) list;
                int i = bgw0Var.c + size;
                int length = bgw0Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = ohs0.d(length, 3, 2, 1, 10);
                        }
                        bgw0Var.b = Arrays.copyOf(bgw0Var.b, length);
                    } else {
                        bgw0Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final void c() {
        if (this.b.e()) {
            return;
        }
        mew0 mew0VarG = this.f14658a.g();
        agw0.c.a(mew0VarG.getClass()).g(mew0VarG, this.b);
        this.b = mew0VarG;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final iew0 clone() {
        iew0 iew0Var = (iew0) this.f14658a.q(5);
        boolean zE = this.b.e();
        mew0 mew0Var = this.b;
        if (zE) {
            mew0Var.getClass();
            agw0.c.a(mew0Var.getClass()).h(mew0Var);
            mew0Var.f();
            mew0Var = this.b;
        }
        iew0Var.b = mew0Var;
        return iew0Var;
    }

    public final mew0 e() {
        boolean zE = this.b.e();
        mew0 mew0Var = this.b;
        if (zE) {
            mew0Var.getClass();
            agw0.c.a(mew0Var.getClass()).h(mew0Var);
            mew0Var.f();
            mew0Var = this.b;
        }
        mew0Var.getClass();
        if (mew0.o(mew0Var, true)) {
            return mew0Var;
        }
        throw new igw0();
    }

    public final void f(mew0 mew0Var) {
        mew0 mew0Var2 = this.f14658a;
        if (mew0Var2.equals(mew0Var)) {
            return;
        }
        if (!this.b.e()) {
            mew0 mew0VarG = mew0Var2.g();
            agw0.c.a(mew0VarG.getClass()).g(mew0VarG, this.b);
            this.b = mew0VarG;
        }
        mew0 mew0Var3 = this.b;
        agw0.c.a(mew0Var3.getClass()).g(mew0Var3, mew0Var);
    }

    public final void g(byte[] bArr, int i, bew0 bew0Var) throws zew0 {
        if (!this.b.e()) {
            mew0 mew0VarG = this.f14658a.g();
            agw0.c.a(mew0VarG.getClass()).g(mew0VarG, this.b);
            this.b = mew0VarG;
        }
        try {
            agw0.c.a(this.b.getClass()).b(this.b, bArr, 0, i, new mdw0(bew0Var));
        } catch (zew0 e) {
            throw e;
        } catch (IOException e2) {
            e9d0.m("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
