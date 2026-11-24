.class public final La/wxn0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a4x;

.field public final b:La/a4x;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:La/imm;

.field public final j:La/ee;

.field public final k:La/rd;

.field public final l:Ljava/lang/String;

.field public final m:La/ksn0;


# direct methods
.method public constructor <init>(La/a4x;La/a4x;ZZZZZZLa/imm;La/ee;La/rd;Ljava/lang/String;La/ksn0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/wxn0;->a:La/a4x;

    .line 14
    .line 15
    iput-object p2, p0, La/wxn0;->b:La/a4x;

    .line 16
    .line 17
    iput-boolean p3, p0, La/wxn0;->c:Z

    .line 18
    .line 19
    iput-boolean p4, p0, La/wxn0;->d:Z

    .line 20
    .line 21
    iput-boolean p5, p0, La/wxn0;->e:Z

    .line 22
    .line 23
    iput-boolean p6, p0, La/wxn0;->f:Z

    .line 24
    .line 25
    iput-boolean p7, p0, La/wxn0;->g:Z

    .line 26
    .line 27
    iput-boolean p8, p0, La/wxn0;->h:Z

    .line 28
    .line 29
    iput-object p9, p0, La/wxn0;->i:La/imm;

    .line 30
    .line 31
    iput-object p10, p0, La/wxn0;->j:La/ee;

    .line 32
    .line 33
    iput-object p11, p0, La/wxn0;->k:La/rd;

    .line 34
    .line 35
    iput-object p12, p0, La/wxn0;->l:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p13, p0, La/wxn0;->m:La/ksn0;

    .line 38
    .line 39
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
    instance-of v0, p1, La/wxn0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/wxn0;

    .line 12
    .line 13
    iget-object v0, p0, La/wxn0;->a:La/a4x;

    .line 14
    .line 15
    iget-object v1, p1, La/wxn0;->a:La/a4x;

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
    iget-object v0, p0, La/wxn0;->b:La/a4x;

    .line 26
    .line 27
    iget-object v1, p1, La/wxn0;->b:La/a4x;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/wxn0;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/wxn0;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, La/wxn0;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, La/wxn0;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, La/wxn0;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/wxn0;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, La/wxn0;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/wxn0;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, La/wxn0;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/wxn0;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean v0, p0, La/wxn0;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/wxn0;->h:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-object v0, p0, La/wxn0;->i:La/imm;

    .line 80
    .line 81
    iget-object v1, p1, La/wxn0;->i:La/imm;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/imm;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_a

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_a
    iget-object v0, p0, La/wxn0;->j:La/ee;

    .line 91
    .line 92
    iget-object v1, p1, La/wxn0;->j:La/ee;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget-object v0, p0, La/wxn0;->k:La/rd;

    .line 102
    .line 103
    iget-object v1, p1, La/wxn0;->k:La/rd;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, La/rd;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_c

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_c
    iget-object v0, p0, La/wxn0;->l:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v1, p1, La/wxn0;->l:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_d

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_d
    iget-object p0, p0, La/wxn0;->m:La/ksn0;

    .line 124
    .line 125
    iget-object p1, p1, La/wxn0;->m:La/ksn0;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, La/ksn0;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-nez p0, :cond_e

    .line 132
    .line 133
    :goto_0
    const/4 p0, 0x0

    .line 134
    return p0

    .line 135
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 136
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/wxn0;->a:La/a4x;

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
    iget-object v2, p0, La/wxn0;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/wxn0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/wxn0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/wxn0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/wxn0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/wxn0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/wxn0;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/wxn0;->i:La/imm;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/h97;->a(La/imm;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/wxn0;->j:La/ee;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    add-int/2addr v2, v0

    .line 65
    mul-int/2addr v2, v1

    .line 66
    iget-object v0, p0, La/wxn0;->k:La/rd;

    .line 67
    .line 68
    invoke-virtual {v0}, La/rd;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v0, v2

    .line 73
    mul-int/2addr v0, v1

    .line 74
    iget-object v2, p0, La/wxn0;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object p0, p0, La/wxn0;->m:La/ksn0;

    .line 81
    .line 82
    invoke-virtual {p0}, La/ksn0;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    add-int/2addr p0, v0

    .line 87
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", filters="

    .line 2
    .line 3
    const-string v1, ", forceUpdate="

    .line 4
    .line 5
    const-string v2, "SwipexUiState(cardList="

    .line 6
    .line 7
    iget-object v3, p0, La/wxn0;->a:La/a4x;

    .line 8
    .line 9
    iget-object v4, p0, La/wxn0;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/rw2;->q(Ljava/lang/String;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", loading="

    .line 16
    .line 17
    const-string v2, ", filtersLoading="

    .line 18
    .line 19
    iget-boolean v3, p0, La/wxn0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/wxn0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", showOnboarding="

    .line 27
    .line 28
    const-string v2, ", showLottie="

    .line 29
    .line 30
    iget-boolean v3, p0, La/wxn0;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/wxn0;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", allCardsSwiped="

    .line 38
    .line 39
    const-string v2, ", navigationBarUiModel="

    .line 40
    .line 41
    iget-boolean v3, p0, La/wxn0;->g:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/wxn0;->h:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/wxn0;->i:La/imm;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", accountControlModel="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/wxn0;->j:La/ee;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", accountColors="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/wxn0;->k:La/rd;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", replenishPlaceHolder="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/wxn0;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", betSetting="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, La/wxn0;->m:La/ksn0;

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p0, ")"

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
