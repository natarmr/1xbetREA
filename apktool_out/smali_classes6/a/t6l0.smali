.class public final La/t6l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/y1l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:La/uf5;

.field public final e:La/r1l0;

.field public final f:La/r2l0;


# direct methods
.method public constructor <init>(La/y1l0;ILjava/lang/String;La/uf5;I)V
    .locals 12

    .line 1
    and-int/lit8 v0, p5, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v9, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v9, p4

    .line 9
    .line 10
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/t6l0;->a:La/y1l0;

    .line 14
    .line 15
    iput p2, p0, La/t6l0;->b:I

    .line 16
    .line 17
    iput-object p3, p0, La/t6l0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v9, p0, La/t6l0;->d:La/uf5;

    .line 20
    .line 21
    new-instance v1, La/r1l0;

    .line 22
    .line 23
    sget-object v2, La/p1l0;->c:La/p1l0;

    .line 24
    .line 25
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 26
    .line 27
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    new-instance p1, La/y3d;

    .line 38
    .line 39
    invoke-direct {p1, v3, v4}, La/y3d;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 47
    .line 48
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v3, p1

    .line 57
    move-object v6, p3

    .line 58
    invoke-direct/range {v1 .. v11}, La/r1l0;-><init>(La/p1l0;La/y3d;JLjava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;La/gpe;Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, La/t6l0;->e:La/r1l0;

    .line 62
    .line 63
    new-instance p1, La/r2l0;

    .line 64
    .line 65
    invoke-direct {p1, p2}, La/r2l0;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La/t6l0;->f:La/r2l0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t6l0;->e:La/r1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t6l0;->f:La/r2l0;

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
    instance-of v0, p1, La/t6l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/t6l0;

    .line 10
    .line 11
    iget-object v0, p0, La/t6l0;->a:La/y1l0;

    .line 12
    .line 13
    iget-object v1, p1, La/t6l0;->a:La/y1l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/y1l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/t6l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/t6l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/t6l0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/t6l0;->c:Ljava/lang/String;

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
    iget-object p0, p0, La/t6l0;->d:La/uf5;

    .line 41
    .line 42
    iget-object p1, p1, La/t6l0;->d:La/uf5;

    .line 43
    .line 44
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t6l0;->a:La/y1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/t6l0;->a:La/y1l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/y1l0;->hashCode()I

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
    iget v2, p0, La/t6l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v2, p0, La/t6l0;->c:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_0
    add-int/2addr v0, v2

    .line 28
    mul-int/lit16 v0, v0, 0x745f

    .line 29
    .line 30
    iget-object p0, p0, La/t6l0;->d:La/uf5;

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :goto_1
    add-int/2addr v0, v1

    .line 40
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChampionshipCounterWithActionIcon(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/t6l0;->a:La/y1l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", actionIconResId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/t6l0;->b:I

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
    iget-object v1, p0, La/t6l0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconResId=null, iconColor=null, badgeStyle="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/t6l0;->d:La/uf5;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
