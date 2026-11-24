.class public final synthetic La/wm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xm;


# direct methods
.method public synthetic constructor <init>(La/xm;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wm;->a:B

    iput-object p1, p0, La/wm;->b:La/xm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/wm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/wm;->b:La/xm;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/xm;->Q1:La/jdk0;

    .line 10
    .line 11
    iget-object p0, p0, La/xm;->N1:La/a8z;

    .line 12
    .line 13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/k3t0;

    .line 18
    .line 19
    sget-object v0, La/im;->a:La/im;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/xm;->Q1:La/jdk0;

    .line 28
    .line 29
    iget-object p0, p0, La/xm;->N1:La/a8z;

    .line 30
    .line 31
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/k3t0;

    .line 36
    .line 37
    sget-object v0, La/jm;->a:La/jm;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    sget-object v0, La/xm;->Q1:La/jdk0;

    .line 46
    .line 47
    iget-object p0, p0, La/xm;->N1:La/a8z;

    .line 48
    .line 49
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/k3t0;

    .line 54
    .line 55
    sget-object v0, La/lm;->a:La/lm;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_2
    sget-object v0, La/xm;->Q1:La/jdk0;

    .line 64
    .line 65
    iget-object p0, p0, La/xm;->K1:La/fiu0;

    .line 66
    .line 67
    if-eqz p0, :cond_0

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_0
    const-string p0, "viewModelFactory"

    .line 71
    .line 72
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :pswitch_3
    sget-object v0, La/xm;->Q1:La/jdk0;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    instance-of v2, v0, La/af3;

    .line 90
    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    check-cast v0, La/af3;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move-object v0, v1

    .line 97
    :goto_0
    const-class v2, La/ym;

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/o5d0;

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/ze3;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move-object v0, v1

    .line 121
    :goto_1
    instance-of v3, v0, La/ym;

    .line 122
    .line 123
    if-nez v3, :cond_3

    .line 124
    .line 125
    move-object v0, v1

    .line 126
    :cond_3
    check-cast v0, La/ym;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    iget-object v1, p0, La/xm;->O1:La/khf0;

    .line 131
    .line 132
    sget-object v2, La/xm;->R1:[La/iiy;

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    aget-object v2, v2, v3

    .line 136
    .line 137
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    move-object v8, p0

    .line 142
    check-cast v8, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 143
    .line 144
    iget-object v4, v0, La/ym;->a:La/g2v;

    .line 145
    .line 146
    iget-object v2, v0, La/ym;->b:La/cad;

    .line 147
    .line 148
    iget-object v5, v0, La/ym;->c:La/m1e;

    .line 149
    .line 150
    iget-object v6, v0, La/ym;->d:La/gii0;

    .line 151
    .line 152
    iget-object p0, v0, La/ym;->e:La/oeg0;

    .line 153
    .line 154
    iget-object v3, v0, La/ym;->f:La/pyg;

    .line 155
    .line 156
    iget-object v7, v0, La/ym;->g:La/ctf0;

    .line 157
    .line 158
    iget-object v1, v0, La/ym;->h:La/knf0;

    .line 159
    .line 160
    iget-object v9, v0, La/ym;->i:La/iip;

    .line 161
    .line 162
    iget-object v10, v0, La/ym;->k:La/sjl0;

    .line 163
    .line 164
    iget-object v11, v0, La/ym;->j:La/xri;

    .line 165
    .line 166
    move-object v12, v9

    .line 167
    iget-object v9, v0, La/ym;->l:La/wdk0;

    .line 168
    .line 169
    move-object v13, v10

    .line 170
    iget-object v10, v0, La/ym;->m:La/kt2;

    .line 171
    .line 172
    iget-object v0, v0, La/ym;->n:La/zr1;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    new-instance v1, La/w5i;

    .line 208
    .line 209
    move-object v11, v0

    .line 210
    invoke-direct/range {v1 .. v11}, La/w5i;-><init>(La/cad;La/pyg;La/g2v;La/m1e;La/gii0;La/ctf0;Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;La/wdk0;La/kt2;La/zr1;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 215
    .line 216
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :goto_2
    return-object v1

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
