.class public final La/ech;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hdh;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:I

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:La/vbb0;

.field public final l:La/cbe0;

.field public final m:La/nnu0;

.field public final n:I

.field public final o:La/g5h;

.field public final p:Ljava/util/List;

.field public final q:La/n2o;


# direct methods
.method public constructor <init>(La/hdh;ZZZLjava/lang/String;ZILjava/util/List;Ljava/util/List;Ljava/util/List;La/vbb0;La/cbe0;La/nnu0;ILa/g5h;Ljava/util/List;La/n2o;)V
    .locals 1

    .line 1
    move-object/from16 v0, p16

    .line 2
    .line 3
    invoke-static {p8, p9, p10, v0}, La/hne;->C(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/ech;->a:La/hdh;

    .line 10
    .line 11
    iput-boolean p2, p0, La/ech;->b:Z

    .line 12
    .line 13
    iput-boolean p3, p0, La/ech;->c:Z

    .line 14
    .line 15
    iput-boolean p4, p0, La/ech;->d:Z

    .line 16
    .line 17
    iput-object p5, p0, La/ech;->e:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p6, p0, La/ech;->f:Z

    .line 20
    .line 21
    iput p7, p0, La/ech;->g:I

    .line 22
    .line 23
    iput-object p8, p0, La/ech;->h:Ljava/util/List;

    .line 24
    .line 25
    iput-object p9, p0, La/ech;->i:Ljava/util/List;

    .line 26
    .line 27
    iput-object p10, p0, La/ech;->j:Ljava/util/List;

    .line 28
    .line 29
    iput-object p11, p0, La/ech;->k:La/vbb0;

    .line 30
    .line 31
    iput-object p12, p0, La/ech;->l:La/cbe0;

    .line 32
    .line 33
    iput-object p13, p0, La/ech;->m:La/nnu0;

    .line 34
    .line 35
    iput p14, p0, La/ech;->n:I

    .line 36
    .line 37
    move-object/from16 p1, p15

    .line 38
    .line 39
    iput-object p1, p0, La/ech;->o:La/g5h;

    .line 40
    .line 41
    iput-object v0, p0, La/ech;->p:Ljava/util/List;

    .line 42
    .line 43
    move-object/from16 p1, p17

    .line 44
    .line 45
    iput-object p1, p0, La/ech;->q:La/n2o;

    .line 46
    .line 47
    return-void
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
    instance-of v0, p1, La/ech;

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
    check-cast p1, La/ech;

    .line 13
    .line 14
    iget-object v0, p0, La/ech;->a:La/hdh;

    .line 15
    .line 16
    iget-object v2, p1, La/ech;->a:La/hdh;

    .line 17
    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    return v1

    .line 21
    :cond_2
    iget-boolean v0, p0, La/ech;->b:Z

    .line 22
    .line 23
    iget-boolean v2, p1, La/ech;->b:Z

    .line 24
    .line 25
    if-eq v0, v2, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-boolean v0, p0, La/ech;->c:Z

    .line 30
    .line 31
    iget-boolean v2, p1, La/ech;->c:Z

    .line 32
    .line 33
    if-eq v0, v2, :cond_4

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_4
    iget-boolean v0, p0, La/ech;->d:Z

    .line 38
    .line 39
    iget-boolean v2, p1, La/ech;->d:Z

    .line 40
    .line 41
    if-eq v0, v2, :cond_5

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_5
    iget-object v0, p0, La/ech;->e:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, p1, La/ech;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_6
    iget-boolean v0, p0, La/ech;->f:Z

    .line 58
    .line 59
    iget-boolean v2, p1, La/ech;->f:Z

    .line 60
    .line 61
    if-eq v0, v2, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget v0, p0, La/ech;->g:I

    .line 65
    .line 66
    iget v2, p1, La/ech;->g:I

    .line 67
    .line 68
    if-eq v0, v2, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-object v0, p0, La/ech;->h:Ljava/util/List;

    .line 72
    .line 73
    iget-object v2, p1, La/ech;->h:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_9

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_9
    iget-object v0, p0, La/ech;->i:Ljava/util/List;

    .line 83
    .line 84
    iget-object v2, p1, La/ech;->i:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-object v0, p0, La/ech;->j:Ljava/util/List;

    .line 94
    .line 95
    iget-object v2, p1, La/ech;->j:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_b

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_b
    iget-object v0, p0, La/ech;->k:La/vbb0;

    .line 105
    .line 106
    iget-object v2, p1, La/ech;->k:La/vbb0;

    .line 107
    .line 108
    if-eq v0, v2, :cond_c

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_c
    iget-object v0, p0, La/ech;->l:La/cbe0;

    .line 112
    .line 113
    iget-object v2, p1, La/ech;->l:La/cbe0;

    .line 114
    .line 115
    if-eq v0, v2, :cond_d

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_d
    iget-object v0, p0, La/ech;->m:La/nnu0;

    .line 119
    .line 120
    iget-object v2, p1, La/ech;->m:La/nnu0;

    .line 121
    .line 122
    if-eq v0, v2, :cond_e

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_e
    iget v0, p0, La/ech;->n:I

    .line 126
    .line 127
    iget v2, p1, La/ech;->n:I

    .line 128
    .line 129
    if-eq v0, v2, :cond_f

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_f
    iget-object v0, p0, La/ech;->o:La/g5h;

    .line 133
    .line 134
    iget-object v2, p1, La/ech;->o:La/g5h;

    .line 135
    .line 136
    if-eq v0, v2, :cond_10

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_10
    iget-object v0, p0, La/ech;->p:Ljava/util/List;

    .line 140
    .line 141
    iget-object v2, p1, La/ech;->p:Ljava/util/List;

    .line 142
    .line 143
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_11

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_11
    iget-object p0, p0, La/ech;->q:La/n2o;

    .line 151
    .line 152
    iget-object p1, p1, La/ech;->q:La/n2o;

    .line 153
    .line 154
    if-eq p0, p1, :cond_12

    .line 155
    .line 156
    :goto_0
    return v1

    .line 157
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 158
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ech;->a:La/hdh;

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
    iget-boolean v2, p0, La/ech;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/ech;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/ech;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/ech;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/ech;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/ech;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/ech;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/ech;->i:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/ech;->j:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/ech;->k:La/vbb0;

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
    iget-object v0, p0, La/ech;->l:La/cbe0;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v2

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget-object v2, p0, La/ech;->m:La/nnu0;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    add-int/2addr v2, v0

    .line 87
    mul-int/2addr v2, v1

    .line 88
    iget v0, p0, La/ech;->n:I

    .line 89
    .line 90
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, La/ech;->o:La/g5h;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    add-int/2addr v2, v0

    .line 101
    mul-int/2addr v2, v1

    .line 102
    iget-object v0, p0, La/ech;->p:Ljava/util/List;

    .line 103
    .line 104
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object p0, p0, La/ech;->q:La/n2o;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    add-int/2addr p0, v0

    .line 115
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CyberRemoteConfigModel(cyberSportSettingsModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ech;->a:La/hdh;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", hasCyberSport="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/ech;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", hasCyberOnboarding="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", hasUFC="

    .line 29
    .line 30
    const-string v2, ", esportsBannerStyle="

    .line 31
    .line 32
    iget-boolean v3, p0, La/ech;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/ech;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", cyberChampTabletNewImageEnabled="

    .line 40
    .line 41
    const-string v2, ", cyberGeneralChampId="

    .line 42
    .line 43
    iget-object v3, p0, La/ech;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v4, p0, La/ech;->f:Z

    .line 46
    .line 47
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", cyberGeneralChampSportsId="

    .line 51
    .line 52
    const-string v2, ", cyberGeneralChampSportsDates="

    .line 53
    .line 54
    iget v3, p0, La/ech;->g:I

    .line 55
    .line 56
    iget-object v4, p0, La/ech;->h:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v3, v1, v2, v0, v4}, La/ohs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", cyberGeneralChampSportsChampId="

    .line 62
    .line 63
    const-string v2, ", popularEsportsBannerStyle="

    .line 64
    .line 65
    iget-object v3, p0, La/ech;->i:Ljava/util/List;

    .line 66
    .line 67
    iget-object v4, p0, La/ech;->j:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, La/ech;->k:La/vbb0;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", realEsportsBannerStyle="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/ech;->l:La/cbe0;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", virtualEsportsBannerStyle="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, La/ech;->m:La/nnu0;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", esportsButtonImage="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v1, p0, La/ech;->n:I

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", cyberMainScreenStyle="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, La/ech;->o:La/g5h;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, ", hltvChampIds="

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, La/ech;->p:Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v1, ", esportsDisciplineScreenStyle="

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, La/ech;->q:La/n2o;

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p0, ")"

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
.end method
