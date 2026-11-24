.class public final synthetic La/x820;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b920;


# direct methods
.method public synthetic constructor <init>(La/b920;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x820;->a:B

    iput-object p1, p0, La/x820;->b:La/b920;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/x820;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x820;->b:La/b920;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 9
    .line 10
    sget-object v0, La/b920;->U1:La/htz;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/b920;->J0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/jdc0;

    .line 20
    .line 21
    iget-object v4, p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v1, p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->b:D

    .line 24
    .line 25
    iget-object v5, p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->d:Ljava/lang/String;

    .line 28
    .line 29
    iget v3, p1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->e:I

    .line 30
    .line 31
    invoke-direct/range {v0 .. v6}, La/jdc0;-><init>(DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/k420;

    .line 35
    .line 36
    invoke-direct {p1, v0}, La/k420;-><init>(La/jdc0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sget-object v0, La/b920;->U1:La/htz;

    .line 52
    .line 53
    if-lez p1, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 56
    .line 57
    instance-of v0, p0, La/axe;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    check-cast p0, La/axe;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 p0, 0x0

    .line 65
    :goto_0
    if-eqz p0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, p1}, La/axe;->Q0(I)V

    .line 68
    .line 69
    .line 70
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
