.class public final La/xni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/omi;


# direct methods
.method public constructor <init>(La/omi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xni;->a:La/omi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/xrb;

    .line 2
    .line 3
    iget-object p0, p0, La/xni;->a:La/omi;

    .line 4
    .line 5
    iget-object p0, p0, La/omi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/zni;

    .line 8
    .line 9
    iget-object v1, p0, La/zni;->d:La/y58;

    .line 10
    .line 11
    invoke-interface {v1}, La/y58;->g()La/myg0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/zni;->a:La/cad;

    .line 19
    .line 20
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, La/psc;

    .line 23
    .line 24
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, La/zni;->d:La/y58;

    .line 32
    .line 33
    invoke-interface {v1}, La/y58;->m()La/krc;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v5, p0, La/zni;->c:La/zg;

    .line 41
    .line 42
    iget-object v1, p0, La/zni;->g:La/d1p;

    .line 43
    .line 44
    invoke-interface {v1}, La/d1p;->t()La/au0;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget-object v7, p0, La/zni;->f:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v8, p0, La/zni;->e:La/i1w0;

    .line 51
    .line 52
    iget-object v9, p0, La/zni;->i:La/ctf0;

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    invoke-direct/range {v0 .. v9}, La/xrb;-><init>(La/vzg0;La/myg0;La/mne;La/krc;La/zg;La/au0;Ljava/lang/String;La/i1w0;La/ctf0;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
