package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ngd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23479a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final n0o0 f;
    public final n0o0 g;

    public ngd(List list, List list2, List list3, List list4, List list5) {
        this.f23479a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = maz.b(new Function0(this) { // from class: a.lgd
            public final /* synthetic */ ngd b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                int i = 0;
                ngd ngdVar = this.b;
                switch (b2) {
                    case 0:
                        List list6 = ngdVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            w3d.u(arrayList, (List) ((Function0) list6.get(i)).invoke());
                            i++;
                        }
                        ngdVar.d = iun.f15405a;
                        return arrayList;
                    default:
                        List list7 = ngdVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            w3d.u(arrayList2, (List) ((Function0) list7.get(i)).invoke());
                            i++;
                        }
                        ngdVar.e = iun.f15405a;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = maz.b(new Function0(this) { // from class: a.lgd
            public final /* synthetic */ ngd b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                int i = 0;
                ngd ngdVar = this.b;
                switch (b3) {
                    case 0:
                        List list6 = ngdVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            w3d.u(arrayList, (List) ((Function0) list6.get(i)).invoke());
                            i++;
                        }
                        ngdVar.d = iun.f15405a;
                        return arrayList;
                    default:
                        List list7 = ngdVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            w3d.u(arrayList2, (List) ((Function0) list7.get(i)).invoke());
                            i++;
                        }
                        ngdVar.e = iun.f15405a;
                        return arrayList2;
                }
            }
        });
    }
}
