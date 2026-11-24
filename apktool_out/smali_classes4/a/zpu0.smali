.class public final synthetic La/zpu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dqu0;


# direct methods
.method public synthetic constructor <init>(La/dqu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zpu0;->a:B

    iput-object p1, p0, La/zpu0;->b:La/dqu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zpu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zpu0;->b:La/dqu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/dqu0;->v:La/vqc;

    .line 14
    .line 15
    new-instance v1, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/upu0;

    .line 22
    .line 23
    iget-object p0, p0, La/upu0;->a:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 24
    .line 25
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;-><init>(Ljava/util/ArrayList;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryDisciplinesScreen$1;

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryDisciplinesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/dqu0;->r:La/duj;

    .line 50
    .line 51
    new-instance v0, La/b4u0;

    .line 52
    .line 53
    const/16 v1, 0x12

    .line 54
    .line 55
    invoke-direct {v0, v1}, La/b4u0;-><init>(B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
