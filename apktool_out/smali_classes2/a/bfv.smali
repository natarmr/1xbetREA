.class public final La/bfv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jff0;


# instance fields
.field public final a:La/afv;

.field public final b:La/dfv;


# direct methods
.method public constructor <init>(La/afv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bfv;->a:La/afv;

    .line 5
    .line 6
    invoke-interface {p1}, La/afv;->b()La/dfv;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, La/bfv;->b:La/dfv;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, La/bfv;->a:La/afv;

    .line 2
    .line 3
    iget-object p0, p0, La/bfv;->b:La/dfv;

    .line 4
    .line 5
    invoke-interface {v0, p0}, La/afv;->c(La/dfv;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, La/bfv;->a:La/afv;

    .line 2
    .line 3
    iget-object p0, p0, La/bfv;->b:La/dfv;

    .line 4
    .line 5
    invoke-interface {v0, p0}, La/afv;->c(La/dfv;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
