.class public final La/uei;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uei;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 18

    .line 1
    new-instance v0, La/dch;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/uei;->a:La/uci;

    .line 6
    .line 7
    iget-object v1, v1, La/uci;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/vei;

    .line 10
    .line 11
    iget-object v2, v1, La/vei;->a:Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 12
    .line 13
    iget-object v3, v1, La/vei;->b:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v4, v1, La/vei;->c:La/xhi;

    .line 20
    .line 21
    invoke-virtual {v4}, La/xhi;->e()La/b8u;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    move-object v6, v5

    .line 26
    new-instance v5, La/j910;

    .line 27
    .line 28
    invoke-virtual {v4}, La/xhi;->e()La/b8u;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    new-instance v8, La/pv00;

    .line 33
    .line 34
    iget-object v9, v4, La/xhi;->T:La/n5d0;

    .line 35
    .line 36
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    check-cast v9, La/q530;

    .line 41
    .line 42
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v8, v9}, La/pv00;-><init>(La/q530;)V

    .line 46
    .line 47
    .line 48
    const/16 v9, 0x8

    .line 49
    .line 50
    invoke-direct {v5, v7, v8, v9}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    move-object v7, v6

    .line 54
    new-instance v6, La/dgu;

    .line 55
    .line 56
    new-instance v8, La/x4u;

    .line 57
    .line 58
    iget-object v9, v4, La/xhi;->c0:La/n5d0;

    .line 59
    .line 60
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, La/fx7;

    .line 65
    .line 66
    invoke-direct {v8, v9}, La/x4u;-><init>(La/fx7;)V

    .line 67
    .line 68
    .line 69
    iget-object v9, v4, La/xhi;->N:La/lsn;

    .line 70
    .line 71
    iget-object v9, v9, La/lsn;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, La/gbi;

    .line 74
    .line 75
    invoke-virtual {v9}, La/gbi;->k()La/v7i;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    new-instance v10, La/rpt;

    .line 80
    .line 81
    iget-object v11, v4, La/xhi;->j:La/xyt;

    .line 82
    .line 83
    invoke-direct {v10, v11}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v11, v4, La/xhi;->g:La/pru;

    .line 87
    .line 88
    invoke-direct {v6, v8, v9, v10, v11}, La/dgu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v12, La/f7u;

    .line 92
    .line 93
    new-instance v13, La/p4u;

    .line 94
    .line 95
    iget-object v8, v4, La/xhi;->c0:La/n5d0;

    .line 96
    .line 97
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, La/fx7;

    .line 102
    .line 103
    invoke-direct {v13, v8}, La/p4u;-><init>(La/fx7;)V

    .line 104
    .line 105
    .line 106
    iget-object v8, v4, La/xhi;->N:La/lsn;

    .line 107
    .line 108
    iget-object v8, v8, La/lsn;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, La/gbi;

    .line 111
    .line 112
    invoke-virtual {v8}, La/gbi;->k()La/v7i;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    new-instance v15, La/rpt;

    .line 117
    .line 118
    iget-object v8, v4, La/xhi;->j:La/xyt;

    .line 119
    .line 120
    invoke-direct {v15, v8}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v4, v4, La/xhi;->g:La/pru;

    .line 124
    .line 125
    const/16 v17, 0xd

    .line 126
    .line 127
    move-object/from16 v16, v4

    .line 128
    .line 129
    invoke-direct/range {v12 .. v17}, La/f7u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 130
    .line 131
    .line 132
    iget-object v8, v1, La/vei;->d:La/rtu;

    .line 133
    .line 134
    iget-object v9, v1, La/vei;->e:La/pru;

    .line 135
    .line 136
    iget-object v4, v1, La/vei;->f:La/itr;

    .line 137
    .line 138
    invoke-interface {v4}, La/itr;->a()La/hjd;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v11, v1, La/vei;->g:La/lbu;

    .line 146
    .line 147
    iget-object v4, v1, La/vei;->h:La/ugf0;

    .line 148
    .line 149
    iget-object v4, v4, La/ugf0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, La/daf;

    .line 152
    .line 153
    invoke-virtual {v4}, La/daf;->w()La/luu;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object v13, v1, La/vei;->i:La/iip;

    .line 161
    .line 162
    invoke-interface {v13}, La/iip;->x()La/j3c;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object v14, v1, La/vei;->j:La/y78;

    .line 170
    .line 171
    iget-object v15, v1, La/vei;->k:La/r9u;

    .line 172
    .line 173
    move-object/from16 v16, v0

    .line 174
    .line 175
    iget-object v0, v1, La/vei;->l:La/ctf0;

    .line 176
    .line 177
    iget-object v1, v1, La/vei;->m:La/cad;

    .line 178
    .line 179
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, La/psc;

    .line 182
    .line 183
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 184
    .line 185
    .line 186
    move-result-object v17

    .line 187
    invoke-static/range {v17 .. v17}, La/x1x;->x(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v1, v16

    .line 191
    .line 192
    move-object/from16 v16, v0

    .line 193
    .line 194
    move-object v0, v1

    .line 195
    move-object v1, v12

    .line 196
    move-object v12, v4

    .line 197
    move-object v4, v7

    .line 198
    move-object v7, v1

    .line 199
    move-object/from16 v1, p1

    .line 200
    .line 201
    invoke-direct/range {v0 .. v17}, La/dch;-><init>(La/vzg0;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;ZLa/b8u;La/j910;La/dgu;La/f7u;La/rtu;La/pru;La/hjd;La/lbu;La/luu;La/j3c;La/y78;La/r9u;La/ctf0;La/mne;)V

    .line 202
    .line 203
    .line 204
    return-object v0
.end method
