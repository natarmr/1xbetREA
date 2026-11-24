.class public final La/ha5;
.super La/eby;
.source "SourceFile"


# static fields
.field public static final synthetic h:J


# instance fields
.field private volatile synthetic _disposer$volatile:Ljava/lang/Object;

.field public final e:La/n5a;

.field public f:La/nwk;

.field public final synthetic g:La/ja5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, La/ha5;

    .line 4
    .line 5
    const-string v2, "_disposer$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, La/ha5;->h:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/ja5;La/n5a;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ha5;->g:La/ja5;

    .line 2
    .line 3
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La/ha5;->e:La/n5a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/ha5;->e:La/n5a;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v2, La/udd;

    .line 7
    .line 8
    invoke-direct {v2, p1, v0}, La/udd;-><init>(Ljava/lang/Throwable;Z)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v1, v2, p1}, La/n5a;->F(Ljava/lang/Object;La/xdr;)La/pfw;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1, p1}, La/n5a;->w(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La;->a:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v0, La/ha5;->h:J

    .line 24
    .line 25
    invoke-virtual {p1, p0, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/ia5;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, La/ia5;->a()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    sget-object p1, La/ja5;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 38
    .line 39
    iget-object p0, p0, La/ha5;->g:La/ja5;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    iget-object p0, p0, La/ja5;->a:[La/jzj;

    .line 48
    .line 49
    new-instance p1, Ljava/util/ArrayList;

    .line 50
    .line 51
    array-length v2, p0

    .line 52
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    array-length v2, p0

    .line 56
    :goto_0
    if-ge v0, v2, :cond_1

    .line 57
    .line 58
    aget-object v3, p0, v0

    .line 59
    .line 60
    invoke-interface {v3}, La/jzj;->getCompleted()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 71
    .line 72
    invoke-virtual {v1, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method
