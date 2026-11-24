.class public final La/vrk0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(La/mm40;La/yx5;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/ebo0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/xdr;La/fet;I)V
    .locals 11

    .line 1
    move-object/from16 v7, p8

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v0, -0x294d892c

    .line 19
    .line 20
    .line 21
    invoke-virtual {v7, v0}, La/fet;->g0(I)La/fet;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x20

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v0, 0x10

    .line 34
    .line 35
    :goto_0
    or-int v0, p9, v0

    .line 36
    .line 37
    invoke-virtual {v7, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const/16 v1, 0x100

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/16 v1, 0x80

    .line 47
    .line 48
    :goto_1
    or-int/2addr v0, v1

    .line 49
    invoke-virtual {v7, p4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/16 v1, 0x800

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v1, 0x400

    .line 59
    .line 60
    :goto_2
    or-int/2addr v0, v1

    .line 61
    move-object/from16 v4, p5

    .line 62
    .line 63
    invoke-virtual {v7, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    const/16 v1, 0x4000

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    const/16 v1, 0x2000

    .line 73
    .line 74
    :goto_3
    or-int/2addr v0, v1

    .line 75
    move-object/from16 v8, p6

    .line 76
    .line 77
    invoke-virtual {v7, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    const/high16 v1, 0x20000

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    const/high16 v1, 0x10000

    .line 87
    .line 88
    :goto_4
    or-int/2addr v0, v1

    .line 89
    move-object/from16 v6, p7

    .line 90
    .line 91
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    const/high16 v1, 0x100000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    const/high16 v1, 0x80000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v0, v1

    .line 103
    const v1, 0x92493

    .line 104
    .line 105
    .line 106
    and-int/2addr v1, v0

    .line 107
    const v2, 0x92492

    .line 108
    .line 109
    .line 110
    if-eq v1, v2, :cond_6

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    goto :goto_6

    .line 114
    :cond_6
    const/4 v1, 0x0

    .line 115
    :goto_6
    and-int/lit8 v2, v0, 0x1

    .line 116
    .line 117
    invoke-virtual {v7, v2, v1}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    and-int/lit8 v1, v0, 0x70

    .line 124
    .line 125
    const/16 v2, 0x46

    .line 126
    .line 127
    or-int/2addr v1, v2

    .line 128
    and-int/lit16 v2, v0, 0x380

    .line 129
    .line 130
    or-int/2addr v1, v2

    .line 131
    and-int/lit16 v2, v0, 0x1c00

    .line 132
    .line 133
    or-int/2addr v1, v2

    .line 134
    const v2, 0xe000

    .line 135
    .line 136
    .line 137
    and-int/2addr v2, v0

    .line 138
    or-int/2addr v1, v2

    .line 139
    const/high16 v2, 0x70000

    .line 140
    .line 141
    and-int/2addr v2, v0

    .line 142
    or-int/2addr v1, v2

    .line 143
    const/high16 v2, 0x380000

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    or-int/2addr v0, v1

    .line 147
    move-object v1, p2

    .line 148
    move-object v2, p3

    .line 149
    move-object v3, p4

    .line 150
    move-object v5, v8

    .line 151
    move v8, v0

    .line 152
    move-object v0, p1

    .line 153
    invoke-static/range {v0 .. v8}, La/bbo0;->a(La/mm40;La/yx5;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/ebo0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/xdr;La/fet;I)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_7
    invoke-virtual/range {p8 .. p8}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_7
    invoke-virtual/range {p8 .. p8}, La/fet;->u()La/yfe0;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    new-instance v1, La/fw6;

    .line 167
    .line 168
    move-object v2, p0

    .line 169
    move-object v3, p1

    .line 170
    move-object v4, p2

    .line 171
    move-object v5, p3

    .line 172
    move-object v6, p4

    .line 173
    move-object/from16 v7, p5

    .line 174
    .line 175
    move-object/from16 v8, p6

    .line 176
    .line 177
    move-object/from16 v9, p7

    .line 178
    .line 179
    move/from16 v10, p9

    .line 180
    .line 181
    invoke-direct/range {v1 .. v10}, La/fw6;-><init>(La/vrk0;La/mm40;La/yx5;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/ebo0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/xdr;I)V

    .line 182
    .line 183
    .line 184
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 185
    .line 186
    :cond_8
    return-void
.end method
