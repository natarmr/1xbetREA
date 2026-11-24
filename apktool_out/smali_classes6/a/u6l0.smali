.class public final La/u6l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/y1l0;

.field public final b:Ljava/lang/String;

.field public final c:La/uf5;

.field public final d:Z

.field public final e:Z

.field public final f:La/r1l0;

.field public final g:La/d3l0;


# direct methods
.method public constructor <init>(La/y1l0;Ljava/lang/String;La/uf5;ZZI)V
    .locals 14

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    and-int/lit8 v2, p6, 0x10

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-object v11, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v11, p3

    .line 13
    .line 14
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/u6l0;->a:La/y1l0;

    .line 18
    .line 19
    move-object/from16 v8, p2

    .line 20
    .line 21
    iput-object v8, p0, La/u6l0;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v11, p0, La/u6l0;->c:La/uf5;

    .line 24
    .line 25
    iput-boolean v0, p0, La/u6l0;->d:Z

    .line 26
    .line 27
    iput-boolean v1, p0, La/u6l0;->e:Z

    .line 28
    .line 29
    new-instance v3, La/r1l0;

    .line 30
    .line 31
    sget-object v4, La/p1l0;->c:La/p1l0;

    .line 32
    .line 33
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 34
    .line 35
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    new-instance p1, La/y3d;

    .line 46
    .line 47
    invoke-direct {p1, v5, v6}, La/y3d;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 55
    .line 56
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v5, p1

    .line 65
    invoke-direct/range {v3 .. v13}, La/r1l0;-><init>(La/p1l0;La/y3d;JLjava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;La/gpe;Ljava/lang/Integer;)V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, La/u6l0;->f:La/r1l0;

    .line 69
    .line 70
    new-instance p1, La/d3l0;

    .line 71
    .line 72
    invoke-direct {p1, v0, v1}, La/d3l0;-><init>(ZZ)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, La/u6l0;->g:La/d3l0;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6l0;->f:La/r1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6l0;->g:La/d3l0;

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
    instance-of v0, p1, La/u6l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/u6l0;

    .line 10
    .line 11
    iget-object v0, p0, La/u6l0;->a:La/y1l0;

    .line 12
    .line 13
    iget-object v1, p1, La/u6l0;->a:La/y1l0;

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
    iget-object v0, p0, La/u6l0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/u6l0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/u6l0;->c:La/uf5;

    .line 34
    .line 35
    iget-object v1, p1, La/u6l0;->c:La/uf5;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, La/u6l0;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, La/u6l0;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean p0, p0, La/u6l0;->e:Z

    .line 52
    .line 53
    iget-boolean p1, p1, La/u6l0;->e:Z

    .line 54
    .line 55
    if-eq p0, p1, :cond_6

    .line 56
    .line 57
    :goto_0
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6l0;->a:La/y1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/u6l0;->a:La/y1l0;

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/u6l0;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/lit16 v0, v0, 0x745f

    .line 23
    .line 24
    iget-object v3, p0, La/u6l0;->c:La/uf5;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_1
    add-int/2addr v0, v2

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-boolean v2, p0, La/u6l0;->d:Z

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean p0, p0, La/u6l0;->e:Z

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-int/2addr p0, v0

    .line 48
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChampionshipCounterWithListCheckbox(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/u6l0;->a:La/y1l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", iconUrl="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/u6l0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconResId=null, iconColor=null, badgeStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/u6l0;->c:La/uf5;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", active="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/u6l0;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", enabled="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ")"

    .line 49
    .line 50
    iget-boolean p0, p0, La/u6l0;->e:Z

    .line 51
    .line 52
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
