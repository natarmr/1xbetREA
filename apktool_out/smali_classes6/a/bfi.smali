.class public final La/bfi;
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
    iput-object p1, p0, La/bfi;->a:La/f7i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/wxh;

    .line 2
    .line 3
    iget-object p0, p0, La/bfi;->a:La/f7i;

    .line 4
    .line 5
    iget-object p0, p0, La/f7i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/o3c;

    .line 8
    .line 9
    new-instance v5, La/ivn;

    .line 10
    .line 11
    iget-object v1, p0, La/o3c;->j:Ljava/lang/Object;

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
    check-cast v1, La/axh;

    .line 20
    .line 21
    invoke-direct {v5, v1}, La/ivn;-><init>(La/axh;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La/o3c;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/m1e;

    .line 27
    .line 28
    iget-object v2, p0, La/o3c;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, La/cad;

    .line 31
    .line 32
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/psc;

    .line 35
    .line 36
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, La/o3c;->f:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v8, v3

    .line 46
    check-cast v8, La/i1w0;

    .line 47
    .line 48
    iget-object v3, p0, La/o3c;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, La/duj;

    .line 51
    .line 52
    iget-object v4, p0, La/o3c;->h:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v9, v4

    .line 55
    check-cast v9, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, p0, La/o3c;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, La/ocl;

    .line 60
    .line 61
    iget-object p0, p0, La/o3c;->a:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v6, p0

    .line 64
    check-cast v6, La/ctf0;

    .line 65
    .line 66
    move-object v7, p1

    .line 67
    invoke-direct/range {v0 .. v9}, La/wxh;-><init>(La/m1e;La/mne;La/duj;La/ocl;La/ivn;La/ctf0;La/vzg0;La/i1w0;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method
