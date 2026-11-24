package okhttp3.tls.internal.der;

import a.dw9;
import a.f99;
import a.g8x;
import a.q3d;
import a.t99;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/DerWriter;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DerWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46260a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public DerWriter(f99 f99Var) {
        this.f46260a = q3d.l(f99Var);
    }

    public final t99 a() {
        return (t99) dw9.l(1, this.f46260a);
    }

    public final void b(String str, int i, long j, Function1 function1) {
        str.getClass();
        f99 f99Var = new f99();
        ArrayList arrayList = this.f46260a;
        arrayList.add(f99Var);
        this.d = false;
        ArrayList arrayList2 = this.c;
        arrayList2.add(str);
        try {
            function1.invoke(f99Var);
            int i2 = this.d ? 32 : 0;
            this.d = true;
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            t99 t99VarA = a();
            if (j < 31) {
                t99VarA.writeByte(i | i2 | ((int) j));
            } else {
                t99VarA.writeByte(i | i2 | 31);
                c(j);
            }
            long j2 = f99Var.b;
            if (j2 >= 128) {
                int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(j2)) / 8;
                t99VarA.writeByte(iNumberOfLeadingZeros | 128);
                int i3 = (iNumberOfLeadingZeros - 1) * 8;
                int iJ = g8x.J(i3, 0, -8);
                if (iJ <= i3) {
                    while (true) {
                        t99VarA.writeByte((int) (j2 >> i3));
                        if (i3 == iJ) {
                            break;
                        } else {
                            i3 -= 8;
                        }
                    }
                }
            } else {
                t99VarA.writeByte((int) j2);
            }
            t99VarA.P(f99Var);
        } catch (Throwable th) {
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            throw th;
        }
    }

    public final void c(long j) {
        t99 t99VarA = a();
        int iNumberOfLeadingZeros = (((70 - Long.numberOfLeadingZeros(j)) / 7) - 1) * 7;
        int iJ = g8x.J(iNumberOfLeadingZeros, 0, -7);
        if (iJ > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            t99VarA.writeByte((iNumberOfLeadingZeros == 0 ? 0 : 128) | ((int) ((j >> iNumberOfLeadingZeros) & 127)));
            if (iNumberOfLeadingZeros == iJ) {
                return;
            } else {
                iNumberOfLeadingZeros -= 7;
            }
        }
    }

    public final String toString() {
        return CollectionsKt.b0(this.c, " / ", null, null, null, 62);
    }
}
