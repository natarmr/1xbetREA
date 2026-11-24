.class public final La/sri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sri;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 21

    .line 1
    new-instance v0, La/hef0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/sri;->a:La/fri;

    .line 6
    .line 7
    iget-object v1, v1, La/fri;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/tri;

    .line 10
    .line 11
    iget-object v2, v1, La/tri;->a:Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 12
    .line 13
    iget-object v3, v1, La/tri;->b:La/itr;

    .line 14
    .line 15
    invoke-interface {v3}, La/itr;->a()La/hjd;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, v1, La/tri;->c:La/m1e;

    .line 23
    .line 24
    iget-object v5, v1, La/tri;->d:La/iip;

    .line 25
    .line 26
    invoke-interface {v5}, La/iip;->x()La/j3c;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, La/a6u;

    .line 34
    .line 35
    iget-object v7, v1, La/tri;->e:La/nr00;

    .line 36
    .line 37
    iget-object v7, v7, La/nr00;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v7, La/ru;

    .line 40
    .line 41
    invoke-virtual {v7}, La/ru;->x()La/w5z;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    iget-object v7, v1, La/tri;->f:La/vqc;

    .line 46
    .line 47
    iget-object v7, v7, La/vqc;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, La/cih;

    .line 50
    .line 51
    invoke-virtual {v7}, La/cih;->a()La/uzc;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    iget-object v8, v1, La/tri;->g:La/uqe;

    .line 56
    .line 57
    iget-object v11, v1, La/tri;->h:La/b3c0;

    .line 58
    .line 59
    iget-object v12, v1, La/tri;->i:La/gst0;

    .line 60
    .line 61
    iget-object v13, v1, La/tri;->j:La/lsn;

    .line 62
    .line 63
    iget-object v9, v13, La/lsn;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v9, La/gbi;

    .line 66
    .line 67
    invoke-virtual {v9}, La/gbi;->k()La/v7i;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-direct/range {v6 .. v12}, La/a6u;-><init>(La/uzc;La/uqe;La/v7i;La/w5z;La/b3c0;La/gst0;)V

    .line 72
    .line 73
    .line 74
    new-instance v14, La/a6u;

    .line 75
    .line 76
    iget-object v7, v13, La/lsn;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, La/gbi;

    .line 79
    .line 80
    invoke-virtual {v7}, La/gbi;->k()La/v7i;

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    new-instance v7, La/edu;

    .line 85
    .line 86
    iget-object v8, v1, La/tri;->k:La/pdf0;

    .line 87
    .line 88
    invoke-interface {v8}, La/pdf0;->d()La/gxu;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v9, v1, La/tri;->i:La/gst0;

    .line 96
    .line 97
    invoke-direct {v7, v8, v9}, La/edu;-><init>(La/gxu;La/gst0;)V

    .line 98
    .line 99
    .line 100
    iget-object v8, v1, La/tri;->l:La/rtu;

    .line 101
    .line 102
    iget-object v9, v1, La/tri;->m:La/ieu;

    .line 103
    .line 104
    iget-object v12, v1, La/tri;->n:La/pru;

    .line 105
    .line 106
    const/16 v20, 0xb

    .line 107
    .line 108
    move-object/from16 v16, v7

    .line 109
    .line 110
    move-object/from16 v17, v8

    .line 111
    .line 112
    move-object/from16 v18, v9

    .line 113
    .line 114
    move-object/from16 v19, v12

    .line 115
    .line 116
    invoke-direct/range {v14 .. v20}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    iget-object v8, v1, La/tri;->o:La/ctf0;

    .line 120
    .line 121
    iget-object v9, v1, La/tri;->p:La/y78;

    .line 122
    .line 123
    iget-object v7, v1, La/tri;->q:La/ugf0;

    .line 124
    .line 125
    iget-object v7, v7, La/ugf0;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v7, La/daf;

    .line 128
    .line 129
    invoke-virtual {v7}, La/daf;->w()La/luu;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v11, v1, La/tri;->r:La/bzt;

    .line 137
    .line 138
    iget-object v13, v1, La/tri;->s:La/lbu;

    .line 139
    .line 140
    iget-object v7, v1, La/tri;->t:La/cad;

    .line 141
    .line 142
    iget-object v7, v7, La/cad;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v7, La/psc;

    .line 145
    .line 146
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v15, v1, La/tri;->u:La/b4j;

    .line 154
    .line 155
    iget-object v12, v1, La/tri;->v:La/d1p;

    .line 156
    .line 157
    invoke-interface {v12}, La/d1p;->n0()La/je;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    iget-object v1, v1, La/tri;->w:La/r9u;

    .line 162
    .line 163
    move-object v12, v14

    .line 164
    move-object v14, v7

    .line 165
    move-object v7, v12

    .line 166
    move-object/from16 v17, v1

    .line 167
    .line 168
    move-object/from16 v12, v19

    .line 169
    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    invoke-direct/range {v0 .. v17}, La/hef0;-><init>(La/vzg0;Lorg/xplatform/related/api/presentation/RelatedParams;La/hjd;La/m1e;La/j3c;La/a6u;La/a6u;La/ctf0;La/y78;La/luu;La/bzt;La/pru;La/lbu;La/mne;La/b4j;La/je;La/r9u;)V

    .line 173
    .line 174
    .line 175
    return-object v0
.end method
