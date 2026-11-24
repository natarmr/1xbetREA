.class public final La/kii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


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
    iput-object p1, p0, La/kii;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 6

    .line 1
    new-instance v0, La/eiv;

    .line 2
    .line 3
    iget-object p0, p0, La/kii;->a:La/ugi;

    .line 4
    .line 5
    iget-object p0, p0, La/ugi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/lii;

    .line 8
    .line 9
    iget-object v2, p0, La/lii;->a:La/whv;

    .line 10
    .line 11
    iget-object v1, p0, La/lii;->b:La/cad;

    .line 12
    .line 13
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/psc;

    .line 16
    .line 17
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La/lii;->c:La/ozi;

    .line 25
    .line 26
    iget-object v1, v1, La/ozi;->w:La/n5d0;

    .line 27
    .line 28
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v4, v1

    .line 33
    check-cast v4, La/uvu;

    .line 34
    .line 35
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v5, p0, La/lii;->d:La/ctf0;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    invoke-direct/range {v0 .. v5}, La/eiv;-><init>(La/vzg0;La/whv;La/mne;La/uvu;La/ctf0;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
