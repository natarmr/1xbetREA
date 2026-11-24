.class public abstract La/r2r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/eih;La/v5l0;La/y78;La/ctf0;ZLjava/util/List;ZZ)Ljava/util/ArrayList;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/eih;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v3, 0xa

    .line 14
    .line 15
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_b

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    move-object v5, v4

    .line 37
    check-cast v5, La/d0t;

    .line 38
    .line 39
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const/4 v7, 0x0

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    move-object v8, v6

    .line 55
    check-cast v8, La/lok0;

    .line 56
    .line 57
    iget v8, v8, La/lok0;->a:I

    .line 58
    .line 59
    iget v9, v5, La/d0t;->O:I

    .line 60
    .line 61
    if-ne v8, v9, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v6, v7

    .line 65
    :goto_1
    check-cast v6, La/lok0;

    .line 66
    .line 67
    iget-object v10, v0, La/eih;->f:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v12, Ljava/util/ArrayList;

    .line 70
    .line 71
    move-object/from16 v4, p5

    .line 72
    .line 73
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    check-cast v9, La/lok0;

    .line 95
    .line 96
    iget v9, v9, La/lok0;->a:I

    .line 97
    .line 98
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    const/4 v8, 0x0

    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    iget-boolean v9, v6, La/lok0;->n:Z

    .line 110
    .line 111
    move v13, v9

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    move v13, v8

    .line 114
    :goto_3
    if-eqz v6, :cond_4

    .line 115
    .line 116
    iget-boolean v8, v6, La/lok0;->p:Z

    .line 117
    .line 118
    :cond_4
    move v14, v8

    .line 119
    iget-object v8, v5, La/d0t;->K:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_8

    .line 126
    .line 127
    iget-object v8, v5, La/d0t;->k:Ljava/util/List;

    .line 128
    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_5

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_7

    .line 147
    .line 148
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    check-cast v9, La/d0t;

    .line 153
    .line 154
    iget-object v9, v9, La/d0t;->K:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-nez v9, :cond_6

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    :goto_4
    sget-object v8, La/i5l0;->a:La/i5l0;

    .line 164
    .line 165
    :goto_5
    move-object/from16 v17, v8

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_8
    :goto_6
    sget-object v8, La/l5l0;->a:La/l5l0;

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :goto_7
    if-eqz v6, :cond_9

    .line 172
    .line 173
    iget-object v7, v6, La/lok0;->u:Ljava/lang/String;

    .line 174
    .line 175
    :cond_9
    if-nez v7, :cond_a

    .line 176
    .line 177
    const-string v7, ""

    .line 178
    .line 179
    :cond_a
    move-object/from16 v18, v7

    .line 180
    .line 181
    const/4 v11, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    move-object/from16 v16, p1

    .line 184
    .line 185
    move-object/from16 v7, p2

    .line 186
    .line 187
    move-object/from16 v6, p3

    .line 188
    .line 189
    move/from16 v8, p4

    .line 190
    .line 191
    move/from16 v9, p6

    .line 192
    .line 193
    move/from16 v19, p7

    .line 194
    .line 195
    invoke-static/range {v5 .. v19}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_b
    return-object v2
.end method
