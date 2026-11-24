.class public final synthetic La/qzu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n0v0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/n0v0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/qzu0;->a:B

    iput-object p1, p0, La/qzu0;->b:La/n0v0;

    iput-object p2, p0, La/qzu0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/n0v0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput-byte p3, p0, La/qzu0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qzu0;->b:La/n0v0;

    iput-object p2, p0, La/qzu0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qzu0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/qzu0;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object v0, v0, La/qzu0;->b:La/n0v0;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    check-cast v2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v5}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v0, v6, v1, v2}, La/eeq;->P(La/n0v0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v11, p1

    .line 39
    .line 40
    check-cast v11, La/fet;

    .line 41
    .line 42
    move-object/from16 v1, p2

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    and-int/lit8 v7, v1, 0x3

    .line 51
    .line 52
    if-eq v7, v3, :cond_0

    .line 53
    .line 54
    move v3, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v3, v4

    .line 57
    :goto_0
    and-int/2addr v1, v5

    .line 58
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, La/n0v0;->b()La/mtl;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    const v0, -0x6b71a7bb

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v4}, La/fet;->r(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const v1, -0x6b71a7ba

    .line 81
    .line 82
    .line 83
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 84
    .line 85
    .line 86
    sget-object v7, La/ma80;->a:La/ma80;

    .line 87
    .line 88
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    if-ne v3, v2, :cond_3

    .line 99
    .line 100
    :cond_2
    new-instance v3, La/szu0;

    .line 101
    .line 102
    invoke-direct {v3, v6, v4}, La/szu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    move-object v10, v3

    .line 109
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 110
    .line 111
    const/16 v12, 0x180

    .line 112
    .line 113
    const/16 v13, 0x19

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    move-object v6, v0

    .line 119
    invoke-static/range {v5 .. v13}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11, v4}, La/fet;->r(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    invoke-virtual {v11}, La/fet;->X()V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_1
    move-object/from16 v13, p1

    .line 133
    .line 134
    check-cast v13, La/fet;

    .line 135
    .line 136
    move-object/from16 v1, p2

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    and-int/lit8 v7, v1, 0x3

    .line 145
    .line 146
    if-eq v7, v3, :cond_5

    .line 147
    .line 148
    move v4, v5

    .line 149
    :cond_5
    and-int/2addr v1, v5

    .line 150
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_8

    .line 155
    .line 156
    invoke-interface {v0}, La/n0v0;->a()La/imm;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v13, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    if-ne v3, v2, :cond_7

    .line 171
    .line 172
    :cond_6
    new-instance v3, La/ntu0;

    .line 173
    .line 174
    const/4 v1, 0x5

    .line 175
    invoke-direct {v3, v6, v1}, La/ntu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_7
    move-object v4, v3

    .line 182
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0xff5

    .line 186
    .line 187
    const/4 v1, 0x0

    .line 188
    const/4 v3, 0x0

    .line 189
    const/4 v5, 0x0

    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const/4 v9, 0x0

    .line 194
    const/4 v10, 0x0

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v12, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    move-object v2, v0

    .line 199
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_8
    invoke-virtual {v13}, La/fet;->X()V

    .line 204
    .line 205
    .line 206
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
