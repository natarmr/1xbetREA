.class public final La/mc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/zeo0;La/yje;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput-byte v0, p0, La/mc0;->i:B

    .line 4
    .line 5
    iput p1, p0, La/mc0;->j:I

    .line 6
    .line 7
    iput-object p2, p0, La/mc0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/kie0;ILa/yje;)V
    .locals 1

    const/16 v0, 0xb

    iput-byte v0, p0, La/mc0;->i:B

    .line 15
    iput-object p1, p0, La/mc0;->l:Ljava/lang/Object;

    iput p2, p0, La/mc0;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/kr5;La/mh1;ILa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/mc0;->i:B

    .line 14
    iput-object p1, p0, La/mc0;->l:Ljava/lang/Object;

    iput-object p2, p0, La/mc0;->k:Ljava/lang/Object;

    iput p3, p0, La/mc0;->j:I

    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/mc0;->i:B

    iput-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    iput p2, p0, La/mc0;->j:I

    iput-object p3, p0, La/mc0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, La/mc0;->i:B

    iput-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/mc0;->l:Ljava/lang/Object;

    iput p3, p0, La/mc0;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/mc0;->i:B

    .line 2
    .line 3
    iget v1, p0, La/mc0;->j:I

    .line 4
    .line 5
    iget-object v2, p0, La/mc0;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/mc0;

    .line 11
    .line 12
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Lorg/xplatform/secret/impl/KeysImpl;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    iget v6, p0, La/mc0;->j:I

    .line 21
    .line 22
    const/16 v8, 0xc

    .line 23
    .line 24
    move-object v7, p2

    .line 25
    invoke-direct/range {v3 .. v8}, La/mc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :pswitch_0
    move-object v8, p2

    .line 30
    new-instance p0, La/mc0;

    .line 31
    .line 32
    check-cast v2, La/kie0;

    .line 33
    .line 34
    invoke-direct {p0, v2, v1, v8}, La/mc0;-><init>(La/kie0;ILa/yje;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    move-object v8, p2

    .line 41
    new-instance v4, La/mc0;

    .line 42
    .line 43
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    move-object v7, v2

    .line 49
    check-cast v7, Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    const/16 v9, 0xa

    .line 52
    .line 53
    iget v6, p0, La/mc0;->j:I

    .line 54
    .line 55
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_2
    move-object v8, p2

    .line 60
    new-instance p0, La/mc0;

    .line 61
    .line 62
    check-cast v2, La/zeo0;

    .line 63
    .line 64
    invoke-direct {p0, v1, v2, v8}, La/mc0;-><init>(ILa/zeo0;La/yje;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_3
    move-object v8, p2

    .line 71
    new-instance v4, La/mc0;

    .line 72
    .line 73
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v5, p1

    .line 76
    check-cast v5, La/ncl0;

    .line 77
    .line 78
    move-object v7, v2

    .line 79
    check-cast v7, Ljava/util/List;

    .line 80
    .line 81
    const/16 v9, 0x8

    .line 82
    .line 83
    iget v6, p0, La/mc0;->j:I

    .line 84
    .line 85
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_4
    move-object v8, p2

    .line 90
    new-instance v4, La/mc0;

    .line 91
    .line 92
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, p1

    .line 95
    check-cast v5, La/gu80;

    .line 96
    .line 97
    move-object v7, v2

    .line 98
    check-cast v7, La/rv80;

    .line 99
    .line 100
    const/4 v9, 0x7

    .line 101
    iget v6, p0, La/mc0;->j:I

    .line 102
    .line 103
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 104
    .line 105
    .line 106
    return-object v4

    .line 107
    :pswitch_5
    move-object v8, p2

    .line 108
    new-instance v4, La/mc0;

    .line 109
    .line 110
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v5, p1

    .line 113
    check-cast v5, La/a4x;

    .line 114
    .line 115
    move-object v6, v2

    .line 116
    check-cast v6, La/pz40;

    .line 117
    .line 118
    iget v7, p0, La/mc0;->j:I

    .line 119
    .line 120
    const/4 v9, 0x6

    .line 121
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 122
    .line 123
    .line 124
    return-object v4

    .line 125
    :pswitch_6
    move-object v8, p2

    .line 126
    new-instance v4, La/mc0;

    .line 127
    .line 128
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v5, p1

    .line 131
    check-cast v5, La/kwj;

    .line 132
    .line 133
    move-object v7, v2

    .line 134
    check-cast v7, La/pz40;

    .line 135
    .line 136
    const/4 v9, 0x5

    .line 137
    iget v6, p0, La/mc0;->j:I

    .line 138
    .line 139
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 140
    .line 141
    .line 142
    return-object v4

    .line 143
    :pswitch_7
    move-object v8, p2

    .line 144
    new-instance v4, La/mc0;

    .line 145
    .line 146
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 147
    .line 148
    move-object v5, p1

    .line 149
    check-cast v5, La/rah0;

    .line 150
    .line 151
    move-object v7, v2

    .line 152
    check-cast v7, La/vne;

    .line 153
    .line 154
    const/4 v9, 0x4

    .line 155
    iget v6, p0, La/mc0;->j:I

    .line 156
    .line 157
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 158
    .line 159
    .line 160
    return-object v4

    .line 161
    :pswitch_8
    move-object v8, p2

    .line 162
    new-instance v4, La/mc0;

    .line 163
    .line 164
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 165
    .line 166
    move-object v5, p1

    .line 167
    check-cast v5, La/xk80;

    .line 168
    .line 169
    move-object v7, v2

    .line 170
    check-cast v7, La/vne;

    .line 171
    .line 172
    const/4 v9, 0x3

    .line 173
    iget v6, p0, La/mc0;->j:I

    .line 174
    .line 175
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 176
    .line 177
    .line 178
    return-object v4

    .line 179
    :pswitch_9
    move-object v8, p2

    .line 180
    new-instance p1, La/mc0;

    .line 181
    .line 182
    check-cast v2, La/kr5;

    .line 183
    .line 184
    iget-object p0, p0, La/mc0;->k:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, La/mh1;

    .line 187
    .line 188
    invoke-direct {p1, v2, p0, v1, v8}, La/mc0;-><init>(La/kr5;La/mh1;ILa/yje;)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_a
    move-object v8, p2

    .line 193
    new-instance v4, La/mc0;

    .line 194
    .line 195
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v5, p1

    .line 198
    check-cast v5, La/n21;

    .line 199
    .line 200
    move-object v6, v2

    .line 201
    check-cast v6, La/nw80;

    .line 202
    .line 203
    iget v7, p0, La/mc0;->j:I

    .line 204
    .line 205
    const/4 v9, 0x1

    .line 206
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 207
    .line 208
    .line 209
    return-object v4

    .line 210
    :pswitch_b
    move-object v8, p2

    .line 211
    new-instance v4, La/mc0;

    .line 212
    .line 213
    iget-object p1, p0, La/mc0;->k:Ljava/lang/Object;

    .line 214
    .line 215
    move-object v5, p1

    .line 216
    check-cast v5, La/nc0;

    .line 217
    .line 218
    move-object v6, v2

    .line 219
    check-cast v6, La/kr5;

    .line 220
    .line 221
    iget v7, p0, La/mc0;->j:I

    .line 222
    .line 223
    const/4 v9, 0x0

    .line 224
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 225
    .line 226
    .line 227
    return-object v4

    .line 228
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qah0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mc0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/mc0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/sar0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/mc0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/mc0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/mc0;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/mc0;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/vne;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/mc0;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/vne;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/mc0;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, La/vne;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/mc0;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, La/vne;

    .line 177
    .line 178
    check-cast p2, La/yje;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/mc0;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, La/vne;

    .line 194
    .line 195
    check-cast p2, La/yje;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/mc0;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p1, La/vne;

    .line 211
    .line 212
    check-cast p2, La/yje;

    .line 213
    .line 214
    invoke-virtual {p0, p1, p2}, La/mc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/mc0;

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, La/mc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mc0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    iget v6, v0, La/mc0;->j:I

    .line 10
    .line 11
    iget-object v7, v0, La/mc0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "keys"

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lorg/xplatform/secret/impl/KeysImpl;

    .line 29
    .line 30
    check-cast v7, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v7, v6}, Lorg/xplatform/secret/impl/KeysImpl;->d(Lorg/xplatform/secret/impl/KeysImpl;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lorg/xplatform/secret/impl/KeysImpl;->a:La/odd;

    .line 36
    .line 37
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_0
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/qah0;

    .line 46
    .line 47
    sget-object v1, La/wne;->a:La/wne;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    check-cast v7, La/kie0;

    .line 53
    .line 54
    int-to-float v1, v6

    .line 55
    invoke-interface {v0, v1}, La/qah0;->a(F)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, La/si30;->b(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput v0, v7, La/kie0;->a:I

    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    new-instance v1, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-direct {v1, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 80
    .line 81
    .line 82
    check-cast v7, Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_2
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La/sar0;

    .line 93
    .line 94
    sget-object v1, La/wne;->a:La/wne;

    .line 95
    .line 96
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, v0, La/sar0;->a:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/tcr0;

    .line 106
    .line 107
    check-cast v7, La/zeo0;

    .line 108
    .line 109
    new-instance v2, La/o3m0;

    .line 110
    .line 111
    const/16 v3, 0x13

    .line 112
    .line 113
    invoke-direct {v2, v1, v0, v3}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    sget v0, La/zeo0;->u:I

    .line 117
    .line 118
    invoke-virtual {v7, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 125
    .line 126
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, La/ncl0;

    .line 132
    .line 133
    iget-object v0, v0, La/ncl0;->R:La/p7m0;

    .line 134
    .line 135
    new-instance v1, La/xal0;

    .line 136
    .line 137
    check-cast v7, Ljava/util/List;

    .line 138
    .line 139
    invoke-direct {v1, v6, v7}, La/xal0;-><init>(ILjava/util/List;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 152
    .line 153
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/gu80;

    .line 159
    .line 160
    check-cast v0, La/du80;

    .line 161
    .line 162
    iget-object v0, v0, La/du80;->a:Ljava/util/List;

    .line 163
    .line 164
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, La/rx3;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :cond_0
    move-object v1, v0

    .line 173
    check-cast v1, La/iil;

    .line 174
    .line 175
    iget-object v2, v1, La/iil;->b:Ljava/util/Iterator;

    .line 176
    .line 177
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_1

    .line 182
    .line 183
    invoke-virtual {v1}, La/iil;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    move-object v2, v1

    .line 188
    check-cast v2, Lkotlin/collections/IndexedValue;

    .line 189
    .line 190
    iget-object v2, v2, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, La/lr5;

    .line 193
    .line 194
    iget v2, v2, La/lr5;->a:I

    .line 195
    .line 196
    if-ne v2, v6, :cond_0

    .line 197
    .line 198
    move-object v4, v1

    .line 199
    :cond_1
    check-cast v4, Lkotlin/collections/IndexedValue;

    .line 200
    .line 201
    if-eqz v4, :cond_2

    .line 202
    .line 203
    check-cast v7, La/rv80;

    .line 204
    .line 205
    iget-object v8, v7, La/rv80;->y:La/nc0;

    .line 206
    .line 207
    iget-object v0, v4, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v9, v0

    .line 210
    check-cast v9, La/lr5;

    .line 211
    .line 212
    iget v10, v4, Lkotlin/collections/IndexedValue;->a:I

    .line 213
    .line 214
    iget-object v0, v7, La/rv80;->J:La/eyg0;

    .line 215
    .line 216
    new-instance v11, La/lu0;

    .line 217
    .line 218
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, La/yu80;

    .line 223
    .line 224
    iget-object v1, v1, La/yu80;->l:Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 225
    .line 226
    iget-wide v12, v1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    .line 227
    .line 228
    new-instance v1, La/g3z;

    .line 229
    .line 230
    int-to-long v2, v6

    .line 231
    const-string v4, "carousel"

    .line 232
    .line 233
    invoke-direct {v1, v2, v3, v4}, La/g3z;-><init>(JLjava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v16

    .line 240
    const/4 v14, 0x0

    .line 241
    const-string v15, "aggregator_partition_screen"

    .line 242
    .line 243
    invoke-direct/range {v11 .. v16}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v11}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    new-instance v13, La/hv80;

    .line 255
    .line 256
    const/4 v0, 0x4

    .line 257
    invoke-direct {v13, v7, v0}, La/hv80;-><init>(La/rv80;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v8 .. v13}, La/nc0;->y(La/lr5;ILjava/lang/String;La/bvc;Lkotlin/jvm/functions/Function1;)V

    .line 261
    .line 262
    .line 263
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 267
    .line 268
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, La/a4x;

    .line 274
    .line 275
    new-instance v1, Ljava/util/ArrayList;

    .line 276
    .line 277
    const/16 v2, 0xa

    .line 278
    .line 279
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    move v8, v5

    .line 291
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_6

    .line 296
    .line 297
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    add-int/lit8 v10, v8, 0x1

    .line 302
    .line 303
    if-ltz v8, :cond_5

    .line 304
    .line 305
    check-cast v9, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;

    .line 306
    .line 307
    new-instance v11, La/rhz;

    .line 308
    .line 309
    iget v12, v9, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;->a:I

    .line 310
    .line 311
    new-instance v13, La/rqm;

    .line 312
    .line 313
    new-instance v14, La/tui0;

    .line 314
    .line 315
    iget-object v15, v9, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;->b:Ljava/lang/String;

    .line 316
    .line 317
    invoke-direct {v14, v15, v4}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 318
    .line 319
    .line 320
    new-instance v15, La/nvi0;

    .line 321
    .line 322
    iget v9, v9, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;->a:I

    .line 323
    .line 324
    if-ne v9, v6, :cond_3

    .line 325
    .line 326
    move v9, v3

    .line 327
    goto :goto_1

    .line 328
    :cond_3
    move v9, v5

    .line 329
    :goto_1
    invoke-direct {v15, v9}, La/nvi0;-><init>(Z)V

    .line 330
    .line 331
    .line 332
    const/16 v21, 0x0

    .line 333
    .line 334
    const/16 v22, 0x1fa

    .line 335
    .line 336
    move-object/from16 v16, v15

    .line 337
    .line 338
    const/4 v15, 0x0

    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const/16 v18, 0x0

    .line 342
    .line 343
    const/16 v19, 0x0

    .line 344
    .line 345
    const/16 v20, 0x0

    .line 346
    .line 347
    invoke-direct/range {v13 .. v22}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    sub-int/2addr v9, v3

    .line 355
    if-ne v8, v9, :cond_4

    .line 356
    .line 357
    move v8, v3

    .line 358
    goto :goto_2

    .line 359
    :cond_4
    move v8, v5

    .line 360
    :goto_2
    invoke-direct {v11, v12, v13, v8}, La/rhz;-><init>(ILa/rqm;Z)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move v8, v10

    .line 367
    goto :goto_0

    .line 368
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 369
    .line 370
    .line 371
    throw v4

    .line 372
    :cond_6
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v7, La/pz40;

    .line 377
    .line 378
    new-instance v1, La/ohz;

    .line 379
    .line 380
    invoke-direct {v1, v0}, La/ohz;-><init>(Ljava/util/List;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v7, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_6
    check-cast v7, La/pz40;

    .line 390
    .line 391
    sget-object v1, La/wne;->a:La/wne;

    .line 392
    .line 393
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, La/kwj;

    .line 399
    .line 400
    invoke-virtual {v0}, La/xk80;->k()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    invoke-virtual {v0}, La/xk80;->l()F

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-virtual {v0}, La/kwj;->n()I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    sub-int/2addr v0, v3

    .line 413
    const v3, 0x3ecccccd    # 0.4f

    .line 414
    .line 415
    .line 416
    cmpl-float v3, v2, v3

    .line 417
    .line 418
    if-lez v3, :cond_7

    .line 419
    .line 420
    if-ge v1, v0, :cond_7

    .line 421
    .line 422
    add-int/lit8 v1, v1, 0x1

    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_7
    const v0, -0x41333333    # -0.4f

    .line 426
    .line 427
    .line 428
    cmpg-float v0, v2, v0

    .line 429
    .line 430
    if-gez v0, :cond_8

    .line 431
    .line 432
    if-lez v1, :cond_8

    .line 433
    .line 434
    add-int/lit8 v1, v1, -0x1

    .line 435
    .line 436
    :cond_8
    :goto_3
    add-int/2addr v6, v1

    .line 437
    invoke-static {v6}, La/bsr0;->d0(I)La/w2w0;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    check-cast v1, La/w2w0;

    .line 446
    .line 447
    invoke-virtual {v0, v1}, La/w2w0;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    if-nez v1, :cond_9

    .line 452
    .line 453
    invoke-interface {v7, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_7
    sget-object v1, La/wne;->a:La/wne;

    .line 460
    .line 461
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v0, La/rah0;

    .line 467
    .line 468
    iget-object v1, v0, La/rah0;->b:La/cgk0;

    .line 469
    .line 470
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    int-to-float v1, v1

    .line 475
    const/high16 v8, 0x42c80000    # 100.0f

    .line 476
    .line 477
    mul-float/2addr v1, v8

    .line 478
    const/high16 v8, 0x43b40000    # 360.0f

    .line 479
    .line 480
    div-float/2addr v1, v8

    .line 481
    sub-int/2addr v6, v3

    .line 482
    int-to-float v3, v6

    .line 483
    mul-float/2addr v3, v1

    .line 484
    float-to-int v1, v3

    .line 485
    if-gez v1, :cond_a

    .line 486
    .line 487
    move v1, v5

    .line 488
    :cond_a
    iget-object v3, v0, La/rah0;->f:La/cgk0;

    .line 489
    .line 490
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-le v1, v3, :cond_b

    .line 495
    .line 496
    move v1, v3

    .line 497
    :cond_b
    check-cast v7, La/vne;

    .line 498
    .line 499
    new-instance v3, La/pt8;

    .line 500
    .line 501
    invoke-direct {v3, v0, v1, v4, v5}, La/pt8;-><init>(La/rah0;ILa/yje;B)V

    .line 502
    .line 503
    .line 504
    invoke-static {v7, v4, v4, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 505
    .line 506
    .line 507
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_8
    sget-object v1, La/wne;->a:La/wne;

    .line 511
    .line 512
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, La/xk80;

    .line 518
    .line 519
    invoke-virtual {v0}, La/xk80;->k()I

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    if-eq v1, v6, :cond_c

    .line 524
    .line 525
    check-cast v7, La/vne;

    .line 526
    .line 527
    new-instance v1, La/u48;

    .line 528
    .line 529
    invoke-direct {v1, v0, v6, v4, v5}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 530
    .line 531
    .line 532
    invoke-static {v7, v4, v4, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 533
    .line 534
    .line 535
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_9
    sget-object v1, La/wne;->a:La/wne;

    .line 539
    .line 540
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    check-cast v7, La/kr5;

    .line 544
    .line 545
    iget-object v1, v7, La/kr5;->n:La/oo5;

    .line 546
    .line 547
    sget-object v2, La/oo5;->e:La/oo5;

    .line 548
    .line 549
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, La/mh1;

    .line 552
    .line 553
    if-ne v1, v2, :cond_d

    .line 554
    .line 555
    iget-object v1, v0, La/mh1;->Y:La/oeg0;

    .line 556
    .line 557
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    new-instance v3, La/bh1;

    .line 566
    .line 567
    invoke-direct {v3, v0, v7, v6, v5}, La/bh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 568
    .line 569
    .line 570
    new-instance v0, La/a1w0;

    .line 571
    .line 572
    invoke-direct {v0, v3}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 573
    .line 574
    .line 575
    new-instance v3, La/c8d;

    .line 576
    .line 577
    sget-object v4, La/y7d;->a:La/v7d;

    .line 578
    .line 579
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v2, v3, v1, v2, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    :goto_4
    move-object v2, v0

    .line 587
    check-cast v2, La/paw;

    .line 588
    .line 589
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-eqz v3, :cond_e

    .line 594
    .line 595
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    check-cast v2, La/oe50;

    .line 600
    .line 601
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 602
    .line 603
    .line 604
    goto :goto_4

    .line 605
    :cond_d
    sget-object v1, La/mh1;->E0:Ljava/lang/String;

    .line 606
    .line 607
    iget-object v1, v0, La/mh1;->T:La/jlx;

    .line 608
    .line 609
    iget-object v0, v0, La/mh1;->R:La/uzc0;

    .line 610
    .line 611
    invoke-virtual {v0, v7, v6, v3}, La/uzc0;->a(La/kr5;IZ)Landroid/content/Intent;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v1, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 616
    .line 617
    .line 618
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_a
    sget-object v1, La/wne;->a:La/wne;

    .line 622
    .line 623
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    iget-object v1, v0, La/mc0;->k:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v1, La/n21;

    .line 629
    .line 630
    iget-object v2, v1, La/n21;->w:La/s91;

    .line 631
    .line 632
    new-instance v8, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 633
    .line 634
    new-instance v9, La/ul1;

    .line 635
    .line 636
    check-cast v7, La/nw80;

    .line 637
    .line 638
    invoke-virtual {v7}, La/nw80;->getId()J

    .line 639
    .line 640
    .line 641
    move-result-wide v11

    .line 642
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    check-cast v1, La/q11;

    .line 647
    .line 648
    iget-wide v13, v1, La/q11;->a:J

    .line 649
    .line 650
    sget-object v1, La/rj1;->a:La/rj1;

    .line 651
    .line 652
    iget v10, v0, La/mc0;->j:I

    .line 653
    .line 654
    invoke-direct/range {v9 .. v14}, La/ul1;-><init>(IJJ)V

    .line 655
    .line 656
    .line 657
    const/16 v20, 0x0

    .line 658
    .line 659
    const/16 v21, 0x1f7

    .line 660
    .line 661
    move-object v13, v9

    .line 662
    const/4 v9, 0x0

    .line 663
    const/4 v10, 0x0

    .line 664
    const-wide/16 v11, 0x0

    .line 665
    .line 666
    const/4 v14, 0x0

    .line 667
    const-wide/16 v15, 0x0

    .line 668
    .line 669
    const-wide/16 v17, 0x0

    .line 670
    .line 671
    const/16 v19, 0x0

    .line 672
    .line 673
    invoke-direct/range {v8 .. v21}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v8}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 677
    .line 678
    .line 679
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 680
    .line 681
    return-object v0

    .line 682
    :pswitch_b
    sget-object v1, La/wne;->a:La/wne;

    .line 683
    .line 684
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    iget-object v0, v0, La/mc0;->k:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, La/nc0;

    .line 690
    .line 691
    iget-object v1, v0, La/nc0;->i:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v1, La/jlx;

    .line 694
    .line 695
    iget-object v0, v0, La/nc0;->g:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, La/uzc0;

    .line 698
    .line 699
    check-cast v7, La/kr5;

    .line 700
    .line 701
    invoke-virtual {v0, v7, v6, v3}, La/uzc0;->a(La/kr5;IZ)Landroid/content/Intent;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v1, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 706
    .line 707
    .line 708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
