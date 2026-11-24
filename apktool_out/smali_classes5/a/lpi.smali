.class public final La/lpi;
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
    iput-object p1, p0, La/lpi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 17

    .line 1
    new-instance v0, La/b2c0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/lpi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/mpi;

    .line 10
    .line 11
    new-instance v2, La/rou;

    .line 12
    .line 13
    iget-object v3, v1, La/mpi;->c:La/b3c0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, v3, v4}, La/rou;-><init>(La/b3c0;B)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, La/mpi;->b:La/pru;

    .line 20
    .line 21
    iget-object v4, v1, La/mpi;->g:La/duj;

    .line 22
    .line 23
    iget-object v5, v1, La/mpi;->i:La/mne;

    .line 24
    .line 25
    iget-object v6, v1, La/mpi;->h:La/i1w0;

    .line 26
    .line 27
    iget-object v7, v1, La/mpi;->p:La/ctf0;

    .line 28
    .line 29
    iget-object v8, v1, La/mpi;->q:La/pp90;

    .line 30
    .line 31
    invoke-interface {v8}, La/pp90;->c()La/w4p0;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v9, v1, La/mpi;->r:La/mi70;

    .line 39
    .line 40
    invoke-virtual {v1}, La/mpi;->a()La/iqi;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    iget-object v11, v1, La/mpi;->s:La/x1u;

    .line 45
    .line 46
    iget-object v12, v1, La/mpi;->n:La/cyh;

    .line 47
    .line 48
    iget-object v13, v1, La/mpi;->m:La/z4w0;

    .line 49
    .line 50
    new-instance v14, La/eyg0;

    .line 51
    .line 52
    new-instance v15, La/yzn0;

    .line 53
    .line 54
    move-object/from16 v16, v0

    .line 55
    .line 56
    new-instance v0, La/prc;

    .line 57
    .line 58
    move-object/from16 p0, v2

    .line 59
    .line 60
    iget-object v2, v1, La/mpi;->f:La/gii0;

    .line 61
    .line 62
    invoke-direct {v0, v2}, La/prc;-><init>(La/gii0;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v1, La/mpi;->e:La/btt0;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, v15, La/yzn0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, v15, La/yzn0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    const/4 v0, 0x5

    .line 78
    invoke-direct {v14, v15, v0}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    move-object/from16 v2, p0

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    move-object/from16 v0, v16

    .line 86
    .line 87
    invoke-direct/range {v0 .. v14}, La/b2c0;-><init>(La/vzg0;La/rou;La/pru;La/duj;La/mne;La/i1w0;La/ctf0;La/w4p0;La/mi70;La/iqi;La/x1u;La/cyh;La/z4w0;La/eyg0;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method
