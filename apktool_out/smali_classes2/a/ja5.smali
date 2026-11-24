.class public final La/ja5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:[La/jzj;

.field private volatile synthetic notCompletedCount$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, La/ja5;

    .line 2
    .line 3
    const-string v1, "notCompletedCount$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, La/ja5;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>([La/jzj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ja5;->a:[La/jzj;

    .line 5
    .line 6
    array-length p1, p1

    .line 7
    iput p1, p0, La/ja5;->notCompletedCount$volatile:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, La/n5a;

    .line 2
    .line 3
    invoke-static {p1}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, La/n5a;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/n5a;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/ja5;->a:[La/jzj;

    .line 15
    .line 16
    array-length v2, p1

    .line 17
    new-array v3, v2, [La/ha5;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v5, v2, :cond_0

    .line 22
    .line 23
    aget-object v6, p1, v5

    .line 24
    .line 25
    invoke-interface {v6}, La/bby;->start()Z

    .line 26
    .line 27
    .line 28
    new-instance v7, La/ha5;

    .line 29
    .line 30
    invoke-direct {v7, p0, v0}, La/ha5;-><init>(La/ja5;La/n5a;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v6, v1, v7}, La/zvw;->W(La/bby;ZLa/eby;)La/nwk;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iput-object v6, v7, La/ha5;->f:La/nwk;

    .line 38
    .line 39
    aput-object v7, v3, v5

    .line 40
    .line 41
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, La/ia5;

    .line 45
    .line 46
    invoke-direct {p0, v3}, La/ia5;-><init>([La/ha5;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    if-ge v4, v2, :cond_1

    .line 50
    .line 51
    aget-object p1, v3, v4

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 57
    .line 58
    sget-wide v5, La/ha5;->h:J

    .line 59
    .line 60
    invoke-virtual {v1, p1, v5, v6, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v0}, La/n5a;->x()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, La/ia5;->a()V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-virtual {v0, p0}, La/n5a;->u(La/j660;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    sget-object p1, La/wne;->a:La/wne;

    .line 84
    .line 85
    return-object p0
.end method
