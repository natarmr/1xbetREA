.class public La/a3h0;
.super La/a2;
.source "SourceFile"

# interfaces
.implements La/xne;


# instance fields
.field public final e:La/yje;


# direct methods
.method public constructor <init>(La/yje;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, La/a2;-><init>(Lkotlin/coroutines/CoroutineContext;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, La/a3h0;->e:La/yje;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final M()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public e0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()La/xne;
    .locals 1

    .line 1
    iget-object p0, p0, La/a3h0;->e:La/yje;

    .line 2
    .line 3
    instance-of v0, p0, La/xne;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/xne;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public o(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/a3h0;->e:La/yje;

    .line 2
    .line 3
    invoke-static {p0}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, La/qzb;->S0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, La/ovk;->a(La/yje;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/a3h0;->e:La/yje;

    .line 2
    .line 3
    invoke-static {p1}, La/qzb;->S0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, La/yje;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
