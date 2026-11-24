package okhttp3.internal.cache;

import a.axq;
import a.c99;
import a.e3j;
import a.emk0;
import a.hne;
import a.itt0;
import a.j78;
import a.jf4;
import a.khy;
import a.ngh;
import a.ohq;
import a.owq;
import a.s5k0;
import a.t99;
import a.tjo;
import a.x9x;
import a.y190;
import a.yae0;
import a.yzp;
import a.zae0;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.push.AttributionReporter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001l\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004pqroB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u00020\u00112\n\u0010!\u001a\u00060\u001cR\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\"2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010\u0013J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u0013J\r\u00103\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0013J\r\u00104\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0013J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000005¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010\u0013J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010\u0013J\u000f\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\b@\u00100J\u000f\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0013J\u000f\u0010B\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u00100J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bC\u0010>R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010LR*\u0010\f\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010 \"\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010DR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010DR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010DR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u0018\u0010U\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010Y\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u00000Wj\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u0000`X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010GR\u0016\u0010^\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010_R\"\u0010b\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010_\u001a\u0004\bc\u00100\"\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0016\u0010g\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010_R\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010NR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006s"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "La/yzp;", "fileSystem", "La/y190;", "directory", "", AttributionReporter.APP_VERSION, "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(La/yzp;La/y190;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "initialize", "()V", "rebuildJournal$okhttp", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "()Z", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "readJournal", "La/t99;", "newJournalWriter", "()La/t99;", "line", "readJournalLine", "(Ljava/lang/String;)V", "processJournal", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "validateKey", "La/y190;", "getDirectory", "()La/y190;", TokenNames.I, "getValueCount$okhttp", "()I", "La/yzp;", "getFileSystem$okhttp", "()La/yzp;", "value", "J", "getMaxSize", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "La/t99;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Companion", "Snapshot", "Editor", "Entry", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final y190 directory;
    private final yzp fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final y190 journalFile;
    private final y190 journalFileBackup;
    private final y190 journalFileTmp;
    private t99 journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Entry f46127a;
        public final boolean[] b;
        public boolean c;

        public Editor(Entry entry) {
            this.f46127a = entry;
            this.b = entry.e ? null : new boolean[DiskLruCache.this.getValueCount()];
        }

        public final void a() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.d(this.f46127a.g, this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.d(this.f46127a.g, this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            Entry entry = this.f46127a;
            if (Intrinsics.d(entry.g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.civilizedFileSystem) {
                    diskLruCache.completeEdit$okhttp(this, false);
                } else {
                    entry.f = true;
                }
            }
        }

        public final s5k0 d(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.d(this.f46127a.g, this)) {
                        return new j78();
                    }
                    if (!this.f46127a.e) {
                        boolean[] zArr = this.b;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    y190 y190Var = (y190) this.f46127a.d.get(i);
                    try {
                        yzp fileSystem = diskLruCache.getFileSystem();
                        fileSystem.getClass();
                        y190Var.getClass();
                        return new FaultHidingSink(fileSystem.x(y190Var, false), new ngh(diskLruCache, this, (byte) 17));
                    } catch (FileNotFoundException unused) {
                        return new j78();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46128a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public long i;
        public final /* synthetic */ DiskLruCache j;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.j = diskLruCache;
            this.f46128a = str;
            this.b = new long[diskLruCache.getValueCount()];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sb.append(i);
                this.c.add(this.j.getDirectory().e(sb.toString()));
                sb.append(".tmp");
                this.d.add(this.j.getDirectory().e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot a() {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            if (!this.e) {
                return null;
            }
            final DiskLruCache diskLruCache = this.j;
            if (!diskLruCache.civilizedFileSystem && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            try {
                int valueCount = diskLruCache.getValueCount();
                for (int i = 0; i < valueCount; i++) {
                    final emk0 emk0VarY = diskLruCache.getFileSystem().y((y190) this.c.get(i));
                    if (!diskLruCache.civilizedFileSystem) {
                        this.h++;
                        emk0VarY = new owq(emk0VarY) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                            public boolean b;

                            @Override // a.owq, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                super.close();
                                if (this.b) {
                                    return;
                                }
                                this.b = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    int i2 = entry.h - 1;
                                    entry.h = i2;
                                    if (i2 == 0 && entry.f) {
                                        diskLruCache2.removeEntry$okhttp(entry);
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(emk0VarY);
                }
                return new Snapshot(diskLruCache, this.f46128a, this.i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    _UtilCommonKt.b((emk0) it.next());
                }
                try {
                    diskLruCache.removeEntry$okhttp(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Snapshot implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46129a;
        public final ArrayList b;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, ArrayList arrayList, long[] jArr) {
            str.getClass();
            jArr.getClass();
            this.f46129a = str;
            this.b = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.b((emk0) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Snapshot>, khy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f46130a;
        public Snapshot b;
        public Snapshot c;

        public AnonymousClass1() {
            Iterator it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            it.getClass();
            this.f46130a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Snapshot snapshotA;
            if (this.b != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed()) {
                    return false;
                }
                while (this.f46130a.hasNext()) {
                    Entry entry = (Entry) this.f46130a.next();
                    if (entry != null && (snapshotA = entry.a()) != null) {
                        this.b = snapshotA;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public final Snapshot next() {
            if (!hasNext()) {
                itt0.a();
                return null;
            }
            Snapshot snapshot = this.b;
            this.c = snapshot;
            this.b = null;
            snapshot.getClass();
            return snapshot;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Snapshot snapshot = this.c;
            if (snapshot == null) {
                jf4.n("remove() before next()");
                return;
            }
            try {
                DiskLruCache.this.remove(snapshot.f46129a);
            } catch (IOException unused) {
            } finally {
                this.c = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(yzp yzpVar, y190 y190Var, int i, int i2, long j, TaskRunner taskRunner) {
        yzpVar.getClass();
        y190Var.getClass();
        taskRunner.getClass();
        this.directory = y190Var;
        this.appVersion = i;
        this.valueCount = i2;
        this.fileSystem = new DiskLruCache$fileSystem$1(yzpVar);
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String strN = axq.n(new StringBuilder(), _UtilJvmKt.b, " Cache");
        this.cleanupTask = new Task(strN) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                DiskLruCache diskLruCache = this.e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        t99 t99Var = diskLruCache.journalWriter;
                        if (t99Var != null) {
                            _UtilCommonKt.b(t99Var);
                        }
                        diskLruCache.journalWriter = new yae0(new j78());
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            jf4.o("maxSize <= 0");
            throw null;
        }
        if (i2 <= 0) {
            jf4.o("valueCount <= 0");
            throw null;
        }
        this.journalFile = y190Var.e(JOURNAL_FILE);
        this.journalFileTmp = y190Var.e(JOURNAL_FILE_TEMP);
        this.journalFileBackup = y190Var.e(JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final t99 newJournalWriter() {
        yzp yzpVar = this.fileSystem;
        y190 y190Var = this.journalFile;
        yzpVar.getClass();
        y190Var.getClass();
        return new yae0(new FaultHidingSink(yzpVar.a(y190Var), new e3j(this, (byte) 20)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newJournalWriter$lambda$0(DiskLruCache diskLruCache, IOException iOException) {
        iOException.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        diskLruCache.hasJournalErrors = true;
        return Unit.f46060a;
    }

    private final void processJournal() {
        _UtilCommonKt.d(this.fileSystem, this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            int i = 0;
            if (entry.g == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.b[i];
                    i++;
                }
            } else {
                entry.g = null;
                int i3 = this.valueCount;
                while (i < i3) {
                    _UtilCommonKt.d(this.fileSystem, (y190) entry.c.get(i));
                    _UtilCommonKt.d(this.fileSystem, (y190) entry.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    private final void readJournal() throws Throwable {
        zae0 zae0VarD = x9x.D(this.fileSystem.y(this.journalFile));
        try {
            String strA = zae0VarD.A(Long.MAX_VALUE);
            String strA2 = zae0VarD.A(Long.MAX_VALUE);
            String strA3 = zae0VarD.A(Long.MAX_VALUE);
            String strA4 = zae0VarD.A(Long.MAX_VALUE);
            String strA5 = zae0VarD.A(Long.MAX_VALUE);
            if (!Intrinsics.d(MAGIC, strA) || !Intrinsics.d(VERSION_1, strA2) || !Intrinsics.d(String.valueOf(this.appVersion), strA3) || !Intrinsics.d(String.valueOf(this.valueCount), strA4) || strA5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(zae0VarD.A(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (zae0VarD.v0()) {
                        t99 t99Var = this.journalWriter;
                        if (t99Var != null) {
                            _UtilCommonKt.b(t99Var);
                        }
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    try {
                        zae0VarD.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                zae0VarD.close();
            } catch (Throwable th3) {
                tjo.a(th, th3);
            }
            if (th == null) {
                throw th;
            }
        }
    }

    private final void readJournalLine(String line) throws IOException {
        String strSubstring;
        int iU = StringsKt.U(' ', 0, 6, line);
        if (iU == -1) {
            ohq.l("unexpected journal line: ".concat(line));
            return;
        }
        int i = iU + 1;
        int iU2 = StringsKt.U(' ', i, 4, line);
        if (iU2 == -1) {
            strSubstring = line.substring(i);
            String str = REMOVE;
            if (iU == str.length() && c.x(line, str, false)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i, iU2);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iU2 != -1) {
            String str2 = CLEAN;
            if (iU == str2.length() && c.x(line, str2, false)) {
                List listI0 = StringsKt.i0(line.substring(iU2 + 1), new char[]{' '}, 6);
                entry.e = true;
                entry.g = null;
                listI0.getClass();
                if (listI0.size() != entry.j.getValueCount()) {
                    itt0.j(listI0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size = listI0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        entry.b[i2] = Long.parseLong((String) listI0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    itt0.j(listI0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iU2 == -1) {
            String str3 = DIRTY;
            if (iU == str3.length() && c.x(line, str3, false)) {
                entry.g = new Editor(entry);
                return;
            }
        }
        if (iU2 == -1) {
            String str4 = READ;
            if (iU == str4.length() && c.x(line, str4, false)) {
                return;
            }
        }
        ohq.l("unexpected journal line: ".concat(line));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            entry.getClass();
            Entry entry2 = entry;
            if (!entry2.f) {
                removeEntry$okhttp(entry2);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String key) {
        if (LEGAL_KEY_PATTERN.g(key)) {
            return;
        }
        c99.s(hne.l('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", key));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                collectionValues.getClass();
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    entry.getClass();
                    Editor editor = entry.g;
                    if (editor != null && editor != null) {
                        editor.c();
                    }
                }
                trimToSize();
                t99 t99Var = this.journalWriter;
                if (t99Var != null) {
                    _UtilCommonKt.b(t99Var);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean success) {
        editor.getClass();
        Entry entry = editor.f46127a;
        if (!Intrinsics.d(entry.g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.e) {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArr = editor.b;
                zArr.getClass();
                if (!zArr[i2]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.fileSystem.n((y190) entry.d.get(i2))) {
                    editor.a();
                    return;
                }
            }
        }
        int i3 = this.valueCount;
        for (int i4 = 0; i4 < i3; i4++) {
            y190 y190Var = (y190) entry.d.get(i4);
            if (!success || entry.f) {
                _UtilCommonKt.d(this.fileSystem, y190Var);
            } else if (this.fileSystem.n(y190Var)) {
                y190 y190Var2 = (y190) entry.c.get(i4);
                this.fileSystem.c(y190Var, y190Var2);
                long j = entry.b[i4];
                Long l = (Long) this.fileSystem.r(y190Var2).e;
                long jLongValue = l != null ? l.longValue() : 0L;
                entry.b[i4] = jLongValue;
                this.size = (this.size - j) + jLongValue;
            }
        }
        entry.g = null;
        if (entry.f) {
            removeEntry$okhttp(entry);
            return;
        }
        this.redundantOpCount++;
        t99 t99Var = this.journalWriter;
        t99Var.getClass();
        if (entry.e || success) {
            entry.e = true;
            t99Var.D(CLEAN).writeByte(32);
            t99Var.D(entry.f46128a);
            for (long j2 : entry.b) {
                t99Var.writeByte(32).i0(j2);
            }
            t99Var.writeByte(10);
            if (success) {
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry.i = j3;
            }
        } else {
            this.lruEntries.remove(entry.f46128a);
            t99Var.D(REMOVE).writeByte(32);
            t99Var.D(entry.f46128a);
            t99Var.writeByte(10);
        }
        t99Var.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.cleanupQueue.d(this.cleanupTask, 0L);
        }
    }

    public final void delete() {
        close();
        _UtilCommonKt.c(this.fileSystem, this.directory);
    }

    public final synchronized Editor edit(String key, long expectedSequenceNumber) {
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.i != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.g : null) != null) {
            return null;
        }
        if (entry != null && entry.h != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            t99 t99Var = this.journalWriter;
            t99Var.getClass();
            t99Var.D(DIRTY).writeByte(32).D(key).writeByte(10);
            t99Var.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(entry);
            entry.g = editor;
            return editor;
        }
        this.cleanupQueue.d(this.cleanupTask, 0L);
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            collectionValues.getClass();
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                entry.getClass();
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            t99 t99Var = this.journalWriter;
            t99Var.getClass();
            t99Var.flush();
        }
    }

    public final synchronized Snapshot get(String key) {
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotA = entry.a();
        if (snapshotA == null) {
            return null;
        }
        this.redundantOpCount++;
        t99 t99Var = this.journalWriter;
        t99Var.getClass();
        t99Var.D(READ).writeByte(32).D(key).writeByte(10);
        if (journalRebuildRequired()) {
            this.cleanupQueue.d(this.cleanupTask, 0L);
        }
        return snapshotA;
    }

    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final y190 getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: getFileSystem$okhttp, reason: from getter */
    public final yzp getFileSystem() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #2 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x0068, B:40:0x0074, B:50:0x00b0, B:44:0x007f, B:46:0x00a9, B:48:0x00ad, B:49:0x00af, B:37:0x0064, B:53:0x00b7, B:28:0x0053, B:25:0x004e, B:45:0x00a6, B:19:0x0041), top: B:59:0x0003, inners: #0, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #2 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x0068, B:40:0x0074, B:50:0x00b0, B:44:0x007f, B:46:0x00a9, B:48:0x00ad, B:49:0x00af, B:37:0x0064, B:53:0x00b7, B:28:0x0053, B:25:0x004e, B:45:0x00a6, B:19:0x0041), top: B:59:0x0003, inners: #0, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void initialize() {
        boolean z;
        try {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.n(this.journalFileBackup)) {
                boolean zN = this.fileSystem.n(this.journalFile);
                yzp yzpVar = this.fileSystem;
                y190 y190Var = this.journalFileBackup;
                if (zN) {
                    yzpVar.l(y190Var);
                } else {
                    yzpVar.c(y190Var, this.journalFile);
                }
            }
            yzp yzpVar2 = this.fileSystem;
            y190 y190Var2 = this.journalFileBackup;
            byte[] bArr = _UtilCommonKt.f46121a;
            yzpVar2.getClass();
            y190Var2.getClass();
            s5k0 s5k0VarX = yzpVar2.x(y190Var2, false);
            try {
                yzpVar2.k(y190Var2);
                if (s5k0VarX != null) {
                    try {
                        s5k0VarX.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (s5k0VarX != null) {
                    try {
                        s5k0VarX.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        yzpVar2.k(y190Var2);
                        z = false;
                        this.civilizedFileSystem = z;
                        if (this.fileSystem.n(this.journalFile)) {
                            try {
                                readJournal();
                                processJournal();
                                this.initialized = true;
                                return;
                            } catch (IOException e) {
                                Platform platform = Platform.f46208a;
                                Platform.f46208a.k(5, "DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", e);
                                try {
                                    delete();
                                    this.closed = false;
                                    rebuildJournal$okhttp();
                                    this.initialized = true;
                                } catch (Throwable th2) {
                                    this.closed = false;
                                    throw th2;
                                }
                            }
                        }
                        rebuildJournal$okhttp();
                        this.initialized = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                yzpVar2.k(y190Var2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (s5k0VarX != null) {
                    try {
                        s5k0VarX.close();
                    } catch (Throwable th4) {
                        tjo.a(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                yzpVar2.k(y190Var2);
                z = false;
                this.civilizedFileSystem = z;
                if (this.fileSystem.n(this.journalFile)) {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                }
                rebuildJournal$okhttp();
                this.initialized = true;
            }
            this.civilizedFileSystem = z;
            if (this.fileSystem.n(this.journalFile)) {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        Throwable th;
        try {
            t99 t99Var = this.journalWriter;
            if (t99Var != null) {
                t99Var.close();
            }
            yae0 yae0VarC = x9x.C(this.fileSystem.x(this.journalFileTmp, false));
            try {
                yae0VarC.D(MAGIC);
                yae0VarC.writeByte(10);
                yae0VarC.D(VERSION_1);
                yae0VarC.writeByte(10);
                yae0VarC.i0(this.appVersion);
                yae0VarC.writeByte(10);
                yae0VarC.i0(this.valueCount);
                yae0VarC.writeByte(10);
                yae0VarC.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    entry.getClass();
                    Entry entry2 = entry;
                    if (entry2.g != null) {
                        yae0VarC.D(DIRTY);
                        yae0VarC.writeByte(32);
                        yae0VarC.D(entry2.f46128a);
                        yae0VarC.writeByte(10);
                    } else {
                        yae0VarC.D(CLEAN);
                        yae0VarC.writeByte(32);
                        yae0VarC.D(entry2.f46128a);
                        for (long j : entry2.b) {
                            yae0VarC.writeByte(32);
                            yae0VarC.i0(j);
                        }
                        yae0VarC.writeByte(10);
                    }
                }
                try {
                    yae0VarC.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    yae0VarC.close();
                } catch (Throwable th4) {
                    tjo.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zN = this.fileSystem.n(this.journalFile);
            yzp yzpVar = this.fileSystem;
            if (zN) {
                yzpVar.c(this.journalFile, this.journalFileBackup);
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
                _UtilCommonKt.d(this.fileSystem, this.journalFileBackup);
            } else {
                yzpVar.c(this.journalFileTmp, this.journalFile);
            }
            t99 t99Var2 = this.journalWriter;
            if (t99Var2 != null) {
                _UtilCommonKt.b(t99Var2);
            }
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean remove(String key) {
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        t99 t99Var;
        entry.getClass();
        String str = entry.f46128a;
        if (!this.civilizedFileSystem) {
            if (entry.h > 0 && (t99Var = this.journalWriter) != null) {
                t99Var.D(DIRTY);
                t99Var.writeByte(32);
                t99Var.D(str);
                t99Var.writeByte(10);
                t99Var.flush();
            }
            if (entry.h > 0 || entry.g != null) {
                entry.f = true;
                return true;
            }
        }
        Editor editor = entry.g;
        if (editor != null) {
            editor.c();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            _UtilCommonKt.d(this.fileSystem, (y190) entry.c.get(i2));
            long j = this.size;
            long[] jArr = entry.b;
            this.size = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.redundantOpCount++;
        t99 t99Var2 = this.journalWriter;
        if (t99Var2 != null) {
            t99Var2.D(REMOVE);
            t99Var2.writeByte(32);
            t99Var2.D(str);
            t99Var2.writeByte(10);
        }
        this.lruEntries.remove(str);
        if (journalRebuildRequired()) {
            this.cleanupQueue.d(this.cleanupTask, 0L);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.cleanupQueue.d(this.cleanupTask, 0L);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final Editor edit(String str) {
        str.getClass();
        return edit$default(this, str, 0L, 2, null);
    }
}
