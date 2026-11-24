.class public final synthetic La/c5t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9b0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/cp;


# direct methods
.method public synthetic constructor <init>(BLa/cp;La/g9b0;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/c5t;->a:B

    iput-object p3, p0, La/c5t;->b:La/g9b0;

    iput-object p4, p0, La/c5t;->c:Ljava/lang/String;

    iput-object p2, p0, La/c5t;->d:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/c5t;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/c5t;->d:La/cp;

    .line 4
    .line 5
    iget-object v2, p0, La/c5t;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, La/c5t;->b:La/g9b0;

    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/tv60;

    .line 22
    .line 23
    iget-object p1, p1, La/tv60;->b:La/rv60;

    .line 24
    .line 25
    iget-object p1, p1, La/rv60;->b:La/mo60;

    .line 26
    .line 27
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/tv60;

    .line 32
    .line 33
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 34
    .line 35
    check-cast v0, La/s7b0;

    .line 36
    .line 37
    iget-object v0, v0, La/s7b0;->b:Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;

    .line 38
    .line 39
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->getLoadedPictureUrl()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "160291"

    .line 44
    .line 45
    invoke-virtual {p0, v2, p1, v1, v0}, La/g9b0;->D(Ljava/lang/String;La/mo60;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/pv60;

    .line 56
    .line 57
    iget-object p1, p1, La/pv60;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0, v2, p1}, La/g9b0;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, La/pv60;

    .line 70
    .line 71
    iget-object p1, p1, La/pv60;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p0, v2, p1}, La/g9b0;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_2
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/qv60;

    .line 84
    .line 85
    iget-object p1, p1, La/qv60;->b:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p0, v2, p1}, La/g9b0;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
