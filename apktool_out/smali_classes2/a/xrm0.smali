.class public final La/xrm0;
.super La/kc5;
.source "SourceFile"

# interfaces
.implements La/icy;


# instance fields
.field public final l:La/vby;

.field public final m:La/jrv0;

.field public final n:La/fp;

.field public final o:La/qaj;

.field public p:I

.field public q:La/drq;

.field public final r:La/dcy;

.field public final s:La/ocy;


# direct methods
.method public constructor <init>(La/vby;La/jrv0;La/fp;La/ugi0;La/drq;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xrm0;->l:La/vby;

    .line 8
    .line 9
    iput-object p2, p0, La/xrm0;->m:La/jrv0;

    .line 10
    .line 11
    iput-object p3, p0, La/xrm0;->n:La/fp;

    .line 12
    .line 13
    iget-object p2, p1, La/vby;->b:La/qaj;

    .line 14
    .line 15
    iput-object p2, p0, La/xrm0;->o:La/qaj;

    .line 16
    .line 17
    const/4 p2, -0x1

    .line 18
    iput p2, p0, La/xrm0;->p:I

    .line 19
    .line 20
    iput-object p5, p0, La/xrm0;->q:La/drq;

    .line 21
    .line 22
    iget-object p1, p1, La/vby;->a:La/dcy;

    .line 23
    .line 24
    iput-object p1, p0, La/xrm0;->r:La/dcy;

    .line 25
    .line 26
    iget-boolean p1, p1, La/dcy;->c:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, La/ocy;

    .line 33
    .line 34
    invoke-direct {p1, p4}, La/ocy;-><init>(La/ugi0;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iput-object p1, p0, La/xrm0;->s:La/ocy;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/xrm0;->s:La/ocy;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, v1, La/ocy;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, v1}, La/fp;->T(Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    return v0
.end method

.method public final D()B
    .locals 5

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-byte v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {p0, v0, v1, v3, v2}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v3
.end method

.method public final a(La/ugi0;)La/bld;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, La/xrm0;->l:La/vby;

    .line 5
    .line 6
    invoke-static {v1, p1}, La/yqm0;->t(La/vby;La/ugi0;)La/jrv0;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, p0, La/xrm0;->n:La/fp;

    .line 11
    .line 12
    iget-object v0, v3, La/fp;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/sbx0;

    .line 15
    .line 16
    iget v4, v0, La/sbx0;->b:I

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    add-int/2addr v4, v5

    .line 20
    iput v4, v0, La/sbx0;->b:I

    .line 21
    .line 22
    iget-object v6, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, [Ljava/lang/Object;

    .line 25
    .line 26
    array-length v6, v6

    .line 27
    if-ne v4, v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, La/sbx0;->l()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, [Ljava/lang/Object;

    .line 35
    .line 36
    aput-object p1, v0, v4

    .line 37
    .line 38
    iget-char v0, v2, La/jrv0;->a:C

    .line 39
    .line 40
    invoke-virtual {v3, v0}, La/fp;->j(C)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, La/fp;->F()B

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v4, 0x4

    .line 48
    if-eq v0, v4, :cond_3

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eq v0, v5, :cond_2

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    if-eq v0, v4, :cond_2

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    if-eq v0, v4, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, La/xrm0;->m:La/jrv0;

    .line 63
    .line 64
    if-ne v0, v2, :cond_1

    .line 65
    .line 66
    iget-object v0, v1, La/vby;->a:La/dcy;

    .line 67
    .line 68
    iget-boolean v0, v0, La/dcy;->c:Z

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_1
    new-instance v0, La/xrm0;

    .line 74
    .line 75
    iget-object v5, p0, La/xrm0;->q:La/drq;

    .line 76
    .line 77
    move-object v4, p1

    .line 78
    invoke-direct/range {v0 .. v5}, La/xrm0;-><init>(La/vby;La/jrv0;La/fp;La/ugi0;La/drq;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_2
    move-object v4, p1

    .line 83
    new-instance v0, La/xrm0;

    .line 84
    .line 85
    iget-object v5, p0, La/xrm0;->q:La/drq;

    .line 86
    .line 87
    invoke-direct/range {v0 .. v5}, La/xrm0;-><init>(La/vby;La/jrv0;La/fp;La/ugi0;La/drq;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_3
    const/4 p0, 0x0

    .line 92
    const/4 p1, 0x6

    .line 93
    const-string v0, "Unexpected leading comma"

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-static {v3, v0, p0, v1, p1}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    throw v1
.end method

.method public final b()La/qaj;
    .locals 0

    .line 1
    iget-object p0, p0, La/xrm0;->o:La/qaj;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(La/ugi0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/ugi0;->d()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/xrm0;->l:La/vby;

    .line 12
    .line 13
    invoke-static {v0, p1}, La/ady;->c(La/vby;La/ugi0;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, La/xrm0;->f(La/ugi0;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    :cond_1
    iget-object p1, p0, La/xrm0;->n:La/fp;

    .line 26
    .line 27
    invoke-virtual {p1}, La/fp;->S()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    iget-object p0, p0, La/xrm0;->m:La/jrv0;

    .line 34
    .line 35
    iget-char p0, p0, La/jrv0;->b:C

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/fp;->j(C)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, La/fp;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/sbx0;

    .line 43
    .line 44
    iget p1, p0, La/sbx0;->b:I

    .line 45
    .line 46
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, [I

    .line 49
    .line 50
    aget v2, v0, p1

    .line 51
    .line 52
    const/4 v3, -0x2

    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    aput v1, v0, p1

    .line 56
    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    iput p1, p0, La/sbx0;->b:I

    .line 60
    .line 61
    :cond_2
    if-eq p1, v1, :cond_3

    .line 62
    .line 63
    add-int/2addr p1, v1

    .line 64
    iput p1, p0, La/sbx0;->b:I

    .line 65
    .line 66
    :cond_3
    return-void

    .line 67
    :cond_4
    const-string p0, ""

    .line 68
    .line 69
    invoke-static {p1, p0}, La/xww;->O(La/fp;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0
.end method

.method public final d()La/vby;
    .locals 0

    .line 1
    iget-object p0, p0, La/xrm0;->l:La/vby;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/ugi0;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/xrm0;->n:La/fp;

    .line 6
    .line 7
    iget-object v3, v2, La/fp;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/sbx0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v4, v0, La/xrm0;->m:La/jrv0;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const-string v6, "object"

    .line 21
    .line 22
    const/4 v7, 0x6

    .line 23
    const/16 v8, 0x3a

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x1

    .line 27
    const/4 v11, -0x1

    .line 28
    const/4 v12, 0x0

    .line 29
    if-eqz v5, :cond_e

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    if-eq v5, v1, :cond_4

    .line 33
    .line 34
    invoke-virtual {v2}, La/fp;->S()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v2}, La/fp;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    iget v5, v0, La/xrm0;->p:I

    .line 45
    .line 46
    if-eq v5, v11, :cond_1

    .line 47
    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "Expected end of the array or comma"

    .line 52
    .line 53
    invoke-static {v2, v0, v9, v12, v7}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    throw v12

    .line 57
    :cond_1
    :goto_0
    add-int/lit8 v11, v5, 0x1

    .line 58
    .line 59
    iput v11, v0, La/xrm0;->p:I

    .line 60
    .line 61
    goto/16 :goto_13

    .line 62
    .line 63
    :cond_2
    if-nez v1, :cond_3

    .line 64
    .line 65
    goto/16 :goto_13

    .line 66
    .line 67
    :cond_3
    const-string v0, "array"

    .line 68
    .line 69
    invoke-static {v2, v0}, La/xww;->O(La/fp;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v12

    .line 73
    :cond_4
    iget v1, v0, La/xrm0;->p:I

    .line 74
    .line 75
    rem-int/lit8 v5, v1, 0x2

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    move v5, v10

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    move v5, v9

    .line 82
    :goto_1
    if-eqz v5, :cond_6

    .line 83
    .line 84
    if-eq v1, v11, :cond_7

    .line 85
    .line 86
    invoke-virtual {v2}, La/fp;->S()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    invoke-virtual {v2, v8}, La/fp;->j(C)V

    .line 92
    .line 93
    .line 94
    :cond_7
    :goto_2
    invoke-virtual {v2}, La/fp;->d()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_c

    .line 99
    .line 100
    if-eqz v5, :cond_b

    .line 101
    .line 102
    iget v1, v0, La/xrm0;->p:I

    .line 103
    .line 104
    iget v5, v2, La/fp;->b:I

    .line 105
    .line 106
    const/4 v6, 0x4

    .line 107
    if-ne v1, v11, :cond_9

    .line 108
    .line 109
    if-nez v9, :cond_8

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_8
    const-string v0, "Unexpected leading comma"

    .line 113
    .line 114
    invoke-static {v2, v0, v5, v12, v6}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    throw v12

    .line 118
    :cond_9
    if-eqz v9, :cond_a

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_a
    const-string v0, "Expected comma after the key-value pair"

    .line 122
    .line 123
    invoke-static {v2, v0, v5, v12, v6}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    throw v12

    .line 127
    :cond_b
    :goto_3
    iget v1, v0, La/xrm0;->p:I

    .line 128
    .line 129
    add-int/lit8 v11, v1, 0x1

    .line 130
    .line 131
    iput v11, v0, La/xrm0;->p:I

    .line 132
    .line 133
    goto/16 :goto_13

    .line 134
    .line 135
    :cond_c
    if-nez v9, :cond_d

    .line 136
    .line 137
    goto/16 :goto_13

    .line 138
    .line 139
    :cond_d
    invoke-static {v2, v6}, La/xww;->O(La/fp;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v12

    .line 143
    :cond_e
    invoke-virtual {v2}, La/fp;->S()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    :goto_4
    invoke-virtual {v2}, La/fp;->d()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    const-wide/16 v17, 0x1

    .line 152
    .line 153
    iget-object v15, v0, La/xrm0;->s:La/ocy;

    .line 154
    .line 155
    if-eqz v13, :cond_29

    .line 156
    .line 157
    iget-object v5, v0, La/xrm0;->r:La/dcy;

    .line 158
    .line 159
    iget-boolean v13, v5, La/dcy;->b:Z

    .line 160
    .line 161
    if-eqz v13, :cond_f

    .line 162
    .line 163
    invoke-virtual {v2}, La/fp;->o()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v16

    .line 167
    :goto_5
    move-object/from16 v7, v16

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_f
    invoke-virtual {v2}, La/fp;->g()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v16

    .line 174
    goto :goto_5

    .line 175
    :goto_6
    invoke-virtual {v2, v8}, La/fp;->j(C)V

    .line 176
    .line 177
    .line 178
    iget-object v8, v0, La/xrm0;->l:La/vby;

    .line 179
    .line 180
    move/from16 v19, v11

    .line 181
    .line 182
    invoke-static {v1, v8, v7}, La/ady;->a(La/ugi0;La/vby;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    const/4 v12, -0x3

    .line 187
    if-eq v11, v12, :cond_18

    .line 188
    .line 189
    iget-boolean v5, v5, La/dcy;->e:Z

    .line 190
    .line 191
    if-eqz v5, :cond_15

    .line 192
    .line 193
    invoke-interface {v1, v11}, La/ugi0;->i(I)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-interface {v1, v11}, La/ugi0;->g(I)La/ugi0;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    if-eqz v5, :cond_10

    .line 202
    .line 203
    invoke-interface {v14}, La/ugi0;->b()Z

    .line 204
    .line 205
    .line 206
    move-result v21

    .line 207
    if-nez v21, :cond_10

    .line 208
    .line 209
    invoke-virtual {v2, v10}, La/fp;->T(Z)Z

    .line 210
    .line 211
    .line 212
    move-result v21

    .line 213
    if-eqz v21, :cond_10

    .line 214
    .line 215
    move/from16 v21, v10

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_10
    move/from16 v21, v10

    .line 219
    .line 220
    invoke-interface {v14}, La/ugi0;->l()La/c3x;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    sget-object v12, La/zgi0;->b:La/zgi0;

    .line 225
    .line 226
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    if-eqz v10, :cond_16

    .line 231
    .line 232
    invoke-interface {v14}, La/ugi0;->b()Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_11

    .line 237
    .line 238
    invoke-virtual {v2, v9}, La/fp;->T(Z)Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-eqz v10, :cond_11

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_11
    invoke-virtual {v2, v13}, La/fp;->G(Z)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    if-nez v10, :cond_12

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_12
    invoke-static {v14, v8, v10}, La/ady;->a(La/ugi0;La/vby;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    iget-object v12, v8, La/vby;->a:La/dcy;

    .line 257
    .line 258
    iget-boolean v12, v12, La/dcy;->c:Z

    .line 259
    .line 260
    if-nez v12, :cond_13

    .line 261
    .line 262
    invoke-interface {v14}, La/ugi0;->b()Z

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    if-eqz v12, :cond_13

    .line 267
    .line 268
    move/from16 v12, v21

    .line 269
    .line 270
    :goto_7
    const/4 v14, -0x3

    .line 271
    goto :goto_8

    .line 272
    :cond_13
    move v12, v9

    .line 273
    goto :goto_7

    .line 274
    :goto_8
    if-ne v10, v14, :cond_16

    .line 275
    .line 276
    if-nez v5, :cond_14

    .line 277
    .line 278
    if-eqz v12, :cond_16

    .line 279
    .line 280
    :cond_14
    invoke-virtual {v2}, La/fp;->m()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    :goto_9
    invoke-virtual {v2}, La/fp;->S()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    move v10, v9

    .line 288
    goto :goto_b

    .line 289
    :cond_15
    move/from16 v21, v10

    .line 290
    .line 291
    :cond_16
    :goto_a
    if-eqz v15, :cond_2f

    .line 292
    .line 293
    iget-object v0, v15, La/ocy;->a:La/srn;

    .line 294
    .line 295
    const/16 v1, 0x40

    .line 296
    .line 297
    if-ge v11, v1, :cond_17

    .line 298
    .line 299
    iget-wide v1, v0, La/srn;->a:J

    .line 300
    .line 301
    shl-long v5, v17, v11

    .line 302
    .line 303
    or-long/2addr v1, v5

    .line 304
    iput-wide v1, v0, La/srn;->a:J

    .line 305
    .line 306
    goto/16 :goto_13

    .line 307
    .line 308
    :cond_17
    ushr-int/lit8 v1, v11, 0x6

    .line 309
    .line 310
    add-int/lit8 v1, v1, -0x1

    .line 311
    .line 312
    and-int/lit8 v2, v11, 0x3f

    .line 313
    .line 314
    iget-object v0, v0, La/srn;->d:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, [J

    .line 317
    .line 318
    aget-wide v5, v0, v1

    .line 319
    .line 320
    shl-long v7, v17, v2

    .line 321
    .line 322
    or-long/2addr v5, v7

    .line 323
    aput-wide v5, v0, v1

    .line 324
    .line 325
    goto/16 :goto_13

    .line 326
    .line 327
    :cond_18
    move/from16 v21, v10

    .line 328
    .line 329
    move v5, v9

    .line 330
    :goto_b
    if-eqz v10, :cond_28

    .line 331
    .line 332
    invoke-static {v8, v1}, La/ady;->c(La/vby;La/ugi0;)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-nez v5, :cond_19

    .line 337
    .line 338
    iget-object v5, v0, La/xrm0;->q:La/drq;

    .line 339
    .line 340
    if-eqz v5, :cond_1a

    .line 341
    .line 342
    iget-object v8, v5, La/drq;->b:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-eqz v8, :cond_1a

    .line 349
    .line 350
    const/4 v8, 0x0

    .line 351
    iput-object v8, v5, La/drq;->b:Ljava/lang/String;

    .line 352
    .line 353
    :cond_19
    move/from16 v8, v19

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_1a
    iget v0, v3, La/sbx0;->b:I

    .line 357
    .line 358
    iget-object v1, v3, La/sbx0;->e:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, [I

    .line 361
    .line 362
    aget v4, v1, v0

    .line 363
    .line 364
    const/4 v5, -0x2

    .line 365
    if-ne v4, v5, :cond_1b

    .line 366
    .line 367
    aput v19, v1, v0

    .line 368
    .line 369
    add-int/lit8 v0, v0, -0x1

    .line 370
    .line 371
    iput v0, v3, La/sbx0;->b:I

    .line 372
    .line 373
    :cond_1b
    move/from16 v8, v19

    .line 374
    .line 375
    if-eq v0, v8, :cond_1c

    .line 376
    .line 377
    add-int/2addr v0, v8

    .line 378
    iput v0, v3, La/sbx0;->b:I

    .line 379
    .line 380
    :cond_1c
    iget v0, v2, La/fp;->b:I

    .line 381
    .line 382
    iget-object v1, v2, La/fp;->g:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {v1, v9, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const/4 v1, 0x6

    .line 395
    invoke-static {v9, v0, v1, v7}, Lkotlin/text/StringsKt;->Y(ILjava/lang/String;ILjava/lang/String;)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    const-string v1, "Encountered an unknown key \'"

    .line 400
    .line 401
    const/16 v3, 0x27

    .line 402
    .line 403
    invoke-static {v3, v1, v7}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    const-string v3, "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys."

    .line 408
    .line 409
    invoke-virtual {v2, v0, v1, v3}, La/fp;->s(ILjava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    const/16 v20, 0x0

    .line 413
    .line 414
    throw v20

    .line 415
    :goto_c
    new-instance v7, Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, La/fp;->F()B

    .line 421
    .line 422
    .line 423
    move-result v5

    .line 424
    const/16 v10, 0x8

    .line 425
    .line 426
    if-eq v5, v10, :cond_1d

    .line 427
    .line 428
    const/4 v11, 0x6

    .line 429
    if-eq v5, v11, :cond_1d

    .line 430
    .line 431
    invoke-virtual {v2}, La/fp;->n()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move/from16 v11, v21

    .line 435
    .line 436
    const/4 v12, 0x6

    .line 437
    goto/16 :goto_11

    .line 438
    .line 439
    :cond_1d
    :goto_d
    invoke-virtual {v2}, La/fp;->F()B

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    move/from16 v11, v21

    .line 444
    .line 445
    if-ne v5, v11, :cond_20

    .line 446
    .line 447
    if-eqz v13, :cond_1e

    .line 448
    .line 449
    invoke-virtual {v2}, La/fp;->n()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_1e
    invoke-virtual {v2}, La/fp;->g()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    :cond_1f
    :goto_e
    move/from16 v21, v11

    .line 457
    .line 458
    goto :goto_d

    .line 459
    :cond_20
    const/4 v12, 0x6

    .line 460
    if-eq v5, v10, :cond_27

    .line 461
    .line 462
    if-ne v5, v12, :cond_21

    .line 463
    .line 464
    goto :goto_f

    .line 465
    :cond_21
    const/16 v14, 0x9

    .line 466
    .line 467
    if-ne v5, v14, :cond_23

    .line 468
    .line 469
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    check-cast v5, Ljava/lang/Number;

    .line 474
    .line 475
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    if-ne v5, v10, :cond_22

    .line 480
    .line 481
    invoke-static {v7}, La/w3d;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    goto :goto_10

    .line 485
    :cond_22
    const-string v0, "found ] instead of }"

    .line 486
    .line 487
    const/4 v14, 0x0

    .line 488
    invoke-static {v2, v0, v9, v14, v12}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 489
    .line 490
    .line 491
    throw v14

    .line 492
    :cond_23
    const/4 v14, 0x0

    .line 493
    const/4 v15, 0x7

    .line 494
    if-ne v5, v15, :cond_25

    .line 495
    .line 496
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    check-cast v5, Ljava/lang/Number;

    .line 501
    .line 502
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    if-ne v5, v12, :cond_24

    .line 507
    .line 508
    invoke-static {v7}, La/w3d;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    goto :goto_10

    .line 512
    :cond_24
    const-string v0, "found } instead of ]"

    .line 513
    .line 514
    invoke-static {v2, v0, v9, v14, v12}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 515
    .line 516
    .line 517
    throw v14

    .line 518
    :cond_25
    const/16 v15, 0xa

    .line 519
    .line 520
    if-eq v5, v15, :cond_26

    .line 521
    .line 522
    goto :goto_10

    .line 523
    :cond_26
    const-string v0, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 524
    .line 525
    invoke-static {v2, v0, v9, v14, v12}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 526
    .line 527
    .line 528
    throw v14

    .line 529
    :cond_27
    :goto_f
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    :goto_10
    invoke-virtual {v2}, La/fp;->h()B

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    if-nez v5, :cond_1f

    .line 544
    .line 545
    :goto_11
    invoke-virtual {v2}, La/fp;->S()Z

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    move v10, v11

    .line 550
    move v7, v12

    .line 551
    const/4 v12, 0x0

    .line 552
    move v11, v8

    .line 553
    const/16 v8, 0x3a

    .line 554
    .line 555
    goto/16 :goto_4

    .line 556
    .line 557
    :cond_28
    move/from16 v11, v19

    .line 558
    .line 559
    move/from16 v10, v21

    .line 560
    .line 561
    const/4 v7, 0x6

    .line 562
    const/16 v8, 0x3a

    .line 563
    .line 564
    const/4 v12, 0x0

    .line 565
    goto/16 :goto_4

    .line 566
    .line 567
    :cond_29
    move v8, v11

    .line 568
    if-nez v5, :cond_31

    .line 569
    .line 570
    if-eqz v15, :cond_2e

    .line 571
    .line 572
    iget-object v0, v15, La/ocy;->a:La/srn;

    .line 573
    .line 574
    iget-object v1, v0, La/srn;->c:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v1, La/ens;

    .line 577
    .line 578
    iget-object v2, v0, La/srn;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v2, La/ugi0;

    .line 581
    .line 582
    invoke-interface {v2}, La/ugi0;->d()I

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    :cond_2a
    iget-wide v6, v0, La/srn;->a:J

    .line 587
    .line 588
    const-wide/16 v10, -0x1

    .line 589
    .line 590
    cmp-long v12, v6, v10

    .line 591
    .line 592
    if-eqz v12, :cond_2b

    .line 593
    .line 594
    not-long v6, v6

    .line 595
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 596
    .line 597
    .line 598
    move-result v6

    .line 599
    iget-wide v10, v0, La/srn;->a:J

    .line 600
    .line 601
    shl-long v12, v17, v6

    .line 602
    .line 603
    or-long/2addr v10, v12

    .line 604
    iput-wide v10, v0, La/srn;->a:J

    .line 605
    .line 606
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v7

    .line 610
    invoke-virtual {v1, v2, v7}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    check-cast v7, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v7

    .line 620
    if-eqz v7, :cond_2a

    .line 621
    .line 622
    move v11, v6

    .line 623
    goto :goto_13

    .line 624
    :cond_2b
    const/16 v6, 0x40

    .line 625
    .line 626
    if-le v5, v6, :cond_2e

    .line 627
    .line 628
    iget-object v0, v0, La/srn;->d:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v0, [J

    .line 631
    .line 632
    array-length v5, v0

    .line 633
    :goto_12
    if-ge v9, v5, :cond_2e

    .line 634
    .line 635
    add-int/lit8 v6, v9, 0x1

    .line 636
    .line 637
    mul-int/lit8 v7, v6, 0x40

    .line 638
    .line 639
    aget-wide v12, v0, v9

    .line 640
    .line 641
    :cond_2c
    cmp-long v14, v12, v10

    .line 642
    .line 643
    if-eqz v14, :cond_2d

    .line 644
    .line 645
    not-long v14, v12

    .line 646
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 647
    .line 648
    .line 649
    move-result v14

    .line 650
    shl-long v15, v17, v14

    .line 651
    .line 652
    or-long/2addr v12, v15

    .line 653
    add-int/2addr v14, v7

    .line 654
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v15

    .line 658
    invoke-virtual {v1, v2, v15}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v15

    .line 662
    check-cast v15, Ljava/lang/Boolean;

    .line 663
    .line 664
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 665
    .line 666
    .line 667
    move-result v15

    .line 668
    if-eqz v15, :cond_2c

    .line 669
    .line 670
    aput-wide v12, v0, v9

    .line 671
    .line 672
    move v11, v14

    .line 673
    goto :goto_13

    .line 674
    :cond_2d
    aput-wide v12, v0, v9

    .line 675
    .line 676
    move v9, v6

    .line 677
    goto :goto_12

    .line 678
    :cond_2e
    move v11, v8

    .line 679
    :cond_2f
    :goto_13
    sget-object v0, La/jrv0;->e:La/jrv0;

    .line 680
    .line 681
    if-eq v4, v0, :cond_30

    .line 682
    .line 683
    iget-object v0, v3, La/sbx0;->e:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v0, [I

    .line 686
    .line 687
    iget v1, v3, La/sbx0;->b:I

    .line 688
    .line 689
    aput v11, v0, v1

    .line 690
    .line 691
    :cond_30
    return v11

    .line 692
    :cond_31
    invoke-static {v2, v6}, La/xww;->O(La/fp;Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    const/16 v20, 0x0

    .line 696
    .line 697
    throw v20
.end method

.method public final g()La/mcy;
    .locals 2

    .line 1
    new-instance v0, La/u3u0;

    .line 2
    .line 3
    iget-object v1, p0, La/xrm0;->l:La/vby;

    .line 4
    .line 5
    iget-object v1, v1, La/vby;->a:La/dcy;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 11
    .line 12
    iput-object p0, v0, La/u3u0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-boolean p0, v1, La/dcy;->b:Z

    .line 15
    .line 16
    iput-boolean p0, v0, La/u3u0;->b:Z

    .line 17
    .line 18
    invoke-virtual {v0}, La/u3u0;->g()La/mcy;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final h()I
    .locals 5

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-long v3, v2

    .line 9
    cmp-long v3, v0, v3

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x27

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x6

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {p0, v0, v1, v3, v2}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v3
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final k(La/ugi0;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/xrm0;->z()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, La/xrm0;->n:La/fp;

    .line 9
    .line 10
    iget-object v1, v1, La/fp;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/sbx0;

    .line 13
    .line 14
    invoke-virtual {v1}, La/sbx0;->f()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, " at path "

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object p0, p0, La/xrm0;->l:La/vby;

    .line 25
    .line 26
    invoke-static {p1, p0, v0, v1}, La/ady;->b(La/ugi0;La/vby;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p4, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    iget-object p4, p4, La/fp;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p4, La/sbx0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/xrm0;->m:La/jrv0;

    .line 14
    .line 15
    sget-object v0, La/jrv0;->e:La/jrv0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    and-int/lit8 p1, p2, 0x1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    const/4 p2, -0x2

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p4, La/sbx0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, [I

    .line 33
    .line 34
    iget v2, p4, La/sbx0;->b:I

    .line 35
    .line 36
    aget v0, v0, v2

    .line 37
    .line 38
    if-ne v0, p2, :cond_1

    .line 39
    .line 40
    iget-object v0, p4, La/sbx0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, [Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v3, La/lwf;->p:La/lwf;

    .line 45
    .line 46
    aput-object v3, v0, v2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0, p3}, La/xrm0;->w(La/jiy;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object p1, p4, La/sbx0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, [I

    .line 57
    .line 58
    iget p3, p4, La/sbx0;->b:I

    .line 59
    .line 60
    aget p1, p1, p3

    .line 61
    .line 62
    if-eq p1, p2, :cond_2

    .line 63
    .line 64
    add-int/2addr p3, v1

    .line 65
    iput p3, p4, La/sbx0;->b:I

    .line 66
    .line 67
    iget-object p1, p4, La/sbx0;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, [Ljava/lang/Object;

    .line 70
    .line 71
    array-length p1, p1

    .line 72
    if-ne p3, p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p4}, La/sbx0;->l()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object p1, p4, La/sbx0;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, [Ljava/lang/Object;

    .line 80
    .line 81
    iget p3, p4, La/sbx0;->b:I

    .line 82
    .line 83
    iget-object v0, p4, La/sbx0;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/dcy;

    .line 86
    .line 87
    iget-boolean v0, v0, La/dcy;->i:Z

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    move-object v0, p0

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    sget-object v0, La/m2a;->p:La/m2a;

    .line 94
    .line 95
    :goto_1
    aput-object v0, p1, p3

    .line 96
    .line 97
    iget-object p1, p4, La/sbx0;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, [I

    .line 100
    .line 101
    aput p2, p1, p3

    .line 102
    .line 103
    :cond_4
    return-object p0
.end method

.method public final p()S
    .locals 5

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-short v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {p0, v0, v1, v3, v2}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v3
.end method

.method public final q()F
    .locals 5

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 18
    .line 19
    .line 20
    cmpg-float v3, v3, v4

    .line 21
    .line 22
    if-gtz v3, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, v2}, La/xww;->S(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v3, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'"

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    invoke-static {p0, v0, v1, v3, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v2

    .line 40
    :catch_0
    const-string v3, "Failed to parse type \'float\' for input \'"

    .line 41
    .line 42
    const/16 v4, 0x27

    .line 43
    .line 44
    invoke-static {v4, v3, v0}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {p0, v0, v1, v2, v3}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    throw v2
.end method

.method public final s()D
    .locals 9

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmpg-double v0, v5, v7

    .line 23
    .line 24
    if-gtz v0, :cond_0

    .line 25
    .line 26
    return-wide v3

    .line 27
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, v2}, La/xww;->S(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v3, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'"

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-static {p0, v0, v1, v3, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    throw v2

    .line 42
    :catch_0
    const-string v3, "Failed to parse type \'double\' for input \'"

    .line 43
    .line 44
    const/16 v4, 0x27

    .line 45
    .line 46
    invoke-static {v4, v3, v0}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v3, 0x6

    .line 51
    invoke-static {p0, v0, v1, v2, v3}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    throw v2
.end method

.method public final u()Z
    .locals 11

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->R()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/fp;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "EOF"

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eq v0, v2, :cond_7

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/16 v7, 0x22

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    if-ne v2, v7, :cond_0

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    move v2, v8

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v6

    .line 36
    :goto_0
    invoke-virtual {p0, v0}, La/fp;->J(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-ge v0, v9, :cond_6

    .line 45
    .line 46
    const/4 v9, -0x1

    .line 47
    if-eq v0, v9, :cond_6

    .line 48
    .line 49
    add-int/lit8 v9, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    or-int/lit8 v0, v0, 0x20

    .line 56
    .line 57
    const/16 v10, 0x66

    .line 58
    .line 59
    if-eq v0, v10, :cond_2

    .line 60
    .line 61
    const/16 v10, 0x74

    .line 62
    .line 63
    if-ne v0, v10, :cond_1

    .line 64
    .line 65
    const-string v0, "rue"

    .line 66
    .line 67
    invoke-virtual {p0, v9, v0}, La/fp;->f(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move v0, v8

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "Expected valid boolean literal prefix, but had \'"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/fp;->n()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const/16 v1, 0x27

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {p0, v0, v6, v5, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    throw v5

    .line 99
    :cond_2
    const-string v0, "alse"

    .line 100
    .line 101
    invoke-virtual {p0, v9, v0}, La/fp;->f(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move v0, v6

    .line 105
    :goto_1
    if-eqz v2, :cond_5

    .line 106
    .line 107
    iget v2, p0, La/fp;->b:I

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eq v2, v9, :cond_4

    .line 114
    .line 115
    iget v2, p0, La/fp;->b:I

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-ne v1, v7, :cond_3

    .line 122
    .line 123
    iget v1, p0, La/fp;->b:I

    .line 124
    .line 125
    add-int/2addr v1, v8

    .line 126
    iput v1, p0, La/fp;->b:I

    .line 127
    .line 128
    return v0

    .line 129
    :cond_3
    const-string v0, "Expected closing quotation mark"

    .line 130
    .line 131
    invoke-static {p0, v0, v6, v5, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    throw v5

    .line 135
    :cond_4
    invoke-static {p0, v3, v6, v5, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    throw v5

    .line 139
    :cond_5
    return v0

    .line 140
    :cond_6
    invoke-static {p0, v3, v6, v5, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    throw v5

    .line 144
    :cond_7
    invoke-static {p0, v3, v6, v5, v4}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    throw v5
.end method

.method public final v()C
    .locals 4

    .line 1
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fp;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string v1, "Expected single char, but got \'"

    .line 21
    .line 22
    const/16 v2, 0x27

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x6

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {p0, v0, v3, v2, v1}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    throw v2
.end method

.method public final w(La/jiy;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/xrm0;->l:La/vby;

    .line 2
    .line 3
    iget-object v1, p0, La/xrm0;->n:La/fp;

    .line 4
    .line 5
    iget-object v2, v1, La/fp;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/sbx0;

    .line 8
    .line 9
    const-string v3, "Expected "

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    :try_start_0
    instance-of v5, p1, La/l4;

    .line 16
    .line 17
    if-eqz v5, :cond_7

    .line 18
    .line 19
    move-object v5, p1

    .line 20
    check-cast v5, La/l4;

    .line 21
    .line 22
    invoke-interface {v5}, La/jiy;->getDescriptor()La/ugi0;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v0, v5}, La/u7x;->A(La/vby;La/ugi0;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, p0, La/xrm0;->r:La/dcy;

    .line 31
    .line 32
    iget-boolean v6, v6, La/dcy;->b:Z

    .line 33
    .line 34
    invoke-virtual {v1, v5, v6}, La/fp;->E(Ljava/lang/String;Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/4 v7, -0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-nez v6, :cond_5

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    check-cast v1, La/l4;

    .line 44
    .line 45
    invoke-interface {v1}, La/jiy;->getDescriptor()La/ugi0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0, v1}, La/u7x;->A(La/vby;La/ugi0;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p0}, La/xrm0;->g()La/mcy;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    move-object v6, p1

    .line 58
    check-cast v6, La/l4;

    .line 59
    .line 60
    invoke-interface {v6}, La/jiy;->getDescriptor()La/ugi0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-interface {v6}, La/ugi0;->h()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    instance-of v9, v5, La/edy;

    .line 69
    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    new-instance p0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-class p1, La/edy;

    .line 78
    .line 79
    sget-object v1, La/sre0;->a:La/tre0;

    .line 80
    .line 81
    invoke-virtual {v1, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, La/sgy;->J()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p1, ", but had "

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v1, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p1}, La/sgy;->J()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, " as the serialized body of "

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v2}, La/sbx0;->f()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, v0, La/vby;->a:La/dcy;

    .line 129
    .line 130
    iget-boolean v0, v0, La/dcy;->i:Z

    .line 131
    .line 132
    if-eqz v0, :cond_0

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v7, v0}, La/xww;->R(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_0

    .line 147
    :catch_0
    move-exception p0

    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :cond_0
    move-object v0, v8

    .line 151
    :goto_0
    new-instance v1, La/kcy;

    .line 152
    .line 153
    invoke-static {v7, p0, p1, v8, v0}, La/xww;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {v1, p0}, La/ucy;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v1

    .line 161
    :cond_1
    check-cast v5, La/edy;

    .line 162
    .line 163
    invoke-virtual {v5, v1}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, La/mcy;

    .line 168
    .line 169
    if-eqz v3, :cond_3

    .line 170
    .line 171
    invoke-static {v3}, La/ncy;->j(La/mcy;)La/jdy;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    instance-of v6, v3, La/bdy;

    .line 176
    .line 177
    if-eqz v6, :cond_2

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_2
    invoke-virtual {v3}, La/jdy;->b()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3
    :try_end_0
    .catch La/bh40; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_2

    .line 185
    :cond_3
    :goto_1
    move-object v3, v8

    .line 186
    :goto_2
    :try_start_1
    check-cast p1, La/l4;

    .line 187
    .line 188
    invoke-static {p1, p0, v3}, La/a8k0;->t(La/l4;La/bld;Ljava/lang/String;)La/jiy;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_1
    .catch La/fhi0; {:try_start_1 .. :try_end_1} :catch_1

    .line 192
    :try_start_2
    invoke-static {v0, v1, v5, p0}, La/jtm0;->r(La/vby;Ljava/lang/String;La/edy;La/jiy;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :catch_1
    move-exception p0

    .line 198
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object p1, v0, La/vby;->a:La/dcy;

    .line 206
    .line 207
    iget-boolean p1, p1, La/dcy;->i:Z

    .line 208
    .line 209
    if-eqz p1, :cond_4

    .line 210
    .line 211
    invoke-virtual {v5}, La/edy;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-static {v7, p1}, La/xww;->R(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    goto :goto_3

    .line 224
    :cond_4
    move-object p1, v8

    .line 225
    :goto_3
    new-instance v0, La/kcy;

    .line 226
    .line 227
    invoke-static {v7, p0, v8, v8, p1}, La/xww;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-direct {v0, p0}, La/ucy;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0
    :try_end_2
    .catch La/bh40; {:try_start_2 .. :try_end_2} :catch_0

    .line 235
    :cond_5
    :try_start_3
    check-cast p1, La/l4;

    .line 236
    .line 237
    invoke-static {p1, p0, v6}, La/a8k0;->t(La/l4;La/bld;Ljava/lang/String;)La/jiy;

    .line 238
    .line 239
    .line 240
    move-result-object p1
    :try_end_3
    .catch La/fhi0; {:try_start_3 .. :try_end_3} :catch_2

    .line 241
    :try_start_4
    new-instance v0, La/drq;

    .line 242
    .line 243
    invoke-direct {v0}, La/drq;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object v5, v0, La/drq;->b:Ljava/lang/String;

    .line 247
    .line 248
    iput-object v0, p0, La/xrm0;->q:La/drq;

    .line 249
    .line 250
    invoke-interface {p1, p0}, La/jiy;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :catch_2
    move-exception p0

    .line 256
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    const/16 v0, 0xa

    .line 264
    .line 265
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->q0(Ljava/lang/String;C)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const-string v3, "."

    .line 270
    .line 271
    invoke-static {p1, v3}, Lkotlin/text/StringsKt;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const-string v3, ""

    .line 283
    .line 284
    const/4 v5, 0x6

    .line 285
    invoke-static {v0, v4, v5, p0}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-ne v0, v7, :cond_6

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :goto_4
    const/4 p0, 0x2

    .line 303
    invoke-static {v1, p1, v4, v3, p0}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 304
    .line 305
    .line 306
    throw v8

    .line 307
    :cond_7
    invoke-interface {p1, p0}, La/jiy;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0
    :try_end_4
    .catch La/bh40; {:try_start_4 .. :try_end_4} :catch_0

    .line 311
    return-object p0

    .line 312
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    const-string v0, "at path"

    .line 320
    .line 321
    invoke-static {p1, v0, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_8

    .line 326
    .line 327
    throw p0

    .line 328
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v0, " at path: "

    .line 341
    .line 342
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, La/sbx0;->f()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    new-instance v0, La/bh40;

    .line 357
    .line 358
    iget-object v1, p0, La/bh40;->a:Ljava/util/List;

    .line 359
    .line 360
    iget-object v2, p0, La/bh40;->b:Ljava/lang/String;

    .line 361
    .line 362
    invoke-direct {v0, p1, p0, v1, v2}, La/bh40;-><init>(Ljava/lang/String;La/bh40;Ljava/util/List;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0
.end method

.method public final y(La/ugi0;)La/rkj;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/zrm0;->a(La/ugi0;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, La/jcy;

    .line 11
    .line 12
    iget-object v0, p0, La/xrm0;->n:La/fp;

    .line 13
    .line 14
    iget-object p0, p0, La/xrm0;->l:La/vby;

    .line 15
    .line 16
    invoke-direct {p1, v0, p0}, La/jcy;-><init>(La/fp;La/vby;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    return-object p0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La/xrm0;->r:La/dcy;

    .line 2
    .line 3
    iget-boolean v0, v0, La/dcy;->b:Z

    .line 4
    .line 5
    iget-object p0, p0, La/xrm0;->n:La/fp;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/fp;->o()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, La/fp;->m()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
