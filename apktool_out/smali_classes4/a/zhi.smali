.class public final La/zhi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/ugi;


# direct methods
.method public constructor <init>(La/ugi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zhi;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 17

    .line 1
    new-instance v0, La/gfp;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/zhi;->a:La/ugi;

    .line 6
    .line 7
    iget-object v1, v1, La/ugi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/aii;

    .line 10
    .line 11
    new-instance v2, La/nw20;

    .line 12
    .line 13
    iget-object v3, v1, La/aii;->b:La/ali;

    .line 14
    .line 15
    new-instance v4, La/ort;

    .line 16
    .line 17
    iget-object v5, v1, La/aii;->c:La/gst0;

    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    invoke-direct {v4, v5, v6}, La/ort;-><init>(La/gst0;B)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, La/nw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v1, La/aii;->d:La/lbu;

    .line 27
    .line 28
    iget-object v4, v1, La/aii;->e:La/iqt;

    .line 29
    .line 30
    iget-object v5, v1, La/aii;->f:La/ctf0;

    .line 31
    .line 32
    iget-object v6, v1, La/aii;->g:La/mne;

    .line 33
    .line 34
    iget-object v7, v1, La/aii;->h:La/d1p;

    .line 35
    .line 36
    move-object v8, v7

    .line 37
    invoke-interface {v8}, La/d1p;->P0()La/gw60;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget-object v9, v1, La/aii;->a:La/bw60;

    .line 42
    .line 43
    invoke-interface {v9}, La/bw60;->a()La/nn60;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v10, v8

    .line 51
    move-object v8, v9

    .line 52
    iget-object v9, v1, La/aii;->i:La/m1e;

    .line 53
    .line 54
    move-object v11, v10

    .line 55
    iget-object v10, v1, La/aii;->j:La/g2v;

    .line 56
    .line 57
    move-object v12, v11

    .line 58
    iget-object v11, v1, La/aii;->k:La/kqc;

    .line 59
    .line 60
    move-object v13, v12

    .line 61
    iget-object v12, v1, La/aii;->l:La/oct;

    .line 62
    .line 63
    move-object v14, v13

    .line 64
    new-instance v13, La/kc60;

    .line 65
    .line 66
    iget-object v15, v1, La/aii;->c:La/gst0;

    .line 67
    .line 68
    invoke-direct {v13, v15}, La/kc60;-><init>(La/gst0;)V

    .line 69
    .line 70
    .line 71
    move-object v15, v14

    .line 72
    iget-object v14, v1, La/aii;->m:La/s31;

    .line 73
    .line 74
    invoke-interface {v15}, La/d1p;->e()La/gg5;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    iget-object v1, v1, La/aii;->n:La/i1w0;

    .line 79
    .line 80
    move-object/from16 v16, v1

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    invoke-direct/range {v0 .. v16}, La/gfp;-><init>(La/vzg0;La/nw20;La/lbu;La/iqt;La/ctf0;La/mne;La/gw60;La/nn60;La/m1e;La/g2v;La/kqc;La/oct;La/kc60;La/s31;La/gg5;La/i1w0;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
