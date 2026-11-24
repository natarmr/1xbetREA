package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class otf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25827a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ String c;

    public /* synthetic */ otf(Set set, String str, byte b) {
        this.f25827a = b;
        this.b = set;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25827a;
        String str = this.c;
        Set set = this.b;
        switch (b) {
            case 0:
                set.add(str);
                break;
            case 1:
                set.add(str);
                break;
            default:
                set.add(str);
                break;
        }
        return Unit.f46060a;
    }
}
