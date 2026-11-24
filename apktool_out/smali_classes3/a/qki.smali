.class public final La/qki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


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
    iput-object p1, p0, La/qki;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 21

    .line 1
    move-object/from16 v16, p1

    .line 2
    .line 3
    check-cast v16, La/i1w0;

    .line 4
    .line 5
    new-instance v0, La/vq10;

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    iget-object v1, v1, La/qki;->a:La/rki;

    .line 10
    .line 11
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/gbi;

    .line 14
    .line 15
    iget-object v2, v1, La/gbi;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, La/onv;

    .line 18
    .line 19
    iget-object v2, v2, La/onv;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, La/pmi;

    .line 22
    .line 23
    new-instance v3, La/r7v;

    .line 24
    .line 25
    invoke-virtual {v2}, La/pmi;->i()La/khf0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v3, v2}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, La/o24;

    .line 33
    .line 34
    iget-object v4, v1, La/gbi;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, La/pru;

    .line 37
    .line 38
    iget-object v5, v1, La/gbi;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, La/lbu;

    .line 41
    .line 42
    const/4 v6, 0x7

    .line 43
    invoke-direct {v2, v4, v5, v6}, La/o24;-><init>(La/pru;La/lbu;B)V

    .line 44
    .line 45
    .line 46
    move-object v6, v3

    .line 47
    new-instance v3, La/o24;

    .line 48
    .line 49
    const/16 v7, 0x8

    .line 50
    .line 51
    invoke-direct {v3, v4, v5, v7}, La/o24;-><init>(La/pru;La/lbu;B)V

    .line 52
    .line 53
    .line 54
    iget-object v4, v1, La/gbi;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, La/qgd;

    .line 57
    .line 58
    new-instance v5, La/vd1;

    .line 59
    .line 60
    iget-object v8, v1, La/gbi;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, La/kt2;

    .line 63
    .line 64
    const/4 v9, 0x4

    .line 65
    invoke-direct {v5, v8, v9}, La/vd1;-><init>(La/kt2;B)V

    .line 66
    .line 67
    .line 68
    iget-object v9, v1, La/gbi;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v9, La/m1e;

    .line 71
    .line 72
    iget-object v10, v1, La/gbi;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, La/g2v;

    .line 75
    .line 76
    iget-object v11, v1, La/gbi;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v11, La/cyh;

    .line 79
    .line 80
    move-object v12, v6

    .line 81
    move-object v6, v9

    .line 82
    new-instance v9, La/dq00;

    .line 83
    .line 84
    new-instance v13, La/zg;

    .line 85
    .line 86
    invoke-direct {v13, v8, v7}, La/zg;-><init>(La/kt2;B)V

    .line 87
    .line 88
    .line 89
    iget-object v7, v1, La/gbi;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v7, La/d1p;

    .line 92
    .line 93
    invoke-interface {v7}, La/d1p;->y0()La/au0;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    const/16 v14, 0x1c

    .line 98
    .line 99
    invoke-direct {v9, v13, v8, v14}, La/dq00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    iget-object v8, v1, La/gbi;->k:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v8, La/z4w0;

    .line 105
    .line 106
    iget-object v13, v1, La/gbi;->l:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v13, La/ort;

    .line 109
    .line 110
    iget-object v14, v1, La/gbi;->m:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v14, La/mne;

    .line 113
    .line 114
    iget-object v15, v1, La/gbi;->n:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v15, La/duj;

    .line 117
    .line 118
    move-object/from16 p1, v0

    .line 119
    .line 120
    iget-object v0, v1, La/gbi;->o:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La/ctf0;

    .line 123
    .line 124
    move-object/from16 p0, v0

    .line 125
    .line 126
    iget-object v0, v1, La/gbi;->p:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/rou;

    .line 129
    .line 130
    move-object/from16 v17, v0

    .line 131
    .line 132
    iget-object v0, v1, La/gbi;->q:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, La/sek;

    .line 135
    .line 136
    move-object/from16 v18, v0

    .line 137
    .line 138
    iget-object v0, v1, La/gbi;->r:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, La/mi70;

    .line 141
    .line 142
    invoke-interface {v7}, La/d1p;->j()La/ik4;

    .line 143
    .line 144
    .line 145
    move-result-object v19

    .line 146
    iget-object v1, v1, La/gbi;->s:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v20, v1

    .line 149
    .line 150
    check-cast v20, La/rpt;

    .line 151
    .line 152
    move-object v7, v10

    .line 153
    move-object v1, v12

    .line 154
    move-object v12, v14

    .line 155
    move-object/from16 v14, p0

    .line 156
    .line 157
    move-object v10, v8

    .line 158
    move-object v8, v11

    .line 159
    move-object v11, v13

    .line 160
    move-object v13, v15

    .line 161
    move-object/from16 v15, v17

    .line 162
    .line 163
    move-object/from16 v17, v18

    .line 164
    .line 165
    move-object/from16 v18, v0

    .line 166
    .line 167
    move-object/from16 v0, p1

    .line 168
    .line 169
    invoke-direct/range {v0 .. v20}, La/vq10;-><init>(La/r7v;La/o24;La/o24;La/qgd;La/vd1;La/m1e;La/g2v;La/cyh;La/dq00;La/z4w0;La/ort;La/mne;La/duj;La/ctf0;La/rou;La/i1w0;La/sek;La/mi70;La/ik4;La/rpt;)V

    .line 170
    .line 171
    .line 172
    return-object v0
.end method
