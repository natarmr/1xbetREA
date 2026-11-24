.class public final La/n9b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:La/hab0;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:La/hab0;


# direct methods
.method public constructor <init>(IZZZZLa/hab0;ZZZLa/hab0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/n9b0;->a:I

    .line 5
    .line 6
    iput-boolean p2, p0, La/n9b0;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La/n9b0;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/n9b0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/n9b0;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, La/n9b0;->f:La/hab0;

    .line 15
    .line 16
    iput-boolean p7, p0, La/n9b0;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, La/n9b0;->h:Z

    .line 19
    .line 20
    iput-boolean p9, p0, La/n9b0;->i:Z

    .line 21
    .line 22
    iput-object p10, p0, La/n9b0;->j:La/hab0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/n9b0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/n9b0;->c:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, La/n9b0;->g:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/n9b0;->f:La/hab0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/hab0;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/n9b0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/n9b0;->i:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/n9b0;->j:La/hab0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/hab0;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-boolean p0, p0, La/n9b0;->c:Z

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/n9b0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, La/n9b0;

    .line 12
    .line 13
    iget v1, p0, La/n9b0;->a:I

    .line 14
    .line 15
    iget v3, p1, La/n9b0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-boolean v1, p0, La/n9b0;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, La/n9b0;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget-boolean v1, p0, La/n9b0;->c:Z

    .line 28
    .line 29
    iget-boolean v3, p1, La/n9b0;->c:Z

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-boolean v1, p0, La/n9b0;->d:Z

    .line 35
    .line 36
    iget-boolean v3, p1, La/n9b0;->d:Z

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    iget-boolean v1, p0, La/n9b0;->e:Z

    .line 42
    .line 43
    iget-boolean v3, p1, La/n9b0;->e:Z

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_6
    iget-object v1, p0, La/n9b0;->f:La/hab0;

    .line 49
    .line 50
    iget-object v3, p1, La/n9b0;->f:La/hab0;

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget-boolean v1, p0, La/n9b0;->g:Z

    .line 56
    .line 57
    iget-boolean v3, p1, La/n9b0;->g:Z

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_8
    iget-boolean v1, p0, La/n9b0;->h:Z

    .line 63
    .line 64
    iget-boolean v3, p1, La/n9b0;->h:Z

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_9
    iget-boolean v1, p0, La/n9b0;->i:Z

    .line 70
    .line 71
    iget-boolean v3, p1, La/n9b0;->i:Z

    .line 72
    .line 73
    if-eq v1, v3, :cond_a

    .line 74
    .line 75
    :goto_0
    return v2

    .line 76
    :cond_a
    iget-object p0, p0, La/n9b0;->j:La/hab0;

    .line 77
    .line 78
    iget-object p1, p1, La/n9b0;->j:La/hab0;

    .line 79
    .line 80
    if-eq p0, p1, :cond_b

    .line 81
    .line 82
    return v2

    .line 83
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/n9b0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-boolean v2, p0, La/n9b0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/n9b0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/n9b0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/n9b0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/n9b0;->f:La/hab0;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-boolean v0, p0, La/n9b0;->g:Z

    .line 43
    .line 44
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/n9b0;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/n9b0;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object p0, p0, La/n9b0;->j:La/hab0;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v0

    .line 67
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isLowMemory="

    .line 2
    .line 3
    const-string v1, ", isBettingDisable="

    .line 4
    .line 5
    iget v2, p0, La/n9b0;->a:I

    .line 6
    .line 7
    const-string v3, "PopularClassicScreenSettingsModel(filterCount="

    .line 8
    .line 9
    iget-boolean v4, p0, La/n9b0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/h97;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", hasStream="

    .line 16
    .line 17
    const-string v2, ", isTablet="

    .line 18
    .line 19
    iget-boolean v3, p0, La/n9b0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/n9b0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, La/n9b0;->e:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", isBannersLocalEnable="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/n9b0;->f:La/hab0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", isBannersEnable="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", isOneXGamesEnable="

    .line 47
    .line 48
    const-string v2, ", isPopularGamesCaruselEnable="

    .line 49
    .line 50
    iget-boolean v3, p0, La/n9b0;->g:Z

    .line 51
    .line 52
    iget-boolean v4, p0, La/n9b0;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, La/n9b0;->i:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", isOneXGamesLocalEnable="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/n9b0;->j:La/hab0;

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, ")"

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
