.class public final La/enu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s0a;


# instance fields
.field public final a:La/s0a;

.field public final b:La/yo;

.field public final c:La/hnu0;

.field public final d:La/fnu0;


# direct methods
.method public constructor <init>(La/s0a;La/fnu0;La/b0l0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/enu0;->a:La/s0a;

    .line 5
    .line 6
    iput-object p2, p0, La/enu0;->d:La/fnu0;

    .line 7
    .line 8
    new-instance p2, La/yo;

    .line 9
    .line 10
    invoke-interface {p1}, La/s0a;->d()La/ry9;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p2, v0, p3}, La/yo;-><init>(La/ry9;La/b0l0;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/enu0;->b:La/yo;

    .line 18
    .line 19
    new-instance p2, La/hnu0;

    .line 20
    .line 21
    invoke-interface {p1}, La/s0a;->h()La/n0a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, La/hnu0;-><init>(La/n0a;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, La/enu0;->c:La/hnu0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final b()La/da60;
    .locals 0

    .line 1
    iget-object p0, p0, La/enu0;->a:La/s0a;

    .line 2
    .line 3
    invoke-interface {p0}, La/s0a;->b()La/da60;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c(La/fot0;)V
    .locals 0

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/enu0;->d:La/fnu0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/fnu0;->c(La/fot0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d()La/ry9;
    .locals 0

    .line 1
    iget-object p0, p0, La/enu0;->b:La/yo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()La/n0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/enu0;->c:La/hnu0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(La/fot0;)V
    .locals 0

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/enu0;->d:La/fnu0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/fnu0;->i(La/fot0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j(La/fot0;)V
    .locals 0

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/enu0;->d:La/fnu0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/fnu0;->j(La/fot0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l(La/fot0;)V
    .locals 0

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/enu0;->d:La/fnu0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/fnu0;->l(La/fot0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final o(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final release()La/ig00;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
