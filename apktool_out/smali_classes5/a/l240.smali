.class public final La/l240;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/o2c0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:La/ay10;

.field public final h:La/ijl;

.field public final i:La/r44;

.field public final j:Ljava/lang/String;

.field public final k:La/imm;

.field public final l:La/jjl;

.field public final m:La/zno0;


# direct methods
.method public constructor <init>(La/o2c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;La/ay10;La/ijl;La/r44;Ljava/lang/String;La/imm;La/jjl;La/zno0;)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/l240;->a:La/o2c0;

    .line 8
    .line 9
    iput-object p2, p0, La/l240;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/l240;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/l240;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p5, p0, La/l240;->e:Z

    .line 16
    .line 17
    iput-object p6, p0, La/l240;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, La/l240;->g:La/ay10;

    .line 20
    .line 21
    iput-object p8, p0, La/l240;->h:La/ijl;

    .line 22
    .line 23
    iput-object p9, p0, La/l240;->i:La/r44;

    .line 24
    .line 25
    iput-object p10, p0, La/l240;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p11, p0, La/l240;->k:La/imm;

    .line 28
    .line 29
    iput-object p12, p0, La/l240;->l:La/jjl;

    .line 30
    .line 31
    iput-object p13, p0, La/l240;->m:La/zno0;

    .line 32
    .line 33
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
    instance-of v0, p1, La/l240;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/l240;

    .line 12
    .line 13
    iget-object v0, p0, La/l240;->a:La/o2c0;

    .line 14
    .line 15
    iget-object v1, p1, La/l240;->a:La/o2c0;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/l240;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/l240;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/l240;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/l240;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/l240;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/l240;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/l240;->e:Z

    .line 61
    .line 62
    iget-boolean v1, p1, La/l240;->e:Z

    .line 63
    .line 64
    if-eq v0, v1, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    iget-object v0, p0, La/l240;->f:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p1, La/l240;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_7

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_7
    iget-object v0, p0, La/l240;->g:La/ay10;

    .line 79
    .line 80
    iget-object v1, p1, La/l240;->g:La/ay10;

    .line 81
    .line 82
    if-eq v0, v1, :cond_8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_8
    iget-object v0, p0, La/l240;->h:La/ijl;

    .line 86
    .line 87
    iget-object v1, p1, La/l240;->h:La/ijl;

    .line 88
    .line 89
    if-eq v0, v1, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-object v0, p0, La/l240;->i:La/r44;

    .line 93
    .line 94
    iget-object v1, p1, La/l240;->i:La/r44;

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_a

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_a
    iget-object v0, p0, La/l240;->j:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p1, La/l240;->j:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_b

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_b
    iget-object v0, p0, La/l240;->k:La/imm;

    .line 115
    .line 116
    iget-object v1, p1, La/l240;->k:La/imm;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/imm;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_c

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_c
    iget-object v0, p0, La/l240;->l:La/jjl;

    .line 126
    .line 127
    iget-object v1, p1, La/l240;->l:La/jjl;

    .line 128
    .line 129
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_d

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_d
    iget-object p0, p0, La/l240;->m:La/zno0;

    .line 137
    .line 138
    iget-object p1, p1, La/l240;->m:La/zno0;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_e

    .line 145
    .line 146
    :goto_0
    const/4 p0, 0x0

    .line 147
    return p0

    .line 148
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 149
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/l240;->a:La/o2c0;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, La/o2c0;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, La/l240;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v3, p0, La/l240;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v3, p0, La/l240;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-boolean v3, p0, La/l240;->e:Z

    .line 34
    .line 35
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v3, p0, La/l240;->f:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    move v3, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_1
    add-int/2addr v1, v3

    .line 50
    mul-int/2addr v1, v2

    .line 51
    iget-object v3, p0, La/l240;->g:La/ay10;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v1

    .line 58
    mul-int/2addr v3, v2

    .line 59
    iget-object v1, p0, La/l240;->h:La/ijl;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v3

    .line 66
    mul-int/2addr v1, v2

    .line 67
    iget-object v3, p0, La/l240;->i:La/r44;

    .line 68
    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    move v3, v0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {v3}, La/r44;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    :goto_2
    add-int/2addr v1, v3

    .line 78
    mul-int/2addr v1, v2

    .line 79
    iget-object v3, p0, La/l240;->j:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iget-object v3, p0, La/l240;->k:La/imm;

    .line 86
    .line 87
    invoke-static {v3, v1, v2}, La/h97;->a(La/imm;II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v3, p0, La/l240;->l:La/jjl;

    .line 92
    .line 93
    if-nez v3, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    invoke-virtual {v3}, La/jjl;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    :goto_3
    add-int/2addr v1, v0

    .line 101
    mul-int/2addr v1, v2

    .line 102
    iget-object p0, p0, La/l240;->m:La/zno0;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    add-int/2addr p0, v1

    .line 109
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MenuUiState(profileInfoModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/l240;->a:La/o2c0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", balanceTitle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/l240;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", money="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", currency="

    .line 29
    .line 30
    const-string v2, ", isLoading="

    .line 31
    .line 32
    iget-object v3, p0, La/l240;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/l240;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", sessionTime="

    .line 40
    .line 41
    const-string v2, ", menuType="

    .line 42
    .line 43
    iget-object v3, p0, La/l240;->f:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v4, p0, La/l240;->e:Z

    .line 46
    .line 47
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/l240;->g:La/ay10;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", accountSelectionStyle="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/l240;->h:La/ijl;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", authButtonsModel="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, La/l240;->i:La/r44;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", topUpButtonText="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/l240;->j:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", toolbarUiModel="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, La/l240;->k:La/imm;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", accountSelectionUiModel="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/l240;->l:La/jjl;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", tabsState="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/l240;->m:La/zno0;

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p0, ")"

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
