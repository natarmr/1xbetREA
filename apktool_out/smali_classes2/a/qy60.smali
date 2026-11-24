.class public final synthetic La/qy60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uy60;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/uy60;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/qy60;->a:B

    iput-object p1, p0, La/qy60;->b:La/uy60;

    iput-object p2, p0, La/qy60;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/uy60;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput-byte p3, p0, La/qy60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qy60;->b:La/uy60;

    iput-object p2, p0, La/qy60;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qy60;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/qy60;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object v0, v0, La/qy60;->b:La/uy60;

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
    invoke-static {v0, v6, v1, v2}, La/yyw;->m(La/uy60;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v7, p1

    .line 39
    .line 40
    check-cast v7, La/fet;

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
    and-int/lit8 v8, v1, 0x3

    .line 51
    .line 52
    if-eq v8, v4, :cond_0

    .line 53
    .line 54
    move v3, v5

    .line 55
    :cond_0
    and-int/2addr v1, v5

    .line 56
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget-object v0, v0, La/uy60;->f:La/mtl;

    .line 63
    .line 64
    sget-object v3, La/ma80;->b:La/ma80;

    .line 65
    .line 66
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    if-ne v4, v2, :cond_2

    .line 77
    .line 78
    :cond_1
    new-instance v4, La/i160;

    .line 79
    .line 80
    const/4 v1, 0x5

    .line 81
    invoke-direct {v4, v6, v1}, La/i160;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    move-object v6, v4

    .line 88
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 89
    .line 90
    const/16 v8, 0x180

    .line 91
    .line 92
    const/16 v9, 0x19

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    move-object v2, v0

    .line 98
    invoke-static/range {v1 .. v9}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {v7}, La/fet;->X()V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_1
    move-object/from16 v13, p1

    .line 109
    .line 110
    check-cast v13, La/fet;

    .line 111
    .line 112
    move-object/from16 v1, p2

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    and-int/lit8 v7, v1, 0x3

    .line 121
    .line 122
    if-eq v7, v4, :cond_4

    .line 123
    .line 124
    move v4, v5

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move v4, v3

    .line 127
    :goto_1
    and-int/2addr v1, v5

    .line 128
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_7

    .line 133
    .line 134
    sget-object v1, La/jm40;->b:La/jm40;

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    const/4 v5, 0x3

    .line 138
    invoke-static {v1, v4, v3, v5}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-object v0, v0, La/uy60;->e:La/imm;

    .line 143
    .line 144
    invoke-virtual {v13, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v3, :cond_5

    .line 153
    .line 154
    if-ne v4, v2, :cond_6

    .line 155
    .line 156
    :cond_5
    new-instance v4, La/ju60;

    .line 157
    .line 158
    const/16 v2, 0x9

    .line 159
    .line 160
    invoke-direct {v4, v6, v2}, La/ju60;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 167
    .line 168
    const/4 v15, 0x0

    .line 169
    const/16 v16, 0xff4

    .line 170
    .line 171
    const/4 v3, 0x0

    .line 172
    const/4 v5, 0x0

    .line 173
    const/4 v6, 0x0

    .line 174
    const/4 v7, 0x0

    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v14, 0x6

    .line 181
    move-object v2, v0

    .line 182
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
