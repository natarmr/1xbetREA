.class public final La/nkg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/Map;

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:F

.field public final j:F

.field public final k:F

.field public final l:F

.field public final m:F

.field public final n:F


# direct methods
.method public constructor <init>(ZLjava/util/Map;FFFFFFFFFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/nkg0;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/nkg0;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput p3, p0, La/nkg0;->c:F

    .line 9
    .line 10
    iput p4, p0, La/nkg0;->d:F

    .line 11
    .line 12
    iput p5, p0, La/nkg0;->e:F

    .line 13
    .line 14
    iput p6, p0, La/nkg0;->f:F

    .line 15
    .line 16
    iput p7, p0, La/nkg0;->g:F

    .line 17
    .line 18
    iput p8, p0, La/nkg0;->h:F

    .line 19
    .line 20
    iput p9, p0, La/nkg0;->i:F

    .line 21
    .line 22
    iput p10, p0, La/nkg0;->j:F

    .line 23
    .line 24
    iput p11, p0, La/nkg0;->k:F

    .line 25
    .line 26
    iput p12, p0, La/nkg0;->l:F

    .line 27
    .line 28
    iput p13, p0, La/nkg0;->m:F

    .line 29
    .line 30
    iput p14, p0, La/nkg0;->n:F

    .line 31
    .line 32
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
    instance-of v0, p1, La/nkg0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/nkg0;

    .line 12
    .line 13
    iget-boolean v0, p0, La/nkg0;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/nkg0;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/nkg0;->b:Ljava/util/Map;

    .line 22
    .line 23
    iget-object v1, p1, La/nkg0;->b:Ljava/util/Map;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget v0, p0, La/nkg0;->c:F

    .line 34
    .line 35
    iget v1, p1, La/nkg0;->c:F

    .line 36
    .line 37
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget v0, p0, La/nkg0;->d:F

    .line 46
    .line 47
    iget v1, p1, La/nkg0;->d:F

    .line 48
    .line 49
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget v0, p0, La/nkg0;->e:F

    .line 58
    .line 59
    iget v1, p1, La/nkg0;->e:F

    .line 60
    .line 61
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget v0, p0, La/nkg0;->f:F

    .line 69
    .line 70
    iget v1, p1, La/nkg0;->f:F

    .line 71
    .line 72
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget v0, p0, La/nkg0;->g:F

    .line 80
    .line 81
    iget v1, p1, La/nkg0;->g:F

    .line 82
    .line 83
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    iget v0, p0, La/nkg0;->h:F

    .line 91
    .line 92
    iget v1, p1, La/nkg0;->h:F

    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_9

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_9
    iget v0, p0, La/nkg0;->i:F

    .line 102
    .line 103
    iget v1, p1, La/nkg0;->i:F

    .line 104
    .line 105
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_a

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_a
    iget v0, p0, La/nkg0;->j:F

    .line 113
    .line 114
    iget v1, p1, La/nkg0;->j:F

    .line 115
    .line 116
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_b

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_b
    iget v0, p0, La/nkg0;->k:F

    .line 124
    .line 125
    iget v1, p1, La/nkg0;->k:F

    .line 126
    .line 127
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_c
    iget v0, p0, La/nkg0;->l:F

    .line 135
    .line 136
    iget v1, p1, La/nkg0;->l:F

    .line 137
    .line 138
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_d

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_d
    iget v0, p0, La/nkg0;->m:F

    .line 146
    .line 147
    iget v1, p1, La/nkg0;->m:F

    .line 148
    .line 149
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_e

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_e
    iget p0, p0, La/nkg0;->n:F

    .line 157
    .line 158
    iget p1, p1, La/nkg0;->n:F

    .line 159
    .line 160
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_f

    .line 165
    .line 166
    :goto_0
    const/4 p0, 0x0

    .line 167
    return p0

    .line 168
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 169
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/nkg0;->a:Z

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
    iget-object v2, p0, La/nkg0;->b:Ljava/util/Map;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/nkg0;->c:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/nkg0;->d:F

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/nkg0;->e:F

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/nkg0;->f:F

    .line 35
    .line 36
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/nkg0;->g:F

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/nkg0;->h:F

    .line 47
    .line 48
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/nkg0;->i:F

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/nkg0;->j:F

    .line 59
    .line 60
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/nkg0;->k:F

    .line 65
    .line 66
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v2, p0, La/nkg0;->l:F

    .line 71
    .line 72
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, La/nkg0;->m:F

    .line 77
    .line 78
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget p0, p0, La/nkg0;->n:F

    .line 83
    .line 84
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget v0, p0, La/nkg0;->c:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/nkg0;->d:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/nkg0;->e:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, La/nkg0;->f:F

    .line 20
    .line 21
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, La/nkg0;->i:F

    .line 26
    .line 27
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget v5, p0, La/nkg0;->j:F

    .line 32
    .line 33
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget v6, p0, La/nkg0;->k:F

    .line 38
    .line 39
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget v7, p0, La/nkg0;->l:F

    .line 44
    .line 45
    invoke-static {v7}, La/ycl;->c(F)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget v8, p0, La/nkg0;->m:F

    .line 50
    .line 51
    invoke-static {v8}, La/ycl;->c(F)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    iget v9, p0, La/nkg0;->n:F

    .line 56
    .line 57
    invoke-static {v9}, La/ycl;->c(F)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    new-instance v10, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v11, "RpsUiConfig(configIsReady="

    .line 64
    .line 65
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-boolean v11, p0, La/nkg0;->a:Z

    .line 69
    .line 70
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v11, ", animationParams="

    .line 74
    .line 75
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v11, p0, La/nkg0;->b:Ljava/util/Map;

    .line 79
    .line 80
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v11, ", tableHeight="

    .line 84
    .line 85
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v11, ", tableWidth="

    .line 89
    .line 90
    const-string v12, ", playerSize="

    .line 91
    .line 92
    invoke-static {v10, v0, v11, v1, v12}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v0, ", handSize="

    .line 96
    .line 97
    const-string v1, ", handTranslationY="

    .line 98
    .line 99
    invoke-static {v10, v2, v0, v3, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v0, ", centralHandTranslationY="

    .line 103
    .line 104
    const-string v1, ", handsOffsetByX="

    .line 105
    .line 106
    iget v2, p0, La/nkg0;->g:F

    .line 107
    .line 108
    iget p0, p0, La/nkg0;->h:F

    .line 109
    .line 110
    invoke-static {v10, v2, v0, p0, v1}, La/vqd;->v(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string p0, ", topPlayersOffestByX="

    .line 114
    .line 115
    const-string v0, ", bottomPlayersOffsetByX="

    .line 116
    .line 117
    invoke-static {v10, v4, p0, v5, v0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string p0, ", winPlayerSize="

    .line 121
    .line 122
    const-string v0, ", winTitleHeight="

    .line 123
    .line 124
    invoke-static {v10, v6, p0, v7, v0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string p0, ", winTitleWidth="

    .line 128
    .line 129
    const-string v0, ")"

    .line 130
    .line 131
    invoke-static {v10, v8, p0, v9, v0}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method
