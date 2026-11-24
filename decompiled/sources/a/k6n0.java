package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k6n0 {
    public static final j6n0 Companion = new j6n0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x9m0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17779a;
    public final List b;

    public /* synthetic */ k6n0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f17779a = null;
        } else {
            this.f17779a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public k6n0(Long l, ArrayList arrayList) {
        this.f17779a = l;
        this.b = arrayList;
    }
}
