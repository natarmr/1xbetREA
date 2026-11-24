.class public final La/ypi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/omi;


# direct methods
.method public constructor <init>(La/omi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ypi;->a:La/omi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 24

    .line 1
    new-instance v0, La/hyc0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/ypi;->a:La/omi;

    .line 6
    .line 7
    iget-object v1, v1, La/omi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/aqi;

    .line 10
    .line 11
    invoke-virtual {v1}, La/aqi;->a()La/tac0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v1, La/aqi;->N:La/n5d0;

    .line 16
    .line 17
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, La/epu;

    .line 22
    .line 23
    iget-object v4, v1, La/aqi;->O:La/n5d0;

    .line 24
    .line 25
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, La/cpu;

    .line 30
    .line 31
    iget-object v5, v1, La/aqi;->V:La/n5d0;

    .line 32
    .line 33
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, La/uou;

    .line 38
    .line 39
    iget-object v6, v1, La/aqi;->B:La/fhj;

    .line 40
    .line 41
    iget-object v7, v1, La/aqi;->Q:La/n5d0;

    .line 42
    .line 43
    invoke-interface {v7}, La/o5d0;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, La/sou;

    .line 48
    .line 49
    new-instance v8, La/hnu;

    .line 50
    .line 51
    new-instance v9, La/w5z;

    .line 52
    .line 53
    iget-object v10, v1, La/aqi;->S:La/n5d0;

    .line 54
    .line 55
    invoke-interface {v10}, La/o5d0;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, La/agc0;

    .line 60
    .line 61
    iget-object v11, v1, La/aqi;->E:La/xyt;

    .line 62
    .line 63
    iget-object v12, v1, La/aqi;->J:La/btt0;

    .line 64
    .line 65
    iget-object v13, v1, La/aqi;->H:La/knf0;

    .line 66
    .line 67
    new-instance v14, La/jw20;

    .line 68
    .line 69
    iget-object v15, v1, La/aqi;->I:La/gii0;

    .line 70
    .line 71
    move-object/from16 v16, v0

    .line 72
    .line 73
    const/16 v0, 0xf

    .line 74
    .line 75
    invoke-direct {v14, v15, v0}, La/jw20;-><init>(La/gii0;B)V

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v9 .. v14}, La/w5z;-><init>(La/agc0;La/xyt;La/btt0;La/knf0;La/jw20;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v8, v9}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v1, La/aqi;->q:La/wsf0;

    .line 85
    .line 86
    iget-object v9, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, La/g45;

    .line 89
    .line 90
    invoke-virtual {v9}, La/g45;->E()La/nou;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    new-instance v10, La/j910;

    .line 95
    .line 96
    new-instance v11, La/f4u;

    .line 97
    .line 98
    invoke-virtual {v1}, La/aqi;->b()La/pzu;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    const/16 v13, 0x1a

    .line 103
    .line 104
    invoke-direct {v11, v12, v13}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    iget-object v12, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v12, La/g45;

    .line 110
    .line 111
    invoke-virtual {v12}, La/g45;->n0()La/trm0;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    const/16 v13, 0x16

    .line 116
    .line 117
    invoke-direct {v10, v11, v12, v13}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    iget-object v11, v1, La/aqi;->t:La/cad;

    .line 121
    .line 122
    iget-object v11, v11, La/cad;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v11, La/psc;

    .line 125
    .line 126
    invoke-virtual {v11}, La/psc;->h()La/mne;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v12, v1, La/aqi;->u:La/m1e;

    .line 134
    .line 135
    iget-object v13, v1, La/aqi;->g:La/duj;

    .line 136
    .line 137
    iget-object v14, v1, La/aqi;->v:La/ctf0;

    .line 138
    .line 139
    iget-object v15, v1, La/aqi;->C:La/ntu;

    .line 140
    .line 141
    move-object/from16 p0, v2

    .line 142
    .line 143
    iget-object v2, v1, La/aqi;->w:La/yfu;

    .line 144
    .line 145
    move-object/from16 v17, v2

    .line 146
    .line 147
    iget-object v2, v1, La/aqi;->D:La/iqt;

    .line 148
    .line 149
    move-object/from16 v18, v2

    .line 150
    .line 151
    iget-object v2, v1, La/aqi;->k:La/pru;

    .line 152
    .line 153
    move-object/from16 v19, v2

    .line 154
    .line 155
    iget-object v2, v1, La/aqi;->i:La/x20;

    .line 156
    .line 157
    move-object/from16 v20, v2

    .line 158
    .line 159
    iget-object v2, v1, La/aqi;->h:La/b4j;

    .line 160
    .line 161
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, La/g45;

    .line 164
    .line 165
    invoke-virtual {v0}, La/g45;->j()La/bbw0;

    .line 166
    .line 167
    .line 168
    move-result-object v21

    .line 169
    iget-object v0, v1, La/aqi;->p:La/wtt;

    .line 170
    .line 171
    iget-object v1, v1, La/aqi;->y:La/qho;

    .line 172
    .line 173
    move-object/from16 v22, v0

    .line 174
    .line 175
    move-object/from16 v23, v1

    .line 176
    .line 177
    move-object/from16 v0, v16

    .line 178
    .line 179
    move-object/from16 v16, v17

    .line 180
    .line 181
    move-object/from16 v17, v18

    .line 182
    .line 183
    move-object/from16 v18, v19

    .line 184
    .line 185
    move-object/from16 v19, v20

    .line 186
    .line 187
    move-object/from16 v1, p1

    .line 188
    .line 189
    move-object/from16 v20, v2

    .line 190
    .line 191
    move-object/from16 v2, p0

    .line 192
    .line 193
    invoke-direct/range {v0 .. v23}, La/hyc0;-><init>(La/vzg0;La/tac0;La/epu;La/cpu;La/uou;La/fhj;La/sou;La/hnu;La/nou;La/j910;La/mne;La/m1e;La/duj;La/ctf0;La/ntu;La/yfu;La/iqt;La/pru;La/x20;La/b4j;La/bbw0;La/wtt;La/qho;)V

    .line 194
    .line 195
    .line 196
    return-object v0
.end method
