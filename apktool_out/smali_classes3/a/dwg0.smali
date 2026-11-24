.class public final synthetic La/dwg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dxg0;


# direct methods
.method public synthetic constructor <init>(La/dxg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dwg0;->a:B

    iput-object p1, p0, La/dwg0;->b:La/dxg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dwg0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/dwg0;->b:La/dxg0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, La/vtf0;

    .line 18
    .line 19
    const/16 v3, 0x1c

    .line 20
    .line 21
    invoke-direct {v2, v3}, La/vtf0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/dxg0;->C:La/duj;

    .line 28
    .line 29
    instance-of v3, v1, Ljava/net/SocketTimeoutException;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v4, v1, Ljava/net/UnknownHostException;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    :goto_0
    if-eqz v3, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    instance-of v3, v1, Ljava/net/UnknownHostException;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    :goto_1
    new-instance v1, La/vtf0;

    .line 46
    .line 47
    const/16 v2, 0x1d

    .line 48
    .line 49
    invoke-direct {v1, v2}, La/vtf0;-><init>(B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    new-instance v3, La/fwg0;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-direct {v3, v0, v4}, La/fwg0;-><init>(La/dxg0;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    instance-of v3, v1, La/zhi0;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    new-instance v3, La/fwg0;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-direct {v3, v0, v4}, La/fwg0;-><init>(La/dxg0;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, La/dxg0;->M()V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {v0}, La/dxg0;->M()V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/k0w0;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, La/dxg0;->o:Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 97
    .line 98
    iget-wide v2, v0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    .line 99
    .line 100
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v0, v0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    .line 105
    .line 106
    new-instance v3, Lorg/xplatform/bet_history/transation_history/presentation/TransactionHistoryScreen;

    .line 107
    .line 108
    invoke-direct {v3, v0, v2}, Lorg/xplatform/bet_history/transation_history/presentation/TransactionHistoryScreen;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    move-object/from16 v1, p1

    .line 118
    .line 119
    check-cast v1, Ljava/lang/Throwable;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    instance-of v2, v1, La/zhi0;

    .line 125
    .line 126
    if-eqz v2, :cond_5

    .line 127
    .line 128
    iget-object v2, v0, La/dxg0;->w:La/nj7;

    .line 129
    .line 130
    move-object v3, v1

    .line 131
    check-cast v3, La/zhi0;

    .line 132
    .line 133
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 134
    .line 135
    invoke-interface {v3}, La/kuw;->getErrorCode()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-virtual {v2, v3}, La/nj7;->b(I)V

    .line 140
    .line 141
    .line 142
    :cond_5
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 143
    .line 144
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 145
    .line 146
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 154
    .line 155
    move-object v5, v3

    .line 156
    check-cast v5, La/svg0;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const/16 v30, 0x0

    .line 162
    .line 163
    const v31, 0x7ff7ff

    .line 164
    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    const/4 v7, 0x0

    .line 168
    const/4 v8, 0x0

    .line 169
    const-wide/16 v9, 0x0

    .line 170
    .line 171
    const-wide/16 v11, 0x0

    .line 172
    .line 173
    const-wide/16 v13, 0x0

    .line 174
    .line 175
    const-wide/16 v15, 0x0

    .line 176
    .line 177
    const-wide/16 v17, 0x0

    .line 178
    .line 179
    const-wide/16 v19, 0x0

    .line 180
    .line 181
    const-wide/16 v21, 0x0

    .line 182
    .line 183
    const/16 v23, 0x0

    .line 184
    .line 185
    const/16 v24, 0x0

    .line 186
    .line 187
    const/16 v25, 0x0

    .line 188
    .line 189
    const/16 v26, 0x0

    .line 190
    .line 191
    const/16 v27, 0x0

    .line 192
    .line 193
    const/16 v28, 0x0

    .line 194
    .line 195
    const/16 v29, 0x0

    .line 196
    .line 197
    invoke-static/range {v5 .. v31}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_6

    .line 206
    .line 207
    iget-object v2, v0, La/dxg0;->C:La/duj;

    .line 208
    .line 209
    new-instance v3, La/j5d0;

    .line 210
    .line 211
    const/16 v4, 0x16

    .line 212
    .line 213
    invoke-direct {v3, v1, v0, v4}, La/j5d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
