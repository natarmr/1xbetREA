.class public final La/hlz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmf0;
.implements La/qvj;


# instance fields
.field public final a:La/glz;

.field public final b:La/bby;


# direct methods
.method public constructor <init>(La/glz;La/bby;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hlz;->a:La/glz;

    .line 5
    .line 6
    iput-object p2, p0, La/hlz;->b:La/bby;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hlz;->a:La/glz;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La/glz;->f(La/blz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hlz;->a:La/glz;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La/glz;->a(La/blz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(La/fbe0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hlz;->a:La/glz;

    .line 2
    .line 3
    invoke-static {p0, p1}, La/x1x;->v(La/glz;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onDestroy(La/clz;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hlz;->b:La/bby;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-interface {p0, p1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
