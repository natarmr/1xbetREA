.class public final La/q7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7l0;


# instance fields
.field public final a:La/b2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:La/y3d;

.field public final f:La/t1l0;

.field public final g:La/z2l0;


# direct methods
.method public constructor <init>(La/b2l0;ILjava/lang/String;Ljava/lang/Integer;La/y3d;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v5, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v5, p3

    .line 9
    :goto_0
    and-int/lit8 p3, p6, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    move-object v6, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v6, p4

    .line 16
    :goto_1
    and-int/lit8 p3, p6, 0x10

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    move-object v7, v1

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    move-object v7, p5

    .line 23
    :goto_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/q7l0;->a:La/b2l0;

    .line 27
    .line 28
    iput p2, p0, La/q7l0;->b:I

    .line 29
    .line 30
    iput-object v5, p0, La/q7l0;->c:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v6, p0, La/q7l0;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    iput-object v7, p0, La/q7l0;->e:La/y3d;

    .line 35
    .line 36
    new-instance v2, La/t1l0;

    .line 37
    .line 38
    sget-object v3, La/p1l0;->b:La/p1l0;

    .line 39
    .line 40
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 41
    .line 42
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 47
    .line 48
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    new-instance v4, La/y3d;

    .line 53
    .line 54
    invoke-direct {v4, p3, p4}, La/y3d;-><init>(J)V

    .line 55
    .line 56
    .line 57
    const/16 v9, 0xc0

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    invoke-direct/range {v2 .. v9}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, La/q7l0;->f:La/t1l0;

    .line 64
    .line 65
    new-instance p1, La/z2l0;

    .line 66
    .line 67
    new-instance p3, La/fpe;

    .line 68
    .line 69
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    iget-object p4, p4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 74
    .line 75
    invoke-virtual {p4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 76
    .line 77
    .line 78
    move-result-wide p4

    .line 79
    new-instance v0, La/y3d;

    .line 80
    .line 81
    invoke-direct {v0, p4, p5}, La/y3d;-><init>(J)V

    .line 82
    .line 83
    .line 84
    const/4 p4, 0x0

    .line 85
    const/4 p5, 0x2

    .line 86
    invoke-direct {p3, v0, p4, p5}, La/fpe;-><init>(La/y3d;ZI)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    iget-object p4, p4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 94
    .line 95
    invoke-virtual {p4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 96
    .line 97
    .line 98
    move-result-wide p4

    .line 99
    invoke-direct {p1, p3, p2, p4, p5}, La/z2l0;-><init>(La/fpe;IJ)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, La/q7l0;->g:La/z2l0;

    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q7l0;->f:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q7l0;->g:La/z2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/q7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/q7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/q7l0;->a:La/b2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/q7l0;->a:La/b2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/b2l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/q7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/q7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/q7l0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/q7l0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/q7l0;->d:Ljava/lang/Integer;

    .line 41
    .line 42
    iget-object v1, p1, La/q7l0;->d:Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object p0, p0, La/q7l0;->e:La/y3d;

    .line 52
    .line 53
    iget-object p1, p1, La/q7l0;->e:La/y3d;

    .line 54
    .line 55
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q7l0;->a:La/b2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/q7l0;->a:La/b2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/b2l0;->hashCode()I

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
    iget v2, p0, La/q7l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, La/q7l0;->c:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    add-int/2addr v0, v3

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object v3, p0, La/q7l0;->d:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_1
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object p0, p0, La/q7l0;->e:La/y3d;

    .line 42
    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    iget-wide v2, p0, La/y3d;->a:J

    .line 47
    .line 48
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    :goto_2
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SportCounter(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/q7l0;->a:La/b2l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", counterValue="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/q7l0;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconUrl="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconResId="

    .line 29
    .line 30
    const-string v2, ", iconColor="

    .line 31
    .line 32
    iget-object v3, p0, La/q7l0;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    iget-object v4, p0, La/q7l0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", badgeStyle=null)"

    .line 40
    .line 41
    iget-object p0, p0, La/q7l0;->e:La/y3d;

    .line 42
    .line 43
    invoke-static {v0, p0, v1}, La/hne;->p(Ljava/lang/StringBuilder;La/y3d;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
