.class public final La/d7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/a2l0;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:La/uf5;

.field public final f:La/t1l0;

.field public final g:La/e3l0;


# direct methods
.method public constructor <init>(La/a2l0;IILjava/lang/String;La/uf5;I)V
    .locals 9

    .line 1
    and-int/lit8 p6, p6, 0x40

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object v7, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v7, p5

    .line 9
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/d7l0;->a:La/a2l0;

    .line 13
    .line 14
    iput p2, p0, La/d7l0;->b:I

    .line 15
    .line 16
    iput p3, p0, La/d7l0;->c:I

    .line 17
    .line 18
    iput-object p4, p0, La/d7l0;->d:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v7, p0, La/d7l0;->e:La/uf5;

    .line 21
    .line 22
    new-instance v1, La/t1l0;

    .line 23
    .line 24
    sget-object v2, La/p1l0;->c:La/p1l0;

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
    move-result-wide p5

    .line 38
    new-instance v3, La/y3d;

    .line 39
    .line 40
    invoke-direct {v3, p5, p6}, La/y3d;-><init>(J)V

    .line 41
    .line 42
    .line 43
    const/16 v8, 0xc0

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    move-object v4, p4

    .line 48
    invoke-direct/range {v1 .. v8}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, La/d7l0;->f:La/t1l0;

    .line 52
    .line 53
    new-instance p1, La/e3l0;

    .line 54
    .line 55
    new-instance p4, La/kpe;

    .line 56
    .line 57
    invoke-direct {p4}, La/kpe;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2, p4, p3, v0}, La/e3l0;-><init>(ILa/ope;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/d7l0;->g:La/e3l0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d7l0;->f:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d7l0;->g:La/e3l0;

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
    instance-of v0, p1, La/d7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/d7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/d7l0;->a:La/a2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/d7l0;->a:La/a2l0;

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
    iget v0, p0, La/d7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/d7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget v0, p0, La/d7l0;->c:I

    .line 30
    .line 31
    iget v1, p1, La/d7l0;->c:I

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object v0, p0, La/d7l0;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, p1, La/d7l0;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-object p0, p0, La/d7l0;->e:La/uf5;

    .line 48
    .line 49
    iget-object p1, p1, La/d7l0;->e:La/uf5;

    .line 50
    .line 51
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

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
    iget-object p0, p0, La/d7l0;->a:La/a2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/d7l0;->a:La/a2l0;

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
    iget v2, p0, La/d7l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/d7l0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    iget-object v2, p0, La/d7l0;->d:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move v2, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_0
    add-int/2addr v0, v2

    .line 34
    mul-int/lit16 v0, v0, 0x745f

    .line 35
    .line 36
    iget-object p0, p0, La/d7l0;->e:La/uf5;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_1
    add-int/2addr v0, v1

    .line 46
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

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
    iget-object v1, p0, La/d7l0;->a:La/a2l0;

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
    iget v1, p0, La/d7l0;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", actionIconResId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconUrl="

    .line 29
    .line 30
    const-string v2, ", iconResId=null, iconColor=null, badgeStyle="

    .line 31
    .line 32
    iget v3, p0, La/d7l0;->c:I

    .line 33
    .line 34
    iget-object v4, p0, La/d7l0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/d7l0;->e:La/uf5;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ")"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
