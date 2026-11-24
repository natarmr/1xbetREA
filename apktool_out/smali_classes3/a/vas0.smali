.class public final La/vas0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/yas0;


# direct methods
.method public synthetic constructor <init>(La/yas0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vas0;->i:B

    iput-object p1, p0, La/vas0;->k:La/yas0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vas0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vas0;->k:La/yas0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/vas0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/vas0;-><init>(La/yas0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/vas0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/vas0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/vas0;-><init>(La/yas0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/vas0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/vas0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/vas0;-><init>(La/yas0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/vas0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/vas0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/vas0;-><init>(La/yas0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/vas0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vas0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/vas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vas0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/gqt0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/vas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/vas0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/vas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/vas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/vas0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/vas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/gu1;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/vas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/vas0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/vas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/vas0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    iget-object v2, p0, La/vas0;->k:La/yas0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, La/vas0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/sw00;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, La/sw00;->a:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-boolean p0, p0, La/sw00;->b:Z

    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/sas0;

    .line 33
    .line 34
    iget-boolean p0, p0, La/sas0;->e:Z

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 39
    .line 40
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, La/sas0;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/16 v4, 0xf

    .line 54
    .line 55
    invoke-static {v0, v1, v3, v4}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    invoke-virtual {v2}, La/yas0;->N()V

    .line 66
    .line 67
    .line 68
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    move-object v7, p0

    .line 72
    check-cast v7, La/gqt0;

    .line 73
    .line 74
    sget-object p0, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget p0, La/yas0;->z:I

    .line 80
    .line 81
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 82
    .line 83
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 84
    .line 85
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-object p1, p0

    .line 93
    check-cast p1, La/sas0;

    .line 94
    .line 95
    iget-object v2, p1, La/sas0;->c:La/fas0;

    .line 96
    .line 97
    instance-of v4, v2, La/cas0;

    .line 98
    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    check-cast v2, La/cas0;

    .line 102
    .line 103
    iget-object v4, v2, La/cas0;->a:La/gu1;

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    const v11, 0x3dfff

    .line 107
    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    const-wide/16 v8, 0x0

    .line 112
    .line 113
    invoke-static/range {v4 .. v11}, La/gu1;->a(La/gu1;ZLa/k98;La/gqt0;JLjava/util/List;I)La/gu1;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const/4 v5, 0x2

    .line 118
    invoke-static {v2, v4, v3, v5}, La/cas0;->a(La/cas0;La/gu1;ZI)La/cas0;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {p1, v2, v3, v1}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :cond_3
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_2

    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_1
    check-cast p0, Ljava/lang/Throwable;

    .line 136
    .line 137
    sget-object v0, La/wne;->a:La/wne;

    .line 138
    .line 139
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, v2, La/yas0;->o:La/duj;

    .line 143
    .line 144
    new-instance v0, La/was0;

    .line 145
    .line 146
    invoke-direct {v0, p0, v3}, La/was0;-><init>(Ljava/lang/Throwable;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 153
    .line 154
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 155
    .line 156
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-object p1, p0

    .line 164
    check-cast p1, La/sas0;

    .line 165
    .line 166
    sget-object v2, La/das0;->a:La/das0;

    .line 167
    .line 168
    invoke-static {p1, v2, v3, v1}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-eqz p0, :cond_4

    .line 177
    .line 178
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_2
    check-cast p0, La/gu1;

    .line 182
    .line 183
    sget-object v0, La/wne;->a:La/wne;

    .line 184
    .line 185
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget p1, La/yas0;->z:I

    .line 189
    .line 190
    iget-object p1, v2, La/i3t0;->i:La/ocj;

    .line 191
    .line 192
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 193
    .line 194
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-object v2, v0

    .line 202
    check-cast v2, La/sas0;

    .line 203
    .line 204
    new-instance v4, La/cas0;

    .line 205
    .line 206
    invoke-direct {v4, p0, v3}, La/cas0;-><init>(La/gu1;Z)V

    .line 207
    .line 208
    .line 209
    invoke-static {v2, v4, v3, v1}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_5

    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
