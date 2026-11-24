.class public final La/o5y;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/o5y;",
        "La/iw5;",
        "<init>",
        "()V",
        "La/y5y;",
        "uiState",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic q2:I


# instance fields
.field public k2:La/kji;

.field public l2:La/wdk0;

.field public m2:La/ii;

.field public n2:La/lgn0;

.field public o2:La/ynb;

.field public final p2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/e6y;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/n5y;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/n5y;-><init>(La/o5y;B)V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0xe

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/o5y;->p2:La/a8z;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 10

    .line 1
    const v0, -0x1add1ff6

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/bw5;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    const/16 v9, 0x3c

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-static/range {v2 .. v9}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v0, La/elm;

    .line 27
    .line 28
    const/16 v3, 0x1c

    .line 29
    .line 30
    invoke-direct {v0, p0, v3}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    const p0, 0x7493df7b

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/16 v6, 0xe

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/sik;->V(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/l5y;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/l5y;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/l5y;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v5, v3, La/l5y;->a:La/cad;

    .line 68
    .line 69
    iget-object v9, v3, La/l5y;->b:La/v88;

    .line 70
    .line 71
    iget-object v8, v3, La/l5y;->c:La/ii;

    .line 72
    .line 73
    iget-object v10, v3, La/l5y;->d:La/duj;

    .line 74
    .line 75
    iget-object v12, v3, La/l5y;->g:La/wdk0;

    .line 76
    .line 77
    iget-object v7, v3, La/l5y;->e:La/wsf0;

    .line 78
    .line 79
    iget-object v13, v3, La/l5y;->h:La/rou;

    .line 80
    .line 81
    iget-object v15, v3, La/l5y;->j:La/lgn0;

    .line 82
    .line 83
    iget-object v6, v3, La/l5y;->f:La/peg0;

    .line 84
    .line 85
    iget-object v14, v3, La/l5y;->i:La/ctf0;

    .line 86
    .line 87
    iget-object v1, v3, La/l5y;->k:La/csr0;

    .line 88
    .line 89
    iget-object v2, v3, La/l5y;->l:La/knf0;

    .line 90
    .line 91
    iget-object v4, v3, La/l5y;->m:La/gii0;

    .line 92
    .line 93
    move-object/from16 v16, v1

    .line 94
    .line 95
    iget-object v1, v3, La/l5y;->o:La/btt0;

    .line 96
    .line 97
    move-object/from16 v20, v1

    .line 98
    .line 99
    iget-object v1, v3, La/l5y;->p:La/hqr0;

    .line 100
    .line 101
    move-object/from16 v17, v1

    .line 102
    .line 103
    iget-object v1, v3, La/l5y;->n:La/wyu;

    .line 104
    .line 105
    move-object/from16 v18, v1

    .line 106
    .line 107
    iget-object v1, v3, La/l5y;->q:La/tgk;

    .line 108
    .line 109
    iget-object v3, v3, La/l5y;->r:La/m1e;

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-object/from16 v19, v4

    .line 145
    .line 146
    new-instance v4, La/v7i;

    .line 147
    .line 148
    move-object/from16 v21, v1

    .line 149
    .line 150
    move-object/from16 v18, v2

    .line 151
    .line 152
    move-object/from16 v22, v3

    .line 153
    .line 154
    invoke-direct/range {v4 .. v22}, La/v7i;-><init>(La/cad;La/peg0;La/wsf0;La/ii;La/v88;La/duj;La/i1w0;La/wdk0;La/rou;La/ctf0;La/lgn0;La/csr0;La/hqr0;La/knf0;La/gii0;La/btt0;La/tgk;La/m1e;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v4, La/v7i;->o:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, La/n5d0;

    .line 160
    .line 161
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, La/kji;

    .line 166
    .line 167
    iput-object v1, v0, La/o5y;->k2:La/kji;

    .line 168
    .line 169
    iput-object v12, v0, La/o5y;->l2:La/wdk0;

    .line 170
    .line 171
    iput-object v8, v0, La/o5y;->m2:La/ii;

    .line 172
    .line 173
    iput-object v15, v0, La/o5y;->n2:La/lgn0;

    .line 174
    .line 175
    iget-object v1, v6, La/peg0;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, La/yzn0;

    .line 178
    .line 179
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iput-object v1, v0, La/o5y;->o2:La/ynb;

    .line 187
    .line 188
    return-void

    .line 189
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 190
    .line 191
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
