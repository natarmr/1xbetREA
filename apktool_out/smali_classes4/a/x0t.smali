.class public final synthetic La/x0t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x0t;->a:B

    iput-object p1, p0, La/x0t;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x0t;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x0t;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->j(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;)Lkotlin/Unit;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    invoke-static {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;)Lkotlin/Unit;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
