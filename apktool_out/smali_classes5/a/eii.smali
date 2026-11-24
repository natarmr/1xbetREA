.class public final La/eii;
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
    iput-object p1, p0, La/eii;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 6

    .line 1
    new-instance v0, La/cgt;

    .line 2
    .line 3
    iget-object p0, p0, La/eii;->a:La/ugi;

    .line 4
    .line 5
    iget-object p0, p0, La/ugi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/fii;

    .line 8
    .line 9
    iget-object p1, p0, La/fii;->a:La/yft;

    .line 10
    .line 11
    iget-object v1, p0, La/fii;->b:La/mne;

    .line 12
    .line 13
    iget-object p0, p0, La/fii;->c:La/ctf0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, La/jcs;

    .line 19
    .line 20
    const/16 v3, 0x11

    .line 21
    .line 22
    invoke-direct {v2, p1, v3}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v3, La/bcn;

    .line 26
    .line 27
    const/16 p1, 0x12

    .line 28
    .line 29
    invoke-direct {v3, p0, p1}, La/bcn;-><init>(La/ctf0;B)V

    .line 30
    .line 31
    .line 32
    iget-object p0, v1, La/mne;->c:La/vs10;

    .line 33
    .line 34
    iget-object p1, v1, La/mne;->a:La/rwj;

    .line 35
    .line 36
    invoke-static {p0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
