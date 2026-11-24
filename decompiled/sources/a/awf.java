package a;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class awf extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1571a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awf(lhn0 lhn0Var) {
        super(new Handler());
        this.b = lhn0Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1571a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.f1571a) {
            case 0:
                lhn0 lhn0Var = (lhn0) this.b;
                if (lhn0Var.b && (cursor = lhn0Var.c) != null && !cursor.isClosed()) {
                    lhn0Var.f5078a = lhn0Var.c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awf(q99 q99Var, Handler handler) {
        super(handler);
        this.b = q99Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f1571a) {
            case 1:
                ((q99) this.b).f(Unit.f46060a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
