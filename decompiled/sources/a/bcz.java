package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bcz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2376a;
    public final /* synthetic */ dcz b;

    public /* synthetic */ bcz(dcz dczVar, byte b) {
        this.f2376a = b;
        this.b = dczVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2376a;
        dcz dczVar = this.b;
        switch (b) {
            case 0:
                hbz hbzVar = (hbz) dczVar.o.invoke();
                int iB = hbzVar.b();
                int i = 0;
                while (i < iB) {
                    if (hbzVar.d(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                hbz hbzVar2 = (hbz) dczVar.o.invoke();
                if (iIntValue < 0 || iIntValue >= hbzVar2.b()) {
                    adx.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + hbzVar2.b() + Separators.RPAREN);
                }
                qjj.W(dczVar.N0(), null, null, new u52((Object) dczVar, iIntValue, (yje) null, (byte) 13), 3);
                return Boolean.TRUE;
        }
    }
}
