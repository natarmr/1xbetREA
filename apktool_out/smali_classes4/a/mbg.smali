.class public final synthetic La/mbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q5h;


# direct methods
.method public synthetic constructor <init>(La/q5h;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mbg;->a:B

    iput-object p1, p0, La/mbg;->b:La/q5h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mbg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/mbg;->b:La/q5h;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    check-cast v4, La/yhg0;

    .line 15
    .line 16
    move-object/from16 v14, p2

    .line 17
    .line 18
    check-cast v14, La/fet;

    .line 19
    .line 20
    move-object/from16 v1, p3

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v5, v1, 0x6

    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v14, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v5, v6

    .line 45
    :goto_0
    or-int/2addr v1, v5

    .line 46
    :cond_1
    and-int/lit8 v5, v1, 0x13

    .line 47
    .line 48
    const/16 v7, 0x12

    .line 49
    .line 50
    if-eq v5, v7, :cond_2

    .line 51
    .line 52
    move v2, v3

    .line 53
    :cond_2
    and-int/lit8 v3, v1, 0x1

    .line 54
    .line 55
    invoke-virtual {v14, v3, v2}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    iget-boolean v2, v0, La/q5h;->d:Z

    .line 62
    .line 63
    sget-object v7, La/jm40;->b:La/jm40;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    sget-object v2, La/qmk;->a:La/zcl;

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/16 v12, 0xb

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/high16 v10, 0x41800000    # 16.0f

    .line 75
    .line 76
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :goto_1
    move-object v5, v2

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    sget-object v2, La/qmk;->a:La/zcl;

    .line 83
    .line 84
    const/high16 v2, 0x41800000    # 16.0f

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-static {v7, v2, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_1

    .line 92
    :goto_2
    iget-object v6, v0, La/q5h;->b:Ljava/lang/String;

    .line 93
    .line 94
    iget-boolean v7, v0, La/q5h;->c:Z

    .line 95
    .line 96
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 97
    .line 98
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 103
    .line 104
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 113
    .line 114
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 115
    .line 116
    .line 117
    move-result-wide v10

    .line 118
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    and-int/lit8 v15, v1, 0xe

    .line 127
    .line 128
    invoke-static/range {v4 .. v15}, La/mbc;->g(La/yhg0;La/mm40;Ljava/lang/String;ZJJLa/y9q0;La/y9q0;La/fet;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-virtual {v14}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_0
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, La/yhg0;

    .line 141
    .line 142
    move-object/from16 v4, p2

    .line 143
    .line 144
    check-cast v4, La/fet;

    .line 145
    .line 146
    move-object/from16 v5, p3

    .line 147
    .line 148
    check-cast v5, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    and-int/lit8 v1, v5, 0x11

    .line 158
    .line 159
    const/16 v6, 0x10

    .line 160
    .line 161
    if-eq v1, v6, :cond_5

    .line 162
    .line 163
    move v1, v3

    .line 164
    goto :goto_4

    .line 165
    :cond_5
    move v1, v2

    .line 166
    :goto_4
    and-int/2addr v3, v5

    .line 167
    invoke-virtual {v4, v3, v1}, La/fet;->U(IZ)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_6

    .line 172
    .line 173
    iget-boolean v0, v0, La/q5h;->c:Z

    .line 174
    .line 175
    invoke-static {v2, v4, v0}, La/mbc;->e(ILa/fet;Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_6
    invoke-virtual {v4}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
