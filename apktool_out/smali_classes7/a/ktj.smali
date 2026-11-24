.class public final La/ktj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/to9;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:La/to9;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;La/to9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ktj;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, La/ktj;->b:La/to9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, La/ktj;->b:La/to9;

    .line 2
    .line 3
    invoke-interface {p0}, La/to9;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final clone()La/to9;
    .locals 2

    .line 1
    new-instance v0, La/ktj;

    .line 2
    .line 3
    iget-object v1, p0, La/ktj;->b:La/to9;

    .line 4
    .line 5
    invoke-interface {v1}, La/to9;->clone()La/to9;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, La/ktj;->a:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/ktj;-><init>(Ljava/util/concurrent/Executor;La/to9;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0}, La/ktj;->clone()La/to9;

    move-result-object p0

    return-object p0
.end method

.method public final l()Lokhttp3/Request;
    .locals 0

    .line 1
    iget-object p0, p0, La/ktj;->b:La/to9;

    .line 2
    .line 3
    invoke-interface {p0}, La/to9;->l()Lokhttp3/Request;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ktj;->b:La/to9;

    .line 2
    .line 3
    invoke-interface {p0}, La/to9;->q()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final y(La/pp9;)V
    .locals 1

    .line 1
    new-instance v0, La/zri;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, La/zri;-><init>(La/ktj;La/pp9;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ktj;->b:La/to9;

    .line 7
    .line 8
    invoke-interface {p0, v0}, La/to9;->y(La/pp9;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
