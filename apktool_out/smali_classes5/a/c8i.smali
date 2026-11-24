.class public final La/c8i;
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
    iput-object p1, p0, La/c8i;->a:La/f7i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/hd2;

    .line 2
    .line 3
    iget-object p0, p0, La/c8i;->a:La/f7i;

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
    new-instance v3, La/nvu;

    .line 12
    .line 13
    new-instance v2, La/j910;

    .line 14
    .line 15
    new-instance v4, La/eyg0;

    .line 16
    .line 17
    iget-object v5, p0, La/e8i;->b:La/gii0;

    .line 18
    .line 19
    const/16 v6, 0x16

    .line 20
    .line 21
    invoke-direct {v4, v5, v6}, La/eyg0;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, La/e8i;->c:La/knf0;

    .line 25
    .line 26
    invoke-direct {v2, v4, v5}, La/j910;-><init>(La/eyg0;La/knf0;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, La/e8i;->d:La/sjl0;

    .line 30
    .line 31
    iget-object v5, p0, La/e8i;->e:La/esg0;

    .line 32
    .line 33
    iget-object v5, v5, La/esg0;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, La/rou;

    .line 36
    .line 37
    invoke-direct {v3, v2, v4, v5}, La/nvu;-><init>(La/j910;La/sjl0;La/rou;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, La/e8i;->e:La/esg0;

    .line 41
    .line 42
    iget-object v4, v2, La/esg0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, La/g2v;

    .line 45
    .line 46
    iget-object v5, p0, La/e8i;->f:La/i1w0;

    .line 47
    .line 48
    new-instance v6, La/gle0;

    .line 49
    .line 50
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v7, v2, La/esg0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, La/ctf0;

    .line 56
    .line 57
    invoke-static {v7}, La/x1x;->y(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v8, v2, La/esg0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, La/duj;

    .line 63
    .line 64
    iget-object v2, v2, La/esg0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v9, v2

    .line 67
    check-cast v9, La/m1e;

    .line 68
    .line 69
    invoke-static {v9}, La/x1x;->y(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v10, p0, La/e8i;->g:La/pru;

    .line 73
    .line 74
    new-instance v11, La/xfu;

    .line 75
    .line 76
    iget-object p0, p0, La/e8i;->h:La/sx40;

    .line 77
    .line 78
    invoke-direct {v11, p0}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v12, La/eyg0;

    .line 82
    .line 83
    const/16 v2, 0xe

    .line 84
    .line 85
    invoke-direct {v12, p0, v2}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    move-object v2, p1

    .line 89
    invoke-direct/range {v0 .. v12}, La/hd2;-><init>(La/mne;La/vzg0;La/nvu;La/g2v;La/i1w0;La/gle0;La/ctf0;La/duj;La/m1e;La/pru;La/xfu;La/eyg0;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method
