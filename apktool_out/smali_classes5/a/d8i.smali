.class public final La/d8i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/f7i;


# direct methods
.method public constructor <init>(La/f7i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d8i;->a:La/f7i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/zb2;

    .line 2
    .line 3
    iget-object p0, p0, La/d8i;->a:La/f7i;

    .line 4
    .line 5
    iget-object p0, p0, La/f7i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/e8i;

    .line 8
    .line 9
    iget-object v1, p0, La/e8i;->a:La/mne;

    .line 10
    .line 11
    new-instance v3, La/hru;

    .line 12
    .line 13
    new-instance v2, La/nv20;

    .line 14
    .line 15
    iget-object v4, p0, La/e8i;->i:La/u5g0;

    .line 16
    .line 17
    invoke-direct {v2, v4}, La/nv20;-><init>(La/u5g0;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v2}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, La/zpu;

    .line 24
    .line 25
    new-instance v2, La/j910;

    .line 26
    .line 27
    new-instance v5, La/eyg0;

    .line 28
    .line 29
    iget-object v6, p0, La/e8i;->b:La/gii0;

    .line 30
    .line 31
    const/16 v7, 0x16

    .line 32
    .line 33
    invoke-direct {v5, v6, v7}, La/eyg0;-><init>(La/gii0;B)V

    .line 34
    .line 35
    .line 36
    iget-object v6, p0, La/e8i;->c:La/knf0;

    .line 37
    .line 38
    invoke-direct {v2, v5, v6}, La/j910;-><init>(La/eyg0;La/knf0;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, La/nv20;

    .line 42
    .line 43
    iget-object v6, p0, La/e8i;->i:La/u5g0;

    .line 44
    .line 45
    invoke-direct {v5, v6}, La/nv20;-><init>(La/u5g0;)V

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    invoke-direct {v4, v2, v5, v6}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, La/e8i;->e:La/esg0;

    .line 53
    .line 54
    iget-object v5, v2, La/esg0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, La/g2v;

    .line 57
    .line 58
    iget-object v6, p0, La/e8i;->f:La/i1w0;

    .line 59
    .line 60
    new-instance v7, La/gle0;

    .line 61
    .line 62
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v8, v2, La/esg0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, La/ctf0;

    .line 68
    .line 69
    invoke-static {v8}, La/x1x;->y(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v9, v2, La/esg0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, La/duj;

    .line 75
    .line 76
    iget-object v2, v2, La/esg0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v10, v2

    .line 79
    check-cast v10, La/m1e;

    .line 80
    .line 81
    invoke-static {v10}, La/x1x;->y(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v11, p0, La/e8i;->g:La/pru;

    .line 85
    .line 86
    new-instance v12, La/eyg0;

    .line 87
    .line 88
    iget-object p0, p0, La/e8i;->h:La/sx40;

    .line 89
    .line 90
    const/16 v2, 0xe

    .line 91
    .line 92
    invoke-direct {v12, p0, v2}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    move-object v2, p1

    .line 96
    invoke-direct/range {v0 .. v12}, La/zb2;-><init>(La/mne;La/vzg0;La/hru;La/zpu;La/g2v;La/i1w0;La/gle0;La/ctf0;La/duj;La/m1e;La/pru;La/eyg0;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method
