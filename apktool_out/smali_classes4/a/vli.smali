.class public final La/vli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vli;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 21

    .line 1
    new-instance v0, La/wk40;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/vli;->a:La/rki;

    .line 6
    .line 7
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/wli;

    .line 10
    .line 11
    iget-object v2, v1, La/wli;->a:Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;

    .line 12
    .line 13
    iget-object v3, v1, La/wli;->b:La/duj;

    .line 14
    .line 15
    iget-object v4, v1, La/wli;->c:La/pyg;

    .line 16
    .line 17
    invoke-interface {v4}, La/pyg;->a()La/hzg;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, La/wli;->d:La/m1e;

    .line 25
    .line 26
    iget-object v6, v1, La/wli;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v7, v1, La/wli;->f:La/cad;

    .line 29
    .line 30
    iget-object v7, v7, La/cad;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, La/psc;

    .line 33
    .line 34
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v8, La/lbu;

    .line 42
    .line 43
    iget-object v9, v1, La/wli;->g:La/clc;

    .line 44
    .line 45
    iget-object v10, v9, La/clc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v10, La/v7i;

    .line 48
    .line 49
    invoke-virtual {v10}, La/v7i;->i()La/reu;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    iget-object v11, v1, La/wli;->h:La/iip;

    .line 54
    .line 55
    invoke-interface {v11}, La/iip;->V()La/j3c;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/16 v12, 0x1b

    .line 63
    .line 64
    invoke-direct {v8, v10, v11, v12}, La/lbu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    iget-object v9, v9, La/clc;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, La/v7i;

    .line 70
    .line 71
    invoke-virtual {v9}, La/v7i;->h()La/a7q;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    iget-object v10, v1, La/wli;->i:La/g2v;

    .line 76
    .line 77
    iget-object v11, v1, La/wli;->j:La/ctf0;

    .line 78
    .line 79
    iget-object v12, v1, La/wli;->k:La/ugf0;

    .line 80
    .line 81
    iget-object v12, v12, La/ugf0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v12, La/daf;

    .line 84
    .line 85
    invoke-virtual {v12}, La/daf;->w()La/luu;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v13, v1, La/wli;->l:La/oeg0;

    .line 93
    .line 94
    new-instance v14, La/ih5;

    .line 95
    .line 96
    iget-object v15, v1, La/wli;->m:La/kt2;

    .line 97
    .line 98
    move-object/from16 v16, v0

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    invoke-direct {v14, v15, v0}, La/ih5;-><init>(La/kt2;B)V

    .line 102
    .line 103
    .line 104
    iget-object v15, v1, La/wli;->n:La/zr1;

    .line 105
    .line 106
    iget-object v0, v1, La/wli;->o:La/epi0;

    .line 107
    .line 108
    iget-object v0, v0, La/epi0;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, La/xzp;

    .line 111
    .line 112
    invoke-virtual {v0}, La/xzp;->C()La/r9u;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object/from16 p0, v0

    .line 117
    .line 118
    iget-object v0, v1, La/wli;->p:La/a1d;

    .line 119
    .line 120
    move-object/from16 v17, v2

    .line 121
    .line 122
    iget-object v2, v0, La/a1d;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, La/qv2;

    .line 125
    .line 126
    invoke-virtual {v2}, La/qv2;->i()La/hqc;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    move-object/from16 v18, v2

    .line 131
    .line 132
    iget-object v2, v1, La/wli;->q:La/lbu;

    .line 133
    .line 134
    iget-object v1, v1, La/wli;->r:La/bwl;

    .line 135
    .line 136
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/dbi;

    .line 139
    .line 140
    invoke-virtual {v1}, La/dbi;->B()La/hcp0;

    .line 141
    .line 142
    .line 143
    move-result-object v19

    .line 144
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/qv2;

    .line 147
    .line 148
    invoke-virtual {v0}, La/qv2;->g()La/ivn;

    .line 149
    .line 150
    .line 151
    move-result-object v20

    .line 152
    move-object/from16 v0, v18

    .line 153
    .line 154
    move-object/from16 v18, v2

    .line 155
    .line 156
    move-object/from16 v2, v17

    .line 157
    .line 158
    move-object/from16 v17, v0

    .line 159
    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    move-object/from16 v0, v16

    .line 163
    .line 164
    move-object/from16 v16, p0

    .line 165
    .line 166
    invoke-direct/range {v0 .. v20}, La/wk40;-><init>(La/vzg0;Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;La/duj;La/hzg;La/m1e;Ljava/lang/String;La/mne;La/lbu;La/a7q;La/g2v;La/ctf0;La/luu;La/oeg0;La/ih5;La/zr1;La/r9u;La/hqc;La/lbu;La/hcp0;La/ivn;)V

    .line 167
    .line 168
    .line 169
    return-object v0
.end method
