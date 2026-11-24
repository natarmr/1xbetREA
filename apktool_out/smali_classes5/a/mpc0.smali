.class public final synthetic La/mpc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ppc0;


# direct methods
.method public synthetic constructor <init>(La/ppc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mpc0;->a:B

    iput-object p1, p0, La/mpc0;->b:La/ppc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mpc0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/mpc0;->b:La/ppc0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/ppc0;->R1:La/nh70;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/ppc0;->M1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/cqi;

    .line 21
    .line 22
    iget-object v0, v0, La/cqi;->w:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/bqi;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/ppc0;->R1:La/nh70;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v2, v1, La/af3;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, La/af3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v3

    .line 56
    :goto_0
    const-class v2, La/lpc0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/o5d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ze3;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v1, v3

    .line 80
    :goto_1
    instance-of v4, v1, La/lpc0;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/lpc0;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    iget-object v2, v0, La/ppc0;->P1:La/r34;

    .line 90
    .line 91
    sget-object v3, La/ppc0;->S1:[La/iiy;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    aget-object v3, v3, v4

    .line 95
    .line 96
    invoke-virtual {v2, v0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    iget-object v9, v1, La/lpc0;->l:La/ntu;

    .line 105
    .line 106
    iget-object v10, v1, La/lpc0;->k:La/gii0;

    .line 107
    .line 108
    iget-object v11, v1, La/lpc0;->j:La/knf0;

    .line 109
    .line 110
    iget-object v12, v1, La/lpc0;->i:La/btt0;

    .line 111
    .line 112
    iget-object v13, v1, La/lpc0;->h:La/gst0;

    .line 113
    .line 114
    iget-object v14, v1, La/lpc0;->g:La/xyt;

    .line 115
    .line 116
    new-instance v5, La/mtc;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-wide v2, v5, La/mtc;->a:J

    .line 122
    .line 123
    iget-object v15, v1, La/lpc0;->a:La/m1e;

    .line 124
    .line 125
    iget-object v0, v1, La/lpc0;->b:La/b4j;

    .line 126
    .line 127
    iget-object v2, v1, La/lpc0;->c:La/oeg0;

    .line 128
    .line 129
    iget-object v3, v1, La/lpc0;->d:La/duj;

    .line 130
    .line 131
    iget-object v7, v1, La/lpc0;->f:La/cad;

    .line 132
    .line 133
    iget-object v4, v1, La/lpc0;->e:La/ctf0;

    .line 134
    .line 135
    iget-object v6, v1, La/lpc0;->m:La/wdk0;

    .line 136
    .line 137
    iget-object v8, v1, La/lpc0;->n:La/pru;

    .line 138
    .line 139
    move-object/from16 v16, v0

    .line 140
    .line 141
    iget-object v0, v1, La/lpc0;->o:La/rou;

    .line 142
    .line 143
    move-object/from16 v21, v8

    .line 144
    .line 145
    iget-object v8, v1, La/lpc0;->p:La/d1p;

    .line 146
    .line 147
    move-object/from16 v22, v0

    .line 148
    .line 149
    iget-object v0, v1, La/lpc0;->q:La/cdu;

    .line 150
    .line 151
    iget-object v1, v1, La/lpc0;->r:La/fhj;

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-object/from16 v19, v4

    .line 181
    .line 182
    new-instance v4, La/cqi;

    .line 183
    .line 184
    move-object/from16 v20, v6

    .line 185
    .line 186
    new-instance v6, La/std;

    .line 187
    .line 188
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    move-object/from16 v23, v0

    .line 192
    .line 193
    move-object/from16 v24, v1

    .line 194
    .line 195
    move-object/from16 v17, v2

    .line 196
    .line 197
    move-object/from16 v18, v3

    .line 198
    .line 199
    invoke-direct/range {v4 .. v24}, La/cqi;-><init>(La/mtc;La/std;La/cad;La/d1p;La/ntu;La/gii0;La/knf0;La/btt0;La/gst0;La/xyt;La/m1e;La/b4j;La/oeg0;La/duj;La/ctf0;La/wdk0;La/pru;La/rou;La/cdu;La/fhj;)V

    .line 200
    .line 201
    .line 202
    move-object v3, v4

    .line 203
    goto :goto_2

    .line 204
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 205
    .line 206
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :goto_2
    return-object v3

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
