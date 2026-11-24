.class public final La/mka;
.super La/ofs;
.source "SourceFile"


# instance fields
.field public final b:La/ank0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:La/ank0;

.field public final g:La/hg30;

.field public final h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

.field public final i:Z


# direct methods
.method public constructor <init>(La/ank0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/ank0;La/hg30;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mka;->b:La/ank0;

    .line 5
    .line 6
    iput-object p2, p0, La/mka;->c:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, La/mka;->d:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, La/mka;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, La/mka;->f:La/ank0;

    .line 13
    .line 14
    iput-object p6, p0, La/mka;->g:La/hg30;

    .line 15
    .line 16
    iput-object p7, p0, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 17
    .line 18
    iput-boolean p8, p0, La/mka;->i:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;
    .locals 0

    .line 1
    iget-object p0, p0, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)La/ofs;
    .locals 9

    .line 1
    new-instance v0, La/mka;

    .line 2
    .line 3
    iget-object v1, p0, La/mka;->b:La/ank0;

    .line 4
    .line 5
    iget-object v2, p0, La/mka;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, La/mka;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/mka;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, La/mka;->f:La/ank0;

    .line 12
    .line 13
    iget-object v6, p0, La/mka;->g:La/hg30;

    .line 14
    .line 15
    iget-boolean v8, p0, La/mka;->i:Z

    .line 16
    .line 17
    move-object v7, p1

    .line 18
    invoke-direct/range {v0 .. v8}, La/mka;-><init>(La/ank0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/ank0;La/hg30;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
    instance-of v0, p1, La/mka;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/mka;

    .line 10
    .line 11
    iget-object v0, p0, La/mka;->b:La/ank0;

    .line 12
    .line 13
    iget-object v1, p1, La/mka;->b:La/ank0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/ank0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/mka;->c:Ljava/util/List;

    .line 23
    .line 24
    iget-object v1, p1, La/mka;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/mka;->d:Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, p1, La/mka;->d:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/mka;->e:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/mka;->e:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/mka;->f:La/ank0;

    .line 56
    .line 57
    iget-object v1, p1, La/mka;->f:La/ank0;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/ank0;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/mka;->g:La/hg30;

    .line 67
    .line 68
    iget-object v1, p1, La/mka;->g:La/hg30;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/hg30;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 78
    .line 79
    iget-object v1, p1, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-boolean p0, p0, La/mka;->i:Z

    .line 89
    .line 90
    iget-boolean p1, p1, La/mka;->i:Z

    .line 91
    .line 92
    if-eq p0, p1, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p0, 0x0

    .line 95
    return p0

    .line 96
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 97
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/mka;->b:La/ank0;

    .line 2
    .line 3
    iget-object v0, v0, La/ank0;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, La/mka;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, La/mka;->d:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/mka;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/mka;->f:La/ank0;

    .line 31
    .line 32
    iget-object v2, v2, La/ank0;->a:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/mka;->g:La/hg30;

    .line 39
    .line 40
    invoke-virtual {v2}, La/hg30;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v0

    .line 45
    mul-int/2addr v2, v1

    .line 46
    iget-object v0, p0, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 47
    .line 48
    invoke-virtual {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-boolean p0, p0, La/mka;->i:Z

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CardMultiTeamsLiveUiModel(score="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/mka;->b:La/ank0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", teamOneMultiTeams="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/mka;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", teamTwoMultiTeams="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", matchDescription="

    .line 29
    .line 30
    const-string v2, ", matchPeriodInfo="

    .line 31
    .line 32
    iget-object v3, p0, La/mka;->e:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/mka;->d:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v1, v3, v2, v0, v4}, La/h97;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/mka;->f:La/ank0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", matchTimerUiModel="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/mka;->g:La/hg30;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", cardIdentity="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/mka;->h:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", rtlSupport="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean p0, p0, La/mka;->i:Z

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
