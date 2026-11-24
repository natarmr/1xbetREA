.class public final La/asi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j0h0;


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
    iput-object p1, p0, La/asi;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;La/i1w0;)La/diu0;
    .locals 18

    .line 1
    new-instance v0, La/sxf0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/asi;->a:La/fri;

    .line 6
    .line 7
    iget-object v1, v1, La/fri;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/bsi;

    .line 10
    .line 11
    iget-object v3, v1, La/bsi;->c:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v4, La/xzb;

    .line 14
    .line 15
    iget-object v2, v1, La/bsi;->d:La/lef0;

    .line 16
    .line 17
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La/gbi;

    .line 20
    .line 21
    invoke-virtual {v2}, La/gbi;->L()La/kd30;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v5, v1, La/bsi;->e:La/gst0;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-direct {v4, v2, v5, v6}, La/xzb;-><init>(La/kd30;La/gst0;B)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v1, La/bsi;->d:La/lef0;

    .line 32
    .line 33
    iget-object v5, v2, La/lef0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, La/gbi;

    .line 36
    .line 37
    invoke-virtual {v5}, La/gbi;->h()La/ocl;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v6, v2, La/lef0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v6, La/gbi;

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    new-instance v6, La/ljf0;

    .line 47
    .line 48
    invoke-virtual {v7}, La/gbi;->G()La/n660;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-direct {v6, v7}, La/ljf0;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v7, v1, La/bsi;->f:La/cyh;

    .line 56
    .line 57
    iget-object v8, v1, La/bsi;->g:La/z4w0;

    .line 58
    .line 59
    iget-object v9, v1, La/bsi;->h:La/rjo;

    .line 60
    .line 61
    iget-object v10, v1, La/bsi;->i:La/s31;

    .line 62
    .line 63
    iget-object v11, v1, La/bsi;->j:La/cad;

    .line 64
    .line 65
    iget-object v11, v11, La/cad;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v11, La/psc;

    .line 68
    .line 69
    invoke-virtual {v11}, La/psc;->h()La/mne;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v12, v1, La/bsi;->k:La/iqt;

    .line 77
    .line 78
    iget-object v13, v1, La/bsi;->l:La/rou;

    .line 79
    .line 80
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, La/gbi;

    .line 83
    .line 84
    invoke-virtual {v2}, La/gbi;->i()La/joc;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    iget-object v15, v1, La/bsi;->m:La/duj;

    .line 89
    .line 90
    iget-object v2, v1, La/bsi;->n:La/ctf0;

    .line 91
    .line 92
    iget-object v1, v1, La/bsi;->o:La/sek;

    .line 93
    .line 94
    move-object/from16 v17, v1

    .line 95
    .line 96
    move-object/from16 v16, v2

    .line 97
    .line 98
    move-object/from16 v1, p1

    .line 99
    .line 100
    move-object/from16 v2, p2

    .line 101
    .line 102
    invoke-direct/range {v0 .. v17}, La/sxf0;-><init>(La/vzg0;La/i1w0;Ljava/lang/String;La/xzb;La/ocl;La/ljf0;La/cyh;La/z4w0;La/rjo;La/s31;La/mne;La/iqt;La/rou;La/joc;La/duj;La/ctf0;La/sek;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method
