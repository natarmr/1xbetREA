.class public final La/la5;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u000c\u0012\u0008\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "La/la5;",
        "La/um40;",
        "La/ka5;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public b:La/ka5;

.field public c:La/odd;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final f()La/lm40;
    .locals 1

    .line 1
    new-instance v0, La/ka5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/ka5;-><init>(La/la5;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 0

    .line 1
    check-cast p1, La/ka5;

    .line 2
    .line 3
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const/16 p0, 0xea

    .line 2
    .line 3
    return p0
.end method

.method public final i(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/la5;->c:La/odd;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/odd;

    .line 6
    .line 7
    invoke-direct {v0}, La/odd;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/la5;->c:La/odd;

    .line 11
    .line 12
    iget-object p0, p0, La/la5;->b:La/ka5;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-boolean v1, p0, La/lm40;->n:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, La/ka5;->p:La/la5;

    .line 21
    .line 22
    new-instance v2, La/ys3;

    .line 23
    .line 24
    const/16 v3, 0x1a

    .line 25
    .line 26
    invoke-direct {v2, p0, v1, v3}, La/ys3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v2}, La/x4d0;->f0(La/lm40;Lkotlin/jvm/functions/Function1;)La/scq0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, La/ka5;->o:La/scq0;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0, p1}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    if-ne p0, p1, :cond_1

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0
.end method
