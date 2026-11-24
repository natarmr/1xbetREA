.class public final La/z560;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements La/bby;


# static fields
.field public static final b:La/z560;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/z560;

    .line 2
    .line 3
    sget-object v1, La/gqw0;->o1:La/gqw0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/f;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/z560;->b:La/z560;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final attachChild(La/jac;)La/fac;
    .locals 0

    .line 1
    sget-object p0, La/a660;->a:La/a660;

    .line 2
    .line 3
    return-object p0
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final getChildren()Lkotlin/sequences/Sequence;
    .locals 0

    .line 1
    sget-object p0, La/wun;->a:La/wun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnJoin()La/h1i0;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;
    .locals 0

    .line 1
    sget-object p0, La/a660;->a:La/a660;

    .line 2
    .line 3
    return-object p0
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)La/nwk;
    .locals 0

    .line 4
    sget-object p0, La/a660;->a:La/a660;

    return-object p0
.end method

.method public final isActive()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final isCancelled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isCompleted()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final join(La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method
