.class public final La/gsi;
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
    iput-object p1, p0, La/gsi;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 11

    .line 1
    new-instance v0, La/of2;

    .line 2
    .line 3
    iget-object p0, p0, La/gsi;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/isi;

    .line 8
    .line 9
    iget-object v2, p0, La/isi;->a:La/i1w0;

    .line 10
    .line 11
    iget-object v3, p0, La/isi;->b:La/mne;

    .line 12
    .line 13
    iget-object v4, p0, La/isi;->c:La/ctf0;

    .line 14
    .line 15
    iget-object v1, p0, La/isi;->d:La/iw20;

    .line 16
    .line 17
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/uii;

    .line 20
    .line 21
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    new-instance v6, La/qrc;

    .line 26
    .line 27
    new-instance v1, La/nv20;

    .line 28
    .line 29
    iget-object v7, p0, La/isi;->e:La/u5g0;

    .line 30
    .line 31
    invoke-direct {v1, v7}, La/nv20;-><init>(La/u5g0;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v6, v1}, La/qrc;-><init>(La/nv20;)V

    .line 35
    .line 36
    .line 37
    move-object v1, v7

    .line 38
    new-instance v7, La/hru;

    .line 39
    .line 40
    new-instance v8, La/nv20;

    .line 41
    .line 42
    invoke-direct {v8, v1}, La/nv20;-><init>(La/u5g0;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v7, v8}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v8, La/qrc;

    .line 49
    .line 50
    new-instance v9, La/nv20;

    .line 51
    .line 52
    invoke-direct {v9, v1}, La/nv20;-><init>(La/u5g0;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v8, v9}, La/qrc;-><init>(La/nv20;)V

    .line 56
    .line 57
    .line 58
    new-instance v9, La/s31;

    .line 59
    .line 60
    iget-object v1, p0, La/isi;->f:La/kt2;

    .line 61
    .line 62
    const/4 v10, 0x6

    .line 63
    invoke-direct {v9, v1, v10}, La/s31;-><init>(La/kt2;B)V

    .line 64
    .line 65
    .line 66
    iget-object v10, p0, La/isi;->g:La/cyu;

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    invoke-direct/range {v0 .. v10}, La/of2;-><init>(La/vzg0;La/i1w0;La/mne;La/ctf0;La/pru;La/qrc;La/hru;La/qrc;La/s31;La/cyu;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method
