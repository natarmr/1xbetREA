.class public final La/oz50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/v5l0;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:La/y78;

.field public final l:La/wcb;

.field public final m:Ljava/util/List;

.field public final n:Z

.field public final o:La/ot0;

.field public final p:Z

.field public final q:La/xte;

.field public final r:Z


# direct methods
.method public constructor <init>(La/v5l0;ZLjava/lang/String;Ljava/lang/String;ZZZZZZLa/y78;La/wcb;Ljava/util/List;ZLa/ot0;ZLa/xte;Z)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/oz50;->a:La/v5l0;

    .line 17
    .line 18
    iput-boolean p2, p0, La/oz50;->b:Z

    .line 19
    .line 20
    iput-object p3, p0, La/oz50;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, La/oz50;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p5, p0, La/oz50;->e:Z

    .line 25
    .line 26
    iput-boolean p6, p0, La/oz50;->f:Z

    .line 27
    .line 28
    iput-boolean p7, p0, La/oz50;->g:Z

    .line 29
    .line 30
    iput-boolean p8, p0, La/oz50;->h:Z

    .line 31
    .line 32
    iput-boolean p9, p0, La/oz50;->i:Z

    .line 33
    .line 34
    iput-boolean p10, p0, La/oz50;->j:Z

    .line 35
    .line 36
    iput-object p11, p0, La/oz50;->k:La/y78;

    .line 37
    .line 38
    iput-object p12, p0, La/oz50;->l:La/wcb;

    .line 39
    .line 40
    iput-object p13, p0, La/oz50;->m:Ljava/util/List;

    .line 41
    .line 42
    iput-boolean p14, p0, La/oz50;->n:Z

    .line 43
    .line 44
    iput-object p15, p0, La/oz50;->o:La/ot0;

    .line 45
    .line 46
    move/from16 p1, p16

    .line 47
    .line 48
    iput-boolean p1, p0, La/oz50;->p:Z

    .line 49
    .line 50
    move-object/from16 p1, p17

    .line 51
    .line 52
    iput-object p1, p0, La/oz50;->q:La/xte;

    .line 53
    .line 54
    move/from16 p1, p18

    .line 55
    .line 56
    iput-boolean p1, p0, La/oz50;->r:Z

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/oz50;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/oz50;

    .line 12
    .line 13
    iget-object v0, p0, La/oz50;->a:La/v5l0;

    .line 14
    .line 15
    iget-object v1, p1, La/oz50;->a:La/v5l0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/oz50;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/oz50;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/oz50;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/oz50;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-object v0, p0, La/oz50;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, La/oz50;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-boolean v0, p0, La/oz50;->e:Z

    .line 54
    .line 55
    iget-boolean v1, p1, La/oz50;->e:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_6
    iget-boolean v0, p0, La/oz50;->f:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/oz50;->f:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_7

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_7
    iget-boolean v0, p0, La/oz50;->g:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/oz50;->g:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-boolean v0, p0, La/oz50;->h:Z

    .line 77
    .line 78
    iget-boolean v1, p1, La/oz50;->h:Z

    .line 79
    .line 80
    if-eq v0, v1, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-boolean v0, p0, La/oz50;->i:Z

    .line 84
    .line 85
    iget-boolean v1, p1, La/oz50;->i:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_a

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_a
    iget-boolean v0, p0, La/oz50;->j:Z

    .line 91
    .line 92
    iget-boolean v1, p1, La/oz50;->j:Z

    .line 93
    .line 94
    if-eq v0, v1, :cond_b

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_b
    iget-object v0, p0, La/oz50;->k:La/y78;

    .line 98
    .line 99
    iget-object v1, p1, La/oz50;->k:La/y78;

    .line 100
    .line 101
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_c

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_c
    iget-object v0, p0, La/oz50;->l:La/wcb;

    .line 109
    .line 110
    iget-object v1, p1, La/oz50;->l:La/wcb;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_d

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_d
    iget-object v0, p0, La/oz50;->m:Ljava/util/List;

    .line 120
    .line 121
    iget-object v1, p1, La/oz50;->m:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_e

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_e
    iget-boolean v0, p0, La/oz50;->n:Z

    .line 131
    .line 132
    iget-boolean v1, p1, La/oz50;->n:Z

    .line 133
    .line 134
    if-eq v0, v1, :cond_f

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_f
    iget-object v0, p0, La/oz50;->o:La/ot0;

    .line 138
    .line 139
    iget-object v1, p1, La/oz50;->o:La/ot0;

    .line 140
    .line 141
    if-eq v0, v1, :cond_10

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_10
    iget-boolean v0, p0, La/oz50;->p:Z

    .line 145
    .line 146
    iget-boolean v1, p1, La/oz50;->p:Z

    .line 147
    .line 148
    if-eq v0, v1, :cond_11

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_11
    iget-object v0, p0, La/oz50;->q:La/xte;

    .line 152
    .line 153
    iget-object v1, p1, La/oz50;->q:La/xte;

    .line 154
    .line 155
    if-eq v0, v1, :cond_12

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_12
    iget-boolean p0, p0, La/oz50;->r:Z

    .line 159
    .line 160
    iget-boolean p1, p1, La/oz50;->r:Z

    .line 161
    .line 162
    if-eq p0, p1, :cond_13

    .line 163
    .line 164
    :goto_0
    const/4 p0, 0x0

    .line 165
    return p0

    .line 166
    :cond_13
    :goto_1
    const/4 p0, 0x1

    .line 167
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/oz50;->a:La/v5l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, La/oz50;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/oz50;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/oz50;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/oz50;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/oz50;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/oz50;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/oz50;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/oz50;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/oz50;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/oz50;->k:La/y78;

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
    iget-object v0, p0, La/oz50;->l:La/wcb;

    .line 73
    .line 74
    invoke-virtual {v0}, La/wcb;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v2

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget-object v2, p0, La/oz50;->m:Ljava/util/List;

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-boolean v2, p0, La/oz50;->n:Z

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, La/oz50;->o:La/ot0;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-int/2addr v2, v0

    .line 99
    mul-int/2addr v2, v1

    .line 100
    iget-boolean v0, p0, La/oz50;->p:Z

    .line 101
    .line 102
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v2, p0, La/oz50;->q:La/xte;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/2addr v2, v0

    .line 113
    mul-int/2addr v2, v1

    .line 114
    iget-boolean p0, p0, La/oz50;->r:Z

    .line 115
    .line 116
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    add-int/2addr p0, v2

    .line 121
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NoTabsDashboardConfig(sportEventCardStyle="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/oz50;->a:La/v5l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", hasStream="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/oz50;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", accountControlStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", xGamesName="

    .line 29
    .line 30
    const-string v2, ", hasXGames="

    .line 31
    .line 32
    iget-object v3, p0, La/oz50;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/oz50;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", hasTeamBet="

    .line 40
    .line 41
    const-string v2, ", isVirtual="

    .line 42
    .line 43
    iget-boolean v3, p0, La/oz50;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/oz50;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", isAggregator="

    .line 51
    .line 52
    const-string v2, ", isNewEventParams="

    .line 53
    .line 54
    iget-boolean v3, p0, La/oz50;->g:Z

    .line 55
    .line 56
    iget-boolean v4, p0, La/oz50;->h:Z

    .line 57
    .line 58
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", bettingDisabled="

    .line 62
    .line 63
    const-string v2, ", gameUtilsProvider="

    .line 64
    .line 65
    iget-boolean v3, p0, La/oz50;->i:Z

    .line 66
    .line 67
    iget-boolean v4, p0, La/oz50;->j:Z

    .line 68
    .line 69
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, La/oz50;->k:La/y78;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", champImagesHolder="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/oz50;->l:La/wcb;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", specialEvents="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", isTablet="

    .line 93
    .line 94
    const-string v2, ", aggregatorGameCardCollectionStyle="

    .line 95
    .line 96
    iget-object v3, p0, La/oz50;->m:Ljava/util/List;

    .line 97
    .line 98
    iget-boolean v4, p0, La/oz50;->n:Z

    .line 99
    .line 100
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, La/oz50;->o:La/ot0;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ", supportRtl="

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-boolean v1, p0, La/oz50;->p:Z

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v1, ", couponCardStyleType="

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, La/oz50;->q:La/xte;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", altStyleEnabled="

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-boolean p0, p0, La/oz50;->r:Z

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p0, ")"

    .line 139
    .line 140
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method
