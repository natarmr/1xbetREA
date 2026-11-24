.class public final La/coi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/eni;


# direct methods
.method public constructor <init>(La/eni;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/coi;->a:La/eni;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/u3a0;

    .line 2
    .line 3
    iget-object p0, p0, La/coi;->a:La/eni;

    .line 4
    .line 5
    iget-object p0, p0, La/eni;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/doi;

    .line 8
    .line 9
    iget-object v9, p0, La/doi;->f:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v5, La/ivn;

    .line 12
    .line 13
    new-instance v1, La/nr;

    .line 14
    .line 15
    new-instance v2, La/cad;

    .line 16
    .line 17
    iget-object v3, p0, La/doi;->h:La/gii0;

    .line 18
    .line 19
    const/16 v4, 0x11

    .line 20
    .line 21
    invoke-direct {v2, v3, v4}, La/cad;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, La/doi;->i:La/knf0;

    .line 25
    .line 26
    iget-object v4, p0, La/doi;->g:La/cad;

    .line 27
    .line 28
    iget-object v4, v4, La/cad;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, La/psc;

    .line 31
    .line 32
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v2, v3, v4}, La/nr;-><init>(La/cad;La/knf0;La/mne;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v5, v1}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v8, p0, La/doi;->c:La/i1w0;

    .line 46
    .line 47
    iget-object v3, p0, La/doi;->a:La/duj;

    .line 48
    .line 49
    iget-object v1, p0, La/doi;->b:La/m1e;

    .line 50
    .line 51
    iget-object v2, p0, La/doi;->g:La/cad;

    .line 52
    .line 53
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, La/psc;

    .line 56
    .line 57
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v4, p0, La/doi;->d:La/ocl;

    .line 65
    .line 66
    iget-object v6, p0, La/doi;->e:La/ctf0;

    .line 67
    .line 68
    move-object v7, p1

    .line 69
    invoke-direct/range {v0 .. v9}, La/u3a0;-><init>(La/m1e;La/mne;La/duj;La/ocl;La/ivn;La/ctf0;La/vzg0;La/i1w0;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method
