.class public final La/joi;
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
    iput-object p1, p0, La/joi;->a:La/omi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 22

    .line 1
    new-instance v0, La/dna0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/joi;->a:La/omi;

    .line 6
    .line 7
    iget-object v1, v1, La/omi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/f6i;

    .line 10
    .line 11
    iget-object v2, v1, La/f6i;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, v1, La/f6i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    new-instance v5, La/f4u;

    .line 24
    .line 25
    invoke-virtual {v1}, La/f6i;->h()La/z220;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/16 v7, 0x18

    .line 30
    .line 31
    invoke-direct {v5, v6, v7}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance v6, La/jwu;

    .line 35
    .line 36
    iget-object v7, v1, La/f6i;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v7, La/pmi0;

    .line 39
    .line 40
    iget-object v8, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, La/daf;

    .line 43
    .line 44
    invoke-virtual {v8}, La/daf;->A()La/nfm0;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v9, 0x2

    .line 52
    invoke-direct {v6, v8, v9}, La/jwu;-><init>(La/nfm0;B)V

    .line 53
    .line 54
    .line 55
    iget-object v8, v1, La/f6i;->m:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, La/qzt;

    .line 58
    .line 59
    iget-object v9, v1, La/f6i;->n:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v9, La/wyu;

    .line 62
    .line 63
    iget-object v10, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, La/daf;

    .line 66
    .line 67
    invoke-virtual {v10}, La/daf;->s()La/f7u;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    move-object v11, v8

    .line 72
    move-object v8, v9

    .line 73
    move-object v9, v10

    .line 74
    new-instance v10, La/weu;

    .line 75
    .line 76
    iget-object v12, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v12, La/daf;

    .line 79
    .line 80
    invoke-virtual {v12}, La/daf;->A()La/nfm0;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    invoke-direct {v10, v12, v13}, La/weu;-><init>(La/nfm0;B)V

    .line 89
    .line 90
    .line 91
    iget-object v7, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, La/daf;

    .line 94
    .line 95
    invoke-virtual {v7}, La/daf;->r()La/fhj;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    new-instance v12, La/uyn;

    .line 100
    .line 101
    invoke-virtual {v1}, La/f6i;->h()La/z220;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-direct {v12, v13}, La/uyn;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v13, La/bbw0;

    .line 109
    .line 110
    invoke-virtual {v1}, La/f6i;->h()La/z220;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    const/16 v15, 0x1b

    .line 115
    .line 116
    invoke-direct {v13, v14, v15}, La/bbw0;-><init>(Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    iget-object v14, v1, La/f6i;->g:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v14, La/m1e;

    .line 122
    .line 123
    iget-object v15, v1, La/f6i;->o:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v15, La/uyu;

    .line 126
    .line 127
    move-object/from16 v16, v0

    .line 128
    .line 129
    iget-object v0, v1, La/f6i;->h:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, La/cad;

    .line 132
    .line 133
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/psc;

    .line 136
    .line 137
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 p0, v0

    .line 145
    .line 146
    iget-object v0, v1, La/f6i;->p:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v17, v0

    .line 149
    .line 150
    check-cast v17, La/duj;

    .line 151
    .line 152
    iget-object v0, v1, La/f6i;->f:Ljava/lang/Object;

    .line 153
    .line 154
    move-object/from16 v18, v0

    .line 155
    .line 156
    check-cast v18, La/i1w0;

    .line 157
    .line 158
    iget-object v0, v1, La/f6i;->q:Ljava/lang/Object;

    .line 159
    .line 160
    move-object/from16 v19, v0

    .line 161
    .line 162
    check-cast v19, La/r9u;

    .line 163
    .line 164
    iget-object v0, v1, La/f6i;->c:Ljava/lang/Object;

    .line 165
    .line 166
    move-object/from16 v20, v0

    .line 167
    .line 168
    check-cast v20, La/ctf0;

    .line 169
    .line 170
    iget-object v0, v1, La/f6i;->r:Ljava/lang/Object;

    .line 171
    .line 172
    move-object/from16 v21, v0

    .line 173
    .line 174
    check-cast v21, La/ocl;

    .line 175
    .line 176
    move-object v0, v11

    .line 177
    move-object v11, v7

    .line 178
    move-object v7, v0

    .line 179
    move-object v1, v2

    .line 180
    move-wide v2, v3

    .line 181
    move-object/from16 v0, v16

    .line 182
    .line 183
    move-object/from16 v16, p0

    .line 184
    .line 185
    move-object/from16 v4, p1

    .line 186
    .line 187
    invoke-direct/range {v0 .. v21}, La/dna0;-><init>(Ljava/lang/String;JLa/vzg0;La/f4u;La/jwu;La/qzt;La/wyu;La/f7u;La/weu;La/fhj;La/uyn;La/bbw0;La/m1e;La/uyu;La/mne;La/duj;La/i1w0;La/r9u;La/ctf0;La/ocl;)V

    .line 188
    .line 189
    .line 190
    return-object v0
.end method
