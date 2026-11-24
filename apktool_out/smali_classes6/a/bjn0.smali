.class public final synthetic La/bjn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gjn0;


# direct methods
.method public synthetic constructor <init>(La/gjn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bjn0;->a:B

    iput-object p1, p0, La/bjn0;->b:La/gjn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bjn0;->a:B

    .line 2
    .line 3
    const v1, 0x7f040b55

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/bjn0;->b:La/gjn0;

    .line 7
    .line 8
    check-cast p1, La/cp;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, La/cjn0;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, p0, p1, v3}, La/cjn0;-><init>(La/gjn0;La/cp;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 28
    .line 29
    .line 30
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 31
    .line 32
    check-cast p0, La/jyx;

    .line 33
    .line 34
    iget-object v0, p0, La/jyx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 35
    .line 36
    iget-object v2, p1, La/cp;->w:Landroid/content/Context;

    .line 37
    .line 38
    const v3, 0x7f040b5f

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterColor(I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/jyx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 49
    .line 50
    invoke-static {v1, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterBackgroundColor(Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/pgj0;

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    invoke-direct {p0, p1, p1, v0}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v2, La/cjn0;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v2, p0, p1, v3}, La/cjn0;-><init>(La/gjn0;La/cp;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 88
    .line 89
    .line 90
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 91
    .line 92
    check-cast p0, La/kyx;

    .line 93
    .line 94
    iget-object p0, p0, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 95
    .line 96
    iget-object v0, p1, La/cp;->w:Landroid/content/Context;

    .line 97
    .line 98
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 103
    .line 104
    iget-object p0, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 105
    .line 106
    if-eqz p0, :cond_0

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->h(Ljava/lang/Integer;)V

    .line 113
    .line 114
    .line 115
    :cond_0
    new-instance p0, La/pgj0;

    .line 116
    .line 117
    const/4 v0, 0x4

    .line 118
    invoke-direct {p0, p1, p1, v0}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
