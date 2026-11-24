.class public final synthetic La/th50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/th50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/th50;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/zw3;

    .line 9
    .line 10
    sget-object v0, La/aq60;->a:La/aq60;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/zw3;

    .line 17
    .line 18
    sget-object v0, La/yp60;->a:La/yp60;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, La/un60;

    .line 25
    .line 26
    sget-object v2, La/iun;->a:La/iun;

    .line 27
    .line 28
    invoke-direct {p0, v0, v1, v2}, La/un60;-><init>(La/zn60;ZLjava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/ew60;

    .line 33
    .line 34
    sget-object v0, La/zn60;->p:La/zn60;

    .line 35
    .line 36
    sget-object v1, La/y1p;->b:La/y1p;

    .line 37
    .line 38
    invoke-direct {p0, v0, v1}, La/ew60;-><init>(La/zn60;La/y1p;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_3
    new-instance p0, La/zw3;

    .line 43
    .line 44
    sget-object v0, La/whp0;->a:La/whp0;

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_4
    new-instance p0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_5
    new-instance p0, La/sk60;

    .line 57
    .line 58
    invoke-direct {p0, v0}, La/sk60;-><init>(La/xkb0;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_6
    new-instance p0, La/g0o;

    .line 63
    .line 64
    sget-object v0, La/vj60;->INSTANCE:La/vj60;

    .line 65
    .line 66
    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    .line 67
    .line 68
    const-string v2, "org.xplatform.feed.navigation.OnboardingRoute"

    .line 69
    .line 70
    invoke-direct {p0, v2, v0, v1}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_8
    new-instance p0, Lokhttp3/OkHttpClient;

    .line 78
    .line 79
    invoke-direct {p0}, Lokhttp3/OkHttpClient;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v0, La/zo9;

    .line 83
    .line 84
    invoke-direct {v0, p0}, La/zo9;-><init>(Lokhttp3/Call$Factory;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_9
    new-instance p0, La/g0o;

    .line 89
    .line 90
    sget-object v0, La/m860;->INSTANCE:La/m860;

    .line 91
    .line 92
    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    .line 93
    .line 94
    const-string v2, "androidx.savedstate.serialization.serializers.NullValue"

    .line 95
    .line 96
    invoke-direct {p0, v2, v0, v1}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_a
    new-instance p0, Landroid/media/AudioAttributes$Builder;

    .line 101
    .line 102
    invoke-direct {p0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x5

    .line 106
    invoke-virtual {p0, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_e
    sget p0, La/v360;->x0:I

    .line 125
    .line 126
    sget-object p0, La/bid;->a:La/bid;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_f
    sget p0, La/v360;->x0:I

    .line 130
    .line 131
    sget-object p0, La/vm60;->a:La/vm60;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_10
    sget-object p0, La/b160;->O1:La/evz;

    .line 135
    .line 136
    new-instance p0, La/bdz;

    .line 137
    .line 138
    invoke-direct {p0}, La/bdz;-><init>()V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_12
    new-instance p0, La/zw3;

    .line 146
    .line 147
    sget-object v0, La/mw50;->a:La/mw50;

    .line 148
    .line 149
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_13
    new-instance p0, La/zw3;

    .line 154
    .line 155
    sget-object v0, La/whp0;->a:La/whp0;

    .line 156
    .line 157
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_14
    new-instance p0, La/zw3;

    .line 162
    .line 163
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 164
    .line 165
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_15
    new-instance p0, La/zw3;

    .line 170
    .line 171
    sget-object v0, La/okx;->a:La/okx;

    .line 172
    .line 173
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_16
    sget-object p0, La/ujn;->h:Ljava/lang/String;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_17
    sget-object p0, La/m7t0;->a:La/m7t0;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_18
    sget-object p0, La/bj9;->a:La/itj;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_19
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 187
    .line 188
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0, v0}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_1a
    new-instance p0, La/qj50;

    .line 197
    .line 198
    sget-object v0, La/iun;->a:La/iun;

    .line 199
    .line 200
    invoke-direct {p0, v0}, La/qj50;-><init>(Ljava/util/List;)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_1b
    new-instance p0, La/inv;

    .line 205
    .line 206
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 207
    .line 208
    new-instance v2, La/zw3;

    .line 209
    .line 210
    sget-object v3, La/ki50;->a:La/ki50;

    .line 211
    .line 212
    invoke-direct {v2, v3, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    const/4 v2, 0x1

    .line 220
    invoke-direct {p0, v0, v1, v2}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 221
    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 225
    .line 226
    sget-object v0, La/jh50;->a:La/jh50;

    .line 227
    .line 228
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
