.class public final La/d7i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/t5i;


# direct methods
.method public constructor <init>(La/t5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d7i;->a:La/t5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 18

    .line 1
    new-instance v0, La/oe0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/d7i;->a:La/t5i;

    .line 6
    .line 7
    iget-object v1, v1, La/t5i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/e7i;

    .line 10
    .line 11
    iget-object v2, v1, La/e7i;->a:La/ouu;

    .line 12
    .line 13
    iget-object v3, v1, La/e7i;->b:La/duj;

    .line 14
    .line 15
    iget-object v4, v1, La/e7i;->c:La/uyu;

    .line 16
    .line 17
    iget-object v5, v1, La/e7i;->d:La/fvt0;

    .line 18
    .line 19
    iget-object v5, v5, La/fvt0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, La/h7i;

    .line 22
    .line 23
    invoke-virtual {v5}, La/h7i;->d()La/peg0;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, v1, La/e7i;->e:La/i1w0;

    .line 28
    .line 29
    iget-object v7, v1, La/e7i;->f:La/m1e;

    .line 30
    .line 31
    iget-object v8, v1, La/e7i;->g:La/cad;

    .line 32
    .line 33
    iget-object v8, v8, La/cad;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, La/psc;

    .line 36
    .line 37
    invoke-virtual {v8}, La/psc;->h()La/mne;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v9, v1, La/e7i;->h:La/au0;

    .line 45
    .line 46
    iget-object v10, v1, La/e7i;->i:La/s31;

    .line 47
    .line 48
    iget-object v11, v1, La/e7i;->j:La/cyu;

    .line 49
    .line 50
    iget-object v12, v1, La/e7i;->d:La/fvt0;

    .line 51
    .line 52
    iget-object v12, v12, La/fvt0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v12, La/h7i;

    .line 55
    .line 56
    new-instance v13, La/wti;

    .line 57
    .line 58
    new-instance v14, La/jr0;

    .line 59
    .line 60
    new-instance v15, La/xzp;

    .line 61
    .line 62
    move-object/from16 v16, v0

    .line 63
    .line 64
    iget-object v0, v12, La/h7i;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, La/gii0;

    .line 67
    .line 68
    move-object/from16 v17, v2

    .line 69
    .line 70
    iget-object v2, v12, La/h7i;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, La/x2c0;

    .line 73
    .line 74
    invoke-direct {v15, v0, v2}, La/xzp;-><init>(La/gii0;La/x2c0;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v12, La/h7i;->s:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/ap0;

    .line 80
    .line 81
    iget-object v2, v12, La/h7i;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, La/knf0;

    .line 84
    .line 85
    move-object/from16 p0, v3

    .line 86
    .line 87
    iget-object v3, v12, La/h7i;->b:La/cad;

    .line 88
    .line 89
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, La/psc;

    .line 92
    .line 93
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v14, v15, v0, v2, v3}, La/jr0;-><init>(La/xzp;La/ap0;La/knf0;La/mne;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v12, La/h7i;->c:La/j1q0;

    .line 104
    .line 105
    invoke-direct {v13, v14, v0}, La/wti;-><init>(La/jr0;La/j1q0;)V

    .line 106
    .line 107
    .line 108
    move-object v12, v13

    .line 109
    iget-object v13, v1, La/e7i;->k:La/wyu;

    .line 110
    .line 111
    iget-object v14, v1, La/e7i;->l:La/pru;

    .line 112
    .line 113
    new-instance v15, La/x4u;

    .line 114
    .line 115
    iget-object v0, v1, La/e7i;->m:La/g2v;

    .line 116
    .line 117
    invoke-direct {v15, v0}, La/x4u;-><init>(La/g2v;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v1, La/e7i;->n:La/u58;

    .line 121
    .line 122
    iget-object v1, v1, La/e7i;->o:La/bzt;

    .line 123
    .line 124
    move-object/from16 v2, v16

    .line 125
    .line 126
    move-object/from16 v16, v0

    .line 127
    .line 128
    move-object v0, v2

    .line 129
    move-object/from16 v3, p0

    .line 130
    .line 131
    move-object/from16 v2, v17

    .line 132
    .line 133
    move-object/from16 v17, v1

    .line 134
    .line 135
    move-object/from16 v1, p1

    .line 136
    .line 137
    invoke-direct/range {v0 .. v17}, La/oe0;-><init>(La/vzg0;La/ouu;La/duj;La/uyu;La/peg0;La/i1w0;La/m1e;La/mne;La/au0;La/s31;La/cyu;La/wti;La/wyu;La/pru;La/x4u;La/u58;La/bzt;)V

    .line 138
    .line 139
    .line 140
    return-object v0
.end method
