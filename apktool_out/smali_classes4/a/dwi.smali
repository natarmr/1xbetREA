.class public final La/dwi;
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
    iput-object p1, p0, La/dwi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/pyo0;

    .line 2
    .line 3
    iget-object p0, p0, La/dwi;->a:La/psi;

    .line 4
    .line 5
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gwi;

    .line 8
    .line 9
    iget-object v2, p0, La/gwi;->a:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 10
    .line 11
    iget-object v3, p0, La/gwi;->b:La/i1w0;

    .line 12
    .line 13
    iget-object v1, p0, La/gwi;->c:La/iip;

    .line 14
    .line 15
    invoke-interface {v1}, La/iip;->l()La/fck0;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/gwi;->d:La/bwl;

    .line 23
    .line 24
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/dbi;

    .line 27
    .line 28
    invoke-virtual {v1}, La/dbi;->B()La/hcp0;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p0, La/gwi;->e:La/pru;

    .line 33
    .line 34
    iget-object v1, p0, La/gwi;->f:La/a1d;

    .line 35
    .line 36
    iget-object v7, v1, La/a1d;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v7, La/qv2;

    .line 39
    .line 40
    invoke-virtual {v7}, La/qv2;->q()La/n4u;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v1, v1, La/a1d;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, La/qv2;

    .line 47
    .line 48
    invoke-virtual {v1}, La/qv2;->r()La/j9u;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iget-object v1, p0, La/gwi;->c:La/iip;

    .line 53
    .line 54
    invoke-interface {v1}, La/iip;->K()La/yfu;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v10, p0, La/gwi;->g:La/duj;

    .line 62
    .line 63
    iget-object v11, p0, La/gwi;->h:La/mne;

    .line 64
    .line 65
    iget-object v12, p0, La/gwi;->i:La/ctf0;

    .line 66
    .line 67
    move-object v1, p1

    .line 68
    invoke-direct/range {v0 .. v12}, La/pyo0;-><init>(La/vzg0;Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;La/i1w0;La/fck0;La/hcp0;La/pru;La/n4u;La/j9u;La/yfu;La/duj;La/mne;La/ctf0;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method
