.class public final La/xti;
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
    iput-object p1, p0, La/xti;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 14

    .line 1
    new-instance v0, La/bmj0;

    .line 2
    .line 3
    iget-object p0, p0, La/xti;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/yti;

    .line 8
    .line 9
    iget-object v2, p0, La/yti;->a:La/ctf0;

    .line 10
    .line 11
    iget-object v3, p0, La/yti;->b:La/ocl;

    .line 12
    .line 13
    new-instance v4, La/tpt;

    .line 14
    .line 15
    iget-object v1, p0, La/yti;->c:La/dpi0;

    .line 16
    .line 17
    iget-object v1, v1, La/dpi0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/wti;

    .line 20
    .line 21
    new-instance v5, La/j910;

    .line 22
    .line 23
    new-instance v6, La/pmi0;

    .line 24
    .line 25
    iget-object v7, v1, La/wti;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, La/gii0;

    .line 28
    .line 29
    const/16 v8, 0x10

    .line 30
    .line 31
    invoke-direct {v6, v7, v8}, La/pmi0;-><init>(La/gii0;B)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v1, La/wti;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/knf0;

    .line 37
    .line 38
    invoke-direct {v5, v1, v6}, La/j910;-><init>(La/knf0;La/pmi0;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v5}, La/tpt;-><init>(La/j910;)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, La/yti;->d:La/i1w0;

    .line 45
    .line 46
    iget-object v1, p0, La/yti;->e:La/cad;

    .line 47
    .line 48
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, La/psc;

    .line 51
    .line 52
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, La/mzt;

    .line 60
    .line 61
    iget-object v1, p0, La/yti;->f:La/peg0;

    .line 62
    .line 63
    invoke-direct {v7, v1}, La/mzt;-><init>(La/peg0;)V

    .line 64
    .line 65
    .line 66
    iget-object v8, p0, La/yti;->g:La/qu;

    .line 67
    .line 68
    iget-object v9, p0, La/yti;->h:La/s64;

    .line 69
    .line 70
    iget-object v10, p0, La/yti;->i:La/m1e;

    .line 71
    .line 72
    iget-object v1, p0, La/yti;->j:La/iw20;

    .line 73
    .line 74
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/uii;

    .line 77
    .line 78
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    iget-object v12, p0, La/yti;->k:La/wyu;

    .line 83
    .line 84
    iget-object v13, p0, La/yti;->l:La/kl5;

    .line 85
    .line 86
    move-object v1, p1

    .line 87
    invoke-direct/range {v0 .. v13}, La/bmj0;-><init>(La/vzg0;La/ctf0;La/ocl;La/tpt;La/i1w0;La/mne;La/mzt;La/qu;La/s64;La/m1e;La/pru;La/wyu;La/kl5;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method
