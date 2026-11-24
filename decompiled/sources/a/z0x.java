package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class z0x extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43590a;
    public final /* synthetic */ dgu b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0x(dgu dguVar, List list, byte b) {
        super(0);
        this.f43590a = b;
        this.b = dguVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43590a;
        List list = this.c;
        dgu dguVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return new qb00(dguVar, list);
    }
}
