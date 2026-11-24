.class public final La/pkn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t1e;


# instance fields
.field public final a:La/roi0;


# direct methods
.method public constructor <init>(La/roi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pkn0;->a:La/roi0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/pkn0;->a:La/roi0;

    .line 2
    .line 3
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/rkn0;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/pkn0;->a:La/roi0;

    .line 2
    .line 3
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/rkn0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p1, La/tkn0;

    .line 11
    .line 12
    new-instance v0, La/okn0;

    .line 13
    .line 14
    invoke-interface {p0}, La/rkn0;->G0()La/w7r;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, La/okn0;-><init>(La/w7r;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0}, La/tkn0;-><init>(La/okn0;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2, p1, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
