.class public final La/z4b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:La/vcp;

.field public final i:Z

.field public final j:Z


# direct methods
.method public constructor <init>(ZZZZZLjava/lang/String;Ljava/lang/String;La/vcp;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/z4b;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/z4b;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La/z4b;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/z4b;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/z4b;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, La/z4b;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, La/z4b;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, La/z4b;->h:La/vcp;

    .line 19
    .line 20
    iput-boolean p9, p0, La/z4b;->i:Z

    .line 21
    .line 22
    iput-boolean p10, p0, La/z4b;->j:Z

    .line 23
    .line 24
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
    instance-of v0, p1, La/z4b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/z4b;

    .line 10
    .line 11
    iget-boolean v0, p0, La/z4b;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/z4b;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/z4b;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/z4b;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/z4b;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/z4b;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean v0, p0, La/z4b;->d:Z

    .line 33
    .line 34
    iget-boolean v1, p1, La/z4b;->d:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-boolean v0, p0, La/z4b;->e:Z

    .line 40
    .line 41
    iget-boolean v1, p1, La/z4b;->e:Z

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget-object v0, p0, La/z4b;->f:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, La/z4b;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_7

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_7
    iget-object v0, p0, La/z4b;->g:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/z4b;->g:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-object v0, p0, La/z4b;->h:La/vcp;

    .line 69
    .line 70
    iget-object v1, p1, La/z4b;->h:La/vcp;

    .line 71
    .line 72
    if-eq v0, v1, :cond_9

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_9
    iget-boolean v0, p0, La/z4b;->i:Z

    .line 76
    .line 77
    iget-boolean v1, p1, La/z4b;->i:Z

    .line 78
    .line 79
    if-eq v0, v1, :cond_a

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_a
    iget-boolean p0, p0, La/z4b;->j:Z

    .line 83
    .line 84
    iget-boolean p1, p1, La/z4b;->j:Z

    .line 85
    .line 86
    if-eq p0, p1, :cond_b

    .line 87
    .line 88
    :goto_0
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 91
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/z4b;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/z4b;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/z4b;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/z4b;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/z4b;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/z4b;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/z4b;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/z4b;->h:La/vcp;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    iget-boolean v0, p0, La/z4b;->i:Z

    .line 55
    .line 56
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean p0, p0, La/z4b;->j:Z

    .line 61
    .line 62
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v0, ", hasPopularBalance="

    .line 2
    .line 3
    const-string v1, ", hasSectionXGames="

    .line 4
    .line 5
    const-string v2, "CategoryImageHeaderConfig(isBettingDisabled="

    .line 6
    .line 7
    iget-boolean v3, p0, La/z4b;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/z4b;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", hasSectionAggregator="

    .line 16
    .line 17
    const-string v2, ", hasSectionVirtual="

    .line 18
    .line 19
    iget-boolean v3, p0, La/z4b;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/z4b;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", accountControlStyle="

    .line 27
    .line 28
    const-string v2, ", xGameName="

    .line 29
    .line 30
    iget-object v3, p0, La/z4b;->f:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v4, p0, La/z4b;->e:Z

    .line 33
    .line 34
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/z4b;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", favoriteStyle="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/z4b;->h:La/vcp;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", hasTeamBet="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", isTablet="

    .line 58
    .line 59
    const-string v2, ")"

    .line 60
    .line 61
    iget-boolean v3, p0, La/z4b;->i:Z

    .line 62
    .line 63
    iget-boolean p0, p0, La/z4b;->j:Z

    .line 64
    .line 65
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
