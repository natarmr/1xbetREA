.class public final La/ggi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/f7i;


# direct methods
.method public constructor <init>(La/f7i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ggi;->a:La/f7i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 20

    .line 1
    new-instance v0, La/i3p;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/ggi;->a:La/f7i;

    .line 6
    .line 7
    iget-object v1, v1, La/f7i;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/igi;

    .line 10
    .line 11
    iget-object v2, v1, La/igi;->a:La/mne;

    .line 12
    .line 13
    iget-object v3, v1, La/igi;->b:La/i1w0;

    .line 14
    .line 15
    iget-object v4, v1, La/igi;->c:La/pyg;

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
    iget-object v5, v1, La/igi;->d:La/a1d;

    .line 25
    .line 26
    iget-object v6, v5, La/a1d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, La/qv2;

    .line 29
    .line 30
    invoke-virtual {v6}, La/qv2;->l()La/z8u;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v1, La/igi;->e:La/bwl;

    .line 35
    .line 36
    iget-object v8, v7, La/bwl;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, La/dbi;

    .line 39
    .line 40
    invoke-virtual {v8}, La/dbi;->z()La/yzn0;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v9, v1, La/igi;->f:La/iip;

    .line 45
    .line 46
    invoke-interface {v9}, La/iip;->x()La/j3c;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v10, v6

    .line 54
    move-object v6, v8

    .line 55
    iget-object v8, v1, La/igi;->g:La/g2v;

    .line 56
    .line 57
    move-object v11, v9

    .line 58
    iget-object v9, v1, La/igi;->h:La/duj;

    .line 59
    .line 60
    move-object v12, v10

    .line 61
    iget-object v10, v1, La/igi;->i:La/ctf0;

    .line 62
    .line 63
    iget-object v13, v1, La/igi;->j:La/iw20;

    .line 64
    .line 65
    iget-object v13, v13, La/iw20;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v13, La/uii;

    .line 68
    .line 69
    invoke-virtual {v13}, La/uii;->r()La/pru;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    iget-object v14, v1, La/igi;->c:La/pyg;

    .line 74
    .line 75
    invoke-interface {v14}, La/pyg;->i()La/vqc;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    move-object v15, v11

    .line 80
    move-object v11, v13

    .line 81
    iget-object v13, v1, La/igi;->k:La/ifp;

    .line 82
    .line 83
    move-object/from16 v16, v12

    .line 84
    .line 85
    move-object v12, v14

    .line 86
    iget-object v14, v1, La/igi;->l:La/msu;

    .line 87
    .line 88
    move-object/from16 v17, v15

    .line 89
    .line 90
    new-instance v15, La/khf0;

    .line 91
    .line 92
    move-object/from16 v18, v0

    .line 93
    .line 94
    iget-object v0, v5, La/a1d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/qv2;

    .line 97
    .line 98
    invoke-virtual {v0}, La/qv2;->z()La/m0o0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v7, v7, La/bwl;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, La/dbi;

    .line 105
    .line 106
    invoke-virtual {v7}, La/dbi;->h()La/khf0;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    move-object/from16 v19, v2

    .line 111
    .line 112
    iget-object v2, v1, La/igi;->m:La/m1e;

    .line 113
    .line 114
    invoke-direct {v15, v0, v7, v2}, La/khf0;-><init>(La/m0o0;La/khf0;La/m1e;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v1, La/igi;->n:La/vqc;

    .line 118
    .line 119
    iget-object v2, v5, La/a1d;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, La/qv2;

    .line 122
    .line 123
    invoke-virtual {v2}, La/qv2;->g()La/ivn;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v5, v1, La/igi;->m:La/m1e;

    .line 128
    .line 129
    iget-object v1, v1, La/igi;->o:La/ugf0;

    .line 130
    .line 131
    iget-object v1, v1, La/ugf0;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, La/daf;

    .line 134
    .line 135
    invoke-virtual {v1}, La/daf;->w()La/luu;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object/from16 v7, v16

    .line 143
    .line 144
    move-object/from16 v16, v0

    .line 145
    .line 146
    move-object/from16 v0, v18

    .line 147
    .line 148
    move-object/from16 v18, v5

    .line 149
    .line 150
    move-object v5, v7

    .line 151
    move-object/from16 v7, v17

    .line 152
    .line 153
    move-object/from16 v17, v2

    .line 154
    .line 155
    move-object/from16 v2, v19

    .line 156
    .line 157
    move-object/from16 v19, v1

    .line 158
    .line 159
    move-object/from16 v1, p1

    .line 160
    .line 161
    invoke-direct/range {v0 .. v19}, La/i3p;-><init>(La/vzg0;La/mne;La/i1w0;La/hzg;La/z8u;La/yzn0;La/j3c;La/g2v;La/duj;La/ctf0;La/pru;La/vqc;La/ifp;La/msu;La/khf0;La/vqc;La/ivn;La/m1e;La/luu;)V

    .line 162
    .line 163
    .line 164
    return-object v0
.end method
