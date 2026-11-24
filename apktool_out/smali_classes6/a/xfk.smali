.class public final synthetic La/xfk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xfk;->a:B

    iput-object p1, p0, La/xfk;->b:Ljava/lang/String;

    iput-object p2, p0, La/xfk;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/xfk;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xfk;->c:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object p0, p0, La/xfk;->b:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/abi0;

    .line 11
    .line 12
    sget-object v0, La/yai0;->a:[La/iiy;

    .line 13
    .line 14
    sget-object v0, La/xai0;->u:La/zai0;

    .line 15
    .line 16
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 17
    .line 18
    const/16 v3, 0xb

    .line 19
    .line 20
    aget-object v2, v2, v3

    .line 21
    .line 22
    const/high16 v2, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/a2z;

    .line 38
    .line 39
    const/16 v0, 0xd

    .line 40
    .line 41
    invoke-direct {p0, v1, v0}, La/a2z;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 42
    .line 43
    .line 44
    sget-object v0, La/mai0;->b:La/zai0;

    .line 45
    .line 46
    new-instance v1, La/m6;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, v2, p0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    check-cast p1, La/lc50;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, La/lc50;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
