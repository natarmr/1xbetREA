.class public final La/jsi;
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
    iput-object p1, p0, La/jsi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/k4g0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/jsi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/ksi;

    .line 10
    .line 11
    iget-object v2, v1, La/ksi;->a:La/pru;

    .line 12
    .line 13
    iget-object v3, v1, La/ksi;->b:La/bwl;

    .line 14
    .line 15
    iget-object v3, v3, La/bwl;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/dbi;

    .line 18
    .line 19
    invoke-virtual {v3}, La/dbi;->n()La/g2g0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, v1, La/ksi;->c:La/reu;

    .line 24
    .line 25
    new-instance v5, La/owp0;

    .line 26
    .line 27
    iget-object v6, v1, La/ksi;->d:La/cyu;

    .line 28
    .line 29
    const/16 v7, 0xa

    .line 30
    .line 31
    invoke-direct {v5, v6, v7}, La/owp0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance v6, La/p4u;

    .line 35
    .line 36
    new-instance v7, La/nw20;

    .line 37
    .line 38
    new-instance v8, La/ljf0;

    .line 39
    .line 40
    iget-object v9, v1, La/ksi;->e:La/gii0;

    .line 41
    .line 42
    const/4 v10, 0x3

    .line 43
    invoke-direct {v8, v9, v10}, La/ljf0;-><init>(La/gii0;B)V

    .line 44
    .line 45
    .line 46
    iget-object v9, v1, La/ksi;->p:La/n5d0;

    .line 47
    .line 48
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    check-cast v9, La/o8g0;

    .line 53
    .line 54
    iget-object v10, v1, La/ksi;->f:La/knf0;

    .line 55
    .line 56
    invoke-direct {v7, v8, v9, v10}, La/nw20;-><init>(La/ljf0;La/o8g0;La/knf0;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v6, v7}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v7, v1, La/ksi;->g:La/iip;

    .line 63
    .line 64
    invoke-interface {v7}, La/iip;->x()La/j3c;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v8, v1, La/ksi;->h:La/ugf0;

    .line 72
    .line 73
    iget-object v8, v8, La/ugf0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v8, La/daf;

    .line 76
    .line 77
    invoke-virtual {v8}, La/daf;->w()La/luu;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v9, v1, La/ksi;->i:La/ctf0;

    .line 85
    .line 86
    iget-object v10, v1, La/ksi;->j:La/s31;

    .line 87
    .line 88
    iget-object v11, v1, La/ksi;->k:La/cyu;

    .line 89
    .line 90
    iget-object v12, v1, La/ksi;->l:La/mne;

    .line 91
    .line 92
    iget-object v13, v1, La/ksi;->m:La/m1e;

    .line 93
    .line 94
    iget-object v14, v1, La/ksi;->n:La/bzt;

    .line 95
    .line 96
    iget-object v1, v1, La/ksi;->o:La/epi0;

    .line 97
    .line 98
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, La/xzp;

    .line 101
    .line 102
    invoke-virtual {v1}, La/xzp;->C()La/r9u;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    move-object/from16 v1, p1

    .line 107
    .line 108
    invoke-direct/range {v0 .. v15}, La/k4g0;-><init>(La/vzg0;La/pru;La/g2g0;La/reu;La/owp0;La/p4u;La/j3c;La/luu;La/ctf0;La/s31;La/cyu;La/mne;La/m1e;La/bzt;La/r9u;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method
