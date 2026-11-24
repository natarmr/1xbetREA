.class public final La/zxi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


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
    iput-object p1, p0, La/zxi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 10

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/f7j;

    .line 5
    .line 6
    iget-object p0, p0, La/zxi;->a:La/psi;

    .line 7
    .line 8
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/dyi;

    .line 11
    .line 12
    new-instance v1, La/bzu;

    .line 13
    .line 14
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 v2, 0x18

    .line 19
    .line 20
    invoke-direct {v1, p1, v2}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/abu;

    .line 24
    .line 25
    new-instance p1, La/hnu;

    .line 26
    .line 27
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {p1, v3}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, La/v4v;

    .line 35
    .line 36
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-direct {v3, v4}, La/v4v;-><init>(La/ali;)V

    .line 41
    .line 42
    .line 43
    const/16 v4, 0xc

    .line 44
    .line 45
    invoke-direct {v2, p1, v3, v4}, La/abu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance v3, La/yqc;

    .line 49
    .line 50
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/16 v4, 0x8

    .line 55
    .line 56
    invoke-direct {v3, p1, v4}, La/yqc;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/dyi;->a:La/g8i;

    .line 60
    .line 61
    invoke-virtual {p0}, La/g8i;->f5()La/ntu;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {p0}, La/g8i;->Y6()La/g2v;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {p0}, La/g8i;->d2()La/duj;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {p0}, La/g8i;->q1()La/m1e;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-direct/range {v0 .. v9}, La/f7j;-><init>(La/bzu;La/abu;La/yqc;La/ntu;La/i1w0;La/mne;La/g2v;La/duj;La/m1e;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
