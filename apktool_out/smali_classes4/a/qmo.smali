.class public final La/qmo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hoo;


# direct methods
.method public constructor <init>(La/hoo;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/qmo;->a:La/hoo;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/qmo;->a:La/hoo;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(JJJZ)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, La/qmo;->a:La/hoo;

    .line 2
    .line 3
    iget-object p0, p0, La/hoo;->a:La/vno;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ono;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2, p5, p6}, La/ono;-><init>(JJ)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/vno;->a(La/ono;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    new-instance p2, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-direct {p2, p3, p4}, Ljava/lang/Long;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/vno;->a(La/ono;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    sget-object p1, La/wne;->a:La/wne;

    .line 54
    .line 55
    return-object p0
.end method
