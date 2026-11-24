.class public final La/mpo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:La/qil0;

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:La/y9q0;

.field public final i:F

.field public final j:La/y9q0;

.field public final k:F

.field public final l:Z

.field public final m:Z


# direct methods
.method public constructor <init>(FFLa/qil0;FFFFLa/y9q0;FLa/y9q0;FZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/mpo;->a:F

    .line 5
    .line 6
    iput p2, p0, La/mpo;->b:F

    .line 7
    .line 8
    iput-object p3, p0, La/mpo;->c:La/qil0;

    .line 9
    .line 10
    iput p4, p0, La/mpo;->d:F

    .line 11
    .line 12
    iput p5, p0, La/mpo;->e:F

    .line 13
    .line 14
    iput p6, p0, La/mpo;->f:F

    .line 15
    .line 16
    iput p7, p0, La/mpo;->g:F

    .line 17
    .line 18
    iput-object p8, p0, La/mpo;->h:La/y9q0;

    .line 19
    .line 20
    iput p9, p0, La/mpo;->i:F

    .line 21
    .line 22
    iput-object p10, p0, La/mpo;->j:La/y9q0;

    .line 23
    .line 24
    iput p11, p0, La/mpo;->k:F

    .line 25
    .line 26
    iput-boolean p12, p0, La/mpo;->l:Z

    .line 27
    .line 28
    iput-boolean p13, p0, La/mpo;->m:Z

    .line 29
    .line 30
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
    instance-of v0, p1, La/mpo;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/mpo;

    .line 12
    .line 13
    iget v0, p0, La/mpo;->a:F

    .line 14
    .line 15
    iget v1, p1, La/mpo;->a:F

    .line 16
    .line 17
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget v0, p0, La/mpo;->b:F

    .line 26
    .line 27
    iget v1, p1, La/mpo;->b:F

    .line 28
    .line 29
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/mpo;->c:La/qil0;

    .line 38
    .line 39
    iget-object v1, p1, La/mpo;->c:La/qil0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget v0, p0, La/mpo;->d:F

    .line 50
    .line 51
    iget v1, p1, La/mpo;->d:F

    .line 52
    .line 53
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    iget v0, p0, La/mpo;->e:F

    .line 61
    .line 62
    iget v1, p1, La/mpo;->e:F

    .line 63
    .line 64
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_6
    iget v0, p0, La/mpo;->f:F

    .line 72
    .line 73
    iget v1, p1, La/mpo;->f:F

    .line 74
    .line 75
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    iget v0, p0, La/mpo;->g:F

    .line 83
    .line 84
    iget v1, p1, La/mpo;->g:F

    .line 85
    .line 86
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_8
    iget-object v0, p0, La/mpo;->h:La/y9q0;

    .line 94
    .line 95
    iget-object v1, p1, La/mpo;->h:La/y9q0;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    iget v0, p0, La/mpo;->i:F

    .line 105
    .line 106
    iget v1, p1, La/mpo;->i:F

    .line 107
    .line 108
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_a

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_a
    iget-object v0, p0, La/mpo;->j:La/y9q0;

    .line 116
    .line 117
    iget-object v1, p1, La/mpo;->j:La/y9q0;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_b

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_b
    iget v0, p0, La/mpo;->k:F

    .line 127
    .line 128
    iget v1, p1, La/mpo;->k:F

    .line 129
    .line 130
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_c

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_c
    iget-boolean v0, p0, La/mpo;->l:Z

    .line 138
    .line 139
    iget-boolean v1, p1, La/mpo;->l:Z

    .line 140
    .line 141
    if-eq v0, v1, :cond_d

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_d
    iget-boolean p0, p0, La/mpo;->m:Z

    .line 145
    .line 146
    iget-boolean p1, p1, La/mpo;->m:Z

    .line 147
    .line 148
    if-eq p0, p1, :cond_e

    .line 149
    .line 150
    :goto_0
    const/4 p0, 0x0

    .line 151
    return p0

    .line 152
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 153
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/mpo;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, La/mpo;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/mpo;->c:La/qil0;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget v0, p0, La/mpo;->d:F

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lc;->a(IFI)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, La/mpo;->e:F

    .line 31
    .line 32
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, La/mpo;->f:F

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, La/mpo;->g:F

    .line 43
    .line 44
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/mpo;->h:La/y9q0;

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v2, p0, La/mpo;->i:F

    .line 55
    .line 56
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/mpo;->j:La/y9q0;

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v2, p0, La/mpo;->k:F

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/mpo;->l:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean p0, p0, La/mpo;->m:Z

    .line 79
    .line 80
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget v0, p0, La/mpo;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/mpo;->b:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/mpo;->d:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, La/mpo;->e:F

    .line 20
    .line 21
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, La/mpo;->f:F

    .line 26
    .line 27
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget v5, p0, La/mpo;->g:F

    .line 32
    .line 33
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget v6, p0, La/mpo;->i:F

    .line 38
    .line 39
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget v7, p0, La/mpo;->k:F

    .line 44
    .line 45
    invoke-static {v7}, La/ycl;->c(F)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v8, ", radius="

    .line 50
    .line 51
    const-string v9, ", marketStyle="

    .line 52
    .line 53
    const-string v10, "ExpressCardConfigModel(height="

    .line 54
    .line 55
    invoke-static {v10, v0, v8, v1, v9}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, La/mpo;->c:La/qil0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", headerTopPadding="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", headerBottomPadding="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", cardBottomPadding="

    .line 78
    .line 79
    const-string v2, ", eventListHeight="

    .line 80
    .line 81
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", headerTextStyle="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, La/mpo;->h:La/y9q0;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", eventIconSize="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", eventCoefStyle="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, La/mpo;->j:La/y9q0;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", eventTopPadding="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", showCircleCanvas="

    .line 121
    .line 122
    const-string v2, ", showWatermarkRect="

    .line 123
    .line 124
    iget-boolean v3, p0, La/mpo;->l:Z

    .line 125
    .line 126
    invoke-static {v7, v1, v2, v0, v3}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 127
    .line 128
    .line 129
    const-string v1, ")"

    .line 130
    .line 131
    iget-boolean p0, p0, La/mpo;->m:Z

    .line 132
    .line 133
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method
