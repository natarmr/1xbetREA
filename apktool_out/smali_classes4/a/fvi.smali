.class public final La/fvi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/psi;


# direct methods
.method public constructor <init>(La/psi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fvi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/ren0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/fvi;->a:La/psi;

    .line 6
    .line 7
    iget-object v1, v1, La/psi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/gvi;

    .line 10
    .line 11
    iget-object v2, v1, La/gvi;->e:La/i1w0;

    .line 12
    .line 13
    iget-object v3, v1, La/gvi;->y:La/g2v;

    .line 14
    .line 15
    new-instance v4, La/ouu;

    .line 16
    .line 17
    iget-object v5, v1, La/gvi;->g:La/iip;

    .line 18
    .line 19
    invoke-interface {v5}, La/iip;->m()La/pyu;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v7, v1, La/gvi;->B:La/a1d;

    .line 27
    .line 28
    iget-object v7, v7, La/a1d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, La/qv2;

    .line 31
    .line 32
    invoke-virtual {v7}, La/qv2;->r()La/j9u;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-interface {v5}, La/iip;->K()La/yfu;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    invoke-direct {v4, v6, v7, v5, v8}, La/ouu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    iget-object v5, v1, La/gvi;->g:La/iip;

    .line 48
    .line 49
    move-object v6, v5

    .line 50
    invoke-interface {v6}, La/iip;->P()La/oif0;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    iget-object v7, v1, La/gvi;->C:La/bwl;

    .line 55
    .line 56
    iget-object v7, v7, La/bwl;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, La/dbi;

    .line 59
    .line 60
    invoke-virtual {v7}, La/dbi;->B()La/hcp0;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-interface {v6}, La/iip;->y()La/ehf0;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v8, v1, La/gvi;->k:La/m1e;

    .line 72
    .line 73
    iget-object v9, v1, La/gvi;->v:La/duj;

    .line 74
    .line 75
    iget-object v10, v1, La/gvi;->c:La/mne;

    .line 76
    .line 77
    iget-object v11, v1, La/gvi;->z:La/xri;

    .line 78
    .line 79
    invoke-virtual {v11}, La/xri;->a()La/svu;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v12, v1, La/gvi;->j:La/pru;

    .line 87
    .line 88
    iget-object v13, v1, La/gvi;->D:La/kys0;

    .line 89
    .line 90
    iget-object v14, v1, La/gvi;->E:La/lk5;

    .line 91
    .line 92
    iget-object v15, v1, La/gvi;->F:La/bzt;

    .line 93
    .line 94
    move-object v1, v7

    .line 95
    move-object v7, v6

    .line 96
    move-object v6, v1

    .line 97
    move-object/from16 v1, p1

    .line 98
    .line 99
    invoke-direct/range {v0 .. v15}, La/ren0;-><init>(La/vzg0;La/i1w0;La/g2v;La/ouu;La/oif0;La/hcp0;La/ehf0;La/m1e;La/duj;La/mne;La/svu;La/pru;La/kys0;La/lk5;La/bzt;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method
