.class public final La/hei;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/dci;


# direct methods
.method public constructor <init>(La/dci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hei;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/aig;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/hei;->a:La/dci;

    .line 6
    .line 7
    iget-object v1, v1, La/dci;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/iei;

    .line 10
    .line 11
    iget-object v2, v1, La/iei;->b:La/pyg;

    .line 12
    .line 13
    invoke-interface {v2}, La/pyg;->a()La/hzg;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, La/iei;->c:La/cad;

    .line 21
    .line 22
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, La/psc;

    .line 25
    .line 26
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v4, v2

    .line 34
    move-object v2, v3

    .line 35
    iget-object v3, v1, La/iei;->d:La/ctf0;

    .line 36
    .line 37
    move-object v5, v4

    .line 38
    iget-object v4, v1, La/iei;->e:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 39
    .line 40
    new-instance v6, La/gr00;

    .line 41
    .line 42
    new-instance v7, La/nsu;

    .line 43
    .line 44
    iget-object v8, v1, La/iei;->g:La/n5d0;

    .line 45
    .line 46
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, La/cog;

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    invoke-direct {v7, v8, v12}, La/nsu;-><init>(La/cog;B)V

    .line 54
    .line 55
    .line 56
    new-instance v8, La/cqc;

    .line 57
    .line 58
    iget-object v9, v1, La/iei;->g:La/n5d0;

    .line 59
    .line 60
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, La/cog;

    .line 65
    .line 66
    const/4 v13, 0x2

    .line 67
    invoke-direct {v8, v9, v13}, La/cqc;-><init>(La/cog;B)V

    .line 68
    .line 69
    .line 70
    new-instance v9, La/x2u;

    .line 71
    .line 72
    iget-object v10, v1, La/iei;->g:La/n5d0;

    .line 73
    .line 74
    invoke-interface {v10}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, La/cog;

    .line 79
    .line 80
    const/4 v14, 0x1

    .line 81
    invoke-direct {v9, v10, v14}, La/x2u;-><init>(La/cog;B)V

    .line 82
    .line 83
    .line 84
    new-instance v10, La/x2u;

    .line 85
    .line 86
    iget-object v11, v1, La/iei;->g:La/n5d0;

    .line 87
    .line 88
    invoke-interface {v11}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    check-cast v11, La/cog;

    .line 93
    .line 94
    invoke-direct {v10, v11, v13}, La/x2u;-><init>(La/cog;B)V

    .line 95
    .line 96
    .line 97
    new-instance v11, La/ocl;

    .line 98
    .line 99
    iget-object v15, v1, La/iei;->b:La/pyg;

    .line 100
    .line 101
    invoke-interface {v15}, La/pyg;->p()La/dhg;

    .line 102
    .line 103
    .line 104
    move-result-object v15

    .line 105
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v11, v15}, La/ocl;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v6 .. v11}, La/gr00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v7, La/soi0;

    .line 115
    .line 116
    iget-object v8, v1, La/iei;->g:La/n5d0;

    .line 117
    .line 118
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, La/cog;

    .line 123
    .line 124
    invoke-direct {v7, v8, v14}, La/soi0;-><init>(La/cog;B)V

    .line 125
    .line 126
    .line 127
    move-object v8, v5

    .line 128
    move-object v5, v6

    .line 129
    move-object v6, v7

    .line 130
    new-instance v7, La/soi0;

    .line 131
    .line 132
    iget-object v9, v1, La/iei;->g:La/n5d0;

    .line 133
    .line 134
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, La/cog;

    .line 139
    .line 140
    invoke-direct {v7, v9, v12}, La/soi0;-><init>(La/cog;B)V

    .line 141
    .line 142
    .line 143
    move-object v9, v8

    .line 144
    new-instance v8, La/nsu;

    .line 145
    .line 146
    iget-object v10, v1, La/iei;->g:La/n5d0;

    .line 147
    .line 148
    invoke-interface {v10}, La/o5d0;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, La/cog;

    .line 153
    .line 154
    invoke-direct {v8, v10, v14}, La/nsu;-><init>(La/cog;B)V

    .line 155
    .line 156
    .line 157
    move-object v10, v9

    .line 158
    new-instance v9, La/bqc;

    .line 159
    .line 160
    iget-object v1, v1, La/iei;->g:La/n5d0;

    .line 161
    .line 162
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/cog;

    .line 167
    .line 168
    invoke-direct {v9, v1, v13}, La/bqc;-><init>(La/cog;B)V

    .line 169
    .line 170
    .line 171
    move-object v1, v10

    .line 172
    move-object/from16 v10, p1

    .line 173
    .line 174
    invoke-direct/range {v0 .. v10}, La/aig;-><init>(La/hzg;La/mne;La/ctf0;Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/gr00;La/soi0;La/soi0;La/nsu;La/bqc;La/vzg0;)V

    .line 175
    .line 176
    .line 177
    return-object v0
.end method
