.class public final La/sel;
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
        "La/sel;",
        "La/um40;",
        "La/vel;",
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


# static fields
.field public static final j:La/n2l;


# instance fields
.field public final b:La/wel;

.field public final c:La/ma80;

.field public final d:Z

.field public final e:La/gy40;

.field public final f:Z

.field public final g:La/xdr;

.field public final h:La/xdr;

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/n2l;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/n2l;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sel;->j:La/n2l;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/wel;La/ma80;ZLa/gy40;ZLa/xdr;La/xdr;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sel;->b:La/wel;

    .line 5
    .line 6
    iput-object p2, p0, La/sel;->c:La/ma80;

    .line 7
    .line 8
    iput-boolean p3, p0, La/sel;->d:Z

    .line 9
    .line 10
    iput-object p4, p0, La/sel;->e:La/gy40;

    .line 11
    .line 12
    iput-boolean p5, p0, La/sel;->f:Z

    .line 13
    .line 14
    iput-object p6, p0, La/sel;->g:La/xdr;

    .line 15
    .line 16
    iput-object p7, p0, La/sel;->h:La/xdr;

    .line 17
    .line 18
    iput-boolean p8, p0, La/sel;->i:Z

    .line 19
    .line 20
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
    if-nez p1, :cond_1

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_1
    const-class v0, La/sel;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_2
    check-cast p1, La/sel;

    .line 17
    .line 18
    iget-object v0, p0, La/sel;->b:La/wel;

    .line 19
    .line 20
    iget-object v1, p1, La/sel;->b:La/wel;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/sel;->c:La/ma80;

    .line 30
    .line 31
    iget-object v1, p1, La/sel;->c:La/ma80;

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-boolean v0, p0, La/sel;->d:Z

    .line 37
    .line 38
    iget-boolean v1, p1, La/sel;->d:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-object v0, p0, La/sel;->e:La/gy40;

    .line 44
    .line 45
    iget-object v1, p1, La/sel;->e:La/gy40;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/sel;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/sel;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object v0, p0, La/sel;->g:La/xdr;

    .line 62
    .line 63
    iget-object v1, p1, La/sel;->g:La/xdr;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object v0, p0, La/sel;->h:La/xdr;

    .line 73
    .line 74
    iget-object v1, p1, La/sel;->h:La/xdr;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-boolean p0, p0, La/sel;->i:Z

    .line 84
    .line 85
    iget-boolean p1, p1, La/sel;->i:Z

    .line 86
    .line 87
    if-eq p0, p1, :cond_a

    .line 88
    .line 89
    :goto_0
    const/4 p0, 0x0

    .line 90
    return p0

    .line 91
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 92
    return p0
.end method

.method public final f()La/lm40;
    .locals 5

    .line 1
    new-instance v0, La/vel;

    .line 2
    .line 3
    sget-object v1, La/sel;->j:La/n2l;

    .line 4
    .line 5
    iget-boolean v2, p0, La/sel;->d:Z

    .line 6
    .line 7
    iget-object v3, p0, La/sel;->e:La/gy40;

    .line 8
    .line 9
    iget-object v4, p0, La/sel;->c:La/ma80;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, La/hel;-><init>(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/sel;->b:La/wel;

    .line 15
    .line 16
    iput-object v1, v0, La/vel;->k1:La/wel;

    .line 17
    .line 18
    iget-boolean v1, p0, La/sel;->f:Z

    .line 19
    .line 20
    iput-boolean v1, v0, La/vel;->l1:Z

    .line 21
    .line 22
    iget-object v1, p0, La/sel;->g:La/xdr;

    .line 23
    .line 24
    iput-object v1, v0, La/vel;->m1:La/xdr;

    .line 25
    .line 26
    iget-object v1, p0, La/sel;->h:La/xdr;

    .line 27
    .line 28
    iput-object v1, v0, La/vel;->n1:La/xdr;

    .line 29
    .line 30
    iget-boolean p0, p0, La/sel;->i:Z

    .line 31
    .line 32
    iput-boolean p0, v0, La/vel;->o1:Z

    .line 33
    .line 34
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/vel;

    .line 3
    .line 4
    iget-object p1, v0, La/vel;->k1:La/wel;

    .line 5
    .line 6
    iget-object v1, p0, La/sel;->b:La/wel;

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iput-object v1, v0, La/vel;->k1:La/wel;

    .line 16
    .line 17
    move p1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iget-boolean v1, v0, La/vel;->o1:Z

    .line 21
    .line 22
    iget-boolean v3, p0, La/sel;->i:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_1

    .line 25
    .line 26
    iput-boolean v3, v0, La/vel;->o1:Z

    .line 27
    .line 28
    move v5, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v5, p1

    .line 31
    :goto_1
    iget-object p1, p0, La/sel;->g:La/xdr;

    .line 32
    .line 33
    iput-object p1, v0, La/vel;->m1:La/xdr;

    .line 34
    .line 35
    iget-object p1, p0, La/sel;->h:La/xdr;

    .line 36
    .line 37
    iput-object p1, v0, La/vel;->n1:La/xdr;

    .line 38
    .line 39
    iget-boolean p1, p0, La/sel;->f:Z

    .line 40
    .line 41
    iput-boolean p1, v0, La/vel;->l1:Z

    .line 42
    .line 43
    sget-object v1, La/sel;->j:La/n2l;

    .line 44
    .line 45
    iget-boolean v2, p0, La/sel;->d:Z

    .line 46
    .line 47
    iget-object v3, p0, La/sel;->e:La/gy40;

    .line 48
    .line 49
    iget-object v4, p0, La/sel;->c:La/ma80;

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, La/hel;->t1(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/sel;->b:La/wel;

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
    iget-object v2, p0, La/sel;->c:La/ma80;

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
    iget-boolean v0, p0, La/sel;->d:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/sel;->e:La/gy40;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    add-int/2addr v0, v2

    .line 35
    mul-int/2addr v0, v1

    .line 36
    iget-boolean v2, p0, La/sel;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/sel;->g:La/xdr;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/sel;->h:La/xdr;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-boolean p0, p0, La/sel;->i:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method
