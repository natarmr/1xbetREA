.class public final La/myi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/nyi;


# direct methods
.method public constructor <init>(La/nyi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/myi;->a:La/nyi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 22

    .line 1
    new-instance v0, La/a6t0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/myi;->a:La/nyi;

    .line 6
    .line 7
    iget-object v1, v1, La/nyi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/oyi;

    .line 10
    .line 11
    iget-object v2, v1, La/oyi;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v1, La/oyi;->b:La/cad;

    .line 14
    .line 15
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/psc;

    .line 18
    .line 19
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, La/oyi;->c:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 27
    .line 28
    iget-object v5, v1, La/oyi;->d:La/clc;

    .line 29
    .line 30
    iget-object v5, v5, La/clc;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, La/v7i;

    .line 33
    .line 34
    invoke-virtual {v5}, La/v7i;->h()La/a7q;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v1, La/oyi;->e:La/iip;

    .line 39
    .line 40
    invoke-interface {v6}, La/iip;->V()La/j3c;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v7, v1, La/oyi;->f:La/m1e;

    .line 48
    .line 49
    iget-object v8, v1, La/oyi;->g:La/oeg0;

    .line 50
    .line 51
    iget-object v9, v1, La/oyi;->h:La/ctf0;

    .line 52
    .line 53
    iget-object v10, v1, La/oyi;->i:La/a1d;

    .line 54
    .line 55
    iget-object v11, v10, La/a1d;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v11, La/qv2;

    .line 58
    .line 59
    invoke-virtual {v11}, La/qv2;->i()La/hqc;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    iget-object v12, v1, La/oyi;->j:La/bwl;

    .line 64
    .line 65
    iget-object v12, v12, La/bwl;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v12, La/dbi;

    .line 68
    .line 69
    invoke-virtual {v12}, La/dbi;->B()La/hcp0;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    move-object v13, v11

    .line 74
    move-object v11, v12

    .line 75
    iget-object v12, v1, La/oyi;->k:La/iqt;

    .line 76
    .line 77
    iget-object v10, v10, La/a1d;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v10, La/qv2;

    .line 80
    .line 81
    invoke-virtual {v10}, La/qv2;->g()La/ivn;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    new-instance v14, La/kys0;

    .line 86
    .line 87
    const/4 v15, 0x1

    .line 88
    invoke-direct {v14, v15}, La/kys0;-><init>(B)V

    .line 89
    .line 90
    .line 91
    iget-object v15, v1, La/oyi;->l:La/qgh;

    .line 92
    .line 93
    move-object/from16 v16, v0

    .line 94
    .line 95
    iget-object v0, v1, La/oyi;->m:La/dwu;

    .line 96
    .line 97
    move-object/from16 v17, v0

    .line 98
    .line 99
    new-instance v0, La/dgu;

    .line 100
    .line 101
    move-object/from16 v18, v2

    .line 102
    .line 103
    new-instance v2, La/reu;

    .line 104
    .line 105
    move-object/from16 p0, v3

    .line 106
    .line 107
    iget-object v3, v1, La/oyi;->t:La/n5d0;

    .line 108
    .line 109
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, La/p5t0;

    .line 114
    .line 115
    invoke-direct {v2, v3}, La/reu;-><init>(La/p5t0;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, La/b8u;

    .line 119
    .line 120
    move-object/from16 v19, v4

    .line 121
    .line 122
    iget-object v4, v1, La/oyi;->u:La/n5d0;

    .line 123
    .line 124
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, La/d4t0;

    .line 129
    .line 130
    invoke-direct {v3, v4}, La/b8u;-><init>(La/d4t0;)V

    .line 131
    .line 132
    .line 133
    new-instance v4, La/e1u;

    .line 134
    .line 135
    move-object/from16 v20, v5

    .line 136
    .line 137
    iget-object v5, v1, La/oyi;->u:La/n5d0;

    .line 138
    .line 139
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, La/d4t0;

    .line 144
    .line 145
    invoke-direct {v4, v5}, La/e1u;-><init>(La/d4t0;)V

    .line 146
    .line 147
    .line 148
    new-instance v5, La/reu;

    .line 149
    .line 150
    move-object/from16 v21, v6

    .line 151
    .line 152
    iget-object v6, v1, La/oyi;->v:La/n5d0;

    .line 153
    .line 154
    invoke-interface {v6}, La/o5d0;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, La/nov;

    .line 159
    .line 160
    invoke-direct {v5, v6}, La/reu;-><init>(La/nov;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v0, v2, v3, v4, v5}, La/dgu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v1, La/oyi;->p:La/g2v;

    .line 167
    .line 168
    iget-object v1, v1, La/oyi;->q:La/r9u;

    .line 169
    .line 170
    move-object/from16 v3, v17

    .line 171
    .line 172
    move-object/from16 v17, v0

    .line 173
    .line 174
    move-object/from16 v0, v16

    .line 175
    .line 176
    move-object/from16 v16, v3

    .line 177
    .line 178
    move-object/from16 v3, v18

    .line 179
    .line 180
    move-object/from16 v18, v2

    .line 181
    .line 182
    move-object v2, v3

    .line 183
    move-object v3, v13

    .line 184
    move-object v13, v10

    .line 185
    move-object v10, v3

    .line 186
    move-object/from16 v3, p0

    .line 187
    .line 188
    move-object/from16 v4, v19

    .line 189
    .line 190
    move-object/from16 v5, v20

    .line 191
    .line 192
    move-object/from16 v6, v21

    .line 193
    .line 194
    move-object/from16 v19, v1

    .line 195
    .line 196
    move-object/from16 v1, p1

    .line 197
    .line 198
    invoke-direct/range {v0 .. v19}, La/a6t0;-><init>(La/vzg0;Ljava/lang/String;La/mne;Lorg/xplatform/ufc/api/game/UfcPostGameParams;La/a7q;La/j3c;La/m1e;La/oeg0;La/ctf0;La/hqc;La/hcp0;La/iqt;La/ivn;La/kys0;La/qgh;La/dwu;La/dgu;La/g2v;La/r9u;)V

    .line 199
    .line 200
    .line 201
    return-object v0
.end method
