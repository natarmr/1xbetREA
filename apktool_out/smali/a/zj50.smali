.class final La/zj50;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/zj50;",
        "La/um40;",
        "La/ek50;",
        "ui"
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
.field public final b:La/vj50;

.field public final c:La/yj50;


# direct methods
.method public constructor <init>(La/vj50;La/yj50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zj50;->b:La/vj50;

    .line 5
    .line 6
    iput-object p2, p0, La/zj50;->c:La/yj50;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, La/zj50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, La/zj50;

    .line 8
    .line 9
    iget-object v0, p1, La/zj50;->b:La/vj50;

    .line 10
    .line 11
    iget-object v2, p0, La/zj50;->b:La/vj50;

    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object p1, p1, La/zj50;->c:La/yj50;

    .line 21
    .line 22
    iget-object p0, p0, La/zj50;->c:La/yj50;

    .line 23
    .line 24
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public final f()La/lm40;
    .locals 2

    .line 1
    new-instance v0, La/ek50;

    .line 2
    .line 3
    iget-object v1, p0, La/zj50;->b:La/vj50;

    .line 4
    .line 5
    iget-object p0, p0, La/zj50;->c:La/yj50;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, La/ek50;-><init>(La/vj50;La/yj50;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 3

    .line 1
    check-cast p1, La/ek50;

    .line 2
    .line 3
    iget-object v0, p0, La/zj50;->b:La/vj50;

    .line 4
    .line 5
    iput-object v0, p1, La/ek50;->o:La/vj50;

    .line 6
    .line 7
    iget-object v0, p1, La/ek50;->p:La/yj50;

    .line 8
    .line 9
    iget-object v1, v0, La/yj50;->a:La/ek50;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    iput-object v2, v0, La/yj50;->a:La/ek50;

    .line 15
    .line 16
    iput-object v2, v0, La/yj50;->d:La/vne;

    .line 17
    .line 18
    sget-object v1, La/knx;->h:La/th50;

    .line 19
    .line 20
    iput-object v1, v0, La/yj50;->c:Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, La/zj50;->c:La/yj50;

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    new-instance v0, La/yj50;

    .line 27
    .line 28
    invoke-direct {v0}, La/yj50;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p1, La/ek50;->p:La/yj50;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-eq p0, v0, :cond_2

    .line 35
    .line 36
    iput-object p0, p1, La/ek50;->p:La/yj50;

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    :cond_2
    :goto_0
    iget-boolean p0, p1, La/lm40;->n:Z

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    iput-object p1, v0, La/yj50;->a:La/ek50;

    .line 44
    .line 45
    iput-object v2, v0, La/yj50;->b:La/ek50;

    .line 46
    .line 47
    iput-object v2, p1, La/ek50;->q:La/ek50;

    .line 48
    .line 49
    new-instance p0, La/np30;

    .line 50
    .line 51
    const/16 v1, 0x13

    .line 52
    .line 53
    invoke-direct {p0, p1, v1}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v0, La/yj50;->c:Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    invoke-virtual {p1}, La/lm40;->N0()La/vne;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput-object p0, v0, La/yj50;->d:La/vne;

    .line 63
    .line 64
    :cond_3
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/zj50;->b:La/vj50;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/zj50;->c:La/yj50;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method
