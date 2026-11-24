.class public final synthetic La/ala;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bla;


# direct methods
.method public synthetic constructor <init>(La/bla;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ala;->a:B

    iput-object p1, p0, La/ala;->b:La/bla;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ala;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41000000    # 8.0f

    .line 8
    .line 9
    const/high16 v4, 0x42000000    # 32.0f

    .line 10
    .line 11
    const/high16 v5, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v0, v0, La/ala;->b:La/bla;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v13, p1

    .line 23
    .line 24
    check-cast v13, La/fet;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    and-int/lit8 v10, v1, 0x3

    .line 35
    .line 36
    if-eq v10, v7, :cond_0

    .line 37
    .line 38
    move v6, v8

    .line 39
    :cond_0
    and-int/2addr v1, v8

    .line 40
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object v1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/16 v18, 0x0

    .line 49
    .line 50
    const/16 v19, 0xd

    .line 51
    .line 52
    sget-object v14, La/jm40;->b:La/jm40;

    .line 53
    .line 54
    const/4 v15, 0x0

    .line 55
    const/high16 v16, 0x41000000    # 8.0f

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1, v3, v9, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    iget-object v11, v0, La/bla;->c:La/udp0;

    .line 76
    .line 77
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v2, :cond_1

    .line 82
    .line 83
    new-instance v0, La/im8;

    .line 84
    .line 85
    const/16 v1, 0x19

    .line 86
    .line 87
    invoke-direct {v0, v1}, La/im8;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    move-object v12, v0

    .line 94
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    const/16 v14, 0x180

    .line 97
    .line 98
    const/4 v15, 0x0

    .line 99
    invoke-static/range {v10 .. v15}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v13}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_0
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, La/fet;

    .line 112
    .line 113
    move-object/from16 v10, p2

    .line 114
    .line 115
    check-cast v10, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    and-int/lit8 v11, v10, 0x3

    .line 122
    .line 123
    if-eq v11, v7, :cond_3

    .line 124
    .line 125
    move v6, v8

    .line 126
    :cond_3
    and-int/2addr v8, v10

    .line 127
    invoke-virtual {v1, v8, v6}, La/fet;->U(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_5

    .line 132
    .line 133
    sget-object v6, La/qmk;->a:La/zcl;

    .line 134
    .line 135
    const/high16 v14, 0x41100000    # 9.0f

    .line 136
    .line 137
    const/4 v15, 0x7

    .line 138
    sget-object v10, La/jm40;->b:La/jm40;

    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-static {v6, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v4, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-static {v4, v3, v9, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v0, v0, La/bla;->b:La/udp0;

    .line 160
    .line 161
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-ne v4, v2, :cond_4

    .line 166
    .line 167
    new-instance v4, La/im8;

    .line 168
    .line 169
    const/16 v2, 0x18

    .line 170
    .line 171
    invoke-direct {v4, v2}, La/im8;-><init>(B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 178
    .line 179
    const/16 v5, 0x180

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    move-object v2, v4

    .line 183
    move-object v4, v1

    .line 184
    move-object v1, v3

    .line 185
    move-object v3, v2

    .line 186
    move-object v2, v0

    .line 187
    invoke-static/range {v1 .. v6}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_5
    move-object v4, v1

    .line 192
    invoke-virtual {v4}, La/fet;->X()V

    .line 193
    .line 194
    .line 195
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
