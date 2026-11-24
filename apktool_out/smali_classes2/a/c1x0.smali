.class public final La/c1x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Ljava/lang/Object;

.field public static final k:Ljava/util/concurrent/atomic/AtomicReference;

.field public static volatile l:La/c1x0;

.field public static final m:La/lin0;


# instance fields
.field public final a:La/cmt0;

.field public final b:Landroid/content/Context;

.field public final c:La/lin0;

.field public final d:La/lin0;

.field public final e:La/lin0;

.field public final f:La/lin0;

.field public final g:La/i8x0;

.field public final h:La/lin0;

.field public final i:La/l7x0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/c1x0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/c1x0;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, La/c1x0;->l:La/c1x0;

    .line 17
    .line 18
    sget-object v0, La/l1x0;->a:La/l1x0;

    .line 19
    .line 20
    invoke-static {v0}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, La/c1x0;->m:La/lin0;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/lin0;La/lin0;La/lin0;La/lin0;La/lin0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/cmt0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, La/cmt0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, v0, La/cmt0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, La/cmt0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v0, p0, La/c1x0;->a:La/cmt0;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p3}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    new-instance v0, La/n1x0;

    .line 74
    .line 75
    invoke-direct {v0, p4, v2}, La/n1x0;-><init>(La/lin0;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-static {p5}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    invoke-static {p6}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 87
    .line 88
    .line 89
    move-result-object p6

    .line 90
    iput-object p1, p0, La/c1x0;->b:Landroid/content/Context;

    .line 91
    .line 92
    iput-object p2, p0, La/c1x0;->c:La/lin0;

    .line 93
    .line 94
    iput-object p3, p0, La/c1x0;->d:La/lin0;

    .line 95
    .line 96
    iput-object p4, p0, La/c1x0;->e:La/lin0;

    .line 97
    .line 98
    iput-object p5, p0, La/c1x0;->f:La/lin0;

    .line 99
    .line 100
    new-instance v0, La/i8x0;

    .line 101
    .line 102
    invoke-direct {v0, p1, p2, p5, p3}, La/i8x0;-><init>(Landroid/content/Context;La/lin0;La/lin0;La/lin0;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, La/c1x0;->g:La/i8x0;

    .line 106
    .line 107
    iput-object p6, p0, La/c1x0;->h:La/lin0;

    .line 108
    .line 109
    new-instance p5, La/l7x0;

    .line 110
    .line 111
    invoke-direct {p5, p1, p2, p4, p3}, La/l7x0;-><init>(Landroid/content/Context;La/lin0;La/lin0;La/lin0;)V

    .line 112
    .line 113
    .line 114
    iput-object p5, p0, La/c1x0;->i:La/l7x0;

    .line 115
    .line 116
    return-void
.end method

.method public static b()V
    .locals 2

    .line 1
    sget-object v0, La/vbw0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    sget-object v0, La/c1x0;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, La/vbw0;->h:La/c44;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, La/c44;

    .line 18
    .line 19
    const/16 v1, 0x13

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/c44;-><init>(B)V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/vbw0;->h:La/c44;

    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw v1
.end method


# virtual methods
.method public final a()La/fr40;
    .locals 0

    .line 1
    iget-object p0, p0, La/c1x0;->c:La/lin0;

    .line 2
    .line 3
    invoke-interface {p0}, La/lin0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fr40;

    .line 8
    .line 9
    return-object p0
.end method
