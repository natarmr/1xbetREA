.class public final La/e7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/a2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:La/uf5;

.field public final e:Z

.field public final f:Z

.field public final g:La/t1l0;

.field public final h:La/a3l0;


# direct methods
.method public constructor <init>(La/a2l0;ILjava/lang/String;La/uf5;ZZI)V
    .locals 8

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v6, p4

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/e7l0;->a:La/a2l0;

    .line 11
    .line 12
    iput p2, p0, La/e7l0;->b:I

    .line 13
    .line 14
    iput-object p3, p0, La/e7l0;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v6, p0, La/e7l0;->d:La/uf5;

    .line 17
    .line 18
    iput-boolean p5, p0, La/e7l0;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/e7l0;->f:Z

    .line 21
    .line 22
    new-instance v0, La/t1l0;

    .line 23
    .line 24
    sget-object v1, La/p1l0;->c:La/p1l0;

    .line 25
    .line 26
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 27
    .line 28
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 33
    .line 34
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    move-wide v3, v2

    .line 39
    new-instance v2, La/y3d;

    .line 40
    .line 41
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 42
    .line 43
    .line 44
    const/16 v7, 0xc0

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    move-object v3, p3

    .line 49
    invoke-direct/range {v0 .. v7}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/e7l0;->g:La/t1l0;

    .line 53
    .line 54
    new-instance p1, La/a3l0;

    .line 55
    .line 56
    new-instance p3, La/kpe;

    .line 57
    .line 58
    invoke-direct {p3}, La/kpe;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, p3, p2, p5, p6}, La/a3l0;-><init>(La/ope;IZZ)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, La/e7l0;->h:La/a3l0;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7l0;->g:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7l0;->h:La/a3l0;

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
    instance-of v0, p1, La/e7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/e7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/e7l0;->a:La/a2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/e7l0;->a:La/a2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/a2l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/e7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/e7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/e7l0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/e7l0;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/e7l0;->d:La/uf5;

    .line 41
    .line 42
    iget-object v1, p1, La/e7l0;->d:La/uf5;

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
    iget-boolean v0, p0, La/e7l0;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/e7l0;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean p0, p0, La/e7l0;->f:Z

    .line 59
    .line 60
    iget-boolean p1, p1, La/e7l0;->f:Z

    .line 61
    .line 62
    if-eq p0, p1, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7l0;->a:La/a2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/e7l0;->a:La/a2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/a2l0;->hashCode()I

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
    iget v2, p0, La/e7l0;->b:I

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
    iget-object v3, p0, La/e7l0;->c:Ljava/lang/String;

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
    mul-int/lit16 v0, v0, 0x745f

    .line 29
    .line 30
    iget-object v3, p0, La/e7l0;->d:La/uf5;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_1
    add-int/2addr v0, v2

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-boolean v2, p0, La/e7l0;->e:Z

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-boolean p0, p0, La/e7l0;->f:Z

    .line 48
    .line 49
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, v0

    .line 54
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

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
    iget-object v1, p0, La/e7l0;->a:La/a2l0;

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
    iget v1, p0, La/e7l0;->b:I

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
    iget-object v1, p0, La/e7l0;->c:Ljava/lang/String;

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
    iget-object v1, p0, La/e7l0;->d:La/uf5;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", active="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", enabled="

    .line 49
    .line 50
    const-string v2, ")"

    .line 51
    .line 52
    iget-boolean v3, p0, La/e7l0;->e:Z

    .line 53
    .line 54
    iget-boolean p0, p0, La/e7l0;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
