.class public final La/zui;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rti;


# direct methods
.method public constructor <init>(La/rti;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zui;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 12

    .line 1
    new-instance v0, La/dzm0;

    .line 2
    .line 3
    iget-object p0, p0, La/zui;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/g45;

    .line 8
    .line 9
    iget-object v1, p0, La/g45;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;

    .line 13
    .line 14
    iget-object v1, p0, La/g45;->b:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v1

    .line 17
    check-cast v3, La/i1w0;

    .line 18
    .line 19
    iget-object v1, p0, La/g45;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/pcl0;

    .line 22
    .line 23
    invoke-interface {v1}, La/pcl0;->c()La/reu;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, La/g45;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La/pcl0;

    .line 33
    .line 34
    invoke-interface {v1}, La/pcl0;->a()La/rbu;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {v1}, La/pcl0;->t()La/s1u;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, La/pcl0;->x()La/s1u;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, La/g45;->d:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v8, v1

    .line 55
    check-cast v8, La/evz;

    .line 56
    .line 57
    iget-object v1, p0, La/g45;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, La/cad;

    .line 60
    .line 61
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, La/psc;

    .line 64
    .line 65
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v10, La/vmr;

    .line 73
    .line 74
    iget-object v1, p0, La/g45;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/bn6;

    .line 77
    .line 78
    iget-object v11, p0, La/g45;->g:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v11, La/d1p;

    .line 81
    .line 82
    invoke-interface {v11}, La/d1p;->n0()La/je;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-direct {v10, v1, v11}, La/vmr;-><init>(La/bn6;La/je;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/g45;->h:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v11, p0

    .line 92
    check-cast v11, La/ctf0;

    .line 93
    .line 94
    move-object v1, p1

    .line 95
    invoke-direct/range {v0 .. v11}, La/dzm0;-><init>(La/vzg0;Lorg/xplatform/sportgame/subgames/api/SubGamesParams;La/i1w0;La/reu;La/rbu;La/s1u;La/s1u;La/evz;La/mne;La/vmr;La/ctf0;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method
