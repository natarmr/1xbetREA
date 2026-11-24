.class public final La/mii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/ugi;


# direct methods
.method public constructor <init>(La/ugi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mii;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 12

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/xkv;

    .line 5
    .line 6
    iget-object p0, p0, La/mii;->a:La/ugi;

    .line 7
    .line 8
    iget-object p0, p0, La/ugi;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/xzp;

    .line 11
    .line 12
    iget-object p1, p0, La/xzp;->a:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v2, p1

    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    new-instance v3, La/brt;

    .line 18
    .line 19
    iget-object p1, p0, La/xzp;->b:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, La/pru;

    .line 23
    .line 24
    invoke-direct {v3, v4}, La/brt;-><init>(La/pru;)V

    .line 25
    .line 26
    .line 27
    new-instance v5, La/oeu;

    .line 28
    .line 29
    invoke-virtual {p0}, La/xzp;->L()La/reu;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v5, p1}, La/oeu;-><init>(La/reu;)V

    .line 34
    .line 35
    .line 36
    new-instance v6, La/oeu;

    .line 37
    .line 38
    invoke-virtual {p0}, La/xzp;->L()La/reu;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v6, p1}, La/oeu;-><init>(La/reu;)V

    .line 43
    .line 44
    .line 45
    new-instance v7, La/pmi0;

    .line 46
    .line 47
    invoke-virtual {p0}, La/xzp;->L()La/reu;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v7, p1}, La/pmi0;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v8, La/xfu;

    .line 55
    .line 56
    invoke-virtual {p0}, La/xzp;->L()La/reu;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v8, p1}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, La/xzp;->d:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v9, p1

    .line 66
    check-cast v9, La/ctf0;

    .line 67
    .line 68
    iget-object p1, p0, La/xzp;->e:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v10, p1

    .line 71
    check-cast v10, La/zg;

    .line 72
    .line 73
    iget-object p0, p0, La/xzp;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/d1p;

    .line 76
    .line 77
    invoke-interface {p0}, La/d1p;->I0()La/ix0;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    invoke-direct/range {v0 .. v11}, La/xkv;-><init>(La/i1w0;Ljava/lang/String;La/brt;La/pru;La/oeu;La/oeu;La/pmi0;La/xfu;La/ctf0;La/zg;La/ix0;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method
