package com.huawei.hms.common.sqlite;

import a.jf4;
import a.ohq;
import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractWindowedCursor f45805a;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor == null) {
            jf4.o("cursor cannot be null");
            throw null;
        }
        if (!(cursor instanceof CursorWrapper)) {
            ohq.q(cursor, " is not a subclass for CursorWrapper", "cursor:");
            throw null;
        }
        Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
        if (wrappedCursor == null) {
            jf4.o("getWrappedCursor cannot be null");
            throw null;
        }
        if (wrappedCursor instanceof AbstractWindowedCursor) {
            this.f45805a = (AbstractWindowedCursor) wrappedCursor;
        } else {
            ohq.q(wrappedCursor, " is not a subclass for CursorWrapper", "getWrappedCursor:");
            throw null;
        }
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f45805a.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f45805a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f45805a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return this.f45805a.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.f45805a.setWindow(cursorWindow);
    }
}
