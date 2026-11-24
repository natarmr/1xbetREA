.class public final La/ipq;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/lpq;


# instance fields
.field public o:Lkotlin/jvm/functions/Function1;

.field public p:La/iqq;


# virtual methods
.method public final L(La/iqq;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/ipq;->p:La/iqq;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, La/ipq;->p:La/iqq;

    .line 10
    .line 11
    iget-object p0, p0, La/ipq;->o:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
