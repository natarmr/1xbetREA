.class public final La/a8l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/d2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:La/y3d;

.field public final e:Z

.field public final f:Z

.field public final g:La/t1l0;

.field public final h:La/u2l0;


# direct methods
.method public constructor <init>(La/d2l0;ILjava/lang/String;La/y3d;ZZ)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a8l0;->a:La/d2l0;

    .line 5
    .line 6
    iput p2, p0, La/a8l0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/a8l0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/a8l0;->d:La/y3d;

    .line 11
    .line 12
    iput-boolean p5, p0, La/a8l0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/a8l0;->f:Z

    .line 15
    .line 16
    new-instance v0, La/t1l0;

    .line 17
    .line 18
    sget-object v1, La/p1l0;->b:La/p1l0;

    .line 19
    .line 20
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 21
    .line 22
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 27
    .line 28
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    move-wide v3, v2

    .line 33
    new-instance v2, La/y3d;

    .line 34
    .line 35
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 36
    .line 37
    .line 38
    const/16 v7, 0xc0

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    move-object v3, p3

    .line 43
    move-object v5, p4

    .line 44
    invoke-direct/range {v0 .. v7}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/a8l0;->g:La/t1l0;

    .line 48
    .line 49
    new-instance p1, La/u2l0;

    .line 50
    .line 51
    move p3, p2

    .line 52
    sget-object p2, La/mpe;->a:La/mpe;

    .line 53
    .line 54
    move p4, p5

    .line 55
    move p5, p6

    .line 56
    const/4 p6, 0x0

    .line 57
    invoke-direct/range {p1 .. p6}, La/u2l0;-><init>(La/ope;IZZLa/u1m;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, La/a8l0;->h:La/u2l0;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a8l0;->g:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a8l0;->h:La/u2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/a8l0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/a8l0;

    .line 11
    .line 12
    iget-object v1, p0, La/a8l0;->a:La/d2l0;

    .line 13
    .line 14
    iget-object v2, p1, La/a8l0;->a:La/d2l0;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, La/d2l0;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget v1, p0, La/a8l0;->b:I

    .line 24
    .line 25
    iget v2, p1, La/a8l0;->b:I

    .line 26
    .line 27
    if-eq v1, v2, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, La/a8l0;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v2, p1, La/a8l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v1, p0, La/a8l0;->d:La/y3d;

    .line 42
    .line 43
    iget-object v2, p1, La/a8l0;->d:La/y3d;

    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-boolean v1, p0, La/a8l0;->e:Z

    .line 53
    .line 54
    iget-boolean v2, p1, La/a8l0;->e:Z

    .line 55
    .line 56
    if-eq v1, v2, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-boolean p0, p0, La/a8l0;->f:Z

    .line 60
    .line 61
    iget-boolean p1, p1, La/a8l0;->f:Z

    .line 62
    .line 63
    if-eq p0, p1, :cond_7

    .line 64
    .line 65
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_7
    return v0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a8l0;->a:La/d2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, La/a8l0;->a:La/d2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/d2l0;->hashCode()I

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
    iget v2, p0, La/a8l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v2, 0x3c1

    .line 17
    .line 18
    iget-object v3, p0, La/a8l0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, La/a8l0;->d:La/y3d;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-wide v3, v3, La/y3d;->a:J

    .line 31
    .line 32
    sget-object v5, La/h2t0;->b:La/g2t0;

    .line 33
    .line 34
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_0
    add-int/2addr v0, v3

    .line 39
    mul-int/2addr v0, v2

    .line 40
    iget-boolean v2, p0, La/a8l0;->e:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean p0, p0, La/a8l0;->f:Z

    .line 47
    .line 48
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SportCounterWithListCheckbox(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/a8l0;->a:La/d2l0;

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
    iget v1, p0, La/a8l0;->b:I

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
    iget-object v1, p0, La/a8l0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconResId=null, iconColor="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/a8l0;->d:La/y3d;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", badgeStyle=null, active="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", enabled="

    .line 49
    .line 50
    const-string v2, ", customBadgeStyle=null)"

    .line 51
    .line 52
    iget-boolean v3, p0, La/a8l0;->e:Z

    .line 53
    .line 54
    iget-boolean p0, p0, La/a8l0;->f:Z

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
