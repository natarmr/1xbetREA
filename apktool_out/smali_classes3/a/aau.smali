.class public final La/aau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ugf0;


# direct methods
.method public synthetic constructor <init>(La/ugf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/aau;->a:La/ugf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/sys0;La/s77;Ljava/util/List;La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/aau;->a:La/ugf0;

    .line 2
    .line 3
    iget-object p0, p0, La/ugf0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/tnm0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/tnm0;->c(La/sys0;)Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, La/iun;->a:La/iun;

    .line 20
    .line 21
    :cond_0
    invoke-static {p3, v0}, La/sj3;->n0(Ljava/util/List;Ljava/util/List;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/tnm0;->c(La/sys0;)Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/tnm0;->a:La/qoj0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1, p4}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    if-ne p0, p2, :cond_1

    .line 45
    .line 46
    move-object p2, p1

    .line 47
    move-object p1, p0

    .line 48
    move-object p0, p2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    move-object p0, p1

    .line 51
    move-object p2, p0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    sget-object p3, La/wne;->a:La/wne;

    .line 57
    .line 58
    if-ne p1, p3, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-object p1, p0

    .line 62
    :goto_2
    if-ne p1, p3, :cond_4

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_4
    return-object p2
.end method
