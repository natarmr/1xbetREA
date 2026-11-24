.class public final La/mjk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/i2h0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/mjk;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/o470;Ljava/util/List;)La/y1h0;
    .locals 8

    .line 1
    iget-byte p0, p0, La/mjk;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, La/h3k0;

    .line 8
    .line 9
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, La/ob50;

    .line 14
    .line 15
    iget-object p1, p1, La/ob50;->b:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/ob50;

    .line 22
    .line 23
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, v1, p2}, La/h3k0;-><init>(Ljava/lang/Object;La/ob50;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    move-object v3, p0

    .line 36
    check-cast v3, La/ob50;

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    iget-object v1, v3, La/ob50;->c:Ljava/util/Map;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget-object v2, La/ujn;->j:La/ujn;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    :cond_0
    check-cast v1, La/fjk;

    .line 59
    .line 60
    move-object v6, v1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v6, p0

    .line 63
    :goto_0
    if-eqz v6, :cond_2

    .line 64
    .line 65
    new-instance v1, La/ljk;

    .line 66
    .line 67
    iget-object v2, v3, La/ob50;->b:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object p0, p1, La/o470;->a:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v7, p0

    .line 80
    check-cast v7, La/rip;

    .line 81
    .line 82
    invoke-direct/range {v1 .. v7}, La/ljk;-><init>(Ljava/lang/Object;La/ob50;Ljava/util/List;Ljava/util/List;La/fjk;La/rip;)V

    .line 83
    .line 84
    .line 85
    move-object p0, v1

    .line 86
    :cond_2
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
