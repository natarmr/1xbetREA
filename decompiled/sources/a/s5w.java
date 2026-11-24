package a;

import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class s5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigableMap f31675a = new TreeMap().descendingMap();
    public GeneralBetInfoModel b;
    public boolean c;
    public final Object d;
    public p8w e;

    public s5w() {
        Parcelable.Creator<GeneralBetInfoModel> creator = GeneralBetInfoModel.CREATOR;
        this.b = GeneralBetInfoModel.h;
        this.d = new Object();
    }

    public final void a() {
        p8w p8wVar = this.e;
        if (p8wVar != null) {
            Collection collectionValues = this.f31675a.values();
            collectionValues.getClass();
            p8wVar.invoke(CollectionsKt.L0(collectionValues));
        }
    }

    public final void b(String str) {
        Object next;
        str.getClass();
        synchronized (this.d) {
            try {
                Collection collectionValues = this.f31675a.values();
                collectionValues.getClass();
                Iterator it = collectionValues.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((n3w) next).f22868a, str));
                n3w n3wVar = (n3w) next;
                if (n3wVar != null) {
                    this.f31675a.remove(n3wVar.f());
                    c(n3wVar);
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(n3w n3wVar) {
        if (Intrinsics.d(this.b, GeneralBetInfoModel.h)) {
            return;
        }
        double d = n3wVar.n1;
        if (d <= 0.0d) {
            d = n3wVar.o;
        }
        GeneralBetInfoModel generalBetInfoModel = this.b;
        int i = generalBetInfoModel.f46409a - 1;
        double d2 = generalBetInfoModel.d - d;
        String str = generalBetInfoModel.b;
        String str2 = generalBetInfoModel.c;
        double d3 = generalBetInfoModel.e;
        double d4 = generalBetInfoModel.f;
        String str3 = generalBetInfoModel.g;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.b = new GeneralBetInfoModel(i, str, str2, d2, d3, d4, str3);
    }
}
