.class public final La/foi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/foi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 21

    .line 1
    new-instance v0, La/xja0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/foi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/h6i;

    .line 10
    .line 11
    iget-object v2, v1, La/h6i;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, v1, La/h6i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, v1, La/h6i;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, La/uyu;

    .line 26
    .line 27
    new-instance v5, La/n4u;

    .line 28
    .line 29
    new-instance v6, La/w5z;

    .line 30
    .line 31
    new-instance v7, La/nv20;

    .line 32
    .line 33
    iget-object v8, v1, La/h6i;->g:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v12, v8

    .line 36
    check-cast v12, La/gii0;

    .line 37
    .line 38
    const/16 v13, 0x9

    .line 39
    .line 40
    invoke-direct {v7, v12, v13}, La/nv20;-><init>(La/gii0;B)V

    .line 41
    .line 42
    .line 43
    iget-object v8, v1, La/h6i;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v8, La/knf0;

    .line 46
    .line 47
    iget-object v9, v1, La/h6i;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v9, La/bca0;

    .line 50
    .line 51
    iget-object v10, v1, La/h6i;->j:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v14, v10

    .line 54
    check-cast v14, La/cad;

    .line 55
    .line 56
    iget-object v10, v14, La/cad;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v10, La/psc;

    .line 59
    .line 60
    invoke-virtual {v10}, La/psc;->h()La/mne;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v11, v1, La/h6i;->k:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v11, La/kuy;

    .line 70
    .line 71
    invoke-direct/range {v6 .. v11}, La/w5z;-><init>(La/nv20;La/knf0;La/bca0;La/mne;La/kuy;)V

    .line 72
    .line 73
    .line 74
    const/16 v7, 0x1a

    .line 75
    .line 76
    invoke-direct {v5, v6, v7}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    new-instance v6, La/clc;

    .line 80
    .line 81
    new-instance v15, La/w5z;

    .line 82
    .line 83
    new-instance v7, La/nv20;

    .line 84
    .line 85
    invoke-direct {v7, v12, v13}, La/nv20;-><init>(La/gii0;B)V

    .line 86
    .line 87
    .line 88
    iget-object v8, v1, La/h6i;->h:Ljava/lang/Object;

    .line 89
    .line 90
    move-object/from16 v17, v8

    .line 91
    .line 92
    check-cast v17, La/knf0;

    .line 93
    .line 94
    iget-object v8, v1, La/h6i;->i:Ljava/lang/Object;

    .line 95
    .line 96
    move-object/from16 v18, v8

    .line 97
    .line 98
    check-cast v18, La/bca0;

    .line 99
    .line 100
    iget-object v8, v14, La/cad;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, La/psc;

    .line 103
    .line 104
    invoke-virtual {v8}, La/psc;->h()La/mne;

    .line 105
    .line 106
    .line 107
    move-result-object v19

    .line 108
    invoke-static/range {v19 .. v19}, La/x1x;->x(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v8, v1, La/h6i;->k:Ljava/lang/Object;

    .line 112
    .line 113
    move-object/from16 v20, v8

    .line 114
    .line 115
    check-cast v20, La/kuy;

    .line 116
    .line 117
    move-object/from16 v16, v7

    .line 118
    .line 119
    invoke-direct/range {v15 .. v20}, La/w5z;-><init>(La/nv20;La/knf0;La/bca0;La/mne;La/kuy;)V

    .line 120
    .line 121
    .line 122
    const/4 v7, 0x6

    .line 123
    invoke-direct {v6, v15, v7}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v1, La/h6i;->l:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v7, La/i1w0;

    .line 129
    .line 130
    iget-object v8, v1, La/h6i;->e:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v8, La/m1e;

    .line 133
    .line 134
    iget-object v9, v14, La/cad;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v9, La/psc;

    .line 137
    .line 138
    invoke-virtual {v9}, La/psc;->h()La/mne;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v10, v1, La/h6i;->m:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v10, La/duj;

    .line 148
    .line 149
    iget-object v11, v1, La/h6i;->n:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v11, La/wyu;

    .line 152
    .line 153
    iget-object v12, v1, La/h6i;->o:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v12, La/ocl;

    .line 156
    .line 157
    iget-object v1, v1, La/h6i;->a:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v13, v1

    .line 160
    check-cast v13, La/ctf0;

    .line 161
    .line 162
    move-object v1, v2

    .line 163
    move v2, v3

    .line 164
    move-object/from16 v3, p1

    .line 165
    .line 166
    invoke-direct/range {v0 .. v13}, La/xja0;-><init>(Ljava/lang/String;ZLa/vzg0;La/uyu;La/n4u;La/clc;La/i1w0;La/m1e;La/mne;La/duj;La/wyu;La/ocl;La/ctf0;)V

    .line 167
    .line 168
    .line 169
    return-object v0
.end method
