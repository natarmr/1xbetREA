.class public final La/rwj;
.super La/bko;
.source "SourceFile"


# static fields
.field public static final d:La/rwj;


# instance fields
.field public c:La/une;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/rwj;

    .line 2
    .line 3
    sget v3, La/xuo0;->c:I

    .line 4
    .line 5
    sget v4, La/xuo0;->d:I

    .line 6
    .line 7
    sget-wide v5, La/xuo0;->e:J

    .line 8
    .line 9
    sget-object v2, La/xuo0;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, La/lne;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/une;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, La/une;-><init>(Ljava/lang/String;IIJ)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, La/rwj;->c:La/une;

    .line 20
    .line 21
    sput-object v0, La/rwj;->d:La/rwj;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final q(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rwj;->c:La/une;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, La/une;->d(La/une;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final r(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rwj;->c:La/une;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-static {p0, p2, p1}, La/une;->d(La/une;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method

.method public final w(I)La/lne;
    .locals 1

    .line 1
    invoke-static {p1}, La/g7x;->x(I)V

    .line 2
    .line 3
    .line 4
    sget v0, La/xuo0;->c:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, La/lne;->w(I)La/lne;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final x()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, La/rwj;->c:La/une;

    .line 2
    .line 3
    return-object p0
.end method
