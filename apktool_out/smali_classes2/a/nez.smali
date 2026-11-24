.class public final La/nez;
.super La/c4m0;
.source "SourceFile"


# instance fields
.field public final e:La/yje;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, La/a2;-><init>(Lkotlin/coroutines/CoroutineContext;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, La/pnx;->a(La/yje;La/yje;Lkotlin/jvm/functions/Function2;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/nez;->e:La/yje;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, La/nez;->e:La/yje;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 8
    .line 9
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-static {v0, v1}, La/ovk;->a(La/yje;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    instance-of v1, v0, La/mvk;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, La/mvk;

    .line 21
    .line 22
    iget-object v0, v0, La/mvk;->a:Ljava/lang/Throwable;

    .line 23
    .line 24
    :cond_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 25
    .line 26
    new-instance v1, La/g0g0;

    .line 27
    .line 28
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, La/a2;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method
