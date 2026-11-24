.class public final La/kpi;
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
    iput-object p1, p0, La/kpi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/kpi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/mpi;

    .line 10
    .line 11
    new-instance v2, La/bzt;

    .line 12
    .line 13
    iget-object v3, v1, La/mpi;->a:La/fsd;

    .line 14
    .line 15
    invoke-direct {v2, v3}, La/bzt;-><init>(La/fsd;)V

    .line 16
    .line 17
    .line 18
    move-object v3, v2

    .line 19
    iget-object v2, v1, La/mpi;->b:La/pru;

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    new-instance v3, La/rou;

    .line 23
    .line 24
    iget-object v5, v1, La/mpi;->c:La/b3c0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-direct {v3, v5, v6}, La/rou;-><init>(La/b3c0;B)V

    .line 28
    .line 29
    .line 30
    move-object v5, v4

    .line 31
    invoke-virtual {v1}, La/mpi;->a()La/iqi;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v6, v5

    .line 36
    iget-object v5, v1, La/mpi;->g:La/duj;

    .line 37
    .line 38
    move-object v7, v6

    .line 39
    iget-object v6, v1, La/mpi;->h:La/i1w0;

    .line 40
    .line 41
    move-object v8, v7

    .line 42
    iget-object v7, v1, La/mpi;->i:La/mne;

    .line 43
    .line 44
    move-object v9, v8

    .line 45
    iget-object v8, v1, La/mpi;->j:Ljava/lang/String;

    .line 46
    .line 47
    move-object v10, v9

    .line 48
    iget-object v9, v1, La/mpi;->k:La/zg;

    .line 49
    .line 50
    move-object v11, v10

    .line 51
    iget-object v10, v1, La/mpi;->l:La/au0;

    .line 52
    .line 53
    new-instance v12, La/xzb0;

    .line 54
    .line 55
    invoke-direct {v12, v2}, La/xzb0;-><init>(La/pru;)V

    .line 56
    .line 57
    .line 58
    new-instance v13, La/nqs;

    .line 59
    .line 60
    iget-object v14, v1, La/mpi;->m:La/z4w0;

    .line 61
    .line 62
    iget-object v15, v1, La/mpi;->n:La/cyh;

    .line 63
    .line 64
    iget-object v1, v1, La/mpi;->o:La/ort;

    .line 65
    .line 66
    invoke-direct {v13, v14, v15, v1}, La/nqs;-><init>(La/z4w0;La/cyh;La/ort;)V

    .line 67
    .line 68
    .line 69
    move-object v1, v11

    .line 70
    move-object/from16 v11, p1

    .line 71
    .line 72
    invoke-direct/range {v0 .. v13}, Lorg/xplatform/personal/impl/presentation/edit/n;-><init>(La/bzt;La/pru;La/rou;La/iqi;La/duj;La/i1w0;La/mne;Ljava/lang/String;La/zg;La/au0;La/vzg0;La/xzb0;La/nqs;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
