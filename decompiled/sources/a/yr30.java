package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yr30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43103a;
    public final /* synthetic */ MemoryGameView b;
    public final /* synthetic */ int c;

    public /* synthetic */ yr30(MemoryGameView memoryGameView, int i, byte b) {
        this.f43103a = b;
        this.b = memoryGameView;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43103a;
        int i = this.c;
        MemoryGameView memoryGameView = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                int i2 = MemoryGameView.e;
                view.getClass();
                boolean z = ((gt30) view).b;
                if (!memoryGameView.d && !z) {
                    memoryGameView.c.invoke(Integer.valueOf(i));
                }
                break;
            default:
                int i3 = MemoryGameView.e;
                view.getClass();
                boolean z2 = ((gt30) view).b;
                if (!memoryGameView.d && !z2) {
                    memoryGameView.c.invoke(Integer.valueOf(i));
                }
                break;
        }
        return Unit.f46060a;
    }
}
