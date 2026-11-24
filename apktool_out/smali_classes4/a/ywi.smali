.class public final La/ywi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/xvi;


# direct methods
.method public constructor <init>(La/xvi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ywi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/ffc;

    .line 2
    .line 3
    iget-object p0, p0, La/ywi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/zwi;

    .line 8
    .line 9
    new-instance v2, La/atu;

    .line 10
    .line 11
    iget-object v1, p0, La/zwi;->a:La/g1q0;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v2, v1, v3}, La/atu;-><init>(La/g1q0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v3, La/ugf0;

    .line 18
    .line 19
    iget-object v1, p0, La/zwi;->a:La/g1q0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, v3, La/ugf0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v4, p0, La/zwi;->b:La/ctf0;

    .line 30
    .line 31
    iget-object v5, p0, La/zwi;->c:La/i1w0;

    .line 32
    .line 33
    iget-object v6, p0, La/zwi;->d:La/iqt;

    .line 34
    .line 35
    iget-object v7, p0, La/zwi;->e:La/pmi0;

    .line 36
    .line 37
    iget-object v8, p0, La/zwi;->f:La/mne;

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    invoke-direct/range {v0 .. v8}, La/ffc;-><init>(La/vzg0;La/atu;La/ugf0;La/ctf0;La/i1w0;La/iqt;La/pmi0;La/mne;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method
