.class public final La/nnd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mnd;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:Z

.field public final n:Ljava/lang/String;

.field public final o:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/nnd;->a:Ljava/util/List;

    .line 29
    .line 30
    iput-object p2, p0, La/nnd;->b:Ljava/util/List;

    .line 31
    .line 32
    iput-object p3, p0, La/nnd;->c:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p4, p0, La/nnd;->d:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p5, p0, La/nnd;->e:Ljava/util/List;

    .line 37
    .line 38
    iput-object p6, p0, La/nnd;->f:Ljava/util/List;

    .line 39
    .line 40
    iput-boolean p7, p0, La/nnd;->g:Z

    .line 41
    .line 42
    iput-wide p8, p0, La/nnd;->h:J

    .line 43
    .line 44
    iput-object p10, p0, La/nnd;->i:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p11, p0, La/nnd;->j:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p12, p0, La/nnd;->k:Ljava/lang/String;

    .line 49
    .line 50
    iput-boolean p13, p0, La/nnd;->l:Z

    .line 51
    .line 52
    iput-boolean p14, p0, La/nnd;->m:Z

    .line 53
    .line 54
    iput-object p15, p0, La/nnd;->n:Ljava/lang/String;

    .line 55
    .line 56
    move/from16 p1, p16

    .line 57
    .line 58
    iput-boolean p1, p0, La/nnd;->o:Z

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/nnd;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/nnd;

    .line 12
    .line 13
    iget-object v0, p0, La/nnd;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/nnd;->a:Ljava/util/List;

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
    iget-object v0, p0, La/nnd;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, p1, La/nnd;->b:Ljava/util/List;

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
    iget-object v0, p0, La/nnd;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/nnd;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/nnd;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/nnd;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget-object v0, p0, La/nnd;->e:Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, p1, La/nnd;->e:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    iget-object v0, p0, La/nnd;->f:Ljava/util/List;

    .line 73
    .line 74
    iget-object v1, p1, La/nnd;->f:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_7

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_7
    iget-boolean v0, p0, La/nnd;->g:Z

    .line 84
    .line 85
    iget-boolean v1, p1, La/nnd;->g:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    iget-wide v0, p0, La/nnd;->h:J

    .line 91
    .line 92
    iget-wide v2, p1, La/nnd;->h:J

    .line 93
    .line 94
    cmp-long v0, v0, v2

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_9
    iget-object v0, p0, La/nnd;->i:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v1, p1, La/nnd;->i:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_a

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_a
    iget-object v0, p0, La/nnd;->j:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, p1, La/nnd;->j:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_b

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_b
    iget-object v0, p0, La/nnd;->k:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v1, p1, La/nnd;->k:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_c

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_c
    iget-boolean v0, p0, La/nnd;->l:Z

    .line 133
    .line 134
    iget-boolean v1, p1, La/nnd;->l:Z

    .line 135
    .line 136
    if-eq v0, v1, :cond_d

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_d
    iget-boolean v0, p0, La/nnd;->m:Z

    .line 140
    .line 141
    iget-boolean v1, p1, La/nnd;->m:Z

    .line 142
    .line 143
    if-eq v0, v1, :cond_e

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_e
    iget-object v0, p0, La/nnd;->n:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v1, p1, La/nnd;->n:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_f

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_f
    iget-boolean p0, p0, La/nnd;->o:Z

    .line 158
    .line 159
    iget-boolean p1, p1, La/nnd;->o:Z

    .line 160
    .line 161
    if-eq p0, p1, :cond_10

    .line 162
    .line 163
    :goto_0
    const/4 p0, 0x0

    .line 164
    return p0

    .line 165
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 166
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/nnd;->a:Ljava/util/List;

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
    iget-object v2, p0, La/nnd;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/nnd;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/nnd;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/nnd;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/nnd;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/nnd;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/nnd;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/nnd;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/nnd;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/nnd;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/nnd;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, La/nnd;->m:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/nnd;->n:Ljava/lang/String;

    .line 83
    .line 84
    if-nez v2, :cond_0

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :goto_0
    add-int/2addr v0, v2

    .line 93
    mul-int/2addr v0, v1

    .line 94
    iget-boolean p0, p0, La/nnd;->o:Z

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", teamTwoIds="

    .line 2
    .line 3
    const-string v1, ", teamOneName="

    .line 4
    .line 5
    const-string v2, "CompressedCardCommonModel(teamOneIds="

    .line 6
    .line 7
    iget-object v3, p0, La/nnd;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/nnd;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, La/w6x;->t(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", teamTwoName="

    .line 16
    .line 17
    const-string v2, ", teamOneImageUrls="

    .line 18
    .line 19
    iget-object v3, p0, La/nnd;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, La/nnd;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", teamTwoImageUrls="

    .line 27
    .line 28
    const-string v2, ", finished="

    .line 29
    .line 30
    iget-object v3, p0, La/nnd;->e:Ljava/util/List;

    .line 31
    .line 32
    iget-object v4, p0, La/nnd;->f:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", sportId="

    .line 38
    .line 39
    iget-wide v2, p0, La/nnd;->h:J

    .line 40
    .line 41
    iget-boolean v4, p0, La/nnd;->g:Z

    .line 42
    .line 43
    invoke-static {v2, v3, v1, v0, v4}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", matchFormat="

    .line 47
    .line 48
    const-string v2, ", vid="

    .line 49
    .line 50
    iget-object v3, p0, La/nnd;->i:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, p0, La/nnd;->j:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, ", dopInfo="

    .line 58
    .line 59
    const-string v2, ", hostsVsGuests="

    .line 60
    .line 61
    iget-object v3, p0, La/nnd;->k:Ljava/lang/String;

    .line 62
    .line 63
    iget-boolean v4, p0, La/nnd;->l:Z

    .line 64
    .line 65
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 66
    .line 67
    .line 68
    const-string v1, ", live="

    .line 69
    .line 70
    const-string v2, ", subGameName="

    .line 71
    .line 72
    iget-object v3, p0, La/nnd;->n:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v4, p0, La/nnd;->m:Z

    .line 75
    .line 76
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 77
    .line 78
    .line 79
    const-string v1, ", nonStarted="

    .line 80
    .line 81
    const-string v2, ")"

    .line 82
    .line 83
    iget-boolean p0, p0, La/nnd;->o:Z

    .line 84
    .line 85
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
