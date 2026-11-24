.class public final La/pr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, La/pr3;->a:B

    iput-object p1, p0, La/pr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/vne;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    iput-byte p2, p0, La/pr3;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p2, p0, La/pr3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/jjv0;

    .line 9
    .line 10
    sget p2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v0, p1, La/jjv0;->a:Ljava/util/List;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/tmv;

    .line 43
    .line 44
    instance-of v2, v2, La/tmv;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    :cond_2
    :goto_0
    invoke-static {p2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget-object v0, p2, La/zu3;->g:La/mne;

    .line 54
    .line 55
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 56
    .line 57
    sget-object v3, La/lu3;->a:La/lu3;

    .line 58
    .line 59
    new-instance v6, La/mu3;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-direct {v6, p2, v1, v0}, La/mu3;-><init>(La/zu3;ZLa/yje;)V

    .line 63
    .line 64
    .line 65
    const/16 v7, 0xa

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    iget-object p1, p1, La/jjv0;->a:Ljava/util/List;

    .line 72
    .line 73
    new-instance p2, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    instance-of v1, v0, La/tmv;

    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, La/tmv;

    .line 105
    .line 106
    if-eqz p1, :cond_7

    .line 107
    .line 108
    iget-object p1, p1, La/tmv;->c:La/m60;

    .line 109
    .line 110
    sget-object p2, La/m60;->f:La/m60;

    .line 111
    .line 112
    if-eq p1, p2, :cond_6

    .line 113
    .line 114
    sget-object p2, La/m60;->g:La/m60;

    .line 115
    .line 116
    if-eq p1, p2, :cond_5

    .line 117
    .line 118
    new-instance p1, La/yqq;

    .line 119
    .line 120
    invoke-static {p0}, La/i120;->a0(Landroid/content/Context;)F

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-direct {p1, p2}, La/yqq;-><init>(F)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    new-instance p1, La/zqq;

    .line 129
    .line 130
    invoke-static {p0}, La/i120;->a0(Landroid/content/Context;)F

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-direct {p1, p2}, La/zqq;-><init>(F)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    new-instance p1, La/xqq;

    .line 139
    .line 140
    invoke-static {p0}, La/i120;->a0(Landroid/content/Context;)F

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-direct {p1, p2}, La/xqq;-><init>(F)V

    .line 145
    .line 146
    .line 147
    :goto_2
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0, p1}, La/zu3;->y(La/arq;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance p2, La/yqq;

    .line 160
    .line 161
    invoke-static {p0}, La/i120;->a0(Landroid/content/Context;)F

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-direct {p2, p0}, La/yqq;-><init>(F)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, La/zu3;->y(La/arq;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_0
    move-object v4, p1

    .line 175
    check-cast v4, La/t9o0;

    .line 176
    .line 177
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B()La/fwk;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, La/fwk;->a:La/shk;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object p2, p0, La/shk;->a:La/p7m0;

    .line 190
    .line 191
    :cond_8
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    move-object v0, p0

    .line 196
    check-cast v0, La/ahk;

    .line 197
    .line 198
    const/4 v5, 0x0

    .line 199
    const/16 v6, 0x37

    .line 200
    .line 201
    const/4 v1, 0x0

    .line 202
    const/4 v2, 0x0

    .line 203
    const/4 v3, 0x0

    .line 204
    invoke-static/range {v0 .. v6}, La/ahk;->a(La/ahk;Landroid/content/res/Configuration;La/z6k;La/erq;La/t9o0;La/sly;I)La/ahk;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p2, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-eqz p0, :cond_8

    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_1
    move-object v3, p1

    .line 218
    check-cast v3, La/erq;

    .line 219
    .line 220
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B()La/fwk;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    iget-object p0, p0, La/fwk;->a:La/shk;

    .line 225
    .line 226
    iget-object p0, p0, La/shk;->a:La/p7m0;

    .line 227
    .line 228
    :cond_9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    move-object v0, p1

    .line 233
    check-cast v0, La/ahk;

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    const/16 v6, 0x3b

    .line 237
    .line 238
    const/4 v1, 0x0

    .line 239
    const/4 v2, 0x0

    .line 240
    const/4 v4, 0x0

    .line 241
    invoke-static/range {v0 .. v6}, La/ahk;->a(La/ahk;Landroid/content/res/Configuration;La/z6k;La/erq;La/t9o0;La/sly;I)La/ahk;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_9

    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
