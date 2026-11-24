.class public final La/kco0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/zco0;


# direct methods
.method public synthetic constructor <init>(La/zco0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kco0;->i:B

    iput-object p1, p0, La/kco0;->k:La/zco0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kco0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kco0;->k:La/zco0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kco0;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/kco0;

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/kco0;

    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/kco0;

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/kco0;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/kco0;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/kco0;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_6
    new-instance v0, La/kco0;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, p0, p2, v1}, La/kco0;-><init>(La/zco0;La/yje;B)V

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, La/kco0;->j:Ljava/lang/Object;

    .line 78
    .line 79
    return-object v0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/kco0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kco0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kco0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lkotlin/collections/IndexedValue;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/kco0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/x5r0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/kco0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/skb0;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/kco0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/kco0;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/kco0;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/kco0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/kco0;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/kco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kco0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/kco0;->k:La/zco0;

    .line 9
    .line 10
    iget-object v0, v0, La/kco0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Ljava/lang/Throwable;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    sget v0, La/zco0;->r0:I

    .line 27
    .line 28
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 29
    .line 30
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v3, v0

    .line 40
    check-cast v3, La/glb0;

    .line 41
    .line 42
    new-instance v11, La/gn00;

    .line 43
    .line 44
    invoke-direct {v11, v1}, La/gn00;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const v23, 0x1ffdfff

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    const/16 v18, 0x0

    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/16 v20, 0x0

    .line 72
    .line 73
    const/16 v21, 0x0

    .line 74
    .line 75
    invoke-static/range {v3 .. v23}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_0
    move-object v1, v0

    .line 89
    check-cast v1, Ljava/util/List;

    .line 90
    .line 91
    sget-object v0, La/wne;->a:La/wne;

    .line 92
    .line 93
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget v0, La/zco0;->r0:I

    .line 97
    .line 98
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v3, v0

    .line 110
    check-cast v3, La/glb0;

    .line 111
    .line 112
    new-instance v11, La/jn00;

    .line 113
    .line 114
    invoke-direct {v11, v1}, La/jn00;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const v23, 0x1ffdfff

    .line 120
    .line 121
    .line 122
    const/4 v4, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x0

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    const/16 v20, 0x0

    .line 142
    .line 143
    const/16 v21, 0x0

    .line 144
    .line 145
    invoke-static/range {v3 .. v23}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_1

    .line 154
    .line 155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_1
    check-cast v0, Lkotlin/collections/IndexedValue;

    .line 159
    .line 160
    sget-object v1, La/wne;->a:La/wne;

    .line 161
    .line 162
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget v1, v0, Lkotlin/collections/IndexedValue;->a:I

    .line 166
    .line 167
    iget-object v0, v0, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ljava/lang/Boolean;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    sget v0, La/zco0;->r0:I

    .line 176
    .line 177
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 178
    .line 179
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 180
    .line 181
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-object v6, v0

    .line 189
    check-cast v6, La/glb0;

    .line 190
    .line 191
    const/16 v25, 0x0

    .line 192
    .line 193
    const v26, 0x1fffff7

    .line 194
    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const/4 v9, 0x0

    .line 198
    const/4 v10, 0x0

    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v12, 0x0

    .line 201
    const/4 v13, 0x0

    .line 202
    const/4 v14, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/16 v18, 0x0

    .line 209
    .line 210
    const/16 v19, 0x0

    .line 211
    .line 212
    const/16 v20, 0x0

    .line 213
    .line 214
    const/16 v21, 0x0

    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    const/16 v23, 0x0

    .line 219
    .line 220
    const/16 v24, 0x0

    .line 221
    .line 222
    invoke-static/range {v6 .. v26}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_2

    .line 231
    .line 232
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, La/glb0;

    .line 237
    .line 238
    iget-boolean v0, v0, La/glb0;->a:Z

    .line 239
    .line 240
    if-eqz v0, :cond_3

    .line 241
    .line 242
    sget-object v0, La/qnf0;->a:La/qnf0;

    .line 243
    .line 244
    goto :goto_0

    .line 245
    :cond_3
    if-nez v1, :cond_4

    .line 246
    .line 247
    sget-object v0, La/qnf0;->b:La/qnf0;

    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_4
    if-eqz v8, :cond_7

    .line 251
    .line 252
    sget-object v0, La/qnf0;->c:La/qnf0;

    .line 253
    .line 254
    :goto_0
    iget-object v1, v2, La/ocj;->a:La/p7m0;

    .line 255
    .line 256
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-object v6, v2

    .line 264
    check-cast v6, La/glb0;

    .line 265
    .line 266
    const/16 v25, 0x0

    .line 267
    .line 268
    const v26, 0x1fffffe

    .line 269
    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const/4 v8, 0x0

    .line 273
    const/4 v9, 0x0

    .line 274
    const/4 v10, 0x0

    .line 275
    const/4 v11, 0x0

    .line 276
    const/4 v12, 0x0

    .line 277
    const/4 v13, 0x0

    .line 278
    const/4 v14, 0x0

    .line 279
    const/4 v15, 0x0

    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v19, 0x0

    .line 287
    .line 288
    const/16 v20, 0x0

    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    const/16 v23, 0x0

    .line 295
    .line 296
    const/16 v24, 0x0

    .line 297
    .line 298
    invoke-static/range {v6 .. v26}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_5

    .line 307
    .line 308
    sget-object v1, La/qnf0;->c:La/qnf0;

    .line 309
    .line 310
    if-ne v0, v1, :cond_6

    .line 311
    .line 312
    iget-object v1, v5, La/zco0;->k0:La/bby;

    .line 313
    .line 314
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 315
    .line 316
    .line 317
    :cond_6
    invoke-virtual {v5, v0}, La/zco0;->R(La/qnf0;)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    :goto_1
    return-object v0

    .line 326
    :pswitch_2
    check-cast v0, La/x5r0;

    .line 327
    .line 328
    sget-object v1, La/wne;->a:La/wne;

    .line 329
    .line 330
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    iget-boolean v1, v0, La/x5r0;->a:Z

    .line 334
    .line 335
    if-eqz v1, :cond_a

    .line 336
    .line 337
    iget-object v0, v0, La/x5r0;->b:La/nas;

    .line 338
    .line 339
    sget v1, La/zco0;->r0:I

    .line 340
    .line 341
    if-nez v0, :cond_8

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_8
    new-instance v6, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 345
    .line 346
    sget-object v14, La/iun;->a:La/iun;

    .line 347
    .line 348
    iget-wide v7, v0, La/nas;->a:J

    .line 349
    .line 350
    iget-wide v9, v0, La/nas;->x:J

    .line 351
    .line 352
    iget-object v0, v0, La/nas;->w:Ljava/lang/Long;

    .line 353
    .line 354
    if-eqz v0, :cond_9

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 357
    .line 358
    .line 359
    move-result-wide v0

    .line 360
    :goto_2
    move-wide v11, v0

    .line 361
    goto :goto_3

    .line 362
    :cond_9
    const-wide/16 v0, 0x0

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :goto_3
    sget-object v0, La/v5r0;->b:La/s9m0;

    .line 366
    .line 367
    const-string v13, "popular_sport"

    .line 368
    .line 369
    const/4 v15, 0x1

    .line 370
    invoke-direct/range {v6 .. v15}, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;-><init>(JJJLjava/lang/String;Ljava/util/List;Z)V

    .line 371
    .line 372
    .line 373
    new-instance v0, La/elb0;

    .line 374
    .line 375
    invoke-direct {v0, v6}, La/elb0;-><init>(Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_a
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_3
    move-object/from16 v24, v0

    .line 385
    .line 386
    check-cast v24, La/skb0;

    .line 387
    .line 388
    sget-object v0, La/wne;->a:La/wne;

    .line 389
    .line 390
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sget v0, La/zco0;->r0:I

    .line 394
    .line 395
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 396
    .line 397
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 398
    .line 399
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-object v6, v0

    .line 407
    check-cast v6, La/glb0;

    .line 408
    .line 409
    const/16 v25, 0x0

    .line 410
    .line 411
    const v26, 0x17fffff

    .line 412
    .line 413
    .line 414
    const/4 v7, 0x0

    .line 415
    const/4 v8, 0x0

    .line 416
    const/4 v9, 0x0

    .line 417
    const/4 v10, 0x0

    .line 418
    const/4 v11, 0x0

    .line 419
    const/4 v12, 0x0

    .line 420
    const/4 v13, 0x0

    .line 421
    const/4 v14, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/16 v18, 0x0

    .line 428
    .line 429
    const/16 v19, 0x0

    .line 430
    .line 431
    const/16 v20, 0x0

    .line 432
    .line 433
    const/16 v21, 0x0

    .line 434
    .line 435
    const/16 v22, 0x0

    .line 436
    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    invoke-static/range {v6 .. v26}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_b

    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_4
    move-object v1, v0

    .line 453
    check-cast v1, Ljava/util/List;

    .line 454
    .line 455
    sget-object v0, La/wne;->a:La/wne;

    .line 456
    .line 457
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    sget v0, La/zco0;->r0:I

    .line 461
    .line 462
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 463
    .line 464
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 465
    .line 466
    :cond_c
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-object v7, v0

    .line 474
    check-cast v7, La/glb0;

    .line 475
    .line 476
    new-instance v2, La/jn00;

    .line 477
    .line 478
    invoke-direct {v2, v1}, La/jn00;-><init>(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    const/16 v26, 0x0

    .line 482
    .line 483
    const v27, 0x1dfffff

    .line 484
    .line 485
    .line 486
    const/4 v8, 0x0

    .line 487
    const/4 v9, 0x0

    .line 488
    const/4 v10, 0x0

    .line 489
    const/4 v11, 0x0

    .line 490
    const/4 v12, 0x0

    .line 491
    const/4 v13, 0x0

    .line 492
    const/4 v14, 0x0

    .line 493
    const/4 v15, 0x0

    .line 494
    const/16 v16, 0x0

    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const/16 v19, 0x0

    .line 501
    .line 502
    const/16 v20, 0x0

    .line 503
    .line 504
    const/16 v21, 0x0

    .line 505
    .line 506
    const/16 v22, 0x0

    .line 507
    .line 508
    const/16 v24, 0x0

    .line 509
    .line 510
    const/16 v25, 0x0

    .line 511
    .line 512
    move-object/from16 v23, v2

    .line 513
    .line 514
    invoke-static/range {v7 .. v27}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v6, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_c

    .line 523
    .line 524
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_5
    move-object v1, v0

    .line 528
    check-cast v1, Ljava/util/List;

    .line 529
    .line 530
    sget-object v0, La/wne;->a:La/wne;

    .line 531
    .line 532
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    sget v0, La/zco0;->r0:I

    .line 536
    .line 537
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 538
    .line 539
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 540
    .line 541
    :cond_d
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    move-object v7, v0

    .line 549
    check-cast v7, La/glb0;

    .line 550
    .line 551
    new-instance v8, La/jn00;

    .line 552
    .line 553
    invoke-direct {v8, v1}, La/jn00;-><init>(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    const/16 v26, 0x0

    .line 557
    .line 558
    const v27, 0x1f7ffff

    .line 559
    .line 560
    .line 561
    move-object/from16 v21, v8

    .line 562
    .line 563
    const/4 v8, 0x0

    .line 564
    const/4 v9, 0x0

    .line 565
    const/4 v10, 0x0

    .line 566
    const/4 v11, 0x0

    .line 567
    const/4 v12, 0x0

    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    const/16 v18, 0x0

    .line 576
    .line 577
    const/16 v19, 0x0

    .line 578
    .line 579
    const/16 v20, 0x0

    .line 580
    .line 581
    const/16 v22, 0x0

    .line 582
    .line 583
    const/16 v23, 0x0

    .line 584
    .line 585
    const/16 v24, 0x0

    .line 586
    .line 587
    const/16 v25, 0x0

    .line 588
    .line 589
    invoke-static/range {v7 .. v27}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    invoke-virtual {v6, v0, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_d

    .line 598
    .line 599
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, La/glb0;

    .line 604
    .line 605
    iget-object v0, v0, La/glb0;->u:La/rn00;

    .line 606
    .line 607
    instance-of v6, v0, La/jn00;

    .line 608
    .line 609
    if-eqz v6, :cond_e

    .line 610
    .line 611
    check-cast v0, La/jn00;

    .line 612
    .line 613
    goto :goto_5

    .line 614
    :cond_e
    move-object v0, v4

    .line 615
    :goto_5
    if-eqz v0, :cond_f

    .line 616
    .line 617
    iget-object v0, v0, La/jn00;->a:Ljava/lang/Object;

    .line 618
    .line 619
    move-object v4, v0

    .line 620
    check-cast v4, Ljava/util/List;

    .line 621
    .line 622
    :cond_f
    if-nez v4, :cond_10

    .line 623
    .line 624
    sget-object v4, La/iun;->a:La/iun;

    .line 625
    .line 626
    :cond_10
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    iget-object v1, v5, La/zco0;->L:La/jc0;

    .line 631
    .line 632
    new-instance v4, La/rfj;

    .line 633
    .line 634
    invoke-direct {v4, v0}, La/rfj;-><init>(Ljava/util/ArrayList;)V

    .line 635
    .line 636
    .line 637
    new-array v0, v3, [La/yfj;

    .line 638
    .line 639
    aput-object v4, v0, v2

    .line 640
    .line 641
    invoke-static {v5, v1, v0}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 642
    .line 643
    .line 644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_6
    check-cast v0, Ljava/util/List;

    .line 648
    .line 649
    sget-object v1, La/wne;->a:La/wne;

    .line 650
    .line 651
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    sget v1, La/zco0;->r0:I

    .line 655
    .line 656
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 657
    .line 658
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 659
    .line 660
    :cond_11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    move-object v7, v6

    .line 668
    check-cast v7, La/glb0;

    .line 669
    .line 670
    new-instance v8, La/jn00;

    .line 671
    .line 672
    invoke-direct {v8, v0}, La/jn00;-><init>(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    const/16 v26, 0x0

    .line 676
    .line 677
    const v27, 0x1efffff

    .line 678
    .line 679
    .line 680
    move-object/from16 v22, v8

    .line 681
    .line 682
    const/4 v8, 0x0

    .line 683
    const/4 v9, 0x0

    .line 684
    const/4 v10, 0x0

    .line 685
    const/4 v11, 0x0

    .line 686
    const/4 v12, 0x0

    .line 687
    const/4 v13, 0x0

    .line 688
    const/4 v14, 0x0

    .line 689
    const/4 v15, 0x0

    .line 690
    const/16 v16, 0x0

    .line 691
    .line 692
    const/16 v17, 0x0

    .line 693
    .line 694
    const/16 v18, 0x0

    .line 695
    .line 696
    const/16 v19, 0x0

    .line 697
    .line 698
    const/16 v20, 0x0

    .line 699
    .line 700
    const/16 v21, 0x0

    .line 701
    .line 702
    const/16 v23, 0x0

    .line 703
    .line 704
    const/16 v24, 0x0

    .line 705
    .line 706
    const/16 v25, 0x0

    .line 707
    .line 708
    invoke-static/range {v7 .. v27}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    invoke-virtual {v1, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    if-eqz v6, :cond_11

    .line 717
    .line 718
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    check-cast v1, La/glb0;

    .line 723
    .line 724
    iget-object v1, v1, La/glb0;->t:La/rn00;

    .line 725
    .line 726
    instance-of v6, v1, La/jn00;

    .line 727
    .line 728
    if-eqz v6, :cond_12

    .line 729
    .line 730
    check-cast v1, La/jn00;

    .line 731
    .line 732
    goto :goto_6

    .line 733
    :cond_12
    move-object v1, v4

    .line 734
    :goto_6
    if-eqz v1, :cond_13

    .line 735
    .line 736
    iget-object v1, v1, La/jn00;->a:Ljava/lang/Object;

    .line 737
    .line 738
    move-object v4, v1

    .line 739
    check-cast v4, Ljava/util/List;

    .line 740
    .line 741
    :cond_13
    if-nez v4, :cond_14

    .line 742
    .line 743
    sget-object v4, La/iun;->a:La/iun;

    .line 744
    .line 745
    :cond_14
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    iget-object v1, v5, La/zco0;->L:La/jc0;

    .line 750
    .line 751
    new-instance v4, La/rfj;

    .line 752
    .line 753
    invoke-direct {v4, v0}, La/rfj;-><init>(Ljava/util/ArrayList;)V

    .line 754
    .line 755
    .line 756
    new-array v0, v3, [La/yfj;

    .line 757
    .line 758
    aput-object v4, v0, v2

    .line 759
    .line 760
    invoke-static {v5, v1, v0}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 761
    .line 762
    .line 763
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 764
    .line 765
    return-object v0

    .line 766
    nop

    .line 767
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
