.class public final synthetic La/od50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zsv;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La/zsv;Lkotlin/jvm/functions/Function0;Ljava/util/ArrayList;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/od50;->a:B

    iput-object p1, p0, La/od50;->b:La/zsv;

    iput-object p2, p0, La/od50;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/od50;->d:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/od50;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/od50;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, La/od50;->c:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iget-object p0, p0, La/od50;->b:La/zsv;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/zc50;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, La/zc50;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 18
    .line 19
    iget-object p0, p0, La/zsv;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/yc50;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p1, La/yc50;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 39
    .line 40
    iget-object p1, p1, La/yc50;->a:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const v3, 0x7f040b72

    .line 50
    .line 51
    .line 52
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitleColor(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, La/zsv;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/zsv;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-lez p1, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
