.class public final La/owi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/xvi;


# direct methods
.method public constructor <init>(La/xvi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/owi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 11

    .line 1
    new-instance v0, La/qnp0;

    .line 2
    .line 3
    iget-object p0, p0, La/owi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/pwi;

    .line 8
    .line 9
    iget-object v1, p0, La/pwi;->h:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    new-instance v3, La/xfu;

    .line 15
    .line 16
    new-instance v1, La/ywu;

    .line 17
    .line 18
    new-instance v4, La/afm0;

    .line 19
    .line 20
    iget-object v5, p0, La/pwi;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, La/gii0;

    .line 23
    .line 24
    const/4 v6, 0x5

    .line 25
    invoke-direct {v4, v5, v6}, La/afm0;-><init>(La/gii0;B)V

    .line 26
    .line 27
    .line 28
    iget-object v5, p0, La/pwi;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, La/cad;

    .line 31
    .line 32
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, La/psc;

    .line 35
    .line 36
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v6, p0, La/pwi;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, La/knf0;

    .line 46
    .line 47
    invoke-direct {v1, v4, v5, v6}, La/ywu;-><init>(La/afm0;La/mne;La/knf0;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, v1}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, La/pwi;->g:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v4, v1

    .line 56
    check-cast v4, La/m1e;

    .line 57
    .line 58
    iget-object v1, p0, La/pwi;->i:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v5, v1

    .line 61
    check-cast v5, La/ocl;

    .line 62
    .line 63
    iget-object v1, p0, La/pwi;->d:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v6, v1

    .line 66
    check-cast v6, La/duj;

    .line 67
    .line 68
    iget-object v1, p0, La/pwi;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, La/cad;

    .line 71
    .line 72
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/psc;

    .line 75
    .line 76
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, La/pwi;->a:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v8, v1

    .line 86
    check-cast v8, La/i1w0;

    .line 87
    .line 88
    iget-object v1, p0, La/pwi;->e:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v9, v1

    .line 91
    check-cast v9, La/ctf0;

    .line 92
    .line 93
    iget-object p0, p0, La/pwi;->j:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v10, p0

    .line 96
    check-cast v10, La/pru;

    .line 97
    .line 98
    move-object v1, p1

    .line 99
    invoke-direct/range {v0 .. v10}, La/qnp0;-><init>(La/vzg0;Ljava/lang/String;La/xfu;La/m1e;La/ocl;La/duj;La/mne;La/i1w0;La/ctf0;La/pru;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method
