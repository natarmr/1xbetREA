.class public final La/mmc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:La/gfe;

.field public final e:La/gfe;

.field public final f:La/gfe;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:La/qho;

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLa/gfe;La/gfe;La/gfe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/qho;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p7, p8, p9}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mmc0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/mmc0;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/mmc0;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/mmc0;->d:La/gfe;

    .line 14
    .line 15
    iput-object p5, p0, La/mmc0;->e:La/gfe;

    .line 16
    .line 17
    iput-object p6, p0, La/mmc0;->f:La/gfe;

    .line 18
    .line 19
    iput-object p7, p0, La/mmc0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p8, p0, La/mmc0;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p9, p0, La/mmc0;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p10, p0, La/mmc0;->j:La/qho;

    .line 26
    .line 27
    iput-object p11, p0, La/mmc0;->k:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;
    .locals 12

    .line 1
    iget-object v1, p0, La/mmc0;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v2, p0, La/mmc0;->b:Z

    .line 4
    .line 5
    iget-boolean v3, p0, La/mmc0;->c:Z

    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, La/mmc0;->d:La/gfe;

    .line 12
    .line 13
    :cond_0
    move-object v4, p1

    .line 14
    and-int/lit8 p1, p4, 0x10

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p2, p0, La/mmc0;->e:La/gfe;

    .line 19
    .line 20
    :cond_1
    move-object v5, p2

    .line 21
    and-int/lit8 p1, p4, 0x20

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p3, p0, La/mmc0;->f:La/gfe;

    .line 26
    .line 27
    :cond_2
    move-object v6, p3

    .line 28
    iget-object v7, p0, La/mmc0;->g:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v8, p0, La/mmc0;->h:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v9, p0, La/mmc0;->i:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v10, p0, La/mmc0;->j:La/qho;

    .line 35
    .line 36
    iget-object v11, p0, La/mmc0;->k:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/mmc0;

    .line 54
    .line 55
    invoke-direct/range {v0 .. v11}, La/mmc0;-><init>(Ljava/lang/String;ZZLa/gfe;La/gfe;La/gfe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/qho;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/mmc0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/mmc0;

    .line 13
    .line 14
    iget-object v0, p0, La/mmc0;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p1, La/mmc0;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p0, La/mmc0;->b:Z

    .line 26
    .line 27
    iget-boolean v2, p1, La/mmc0;->b:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-boolean v0, p0, La/mmc0;->c:Z

    .line 33
    .line 34
    iget-boolean v2, p1, La/mmc0;->c:Z

    .line 35
    .line 36
    if-eq v0, v2, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    iget-object v0, p0, La/mmc0;->d:La/gfe;

    .line 40
    .line 41
    iget-object v2, p1, La/mmc0;->d:La/gfe;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-object v0, p0, La/mmc0;->e:La/gfe;

    .line 51
    .line 52
    iget-object v2, p1, La/mmc0;->e:La/gfe;

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-object v0, p0, La/mmc0;->f:La/gfe;

    .line 62
    .line 63
    iget-object v2, p1, La/mmc0;->f:La/gfe;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-object v0, p0, La/mmc0;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v2, p1, La/mmc0;->g:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-object v0, p0, La/mmc0;->h:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, p1, La/mmc0;->h:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-object v0, p0, La/mmc0;->i:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v2, p1, La/mmc0;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-object v0, p0, La/mmc0;->j:La/qho;

    .line 106
    .line 107
    iget-object v2, p1, La/mmc0;->j:La/qho;

    .line 108
    .line 109
    if-eq v0, v2, :cond_b

    .line 110
    .line 111
    return v1

    .line 112
    :cond_b
    iget-object p0, p0, La/mmc0;->k:Ljava/lang/String;

    .line 113
    .line 114
    iget-object p1, p1, La/mmc0;->k:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_c

    .line 121
    .line 122
    :goto_0
    return v1

    .line 123
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 124
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/mmc0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-boolean v2, p0, La/mmc0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/mmc0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/mmc0;->d:La/gfe;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, La/mmc0;->e:La/gfe;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, La/mmc0;->f:La/gfe;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v0

    .line 45
    mul-int/2addr v2, v1

    .line 46
    iget-object v0, p0, La/mmc0;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/mmc0;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/mmc0;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/mmc0;->j:La/qho;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-object p0, p0, La/mmc0;->k:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v2

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", hasBannerSection="

    .line 2
    .line 3
    const-string v1, ", hasGamesSection="

    .line 4
    .line 5
    const-string v2, "PromoListWithGamesInternalState(title="

    .line 6
    .line 7
    iget-object v3, p0, La/mmc0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/mmc0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, La/mmc0;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", bannerState="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/mmc0;->d:La/gfe;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", gamesState="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/mmc0;->e:La/gfe;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", menuState="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/mmc0;->f:La/gfe;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", gamesHeaderTitle="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", gamesAllButtonTitle="

    .line 56
    .line 57
    const-string v2, ", menuHeaderTitle="

    .line 58
    .line 59
    iget-object v3, p0, La/mmc0;->g:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v4, p0, La/mmc0;->h:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, La/mmc0;->i:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", eventStyledDrawableProvider="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/mmc0;->j:La/qho;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", loaltyProgramName="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ")"

    .line 87
    .line 88
    iget-object p0, p0, La/mmc0;->k:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method
