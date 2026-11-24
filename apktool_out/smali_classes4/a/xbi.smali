.class public final La/xbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/r5i;


# direct methods
.method public constructor <init>(La/r5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xbi;->a:La/r5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 18

    .line 1
    new-instance v0, La/qi2;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/xbi;->a:La/r5i;

    .line 6
    .line 7
    iget-object v1, v1, La/r5i;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/aci;

    .line 10
    .line 11
    iget-object v2, v1, La/aci;->x:La/iip;

    .line 12
    .line 13
    invoke-interface {v2}, La/iip;->x()La/j3c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, La/aci;->h:La/i1w0;

    .line 21
    .line 22
    iget-object v4, v1, La/aci;->n:La/r9u;

    .line 23
    .line 24
    iget-object v5, v1, La/aci;->j:La/pru;

    .line 25
    .line 26
    iget-object v6, v1, La/aci;->F:La/nr00;

    .line 27
    .line 28
    invoke-virtual {v6}, La/nr00;->g()La/rrc;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    new-instance v7, La/ifp;

    .line 33
    .line 34
    iget-object v8, v1, La/aci;->n:La/r9u;

    .line 35
    .line 36
    iget-object v9, v1, La/aci;->G:La/pyg;

    .line 37
    .line 38
    invoke-interface {v9}, La/pyg;->i()La/vqc;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    iget-object v10, v1, La/aci;->H:La/kys0;

    .line 43
    .line 44
    invoke-direct {v7, v8, v5, v9, v10}, La/ifp;-><init>(La/r9u;La/pru;La/vqc;La/kys0;)V

    .line 45
    .line 46
    .line 47
    new-instance v8, La/abu;

    .line 48
    .line 49
    new-instance v9, La/xfu;

    .line 50
    .line 51
    iget-object v10, v1, La/aci;->I:La/cyu;

    .line 52
    .line 53
    invoke-direct {v9, v10}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v10, La/reu;

    .line 57
    .line 58
    iget-object v11, v1, La/aci;->J:La/b3c0;

    .line 59
    .line 60
    invoke-direct {v10, v11}, La/reu;-><init>(La/b3c0;)V

    .line 61
    .line 62
    .line 63
    const/16 v11, 0x8

    .line 64
    .line 65
    invoke-direct {v8, v9, v10, v11}, La/abu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    iget-object v9, v1, La/aci;->A:La/g2v;

    .line 69
    .line 70
    iget-object v10, v1, La/aci;->c:La/bwl;

    .line 71
    .line 72
    iget-object v11, v10, La/bwl;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v11, La/dbi;

    .line 75
    .line 76
    invoke-virtual {v11}, La/dbi;->z()La/yzn0;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    iget-object v12, v1, La/aci;->K:La/a1d;

    .line 81
    .line 82
    iget-object v12, v12, La/a1d;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v12, La/qv2;

    .line 85
    .line 86
    invoke-virtual {v12}, La/qv2;->q()La/n4u;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    iget-object v13, v10, La/bwl;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v13, La/dbi;

    .line 93
    .line 94
    invoke-virtual {v13}, La/dbi;->B()La/hcp0;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    iget-object v10, v10, La/bwl;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v10, La/dbi;

    .line 101
    .line 102
    invoke-virtual {v10}, La/dbi;->v()La/ehf0;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    iget-object v14, v1, La/aci;->D:La/m1e;

    .line 107
    .line 108
    iget-object v15, v1, La/aci;->i:La/mne;

    .line 109
    .line 110
    move-object/from16 v16, v0

    .line 111
    .line 112
    iget-object v0, v1, La/aci;->e:La/ctf0;

    .line 113
    .line 114
    iget-object v1, v1, La/aci;->E:La/duj;

    .line 115
    .line 116
    move-object/from16 v17, v16

    .line 117
    .line 118
    move-object/from16 v16, v0

    .line 119
    .line 120
    move-object/from16 v0, v17

    .line 121
    .line 122
    move-object/from16 v17, v13

    .line 123
    .line 124
    move-object v13, v10

    .line 125
    move-object v10, v11

    .line 126
    move-object v11, v12

    .line 127
    move-object/from16 v12, v17

    .line 128
    .line 129
    move-object/from16 v17, v1

    .line 130
    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    invoke-direct/range {v0 .. v17}, La/qi2;-><init>(La/vzg0;La/j3c;La/i1w0;La/r9u;La/pru;La/rrc;La/ifp;La/abu;La/g2v;La/yzn0;La/n4u;La/hcp0;La/ehf0;La/m1e;La/mne;La/ctf0;La/duj;)V

    .line 134
    .line 135
    .line 136
    return-object v0
.end method
