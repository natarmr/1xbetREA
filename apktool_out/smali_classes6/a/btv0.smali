.class public final La/btv0;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/btv0;",
        "La/um40;",
        "La/etv0;",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:La/xcz;

.field public final c:La/xcz;

.field public final d:La/ywv0;

.field public final e:Z


# direct methods
.method public constructor <init>(La/xcz;La/xcz;La/ywv0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/btv0;->b:La/xcz;

    .line 8
    .line 9
    iput-object p2, p0, La/btv0;->c:La/xcz;

    .line 10
    .line 11
    iput-object p3, p0, La/btv0;->d:La/ywv0;

    .line 12
    .line 13
    iput-boolean p4, p0, La/btv0;->e:Z

    .line 14
    .line 15
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
    instance-of v0, p1, La/btv0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, La/btv0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_2

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_2
    iget-object v0, p0, La/btv0;->b:La/xcz;

    .line 16
    .line 17
    iget-object v1, p1, La/btv0;->b:La/xcz;

    .line 18
    .line 19
    if-ne v0, v1, :cond_3

    .line 20
    .line 21
    iget-object v0, p0, La/btv0;->c:La/xcz;

    .line 22
    .line 23
    iget-object v1, p1, La/btv0;->c:La/xcz;

    .line 24
    .line 25
    if-ne v0, v1, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, La/btv0;->d:La/ywv0;

    .line 28
    .line 29
    iget-object v1, p1, La/btv0;->d:La/ywv0;

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    iget-boolean p0, p0, La/btv0;->e:Z

    .line 34
    .line 35
    iget-boolean p1, p1, La/btv0;->e:Z

    .line 36
    .line 37
    if-ne p0, p1, :cond_3

    .line 38
    .line 39
    :goto_1
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final f()La/lm40;
    .locals 3

    .line 1
    new-instance v0, La/etv0;

    .line 2
    .line 3
    iget-object v1, p0, La/btv0;->d:La/ywv0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, La/lm40;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/btv0;->b:La/xcz;

    .line 12
    .line 13
    iput-object v2, v0, La/etv0;->o:La/xcz;

    .line 14
    .line 15
    iget-object v2, p0, La/btv0;->c:La/xcz;

    .line 16
    .line 17
    iput-object v2, v0, La/etv0;->p:La/xcz;

    .line 18
    .line 19
    iput-object v1, v0, La/etv0;->q:La/ywv0;

    .line 20
    .line 21
    iget-boolean p0, p0, La/btv0;->e:Z

    .line 22
    .line 23
    iput-boolean p0, v0, La/etv0;->r:Z

    .line 24
    .line 25
    const/4 p0, -0x1

    .line 26
    iput p0, v0, La/etv0;->A:I

    .line 27
    .line 28
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 6

    .line 1
    check-cast p1, La/etv0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/btv0;->d:La/ywv0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/ywv0;->e:La/muv0;

    .line 12
    .line 13
    iget-object v2, p1, La/etv0;->o:La/xcz;

    .line 14
    .line 15
    iget-object v3, p0, La/btv0;->b:La/xcz;

    .line 16
    .line 17
    iget-object v4, p0, La/btv0;->c:La/xcz;

    .line 18
    .line 19
    iget-boolean p0, p0, La/btv0;->e:Z

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    iget-object v2, p1, La/etv0;->p:La/xcz;

    .line 24
    .line 25
    if-ne v2, v4, :cond_0

    .line 26
    .line 27
    iget-object v2, p1, La/etv0;->q:La/ywv0;

    .line 28
    .line 29
    if-ne v2, v0, :cond_0

    .line 30
    .line 31
    iget-boolean v2, p1, La/etv0;->r:Z

    .line 32
    .line 33
    if-ne v2, p0, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v2, p1, La/etv0;->q:La/ywv0;

    .line 37
    .line 38
    if-eq v2, v0, :cond_2

    .line 39
    .line 40
    iget-object v2, v2, La/ywv0;->e:La/muv0;

    .line 41
    .line 42
    iget v5, v2, La/muv0;->d:I

    .line 43
    .line 44
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    if-gez v5, :cond_1

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    :cond_1
    iput v5, v2, La/muv0;->d:I

    .line 50
    .line 51
    iget v2, v1, La/muv0;->d:I

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    iput v2, v1, La/muv0;->d:I

    .line 56
    .line 57
    :cond_2
    iput-object v3, p1, La/etv0;->o:La/xcz;

    .line 58
    .line 59
    iput-object v4, p1, La/etv0;->p:La/xcz;

    .line 60
    .line 61
    iput-object v0, p1, La/etv0;->q:La/ywv0;

    .line 62
    .line 63
    iput-boolean p0, p1, La/etv0;->r:Z

    .line 64
    .line 65
    iput-boolean p0, v1, La/muv0;->f:Z

    .line 66
    .line 67
    if-nez p0, :cond_3

    .line 68
    .line 69
    iget-object p0, v1, La/muv0;->i:La/pz40;

    .line 70
    .line 71
    check-cast p0, La/hgk0;

    .line 72
    .line 73
    sget-object v0, La/zsv0;->a:La/zsv0;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {p1}, La/etv0;->d1()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, La/lm40;->N0()La/vne;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v0, La/k6s0;

    .line 86
    .line 87
    const/16 v1, 0x1c

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-direct {v0, p1, v2, v1}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 91
    .line 92
    .line 93
    const/4 v1, 0x3

    .line 94
    invoke-static {p0, v2, v2, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iput-object p0, p1, La/etv0;->s:La/bby;

    .line 99
    .line 100
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/btv0;->b:La/xcz;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/btv0;->c:La/xcz;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    iget-object v1, p0, La/btv0;->d:La/ywv0;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    xor-int/2addr v0, v1

    .line 21
    iget-boolean p0, p0, La/btv0;->e:Z

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    xor-int/2addr p0, v0

    .line 28
    return p0
.end method
