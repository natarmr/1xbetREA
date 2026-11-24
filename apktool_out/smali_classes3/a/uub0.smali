.class public final La/uub0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;


# direct methods
.method public constructor <init>(La/q7d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uub0;->a:La/q7d0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const-string v0, "PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY"

    .line 2
    .line 3
    iget-object p0, p0, La/uub0;->a:La/q7d0;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "PreviewServiceStatusLocalDataSource.ACTIONS_KEY"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "PreviewServiceStatusLocalDataSource.PREVIEW_KEY"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b(La/sub0;)V
    .locals 1

    .line 1
    const-string v0, "PreviewServiceStatusLocalDataSource.PREVIEW_KEY"

    .line 2
    .line 3
    iget-byte p1, p1, La/sub0;->a:B

    .line 4
    .line 5
    iget-object p0, p0, La/uub0;->a:La/q7d0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, La/q7d0;->e(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
