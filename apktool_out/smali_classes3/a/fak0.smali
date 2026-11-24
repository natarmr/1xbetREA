.class public final La/fak0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o8w;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/a4x;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:La/tvw;

.field public final h:La/xww;

.field public final i:La/xww;

.field public final j:La/a4x;

.field public final k:La/u180;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/a4x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/tvw;La/xww;La/xww;La/a4x;La/u180;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
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
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/fak0;->a:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p2, p0, La/fak0;->b:La/a4x;

    .line 37
    .line 38
    iput-object p3, p0, La/fak0;->c:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p4, p0, La/fak0;->d:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p5, p0, La/fak0;->e:Ljava/lang/String;

    .line 43
    .line 44
    iput-boolean p6, p0, La/fak0;->f:Z

    .line 45
    .line 46
    iput-object p7, p0, La/fak0;->g:La/tvw;

    .line 47
    .line 48
    iput-object p8, p0, La/fak0;->h:La/xww;

    .line 49
    .line 50
    iput-object p9, p0, La/fak0;->i:La/xww;

    .line 51
    .line 52
    iput-object p10, p0, La/fak0;->j:La/a4x;

    .line 53
    .line 54
    iput-object p11, p0, La/fak0;->k:La/u180;

    .line 55
    .line 56
    iput-object p12, p0, La/fak0;->l:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p13, p0, La/fak0;->m:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p14, p0, La/fak0;->n:Ljava/lang/String;

    .line 61
    .line 62
    iput-object p15, p0, La/fak0;->o:Ljava/lang/String;

    .line 63
    .line 64
    move-object/from16 p1, p16

    .line 65
    .line 66
    iput-object p1, p0, La/fak0;->p:Ljava/lang/String;

    .line 67
    .line 68
    move/from16 p1, p17

    .line 69
    .line 70
    iput-boolean p1, p0, La/fak0;->q:Z

    .line 71
    .line 72
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
    instance-of v0, p1, La/fak0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/fak0;

    .line 12
    .line 13
    iget-object v0, p0, La/fak0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/fak0;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/fak0;->b:La/a4x;

    .line 26
    .line 27
    iget-object v1, p1, La/fak0;->b:La/a4x;

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
    iget-object v0, p0, La/fak0;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/fak0;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/fak0;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/fak0;->d:Ljava/lang/String;

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
    iget-object v0, p0, La/fak0;->e:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/fak0;->e:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_6
    iget-boolean v0, p0, La/fak0;->f:Z

    .line 74
    .line 75
    iget-boolean v1, p1, La/fak0;->f:Z

    .line 76
    .line 77
    if-eq v0, v1, :cond_7

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_7
    iget-object v0, p0, La/fak0;->g:La/tvw;

    .line 82
    .line 83
    iget-object v1, p1, La/fak0;->g:La/tvw;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_8

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_8
    iget-object v0, p0, La/fak0;->h:La/xww;

    .line 94
    .line 95
    iget-object v1, p1, La/fak0;->h:La/xww;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/fak0;->i:La/xww;

    .line 105
    .line 106
    iget-object v1, p1, La/fak0;->i:La/xww;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/fak0;->j:La/a4x;

    .line 116
    .line 117
    iget-object v1, p1, La/fak0;->j:La/a4x;

    .line 118
    .line 119
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/fak0;->k:La/u180;

    .line 127
    .line 128
    iget-object v1, p1, La/fak0;->k:La/u180;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/fak0;->l:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v1, p1, La/fak0;->l:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_d

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_d
    iget-object v0, p0, La/fak0;->m:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v1, p1, La/fak0;->m:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_e

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_e
    iget-object v0, p0, La/fak0;->n:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v1, p1, La/fak0;->n:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_f

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_f
    iget-object v0, p0, La/fak0;->o:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v1, p1, La/fak0;->o:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_10

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_10
    iget-object v0, p0, La/fak0;->p:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v1, p1, La/fak0;->p:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_11

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_11
    iget-boolean p0, p0, La/fak0;->q:Z

    .line 193
    .line 194
    iget-boolean p1, p1, La/fak0;->q:Z

    .line 195
    .line 196
    if-eq p0, p1, :cond_12

    .line 197
    .line 198
    :goto_0
    const/4 p0, 0x0

    .line 199
    return p0

    .line 200
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 201
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/fak0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/fak0;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/fak0;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/fak0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/fak0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/fak0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/fak0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/fak0;->g:La/tvw;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/fak0;->h:La/xww;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-object v2, p0, La/fak0;->i:La/xww;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget-object v0, p0, La/fak0;->j:La/a4x;

    .line 65
    .line 66
    invoke-static {v0, v2, v1}, La/cs0;->b(La/a4x;II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/fak0;->k:La/u180;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/2addr v2, v0

    .line 77
    mul-int/2addr v2, v1

    .line 78
    iget-object v0, p0, La/fak0;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, La/fak0;->m:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, La/fak0;->n:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, La/fak0;->o:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, La/fak0;->p:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-boolean p0, p0, La/fak0;->q:Z

    .line 109
    .line 110
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v0, ", tagList="

    .line 2
    .line 3
    const-string v1, ", betId="

    .line 4
    .line 5
    const-string v2, "SmallHistoryItemUiModel(key="

    .line 6
    .line 7
    iget-object v3, p0, La/fak0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/fak0;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/kng0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", betNumber="

    .line 16
    .line 17
    const-string v2, ", betTitle="

    .line 18
    .line 19
    iget-object v3, p0, La/fak0;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, La/fak0;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", isNumberAction="

    .line 27
    .line 28
    const-string v2, ", iconBetUiModel="

    .line 29
    .line 30
    iget-object v3, p0, La/fak0;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v4, p0, La/fak0;->f:Z

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/fak0;->g:La/tvw;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", topLeftIcon="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/fak0;->h:La/xww;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", topRightIcon="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, La/fak0;->i:La/xww;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", itemsDescriptionList="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/fak0;->j:La/a4x;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", opponentCardModel="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, La/fak0;->k:La/u180;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", eventTitle="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/fak0;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", marketTitle="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", subMarketTitle="

    .line 98
    .line 99
    const-string v2, ", coefficient="

    .line 100
    .line 101
    iget-object v3, p0, La/fak0;->m:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v4, p0, La/fak0;->n:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v1, ", sellButtonTitle="

    .line 109
    .line 110
    const-string v2, ", isMarketInfoVisible="

    .line 111
    .line 112
    iget-object v3, p0, La/fak0;->o:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v4, p0, La/fak0;->p:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const-string v1, ")"

    .line 120
    .line 121
    iget-boolean p0, p0, La/fak0;->q:Z

    .line 122
    .line 123
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method
