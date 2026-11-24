.class public final La/tl8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vl8;


# instance fields
.field public final a:J

.field public final b:La/imm;

.field public final c:Z

.field public final d:La/ijl;

.field public final e:La/jjl;

.field public final f:La/gjl;

.field public final g:La/bgi0;

.field public final h:J

.field public final i:Z

.field public final j:Z

.field public final k:La/hyl;

.field public final l:Z

.field public final m:Z

.field public final n:La/a4x;


# direct methods
.method public constructor <init>(JLa/imm;ZLa/ijl;La/jjl;La/gjl;La/bgi0;JZZLa/hyl;ZZLa/a4x;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, La/tl8;->a:J

    .line 26
    .line 27
    iput-object p3, p0, La/tl8;->b:La/imm;

    .line 28
    .line 29
    iput-boolean p4, p0, La/tl8;->c:Z

    .line 30
    .line 31
    iput-object p5, p0, La/tl8;->d:La/ijl;

    .line 32
    .line 33
    iput-object p6, p0, La/tl8;->e:La/jjl;

    .line 34
    .line 35
    iput-object p7, p0, La/tl8;->f:La/gjl;

    .line 36
    .line 37
    iput-object p8, p0, La/tl8;->g:La/bgi0;

    .line 38
    .line 39
    iput-wide p9, p0, La/tl8;->h:J

    .line 40
    .line 41
    iput-boolean p11, p0, La/tl8;->i:Z

    .line 42
    .line 43
    iput-boolean p12, p0, La/tl8;->j:Z

    .line 44
    .line 45
    iput-object p13, p0, La/tl8;->k:La/hyl;

    .line 46
    .line 47
    iput-boolean p14, p0, La/tl8;->l:Z

    .line 48
    .line 49
    iput-boolean p15, p0, La/tl8;->m:Z

    .line 50
    .line 51
    move-object/from16 p1, p16

    .line 52
    .line 53
    iput-object p1, p0, La/tl8;->n:La/a4x;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()La/imm;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl8;->b:La/imm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/ijl;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl8;->d:La/ijl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()La/jjl;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl8;->e:La/jjl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/gjl;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl8;->f:La/gjl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/tl8;

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
    check-cast p1, La/tl8;

    .line 12
    .line 13
    iget-wide v3, p1, La/tl8;->a:J

    .line 14
    .line 15
    sget v1, La/y3d;->h:I

    .line 16
    .line 17
    iget-wide v5, p0, La/tl8;->a:J

    .line 18
    .line 19
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget-object v1, p0, La/tl8;->b:La/imm;

    .line 27
    .line 28
    iget-object v3, p1, La/tl8;->b:La/imm;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-boolean v1, p0, La/tl8;->c:Z

    .line 38
    .line 39
    iget-boolean v3, p1, La/tl8;->c:Z

    .line 40
    .line 41
    if-eq v1, v3, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/tl8;->d:La/ijl;

    .line 45
    .line 46
    iget-object v3, p1, La/tl8;->d:La/ijl;

    .line 47
    .line 48
    if-eq v1, v3, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, La/tl8;->e:La/jjl;

    .line 52
    .line 53
    iget-object v3, p1, La/tl8;->e:La/jjl;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, La/tl8;->f:La/gjl;

    .line 63
    .line 64
    iget-object v3, p1, La/tl8;->f:La/gjl;

    .line 65
    .line 66
    if-eq v1, v3, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-object v1, p0, La/tl8;->g:La/bgi0;

    .line 70
    .line 71
    iget-object v3, p1, La/tl8;->g:La/bgi0;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-wide v3, p0, La/tl8;->h:J

    .line 81
    .line 82
    iget-wide v5, p1, La/tl8;->h:J

    .line 83
    .line 84
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-boolean v1, p0, La/tl8;->i:Z

    .line 92
    .line 93
    iget-boolean v3, p1, La/tl8;->i:Z

    .line 94
    .line 95
    if-eq v1, v3, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget-boolean v1, p0, La/tl8;->j:Z

    .line 99
    .line 100
    iget-boolean v3, p1, La/tl8;->j:Z

    .line 101
    .line 102
    if-eq v1, v3, :cond_b

    .line 103
    .line 104
    return v2

    .line 105
    :cond_b
    iget-object v1, p0, La/tl8;->k:La/hyl;

    .line 106
    .line 107
    iget-object v3, p1, La/tl8;->k:La/hyl;

    .line 108
    .line 109
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_c

    .line 114
    .line 115
    return v2

    .line 116
    :cond_c
    iget-boolean v1, p0, La/tl8;->l:Z

    .line 117
    .line 118
    iget-boolean v3, p1, La/tl8;->l:Z

    .line 119
    .line 120
    if-eq v1, v3, :cond_d

    .line 121
    .line 122
    return v2

    .line 123
    :cond_d
    iget-boolean v1, p0, La/tl8;->m:Z

    .line 124
    .line 125
    iget-boolean v3, p1, La/tl8;->m:Z

    .line 126
    .line 127
    if-eq v1, v3, :cond_e

    .line 128
    .line 129
    return v2

    .line 130
    :cond_e
    iget-object p0, p0, La/tl8;->n:La/a4x;

    .line 131
    .line 132
    iget-object p1, p1, La/tl8;->n:La/a4x;

    .line 133
    .line 134
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-nez p0, :cond_f

    .line 139
    .line 140
    return v2

    .line 141
    :cond_f
    return v0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tl8;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tl8;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/tl8;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, La/y3d;->h:I

    .line 2
    .line 3
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 4
    .line 5
    iget-wide v0, p0, La/tl8;->a:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-object v2, p0, La/tl8;->b:La/imm;

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, La/h97;->a(La/imm;II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v2, p0, La/tl8;->c:Z

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/tl8;->d:La/ijl;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, La/tl8;->e:La/jjl;

    .line 35
    .line 36
    invoke-virtual {v0}, La/jjl;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, La/tl8;->f:La/gjl;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/tl8;->g:La/bgi0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-wide v2, p0, La/tl8;->h:J

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/tl8;->i:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/tl8;->j:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/tl8;->k:La/hyl;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-boolean v0, p0, La/tl8;->l:Z

    .line 85
    .line 86
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/tl8;->m:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object p0, p0, La/tl8;->n:La/a4x;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    add-int/2addr p0, v0

    .line 103
    return p0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/tl8;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()La/bgi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl8;->g:La/bgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/tl8;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/tl8;->h:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Content(screenBgColor="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", navBarUiModel="

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/tl8;->b:La/imm;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", accountSelectionVisible="

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, La/tl8;->c:Z

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", accountSelectionStyle="

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/tl8;->d:La/ijl;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ", accountSelectionUiModel="

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, La/tl8;->e:La/jjl;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", accountSelectionColorMode="

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, La/tl8;->f:La/gjl;

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ", topContentSeparatorStyle="

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/tl8;->g:La/bgi0;

    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", systemBarsColor="

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", tabBarVisible="

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, ", isRefreshing="

    .line 97
    .line 98
    const-string v1, ", chipsUiModel="

    .line 99
    .line 100
    iget-boolean v3, p0, La/tl8;->i:Z

    .line 101
    .line 102
    iget-boolean v4, p0, La/tl8;->j:Z

    .line 103
    .line 104
    invoke-static {v0, v1, v2, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, La/tl8;->k:La/hyl;

    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ", chipsVisible="

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-boolean v0, p0, La/tl8;->l:Z

    .line 118
    .line 119
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, ", isRefreshable="

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-boolean v0, p0, La/tl8;->m:Z

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v0, ", content="

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object p0, p0, La/tl8;->n:La/a4x;

    .line 138
    .line 139
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string p0, ")"

    .line 143
    .line 144
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method
