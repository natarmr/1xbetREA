.class public final La/h54;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:Z

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h54;->j:B

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p0, p0, La/h54;->j:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/h54;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-direct {p0, v0, p2, v1}, La/h54;-><init>(ILa/yje;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/h54;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/h54;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {p0, v0, p2, v1}, La/h54;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/h54;->l:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    new-instance p0, La/h54;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {p0, v0, p2, v1}, La/h54;-><init>(ILa/yje;B)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/h54;->l:Ljava/lang/Object;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    new-instance p0, La/h54;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {p0, v0, p2, v1}, La/h54;-><init>(ILa/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/h54;->l:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_3
    new-instance p0, La/h54;

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0, v0, p2, v1}, La/h54;-><init>(ILa/yje;B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, La/h54;->l:Ljava/lang/Object;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h54;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h54;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, La/wne;->a:La/wne;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/h54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/h54;

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/h54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, La/wne;->a:La/wne;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/h54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/h54;

    .line 43
    .line 44
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/h54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object p0, La/wne;->a:La/wne;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/h54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/h54;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/h54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object p0, La/wne;->a:La/wne;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/h54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/h54;

    .line 71
    .line 72
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/h54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object p0, La/wne;->a:La/wne;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/h54;->j:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/inn0;

    .line 13
    .line 14
    sget-object v4, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v5, p0, La/h54;->k:Z

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    if-ne v5, v3, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object p1, La/xoa0;->a:La/xoa0;

    .line 34
    .line 35
    iput-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 36
    .line 37
    iput-boolean v3, p0, La/h54;->k:Z

    .line 38
    .line 39
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v4, :cond_3

    .line 44
    .line 45
    move-object v1, v4

    .line 46
    :goto_0
    return-object v1

    .line 47
    :cond_3
    :goto_1
    check-cast p1, La/woa0;

    .line 48
    .line 49
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/dpa0;

    .line 66
    .line 67
    invoke-virtual {v1}, La/dpa0;->a()V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :pswitch_0
    iget-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/inn0;

    .line 74
    .line 75
    sget-object v4, La/wne;->a:La/wne;

    .line 76
    .line 77
    iget-boolean v5, p0, La/h54;->k:Z

    .line 78
    .line 79
    if-eqz v5, :cond_5

    .line 80
    .line 81
    if-ne v5, v3, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_5
    :goto_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    iput-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 92
    .line 93
    iput-boolean v3, p0, La/h54;->k:Z

    .line 94
    .line 95
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 96
    .line 97
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v4, :cond_6

    .line 102
    .line 103
    move-object v1, v4

    .line 104
    :goto_4
    return-object v1

    .line 105
    :pswitch_1
    iget-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/inn0;

    .line 108
    .line 109
    sget-object v4, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-boolean v5, p0, La/h54;->k:Z

    .line 112
    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    if-ne v5, v3, :cond_7

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    :goto_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    iput-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-boolean v3, p0, La/h54;->k:Z

    .line 128
    .line 129
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 130
    .line 131
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v4, :cond_9

    .line 136
    .line 137
    move-object v1, v4

    .line 138
    :goto_6
    return-object v1

    .line 139
    :pswitch_2
    iget-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, La/inn0;

    .line 142
    .line 143
    sget-object v4, La/wne;->a:La/wne;

    .line 144
    .line 145
    iget-boolean v5, p0, La/h54;->k:Z

    .line 146
    .line 147
    if-eqz v5, :cond_b

    .line 148
    .line 149
    if-ne v5, v3, :cond_a

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_b
    :goto_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_c
    iput-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 160
    .line 161
    iput-boolean v3, p0, La/h54;->k:Z

    .line 162
    .line 163
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 164
    .line 165
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v4, :cond_c

    .line 170
    .line 171
    move-object v1, v4

    .line 172
    :goto_8
    return-object v1

    .line 173
    :pswitch_3
    iget-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, La/inn0;

    .line 176
    .line 177
    sget-object v4, La/wne;->a:La/wne;

    .line 178
    .line 179
    iget-boolean v5, p0, La/h54;->k:Z

    .line 180
    .line 181
    if-eqz v5, :cond_e

    .line 182
    .line 183
    if-ne v5, v3, :cond_d

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_e
    :goto_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_f
    iput-object v0, p0, La/h54;->l:Ljava/lang/Object;

    .line 194
    .line 195
    iput-boolean v3, p0, La/h54;->k:Z

    .line 196
    .line 197
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 198
    .line 199
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v4, :cond_f

    .line 204
    .line 205
    move-object v1, v4

    .line 206
    :goto_a
    return-object v1

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
