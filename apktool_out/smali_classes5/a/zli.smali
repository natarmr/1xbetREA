.class public final La/zli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rii;


# direct methods
.method public constructor <init>(La/rii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zli;->a:La/rii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 21

    .line 1
    new-instance v0, La/kw50;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/zli;->a:La/rii;

    .line 6
    .line 7
    iget-object v1, v1, La/rii;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/ami;

    .line 10
    .line 11
    new-instance v2, La/rou;

    .line 12
    .line 13
    iget-object v3, v1, La/ami;->b:La/b3c0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, v3, v4}, La/rou;-><init>(La/b3c0;B)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, La/ami;->u:La/n5d0;

    .line 20
    .line 21
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, La/loc;

    .line 26
    .line 27
    iget-object v4, v1, La/ami;->w:La/n5d0;

    .line 28
    .line 29
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, La/kzt;

    .line 34
    .line 35
    iget-object v5, v1, La/ami;->x:La/n5d0;

    .line 36
    .line 37
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, La/twc;

    .line 42
    .line 43
    iget-object v6, v1, La/ami;->f:La/xnt;

    .line 44
    .line 45
    iget-object v7, v1, La/ami;->g:La/tzi;

    .line 46
    .line 47
    iget-object v8, v1, La/ami;->h:La/lp4;

    .line 48
    .line 49
    invoke-interface {v8}, La/lp4;->m()La/rek0;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    new-instance v9, La/iqt;

    .line 54
    .line 55
    iget-object v10, v1, La/ami;->i:La/gst0;

    .line 56
    .line 57
    invoke-direct {v9, v10}, La/iqt;-><init>(La/gst0;)V

    .line 58
    .line 59
    .line 60
    iget-object v10, v1, La/ami;->j:La/nv20;

    .line 61
    .line 62
    iget-object v11, v1, La/ami;->k:La/nv20;

    .line 63
    .line 64
    iget-object v12, v1, La/ami;->l:La/grj;

    .line 65
    .line 66
    iget-object v13, v1, La/ami;->m:La/duj;

    .line 67
    .line 68
    iget-object v14, v1, La/ami;->n:La/m1e;

    .line 69
    .line 70
    iget-object v15, v1, La/ami;->o:La/mne;

    .line 71
    .line 72
    move-object/from16 v16, v0

    .line 73
    .line 74
    iget-object v0, v1, La/ami;->p:La/i1w0;

    .line 75
    .line 76
    move-object/from16 v17, v0

    .line 77
    .line 78
    iget-object v0, v1, La/ami;->q:La/ctf0;

    .line 79
    .line 80
    move-object/from16 v18, v0

    .line 81
    .line 82
    iget-object v0, v1, La/ami;->r:La/gle0;

    .line 83
    .line 84
    move-object/from16 v19, v0

    .line 85
    .line 86
    iget-object v0, v1, La/ami;->s:La/o24;

    .line 87
    .line 88
    iget-object v1, v1, La/ami;->t:La/bzt;

    .line 89
    .line 90
    move-object/from16 v20, v19

    .line 91
    .line 92
    move-object/from16 v19, v0

    .line 93
    .line 94
    move-object/from16 v0, v16

    .line 95
    .line 96
    move-object/from16 v16, v17

    .line 97
    .line 98
    move-object/from16 v17, v18

    .line 99
    .line 100
    move-object/from16 v18, v20

    .line 101
    .line 102
    move-object/from16 v20, v1

    .line 103
    .line 104
    move-object/from16 v1, p1

    .line 105
    .line 106
    invoke-direct/range {v0 .. v20}, La/kw50;-><init>(La/vzg0;La/rou;La/loc;La/kzt;La/twc;La/xnt;La/tzi;La/rek0;La/iqt;La/nv20;La/nv20;La/grj;La/duj;La/m1e;La/mne;La/i1w0;La/ctf0;La/gle0;La/o24;La/bzt;)V

    .line 107
    .line 108
    .line 109
    return-object v0
.end method
