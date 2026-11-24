.class public final La/ibu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ien;


# direct methods
.method public synthetic constructor <init>(La/ien;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ibu;->a:La/ien;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/tdn;La/wdn;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/ibu;->a:La/ien;

    .line 2
    .line 3
    iget-object p0, p0, La/ien;->a:La/gen;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/gen;->b:La/qoj0;

    .line 9
    .line 10
    invoke-static {p0}, La/ebc;->k0(La/mz40;)La/hen;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-ne p2, v2, :cond_0

    .line 23
    .line 24
    iget-object p2, v0, La/hen;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, v1, p1, v2}, La/hen;->a(La/hen;Ljava/util/List;Ljava/util/List;I)La/hen;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object p2, v0, La/hen;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 p2, 0x2

    .line 46
    invoke-static {v0, p1, v1, p2}, La/hen;->a(La/hen;Ljava/util/List;Ljava/util/List;I)La/hen;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method
