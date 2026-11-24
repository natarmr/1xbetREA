.class public final La/yai;
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
    iput-object p1, p0, La/yai;->a:La/f7i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/ur10;

    .line 2
    .line 3
    iget-object p0, p0, La/yai;->a:La/f7i;

    .line 4
    .line 5
    iget-object p0, p0, La/f7i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/zai;

    .line 8
    .line 9
    iget-object v2, p0, La/zai;->a:La/ctf0;

    .line 10
    .line 11
    iget-object v3, p0, La/zai;->b:La/i1w0;

    .line 12
    .line 13
    iget-object v1, p0, La/zai;->c:La/cad;

    .line 14
    .line 15
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/psc;

    .line 18
    .line 19
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v5, La/j910;

    .line 27
    .line 28
    iget-object v1, p0, La/zai;->e:La/yo4;

    .line 29
    .line 30
    iget-object p0, p0, La/zai;->f:La/s64;

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    invoke-direct {v5, v1, p0, v6}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    move-object v1, p1

    .line 37
    invoke-direct/range {v0 .. v5}, La/ur10;-><init>(La/vzg0;La/ctf0;La/i1w0;La/mne;La/j910;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
