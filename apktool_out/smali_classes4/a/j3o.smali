.class public final synthetic La/j3o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k3o;


# direct methods
.method public synthetic constructor <init>(La/k3o;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j3o;->a:B

    iput-object p1, p0, La/j3o;->b:La/k3o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/j3o;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/j3o;->b:La/k3o;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/x3o;

    .line 9
    .line 10
    sget-object v0, La/k3o;->R1:La/nek;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/u3o;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of v0, p1, La/w3o;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p1, La/w3o;

    .line 28
    .line 29
    sget-object v0, La/fhq0;->q2:La/m6m0;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, p1, La/w3o;->a:La/ygq0;

    .line 39
    .line 40
    iget-wide v3, p1, La/w3o;->b:J

    .line 41
    .line 42
    iget-wide v5, p1, La/w3o;->c:J

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object p1, La/fhq0;->s2:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    new-instance v0, La/fhq0;

    .line 56
    .line 57
    invoke-direct {v0}, La/fhq0;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-byte v2, v2, La/ygq0;->a:B

    .line 61
    .line 62
    sget-object v7, La/fhq0;->r2:[La/iiy;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    aget-object v9, v7, v8

    .line 66
    .line 67
    iget-object v10, v0, La/fhq0;->f2:La/zz2;

    .line 68
    .line 69
    invoke-virtual {v10, v0, v9, v2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, La/fhq0;->g2:La/r34;

    .line 73
    .line 74
    const/4 v9, 0x1

    .line 75
    aget-object v10, v7, v9

    .line 76
    .line 77
    invoke-virtual {v2, v0, v10, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x2

    .line 81
    aget-object v2, v7, v2

    .line 82
    .line 83
    iget-object v3, v0, La/fhq0;->h2:La/r34;

    .line 84
    .line 85
    invoke-virtual {v3, v0, v2, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x3

    .line 89
    aget-object v2, v7, v2

    .line 90
    .line 91
    iget-object v3, v0, La/fhq0;->i2:La/cgx0;

    .line 92
    .line 93
    invoke-virtual {v3, v0, v2, v8}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x4

    .line 97
    aget-object v2, v7, v2

    .line 98
    .line 99
    iget-object v3, v0, La/fhq0;->j2:La/cgx0;

    .line 100
    .line 101
    invoke-virtual {v3, v0, v2, v9}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 102
    .line 103
    .line 104
    const/4 v2, 0x5

    .line 105
    aget-object v2, v7, v2

    .line 106
    .line 107
    iget-object v3, v0, La/fhq0;->k2:La/cgx0;

    .line 108
    .line 109
    invoke-virtual {v3, v0, v2, v9}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 110
    .line 111
    .line 112
    const/4 v2, 0x6

    .line 113
    aget-object v2, v7, v2

    .line 114
    .line 115
    iget-object v3, v0, La/fhq0;->l2:La/cgx0;

    .line 116
    .line 117
    invoke-virtual {v3, v0, v2, v8}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    instance-of v0, p1, La/v3o;

    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget-object v0, p0, La/k3o;->L1:La/ujd;

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    check-cast p1, La/v3o;

    .line 134
    .line 135
    iget-object p1, p1, La/v3o;->a:La/sjd;

    .line 136
    .line 137
    invoke-virtual {v0, p0, p1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    :goto_0
    invoke-virtual {p0}, La/k3o;->G0()La/k3t0;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object p1, La/o2o;->a:La/o2o;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    const-string p0, "gameCardFragmentDelegate"

    .line 153
    .line 154
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    :goto_1
    return-object v1

    .line 162
    :pswitch_0
    check-cast p1, La/h3o;

    .line 163
    .line 164
    sget-object v0, La/k3o;->R1:La/nek;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, La/k3o;->G0()La/k3t0;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_1
    check-cast p1, La/hhq0;

    .line 180
    .line 181
    sget-object v0, La/k3o;->R1:La/nek;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/k3o;->G0()La/k3t0;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v0, La/e3o;

    .line 191
    .line 192
    invoke-direct {v0, p1}, La/e3o;-><init>(La/hhq0;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_2
    check-cast p1, La/uid;

    .line 202
    .line 203
    sget-object v0, La/k3o;->R1:La/nek;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, La/k3o;->G0()La/k3t0;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    new-instance v0, La/t2o;

    .line 213
    .line 214
    invoke-direct {v0, p1}, La/t2o;-><init>(La/uid;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
