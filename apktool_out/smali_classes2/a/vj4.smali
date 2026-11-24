.class public final La/vj4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:La/s6q0;

.field public final f:La/s6q0;

.field public final g:La/inm;

.field public final h:La/imm;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:La/wul;

.field public final l:La/wul;

.field public final m:La/wul;

.field public final n:La/wul;


# direct methods
.method public constructor <init>(ZZZLjava/util/List;La/s6q0;La/s6q0;La/inm;La/imm;Ljava/lang/String;Ljava/lang/String;La/wul;La/wul;La/wul;La/wul;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-boolean p1, p0, La/vj4;->a:Z

    .line 29
    .line 30
    iput-boolean p2, p0, La/vj4;->b:Z

    .line 31
    .line 32
    iput-boolean p3, p0, La/vj4;->c:Z

    .line 33
    .line 34
    iput-object p4, p0, La/vj4;->d:Ljava/util/List;

    .line 35
    .line 36
    iput-object p5, p0, La/vj4;->e:La/s6q0;

    .line 37
    .line 38
    iput-object p6, p0, La/vj4;->f:La/s6q0;

    .line 39
    .line 40
    iput-object p7, p0, La/vj4;->g:La/inm;

    .line 41
    .line 42
    iput-object p8, p0, La/vj4;->h:La/imm;

    .line 43
    .line 44
    iput-object p9, p0, La/vj4;->i:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p10, p0, La/vj4;->j:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p11, p0, La/vj4;->k:La/wul;

    .line 49
    .line 50
    iput-object p12, p0, La/vj4;->l:La/wul;

    .line 51
    .line 52
    iput-object p13, p0, La/vj4;->m:La/wul;

    .line 53
    .line 54
    iput-object p14, p0, La/vj4;->n:La/wul;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, La/vj4;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/vj4;

    .line 12
    .line 13
    iget-boolean v1, p0, La/vj4;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, La/vj4;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, La/vj4;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, La/vj4;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-boolean v1, p0, La/vj4;->c:Z

    .line 28
    .line 29
    iget-boolean v3, p1, La/vj4;->c:Z

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, La/vj4;->d:Ljava/util/List;

    .line 35
    .line 36
    iget-object v3, p1, La/vj4;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-object v1, p0, La/vj4;->e:La/s6q0;

    .line 46
    .line 47
    iget-object v3, p1, La/vj4;->e:La/s6q0;

    .line 48
    .line 49
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget-object v1, p0, La/vj4;->f:La/s6q0;

    .line 57
    .line 58
    iget-object v3, p1, La/vj4;->f:La/s6q0;

    .line 59
    .line 60
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-object v1, p0, La/vj4;->g:La/inm;

    .line 68
    .line 69
    iget-object v3, p1, La/vj4;->g:La/inm;

    .line 70
    .line 71
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-object v1, p0, La/vj4;->h:La/imm;

    .line 79
    .line 80
    iget-object v3, p1, La/vj4;->h:La/imm;

    .line 81
    .line 82
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-object v1, p0, La/vj4;->i:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v3, p1, La/vj4;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-object v1, p0, La/vj4;->j:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, p1, La/vj4;->j:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget-object v1, p0, La/vj4;->k:La/wul;

    .line 112
    .line 113
    iget-object v3, p1, La/vj4;->k:La/wul;

    .line 114
    .line 115
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_c

    .line 120
    .line 121
    return v2

    .line 122
    :cond_c
    iget-object v1, p0, La/vj4;->l:La/wul;

    .line 123
    .line 124
    iget-object v3, p1, La/vj4;->l:La/wul;

    .line 125
    .line 126
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_d

    .line 131
    .line 132
    return v2

    .line 133
    :cond_d
    iget-object v1, p0, La/vj4;->m:La/wul;

    .line 134
    .line 135
    iget-object v3, p1, La/vj4;->m:La/wul;

    .line 136
    .line 137
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_e

    .line 142
    .line 143
    return v2

    .line 144
    :cond_e
    iget-object p0, p0, La/vj4;->n:La/wul;

    .line 145
    .line 146
    iget-object p1, p1, La/vj4;->n:La/wul;

    .line 147
    .line 148
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_f

    .line 153
    .line 154
    return v2

    .line 155
    :cond_f
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/vj4;->a:Z

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
    iget-boolean v2, p0, La/vj4;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/vj4;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/vj4;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/vj4;->e:La/s6q0;

    .line 29
    .line 30
    invoke-virtual {v2}, La/s6q0;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/vj4;->f:La/s6q0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/s6q0;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/vj4;->g:La/inm;

    .line 45
    .line 46
    invoke-virtual {v2}, La/inm;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, La/vj4;->h:La/imm;

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, La/h97;->a(La/imm;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/vj4;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/vj4;->j:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v2, 0x0

    .line 71
    iget-object v3, p0, La/vj4;->k:La/wul;

    .line 72
    .line 73
    if-nez v3, :cond_0

    .line 74
    .line 75
    move v3, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v3}, La/wul;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :goto_0
    add-int/2addr v0, v3

    .line 82
    mul-int/2addr v0, v1

    .line 83
    iget-object v3, p0, La/vj4;->l:La/wul;

    .line 84
    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    move v3, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v3}, La/wul;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    :goto_1
    add-int/2addr v0, v3

    .line 94
    mul-int/2addr v0, v1

    .line 95
    iget-object v3, p0, La/vj4;->m:La/wul;

    .line 96
    .line 97
    invoke-static {v3, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object p0, p0, La/vj4;->n:La/wul;

    .line 102
    .line 103
    if-nez p0, :cond_2

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    invoke-virtual {p0}, La/wul;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    :goto_2
    add-int/2addr v0, v2

    .line 111
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isLoginByPhoneFieldVisible="

    .line 2
    .line 3
    const-string v1, ", isLoginByAllFieldVisible="

    .line 4
    .line 5
    const-string v2, "AuthLoginVisualUiState(isLoading="

    .line 6
    .line 7
    iget-boolean v3, p0, La/vj4;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/vj4;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", entryPointUiModelList="

    .line 16
    .line 17
    const-string v2, ", loginFieldUiModel="

    .line 18
    .line 19
    iget-object v3, p0, La/vj4;->d:Ljava/util/List;

    .line 20
    .line 21
    iget-boolean v4, p0, La/vj4;->c:Z

    .line 22
    .line 23
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/vj4;->e:La/s6q0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", passwordFieldUiModel="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/vj4;->f:La/s6q0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", phoneFieldUiModel="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/vj4;->g:La/inm;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", navigationBarUiModel="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/vj4;->h:La/imm;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", backgroundImage="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", socialLabel="

    .line 67
    .line 68
    const-string v2, ", loginWayButtonUiModel="

    .line 69
    .line 70
    iget-object v3, p0, La/vj4;->i:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, p0, La/vj4;->j:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, La/vj4;->k:La/wul;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", forgetPasswordButtonUiModel="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/vj4;->l:La/wul;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", loginButtonUiModel="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La/vj4;->m:La/wul;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", registrationButtonUiModel="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, La/vj4;->n:La/wul;

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p0, ")"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method
