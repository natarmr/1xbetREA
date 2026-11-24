.class public final La/usi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/usi;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/qmh0;

    .line 2
    .line 3
    iget-object p0, p0, La/usi;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/vsi;

    .line 8
    .line 9
    iget-object v2, p0, La/vsi;->a:La/i1w0;

    .line 10
    .line 11
    iget-object v1, p0, La/vsi;->b:La/lef0;

    .line 12
    .line 13
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/gbi;

    .line 16
    .line 17
    new-instance v3, La/rsu;

    .line 18
    .line 19
    invoke-virtual {v1}, La/gbi;->J()La/n660;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v3, v1}, La/rsu;-><init>(La/n660;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/vsi;->b:La/lef0;

    .line 27
    .line 28
    iget-object v4, v1, La/lef0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, La/gbi;

    .line 31
    .line 32
    move-object v5, v4

    .line 33
    new-instance v4, La/dpi0;

    .line 34
    .line 35
    invoke-virtual {v5}, La/gbi;->J()La/n660;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-direct {v4, v5}, La/dpi0;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/gbi;

    .line 45
    .line 46
    new-instance v5, La/rsu;

    .line 47
    .line 48
    invoke-virtual {v1}, La/gbi;->J()La/n660;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v5, v1}, La/rsu;-><init>(La/n660;)V

    .line 53
    .line 54
    .line 55
    iget-object v6, p0, La/vsi;->c:La/qu;

    .line 56
    .line 57
    iget-object v1, p0, La/vsi;->d:La/d1p;

    .line 58
    .line 59
    invoke-interface {v1}, La/d1p;->a()La/s64;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    iget-object v8, p0, La/vsi;->e:La/m1e;

    .line 64
    .line 65
    iget-object v9, p0, La/vsi;->f:La/ctf0;

    .line 66
    .line 67
    iget-object v10, p0, La/vsi;->g:La/duj;

    .line 68
    .line 69
    iget-object v11, p0, La/vsi;->h:La/mne;

    .line 70
    .line 71
    iget-object v12, p0, La/vsi;->i:La/g2v;

    .line 72
    .line 73
    move-object v1, p1

    .line 74
    invoke-direct/range {v0 .. v12}, La/qmh0;-><init>(La/vzg0;La/i1w0;La/rsu;La/dpi0;La/rsu;La/qu;La/s64;La/m1e;La/ctf0;La/duj;La/mne;La/g2v;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method
