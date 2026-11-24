.class public final La/z7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/d2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:La/y3d;

.field public final f:La/t1l0;

.field public final g:La/s2l0;


# direct methods
.method public constructor <init>(La/d2l0;ILjava/lang/String;Ljava/lang/Integer;La/y3d;I)V
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
    iput-object p1, p0, La/z7l0;->a:La/d2l0;

    .line 27
    .line 28
    iput p2, p0, La/z7l0;->b:I

    .line 29
    .line 30
    iput-object v5, p0, La/z7l0;->c:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v6, p0, La/z7l0;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    iput-object v7, p0, La/z7l0;->e:La/y3d;

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
    iput-object v2, p0, La/z7l0;->f:La/t1l0;

    .line 64
    .line 65
    new-instance p1, La/s2l0;

    .line 66
    .line 67
    invoke-direct {p1, p2, v1}, La/s2l0;-><init>(ILa/u1m;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La/z7l0;->g:La/s2l0;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z7l0;->f:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z7l0;->g:La/s2l0;

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
    instance-of v1, p1, La/z7l0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/z7l0;

    .line 11
    .line 12
    iget-object v1, p0, La/z7l0;->a:La/d2l0;

    .line 13
    .line 14
    iget-object v2, p1, La/z7l0;->a:La/d2l0;

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
    iget v1, p0, La/z7l0;->b:I

    .line 24
    .line 25
    iget v2, p1, La/z7l0;->b:I

    .line 26
    .line 27
    if-eq v1, v2, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, La/z7l0;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v2, p1, La/z7l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, La/z7l0;->d:Ljava/lang/Integer;

    .line 42
    .line 43
    iget-object v2, p1, La/z7l0;->d:Ljava/lang/Integer;

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
    iget-object p0, p0, La/z7l0;->e:La/y3d;

    .line 53
    .line 54
    iget-object p1, p1, La/z7l0;->e:La/y3d;

    .line 55
    .line 56
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_6

    .line 61
    .line 62
    :goto_0
    const/4 p0, 0x0

    .line 63
    return p0

    .line 64
    :cond_6
    return v0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z7l0;->a:La/d2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/z7l0;->a:La/d2l0;

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
    iget v2, p0, La/z7l0;->b:I

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
    iget-object v3, p0, La/z7l0;->c:Ljava/lang/String;

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
    iget-object v3, p0, La/z7l0;->d:Ljava/lang/Integer;

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
    iget-object p0, p0, La/z7l0;->e:La/y3d;

    .line 42
    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    iget-wide v1, p0, La/y3d;->a:J

    .line 47
    .line 48
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 49
    .line 50
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    :goto_2
    add-int/2addr v0, v2

    .line 55
    mul-int/lit16 v0, v0, 0x3c1

    .line 56
    .line 57
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
    iget-object v1, p0, La/z7l0;->a:La/d2l0;

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
    iget v1, p0, La/z7l0;->b:I

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
    iget-object v3, p0, La/z7l0;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    iget-object v4, p0, La/z7l0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", badgeStyle=null, customBadgeStyle=null)"

    .line 40
    .line 41
    iget-object p0, p0, La/z7l0;->e:La/y3d;

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
