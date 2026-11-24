.class public final La/fbn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s3e;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:La/z3e;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fbn;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance v0, La/z3e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, La/d3e;-><init>(La/bh9;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/fbn;->b:La/z3e;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b(La/f7m0;Ljava/util/List;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fbn;->b:La/z3e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/d3e;->a(La/f7m0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/fbn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/fbn;

    .line 6
    .line 7
    iget-object p1, p1, La/fbn;->b:La/z3e;

    .line 8
    .line 9
    iget-object p0, p0, La/fbn;->b:La/z3e;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/d3e;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/fbn;->b:La/z3e;

    .line 2
    .line 3
    iget-object p0, p0, La/d3e;->a:La/bh9;

    .line 4
    .line 5
    invoke-virtual {p0}, La/wg9;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
