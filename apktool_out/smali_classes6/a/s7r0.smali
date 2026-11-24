.class public abstract La/s7r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mm40;La/t7r0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v10, p3

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v0, -0x2c305628

    .line 14
    .line 15
    .line 16
    invoke-virtual {v10, v0}, La/fet;->g0(I)La/fet;

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p0

    .line 20
    .line 21
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int v0, p4, v0

    .line 31
    .line 32
    invoke-virtual {v10, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    move v4, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v4, 0x10

    .line 43
    .line 44
    :goto_1
    or-int/2addr v0, v4

    .line 45
    invoke-virtual {v10, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    move v4, v6

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v4, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v4

    .line 58
    and-int/lit16 v4, v0, 0x93

    .line 59
    .line 60
    const/16 v7, 0x92

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x1

    .line 64
    if-eq v4, v7, :cond_3

    .line 65
    .line 66
    move v4, v9

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    move v4, v8

    .line 69
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 70
    .line 71
    invoke-virtual {v10, v7, v4}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_c

    .line 76
    .line 77
    iget-object v4, v2, La/t7r0;->c:La/jjm;

    .line 78
    .line 79
    sget-object v7, La/kjm;->a:La/kjm;

    .line 80
    .line 81
    and-int/lit16 v11, v0, 0x380

    .line 82
    .line 83
    if-ne v11, v6, :cond_4

    .line 84
    .line 85
    move v12, v9

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move v12, v8

    .line 88
    :goto_4
    and-int/lit8 v13, v0, 0x70

    .line 89
    .line 90
    if-ne v13, v5, :cond_5

    .line 91
    .line 92
    move v14, v9

    .line 93
    goto :goto_5

    .line 94
    :cond_5
    move v14, v8

    .line 95
    :goto_5
    or-int/2addr v12, v14

    .line 96
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    sget-object v15, La/ukd;->a:La/cl5;

    .line 101
    .line 102
    if-nez v12, :cond_6

    .line 103
    .line 104
    if-ne v14, v15, :cond_7

    .line 105
    .line 106
    :cond_6
    new-instance v14, La/r7r0;

    .line 107
    .line 108
    invoke-direct {v14, v3, v2}, La/r7r0;-><init>(Lkotlin/jvm/functions/Function1;La/t7r0;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_7
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 115
    .line 116
    if-ne v13, v5, :cond_8

    .line 117
    .line 118
    move v5, v9

    .line 119
    goto :goto_6

    .line 120
    :cond_8
    move v5, v8

    .line 121
    :goto_6
    if-ne v11, v6, :cond_9

    .line 122
    .line 123
    move v8, v9

    .line 124
    :cond_9
    or-int/2addr v5, v8

    .line 125
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-nez v5, :cond_a

    .line 130
    .line 131
    if-ne v6, v15, :cond_b

    .line 132
    .line 133
    :cond_a
    new-instance v6, La/r7r0;

    .line 134
    .line 135
    invoke-direct {v6, v2, v3}, La/r7r0;-><init>(La/t7r0;Lkotlin/jvm/functions/Function1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    move-object v9, v6

    .line 142
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 143
    .line 144
    and-int/lit8 v11, v0, 0xe

    .line 145
    .line 146
    const/16 v12, 0x8

    .line 147
    .line 148
    move-object v6, v7

    .line 149
    const/4 v7, 0x0

    .line 150
    move-object v5, v4

    .line 151
    move-object v8, v14

    .line 152
    move-object v4, v1

    .line 153
    invoke-static/range {v4 .. v12}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_c
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_7
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-eqz v6, :cond_d

    .line 165
    .line 166
    new-instance v0, La/cgm0;

    .line 167
    .line 168
    const/16 v5, 0x17

    .line 169
    .line 170
    move-object/from16 v1, p0

    .line 171
    .line 172
    move/from16 v4, p4

    .line 173
    .line 174
    invoke-direct/range {v0 .. v5}, La/cgm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 175
    .line 176
    .line 177
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 178
    .line 179
    :cond_d
    return-void
.end method
