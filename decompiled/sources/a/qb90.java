package a;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class qb90 extends PrintDocumentAdapter {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28438a;
    public final ExecutorService b = Executors.newFixedThreadPool(1);
    public final String c;
    public final nr00 d;

    public qb90(Context context, String str, nr00 nr00Var) {
        this.f28438a = context;
        this.c = str;
        this.d = nr00Var;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        this.b.shutdown();
        super.onFinish();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        printAttributes.getClass();
        printAttributes2.getClass();
        cancellationSignal.getClass();
        layoutResultCallback.getClass();
        bundle.getClass();
        this.b.submit(new ob90(this, printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle));
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        pageRangeArr.getClass();
        parcelFileDescriptor.getClass();
        cancellationSignal.getClass();
        writeResultCallback.getClass();
        this.b.submit(new pb90(this, pageRangeArr, parcelFileDescriptor, cancellationSignal, writeResultCallback, this.f28438a));
    }
}
