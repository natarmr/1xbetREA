.class public final La/aoi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/aoi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 8

    .line 1
    new-instance v0, La/nz90;

    .line 2
    .line 3
    iget-object p0, p0, La/aoi;->a:La/gji;

    .line 4
    .line 5
    iget-object p0, p0, La/gji;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ru;

    .line 8
    .line 9
    new-instance v2, La/svu;

    .line 10
    .line 11
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/n5d0;

    .line 14
    .line 15
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/kz90;

    .line 20
    .line 21
    invoke-direct {v2, v1}, La/svu;-><init>(La/kz90;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La/ru;->h:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, v1

    .line 27
    check-cast v3, La/m1e;

    .line 28
    .line 29
    iget-object v1, p0, La/ru;->e:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, v1

    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p0, La/ru;->f:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, v1

    .line 37
    check-cast v5, La/i1w0;

    .line 38
    .line 39
    iget-object v1, p0, La/ru;->g:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    check-cast v6, La/ocl;

    .line 43
    .line 44
    iget-object p0, p0, La/ru;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, La/cad;

    .line 47
    .line 48
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La/psc;

    .line 51
    .line 52
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v1, p1

    .line 60
    invoke-direct/range {v0 .. v7}, La/nz90;-><init>(La/vzg0;La/svu;La/m1e;Ljava/lang/String;La/i1w0;La/ocl;La/mne;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
