.class public final La/r13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t1e;


# instance fields
.field public final a:La/ehf0;

.field public final b:Ljava/lang/String;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/ehf0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r13;->a:La/ehf0;

    .line 5
    .line 6
    iput-object p2, p0, La/r13;->b:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, La/a13;

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/r13;->c:La/n0o0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/r13;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s13;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    throw p0
.end method

.method public final m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/r13;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s13;

    .line 8
    .line 9
    invoke-interface {p2, p0, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
