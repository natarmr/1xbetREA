.class public abstract La/eiu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/diu0;

.field public b:La/vzg0;


# virtual methods
.method public final s()La/diu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eiu0;->a:La/diu0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "viewModel"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public t()V
    .locals 0

    .line 1
    return-void
.end method

.method public u(La/diu0;La/vzg0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eiu0;->a:La/diu0;

    .line 5
    .line 6
    iput-object p2, p0, La/eiu0;->b:La/vzg0;

    .line 7
    .line 8
    return-void
.end method
