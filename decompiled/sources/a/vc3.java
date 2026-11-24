package a;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function2;
import org.xplatform.widget.impl.presentation.quickavailable.widget.MySectionsWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class vc3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc3(Context context, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = context;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Context context = this.j;
        switch (b) {
            case 0:
                return new vc3(context, yjeVar, (byte) 0);
            case 1:
                return new vc3(context, yjeVar, (byte) 1);
            default:
                return new vc3(context, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((vc3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double dA;
        byte b = this.i;
        Context context = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                try {
                    File cacheDir = context.getCacheDir();
                    cacheDir.getClass();
                    d0q d0qVar = new d0q(new f0q(cacheDir, FileWalkDirection.b, null, null, null, 0, 32, null));
                    while (d0qVar.hasNext()) {
                        ((File) d0qVar.next()).delete();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                try {
                    File cacheDir2 = context.getCacheDir();
                    cacheDir2.getClass();
                    b5q b5qVar = new b5q(pgi0.h(new f0q(cacheDir2, FileWalkDirection.f46066a, null, null, null, 0, 32, null), new sy2((byte) 19)));
                    long length = 0;
                    while (b5qVar.hasNext()) {
                        length += ((File) b5qVar.next()).length();
                    }
                    dA = ((double) si30.a((length / 1048576.0d) * 10.0d)) / 10.0d;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    dA = 0.0d;
                }
                return new Double(dA);
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                Intent intentPutExtra = new Intent(context.getApplicationContext(), (Class<?>) MySectionsWidget.class).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getApplicationContext(), (Class<?>) MySectionsWidget.class)));
                intentPutExtra.getClass();
                context.sendBroadcast(intentPutExtra);
                return Unit.f46060a;
        }
    }
}
