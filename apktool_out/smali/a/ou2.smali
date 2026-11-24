.class final La/ou2;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ou2;",
        "T",
        "La/um40;",
        "La/hv2;",
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
.field public final b:La/rv2;

.field public final c:Z

.field public final d:Ljava/lang/Boolean;

.field public final e:La/gy40;

.field public final f:La/qkq;


# direct methods
.method public constructor <init>(La/rv2;ZLjava/lang/Boolean;La/gy40;La/qkq;)V
    .locals 1

    .line 1
    sget-object v0, La/ma80;->a:La/ma80;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/ou2;->b:La/rv2;

    .line 7
    .line 8
    iput-boolean p2, p0, La/ou2;->c:Z

    .line 9
    .line 10
    iput-object p3, p0, La/ou2;->d:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object p4, p0, La/ou2;->e:La/gy40;

    .line 13
    .line 14
    iput-object p5, p0, La/ou2;->f:La/qkq;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/ou2;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ou2;

    .line 10
    .line 11
    iget-object v0, p1, La/ou2;->b:La/rv2;

    .line 12
    .line 13
    iget-object v1, p0, La/ou2;->b:La/rv2;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object v0, La/ma80;->a:La/ma80;

    .line 23
    .line 24
    iget-boolean v0, p0, La/ou2;->c:Z

    .line 25
    .line 26
    iget-boolean v1, p1, La/ou2;->c:Z

    .line 27
    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/ou2;->d:Ljava/lang/Boolean;

    .line 32
    .line 33
    iget-object v1, p1, La/ou2;->d:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/ou2;->e:La/gy40;

    .line 43
    .line 44
    iget-object v1, p1, La/ou2;->e:La/gy40;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object p0, p0, La/ou2;->f:La/qkq;

    .line 54
    .line 55
    iget-object p1, p1, La/ou2;->f:La/qkq;

    .line 56
    .line 57
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_6

    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0

    .line 65
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public final f()La/lm40;
    .locals 5

    .line 1
    new-instance v0, La/hv2;

    .line 2
    .line 3
    sget-object v1, La/ma80;->a:La/ma80;

    .line 4
    .line 5
    sget-object v2, La/dv2;->a:La/xd2;

    .line 6
    .line 7
    iget-boolean v3, p0, La/ou2;->c:Z

    .line 8
    .line 9
    iget-object v4, p0, La/ou2;->e:La/gy40;

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v4, v1}, La/hel;-><init>(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/ou2;->b:La/rv2;

    .line 15
    .line 16
    iput-object v1, v0, La/hv2;->k1:La/rv2;

    .line 17
    .line 18
    iget-object v1, p0, La/ou2;->d:Ljava/lang/Boolean;

    .line 19
    .line 20
    iput-object v1, v0, La/hv2;->l1:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object p0, p0, La/ou2;->f:La/qkq;

    .line 23
    .line 24
    iput-object p0, v0, La/hv2;->m1:La/qkq;

    .line 25
    .line 26
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/hv2;

    .line 3
    .line 4
    sget-object v4, La/ma80;->a:La/ma80;

    .line 5
    .line 6
    iget-object p1, p0, La/ou2;->f:La/qkq;

    .line 7
    .line 8
    iput-object p1, v0, La/hv2;->m1:La/qkq;

    .line 9
    .line 10
    iget-object v1, v0, La/hv2;->k1:La/rv2;

    .line 11
    .line 12
    iget-object v2, p0, La/ou2;->b:La/rv2;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iput-object v2, v0, La/hv2;->k1:La/rv2;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, La/hv2;->w1(La/qkq;)V

    .line 24
    .line 25
    .line 26
    move p1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iget-object v1, v0, La/hel;->q:La/ma80;

    .line 30
    .line 31
    if-eq v1, v4, :cond_1

    .line 32
    .line 33
    iput-object v4, v0, La/hel;->q:La/ma80;

    .line 34
    .line 35
    move p1, v3

    .line 36
    :cond_1
    iget-object v1, v0, La/hv2;->l1:Ljava/lang/Boolean;

    .line 37
    .line 38
    iget-object v2, p0, La/ou2;->d:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    iput-object v2, v0, La/hv2;->l1:Ljava/lang/Boolean;

    .line 47
    .line 48
    move v5, v3

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v5, p1

    .line 51
    :goto_1
    iget-object v1, v0, La/hel;->r:Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    iget-boolean v2, p0, La/ou2;->c:Z

    .line 54
    .line 55
    iget-object v3, p0, La/ou2;->e:La/gy40;

    .line 56
    .line 57
    invoke-virtual/range {v0 .. v5}, La/hel;->t1(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ou2;->b:La/rv2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    sget-object v2, La/ma80;->a:La/ma80;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, La/ou2;->c:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    iget-object v3, p0, La/ou2;->d:Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v2

    .line 35
    :goto_0
    add-int/2addr v0, v3

    .line 36
    mul-int/2addr v0, v1

    .line 37
    iget-object v1, p0, La/ou2;->e:La/gy40;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v1, v2

    .line 47
    :goto_1
    add-int/2addr v0, v1

    .line 48
    mul-int/lit16 v0, v0, 0x745f

    .line 49
    .line 50
    iget-object p0, p0, La/ou2;->f:La/qkq;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    :cond_2
    add-int/2addr v0, v2

    .line 59
    return v0
.end method
