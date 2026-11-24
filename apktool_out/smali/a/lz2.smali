.class public final La/lz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/blz;)V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    iput-byte v0, p0, La/lz2;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/lz2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, La/hmc;->c:La/hmc;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, La/hmc;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/fmc;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, La/hmc;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)La/fmc;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, La/lz2;->c:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(La/dg60;La/jg60;La/glz;)V
    .locals 0

    const/4 p2, 0x5

    iput-byte p2, p0, La/lz2;->a:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/lz2;->b:Ljava/lang/Object;

    iput-object p3, p0, La/lz2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/f5r;La/m6r;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/lz2;->a:B

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lz2;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lz2;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 34
    iput-byte p3, p0, La/lz2;->a:B

    iput-object p1, p0, La/lz2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/lz2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/lz2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/lz2;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/lz2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, La/fmc;

    .line 12
    .line 13
    check-cast v2, La/blz;

    .line 14
    .line 15
    iget-object p0, v3, La/fmc;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v0, p1, p2, v2}, La/fmc;->a(Ljava/util/List;La/clz;La/kkz;La/blz;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, La/kkz;->ON_ANY:La/kkz;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/List;

    .line 33
    .line 34
    invoke-static {p0, p1, p2, v2}, La/fmc;->a(Ljava/util/List;La/clz;La/kkz;La/blz;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    check-cast v2, La/dg60;

    .line 39
    .line 40
    sget-object p1, La/ig60;->a:[I

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    aget p1, p1, p2

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    if-eq p1, p2, :cond_2

    .line 50
    .line 51
    const/4 p2, 0x2

    .line 52
    if-eq p1, p2, :cond_1

    .line 53
    .line 54
    const/4 p2, 0x3

    .line 55
    if-eq p1, p2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v2}, La/af50;->h()V

    .line 59
    .line 60
    .line 61
    check-cast v3, La/glz;

    .line 62
    .line 63
    invoke-virtual {v3, p0}, La/glz;->f(La/blz;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v2, v1}, La/dg60;->j(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v2, p2}, La/dg60;->j(Z)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_1
    sget-object p1, La/kkz;->ON_START:La/kkz;

    .line 76
    .line 77
    if-ne p2, p1, :cond_3

    .line 78
    .line 79
    check-cast v2, La/glz;

    .line 80
    .line 81
    invoke-virtual {v2, p0}, La/glz;->f(La/blz;)V

    .line 82
    .line 83
    .line 84
    check-cast v3, La/kd30;

    .line 85
    .line 86
    invoke-virtual {v3}, La/kd30;->V()V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void

    .line 90
    :pswitch_2
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 91
    .line 92
    if-ne p2, v0, :cond_4

    .line 93
    .line 94
    check-cast v2, Landroid/os/Handler;

    .line 95
    .line 96
    check-cast v3, La/mx2;

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, p0}, La/glz;->f(La/blz;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    return-void

    .line 109
    :pswitch_3
    check-cast v2, La/m6r;

    .line 110
    .line 111
    check-cast v3, La/f5r;

    .line 112
    .line 113
    iget-object p2, v3, La/f5r;->e:Landroidx/fragment/app/e;

    .line 114
    .line 115
    invoke-virtual {p2}, Landroidx/fragment/app/e;->a0()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1, p0}, La/glz;->f(La/blz;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, v2, La/xhe0;->a:Landroid/view/View;

    .line 130
    .line 131
    check-cast p0, Landroid/widget/FrameLayout;

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_6

    .line 138
    .line 139
    invoke-virtual {v3, v2}, La/f5r;->E(La/m6r;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_1
    return-void

    .line 143
    :pswitch_4
    check-cast v2, La/qvj;

    .line 144
    .line 145
    sget-object p0, La/rvj;->a:[I

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    aget p0, p0, v0

    .line 152
    .line 153
    packed-switch p0, :pswitch_data_1

    .line 154
    .line 155
    .line 156
    invoke-static {}, La/t9f;->b()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_5
    const-string p0, "ON_ANY must not been send by anybody"

    .line 161
    .line 162
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :pswitch_6
    invoke-interface {v2, p1}, La/qvj;->onDestroy(La/clz;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :pswitch_7
    invoke-interface {v2, p1}, La/qvj;->onStop(La/clz;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_8
    invoke-interface {v2, p1}, La/qvj;->onPause(La/clz;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :pswitch_9
    invoke-interface {v2, p1}, La/qvj;->onResume(La/clz;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :pswitch_a
    invoke-interface {v2, p1}, La/qvj;->onStart(La/clz;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_b
    invoke-interface {v2, p1}, La/qvj;->onCreate(La/clz;)V

    .line 187
    .line 188
    .line 189
    :goto_2
    check-cast v3, La/zkz;

    .line 190
    .line 191
    if-eqz v3, :cond_7

    .line 192
    .line 193
    invoke-interface {v3, p1, p2}, La/zkz;->l(La/clz;La/kkz;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    :goto_3
    return-void

    .line 197
    :pswitch_c
    invoke-virtual {p2}, La/kkz;->a()La/lkz;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    sget-object p2, La/lkz;->d:La/lkz;

    .line 202
    .line 203
    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-ltz p1, :cond_8

    .line 208
    .line 209
    check-cast v2, La/hie0;

    .line 210
    .line 211
    iput-boolean v1, v2, La/hie0;->a:Z

    .line 212
    .line 213
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 214
    .line 215
    iget-object p1, v3, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 216
    .line 217
    invoke-virtual {p1, p0}, La/glz;->f(La/blz;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
